/*    */ package com.mylo.base.module.impl.Movement;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C03PacketPlayer;
/*    */ import net.minecraft.util.BlockPos;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Antivoid
/*    */   extends Module
/*    */ {
/*    */   public Antivoid() {
/* 20 */     super("Antivoid", "you wont fall into the void anymore now", 0, Category.Movement);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 25 */     super.setup();
/* 26 */     Main.setmgr.rSetting(new Setting(this.name, this, "hypixel", Lists.newArrayList((Object[])new String[] { "hypixel", "cubecraft" })));
/*    */   }
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 31 */     super.onEnable();
/*    */   }
/*    */   
/*    */   public void onDisable() {
/* 35 */     super.onDisable();
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 40 */     boolean flag = true;
/* 41 */     for (int i = 0; i < this.mc.thePlayer.posY; i++) {
/* 42 */       if (!(this.mc.theWorld.getBlockState(new BlockPos(this.mc.thePlayer.posX, i, this.mc.thePlayer.posZ)).getBlock() instanceof net.minecraft.block.BlockAir)) {
/* 43 */         flag = false;
/*    */       }
/*    */     } 
/* 46 */     if (this.mc.thePlayer.motionY < -1.0D && flag) {
/* 47 */       String str; switch ((str = Main.setmgr.getSettingByName(this.name).getValString().toLowerCase()).hashCode()) { case 972494571: if (!str.equals("Cubecraft")); break;case 1381910549: if (!str.equals("hypixel"))
/*    */             break; 
/* 49 */           this.mc.thePlayer.motionY = 0.0D;
/* 50 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 9.0D, this.mc.thePlayer.posZ, true));
/*    */           break; }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Antivoid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */