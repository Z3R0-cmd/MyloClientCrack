/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajb
/*     */   extends afh
/*     */ {
/*  30 */   public static final amm<a> a = amm.a("north", a.class);
/*  31 */   public static final amm<a> b = amm.a("east", a.class);
/*  32 */   public static final amm<a> N = amm.a("south", a.class);
/*  33 */   public static final amm<a> O = amm.a("west", a.class);
/*  34 */   public static final amn P = amn.a("power", 0, 15);
/*     */   
/*     */   private boolean Q = true;
/*  37 */   private final Set<cj> R = Sets.newHashSet();
/*     */   
/*     */   public ajb() {
/*  40 */     super(arm.q);
/*  41 */     j(this.M.b().<a, a>a(a, a.c).<a, a>a(b, a.c).<a, a>a(N, a.c).<a, a>a(O, a.c).a(P, Integer.valueOf(0)));
/*  42 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  47 */     ☃ = ☃.a(O, c(adq1, cj1, cq.e));
/*  48 */     ☃ = ☃.a(b, c(adq1, cj1, cq.f));
/*  49 */     ☃ = ☃.a(a, c(adq1, cj1, cq.c));
/*  50 */     ☃ = ☃.a(N, c(adq1, cj1, cq.d));
/*     */     
/*  52 */     return ☃;
/*     */   }
/*     */   
/*     */   private a c(adq ☃, cj cj1, cq cq1) {
/*  56 */     cj cj2 = cj1.a(cq1);
/*  57 */     afh afh1 = ☃.p(cj1.a(cq1)).c();
/*     */     
/*  59 */     if (a(☃.p(cj2), cq1) || (!afh1.u() && d(☃.p(cj2.b())))) {
/*  60 */       return a.b;
/*     */     }
/*     */     
/*  63 */     afh afh2 = ☃.p(cj1.a()).c();
/*  64 */     if (!afh2.u() && afh1.u() && d(☃.p(cj2.a()))) {
/*  65 */       return a.a;
/*     */     }
/*     */     
/*  68 */     return a.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  74 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  79 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  89 */     alz alz = ☃.p(cj1);
/*     */     
/*  91 */     if (alz.c() != this) {
/*  92 */       return super.a(☃, cj1, i);
/*     */     }
/*     */     
/*  95 */     return b(((Integer)alz.<Integer>b(P)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 100 */     return (adm.a(☃, cj1.b()) || ☃.p(cj1.b()).c() == afi.aX);
/*     */   }
/*     */   
/*     */   private alz e(adm ☃, cj cj1, alz alz1) {
/* 104 */     alz1 = a(☃, cj1, cj1, alz1);
/*     */     
/* 106 */     List<cj> list = Lists.newArrayList(this.R);
/* 107 */     this.R.clear();
/* 108 */     for (Iterator<cj> iterator = list.iterator(); iterator.hasNext(); ) { cj cj2 = iterator.next();
/* 109 */       ☃.c(cj2, this); }
/*     */ 
/*     */     
/* 112 */     return alz1;
/*     */   }
/*     */   
/*     */   private alz a(adm ☃, cj cj1, cj cj2, alz alz1) {
/* 116 */     alz alz2 = alz1;
/* 117 */     int i = ((Integer)alz2.<Integer>b(P)).intValue();
/* 118 */     int j = 0;
/*     */     
/* 120 */     j = a(☃, cj2, j);
/*     */     
/* 122 */     this.Q = false;
/* 123 */     int k = ☃.A(cj1);
/* 124 */     this.Q = true;
/*     */     
/* 126 */     if (k > 0 && k > j - 1) {
/* 127 */       j = k;
/*     */     }
/*     */     
/* 130 */     int m = 0;
/* 131 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 132 */       cj cj3 = cj1.a(cq);
/* 133 */       boolean bool = (cj3.n() != cj2.n() || cj3.p() != cj2.p());
/*     */       
/* 135 */       if (bool) {
/* 136 */         m = a(☃, cj3, m);
/*     */       }
/* 138 */       if (☃.p(cj3).c().v() && !☃.p(cj1.a()).c().v()) {
/* 139 */         if (bool && cj1.o() >= cj2.o())
/* 140 */           m = a(☃, cj3.a(), m);  continue;
/*     */       } 
/* 142 */       if (!☃.p(cj3).c().v() && 
/* 143 */         bool && cj1.o() <= cj2.o()) {
/* 144 */         m = a(☃, cj3.b(), m);
/*     */       } }
/*     */ 
/*     */     
/* 148 */     if (m > j) {
/* 149 */       j = m - 1;
/* 150 */     } else if (j > 0) {
/* 151 */       j--;
/*     */     } else {
/* 153 */       j = 0;
/*     */     } 
/*     */     
/* 156 */     if (k > j - 1) {
/* 157 */       j = k;
/*     */     }
/*     */     
/* 160 */     if (i != j) {
/* 161 */       alz1 = alz1.a(P, Integer.valueOf(j));
/*     */       
/* 163 */       if (☃.p(cj1) == alz2) {
/* 164 */         ☃.a(cj1, alz1, 2);
/*     */       }
/*     */       
/* 167 */       this.R.add(cj1); cq[] arrayOfCq; int n, i1;
/* 168 */       for (arrayOfCq = cq.values(), n = arrayOfCq.length, i1 = 0; i1 < n; ) { cq cq = arrayOfCq[i1];
/* 169 */         this.R.add(cj1.a(cq));
/*     */         i1++; }
/*     */     
/*     */     } 
/* 173 */     return alz1;
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1) {
/* 177 */     if (☃.p(cj1).c() != this) {
/*     */       return;
/*     */     }
/*     */     
/* 181 */     ☃.c(cj1, this); cq[] arrayOfCq; int i, j;
/* 182 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 183 */       ☃.c(cj1.a(cq), this);
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 189 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 193 */     e(☃, cj1, alz1);
/*     */     
/* 195 */     for (Iterator<cq> iterator3 = cq.c.b.iterator(); iterator3.hasNext(); ) { cq cq = iterator3.next();
/* 196 */       ☃.c(cj1.a(cq), this); }
/*     */ 
/*     */     
/* 199 */     for (Iterator<cq> iterator2 = cq.c.a.iterator(); iterator2.hasNext(); ) { cq cq = iterator2.next();
/* 200 */       e(☃, cj1.a(cq)); }
/*     */ 
/*     */     
/* 203 */     for (Iterator<cq> iterator1 = cq.c.a.iterator(); iterator1.hasNext(); ) { cq cq = iterator1.next();
/* 204 */       cj cj2 = cj1.a(cq);
/*     */       
/* 206 */       if (☃.p(cj2).c().v()) {
/* 207 */         e(☃, cj2.a()); continue;
/*     */       } 
/* 209 */       e(☃, cj2.b()); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 216 */     super.b(☃, cj1, alz1);
/* 217 */     if (☃.D)
/*     */       return; 
/*     */     cq[] arrayOfCq;
/*     */     int i, j;
/* 221 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 222 */       ☃.c(cj1.a(cq), this); j++; }
/*     */     
/* 224 */     e(☃, cj1, alz1);
/*     */     
/* 226 */     for (Iterator<cq> iterator2 = cq.c.a.iterator(); iterator2.hasNext(); ) { cq cq = iterator2.next();
/* 227 */       e(☃, cj1.a(cq)); }
/*     */ 
/*     */     
/* 230 */     for (Iterator<cq> iterator1 = cq.c.a.iterator(); iterator1.hasNext(); ) { cq cq = iterator1.next();
/* 231 */       cj cj2 = cj1.a(cq);
/*     */       
/* 233 */       if (☃.p(cj2).c().v()) {
/* 234 */         e(☃, cj2.a()); continue;
/*     */       } 
/* 236 */       e(☃, cj2.b()); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(adm ☃, cj cj1, int i) {
/* 242 */     if (☃.p(cj1).c() != this) {
/* 243 */       return i;
/*     */     }
/* 245 */     int j = ((Integer)☃.p(cj1).<Integer>b(P)).intValue();
/* 246 */     if (j > i) {
/* 247 */       return j;
/*     */     }
/* 249 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 254 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 258 */     if (d(☃, cj1)) {
/* 259 */       e(☃, cj1, alz1);
/*     */     } else {
/* 261 */       b(☃, cj1, alz1, 0);
/* 262 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 269 */     return zy.aC;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 274 */     if (!this.Q) {
/* 275 */       return 0;
/*     */     }
/* 277 */     return a(☃, cj1, alz1, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 282 */     if (!this.Q) {
/* 283 */       return 0;
/*     */     }
/*     */     
/* 286 */     int i = ((Integer)alz1.<Integer>b(P)).intValue();
/* 287 */     if (i == 0) {
/* 288 */       return 0;
/*     */     }
/*     */     
/* 291 */     if (cq1 == cq.b) {
/* 292 */       return i;
/*     */     }
/*     */     
/* 295 */     EnumSet<cq> enumSet = EnumSet.noneOf(cq.class);
/* 296 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq2 = iterator.next();
/* 297 */       if (d(☃, cj1, cq2)) {
/* 298 */         enumSet.add(cq2);
/*     */       } }
/*     */ 
/*     */     
/* 302 */     if (cq1.k().c() && enumSet.isEmpty()) {
/* 303 */       return i;
/*     */     }
/*     */     
/* 306 */     if (enumSet.contains(cq1) && !enumSet.contains(cq1.f()) && !enumSet.contains(cq1.e())) {
/* 307 */       return i;
/*     */     }
/*     */     
/* 310 */     return 0;
/*     */   }
/*     */   
/*     */   private boolean d(adq ☃, cj cj1, cq cq1) {
/* 314 */     cj cj2 = cj1.a(cq1);
/* 315 */     alz alz = ☃.p(cj2);
/* 316 */     afh afh1 = alz.c();
/* 317 */     boolean bool1 = afh1.v();
/*     */     
/* 319 */     boolean bool2 = ☃.p(cj1.a()).c().v();
/* 320 */     if (!bool2 && bool1 && e(☃, cj2.a())) {
/* 321 */       return true;
/*     */     }
/* 323 */     if (a(alz, cq1)) {
/* 324 */       return true;
/*     */     }
/* 326 */     if (afh1 == afi.bc && alz.b(agd.O) == cq1) {
/* 327 */       return true;
/*     */     }
/* 329 */     if (!bool1 && e(☃, cj2.b())) {
/* 330 */       return true;
/*     */     }
/*     */     
/* 333 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean e(adq ☃, cj cj1) {
/* 337 */     return d(☃.p(cj1));
/*     */   }
/*     */   
/*     */   protected static boolean d(alz ☃) {
/* 341 */     return a(☃, (cq)null);
/*     */   }
/*     */   
/*     */   protected static boolean a(alz ☃, cq cq1) {
/* 345 */     afh afh1 = ☃.c();
/* 346 */     if (afh1 == afi.af) {
/* 347 */       return true;
/*     */     }
/*     */     
/* 350 */     if (afi.bb.e(afh1)) {
/* 351 */       cq cq2 = ☃.<cq>b(ajf.O);
/* 352 */       return (cq2 == cq1 || cq2.d() == cq1);
/*     */     } 
/*     */     
/* 355 */     return (afh1.i() && cq1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 360 */     return this.Q;
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 364 */     float f1 = ☃ / 15.0F;
/* 365 */     float f2 = f1 * 0.6F + 0.4F;
/* 366 */     if (☃ == 0) {
/* 367 */       f2 = 0.3F;
/*     */     }
/*     */     
/* 370 */     float f3 = f1 * f1 * 0.7F - 0.5F;
/* 371 */     float f4 = f1 * f1 * 0.6F - 0.7F;
/* 372 */     if (f3 < 0.0F) {
/* 373 */       f3 = 0.0F;
/*     */     }
/* 375 */     if (f4 < 0.0F) {
/* 376 */       f4 = 0.0F;
/*     */     }
/*     */     
/* 379 */     int i = ns.a((int)(f2 * 255.0F), 0, 255);
/* 380 */     int j = ns.a((int)(f3 * 255.0F), 0, 255);
/* 381 */     int k = ns.a((int)(f4 * 255.0F), 0, 255);
/* 382 */     return 0xFF000000 | i << 16 | j << 8 | k;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 387 */     int i = ((Integer)alz1.<Integer>b(P)).intValue();
/* 388 */     if (i == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 392 */     double d1 = cj1.n() + 0.5D + (random.nextFloat() - 0.5D) * 0.2D;
/* 393 */     double d2 = (cj1.o() + 0.0625F);
/* 394 */     double d3 = cj1.p() + 0.5D + (random.nextFloat() - 0.5D) * 0.2D;
/*     */ 
/*     */     
/* 397 */     float f1 = i / 15.0F;
/* 398 */     float f2 = f1 * 0.6F + 0.4F;
/* 399 */     float f3 = Math.max(0.0F, f1 * f1 * 0.7F - 0.5F);
/* 400 */     float f4 = Math.max(0.0F, f1 * f1 * 0.6F - 0.7F);
/*     */     
/* 402 */     ☃.a(cy.E, d1, d2, d3, f2, f3, f4, new int[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 407 */     return zy.aC;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 412 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 417 */     return Q().a(P, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 423 */     return ((Integer)☃.<Integer>b(P)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 428 */     return new ama(this, new amo[] { a, b, N, O, P });
/*     */   }
/*     */   
/*     */   enum a implements nw {
/* 432 */     a("up"),
/* 433 */     b("side"),
/* 434 */     c("none");
/*     */     
/*     */     private final String d;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 440 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 445 */       return l();
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 450 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */