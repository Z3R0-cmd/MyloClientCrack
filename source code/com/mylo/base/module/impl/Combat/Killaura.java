/*     */ package com.mylo.base.module.impl.Combat;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventRenderGui;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import com.mylo.base.utils.entityutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.awt.Color;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C02PacketUseEntity;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.network.play.client.C07PacketPlayerDigging;
/*     */ import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
/*     */ import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
/*     */ import net.minecraft.network.play.server.S39PacketPlayerAbilities;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class Killaura
/*     */   extends Module
/*     */ {
/*     */   public boolean blocking;
/*     */   Setting reach;
/*     */   Setting cps;
/*     */   Setting verspeed;
/*     */   Setting horspeed;
/*     */   Setting throughwalls;
/*     */   Setting players;
/*     */   Setting mobs;
/*     */   Setting animals;
/*     */   
/*     */   public Killaura() {
/*  53 */     super("Killaura", "Hit entities around you automatically", 19, Category.Combat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     this.timer = new TimeHelper();
/*  68 */     this.flag = false;
/*  69 */     this.target = null;
/*  70 */     this.doblock = false;
/*     */     
/*  72 */     this.queue = 1;
/*  73 */     this.switchTicker = 0;
/*     */     
/*  75 */     this.nextcps = 0;
/*     */   }
/*     */   Setting teams; Setting autoblock; Setting hurttimecheck; TimeHelper timer; boolean flag; EntityLivingBase target; boolean doblock; int queue; int switchTicker; int nextcps;
/*     */   public void setup() {
/*  79 */     super.setup();
/*  80 */     this.reach = new Setting("Reach", this, 3.5D, 1.0D, 6.0D, false);
/*  81 */     this.cps = new Setting("CPS", this, 10.0D, 1.0D, 20.0D, true);
/*  82 */     this.horspeed = new Setting("Horizontal speed", this, 10.0D, 3.0D, 60.0D, false);
/*  83 */     this.verspeed = new Setting("Vertical speed", this, 10.0D, 3.0D, 60.0D, false);
/*  84 */     this.hurttimecheck = new Setting("Hurttime", this, true);
/*  85 */     this.throughwalls = new Setting("Through walls", this, true);
/*  86 */     this.players = new Setting("Players", this, true);
/*  87 */     this.mobs = new Setting("Mobs", this, true);
/*  88 */     this.animals = new Setting("Animals", this, true);
/*  89 */     this.teams = new Setting("Teams", this, false);
/*  90 */     ArrayList<String> autoblockmodes = new ArrayList<>();
/*  91 */     autoblockmodes.add("off");
/*  92 */     autoblockmodes.add("fake");
/*  93 */     autoblockmodes.add("vanilla");
/*  94 */     autoblockmodes.add("hypixel");
/*  95 */     autoblockmodes.add("post");
/*  96 */     this.autoblock = new Setting("Autoblock", this, "off", autoblockmodes);
/*  97 */     Main.setmgr.rSetting(this.reach);
/*  98 */     Main.setmgr.rSetting(this.cps);
/*  99 */     Main.setmgr.rSetting(this.horspeed);
/* 100 */     Main.setmgr.rSetting(this.verspeed);
/* 101 */     Main.setmgr.rSetting(new Setting("smart smooth", this, false));
/* 102 */     Main.setmgr.rSetting(this.hurttimecheck);
/*     */     
/* 104 */     Main.setmgr.rSetting(this.players);
/* 105 */     Main.setmgr.rSetting(this.mobs);
/* 106 */     Main.setmgr.rSetting(this.animals);
/* 107 */     Main.setmgr.rSetting(this.teams);
/* 108 */     Main.setmgr.rSetting(this.autoblock);
/* 109 */     Main.setmgr.rSetting(new Setting("disable rotations", this, false));
/* 110 */     Main.setmgr.rSetting(new Setting("tickaura", this, false));
/* 111 */     Main.setmgr.rSetting(new Setting("Simple tpreach", this, false));
/* 112 */     Main.setmgr.rSetting(new Setting("no swing", this, false));
/* 113 */     Main.setmgr.rSetting(new Setting("Max multi targets", this, 10.0D, 1.0D, 20.0D, true));
/* 114 */     Main.setmgr.rSetting(new Setting("move according to rotation", this, false));
/* 115 */     Main.setmgr.rSetting(new Setting("raytrace", this, false));
/* 116 */     Main.setmgr.rSetting(new Setting("switch", this, false));
/* 117 */     Main.setmgr.rSetting(new Setting("post event", this, false));
/* 118 */     Main.setmgr.rSetting(new Setting("shakey", this, false));
/* 119 */     this.timer = new TimeHelper();
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/* 124 */     Criticals critMod = (Criticals)Main.modmgr.getModuleByName("Criticals");
/* 125 */     boolean post = Main.setmgr.getSettingByName("post event").getValBoolean();
/* 126 */     if ((e.isPre() && !post) || (e.isPost() && post)) {
/*     */       
/* 128 */       boolean shakey = Main.setmgr.getSettingByName("shakey").getValBoolean();
/*     */       
/* 130 */       boolean smartsmooth = Main.setmgr.getSettingByName("smart smooth").getValBoolean();
/* 131 */       int multitargets = (int)Main.setmgr.getSettingByName("Max multi targets").getValDouble();
/* 132 */       boolean raytrace = Main.setmgr.getSettingByName("raytrace").getValBoolean();
/* 133 */       boolean tickaura = Main.setmgr.getSettingByName("tickaura").getValBoolean();
/* 134 */       boolean switchaura = Main.setmgr.getSettingByName("switch").getValBoolean();
/* 135 */       this.doblock = false;
/* 136 */       boolean noswing = Main.setmgr.getSettingByName("no swing").getValBoolean();
/* 137 */       if (this.flag && this.mc.thePlayer.ticksExisted < 15) {
/* 138 */         setState(false);
/* 139 */         Main.NotMan.sendNotification("Killaura", "Disabled killaura because of respawn", 3000);
/*     */       }
/* 141 */       else if (this.flag) {
/* 142 */         this.flag = false;
/*     */       } 
/* 144 */       if (!this.mc.playerController.isSpectator() && !this.mc.thePlayer.isDead) {
/*     */ 
/*     */ 
/*     */         
/* 148 */         Boolean simpletpreach = Boolean.valueOf(Main.setmgr.getSettingByName("Simple tpreach").getValBoolean());
/*     */         
/* 150 */         this.doblock = false;
/* 151 */         Entity closest = null;
/*     */         
/* 153 */         closest = entityutils.GetClosestEntity(this.players.getValBoolean(), this.mobs.getValBoolean(), this.animals.getValBoolean(), this.teams.getValBoolean(), false);
/*     */         
/* 155 */         if (!Main.modmgr.getModuleByName("Scaffold").getState() && !Main.modmgr.getModuleByName("Fly").getState()) {
/* 156 */           Main.enableFakeaim(false);
/*     */         }
/* 158 */         if (closest != null && (this.mc.thePlayer.getDistanceToEntity(closest) < this.reach.getValDouble() + 3.0D || (simpletpreach.booleanValue() && this.mc.thePlayer.getDistanceToEntity(closest) < 9.0F))) {
/* 159 */           this.doblock = true;
/*     */         }
/* 161 */         if ((closest != null && (this.mc.thePlayer.getDistanceToEntity(closest) < this.reach.getValDouble() || (simpletpreach.booleanValue() && this.mc.thePlayer.getDistanceToEntity(closest) < 9.0F))) || Main.setmgr.getSettingByName("disable rotations").getValBoolean()) {
/* 162 */           this.target = (EntityLivingBase)closest;
/* 163 */           if (Main.setmgr.getSettingByName("disable rotations").getValBoolean()) {
/* 164 */             if (this.timer.isDelayComplete(Long.valueOf(this.nextcps))) {
/* 165 */               this.doblock = false;
/* 166 */               this.nextcps = (int)(1000.0D / this.cps.getValDouble() + Math.random() * 60.0D);
/* 167 */               boolean found = false;
/* 168 */               int targets = 0;
/* 169 */               for (Entity ent : entityutils.getEntitiesInRange(this.reach.getValDouble(), this.players.getValBoolean(), this.mobs.getValBoolean(), this.animals.getValBoolean(), this.teams.getValBoolean(), this.hurttimecheck.getValBoolean())) {
/* 170 */                 Entity closestattack = ent;
/* 171 */                 if ((this.mc.thePlayer.getDistanceToEntity(ent) < this.reach.getValDouble() || (simpletpreach.booleanValue() && this.mc.thePlayer.getDistanceToEntity(ent) < 9.0F)) && targets < multitargets) {
/*     */ 
/*     */                   
/* 174 */                   boolean canattack = true;
/* 175 */                   if (simpletpreach.booleanValue()) {
/* 176 */                     this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(ent.posX, ent.posY, ent.posZ, true));
/*     */                   }
/* 178 */                   if (canattack) {
/* 179 */                     if (tickaura) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       
/* 197 */                       critMod.CritHypixel((EntityLivingBase)closestattack);
/* 198 */                       if (!noswing) {
/* 199 */                         this.mc.thePlayer.swingItem();
/*     */                       }
/*     */                       
/* 202 */                       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity(closestattack, C02PacketUseEntity.Action.ATTACK));
/* 203 */                       if (simpletpreach.booleanValue()) {
/* 204 */                         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY, this.mc.thePlayer.posZ, true));
/*     */                       }
/*     */                     } else {
/* 207 */                       critMod.CritHypixel((EntityLivingBase)closestattack);
/* 208 */                       if (!noswing) {
/* 209 */                         this.mc.thePlayer.swingItem();
/*     */                       }
/* 211 */                       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity(closestattack, C02PacketUseEntity.Action.ATTACK));
/* 212 */                       this.doblock = false;
/* 213 */                       if (simpletpreach.booleanValue()) {
/* 214 */                         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY, this.mc.thePlayer.posZ, true));
/*     */                       }
/*     */                     } 
/*     */                   } else {
/* 218 */                     this.queue++;
/*     */                   } 
/* 220 */                   multitargets++;
/* 221 */                   found = true;
/*     */                 } 
/*     */               } 
/* 224 */               if (found) {
/* 225 */                 this.timer.reset();
/*     */               }
/* 227 */               this.doblock = found;
/*     */             } 
/*     */           } else {
/* 230 */             Entity closestattack; Main.enableFakeaim(true);
/*     */             
/* 232 */             if (switchaura) {
/* 233 */               if (this.mc.thePlayer.ticksExisted % 10 == 0) {
/* 234 */                 this.switchTicker++;
/*     */               }
/* 236 */               ArrayList<Entity> targets = entityutils.getEntitiesInRange(this.reach.getValDouble(), this.players.getValBoolean(), this.mobs.getValBoolean(), this.animals.getValBoolean(), this.teams.getValBoolean(), this.hurttimecheck.getValBoolean());
/* 237 */               if (this.switchTicker > targets.size() - 1) {
/* 238 */                 this.switchTicker = 0;
/*     */               }
/* 240 */               closestattack = targets.get(this.switchTicker);
/*     */             } else {
/* 242 */               closestattack = entityutils.GetClosestEntity(this.players.getValBoolean(), this.mobs.getValBoolean(), this.animals.getValBoolean(), this.teams.getValBoolean(), this.hurttimecheck.getValBoolean());
/*     */             } 
/* 244 */             if (closestattack != null && (this.mc.thePlayer.getDistanceToEntity(closestattack) < this.reach.getValDouble() + 3.0D || (simpletpreach.booleanValue() && this.mc.thePlayer.getDistanceToEntity(closestattack) < 9.0F))) {
/* 245 */               this.doblock = true;
/*     */             }
/* 247 */             if (closestattack != null && (this.mc.thePlayer.getDistanceToEntity(closestattack) < this.reach.getValDouble() || (simpletpreach.booleanValue() && this.mc.thePlayer.getDistanceToEntity(closestattack) < 9.0F))) {
/* 248 */               this.target = (EntityLivingBase)closestattack;
/* 249 */               boolean lookingat = entityutils.isLookingAtEntity(closestattack);
/* 250 */               if (this.timer.isDelayComplete(Long.valueOf(this.nextcps))) {
/* 251 */                 this.nextcps = (int)(1000.0D / this.cps.getValDouble() + Math.random() * 70.0D);
/* 252 */                 MovingObjectPosition mop = entityutils.getMouseOverFakeAim(true, this.reach.getValDouble());
/* 253 */                 boolean gotentity = (mop != null && mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY);
/*     */ 
/*     */                 
/* 256 */                 boolean canattack = true;
/*     */                 
/* 258 */                 if ((!raytrace && lookingat) || (raytrace && gotentity))
/*     */                 {
/* 260 */                   if (tickaura) {
/* 261 */                     if (canattack) {
/* 262 */                       this.doblock = false;
/* 263 */                       this.timer.reset();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       
/* 288 */                       if (simpletpreach.booleanValue()) {
/* 289 */                         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(closestattack.posX, closestattack.posY, closestattack.posZ, true));
/*     */                       }
/* 291 */                       critMod.CritHypixel((EntityLivingBase)closestattack);
/* 292 */                       if (!noswing) {
/* 293 */                         this.mc.thePlayer.swingItem();
/*     */                       }
/* 295 */                       this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, -999, 0, 5, (EntityPlayer)this.mc.thePlayer);
/* 296 */                       this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, 36 + this.mc.thePlayer.inventory.currentItem, 1, 5, (EntityPlayer)this.mc.thePlayer);
/* 297 */                       this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, -999, 2, 5, (EntityPlayer)this.mc.thePlayer);
/* 298 */                       if (raytrace) {
/* 299 */                         if (mop.entityHit == closestattack) {
/* 300 */                           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity(closestattack, C02PacketUseEntity.Action.ATTACK));
/*     */                           
/* 302 */                           unblock();
/*     */                         } 
/*     */                       } else {
/* 305 */                         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity(closestattack, C02PacketUseEntity.Action.ATTACK));
/*     */                         
/* 307 */                         unblock();
/*     */                       } 
/* 309 */                       if (simpletpreach.booleanValue()) {
/* 310 */                         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY, this.mc.thePlayer.posZ, true));
/*     */                       }
/*     */                     } else {
/* 313 */                       this.queue++;
/*     */                     } 
/*     */                   } else {
/* 316 */                     critMod.CritHypixel((EntityLivingBase)closestattack);
/* 317 */                     this.timer.reset();
/* 318 */                     if (simpletpreach.booleanValue()) {
/* 319 */                       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(closestattack.posX, closestattack.posY, closestattack.posZ, true));
/*     */                     }
/* 321 */                     if (!noswing) {
/* 322 */                       this.mc.thePlayer.swingItem();
/*     */                     }
/* 324 */                     if (raytrace) {
/* 325 */                       if (mop.entityHit == closestattack) {
/* 326 */                         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity(closestattack, C02PacketUseEntity.Action.ATTACK));
/*     */                         
/* 328 */                         unblock();
/*     */                       } 
/*     */                     } else {
/* 331 */                       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity(closestattack, C02PacketUseEntity.Action.ATTACK));
/*     */                       
/* 333 */                       unblock();
/*     */                     } 
/* 335 */                     if (simpletpreach.booleanValue()) {
/* 336 */                       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY, this.mc.thePlayer.posZ, true));
/*     */                     }
/*     */                   } 
/*     */                 }
/*     */               } 
/* 341 */               entityutils.lookAtEntityPacketSmooth(closestattack, 2.0F * (float)this.horspeed.getValDouble() + (new Random()).nextInt(100) / 100.0F, 2.0F * (float)this.verspeed.getValDouble(), smartsmooth);
/* 342 */               if (shakey) {
/* 343 */                 Main.fakeYaw = (float)(Main.fakeYaw + Math.random() * 5.0D - 2.5D);
/* 344 */                 Main.fakePitch = (float)(Main.fakePitch + Math.random() * 5.0D - 2.5D);
/*     */               } 
/*     */             } else {
/* 347 */               entityutils.lookAtEntityPacketSmooth(closest, 2.0F * (float)this.horspeed.getValDouble(), 2.0F * (float)this.verspeed.getValDouble(), smartsmooth);
/* 348 */               if (shakey) {
/* 349 */                 Main.fakeYaw = (float)(Main.fakeYaw + Math.random() * 5.0D - 2.5D);
/* 350 */                 Main.fakePitch = (float)(Main.fakePitch + Math.random() * 5.0D - 2.5D);
/*     */               } 
/* 352 */               this.target = (EntityLivingBase)closest;
/*     */             } 
/* 354 */             if (closestattack == null) {
/* 355 */               this.target = null;
/*     */             }
/*     */           } 
/*     */         } 
/* 359 */         if (closest == null || (this.mc.thePlayer.getDistanceToEntity(closest) >= this.reach.getValDouble() && (!simpletpreach.booleanValue() || this.mc.thePlayer.getDistanceToEntity(closest) >= 9.0F))) {
/* 360 */           this.target = null;
/*     */         }
/*     */       } else {
/*     */         
/* 364 */         setState(false);
/*     */       } 
/*     */ 
/*     */       
/* 368 */       Main.killauratarget = (Entity)this.target;
/*     */     } 
/*     */     
/* 371 */     if (e.isPre()) {
/* 372 */       if ((this.doblock && !this.autoblock.getValString().equalsIgnoreCase("off")) || (this.target != null && this.mc.thePlayer.getDistanceToEntity((Entity)this.target) < this.reach.getValDouble() + 3.0D && !this.autoblock.getValString().equalsIgnoreCase("off") && this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword)) {
/* 373 */         if (this.autoblock.getValString().equalsIgnoreCase("hypixel")) {
/* 374 */           if (this.doblock) {
/* 375 */             block();
/*     */           } else {
/*     */             
/* 378 */             unblock();
/*     */           }
/*     */         
/*     */         }
/* 382 */         else if (this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword) {
/* 383 */           this.mc.thePlayer.setItemInUse(this.mc.thePlayer.getHeldItem(), 720000);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 388 */         unblock();
/*     */       }
/*     */     
/* 391 */     } else if (this.autoblock.getValString().equalsIgnoreCase("post")) {
/*     */       
/* 393 */       if (this.doblock && this.target != null && this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword) {
/* 394 */         String str; switch ((str = this.autoblock.getValString()).hashCode()) { case 3446944: if (!str.equals("post"))
/*     */               break; 
/* 396 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C08PacketPlayerBlockPlacement(this.mc.thePlayer.getHeldItem()));
/*     */             break; }
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void unblock() {
/* 404 */     if (this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword && 
/* 405 */       this.blocking) {
/* 406 */       this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
/* 407 */       this.blocking = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void block() {
/* 414 */     if (this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSword && !this.blocking) {
/* 415 */       this.mc.playerController.sendUseItem((EntityPlayer)this.mc.thePlayer, (World)this.mc.theWorld, this.mc.thePlayer.getHeldItem());
/* 416 */       this.blocking = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onRender(EventRenderGui e) {
/* 423 */     if (this.target != null) {
/* 424 */       if (this.target.ticksExisted <= 2) {
/* 425 */         this.target.smoothhealth = this.target.getHealth();
/*     */       }
/* 427 */       ScaledResolution sr = new ScaledResolution(this.mc);
/* 428 */       int yoffset = sr.getScaledHeight() / 2 + sr.getScaledHeight() / 50 + Fonts.MainFontRenderer.getHeight() + 2 + 20;
/* 429 */       double dif = 0.0D;
/* 430 */       dif = (this.target.getSmoothHealth2() / this.target.getMaxHealth());
/* 431 */       dif = MathHelper.clamp_double(dif, 0.0D, 1.0D);
/* 432 */       dif--;
/* 433 */       dif *= -1.0D;
/* 434 */       int r = 0;
/* 435 */       int g = 255;
/* 436 */       r = (int)(255.0D * dif);
/* 437 */       g = (int)(-255.0D * dif) + 255;
/* 438 */       Color c = new Color(r, g, 0);
/* 439 */       int left = sr.getScaledWidth() / 2 + 10;
/* 440 */       int top = sr.getScaledHeight() / 2 + 10;
/* 441 */       int right = left + 100;
/* 442 */       int bottom = top + 40;
/*     */       
/* 444 */       Gui.drawRect(left, top, right, bottom, 1711276032);
/* 445 */       Gui.drawRect(left + 1, bottom - 5, (int)MathHelper.clamp_double((left + 1) + (1.0D + -dif) * (right - left) - 2.0D, (left + 1), sr.getScaledWidth()), bottom - 1, c.getRGB());
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 450 */       for (Entity ent : this.mc.theWorld.loadedEntityList) {
/* 451 */         if (ent instanceof EntityLivingBase) {
/* 452 */           ((EntityLivingBase)ent).smoothhealth = ((EntityLivingBase)ent).getHealth();
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/* 460 */     if (!e.isPre() && 
/* 461 */       Main.setmgr.getSettingByName("move according to rotation").getValBoolean() && Main.isFakeAim() && Moveutils.moveKeysDown()) {
/* 462 */       Moveutils.setSpeedAt(e, (float)(Main.fakeYaw + Moveutils.getPressedMoveDir() - this.mc.thePlayer.rotationYaw), Moveutils.getMoveSpeed(e));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 469 */     super.onDisable();
/* 470 */     Main.enableFakeaim(false);
/* 471 */     this.flag = false;
/* 472 */     Main.killauratarget = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/* 477 */     super.onEnable();
/* 478 */     this.queue = 1;
/* 479 */     this.nextcps = 0;
/* 480 */     if (this.mc.theWorld != null) {
/* 481 */       for (Entity e : this.mc.theWorld.loadedEntityList) {
/* 482 */         if (e instanceof EntityLivingBase) {
/* 483 */           ((EntityLivingBase)e).smoothhealth = ((EntityLivingBase)e).getHealth();
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRenderName() {
/* 491 */     return String.valueOf(this.name) + " - cps: " + this.cps.getValDouble() + " r: " + ((int)(this.reach.getValDouble() * 10.0D) / 10.0F);
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 496 */     if (e.getPacket() instanceof net.minecraft.network.play.server.S08PacketPlayerPosLook) {
/* 497 */       this.flag = true;
/*     */     }
/* 499 */     if (e.getPacket() instanceof S39PacketPlayerAbilities) {
/* 500 */       S39PacketPlayerAbilities packet = (S39PacketPlayerAbilities)e.getPacket();
/* 501 */       if (packet.isAllowFlying() != this.mc.thePlayer.capabilities.allowFlying) {
/* 502 */         setState(false);
/*     */       }
/*     */     } 
/* 505 */     if (e.getPacket() instanceof S0CPacketSpawnPlayer) {
/* 506 */       S0CPacketSpawnPlayer p = (S0CPacketSpawnPlayer)e.getPacket();
/* 507 */       if (Renderutils.getDistance2d(this.mc.thePlayer.posX, this.mc.thePlayer.posZ, p.getX(), p.getZ()) < 5.0D) {
/* 508 */         e.setCancelled(true);
/* 509 */         Main.NotMan.sendNotification("Antibot", "Removed watchdog type bot \"" + p.getPlayer() + "\" from your game", 2000);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/Killaura.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */