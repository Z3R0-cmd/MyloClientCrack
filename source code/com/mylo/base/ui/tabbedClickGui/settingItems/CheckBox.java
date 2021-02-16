/*    */ package com.mylo.base.ui.tabbedClickGui.settingItems;
/*    */ 
/*    */ import com.mylo.base.ui.tabbedClickGui.BigPanel;
/*    */ import com.mylo.base.ui.tabbedClickGui.SettingItem;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.MathUtil;
/*    */ import com.mylo.base.utils.Renderutils;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ 
/*    */ 
/*    */ public class CheckBox
/*    */   extends SettingItem
/*    */ {
/*    */   double openAmount;
/*    */   
/*    */   public CheckBox(Setting s, int x, int y, int width, BigPanel parent) {
/* 20 */     super(s, x, y, width, parent);
/* 21 */     this.height = 40;
/* 22 */     this.openAmount = (s.getValBoolean() ? 5 : false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(double scroll, int mouseX, int mouseY) {
/* 27 */     Minecraft mc = Minecraft.getMinecraft();
/* 28 */     ScaledResolution sr = new ScaledResolution(mc);
/* 29 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 30 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*    */     
/* 32 */     int left = this.parent.x + this.x + this.width - 20;
/* 33 */     int right = this.parent.x + this.x + this.width - 10;
/* 34 */     int top = (int)((this.parent.y + this.y + 5) + scroll);
/* 35 */     int bottom = (int)((this.parent.y + this.y + 15) + scroll);
/*    */     
/* 37 */     int centerH = this.parent.x + this.x + this.width - 15;
/* 38 */     int centerV = (int)((this.parent.y + this.y + 10) + scroll);
/*    */     
/* 40 */     int targetOpen = this.s.getValBoolean() ? 5 : 0;
/* 41 */     this.openAmount = MathUtil.interPolate(this.openAmount, targetOpen, 0.05D);
/* 42 */     if (this.openAmount < 1.0D && targetOpen == 0) {
/* 43 */       this.openAmount = 0.0D;
/*    */     }
/*    */     
/* 46 */     fr.drawStringWithShadow(this.s.getName(), (this.parent.x + this.x + 10), (this.parent.y + this.y + 8) + scroll, 16777215);
/*    */     
/* 48 */     Renderutils.drawOutlinedBox(left, top, right, bottom, 1, 0, -2818048);
/*    */     
/* 50 */     Renderutils.drawFullCircle(centerH, centerV, this.openAmount, -2818048);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isHovered(int mouseX, int mouseY, double scroll) {
/* 55 */     int left = this.parent.x + this.x + this.width - 20;
/* 56 */     int right = this.parent.x + this.x + this.width - 10;
/* 57 */     int top = (int)((this.parent.y + this.y + 5) + scroll);
/* 58 */     int bottom = (int)((this.parent.y + this.y + 15) + scroll);
/* 59 */     return (mouseX > left && mouseX < right && mouseY > top && mouseY < bottom);
/*    */   }
/*    */ 
/*    */   
/*    */   public void MouseClicked(int mouseX, int mouseY, double scroll) {
/* 64 */     if (isHovered(mouseX, mouseY, scroll))
/* 65 */       this.s.setValBoolean(!this.s.getValBoolean()); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/settingItems/CheckBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */