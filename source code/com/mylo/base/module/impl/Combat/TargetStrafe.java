/*     */ package com.mylo.base.module.impl.Combat;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Lookutil;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import net.minecraft.client.settings.KeyBinding;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ public class TargetStrafe
/*     */   extends Module
/*     */ {
/*     */   public TargetStrafe() {
/*  22 */     super("TargetStrafe", "zoom around your targets", 0, Category.Combat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  31 */     this.direction = true;
/*     */   } boolean direction;
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  35 */     if (e.isPost() && 
/*  36 */       this.mc.thePlayer.isCollidedHorizontally) {
/*  37 */       this.direction = !this.direction;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/*  44 */     boolean fly = Main.modmgr.getModuleByName("Fly").getState();
/*  45 */     if (!e.isPre() && !this.mc.thePlayer.isInWater() && !this.mc.thePlayer.isInLava())
/*  46 */       if (this.mc.thePlayer.movementInput.jump || Main.modmgr.getModuleByName("Speed").getState() || fly) {
/*  47 */         double range = Main.setmgr.getSettingByName("range").getValDouble();
/*  48 */         Entity ent = Main.killauratarget;
/*  49 */         boolean flag = true;
/*  50 */         if (ent != null) {
/*  51 */           if (!Moveutils.moveKeysDown()) {
/*  52 */             KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindForward.getKeyCode(), true);
/*     */           }
/*  54 */           float lookangles = Lookutil.getLookAngles(ent.getPositionVector().addVector(0.0D, (ent.height / 2.0F), 0.0D))[0].floatValue();
/*  55 */           if (ent.getDistanceToEntity((Entity)this.mc.thePlayer) > range + 0.5D) {
/*  56 */             lookangles += (this.direction ? 50 : -50);
/*     */           }
/*  58 */           else if (ent.getDistanceToEntity((Entity)this.mc.thePlayer) < range - 0.5D) {
/*  59 */             lookangles += (this.direction ? '' : -130);
/*     */           } else {
/*     */             
/*  62 */             lookangles += (this.direction ? 90 : -90);
/*     */           } 
/*  64 */           for (int i = 0; i < this.mc.thePlayer.posY; i++) {
/*  65 */             if (!(this.mc.theWorld.getBlockState(new BlockPos(this.mc.thePlayer.posX + 2.0D * Moveutils.getXDirAt(lookangles) * Moveutils.getMoveSpeed(e), i, this.mc.thePlayer.posZ + 2.0D * Moveutils.getZDirAt(lookangles) * Moveutils.getMoveSpeed(e))).getBlock() instanceof net.minecraft.block.BlockAir)) {
/*  66 */               flag = false;
/*     */             }
/*     */           } 
/*  69 */           if (flag && !fly) {
/*  70 */             this.direction = !this.direction;
/*     */           } else {
/*     */             
/*  73 */             flag = true;
/*  74 */             boolean down = this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().offset(0.0D, e.getY(), 0.0D)).isEmpty();
/*  75 */             if (this.mc.theWorld.getCollidingBoundingBoxes((Entity)this.mc.thePlayer, this.mc.thePlayer.getEntityBoundingBox().offset(Moveutils.getXDirAt(lookangles) * Moveutils.getMoveSpeed(e) * 2.0D, down ? e.getY() : 0.0D, Moveutils.getZDirAt(lookangles) * Moveutils.getMoveSpeed(e) * 2.0D)).isEmpty()) {
/*  76 */               flag = false;
/*     */             }
/*  78 */             if (flag && fly) {
/*  79 */               this.direction = !this.direction;
/*     */             }
/*     */           } 
/*     */         } else {
/*     */           
/*  84 */           KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindForward.getKeyCode(), Keyboard.isKeyDown(this.mc.gameSettings.keyBindForward.getKeyCode()));
/*     */         } 
/*  86 */         if (ent != null) {
/*  87 */           float lookangles = Lookutil.getLookAngles(ent.getPositionVector().addVector(0.0D, (ent.height / 2.0F), 0.0D))[0].floatValue();
/*  88 */           Main.enableFakeaim(true);
/*  89 */           if (!flag) {
/*  90 */             if (ent.getDistanceToEntity((Entity)this.mc.thePlayer) > range + 1.0D) {
/*  91 */               Moveutils.setSpeedAt(e, lookangles + (this.direction ? 50 : -50), Moveutils.getMoveSpeed(e));
/*     */             }
/*  93 */             else if (ent.getDistanceToEntity((Entity)this.mc.thePlayer) < range - 1.0D) {
/*  94 */               Moveutils.setSpeedAt(e, lookangles + (this.direction ? '' : -130), Moveutils.getMoveSpeed(e));
/*     */             } else {
/*     */               
/*  97 */               Moveutils.setSpeedAt(e, lookangles + (this.direction ? 90 : -90), Moveutils.getMoveSpeed(e));
/*     */             }
/*     */           
/*     */           }
/* 101 */           else if (ent.getDistanceToEntity((Entity)this.mc.thePlayer) < range - 1.0D) {
/* 102 */             Moveutils.setSpeedAt(e, lookangles + (this.direction ? '' : -130), Moveutils.getMoveSpeed(e));
/*     */           }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 108 */         KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindForward.getKeyCode(), Keyboard.isKeyDown(this.mc.gameSettings.keyBindForward.getKeyCode()));
/*     */       }  
/*     */   }
/*     */   
/*     */   public void setup() {
/*     */     super.setup();
/*     */     Main.setmgr.rSetting(new Setting("range", this, 3.0D, 0.1D, 5.0D, false));
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/TargetStrafe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */