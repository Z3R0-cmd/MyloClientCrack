/*     */ import java.util.Random;
/*     */ 
/*     */ public class arb
/*     */   extends arh
/*     */ {
/*   6 */   private int[] d = new int[512];
/*     */   public double a;
/*     */   public double b;
/*     */   public double c;
/*     */   
/*     */   public arb() {
/*  12 */     this(new Random());
/*     */   }
/*     */   
/*     */   public arb(Random ☃) {
/*  16 */     this.a = ☃.nextDouble() * 256.0D;
/*  17 */     this.b = ☃.nextDouble() * 256.0D;
/*  18 */     this.c = ☃.nextDouble() * 256.0D; int i;
/*  19 */     for (i = 0; i < 256; i++) {
/*  20 */       this.d[i] = i;
/*     */     }
/*     */     
/*  23 */     for (i = 0; i < 256; i++) {
/*  24 */       int j = ☃.nextInt(256 - i) + i;
/*  25 */       int k = this.d[i];
/*  26 */       this.d[i] = this.d[j];
/*  27 */       this.d[j] = k;
/*     */       
/*  29 */       this.d[i + 256] = this.d[i];
/*     */     } 
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
/*     */   public final double b(double ☃, double d1, double d2) {
/*  84 */     return d1 + ☃ * (d2 - d1);
/*     */   }
/*     */   
/*  87 */   private static final double[] e = new double[] { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  88 */   private static final double[] f = new double[] { 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D };
/*  89 */   private static final double[] g = new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*  90 */   private static final double[] h = new double[] { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  91 */   private static final double[] i = new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*     */   
/*     */   public final double a(int ☃, double d1, double d2) {
/*  94 */     int i = ☃ & 0xF;
/*  95 */     return h[i] * d1 + i[i] * d2;
/*     */   }
/*     */   
/*     */   public final double a(int ☃, double d1, double d2, double d3) {
/*  99 */     int i = ☃ & 0xF;
/* 100 */     return e[i] * d1 + f[i] * d2 + g[i] * d3;
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
/*     */   public void a(double[] ☃, double d1, double d2, double d3, int i, int j, int k, double d4, double d5, double d6, double d7) {
/* 113 */     if (j == 1) {
/* 114 */       int i8 = 0, i9 = 0, i10 = 0, i11 = 0;
/* 115 */       double d13 = 0.0D, d14 = 0.0D;
/* 116 */       int i12 = 0;
/* 117 */       double d15 = 1.0D / d7;
/* 118 */       for (int i13 = 0; i13 < i; i13++) {
/* 119 */         double d16 = d1 + i13 * d4 + this.a;
/* 120 */         int i14 = (int)d16;
/* 121 */         if (d16 < i14) {
/* 122 */           i14--;
/*     */         }
/* 124 */         int i15 = i14 & 0xFF;
/* 125 */         d16 -= i14;
/* 126 */         double d17 = d16 * d16 * d16 * (d16 * (d16 * 6.0D - 15.0D) + 10.0D);
/*     */         
/* 128 */         for (int i16 = 0; i16 < k; i16++) {
/* 129 */           double d18 = d3 + i16 * d6 + this.c;
/* 130 */           int i17 = (int)d18;
/* 131 */           if (d18 < i17) {
/* 132 */             i17--;
/*     */           }
/* 134 */           int i18 = i17 & 0xFF;
/* 135 */           d18 -= i17;
/* 136 */           double d19 = d18 * d18 * d18 * (d18 * (d18 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 138 */           i8 = this.d[i15] + 0;
/* 139 */           i9 = this.d[i8] + i18;
/* 140 */           i10 = this.d[i15 + 1] + 0;
/* 141 */           i11 = this.d[i10] + i18;
/* 142 */           d13 = b(d17, a(this.d[i9], d16, d18), a(this.d[i11], d16 - 1.0D, 0.0D, d18));
/* 143 */           d14 = b(d17, a(this.d[i9 + 1], d16, 0.0D, d18 - 1.0D), a(this.d[i11 + 1], d16 - 1.0D, 0.0D, d18 - 1.0D));
/*     */           
/* 145 */           double d20 = b(d19, d13, d14);
/*     */           
/* 147 */           ☃[i12++] = ☃[i12++] + d20 * d15;
/*     */         } 
/*     */       } 
/*     */       return;
/*     */     } 
/* 152 */     int m = 0;
/* 153 */     double d8 = 1.0D / d7;
/* 154 */     int n = -1;
/* 155 */     int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0, i6 = 0;
/* 156 */     double d9 = 0.0D, d10 = 0.0D, d11 = 0.0D, d12 = 0.0D;
/*     */     
/* 158 */     for (int i7 = 0; i7 < i; i7++) {
/* 159 */       double d13 = d1 + i7 * d4 + this.a;
/* 160 */       int i8 = (int)d13;
/* 161 */       if (d13 < i8) {
/* 162 */         i8--;
/*     */       }
/* 164 */       int i9 = i8 & 0xFF;
/* 165 */       d13 -= i8;
/* 166 */       double d14 = d13 * d13 * d13 * (d13 * (d13 * 6.0D - 15.0D) + 10.0D);
/*     */       
/* 168 */       for (int i10 = 0; i10 < k; i10++) {
/* 169 */         double d15 = d3 + i10 * d6 + this.c;
/* 170 */         int i11 = (int)d15;
/* 171 */         if (d15 < i11) {
/* 172 */           i11--;
/*     */         }
/* 174 */         int i12 = i11 & 0xFF;
/* 175 */         d15 -= i11;
/* 176 */         double d16 = d15 * d15 * d15 * (d15 * (d15 * 6.0D - 15.0D) + 10.0D);
/*     */         
/* 178 */         for (int i13 = 0; i13 < j; i13++) {
/* 179 */           double d17 = d2 + i13 * d5 + this.b;
/* 180 */           int i14 = (int)d17;
/* 181 */           if (d17 < i14) {
/* 182 */             i14--;
/*     */           }
/* 184 */           int i15 = i14 & 0xFF;
/* 185 */           d17 -= i14;
/* 186 */           double d18 = d17 * d17 * d17 * (d17 * (d17 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 188 */           if (i13 == 0 || i15 != n) {
/* 189 */             n = i15;
/* 190 */             i1 = this.d[i9] + i15;
/* 191 */             i2 = this.d[i1] + i12;
/* 192 */             i3 = this.d[i1 + 1] + i12;
/* 193 */             i4 = this.d[i9 + 1] + i15;
/* 194 */             i5 = this.d[i4] + i12;
/* 195 */             i6 = this.d[i4 + 1] + i12;
/* 196 */             d9 = b(d14, a(this.d[i2], d13, d17, d15), a(this.d[i5], d13 - 1.0D, d17, d15));
/* 197 */             d10 = b(d14, a(this.d[i3], d13, d17 - 1.0D, d15), a(this.d[i6], d13 - 1.0D, d17 - 1.0D, d15));
/* 198 */             d11 = b(d14, a(this.d[i2 + 1], d13, d17, d15 - 1.0D), a(this.d[i5 + 1], d13 - 1.0D, d17, d15 - 1.0D));
/* 199 */             d12 = b(d14, a(this.d[i3 + 1], d13, d17 - 1.0D, d15 - 1.0D), a(this.d[i6 + 1], d13 - 1.0D, d17 - 1.0D, d15 - 1.0D));
/*     */           } 
/*     */           
/* 202 */           double d19 = b(d18, d9, d10);
/* 203 */           double d20 = b(d18, d11, d12);
/* 204 */           double d21 = b(d16, d19, d20);
/*     */           
/* 206 */           ☃[m++] = ☃[m++] + d21 * d8;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */