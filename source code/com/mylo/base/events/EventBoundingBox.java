/*    */ package com.mylo.base.events;
/*    */ 
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraft.util.BlockPos;
/*    */ 
/*    */ public class EventBoundingBox implements Event {
/*    */   Block block;
/*    */   AxisAlignedBB bb;
/*    */   BlockPos bpos;
/*    */   
/*    */   public EventBoundingBox(Block block, AxisAlignedBB bb, BlockPos bpos) {
/* 14 */     this.block = block;
/* 15 */     this.bb = bb;
/* 16 */     this.bpos = bpos;
/*    */   }
/*    */   
/*    */   public Block getBlock() {
/* 20 */     return this.block;
/*    */   }
/*    */   public AxisAlignedBB getBb() {
/* 23 */     return this.bb;
/*    */   }
/*    */   public void setBb(AxisAlignedBB bb) {
/* 26 */     this.bb = bb;
/*    */   }
/*    */   public BlockPos getBpos() {
/* 29 */     return this.bpos;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/events/EventBoundingBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */