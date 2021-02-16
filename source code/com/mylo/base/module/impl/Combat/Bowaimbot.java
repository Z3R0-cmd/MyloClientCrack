/*    */ package com.mylo.base.module.impl.Combat;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Lookutil;
/*    */ import com.mylo.base.utils.entityutils;
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ 
/*    */ public class Bowaimbot
/*    */   extends Module
/*    */ {
/*    */   public Bowaimbot() {
/* 17 */     super("Bowaimbot", "auto aim at people with bows", 0, Category.Combat);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 22 */     if (e.isPre())
/* 23 */       if (this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemBow) {
/* 24 */         Entity target = entityutils.GetClosestEntitycrosshair();
/* 25 */         if (target != null) {
/* 26 */           int i = this.mc.thePlayer.getHeldItem().getMaxItemUseDuration() - this.mc.thePlayer.getItemInUseCount();
/* 27 */           float f = i / 20.0F;
/* 28 */           if (f != 3600.0F) {
/* 29 */             if (f > 1.0F) {
/* 30 */               f = 1.0F;
/*    */             }
/*    */             
/* 33 */             Main.enableFakeaim(true);
/* 34 */             float distance = this.mc.thePlayer.getDistanceToEntity(target);
/* 35 */             Lookutil.lookAtPosPacket(target.getPositionVector().addVector((target.posX - target.lastTickPosX) * (distance * f) * 0.5D, 0.0D, (target.posZ - target.lastTickPosZ) * (distance * f) * 0.5D).addVector(0.0D, target.height, 0.0D).addVector(0.0D, (distance / 40.0F * f), 0.0D));
/*    */           } else {
/*    */             
/* 38 */             Main.enableFakeaim(false);
/*    */           } 
/*    */         } else {
/*    */           
/* 42 */           Main.enableFakeaim(false);
/*    */         } 
/*    */       } else {
/*    */         
/* 46 */         Main.enableFakeaim(false);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/Bowaimbot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */