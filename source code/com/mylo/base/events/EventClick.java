/*   */ package com.mylo.base.events;
/*   */ 
/*   */ import com.darkmagician6.eventapi.events.Event;
/*   */ 
/*   */ public class EventClick
/*   */   implements Event {
/*   */   public EventClick(int mouseButton) {
/* 8 */     this.mouseButton = mouseButton;
/*   */   }
/*   */   
/*   */   public int mouseButton;
/*   */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventClick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */