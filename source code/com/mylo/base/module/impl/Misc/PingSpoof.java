/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.status.client.C01PacketPing;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PingSpoof
/*    */   extends Module
/*    */ {
/*    */   public PingSpoof() {
/* 18 */     super("PingSpoof", "basically a proxy that delays and modifies packets", 0, Category.Misc);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 23 */     super.setup();
/* 24 */     Main.setmgr.rSetting(new Setting("difference", this, 100.0D, -100.0D, 1000.0D, true));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 29 */     int delay = -((int)Main.setmgr.getSettingByName("difference").getValDouble());
/* 30 */     if (e.isOut() && e.getPacket() instanceof C01PacketPing) {
/* 31 */       C01PacketPing p = (C01PacketPing)e.getPacket();
/* 32 */       e.setPacket((Packet)new C01PacketPing(delay));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/PingSpoof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */