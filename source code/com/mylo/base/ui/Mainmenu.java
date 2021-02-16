/*     */ package com.mylo.base.ui;
/*     */ 
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.specialobjects.BoundVars;
/*     */ import com.mylo.base.specialobjects.Point;
/*     */ import com.mylo.base.utils.Colorutil;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.altutils;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URI;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.GuiButton;
/*     */ import net.minecraft.client.gui.GuiConfirmOpenLink;
/*     */ import net.minecraft.client.gui.GuiLanguage;
/*     */ import net.minecraft.client.gui.GuiMultiplayer;
/*     */ import net.minecraft.client.gui.GuiOptions;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.GuiSelectWorld;
/*     */ import net.minecraft.client.gui.GuiYesNo;
/*     */ import net.minecraft.client.gui.GuiYesNoCallback;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.renderer.OpenGlHelper;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.client.renderer.WorldRenderer;
/*     */ import net.minecraft.client.renderer.texture.DynamicTexture;
/*     */ import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
/*     */ import net.minecraft.client.resources.I18n;
/*     */ import net.minecraft.realms.RealmsBridge;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.world.demo.DemoWorldServer;
/*     */ import net.minecraft.world.storage.ISaveFormat;
/*     */ import net.minecraft.world.storage.WorldInfo;
/*     */ import org.apache.commons.io.Charsets;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ import org.lwjgl.util.glu.Project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Mainmenu
/*     */   extends GuiScreen
/*     */   implements GuiYesNoCallback
/*     */ {
/*     */   private ArrayList<BoundVars> cheemses;
/*  59 */   private ResourceLocation cheems = new ResourceLocation("nigger/images/cheems.png");
/*     */ 
/*     */ 
/*     */   
/*  63 */   private static final AtomicInteger field_175373_f = new AtomicInteger(0);
/*  64 */   private static final Logger logger = LogManager.getLogger();
/*  65 */   private static final Random RANDOM = new Random();
/*     */ 
/*     */   
/*     */   private float updateCounter;
/*     */   
/*  70 */   int ticker = 0;
/*     */ 
/*     */   
/*     */   private String splashText;
/*     */ 
/*     */   
/*     */   private GuiButton buttonResetDemo;
/*     */ 
/*     */   
/*     */   private int panoramaTimer;
/*     */ 
/*     */   
/*     */   private DynamicTexture viewportTexture;
/*     */ 
/*     */   
/*     */   private boolean field_175375_v = true;
/*     */ 
/*     */   
/*  88 */   private final Object threadLock = new Object();
/*     */ 
/*     */   
/*     */   private String openGLWarning1;
/*     */ 
/*     */   
/*     */   private String openGLWarning2;
/*     */   
/*     */   private String openGLWarningLink;
/*     */   
/*  98 */   private static final ResourceLocation splashTexts = new ResourceLocation("texts/splashes.txt");
/*  99 */   private static final ResourceLocation minecraftTitleTextures = new ResourceLocation("textures/gui/title/minecraft.png");
/*     */ 
/*     */   
/* 102 */   private static final ResourceLocation[] titlePanoramaPaths = new ResourceLocation[] { new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png") };
/* 103 */   public static final String field_96138_a = "Please click " + EnumChatFormatting.UNDERLINE + "here" + EnumChatFormatting.RESET + " for more information.";
/*     */   
/*     */   private int field_92024_r;
/*     */   
/*     */   private int field_92023_s;
/*     */   
/*     */   private int field_92022_t;
/*     */   private int field_92021_u;
/*     */   private int field_92020_v;
/*     */   private int field_92019_w;
/*     */   private ResourceLocation backgroundTexture;
/*     */   private GuiButton realmsButton;
/*     */   
/*     */   public Mainmenu() {
/* 117 */     this.openGLWarning2 = field_96138_a;
/* 118 */     this.splashText = "missingno";
/* 119 */     BufferedReader bufferedreader = null;
/*     */ 
/*     */     
/*     */     try {
/* 123 */       List<String> list = Lists.newArrayList();
/* 124 */       bufferedreader = new BufferedReader(new InputStreamReader(Minecraft.getMinecraft().getResourceManager().getResource(splashTexts).getInputStream(), Charsets.UTF_8));
/*     */       
/*     */       String s;
/* 127 */       while ((s = bufferedreader.readLine()) != null) {
/*     */         
/* 129 */         s = s.trim();
/*     */         
/* 131 */         if (!s.isEmpty())
/*     */         {
/* 133 */           list.add(s);
/*     */         }
/*     */       } 
/*     */       
/* 137 */       if (!list.isEmpty()) {
/*     */         do
/*     */         {
/*     */           
/* 141 */           this.splashText = list.get(RANDOM.nextInt(list.size()));
/*     */         }
/* 143 */         while (this.splashText.hashCode() == 125780783);
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 150 */     catch (IOException iOException) {
/*     */ 
/*     */     
/*     */     }
/*     */     finally {
/*     */       
/* 156 */       if (bufferedreader != null) {
/*     */         
/*     */         try {
/*     */           
/* 160 */           bufferedreader.close();
/*     */         }
/* 162 */         catch (IOException iOException) {}
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     this.updateCounter = RANDOM.nextFloat();
/* 170 */     this.openGLWarning1 = "";
/*     */     
/* 172 */     if (!(GLContext.getCapabilities()).OpenGL20 && !OpenGlHelper.areShadersSupported()) {
/*     */       
/* 174 */       this.openGLWarning1 = I18n.format("title.oldgl1", new Object[0]);
/* 175 */       this.openGLWarning2 = I18n.format("title.oldgl2", new Object[0]);
/* 176 */       this.openGLWarningLink = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateScreen() {
/* 185 */     this.ticker++;
/* 186 */     for (BoundVars cheems : this.cheemses) {
/* 187 */       Point pos = (Point)cheems.getValue("pos");
/* 188 */       int speed = ((Integer)cheems.getValue("speed")).intValue();
/* 189 */       int rotation = ((Integer)cheems.getValue("rotation")).intValue();
/* 190 */       int rotationspeed = ((Integer)cheems.getValue("rotationspeed")).intValue();
/* 191 */       cheems.addInfo("rotation", Integer.valueOf((rotation + rotationspeed) % 360));
/* 192 */       pos.setY(pos.getY() + speed);
/* 193 */       if (pos.getY() > this.height) {
/* 194 */         pos.setY(pos.getY() - this.height - 20);
/*     */       }
/*     */     } 
/* 197 */     if (Minecraft.getDebugFPS() > 30) {
/* 198 */       BoundVars bvars = new BoundVars();
/* 199 */       Random r = new Random();
/* 200 */       bvars.addInfo("pos", new Point(r.nextInt(this.width + 20), r.nextInt(this.height + 20)));
/* 201 */       bvars.addInfo("speed", Integer.valueOf(r.nextInt(4) + 1));
/* 202 */       bvars.addInfo("rotation", Integer.valueOf(0));
/* 203 */       bvars.addInfo("rotationspeed", Integer.valueOf(r.nextInt(10) - 5));
/* 204 */       this.cheemses.add(bvars);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean doesGuiPauseGame() {
/* 213 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void keyTyped(char typedChar, int keyCode) throws IOException {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initGui() {
/* 230 */     this.ticker = 0;
/* 231 */     this.cheemses = new ArrayList<>();
/*     */     
/* 233 */     int i = 24;
/* 234 */     int j = this.height / 4 + 48;
/*     */     
/* 236 */     addSingleplayerMultiplayerButtons(j, i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     synchronized (this.threadLock) {
/*     */       
/* 247 */       this.field_92023_s = this.fontRendererObj.getStringWidth(this.openGLWarning1);
/* 248 */       this.field_92024_r = this.fontRendererObj.getStringWidth(this.openGLWarning2);
/* 249 */       int k = Math.max(this.field_92023_s, this.field_92024_r);
/* 250 */       this.field_92022_t = (this.width - k) / 2;
/* 251 */       this.field_92021_u = ((GuiButton)this.buttonList.get(0)).yPosition - 24;
/* 252 */       this.field_92020_v = this.field_92022_t + k;
/* 253 */       this.field_92019_w = this.field_92021_u + 24;
/*     */     } 
/*     */     
/* 256 */     this.mc.func_181537_a(false);
/*     */     
/* 258 */     if (Main.updateAvailable) {
/* 259 */       ScaledResolution sr = new ScaledResolution(this.mc);
/* 260 */       this.buttonList.add(new GuiButton(22, sr.getScaledWidth() - 100, 28, 98, 20, "Update!"));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_) {
/* 269 */     int j = this.height / 4 + 48;
/* 270 */     int i = 24;
/* 271 */     this.buttonList.add(new GuiButton(1, 12, j, 98, 20, I18n.format("menu.singleplayer", new Object[0])));
/* 272 */     this.buttonList.add(new GuiButton(2, 12, j + i * 1, 98, 20, I18n.format("menu.multiplayer", new Object[0])));
/* 273 */     this.buttonList.add(this.realmsButton = new GuiButton(14, 12, j + i * 2, 98, 20, I18n.format("Alt manager", new Object[0])));
/* 274 */     this.buttonList.add(new GuiButton(0, 12, j + i * 3, 98, 20, I18n.format("menu.options", new Object[0])));
/* 275 */     this.buttonList.add(new GuiButton(4, 12, j + i * 4, 98, 20, I18n.format("menu.quit", new Object[0])));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void addDemoButtons(int p_73972_1_, int p_73972_2_) {
/* 284 */     this.buttonList.add(new GuiButton(11, this.width / 2 - 100, p_73972_1_, I18n.format("menu.playdemo", new Object[0])));
/* 285 */     this.buttonList.add(this.buttonResetDemo = new GuiButton(12, this.width / 2 - 100, p_73972_1_ + p_73972_2_ * 1, I18n.format("menu.resetdemo", new Object[0])));
/* 286 */     ISaveFormat isaveformat = this.mc.getSaveLoader();
/* 287 */     WorldInfo worldinfo = isaveformat.getWorldInfo("Demo_World");
/*     */     
/* 289 */     if (worldinfo == null)
/*     */     {
/* 291 */       this.buttonResetDemo.enabled = false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void actionPerformed(GuiButton button) throws IOException {
/* 300 */     if (button.id == 22) {
/* 301 */       Main.update();
/*     */     }
/*     */     
/* 304 */     if (button.id == 0)
/*     */     {
/* 306 */       this.mc.displayGuiScreen((GuiScreen)new GuiOptions(this, this.mc.gameSettings));
/*     */     }
/*     */     
/* 309 */     if (button.id == 5)
/*     */     {
/* 311 */       this.mc.displayGuiScreen((GuiScreen)new GuiLanguage(this, this.mc.gameSettings, this.mc.getLanguageManager()));
/*     */     }
/*     */     
/* 314 */     if (button.id == 1)
/*     */     {
/* 316 */       this.mc.displayGuiScreen((GuiScreen)new GuiSelectWorld(this));
/*     */     }
/*     */     
/* 319 */     if (button.id == 2)
/*     */     {
/* 321 */       this.mc.displayGuiScreen((GuiScreen)new GuiMultiplayer(this));
/*     */     }
/*     */     
/* 324 */     if (button.id == 14)
/*     */     {
/* 326 */       altutils.showAltManager(this);
/*     */     }
/*     */     
/* 329 */     if (button.id == 4)
/*     */     {
/* 331 */       this.mc.shutdown();
/*     */     }
/*     */     
/* 334 */     if (button.id == 11)
/*     */     {
/* 336 */       this.mc.launchIntegratedServer("Demo_World", "Demo_World", DemoWorldServer.demoWorldSettings);
/*     */     }
/*     */     
/* 339 */     if (button.id == 12) {
/*     */       
/* 341 */       ISaveFormat isaveformat = this.mc.getSaveLoader();
/* 342 */       WorldInfo worldinfo = isaveformat.getWorldInfo("Demo_World");
/*     */       
/* 344 */       if (worldinfo != null) {
/*     */         
/* 346 */         GuiYesNo guiyesno = GuiSelectWorld.func_152129_a(this, worldinfo.getWorldName(), 12, this);
/* 347 */         this.mc.displayGuiScreen((GuiScreen)guiyesno);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void switchToRealms() {
/* 354 */     RealmsBridge realmsbridge = new RealmsBridge();
/* 355 */     realmsbridge.switchToRealms(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void confirmClicked(boolean result, int id) {
/* 360 */     if (result && id == 12) {
/*     */       
/* 362 */       ISaveFormat isaveformat = this.mc.getSaveLoader();
/* 363 */       isaveformat.flushCache();
/* 364 */       isaveformat.deleteWorldDirectory("Demo_World");
/* 365 */       this.mc.displayGuiScreen(this);
/*     */     }
/* 367 */     else if (id == 13) {
/*     */       
/* 369 */       if (result) {
/*     */         
/*     */         try {
/*     */           
/* 373 */           Class<?> oclass = Class.forName("java.awt.Desktop");
/* 374 */           Object object = oclass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 375 */           oclass.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { new URI(this.openGLWarningLink) });
/*     */         }
/* 377 */         catch (Throwable throwable) {
/*     */           
/* 379 */           logger.error("Couldn't open link", throwable);
/*     */         } 
/*     */       }
/*     */       
/* 383 */       this.mc.displayGuiScreen(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void drawPanorama(int p_73970_1_, int p_73970_2_, float p_73970_3_) {
/* 392 */     Tessellator tessellator = Tessellator.getInstance();
/* 393 */     WorldRenderer worldrenderer = tessellator.getWorldRenderer();
/* 394 */     GlStateManager.matrixMode(5889);
/* 395 */     GlStateManager.pushMatrix();
/* 396 */     GlStateManager.loadIdentity();
/* 397 */     Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
/* 398 */     GlStateManager.matrixMode(5888);
/* 399 */     GlStateManager.pushMatrix();
/* 400 */     GlStateManager.loadIdentity();
/* 401 */     GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
/* 402 */     GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
/* 403 */     GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
/* 404 */     GlStateManager.enableBlend();
/* 405 */     GlStateManager.disableAlpha();
/* 406 */     GlStateManager.disableCull();
/* 407 */     GlStateManager.depthMask(false);
/* 408 */     GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
/* 409 */     int i = 8;
/*     */     
/* 411 */     for (int j = 0; j < i * i; j++) {
/*     */       
/* 413 */       GlStateManager.pushMatrix();
/* 414 */       float f = ((j % i) / i - 0.5F) / 64.0F;
/* 415 */       float f1 = ((j / i) / i - 0.5F) / 64.0F;
/* 416 */       float f2 = 0.0F;
/* 417 */       GlStateManager.translate(f, f1, f2);
/* 418 */       GlStateManager.rotate(MathHelper.sin((this.panoramaTimer + p_73970_3_) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
/* 419 */       GlStateManager.rotate(-(this.panoramaTimer + p_73970_3_) * 0.1F, 0.0F, 1.0F, 0.0F);
/*     */       
/* 421 */       for (int k = 0; k < 6; k++) {
/*     */         
/* 423 */         GlStateManager.pushMatrix();
/*     */         
/* 425 */         if (k == 1)
/*     */         {
/* 427 */           GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
/*     */         }
/*     */         
/* 430 */         if (k == 2)
/*     */         {
/* 432 */           GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
/*     */         }
/*     */         
/* 435 */         if (k == 3)
/*     */         {
/* 437 */           GlStateManager.rotate(-90.0F, 0.0F, 1.0F, 0.0F);
/*     */         }
/*     */         
/* 440 */         if (k == 4)
/*     */         {
/* 442 */           GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
/*     */         }
/*     */         
/* 445 */         if (k == 5)
/*     */         {
/* 447 */           GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
/*     */         }
/*     */         
/* 450 */         this.mc.getTextureManager().bindTexture(titlePanoramaPaths[k]);
/* 451 */         worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
/* 452 */         int l = 255 / (j + 1);
/* 453 */         float f3 = 0.0F;
/* 454 */         worldrenderer.pos(-1.0D, -1.0D, 1.0D).tex(0.0D, 0.0D).color(255, 255, 255, l).endVertex();
/* 455 */         worldrenderer.pos(1.0D, -1.0D, 1.0D).tex(1.0D, 0.0D).color(255, 255, 255, l).endVertex();
/* 456 */         worldrenderer.pos(1.0D, 1.0D, 1.0D).tex(1.0D, 1.0D).color(255, 255, 255, l).endVertex();
/* 457 */         worldrenderer.pos(-1.0D, 1.0D, 1.0D).tex(0.0D, 1.0D).color(255, 255, 255, l).endVertex();
/* 458 */         tessellator.draw();
/* 459 */         GlStateManager.popMatrix();
/*     */       } 
/*     */       
/* 462 */       GlStateManager.popMatrix();
/* 463 */       GlStateManager.colorMask(true, true, true, false);
/*     */     } 
/*     */     
/* 466 */     worldrenderer.setTranslation(0.0D, 0.0D, 0.0D);
/* 467 */     GlStateManager.colorMask(true, true, true, true);
/* 468 */     GlStateManager.matrixMode(5889);
/* 469 */     GlStateManager.popMatrix();
/* 470 */     GlStateManager.matrixMode(5888);
/* 471 */     GlStateManager.popMatrix();
/* 472 */     GlStateManager.depthMask(true);
/* 473 */     GlStateManager.enableCull();
/* 474 */     GlStateManager.enableDepth();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void rotateAndBlurSkybox(float p_73968_1_) {
/* 482 */     this.mc.getTextureManager().bindTexture(this.backgroundTexture);
/* 483 */     GL11.glTexParameteri(3553, 10241, 9729);
/* 484 */     GL11.glTexParameteri(3553, 10240, 9729);
/* 485 */     GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
/* 486 */     GlStateManager.enableBlend();
/* 487 */     GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
/* 488 */     GlStateManager.colorMask(true, true, true, false);
/* 489 */     Tessellator tessellator = Tessellator.getInstance();
/* 490 */     WorldRenderer worldrenderer = tessellator.getWorldRenderer();
/* 491 */     worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
/* 492 */     GlStateManager.disableAlpha();
/* 493 */     int i = 3;
/*     */     
/* 495 */     for (int j = 0; j < i; j++) {
/*     */       
/* 497 */       float f = 1.0F / (j + 1);
/* 498 */       int k = this.width;
/* 499 */       int l = this.height;
/* 500 */       float f1 = (j - i / 2) / 256.0F;
/* 501 */       worldrenderer.pos(k, l, this.zLevel).tex((0.0F + f1), 1.0D).color(1.0F, 1.0F, 1.0F, f).endVertex();
/* 502 */       worldrenderer.pos(k, 0.0D, this.zLevel).tex((1.0F + f1), 1.0D).color(1.0F, 1.0F, 1.0F, f).endVertex();
/* 503 */       worldrenderer.pos(0.0D, 0.0D, this.zLevel).tex((1.0F + f1), 0.0D).color(1.0F, 1.0F, 1.0F, f).endVertex();
/* 504 */       worldrenderer.pos(0.0D, l, this.zLevel).tex((0.0F + f1), 0.0D).color(1.0F, 1.0F, 1.0F, f).endVertex();
/*     */     } 
/*     */     
/* 507 */     tessellator.draw();
/* 508 */     GlStateManager.enableAlpha();
/* 509 */     GlStateManager.colorMask(true, true, true, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void renderSkybox(int p_73971_1_, int p_73971_2_, float p_73971_3_) {
/* 517 */     this.mc.getFramebuffer().unbindFramebuffer();
/* 518 */     GlStateManager.viewport(0, 0, 256, 256);
/* 519 */     drawPanorama(p_73971_1_, p_73971_2_, p_73971_3_);
/* 520 */     rotateAndBlurSkybox(p_73971_3_);
/* 521 */     rotateAndBlurSkybox(p_73971_3_);
/* 522 */     rotateAndBlurSkybox(p_73971_3_);
/* 523 */     rotateAndBlurSkybox(p_73971_3_);
/* 524 */     rotateAndBlurSkybox(p_73971_3_);
/* 525 */     rotateAndBlurSkybox(p_73971_3_);
/* 526 */     rotateAndBlurSkybox(p_73971_3_);
/* 527 */     this.mc.getFramebuffer().bindFramebuffer(true);
/* 528 */     GlStateManager.viewport(0, 0, this.mc.displayWidth, this.mc.displayHeight);
/* 529 */     float f = (this.width > this.height) ? (120.0F / this.width) : (120.0F / this.height);
/* 530 */     float f1 = this.height * f / 256.0F;
/* 531 */     float f2 = this.width * f / 256.0F;
/* 532 */     int i = this.width;
/* 533 */     int j = this.height;
/* 534 */     Tessellator tessellator = Tessellator.getInstance();
/* 535 */     WorldRenderer worldrenderer = tessellator.getWorldRenderer();
/* 536 */     worldrenderer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
/* 537 */     worldrenderer.pos(0.0D, j, this.zLevel).tex((0.5F - f1), (0.5F + f2)).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
/* 538 */     worldrenderer.pos(i, j, this.zLevel).tex((0.5F - f1), (0.5F - f2)).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
/* 539 */     worldrenderer.pos(i, 0.0D, this.zLevel).tex((0.5F + f1), (0.5F - f2)).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
/* 540 */     worldrenderer.pos(0.0D, 0.0D, this.zLevel).tex((0.5F + f1), (0.5F + f2)).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
/* 541 */     tessellator.draw();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/* 549 */     int i = 274;
/* 550 */     int j = this.width / 2 - i / 2;
/* 551 */     int k = 30;
/*     */     
/* 553 */     int j2 = this.height / 4 + 48;
/* 554 */     int i2 = 24;
/*     */ 
/*     */     
/* 557 */     drawGradientRect(0, 0, this.width, this.height, Colorutil.getRainbow(125L, 1.0F, 1.0F, 1.0F), Colorutil.getRainbow(0L, 1.0F, 1.0F, 1.0F));
/* 558 */     GlStateManager.pushMatrix();
/* 559 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 560 */     for (BoundVars cheems : this.cheemses) {
/* 561 */       Point pos = (Point)cheems.getValue("pos");
/* 562 */       int speed = ((Integer)cheems.getValue("speed")).intValue();
/* 563 */       int rotation = ((Integer)cheems.getValue("rotation")).intValue();
/*     */       
/* 565 */       this.mc.getTextureManager().bindTexture(this.cheems);
/* 566 */       GlStateManager.pushMatrix();
/* 567 */       GL11.glTranslated(pos.getX(), (pos.getY() + (int)(speed * this.mc.timer.renderPartialTicks)), 0.0D);
/* 568 */       GL11.glRotated(rotation, 0.0D, 0.0D, 1.0D);
/* 569 */       drawScaledCustomSizeModalRect(-10, -10, 1.0F, 1.0F, 20, 20, 20, 20, 20.0F, 20.0F);
/* 570 */       GlStateManager.popMatrix();
/*     */     } 
/* 572 */     GlStateManager.popMatrix();
/* 573 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 575 */     Renderutils.drawOutlinedBox(5, j2 - 5, 117, j2 + i2 * 5, 1, 1426063360, -4473925);
/*     */     
/* 577 */     GlStateManager.pushMatrix();
/* 578 */     GlStateManager.scale(2.0F, 2.0F, 1.0F);
/* 579 */     String name = "LOL NO";
/* 580 */     Fonts.MainFontRendererBig.drawStringWithShadow(name, (this.width / 4 - Fonts.MainFontRendererBig.getStringWidth(name) / 2), 30.0D, 16777215);
/* 581 */     String cheemsamount = this.cheemses.size() + " Cheemses";
/* 582 */     GlStateManager.scale(0.5D, 0.5D, 0.5D);
/* 583 */     Fonts.MainFontRenderer.drawStringWithShadow(cheemsamount, 2.0D, 2.0D, 16777215);
/* 584 */     GlStateManager.popMatrix();
/* 585 */     String version = (Main.beta ? "DEV " : "release ") + 2.5D;
/* 586 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 587 */     Fonts.MainFontRendererBig.drawStringWithShadow(version, (sr.getScaledWidth() - Fonts.MainFontRendererBig.getStringWidth(version) - 2), 2.0D, 16777215);
/* 588 */     if (Main.updateAvailable) {
/* 589 */       String updateMessage = "Outdated client, latest version: " + Main.latestBuild;
/* 590 */       Fonts.MainFontRenderer.drawStringWithShadow(updateMessage, (sr.getScaledWidth() - Fonts.MainFontRenderer.getStringWidth(updateMessage) - 2), 18.0D, 16777215);
/*     */     }
/* 592 */     else if (Main.networkError) {
/* 593 */       String networkErrorMessage = "Could not retrieve update information";
/* 594 */       Fonts.MainFontRenderer.drawStringWithShadow(networkErrorMessage, (sr.getScaledWidth() - Fonts.MainFontRenderer.getStringWidth(networkErrorMessage) - 2), 18.0D, 16777215);
/*     */     } 
/*     */     
/* 597 */     GlStateManager.pushMatrix();
/* 598 */     Renderutils.drawSineWave(0.0D, 40.0D, 20.0D, sr.getScaledWidth(), 0.08D, 4.0D, 5.0F, this.ticker);
/* 599 */     GlStateManager.popMatrix();
/*     */     
/* 601 */     super.drawScreen(mouseX, mouseY, partialTicks);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
/* 609 */     super.mouseClicked(mouseX, mouseY, mouseButton);
/*     */     
/* 611 */     synchronized (this.threadLock) {
/*     */       
/* 613 */       if (this.openGLWarning1.length() > 0 && mouseX >= this.field_92022_t && mouseX <= this.field_92020_v && mouseY >= this.field_92021_u && mouseY <= this.field_92019_w) {
/*     */         
/* 615 */         GuiConfirmOpenLink guiconfirmopenlink = new GuiConfirmOpenLink(this, this.openGLWarningLink, 13, true);
/* 616 */         guiconfirmopenlink.disableSecurityWarning();
/* 617 */         this.mc.displayGuiScreen((GuiScreen)guiconfirmopenlink);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Mainmenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */