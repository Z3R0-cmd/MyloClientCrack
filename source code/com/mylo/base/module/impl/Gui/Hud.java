/*    */ package com.mylo.base.module.impl.Gui;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventKeyPress;
/*    */ import com.mylo.base.events.EventRenderGui;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.ui.uirenderer;
/*    */ import de.Hero.settings.Setting;
/*    */ 
/*    */ public class Hud
/*    */   extends Module
/*    */ {
/*    */   public Hud() {
/* 18 */     super("Hud", "the in game ui", 0, Category.Gui);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 23 */     super.setup();
/* 24 */     Main.setmgr.rSetting(new Setting("special component", this, "info", Lists.newArrayList((Object[])new String[] { "info", "tabgui" })));
/* 25 */     Main.setmgr.rSetting(new Setting("hud color", this, "Rainbow", Lists.newArrayList((Object[])new String[] { "Rainbow", "Light rainbow", "White", "Green", "Blue", "Pink", "Custom", "Custom Pulse", "Astolfo" })));
/* 26 */     Main.setmgr.rSetting(new Setting("blocks", this, 0.0D, 0.0D, 10.0D, true));
/* 27 */     Main.setmgr.rSetting(new Setting("Background transparency", this, 0.2D, 0.0D, 1.0D, false));
/* 28 */     Main.setmgr.rSetting(new Setting("Custom color", this, 0.0D, 0.0D, 1.0D, false));
/* 29 */     Main.setmgr.rSetting(new Setting("start arraylist from bottom", this, false));
/* 30 */     Main.setmgr.rSetting(new Setting("module toggle sounds", this, false));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onRender2d(EventRenderGui e) {
/* 35 */     if (!e.isDebuginfo()) {
/* 36 */       uirenderer.render();
/*    */     }
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onKeyPressed(EventKeyPress e) {
/* 42 */     if (Main.setmgr.getSettingByName("special component").getValString().equalsIgnoreCase("tabgui")) {
/* 43 */       Main.tabgui.onKey(e.getKey());
/*    */     }
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 49 */     if (Main.setmgr.getSettingByName("special component").getValString().equalsIgnoreCase("tabgui") && e.isPre())
/* 50 */       Main.tabgui.onUpdate(); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Gui/Hud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */