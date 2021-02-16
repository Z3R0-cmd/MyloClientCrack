/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abh
/*     */   implements abs
/*     */ {
/*     */   public boolean a(xp ☃, adm adm1) {
/*  18 */     zx zx = null;
/*  19 */     List<zx> list = Lists.newArrayList();
/*     */     
/*  21 */     for (int i = 0; i < ☃.o_(); i++) {
/*  22 */       zx zx1 = ☃.a(i);
/*  23 */       if (zx1 != null)
/*     */       {
/*     */ 
/*     */         
/*  27 */         if (zx1.b() instanceof yj) {
/*  28 */           yj yj = (yj)zx1.b();
/*     */           
/*  30 */           if (yj.x_() == yj.a.a && zx == null) {
/*  31 */             zx = zx1;
/*     */           } else {
/*  33 */             return false;
/*     */           } 
/*  35 */         } else if (zx1.b() == zy.aW) {
/*  36 */           list.add(zx1);
/*     */         } else {
/*  38 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  42 */     return (zx != null && !list.isEmpty());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(xp ☃) {
/*  48 */     zx zx = null;
/*  49 */     int[] arrayOfInt = new int[3];
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     yj yj = null;
/*     */     int k;
/*  54 */     for (k = 0; k < ☃.o_(); k++) {
/*  55 */       zx zx1 = ☃.a(k);
/*  56 */       if (zx1 != null)
/*     */       {
/*     */ 
/*     */         
/*  60 */         if (zx1.b() instanceof yj) {
/*  61 */           yj = (yj)zx1.b();
/*     */           
/*  63 */           if (yj.x_() == yj.a.a && zx == null) {
/*  64 */             zx = zx1.k();
/*  65 */             zx.b = 1;
/*     */             
/*  67 */             if (yj.d_(zx1)) {
/*  68 */               int i2 = yj.b(zx);
/*  69 */               float f3 = (i2 >> 16 & 0xFF) / 255.0F;
/*  70 */               float f4 = (i2 >> 8 & 0xFF) / 255.0F;
/*  71 */               float f5 = (i2 & 0xFF) / 255.0F;
/*     */               
/*  73 */               i = (int)(i + Math.max(f3, Math.max(f4, f5)) * 255.0F);
/*     */               
/*  75 */               arrayOfInt[0] = (int)(arrayOfInt[0] + f3 * 255.0F);
/*  76 */               arrayOfInt[1] = (int)(arrayOfInt[1] + f4 * 255.0F);
/*  77 */               arrayOfInt[2] = (int)(arrayOfInt[2] + f5 * 255.0F);
/*  78 */               j++;
/*     */             } 
/*     */           } else {
/*  81 */             return null;
/*     */           } 
/*  83 */         } else if (zx1.b() == zy.aW) {
/*  84 */           float[] arrayOfFloat = tv.a(zd.a(zx1.i()));
/*  85 */           int i2 = (int)(arrayOfFloat[0] * 255.0F);
/*  86 */           int i3 = (int)(arrayOfFloat[1] * 255.0F);
/*  87 */           int i4 = (int)(arrayOfFloat[2] * 255.0F);
/*     */           
/*  89 */           i += Math.max(i2, Math.max(i3, i4));
/*     */           
/*  91 */           arrayOfInt[0] = arrayOfInt[0] + i2;
/*  92 */           arrayOfInt[1] = arrayOfInt[1] + i3;
/*  93 */           arrayOfInt[2] = arrayOfInt[2] + i4;
/*  94 */           j++;
/*     */         } else {
/*  96 */           return null;
/*     */         } 
/*     */       }
/*     */     } 
/* 100 */     if (yj == null) {
/* 101 */       return null;
/*     */     }
/*     */     
/* 104 */     k = arrayOfInt[0] / j;
/* 105 */     int m = arrayOfInt[1] / j;
/* 106 */     int n = arrayOfInt[2] / j;
/*     */     
/* 108 */     float f1 = i / j;
/* 109 */     float f2 = Math.max(k, Math.max(m, n));
/*     */     
/* 111 */     k = (int)(k * f1 / f2);
/* 112 */     m = (int)(m * f1 / f2);
/* 113 */     n = (int)(n * f1 / f2);
/*     */     
/* 115 */     int i1 = k;
/* 116 */     i1 = (i1 << 8) + m;
/* 117 */     i1 = (i1 << 8) + n;
/*     */     
/* 119 */     yj.b(zx, i1);
/* 120 */     return zx;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/* 125 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b() {
/* 131 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx[] b(xp ☃) {
/* 136 */     zx[] arrayOfZx = new zx[☃.o_()];
/*     */     
/* 138 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 139 */       zx zx = ☃.a(i);
/* 140 */       if (zx != null && zx.b().r()) {
/* 141 */         arrayOfZx[i] = new zx(zx.b().q());
/*     */       }
/*     */     } 
/*     */     
/* 145 */     return arrayOfZx;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */