/*     */ package com.mylo.base.ui;
/*     */ 
/*     */ import com.mylo.base.ui.components.GuiPasswordField;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.altutils;
/*     */ import com.mylo.base.utils.font.FontRenderer;
/*     */ import com.mylo.base.utils.saveutil;
/*     */ import com.thealtening.auth.service.AlteningServiceType;
/*     */ import java.io.IOException;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.GuiButton;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.GuiTextField;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ public class GuiAltManager
/*     */   extends GuiScreen
/*     */ {
/*     */   GuiScreen parentScreen;
/*     */   GuiTextField usernameBox;
/*     */   GuiPasswordField passwordBox;
/*     */   GuiPasswordField alteningBox;
/*  25 */   final FontRenderer fr = Fonts.MainFontRenderer;
/*     */   
/*     */   public GuiAltManager(GuiScreen parentScreen) {
/*  28 */     this.parentScreen = parentScreen;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initGui() {
/*  33 */     this.parentScreen.setWorldAndResolution(this.mc, this.width, this.height);
/*     */     
/*  35 */     Keyboard.enableRepeatEvents(true);
/*  36 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*  37 */     this.usernameBox = new GuiTextField(0, this.mc.fontRendererObj, sr.getScaledWidth() / 2 - 100, 10, 200, 20);
/*  38 */     this.usernameBox.setMaxStringLength(100);
/*  39 */     this.passwordBox = new GuiPasswordField(1, this.mc.fontRendererObj, sr.getScaledWidth() / 2 - 100, 40, 200, 20);
/*  40 */     this.passwordBox.setMaxStringLength(100);
/*     */     
/*  42 */     this.alteningBox = new GuiPasswordField(4, this.fontRendererObj, sr.getScaledWidth() / 2 - 100, 100, 200, 20);
/*  43 */     this.alteningBox.setText(saveutil.getAlteningToken());
/*  44 */     this.alteningBox.setMaxStringLength(100);
/*     */     
/*  46 */     this.buttonList.add(new GuiButton(2, sr.getScaledWidth() / 2 - 100, 70, 98, 20, "Log in cracked"));
/*  47 */     this.buttonList.add(new GuiButton(3, sr.getScaledWidth() / 2 + 2, 70, 98, 20, "Log in premium"));
/*     */     
/*  49 */     this.buttonList.add(new GuiButton(5, sr.getScaledWidth() / 2 - 100, 130, 98, 20, "token login"));
/*  50 */     this.buttonList.add(new GuiButton(6, sr.getScaledWidth() / 2 + 2, 130, 98, 20, "generate login"));
/*     */     
/*  52 */     super.initGui();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onGuiClosed() {
/*  57 */     Keyboard.enableRepeatEvents(false);
/*  58 */     super.onGuiClosed();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void actionPerformed(GuiButton button) throws IOException {
/*  63 */     switch (button.id) {
/*     */       case 2:
/*  65 */         altutils.setUserOffline(this.usernameBox.getText());
/*     */         break;
/*     */       case 3:
/*  68 */         if (this.usernameBox.getText().contains(":")) {
/*  69 */           altutils.setUser(this.usernameBox.getText().split(":")[0], this.usernameBox.getText().split(":")[1], AlteningServiceType.MOJANG);
/*     */           break;
/*     */         } 
/*  72 */         altutils.setUser(this.usernameBox.getText(), this.passwordBox.getText(), AlteningServiceType.MOJANG);
/*     */         break;
/*     */       
/*     */       case 5:
/*     */         try {
/*  77 */           altutils.loginAltening(this.alteningBox.getText(), false);
/*     */         }
/*  79 */         catch (Exception e) {
/*  80 */           e.printStackTrace();
/*     */         } 
/*     */         break;
/*     */       case 6:
/*     */         try {
/*  85 */           saveutil.saveAlteningToken(this.alteningBox.getText());
/*  86 */           altutils.loginAltening(this.alteningBox.getText(), true);
/*     */         }
/*  88 */         catch (Exception e) {
/*  89 */           e.printStackTrace();
/*     */         } 
/*     */         break;
/*     */     } 
/*     */     
/*  94 */     super.actionPerformed(button);
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateScreen() {
/*  99 */     this.parentScreen.updateScreen();
/* 100 */     this.usernameBox.updateCursorCounter();
/* 101 */     this.passwordBox.updateCursorCounter();
/* 102 */     this.alteningBox.updateCursorCounter();
/* 103 */     super.updateScreen();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void keyTyped(char typedChar, int keyCode) throws IOException {
/* 108 */     if (keyCode == 1) {
/* 109 */       this.mc.displayGuiScreen(this.parentScreen);
/*     */     } else {
/*     */       
/* 112 */       super.keyTyped(typedChar, keyCode);
/* 113 */       this.usernameBox.textboxKeyTyped(typedChar, keyCode);
/* 114 */       this.passwordBox.textboxKeyTyped(typedChar, keyCode);
/* 115 */       this.alteningBox.textboxKeyTyped(typedChar, keyCode);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
/* 121 */     this.usernameBox.mouseClicked(mouseX, mouseY, mouseButton);
/* 122 */     this.passwordBox.mouseClicked(mouseX, mouseY, mouseButton);
/* 123 */     this.alteningBox.mouseClicked(mouseX, mouseY, mouseButton);
/* 124 */     super.mouseClicked(mouseX, mouseY, mouseButton);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/* 130 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*     */     
/* 132 */     this.parentScreen.drawScreen(0, 0, partialTicks);
/*     */     
/* 134 */     Gui.drawRect(0, 0, sr.getScaledWidth(), sr.getScaledHeight(), -1442840576);
/*     */     
/* 136 */     this.usernameBox.drawTextBox();
/* 137 */     this.passwordBox.drawTextBox();
/* 138 */     this.alteningBox.drawTextBox();
/*     */     
/* 140 */     this.fr.drawCenteredStringWithShadow("Logged in as " + this.mc.getSession().getUsername(), (sr.getScaledWidth() / 2), 2.0F, 16777215);
/* 141 */     String s = "Username";
/* 142 */     this.fr.drawStringWithShadow(s, (sr.getScaledWidth() / 2 - 105 - this.fr.getStringWidth(s)), 15.0D, 16777215);
/* 143 */     s = "Password";
/* 144 */     this.fr.drawStringWithShadow(s, (sr.getScaledWidth() / 2 - 105 - this.fr.getStringWidth(s)), 45.0D, 16777215);
/* 145 */     s = "Altening key/token";
/* 146 */     this.fr.drawStringWithShadow(s, (sr.getScaledWidth() / 2 - 105 - this.fr.getStringWidth(s)), 105.0D, 16777215);
/*     */     
/* 148 */     super.drawScreen(mouseX, mouseY, partialTicks);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/GuiAltManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */