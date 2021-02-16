/*     */ import java.util.Iterator;
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
/*     */ public class akk
/*     */   extends afh
/*     */ {
/*  27 */   public static final amk a = amk.a("up");
/*  28 */   public static final amk b = amk.a("north");
/*  29 */   public static final amk N = amk.a("east");
/*  30 */   public static final amk O = amk.a("south");
/*  31 */   public static final amk P = amk.a("west");
/*  32 */   public static final amk[] Q = new amk[] { a, b, O, P, N };
/*     */   
/*     */   public akk() {
/*  35 */     super(arm.l);
/*  36 */     j(this.M.b().<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).<Comparable, Boolean>a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)));
/*  37 */     a(true);
/*  38 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  43 */     return ☃.a(a, Boolean.valueOf(adq1.p(cj1.a()).c().u()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  48 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1) {
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  68 */     float f1 = 0.0625F;
/*     */     
/*  70 */     float f2 = 1.0F;
/*  71 */     float f3 = 1.0F;
/*  72 */     float f4 = 1.0F;
/*  73 */     float f5 = 0.0F;
/*  74 */     float f6 = 0.0F;
/*  75 */     float f7 = 0.0F;
/*  76 */     boolean bool = false;
/*     */     
/*  78 */     if (((Boolean)☃.p(cj1).<Boolean>b(P)).booleanValue()) {
/*  79 */       f5 = Math.max(f5, 0.0625F);
/*  80 */       f2 = 0.0F;
/*  81 */       f3 = 0.0F;
/*  82 */       f6 = 1.0F;
/*  83 */       f4 = 0.0F;
/*  84 */       f7 = 1.0F;
/*  85 */       bool = true;
/*     */     } 
/*  87 */     if (((Boolean)☃.p(cj1).<Boolean>b(N)).booleanValue()) {
/*  88 */       f2 = Math.min(f2, 0.9375F);
/*  89 */       f5 = 1.0F;
/*  90 */       f3 = 0.0F;
/*  91 */       f6 = 1.0F;
/*  92 */       f4 = 0.0F;
/*  93 */       f7 = 1.0F;
/*  94 */       bool = true;
/*     */     } 
/*  96 */     if (((Boolean)☃.p(cj1).<Boolean>b(b)).booleanValue()) {
/*  97 */       f7 = Math.max(f7, 0.0625F);
/*  98 */       f4 = 0.0F;
/*  99 */       f2 = 0.0F;
/* 100 */       f5 = 1.0F;
/* 101 */       f3 = 0.0F;
/* 102 */       f6 = 1.0F;
/* 103 */       bool = true;
/*     */     } 
/* 105 */     if (((Boolean)☃.p(cj1).<Boolean>b(O)).booleanValue()) {
/* 106 */       f4 = Math.min(f4, 0.9375F);
/* 107 */       f7 = 1.0F;
/* 108 */       f2 = 0.0F;
/* 109 */       f5 = 1.0F;
/* 110 */       f3 = 0.0F;
/* 111 */       f6 = 1.0F;
/* 112 */       bool = true;
/*     */     } 
/* 114 */     if (!bool && c(☃.p(cj1.a()).c())) {
/* 115 */       f3 = Math.min(f3, 0.9375F);
/* 116 */       f6 = 1.0F;
/* 117 */       f2 = 0.0F;
/* 118 */       f5 = 1.0F;
/* 119 */       f4 = 0.0F;
/* 120 */       f7 = 1.0F;
/*     */     } 
/* 122 */     a(f2, f3, f4, f5, f6, f7);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 128 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/* 133 */     switch (null.a[cq1.ordinal()])
/*     */     { default:
/* 135 */         return false;
/*     */       case 1:
/* 137 */         return c(☃.p(cj1.a()).c());
/*     */       case 2:
/*     */       case 3:
/*     */       case 4:
/*     */       case 5:
/* 142 */         break; }  return c(☃.p(cj1.a(cq1.d())).c());
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean c(afh ☃) {
/* 147 */     return (☃.d() && ☃.J.c());
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1, alz alz1) {
/* 151 */     alz alz2 = alz1;
/*     */     
/* 153 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 154 */       amk amk1 = a(cq);
/*     */       
/* 156 */       if (((Boolean)alz1.<Boolean>b(amk1)).booleanValue() && 
/* 157 */         !c(☃.p(cj1.a(cq)).c())) {
/*     */         
/* 159 */         alz alz3 = ☃.p(cj1.a());
/* 160 */         if (alz3.c() != this || !((Boolean)alz3.<Boolean>b(amk1)).booleanValue()) {
/* 161 */           alz1 = alz1.a(amk1, Boolean.valueOf(false));
/*     */         }
/*     */       }  }
/*     */ 
/*     */ 
/*     */     
/* 167 */     if (d(alz1) == 0)
/*     */     {
/* 169 */       return false;
/*     */     }
/*     */     
/* 172 */     if (alz2 != alz1) {
/* 173 */       ☃.a(cj1, alz1, 2);
/*     */     }
/*     */     
/* 176 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int H() {
/* 181 */     return adj.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int h(alz ☃) {
/* 186 */     return adj.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/* 191 */     return ☃.b(cj1).c(cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 196 */     if (!☃.D && !e(☃, cj1, alz1)) {
/* 197 */       b(☃, cj1, alz1, 0);
/* 198 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 204 */     if (☃.D) {
/*     */       return;
/*     */     }
/* 207 */     if (☃.s.nextInt(4) != 0) {
/*     */       return;
/*     */     }
/*     */     
/* 211 */     int i = 4;
/* 212 */     int j = 5;
/* 213 */     boolean bool = false; int k;
/* 214 */     label107: for (k = -i; k <= i; k++) {
/* 215 */       for (int m = -i; m <= i; m++) {
/* 216 */         for (int n = -1; n <= 1; n++) {
/* 217 */           if (☃.p(cj1.a(k, n, m)).c() == this && --j <= 0) {
/* 218 */             bool = true;
/*     */             
/*     */             break label107;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 225 */     cq cq = cq.a(random);
/*     */     
/* 227 */     cj cj2 = cj1.a();
/* 228 */     if (cq == cq.b && cj1.o() < 255 && ☃.d(cj2)) {
/* 229 */       if (bool) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 234 */       alz alz2 = alz1;
/* 235 */       for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq1 = iterator.next();
/* 236 */         if (random.nextBoolean() || !c(☃.p(cj2.a(cq1)).c())) {
/* 237 */           alz2 = alz2.a(a(cq1), Boolean.valueOf(false));
/*     */         } }
/*     */       
/* 240 */       if (((Boolean)alz2.<Boolean>b(b)).booleanValue() || ((Boolean)alz2.<Boolean>b(N)).booleanValue() || ((Boolean)alz2.<Boolean>b(O)).booleanValue() || ((Boolean)alz2.<Boolean>b(P)).booleanValue()) {
/* 241 */         ☃.a(cj2, alz2, 2);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 246 */     if (cq.k().c() && !((Boolean)alz1.<Boolean>b(a(cq))).booleanValue()) {
/* 247 */       if (bool) {
/*     */         return;
/*     */       }
/*     */       
/* 251 */       cj cj3 = cj1.a(cq);
/*     */       
/* 253 */       afh afh1 = ☃.p(cj3).c();
/* 254 */       if (afh1.J == arm.a) {
/*     */ 
/*     */         
/* 257 */         cq cq1 = cq.e();
/* 258 */         cq cq2 = cq.f();
/*     */ 
/*     */         
/* 261 */         boolean bool1 = ((Boolean)alz1.<Boolean>b(a(cq1))).booleanValue();
/* 262 */         boolean bool2 = ((Boolean)alz1.<Boolean>b(a(cq2))).booleanValue();
/*     */         
/* 264 */         cj cj4 = cj3.a(cq1);
/* 265 */         cj cj5 = cj3.a(cq2);
/*     */         
/* 267 */         if (bool1 && c(☃.p(cj4).c())) {
/* 268 */           ☃.a(cj3, Q().a(a(cq1), Boolean.valueOf(true)), 2);
/* 269 */         } else if (bool2 && c(☃.p(cj5).c())) {
/* 270 */           ☃.a(cj3, Q().a(a(cq2), Boolean.valueOf(true)), 2);
/*     */         
/*     */         }
/* 273 */         else if (bool1 && ☃.d(cj4) && c(☃.p(cj1.a(cq1)).c())) {
/* 274 */           ☃.a(cj4, Q().a(a(cq.d()), Boolean.valueOf(true)), 2);
/* 275 */         } else if (bool2 && ☃.d(cj5) && c(☃.p(cj1.a(cq2)).c())) {
/* 276 */           ☃.a(cj5, Q().a(a(cq.d()), Boolean.valueOf(true)), 2);
/*     */         
/*     */         }
/* 279 */         else if (c(☃.p(cj3.a()).c())) {
/* 280 */           ☃.a(cj3, Q(), 2);
/*     */         }
/*     */       
/* 283 */       } else if (afh1.J.k() && afh1.d()) {
/*     */         
/* 285 */         ☃.a(cj1, alz1.a(a(cq), Boolean.valueOf(true)), 2);
/*     */       } 
/*     */       return;
/*     */     } 
/* 289 */     if (cj1.o() > 1) {
/*     */       
/* 291 */       cj cj3 = cj1.b();
/* 292 */       alz alz2 = ☃.p(cj3);
/* 293 */       afh afh1 = alz2.c();
/*     */       
/* 295 */       if (afh1.J == arm.a) {
/* 296 */         alz alz3 = alz1;
/* 297 */         for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq1 = iterator.next();
/* 298 */           if (random.nextBoolean()) {
/* 299 */             alz3 = alz3.a(a(cq1), Boolean.valueOf(false));
/*     */           } }
/*     */         
/* 302 */         if (((Boolean)alz3.<Boolean>b(b)).booleanValue() || ((Boolean)alz3.<Boolean>b(N)).booleanValue() || ((Boolean)alz3.<Boolean>b(O)).booleanValue() || ((Boolean)alz3.<Boolean>b(P)).booleanValue()) {
/* 303 */           ☃.a(cj3, alz3, 2);
/*     */         }
/* 305 */       } else if (afh1 == this) {
/* 306 */         alz alz3 = alz2;
/* 307 */         for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq1 = iterator.next();
/* 308 */           amk amk1 = a(cq1);
/* 309 */           if (random.nextBoolean() && ((Boolean)alz1.<Boolean>b(amk1)).booleanValue()) {
/* 310 */             alz3 = alz3.a(amk1, Boolean.valueOf(true));
/*     */           } }
/*     */         
/* 313 */         if (((Boolean)alz3.<Boolean>b(b)).booleanValue() || ((Boolean)alz3.<Boolean>b(N)).booleanValue() || ((Boolean)alz3.<Boolean>b(O)).booleanValue() || ((Boolean)alz3.<Boolean>b(P)).booleanValue()) {
/* 314 */           ☃.a(cj3, alz3, 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 322 */     alz alz = Q().<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).<Comparable, Boolean>a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false));
/* 323 */     if (cq1.k().c()) {
/* 324 */       return alz.a(a(cq1.d()), Boolean.valueOf(true));
/*     */     }
/*     */     
/* 327 */     return alz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 333 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 338 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 343 */     if (!☃.D && wn1.bZ() != null && wn1.bZ().b() == zy.be) {
/* 344 */       wn1.b(na.ab[afh.a(this)]);
/*     */ 
/*     */       
/* 347 */       a(☃, cj1, new zx(afi.bn, 1, 0));
/*     */     } else {
/* 349 */       super.a(☃, wn1, cj1, alz1, akw1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 355 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 360 */     return Q().<Comparable, Boolean>a(O, Boolean.valueOf(((☃ & 0x1) > 0))).<Comparable, Boolean>a(P, Boolean.valueOf(((☃ & 0x2) > 0))).<Comparable, Boolean>a(b, Boolean.valueOf(((☃ & 0x4) > 0))).a(N, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 369 */     int i = 0;
/*     */     
/* 371 */     if (((Boolean)☃.<Boolean>b(O)).booleanValue()) {
/* 372 */       i |= 0x1;
/*     */     }
/*     */     
/* 375 */     if (((Boolean)☃.<Boolean>b(P)).booleanValue()) {
/* 376 */       i |= 0x2;
/*     */     }
/*     */     
/* 379 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 380 */       i |= 0x4;
/*     */     }
/*     */     
/* 383 */     if (((Boolean)☃.<Boolean>b(N)).booleanValue()) {
/* 384 */       i |= 0x8;
/*     */     }
/*     */     
/* 387 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 392 */     return new ama(this, new amo[] { a, b, N, O, P });
/*     */   }
/*     */   
/*     */   public static amk a(cq ☃) {
/* 396 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 398 */         return a;
/*     */       case 2:
/* 400 */         return b;
/*     */       case 3:
/* 402 */         return O;
/*     */       case 5:
/* 404 */         return P;
/*     */       case 4:
/* 406 */         return N;
/*     */     } 
/*     */     
/* 409 */     throw new IllegalArgumentException(☃ + " is an invalid choice");
/*     */   }
/*     */   
/*     */   public static int d(alz ☃) {
/* 413 */     int i = 0; amk[] arrayOfAmk;
/*     */     int j, k;
/* 415 */     for (arrayOfAmk = Q, j = arrayOfAmk.length, k = 0; k < j; ) { amk amk1 = arrayOfAmk[k];
/* 416 */       if (((Boolean)☃.<Boolean>b(amk1)).booleanValue()) {
/* 417 */         i++;
/*     */       }
/*     */       k++; }
/*     */     
/* 421 */     return i;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */