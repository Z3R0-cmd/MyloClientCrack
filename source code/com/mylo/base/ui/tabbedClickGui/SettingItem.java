/*    */ package com.mylo.base.ui.tabbedClickGui;
/*    */ 
/*    */ import com.mylo.base.ui.tabbedClickGui.settingItems.CheckBox;
/*    */ import com.mylo.base.ui.tabbedClickGui.settingItems.ComboBox;
/*    */ import com.mylo.base.ui.tabbedClickGui.settingItems.Slider;
/*    */ import de.Hero.settings.Setting;
/*    */ 
/*    */ public class SettingItem
/*    */ {
/*    */   protected Setting s;
/*    */   public int x;
/*    */   public int y;
/*    */   
/*    */   public SettingItem(Setting s, int x, int y, int width, BigPanel parent) {
/* 15 */     this.s = s;
/* 16 */     this.x = x;
/* 17 */     this.y = y;
/* 18 */     this.width = width;
/* 19 */     this.parent = parent;
/*    */   }
/*    */   public int height; public int width; protected BigPanel parent;
/*    */   public static SettingItem Create(Setting s, int x, int y, int width, BigPanel parent) {
/* 23 */     if (s.isCheck())
/* 24 */       return (SettingItem)new CheckBox(s, x, y, width, parent); 
/* 25 */     if (s.isSlider()) {
/* 26 */       return (SettingItem)new Slider(s, x, y, width, parent);
/*    */     }
/* 28 */     return (SettingItem)new ComboBox(s, x, y, width, parent);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isHovered(int mouseX, int mouseY, double scroll) {
/* 33 */     return false;
/*    */   }
/*    */   
/*    */   public void draw(double scroll, int mouseX, int mouseY) {}
/*    */   
/*    */   public void MouseClicked(int mouseX, int mouseY, double scroll) {}
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/SettingItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */