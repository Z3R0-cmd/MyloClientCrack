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
/*    */ public class ComboItem
/*    */   extends SettingItem
/*    */ {
/*    */   double openAmount;
/*    */   String option;
/*    */   
/*    */   public ComboItem(Setting s, int x, int y, int width, BigPanel parent, String option) {
/* 21 */     super(s, x, y, width, parent);
/* 22 */     this.option = option;
/* 23 */     this.height = 20;
/* 24 */     this.openAmount = (s.getValString().equals(option) ? 4 : false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(double scroll, int mouseX, int mouseY) {
/* 29 */     Minecraft mc = Minecraft.getMinecraft();
/* 30 */     ScaledResolution sr = new ScaledResolution(mc);
/* 31 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 32 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*    */     
/* 34 */     int left = this.parent.x + this.x + this.width - 20;
/* 35 */     int right = this.parent.x + this.x + this.width - 10;
/* 36 */     int top = (int)((this.parent.y + this.y + 5) + scroll);
/* 37 */     int bottom = (int)((this.parent.y + this.y + this.height - 5) + scroll);
/*    */     
/* 39 */     int centerH = this.parent.x + this.x + this.width - 15;
/* 40 */     int centerV = (int)((this.parent.y + this.y + 10) + scroll);
/*    */     
/* 42 */     int targetOpen = this.s.getValString().equals(this.option) ? 4 : 0;
/* 43 */     this.openAmount = MathUtil.interPolate(this.openAmount, targetOpen, 0.05D);
/* 44 */     if (this.openAmount < 1.0D && targetOpen == 0) {
/* 45 */       this.openAmount = 0.0D;
/*    */     }
/*    */     
/* 48 */     fr.drawStringWithShadow(this.option, (this.parent.x + this.x + 10), (this.parent.y + this.y + 6) + scroll, 16777215);
/*    */ 
/*    */     
/* 51 */     Renderutils.drawCircle(centerH, centerV, 7.0F, 50, -2818048);
/*    */ 
/*    */     
/* 54 */     Renderutils.drawFullCircle(centerH, centerV, this.openAmount, -2818048);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isHovered(int mouseX, int mouseY, double scroll) {
/* 59 */     int left = this.parent.x + this.x + this.width - 20;
/* 60 */     int right = this.parent.x + this.x + this.width - 10;
/* 61 */     int top = (int)((this.parent.y + this.y + 5) + scroll);
/* 62 */     int bottom = (int)((this.parent.y + this.y + this.height - 5) + scroll);
/* 63 */     int centerH = this.parent.x + this.x + this.width - 15;
/* 64 */     int centerV = (int)((this.parent.y + this.y + 10) + scroll);
/* 65 */     return (Renderutils.getDistance2d(centerH, centerV, mouseX, mouseY) < 7.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void MouseClicked(int mouseX, int mouseY, double scroll) {
/* 70 */     if (isHovered(mouseX, mouseY, scroll))
/* 71 */       this.s.setValString(this.option); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/settingItems/ComboItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */