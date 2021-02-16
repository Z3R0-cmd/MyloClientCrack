/*    */ package com.mylo.base.module.impl.Visuals;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.network.play.client.C02PacketUseEntity;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Crack
/*    */   extends Module
/*    */ {
/*    */   public Crack() {
/* 19 */     super("Crack", "extra particles", 0, Category.Visuals);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 24 */     super.setup();
/* 25 */     Main.setmgr.rSetting(new Setting("critical particles", this, 0.0D, 0.0D, 10.0D, true));
/* 26 */     Main.setmgr.rSetting(new Setting("sharpness particles", this, 0.0D, 0.0D, 10.0D, true));
/*    */   }
/*    */ 
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 32 */     if (e.getPacket() instanceof C02PacketUseEntity) {
/* 33 */       C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket();
/* 34 */       if (p.getAction() == C02PacketUseEntity.Action.ATTACK) {
/* 35 */         int crits = (int)Main.setmgr.getSettingByName("critical particles").getValDouble();
/* 36 */         int sharps = (int)Main.setmgr.getSettingByName("sharpness particles").getValDouble();
/* 37 */         Entity target = p.getEntityFromWorld((World)this.mc.theWorld); int i;
/* 38 */         for (i = 0; i < crits; i++) {
/* 39 */           this.mc.thePlayer.onCriticalHit(target);
/*    */         }
/* 41 */         for (i = 0; i < sharps; i++)
/* 42 */           this.mc.thePlayer.onEnchantmentCritical(target); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/Crack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */