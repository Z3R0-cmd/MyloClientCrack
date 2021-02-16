/*    */ package com.darkmagician6.eventapi.events.callables;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ import com.darkmagician6.eventapi.events.Typed;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class EventTyped
/*    */   implements Event, Typed
/*    */ {
/*    */   private final byte type;
/*    */   
/*    */   protected EventTyped(byte eventType) {
/* 23 */     this.type = eventType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte getType() {
/* 31 */     return this.type;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/darkmagician6/eventapi/events/callables/EventTyped.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */