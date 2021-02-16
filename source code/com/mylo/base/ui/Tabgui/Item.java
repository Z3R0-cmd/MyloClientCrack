/*    */ package com.mylo.base.ui.Tabgui;
/*    */ 
/*    */ import com.mylo.base.utils.Colorutil;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Item
/*    */ {
/*    */   public boolean selected;
/*    */   public boolean opened;
/*    */   public int selectedindex;
/*    */   public int x;
/*    */   public int height;
/*    */   public int width;
/* 19 */   public int textcolor = 16777215; public double smoothX; public double targetX; public double lastX; public double swipeX; public double targetSwipeX; public double LastSwipeX; public String text;
/* 20 */   int color = 1711276032;
/* 21 */   int selectcolor = -16711936;
/*    */   
/*    */   public Item(int x, int height, int width, String text) {
/* 24 */     this.x = x;
/* 25 */     this.targetX = x;
/* 26 */     this.height = height;
/* 27 */     this.width = width;
/* 28 */     this.text = text;
/*    */   }
/*    */   
/*    */   public void draw(int offset) {
/* 32 */     this.selectcolor = Colorutil.getChosenColor(0);
/*    */     
/* 34 */     Gui.drawRect(this.x, offset, this.x + this.width, offset + this.height, this.color);
/* 35 */     this.targetX = ((this.selected && !this.opened) ? 7 : 2);
/* 36 */     if (this.selected || this.smoothX != this.targetX) {
/* 37 */       double swipeXOffset = (this.LastSwipeX - this.swipeX) * (Minecraft.getMinecraft()).timer.renderPartialTicks;
/* 38 */       Gui.drawRect(this.x, offset, this.x + (this.opened ? this.width : (-1 + Math.min(5, (int)this.smoothX))), offset + this.height, this.selectcolor);
/* 39 */       this.targetSwipeX = (this.opened ? this.width : (-1 + (int)this.smoothX));
/*    */     } 
/*    */     
/* 42 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 43 */     double xOffset = (this.smoothX - this.lastX) * (Minecraft.getMinecraft()).timer.renderPartialTicks;
/* 44 */     fr.drawStringWithShadow(this.text, this.x + this.lastX + xOffset, (offset + this.height / 2 - fr.getHeight() / 2), this.textcolor);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onKeyPress(int keyCode) {}
/*    */ 
/*    */   
/*    */   public void onUpdate() {
/* 52 */     this.lastX = this.smoothX;
/* 53 */     if (this.smoothX < this.targetX) {
/* 54 */       this.smoothX++;
/*    */     }
/* 56 */     if (this.smoothX > this.targetX)
/* 57 */       this.smoothX--; 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */