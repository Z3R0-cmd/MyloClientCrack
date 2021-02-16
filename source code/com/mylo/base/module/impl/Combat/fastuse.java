/*    */ package com.mylo.base.module.impl.Combat;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C03PacketPlayer;
/*    */ import net.minecraft.network.play.client.C07PacketPlayerDigging;
/*    */ import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
/*    */ import net.minecraft.util.BlockPos;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fastuse
/*    */   extends Module
/*    */ {
/*    */   public fastuse() {
/* 22 */     super("Fastuse", "use items quickly", 0, Category.Combat);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 27 */     Main.setmgr.rSetting(new Setting("ncp fastuse", this, false));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 32 */     if (e.isPre())
/* 33 */       if (Main.setmgr.getSettingByName("ncp fastuse").getValBoolean()) {
/* 34 */         if (this.mc.thePlayer.isUsingItem() && 
/* 35 */           this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && !(this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword)) {
/* 36 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer());
/* 37 */           if (this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemBow && this.mc.thePlayer.getItemInUseDuration() >= 15) {
/* 38 */             this.mc.thePlayer.setItemInUse(null, 1000);
/* 39 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(0, 0, 0), EnumFacing.UP));
/*    */           }
/*    */         
/*    */         }
/*    */       
/*    */       }
/* 45 */       else if (this.mc.thePlayer.isUsingItem() && 
/* 46 */         this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && !(this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword)) {
/* 47 */         for (int i = 0; i < 40; i++) {
/* 48 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer());
/*    */         }
/* 50 */         if (this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemBow) {
/* 51 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(0, 0, 0), EnumFacing.UP));
/* 52 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C08PacketPlayerBlockPlacement(this.mc.thePlayer.getHeldItem()));
/*    */         } 
/*    */       }  
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/fastuse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */