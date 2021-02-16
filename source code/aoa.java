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
/*     */ public class aoa
/*     */   implements amv
/*     */ {
/*     */   private Random h;
/*     */   private arc i;
/*     */   private arc j;
/*     */   private arc k;
/*     */   private ard l;
/*     */   public arc a;
/*     */   public arc b;
/*     */   public arc c;
/*     */   private adm m;
/*     */   private final boolean n;
/*     */   private adr o;
/*     */   private final double[] p;
/*     */   private final float[] q;
/*     */   private ant r;
/*  64 */   private afh s = afi.j;
/*     */ 
/*     */ 
/*     */   
/*     */   private double[] t;
/*     */ 
/*     */   
/*     */   private any u;
/*     */ 
/*     */   
/*     */   private aqo v;
/*     */ 
/*     */   
/*     */   private aqv w;
/*     */ 
/*     */   
/*     */   private aqf x;
/*     */ 
/*     */   
/*     */   private aqm y;
/*     */ 
/*     */   
/*     */   private any z;
/*     */ 
/*     */   
/*     */   private aqk A;
/*     */ 
/*     */   
/*     */   private ady[] B;
/*     */ 
/*     */   
/*     */   double[] d;
/*     */ 
/*     */   
/*     */   double[] e;
/*     */ 
/*     */   
/*     */   double[] f;
/*     */ 
/*     */   
/*     */   double[] g;
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, ans ans1) {
/* 109 */     this.B = this.m.v().a(this.B, ☃ * 4 - 2, i * 4 - 2, 10, 10);
/* 110 */     a(☃ * 4, 0, i * 4);
/*     */     
/* 112 */     for (int j = 0; j < 4; j++) {
/* 113 */       int k = j * 5;
/* 114 */       int m = (j + 1) * 5;
/* 115 */       for (int n = 0; n < 4; n++) {
/* 116 */         int i1 = (k + n) * 33;
/* 117 */         int i2 = (k + n + 1) * 33;
/* 118 */         int i3 = (m + n) * 33;
/* 119 */         int i4 = (m + n + 1) * 33;
/* 120 */         for (int i5 = 0; i5 < 32; i5++) {
/* 121 */           double d1 = 0.125D;
/* 122 */           double d2 = this.p[i1 + i5];
/* 123 */           double d3 = this.p[i2 + i5];
/* 124 */           double d4 = this.p[i3 + i5];
/* 125 */           double d5 = this.p[i4 + i5];
/*     */           
/* 127 */           double d6 = (this.p[i1 + i5 + 1] - d2) * d1;
/* 128 */           double d7 = (this.p[i2 + i5 + 1] - d3) * d1;
/* 129 */           double d8 = (this.p[i3 + i5 + 1] - d4) * d1;
/* 130 */           double d9 = (this.p[i4 + i5 + 1] - d5) * d1;
/*     */           
/* 132 */           for (int i6 = 0; i6 < 8; i6++) {
/* 133 */             double d10 = 0.25D;
/*     */             
/* 135 */             double d11 = d2;
/* 136 */             double d12 = d3;
/* 137 */             double d13 = (d4 - d2) * d10;
/* 138 */             double d14 = (d5 - d3) * d10;
/*     */             
/* 140 */             for (int i7 = 0; i7 < 4; i7++) {
/* 141 */               double d15 = 0.25D;
/*     */               
/* 143 */               double d16 = d11;
/* 144 */               double d17 = (d12 - d11) * d15;
/* 145 */               d16 -= d17;
/* 146 */               for (int i8 = 0; i8 < 4; i8++) {
/* 147 */                 if ((d16 += d17) > 0.0D) {
/* 148 */                   ans1.a(j * 4 + i7, i5 * 8 + i6, n * 4 + i8, afi.b.Q());
/* 149 */                 } else if (i5 * 8 + i6 < this.r.q) {
/* 150 */                   ans1.a(j * 4 + i7, i5 * 8 + i6, n * 4 + i8, this.s.Q());
/*     */                 } 
/*     */               } 
/* 153 */               d11 += d13;
/* 154 */               d12 += d14;
/*     */             } 
/*     */             
/* 157 */             d2 += d6;
/* 158 */             d3 += d7;
/* 159 */             d4 += d8;
/* 160 */             d5 += d9;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/* 167 */   public aoa(adm ☃, long l, boolean bool, String str) { this.t = new double[256];
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
/* 181 */     this.u = new anx();
/* 182 */     this.v = new aqo();
/* 183 */     this.w = new aqv();
/* 184 */     this.x = new aqf();
/* 185 */     this.y = new aqm();
/* 186 */     this.z = new anr();
/* 187 */     this.A = new aqk(); this.m = ☃; this.n = bool; this.o = ☃.P().u(); this.h = new Random(l); this.i = new arc(this.h, 16); this.j = new arc(this.h, 16); this.k = new arc(this.h, 8); this.l = new ard(this.h, 4); this.a = new arc(this.h, 10); this.b = new arc(this.h, 16); this.c = new arc(this.h, 8); this.p = new double[825]; this.q = new float[25];
/*     */     for (int i = -2; i <= 2; i++) {
/*     */       for (int j = -2; j <= 2; j++) {
/*     */         float f = 10.0F / ns.c((i * i + j * j) + 0.2F);
/*     */         this.q[i + 2 + (j + 2) * 5] = f;
/*     */       } 
/*     */     } 
/*     */     if (str != null) {
/*     */       this.r = ant.a.a(str).b();
/*     */       this.s = this.r.E ? afi.l : afi.j;
/*     */       ☃.b(this.r.q);
/* 198 */     }  } public amy d(int ☃, int i) { this.h.setSeed(☃ * 341873128712L + i * 132897987541L);
/*     */     
/* 200 */     ans ans = new ans();
/*     */     
/* 202 */     a(☃, i, ans);
/* 203 */     this.B = this.m.v().b(this.B, ☃ * 16, i * 16, 16, 16);
/* 204 */     a(☃, i, ans, this.B);
/*     */     
/* 206 */     if (this.r.r) {
/* 207 */       this.u.a(this, this.m, ☃, i, ans);
/*     */     }
/* 209 */     if (this.r.z) {
/* 210 */       this.z.a(this, this.m, ☃, i, ans);
/*     */     }
/* 212 */     if (this.r.w && this.n) {
/* 213 */       this.x.a(this, this.m, ☃, i, ans);
/*     */     }
/* 215 */     if (this.r.v && this.n) {
/* 216 */       this.w.a(this, this.m, ☃, i, ans);
/*     */     }
/* 218 */     if (this.r.u && this.n) {
/* 219 */       this.v.a(this, this.m, ☃, i, ans);
/*     */     }
/* 221 */     if (this.r.x && this.n) {
/* 222 */       this.y.a(this, this.m, ☃, i, ans);
/*     */     }
/* 224 */     if (this.r.y && this.n) {
/* 225 */       this.A.a(this, this.m, ☃, i, ans);
/*     */     }
/*     */     
/* 228 */     amy amy = new amy(this.m, ans, ☃, i);
/* 229 */     byte[] arrayOfByte = amy.k();
/*     */     
/* 231 */     for (int j = 0; j < arrayOfByte.length; j++) {
/* 232 */       arrayOfByte[j] = (byte)(this.B[j]).az;
/*     */     }
/*     */     
/* 235 */     amy.b();
/*     */     
/* 237 */     return amy; }
/*     */    public void a(int ☃, int i, ans ans1, ady[] arrayOfAdy) {
/*     */     double d = 0.03125D;
/*     */     this.t = this.l.a(this.t, (☃ * 16), (i * 16), 16, 16, d * 2.0D, d * 2.0D, 1.0D);
/*     */     for (int j = 0; j < 16; j++) {
/*     */       for (int k = 0; k < 16; k++) {
/*     */         ady ady1 = arrayOfAdy[k + j * 16];
/*     */         ady1.a(this.m, this.h, ans1, ☃ * 16 + j, i * 16 + k, this.t[k + j * 16]);
/*     */       } 
/*     */     } 
/*     */   } private void a(int ☃, int i, int j) {
/* 248 */     this.g = this.b.a(this.g, ☃, j, 5, 5, this.r.e, this.r.f, this.r.g);
/*     */     
/* 250 */     float f1 = this.r.a;
/* 251 */     float f2 = this.r.b;
/* 252 */     this.d = this.k.a(this.d, ☃, i, j, 5, 33, 5, (f1 / this.r.h), (f2 / this.r.i), (f1 / this.r.j));
/* 253 */     this.e = this.i.a(this.e, ☃, i, j, 5, 33, 5, f1, f2, f1);
/* 254 */     this.f = this.j.a(this.f, ☃, i, j, 5, 33, 5, f1, f2, f1);
/* 255 */     ☃ = j = 0;
/*     */     
/* 257 */     int k = 0;
/* 258 */     int m = 0;
/*     */     
/* 260 */     for (int n = 0; n < 5; n++) {
/* 261 */       for (int i1 = 0; i1 < 5; i1++) {
/* 262 */         float f3 = 0.0F;
/* 263 */         float f4 = 0.0F;
/* 264 */         float f5 = 0.0F;
/*     */         
/* 266 */         int i2 = 2;
/*     */ 
/*     */ 
/*     */         
/* 270 */         ady ady1 = this.B[n + 2 + (i1 + 2) * 10];
/* 271 */         for (int i3 = -i2; i3 <= i2; i3++) {
/* 272 */           for (int i5 = -i2; i5 <= i2; i5++) {
/* 273 */             ady ady2 = this.B[n + i3 + 2 + (i1 + i5 + 2) * 10];
/* 274 */             float f6 = this.r.n + ady2.an * this.r.m;
/* 275 */             float f7 = this.r.p + ady2.ao * this.r.o;
/* 276 */             if (this.o == adr.e && f6 > 0.0F) {
/* 277 */               f6 = 1.0F + f6 * 2.0F;
/* 278 */               f7 = 1.0F + f7 * 4.0F;
/*     */             } 
/* 280 */             float f8 = this.q[i3 + 2 + (i5 + 2) * 5] / (f6 + 2.0F);
/* 281 */             if (ady2.an > ady1.an) {
/* 282 */               f8 /= 2.0F;
/*     */             }
/* 284 */             f3 += f7 * f8;
/* 285 */             f4 += f6 * f8;
/* 286 */             f5 += f8;
/*     */           } 
/*     */         } 
/* 289 */         f3 /= f5;
/* 290 */         f4 /= f5;
/*     */         
/* 292 */         f3 = f3 * 0.9F + 0.1F;
/* 293 */         f4 = (f4 * 4.0F - 1.0F) / 8.0F;
/*     */         
/* 295 */         double d1 = this.g[m] / 8000.0D;
/* 296 */         if (d1 < 0.0D) {
/* 297 */           d1 = -d1 * 0.3D;
/*     */         }
/* 299 */         d1 = d1 * 3.0D - 2.0D;
/*     */         
/* 301 */         if (d1 < 0.0D) {
/* 302 */           d1 /= 2.0D;
/* 303 */           if (d1 < -1.0D) {
/* 304 */             d1 = -1.0D;
/*     */           }
/* 306 */           d1 /= 1.4D;
/* 307 */           d1 /= 2.0D;
/*     */         } else {
/* 309 */           if (d1 > 1.0D) {
/* 310 */             d1 = 1.0D;
/*     */           }
/* 312 */           d1 /= 8.0D;
/*     */         } 
/*     */         
/* 315 */         m++;
/*     */         
/* 317 */         double d2 = f4;
/* 318 */         double d3 = f3;
/* 319 */         d2 += d1 * 0.2D;
/* 320 */         d2 = d2 * this.r.k / 8.0D;
/*     */         
/* 322 */         double d4 = this.r.k + d2 * 4.0D;
/*     */         
/* 324 */         for (int i4 = 0; i4 < 33; i4++) {
/* 325 */           double d5 = (i4 - d4) * this.r.l * 128.0D / 256.0D / d3;
/*     */           
/* 327 */           if (d5 < 0.0D) {
/* 328 */             d5 *= 4.0D;
/*     */           }
/*     */           
/* 331 */           double d6 = this.e[k] / this.r.d;
/* 332 */           double d7 = this.f[k] / this.r.c;
/*     */           
/* 334 */           double d8 = (this.d[k] / 10.0D + 1.0D) / 2.0D;
/* 335 */           double d9 = ns.b(d6, d7, d8) - d5;
/*     */ 
/*     */ 
/*     */           
/* 339 */           if (i4 > 29) {
/* 340 */             double d = ((i4 - 29) / 3.0F);
/* 341 */             d9 = d9 * (1.0D - d) + -10.0D * d;
/*     */           } 
/*     */           
/* 344 */           this.p[k] = d9;
/* 345 */           k++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 353 */     return true;
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
/*     */   public void a(amv ☃, int i, int j) {
/* 411 */     agr.N = true;
/* 412 */     int k = i * 16;
/* 413 */     int m = j * 16;
/* 414 */     cj cj = new cj(k, 0, m);
/* 415 */     ady ady1 = this.m.b(cj.a(16, 0, 16));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 421 */     this.h.setSeed(this.m.J());
/* 422 */     long l1 = this.h.nextLong() / 2L * 2L + 1L;
/* 423 */     long l2 = this.h.nextLong() / 2L * 2L + 1L;
/* 424 */     this.h.setSeed(i * l1 + j * l2 ^ this.m.J());
/*     */     
/* 426 */     boolean bool = false;
/*     */     
/* 428 */     adg adg = new adg(i, j);
/*     */     
/* 430 */     if (this.r.w && this.n) {
/* 431 */       this.x.a(this.m, this.h, adg);
/*     */     }
/* 433 */     if (this.r.v && this.n) {
/* 434 */       bool = this.w.a(this.m, this.h, adg);
/*     */     }
/* 436 */     if (this.r.u && this.n) {
/* 437 */       this.v.a(this.m, this.h, adg);
/*     */     }
/* 439 */     if (this.r.x && this.n) {
/* 440 */       this.y.a(this.m, this.h, adg);
/*     */     }
/* 442 */     if (this.r.y && this.n) {
/* 443 */       this.A.a(this.m, this.h, adg);
/*     */     }
/*     */     
/* 446 */     if (ady1 != ady.r && ady1 != ady.G && this.r.A && 
/* 447 */       !bool && this.h.nextInt(this.r.B) == 0) {
/* 448 */       int i1 = this.h.nextInt(16) + 8;
/* 449 */       int i2 = this.h.nextInt(256);
/* 450 */       int i3 = this.h.nextInt(16) + 8;
/* 451 */       (new apc(afi.j)).b(this.m, this.h, cj.a(i1, i2, i3));
/*     */     } 
/*     */ 
/*     */     
/* 455 */     if (!bool && this.h.nextInt(this.r.D / 10) == 0 && this.r.C) {
/* 456 */       int i1 = this.h.nextInt(16) + 8;
/* 457 */       int i2 = this.h.nextInt(this.h.nextInt(248) + 8);
/* 458 */       int i3 = this.h.nextInt(16) + 8;
/* 459 */       if (i2 < this.m.F() || this.h.nextInt(this.r.D / 8) == 0) {
/* 460 */         (new apc(afi.l)).b(this.m, this.h, cj.a(i1, i2, i3));
/*     */       }
/*     */     } 
/*     */     
/* 464 */     if (this.r.s) {
/* 465 */       for (int i1 = 0; i1 < this.r.t; i1++) {
/* 466 */         int i2 = this.h.nextInt(16) + 8;
/* 467 */         int i3 = this.h.nextInt(256);
/* 468 */         int i4 = this.h.nextInt(16) + 8;
/* 469 */         (new api()).b(this.m, this.h, cj.a(i2, i3, i4));
/*     */       } 
/*     */     }
/*     */     
/* 473 */     ady1.a(this.m, this.h, new cj(k, 0, m));
/*     */     
/* 475 */     adt.a(this.m, ady1, k + 8, m + 8, 16, 16, this.h);
/*     */     
/* 477 */     cj = cj.a(8, 0, 8);
/* 478 */     for (int n = 0; n < 16; n++) {
/* 479 */       for (int i1 = 0; i1 < 16; i1++) {
/* 480 */         cj cj1 = this.m.q(cj.a(n, 0, i1));
/* 481 */         cj cj2 = cj1.b();
/*     */         
/* 483 */         if (this.m.v(cj2)) {
/* 484 */           this.m.a(cj2, afi.aI.Q(), 2);
/*     */         }
/* 486 */         if (this.m.f(cj1, true)) {
/* 487 */           this.m.a(cj1, afi.aH.Q(), 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 492 */     agr.N = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(amv ☃, amy amy1, int i, int j) {
/* 497 */     boolean bool = false;
/* 498 */     if (this.r.y && this.n)
/*     */     {
/* 500 */       if (amy1.w() < 3600L)
/*     */       {
/* 502 */         bool |= this.A.a(this.m, this.h, new adg(i, j));
/*     */       }
/*     */     }
/*     */     
/* 506 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boolean ☃, nu nu1) {
/* 511 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 520 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 525 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 530 */     return "RandomLevelSource";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ady.c> a(pt ☃, cj cj1) {
/* 535 */     ady ady1 = this.m.b(cj1);
/* 536 */     if (this.n) {
/* 537 */       if (☃ == pt.a && this.y.a(cj1))
/* 538 */         return this.y.b(); 
/* 539 */       if (☃ == pt.a && this.r.y && this.A.a(this.m, cj1)) {
/* 540 */         return this.A.b();
/*     */       }
/*     */     } 
/* 543 */     return ady1.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cj a(adm ☃, String str, cj cj1) {
/* 548 */     if ("Stronghold".equals(str) && this.v != null) {
/* 549 */       return this.v.b(☃, cj1);
/*     */     }
/* 551 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 556 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amy ☃, int i, int j) {
/* 561 */     if (this.r.w && this.n) {
/* 562 */       this.x.a(this, this.m, i, j, null);
/*     */     }
/* 564 */     if (this.r.v && this.n) {
/* 565 */       this.w.a(this, this.m, i, j, null);
/*     */     }
/* 567 */     if (this.r.u && this.n) {
/* 568 */       this.v.a(this, this.m, i, j, null);
/*     */     }
/* 570 */     if (this.r.x && this.n) {
/* 571 */       this.y.a(this, this.m, i, j, null);
/*     */     }
/* 573 */     if (this.r.y && this.n) {
/* 574 */       this.A.a(this, this.m, i, j, null);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public amy a(cj ☃) {
/* 580 */     return d(☃.n() >> 4, ☃.p() >> 4);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */