/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.PathFind;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C03PacketPlayer;
/*    */ import net.minecraft.util.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Discordfrspammer
/*    */   extends Module
/*    */ {
/*    */   public Discordfrspammer() {
/* 23 */     super("mpdisabler", "disable mineplex's anticheat", 82, Category.Misc);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 28 */     super.onEnable();
/* 29 */     if (Main.discordtarget.equalsIgnoreCase("")) {
/* 30 */       Main.NotMan.sendNotification("Please set a name", "set a name with .disabler name", 5000);
/* 31 */       setState(false);
/*    */     } 
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 37 */     if (e.isPre() && 
/* 38 */       this.mc.thePlayer.ticksExisted > 60) {
/* 39 */       Entity ent = null;
/* 40 */       for (Entity entity : this.mc.theWorld.loadedEntityList) {
/* 41 */         if (entity instanceof net.minecraft.entity.EntityLivingBase && 
/* 42 */           entity.getName().equals(Main.discordtarget)) {
/* 43 */           ent = entity;
/*    */         }
/*    */       } 
/*    */       
/* 47 */       if (ent != null) {
/* 48 */         this.mc.setRenderViewEntity((Entity)this.mc.thePlayer);
/* 49 */         if (this.mc.thePlayer.getDistanceToEntity(ent) > 5.0F) {
/* 50 */           for (Vec3 v : PathFind.computePath(this.mc.thePlayer.getPositionVector(), ent.getPositionVector(), 3.0D, false)) {
/* 51 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(v.xCoord, v.yCoord, v.zCoord, false));
/*    */           }
/*    */         } else {
/*    */           
/* 55 */           Minecraft mc = Minecraft.getMinecraft();
/* 56 */           double rot = 90.0D;
/* 57 */           rot += ent.rotationYaw;
/* 58 */           double x = Math.cos(rot * Math.PI / 180.0D);
/* 59 */           double z = Math.sin(rot * Math.PI / 180.0D);
/* 60 */           mc.thePlayer.setPosition(ent.posX + x, ent.posY, ent.posZ + z);
/*    */         }
/*    */       
/*    */       } else {
/*    */         
/* 65 */         this.mc.setRenderViewEntity((Entity)this.mc.thePlayer);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDisable() {
/* 73 */     super.onDisable();
/* 74 */     if (this.mc.thePlayer != null)
/* 75 */       this.mc.setRenderViewEntity((Entity)this.mc.thePlayer); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/Discordfrspammer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */