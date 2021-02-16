/*    */ package com.mylo.base.lmaogui.Component.Components;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.lmaogui.Component.Component;
/*    */ import com.mylo.base.lmaogui.Panel;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ 
/*    */ public class SettingBoolean
/*    */   extends Component
/*    */ {
/*    */   public Setting s;
/*    */   
/*    */   public SettingBoolean(Panel parent, Setting s) {
/* 18 */     super(parent);
/* 19 */     this.visible = false;
/* 20 */     this.s = s;
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw() {
/* 25 */     super.draw();
/* 26 */     for (Component c : this.parent.components) {
/* 27 */       if (c instanceof ModuleButton) {
/* 28 */         ArrayList<Setting> settings = Main.setmgr.getSettingsByMod(((ModuleButton)c).mod);
/* 29 */         if (c.visible && settings != null && settings.contains(this.s)) {
/* 30 */           this.visible = true;
/*    */         }
/*    */       } 
/*    */     } 
/* 34 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 35 */     Gui.drawRect(1, this.parent.height + this.height * this.index + 1, this.parent.width - 1, this.parent.height + this.height + this.height * this.index - 1, 1426063360);
/* 36 */     Gui.drawRect(1, this.parent.height + this.height * this.index + 1, this.parent.width - 3, this.parent.height + this.height + this.height * this.index - 3, this.s.getValBoolean() ? -4340793 : -6969946);
/* 37 */     fr.drawCenteredString(this.s.getName(), (this.parent.width / 2), (this.parent.height + this.height / 2 + this.height * this.index - 3), 16777215);
/*    */   }
/*    */ 
/*    */   
/*    */   public void click(int relativex, int relativey, int button) {
/* 42 */     super.click(relativex, relativey, button);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/lmaogui/Component/Components/SettingBoolean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */