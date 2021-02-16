/*    */ package com.mylo.base.events;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ 
/*    */ public class EventMove implements Event {
/*    */   public double x;
/*    */   public double y;
/*    */   
/*    */   public EventMove(double x, double y, double z, boolean ispre) {
/*  9 */     this.x = x;
/* 10 */     this.y = y;
/* 11 */     this.z = z;
/* 12 */     this.pre = ispre;
/*    */   }
/*    */   public double z; public boolean pre; public boolean cancelled;
/*    */   public boolean isPre() {
/* 16 */     return this.pre;
/*    */   }
/*    */   
/*    */   public double getX() {
/* 20 */     return this.x;
/*    */   }
/*    */   public double getY() {
/* 23 */     return this.y;
/*    */   }
/*    */   public double getZ() {
/* 26 */     return this.z;
/*    */   }
/*    */   public void setCancelled(boolean cancelled) {
/* 29 */     this.cancelled = cancelled;
/*    */   }
/*    */   public boolean isCancelled() {
/* 32 */     return this.cancelled;
/*    */   }
/*    */   public void setX(double x) {
/* 35 */     this.x = x;
/*    */   }
/*    */   public void setY(double y) {
/* 38 */     this.y = y;
/*    */   }
/*    */   public void setZ(double z) {
/* 41 */     this.z = z;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventMove.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */