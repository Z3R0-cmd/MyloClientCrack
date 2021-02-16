/*    */ package com.mylo.base.ui.tabbedClickGui;
/*    */ 
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.Renderutils;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ 
/*    */ public class ModuleComponent {
/* 10 */   int colorMain = -12434878, colorTopBar = -14869219, colorText = -1, colorCategorySplitter = -1, colorCategorySplitterEdge = 1442840575, colorItem = -14606047;
/* 11 */   int x = 10; int y = 10; int height = 250; int width = 400;
/*    */   public Module m;
/*    */   public BigPanel parent;
/*    */   
/*    */   public ModuleComponent(int x, int y, int width, int height, Module m, BigPanel parent) {
/* 16 */     this.x = x;
/* 17 */     this.y = y;
/* 18 */     this.height = height;
/* 19 */     this.width = width;
/* 20 */     this.m = m;
/* 21 */     this.parent = parent;
/*    */   }
/*    */   
/*    */   public void Draw(double scroll, int number, int mouseX, int mouseY) {
/* 25 */     int offset = (int)((number * this.height) + scroll);
/* 26 */     int catY = this.parent.y + this.y + offset;
/* 27 */     boolean hovered = (mouseX > this.x + this.parent.x && mouseY > catY && mouseX < this.x + this.parent.x + this.width && mouseY < catY + this.height);
/*    */     
/* 29 */     FontRenderer fr = Fonts.MainFontRendererBig;
/* 30 */     String text = this.m.name;
/*    */     
/* 32 */     Gui.drawRect(this.x + this.parent.x, catY, this.x + this.parent.x + this.width, catY + this.height, this.colorItem);
/* 33 */     fr.drawStringWithShadow(text, (this.x + 5 + this.parent.x), (catY + this.height / 2 - fr.getHeight() / 2), this.m.getState() ? this.colorText : -5592406);
/* 34 */     if (this.parent.selectedMod == this.m) {
/* 35 */       Renderutils.drawOutlinedBox(this.x + 1 + this.parent.x, catY + 1, this.x + this.parent.x + this.width - 1, catY + this.height - 1, 1, 0, this.colorText);
/*    */     }
/* 37 */     if (hovered) {
/* 38 */       Renderutils.drawOutlinedBox(this.x + 1 + this.parent.x, catY + 1, this.x + this.parent.x + this.width - 1, catY + this.height - 1, 1, 0, -1140850689);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean isHovered(double scroll, int number, int mouseX, int mouseY) {
/* 43 */     int offset = (int)((number * this.height) + scroll);
/* 44 */     int catY = this.parent.y + this.y + offset;
/* 45 */     boolean hovered = (mouseX > this.x + this.parent.x && mouseY > catY && mouseX < this.x + this.parent.x + this.width && mouseY < catY + this.height);
/* 46 */     return hovered;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/ModuleComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */