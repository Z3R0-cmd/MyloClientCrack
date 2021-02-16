/*    */ package com.mylo.base.module.impl.Combat;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C02PacketUseEntity;
/*    */ import net.minecraft.network.play.client.C0BPacketEntityAction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SuperKnockback
/*    */   extends Module
/*    */ {
/*    */   public SuperKnockback() {
/* 18 */     super("Superknockback", "launch other players", 0, Category.Combat);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 23 */     if (e.getPacket() instanceof C02PacketUseEntity) {
/* 24 */       C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket();
/* 25 */       if (p.getAction() == C02PacketUseEntity.Action.ATTACK) {
/* 26 */         boolean flag = this.mc.thePlayer.serverSprintState;
/* 27 */         if (flag) {
/* 28 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0BPacketEntityAction((Entity)this.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
/*    */         }
/*    */         
/* 31 */         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0BPacketEntityAction((Entity)this.mc.thePlayer, C0BPacketEntityAction.Action.START_SPRINTING));
/* 32 */         if (!flag)
/* 33 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0BPacketEntityAction((Entity)this.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING)); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/SuperKnockback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */