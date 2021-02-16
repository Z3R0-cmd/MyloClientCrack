/*    */ package com.mylo.base.module.impl.Gui;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventPacket;
/*    */ import com.mylo.base.events.EventRenderText;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C01PacketChatMessage;
/*    */ 
/*    */ public class NameProtect
/*    */   extends Module {
/*    */   public NameProtect() {
/* 17 */     super("NameProtect", "protects your name", 0, Category.Gui);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 22 */     super.setup();
/* 23 */     Main.setmgr.rSetting(new Setting(this.name, this, "MyloUser", Lists.newArrayList((Object[])new String[] { "Mylo", "RealGamer", "Cheems", "Hackerman", "Realgood", "---" })));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onTextRender(EventRenderText e) {
/* 28 */     String name = Main.setmgr.getSettingByName(this.name).getValString();
/* 29 */     if (e.getText().toLowerCase().contains(this.mc.getSession().getUsername().toLowerCase())) {
/* 30 */       e.setText(e.getText().replace(this.mc.getSession().getUsername(), name));
/*    */     }
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onPacket(EventPacket e) {
/* 36 */     if (e.getPacket() instanceof C01PacketChatMessage) {
/* 37 */       C01PacketChatMessage p = (C01PacketChatMessage)e.getPacket();
/* 38 */       String name = Main.setmgr.getSettingByName(this.name).getValString();
/* 39 */       if (p.getMessage().toLowerCase().contains(name.toLowerCase()))
/* 40 */         e.setPacket((Packet)new C01PacketChatMessage(p.getMessage().replace(name, this.mc.getSession().getUsername()))); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Gui/NameProtect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */