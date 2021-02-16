/*     */ package com.mylo.base.module.impl.Movement;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventClick;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.PathFind;
/*     */ import com.mylo.base.utils.Userinpututil;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.util.Vec3i;
/*     */ 
/*     */ public class ClickTp
/*     */   extends Module {
/*     */   int ticker;
/*     */   ArrayList<Vec3> path;
/*     */   
/*     */   public ClickTp() {
/*  29 */     super("Clicktp", "teleport on click boom bam", 0, Category.Movement);
/*     */ 
/*     */     
/*  32 */     this.ticker = 0;
/*  33 */     this.path = new ArrayList<>();
/*  34 */     this.targetPos = null;
/*  35 */     this.flagged = true;
/*     */   }
/*     */   BlockPos targetPos; boolean flagged;
/*     */   public void setup() {
/*  39 */     super.setup();
/*  40 */     Main.setmgr.rSetting(new Setting(this.name, this, "vanilla", Lists.newArrayList((Object[])new String[] { "vanilla", "test", "hypixel", "cubecraft" })));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  45 */     super.onEnable();
/*  46 */     this.path = new ArrayList<>();
/*  47 */     this.targetPos = null;
/*  48 */     this.flagged = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {
/*  53 */     super.onDisable();
/*  54 */     this.mc.timer.timerSpeed = 1.0F;
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  59 */     if (e.isPre() && this.targetPos != null && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("test")) {
/*  60 */       this.ticker++;
/*  61 */       if (this.ticker >= 10 && 
/*  62 */         this.path.size() > 1) {
/*  63 */         for (Vec3 point : this.path) {
/*  64 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(point.xCoord, point.yCoord, point.zCoord, true));
/*     */         }
/*  66 */         this.mc.thePlayer.setPosition(this.targetPos.getX() + 0.5D, this.targetPos.getY() + 1.42D, this.targetPos.getZ() + 0.5D);
/*  67 */         this.path = new ArrayList<>();
/*     */       } 
/*     */       
/*  70 */       if (this.ticker >= 15) {
/*  71 */         this.targetPos = null;
/*  72 */         this.mc.timer.timerSpeed = 1.0F;
/*     */       } 
/*     */     } 
/*  75 */     if (e.isPre() && this.targetPos != null) Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel");
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/*  82 */     if (e.isPre() && this.targetPos != null && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("test") && 
/*  83 */       this.ticker < 15) {
/*  84 */       this.mc.timer.timerSpeed = 0.1F;
/*  85 */       e.x = 0.0D;
/*  86 */       e.y = 0.0D;
/*  87 */       e.z = 0.0D;
/*     */     } 
/*     */     
/*  90 */     if (e.isPre() && this.targetPos != null && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel") && !this.flagged && this.mc.thePlayer.motionY < -0.2999D) {
/*  91 */       e.x = 0.0D;
/*  92 */       e.y = 0.0D;
/*  93 */       this.mc.thePlayer.motionY = -0.3D;
/*  94 */       e.z = 0.0D;
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 100 */     if (e.getPacket() instanceof net.minecraft.network.play.server.S08PacketPlayerPosLook && !this.flagged) {
/* 101 */       this.flagged = true;
/* 102 */       for (Vec3 point : this.path) {
/* 103 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(point.xCoord, point.yCoord, point.zCoord, true));
/*     */       }
/* 105 */       this.mc.thePlayer.setPosition(this.targetPos.getX() + 0.5D, this.targetPos.getY() + 1.42D, this.targetPos.getZ() + 0.5D);
/* 106 */       setState(false);
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onClick(EventClick e) {
/* 112 */     if (e.mouseButton == 2 && !Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft")) {
/* 113 */       MovingObjectPosition target = Userinpututil.getMouseOverExtended(3000.0F);
/* 114 */       if (target != null && target.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
/* 115 */         this.targetPos = target.getBlockPos();
/* 116 */         this.path = PathFind.computePath(this.mc.thePlayer.getPositionVector(), new Vec3((Vec3i)this.targetPos), (!Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("test") ? 5 : 2), false);
/* 117 */         if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("vanilla")) {
/* 118 */           for (Vec3 point : this.path) {
/* 119 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(point.xCoord, point.yCoord, point.zCoord, true));
/*     */           }
/* 121 */           this.mc.thePlayer.setPosition(this.targetPos.getX() + 0.5D, this.targetPos.getY() + 1.42D, this.targetPos.getZ() + 0.5D);
/*     */         }
/* 123 */         else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("test")) {
/* 124 */           this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.42D, this.mc.thePlayer.posZ);
/* 125 */           this.ticker = 0;
/*     */         }
/*     */         else {
/*     */           
/* 129 */           this.mc.thePlayer.motionY = 0.41205840986D;
/* 130 */           this.flagged = false;
/*     */         }
/*     */       
/*     */       } 
/* 134 */     } else if (e.mouseButton == 2) {
/* 135 */       MovingObjectPosition target = Userinpututil.getMouseOverExtended(3000.0F);
/* 136 */       if (target != null && target.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
/* 137 */         this.targetPos = target.getBlockPos();
/* 138 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.targetPos.getX() + 0.5D, (this.targetPos.getY() + 1), this.targetPos.getZ() + 0.5D, true));
/* 139 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.targetPos.getX() + 0.5D, (this.targetPos.getY() + 1), this.targetPos.getZ() + 0.5D, true));
/* 140 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.targetPos.getX() + 0.5D, (this.targetPos.getY() + 1), this.targetPos.getZ() + 0.5D, true));
/* 141 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 2.0D, this.mc.thePlayer.posZ, false));
/* 142 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 2.0D, this.mc.thePlayer.posZ, false));
/* 143 */         this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 2.0D, this.mc.thePlayer.posZ, false));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/ClickTp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */