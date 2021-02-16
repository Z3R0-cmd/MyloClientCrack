/*    */ package com.mylo.base.module.impl.Visuals;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ 
/*    */ 
/*    */ public class LSD
/*    */   extends Module
/*    */ {
/*    */   public LSD() {
/* 13 */     super("Lsd", "your mind on drugs", 0, Category.Visuals);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 18 */     e.isPre();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/LSD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */