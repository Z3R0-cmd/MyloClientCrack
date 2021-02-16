/*     */ import java.util.Arrays;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aek
/*     */   extends ady
/*     */ {
/*     */   private alz[] aD;
/*     */   private long aE;
/*     */   private ard aF;
/*     */   private ard aG;
/*     */   private ard aH;
/*     */   private boolean aI;
/*     */   private boolean aJ;
/*     */   
/*     */   public aek(int ☃, boolean bool1, boolean bool2) {
/*  29 */     super(☃);
/*  30 */     this.aI = bool1;
/*  31 */     this.aJ = bool2;
/*     */     
/*  33 */     b();
/*  34 */     a(2.0F, 0.0F);
/*     */ 
/*     */     
/*  37 */     this.au.clear();
/*  38 */     this.ak = afi.m.Q().a(ajh.a, ajh.a.b);
/*  39 */     this.al = afi.cu.Q();
/*     */     
/*  41 */     this.as.A = -999;
/*  42 */     this.as.D = 20;
/*  43 */     this.as.F = 3;
/*  44 */     this.as.G = 5;
/*  45 */     this.as.B = 0;
/*     */     
/*  47 */     this.au.clear();
/*     */     
/*  49 */     if (bool2) {
/*  50 */       this.as.A = 5;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aoh a(Random ☃) {
/*  56 */     return this.aA;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(cj ☃) {
/*  61 */     return 10387789;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(cj ☃) {
/*  66 */     return 9470285;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, cj cj1) {
/*  71 */     super.a(☃, random, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, ans ans1, int i, int j, double d) {
/*  76 */     if (this.aD == null || this.aE != ☃.J()) {
/*  77 */       a(☃.J());
/*     */     }
/*  79 */     if (this.aF == null || this.aG == null || this.aE != ☃.J()) {
/*  80 */       Random random1 = new Random(this.aE);
/*  81 */       this.aF = new ard(random1, 4);
/*  82 */       this.aG = new ard(random1, 1);
/*     */     } 
/*  84 */     this.aE = ☃.J();
/*     */     
/*  86 */     double d1 = 0.0D;
/*  87 */     if (this.aI) {
/*  88 */       int i4 = (i & 0xFFFFFFF0) + (j & 0xF);
/*  89 */       int i5 = (j & 0xFFFFFFF0) + (i & 0xF);
/*     */       
/*  91 */       double d2 = Math.min(Math.abs(d), this.aF.a(i4 * 0.25D, i5 * 0.25D));
/*  92 */       if (d2 > 0.0D) {
/*  93 */         double d3 = 0.001953125D;
/*  94 */         double d4 = Math.abs(this.aG.a(i4 * d3, i5 * d3));
/*  95 */         d1 = d2 * d2 * 2.5D;
/*  96 */         double d5 = Math.ceil(d4 * 50.0D) + 14.0D;
/*  97 */         if (d1 > d5) {
/*  98 */           d1 = d5;
/*     */         }
/* 100 */         d1 += 64.0D;
/*     */       } 
/*     */     } 
/*     */     
/* 104 */     int k = i & 0xF;
/* 105 */     int m = j & 0xF;
/*     */     
/* 107 */     int n = ☃.F();
/*     */     
/* 109 */     alz alz1 = afi.cu.Q();
/* 110 */     alz alz2 = this.al;
/*     */     
/* 112 */     int i1 = (int)(d / 3.0D + 3.0D + random.nextDouble() * 0.25D);
/* 113 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/* 114 */     int i2 = -1;
/* 115 */     boolean bool2 = false;
/*     */     
/* 117 */     for (int i3 = 255; i3 >= 0; i3--) {
/* 118 */       if (ans1.a(m, i3, k).c().t() == arm.a && i3 < (int)d1) {
/* 119 */         ans1.a(m, i3, k, afi.b.Q());
/*     */       }
/*     */       
/* 122 */       if (i3 <= random.nextInt(5)) {
/* 123 */         ans1.a(m, i3, k, afi.h.Q());
/*     */       } else {
/* 125 */         alz alz3 = ans1.a(m, i3, k);
/*     */         
/* 127 */         if (alz3.c().t() == arm.a) {
/* 128 */           i2 = -1;
/* 129 */         } else if (alz3.c() == afi.b) {
/* 130 */           if (i2 == -1) {
/* 131 */             bool2 = false;
/* 132 */             if (i1 <= 0) {
/* 133 */               alz1 = null;
/* 134 */               alz2 = afi.b.Q();
/* 135 */             } else if (i3 >= n - 4 && i3 <= n + 1) {
/* 136 */               alz1 = afi.cu.Q();
/* 137 */               alz2 = this.al;
/*     */             } 
/*     */             
/* 140 */             if (i3 < n && (alz1 == null || alz1.c().t() == arm.a)) {
/* 141 */               alz1 = afi.j.Q();
/*     */             }
/*     */             
/* 144 */             i2 = i1 + Math.max(0, i3 - n);
/* 145 */             if (i3 >= n - 1) {
/* 146 */               if (this.aJ && i3 > 86 + i1 * 2) {
/* 147 */                 if (bool1) {
/* 148 */                   ans1.a(m, i3, k, afi.d.Q().a(agf.a, agf.a.b));
/*     */                 } else {
/* 150 */                   ans1.a(m, i3, k, afi.c.Q());
/*     */                 } 
/* 152 */               } else if (i3 > n + 3 + i1) {
/*     */                 alz alz4;
/* 154 */                 if (i3 < 64 || i3 > 127) {
/* 155 */                   alz4 = afi.cu.Q().a(afv.a, zd.b);
/* 156 */                 } else if (bool1) {
/* 157 */                   alz4 = afi.cz.Q();
/*     */                 } else {
/* 159 */                   alz4 = a(i, i3, j);
/*     */                 } 
/* 161 */                 ans1.a(m, i3, k, alz4);
/*     */               } else {
/* 163 */                 ans1.a(m, i3, k, this.ak);
/* 164 */                 bool2 = true;
/*     */               } 
/*     */             } else {
/* 167 */               ans1.a(m, i3, k, alz2);
/* 168 */               if (alz2.c() == afi.cu) {
/* 169 */                 ans1.a(m, i3, k, alz2.c().Q().a(afv.a, zd.b));
/*     */               }
/*     */             } 
/* 172 */           } else if (i2 > 0) {
/* 173 */             i2--;
/*     */             
/* 175 */             if (bool2) {
/* 176 */               ans1.a(m, i3, k, afi.cu.Q().a(afv.a, zd.b));
/*     */             } else {
/* 178 */               alz alz4 = a(i, i3, j);
/* 179 */               ans1.a(m, i3, k, alz4);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(long ☃) {
/* 188 */     this.aD = new alz[64];
/* 189 */     Arrays.fill((Object[])this.aD, afi.cz.Q());
/*     */     
/* 191 */     Random random = new Random(☃);
/* 192 */     this.aH = new ard(random, 1);
/*     */     int i;
/* 194 */     for (i = 0; i < 64; i++) {
/* 195 */       i += random.nextInt(5) + 1;
/* 196 */       if (i < 64) {
/* 197 */         this.aD[i] = afi.cu.Q().a(afv.a, zd.b);
/*     */       }
/*     */     } 
/*     */     
/* 201 */     i = random.nextInt(4) + 2; int j;
/* 202 */     for (j = 0; j < i; j++) {
/* 203 */       int i2 = random.nextInt(3) + 1;
/* 204 */       int i3 = random.nextInt(64);
/*     */       
/* 206 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 207 */         this.aD[i3 + i4] = afi.cu.Q().a(afv.a, zd.e);
/*     */       }
/*     */     } 
/* 210 */     j = random.nextInt(4) + 2; int k;
/* 211 */     for (k = 0; k < j; k++) {
/* 212 */       int i2 = random.nextInt(3) + 2;
/* 213 */       int i3 = random.nextInt(64);
/*     */       
/* 215 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 216 */         this.aD[i3 + i4] = afi.cu.Q().a(afv.a, zd.m);
/*     */       }
/*     */     } 
/* 219 */     k = random.nextInt(4) + 2; int m;
/* 220 */     for (m = 0; m < k; m++) {
/* 221 */       int i2 = random.nextInt(3) + 1;
/* 222 */       int i3 = random.nextInt(64);
/*     */       
/* 224 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 225 */         this.aD[i3 + i4] = afi.cu.Q().a(afv.a, zd.o);
/*     */       }
/*     */     } 
/* 228 */     m = random.nextInt(3) + 3;
/* 229 */     int n = 0;
/* 230 */     for (int i1 = 0; i1 < m; i1++) {
/* 231 */       int i2 = 1;
/* 232 */       n += random.nextInt(16) + 4;
/*     */       
/* 234 */       for (int i3 = 0; n + i3 < 64 && i3 < i2; i3++) {
/* 235 */         this.aD[n + i3] = afi.cu.Q().a(afv.a, zd.a);
/* 236 */         if (n + i3 > 1 && random.nextBoolean()) {
/* 237 */           this.aD[n + i3 - 1] = afi.cu.Q().a(afv.a, zd.i);
/*     */         }
/* 239 */         if (n + i3 < 63 && random.nextBoolean()) {
/* 240 */           this.aD[n + i3 + 1] = afi.cu.Q().a(afv.a, zd.i);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private alz a(int ☃, int i, int j) {
/* 247 */     int k = (int)Math.round(this.aH.a(☃ * 1.0D / 512.0D, ☃ * 1.0D / 512.0D) * 2.0D);
/* 248 */     return this.aD[(i + k + 64) % 64];
/*     */   }
/*     */ 
/*     */   
/*     */   protected ady d(int ☃) {
/* 253 */     boolean bool = (this.az == ady.aa.az);
/*     */     
/* 255 */     aek aek1 = new aek(☃, bool, this.aJ);
/*     */     
/* 257 */     if (!bool) {
/* 258 */       aek1.a(g);
/* 259 */       aek1.a(this.ah + " M");
/*     */     } else {
/* 261 */       aek1.a(this.ah + " (Bryce)");
/*     */     } 
/* 263 */     aek1.a(this.ai, true);
/*     */     
/* 265 */     return aek1;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */