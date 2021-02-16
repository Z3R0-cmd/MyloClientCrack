/*     */ import com.google.common.cache.LoadingCache;
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
/*     */ public class aip
/*     */   extends ahj
/*     */ {
/*  26 */   public static final amm<cq.a> a = amm.a("axis", cq.a.class, new cq.a[] { cq.a.a, cq.a.c });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aip() {
/*  34 */     super(arm.E, false);
/*  35 */     j(this.M.b().a(a, cq.a.a));
/*  36 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  41 */     super.b(☃, cj1, alz1, random);
/*     */     
/*  43 */     if (☃.t.d() && ☃.Q().b("doMobSpawning") && random.nextInt(2000) < ☃.aa().a()) {
/*     */       
/*  45 */       int i = cj1.o();
/*  46 */       cj cj2 = cj1;
/*  47 */       while (!adm.a(☃, cj2) && cj2.o() > 0) {
/*  48 */         cj2 = cj2.b();
/*     */       }
/*  50 */       if (i > 0 && !☃.p(cj2.a()).c().v()) {
/*     */         
/*  52 */         pk pk = aax.a(☃, 57, cj2.n() + 0.5D, cj2.o() + 1.1D, cj2.p() + 0.5D);
/*  53 */         if (pk != null) {
/*  54 */           pk.aj = pk.aq();
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  63 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  68 */     cq.a a = ☃.p(cj1).<cq.a>b(a);
/*     */     
/*  70 */     float f1 = 0.125F;
/*  71 */     float f2 = 0.125F;
/*     */     
/*  73 */     if (a == cq.a.a) {
/*  74 */       f1 = 0.5F;
/*     */     }
/*  76 */     if (a == cq.a.c) {
/*  77 */       f2 = 0.5F;
/*     */     }
/*     */     
/*  80 */     a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
/*     */   }
/*     */   
/*     */   public static int a(cq.a ☃) {
/*  84 */     if (☃ == cq.a.a) {
/*  85 */       return 1;
/*     */     }
/*  87 */     if (☃ == cq.a.c) {
/*  88 */       return 2;
/*     */     }
/*  90 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  95 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1) {
/*  99 */     a a1 = new a(☃, cj1, cq.a.a);
/* 100 */     if (a1.d() && a.a(a1) == 0) {
/* 101 */       a1.e();
/* 102 */       return true;
/*     */     } 
/*     */     
/* 105 */     a a2 = new a(☃, cj1, cq.a.c);
/* 106 */     if (a2.d() && a.a(a2) == 0) {
/* 107 */       a2.e();
/* 108 */       return true;
/*     */     } 
/*     */     
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 116 */     cq.a a = alz1.<cq.a>b(a);
/*     */     
/* 118 */     if (a == cq.a.a) {
/* 119 */       a a1 = new a(☃, cj1, cq.a.a);
/* 120 */       if (!a1.d() || a.a(a1) < a.b(a1) * a.c(a1)) {
/* 121 */         ☃.a(cj1, afi.a.Q());
/*     */       }
/* 123 */     } else if (a == cq.a.c) {
/* 124 */       a a1 = new a(☃, cj1, cq.a.c);
/* 125 */       if (!a1.d() || a.a(a1) < a.b(a1) * a.c(a1)) {
/* 126 */         ☃.a(cj1, afi.a.Q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 134 */     cq.a a = null;
/* 135 */     alz alz = ☃.p(cj1);
/* 136 */     if (☃.p(cj1).c() == this) {
/* 137 */       a = alz.<cq.a>b(a);
/*     */       
/* 139 */       if (a == null) {
/* 140 */         return false;
/*     */       }
/* 142 */       if (a == cq.a.c && cq1 != cq.f && cq1 != cq.e) {
/* 143 */         return false;
/*     */       }
/* 145 */       if (a == cq.a.a && cq1 != cq.d && cq1 != cq.c) {
/* 146 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 150 */     boolean bool1 = (☃.p(cj1.e()).c() == this && ☃.p(cj1.f(2)).c() != this);
/* 151 */     boolean bool2 = (☃.p(cj1.f()).c() == this && ☃.p(cj1.g(2)).c() != this);
/*     */     
/* 153 */     boolean bool3 = (☃.p(cj1.c()).c() == this && ☃.p(cj1.d(2)).c() != this);
/* 154 */     boolean bool4 = (☃.p(cj1.d()).c() == this && ☃.p(cj1.e(2)).c() != this);
/*     */     
/* 156 */     boolean bool5 = (bool1 || bool2 || a == cq.a.a);
/* 157 */     boolean bool6 = (bool3 || bool4 || a == cq.a.c);
/*     */     
/* 159 */     if (bool5 && cq1 == cq.e) {
/* 160 */       return true;
/*     */     }
/* 162 */     if (bool5 && cq1 == cq.f) {
/* 163 */       return true;
/*     */     }
/* 165 */     if (bool6 && cq1 == cq.c) {
/* 166 */       return true;
/*     */     }
/* 168 */     if (bool6 && cq1 == cq.d) {
/* 169 */       return true;
/*     */     }
/*     */     
/* 172 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 177 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 182 */     return adf.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/* 187 */     if (pk1.m == null && pk1.l == null) {
/* 188 */       pk1.d(cj1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 194 */     if (random.nextInt(100) == 0) {
/* 195 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "portal.portal", 0.5F, random.nextFloat() * 0.4F + 0.8F, false);
/*     */     }
/*     */     
/* 198 */     for (int i = 0; i < 4; i++) {
/* 199 */       double d1 = (cj1.n() + random.nextFloat());
/* 200 */       double d2 = (cj1.o() + random.nextFloat());
/* 201 */       double d3 = (cj1.p() + random.nextFloat());
/* 202 */       double d4 = (random.nextFloat() - 0.5D) * 0.5D;
/* 203 */       double d5 = (random.nextFloat() - 0.5D) * 0.5D;
/* 204 */       double d6 = (random.nextFloat() - 0.5D) * 0.5D;
/*     */       
/* 206 */       int j = random.nextInt(2) * 2 - 1;
/* 207 */       if (☃.p(cj1.e()).c() == this || ☃.p(cj1.f()).c() == this) {
/* 208 */         d3 = cj1.p() + 0.5D + 0.25D * j;
/* 209 */         d6 = (random.nextFloat() * 2.0F * j);
/*     */       } else {
/* 211 */         d1 = cj1.n() + 0.5D + 0.25D * j;
/* 212 */         d4 = (random.nextFloat() * 2.0F * j);
/*     */       } 
/*     */       
/* 215 */       ☃.a(cy.y, d1, d2, d3, d4, d5, d6, new int[0]);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 221 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 226 */     return Q().a(a, ((☃ & 0x3) == 2) ? cq.a.c : cq.a.a);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 232 */     return a(☃.<cq.a>b(a));
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 237 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public amd.b f(adm ☃, cj cj1) {
/* 241 */     cq.a a = cq.a.c;
/* 242 */     a a1 = new a(☃, cj1, cq.a.a);
/* 243 */     LoadingCache<cj, amc> loadingCache = amd.a(☃, true);
/*     */     
/* 245 */     if (!a1.d()) {
/* 246 */       a = cq.a.a;
/* 247 */       a1 = new a(☃, cj1, cq.a.c);
/*     */     } 
/* 249 */     if (!a1.d()) {
/* 250 */       return new amd.b(cj1, cq.c, cq.b, loadingCache, 1, 1, 1);
/*     */     }
/*     */     
/* 253 */     int[] arrayOfInt = new int[(cq.b.values()).length];
/* 254 */     cq cq = a.d(a1).f();
/* 255 */     cj cj2 = a.e(a1).b(a1.a() - 1); cq.b[] arrayOfB1;
/*     */     int i, j;
/* 257 */     for (arrayOfB1 = cq.b.values(), i = arrayOfB1.length, j = 0; j < i; ) { cq.b b1 = arrayOfB1[j];
/* 258 */       amd.b b2 = new amd.b((cq.c() == b1) ? cj2 : cj2.a(a.d(a1), a1.b() - 1), cq.a(b1, a), cq.b, loadingCache, a1.b(), a1.a(), 1);
/*     */       
/* 260 */       for (int m = 0; m < a1.b(); m++) {
/* 261 */         for (int n = 0; n < a1.a(); n++) {
/* 262 */           amc amc = b2.a(m, n, 1);
/* 263 */           if (amc.a() != null && amc.a().c().t() != arm.a) {
/* 264 */             arrayOfInt[b1.ordinal()] = arrayOfInt[b1.ordinal()] + 1;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       j++; }
/*     */     
/* 270 */     cq.b b = cq.b.a; cq.b[] arrayOfB2; int k;
/* 271 */     for (arrayOfB2 = cq.b.values(), j = arrayOfB2.length, k = 0; k < j; ) { cq.b b1 = arrayOfB2[k];
/* 272 */       if (arrayOfInt[b1.ordinal()] < arrayOfInt[b.ordinal()]) {
/* 273 */         b = b1;
/*     */       }
/*     */       k++; }
/*     */     
/* 277 */     return new amd.b((cq.c() == b) ? cj2 : cj2.a(a.d(a1), a1.b() - 1), cq.a(b, a), cq.b, loadingCache, a1.b(), a1.a(), 1);
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final adm a;
/*     */     private final cq.a b;
/*     */     private final cq c;
/*     */     private final cq d;
/* 285 */     private int e = 0;
/*     */     private cj f;
/*     */     private int g;
/*     */     private int h;
/*     */     
/*     */     public a(adm ☃, cj cj1, cq.a a1) {
/* 291 */       this.a = ☃;
/* 292 */       this.b = a1;
/* 293 */       if (a1 == cq.a.a) {
/* 294 */         this.d = cq.f;
/* 295 */         this.c = cq.e;
/*     */       } else {
/*     */         
/* 298 */         this.d = cq.c;
/* 299 */         this.c = cq.d;
/*     */       } 
/*     */       
/* 302 */       cj cj2 = cj1;
/* 303 */       while (cj1.o() > cj2.o() - 21 && cj1.o() > 0 && a(☃.p(cj1.b()).c())) {
/* 304 */         cj1 = cj1.b();
/*     */       }
/*     */       
/* 307 */       int i = a(cj1, this.d) - 1;
/*     */       
/* 309 */       if (i >= 0) {
/* 310 */         this.f = cj1.a(this.d, i);
/*     */         
/* 312 */         this.h = a(this.f, this.c);
/*     */         
/* 314 */         if (this.h < 2 || this.h > 21) {
/* 315 */           this.f = null;
/* 316 */           this.h = 0;
/*     */         } 
/*     */       } 
/*     */       
/* 320 */       if (this.f != null) {
/* 321 */         this.g = c();
/*     */       }
/*     */     }
/*     */     
/*     */     protected int a(cj ☃, cq cq1) {
/*     */       int i;
/* 327 */       for (i = 0; i < 22; i++) {
/* 328 */         cj cj1 = ☃.a(cq1, i);
/* 329 */         if (!a(this.a.p(cj1).c())) {
/*     */           break;
/*     */         }
/*     */         
/* 333 */         if (this.a.p(cj1.b()).c() != afi.Z) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */       
/* 338 */       afh afh = this.a.p(☃.a(cq1, i)).c();
/* 339 */       if (afh == afi.Z) {
/* 340 */         return i;
/*     */       }
/*     */       
/* 343 */       return 0;
/*     */     }
/*     */     
/*     */     public int a() {
/* 347 */       return this.g;
/*     */     }
/*     */     
/*     */     public int b() {
/* 351 */       return this.h;
/*     */     }
/*     */     
/*     */     protected int c() {
/* 355 */       label38: for (this.g = 0; this.g < 21; this.g++) {
/* 356 */         for (int i = 0; i < this.h; i++) {
/* 357 */           cj cj1 = this.f.a(this.c, i).b(this.g);
/*     */           
/* 359 */           afh afh = this.a.p(cj1).c();
/* 360 */           if (!a(afh)) {
/*     */             break label38;
/*     */           }
/*     */           
/* 364 */           if (afh == afi.aY) {
/* 365 */             this.e++;
/*     */           }
/*     */           
/* 368 */           if (i == 0) {
/* 369 */             afh = this.a.p(cj1.a(this.d)).c();
/* 370 */             if (afh != afi.Z) {
/*     */               break label38;
/*     */             }
/* 373 */           } else if (i == this.h - 1) {
/* 374 */             afh = this.a.p(cj1.a(this.c)).c();
/* 375 */             if (afh != afi.Z) {
/*     */               break label38;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 382 */       for (int ☃ = 0; ☃ < this.h; ☃++) {
/* 383 */         if (this.a.p(this.f.a(this.c, ☃).b(this.g)).c() != afi.Z) {
/* 384 */           this.g = 0;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 389 */       if (this.g > 21 || this.g < 3) {
/* 390 */         this.f = null;
/* 391 */         this.h = 0;
/* 392 */         this.g = 0;
/* 393 */         return 0;
/*     */       } 
/* 395 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(afh ☃) {
/* 400 */       return (☃.J == arm.a || ☃ == afi.ab || ☃ == afi.aY);
/*     */     }
/*     */     
/*     */     public boolean d() {
/* 404 */       return (this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21);
/*     */     }
/*     */     
/*     */     public void e() {
/* 408 */       for (int ☃ = 0; ☃ < this.h; ☃++) {
/* 409 */         cj cj1 = this.f.a(this.c, ☃);
/* 410 */         for (int i = 0; i < this.g; i++)
/* 411 */           this.a.a(cj1.b(i), afi.aY.Q().a(aip.a, this.b), 2); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */