/*     */ package com.mylo.base.module.impl.Misc;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventRenderGui;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.specialobjects.BoundVars;
/*     */ import com.mylo.base.utils.Colorutil;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.network.play.client.C02PacketUseEntity;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DamageDisplay
/*     */   extends Module
/*     */ {
/*     */   ArrayList<com.mylo.base.specialobjects.DamageDisplay> damagedisplays;
/*     */   
/*     */   public DamageDisplay() {
/*  34 */     super("DamageDisplay", "Shows when players/mobs are being damaged by you", 0, Category.Misc);
/*     */ 
/*     */     
/*  37 */     this.damagedisplays = new ArrayList<>();
/*     */   }
/*     */   
/*     */   public void setup() {
/*  41 */     super.setup();
/*  42 */     Main.setmgr.rSetting(new Setting(this.name, this, "World", Lists.newArrayList((Object[])new String[] { "World", "Screen" })));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  47 */     super.onEnable();
/*  48 */     this.damagedisplays = new ArrayList<>();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {
/*  53 */     super.onDisable();
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  58 */     if (e.isPre()) {
/*  59 */       com.mylo.base.specialobjects.DamageDisplay deleteme = null;
/*  60 */       for (com.mylo.base.specialobjects.DamageDisplay dam : this.damagedisplays) {
/*  61 */         TimeHelper timer = dam.ent.timer;
/*  62 */         if (timer.isDelayComplete(Long.valueOf(2000L)) && !dam.damaged) {
/*  63 */           deleteme = dam;
/*     */           continue;
/*     */         } 
/*  66 */         if (dam.update()) {
/*  67 */           deleteme = dam;
/*     */           continue;
/*     */         } 
/*  70 */         if (dam.ent.getHealth() < dam.ent.lastticksmoothhealth && !dam.damaged) {
/*  71 */           dam.damaged = true;
/*  72 */           dam.damage = ((int)((dam.ent.lastticksmoothhealth - dam.ent.getHealth()) * 10.0F) / 10);
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/*  77 */       if (deleteme != null) {
/*  78 */         this.damagedisplays.remove(deleteme);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/*  85 */     if (e.getPacket() instanceof C02PacketUseEntity) {
/*  86 */       C02PacketUseEntity p = (C02PacketUseEntity)e.getPacket();
/*  87 */       if (p.getAction() == C02PacketUseEntity.Action.ATTACK) {
/*  88 */         ScaledResolution sr = new ScaledResolution(this.mc);
/*  89 */         BoundVars bound = new BoundVars();
/*  90 */         Entity ent = p.getEntityFromWorld((World)this.mc.theWorld);
/*  91 */         if (ent instanceof EntityLivingBase) {
/*  92 */           EntityLivingBase entity = (EntityLivingBase)ent;
/*  93 */           entity.timer.reset();
/*  94 */           if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("World")) {
/*  95 */             this.damagedisplays.add(new com.mylo.base.specialobjects.DamageDisplay(ent.posX, ent.posY + ent.height + 0.5D, ent.posZ, entity));
/*     */           } else {
/*     */             
/*  98 */             this.damagedisplays.add(new com.mylo.base.specialobjects.DamageDisplay((sr.getScaledWidth() / 2), (sr.getScaledHeight() / 2), entity));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender3d(EventRender3d e) {
/* 107 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("World")) {
/* 108 */       GlStateManager.pushMatrix();
/* 109 */       GlStateManager.disableDepth();
/* 110 */       for (com.mylo.base.specialobjects.DamageDisplay dam : this.damagedisplays) {
/* 111 */         if (dam.damaged && dam.is3d) {
/* 112 */           GlStateManager.translate(dam.x - (this.mc.getRenderManager()).renderPosX, dam.y - (this.mc.getRenderManager()).renderPosY, dam.z - (this.mc.getRenderManager()).renderPosZ);
/* 113 */           GlStateManager.scale(-0.03D, -0.03D, -0.03D);
/* 114 */           GlStateManager.rotate((this.mc.getRenderViewEntity()).rotationYaw, 0.0F, -1.0F, 0.0F);
/* 115 */           GlStateManager.rotate((this.mc.getRenderViewEntity()).rotationPitch, 1.0F, 0.0F, 0.0F);
/*     */           
/* 117 */           Fonts.MainFontRendererBig.drawCenteredStringWithShadow((new StringBuilder(String.valueOf(dam.damage))).toString(), 0.0F, 0.0F, Colorutil.getChosenColor(0));
/*     */         } 
/*     */       } 
/* 120 */       GlStateManager.enableDepth();
/* 121 */       GlStateManager.popMatrix();
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender2d(EventRenderGui e) {
/* 127 */     if (Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("Screen")) {
/* 128 */       GlStateManager.pushMatrix();
/* 129 */       for (com.mylo.base.specialobjects.DamageDisplay dam : this.damagedisplays) {
/* 130 */         if (dam.damaged && !dam.is3d) {
/* 131 */           GlStateManager.pushMatrix();
/* 132 */           GlStateManager.translate(dam.x, dam.y, 0.0D);
/* 133 */           GlStateManager.scale(2.0F, 2.0F, 2.0F);
/* 134 */           Fonts.MainFontRendererBig.drawCenteredStringWithShadow((new StringBuilder(String.valueOf(dam.damage))).toString(), 0.0F, 0.0F, Colorutil.getChosenColor(0));
/* 135 */           GlStateManager.popMatrix();
/*     */         } 
/*     */       } 
/* 138 */       GlStateManager.popMatrix();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/DamageDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */