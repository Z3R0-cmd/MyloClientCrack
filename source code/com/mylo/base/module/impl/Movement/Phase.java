/*     */ package com.mylo.base.module.impl.Movement;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.network.play.server.S08PacketPlayerPosLook;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Phase
/*     */   extends Module
/*     */ {
/*     */   boolean didNcpBruh = false;
/*  26 */   double yaw = 0.0D;
/*     */   
/*     */   public Phase() {
/*  29 */     super("Phase", "go through blocks like wee", 35, Category.Movement);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setup() {
/*  34 */     super.setup();
/*  35 */     ArrayList<String> options = new ArrayList<>();
/*  36 */     options.add("haaa");
/*  37 */     options.add("abusenoclip");
/*  38 */     options.add("slidein");
/*  39 */     options.add("forceforward");
/*  40 */     options.add("toinfinity");
/*  41 */     options.add("ncp");
/*  42 */     Main.setmgr.rSetting(new Setting(this.name, this, "haaa", options));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  47 */     super.onEnable();
/*  48 */     this.didNcpBruh = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {
/*  53 */     super.onDisable();
/*  54 */     this.mc.timer.timerSpeed = 1.0F;
/*  55 */     if (this.mc.thePlayer != null) {
/*  56 */       this.mc.thePlayer.noClip = false;
/*     */     }
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  62 */     if (e.isPre())
/*  63 */     { String str; switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -2119261546: if (!str.equals("slidein")) {
/*     */             break;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 102 */           if (Moveutils.isInBlock()) {
/* 103 */             this.mc.thePlayer.motionY = 0.0D;
/* 104 */             this.mc.thePlayer.noClip = true;
/* 105 */             if (this.mc.thePlayer.movementInput.sneak)
/* 106 */               this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDirForward(), this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDirForward()); 
/* 107 */             if (this.mc.thePlayer.movementInput.jump)
/* 108 */               this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.5D, this.mc.thePlayer.posZ);  break;
/*     */           } 
/* 110 */           if (this.mc.thePlayer.movementInput.sneak && this.mc.thePlayer.isCollidedHorizontally)
/* 111 */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDirForward() * 0.01D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDirForward() * 0.01D);  break;
/*     */         case -1835599494:
/*     */           if (!str.equals("forceforward"))
/*     */             break; 
/* 115 */           this.mc.thePlayer.noClip = true;
/* 116 */           this.mc.thePlayer.motionY = 0.0D;
/* 117 */           if (this.mc.thePlayer.movementInput.sneak) {
/* 118 */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDirForward() * 0.1D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDirForward() * 0.1D);
/*     */             
/*     */             break;
/*     */           } 
/* 122 */           this.mc.timer.timerSpeed = 1.0F;
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case -49793577:
/*     */           if (!str.equals("abusenoclip")) {
/*     */             break;
/*     */           }
/*     */           this.mc.thePlayer.noClip = true;
/*     */           this.mc.thePlayer.motionY = 0.0D;
/*     */           if (this.mc.thePlayer.movementInput.jump) {
/*     */             this.mc.thePlayer.motionY += 0.5D;
/*     */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.1D, this.mc.thePlayer.posZ);
/*     */           } else if (this.mc.thePlayer.movementInput.sneak) {
/*     */             this.mc.thePlayer.motionY -= 0.5D;
/*     */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 0.1D, this.mc.thePlayer.posZ);
/*     */           } 
/*     */           if (Moveutils.moveKeysDown()) {
/*     */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 1.0E-4D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 1.0E-4D);
/*     */           }
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 108891:
/*     */           if (!str.equals("ncp")) {
/*     */             break;
/*     */           }
/* 156 */           if (Moveutils.isInBlock() || this.mc.thePlayer.isCollidedHorizontally)
/* 157 */             this.mc.thePlayer.noClip = true;  break;
/*     */         case 3194585: if (!str.equals("haaa"))
/*     */             break;  this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 1.0E-10D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 1.0E-10D); if (this.mc.thePlayer.onGround && this.mc.thePlayer.movementInput.sneak && this.mc.thePlayer.ticksExisted % 3 == 0)
/*     */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 3.0D, this.mc.thePlayer.posZ);  if (this.mc.thePlayer.isCollidedVertically && !this.mc.thePlayer.onGround && this.mc.thePlayer.movementInput.jump)
/*     */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 3.0D, this.mc.thePlayer.posZ);  if (Moveutils.isInBlock()) { this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 0.01D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 0.01D); Moveutils.setSpeed(0.15D); this.mc.thePlayer.noClip = true; if (this.mc.thePlayer.movementInput.sneak)
/*     */               this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 0.001D, this.mc.thePlayer.posZ);  if (this.mc.thePlayer.movementInput.jump)
/*     */               this.mc.thePlayer.motionY = 0.10000000149011612D;  }  break;
/*     */         case 88460707: if (!str.equals("toinfinity"))
/*     */             break;  if (Moveutils.isInBlock()) { this.mc.thePlayer.noClip = true; this.mc.thePlayer.motionY = 0.0D; if (this.mc.thePlayer.movementInput.sneak) { this.mc.thePlayer.motionY -= 0.5D; this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 0.1D, this.mc.thePlayer.posZ); }  if (this.mc.thePlayer.movementInput.jump) { this.mc.thePlayer.motionY += 0.5D; this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.1D, this.mc.thePlayer.posZ); }  if (Moveutils.moveKeysDown())
/* 166 */               this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 1.0E-4D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 1.0E-4D);  break; }  if (this.mc.thePlayer.isCollidedHorizontally) { this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 0.5D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 0.5D, false)); this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, true)); this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 0.5D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 0.5D, false)); }  if (this.mc.thePlayer.onGround && this.mc.thePlayer.movementInput.sneak) { this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 2.0D, this.mc.thePlayer.posZ, false)); this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, true)); this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 2.0D, this.mc.thePlayer.posZ, false)); }  break; }  }  } @EventTarget public void onPacket(EventPacket e) { if (e.getPacket() instanceof S08PacketPlayerPosLook && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("forceforward")) {
/* 167 */       S08PacketPlayerPosLook p = (S08PacketPlayerPosLook)e.getPacket();
/*     */ 
/*     */ 
/*     */       
/* 171 */       this.mc.thePlayer.setPosition(p.getX() + this.mc.thePlayer.lastTickPosX - p.getX(), p.getY() + this.mc.thePlayer.lastTickPosY - p.getY(), p.getZ() + this.mc.thePlayer.lastTickPosZ - p.getZ());
/*     */     } 
/* 173 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncp") && 
/* 174 */       e.getPacket() instanceof S08PacketPlayerPosLook) {
/* 175 */       this.didNcpBruh = true;
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/* 182 */     if (e.isPre() && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("abusenoclip")) {
/* 183 */       e.setX(0.0D);
/* 184 */       e.setY(0.0D);
/* 185 */       e.setZ(0.0D);
/* 186 */       Moveutils.setMoveSpeed(e, 0.3D);
/*     */     } 
/* 188 */     if (e.isPre() && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("forceforward")) {
/* 189 */       e.setX(0.0D);
/* 190 */       e.setY(0.0D);
/* 191 */       e.setZ(0.0D);
/*     */     } 
/*     */     
/* 194 */     float divider = 90.0F;
/* 195 */     if (e.isPre() && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncp")) {
/* 196 */       e.y = this.mc.thePlayer.motionY = 0.0D;
/* 197 */       if (this.mc.thePlayer.isCollidedHorizontally) {
/* 198 */         this.yaw = ((int)(Moveutils.getPressedMoveDir() % 360.0D / divider) * divider);
/*     */       }
/* 200 */       Moveutils.setMoveSpeed(e, Moveutils.getBaseMoveSpeed() * 0.01D);
/* 201 */       if (Moveutils.isInBlock() || this.mc.thePlayer.isCollidedHorizontally)
/* 202 */         if (this.didNcpBruh && Moveutils.isInBlock()) {
/* 203 */           Moveutils.setMoveSpeed(e, 0.5D);
/*     */         }
/* 205 */         else if (Moveutils.isInBlock()) {
/* 206 */           Moveutils.setMoveSpeed(e, 5.0E-7D);
/*     */         } else {
/*     */           
/* 209 */           Moveutils.setMoveSpeed(e, 1.0E-5D);
/* 210 */           this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * 1.0E-12D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * 1.0E-12D);
/*     */         }  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Phase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */