/*     */ import java.util.List;
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
/*     */ public class anw
/*     */   implements amv
/*     */ {
/*     */   private final adm h;
/*     */   private final boolean i;
/*     */   private final Random j;
/*  33 */   private double[] k = new double[256];
/*  34 */   private double[] l = new double[256];
/*  35 */   private double[] m = new double[256];
/*     */   
/*     */   private double[] n;
/*     */   
/*     */   private final arc o;
/*     */   private final arc p;
/*     */   private final arc q;
/*     */   private final arc r;
/*     */   private final arc s;
/*     */   public final arc a;
/*     */   public final arc b;
/*  46 */   private final aow t = new aow();
/*  47 */   private final apd u = new apd();
/*  48 */   private final aox v = new aox();
/*  49 */   private final aot w = new apj(afi.co.Q(), 14, amg.a(afi.aV));
/*  50 */   private final aoy x = new aoy(afi.k, true);
/*  51 */   private final aoy y = new aoy(afi.k, false);
/*  52 */   private final aom z = new aom(afi.P);
/*  53 */   private final aom A = new aom(afi.Q);
/*  54 */   private final aqi B = new aqi();
/*  55 */   private final any C = new anz(); double[] c; double[] d;
/*     */   
/*     */   public anw(adm ☃, boolean bool, long l) {
/*  58 */     this.h = ☃;
/*  59 */     this.i = bool;
/*     */     
/*  61 */     this.j = new Random(l);
/*  62 */     this.o = new arc(this.j, 16);
/*  63 */     this.p = new arc(this.j, 16);
/*  64 */     this.q = new arc(this.j, 8);
/*  65 */     this.r = new arc(this.j, 4);
/*  66 */     this.s = new arc(this.j, 4);
/*     */     
/*  68 */     this.a = new arc(this.j, 10);
/*  69 */     this.b = new arc(this.j, 16);
/*     */     
/*  71 */     ☃.b(63);
/*     */   }
/*     */   double[] e; double[] f; double[] g;
/*     */   public void a(int ☃, int i, ans ans1) {
/*  75 */     int j = 4;
/*  76 */     int k = this.h.F() / 2 + 1;
/*     */     
/*  78 */     int m = j + 1;
/*  79 */     int n = 17;
/*  80 */     int i1 = j + 1;
/*  81 */     this.n = a(this.n, ☃ * j, 0, i * j, m, n, i1);
/*     */     
/*  83 */     for (int i2 = 0; i2 < j; i2++) {
/*  84 */       for (int i3 = 0; i3 < j; i3++) {
/*  85 */         for (int i4 = 0; i4 < 16; i4++) {
/*  86 */           double d1 = 0.125D;
/*  87 */           double d2 = this.n[((i2 + 0) * i1 + i3 + 0) * n + i4 + 0];
/*  88 */           double d3 = this.n[((i2 + 0) * i1 + i3 + 1) * n + i4 + 0];
/*  89 */           double d4 = this.n[((i2 + 1) * i1 + i3 + 0) * n + i4 + 0];
/*  90 */           double d5 = this.n[((i2 + 1) * i1 + i3 + 1) * n + i4 + 0];
/*     */           
/*  92 */           double d6 = (this.n[((i2 + 0) * i1 + i3 + 0) * n + i4 + 1] - d2) * d1;
/*  93 */           double d7 = (this.n[((i2 + 0) * i1 + i3 + 1) * n + i4 + 1] - d3) * d1;
/*  94 */           double d8 = (this.n[((i2 + 1) * i1 + i3 + 0) * n + i4 + 1] - d4) * d1;
/*  95 */           double d9 = (this.n[((i2 + 1) * i1 + i3 + 1) * n + i4 + 1] - d5) * d1;
/*     */           
/*  97 */           for (int i5 = 0; i5 < 8; i5++) {
/*  98 */             double d10 = 0.25D;
/*     */             
/* 100 */             double d11 = d2;
/* 101 */             double d12 = d3;
/* 102 */             double d13 = (d4 - d2) * d10;
/* 103 */             double d14 = (d5 - d3) * d10;
/*     */             
/* 105 */             for (int i6 = 0; i6 < 4; i6++) {
/* 106 */               double d15 = 0.25D;
/*     */               
/* 108 */               double d16 = d11;
/* 109 */               double d17 = (d12 - d11) * d15;
/* 110 */               for (int i7 = 0; i7 < 4; i7++) {
/* 111 */                 alz alz = null;
/* 112 */                 if (i4 * 8 + i5 < k) {
/* 113 */                   alz = afi.l.Q();
/*     */                 }
/* 115 */                 if (d16 > 0.0D) {
/* 116 */                   alz = afi.aV.Q();
/*     */                 }
/*     */                 
/* 119 */                 int i8 = i6 + i2 * 4;
/* 120 */                 int i9 = i5 + i4 * 8;
/* 121 */                 int i10 = i7 + i3 * 4;
/* 122 */                 ans1.a(i8, i9, i10, alz);
/* 123 */                 d16 += d17;
/*     */               } 
/* 125 */               d11 += d13;
/* 126 */               d12 += d14;
/*     */             } 
/*     */             
/* 129 */             d2 += d6;
/* 130 */             d3 += d7;
/* 131 */             d4 += d8;
/* 132 */             d5 += d9;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(int ☃, int i, ans ans1) {
/* 140 */     int j = this.h.F() + 1;
/*     */     
/* 142 */     double d = 0.03125D;
/* 143 */     this.k = this.r.a(this.k, ☃ * 16, i * 16, 0, 16, 16, 1, d, d, 1.0D);
/* 144 */     this.l = this.r.a(this.l, ☃ * 16, 109, i * 16, 16, 1, 16, d, 1.0D, d);
/* 145 */     this.m = this.s.a(this.m, ☃ * 16, i * 16, 0, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
/*     */     
/* 147 */     for (int k = 0; k < 16; k++) {
/* 148 */       for (int m = 0; m < 16; m++) {
/* 149 */         boolean bool1 = (this.k[k + m * 16] + this.j.nextDouble() * 0.2D > 0.0D);
/* 150 */         boolean bool2 = (this.l[k + m * 16] + this.j.nextDouble() * 0.2D > 0.0D);
/* 151 */         int n = (int)(this.m[k + m * 16] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);
/*     */         
/* 153 */         int i1 = -1;
/*     */         
/* 155 */         alz alz1 = afi.aV.Q();
/* 156 */         alz alz2 = afi.aV.Q();
/*     */         
/* 158 */         for (int i2 = 127; i2 >= 0; i2--) {
/* 159 */           if (i2 >= 127 - this.j.nextInt(5) || i2 <= this.j.nextInt(5)) {
/* 160 */             ans1.a(m, i2, k, afi.h.Q());
/*     */           } else {
/* 162 */             alz alz = ans1.a(m, i2, k);
/* 163 */             if (alz.c() == null || alz.c().t() == arm.a) {
/* 164 */               i1 = -1;
/* 165 */             } else if (alz.c() == afi.aV) {
/* 166 */               if (i1 == -1) {
/* 167 */                 if (n <= 0) {
/* 168 */                   alz1 = null;
/* 169 */                   alz2 = afi.aV.Q();
/* 170 */                 } else if (i2 >= j - 4 && i2 <= j + 1) {
/* 171 */                   alz1 = afi.aV.Q();
/* 172 */                   alz2 = afi.aV.Q();
/* 173 */                   if (bool2) {
/* 174 */                     alz1 = afi.n.Q();
/* 175 */                     alz2 = afi.aV.Q();
/*     */                   } 
/* 177 */                   if (bool1) {
/* 178 */                     alz1 = afi.aW.Q();
/* 179 */                     alz2 = afi.aW.Q();
/*     */                   } 
/*     */                 } 
/*     */                 
/* 183 */                 if (i2 < j && (alz1 == null || alz1.c().t() == arm.a)) {
/* 184 */                   alz1 = afi.l.Q();
/*     */                 }
/*     */                 
/* 187 */                 i1 = n;
/* 188 */                 if (i2 >= j - 1) {
/* 189 */                   ans1.a(m, i2, k, alz1);
/*     */                 } else {
/* 191 */                   ans1.a(m, i2, k, alz2);
/*     */                 } 
/* 193 */               } else if (i1 > 0) {
/* 194 */                 i1--;
/* 195 */                 ans1.a(m, i2, k, alz2);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public amy d(int ☃, int i) {
/* 211 */     this.j.setSeed(☃ * 341873128712L + i * 132897987541L);
/*     */     
/* 213 */     ans ans = new ans();
/*     */     
/* 215 */     a(☃, i, ans);
/* 216 */     b(☃, i, ans);
/*     */     
/* 218 */     this.C.a(this, this.h, ☃, i, ans);
/* 219 */     if (this.i) {
/* 220 */       this.B.a(this, this.h, ☃, i, ans);
/*     */     }
/*     */     
/* 223 */     amy amy = new amy(this.h, ans, ☃, i);
/* 224 */     ady[] arrayOfAdy = this.h.v().b(null, ☃ * 16, i * 16, 16, 16);
/* 225 */     byte[] arrayOfByte = amy.k();
/*     */     
/* 227 */     for (int j = 0; j < arrayOfByte.length; j++) {
/* 228 */       arrayOfByte[j] = (byte)(arrayOfAdy[j]).az;
/*     */     }
/*     */     
/* 231 */     amy.l();
/*     */     
/* 233 */     return amy;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private double[] a(double[] ☃, int i, int j, int k, int m, int n, int i1) {
/* 239 */     if (☃ == null) {
/* 240 */       ☃ = new double[m * n * i1];
/*     */     }
/*     */     
/* 243 */     double d1 = 684.412D;
/* 244 */     double d2 = 2053.236D;
/*     */     
/* 246 */     this.f = this.a.a(this.f, i, j, k, m, 1, i1, 1.0D, 0.0D, 1.0D);
/* 247 */     this.g = this.b.a(this.g, i, j, k, m, 1, i1, 100.0D, 0.0D, 100.0D);
/*     */     
/* 249 */     this.c = this.q.a(this.c, i, j, k, m, n, i1, d1 / 80.0D, d2 / 60.0D, d1 / 80.0D);
/* 250 */     this.d = this.o.a(this.d, i, j, k, m, n, i1, d1, d2, d1);
/* 251 */     this.e = this.p.a(this.e, i, j, k, m, n, i1, d1, d2, d1);
/*     */     
/* 253 */     int i2 = 0;
/* 254 */     double[] arrayOfDouble = new double[n]; int i3;
/* 255 */     for (i3 = 0; i3 < n; i3++) {
/* 256 */       arrayOfDouble[i3] = Math.cos(i3 * Math.PI * 6.0D / n) * 2.0D;
/*     */       
/* 258 */       double d = i3;
/* 259 */       if (i3 > n / 2) {
/* 260 */         d = (n - 1 - i3);
/*     */       }
/* 262 */       if (d < 4.0D) {
/* 263 */         d = 4.0D - d;
/* 264 */         arrayOfDouble[i3] = arrayOfDouble[i3] - d * d * d * 10.0D;
/*     */       } 
/*     */     } 
/*     */     
/* 268 */     for (i3 = 0; i3 < m; i3++) {
/* 269 */       for (int i4 = 0; i4 < i1; i4++) {
/* 270 */         double d = 0.0D;
/*     */         
/* 272 */         for (int i5 = 0; i5 < n; i5++) {
/* 273 */           double d3 = 0.0D;
/* 274 */           double d4 = arrayOfDouble[i5];
/* 275 */           double d5 = this.d[i2] / 512.0D;
/* 276 */           double d6 = this.e[i2] / 512.0D;
/* 277 */           double d7 = (this.c[i2] / 10.0D + 1.0D) / 2.0D;
/*     */           
/* 279 */           if (d7 < 0.0D) {
/* 280 */             d3 = d5;
/* 281 */           } else if (d7 > 1.0D) {
/* 282 */             d3 = d6;
/*     */           } else {
/* 284 */             d3 = d5 + (d6 - d5) * d7;
/*     */           } 
/*     */           
/* 287 */           d3 -= d4;
/*     */           
/* 289 */           if (i5 > n - 4) {
/* 290 */             double d8 = ((i5 - n - 4) / 3.0F);
/* 291 */             d3 = d3 * (1.0D - d8) + -10.0D * d8;
/*     */           } 
/*     */           
/* 294 */           if (i5 < d) {
/* 295 */             double d8 = (d - i5) / 4.0D;
/* 296 */             d8 = ns.a(d8, 0.0D, 1.0D);
/* 297 */             d3 = d3 * (1.0D - d8) + -10.0D * d8;
/*     */           } 
/*     */           
/* 300 */           ☃[i2] = d3;
/* 301 */           i2++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 306 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 311 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amv ☃, int i, int j) {
/* 316 */     agr.N = true;
/* 317 */     cj cj = new cj(i * 16, 0, j * 16);
/*     */     
/* 319 */     adg adg = new adg(i, j);
/*     */     
/* 321 */     this.B.a(this.h, this.j, adg);
/*     */     int k;
/* 323 */     for (k = 0; k < 8; k++) {
/* 324 */       this.y.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
/*     */     }
/*     */     
/* 327 */     for (k = 0; k < this.j.nextInt(this.j.nextInt(10) + 1) + 1; k++) {
/* 328 */       this.t.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
/*     */     }
/*     */     
/* 331 */     for (k = 0; k < this.j.nextInt(this.j.nextInt(10) + 1); k++) {
/* 332 */       this.u.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
/*     */     }
/*     */     
/* 335 */     for (k = 0; k < 10; k++) {
/* 336 */       this.v.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
/*     */     }
/*     */     
/* 339 */     if (this.j.nextBoolean()) {
/* 340 */       this.z.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
/*     */     }
/*     */     
/* 343 */     if (this.j.nextBoolean()) {
/* 344 */       this.A.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
/*     */     }
/*     */     
/* 347 */     for (k = 0; k < 16; k++) {
/* 348 */       this.w.b(this.h, this.j, cj.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
/*     */     }
/*     */     
/* 351 */     for (k = 0; k < 16; k++) {
/* 352 */       this.x.b(this.h, this.j, cj.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
/*     */     }
/*     */     
/* 355 */     agr.N = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(amv ☃, amy amy1, int i, int j) {
/* 360 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boolean ☃, nu nu1) {
/* 365 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 374 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 379 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 384 */     return "HellRandomLevelSource";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ady.c> a(pt ☃, cj cj1) {
/* 390 */     if (☃ == pt.a) {
/* 391 */       if (this.B.b(cj1)) {
/* 392 */         return this.B.b();
/*     */       }
/* 394 */       if (this.B.a(this.h, cj1) && this.h.p(cj1.b()).c() == afi.by) {
/* 395 */         return this.B.b();
/*     */       }
/*     */     } 
/*     */     
/* 399 */     ady ady = this.h.b(cj1);
/* 400 */     return ady.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cj a(adm ☃, String str, cj cj1) {
/* 405 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 410 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amy ☃, int i, int j) {
/* 415 */     this.B.a(this, this.h, i, j, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public amy a(cj ☃) {
/* 420 */     return d(☃.n() >> 4, ☃.p() >> 4);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */