/*    */ package com.mylo.base.module.impl.Visuals;
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.server.S08PacketPlayerPosLook;
/*    */ 
/*    */ public class NoViewReset extends Module {
/*    */   public NoViewReset() {
/* 11 */     super("Noviewreset", "dont reset view you retard", 0, Category.Visuals);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 16 */     if (e.getPacket() instanceof S08PacketPlayerPosLook) {
/* 17 */       S08PacketPlayerPosLook p = (S08PacketPlayerPosLook)e.getPacket();
/* 18 */       e.setPacket((Packet)new S08PacketPlayerPosLook(p.getX(), p.getY(), p.getZ(), this.mc.thePlayer.rotationYaw, this.mc.thePlayer.rotationPitch, p.func_179834_f()));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/NoViewReset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */