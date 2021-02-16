/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Cancellable;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventSlowdown
/*    */   implements Event, Cancellable
/*    */ {
/*    */   boolean cancelled = false;
/*    */   boolean ispre;
/*    */   
/*    */   public boolean isCancelled() {
/* 13 */     return this.cancelled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelled(boolean state) {
/* 18 */     this.cancelled = state;
/*    */   }
/*    */   
/*    */   public boolean ispre() {
/* 22 */     return this.ispre;
/*    */   }
/*    */   
/*    */   public EventSlowdown(boolean ispre) {
/* 26 */     this.ispre = ispre;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventSlowdown.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */