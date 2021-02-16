/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventRenderGui
/*    */   implements Event {
/*    */   public EventRenderGui(boolean showdebug) {
/*  8 */     this.debuginfo = showdebug;
/*    */   } boolean debuginfo;
/*    */   public boolean isDebuginfo() {
/* 11 */     return this.debuginfo;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventRenderGui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */