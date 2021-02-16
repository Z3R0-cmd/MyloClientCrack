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
/*     */ public class agx
/*     */   extends afc
/*     */ {
/*  28 */   public static final amn a = amn.a("legacy_data", 0, 15);
/*  29 */   public static final amm<a> b = amm.a("contents", a.class);
/*     */   
/*     */   public agx() {
/*  32 */     super(arm.q);
/*  33 */     j(this.M.b().<a, a>a(b, a.a).a(a, Integer.valueOf(0)));
/*  34 */     j();
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  39 */     return di.a("item.flowerPot.name");
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  44 */     float ☃ = 0.375F;
/*  45 */     float f1 = ☃ / 2.0F;
/*  46 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, ☃, 0.5F + f1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  56 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  66 */     akw akw = ☃.s(cj1);
/*  67 */     if (akw instanceof alg) {
/*  68 */       zw zw = ((alg)akw).b();
/*     */       
/*  70 */       if (zw instanceof yo) {
/*  71 */         return afh.a(zw).a(☃, cj1, i);
/*     */       }
/*     */     } 
/*     */     
/*  75 */     return 16777215;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  80 */     zx zx = wn1.bi.h();
/*  81 */     if (zx == null || !(zx.b() instanceof yo)) {
/*  82 */       return false;
/*     */     }
/*     */     
/*  85 */     alg alg = f(☃, cj1);
/*  86 */     if (alg == null) {
/*  87 */       return false;
/*     */     }
/*     */     
/*  90 */     if (alg.b() != null) {
/*  91 */       return false;
/*     */     }
/*     */     
/*  94 */     afh afh = afh.a(zx.b());
/*  95 */     if (!a(afh, zx.i())) {
/*  96 */       return false;
/*     */     }
/*  98 */     alg.a(zx.b(), zx.i());
/*  99 */     alg.p_();
/* 100 */     ☃.h(cj1);
/* 101 */     wn1.b(na.T);
/*     */     
/* 103 */     if (!wn1.bA.d && 
/* 104 */       --zx.b <= 0) {
/* 105 */       wn1.bi.a(wn1.bi.c, (zx)null);
/*     */     }
/*     */ 
/*     */     
/* 109 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(afh ☃, int i) {
/* 113 */     if (☃ == afi.N || ☃ == afi.O || ☃ == afi.aK || ☃ == afi.P || ☃ == afi.Q || ☃ == afi.g || ☃ == afi.I) {
/* 114 */       return true;
/*     */     }
/* 116 */     if (☃ == afi.H && i == akc.a.c.a()) {
/* 117 */       return true;
/*     */     }
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 124 */     alg alg = f(☃, cj1);
/* 125 */     if (alg != null && alg.b() != null) {
/* 126 */       return alg.b();
/*     */     }
/*     */     
/* 129 */     return zy.bQ;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/* 134 */     alg alg = f(☃, cj1);
/* 135 */     if (alg != null && alg.b() != null) {
/* 136 */       return alg.c();
/*     */     }
/*     */     
/* 139 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean M() {
/* 144 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 149 */     return (super.d(☃, cj1) && adm.a(☃, cj1.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 154 */     if (!adm.a(☃, cj1.b())) {
/* 155 */       b(☃, cj1, alz1, 0);
/*     */       
/* 157 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 165 */     alg alg = f(☃, cj1);
/* 166 */     if (alg != null && alg.b() != null) {
/* 167 */       a(☃, cj1, new zx(alg.b(), 1, alg.c()));
/*     */     }
/* 169 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 174 */     super.a(☃, cj1, alz1, wn1);
/*     */     
/* 176 */     if (wn1.bA.d) {
/* 177 */       alg alg = f(☃, cj1);
/* 178 */       if (alg != null)
/*     */       {
/* 180 */         alg.a((zw)null, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 188 */     return zy.bQ;
/*     */   }
/*     */ 
/*     */   
/*     */   private alg f(adm ☃, cj cj1) {
/* 193 */     akw akw = ☃.s(cj1);
/* 194 */     if (akw instanceof alg) {
/* 195 */       return (alg)akw;
/*     */     }
/*     */     
/* 198 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 204 */     afh afh = null;
/* 205 */     int j = 0;
/* 206 */     switch (i)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       default:
/* 257 */         return new alg(zw.a(afh), j);case 1: afh = afi.O; j = agw.a.b.b();case 2: afh = afi.N;case 3: afh = afi.g; j = aio.a.a.a();case 4: afh = afi.g; j = aio.a.b.a();case 5: afh = afi.g; j = aio.a.c.a();case 6: afh = afi.g; j = aio.a.d.a();case 12: afh = afi.g; j = aio.a.e.a();case 13: afh = afi.g; j = aio.a.f.a();
/*     */       case 7: afh = afi.Q;
/*     */       case 8: afh = afi.P;
/*     */       case 9: afh = afi.aK;
/*     */       case 10: afh = afi.I;
/* 262 */       case 11: break; }  afh = afi.H; j = akc.a.c.a(); } protected ama e() { return new ama(this, new amo[] { b, a }); }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 267 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 272 */     a a = a.a;
/*     */     
/* 274 */     akw akw = adq1.s(cj1);
/* 275 */     if (akw instanceof alg)
/* 276 */     { alg alg = (alg)akw;
/* 277 */       zw zw = alg.b();
/*     */       
/* 279 */       if (zw instanceof yo)
/* 280 */       { int i = alg.c();
/* 281 */         afh afh = afh.a(zw);
/* 282 */         if (afh == afi.g)
/* 283 */         { switch (null.a[aio.a.a(i).ordinal()])
/*     */           { case 1:
/* 285 */               a = a.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 362 */               return ☃.a(b, a);case 2: a = a.m; return ☃.a(b, a);case 3: a = a.n; return ☃.a(b, a);case 4: a = a.o; return ☃.a(b, a);case 5: a = a.p; return ☃.a(b, a);case 6: a = a.q; return ☃.a(b, a); }  a = a.a; } else if (afh == afi.H) { switch (i) { case 0: a = a.t; return ☃.a(b, a);case 2: a = a.u; return ☃.a(b, a); }  a = a.a; } else if (afh == afi.N) { a = a.k; } else if (afh == afi.O) { switch (null.b[agw.a.a(agw.b.b, i).ordinal()]) { case 1: a = a.b; return ☃.a(b, a);case 2: a = a.c; return ☃.a(b, a);case 3: a = a.d; return ☃.a(b, a);case 4: a = a.e; return ☃.a(b, a);case 5: a = a.f; return ☃.a(b, a);case 6: a = a.g; return ☃.a(b, a);case 7: a = a.h; return ☃.a(b, a);case 8: a = a.i; return ☃.a(b, a);case 9: a = a.j; return ☃.a(b, a); }  a = a.a; } else if (afh == afi.Q) { a = a.r; } else if (afh == afi.P) { a = a.s; } else if (afh == afi.I) { a = a.t; } else if (afh == afi.aK) { a = a.v; }  }  }  return ☃.a(b, a);
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 366 */     a("empty"),
/* 367 */     b("rose"),
/* 368 */     c("blue_orchid"),
/* 369 */     d("allium"),
/* 370 */     e("houstonia"),
/* 371 */     f("red_tulip"),
/* 372 */     g("orange_tulip"),
/* 373 */     h("white_tulip"),
/* 374 */     i("pink_tulip"),
/* 375 */     j("oxeye_daisy"),
/* 376 */     k("dandelion"),
/* 377 */     l("oak_sapling"),
/* 378 */     m("spruce_sapling"),
/* 379 */     n("birch_sapling"),
/* 380 */     o("jungle_sapling"),
/* 381 */     p("acacia_sapling"),
/* 382 */     q("dark_oak_sapling"),
/* 383 */     r("mushroom_red"),
/* 384 */     s("mushroom_brown"),
/* 385 */     t("dead_bush"),
/* 386 */     u("fern"),
/* 387 */     v("cactus");
/*     */     
/*     */     private final String w;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 393 */       this.w = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 398 */       return this.w;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 403 */       return this.w;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 409 */     return adf.c;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */