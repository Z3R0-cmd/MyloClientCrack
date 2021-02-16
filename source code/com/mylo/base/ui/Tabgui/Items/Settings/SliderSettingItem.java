/*    */ package com.mylo.base.ui.Tabgui.Items.Settings;
/*    */ 
/*    */ import com.mylo.base.ui.Tabgui.Items.SettingItem;
/*    */ import de.Hero.settings.Setting;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SliderSettingItem
/*    */   extends SettingItem
/*    */ {
/*    */   public SliderSettingItem(int x, int height, int width, Setting s) {
/* 12 */     super(x, height, width, s);
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(int offset) {
/* 17 */     this.text = String.valueOf(this.s.getName()) + ": " + (Math.round(this.s.getValDouble() * 100.0D) / 100.0D);
/* 18 */     super.draw(offset);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onKeyPress(int keyCode) {
/* 23 */     super.onKeyPress(keyCode);
/*    */     
/* 25 */     if (this.opened)
/* 26 */       switch (keyCode) {
/*    */         case 28:
/* 28 */           this.opened = false;
/*    */           break;
/*    */         
/*    */         case 200:
/* 32 */           if (this.s.onlyInt()) {
/* 33 */             this.s.setValDouble((int)this.s.getValDouble() + Math.max(1.0D, (this.s.getMax() - this.s.getMin()) / 30.0D));
/*    */           } else {
/* 35 */             this.s.setValDouble(this.s.getValDouble() + Math.max(0.01D, (this.s.getMax() - this.s.getMin()) / 30.0D));
/*    */           } 
/*    */           
/* 38 */           if (this.s.getValDouble() > this.s.getMax())
/* 39 */             this.s.setValDouble(this.s.getMax()); 
/*    */           break;
/*    */         case 208:
/* 42 */           if (this.s.onlyInt()) {
/* 43 */             this.s.setValDouble((int)this.s.getValDouble() - Math.max(1.0D, (this.s.getMax() - this.s.getMin()) / 30.0D));
/*    */           } else {
/* 45 */             this.s.setValDouble(this.s.getValDouble() - Math.max(0.01D, (this.s.getMax() - this.s.getMin()) / 30.0D));
/*    */           } 
/* 47 */           if (this.s.getValDouble() < this.s.getMin())
/* 48 */             this.s.setValDouble(this.s.getMin()); 
/*    */           break;
/*    */       }  
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Items/Settings/SliderSettingItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */