/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anz
/*     */   extends any
/*     */ {
/*     */   protected void a(long ☃, int i, int j, ans ans1, double d1, double d2, double d3) {
/*  12 */     a(☃, i, j, ans1, d1, d2, d3, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
/*     */   }
/*     */   
/*     */   protected void a(long ☃, int i, int j, ans ans1, double d1, double d2, double d3, float f1, float f2, float f3, int k, int m, double d4) {
/*  16 */     double d5 = (i * 16 + 8);
/*  17 */     double d6 = (j * 16 + 8);
/*     */     
/*  19 */     float f4 = 0.0F;
/*  20 */     float f5 = 0.0F;
/*  21 */     Random random = new Random(☃);
/*     */     
/*  23 */     if (m <= 0) {
/*  24 */       int i1 = this.a * 16 - 16;
/*  25 */       m = i1 - random.nextInt(i1 / 4);
/*     */     } 
/*  27 */     boolean bool1 = false;
/*     */     
/*  29 */     if (k == -1) {
/*  30 */       k = m / 2;
/*  31 */       bool1 = true;
/*     */     } 
/*     */     
/*  34 */     int n = random.nextInt(m / 2) + m / 4;
/*  35 */     boolean bool2 = (random.nextInt(6) == 0);
/*     */     
/*  37 */     for (; k < m; k++) {
/*  38 */       double d7 = 1.5D + (ns.a(k * 3.1415927F / m) * f1 * 1.0F);
/*  39 */       double d8 = d7 * d4;
/*     */       
/*  41 */       float f6 = ns.b(f3);
/*  42 */       float f7 = ns.a(f3);
/*  43 */       d1 += (ns.b(f2) * f6);
/*  44 */       d2 += f7;
/*  45 */       d3 += (ns.a(f2) * f6);
/*     */       
/*  47 */       if (bool2) {
/*  48 */         f3 *= 0.92F;
/*     */       } else {
/*  50 */         f3 *= 0.7F;
/*     */       } 
/*  52 */       f3 += f5 * 0.1F;
/*  53 */       f2 += f4 * 0.1F;
/*     */       
/*  55 */       f5 *= 0.9F;
/*  56 */       f4 *= 0.75F;
/*  57 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/*  58 */       f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*     */       
/*  60 */       if (!bool1 && k == n && f1 > 1.0F) {
/*  61 */         a(random.nextLong(), i, j, ans1, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 - 1.5707964F, f3 / 3.0F, k, m, 1.0D);
/*  62 */         a(random.nextLong(), i, j, ans1, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 + 1.5707964F, f3 / 3.0F, k, m, 1.0D);
/*     */         return;
/*     */       } 
/*  65 */       if (bool1 || random.nextInt(4) != 0) {
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
/* 102 */           if (i4 > 120) {
/* 103 */             i4 = 120;
/*     */           }
/*     */           
/* 106 */           if (i5 < 0) {
/* 107 */             i5 = 0;
/*     */           }
/* 109 */           if (i6 > 16) {
/* 110 */             i6 = 16;
/*     */           }
/*     */           
/* 113 */           boolean bool = false; int i7;
/* 114 */           for (i7 = i1; !bool && i7 < i2; i7++) {
/* 115 */             for (int i8 = i5; !bool && i8 < i6; i8++) {
/* 116 */               for (int i9 = i4 + 1; !bool && i9 >= i3 - 1; i9--) {
/* 117 */                 if (i9 >= 0 && i9 < 128) {
/*     */ 
/*     */ 
/*     */                   
/* 121 */                   alz alz = ans1.a(i7, i9, i8);
/* 122 */                   if (alz.c() == afi.k || alz.c() == afi.l) {
/* 123 */                     bool = true;
/*     */                   }
/* 125 */                   if (i9 != i3 - 1 && i7 != i1 && i7 != i2 - 1 && i8 != i5 && i8 != i6 - 1)
/* 126 */                     i9 = i3; 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/* 131 */           if (!bool) {
/*     */ 
/*     */ 
/*     */             
/* 135 */             for (i7 = i1; i7 < i2; i7++) {
/* 136 */               double d = ((i7 + i * 16) + 0.5D - d1) / d7;
/* 137 */               for (int i8 = i5; i8 < i6; i8++) {
/* 138 */                 double d13 = ((i8 + j * 16) + 0.5D - d3) / d7;
/* 139 */                 for (int i9 = i4; i9 > i3; i9--) {
/* 140 */                   double d14 = ((i9 - 1) + 0.5D - d2) / d8;
/* 141 */                   if (d14 > -0.7D && d * d + d14 * d14 + d13 * d13 < 1.0D) {
/* 142 */                     alz alz = ans1.a(i7, i9, i8);
/* 143 */                     if (alz.c() == afi.aV || alz.c() == afi.d || alz.c() == afi.c) {
/* 144 */                       ans1.a(i7, i9, i8, afi.a.Q());
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/* 150 */             if (bool1)
/*     */               break; 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected void a(adm ☃, int i, int j, int k, int m, ans ans1) {
/* 158 */     int n = this.b.nextInt(this.b.nextInt(this.b.nextInt(10) + 1) + 1);
/* 159 */     if (this.b.nextInt(5) != 0) {
/* 160 */       n = 0;
/*     */     }
/*     */     
/* 163 */     for (int i1 = 0; i1 < n; i1++) {
/* 164 */       double d1 = (i * 16 + this.b.nextInt(16));
/* 165 */       double d2 = this.b.nextInt(128);
/* 166 */       double d3 = (j * 16 + this.b.nextInt(16));
/*     */       
/* 168 */       int i2 = 1;
/* 169 */       if (this.b.nextInt(4) == 0) {
/* 170 */         a(this.b.nextLong(), k, m, ans1, d1, d2, d3);
/* 171 */         i2 += this.b.nextInt(4);
/*     */       } 
/*     */       
/* 174 */       for (int i3 = 0; i3 < i2; i3++) {
/* 175 */         float f1 = this.b.nextFloat() * 3.1415927F * 2.0F;
/* 176 */         float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 177 */         float f3 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
/*     */         
/* 179 */         a(this.b.nextLong(), k, m, ans1, d1, d2, d3, f3 * 2.0F, f1, f2, 0, 0, 0.5D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */