/*    */ package com.mylo.base.lmaogui.Component.Components;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.lmaogui.Component.Component;
/*    */ import com.mylo.base.lmaogui.Panel;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ 
/*    */ 
/*    */ public class ModuleButton
/*    */   extends Component
/*    */ {
/*    */   public Module mod;
/*    */   public boolean extended;
/*    */   
/*    */   public ModuleButton(Panel parent, Module mod) {
/* 19 */     super(parent);
/* 20 */     this.mod = mod;
/*    */   }
/*    */ 
/*    */   
/*    */   public void click(int relativex, int relativey, int button) {
/* 25 */     super.click(relativex, relativey, button);
/* 26 */     if (button == 0) {
/* 27 */       this.mod.toggle();
/*    */     }
/* 29 */     if (button == 1) {
/* 30 */       this.extended = !this.extended;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void draw() {
/* 37 */     super.draw();
/* 38 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 39 */     Gui.drawRect(1, this.parent.height + this.height * this.index + 1, this.parent.width - 1, this.parent.height + this.height + this.height * this.index - 1, 1426063360);
/* 40 */     Gui.drawRect(1, this.parent.height + this.height * this.index + 1, this.parent.width - 3, this.parent.height + this.height + this.height * this.index - 3, this.mod.getState() ? -4340793 : -6969946);
/* 41 */     fr.drawCenteredString(this.mod.name, (this.parent.width / 2), (this.parent.height + this.height / 2 + this.height * this.index - 3), 16777215);
/* 42 */     if (Main.setmgr.getSettingsByMod(this.mod) != null) {
/* 43 */       String s = this.extended ? "-" : "+";
/* 44 */       fr.drawString(s, (this.parent.width - fr.getStringWidth(s) - 5), (this.parent.height + this.height / 2 + this.height * this.index - 3), 16777215);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/lmaogui/Component/Components/ModuleButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */