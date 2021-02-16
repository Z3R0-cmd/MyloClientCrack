/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.TimeHelper;
/*    */ import net.minecraft.util.BlockPos;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.util.Vec3;
/*    */ 
/*    */ 
/*    */ public class Cakeeater
/*    */   extends Module
/*    */ {
/*    */   TimeHelper timer;
/*    */   
/*    */   public Cakeeater() {
/* 19 */     super("Cakeeater", "Also called fucker, but sumandora already calls me that", 0, Category.Misc);
/*    */ 
/*    */     
/* 22 */     this.timer = new TimeHelper();
/*    */   }
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 26 */     if (e.isPre() && this.timer.isDelayComplete(Long.valueOf(100L))) {
/* 27 */       for (BlockPos bpos : BlockPos.getAllInBox(new BlockPos(this.mc.thePlayer.posX - 5.0D, this.mc.thePlayer.posY - 5.0D, this.mc.thePlayer.posZ - 5.0D), new BlockPos(this.mc.thePlayer.posX + 5.0D, this.mc.thePlayer.posY + 5.0D, this.mc.thePlayer.posZ + 5.0D))) {
/* 28 */         if ((this.mc.theWorld.getBlockState(bpos).getBlock() instanceof net.minecraft.block.BlockCake || this.mc.theWorld.getBlockState(bpos).getBlock() instanceof net.minecraft.block.BlockDragonEgg) && this.mc.thePlayer.getDistance(bpos.getX(), bpos.getY(), bpos.getZ()) < 5.0D) {
/* 29 */           this.mc.playerController.onPlayerRightClick(this.mc.thePlayer, this.mc.theWorld, this.mc.thePlayer.getHeldItem(), bpos, EnumFacing.UP, new Vec3(0.0D, 0.0D, 0.0D));
/*    */         }
/*    */       } 
/* 32 */       this.timer.reset();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/Cakeeater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */