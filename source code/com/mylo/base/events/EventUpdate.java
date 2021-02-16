/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventUpdate
/*    */   implements Event {
/*    */   public EventUpdate(boolean pre) {
/*  8 */     this.pre = pre;
/*    */   }
/*    */   boolean pre;
/*    */   public boolean isPre() {
/* 12 */     return this.pre;
/*    */   }
/*    */   public boolean isPost() {
/* 15 */     return !this.pre;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventUpdate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */