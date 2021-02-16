/*     */ package com.mylo.base.module.impl.Movement;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Longjump
/*     */   extends Module
/*     */ {
/*     */   boolean goingdown;
/*     */   double startx;
/*     */   double starty;
/*     */   double startz;
/*     */   int ticker;
/*     */   boolean done;
/*     */   boolean back;
/*     */   double mineplexspeed;
/*     */   double lastmineplexspeed;
/*     */   
/*     */   public Longjump() {
/*  34 */     super("Longjump", "makes you jump far lmao", 48, Category.Movement);
/*     */ 
/*     */     
/*  37 */     this.goingdown = false;
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
/*  48 */     super.setup();
/*  49 */     Main.setmgr.rSetting(new Setting(this.name, this, "farhop", Lists.newArrayList((Object[])new String[] { "farhop", "cubecraft", "mineplex", "hypixel", "ncp", "ncpcrazy", "ncpanother", "ncpsuper", "ncphigh" })));
/*  50 */     Main.setmgr.rSetting(new Setting("HeightSpoof", this, false));
/*  51 */     Main.setmgr.rSetting(new Setting("longjump speed", this, 2.0D, 0.0D, 8.0D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/*  54 */             return (!Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("mineplex") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("cubecraft") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("farhop") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncp") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpcrazy") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpanother") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpsuper")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/*  57 */     Main.setmgr.rSetting(new Setting("mineplex acceleration", this, 0.1D, 0.0D, 0.4D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/*  60 */             return Boolean.valueOf(Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("mineplex"));
/*     */           }
/*     */         });
/*  63 */     Main.setmgr.rSetting(new Setting("hover height", this, 0.2D, 0.0D, 1.0D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/*  66 */             return (!Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpcrazy") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpanother") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpsuper") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncphigh")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/*  69 */     Main.setmgr.rSetting(new Setting("hover downspeed", this, 0.1D, 0.0D, 1.0D, false)
/*     */         {
/*     */           public Boolean isVisible() {
/*  72 */             return (!Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpcrazy") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpanother") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncpsuper") && !Main.setmgr.getSettingByName(Longjump.this.name).getValString().equalsIgnoreCase("ncphigh")) ? Boolean.valueOf(false) : Boolean.valueOf(true);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  79 */     double longjumpspeed = Main.setmgr.getSettingByName("longjump speed").getValDouble();
/*  80 */     if (this.mc.thePlayer.posY < this.mc.thePlayer.lastTickPosY) {
/*  81 */       this.goingdown = true;
/*     */     }
/*  83 */     if (e.isPre()) {
/*  84 */       if (this.mc.thePlayer.onGround) {
/*  85 */         this.starty = this.mc.thePlayer.posY;
/*     */       
/*     */       }
/*  88 */       else if (Main.setmgr.getSettingByName("HeightSpoof").getValBoolean() && this.mc.thePlayer.posY > this.starty + 0.1D) {
/*  89 */         this.mc.thePlayer.posY = this.starty + 0.1D;
/*     */       } 
/*     */       String str;
/*  92 */       switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -1362669950: if (!str.equals("mineplex")); break;case -1281712686: if (!str.equals("farhop"))
/*     */             break; 
/*  94 */           if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown() && !this.goingdown) {
/*  95 */             this.mc.thePlayer.motionY = Moveutils.getJumpMotion() - 0.02D;
/*     */           } else {
/*     */             
/*  98 */             this.mc.thePlayer.motionY += 0.06D;
/*  99 */             this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 0.02D, this.mc.thePlayer.posZ);
/*     */           } 
/* 101 */           Moveutils.setSpeed(longjumpspeed); break;
/*     */         case -1031473397:
/*     */           if (!str.equals("cubecraft"))
/* 104 */             break;  if (this.mc.thePlayer.onGround && !this.goingdown) {
/* 105 */             Moveutils.setSpeed(Moveutils.getPlayerSpeed() + longjumpspeed);
/* 106 */             if (Moveutils.getPlayerSpeed() > longjumpspeed + 0.5D) {
/* 107 */               this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/* 108 */               this.ticker = 0;
/*     */             }  break;
/*     */           } 
/* 111 */           if (!this.mc.thePlayer.onGround) {
/* 112 */             if (this.ticker < 5) {
/* 113 */               Moveutils.setSpeed(Moveutils.getPlayerSpeed() + 0.05D);
/*     */             }
/* 115 */             else if (this.ticker < 10) {
/* 116 */               Moveutils.setSpeed(Moveutils.getPlayerSpeed() + 0.01D);
/*     */             }
/* 118 */             else if (this.ticker < 20) {
/* 119 */               Moveutils.setSpeed(Moveutils.getPlayerSpeed() + 0.005D);
/*     */             } 
/* 121 */             this.mc.thePlayer.motionY += 0.015D;
/* 122 */             Moveutils.setSpeed(Moveutils.getPlayerSpeed());
/* 123 */             this.ticker++;
/*     */           } 
/*     */           break;
/*     */         
/*     */         case 1381910549:
/*     */           if (!str.equals("hypixel"));
/*     */           break; }
/*     */     
/*     */     } else {
/*     */       String str;
/* 133 */       switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -1362669950: if (!str.equals("mineplex"));
/*     */           break; }
/*     */ 
/*     */     
/*     */     } 
/* 138 */     if (this.mc.thePlayer.onGround && this.goingdown && !Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex")) {
/* 139 */       setState(false);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/* 145 */     if (e.isPre()) {
/* 146 */       double longjumpspeed = Main.setmgr.getSettingByName("longjump speed").getValDouble();
/* 147 */       double mineplexaccel = Main.setmgr.getSettingByName("mineplex acceleration").getValDouble();
/* 148 */       double longjumpheighthover = Main.setmgr.getSettingByName("hover height").getValDouble();
/* 149 */       double longjumphoverdown = Main.setmgr.getSettingByName("hover downspeed").getValDouble();
/* 150 */       if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex")) {
/* 151 */         if (Moveutils.airSlot() == -10) {
/* 152 */           Moveutils.setMoveSpeed2(e, 0.0D);
/*     */           return;
/*     */         } 
/* 155 */         if (!this.done) {
/*     */           
/* 157 */           Moveutils.clickGround();
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 162 */           Moveutils.setSpeedAt(e, this.mc.thePlayer.rotationYaw, this.back ? -this.mineplexspeed : this.mineplexspeed);
/*     */           
/* 164 */           this.back = !this.back;
/*     */           
/* 166 */           if (this.mc.thePlayer.onGround && this.mc.thePlayer.ticksExisted % 2 == 0) {
/*     */             
/* 168 */             mineplexaccel = Math.max(mineplexaccel + 0.00254361D, 0.005D);
/* 169 */             this.mineplexspeed += mineplexaccel;
/*     */           } 
/*     */           
/* 172 */           double speeders = longjumpspeed;
/*     */           
/* 174 */           if (this.mineplexspeed >= speeders * 1.3D && this.mc.thePlayer.onGround) {
/*     */             
/* 176 */             e.setY(this.mc.thePlayer.motionY = 0.42500001192092896D);
/*     */             
/* 178 */             Moveutils.setMoveSpeed2(e, 0.0D);
/*     */             
/* 180 */             this.done = true;
/*     */           } 
/*     */           
/* 183 */           this.mc.timer.timerSpeed = 0.6F;
/*     */           
/* 185 */           e.y += 0.00351D;
/*     */         } else {
/*     */           
/* 188 */           this.mc.timer.timerSpeed = 0.6F;
/*     */           
/* 190 */           e.setY(this.mc.thePlayer.motionY += 0.048D);
/* 191 */           if (this.mc.thePlayer.motionY > 0.0D)
/*     */           {
/* 193 */             e.setY(this.mc.thePlayer.motionY += 0.04D);
/*     */           }
/*     */ 
/*     */ 
/*     */           
/* 198 */           if (this.mc.thePlayer.onGround && this.mc.thePlayer.movementInput.jump) {
/* 199 */             e.y = this.mc.thePlayer.motionY = 0.42500001192092896D;
/*     */           }
/* 201 */           Moveutils.setMoveSpeed2(e, this.mineplexspeed *= (this.mineplexspeed < 1.0D) ? 0.99D : ((this.mineplexspeed < 2.0D) ? 0.985D : ((this.mineplexspeed < 2.5D) ? 0.972D : 0.97D)));
/*     */           
/* 203 */           if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/*     */             
/* 205 */             if (this.mineplexspeed < Moveutils.getBaseMoveSpeed() * 1.75D) {
/* 206 */               setState(false);
/*     */             
/*     */             }
/*     */           }
/* 210 */           else if (this.mc.thePlayer.onGround) {
/* 211 */             setState(false);
/*     */           }
/*     */         
/*     */         } 
/* 215 */       } else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncp")) {
/* 216 */         if (this.mc.thePlayer.onGround) {
/* 217 */           e.setY(this.mc.thePlayer.motionY = 0.42D);
/*     */         }
/* 219 */         Moveutils.setMoveSpeed(e, this.mineplexspeed);
/* 220 */         this.mineplexspeed *= 0.98D;
/* 221 */         e.setY(e.getY() + 5.09316E-6D);
/*     */       }
/* 223 */       else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel")) {
/* 224 */         if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 225 */           e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/* 226 */           this.mineplexspeed = 0.6D;
/*     */         } 
/* 228 */         Moveutils.setMoveSpeed(e, this.mineplexspeed);
/* 229 */         this.mineplexspeed *= 0.989D;
/* 230 */         e.setY(e.getY() + 5.09316E-6D);
/*     */       }
/* 232 */       else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncpcrazy")) {
/* 233 */         if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 234 */           e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/* 235 */           this.mineplexspeed = longjumpspeed * Moveutils.getBaseMoveSpeed();
/*     */         } 
/*     */         
/* 238 */         if (Moveutils.getMoveSpeed(e) < this.mineplexspeed) {
/* 239 */           Moveutils.setMoveSpeed(e, Math.max(this.mineplexspeed, Moveutils.getMoveSpeed(e) + 0.1D));
/*     */         } else {
/*     */           
/* 242 */           Moveutils.setMoveSpeed(e, Math.max(this.mineplexspeed, Moveutils.getBaseMoveSpeed()));
/*     */         } 
/* 244 */         this.mineplexspeed *= 0.989D;
/* 245 */         boolean coll = !this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().contract(0.03D, 0.0D, 0.03D).offset(0.0D, -longjumpheighthover, 0.0D)).isEmpty();
/* 246 */         if (Moveutils.moveKeysDown() && coll && this.mc.thePlayer.motionY < 0.0D) {
/* 247 */           e.y = this.mc.thePlayer.motionY = -0.01D * longjumphoverdown;
/*     */         }
/*     */         
/* 250 */         e.setY(e.getY() + 5.09316E-6D);
/*     */       }
/* 252 */       else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncpanother")) {
/* 253 */         if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 254 */           e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/* 255 */           this.ticker = 0;
/* 256 */           this.mineplexspeed = longjumpspeed * Moveutils.getBaseMoveSpeed();
/*     */         } 
/* 258 */         this.mineplexspeed *= 0.982D;
/* 259 */         Moveutils.setMoveSpeed(e, Math.max(this.mineplexspeed, Moveutils.getBaseMoveSpeed()));
/*     */         
/* 261 */         boolean coll = !this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().contract(0.03D, 0.0D, 0.03D).offset(0.0D, -longjumpheighthover, 0.0D)).isEmpty();
/*     */         
/* 263 */         e.y = this.mc.thePlayer.motionY = -0.01D * longjumphoverdown;
/*     */         
/* 265 */         this.ticker = 0;
/*     */ 
/*     */         
/* 268 */         if (this.mc.thePlayer.motionY < 0.0D) {
/* 269 */           if (this.ticker < 7) {
/* 270 */             e.y = this.mc.thePlayer.motionY *= 0.699D;
/* 271 */             switch (this.ticker) {
/*     */               case 0:
/* 273 */                 e.y = this.mc.thePlayer.motionY *= 0.9D;
/*     */               
/*     */               default:
/* 276 */                 if (this.ticker < 6) {
/* 277 */                   e.y = this.mc.thePlayer.motionY *= 0.99D;
/*     */                 }
/*     */                 break;
/*     */             } 
/*     */           
/* 282 */           } else if (this.ticker < 10) {
/* 283 */             e.y = this.mc.thePlayer.motionY *= 0.9D;
/*     */           } 
/* 285 */           this.ticker++;
/*     */         } else {
/*     */           
/* 288 */           this.ticker = 0;
/*     */         } 
/*     */         
/* 291 */         e.setY(e.getY() + 5.09316E-6D);
/*     */       }
/* 293 */       else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncpsuper")) {
/* 294 */         if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 295 */           e.setY(this.mc.thePlayer.motionY = Moveutils.getJumpMotion());
/* 296 */           this.ticker = 0;
/* 297 */           this.mineplexspeed = longjumpspeed * Moveutils.getBaseMoveSpeed();
/*     */         } 
/* 299 */         this.mineplexspeed *= 0.982D;
/* 300 */         Moveutils.setMoveSpeed(e, Math.max(this.mineplexspeed, Moveutils.getBaseMoveSpeed()));
/*     */ 
/*     */         
/* 303 */         boolean coll = !this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().contract(0.03D, 0.0D, 0.03D).offset(0.0D, -longjumpheighthover, 0.0D)).isEmpty();
/* 304 */         if (!Moveutils.moveKeysDown() || !coll || this.mc.thePlayer.motionY >= 0.0D)
/*     */         {
/*     */ 
/*     */           
/* 308 */           if (this.mc.thePlayer.motionY < 0.0D) {
/* 309 */             if (this.ticker < 7) {
/* 310 */               e.y = this.mc.thePlayer.motionY *= 0.699D;
/* 311 */               switch (this.ticker) {
/*     */                 case 0:
/* 313 */                   e.y = this.mc.thePlayer.motionY *= 0.9D;
/*     */                 
/*     */                 default:
/* 316 */                   if (this.ticker < 6) {
/* 317 */                     e.y = this.mc.thePlayer.motionY *= 0.99D;
/*     */                   }
/*     */                   break;
/*     */               } 
/*     */             
/* 322 */             } else if (this.ticker < 10) {
/* 323 */               e.y = this.mc.thePlayer.motionY *= 0.9D;
/*     */             } 
/* 325 */             this.ticker++;
/*     */           } else {
/*     */             
/* 328 */             this.ticker = 0;
/*     */           } 
/*     */         }
/* 331 */         e.setY(e.getY() + 5.09316E-6D);
/*     */       }
/* 333 */       else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("ncphigh")) {
/* 334 */         if (this.mc.thePlayer.onGround && Moveutils.moveKeysDown()) {
/* 335 */           this.mc.thePlayer.motionY = 0.0D;
/*     */           
/* 337 */           double posX = this.mc.thePlayer.posX;
/* 338 */           double posZ = this.mc.thePlayer.posZ;
/* 339 */           double y = this.mc.thePlayer.posY;
/* 340 */           double[] heights = { 0.42499999865D, 0.8209999961347D, 0.698999951236D, 0.59899991631346D, 1.021999991346D, 1.37199949613D, 1.65199993416D, 1.86899996134D };
/* 341 */           this.mineplexspeed = longjumpspeed * Moveutils.getBaseMoveSpeed(); byte b; int i; double[] arrayOfDouble1;
/* 342 */           for (i = (arrayOfDouble1 = heights).length, b = 0; b < i; ) { double off = arrayOfDouble1[b];
/* 343 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(posX, y + off, posZ, false));
/* 344 */             posX += Moveutils.getXDir() * Math.max(this.mineplexspeed, Moveutils.getBaseMoveSpeed());
/* 345 */             posZ += Moveutils.getZDir() * Math.max(this.mineplexspeed, Moveutils.getBaseMoveSpeed());
/* 346 */             this.mineplexspeed *= 0.982D; b++; }
/*     */           
/* 348 */           this.mc.thePlayer.setPosition(posX, y + 2.0D, posZ);
/* 349 */           this.ticker = 0;
/*     */         } 
/* 351 */         this.mineplexspeed *= 0.982D;
/* 352 */         Moveutils.setMoveSpeed(e, Math.max(this.mineplexspeed, Moveutils.getBaseMoveSpeed()));
/*     */ 
/*     */         
/* 355 */         boolean coll = !this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().contract(0.03D, 0.0D, 0.03D).offset(0.0D, -longjumpheighthover, 0.0D)).isEmpty();
/* 356 */         if (!Moveutils.moveKeysDown() || !coll || this.mc.thePlayer.motionY >= 0.0D)
/*     */         {
/*     */ 
/*     */           
/* 360 */           if (this.mc.thePlayer.motionY < 0.0D) {
/* 361 */             if (this.ticker < 7) {
/* 362 */               e.y = this.mc.thePlayer.motionY *= 0.699D;
/* 363 */               switch (this.ticker) {
/*     */                 case 0:
/* 365 */                   e.y = this.mc.thePlayer.motionY *= 0.9D;
/*     */                 
/*     */                 default:
/* 368 */                   if (this.ticker < 6) {
/* 369 */                     e.y = this.mc.thePlayer.motionY *= 0.99D;
/*     */                   }
/*     */                   break;
/*     */               } 
/*     */             
/* 374 */             } else if (this.ticker < 10) {
/* 375 */               e.y = this.mc.thePlayer.motionY *= 0.9D;
/*     */             } 
/* 377 */             this.ticker++;
/*     */           } else {
/*     */             
/* 380 */             this.ticker = 0;
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 389 */     if (e.getPacket() instanceof net.minecraft.network.play.server.S08PacketPlayerPosLook && (
/* 390 */       Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") || Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex"))) {
/* 391 */       setState(false);
/* 392 */       Main.NotMan.sendNotification("Longjump", "longjump was disabled due to lagback", 5000);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 399 */     super.onDisable();
/* 400 */     if (this.mc.thePlayer != null && !Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex")) {
/* 401 */       this.mc.thePlayer.motionX = 0.0D;
/* 402 */       this.mc.thePlayer.motionZ = 0.0D;
/*     */     } else {
/*     */     
/*     */     } 
/*     */     
/* 407 */     this.mc.timer.timerSpeed = 1.0F;
/* 408 */     this.goingdown = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/* 413 */     super.onEnable();
/* 414 */     double longjumpspeed = Main.setmgr.getSettingByName("longjump speed").getValDouble();
/* 415 */     this.mineplexspeed = 0.0D;
/* 416 */     this.lastmineplexspeed = -10.0D;
/* 417 */     this.done = false;
/* 418 */     this.back = false;
/* 419 */     this.ticker = 0;
/* 420 */     if (this.mc.thePlayer != null) {
/* 421 */       this.starty = this.mc.thePlayer.posY;
/*     */     }
/* 423 */     if (Main.setmgr.getSettingByName(this.name).getValString().startsWith("ncp")) {
/* 424 */       this.mineplexspeed = longjumpspeed * Moveutils.getBaseMoveSpeed();
/* 425 */       this.startz = 0.0D;
/*     */     }
/* 427 */     else if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel")) {
/* 428 */       this.mineplexspeed = 0.6D;
/*     */     } 
/* 430 */     if (this.mc.thePlayer != null && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("mineplex")) {
/* 431 */       this.startx = this.mc.thePlayer.posX;
/* 432 */       this.startz = this.mc.thePlayer.posZ;
/*     */     } 
/* 434 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft") && 
/* 435 */       this.mc.thePlayer.onGround) {
/* 436 */       Moveutils.damage();
/*     */     }
/*     */     
/* 439 */     if (this.mc.thePlayer != null && Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel"))
/* 440 */       this.startx = 0.0D; 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Longjump.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */