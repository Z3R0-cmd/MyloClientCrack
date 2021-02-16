/*     */ package com.mylo.base.module.impl.Movement;
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ 
/*     */ public class Speed extends Module {
/*     */   TimeHelper timer;
/*     */   double ypos;
/*     */   boolean doslow;
/*     */   double speed;
/*     */   double jumpsspeed;
/*     */   boolean firstjump;
/*     */   
/*     */   public Speed() {
/*  28 */     super("Speed", "makes you zoom lmao", 47, Category.Movement);
/*     */ 
/*     */     
/*  31 */     this.timer = new TimeHelper();
/*  32 */     this.ypos = 0.0D;
/*     */     
/*  34 */     this.speed = 0.0D; this.jumpsspeed = 0.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setup() {
/*  40 */     super.setup();
/*  41 */     ArrayList<String> options = new ArrayList<>();
/*  42 */     options.add("bhop");
/*  43 */     options.add("fasthop");
/*  44 */     options.add("cubecraft");
/*  45 */     options.add("hypixel");
/*  46 */     options.add("mineplex");
/*  47 */     options.add("mineplex2");
/*  48 */     options.add("spartan");
/*  49 */     options.add("yport");
/*  50 */     options.add("groundboost");
/*  51 */     options.add("ncp");
/*  52 */     options.add("aacwall");
/*  53 */     options.add("packetspeed");
/*  54 */     options.add("hiveaac");
/*  55 */     Main.setmgr.rSetting(new Setting(this.name, this, "fasthop", options));
/*  56 */     Main.setmgr.rSetting(new Setting("cubecraft mode", this, "groundboost", Lists.newArrayList((Object[])new String[] { "groundboost", "bhop", "yport" }))
/*     */         {
/*     */           public Boolean isVisible() {
/*  59 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Speed.this.name).getValString().equalsIgnoreCase("cubecraft"));
/*     */           }
/*     */         });
/*  62 */     Main.setmgr.rSetting(new Setting("packetspeed amount", this, 1.0D, 1.0D, 20.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/*  65 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Speed.this.name).getValString().equalsIgnoreCase("packetspeed"));
/*     */           }
/*     */         });
/*  68 */     Main.setmgr.rSetting(new Setting("packetspeed speed", this, 1.0D, 1.0D, 30.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/*  71 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Speed.this.name).getValString().equalsIgnoreCase("packetspeed"));
/*     */           }
/*     */         });
/*  74 */     Main.setmgr.rSetting(new Setting("packetspeed delay", this, 1.0D, 1.0D, 20.0D, true)
/*     */         {
/*     */           public Boolean isVisible() {
/*  77 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Speed.this.name).getValString().equalsIgnoreCase("packetspeed"));
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  84 */     if (e.isPre()) {
/*  85 */       switch (Main.setmgr.getSettingByName(this.name).getValString()) {
/*     */         case "bhop":
/*  87 */           if (!this.mc.thePlayer.isInWater() && !this.mc.thePlayer.isInLava()) {
/*  88 */             Random r = new Random();
/*  89 */             if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/*  90 */               this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/*     */               
/*     */               break;
/*     */             } 
/*  94 */             Moveutils.setSpeed(0.6D);
/*     */           } 
/*     */           break;
/*     */ 
/*     */         
/*     */         case "fasthop":
/* 100 */           if (!this.mc.thePlayer.isInWater() && !this.mc.thePlayer.isInLava()) {
/* 101 */             Random r = new Random();
/* 102 */             if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 103 */               this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/*     */               
/*     */               break;
/*     */             } 
/* 107 */             Moveutils.setSpeed(2.0D);
/* 108 */             if (!Moveutils.moveKeysDown()) {
/* 109 */               Moveutils.setSpeed(0.0D);
/*     */             }
/*     */           } 
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case "cubecraft":
/* 131 */           switch (Main.setmgr.getSettingByName("cubecraft mode").getValString()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             case "yport":
/* 146 */               if (this.mc.thePlayer.onGround) {
/* 147 */                 this.ypos = this.mc.thePlayer.posY;
/* 148 */                 this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/*     */                 
/* 150 */                 if (this.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
/* 151 */                   if (Moveutils.getPlayerSpeed() < 0.5D) {
/* 152 */                     Moveutils.setSpeed(Moveutils.getPlayerSpeed() + 0.5D);
/*     */                     break;
/*     */                   } 
/* 155 */                   Moveutils.setSpeed(this.mc.thePlayer.isPotionActive(Potion.moveSpeed) ? (0.6D + 0.1D * this.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier()) : 0.45D);
/*     */                   
/*     */                   break;
/*     */                 } 
/* 159 */                 Moveutils.setSpeed(0.45D);
/*     */                 
/*     */                 break;
/*     */               } 
/* 163 */               this.mc.thePlayer.posY = this.ypos;
/* 164 */               this.mc.thePlayer.motionY = -0.41D;
/*     */               break;
/*     */ 
/*     */             
/*     */             case "bhop":
/* 169 */               if (Moveutils.moveKeysDown());
/*     */               break;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case "hypixel":
/* 190 */           this.jumpsspeed = Moveutils.getPlayerAbsoluteSpeed();
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case "yport":
/* 199 */           if (this.mc.thePlayer.onGround) {
/* 200 */             this.ypos = this.mc.thePlayer.posY;
/* 201 */             this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/*     */             
/* 203 */             Moveutils.setSpeed(0.6D);
/*     */             break;
/*     */           } 
/* 206 */           Moveutils.setSpeed(0.4D);
/* 207 */           this.mc.thePlayer.posY = this.ypos;
/* 208 */           this.mc.thePlayer.motionY = -1.0D;
/*     */           break;
/*     */         
/*     */         case "groundboost":
/* 212 */           if (this.mc.thePlayer.onGround) {
/* 213 */             this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/*     */             
/* 215 */             Moveutils.setSpeed(Moveutils.getBaseMoveSpeed() * 1.6D);
/*     */             break;
/*     */           } 
/* 218 */           Moveutils.setSpeed(Moveutils.getPlayerSpeed() * 1.1D);
/* 219 */           this.mc.thePlayer.motionY = -1.0D;
/*     */           break;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/* 228 */     if (e.isPre()) {
/* 229 */       double max; boolean go; double forward; double startfor; switch (Main.setmgr.getSettingByName(this.name).getValString()) {
/*     */         case "cubecraft":
/* 231 */           switch (Main.setmgr.getSettingByName("cubecraft mode").getValString()) {
/*     */ 
/*     */ 
/*     */             
/*     */             case "bhop":
/* 236 */               if (Moveutils.moveKeysDown()) {
/*     */                 
/* 238 */                 if (this.mc.thePlayer.onGround && this.firstjump) {
/* 239 */                   e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/* 240 */                   this.speed = Moveutils.getBaseMoveSpeed() * (this.mc.thePlayer.isPotionActive(Potion.moveSpeed) ? 1.5D : 1.5D);
/*     */                 
/*     */                 }
/* 243 */                 else if (this.firstjump) {
/* 244 */                   this.firstjump = false;
/*     */                 } else {
/*     */                   
/* 247 */                   this.firstjump = true;
/*     */                 } 
/*     */ 
/*     */                 
/* 251 */                 if (this.ypos > 3.0D) {
/* 252 */                   this.speed *= 0.1D;
/*     */                 } else {
/*     */                   
/* 255 */                   this.speed *= 0.99D;
/*     */                 } 
/*     */                 
/* 258 */                 Moveutils.setMoveSpeed(e, Math.max(this.speed, Moveutils.getBaseMoveSpeed()));
/*     */               } 
/*     */               break;
/*     */           } 
/*     */           break;
/*     */         case "mineplex":
/* 264 */           this.mc.timer.timerSpeed = 1.0F;
/* 265 */           if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/*     */             
/* 267 */             e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/*     */             
/* 269 */             if (this.firstjump) {
/* 270 */               this.speed = 0.6D;
/* 271 */               this.firstjump = false;
/*     */             } 
/* 273 */             this.speed = this.doslow ? 0.5D : (this.speed + 0.6D);
/* 274 */             this.mc.timer.timerSpeed = 2.0F;
/* 275 */             Moveutils.setMoveSpeed(e, 0.0D);
/* 276 */             this.doslow = false;
/*     */             
/*     */             return;
/*     */           } 
/* 280 */           if (!Moveutils.moveKeysDown() || this.mc.thePlayer.isCollidedHorizontally) {
/* 281 */             this.speed = 0.6D;
/* 282 */             this.firstjump = true;
/* 283 */             this.doslow = true;
/*     */           } 
/* 285 */           max = 100.0D;
/* 286 */           this.speed = Math.min(this.speed, max);
/* 287 */           this.speed = Math.max(this.speed, Moveutils.getBaseMoveSpeed());
/* 288 */           this.speed -= this.speed / 64.0D;
/*     */           
/* 290 */           if (this.speed > 2.2D) {
/* 291 */             this.speed *= 0.98D;
/*     */           }
/*     */           
/* 294 */           Moveutils.setMoveSpeed(e, this.speed);
/*     */           
/* 296 */           if (!this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 297 */             if (this.mc.thePlayer.fallDistance < 0.0F) {
/* 298 */               e.setY(this.mc.thePlayer.motionY += 0.038D);
/*     */             }
/* 300 */             if (this.mc.thePlayer.fallDistance <= 1.4D) {
/* 301 */               e.setY(this.mc.thePlayer.motionY += 0.032D);
/*     */             }
/*     */           } 
/*     */           break;
/*     */         case "mineplex2":
/* 306 */           if (this.mc.thePlayer.onGround && Moveutils.clickGround()) {
/* 307 */             this.speed += 0.1D;
/* 308 */             if (!Moveutils.moveKeysDown()) {
/* 309 */               this.speed = Moveutils.getBaseMoveSpeed();
/*     */             }
/* 311 */             else if (this.speed > 1.5D) {
/* 312 */               this.speed = 1.5D;
/*     */             } 
/*     */           } else {
/*     */             
/* 316 */             this.speed = 0.2D;
/*     */           } 
/* 318 */           Moveutils.setMoveSpeed(e, this.speed);
/*     */           break;
/*     */ 
/*     */         
/*     */         case "groundboost":
/* 323 */           if (!this.mc.thePlayer.isInWater() && !this.mc.thePlayer.isInLava() && 
/* 324 */             Moveutils.moveKeysDown()) {
/* 325 */             if (this.ypos == 2.0D) {
/* 326 */               this.speed *= 2.149D;
/* 327 */               this.ypos = 3.0D; break;
/*     */             } 
/* 329 */             if (this.ypos == 3.0D) {
/* 330 */               this.ypos = 2.0D;
/* 331 */               double difference = 0.66D * (this.jumpsspeed - Moveutils.getBaseMoveSpeed());
/* 332 */               this.speed = this.jumpsspeed - difference;
/*     */               break;
/*     */             } 
/* 335 */             List collidingList = this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().offset(0.0D, this.mc.thePlayer.motionY, 0.0D));
/* 336 */             if (collidingList.size() > 0 || this.mc.thePlayer.isCollidedVertically) {
/* 337 */               this.ypos = 1.0D;
/*     */             }
/*     */           } 
/*     */           break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case "ncp":
/* 347 */           if (Moveutils.moveKeysDown()) {
/* 348 */             double difference; List<AxisAlignedBB> collidingList; switch ((int)this.ypos) {
/*     */               case 0:
/* 350 */                 this.speed = 1.0D * Moveutils.getBaseMoveSpeed() - 0.01D;
/* 351 */                 this.mc.timer.timerSpeed = 1.5F;
/*     */                 break;
/*     */               case 1:
/* 354 */                 this.mc.timer.timerSpeed = 1.0F;
/* 355 */                 e.y = this.mc.thePlayer.motionY = Moveutils.getJumpMotion() - 0.02D;
/* 356 */                 this.speed *= 2.15D;
/*     */               
/*     */               case 2:
/* 359 */                 this.mc.timer.timerSpeed = 1.5F;
/* 360 */                 difference = 0.66D * (this.jumpsspeed - Moveutils.getBaseMoveSpeed());
/* 361 */                 this.speed = this.jumpsspeed - difference;
/*     */                 break;
/*     */               case 3:
/* 364 */                 this.mc.timer.timerSpeed = 1.5F;
/*     */               case 4:
/* 366 */                 this.mc.timer.timerSpeed = 1.0F;
/*     */               default:
/* 368 */                 collidingList = this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().offset(0.0D, this.mc.thePlayer.motionY, 0.0D));
/* 369 */                 if ((collidingList.size() > 0 || this.mc.thePlayer.isCollidedVertically) && this.ypos > 0.0D) {
/* 370 */                   if (1.35D * Moveutils.getBaseMoveSpeed() - 0.01D > this.speed) {
/* 371 */                     this.ypos = 0.0D;
/*     */                   } else {
/*     */                     
/* 374 */                     this.ypos = ((this.mc.thePlayer.moveForward != 0.0F || this.mc.thePlayer.moveStrafing != 0.0F) ? true : false);
/*     */                   } 
/*     */                 }
/* 377 */                 this.speed = this.jumpsspeed - this.jumpsspeed / 174.9D;
/*     */                 break;
/*     */             } 
/* 380 */             if (this.ypos == 8.0D) {
/* 381 */               this.speed = Moveutils.getBaseMoveSpeed();
/*     */             }
/* 383 */             this.speed = Math.max(this.speed, Moveutils.getBaseMoveSpeed());
/* 384 */             Moveutils.setMoveSpeed(e, Math.max(this.speed, Moveutils.getBaseMoveSpeed()));
/* 385 */             this.ypos++;
/*     */           } 
/*     */           break;
/*     */         
/*     */         case "aacwall":
/* 390 */           if (this.mc.thePlayer.onGround && this.mc.thePlayer.isCollidedHorizontally) {
/* 391 */             Moveutils.setMoveSpeed(e, 0.4D);
/*     */           }
/*     */           break;
/*     */         case "hypixel":
/* 395 */           if (Moveutils.moveKeysDown()) {
/* 396 */             double difference; List<AxisAlignedBB> collidingList; switch ((int)this.ypos) {
/*     */               case 0:
/* 398 */                 this.speed = 1.0D * Moveutils.getBaseMoveSpeed() - 0.01D;
/*     */                 break;
/*     */               case 1:
/* 401 */                 if (this.mc.thePlayer.onGround) {
/*     */ 
/*     */                   
/* 404 */                   this.mc.thePlayer.jump();
/* 405 */                   e.y = this.mc.thePlayer.motionY;
/* 406 */                   this.speed = Moveutils.getBaseMoveSpeed() * 2.15D - 1.0E-5D;
/*     */                 } 
/*     */                 break;
/*     */ 
/*     */ 
/*     */               
/*     */               case 2:
/* 413 */                 difference = 0.66D * (this.jumpsspeed - Moveutils.getBaseMoveSpeed());
/* 414 */                 this.speed = this.jumpsspeed - difference;
/*     */                 break;
/*     */               
/*     */               default:
/* 418 */                 collidingList = this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().offset(0.0D, this.mc.thePlayer.motionY, 0.0D));
/* 419 */                 if ((collidingList.size() > 0 || this.mc.thePlayer.isCollidedVertically) && this.ypos > 0.0D) {
/* 420 */                   if (1.35D * Moveutils.getBaseMoveSpeed() - 0.01D > this.speed) {
/* 421 */                     this.ypos = 0.0D;
/*     */                   } else {
/*     */                     
/* 424 */                     this.ypos = ((this.mc.thePlayer.moveForward != 0.0F || this.mc.thePlayer.moveStrafing != 0.0F) ? true : false);
/*     */                   } 
/*     */                 }
/* 427 */                 this.speed = this.jumpsspeed - this.jumpsspeed / 206.7D;
/*     */                 break;
/*     */             } 
/*     */ 
/*     */             
/* 432 */             if (this.ypos == 8.0D) {
/* 433 */               this.speed = Moveutils.getBaseMoveSpeed();
/*     */             }
/* 435 */             this.speed = Math.max(this.speed, Moveutils.getBaseMoveSpeed());
/*     */             
/* 437 */             Moveutils.setMoveSpeed(e, Math.max(this.speed, Moveutils.getBaseMoveSpeed()));
/*     */             
/* 439 */             this.ypos++;
/*     */           } 
/*     */           
/* 442 */           e.setY(e.getY() + 6.81376E-6D);
/*     */           break;
/*     */         case "packetspeed":
/* 445 */           this.mc.thePlayer.noClip = true;
/* 446 */           e.setX(0.0D);
/* 447 */           e.setY(this.mc.thePlayer.motionY = 0.0D);
/* 448 */           e.setZ(0.0D);
/* 449 */           go = (this.mc.thePlayer.ticksExisted % Main.setmgr.getSettingByName("packetspeed delay").getValDouble() == 0.0D);
/* 450 */           forward = Main.setmgr.getSettingByName("packetspeed speed").getValDouble() / 10.0D;
/* 451 */           startfor = forward;
/* 452 */           if (Moveutils.moveKeysDown() && go) {
/* 453 */             for (int i = 0; i < Main.setmgr.getSettingByName("packetspeed amount").getValDouble(); i++) {
/* 454 */               this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX + Moveutils.getXDir() * forward, this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Moveutils.getZDir() * forward, false));
/* 455 */               forward += startfor;
/*     */             } 
/* 457 */             e.setX(Moveutils.getXDir() * forward / 2.0D);
/* 458 */             e.setZ(Moveutils.getZDir() * forward / 2.0D);
/* 459 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, 1000.0D, this.mc.thePlayer.posZ, true));
/*     */           } 
/*     */           break;
/*     */         
/*     */         case "hiveaac":
/* 464 */           if (Moveutils.moveKeysDown()) {
/* 465 */             if (this.mc.thePlayer.onGround) {
/* 466 */               if (this.mc.thePlayer.ticksExisted % 5 == 0) {
/* 467 */                 e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/*     */               }
/*     */               
/* 470 */               Moveutils.setMoveSpeed(e, Moveutils.getBaseMoveSpeed() * 1.5D);
/*     */               
/*     */               break;
/*     */             } 
/* 474 */             Moveutils.setMoveSpeed(e, 0.0D);
/* 475 */             e.setY(this.mc.thePlayer.motionY = -Moveutils.getJumpMotion());
/*     */           } 
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 487 */     super.onDisable();
/* 488 */     this.mc.timer.timerSpeed = 1.0F;
/* 489 */     if (this.mc.thePlayer != null) {
/* 490 */       this.mc.thePlayer.motionX = 0.0D;
/* 491 */       this.mc.thePlayer.motionZ = 0.0D;
/* 492 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft")) {
/* 493 */         this.mc.thePlayer.motionY = 0.0D;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/* 500 */     super.onEnable();
/* 501 */     this.jumpsspeed = 0.0D;
/* 502 */     if (this.mc.thePlayer != null) {
/* 503 */       if ((!Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") || !Main.setmgr.getSettingByName("cubecraft mode").getValString().equalsIgnoreCase("bhop")) && !Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex")) {
/* 504 */         this.ypos = this.mc.thePlayer.posY;
/* 505 */         this.speed = 0.3D;
/*     */       } else {
/*     */         
/* 508 */         this.ypos = -1.0D;
/*     */       } 
/* 510 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel")) {
/* 511 */         this.speed = 0.3D;
/* 512 */         this.ypos = 0.0D;
/*     */       } 
/* 514 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncp")) {
/* 515 */         this.speed = 0.1D;
/* 516 */         this.ypos = 0.0D;
/* 517 */         this.jumpsspeed = 0.0D;
/*     */       } else {
/*     */         
/* 520 */         this.speed = 0.4D;
/*     */       } 
/* 522 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex2")) {
/* 523 */         this.speed = Moveutils.getBaseMoveSpeed();
/*     */       }
/* 525 */       this.firstjump = true;
/* 526 */       this.doslow = true;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Speed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */