/*    */ package com.mylo.base.ui.Tabgui.Items;
/*    */ 
/*    */ import com.mylo.base.ui.Tabgui.Item;
/*    */ import de.Hero.settings.Setting;
/*    */ 
/*    */ public class SettingItem
/*    */   extends Item
/*    */ {
/*    */   public Setting s;
/*    */   
/*    */   public SettingItem(int x, int height, int width, Setting s) {
/* 12 */     super(x, height, width, s.getName());
/* 13 */     this.s = s;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Items/SettingItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */