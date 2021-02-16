/*     */ import com.google.common.base.Objects;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anx
/*     */   extends any
/*     */ {
/*     */   protected void a(long ☃, int i, int j, ans ans1, double d1, double d2, double d3) {
/*  16 */     a(☃, i, j, ans1, d1, d2, d3, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
/*     */   }
/*     */   
/*     */   protected void a(long ☃, int i, int j, ans ans1, double d1, double d2, double d3, float f1, float f2, float f3, int k, int m, double d4) {
/*  20 */     double d5 = (i * 16 + 8);
/*  21 */     double d6 = (j * 16 + 8);
/*     */     
/*  23 */     float f4 = 0.0F;
/*  24 */     float f5 = 0.0F;
/*  25 */     Random random = new Random(☃);
/*     */     
/*  27 */     if (m <= 0) {
/*  28 */       int i1 = this.a * 16 - 16;
/*  29 */       m = i1 - random.nextInt(i1 / 4);
/*     */     } 
/*  31 */     boolean bool1 = false;
/*     */     
/*  33 */     if (k == -1) {
/*  34 */       k = m / 2;
/*  35 */       bool1 = true;
/*     */     } 
/*     */     
/*  38 */     int n = random.nextInt(m / 2) + m / 4;
/*  39 */     boolean bool2 = (random.nextInt(6) == 0);
/*     */     
/*  41 */     for (; k < m; k++) {
/*  42 */       double d7 = 1.5D + (ns.a(k * 3.1415927F / m) * f1 * 1.0F);
/*  43 */       double d8 = d7 * d4;
/*     */       
/*  45 */       float f6 = ns.b(f3);
/*  46 */       float f7 = ns.a(f3);
/*  47 */       d1 += (ns.b(f2) * f6);
/*  48 */       d2 += f7;
/*  49 */       d3 += (ns.a(f2) * f6);
/*     */       
/*  51 */       if (bool2) {
/*  52 */         f3 *= 0.92F;
/*     */       } else {
/*  54 */         f3 *= 0.7F;
/*     */       } 
/*  56 */       f3 += f5 * 0.1F;
/*  57 */       f2 += f4 * 0.1F;
/*     */       
/*  59 */       f5 *= 0.9F;
/*  60 */       f4 *= 0.75F;
/*  61 */       f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
/*  62 */       f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;
/*     */       
/*  64 */       if (!bool1 && k == n && f1 > 1.0F && m > 0) {
/*  65 */         a(random.nextLong(), i, j, ans1, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 - 1.5707964F, f3 / 3.0F, k, m, 1.0D);
/*  66 */         a(random.nextLong(), i, j, ans1, d1, d2, d3, random.nextFloat() * 0.5F + 0.5F, f2 + 1.5707964F, f3 / 3.0F, k, m, 1.0D);
/*     */         return;
/*     */       } 
/*  69 */       if (bool1 || random.nextInt(4) != 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  74 */         double d9 = d1 - d5;
/*  75 */         double d10 = d3 - d6;
/*  76 */         double d11 = (m - k);
/*  77 */         double d12 = (f1 + 2.0F + 16.0F);
/*  78 */         if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/*  83 */         if (d1 >= d5 - 16.0D - d7 * 2.0D && d3 >= d6 - 16.0D - d7 * 2.0D && d1 <= d5 + 16.0D + d7 * 2.0D && d3 <= d6 + 16.0D + d7 * 2.0D) {
/*     */ 
/*     */ 
/*     */           
/*  87 */           int i1 = ns.c(d1 - d7) - i * 16 - 1;
/*  88 */           int i2 = ns.c(d1 + d7) - i * 16 + 1;
/*     */           
/*  90 */           int i3 = ns.c(d2 - d8) - 1;
/*  91 */           int i4 = ns.c(d2 + d8) + 1;
/*     */           
/*  93 */           int i5 = ns.c(d3 - d7) - j * 16 - 1;
/*  94 */           int i6 = ns.c(d3 + d7) - j * 16 + 1;
/*     */           
/*  96 */           if (i1 < 0) {
/*  97 */             i1 = 0;
/*     */           }
/*  99 */           if (i2 > 16) {
/* 100 */             i2 = 16;
/*     */           }
/*     */           
/* 103 */           if (i3 < 1) {
/* 104 */             i3 = 1;
/*     */           }
/* 106 */           if (i4 > 248) {
/* 107 */             i4 = 248;
/*     */           }
/*     */           
/* 110 */           if (i5 < 0) {
/* 111 */             i5 = 0;
/*     */           }
/* 113 */           if (i6 > 16) {
/* 114 */             i6 = 16;
/*     */           }
/*     */           
/* 117 */           boolean bool = false;
/* 118 */           for (int i7 = i1; !bool && i7 < i2; i7++) {
/* 119 */             for (int i8 = i5; !bool && i8 < i6; i8++) {
/* 120 */               for (int i9 = i4 + 1; !bool && i9 >= i3 - 1; i9--) {
/* 121 */                 if (i9 >= 0 && i9 < 256) {
/*     */ 
/*     */                   
/* 124 */                   alz alz = ans1.a(i7, i9, i8);
/* 125 */                   if (alz.c() == afi.i || alz.c() == afi.j) {
/* 126 */                     bool = true;
/*     */                   }
/* 128 */                   if (i9 != i3 - 1 && i7 != i1 && i7 != i2 - 1 && i8 != i5 && i8 != i6 - 1)
/* 129 */                     i9 = i3; 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/* 134 */           if (!bool) {
/*     */ 
/*     */ 
/*     */             
/* 138 */             cj.a a = new cj.a();
/* 139 */             for (int i8 = i1; i8 < i2; i8++) {
/* 140 */               double d = ((i8 + i * 16) + 0.5D - d1) / d7;
/* 141 */               for (int i9 = i5; i9 < i6; i9++) {
/* 142 */                 double d13 = ((i9 + j * 16) + 0.5D - d3) / d7;
/* 143 */                 boolean bool3 = false;
/* 144 */                 if (d * d + d13 * d13 < 1.0D) {
/* 145 */                   for (int i10 = i4; i10 > i3; i10--) {
/* 146 */                     double d14 = ((i10 - 1) + 0.5D - d2) / d8;
/* 147 */                     if (d14 > -0.7D && d * d + d14 * d14 + d13 * d13 < 1.0D) {
/* 148 */                       alz alz1 = ans1.a(i8, i10, i9);
/* 149 */                       alz alz2 = (alz)Objects.firstNonNull(ans1.a(i8, i10 + 1, i9), afi.a.Q());
/* 150 */                       if (alz1.c() == afi.c || alz1.c() == afi.bw) {
/* 151 */                         bool3 = true;
/*     */                       }
/* 153 */                       if (a(alz1, alz2)) {
/* 154 */                         if (i10 - 1 < 10) {
/* 155 */                           ans1.a(i8, i10, i9, afi.l.Q());
/*     */                         } else {
/* 157 */                           ans1.a(i8, i10, i9, afi.a.Q());
/* 158 */                           if (alz2.c() == afi.m) {
/* 159 */                             ans1.a(i8, i10 + 1, i9, (alz2.b(ajh.a) == ajh.a.b) ? afi.cM.Q() : afi.A.Q());
/*     */                           }
/* 161 */                           if (bool3 && ans1.a(i8, i10 - 1, i9).c() == afi.d) {
/* 162 */                             a.c(i8 + i * 16, 0, i9 + j * 16);
/* 163 */                             ans1.a(i8, i10 - 1, i9, (this.c.b(a)).ak.c().Q());
/*     */                           } 
/*     */                         } 
/*     */                       }
/*     */                     } 
/*     */                   } 
/*     */                 }
/*     */               } 
/*     */             } 
/* 172 */             if (bool1)
/*     */               break; 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } protected boolean a(alz ☃, alz alz1) {
/* 179 */     if (☃.c() == afi.b) {
/* 180 */       return true;
/*     */     }
/* 182 */     if (☃.c() == afi.d) {
/* 183 */       return true;
/*     */     }
/* 185 */     if (☃.c() == afi.c) {
/* 186 */       return true;
/*     */     }
/* 188 */     if (☃.c() == afi.cz) {
/* 189 */       return true;
/*     */     }
/* 191 */     if (☃.c() == afi.cu) {
/* 192 */       return true;
/*     */     }
/* 194 */     if (☃.c() == afi.A) {
/* 195 */       return true;
/*     */     }
/* 197 */     if (☃.c() == afi.cM) {
/* 198 */       return true;
/*     */     }
/* 200 */     if (☃.c() == afi.bw) {
/* 201 */       return true;
/*     */     }
/* 203 */     if (☃.c() == afi.aH) {
/* 204 */       return true;
/*     */     }
/* 206 */     if ((☃.c() == afi.m || ☃.c() == afi.n) && alz1.c().t() != arm.h) {
/* 207 */       return true;
/*     */     }
/*     */     
/* 210 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, int i, int j, int k, int m, ans ans1) {
/* 215 */     int n = this.b.nextInt(this.b.nextInt(this.b.nextInt(15) + 1) + 1);
/* 216 */     if (this.b.nextInt(7) != 0) {
/* 217 */       n = 0;
/*     */     }
/*     */     
/* 220 */     for (int i1 = 0; i1 < n; i1++) {
/* 221 */       double d1 = (i * 16 + this.b.nextInt(16));
/* 222 */       double d2 = this.b.nextInt(this.b.nextInt(120) + 8);
/* 223 */       double d3 = (j * 16 + this.b.nextInt(16));
/*     */       
/* 225 */       int i2 = 1;
/* 226 */       if (this.b.nextInt(4) == 0) {
/* 227 */         a(this.b.nextLong(), k, m, ans1, d1, d2, d3);
/* 228 */         i2 += this.b.nextInt(4);
/*     */       } 
/*     */       
/* 231 */       for (int i3 = 0; i3 < i2; i3++) {
/* 232 */         float f1 = this.b.nextFloat() * 3.1415927F * 2.0F;
/* 233 */         float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 234 */         float f3 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
/* 235 */         if (this.b.nextInt(10) == 0) {
/* 236 */           f3 *= this.b.nextFloat() * this.b.nextFloat() * 3.0F + 1.0F;
/*     */         }
/*     */         
/* 239 */         a(this.b.nextLong(), k, m, ans1, d1, d2, d3, f3, f1, f2, 0, 0, 1.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */