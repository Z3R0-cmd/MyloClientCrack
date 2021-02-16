/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventKeyPress
/*    */   implements Event {
/*    */   public EventKeyPress(int key) {
/*  8 */     this.key = key;
/*    */   } public int key;
/*    */   public int getKey() {
/* 11 */     return this.key;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventKeyPress.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */