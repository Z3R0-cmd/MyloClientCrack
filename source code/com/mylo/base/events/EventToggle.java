/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Cancellable;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ import com.mylo.base.module.Module;
/*    */ 
/*    */ public class EventToggle
/*    */   implements Event, Cancellable {
/*    */   public Module mod;
/*    */   
/*    */   public EventToggle(Module mod, Boolean state) {
/* 12 */     this.mod = mod;
/* 13 */     this.state = state;
/*    */   }
/*    */   public Boolean state; public boolean cancelled = false;
/*    */   
/*    */   public boolean isCancelled() {
/* 18 */     return this.cancelled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelled(boolean state) {
/* 23 */     this.cancelled = state;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventToggle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */