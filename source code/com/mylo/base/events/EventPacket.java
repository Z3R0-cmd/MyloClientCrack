/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Cancellable;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ import net.minecraft.network.Packet;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EventPacket
/*    */   implements Event, Cancellable
/*    */ {
/*    */   boolean cancelled;
/*    */   Packet p;
/*    */   boolean out;
/*    */   
/*    */   public boolean isCancelled() {
/* 17 */     return this.cancelled;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCancelled(boolean state) {
/* 22 */     this.cancelled = state;
/*    */   }
/*    */   public EventPacket(Packet p, boolean out) {
/* 25 */     this.p = p;
/* 26 */     this.out = out;
/*    */   }
/*    */   
/*    */   public boolean isOut() {
/* 30 */     return this.out;
/*    */   }
/*    */   public boolean isIn() {
/* 33 */     return !this.out;
/*    */   }
/*    */   
/*    */   public void setPacket(Packet p) {
/* 37 */     this.p = p;
/*    */   }
/*    */   
/*    */   public Packet getPacket() {
/* 41 */     return this.p;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventPacket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */