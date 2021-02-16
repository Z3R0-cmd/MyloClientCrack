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
/*    */ import net.minecraft.client.gui.Gui;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ public class Slider
/*    */   extends SettingItem
/*    */ {
/*    */   double smoothValue;
/*    */   
/*    */   public Slider(Setting s, int x, int y, int width, BigPanel parent) {
/* 22 */     super(s, x, y, width, parent);
/* 23 */     this.height = 45;
/*    */     
/* 25 */     int left = parent.x + this.x + 10;
/* 26 */     int right = parent.x + this.x + this.width - 10;
/*    */     
/* 28 */     double diff = (right - left);
/* 29 */     double setDiff = s.getMax() - s.getMin();
/* 30 */     double setPercentage = (s.getValDouble() - s.getMin()) / setDiff;
/*    */     
/* 32 */     int indicatorX = (int)(diff * setPercentage);
/* 33 */     this.smoothValue = indicatorX;
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(double scroll, int mouseX, int mouseY) {
/* 38 */     super.draw(scroll, mouseX, mouseY);
/*    */     
/* 40 */     Minecraft mc = Minecraft.getMinecraft();
/* 41 */     ScaledResolution sr = new ScaledResolution(mc);
/* 42 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 43 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*    */     
/* 45 */     int y = (int)((this.parent.y + this.y + 15) + scroll);
/* 46 */     int left = this.parent.x + this.x + 10;
/* 47 */     int right = this.parent.x + this.x + this.width - 10;
/*    */     
/* 49 */     double diff = (right - left);
/* 50 */     double setDiff = this.s.getMax() - this.s.getMin();
/* 51 */     double setPercentage = (this.s.getValDouble() - this.s.getMin()) / setDiff;
/*    */     
/* 53 */     int indicatorX = (int)(diff * setPercentage);
/*    */     
/* 55 */     this.smoothValue = MathUtil.interPolate(this.smoothValue, indicatorX, 0.05D);
/*    */     
/* 57 */     double value = this.s.onlyInt() ? (int)this.s.getValDouble() : ((int)(this.s.getValDouble() * 100.0D) / 100.0D);
/*    */     
/* 59 */     if (Mouse.isButtonDown(0) && 
/* 60 */       mouseY > y - 5 && mouseY < y + 5 && 
/* 61 */       mouseX > left - 5 && mouseX < right + 5) {
/* 62 */       double relMouseX = (mouseX - left);
/*    */       
/* 64 */       double percentageClick = relMouseX / diff;
/*    */       
/* 66 */       double settingSetVal = this.s.getMin() + setDiff * percentageClick;
/*    */       
/* 68 */       settingSetVal = this.s.onlyInt() ? (int)settingSetVal : ((int)(settingSetVal * 100.0D) / 100.0D);
/* 69 */       settingSetVal = MathHelper.clamp_double(settingSetVal, this.s.getMin(), this.s.getMax());
/*    */       
/* 71 */       this.s.setValDouble(settingSetVal);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 76 */     fr.drawStringWithShadow(String.valueOf(this.s.getName()) + ": " + value, (this.parent.x + this.x + this.width / 2 - fr.getStringWidth(String.valueOf(this.s.getName()) + ": " + value) / 2), (y - 12), 16777215);
/*    */     
/* 78 */     Gui.drawRect(left, y - 1, right, y + 1, -2818048);
/*    */     
/* 80 */     Renderutils.drawFullCircle((int)this.smoothValue + left, y, 3.0D, -2818048);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/settingItems/Slider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */