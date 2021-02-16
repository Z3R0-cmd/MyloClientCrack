/*    */ package com.mylo.base.ui.newMainMenu;
/*    */ 
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.MathUtil;
/*    */ import com.mylo.base.utils.Renderutils;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.GuiButton;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ 
/*    */ public class CircleButton extends GuiButton {
/*    */   int Radius;
/* 13 */   double hoverScale = 0.0D;
/* 14 */   double targetHoverScale = 0.0D;
/*    */   
/*    */   public CircleButton(int buttonId, int x, int y, String buttonText) {
/* 17 */     super(buttonId, x, y, buttonText);
/* 18 */     this.Radius = 90;
/*    */   }
/*    */   
/*    */   public CircleButton(int buttonId, int x, int y, int Radius, String buttonText) {
/* 22 */     super(buttonId, x, y, buttonText);
/* 23 */     this.Radius = Radius;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void drawButton(Minecraft mc, int mouseX, int mouseY) {
/* 29 */     this.hovered = (Renderutils.getDistance2d(this.xPosition, this.yPosition, mouseX, mouseY) <= this.Radius + this.hoverScale);
/* 30 */     this.targetHoverScale = this.hovered ? (this.Radius / 10.0D) : 0.0D;
/* 31 */     this.hoverScale = MathUtil.interPolate(this.hoverScale, this.targetHoverScale, 0.1D);
/* 32 */     Renderutils.drawFullCircle(this.xPosition, this.yPosition, this.Radius + this.hoverScale, -5994196);
/* 33 */     Renderutils.drawFullCircle(this.xPosition, this.yPosition, this.Radius + this.hoverScale - 2.0D, -14935012);
/* 34 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 35 */     GlStateManager.enableTexture2D();
/* 36 */     GlStateManager.enableBlend();
/* 37 */     GlStateManager.enableAlpha();
/* 38 */     GlStateManager.enableCull();
/* 39 */     fr.drawCenteredStringWithShadow(this.displayString, this.xPosition, (this.yPosition - fr.getHeight() / 2), 16777215);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isMouseOver() {
/* 45 */     return this.hovered;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean mousePressed(Minecraft mc, int mouseX, int mouseY) {
/* 50 */     return (this.visible && this.enabled && isMouseOver());
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/newMainMenu/CircleButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */