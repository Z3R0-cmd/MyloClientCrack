/*    */ package com.mylo.base.ui.tabbedClickGui.settingItems;
/*    */ 
/*    */ import com.mylo.base.ui.tabbedClickGui.BigPanel;
/*    */ import com.mylo.base.ui.tabbedClickGui.SettingItem;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ 
/*    */ public class ComboBox
/*    */   extends SettingItem {
/* 14 */   ArrayList<ComboItem> items = new ArrayList<>();
/*    */   
/*    */   public ComboBox(Setting s, int x, int y, int width, BigPanel parent) {
/* 17 */     super(s, x, y, width, parent);
/* 18 */     int height = 20;
/* 19 */     for (String mode : s.getOptions()) {
/* 20 */       ComboItem item = new ComboItem(s, x, y + height, width, parent, mode);
/* 21 */       this.items.add(item);
/* 22 */       height += item.height;
/*    */     } 
/* 24 */     height += 20;
/* 25 */     this.height = height;
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(double scroll, int mouseX, int mouseY) {
/* 30 */     super.draw(scroll, mouseX, mouseY);
/*    */     
/* 32 */     Minecraft mc = Minecraft.getMinecraft();
/* 33 */     ScaledResolution sr = new ScaledResolution(mc);
/* 34 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 35 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*    */     
/* 37 */     int left = this.parent.x + this.x + this.width - 20;
/* 38 */     int right = this.parent.x + this.x + this.width - 10;
/* 39 */     int top = (int)((this.parent.y + this.y + 5) + scroll);
/* 40 */     int bottom = (int)((this.parent.y + this.y + this.height - 5) + scroll);
/*    */     
/* 42 */     fr.drawStringWithShadow(this.s.getName(), (this.parent.x + this.x + this.width / 2 - fr.getStringWidth(this.s.getName()) / 2), (this.parent.y + this.y + 5) + scroll, 16777215);
/*    */     
/* 44 */     for (ComboItem item : this.items) {
/* 45 */       item.draw(scroll, mouseX, mouseY);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void MouseClicked(int mouseX, int mouseY, double scroll) {
/* 51 */     super.MouseClicked(mouseX, mouseY, scroll);
/* 52 */     for (ComboItem item : this.items)
/* 53 */       item.MouseClicked(mouseX, mouseY, scroll); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/settingItems/ComboBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */