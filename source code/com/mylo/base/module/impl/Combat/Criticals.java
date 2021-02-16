/*     */ package com.mylo.base.module.impl.Combat;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C02PacketUseEntity;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Criticals
/*     */   extends Module
/*     */ {
/*     */   boolean portDown;
/*     */   TimeHelper timer;
/*     */   
/*     */   public Criticals() {
/*  36 */     super("Criticals", "deal more critical hits", 0, Category.Combat);
/*     */ 
/*     */     
/*  39 */     this.portDown = false;
/*  40 */     this.timer = new TimeHelper();
/*     */   }
/*     */   
/*     */   public void setup() {
/*  44 */     super.setup();
/*  45 */     Main.setmgr.rSetting(new Setting(this.name, this, "packet", Lists.newArrayList((Object[])new String[] { "packet", "noground", "packetjump", "minijump", "hypixel" })));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  50 */     super.onEnable();
/*  51 */     this.portDown = false;
/*     */   }
/*     */   
/*     */   public void onDisable() {
/*  55 */     super.onDisable();
/*     */   }
/*     */   
/*     */   @EventTarget
/*  59 */   public void onPacket(EventPacket e) { boolean hasReached200 = this.timer.isDelayComplete(Long.valueOf(200L)); String str;
/*  60 */     switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -1359145723: if (!str.equals("minijump")) {
/*     */           break;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 106 */         if (e.getPacket() instanceof C02PacketUseEntity)
/* 107 */         { C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket();
/* 108 */           if (p.getAction() == C02PacketUseEntity.Action.ATTACK && 
/* 109 */             this.mc.thePlayer.onGround)
/* 110 */           { this.mc.thePlayer.motionY = 0.1D;
/* 111 */             this.portDown = true; }  }  break;
/*     */       case -995865464: if (!str.equals("packet"))
/*     */           break;  if (e.getPacket() instanceof C02PacketUseEntity) { C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket(); if (p.getAction() == C02PacketUseEntity.Action.ATTACK && this.mc.thePlayer.onGround && this.mc.thePlayer.ticksExisted % 2 == 0 && (this.mc.thePlayer.getItemInUse() == null || this.mc.thePlayer.getItemInUse().getItem() == null || !(this.mc.thePlayer.getItemInUse().getItem() instanceof net.minecraft.item.ItemFood))) { this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.1D, this.mc.thePlayer.posZ, false)); this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY, this.mc.thePlayer.posZ, false)); }  }  break;
/*     */       case 156023990: if (!str.equals("packetjump"))
/*     */           break;  if (e.getPacket() instanceof C02PacketUseEntity) { C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket(); if (p.getAction() == C02PacketUseEntity.Action.ATTACK && this.mc.thePlayer.onGround)
/*     */             Moveutils.packetJump(Boolean.valueOf(false));  }  break;
/*     */       case 1221776008:
/*     */         if (!str.equals("noground"))
/*     */           break;  if (e.getPacket() instanceof C03PacketPlayer) { Packet p = e.getPacket(); if (p instanceof C03PacketPlayer.C04PacketPlayerPosition) { C03PacketPlayer.C04PacketPlayerPosition packet = (C03PacketPlayer.C04PacketPlayerPosition)p; e.setPacket((Packet)new C03PacketPlayer.C04PacketPlayerPosition(packet.getPositionX(), packet.getPositionY() + 0.1D, packet.getPositionZ(), false)); }  if (p instanceof C03PacketPlayer.C05PacketPlayerLook) { C03PacketPlayer.C05PacketPlayerLook packet = (C03PacketPlayer.C05PacketPlayerLook)p; e.setPacket((Packet)new C03PacketPlayer.C05PacketPlayerLook(packet.getYaw(), packet.getPitch(), false)); }  if (p instanceof C03PacketPlayer.C06PacketPlayerPosLook) { C03PacketPlayer.C06PacketPlayerPosLook packet = (C03PacketPlayer.C06PacketPlayerPosLook)p; e.setPacket((Packet)new C03PacketPlayer.C06PacketPlayerPosLook(packet.getPositionX(), packet.getPositionY() + 0.1D, packet.getPositionZ(), packet.getYaw(), packet.getPitch(), false)); }  }  if (e.getPacket() instanceof C02PacketUseEntity) { C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket(); if (p.getAction() == C02PacketUseEntity.Action.ATTACK)
/*     */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY, this.mc.thePlayer.posZ, false));  }  break;
/*     */       case 1381910549:
/* 122 */         if (!str.equals("hypixel")); break; }  } @EventTarget public void onUpdate(EventUpdate e) { if (this.portDown) {
/* 123 */       this.portDown = false;
/* 124 */       this.mc.thePlayer.motionY = -0.1D;
/*     */     }  }
/*     */ 
/*     */   
/*     */   public void CritHypixel(EntityLivingBase ent) {
/* 129 */     boolean hasReached200 = this.timer.isDelayComplete(Long.valueOf(200L));
/* 130 */     if (getState() && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel")) {
/* 131 */       double[] packets = { 0.05000000079367936D, 0.0015999467995806004D, 0.02999964799447746D, 0.00159999649495806D };
/* 132 */       if (this.mc.thePlayer.isCollidedVertically && !this.mc.thePlayer.isInWater() && !this.mc.thePlayer.isInLava() && !Main.modmgr.getModuleByName("Fly").getState() && !Main.modmgr.getModuleByName("Speed").getState() && ent.hurtResistantTime <= 15) {
/* 133 */         this.timer.reset(); byte b; int i; double[] arrayOfDouble;
/* 134 */         for (i = (arrayOfDouble = packets).length, b = 0; b < i; ) { double offset = arrayOfDouble[b];
/* 135 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + offset, this.mc.thePlayer.posZ, false));
/*     */           b++; }
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/Criticals.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */