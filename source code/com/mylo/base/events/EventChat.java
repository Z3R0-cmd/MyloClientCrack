/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Cancellable;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventChat
/*    */   implements Event, Cancellable {
/*    */   boolean cancelled;
/*    */   String text;
/*    */   
/*    */   public boolean isCancelled() {
/* 12 */     return this.cancelled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelled(boolean state) {
/* 17 */     this.cancelled = state;
/*    */   }
/*    */   
/*    */   public EventChat(String text) {
/* 21 */     this.text = text;
/*    */   }
/*    */   
/*    */   public String getText() {
/* 25 */     return this.text;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventChat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */