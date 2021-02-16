/*     */ package com.mylo.base.module.impl.Combat;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class AntiAim
/*     */   extends Module
/*     */ {
/*     */   boolean isFake;
/*     */   
/*     */   public AntiAim() {
/*  18 */     super("AntiAim", "advanced. derp.", 0, Category.Combat);
/*     */ 
/*     */     
/*  21 */     this.isFake = false;
/*     */   }
/*     */   
/*     */   public void setup() {
/*  25 */     super.setup();
/*  26 */     ArrayList<String> options = new ArrayList<>();
/*  27 */     options.add("real");
/*  28 */     options.add("up");
/*  29 */     options.add("down");
/*  30 */     options.add("center");
/*  31 */     options.add("halfspin");
/*  32 */     options.add("inside");
/*  33 */     Main.setmgr.rSetting(new Setting("pitch", this, "real", options));
/*  34 */     options = new ArrayList<>();
/*  35 */     options.add("real");
/*  36 */     options.add("spin");
/*  37 */     options.add("jitter");
/*  38 */     options.add("backwards");
/*  39 */     Main.setmgr.rSetting(new Setting("headyaw", this, "real", options));
/*  40 */     Main.setmgr.rSetting(new Setting("bodyyaw", this, "real", options));
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/*  45 */     if (e.getPacket() instanceof net.minecraft.network.play.client.C03PacketPlayer) {
/*  46 */       this.isFake = !this.isFake;
/*     */     }
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  52 */     if (e.isPre()) {
/*  53 */       float pitch = 0.0F;
/*  54 */       float yaw = 0.0F; String str;
/*  55 */       switch ((str = Main.setmgr.getSettingByName("pitch").getValString()).hashCode()) { case -1364013995: if (!str.equals("center")) {
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
/*  66 */           pitch = 0.0F;
/*     */           break;
/*     */         case -1183789060:
/*     */           if (!str.equals("inside")) {
/*     */             break;
/*     */           }
/*  72 */           pitch = 180.0F; break;case -53123339: if (!str.equals("halfspin")) break;  pitch = (this.mc.thePlayer.ticksExisted * 5 % 180 - 90); break;case 3739: if (!str.equals("up"))
/*     */             break;  pitch = -90.0F; break;case 3089570: if (!str.equals("down"))
/*     */             break;  pitch = 90.0F; break;case 3496350: if (!str.equals("real"))
/*  75 */             break;  pitch = this.mc.thePlayer.rotationPitch; break; }  if (this.isFake) {
/*  76 */         yaw = getYaw(Main.setmgr.getSettingByName("bodyyaw").getValString());
/*     */       } else {
/*     */         
/*  79 */         yaw = getYaw(Main.setmgr.getSettingByName("headyaw").getValString());
/*     */       } 
/*  81 */       Main.enableFakeaim(true);
/*  82 */       Main.setFakeaim(pitch, yaw);
/*     */     } 
/*     */   } public float getYaw(String name) {
/*     */     int ticker;
/*     */     String str;
/*  87 */     switch ((str = name).hashCode()) { case -1159737108: if (!str.equals("jitter")) {
/*     */           break;
/*     */         }
/*     */         
/*  91 */         ticker = this.mc.thePlayer.ticksExisted;
/*  92 */         if (this.mc.thePlayer.ticksExisted % 3 == 0) {
/*  93 */           ticker = -ticker;
/*     */         }
/*  95 */         return this.mc.thePlayer.rotationYaw + 90.0F + (ticker * 20 % 360);case 3536962: if (!str.equals("spin"))
/*     */           break;  return (this.mc.thePlayer.ticksExisted * 20 % 360);case 1356771568: if (!str.equals("backwards"))
/*  97 */           break;  return (this.mc.thePlayer.rotationYaw + 180.0F) % 360.0F; }
/*     */     
/*  99 */     return this.mc.thePlayer.rotationYaw;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 105 */     super.onDisable();
/* 106 */     Main.enableFakeaim(false);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/AntiAim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */