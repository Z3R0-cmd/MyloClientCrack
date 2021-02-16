/*     */ package com.mylo.base.module.impl.Visuals;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.server.S08PacketPlayerPosLook;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class Freecam extends Module {
/*     */   double x;
/*     */   double y;
/*     */   
/*     */   public Freecam() {
/*  22 */     super("Freecam", "View the world", 39, Category.Visuals);
/*     */   }
/*     */   
/*     */   double z;
/*     */   float pitch;
/*     */   float yaw;
/*     */   
/*     */   public void onEnable() {
/*  30 */     super.onEnable();
/*  31 */     this.x = this.mc.thePlayer.posX;
/*  32 */     this.y = this.mc.thePlayer.posY;
/*  33 */     this.z = this.mc.thePlayer.posZ;
/*  34 */     this.pitch = this.mc.thePlayer.rotationPitch;
/*  35 */     this.yaw = this.mc.thePlayer.rotationYaw;
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/*  40 */     Packet p = e.getPacket();
/*  41 */     if (p instanceof net.minecraft.network.play.client.C03PacketPlayer || p instanceof net.minecraft.network.play.client.C07PacketPlayerDigging || p instanceof net.minecraft.network.play.client.C08PacketPlayerBlockPlacement || p instanceof net.minecraft.network.play.client.C0CPacketInput || p instanceof net.minecraft.network.play.client.C02PacketUseEntity || p instanceof net.minecraft.network.play.client.C0BPacketEntityAction) {
/*  42 */       e.setCancelled(true);
/*     */     }
/*  44 */     if (p instanceof S08PacketPlayerPosLook) {
/*  45 */       S08PacketPlayerPosLook packet = (S08PacketPlayerPosLook)p;
/*  46 */       this.x = packet.getX();
/*  47 */       this.y = packet.getY();
/*  48 */       this.z = packet.getZ();
/*  49 */       this.pitch = packet.getPitch();
/*  50 */       this.yaw = packet.getYaw();
/*  51 */       e.setCancelled(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender(EventRender3d e) {
/*  57 */     GlStateManager.pushMatrix();
/*  58 */     GlStateManager.pushAttrib();
/*  59 */     GlStateManager.translate(-(this.mc.getRenderManager()).renderPosX, -(this.mc.getRenderManager()).renderPosY, -(this.mc.getRenderManager()).renderPosZ);
/*  60 */     this.mc.getRenderManager().doRenderEntity((Entity)this.mc.thePlayer, this.x, this.y, this.z, this.yaw, this.mc.timer.renderPartialTicks, false);
/*  61 */     GlStateManager.popMatrix();
/*  62 */     GlStateManager.popAttrib();
/*  63 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  68 */     this.mc.thePlayer.noClip = true;
/*  69 */     if (this.mc.thePlayer.isCollidedHorizontally) {
/*  70 */       this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 1.0E-10D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 1.0E-10D);
/*     */     }
/*  72 */     if (this.mc.thePlayer.isCollidedVertically) {
/*  73 */       double y = 0.0D;
/*  74 */       if (this.mc.thePlayer.movementInput.sneak) {
/*  75 */         y -= 1.0E-10D;
/*     */       }
/*  77 */       if (this.mc.thePlayer.movementInput.jump) {
/*  78 */         y += 1.0E-10D;
/*     */       }
/*  80 */       this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir(), this.mc.thePlayer.posY + y, this.mc.thePlayer.posZ);
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/*  86 */     if (e.isPre()) {
/*  87 */       double y = 0.0D;
/*  88 */       if (this.mc.thePlayer.movementInput.sneak) {
/*  89 */         y -= 0.3D;
/*     */       }
/*  91 */       if (this.mc.thePlayer.movementInput.jump) {
/*  92 */         y += 0.3D;
/*     */       }
/*  94 */       Moveutils.setMoveSpeed(e, 0.6D);
/*  95 */       e.y = this.mc.thePlayer.motionY = y;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 101 */     super.onDisable();
/*     */     
/* 103 */     if (this.mc.thePlayer != null) {
/* 104 */       this.mc.thePlayer.setPosition(this.x, this.y, this.z);
/* 105 */       this.mc.thePlayer.motionY = 0.0D;
/* 106 */       this.mc.thePlayer.motionX = 0.0D;
/* 107 */       this.mc.thePlayer.motionZ = 0.0D;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/Freecam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */