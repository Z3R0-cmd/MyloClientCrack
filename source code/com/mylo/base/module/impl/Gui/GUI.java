/*    */ package com.mylo.base.module.impl.Gui;
/*    */ 
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.clickgui.Clickgui;
/*    */ import com.mylo.base.lmaogui.Lmaogui;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GUI
/*    */   extends Module
/*    */ {
/*    */   public GUI() {
/* 21 */     super("ClickGUI", "the clickgui", 54, Category.Gui);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 26 */     super.setup();
/* 27 */     Main.setmgr.rSetting(new Setting(this.name, this, "discord", Lists.newArrayList((Object[])new String[] { "discord", "panes", "new" })));
/*    */   }
/*    */ 
/*    */   
/*    */   public void onEnable() {
/*    */     String str;
/* 33 */     switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case 108960: if (!str.equals("new")) {
/*    */           break;
/*    */         }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 41 */         this.mc.displayGuiScreen((GuiScreen)Main.Clickgui); break;
/*    */       case 106433035: if (!str.equals("panes"))
/*    */           break;  this.mc.displayGuiScreen((GuiScreen)new Lmaogui()); break;
/*    */       case 1671380268: if (!str.equals("discord"))
/* 45 */           break;  this.mc.displayGuiScreen((GuiScreen)new Clickgui()); break; }  toggle();
/* 46 */     super.onEnable();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Gui/GUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */