/*    */ package com.mylo.base.module.impl.Movement;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.events.EventSlowdown;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.module.impl.Combat.Killaura;
/*    */ import com.mylo.base.utils.Moveutils;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C07PacketPlayerDigging;
/*    */ import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
/*    */ import net.minecraft.util.BlockPos;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NoSlow
/*    */   extends Module
/*    */ {
/*    */   Setting mode;
/*    */   boolean flag;
/*    */   Packet p;
/*    */   
/*    */   public NoSlow() {
/* 32 */     super("Noslow", "prevents slowdown from blocking", 0, Category.Movement);
/*    */ 
/*    */ 
/*    */     
/* 36 */     this.flag = false;
/* 37 */     this.p = null;
/*    */   }
/*    */   
/*    */   public void onEnable() {
/* 41 */     super.onEnable();
/* 42 */     this.flag = false;
/* 43 */     this.p = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 48 */     super.setup();
/* 49 */     ArrayList<String> options = new ArrayList<>();
/* 50 */     options.add("vanilla");
/* 51 */     options.add("bypass");
/* 52 */     this.mode = new Setting(this.name, this, "vanilla", options);
/* 53 */     Main.setmgr.rSetting(this.mode);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 58 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("bypass")) {
/* 59 */       Killaura auraMod = (Killaura)Main.modmgr.getModuleByName("Killaura");
/* 60 */       if (Moveutils.moveKeysDown() && this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword && (Mouse.isButtonDown(1) || (auraMod.getState() && auraMod.blocking))) {
/* 61 */         if (e.isPre()) {
/* 62 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
/*    */         } else {
/*    */           
/* 65 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C08PacketPlayerBlockPlacement(this.mc.thePlayer.inventory.getCurrentItem()));
/*    */         } 
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onslowdown(EventSlowdown e) {
/* 73 */     if (e.ispre())
/* 74 */       e.setCancelled(true); 
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {}
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/NoSlow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */