/*     */ package com.mylo.base.clickgui;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.specialobjects.AnimatedRect;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Friendutils;
/*     */ import com.mylo.base.utils.MathUtil;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.entity.AbstractClientPlayer;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.GuiIngame;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.gui.inventory.GuiInventory;
/*     */ import net.minecraft.client.network.NetworkPlayerInfo;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EnumPlayerModelParts;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.World;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class Clickgui extends GuiScreen {
/*     */   AnimatedRect rect;
/*     */   AnimatedRect catlistrect;
/*     */   AnimatedRect topbar;
/*     */   AnimatedRect setpanel;
/*     */   
/*     */   public boolean doesGuiPauseGame() {
/*  39 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   boolean closing = false;
/*     */   
/*     */   boolean catlistclosing = false;
/*     */   
/*     */   boolean mousedown = false;
/*     */   
/*  50 */   NetworkPlayerInfo selectedplayer = null;
/*  51 */   Module selectedmodule = null;
/*  52 */   Module bindingmodule = null;
/*     */   
/*  54 */   ResourceLocation discordlogo = new ResourceLocation("nigger/images/gui/discordlogo.png");
/*     */   
/*  56 */   Category selectedcat = null;
/*     */   
/*  58 */   double scroll = 0.0D;
/*  59 */   int targetScroll = 0;
/*  60 */   double catscroll = 0.0D;
/*  61 */   int targetCatScroll = 0;
/*     */ 
/*     */   
/*     */   public void initGui() {
/*  65 */     super.initGui();
/*  66 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*     */     
/*  68 */     this.rect = new AnimatedRect(0, 0, sr.getScaledWidth(), sr.getScaledHeight());
/*  69 */     this.catlistrect = new AnimatedRect(0, 0, 0, sr.getScaledHeight() - 0);
/*  70 */     this.topbar = new AnimatedRect(0, 0, sr.getScaledWidth() - 0, 0);
/*  71 */     this.setpanel = new AnimatedRect(35, sr.getScaledHeight(), 155, sr.getScaledHeight());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/*  77 */     this.scroll = MathUtil.interPolate(this.scroll, this.targetScroll, 0.1D);
/*  78 */     this.catscroll = MathUtil.interPolate(this.catscroll, this.targetCatScroll, 0.1D);
/*     */     
/*  80 */     super.drawScreen(mouseX, mouseY, partialTicks);
/*  81 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*  82 */     Renderutils.drawOutlinedBox(this.rect.x, this.rect.y, this.rect.x2, this.rect.y2, 2, -12565429, -13223617);
/*  83 */     if (!this.closing) {
/*  84 */       this.rect = new AnimatedRect(0, 0, sr.getScaledWidth() - 0, sr.getScaledHeight() - 0);
/*     */     }
/*  86 */     else if (!this.catlistclosing) {
/*  87 */       this.rect = new AnimatedRect(sr.getScaledWidth() / 2, sr.getScaledHeight() / 2, sr.getScaledWidth() / 2, sr.getScaledHeight() / 2);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     if (!this.catlistclosing && !this.closing) {
/*  96 */       this.catlistrect = new AnimatedRect(0, 0, 35, sr.getScaledHeight() - 0);
/*  97 */       this.topbar = new AnimatedRect(0, 0, sr.getScaledWidth() - 0, 12);
/*     */     } 
/*  99 */     if (this.catlistclosing) {
/* 100 */       this.catlistrect = new AnimatedRect(0, 0, 0, sr.getScaledHeight() - 0);
/* 101 */       this.topbar = new AnimatedRect(0, 0, sr.getScaledWidth() - 0, 0);
/* 102 */       if (this.catlistrect.hasTargetSize()) {
/* 103 */         this.catlistclosing = false;
/*     */       }
/*     */     } 
/* 106 */     drawRect(this.catlistrect.x, this.catlistrect.y, this.catlistrect.x2, this.catlistrect.y2, -14671323);
/*     */ 
/*     */     
/* 109 */     if (this.selectedcat != null && !this.closing) {
/* 110 */       drawRect(35, 12, 155, sr.getScaledHeight() - 30, -13684426);
/* 111 */       drawRect(35, 40, 155, 41, -14473945);
/* 112 */       drawCategory(mouseX, mouseY);
/* 113 */       drawRect(35, 12, 155, 40, -13684426);
/* 114 */       Fonts.DiscordFontRenderer.drawString(this.selectedcat.name(), 45.0F, 24.0F, 16777215);
/*     */     }
/* 116 */     else if (!this.closing) {
/* 117 */       drawRect(35, 12, 155, sr.getScaledHeight() - 30, -13684426);
/* 118 */       drawRect(35, 40, 155, 41, -14473945);
/* 119 */       drawhome(mouseX, mouseY);
/* 120 */       drawRect(35, 12, 155, 40, -13684426);
/* 121 */       Fonts.DiscordFontRenderer.drawString("Players", 45.0F, 24.0F, 16777215);
/*     */     } 
/*     */ 
/*     */     
/* 125 */     if (!this.closing) {
/*     */ 
/*     */ 
/*     */       
/* 129 */       double offset = this.catscroll;
/* 130 */       boolean hovered = (Renderutils.getDistance2d(mouseX, mouseY, 17.0D, (int)(offset * 35.0D + 27.0D)) < 15.0D);
/*     */       
/* 132 */       Renderutils.drawFullCircle(17, (int)(offset * 35.0D + 27.0D + ((this.mousedown && hovered) ? true : false)), 15.0D, (this.selectedcat == null || hovered) ? -9270822 : -13223617);
/* 133 */       this.mc.getTextureManager().bindTexture(this.discordlogo);
/* 134 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 135 */       GuiIngame.drawScaledCustomSizeModalRect(7, (int)(offset * 35.0D + 17.0D + ((this.mousedown && hovered) ? true : false)), 0.0F, 0.0F, 20, 20, 20, 20, 20.0F, 20.0F);
/* 136 */       if (hovered) {
/* 137 */         Gui.drawRect(42, (int)(offset * 35.0D + 17.0D), 42 + Fonts.DiscordTextRenderer.getStringWidth("Players") + 6, (int)(offset * 35.0D + 37.0D), -16777216);
/* 138 */         Fonts.DiscordTextRenderer.drawStringWithShadow("Players", 45.0D, (int)(offset * 35.0D + 27.0D - (Fonts.DiscordTextRenderer.getHeight() / 2)), 16777215);
/* 139 */         Gui.drawRect(0, (int)(offset * 35.0D + 20.0D), 1, (int)(offset * 35.0D + 34.0D), -1);
/*     */       } 
/* 141 */       if (this.selectedcat == null) {
/* 142 */         Gui.drawRect(0, (int)(offset * 35.0D + 17.0D), 1, (int)(offset * 35.0D + 37.0D), -1);
/*     */       }
/*     */       
/* 145 */       Fonts.DiscordTextRenderer.drawStringWithShadow("", 0.0D, 0.0D, 16777215);
/* 146 */       double i = this.catscroll;
/* 147 */       GlStateManager.pushMatrix(); byte b; int j; Category[] arrayOfCategory;
/* 148 */       for (j = (arrayOfCategory = Category.values()).length, b = 0; b < j; ) { Category c = arrayOfCategory[b];
/*     */         
/* 150 */         hovered = (Renderutils.getDistance2d(mouseX, mouseY, 17.0D, 65.0D + i * 35.0D) < 15.0D);
/* 151 */         if (hovered) {
/* 152 */           Gui.drawRect(42, (int)(65.0D + i * 35.0D - 10.0D), 42 + Fonts.DiscordTextRenderer.getStringWidth(c.name()) + 6, (int)(65.0D + i * 35.0D + 10.0D), -16777216);
/* 153 */           Fonts.DiscordTextRenderer.drawStringWithShadow(c.name(), 45.0D, 65.0D + i * 35.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 16777215);
/* 154 */           Gui.drawRect(0, (int)(65.0D + i * 35.0D - 7.0D), 1, (int)(65.0D + i * 35.0D + 7.0D), -1);
/*     */         } 
/* 156 */         if (this.selectedcat == c) {
/* 157 */           Gui.drawRect(0, (int)(65.0D + i * 35.0D - 10.0D), 1, (int)(65.0D + i * 35.0D + 10.0D), -1);
/*     */         }
/* 159 */         Renderutils.drawFullCircle(17, (int)(65.0D + i * 35.0D + ((this.mousedown && hovered) ? true : false)), 15.0D, (hovered || (this.selectedcat != null && this.selectedcat == c)) ? -9270822 : -13223617);
/* 160 */         Fonts.DiscordTextRenderer.drawStringWithShadow((new StringBuilder(String.valueOf(c.name().charAt(0)))).toString(), (17 - Fonts.DiscordTextRenderer.getStringWidth((new StringBuilder(String.valueOf(c.name().charAt(0)))).toString()) / 2), 65.0D + i * 35.0D - (Fonts.DiscordTextRenderer.getHeight() / 2) + 1.0D + ((this.mousedown && hovered) ? true : false), 16777215);
/*     */ 
/*     */         
/* 163 */         i++; b++; }
/*     */       
/* 165 */       GlStateManager.popMatrix();
/*     */       
/* 167 */       this.setpanel = new AnimatedRect(35, sr.getScaledHeight(), 155, sr.getScaledHeight() - 30);
/*     */     } else {
/*     */       
/* 170 */       this.setpanel = new AnimatedRect(35, sr.getScaledHeight(), 155, sr.getScaledHeight());
/*     */     } 
/*     */     
/* 173 */     drawRect(this.topbar.x, this.topbar.y, this.topbar.x2, this.topbar.y2, -14671323);
/*     */ 
/*     */     
/* 176 */     Fonts.DiscordFontRenderer.drawStringWithShadow("DISCORD", 2.0D, 4.0D, 7501437);
/* 177 */     int buttoncolor = -4604994;
/* 178 */     int right = sr.getScaledWidth() - 0;
/* 179 */     Gui.drawRect(right - 38, 6, right - 33, 7, buttoncolor);
/* 180 */     Renderutils.drawOutlinedBox(right - 20 - 4, 3, right - 14 - 4, 9, 1, 0, buttoncolor);
/* 181 */     GlStateManager.pushMatrix();
/*     */     
/* 183 */     GlStateManager.translate((right - 5), 3.0F, 0.0F);
/* 184 */     GlStateManager.rotate(45.0F, 0.0F, 0.0F, 1.0F);
/* 185 */     Gui.drawRect(0, 0, 1, 8, buttoncolor);
/* 186 */     Gui.drawRect(-4, 4, 4, 3, buttoncolor);
/* 187 */     GlStateManager.popMatrix();
/*     */ 
/*     */     
/* 190 */     drawRect(this.setpanel.x, this.setpanel.y, this.setpanel.x2, this.setpanel.y2, -14079185);
/*     */     
/* 192 */     if (!this.closing) {
/* 193 */       Renderutils.drawFullCircle(50, sr.getScaledHeight() - 15, 11.0D, -9270822);
/* 194 */       this.mc.getTextureManager().bindTexture(this.discordlogo);
/* 195 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 196 */       GuiIngame.drawScaledCustomSizeModalRect(40, sr.getScaledHeight() - 25, 0.0F, 0.0F, 20, 20, 20, 20, 20.0F, 20.0F);
/* 197 */       Renderutils.drawFullCircle(57, sr.getScaledHeight() - 8, 5.0D, -14079185);
/* 198 */       Renderutils.drawFullCircle(57, sr.getScaledHeight() - 8, 3.0D, -12339839);
/* 199 */       Fonts.DiscordFontRenderer.drawStringWithShadow(this.mc.thePlayer.getName(), 67.0D, (sr.getScaledHeight() - 18), 16777215);
/* 200 */       Fonts.DiscordFontRenderer.drawString("#1337", 67.0F, (sr.getScaledHeight() - 10), 12172222);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void drawhome(int mousex, int mousey) {
/* 206 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 207 */     Fonts.DiscordFontRenderer.drawString("Players", 45.0F, 24.0F, 16777215);
/* 208 */     int top = 12;
/* 209 */     int left = 35;
/* 210 */     int aftermain = top + 29;
/* 211 */     int channelborder = 155;
/* 212 */     double i = this.scroll;
/* 213 */     int center = channelborder + (sr.getScaledWidth() - channelborder) / 2;
/*     */     
/* 215 */     int squaresize = 15;
/* 216 */     if (this.mc.isSingleplayer()) {
/* 217 */       int color = -13026237;
/* 218 */       drawRect(left, (int)(aftermain + i * 20.0D), channelborder, (int)(aftermain + i * 20.0D + 20.0D), color);
/* 219 */       Fonts.DiscordTextRenderer.drawStringWithShadow("#", (left + 6), aftermain + i * 20.0D + 10.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 9343639);
/* 220 */       Fonts.DiscordTextRenderer.drawStringWithShadow(this.mc.thePlayer.getName(), (left + 15), aftermain + i * 20.0D + 10.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 16777215);
/* 221 */       ArrayList<String> infolist = new ArrayList<>();
/* 222 */       infolist.add("Name: " + this.mc.thePlayer.getName());
/* 223 */       infolist.add("X: " + (Math.round(this.mc.thePlayer.posX * 10.0D) / 10.0D));
/* 224 */       infolist.add("Y: " + (Math.round(this.mc.thePlayer.posY * 10.0D) / 10.0D));
/* 225 */       infolist.add("Z: " + (Math.round(this.mc.thePlayer.posZ * 10.0D) / 10.0D));
/*     */       
/* 227 */       int i2 = 0;
/*     */       
/* 229 */       for (String s : infolist) {
/* 230 */         Fonts.DiscordTextRenderer.drawStringWithShadow(s, (center - Fonts.DiscordTextRenderer.getStringWidth(s) / 2), (top + 10 + 10 * i2), 16777215);
/* 231 */         i2++;
/*     */       } 
/* 233 */       GuiInventory.drawEntityOnScreen(center, (top + i2 * 10 + 10) * 5, 100, 0.0F, 0.0F, (EntityLivingBase)this.mc.thePlayer);
/*     */     } else {
/*     */       
/* 236 */       for (NetworkPlayerInfo p : this.mc.getNetHandler().getPlayerInfoMap()) {
/*     */         
/* 238 */         int color = ((mousex > left && mousex < channelborder && mousey > aftermain + i * 20.0D && mousey < aftermain + i * 20.0D + 20.0D) || this.selectedplayer == p) ? -13026237 : -13684426;
/* 239 */         drawRect(left, (int)(aftermain + i * 20.0D), channelborder, (int)(aftermain + i * 20.0D + 20.0D), color);
/*     */         
/* 241 */         Fonts.DiscordTextRenderer.drawStringWithShadow(p.getGameProfile().getName(), (left + 25), aftermain + i * 20.0D + 10.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), Friendutils.isFriend(p.getGameProfile().getId().toString()) ? 11337644 : 16777215);
/* 242 */         this.mc.getTextureManager().bindTexture(p.getLocationSkin());
/* 243 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */         
/* 245 */         EntityPlayer entityplayer = this.mc.theWorld.getPlayerEntityByUUID(p.getGameProfile().getId());
/* 246 */         boolean flag1 = (entityplayer != null && entityplayer.isWearing(EnumPlayerModelParts.CAPE) && (p.getGameProfile().getName().equals("Dinnerbone") || p.getGameProfile().getName().equals("Grumm")));
/* 247 */         int l2 = 8 + (flag1 ? 8 : 0);
/* 248 */         int i3 = 8 * (flag1 ? -1 : 1);
/* 249 */         Gui.drawScaledCustomSizeModalRect(left + 13 - squaresize / 2, (int)(aftermain + i * 20.0D + 9.0D - (squaresize / 2)), 8.0F, l2, 8, i3, squaresize, squaresize, 64.0F, 64.0F);
/* 250 */         if (entityplayer != null && 
/* 251 */           this.mc.thePlayer.getDistanceToEntity((Entity)entityplayer) < 10.0F && entityplayer != this.mc.thePlayer) {
/* 252 */           Renderutils.drawFullCircle(channelborder - 10, (int)(aftermain + i * 20.0D + 10.0D), 9.0D, 584797260);
/* 253 */           Renderutils.drawCircle((channelborder - 10), (int)(aftermain + i * 20.0D + 10.0D), 9.0F, 30, -2405300);
/* 254 */           Fonts.DiscordTextRenderer.drawStringWithShadow("!", (channelborder - 10 - Fonts.DiscordTextRenderer.getStringWidth("!") / 2), aftermain + i * 20.0D + 11.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 16777215);
/*     */         } 
/*     */ 
/*     */         
/* 258 */         i++;
/*     */       } 
/* 260 */       if (this.selectedplayer != null && !this.mc.getNetHandler().getPlayerInfoMap().contains(this.selectedplayer)) {
/* 261 */         this.selectedplayer = null;
/*     */       }
/* 263 */       if (this.selectedplayer == null) {
/* 264 */         this.selectedplayer = this.mc.getNetHandler().getPlayerInfo(this.mc.thePlayer.getUniqueID());
/*     */       }
/* 266 */       if (this.selectedplayer != null) {
/* 267 */         EntityPlayer selectedplayerent = this.mc.theWorld.getPlayerEntityByUUID(this.selectedplayer.getGameProfile().getId());
/* 268 */         ArrayList<String> infolist = new ArrayList<>();
/* 269 */         infolist.add("Name: " + this.selectedplayer.getGameProfile().getName());
/* 270 */         infolist.add("Ping: " + this.selectedplayer.getResponseTime());
/* 271 */         if (selectedplayerent != null) {
/* 272 */           infolist.add("X: " + (Math.round(selectedplayerent.posX * 10.0D) / 10.0D));
/* 273 */           infolist.add("Y: " + (Math.round(selectedplayerent.posY * 10.0D) / 10.0D));
/* 274 */           infolist.add("Z: " + (Math.round(selectedplayerent.posZ * 10.0D) / 10.0D));
/* 275 */           infolist.add("Distance: " + (Math.round(this.mc.thePlayer.getDistanceToEntity((Entity)selectedplayerent) * 10.0F) / 10.0D));
/*     */         } 
/*     */         
/* 278 */         int i2 = 0;
/*     */         
/* 280 */         for (String s : infolist) {
/* 281 */           Fonts.DiscordTextRenderer.drawStringWithShadow(s, (center - Fonts.DiscordTextRenderer.getStringWidth(s) / 2), (top + 10 + 10 * i2), 16777215);
/* 282 */           i2++;
/*     */         } 
/*     */         
/* 285 */         if (selectedplayerent != null) {
/* 286 */           GuiInventory.drawEntityOnScreen(center, (top + i2 * 10 + 10) * 4, 100, 0.0F, 0.0F, (EntityLivingBase)selectedplayerent);
/*     */         } else {
/*     */           
/*     */           try {
/* 290 */             AbstractClientPlayer player = new AbstractClientPlayer((World)this.mc.theWorld, this.selectedplayer.getGameProfile()) {
/*     */               
/*     */               };
/* 293 */             GuiInventory.drawEntityOnScreen(center, (top + i2 * 10 + 34) * 5, 100, 0.0F, 0.0F, (EntityLivingBase)player);
/*     */           }
/* 295 */           catch (Exception e) {
/* 296 */             e.printStackTrace();
/*     */           } 
/*     */         } 
/* 299 */         boolean hover = (mousex > center - 100 && mousex < center + 100 && mousey > top + 350 && mousey < top + 370);
/* 300 */         Gui.drawRect(center - 100, top + 350, center + 100, top + 370, hover ? -8026747 : -4868683);
/* 301 */         Fonts.DiscordTextRenderer.drawStringWithShadow("Friended: " + Friendutils.isFriend(this.selectedplayer.getGameProfile().getId().toString()), (center - Fonts.DiscordTextRenderer.getStringWidth("Friended: " + Friendutils.isFriend(this.selectedplayer.getGameProfile().getId().toString())) / 2), (top + 356), 16777215);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void drawCategory(int mousex, int mousey) {
/* 309 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 310 */     int top = 12;
/* 311 */     int left = 35;
/* 312 */     int aftermain = top + 29;
/* 313 */     int channelborder = 155;
/* 314 */     double i = this.scroll;
/* 315 */     int center = channelborder + (sr.getScaledWidth() - channelborder) / 2;
/* 316 */     for (Module m : Main.modmgr.getModulesInCategory(this.selectedcat)) {
/*     */       
/* 318 */       boolean hovered = (mousex > left && mousex < channelborder && mousey > aftermain + i * 20.0D && mousey < aftermain + i * 20.0D + 20.0D);
/* 319 */       int color = hovered ? -13026237 : -13684426;
/* 320 */       drawRect(left, (int)(aftermain + i * 20.0D), channelborder, (int)(aftermain + i * 20.0D + 20.0D), color);
/* 321 */       Fonts.DiscordTextRenderer.drawStringWithShadow("#", (left + 6), aftermain + i * 20.0D + 10.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 9343639);
/* 322 */       Fonts.DiscordTextRenderer.drawStringWithShadow(m.name, (left + 15), aftermain + i * 20.0D + 10.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 16777215);
/* 323 */       if (hovered && i >= -0.1D) {
/* 324 */         drawRect(channelborder + 7, (int)(aftermain + i * 20.0D), channelborder + 10 + Fonts.DiscordTextRenderer.getStringWidth("[" + Keyboard.getKeyName(m.keybind) + "] " + (m.getState() ? "enabled" : "disabled")) + 3, (int)(aftermain + i * 20.0D + 20.0D), -16777216);
/* 325 */         Fonts.DiscordTextRenderer.drawStringWithShadow("[" + Keyboard.getKeyName(m.keybind) + "] " + (m.getState() ? "enabled" : "disabled"), (channelborder + 10), aftermain + i * 20.0D + 10.0D - (Fonts.DiscordTextRenderer.getHeight() / 2), 16777215);
/*     */       } 
/*     */       
/* 328 */       i++;
/*     */     } 
/* 330 */     if (this.selectedmodule != null && this.bindingmodule == null)
/*     */     {
/* 332 */       if (Main.setmgr.getSettingsByMod(this.selectedmodule) != null && Main.setmgr.getSettingsByMod(this.selectedmodule).size() > 0) {
/* 333 */         int i2 = 0;
/* 334 */         Fonts.DiscordTextRenderer.drawCenteredStringWithShadow(this.selectedmodule.name, center, (top + 10), 16777215);
/* 335 */         for (Setting s : Main.setmgr.getSettingsByMod(this.selectedmodule)) {
/* 336 */           if (!s.isVisible().booleanValue()) {
/*     */             continue;
/*     */           }
/* 339 */           if (s.isCheck()) {
/* 340 */             boolean hovered = (mousex > center + 30 && mousex < center + 29 + 11 && mousey > top + 30 + 12 * i2 - 1 && mousey < top + 30 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() + 1);
/* 341 */             drawRect(center - 30, top + 30 + 12 * i2 - 2, center + 29 + 12, top + 30 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() + 3, -13684426);
/* 342 */             drawRect(center + 30, top + 30 + 12 * i2 - 1, center + 29 + 11, top + 30 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() + 1, hovered ? -14671323 : -12565429);
/* 343 */             if (s.getValBoolean()) {
/* 344 */               drawRect(center + 32, top + 30 + 12 * i2, center + 29 + 9, top + 32 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() - 2, hovered ? -3355444 : -1);
/*     */             }
/* 346 */             Fonts.DiscordTextRenderer.drawCenteredStringWithShadow(s.getName(), center, (top + 30 + 12 * i2), 16777215);
/* 347 */             i2++;
/*     */           } 
/* 349 */           if (s.isCombo()) {
/* 350 */             ArrayList<String> options = s.getOptions();
/* 351 */             Fonts.DiscordTextRenderer.drawCenteredStringWithShadow(s.getName(), center, (top + 30 + 7 + 12 * i2), 16777215);
/* 352 */             Renderutils.drawOutlinedBox(center - 100, top + 30 + i2 * 12, center + 100, top + 10 + 30 + i2 * 12 + (options.size() + 1) * 12, 2, 0, -14671323);
/* 353 */             i2++;
/* 354 */             for (String st : options) {
/* 355 */               boolean hovered = (mousex > center - 98 && mousex < center + 98 && mousey > top + 40 + i2 * 12 - 3 && mousey < top + 40 + i2 * 12 + Fonts.DiscordTextRenderer.getHeight() + 3);
/* 356 */               boolean isthismode = s.getValString().equalsIgnoreCase(st);
/* 357 */               drawRect(center - 98, top + 40 + i2 * 12 - 3, center + 98, top + 40 + i2 * 12 + Fonts.DiscordTextRenderer.getHeight() + 3, isthismode ? -9275779 : (hovered ? -13684426 : -14671323));
/* 358 */               Fonts.DiscordTextRenderer.drawCenteredStringWithShadow(st, center, (top + 30 + 10 + 12 * i2), 16777215);
/* 359 */               i2++;
/*     */             } 
/* 361 */             i2 += 2;
/*     */           } 
/* 363 */           if (s.isSlider()) {
/* 364 */             int leftrect = center - 30;
/* 365 */             int rightrect = center + 29 + 12;
/*     */             
/* 367 */             double percentage = (s.getValDouble() - s.getMin()) / (s.getMax() - s.getMin());
/*     */             
/* 369 */             double renderright = leftrect + percentage * (rightrect - leftrect);
/*     */             
/* 371 */             boolean hovered = (mousex > leftrect && mousex < rightrect && mousey > top + 30 + 12 * i2 - 2 && mousey < top + 30 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() + 3);
/*     */             
/* 373 */             drawRect(leftrect, top + 30 + 12 * i2 - 2, rightrect, top + 30 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() + 3, -13684426);
/*     */ 
/*     */             
/* 376 */             drawRect(leftrect, top + 30 + 12 * i2 - 2, (int)renderright, top + 30 + 12 * i2 + Fonts.DiscordTextRenderer.getHeight() + 3, hovered ? -14671323 : -12565429);
/*     */ 
/*     */             
/* 379 */             if (this.mousedown && hovered) {
/* 380 */               double hoveringpart = (mousex - leftrect) / 70.0D;
/* 381 */               double value = (s.getMax() - s.getMin()) * hoveringpart;
/* 382 */               double setval = value + s.getMin();
/* 383 */               if (s.onlyInt()) {
/* 384 */                 setval = Math.round(setval);
/*     */               }
/* 386 */               s.setValDouble(setval);
/*     */             } 
/*     */ 
/*     */ 
/*     */             
/* 391 */             Fonts.DiscordTextRenderer.drawStringWithShadow(s.getName(), (leftrect - Fonts.DiscordTextRenderer.getStringWidth(s.getName()) - 2), (top + 30 + 12 * i2), 16777215);
/* 392 */             Fonts.DiscordTextRenderer.drawStringWithShadow((new StringBuilder(String.valueOf(Math.round(s.getValDouble() * 100.0D) / 100.0D))).toString(), (leftrect + 3), (top + 30 + 12 * i2), 16777215);
/* 393 */             i2++;
/*     */           }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 399 */         Fonts.DiscordTextRenderer.drawStringWithShadow(this.selectedmodule.name, (center - Fonts.DiscordTextRenderer.getStringWidth(this.selectedmodule.name) / 2), (sr.getScaledHeight() / 2 - Fonts.DiscordTextRenderer.getHeight()), 16777215);
/* 400 */         Fonts.DiscordTextRenderer.drawStringWithShadow("Has no options", (center - Fonts.DiscordTextRenderer.getStringWidth("Has no options") / 2), (sr.getScaledHeight() / 2 + Fonts.DiscordTextRenderer.getHeight()), 16777215);
/*     */       } 
/*     */     }
/* 403 */     if (this.bindingmodule != null) {
/* 404 */       Fonts.DiscordTextRenderer.drawStringWithShadow("Binding module " + this.bindingmodule.name + ", press any key to bind or escape to unbind", (center - Fonts.DiscordTextRenderer.getStringWidth("Binding module " + this.bindingmodule.name + ", press any key to bind or escape to unbind") / 2), (sr.getScaledHeight() / 2), 16777215);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
/* 410 */     super.mouseClicked(mouseX, mouseY, mouseButton);
/* 411 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 412 */     boolean hovered = (Renderutils.getDistance2d(mouseX, mouseY, 17.0D, 27.0D) < 15.0D);
/* 413 */     int top = 12;
/* 414 */     int left = 35;
/* 415 */     int aftermain = top + 29;
/* 416 */     int channelborder = 155;
/* 417 */     double i2 = this.scroll;
/* 418 */     int center = channelborder + (sr.getScaledWidth() - channelborder) / 2;
/* 419 */     if (hovered && mouseButton == 0) {
/* 420 */       this.selectedcat = null;
/* 421 */       this.scroll = 0.0D;
/* 422 */       this.targetScroll = 0;
/*     */     } 
/* 424 */     double i = this.catscroll; byte b; int j; Category[] arrayOfCategory;
/* 425 */     for (j = (arrayOfCategory = Category.values()).length, b = 0; b < j; ) { Category c = arrayOfCategory[b];
/* 426 */       hovered = (Renderutils.getDistance2d(mouseX, mouseY, 17.0D, 65.0D + i * 35.0D) < 15.0D);
/* 427 */       if (hovered && mouseButton == 0) {
/* 428 */         this.bindingmodule = null;
/* 429 */         this.selectedmodule = null;
/* 430 */         this.selectedcat = c;
/* 431 */         this.scroll = 0.0D;
/* 432 */         this.targetScroll = 0;
/*     */       } 
/* 434 */       i++; b++; }
/*     */     
/* 436 */     if (mouseButton == 0) {
/* 437 */       this.mousedown = true;
/*     */     }
/* 439 */     if (this.selectedcat == null) {
/* 440 */       if (!this.mc.isSingleplayer()) {
/* 441 */         for (NetworkPlayerInfo p : this.mc.getNetHandler().getPlayerInfoMap()) {
/* 442 */           if (mouseButton == 0 && mouseX > left && mouseX < channelborder && mouseY > aftermain + i2 * 20.0D && mouseY < aftermain + i2 * 20.0D + 20.0D) {
/* 443 */             this.selectedplayer = p;
/* 444 */             this.bindingmodule = null;
/*     */           } 
/* 446 */           i2++;
/*     */         } 
/* 448 */         if (this.selectedplayer != null) {
/* 449 */           boolean hover = (mouseX > center - 100 && mouseX < center + 100 && mouseY > top + 350 && mouseY < top + 370);
/* 450 */           if (hover && mouseButton == 0) {
/* 451 */             if (Friendutils.isFriend(this.selectedplayer.getGameProfile().getId().toString())) {
/* 452 */               Friendutils.removeFriend(this.selectedplayer.getGameProfile().getId().toString());
/*     */             } else {
/*     */               
/* 455 */               Friendutils.addFriend(this.selectedplayer.getGameProfile().getId().toString());
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 462 */       for (Module m : Main.modmgr.getModulesInCategory(this.selectedcat)) {
/* 463 */         if (i2 >= -0.1D) {
/* 464 */           boolean hover = (mouseX > left && mouseX < channelborder && mouseY > aftermain + i2 * 20.0D && mouseY < aftermain + i2 * 20.0D + 20.0D);
/* 465 */           if (hover && mouseButton == 0) {
/* 466 */             this.bindingmodule = null;
/* 467 */             m.toggle();
/*     */           } 
/* 469 */           if (hover && mouseButton == 1) {
/* 470 */             this.bindingmodule = null;
/* 471 */             this.selectedmodule = m;
/*     */           } 
/* 473 */           if (hover && mouseButton == 2) {
/* 474 */             this.bindingmodule = m;
/*     */           }
/*     */         } 
/* 477 */         i2++;
/*     */       } 
/*     */     } 
/* 480 */     if (this.selectedmodule != null && this.bindingmodule == null && this.selectedcat != null && 
/* 481 */       Main.setmgr.getSettingsByMod(this.selectedmodule) != null && Main.setmgr.getSettingsByMod(this.selectedmodule).size() > 0) {
/* 482 */       int i3 = 0;
/* 483 */       Fonts.DiscordTextRenderer.drawCenteredStringWithShadow(this.selectedmodule.name, center, (top + 10), 16777215);
/* 484 */       for (Setting s : Main.setmgr.getSettingsByMod(this.selectedmodule)) {
/* 485 */         if (!s.isVisible().booleanValue()) {
/*     */           continue;
/*     */         }
/* 488 */         if (s.isCheck()) {
/* 489 */           hovered = (mouseX > center + 30 && mouseX < center + 29 + 11 && mouseY > top + 30 + 12 * i3 - 1 && mouseY < top + 30 + 12 * i3 + Fonts.DiscordTextRenderer.getHeight() + 1);
/* 490 */           if (hovered && mouseButton == 0) {
/* 491 */             s.setValBoolean(!s.getValBoolean());
/*     */           }
/* 493 */           i3++;
/*     */         } 
/* 495 */         if (s.isCombo()) {
/* 496 */           ArrayList<String> options = s.getOptions();
/* 497 */           i3++;
/* 498 */           for (String st : options) {
/* 499 */             hovered = (mouseX > center - 98 && mouseX < center + 98 && mouseY > top + 40 + i3 * 12 - 3 && mouseY < top + 40 + i3 * 12 + Fonts.DiscordTextRenderer.getHeight() + 3);
/* 500 */             boolean isthismode = s.getValString().equalsIgnoreCase(st);
/* 501 */             if (hovered && !isthismode) {
/* 502 */               s.setValString(st);
/*     */             }
/* 504 */             i3++;
/*     */           } 
/* 506 */           i3 += 2;
/*     */         } 
/* 508 */         if (s.isSlider()) {
/* 509 */           i3++;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void handleMouseInput() throws IOException {
/* 518 */     super.handleMouseInput();
/* 519 */     int top = 12;
/* 520 */     int aftermain = top + 29;
/* 521 */     int left = 35;
/* 522 */     int channelborder = 155;
/* 523 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 524 */     if (Mouse.getX() > left * 2 && Mouse.getX() < channelborder * 2) {
/* 525 */       if (Mouse.getEventDWheel() > 0) {
/* 526 */         this.targetScroll++;
/*     */       }
/* 528 */       else if (Mouse.getEventDWheel() < 0) {
/* 529 */         this.targetScroll--;
/*     */       } 
/* 531 */       if (this.targetScroll > 0) {
/* 532 */         this.targetScroll = 0;
/*     */       }
/* 534 */       int i = 0;
/* 535 */       if (this.selectedcat == null) {
/* 536 */         i = this.mc.getNetHandler().getPlayerInfoMap().size();
/*     */       } else {
/*     */         
/* 539 */         i = Main.modmgr.getModulesInCategory(this.selectedcat).size();
/*     */       } 
/* 541 */       if (this.targetScroll < -i + 1) {
/* 542 */         this.targetScroll = -i + 1;
/*     */       }
/*     */     }
/* 545 */     else if (Mouse.getX() < left * 2) {
/* 546 */       if (Mouse.getEventDWheel() > 0) {
/* 547 */         this.targetCatScroll++;
/*     */       }
/* 549 */       else if (Mouse.getEventDWheel() < 0) {
/* 550 */         this.targetCatScroll--;
/*     */       } 
/* 552 */       if (this.targetCatScroll > 0) {
/* 553 */         this.targetCatScroll = 0;
/*     */       }
/* 555 */       int i = (Category.values()).length + 1;
/* 556 */       if (this.targetCatScroll < -i + 1) {
/* 557 */         this.targetCatScroll = -i + 1;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void mouseReleased(int mouseX, int mouseY, int state) {
/* 564 */     super.mouseReleased(mouseX, mouseY, state);
/* 565 */     if (state == 0) {
/* 566 */       this.mousedown = false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void keyTyped(char typedChar, int keyCode) throws IOException {
/* 573 */     if (keyCode == 1) {
/* 574 */       if (this.bindingmodule == null) {
/* 575 */         this.mc.thePlayer.closeScreen();
/*     */       } else {
/*     */         
/* 578 */         this.bindingmodule.keybind = 0;
/* 579 */         this.bindingmodule = null;
/*     */       }
/*     */     
/* 582 */     } else if (this.bindingmodule != null) {
/* 583 */       this.bindingmodule.keybind = keyCode;
/* 584 */       this.bindingmodule = null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/clickgui/Clickgui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */