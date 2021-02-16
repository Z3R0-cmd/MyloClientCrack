/*    */ package com.mylo.base.module.impl.Visuals;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ 
/*    */ 
/*    */ public class Fullbright
/*    */   extends Module
/*    */ {
/*    */   public Fullbright() {
/* 13 */     super("Fullbright", "see in the dark", 0, Category.Visuals);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 18 */     this.mc.gameSettings.gammaSetting = 100.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onDisable() {
/* 23 */     super.onDisable();
/* 24 */     this.mc.gameSettings.gammaSetting = 1.0F;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/Fullbright.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */