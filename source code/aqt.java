/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ public abstract class aqt
/*     */ {
/*     */   protected aqe l;
/*     */   protected cq m;
/*     */   protected int n;
/*     */   
/*     */   public aqt() {}
/*     */   
/*     */   protected aqt(int ☃) {
/*  59 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public dn b() {
/*  63 */     dn ☃ = new dn();
/*     */     
/*  65 */     ☃.a("id", aqr.a(this));
/*  66 */     ☃.a("BB", this.l.g());
/*  67 */     ☃.a("O", (this.m == null) ? -1 : this.m.b());
/*  68 */     ☃.a("GD", this.n);
/*     */     
/*  70 */     a(☃);
/*     */     
/*  72 */     return ☃;
/*     */   }
/*     */   
/*     */   protected abstract void a(dn paramdn);
/*     */   
/*     */   public void a(adm ☃, dn dn1) {
/*  78 */     if (dn1.c("BB")) {
/*  79 */       this.l = new aqe(dn1.l("BB"));
/*     */     }
/*  81 */     int i = dn1.f("O");
/*  82 */     this.m = (i == -1) ? null : cq.b(i);
/*  83 */     this.n = dn1.f("GD");
/*     */     
/*  85 */     b(dn1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void b(dn paramdn);
/*     */   
/*     */   public void a(aqt ☃, List<aqt> list, Random random) {}
/*     */   
/*     */   public abstract boolean a(adm paramadm, Random paramRandom, aqe paramaqe);
/*     */   
/*     */   public aqe c() {
/*  96 */     return this.l;
/*     */   }
/*     */   
/*     */   public int d() {
/* 100 */     return this.n;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static aqt a(List<aqt> ☃, aqe aqe1) {
/* 111 */     for (Iterator<aqt> iterator = ☃.iterator(); iterator.hasNext(); ) { aqt aqt1 = iterator.next();
/* 112 */       if (aqt1.c() != null && aqt1.c().a(aqe1)) {
/* 113 */         return aqt1;
/*     */       } }
/*     */     
/* 116 */     return null;
/*     */   }
/*     */   
/*     */   public cj a() {
/* 120 */     return new cj(this.l.f());
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, aqe aqe1) {
/* 124 */     int i = Math.max(this.l.a - 1, aqe1.a);
/* 125 */     int j = Math.max(this.l.b - 1, aqe1.b);
/* 126 */     int k = Math.max(this.l.c - 1, aqe1.c);
/* 127 */     int m = Math.min(this.l.d + 1, aqe1.d);
/* 128 */     int n = Math.min(this.l.e + 1, aqe1.e);
/* 129 */     int i1 = Math.min(this.l.f + 1, aqe1.f);
/*     */     
/* 131 */     cj.a a = new cj.a();
/*     */     
/*     */     int i2;
/* 134 */     for (i2 = i; i2 <= m; i2++) {
/* 135 */       for (int i3 = k; i3 <= i1; i3++) {
/* 136 */         if (☃.p(a.c(i2, j, i3)).c().t().d()) {
/* 137 */           return true;
/*     */         }
/* 139 */         if (☃.p(a.c(i2, n, i3)).c().t().d()) {
/* 140 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 145 */     for (i2 = i; i2 <= m; i2++) {
/* 146 */       for (int i3 = j; i3 <= n; i3++) {
/* 147 */         if (☃.p(a.c(i2, i3, k)).c().t().d()) {
/* 148 */           return true;
/*     */         }
/* 150 */         if (☃.p(a.c(i2, i3, i1)).c().t().d()) {
/* 151 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 156 */     for (i2 = k; i2 <= i1; i2++) {
/* 157 */       for (int i3 = j; i3 <= n; i3++) {
/* 158 */         if (☃.p(a.c(i, i3, i2)).c().t().d()) {
/* 159 */           return true;
/*     */         }
/* 161 */         if (☃.p(a.c(m, i3, i2)).c().t().d()) {
/* 162 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   protected int a(int ☃, int i) {
/* 170 */     if (this.m == null) {
/* 171 */       return ☃;
/*     */     }
/*     */     
/* 174 */     switch (null.a[this.m.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 177 */         return this.l.a + ☃;
/*     */       case 3:
/* 179 */         return this.l.d - i;
/*     */       case 4:
/* 181 */         return this.l.a + i;
/*     */     } 
/* 183 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(int ☃) {
/* 188 */     if (this.m == null) {
/* 189 */       return ☃;
/*     */     }
/* 191 */     return ☃ + this.l.b;
/*     */   }
/*     */   
/*     */   protected int b(int ☃, int i) {
/* 195 */     if (this.m == null) {
/* 196 */       return i;
/*     */     }
/*     */     
/* 199 */     switch (null.a[this.m.ordinal()]) {
/*     */       case 1:
/* 201 */         return this.l.f - i;
/*     */       case 2:
/* 203 */         return this.l.c + i;
/*     */       case 3:
/*     */       case 4:
/* 206 */         return this.l.c + ☃;
/*     */     } 
/* 208 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(afh ☃, int i) {
/* 214 */     if (☃ == afi.av) {
/* 215 */       if (this.m == cq.e || this.m == cq.f) {
/* 216 */         if (i == 1) {
/* 217 */           return 0;
/*     */         }
/* 219 */         return 1;
/*     */       }
/*     */     
/* 222 */     } else if (☃ instanceof agh) {
/* 223 */       if (this.m == cq.d) {
/* 224 */         if (i == 0) {
/* 225 */           return 2;
/*     */         }
/* 227 */         if (i == 2)
/* 228 */           return 0; 
/*     */       } else {
/* 230 */         if (this.m == cq.e)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/* 235 */           return i + 1 & 0x3; } 
/* 236 */         if (this.m == cq.f)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/* 241 */           return i + 3 & 0x3; } 
/*     */       } 
/* 243 */     } else if (☃ == afi.aw || ☃ == afi.ad || ☃ == afi.bA || ☃ == afi.bv || ☃ == afi.bO) {
/* 244 */       if (this.m == cq.d) {
/* 245 */         if (i == 2) {
/* 246 */           return 3;
/*     */         }
/* 248 */         if (i == 3) {
/* 249 */           return 2;
/*     */         }
/* 251 */       } else if (this.m == cq.e) {
/* 252 */         if (i == 0) {
/* 253 */           return 2;
/*     */         }
/* 255 */         if (i == 1) {
/* 256 */           return 3;
/*     */         }
/* 258 */         if (i == 2) {
/* 259 */           return 0;
/*     */         }
/* 261 */         if (i == 3) {
/* 262 */           return 1;
/*     */         }
/* 264 */       } else if (this.m == cq.f) {
/* 265 */         if (i == 0) {
/* 266 */           return 2;
/*     */         }
/* 268 */         if (i == 1) {
/* 269 */           return 3;
/*     */         }
/* 271 */         if (i == 2) {
/* 272 */           return 1;
/*     */         }
/* 274 */         if (i == 3) {
/* 275 */           return 0;
/*     */         }
/*     */       } 
/* 278 */     } else if (☃ == afi.au) {
/* 279 */       if (this.m == cq.d) {
/* 280 */         if (i == cq.c.a()) {
/* 281 */           return cq.d.a();
/*     */         }
/* 283 */         if (i == cq.d.a()) {
/* 284 */           return cq.c.a();
/*     */         }
/* 286 */       } else if (this.m == cq.e) {
/* 287 */         if (i == cq.c.a()) {
/* 288 */           return cq.e.a();
/*     */         }
/* 290 */         if (i == cq.d.a()) {
/* 291 */           return cq.f.a();
/*     */         }
/* 293 */         if (i == cq.e.a()) {
/* 294 */           return cq.c.a();
/*     */         }
/* 296 */         if (i == cq.f.a()) {
/* 297 */           return cq.d.a();
/*     */         }
/* 299 */       } else if (this.m == cq.f) {
/*     */         
/* 301 */         if (i == cq.c.a()) {
/* 302 */           return cq.f.a();
/*     */         }
/* 304 */         if (i == cq.d.a()) {
/* 305 */           return cq.e.a();
/*     */         }
/* 307 */         if (i == cq.e.a()) {
/* 308 */           return cq.c.a();
/*     */         }
/* 310 */         if (i == cq.f.a()) {
/* 311 */           return cq.d.a();
/*     */         }
/*     */       } 
/* 314 */     } else if (☃ == afi.aG) {
/* 315 */       if (this.m == cq.d) {
/* 316 */         if (i == 3) {
/* 317 */           return 4;
/*     */         }
/* 319 */         if (i == 4) {
/* 320 */           return 3;
/*     */         }
/* 322 */       } else if (this.m == cq.e) {
/* 323 */         if (i == 3) {
/* 324 */           return 1;
/*     */         }
/* 326 */         if (i == 4) {
/* 327 */           return 2;
/*     */         }
/* 329 */         if (i == 2) {
/* 330 */           return 3;
/*     */         }
/* 332 */         if (i == 1) {
/* 333 */           return 4;
/*     */         }
/* 335 */       } else if (this.m == cq.f) {
/* 336 */         if (i == 3) {
/* 337 */           return 2;
/*     */         }
/* 339 */         if (i == 4) {
/* 340 */           return 1;
/*     */         }
/* 342 */         if (i == 2) {
/* 343 */           return 3;
/*     */         }
/* 345 */         if (i == 1) {
/* 346 */           return 4;
/*     */         }
/*     */       } 
/* 349 */     } else if (☃ == afi.bR || ☃ instanceof age) {
/* 350 */       cq cq1 = cq.b(i);
/* 351 */       if (this.m == cq.d) {
/* 352 */         if (cq1 == cq.d || cq1 == cq.c) {
/* 353 */           return cq1.d().b();
/*     */         }
/* 355 */       } else if (this.m == cq.e) {
/* 356 */         if (cq1 == cq.c) {
/* 357 */           return cq.e.b();
/*     */         }
/* 359 */         if (cq1 == cq.d) {
/* 360 */           return cq.f.b();
/*     */         }
/* 362 */         if (cq1 == cq.e) {
/* 363 */           return cq.c.b();
/*     */         }
/* 365 */         if (cq1 == cq.f) {
/* 366 */           return cq.d.b();
/*     */         }
/* 368 */       } else if (this.m == cq.f) {
/*     */         
/* 370 */         if (cq1 == cq.c) {
/* 371 */           return cq.f.b();
/*     */         }
/* 373 */         if (cq1 == cq.d) {
/* 374 */           return cq.e.b();
/*     */         }
/* 376 */         if (cq1 == cq.e) {
/* 377 */           return cq.c.b();
/*     */         }
/* 379 */         if (cq1 == cq.f) {
/* 380 */           return cq.d.b();
/*     */         }
/*     */       } 
/* 383 */     } else if (☃ == afi.J || ☃ == afi.F || ☃ == afi.ay || ☃ == afi.z) {
/* 384 */       if (this.m == cq.d) {
/* 385 */         if (i == cq.c.a() || i == cq.d.a()) {
/* 386 */           return cq.a(i).d().a();
/*     */         }
/* 388 */       } else if (this.m == cq.e) {
/* 389 */         if (i == cq.c.a()) {
/* 390 */           return cq.e.a();
/*     */         }
/* 392 */         if (i == cq.d.a()) {
/* 393 */           return cq.f.a();
/*     */         }
/* 395 */         if (i == cq.e.a()) {
/* 396 */           return cq.c.a();
/*     */         }
/* 398 */         if (i == cq.f.a()) {
/* 399 */           return cq.d.a();
/*     */         }
/* 401 */       } else if (this.m == cq.f) {
/* 402 */         if (i == cq.c.a()) {
/* 403 */           return cq.f.a();
/*     */         }
/* 405 */         if (i == cq.d.a()) {
/* 406 */           return cq.e.a();
/*     */         }
/* 408 */         if (i == cq.e.a()) {
/* 409 */           return cq.c.a();
/*     */         }
/* 411 */         if (i == cq.f.a()) {
/* 412 */           return cq.d.a();
/*     */         }
/*     */       } 
/*     */     } 
/* 416 */     return i;
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, alz alz1, int i, int j, int k, aqe aqe1) {
/* 420 */     cj cj = new cj(a(i, k), d(j), b(i, k));
/*     */     
/* 422 */     if (!aqe1.b(cj)) {
/*     */       return;
/*     */     }
/*     */     
/* 426 */     ☃.a(cj, alz1, 2);
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
/*     */   protected alz a(adm ☃, int i, int j, int k, aqe aqe1) {
/* 442 */     int m = a(i, k);
/* 443 */     int n = d(j);
/* 444 */     int i1 = b(i, k);
/*     */     
/* 446 */     cj cj = new cj(m, n, i1);
/* 447 */     if (!aqe1.b(cj)) {
/* 448 */       return afi.a.Q();
/*     */     }
/*     */     
/* 451 */     return ☃.p(cj);
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1) {
/* 455 */     for (int i2 = j; i2 <= n; i2++) {
/* 456 */       for (int i3 = i; i3 <= m; i3++) {
/* 457 */         for (int i4 = k; i4 <= i1; i4++) {
/* 458 */           a(☃, afi.a.Q(), i3, i2, i4, aqe1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, alz alz1, alz alz2, boolean bool) {
/* 465 */     for (int i2 = j; i2 <= n; i2++) {
/* 466 */       for (int i3 = i; i3 <= m; i3++) {
/* 467 */         for (int i4 = k; i4 <= i1; i4++) {
/* 468 */           if (!bool || a(☃, i3, i2, i4, aqe1).c().t() != arm.a)
/*     */           {
/*     */             
/* 471 */             if (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1) {
/* 472 */               a(☃, alz1, i3, i2, i4, aqe1);
/*     */             } else {
/* 474 */               a(☃, alz2, i3, i2, i4, aqe1);
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
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, boolean bool, Random random, a a1) {
/* 486 */     for (int i2 = j; i2 <= n; i2++) {
/* 487 */       for (int i3 = i; i3 <= m; i3++) {
/* 488 */         for (int i4 = k; i4 <= i1; i4++) {
/* 489 */           if (!bool || a(☃, i3, i2, i4, aqe1).c().t() != arm.a) {
/*     */ 
/*     */             
/* 492 */             a1.a(random, i3, i2, i4, (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1));
/* 493 */             a(☃, a1.a(), i3, i2, i4, aqe1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, Random random, float f, int i, int j, int k, int m, int n, int i1, alz alz1, alz alz2, boolean bool) {
/* 504 */     for (int i2 = j; i2 <= n; i2++) {
/* 505 */       for (int i3 = i; i3 <= m; i3++) {
/* 506 */         for (int i4 = k; i4 <= i1; i4++) {
/* 507 */           if (random.nextFloat() <= f)
/*     */           {
/*     */             
/* 510 */             if (!bool || a(☃, i3, i2, i4, aqe1).c().t() != arm.a)
/*     */             {
/*     */               
/* 513 */               if (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1) {
/* 514 */                 a(☃, alz1, i3, i2, i4, aqe1);
/*     */               } else {
/* 516 */                 a(☃, alz2, i3, i2, i4, aqe1);
/*     */               }  }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, Random random, float f, int i, int j, int k, alz alz1) {
/* 524 */     if (random.nextFloat() < f) {
/* 525 */       a(☃, alz1, i, j, k, aqe1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, alz alz1, boolean bool) {
/* 530 */     float f1 = (m - i + 1);
/* 531 */     float f2 = (n - j + 1);
/* 532 */     float f3 = (i1 - k + 1);
/* 533 */     float f4 = i + f1 / 2.0F;
/* 534 */     float f5 = k + f3 / 2.0F;
/*     */     
/* 536 */     for (int i2 = j; i2 <= n; i2++) {
/* 537 */       float f = (i2 - j) / f2;
/*     */       
/* 539 */       for (int i3 = i; i3 <= m; i3++) {
/* 540 */         float f6 = (i3 - f4) / f1 * 0.5F;
/*     */         
/* 542 */         for (int i4 = k; i4 <= i1; i4++) {
/* 543 */           float f7 = (i4 - f5) / f3 * 0.5F;
/*     */           
/* 545 */           if (!bool || a(☃, i3, i2, i4, aqe1).c().t() != arm.a) {
/*     */ 
/*     */ 
/*     */             
/* 549 */             float f8 = f6 * f6 + f * f + f7 * f7;
/*     */             
/* 551 */             if (f8 <= 1.05F)
/* 552 */               a(☃, alz1, i3, i2, i4, aqe1); 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(adm ☃, int i, int j, int k, aqe aqe1) {
/* 560 */     cj cj = new cj(a(i, k), d(j), b(i, k));
/*     */     
/* 562 */     if (!aqe1.b(cj)) {
/*     */       return;
/*     */     }
/*     */     
/* 566 */     while (!☃.d(cj) && cj.o() < 255) {
/* 567 */       ☃.a(cj, afi.a.Q(), 2);
/* 568 */       cj = cj.a();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(adm ☃, alz alz1, int i, int j, int k, aqe aqe1) {
/* 573 */     int m = a(i, k);
/* 574 */     int n = d(j);
/* 575 */     int i1 = b(i, k);
/*     */     
/* 577 */     if (!aqe1.b(new cj(m, n, i1))) {
/*     */       return;
/*     */     }
/*     */     
/* 581 */     while ((☃.d(new cj(m, n, i1)) || ☃.p(new cj(m, n, i1)).c().t().d()) && n > 1) {
/* 582 */       ☃.a(new cj(m, n, i1), alz1, 2);
/* 583 */       n--;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, aqe aqe1, Random random, int i, int j, int k, List<ob> list, int m) {
/* 588 */     cj cj = new cj(a(i, k), d(j), b(i, k));
/*     */     
/* 590 */     if (aqe1.b(cj) && 
/* 591 */       ☃.p(cj).c() != afi.ae) {
/* 592 */       alz alz = afi.ae.Q();
/* 593 */       ☃.a(cj, afi.ae.f(☃, cj, alz), 2);
/*     */       
/* 595 */       akw akw = ☃.s(cj);
/* 596 */       if (akw instanceof aky) {
/* 597 */         ob.a(random, list, (aky)akw, m);
/*     */       }
/* 599 */       return true;
/*     */     } 
/*     */     
/* 602 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, aqe aqe1, Random random, int i, int j, int k, int m, List<ob> list, int n) {
/* 606 */     cj cj = new cj(a(i, k), d(j), b(i, k));
/*     */     
/* 608 */     if (aqe1.b(cj) && 
/* 609 */       ☃.p(cj).c() != afi.z) {
/* 610 */       ☃.a(cj, afi.z.a(a(afi.z, m)), 2);
/*     */       
/* 612 */       akw akw = ☃.s(cj);
/* 613 */       if (akw instanceof alc) {
/* 614 */         ob.a(random, list, (alc)akw, n);
/*     */       }
/* 616 */       return true;
/*     */     } 
/*     */     
/* 619 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, Random random, int i, int j, int k, cq cq1) {
/* 623 */     cj cj = new cj(a(i, k), d(j), b(i, k));
/*     */     
/* 625 */     if (aqe1.b(cj)) {
/* 626 */       zb.a(☃, cj, cq1.f(), afi.ao);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 631 */     this.l.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public static abstract class a {
/* 635 */     protected alz a = afi.a.Q();
/*     */     
/*     */     public abstract void a(Random param1Random, int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean);
/*     */     
/*     */     public alz a() {
/* 640 */       return this.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */