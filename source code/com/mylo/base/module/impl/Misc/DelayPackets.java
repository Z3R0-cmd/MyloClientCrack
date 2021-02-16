/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class DelayPackets
/*    */   extends Module
/*    */ {
/*    */   public DelayPackets() {
/* 16 */     super("Delaypackets", "basically a proxy that delays packets", 0, Category.Misc);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 21 */     super.setup();
/* 22 */     Main.setmgr.rSetting(new Setting("packetsenddelay", this, 100.0D, 100.0D, 10000.0D, true));
/* 23 */     Main.setmgr.rSetting(new Setting("sendoutoforder", this, false));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(final EventPacket e) {
/* 28 */     if (e.isOut() && this.mc.thePlayer != null) {
/* 29 */       e.setCancelled(true);
/* 30 */       (new Thread(new Runnable()
/*    */           {
/*    */             public void run()
/*    */             {
/* 34 */               int delay = (int)Main.setmgr.getSettingByName("packetsenddelay").getValDouble();
/* 35 */               boolean random = Main.setmgr.getSettingByName("sendoutoforder").getValBoolean();
/* 36 */               if (random) {
/* 37 */                 delay = (new Random()).nextInt(delay);
/*    */               }
/*    */               try {
/* 40 */                 Thread.sleep(delay);
/* 41 */               } catch (InterruptedException e1) {
/* 42 */                 e1.printStackTrace();
/*    */               } 
/* 44 */               DelayPackets.this.mc.thePlayer.sendQueue.addToSendQueueSilent(e.getPacket());
/*    */             }
/* 46 */           })).start();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/DelayPackets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */