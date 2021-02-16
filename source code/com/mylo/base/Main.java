/*     */ package com.mylo.base;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventManager;
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.command.Command;
/*     */ import com.mylo.base.command.CommandManager;
/*     */ import com.mylo.base.events.EventChat;
/*     */ import com.mylo.base.events.EventKeyPress;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventRenderGui;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.module.Modulemanager;
/*     */ import com.mylo.base.ui.Tabgui.TabGui;
/*     */ import com.mylo.base.ui.tabbedClickGui.TabbedClickGui;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Lookutil;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.notifications.NotificationManager;
/*     */ import com.mylo.base.utils.saveutil;
/*     */ import de.Hero.settings.SettingsManager;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URL;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C19PacketResourcePackStatus;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import org.lwjgl.opengl.Display;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Main
/*     */ {
/*     */   public static String ClientName;
/*     */   public static float fakePitch;
/*     */   public static float fakeYaw;
/*     */   private static boolean fakeaim;
/*     */   public static float lastfakepitch;
/*     */   public static float lastfakeyaw;
/*     */   public static float fakerenderyawoffset;
/*     */   public static float lastfakerenderyawoffset;
/*     */   public static float bodyYaw;
/*     */   public static float lastBodyYaw;
/*     */   public static int rotationTickCounter;
/*     */   public static boolean preready = false;
/*     */   public static TabGui tabgui;
/*  84 */   public static String Prefix = "."; public static boolean doneautoarmor; public static Modulemanager modmgr;
/*     */   public static CommandManager cmdmgr;
/*  86 */   public static SettingsManager setmgr = new SettingsManager(); public static TabbedClickGui Clickgui;
/*  87 */   public static double latestBuild = 0.0D; public static NotificationManager NotMan; public static final double build = 2.5D;
/*     */   public static boolean beta = false;
/*     */   public static boolean updateAvailable = false;
/*     */   public static boolean networkError = false;
/*  91 */   public static Entity killauratarget = null; public static final String updateCheckLink = "https://github.com/gitmylo/MyloClient/raw/master/CurrentVersion.txt"; public static final String updateGetLink = "https://github.com/gitmylo/MyloClient/blob/master/LatestLink.txt";
/*  92 */   public static String discordtarget = "";
/*  93 */   public static final String discordwebhook = getWebhookUrl();
/*     */   public static final String hwidlist = "https://raw.githubusercontent.com/gitmylo/MyloClient/master/Whitelist.txt";
/*     */   public static boolean richpresensesetup = false;
/*     */   
/*     */   public static String getWebhookUrl() {
/*  98 */     System.out.println("Man this client had a lot of backdoores b4 i removed them...");
/*  99 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Main() {
/* 105 */     randomClientName();
/* 106 */     Fonts.setup();
/* 107 */     EventManager.register(this);
/* 108 */     cmdmgr = new CommandManager();
/* 109 */     setmgr = new SettingsManager();
/* 110 */     modmgr = new Modulemanager();
/* 111 */     for (Module m : modmgr.getModules()) {
/* 112 */       m.setup();
/*     */     }
/* 114 */     if (!richpresensesetup) {
/* 115 */       setupRichPresense();
/*     */     }
/* 117 */     Clickgui = new TabbedClickGui();
/* 118 */     tabgui = new TabGui();
/* 119 */     NotMan = new NotificationManager();
/* 120 */     saveutil.load("config");
/* 121 */     Display.setTitle("MyloClient cracked by Z3R0");
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setupRichPresense() {}
/*     */ 
/*     */   
/*     */   public static void checkForUpdates() {}
/*     */   
/*     */   public static void checkWhiteList() {
/* 131 */     boolean goon = false;
/*     */     try {
/* 133 */       boolean whitelisted = false;
/* 134 */       String hwid = getHWID();
/* 135 */       System.out.println("HWID: " + hwid);
/* 136 */       ArrayList<String> hwids = downloadStrings("https://raw.githubusercontent.com/gitmylo/MyloClient/master/Whitelist.txt");
/* 137 */       for (String s : hwids) {
/* 138 */         if (hwid == null || s == null || !hwid.equals(s))
/* 139 */           continue;  whitelisted = true;
/*     */       } 
/* 141 */       if (!whitelisted && !goon) {
/* 142 */         sendInfo(true, hwid);
/* 143 */         shutdown();
/*     */       } else {
/* 145 */         sendInfo(true, hwid);
/*     */       }
/*     */     
/* 148 */     } catch (Exception e) {
/* 149 */       goon = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void sendInfo(boolean isWhitelisted, String hwid) {
/* 154 */     String ip = downloadString("http://bot.whatismyipaddress.com/");
/* 155 */     System.out.println("Just so you know the client tried to leak ur ip rn because the client is backdoored ez to detect, but i removed the backdoor <3");
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getHWID() throws NoSuchAlgorithmException, UnsupportedEncodingException {
/* 160 */     String s = "";
/* 161 */     String main = String.valueOf(System.getenv("PROCESSOR_IDENTIFIER")) + System.getenv("COMPUTERNAME") + System.getProperty("user.name").trim();
/* 162 */     byte[] bytes = main.getBytes("UTF-8");
/* 163 */     MessageDigest messageDigest = MessageDigest.getInstance("MD5");
/* 164 */     byte[] md5 = messageDigest.digest(bytes);
/* 165 */     int i = 0;
/* 166 */     byte[] arrby = md5;
/* 167 */     int n = md5.length;
/* 168 */     for (int j = 0; j < n; j++) {
/* 169 */       byte b = arrby[j];
/* 170 */       s = String.valueOf(s) + Integer.toHexString(b & 0xFF | 0x300).substring(0, 3);
/* 171 */       if (i != md5.length - 1) {
/* 172 */         s = String.valueOf(s) + "-";
/*     */       }
/* 174 */       i++;
/*     */     } 
/* 176 */     return s;
/*     */   }
/*     */   
/*     */   public static String getSerialKey(Character letter) throws Exception {
/* 180 */     String line = null;
/* 181 */     String serial = null;
/* 182 */     Process process = Runtime.getRuntime().exec("cmd /c vol " + letter + ":");
/* 183 */     BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
/* 184 */     while ((line = in.readLine()) != null) {
/* 185 */       if (!line.toLowerCase().contains("serial number"))
/* 186 */         continue;  String[] strings = line.split(" ");
/* 187 */       serial = strings[strings.length - 1];
/*     */     } 
/* 189 */     in.close();
/* 190 */     return serial;
/*     */   }
/*     */   
/*     */   public static void update() {
/* 194 */     System.out.println("The client tried to update itself, but I fixed that for you <3");
/*     */   }
/*     */   
/*     */   public static void shutdown() {
/* 198 */     System.out.println("Just about now you would have had your ip leaked if not for me lol -Z3R0");
/*     */   }
/*     */ 
/*     */   
/*     */   public static String downloadString(String link) {
/*     */     try {
/* 204 */       URL url = new URL(link);
/* 205 */       BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
/* 206 */       String output = reader.readLine();
/* 207 */       reader.close();
/* 208 */       return output;
/*     */     }
/* 210 */     catch (Exception e) {
/* 211 */       e.printStackTrace();
/* 212 */       networkError = true;
/* 213 */       return "error";
/*     */     } 
/*     */   }
/*     */   
/*     */   public static ArrayList<String> downloadStrings(String link) {
/*     */     try {
/* 219 */       URL url = new URL(link);
/* 220 */       BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
/* 221 */       ArrayList<String> output = new ArrayList<>();
/* 222 */       reader.lines().forEach(string -> output.add(string.replace("\n", "")));
/* 223 */       reader.close();
/* 224 */       return output;
/*     */     }
/* 226 */     catch (Exception e) {
/* 227 */       e.printStackTrace();
/* 228 */       return Lists.newArrayList((Object[])new String[] { "error" });
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void randomClientName() {
/* 233 */     Random r = new Random();
/* 234 */     ArrayList<String> clientnames = new ArrayList<>();
/* 235 */     clientnames.add("MyloClient Cracked by Z3R0");
/* 236 */     ClientName = clientnames.get(r.nextInt(clientnames.size()));
/*     */   }
/*     */   
/*     */   public static void refresh() {
/* 240 */     cmdmgr = new CommandManager();
/* 241 */     setmgr = new SettingsManager();
/* 242 */     modmgr = new Modulemanager();
/* 243 */     Fonts.setup();
/* 244 */     for (Module m : modmgr.getModules()) {
/* 245 */       m.setup();
/*     */     }
/* 247 */     Clickgui = new TabbedClickGui();
/* 248 */     tabgui = new TabGui();
/* 249 */     NotMan = new NotificationManager();
/* 250 */     saveutil.load("config");
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void RenderGui(EventRenderGui e) {
/* 255 */     NotMan.drawNotifications();
/* 256 */     e.isDebuginfo();
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onKeyPressed(EventKeyPress e) {
/* 261 */     for (Module m : modmgr.getModules()) {
/* 262 */       if (m.keybind != e.key)
/* 263 */         continue;  m.toggle();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 270 */     if (e.getPacket() instanceof net.minecraft.network.play.client.C0APacketAnimation) {
/* 271 */       rotationTickCounter = 10;
/*     */     }
/* 273 */     if (e.getPacket() instanceof C19PacketResourcePackStatus) {
/* 274 */       C19PacketResourcePackStatus c19PacketResourcePackStatus = (C19PacketResourcePackStatus)e.getPacket();
/* 275 */       e.setPacket((Packet)new C19PacketResourcePackStatus(c19PacketResourcePackStatus.hash, C19PacketResourcePackStatus.Action.ACCEPTED));
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onChat(EventChat e) {
/* 281 */     if (e.getText().startsWith(Prefix)) {
/* 282 */       e.setCancelled(true);
/* 283 */       for (Command c : CommandManager.getCommands()) {
/* 284 */         if (!(String.valueOf(Prefix) + c.getTrigger()).equalsIgnoreCase(e.getText().split(" ")[0]))
/* 285 */           continue;  c.Execute(e.getText().split(" "));
/*     */         return;
/*     */       } 
/* 288 */       sendChatMessage("Unknown Command, did you make a typo? You typed: \"" + e.getText().split(" ")[0].toLowerCase() + "\"");
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdateCommand(EventUpdate e) {
/* 295 */     for (Command c : CommandManager.getCommands()) {
/* 296 */       if (!c.isRunning())
/* 297 */         continue;  c.Run(e);
/*     */     } 
/* 299 */     if (!isFakeAim() && e.isPre()) {
/* 300 */       preready = true;
/* 301 */     } else if (!isFakeAim() && preready && e.isPost()) {
/* 302 */       fakePitch = (Minecraft.getMinecraft()).thePlayer.rotationPitch;
/* 303 */       fakeYaw = (Minecraft.getMinecraft()).thePlayer.rotationYaw;
/* 304 */       lastfakepitch = (Minecraft.getMinecraft()).thePlayer.rotationPitch;
/* 305 */       lastfakeyaw = (Minecraft.getMinecraft()).thePlayer.rotationYaw;
/* 306 */       bodyYaw = (Minecraft.getMinecraft()).thePlayer.renderYawOffset;
/* 307 */       preready = false;
/*     */     } else {
/* 309 */       preready = false;
/*     */     } 
/* 311 */     if (e.isPre()) {
/* 312 */       lastBodyYaw = bodyYaw;
/* 313 */       lastfakepitch = fakePitch;
/* 314 */       lastfakeyaw = fakeYaw;
/* 315 */       bodyYaw = Lookutil.clampF(bodyYaw, fakeYaw, 50.0F);
/* 316 */       updateRenderAngles();
/* 317 */       lastfakerenderyawoffset = fakerenderyawoffset;
/* 318 */       fakerenderyawoffset = fakeYaw;
/* 319 */       NotMan.updateNotifications();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updateRenderAngles() {
/* 324 */     Minecraft mc = Minecraft.getMinecraft();
/* 325 */     double d0 = mc.thePlayer.posX - mc.thePlayer.prevPosX;
/* 326 */     double d1 = mc.thePlayer.posZ - mc.thePlayer.prevPosZ;
/* 327 */     if (d0 * d0 + d1 * d1 > 2.500000277905201E-7D) {
/* 328 */       bodyYaw = Lookutil.clampF((float)Moveutils.getPlayerMoveDir(), fakeYaw, 50.0F);
/* 329 */       rotationTickCounter = 0;
/* 330 */     } else if (rotationTickCounter > 0) {
/* 331 */       rotationTickCounter--;
/* 332 */       bodyYaw = computeAngleWithBound(fakeYaw, bodyYaw, 10.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   private float computeAngleWithBound(float p_75665_1_, float p_75665_2_, float p_75665_3_) {
/* 337 */     float f = MathHelper.wrapAngleTo180_float(p_75665_1_ - p_75665_2_);
/* 338 */     if (f < -p_75665_3_) {
/* 339 */       f = -p_75665_3_;
/*     */     }
/* 341 */     if (f >= p_75665_3_) {
/* 342 */       f = p_75665_3_;
/*     */     }
/* 344 */     return p_75665_1_ - f;
/*     */   }
/*     */   
/*     */   public static void sendChatMessage(String msg) {
/* 348 */     if ((Minecraft.getMinecraft()).thePlayer != null) {
/* 349 */       (Minecraft.getMinecraft()).thePlayer.addChatMessage((IChatComponent)new ChatComponentText(msg));
/*     */     }
/*     */   }
/*     */   
/*     */   public static void enableFakeaim(boolean enable) {
/* 354 */     fakeaim = enable;
/*     */   }
/*     */   
/*     */   public static void enableFakeAimKeepRot() {
/* 358 */     fakeaim = true;
/* 359 */     setFakeaim((Minecraft.getMinecraft()).thePlayer.rotationPitch, (Minecraft.getMinecraft()).thePlayer.rotationYawHead);
/*     */   }
/*     */   
/*     */   public static void setFakeaim(float pitch, float yaw) {
/* 363 */     fakePitch = pitch;
/* 364 */     fakeYaw = yaw;
/*     */   }
/*     */   
/*     */   public static void syncAim() {
/* 368 */     setFakeaim((Minecraft.getMinecraft()).thePlayer.rotationPitch, (Minecraft.getMinecraft()).thePlayer.rotationYawHead);
/*     */   }
/*     */   
/*     */   public static void setFakePitch(float fakepitch) {
/* 372 */     fakePitch = fakepitch;
/*     */   }
/*     */   
/*     */   public static void setFakeYaw(float fakeyaw) {
/* 376 */     fakeYaw = fakeyaw;
/*     */   }
/*     */   
/*     */   public static float getFakePitch() {
/* 380 */     return fakePitch;
/*     */   }
/*     */   
/*     */   public static float getFakeYaw() {
/* 384 */     return fakeYaw;
/*     */   }
/*     */   
/*     */   public static boolean isFakeAim() {
/* 388 */     return fakeaim;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */