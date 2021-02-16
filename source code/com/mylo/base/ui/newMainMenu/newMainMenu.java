/*     */ package com.mylo.base.ui.newMainMenu;
/*     */ 
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.ui.Mainmenu;
/*     */ import com.mylo.base.ui.Message;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.MathUtil;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.altutils;
/*     */ import java.io.IOException;
/*     */ import net.minecraft.client.gui.GuiButton;
/*     */ import net.minecraft.client.gui.GuiMultiplayer;
/*     */ import net.minecraft.client.gui.GuiOptions;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.GuiSelectWorld;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ 
/*     */ public class newMainMenu
/*     */   extends GuiScreen {
/*  22 */   private ResourceLocation cheems = new ResourceLocation("nigger/images/cheems.png");
/*     */   private boolean open = false;
/*  24 */   double openProgress = 0.0D;
/*  25 */   double maxOpenProgress = 300.0D;
/*     */   
/*  27 */   double secretTabOpenProgress = 0.0D;
/*  28 */   double secretTabMaxOpenProgress = 100.0D;
/*     */   
/*     */   GuiButton secretButton;
/*     */   
/*     */   GuiButton infoButton;
/*     */   
/*     */   public void initGui() {
/*  35 */     super.initGui();
/*  36 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*  37 */     this.buttonList.add(new CircleButton(0, sr.getScaledWidth() / 2 - 160, sr.getScaledHeight() / 2, 34, "Singleplayer"));
/*  38 */     this.buttonList.add(new CircleButton(1, sr.getScaledWidth() / 2 - 80, sr.getScaledHeight() / 2, 34, "Multiplayer"));
/*  39 */     this.buttonList.add(new CircleButton(2, sr.getScaledWidth() / 2, sr.getScaledHeight() / 2, 34, "Alt manager"));
/*  40 */     this.buttonList.add(new CircleButton(3, sr.getScaledWidth() / 2 + 80, sr.getScaledHeight() / 2, 34, "Options"));
/*  41 */     this.buttonList.add(new CircleButton(4, sr.getScaledWidth() / 2 + 160, sr.getScaledHeight() / 2, 34, "Quit"));
/*  42 */     this.secretButton = new CircleButton(5, 50, sr.getScaledHeight() - 50, 45, "secret menu wooooo");
/*  43 */     this.infoButton = new CircleButton(6, sr.getScaledWidth() - 50, 50, 45, "Message from Mylo");
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/*  48 */     GlStateManager.pushMatrix();
/*  49 */     GlStateManager.pushAttrib();
/*  50 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*  51 */     this.maxOpenProgress = Math.min(sr.getScaledWidth() / 2 - 20, 200);
/*  52 */     drawRect(0, 0, sr.getScaledWidth(), sr.getScaledHeight(), -14935012);
/*     */     
/*  54 */     double targetOpenProgress = this.open ? this.maxOpenProgress : -1.0D;
/*  55 */     this.openProgress = MathUtil.interPolate(this.openProgress, targetOpenProgress, 0.05D);
/*     */     
/*  57 */     if (this.openProgress > 0.0D) {
/*  58 */       Renderutils.drawOutlinedBox((int)((sr.getScaledWidth() / 2) - this.openProgress - 5.0D), sr.getScaledHeight() / 2 - 50, (int)((sr.getScaledWidth() / 2) + this.openProgress + 5.0D), sr.getScaledHeight() / 2 + 50, 2, -14935012, -8957438);
/*     */     }
/*     */     
/*  61 */     Fonts.MainFontRendererBig.drawCenteredStringWithShadow("Chonky boy is having a great time", (sr.getScaledWidth() / 2), (float)((sr.getScaledHeight() / 2 - 80) - this.openProgress), 16777215);
/*  62 */     GlStateManager.enableScissorBox(true);
/*  63 */     GlStateManager.prepareScissorBoxPos(sr, (float)((sr.getScaledWidth() / 2) - this.openProgress - 2.0D), 0.0F, (float)Math.max((sr.getScaledWidth() / 2) + this.openProgress, 0.0D), sr.getScaledHeight());
/*  64 */     drawRect(0, 0, sr.getScaledWidth(), sr.getScaledHeight() / 2 - 50, -14935012);
/*     */     
/*  66 */     Fonts.MainFontRendererBig.drawCenteredStringWithShadow("AAAAAA why did you kill cheems?!?!?!", (sr.getScaledWidth() / 2), (float)((sr.getScaledHeight() / 2 - 80) - this.maxOpenProgress + this.openProgress), 16777215);
/*  67 */     GlStateManager.enableScissorBox(false);
/*     */     
/*  69 */     Fonts.MainFontRendererBig.drawCenteredStringWithShadow("added hypixel disabler i hope, also please read the message", (sr.getScaledWidth() / 2), (float)((sr.getScaledHeight() - 15) + this.maxOpenProgress / 10.0D - this.openProgress / 10.0D), 16777215);
/*     */     
/*  71 */     GlStateManager.pushAttrib();
/*  72 */     GlStateManager.enableScissorBox(true);
/*  73 */     GlStateManager.prepareScissorBoxPos(sr, (float)((sr.getScaledWidth() / 2) - this.openProgress - 2.0D), (sr.getScaledHeight() / 2 - 50), (float)Math.max((sr.getScaledWidth() / 2) + this.openProgress, 0.0D), (sr.getScaledHeight() / 2 + 50));
/*  74 */     super.drawScreen(mouseX, mouseY, partialTicks);
/*  75 */     GlStateManager.enableScissorBox(false);
/*  76 */     this.mc.getTextureManager().bindTexture(this.cheems);
/*  77 */     GlStateManager.popAttrib();
/*     */     
/*  79 */     GlStateManager.enableBlend();
/*  80 */     drawScaledCustomSizeModalRect((int)((sr.getScaledWidth() / 2 - 50) - this.openProgress), sr.getScaledHeight() / 2 - 50, 0.0F, 0.0F, 50, 100, 50, 105, 100.0F, 100.0F);
/*  81 */     drawScaledCustomSizeModalRect((int)((sr.getScaledWidth() / 2) + this.openProgress), sr.getScaledHeight() / 2 - 50, 50.0F, 0.0F, 50, 100, 50, 105, 100.0F, 100.0F);
/*  82 */     GlStateManager.disableBlend();
/*     */     
/*  84 */     boolean hoveringOverSecretTab = (!this.open && mouseX < 100 && mouseY > sr.getScaledHeight() - 100);
/*  85 */     double targetSecretTabOpenProgress = hoveringOverSecretTab ? this.secretTabMaxOpenProgress : -2.0D;
/*  86 */     this.secretTabOpenProgress = MathUtil.interPolate(this.secretTabOpenProgress, targetSecretTabOpenProgress, 0.2D);
/*  87 */     drawRect(0, (int)(sr.getScaledHeight() - this.secretTabOpenProgress), 100, sr.getScaledHeight(), -16777216);
/*  88 */     GlStateManager.enableScissorBox(true);
/*  89 */     GlStateManager.prepareScissorBox(sr, 0.0F, (int)(sr.getScaledHeight() - this.secretTabOpenProgress), 100.0F, sr.getScaledHeight());
/*  90 */     this.secretButton.drawButton(this.mc, mouseX, mouseY);
/*  91 */     GlStateManager.enableScissorBox(false);
/*  92 */     this.infoButton.drawButton(this.mc, mouseX, mouseY);
/*  93 */     GlStateManager.popMatrix();
/*  94 */     GlStateManager.popAttrib();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void actionPerformed(GuiButton button) throws IOException {
/*  99 */     super.actionPerformed(button);
/* 100 */     switch (button.id) {
/*     */       case 0:
/* 102 */         this.mc.displayGuiScreen((GuiScreen)new GuiSelectWorld(this));
/*     */         break;
/*     */       case 1:
/* 105 */         this.mc.displayGuiScreen((GuiScreen)new GuiMultiplayer(this));
/*     */         break;
/*     */       case 2:
/* 108 */         altutils.showAltManager(this);
/*     */         break;
/*     */       case 3:
/* 111 */         this.mc.displayGuiScreen((GuiScreen)new GuiOptions(this, this.mc.gameSettings));
/*     */         break;
/*     */       case 4:
/* 114 */         this.mc.shutdown();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
/* 121 */     if (this.secretButton.isMouseOver()) {
/* 122 */       this.mc.displayGuiScreen((GuiScreen)new Mainmenu());
/*     */     }
/* 124 */     if (this.infoButton.isMouseOver()) {
/* 125 */       this.mc.displayGuiScreen((GuiScreen)new Message(this));
/*     */     }
/* 127 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 128 */     if (mouseX > (sr.getScaledWidth() / 2) - this.openProgress && mouseX < (sr.getScaledWidth() / 2) + this.openProgress) {
/* 129 */       super.mouseClicked(mouseX, mouseY, mouseButton);
/*     */     }
/* 131 */     if (((mouseX > (sr.getScaledWidth() / 2 - 50) - this.openProgress && mouseX < (sr.getScaledWidth() / 2) - this.openProgress) || (mouseX > (sr.getScaledWidth() / 2) + this.openProgress && mouseX < (sr.getScaledWidth() / 2 + 50) + this.openProgress)) && mouseY > sr.getScaledHeight() / 2 - 50 && mouseY < sr.getScaledHeight() / 2 + 50 && 
/* 132 */       mouseButton == 0) {
/* 133 */       if (Main.updateAvailable) {
/* 134 */         Main.update();
/*     */       } else {
/*     */         
/* 137 */         this.open = !this.open;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void keyTyped(char typedChar, int keyCode) throws IOException {
/* 145 */     if (keyCode == 19)
/* 146 */       this.mc.displayGuiScreen(new newMainMenu()); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/newMainMenu/newMainMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */