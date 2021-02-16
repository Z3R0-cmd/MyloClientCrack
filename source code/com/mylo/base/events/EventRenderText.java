/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventRenderText
/*    */   implements Event {
/*    */   public EventRenderText(String text) {
/*  8 */     this.text = text;
/*    */   }
/*    */   String text;
/*    */   public String getText() {
/* 12 */     return this.text;
/*    */   }
/*    */   public void setText(String text) {
/* 15 */     this.text = text;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventRenderText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */