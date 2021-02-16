/*     */ package com.mylo.base.module.impl.Movement;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.events.EventWorldRender;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.PathFind;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.network.play.client.C0BPacketEntityAction;
/*     */ import net.minecraft.network.play.server.S06PacketUpdateHealth;
/*     */ import net.minecraft.network.play.server.S08PacketPlayerPosLook;
/*     */ import net.minecraft.util.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Flight
/*     */   extends Module
/*     */ {
/*     */   TimeHelper timer;
/*     */   double startheight;
/*     */   double speed;
/*     */   boolean damagetaken;
/*     */   ArrayList<Packet> packets;
/*     */   private int ticker;
/*     */   double lastX;
/*     */   double lastZ;
/*     */   double lastDist;
/*     */   boolean done;
/*     */   boolean back;
/*     */   double mineplexspeed;
/*     */   double lastmineplexspeed;
/*     */   
/*     */   public Flight() {
/*  45 */     super("Fly", "lets you fly lmao", 33, Category.Movement);
/*     */ 
/*     */     
/*  48 */     this.timer = new TimeHelper();
/*  49 */     this.startheight = 0.0D;
/*  50 */     this.speed = 0.0D;
/*  51 */     this.damagetaken = false;
/*  52 */     this.packets = new ArrayList<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setup() {
/*  63 */     super.setup();
/*  64 */     ArrayList<String> options = new ArrayList<>();
/*  65 */     options.add("vanilla");
/*  66 */     options.add("mccentral");
/*  67 */     options.add("cubecraft");
/*  68 */     options.add("hypixel");
/*  69 */     options.add("mineplex");
/*  70 */     options.add("spartan");
/*  71 */     options.add("redeskyncp");
/*  72 */     options.add("tpglide");
/*  73 */     options.add("dmgglide");
/*  74 */     options.add("packetfly");
/*  75 */     options.add("bungeefly");
/*  76 */     options.add("jitter");
/*  77 */     options.add("lolmac");
/*  78 */     Main.setmgr.rSetting(new Setting(this.name, this, "vanilla", options));
/*  79 */     Main.setmgr.rSetting(new Setting("cubecraft fly", this, "slowsafe", Lists.newArrayList((Object[])new String[] { "slowsafe", "damageslowmo", "damage", "damage2", "damage3", "experimental", "new" }))
/*     */         {
/*     */           public Boolean isVisible() {
/*  82 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("cubecraft"));
/*     */           }
/*     */         });
/*  85 */     Main.setmgr.rSetting(new Setting("packetfly amount", this, 1.0D, 1.0D, 20.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/*  88 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("packetfly"));
/*     */           }
/*     */         });
/*  91 */     Main.setmgr.rSetting(new Setting("packetfly speed", this, 1.0D, 1.0D, 100.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/*  94 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("packetfly"));
/*     */           }
/*     */         });
/*  97 */     Main.setmgr.rSetting(new Setting("packetfly delay", this, 1.0D, 1.0D, 20.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/* 100 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("packetfly"));
/*     */           }
/*     */         });
/* 103 */     Main.setmgr.rSetting(new Setting("fly speed", this, 1.0D, 0.0D, 8.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/* 106 */             return (!Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("vanilla") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("mineplex") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("tpglide") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("dmgglide") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().startsWith("spartan") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().startsWith("mccentral") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().startsWith("bungeefly")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/* 109 */     Main.setmgr.rSetting(new Setting("blinkfly", this, false));
/* 110 */     Main.setmgr.rSetting(new Setting("viewbobbing", this, false));
/* 111 */     Main.setmgr.rSetting(new Setting("hypixel speed", this, 1.0D, 0.0D, 8.0D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/* 114 */             return (!Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("hypixel") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("redeskyncp")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/* 117 */     Main.setmgr.rSetting(new Setting("hypixel decay", this, 1.0D, 0.9D, 1.0D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/* 120 */             return (!Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("hypixel") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("redeskyncp")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/* 123 */     Main.setmgr.rSetting(new Setting("hypixel damage", this, true)
/*     */         {
/*     */           public Boolean isVisible() {
/* 126 */             return (!Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("hypixel") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("redeskyncp")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/* 129 */     Main.setmgr.rSetting(new Setting("wait for damage", this, true)
/*     */         {
/*     */           public Boolean isVisible() {
/* 132 */             return (!Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("hypixel") && !Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("redeskyncp")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/* 135 */     Main.setmgr.rSetting(new Setting("timer duration", this, 200.0D, 50.0D, 1000.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/* 138 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("hypixel"));
/*     */           }
/*     */         });
/* 141 */     Main.setmgr.rSetting(new Setting("timer amount", this, 1.5D, 1.0D, 5.0D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/* 144 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Flight.this.name).getValString().equalsIgnoreCase("hypixel"));
/*     */           }
/*     */         });
/*     */   } @EventTarget
/*     */   public void RenderWorld(EventWorldRender e) {
/*     */     String str2;
/*     */     String str1;
/* 151 */     switch ((str1 = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -1031473397: if (!str1.equals("cubecraft"))
/*     */           break; 
/* 153 */         switch ((str2 = Main.setmgr.getSettingByName("cubecraft fly").getValString()).hashCode()) { case 108960: if (!str2.equals("new")) {
/*     */               break;
/*     */             }
/* 156 */             if (this.mc.thePlayer.ticksExisted % 3 != 0) this.mc.thePlayer.ticksExisted % 3;
/*     */             
/*     */             break; }
/*     */         
/*     */         break; }
/*     */   
/*     */   }
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
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/* 175 */     if (e.isPost() && 
/* 176 */       Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft")) Main.setmgr.getSettingByName("cubecraft fly").getValString().equalsIgnoreCase("new");
/*     */ 
/*     */ 
/*     */     
/* 180 */     if (e.isPre())
/* 181 */     { String str2; double speedy; this.lastDist = Moveutils.getPlayerAbsoluteSpeed();
/* 182 */       double flyspeed = Math.max(Moveutils.getBaseMoveSpeed() * 0.9D, Main.setmgr.getSettingByName("fly speed").getValDouble());
/* 183 */       if (Main.setmgr.getSettingByName("viewbobbing").getValBoolean())
/* 184 */         this.mc.thePlayer.cameraYaw = 0.1F; 
/*     */       String str1;
/* 186 */       switch ((str1 = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -2066161778: if (!str1.equals("redeskyncp")) {
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
/* 359 */           Moveutils.setSpeed(Moveutils.getBaseMoveSpeed() * 0.9D);
/* 360 */           if (!this.mc.thePlayer.onGround) {
/* 361 */             switch (this.mc.thePlayer.ticksExisted % 3) {
/*     */               case 0:
/* 363 */                 this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-13D, this.mc.thePlayer.posZ);
/*     */                 break;
/*     */               case 1:
/* 366 */                 this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 1.0E-14D, this.mc.thePlayer.posZ);
/*     */                 break;
/*     */               case 2:
/* 369 */                 this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-13D, this.mc.thePlayer.posZ);
/*     */                 break;
/*     */             } 
/*     */           
/*     */           }
/* 374 */           this.mc.thePlayer.motionY = 0.0D; break;
/*     */         case -2011701869:
/*     */           if (!str1.equals("spartan"));
/*     */           break;
/*     */         case -1362669950:
/*     */           if (!str1.equals("mineplex"))
/*     */             break; 
/* 381 */           Main.enableFakeaim(true);
/* 382 */           Main.setFakeaim(-90.0F, (this.mc.thePlayer.rotationYaw + 180.0F) % 360.0F);
/*     */           break;
/*     */ 
/*     */         
/*     */         case -1118846295:
/*     */           if (!str1.equals("tpglide")) {
/*     */             break;
/*     */           }
/* 390 */           this.mc.thePlayer.onGround = true; break;case -1031473397: if (!str1.equals("cubecraft")) break;  if (Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("damage") && !this.damagetaken) { float times = 25.0F; float falldistance = 1.5F; float offset = 8.13857E-4F; for (int i = 0; i < times; i++); this.damagetaken = true; break; }  switch ((str2 = Main.setmgr.getSettingByName("cubecraft fly").getValString()).hashCode()) { case -1339126929: if (!str2.equals("damage")); break;case -1082867442: if (!str2.equals("slowsafe")) break;  speedy = 2.0D; this.mc.thePlayer.motionY = 0.0D; this.mc.timer.timerSpeed = 0.3F; if (this.mc.thePlayer.posY < this.startheight + 1.0D) { this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.5D, this.mc.thePlayer.posZ); } else { this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 0.5D, this.mc.thePlayer.posZ); }  Moveutils.setSpeed(2.0D); break;case -404562712: if (!str2.equals("experimental")); break;case 108960: if (!str2.equals("new")); break;case 303134610: if (!str2.equals("damageslowmo")); break;case 1436738211: if (!str2.equals("damage2")) break;  if (this.mc.thePlayer.onGround) { this.mc.timer.timerSpeed = 0.3F; Moveutils.setSpeed(Moveutils.getPlayerSpeed() + 2.0D); if (Moveutils.getPlayerSpeed() > 2.5D) { this.mc.thePlayer.motionY = Moveutils.getJumpMotion(); this.startheight = 0.0D; }  break; }  if (this.startheight < 5.0D) { this.mc.timer.timerSpeed = 0.5F; this.mc.thePlayer.motionY = 0.0D; if (this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-10D, this.mc.thePlayer.posZ);  Moveutils.setSpeed(Moveutils.getPlayerSpeed()); } else { this.mc.timer.timerSpeed = 0.3F; this.mc.thePlayer.motionY = 0.0D; if (this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-10D, this.mc.thePlayer.posZ);  if (this.startheight < 10.0D) { Moveutils.setSpeed(Moveutils.getPlayerSpeed()); } else { Moveutils.setSpeed(2.0D); }  }  this.startheight++; break;case 1436738212: if (!str2.equals("damage3")) break;  this.mc.thePlayer.motionY = 0.0D; if (this.mc.thePlayer.ticksExisted % 2 == 0)
/*     */                 this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-10D, this.mc.thePlayer.posZ);  if (this.startheight < 5.0D) { Moveutils.setSpeed(Moveutils.getPlayerSpeed() + 0.2D); } else { this.mc.thePlayer.ticksExisted % 5; }  Moveutils.setSpeed(Moveutils.getPlayerSpeed()); this.startheight++; break; }  break;case -811725465: if (!str1.equals("dmgglide")); break;case 233102203: if (!str1.equals("vanilla"))
/*     */             break;  this.mc.thePlayer.motionY = 0.0D; if (this.mc.thePlayer.movementInput.jump)
/*     */             this.mc.thePlayer.motionY += flyspeed / 2.0D;  if (this.mc.thePlayer.movementInput.sneak)
/*     */             this.mc.thePlayer.motionY -= flyspeed / 2.0D;  Moveutils.setSpeed(flyspeed); break;case 1381910549: if (!str1.equals("hypixel")); break;case 1960741663: if (!str1.equals("mccentral"))
/*     */             break;  this.mc.thePlayer.motionY += 0.072D; if (this.mc.thePlayer.movementInput.jump)
/*     */             this.mc.thePlayer.motionY += 0.06D;  if (this.mc.thePlayer.movementInput.sneak)
/*     */             this.mc.thePlayer.motionY -= 0.06D;  Moveutils.addSpeed(flyspeed * 0.01D); Moveutils.moveKeysDown(); if (!this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().expand(-0.05D, 0.05D, -0.05D)).isEmpty())
/* 398 */             this.mc.thePlayer.jump();  break; }  }  } @EventTarget public void onMove(EventMove e) { if (e.isPre())
/* 399 */     { double diff2, diff; String str2; double multy; boolean go; double forward, multiply, up, down, startfor, startup, startdown, flyspeed = Math.max(Moveutils.getBaseMoveSpeed() * 0.9D, Main.setmgr.getSettingByName("fly speed").getValDouble()); String str1;
/* 400 */       switch ((str1 = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -2066161778: if (!str1.equals("redeskyncp")) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 769 */           if (Moveutils.moveKeysDown()) {
/* 770 */             Moveutils.setMoveSpeed(e, Math.max(this.speed, Moveutils.getBaseMoveSpeed() * 0.9D));
/* 771 */             this.speed *= Main.setmgr.getSettingByName("hypixel decay").getValDouble();
/*     */             break;
/*     */           } 
/* 774 */           this.speed = 0.0D; break;
/*     */         case -2011701869:
/*     */           if (!str1.equals("spartan"))
/*     */             break; 
/* 778 */           e.x = 0.0D;
/* 779 */           e.y = this.mc.thePlayer.motionY = 0.0D;
/* 780 */           e.z = 0.0D;
/* 781 */           if (this.mc.thePlayer.ticksExisted % 20 == 0)
/*     */           {
/* 783 */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * flyspeed, this.mc.thePlayer.posY + (this.mc.thePlayer.movementInput.sneak ? (-flyspeed / 2.0D) : 0.0D) + (this.mc.thePlayer.movementInput.jump ? (flyspeed / 2.0D) : 0.0D), this.mc.thePlayer.posZ + Moveutils.getZDir() * flyspeed); }  break;case -1400153593: if (!str1.equals("bungeefly")) break;  if (this.mc.thePlayer.isCollidedVertically) { this.startheight = this.mc.thePlayer.posY; this.speed = this.mc.thePlayer.ticksExisted; }  diff2 = this.startheight - this.mc.thePlayer.posY; e.y = this.mc.thePlayer.motionY = diff2; e.y = this.mc.thePlayer.motionY -= Math.sin(((float)(this.mc.thePlayer.ticksExisted - this.speed) / 5.0F)) * 1.0D; if (this.mc.thePlayer.movementInput.jump) this.startheight += 0.1D;  if (this.mc.thePlayer.movementInput.sneak) this.startheight -= 0.1D;  Moveutils.setMoveSpeed(e, flyspeed); break;case -1362669950: if (!str1.equals("mineplex")) break;  flyspeed *= 0.5D; if (Moveutils.airSlot() == -10) { Moveutils.setMoveSpeed2(e, 0.0D); return; }  if (!this.done) { Moveutils.clickGround(); Moveutils.setSpeedAt(e, this.mc.thePlayer.rotationYaw, this.back ? -this.mineplexspeed : this.mineplexspeed); this.back = !this.back; if (this.mc.thePlayer.onGround && this.mc.thePlayer.ticksExisted % 2 == 0) { double mineplexaccel = 0.2D; this.mineplexspeed += mineplexaccel; }  double speeders = flyspeed; if (this.mineplexspeed >= speeders * 1.3D && this.mc.thePlayer.onGround) { e.setY(this.mc.thePlayer.motionY = 0.42500001192092896D); Moveutils.setMoveSpeed2(e, 0.0D); this.done = true; }  this.mc.timer.timerSpeed = 0.6F; e.y += 0.00351D; break; }  this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C0BPacketEntityAction((Entity)this.mc.thePlayer, C0BPacketEntityAction.Action.RIDING_JUMP)); this.mc.timer.timerSpeed = 0.6F; e.y = this.mc.thePlayer.motionY = 0.0D; if (this.mc.thePlayer.movementInput.jump) e.y += 0.2D;  if (this.mc.thePlayer.movementInput.sneak) e.y -= 0.2D;  Moveutils.setMoveSpeed2(e, this.mineplexspeed *= (this.mineplexspeed < 1.0D) ? 0.99D : ((this.mineplexspeed < 2.0D) ? 0.985D : ((this.mineplexspeed < 2.5D) ? 0.972D : 0.97D))); if (this.mc.thePlayer.onGround) setState(false);  break;case -1159737108: if (!str1.equals("jitter")) break;  diff = this.startheight - this.mc.thePlayer.posY; e.y = this.mc.thePlayer.motionY = diff; e.y += Math.sin(this.mc.thePlayer.ticksExisted) / 10.0D; Moveutils.setMoveSpeed(e, flyspeed);case -1118846295: if (!str1.equals("tpglide")) break;  e.setY(this.mc.thePlayer.motionY = 0.0D); Moveutils.setMoveSpeed(e, flyspeed); if (this.mc.thePlayer.movementInput.jump && this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPositionAndUpdate(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0D, this.mc.thePlayer.posZ);  if (this.mc.thePlayer.movementInput.sneak && this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPositionAndUpdate(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 1.0D, this.mc.thePlayer.posZ);  if (this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPositionAndUpdate(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-10D, this.mc.thePlayer.posZ);  break;case -1097182874: if (!str1.equals("lolmac")) break;  e.y = this.mc.thePlayer.motionY = -0.02D; if (this.mc.thePlayer.ticksExisted % 10 == 0) { e.y = 0.2D; if (this.mc.thePlayer.movementInput.jump) e.y += 0.05D;  }  Moveutils.setMoveSpeed(e, flyspeed); break;case -1031473397: if (!str1.equals("cubecraft")) break;  switch ((str2 = Main.setmgr.getSettingByName("cubecraft fly").getValString()).hashCode()) { case -1339126929: if (!str2.equals("damage")) break;  switch (this.ticker) { case 0: if (this.mc.thePlayer.onGround) this.speed = Moveutils.getBaseMoveSpeed();  break;case 1: if (this.mc.thePlayer.onGround) e.y = Moveutils.getJumpMotion();  this.speed *= 2.15D; break;case 2: this.speed *= 5.0D; e.setY(this.mc.thePlayer.motionY = 0.0D); if (this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-10D, this.mc.thePlayer.posZ);  break;default: if (this.ticker < 20) { this.speed = Moveutils.calculateFriction(this.speed, this.lastDist, false); } else { this.speed *= 0.96D; }  e.setY(this.mc.thePlayer.motionY = 0.0D); if (this.mc.thePlayer.ticksExisted % 2 == 0) this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.0E-10D, this.mc.thePlayer.posZ);  break; }  this.ticker = this.ticker + 1; Moveutils.setMoveSpeed(e, Math.max(this.speed, Moveutils.getBaseMoveSpeed() * 1.0D)); this.startheight++; break;case -1082867442: if (!str2.equals("slowsafe")); break;case -404562712: if (!str2.equals("experimental")) break;  this.mc.timer.timerSpeed = 0.3F; multiply = 2.0D; Moveutils.setMoveSpeed(e, 0.0D); e.setY(0.0D); switch (this.mc.thePlayer.ticksExisted % 4) { case 0: if (this.startheight + 1.0D < this.mc.thePlayer.posY) { this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 0.24D, this.mc.thePlayer.posZ); this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * multiply / 4.0D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * multiply / 4.0D); }  break;case 1: this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * multiply, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * multiply); break;case 2: if (this.startheight + 1.0D > this.mc.thePlayer.posY) { this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.26D, this.mc.thePlayer.posZ); this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * multiply / 4.0D, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * multiply / 4.0D); }  break;case 3: this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * multiply, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * multiply); break; }  break;case 108960: if (!str2.equals("new")) break;  Moveutils.setMoveSpeed(e, 0.0D); if (this.mc.thePlayer.ticksExisted % 3 == 0) { this.lastX = this.mc.thePlayer.posX; this.lastZ = this.mc.thePlayer.posZ; e.setY(this.startheight - this.mc.thePlayer.posY); Moveutils.setMoveSpeed(e, 2.0D); this.mc.thePlayer.motionY = 0.0D; } else { Moveutils.setMoveSpeed(e, 0.0D); }  if (this.mc.thePlayer.movementInput.jump) this.startheight += 0.2D;  if (this.mc.thePlayer.movementInput.sneak) this.startheight -= 0.2D;  break;case 303134610: if (!str2.equals("damageslowmo")) break;  this.mc.timer.timerSpeed = 0.3F; multy = 2.0D; Moveutils.setMoveSpeed(e, 0.0D); e.y = 0.0D; switch (this.mc.thePlayer.ticksExisted % 4) { case 0: this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY - 0.3D, this.mc.thePlayer.posZ);case 1: this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * multy, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * multy); break;case 2: this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.3D, this.mc.thePlayer.posZ);case 3: this.mc.thePlayer.setPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * multy, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * multy); break; }  break; }  break;case -811725465: if (!str1.equals("dmgglide"))
/*     */             break;  if (this.mc.thePlayer.isCollidedVertically)
/*     */             this.startheight = this.mc.thePlayer.posY;  if (this.mc.thePlayer.posY < this.startheight) { e.setY(Math.min(7.0D, this.startheight - this.mc.thePlayer.posY)); } else if (this.mc.thePlayer.posY > this.startheight) { e.setY(Math.max(-7.0D, this.startheight - this.mc.thePlayer.posY)); } else { e.setY(this.mc.thePlayer.motionY = 0.0D); }  if (this.mc.thePlayer.movementInput.sneak)
/*     */             this.startheight--;  if (this.mc.thePlayer.movementInput.jump)
/*     */             this.startheight++;  Moveutils.setSpeed(flyspeed); break;case 1381910549: if (!str1.equals("hypixel"))
/*     */             break;  if (!this.mc.thePlayer.onGround) { this.mc.thePlayer.motionY = 0.0D; switch (this.mc.thePlayer.ticksExisted % 3) { case 0: case 1: e.y = 1.0613486818346834E-4D; break;case 2: e.y = -5.0183468108346E-4D; break; }  }  if (!Main.setmgr.getSettingByName("wait for damage").getValBoolean() || this.damagetaken) { switch (this.ticker) { case 0: this.timer.reset(); this.speed = Moveutils.getBaseMoveSpeed() * 1.0D; break;case 1: if (this.mc.thePlayer.onGround && this.mc.thePlayer.isCollidedVertically)
/*     */                   e.y = this.mc.thePlayer.motionY = Moveutils.getJumpMotion();  this.speed *= 2.14999D; break;case 2: if (!Main.setmgr.getSettingByName("wait for damage").getValBoolean())
/*     */                   this.speed *= Main.setmgr.getSettingByName("hypixel speed").getValDouble() / (Main.setmgr.getSettingByName("wait for damage").getValBoolean() ? 4 : true);  break;default: this.speed = Moveutils.calculateFriction(this.speed, this.lastDist, Main.setmgr.getSettingByName("hypixel damage").getValBoolean()); break; }  Moveutils.setMoveSpeed(e, Math.max(this.speed, Moveutils.getBaseMoveSpeed())); } else { this.ticker = 0; Moveutils.setMoveSpeed(e, 0.0D); }  if (this.timer.hasReached((float)Main.setmgr.getSettingByName("timer duration").getValDouble())) { this.mc.timer.timerSpeed = 1.0F; } else { this.mc.timer.timerSpeed = (float)Main.setmgr.getSettingByName("timer amount").getValDouble(); }  this.ticker++; break;case 1806144235: if (!str1.equals("packetfly"))
/*     */             break;  this.mc.thePlayer.noClip = true; e.setX(0.0D); e.setY(this.mc.thePlayer.motionY = 0.0D); e.setZ(0.0D); go = (this.mc.thePlayer.ticksExisted % Main.setmgr.getSettingByName("packetfly delay").getValDouble() == 0.0D); forward = Main.setmgr.getSettingByName("packetfly speed").getValDouble() / 100.0D; up = 0.0D; down = 0.0D; if (this.mc.thePlayer.movementInput.sneak)
/*     */             down = -Main.setmgr.getSettingByName("packetfly speed").getValDouble() / 100.0D;  if (this.mc.thePlayer.movementInput.jump)
/* 793 */             up = Main.setmgr.getSettingByName("packetfly speed").getValDouble() / 100.0D;  startfor = forward; startup = up; startdown = down; if ((Moveutils.moveKeysDown() || up != 0.0D || down != 0.0D) && go) { if (Moveutils.moveKeysDown() && up + down != 0.0D) { up /= 2.0D; down /= 2.0D; forward /= 2.0D; startfor = forward; startup = up; startdown = down; }  for (int i = 0; i < Main.setmgr.getSettingByName("packetfly amount").getValDouble(); i++) { this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * forward, this.mc.thePlayer.posY + up + down, this.mc.thePlayer.posZ + Moveutils.getZDir() * forward, false)); forward += startfor; up += startup; down += startdown; }  e.setX(Moveutils.getXDir() * forward / 2.0D); e.setY((up + down) / 2.0D); e.setZ(Moveutils.getZDir() * forward / 2.0D); this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, 1000.0D, this.mc.thePlayer.posZ, true)); }  break; }  }  } @EventTarget public void onPacket(EventPacket e) { if (e.getPacket() instanceof S06PacketUpdateHealth && (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel") || (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") && Main.setmgr.getSettingByName("cubecraft fly").getValString().equalsIgnoreCase("damage")))) {
/* 794 */       S06PacketUpdateHealth p = (S06PacketUpdateHealth)e.getPacket();
/*     */       
/* 796 */       this.damagetaken = true;
/*     */     } 
/*     */     
/* 799 */     if (e.getPacket() instanceof S08PacketPlayerPosLook && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") && (Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("slowsafe") || Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("experimental"))) {
/* 800 */       this.damagetaken = true;
/*     */     }
/* 802 */     if (e.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition) {
/* 803 */       C03PacketPlayer.C04PacketPlayerPosition c04PacketPlayerPosition = (C03PacketPlayer.C04PacketPlayerPosition)e.getPacket();
/*     */     }
/*     */     
/* 806 */     if ((Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel") || Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft")) && 
/* 807 */       e.getPacket() instanceof net.minecraft.network.play.client.C0FPacketConfirmTransaction) {
/* 808 */       e.setCancelled(true);
/*     */     }
/*     */     
/* 811 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("packetfly") && 
/* 812 */       e.getPacket() instanceof S08PacketPlayerPosLook) {
/* 813 */       S08PacketPlayerPosLook p = (S08PacketPlayerPosLook)e.getPacket();
/* 814 */       e.setPacket((Packet)new S08PacketPlayerPosLook(p.getX(), p.getY(), p.getZ(), this.mc.thePlayer.rotationYaw, this.mc.thePlayer.rotationPitch, p.func_179834_f()));
/*     */     } 
/*     */     
/* 817 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("dmgglide") && 
/* 818 */       e.getPacket() instanceof S08PacketPlayerPosLook) {
/* 819 */       S08PacketPlayerPosLook p = (S08PacketPlayerPosLook)e.getPacket();
/* 820 */       for (Vec3 vec3 : PathFind.computePath(new Vec3(p.getX(), p.getY(), p.getZ()), this.mc.thePlayer.getPositionVector(), 3.0D, false));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 826 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex") && 
/* 827 */       e.getPacket() instanceof S08PacketPlayerPosLook) {
/* 828 */       setState(false);
/*     */     }
/*     */     
/* 831 */     if (Main.setmgr.getSettingByName("blinkfly").getValBoolean() && !e.isCancelled() && 
/* 832 */       e.isOut() && this.mc.thePlayer != null) {
/* 833 */       e.setCancelled(true);
/* 834 */       this.packets.add(e.getPacket());
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 841 */     super.onDisable();
/* 842 */     Main.enableFakeaim(false);
/* 843 */     if (this.mc.thePlayer != null) {
/* 844 */       this.mc.thePlayer.motionX = 0.0D;
/* 845 */       this.mc.thePlayer.motionZ = 0.0D;
/* 846 */       this.mc.timer.timerSpeed = 1.0F;
/* 847 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft")) {
/* 848 */         if (Main.setmgr.getSettingByName("cubecraft fly").getValString().equalsIgnoreCase("damage")) {
/* 849 */           this.mc.thePlayer.motionY = -1.0D;
/*     */         }
/*     */       } else {
/* 852 */         Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("dmgglide");
/*     */       } 
/*     */     } 
/*     */     
/* 856 */     if (!this.mc.isSingleplayer()) {
/* 857 */       for (Packet p : this.packets) {
/* 858 */         this.mc.thePlayer.sendQueue.addToSendQueue(p);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/* 865 */     this.timer.reset();
/* 866 */     this.ticker = 0;
/* 867 */     super.onEnable();
/* 868 */     if (this.mc.thePlayer == null) {
/* 869 */       setState(false);
/* 870 */       this.lastX = this.mc.thePlayer.posX;
/* 871 */       this.lastZ = this.mc.thePlayer.posZ;
/*     */     } 
/* 873 */     this.packets = new ArrayList<>();
/* 874 */     if (this.mc.thePlayer != null) {
/* 875 */       this.startheight = this.mc.thePlayer.posY;
/*     */     }
/* 877 */     this.speed = 0.0D;
/* 878 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("bungeefly")) {
/* 879 */       this.speed = this.mc.thePlayer.ticksExisted;
/*     */     }
/* 881 */     if (this.mc.thePlayer != null && (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") || Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex"))) {
/* 882 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") && Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("damage")) {
/* 883 */         if (this.mc.thePlayer.onGround) {
/* 884 */           float times = 25.0F;
/* 885 */           float falldistance = 1.6F;
/* 886 */           float offset = 8.13857E-4F;
/* 887 */           for (int i = 0; i < times; i++);
/*     */ 
/*     */ 
/*     */           
/* 891 */           Moveutils.damage();
/*     */           
/* 893 */           this.damagetaken = false;
/*     */           
/* 895 */           if (Main.setmgr.getSettingByName("cubecraft fly").getValString().equalsIgnoreCase("damage3")) {
/* 896 */             this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/* 897 */             this.speed = 2.5D;
/*     */           } 
/*     */           
/* 900 */           if (Main.setmgr.getSettingByName("cubecraft fly").getValString().equalsIgnoreCase("damage")) {
/* 901 */             this.ticker = 0;
/*     */           }
/*     */           
/* 904 */           this.mc.thePlayer.motionX = this.mc.thePlayer.posX - this.mc.thePlayer.lastTickPosX;
/* 905 */           this.mc.thePlayer.motionZ = this.mc.thePlayer.posZ - this.mc.thePlayer.lastTickPosZ;
/* 906 */           this.startheight = 0.0D;
/* 907 */           if (Main.setmgr.getSettingByName("cubecraft fly").getValString().equalsIgnoreCase("experimental")) {
/* 908 */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + Moveutils.getJumpMotion(), this.mc.thePlayer.posZ);
/*     */           }
/*     */         }
/*     */       
/* 912 */       } else if (!Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") || (!Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("experimental") && !Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("slowsafe") && Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("new"))) {
/* 913 */         this.startheight = 0.0D;
/* 914 */         if (Main.setmgr.getSettingByName("cubecraft fly").getValString().startsWith("new") && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") && 
/* 915 */           this.mc.thePlayer != null) {
/* 916 */           this.startheight = this.mc.thePlayer.posY;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 921 */     this.damagetaken = false;
/* 922 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex")) {
/* 923 */       this.mineplexspeed = 0.0D;
/* 924 */       this.lastmineplexspeed = -10.0D;
/* 925 */       this.done = false;
/* 926 */       this.back = false;
/*     */     } 
/* 928 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel")) {
/* 929 */       this.ticker = 0;
/* 930 */       this.startheight = this.mc.thePlayer.posY;
/* 931 */       this.damagetaken = false;
/* 932 */       if (this.mc.thePlayer.onGround)
/*     */       {
/*     */         
/* 935 */         this.speed = Main.setmgr.getSettingByName("hypixel speed").getValDouble() * Moveutils.getBaseMoveSpeed();
/*     */         
/* 937 */         if (Main.setmgr.getSettingByName("hypixel damage").getValBoolean()) {
/* 938 */           Moveutils.damage();
/*     */         
/*     */         }
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 945 */     else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("redeskyncp") && 
/* 946 */       this.mc.thePlayer.onGround) {
/*     */       
/* 948 */       this.speed = Main.setmgr.getSettingByName("hypixel speed").getValDouble();
/* 949 */       if (Main.setmgr.getSettingByName("hypixel damage").getValBoolean())
/* 950 */         Moveutils.damage(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Flight.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */