/*    */ package com.mylo.base.module.impl.Combat;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.server.S12PacketEntityVelocity;
/*    */ import net.minecraft.network.play.server.S27PacketExplosion;
/*    */ import net.minecraft.util.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AntiKnockback
/*    */   extends Module
/*    */ {
/*    */   public AntiKnockback() {
/* 22 */     super("AntiKnockback", "Prevents Knockback", 0, Category.Combat);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 27 */     super.setup();
/* 28 */     ArrayList<String> options = new ArrayList<>();
/* 29 */     options.add("packet");
/* 30 */     options.add("motion");
/* 31 */     Main.setmgr.rSetting(new Setting(this.name, this, "packet", options));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 36 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("packet")) {
/* 37 */       if (e.getPacket() instanceof S12PacketEntityVelocity && (
/* 38 */         (S12PacketEntityVelocity)e.getPacket()).getEntityID() == this.mc.thePlayer.getEntityId()) {
/* 39 */         e.setCancelled(true);
/*    */       }
/*    */       
/* 42 */       if (e.getPacket() instanceof S27PacketExplosion) {
/* 43 */         S27PacketExplosion packet = (S27PacketExplosion)e.getPacket();
/* 44 */         e.setPacket((Packet)new S27PacketExplosion(packet.getX(), packet.getY(), packet.getZ(), packet.getStrength(), packet.getAffectedBlockPositions(), new Vec3(0.0D, 0.0D, 0.0D)));
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 51 */     if (e.isPre() && 
/* 52 */       Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("motion") && 
/* 53 */       this.mc.thePlayer.hurtResistantTime >= 10) {
/* 54 */       this.mc.thePlayer.motionX *= 0.8D;
/* 55 */       this.mc.thePlayer.motionZ *= 0.8D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/AntiKnockback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */