/*    */ package com.mylo.base.module.impl.Movement;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Moveutils;
/*    */ import de.Hero.settings.Setting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Sprint
/*    */   extends Module
/*    */ {
/*    */   public Sprint() {
/* 21 */     super("Sprint", "makes you sprint", 0, Category.Movement);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 26 */     super.setup();
/* 27 */     Main.setmgr.rSetting(new Setting("omni", this, false));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 32 */     boolean omni = Main.setmgr.getSettingByName("omni").getValBoolean();
/* 33 */     if ((Moveutils.moveKeysDown() && omni) || this.mc.thePlayer.moveForward > 0.0F)
/* 34 */       this.mc.thePlayer.setSprinting(true); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Sprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */