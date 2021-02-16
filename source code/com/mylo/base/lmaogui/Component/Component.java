/*    */ package com.mylo.base.lmaogui.Component;
/*    */ 
/*    */ import com.mylo.base.lmaogui.Panel;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ 
/*    */ public class Component
/*    */ {
/*    */   public boolean visible;
/*    */   public int height;
/*    */   
/*    */   public Component(Panel parent) {
/* 12 */     this.height = 20;
/* 13 */     this.visible = false;
/* 14 */     this.parent = parent;
/*    */   }
/*    */   public int index; public Panel parent;
/*    */   public Component(Panel parent, int height) {
/* 18 */     this.height = height;
/* 19 */     this.visible = false;
/* 20 */     this.parent = parent;
/*    */   }
/*    */   
/*    */   public void draw() {
/* 24 */     int i = 0;
/* 25 */     for (Component c : this.parent.components) {
/* 26 */       if (c.visible) {
/* 27 */         if (c == this) {
/* 28 */           this.index = i;
/*    */           continue;
/*    */         } 
/* 31 */         i++;
/*    */       } 
/*    */     } 
/*    */     
/* 35 */     Gui.drawRect(0, this.parent.height + this.height * this.index, this.parent.width, this.parent.height + this.height + this.height * this.index, -8418163);
/*    */   }
/*    */   
/*    */   public void click(int relativex, int relativey, int button) {}
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/lmaogui/Component/Component.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */