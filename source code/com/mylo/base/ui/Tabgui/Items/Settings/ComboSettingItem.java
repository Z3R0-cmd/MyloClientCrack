/*    */ package com.mylo.base.ui.Tabgui.Items.Settings;
/*    */ 
/*    */ import com.mylo.base.ui.Tabgui.Items.SettingItem;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ComboSettingItem
/*    */   extends SettingItem
/*    */ {
/*    */   ArrayList<ComboSettingOptionItem> items;
/*    */   
/*    */   public ComboSettingItem(int x, int height, int width, Setting s) {
/* 20 */     super(x, height, width, s);
/*    */     
/* 22 */     int longest = 0;
/* 23 */     for (String string : s.getOptions()) {
/* 24 */       int lenght = Fonts.MainFontRenderer.getStringWidth(string);
/* 25 */       if (lenght > longest) {
/* 26 */         longest = lenght;
/*    */       }
/*    */     } 
/* 29 */     this.items = new ArrayList<>();
/* 30 */     for (String string : s.getOptions()) {
/* 31 */       this.items.add(new ComboSettingOptionItem(x + width + 2, height, longest + 10, string));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUpdate() {
/* 37 */     super.onUpdate();
/* 38 */     if (this.opened) {
/* 39 */       for (ComboSettingOptionItem item : this.items) {
/* 40 */         item.onUpdate();
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(int offset) {
/* 47 */     super.draw(offset);
/* 48 */     int i = 0;
/* 49 */     if (this.opened) {
/* 50 */       for (ComboSettingOptionItem item : this.items) {
/* 51 */         item.draw(offset + i * this.height);
/* 52 */         boolean flag = this.s.getValString().equalsIgnoreCase(item.text);
/* 53 */         item.selected = flag;
/* 54 */         if (flag) {
/* 55 */           this.selectedindex = i;
/*    */         }
/* 57 */         i++;
/*    */       } 
/*    */     }
/* 60 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 61 */     String info = this.opened ? "-" : "+";
/* 62 */     int left = fr.getStringWidth(info) + (this.opened ? 4 : 2);
/* 63 */     fr.drawStringWithShadow(info, (this.x + this.width - left), (offset + this.height / 2 - fr.getHeight() / 2), this.textcolor);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onKeyPress(int keyCode) {
/* 68 */     super.onKeyPress(keyCode);
/*    */     
/* 70 */     if (this.opened && !((ComboSettingOptionItem)this.items.get(this.selectedindex)).opened) {
/* 71 */       switch (keyCode) {
/*    */         case 28:
/* 73 */           if (this.opened) {
/* 74 */             this.opened = false;
/*    */           }
/*    */           break;
/*    */ 
/*    */         
/*    */         case 200:
/* 80 */           if (--this.selectedindex < 0) {
/* 81 */             this.selectedindex = this.s.getOptions().size() - 1;
/*    */           }
/* 83 */           this.s.setValString(this.s.getOptions().get(this.selectedindex));
/*    */           break;
/*    */         case 208:
/* 86 */           if (++this.selectedindex > this.s.getOptions().size() - 1) {
/* 87 */             this.selectedindex = 0;
/*    */           }
/* 89 */           this.s.setValString(this.s.getOptions().get(this.selectedindex));
/*    */           break;
/*    */       } 
/*    */       
/* 93 */       for (ComboSettingOptionItem item : this.items)
/* 94 */         item.selected = this.s.getValString().equalsIgnoreCase(item.text); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Items/Settings/ComboSettingItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */