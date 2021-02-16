/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anr
/*     */   extends any
/*     */ {
/*  12 */   private float[] d = new float[1024];
/*     */   
/*     */   protected void a(long ☃, int i, int j, ans ans1, double d1, double d2, double d3, float f1, float f2, float f3, int k, int m, double d4) {
/*  15 */     Random random = new Random(☃);
/*     */     
/*  17 */     double d5 = (i * 16 + 8);
/*  18 */     double d6 = (j * 16 + 8);
/*     */     
/*  20 */     float f4 = 0.0F;
/*  21 */     float f5 = 0.0F;
/*     */     
/*  23 */     if (m <= 0) {
/*  24 */       int i1 = this.a * 16 - 16;
/*  25 */       m = i1 - random.nextInt(i1 / 4);
/*     */     } 
/*  27 */     boolean bool = false;
/*     */     
/*  29 */     if (k == -1) {
/*  30 */       k = m / 2;
/*  31 */       bool = true;
/*     */     } 
/*     */     
/*  34 */     float f6 = 1.0F;
/*  35 */     for (int n = 0; n < 256; n++) {
/*  36 */       if (n == 0 || random.nextInt(3) == 0) {
/*  37 */         f6 = 1.0F + random.nextFloat() * random.nextFloat() * 1.0F;
/*     */       }
/*  39 */       this.d[n] = f6 * f6;
/*     */     } 
/*     */     
/*  42 */     for (; k < m; k++) {
/*  43 */       double d7 = 1.5D + (ns.a(k * 3.1415927F / m) * f1 * 1.0F);
/*  44 */       double d8 = d7 * d4;
/*     */       
/*  46 */       d7 *= random.nextFloat() * 0.25D + 0.75D;
/*  47 */       d8 *= random.nextFloat() * 0.25D + 0.75D;
/*     */       
/*  49 */       float f7 = ns.b(f3);
/*  50 */       float f8 = ns.a(f3);
/*  51 */       d1 += (ns.b(f2) * f7);
/*  52 */       d2 += f8;
/*  53 */       d3 += (ns.a(f2) * f7);
/*     */       
/*  55 */       f3 *= 0.7F;
/*     */       
/*  57 */       f3 += f5 * 0.05F;
/*  58 */       f2 += f4 * 0.05F;
/*     */       
/*  60 */       f5 *= 0.8F;
/*  61 */       f4 *= 0.5F;
/*  62 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/*  63 */       f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*     */       
/*  65 */       if (bool || random.nextInt(4) != 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  70 */         double d9 = d1 - d5;
/*  71 */         double d10 = d3 - d6;
/*  72 */         double d11 = (m - k);
/*  73 */         double d12 = (f1 + 2.0F + 16.0F);
/*  74 */         if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/*  79 */         if (d1 >= d5 - 16.0D - d7 * 2.0D && d3 >= d6 - 16.0D - d7 * 2.0D && d1 <= d5 + 16.0D + d7 * 2.0D && d3 <= d6 + 16.0D + d7 * 2.0D) {
/*     */ 
/*     */ 
/*     */           
/*  83 */           int i1 = ns.c(d1 - d7) - i * 16 - 1;
/*  84 */           int i2 = ns.c(d1 + d7) - i * 16 + 1;
/*     */           
/*  86 */           int i3 = ns.c(d2 - d8) - 1;
/*  87 */           int i4 = ns.c(d2 + d8) + 1;
/*     */           
/*  89 */           int i5 = ns.c(d3 - d7) - j * 16 - 1;
/*  90 */           int i6 = ns.c(d3 + d7) - j * 16 + 1;
/*     */           
/*  92 */           if (i1 < 0) {
/*  93 */             i1 = 0;
/*     */           }
/*  95 */           if (i2 > 16) {
/*  96 */             i2 = 16;
/*     */           }
/*     */           
/*  99 */           if (i3 < 1) {
/* 100 */             i3 = 1;
/*     */           }
/* 102 */           if (i4 > 248) {
/* 103 */             i4 = 248;
/*     */           }
/*     */           
/* 106 */           if (i5 < 0) {
/* 107 */             i5 = 0;
/*     */           }
/* 109 */           if (i6 > 16) {
/* 110 */             i6 = 16;
/*     */           }
/*     */           
/* 113 */           boolean bool1 = false;
/* 114 */           for (int i7 = i1; !bool1 && i7 < i2; i7++) {
/* 115 */             for (int i8 = i5; !bool1 && i8 < i6; i8++) {
/* 116 */               for (int i9 = i4 + 1; !bool1 && i9 >= i3 - 1; i9--) {
/* 117 */                 if (i9 >= 0 && i9 < 256) {
/*     */ 
/*     */ 
/*     */                   
/* 121 */                   alz alz = ans1.a(i7, i9, i8);
/* 122 */                   if (alz.c() == afi.i || alz.c() == afi.j) {
/* 123 */                     bool1 = true;
/*     */                   }
/* 125 */                   if (i9 != i3 - 1 && i7 != i1 && i7 != i2 - 1 && i8 != i5 && i8 != i6 - 1)
/* 126 */                     i9 = i3; 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/* 131 */           if (!bool1) {
/*     */ 
/*     */ 
/*     */             
/* 135 */             cj.a a = new cj.a();
/* 136 */             for (int i8 = i1; i8 < i2; i8++) {
/* 137 */               double d = ((i8 + i * 16) + 0.5D - d1) / d7;
/* 138 */               for (int i9 = i5; i9 < i6; i9++) {
/* 139 */                 double d13 = ((i9 + j * 16) + 0.5D - d3) / d7;
/* 140 */                 boolean bool2 = false;
/* 141 */                 if (d * d + d13 * d13 < 1.0D) {
/* 142 */                   for (int i10 = i4; i10 > i3; i10--) {
/* 143 */                     double d14 = ((i10 - 1) + 0.5D - d2) / d8;
/* 144 */                     if ((d * d + d13 * d13) * this.d[i10 - 1] + d14 * d14 / 6.0D < 1.0D) {
/* 145 */                       alz alz = ans1.a(i8, i10, i9);
/* 146 */                       if (alz.c() == afi.c) {
/* 147 */                         bool2 = true;
/*     */                       }
/* 149 */                       if (alz.c() == afi.b || alz.c() == afi.d || alz.c() == afi.c) {
/* 150 */                         if (i10 - 1 < 10) {
/* 151 */                           ans1.a(i8, i10, i9, afi.k.Q());
/*     */                         } else {
/* 153 */                           ans1.a(i8, i10, i9, afi.a.Q());
/* 154 */                           if (bool2 && ans1.a(i8, i10 - 1, i9).c() == afi.d) {
/* 155 */                             a.c(i8 + i * 16, 0, i9 + j * 16);
/* 156 */                             ans1.a(i8, i10 - 1, i9, (this.c.b(a)).ak);
/*     */                           } 
/*     */                         } 
/*     */                       }
/*     */                     } 
/*     */                   } 
/*     */                 }
/*     */               } 
/*     */             } 
/* 165 */             if (bool)
/*     */               break; 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected void a(adm ☃, int i, int j, int k, int m, ans ans1) {
/* 173 */     if (this.b.nextInt(50) != 0) {
/*     */       return;
/*     */     }
/* 176 */     double d1 = (i * 16 + this.b.nextInt(16));
/* 177 */     double d2 = (this.b.nextInt(this.b.nextInt(40) + 8) + 20);
/* 178 */     double d3 = (j * 16 + this.b.nextInt(16));
/*     */     
/* 180 */     int n = 1;
/*     */     
/* 182 */     for (int i1 = 0; i1 < n; i1++) {
/* 183 */       float f1 = this.b.nextFloat() * 3.1415927F * 2.0F;
/* 184 */       float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 185 */       float f3 = (this.b.nextFloat() * 2.0F + this.b.nextFloat()) * 2.0F;
/*     */       
/* 187 */       a(this.b.nextLong(), k, m, ans1, d1, d2, d3, f3, f1, f2, 0, 0, 3.0D);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */