/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Renderutils;
/*    */ import com.mylo.base.utils.entityutils;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.network.play.client.C03PacketPlayer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CheaterDetector
/*    */   extends Module
/*    */ {
/*    */   public CheaterDetector() {
/* 22 */     super("CheaterDetector", "detects cheaters", 0, Category.Misc);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 27 */     if (e.isPre()) {
/* 28 */       for (Entity ent : entityutils.getEntitiesInRange(1000.0D, true, false, false, false, false)) {
/* 29 */         EntityPlayer entity = (EntityPlayer)ent;
/* 30 */         String reason = String.valueOf(entity.getName()) + " seems to be using ";
/* 31 */         boolean isCheating = false;
/*    */ 
/*    */ 
/*    */         
/* 35 */         if (Renderutils.getDistance2d(ent.posX, ent.posY, ent.lastTickPosX, ent.lastTickPosZ) > 0.7D) {
/* 36 */           isCheating = true;
/* 37 */           reason = String.valueOf(reason) + "speed ";
/*    */         } 
/* 39 */         if (isCheating) {
/* 40 */           Main.NotMan.sendNotification("Cheater detected", reason, 1000);
/*    */         }
/* 42 */         entity.lastLastLastYaw = entity.lastLastYaw;
/* 43 */         entity.lastLastYaw = entity.lastYaw;
/* 44 */         entity.lastYaw = entity.rotationYaw;
/* 45 */         entity.lastLastLastPitch = entity.lastLastPitch;
/* 46 */         entity.lastLastPitch = entity.lastPitch;
/* 47 */         entity.lastPitch = entity.rotationPitch;
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 55 */     if (e.getPacket() instanceof C03PacketPlayer) {
/* 56 */       C03PacketPlayer p = (C03PacketPlayer)e.getPacket();
/* 57 */       Boolean packetGround = Boolean.valueOf(p.isOnGround());
/* 58 */       Boolean blockUnder = Boolean.valueOf(!this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().expand(0.0D, 0.005D, 0.0D).contract(0.001D, 0.001D, 0.001D)).isEmpty());
/* 59 */       if (packetGround.booleanValue() && !blockUnder.booleanValue()) {
/* 60 */         Main.sendChatMessage("incorrectGround noBlock");
/*    */       }
/* 62 */       if (packetGround.booleanValue() != ((this.mc.thePlayer.posY % 1.0D / 64.0D == 0.0D))) {
/* 63 */         Main.sendChatMessage("incorrectGround wrongPos");
/*    */       }
/* 65 */       double moveDiff = Math.abs(this.mc.thePlayer.posY - this.mc.thePlayer.lastTickPosY);
/* 66 */       if (moveDiff != 0.0D && moveDiff < 0.003D)
/* 67 */         Main.sendChatMessage("incorrectGround smallMove"); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/CheaterDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */