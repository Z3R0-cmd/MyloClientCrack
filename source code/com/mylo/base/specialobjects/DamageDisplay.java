/*    */ package com.mylo.base.specialobjects;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ 
/*    */ public class DamageDisplay
/*    */ {
/*    */   public boolean is3d;
/*    */   public boolean damaged;
/*    */   public double x;
/*    */   public double y;
/*    */   public double z;
/*    */   
/*    */   public DamageDisplay(double x, double y, double z, EntityLivingBase ent) {
/* 16 */     this.is3d = true;
/* 17 */     this.x = x;
/* 18 */     this.starty = y;
/* 19 */     this.y = y;
/* 20 */     this.z = z;
/* 21 */     this.ent = ent;
/*    */   }
/*    */   public double starty; public double directionx; public double directiony; public double damage; public EntityLivingBase ent;
/*    */   public DamageDisplay(double x, double y, EntityLivingBase ent) {
/* 25 */     this.is3d = false;
/* 26 */     this.x = x;
/* 27 */     this.y = y;
/* 28 */     this.directionx = Math.cos((-System.currentTimeMillis() / 100L % 180L)) * 3.0D;
/* 29 */     this.directiony = Math.sin((-System.currentTimeMillis() / 100L % 180L)) * 3.0D;
/* 30 */     this.ent = ent;
/*    */   }
/*    */   
/*    */   public boolean update() {
/* 34 */     if (this.damaged) {
/* 35 */       if (this.is3d) {
/* 36 */         this.y += 0.1D;
/* 37 */         if (this.y > this.starty + 1.0D) {
/* 38 */           return true;
/*    */         }
/*    */       } else {
/*    */         
/* 42 */         this.x += this.directionx;
/* 43 */         this.y += this.directiony;
/* 44 */         ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
/* 45 */         if (this.x > (sr.getScaledWidth() + 10) || this.x < -10.0D || this.y > (sr.getScaledHeight() + 10) || this.y < -10.0D) {
/* 46 */           return true;
/*    */         }
/*    */       } 
/*    */     }
/* 50 */     return false;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/DamageDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */