/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Cancellable;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventRenderNameTag implements Event, Cancellable {
/*    */   private boolean cancel;
/*    */   String text;
/*    */   
/*    */   public EventRenderNameTag(String text) {
/* 11 */     this.text = text;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isCancelled() {
/* 16 */     return this.cancel;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelled(boolean state) {
/* 21 */     this.cancel = state;
/*    */   }
/*    */   
/*    */   public String getText() {
/* 25 */     return this.text;
/*    */   }
/*    */   
/*    */   public void setText(String text) {
/* 29 */     this.text = text;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventRenderNameTag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */