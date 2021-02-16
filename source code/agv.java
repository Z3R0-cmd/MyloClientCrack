/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class agv
/*     */   extends afh
/*     */ {
/*  25 */   public static final amn a = amn.a("age", 0, 15);
/*  26 */   public static final amk b = amk.a("flip");
/*  27 */   public static final amk N = amk.a("alt");
/*  28 */   public static final amk O = amk.a("north");
/*  29 */   public static final amk P = amk.a("east");
/*  30 */   public static final amk Q = amk.a("south");
/*  31 */   public static final amk R = amk.a("west");
/*  32 */   public static final amn S = amn.a("upper", 0, 2);
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  36 */     int i = cj1.n();
/*  37 */     int j = cj1.o();
/*  38 */     int k = cj1.p();
/*     */     
/*  40 */     if (adm.a(adq1, cj1.b()) || afi.ab.e(adq1, cj1.b())) {
/*  41 */       return Q();
/*     */     }
/*     */     
/*  44 */     boolean bool1 = ((i + j + k & 0x1) == 1);
/*  45 */     boolean bool2 = ((i / 2 + j / 2 + k / 2 & 0x1) == 1);
/*     */     
/*  47 */     int m = 0;
/*  48 */     if (e(adq1, cj1.a())) {
/*  49 */       m = bool1 ? 1 : 2;
/*     */     }
/*     */     
/*  52 */     return ☃.<Comparable, Boolean>a(O, Boolean.valueOf(e(adq1, cj1.c()))).<Comparable, Boolean>a(P, Boolean.valueOf(e(adq1, cj1.f()))).<Comparable, Boolean>a(Q, Boolean.valueOf(e(adq1, cj1.d()))).<Comparable, Boolean>a(R, Boolean.valueOf(e(adq1, cj1.e()))).<Comparable, Integer>a(S, Integer.valueOf(m)).<Comparable, Boolean>a(b, Boolean.valueOf(bool2)).a(N, Boolean.valueOf(bool1));
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
/*  72 */   private final Map<afh, Integer> T = Maps.newIdentityHashMap();
/*  73 */   private final Map<afh, Integer> U = Maps.newIdentityHashMap();
/*     */   
/*     */   protected agv() {
/*  76 */     super(arm.o);
/*  77 */     j(this.M.b().<Comparable, Integer>a(a, Integer.valueOf(0)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).<Comparable, Boolean>a(O, Boolean.valueOf(false)).<Comparable, Boolean>a(P, Boolean.valueOf(false)).<Comparable, Boolean>a(Q, Boolean.valueOf(false)).<Comparable, Boolean>a(R, Boolean.valueOf(false)).a(S, Integer.valueOf(0)));
/*  78 */     a(true);
/*     */   }
/*     */   
/*     */   public static void l() {
/*  82 */     afi.ab.a(afi.f, 5, 20);
/*  83 */     afi.ab.a(afi.bL, 5, 20);
/*  84 */     afi.ab.a(afi.bM, 5, 20);
/*  85 */     afi.ab.a(afi.bo, 5, 20);
/*  86 */     afi.ab.a(afi.bp, 5, 20);
/*  87 */     afi.ab.a(afi.bq, 5, 20);
/*  88 */     afi.ab.a(afi.br, 5, 20);
/*  89 */     afi.ab.a(afi.bs, 5, 20);
/*  90 */     afi.ab.a(afi.bt, 5, 20);
/*  91 */     afi.ab.a(afi.aO, 5, 20);
/*  92 */     afi.ab.a(afi.aP, 5, 20);
/*  93 */     afi.ab.a(afi.aQ, 5, 20);
/*  94 */     afi.ab.a(afi.aR, 5, 20);
/*  95 */     afi.ab.a(afi.aS, 5, 20);
/*  96 */     afi.ab.a(afi.aT, 5, 20);
/*  97 */     afi.ab.a(afi.ad, 5, 20);
/*  98 */     afi.ab.a(afi.bV, 5, 20);
/*  99 */     afi.ab.a(afi.bU, 5, 20);
/* 100 */     afi.ab.a(afi.bW, 5, 20);
/* 101 */     afi.ab.a(afi.r, 5, 5);
/* 102 */     afi.ab.a(afi.s, 5, 5);
/* 103 */     afi.ab.a(afi.t, 30, 60);
/* 104 */     afi.ab.a(afi.u, 30, 60);
/* 105 */     afi.ab.a(afi.X, 30, 20);
/* 106 */     afi.ab.a(afi.W, 15, 100);
/* 107 */     afi.ab.a(afi.H, 60, 100);
/* 108 */     afi.ab.a(afi.cF, 60, 100);
/* 109 */     afi.ab.a(afi.N, 60, 100);
/* 110 */     afi.ab.a(afi.O, 60, 100);
/* 111 */     afi.ab.a(afi.I, 60, 100);
/* 112 */     afi.ab.a(afi.L, 30, 60);
/* 113 */     afi.ab.a(afi.bn, 15, 100);
/* 114 */     afi.ab.a(afi.cA, 5, 5);
/* 115 */     afi.ab.a(afi.cx, 60, 20);
/* 116 */     afi.ab.a(afi.cy, 60, 20);
/*     */   }
/*     */   
/*     */   public void a(afh ☃, int i, int j) {
/* 120 */     this.T.put(☃, Integer.valueOf(i));
/* 121 */     this.U.put(☃, Integer.valueOf(j));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 127 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 132 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 137 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 142 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/* 147 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 152 */     if (!☃.Q().b("doFireTick")) {
/*     */       return;
/*     */     }
/*     */     
/* 156 */     if (!d(☃, cj1)) {
/* 157 */       ☃.g(cj1);
/*     */     }
/*     */     
/* 160 */     afh afh1 = ☃.p(cj1.b()).c();
/* 161 */     boolean bool1 = (afh1 == afi.aV);
/* 162 */     if (☃.t instanceof anp && afh1 == afi.h) {
/* 163 */       bool1 = true;
/*     */     }
/*     */     
/* 166 */     if (!bool1 && ☃.S() && e(☃, cj1)) {
/* 167 */       ☃.g(cj1);
/*     */       
/*     */       return;
/*     */     } 
/* 171 */     int i = ((Integer)alz1.<Integer>b(a)).intValue();
/* 172 */     if (i < 15) {
/* 173 */       alz1 = alz1.a(a, Integer.valueOf(i + random.nextInt(3) / 2));
/* 174 */       ☃.a(cj1, alz1, 4);
/*     */     } 
/*     */     
/* 177 */     ☃.a(cj1, this, a(☃) + random.nextInt(10));
/*     */     
/* 179 */     if (!bool1) {
/* 180 */       if (!f(☃, cj1)) {
/* 181 */         if (!adm.a(☃, cj1.b()) || i > 3) {
/* 182 */           ☃.g(cj1);
/*     */         }
/*     */         
/*     */         return;
/*     */       } 
/* 187 */       if (!e(☃, cj1.b()) && i == 15 && random.nextInt(4) == 0) {
/* 188 */         ☃.g(cj1);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 193 */     boolean bool2 = ☃.D(cj1);
/* 194 */     int j = 0;
/* 195 */     if (bool2) {
/* 196 */       j = -50;
/*     */     }
/* 198 */     a(☃, cj1.f(), 300 + j, random, i);
/* 199 */     a(☃, cj1.e(), 300 + j, random, i);
/* 200 */     a(☃, cj1.b(), 250 + j, random, i);
/* 201 */     a(☃, cj1.a(), 250 + j, random, i);
/* 202 */     a(☃, cj1.c(), 300 + j, random, i);
/* 203 */     a(☃, cj1.d(), 300 + j, random, i);
/*     */     
/* 205 */     for (int k = -1; k <= 1; k++) {
/* 206 */       for (int m = -1; m <= 1; m++) {
/* 207 */         for (int n = -1; n <= 4; n++) {
/* 208 */           if (k != 0 || n != 0 || m != 0) {
/*     */ 
/*     */ 
/*     */             
/* 212 */             int i1 = 100;
/* 213 */             if (n > 1) {
/* 214 */               i1 += (n - 1) * 100;
/*     */             }
/*     */             
/* 217 */             cj cj2 = cj1.a(k, n, m);
/* 218 */             int i2 = m(☃, cj2);
/* 219 */             if (i2 > 0) {
/*     */ 
/*     */ 
/*     */               
/* 223 */               int i3 = (i2 + 40 + ☃.aa().a() * 7) / (i + 30);
/* 224 */               if (bool2) {
/* 225 */                 i3 /= 2;
/*     */               }
/* 227 */               if (i3 > 0 && random.nextInt(i1) <= i3 && (
/* 228 */                 !☃.S() || !e(☃, cj2))) {
/*     */ 
/*     */ 
/*     */                 
/* 232 */                 int i4 = i + random.nextInt(5) / 4;
/* 233 */                 if (i4 > 15) {
/* 234 */                   i4 = 15;
/*     */                 }
/* 236 */                 ☃.a(cj2, alz1.a(a, Integer.valueOf(i4)), 3);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } protected boolean e(adm ☃, cj cj1) {
/* 244 */     return (☃.C(cj1) || ☃.C(cj1.e()) || ☃.C(cj1.f()) || ☃.C(cj1.c()) || ☃.C(cj1.d()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean N() {
/* 249 */     return false;
/*     */   }
/*     */   
/*     */   private int c(afh ☃) {
/* 253 */     Integer integer = this.U.get(☃);
/* 254 */     return (integer == null) ? 0 : integer.intValue();
/*     */   }
/*     */   
/*     */   private int d(afh ☃) {
/* 258 */     Integer integer = this.T.get(☃);
/* 259 */     return (integer == null) ? 0 : integer.intValue();
/*     */   }
/*     */   
/*     */   private void a(adm ☃, cj cj1, int i, Random random, int j) {
/* 263 */     int k = c(☃.p(cj1).c());
/* 264 */     if (random.nextInt(i) < k) {
/* 265 */       alz alz = ☃.p(cj1);
/*     */       
/* 267 */       if (random.nextInt(j + 10) < 5 && !☃.C(cj1)) {
/* 268 */         int m = j + random.nextInt(5) / 4;
/* 269 */         if (m > 15) {
/* 270 */           m = 15;
/*     */         }
/* 272 */         ☃.a(cj1, Q().a(a, Integer.valueOf(m)), 3);
/*     */       } else {
/* 274 */         ☃.g(cj1);
/*     */       } 
/*     */       
/* 277 */       if (alz.c() == afi.W)
/* 278 */         afi.W.d(☃, cj1, alz.a(ake.a, Boolean.valueOf(true))); 
/*     */     } 
/*     */   } private boolean f(adm ☃, cj cj1) {
/*     */     cq[] arrayOfCq;
/*     */     int i;
/*     */     int j;
/* 284 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 285 */       if (e(☃, cj1.a(cq))) {
/* 286 */         return true;
/*     */       }
/*     */       j++; }
/*     */     
/* 290 */     return false;
/*     */   }
/*     */   
/*     */   private int m(adm ☃, cj cj1) {
/* 294 */     if (!☃.d(cj1)) {
/* 295 */       return 0;
/*     */     }
/*     */     
/* 298 */     int i = 0; cq[] arrayOfCq; int j, k;
/* 299 */     for (arrayOfCq = cq.values(), j = arrayOfCq.length, k = 0; k < j; ) { cq cq = arrayOfCq[k];
/* 300 */       i = Math.max(d(☃.p(cj1.a(cq)).c()), i);
/*     */       k++; }
/*     */     
/* 303 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean A() {
/* 308 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(adq ☃, cj cj1) {
/* 312 */     return (d(☃.p(cj1).c()) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 317 */     return (adm.a(☃, cj1.b()) || f(☃, cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 322 */     if (!adm.a(☃, cj1.b()) && !f(☃, cj1)) {
/* 323 */       ☃.g(cj1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 329 */     if (☃.t.q() <= 0 && 
/* 330 */       afi.aY.e(☃, cj1)) {
/*     */       return;
/*     */     }
/*     */     
/* 334 */     if (!adm.a(☃, cj1.b()) && !f(☃, cj1)) {
/* 335 */       ☃.g(cj1);
/*     */       
/*     */       return;
/*     */     } 
/* 339 */     ☃.a(cj1, this, a(☃) + ☃.s.nextInt(10));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 344 */     if (random.nextInt(24) == 0) {
/* 345 */       ☃.a((cj1.n() + 0.5F), (cj1.o() + 0.5F), (cj1.p() + 0.5F), "fire.fire", 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
/*     */     }
/*     */     
/* 348 */     if (adm.a(☃, cj1.b()) || afi.ab.e(☃, cj1.b())) {
/* 349 */       for (int i = 0; i < 3; i++) {
/* 350 */         double d1 = cj1.n() + random.nextDouble();
/* 351 */         double d2 = cj1.o() + random.nextDouble() * 0.5D + 0.5D;
/* 352 */         double d3 = cj1.p() + random.nextDouble();
/* 353 */         ☃.a(cy.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */       } 
/*     */     } else {
/* 356 */       if (afi.ab.e(☃, cj1.e())) {
/* 357 */         for (int i = 0; i < 2; i++) {
/* 358 */           double d1 = cj1.n() + random.nextDouble() * 0.10000000149011612D;
/* 359 */           double d2 = cj1.o() + random.nextDouble();
/* 360 */           double d3 = cj1.p() + random.nextDouble();
/* 361 */           ☃.a(cy.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } 
/*     */       }
/* 364 */       if (afi.ab.e(☃, cj1.f())) {
/* 365 */         for (int i = 0; i < 2; i++) {
/* 366 */           double d1 = (cj1.n() + 1) - random.nextDouble() * 0.10000000149011612D;
/* 367 */           double d2 = cj1.o() + random.nextDouble();
/* 368 */           double d3 = cj1.p() + random.nextDouble();
/* 369 */           ☃.a(cy.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } 
/*     */       }
/* 372 */       if (afi.ab.e(☃, cj1.c())) {
/* 373 */         for (int i = 0; i < 2; i++) {
/* 374 */           double d1 = cj1.n() + random.nextDouble();
/* 375 */           double d2 = cj1.o() + random.nextDouble();
/* 376 */           double d3 = cj1.p() + random.nextDouble() * 0.10000000149011612D;
/* 377 */           ☃.a(cy.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } 
/*     */       }
/* 380 */       if (afi.ab.e(☃, cj1.d())) {
/* 381 */         for (int i = 0; i < 2; i++) {
/* 382 */           double d1 = cj1.n() + random.nextDouble();
/* 383 */           double d2 = cj1.o() + random.nextDouble();
/* 384 */           double d3 = (cj1.p() + 1) - random.nextDouble() * 0.10000000149011612D;
/* 385 */           ☃.a(cy.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } 
/*     */       }
/* 388 */       if (afi.ab.e(☃, cj1.a())) {
/* 389 */         for (int i = 0; i < 2; i++) {
/* 390 */           double d1 = cj1.n() + random.nextDouble();
/* 391 */           double d2 = (cj1.o() + 1) - random.nextDouble() * 0.10000000149011612D;
/* 392 */           double d3 = cj1.p() + random.nextDouble();
/* 393 */           ☃.a(cy.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/* 401 */     return arn.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 406 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 411 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 417 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 422 */     return new ama(this, new amo[] { a, O, P, Q, R, S, b, N });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */