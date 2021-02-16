/*    */ package com.mylo.base.events;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventWorldRender implements Event {
/*    */   double x;
/*    */   
/*    */   public EventWorldRender(double x, double y, double z) {
/*  8 */     this.x = x;
/*  9 */     this.y = y;
/* 10 */     this.z = z;
/*    */   }
/*    */   double y; double z;
/*    */   public double getX() {
/* 14 */     return this.x;
/*    */   }
/*    */   
/*    */   public double getY() {
/* 18 */     return this.y;
/*    */   }
/*    */   
/*    */   public double getZ() {
/* 22 */     return this.z;
/*    */   }
/*    */   
/*    */   public void setX(double x) {
/* 26 */     this.x = x;
/*    */   }
/*    */   
/*    */   public void setY(double y) {
/* 30 */     this.y = y;
/*    */   }
/*    */   
/*    */   public void setZ(double z) {
/* 34 */     this.z = z;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventWorldRender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */