/*     */ package com.mylo.base.module.impl.Misc;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import de.Hero.settings.Setting;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.util.BlockPos;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Nofall
/*     */   extends Module
/*     */ {
/*     */   int lastticksexisted;
/*     */   
/*     */   public Nofall() {
/*  24 */     super("Nofall", "prevents fall damage", 0, Category.Misc);
/*     */ 
/*     */     
/*  27 */     this.lastticksexisted = 0;
/*     */   }
/*     */   
/*     */   public void setup() {
/*  31 */     super.setup();
/*  32 */     Main.setmgr.rSetting(new Setting(this.name, this, "packet", Lists.newArrayList((Object[])new String[] { "packet", "groundspoof", "noground", "hypixel" })));
/*     */   }
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*     */     String str;
/*  37 */     switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -995865464: if (!str.equals("packet"))
/*     */           break; 
/*  39 */         if (e.isPre() && this.mc.thePlayer.ticksExisted != this.lastticksexisted) {
/*  40 */           this.lastticksexisted = this.mc.thePlayer.ticksExisted;
/*  41 */           if (this.mc.thePlayer.fallDistance > 2.0F) {
/*  42 */             this.mc.thePlayer.fallDistance = 0.0F;
/*  43 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer(true));
/*     */           } 
/*     */         }  break;
/*     */       case 1381910549:
/*     */         if (!str.equals("hypixel"))
/*  48 */           break;  if (this.mc.thePlayer.fallDistance <= 1.0F || !isBlockUnder() || Main.modmgr.getModuleByName("Fly").getState() || (this.mc.thePlayer.posY % 0.0625D == 0.0D && this.mc.thePlayer.posY % 0.015256D == 0.0D))
/*  49 */           break;  this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer(true));
/*  50 */         this.mc.thePlayer.fallDistance = 0.0F;
/*     */         break; }
/*     */   
/*     */   }
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/*     */     String str;
/*  57 */     switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -529978910: if (!str.equals("groundspoof"))
/*     */           break; 
/*  59 */         if (e.getPacket() instanceof C03PacketPlayer && !this.mc.isSingleplayer()) {
/*  60 */           Packet p = e.getPacket();
/*  61 */           e.setCancelled(true);
/*  62 */           if (p instanceof C03PacketPlayer.C04PacketPlayerPosition) {
/*  63 */             C03PacketPlayer.C04PacketPlayerPosition packet = (C03PacketPlayer.C04PacketPlayerPosition)p;
/*     */             
/*  65 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ(), true));
/*     */           } 
/*  67 */           if (p instanceof C03PacketPlayer.C05PacketPlayerLook) {
/*  68 */             C03PacketPlayer.C05PacketPlayerLook packet = (C03PacketPlayer.C05PacketPlayerLook)p;
/*     */             
/*  70 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C05PacketPlayerLook(packet.getYaw(), packet.getPitch(), true));
/*     */           } 
/*  72 */           if (p instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
/*  73 */             C03PacketPlayer.C06PacketPlayerPosLook packet = (C03PacketPlayer.C06PacketPlayerPosLook)p;
/*     */             
/*  75 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C06PacketPlayerPosLook(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ(), packet.getYaw(), packet.getPitch(), true));
/*     */           } 
/*     */         }  break;
/*     */       case 1221776008:
/*     */         if (!str.equals("noground"))
/*  80 */           break;  if (e.getPacket() instanceof C03PacketPlayer && !this.mc.isSingleplayer()) {
/*  81 */           Packet p = e.getPacket();
/*  82 */           e.setCancelled(true);
/*  83 */           if (p instanceof C03PacketPlayer.C04PacketPlayerPosition) {
/*  84 */             C03PacketPlayer.C04PacketPlayerPosition packet = (C03PacketPlayer.C04PacketPlayerPosition)p;
/*     */             
/*  86 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ(), false));
/*     */           } 
/*  88 */           if (p instanceof C03PacketPlayer.C05PacketPlayerLook) {
/*  89 */             C03PacketPlayer.C05PacketPlayerLook packet = (C03PacketPlayer.C05PacketPlayerLook)p;
/*     */             
/*  91 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C05PacketPlayerLook(packet.getYaw(), packet.getPitch(), false));
/*     */           } 
/*  93 */           if (p instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
/*  94 */             C03PacketPlayer.C06PacketPlayerPosLook packet = (C03PacketPlayer.C06PacketPlayerPosLook)p;
/*     */             
/*  96 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C06PacketPlayerPosLook(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ(), packet.getYaw(), packet.getPitch(), false));
/*     */           } 
/*     */         } 
/*     */         break; }
/*     */   
/*     */   }
/*     */   
/*     */   private boolean isBlockUnder() {
/* 104 */     for (int i = (int)(this.mc.thePlayer.posY - 1.0D); i > 0; ) {
/* 105 */       BlockPos pos = new BlockPos(this.mc.thePlayer.posX, i, this.mc.thePlayer.posZ);
/* 106 */       if (this.mc.theWorld.getBlockState(pos).getBlock() instanceof net.minecraft.block.BlockAir) { i--; continue; }
/* 107 */        return true;
/*     */     } 
/* 109 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/Nofall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */