/*    */ package com.mylo.base.ui.Tabgui.Items.Settings;
/*    */ 
/*    */ import com.mylo.base.ui.Tabgui.Items.SettingItem;
/*    */ import de.Hero.settings.Setting;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BooleanSettingItem
/*    */   extends SettingItem
/*    */ {
/*    */   public BooleanSettingItem(int x, int height, int width, Setting s) {
/* 12 */     super(x, height, width, s);
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(int offset) {
/* 17 */     this.textcolor = this.s.getValBoolean() ? 16777215 : 12303291;
/* 18 */     if (this.opened) {
/* 19 */       this.opened = false;
/*    */     }
/* 21 */     super.draw(offset);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onKeyPress(int keyCode) {
/* 26 */     super.onKeyPress(keyCode);
/* 27 */     switch (keyCode) {
/*    */       case 28:
/* 29 */         this.s.setValBoolean(!this.s.getValBoolean());
/*    */         break;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Items/Settings/BooleanSettingItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */