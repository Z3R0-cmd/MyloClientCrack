/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ public class arg
/*     */ {
/*   6 */   private static int[][] e = new int[][] { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
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
/*  20 */   public static final double a = Math.sqrt(3.0D);
/*     */   
/*  22 */   private int[] f = new int[512];
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   
/*     */   public arg() {
/*  28 */     this(new Random());
/*     */   }
/*     */   
/*     */   public arg(Random ☃) {
/*  32 */     this.b = ☃.nextDouble() * 256.0D;
/*  33 */     this.c = ☃.nextDouble() * 256.0D;
/*  34 */     this.d = ☃.nextDouble() * 256.0D; int i;
/*  35 */     for (i = 0; i < 256; i++) {
/*  36 */       this.f[i] = i;
/*     */     }
/*     */     
/*  39 */     for (i = 0; i < 256; i++) {
/*  40 */       int j = ☃.nextInt(256 - i) + i;
/*  41 */       int k = this.f[i];
/*  42 */       this.f[i] = this.f[j];
/*  43 */       this.f[j] = k;
/*     */       
/*  45 */       this.f[i + 256] = this.f[i];
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(double ☃) {
/*  51 */     return (☃ > 0.0D) ? (int)☃ : ((int)☃ - 1);
/*     */   }
/*     */   
/*     */   private static double a(int[] ☃, double d1, double d2) {
/*  55 */     return ☃[0] * d1 + ☃[1] * d2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double a(double ☃, double d1) {
/*     */     double d2, d3, d4;
/*     */     int k, m;
/*  66 */     double d5 = 0.5D * (a - 1.0D);
/*  67 */     double d6 = (☃ + d1) * d5;
/*  68 */     int i = a(☃ + d6);
/*  69 */     int j = a(d1 + d6);
/*  70 */     double d7 = (3.0D - a) / 6.0D;
/*  71 */     double d8 = (i + j) * d7;
/*  72 */     double d9 = i - d8;
/*  73 */     double d10 = j - d8;
/*  74 */     double d11 = ☃ - d9;
/*  75 */     double d12 = d1 - d10;
/*     */ 
/*     */ 
/*     */     
/*  79 */     if (d11 > d12) {
/*  80 */       k = 1;
/*  81 */       m = 0;
/*     */     } else {
/*     */       
/*  84 */       k = 0;
/*  85 */       m = 1;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  90 */     double d13 = d11 - k + d7;
/*  91 */     double d14 = d12 - m + d7;
/*  92 */     double d15 = d11 - 1.0D + 2.0D * d7;
/*  93 */     double d16 = d12 - 1.0D + 2.0D * d7;
/*     */     
/*  95 */     int n = i & 0xFF;
/*  96 */     int i1 = j & 0xFF;
/*  97 */     int i2 = this.f[n + this.f[i1]] % 12;
/*  98 */     int i3 = this.f[n + k + this.f[i1 + m]] % 12;
/*  99 */     int i4 = this.f[n + 1 + this.f[i1 + 1]] % 12;
/*     */     
/* 101 */     double d17 = 0.5D - d11 * d11 - d12 * d12;
/* 102 */     if (d17 < 0.0D) {
/* 103 */       d2 = 0.0D;
/*     */     } else {
/* 105 */       d17 *= d17;
/* 106 */       d2 = d17 * d17 * a(e[i2], d11, d12);
/*     */     } 
/* 108 */     double d18 = 0.5D - d13 * d13 - d14 * d14;
/* 109 */     if (d18 < 0.0D) {
/* 110 */       d3 = 0.0D;
/*     */     } else {
/* 112 */       d18 *= d18;
/* 113 */       d3 = d18 * d18 * a(e[i3], d13, d14);
/*     */     } 
/* 115 */     double d19 = 0.5D - d15 * d15 - d16 * d16;
/* 116 */     if (d19 < 0.0D) {
/* 117 */       d4 = 0.0D;
/*     */     } else {
/* 119 */       d19 *= d19;
/* 120 */       d4 = d19 * d19 * a(e[i4], d15, d16);
/*     */     } 
/*     */ 
/*     */     
/* 124 */     return 70.0D * (d2 + d3 + d4);
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 252 */   private static final double g = 0.5D * (a - 1.0D);
/* 253 */   private static final double h = (3.0D - a) / 6.0D;
/*     */   
/*     */   public void a(double[] ☃, double d1, double d2, int i, int j, double d3, double d4, double d5) {
/* 256 */     int k = 0;
/* 257 */     for (int m = 0; m < j; m++) {
/* 258 */       double d = (d2 + m) * d4 + this.c;
/* 259 */       for (int n = 0; n < i; n++) {
/* 260 */         double d7, d8, d9; int i3, i4; double d6 = (d1 + n) * d3 + this.b;
/*     */ 
/*     */         
/* 263 */         double d10 = (d6 + d) * g;
/* 264 */         int i1 = a(d6 + d10);
/* 265 */         int i2 = a(d + d10);
/* 266 */         double d11 = (i1 + i2) * h;
/* 267 */         double d12 = i1 - d11;
/* 268 */         double d13 = i2 - d11;
/* 269 */         double d14 = d6 - d12;
/* 270 */         double d15 = d - d13;
/*     */ 
/*     */ 
/*     */         
/* 274 */         if (d14 > d15) {
/* 275 */           i3 = 1;
/* 276 */           i4 = 0;
/*     */         } else {
/*     */           
/* 279 */           i3 = 0;
/* 280 */           i4 = 1;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 285 */         double d16 = d14 - i3 + h;
/* 286 */         double d17 = d15 - i4 + h;
/* 287 */         double d18 = d14 - 1.0D + 2.0D * h;
/* 288 */         double d19 = d15 - 1.0D + 2.0D * h;
/*     */         
/* 290 */         int i5 = i1 & 0xFF;
/* 291 */         int i6 = i2 & 0xFF;
/* 292 */         int i7 = this.f[i5 + this.f[i6]] % 12;
/* 293 */         int i8 = this.f[i5 + i3 + this.f[i6 + i4]] % 12;
/* 294 */         int i9 = this.f[i5 + 1 + this.f[i6 + 1]] % 12;
/*     */         
/* 296 */         double d20 = 0.5D - d14 * d14 - d15 * d15;
/* 297 */         if (d20 < 0.0D) {
/* 298 */           d7 = 0.0D;
/*     */         } else {
/* 300 */           d20 *= d20;
/* 301 */           d7 = d20 * d20 * a(e[i7], d14, d15);
/*     */         } 
/* 303 */         double d21 = 0.5D - d16 * d16 - d17 * d17;
/* 304 */         if (d21 < 0.0D) {
/* 305 */           d8 = 0.0D;
/*     */         } else {
/* 307 */           d21 *= d21;
/* 308 */           d8 = d21 * d21 * a(e[i8], d16, d17);
/*     */         } 
/* 310 */         double d22 = 0.5D - d18 * d18 - d19 * d19;
/* 311 */         if (d22 < 0.0D) {
/* 312 */           d9 = 0.0D;
/*     */         } else {
/* 314 */           d22 *= d22;
/* 315 */           d9 = d22 * d22 * a(e[i9], d18, d19);
/*     */         } 
/*     */ 
/*     */         
/* 319 */         ☃[k++] = ☃[k++] + 70.0D * (d7 + d8 + d9) * d5;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */