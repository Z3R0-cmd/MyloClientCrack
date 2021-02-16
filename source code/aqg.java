/*     */ import com.google.common.collect.Lists;
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
/*     */ public class aqg
/*     */ {
/*     */   public static void a() {
/*  37 */     aqr.a((Class)a.class, "MSCorridor");
/*  38 */     aqr.a((Class)b.class, "MSCrossing");
/*  39 */     aqr.a((Class)c.class, "MSRoom");
/*  40 */     aqr.a((Class)d.class, "MSStairs");
/*     */   }
/*     */   
/*     */   private static aqt a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/*  44 */     int n = random.nextInt(100);
/*  45 */     if (n >= 80) {
/*  46 */       aqe aqe = b.a(☃, random, i, j, k, cq1);
/*  47 */       if (aqe != null) {
/*  48 */         return new b(m, random, aqe, cq1);
/*     */       }
/*  50 */     } else if (n >= 70) {
/*  51 */       aqe aqe = d.a(☃, random, i, j, k, cq1);
/*  52 */       if (aqe != null) {
/*  53 */         return new d(m, random, aqe, cq1);
/*     */       }
/*     */     } else {
/*  56 */       aqe aqe = a.a(☃, random, i, j, k, cq1);
/*  57 */       if (aqe != null) {
/*  58 */         return new a(m, random, aqe, cq1);
/*     */       }
/*     */     } 
/*     */     
/*  62 */     return null;
/*     */   }
/*     */   
/*     */   private static aqt b(aqt ☃, List<aqt> list, Random random, int i, int j, int k, cq cq1, int m) {
/*  66 */     if (m > 8) {
/*  67 */       return null;
/*     */     }
/*  69 */     if (Math.abs(i - (☃.c()).a) > 80 || Math.abs(k - (☃.c()).c) > 80) {
/*  70 */       return null;
/*     */     }
/*     */     
/*  73 */     aqt aqt1 = a(list, random, i, j, k, cq1, m + 1);
/*  74 */     if (aqt1 != null) {
/*  75 */       list.add(aqt1);
/*  76 */       aqt1.a(☃, list, random);
/*     */     } 
/*  78 */     return aqt1;
/*     */   }
/*     */   
/*     */   public static class c extends aqt {
/*  82 */     private List<aqe> a = Lists.newLinkedList();
/*     */ 
/*     */     
/*     */     public c() {}
/*     */ 
/*     */     
/*     */     public c(int ☃, Random random, int i, int j) {
/*  89 */       super(☃);
/*     */       
/*  91 */       this.l = new aqe(i, 50, j, i + 7 + random.nextInt(6), 54 + random.nextInt(6), j + 7 + random.nextInt(6));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  96 */       int i = d();
/*     */ 
/*     */ 
/*     */       
/* 100 */       int k = this.l.d() - 3 - 1;
/* 101 */       if (k <= 0) {
/* 102 */         k = 1;
/*     */       }
/*     */ 
/*     */       
/* 106 */       int j = 0;
/* 107 */       while (j < this.l.c()) {
/* 108 */         j += random.nextInt(this.l.c());
/* 109 */         if (j + 3 > this.l.c()) {
/*     */           break;
/*     */         }
/* 112 */         aqt aqt1 = aqg.a(☃, list, random, this.l.a + j, this.l.b + random.nextInt(k) + 1, this.l.c - 1, cq.c, i);
/* 113 */         if (aqt1 != null) {
/* 114 */           aqe aqe = aqt1.c();
/* 115 */           this.a.add(new aqe(aqe.a, aqe.b, this.l.c, aqe.d, aqe.e, this.l.c + 1));
/*     */         } 
/* 117 */         j += 4;
/*     */       } 
/*     */       
/* 120 */       j = 0;
/* 121 */       while (j < this.l.c()) {
/* 122 */         j += random.nextInt(this.l.c());
/* 123 */         if (j + 3 > this.l.c()) {
/*     */           break;
/*     */         }
/* 126 */         aqt aqt1 = aqg.a(☃, list, random, this.l.a + j, this.l.b + random.nextInt(k) + 1, this.l.f + 1, cq.d, i);
/* 127 */         if (aqt1 != null) {
/* 128 */           aqe aqe = aqt1.c();
/* 129 */           this.a.add(new aqe(aqe.a, aqe.b, this.l.f - 1, aqe.d, aqe.e, this.l.f));
/*     */         } 
/* 131 */         j += 4;
/*     */       } 
/*     */       
/* 134 */       j = 0;
/* 135 */       while (j < this.l.e()) {
/* 136 */         j += random.nextInt(this.l.e());
/* 137 */         if (j + 3 > this.l.e()) {
/*     */           break;
/*     */         }
/* 140 */         aqt aqt1 = aqg.a(☃, list, random, this.l.a - 1, this.l.b + random.nextInt(k) + 1, this.l.c + j, cq.e, i);
/* 141 */         if (aqt1 != null) {
/* 142 */           aqe aqe = aqt1.c();
/* 143 */           this.a.add(new aqe(this.l.a, aqe.b, aqe.c, this.l.a + 1, aqe.e, aqe.f));
/*     */         } 
/* 145 */         j += 4;
/*     */       } 
/*     */       
/* 148 */       j = 0;
/* 149 */       while (j < this.l.e()) {
/* 150 */         j += random.nextInt(this.l.e());
/* 151 */         if (j + 3 > this.l.e()) {
/*     */           break;
/*     */         }
/* 154 */         aqt aqt1 = aqg.a(☃, list, random, this.l.d + 1, this.l.b + random.nextInt(k) + 1, this.l.c + j, cq.f, i);
/* 155 */         if (aqt1 != null) {
/* 156 */           aqe aqe = aqt1.c();
/* 157 */           this.a.add(new aqe(this.l.d - 1, aqe.b, aqe.c, this.l.d, aqe.e, aqe.f));
/*     */         } 
/* 159 */         j += 4;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 165 */       if (a(☃, aqe1)) {
/* 166 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 170 */       a(☃, aqe1, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, afi.d.Q(), afi.a.Q(), true);
/*     */ 
/*     */       
/* 173 */       a(☃, aqe1, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, afi.a.Q(), afi.a.Q(), false);
/* 174 */       for (Iterator<aqe> iterator = this.a.iterator(); iterator.hasNext(); ) { aqe aqe2 = iterator.next();
/* 175 */         a(☃, aqe1, aqe2.a, aqe2.e - 2, aqe2.c, aqe2.d, aqe2.e, aqe2.f, afi.a.Q(), afi.a.Q(), false); }
/*     */       
/* 177 */       a(☃, aqe1, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, afi.a.Q(), false);
/*     */       
/* 179 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i, int j) {
/* 184 */       super.a(☃, i, j);
/* 185 */       for (Iterator<aqe> iterator = this.a.iterator(); iterator.hasNext(); ) { aqe aqe = iterator.next();
/* 186 */         aqe.a(☃, i, j); }
/*     */     
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dn ☃) {
/* 192 */       du du = new du();
/* 193 */       for (Iterator<aqe> iterator = this.a.iterator(); iterator.hasNext(); ) { aqe aqe = iterator.next();
/* 194 */         du.a(aqe.g()); }
/*     */       
/* 196 */       ☃.a("Entrances", du);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/* 201 */       du du = ☃.c("Entrances", 11);
/* 202 */       for (int i = 0; i < du.c(); i++) {
/* 203 */         this.a.add(new aqe(du.c(i)));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends aqt
/*     */   {
/*     */     private boolean a;
/*     */     private boolean b;
/*     */     private boolean c;
/*     */     private int d;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     protected void a(dn ☃) {
/* 220 */       ☃.a("hr", this.a);
/* 221 */       ☃.a("sc", this.b);
/* 222 */       ☃.a("hps", this.c);
/* 223 */       ☃.a("Num", this.d);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/* 228 */       this.a = ☃.n("hr");
/* 229 */       this.b = ☃.n("sc");
/* 230 */       this.c = ☃.n("hps");
/* 231 */       this.d = ☃.f("Num");
/*     */     }
/*     */     
/*     */     public a(int ☃, Random random, aqe aqe1, cq cq1) {
/* 235 */       super(☃);
/* 236 */       this.m = cq1;
/* 237 */       this.l = aqe1;
/* 238 */       this.a = (random.nextInt(3) == 0);
/* 239 */       this.b = (!this.a && random.nextInt(23) == 0);
/*     */       
/* 241 */       if (this.m == cq.c || this.m == cq.d) {
/* 242 */         this.d = aqe1.e() / 5;
/*     */       } else {
/* 244 */         this.d = aqe1.c() / 5;
/*     */       } 
/*     */     }
/*     */     
/*     */     public static aqe a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1) {
/* 249 */       aqe aqe = new aqe(i, j, k, i, j + 2, k);
/*     */       
/* 251 */       int m = random.nextInt(3) + 2;
/* 252 */       while (m > 0) {
/* 253 */         int n = m * 5;
/*     */         
/* 255 */         switch (aqg.null.a[cq1.ordinal()]) {
/*     */           case 1:
/* 257 */             aqe.d = i + 2;
/* 258 */             aqe.c = k - n - 1;
/*     */             break;
/*     */           case 2:
/* 261 */             aqe.d = i + 2;
/* 262 */             aqe.f = k + n - 1;
/*     */             break;
/*     */           case 3:
/* 265 */             aqe.a = i - n - 1;
/* 266 */             aqe.f = k + 2;
/*     */             break;
/*     */           case 4:
/* 269 */             aqe.d = i + n - 1;
/* 270 */             aqe.f = k + 2;
/*     */             break;
/*     */         } 
/*     */         
/* 274 */         if (aqt.a(☃, aqe) != null) {
/* 275 */           m--;
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 281 */       if (m > 0) {
/* 282 */         return aqe;
/*     */       }
/*     */       
/* 285 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 290 */       int i = d();
/* 291 */       int j = random.nextInt(4);
/* 292 */       if (this.m != null) {
/* 293 */         switch (aqg.null.a[this.m.ordinal()]) {
/*     */           case 1:
/* 295 */             if (j <= 1) {
/* 296 */               aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, this.m, i); break;
/* 297 */             }  if (j == 2) {
/* 298 */               aqg.a(☃, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, cq.e, i); break;
/*     */             } 
/* 300 */             aqg.a(☃, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, cq.f, i);
/*     */             break;
/*     */           
/*     */           case 2:
/* 304 */             if (j <= 1) {
/* 305 */               aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, this.m, i); break;
/* 306 */             }  if (j == 2) {
/* 307 */               aqg.a(☃, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cq.e, i); break;
/*     */             } 
/* 309 */             aqg.a(☃, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cq.f, i);
/*     */             break;
/*     */           
/*     */           case 3:
/* 313 */             if (j <= 1) {
/* 314 */               aqg.a(☃, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, this.m, i); break;
/* 315 */             }  if (j == 2) {
/* 316 */               aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cq.c, i); break;
/*     */             } 
/* 318 */             aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cq.d, i);
/*     */             break;
/*     */           
/*     */           case 4:
/* 322 */             if (j <= 1) {
/* 323 */               aqg.a(☃, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, this.m, i); break;
/* 324 */             }  if (j == 2) {
/* 325 */               aqg.a(☃, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cq.c, i); break;
/*     */             } 
/* 327 */             aqg.a(☃, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cq.d, i);
/*     */             break;
/*     */         } 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 334 */       if (i < 8) {
/* 335 */         if (this.m == cq.c || this.m == cq.d) {
/* 336 */           for (int k = this.l.c + 3; k + 3 <= this.l.f; k += 5) {
/* 337 */             int m = random.nextInt(5);
/* 338 */             if (m == 0) {
/* 339 */               aqg.a(☃, list, random, this.l.a - 1, this.l.b, k, cq.e, i + 1);
/* 340 */             } else if (m == 1) {
/* 341 */               aqg.a(☃, list, random, this.l.d + 1, this.l.b, k, cq.f, i + 1);
/*     */             } 
/*     */           } 
/*     */         } else {
/* 345 */           for (int k = this.l.a + 3; k + 3 <= this.l.d; k += 5) {
/* 346 */             int m = random.nextInt(5);
/* 347 */             if (m == 0) {
/* 348 */               aqg.a(☃, list, random, k, this.l.b, this.l.c - 1, cq.c, i + 1);
/* 349 */             } else if (m == 1) {
/* 350 */               aqg.a(☃, list, random, k, this.l.b, this.l.f + 1, cq.d, i + 1);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(adm ☃, aqe aqe1, Random random, int i, int j, int k, List<ob> list, int m) {
/* 359 */       cj cj = new cj(a(i, k), d(j), b(i, k));
/* 360 */       if (aqe1.b(cj) && 
/* 361 */         ☃.p(cj).c().t() == arm.a) {
/* 362 */         int n = random.nextBoolean() ? 1 : 0;
/* 363 */         ☃.a(cj, afi.av.a(a(afi.av, n)), 2);
/* 364 */         vb vb = new vb(☃, (cj.n() + 0.5F), (cj.o() + 0.5F), (cj.p() + 0.5F));
/* 365 */         ob.a(random, list, vb, m);
/* 366 */         ☃.d(vb);
/* 367 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 371 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 376 */       if (a(☃, aqe1)) {
/* 377 */         return false;
/*     */       }
/*     */       
/* 380 */       int i = 0;
/* 381 */       int j = 2;
/* 382 */       int k = 0;
/* 383 */       int m = 2;
/* 384 */       int n = this.d * 5 - 1;
/*     */ 
/*     */       
/* 387 */       a(☃, aqe1, 0, 0, 0, 2, 1, n, afi.a.Q(), afi.a.Q(), false);
/* 388 */       a(☃, aqe1, random, 0.8F, 0, 2, 0, 2, 2, n, afi.a.Q(), afi.a.Q(), false);
/*     */       
/* 390 */       if (this.b) {
/* 391 */         a(☃, aqe1, random, 0.6F, 0, 0, 0, 2, 1, n, afi.G.Q(), afi.a.Q(), false);
/*     */       }
/*     */       
/*     */       int i1;
/* 395 */       for (i1 = 0; i1 < this.d; i1++) {
/* 396 */         int i2 = 2 + i1 * 5;
/*     */         
/* 398 */         a(☃, aqe1, 0, 0, i2, 0, 1, i2, afi.aO.Q(), afi.a.Q(), false);
/* 399 */         a(☃, aqe1, 2, 0, i2, 2, 1, i2, afi.aO.Q(), afi.a.Q(), false);
/* 400 */         if (random.nextInt(4) == 0) {
/* 401 */           a(☃, aqe1, 0, 2, i2, 0, 2, i2, afi.f.Q(), afi.a.Q(), false);
/* 402 */           a(☃, aqe1, 2, 2, i2, 2, 2, i2, afi.f.Q(), afi.a.Q(), false);
/*     */         } else {
/* 404 */           a(☃, aqe1, 0, 2, i2, 2, 2, i2, afi.f.Q(), afi.a.Q(), false);
/*     */         } 
/* 406 */         a(☃, aqe1, random, 0.1F, 0, 2, i2 - 1, afi.G.Q());
/* 407 */         a(☃, aqe1, random, 0.1F, 2, 2, i2 - 1, afi.G.Q());
/* 408 */         a(☃, aqe1, random, 0.1F, 0, 2, i2 + 1, afi.G.Q());
/* 409 */         a(☃, aqe1, random, 0.1F, 2, 2, i2 + 1, afi.G.Q());
/* 410 */         a(☃, aqe1, random, 0.05F, 0, 2, i2 - 2, afi.G.Q());
/* 411 */         a(☃, aqe1, random, 0.05F, 2, 2, i2 - 2, afi.G.Q());
/* 412 */         a(☃, aqe1, random, 0.05F, 0, 2, i2 + 2, afi.G.Q());
/* 413 */         a(☃, aqe1, random, 0.05F, 2, 2, i2 + 2, afi.G.Q());
/*     */         
/* 415 */         a(☃, aqe1, random, 0.05F, 1, 2, i2 - 1, afi.aa.a(cq.b.a()));
/* 416 */         a(☃, aqe1, random, 0.05F, 1, 2, i2 + 1, afi.aa.a(cq.b.a()));
/*     */         
/* 418 */         if (random.nextInt(100) == 0) {
/* 419 */           a(☃, aqe1, random, 2, 0, i2 - 1, ob.a(aqg.b(), new ob[] { zy.cd.b(random) }), 3 + random.nextInt(4));
/*     */         }
/* 421 */         if (random.nextInt(100) == 0) {
/* 422 */           a(☃, aqe1, random, 0, 0, i2 + 1, ob.a(aqg.b(), new ob[] { zy.cd.b(random) }), 3 + random.nextInt(4));
/*     */         }
/* 424 */         if (this.b && !this.c) {
/* 425 */           int i3 = d(0), i4 = i2 - 1 + random.nextInt(3);
/* 426 */           int i5 = a(1, i4);
/* 427 */           i4 = b(1, i4);
/* 428 */           cj cj = new cj(i5, i3, i4);
/* 429 */           if (aqe1.b(cj)) {
/* 430 */             this.c = true;
/* 431 */             ☃.a(cj, afi.ac.Q(), 2);
/*     */             
/* 433 */             akw akw = ☃.s(cj);
/* 434 */             if (akw instanceof all) {
/* 435 */               ((all)akw).b().a("CaveSpider");
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 442 */       for (i1 = 0; i1 <= 2; i1++) {
/* 443 */         for (int i2 = 0; i2 <= n; i2++) {
/* 444 */           int i3 = -1;
/* 445 */           alz alz = a(☃, i1, i3, i2, aqe1);
/* 446 */           if (alz.c().t() == arm.a) {
/* 447 */             int i4 = -1;
/* 448 */             a(☃, afi.f.Q(), i1, i4, i2, aqe1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 453 */       if (this.a) {
/* 454 */         for (i1 = 0; i1 <= n; i1++) {
/* 455 */           alz alz = a(☃, 1, -1, i1, aqe1);
/* 456 */           if (alz.c().t() != arm.a && alz.c().o()) {
/* 457 */             a(☃, aqe1, random, 0.7F, 1, 0, i1, afi.av.a(a(afi.av, 0)));
/*     */           }
/*     */         } 
/*     */       }
/*     */       
/* 462 */       return true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class b
/*     */     extends aqt
/*     */   {
/*     */     private cq a;
/*     */     private boolean b;
/*     */     
/*     */     public b() {}
/*     */     
/*     */     protected void a(dn ☃) {
/* 476 */       ☃.a("tf", this.b);
/* 477 */       ☃.a("D", this.a.b());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/* 482 */       this.b = ☃.n("tf");
/* 483 */       this.a = cq.b(☃.f("D"));
/*     */     }
/*     */     
/*     */     public b(int ☃, Random random, aqe aqe1, cq cq1) {
/* 487 */       super(☃);
/*     */       
/* 489 */       this.a = cq1;
/* 490 */       this.l = aqe1;
/* 491 */       this.b = (aqe1.d() > 3);
/*     */     }
/*     */     
/*     */     public static aqe a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1) {
/* 495 */       aqe aqe = new aqe(i, j, k, i, j + 2, k);
/*     */       
/* 497 */       if (random.nextInt(4) == 0) {
/* 498 */         aqe.e += 4;
/*     */       }
/*     */       
/* 501 */       switch (aqg.null.a[cq1.ordinal()]) {
/*     */         case 1:
/* 503 */           aqe.a = i - 1;
/* 504 */           aqe.d = i + 3;
/* 505 */           aqe.c = k - 4;
/*     */           break;
/*     */         case 2:
/* 508 */           aqe.a = i - 1;
/* 509 */           aqe.d = i + 3;
/* 510 */           aqe.f = k + 4;
/*     */           break;
/*     */         case 3:
/* 513 */           aqe.a = i - 4;
/* 514 */           aqe.c = k - 1;
/* 515 */           aqe.f = k + 3;
/*     */           break;
/*     */         case 4:
/* 518 */           aqe.d = i + 4;
/* 519 */           aqe.c = k - 1;
/* 520 */           aqe.f = k + 3;
/*     */           break;
/*     */       } 
/*     */       
/* 524 */       if (aqt.a(☃, aqe) != null) {
/* 525 */         return null;
/*     */       }
/*     */       
/* 528 */       return aqe;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 533 */       int i = d();
/*     */ 
/*     */       
/* 536 */       switch (aqg.null.a[this.a.ordinal()]) {
/*     */         case 1:
/* 538 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, i);
/* 539 */           aqg.a(☃, list, random, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, i);
/* 540 */           aqg.a(☃, list, random, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, i);
/*     */           break;
/*     */         case 2:
/* 543 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, i);
/* 544 */           aqg.a(☃, list, random, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, i);
/* 545 */           aqg.a(☃, list, random, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, i);
/*     */           break;
/*     */         case 3:
/* 548 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, i);
/* 549 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, i);
/* 550 */           aqg.a(☃, list, random, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, i);
/*     */           break;
/*     */         case 4:
/* 553 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, i);
/* 554 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, i);
/* 555 */           aqg.a(☃, list, random, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, i);
/*     */           break;
/*     */       } 
/*     */       
/* 559 */       if (this.b) {
/* 560 */         if (random.nextBoolean()) {
/* 561 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, cq.c, i);
/*     */         }
/* 563 */         if (random.nextBoolean()) {
/* 564 */           aqg.a(☃, list, random, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, cq.e, i);
/*     */         }
/* 566 */         if (random.nextBoolean()) {
/* 567 */           aqg.a(☃, list, random, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, cq.f, i);
/*     */         }
/* 569 */         if (random.nextBoolean()) {
/* 570 */           aqg.a(☃, list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, cq.d, i);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 577 */       if (a(☃, aqe1)) {
/* 578 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 582 */       if (this.b) {
/* 583 */         a(☃, aqe1, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, afi.a.Q(), afi.a.Q(), false);
/* 584 */         a(☃, aqe1, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
/* 585 */         a(☃, aqe1, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
/* 586 */         a(☃, aqe1, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
/* 587 */         a(☃, aqe1, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
/*     */       } else {
/* 589 */         a(☃, aqe1, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
/* 590 */         a(☃, aqe1, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
/*     */       } 
/*     */ 
/*     */       
/* 594 */       a(☃, aqe1, this.l.a + 1, this.l.b, this.l.c + 1, this.l.a + 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
/* 595 */       a(☃, aqe1, this.l.a + 1, this.l.b, this.l.f - 1, this.l.a + 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
/* 596 */       a(☃, aqe1, this.l.d - 1, this.l.b, this.l.c + 1, this.l.d - 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
/* 597 */       a(☃, aqe1, this.l.d - 1, this.l.b, this.l.f - 1, this.l.d - 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
/*     */ 
/*     */ 
/*     */       
/* 601 */       for (int i = this.l.a; i <= this.l.d; i++) {
/* 602 */         for (int j = this.l.c; j <= this.l.f; j++) {
/* 603 */           if (a(☃, i, this.l.b - 1, j, aqe1).c().t() == arm.a) {
/* 604 */             a(☃, afi.f.Q(), i, this.l.b - 1, j, aqe1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 609 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class d
/*     */     extends aqt
/*     */   {
/*     */     public d() {}
/*     */     
/*     */     public d(int ☃, Random random, aqe aqe1, cq cq1) {
/* 619 */       super(☃);
/* 620 */       this.m = cq1;
/* 621 */       this.l = aqe1;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected void a(dn ☃) {}
/*     */ 
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {}
/*     */ 
/*     */     
/*     */     public static aqe a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1) {
/* 634 */       aqe aqe = new aqe(i, j - 5, k, i, j + 2, k);
/*     */       
/* 636 */       switch (aqg.null.a[cq1.ordinal()]) {
/*     */         case 1:
/* 638 */           aqe.d = i + 2;
/* 639 */           aqe.c = k - 8;
/*     */           break;
/*     */         case 2:
/* 642 */           aqe.d = i + 2;
/* 643 */           aqe.f = k + 8;
/*     */           break;
/*     */         case 3:
/* 646 */           aqe.a = i - 8;
/* 647 */           aqe.f = k + 2;
/*     */           break;
/*     */         case 4:
/* 650 */           aqe.d = i + 8;
/* 651 */           aqe.f = k + 2;
/*     */           break;
/*     */       } 
/*     */       
/* 655 */       if (aqt.a(☃, aqe) != null) {
/* 656 */         return null;
/*     */       }
/*     */       
/* 659 */       return aqe;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 664 */       int i = d();
/*     */ 
/*     */       
/* 667 */       if (this.m != null) {
/* 668 */         switch (aqg.null.a[this.m.ordinal()]) {
/*     */           case 1:
/* 670 */             aqg.a(☃, list, random, this.l.a, this.l.b, this.l.c - 1, cq.c, i);
/*     */             break;
/*     */           case 2:
/* 673 */             aqg.a(☃, list, random, this.l.a, this.l.b, this.l.f + 1, cq.d, i);
/*     */             break;
/*     */           case 3:
/* 676 */             aqg.a(☃, list, random, this.l.a - 1, this.l.b, this.l.c, cq.e, i);
/*     */             break;
/*     */           case 4:
/* 679 */             aqg.a(☃, list, random, this.l.d + 1, this.l.b, this.l.c, cq.f, i);
/*     */             break;
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 687 */       if (a(☃, aqe1)) {
/* 688 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 692 */       a(☃, aqe1, 0, 5, 0, 2, 7, 1, afi.a.Q(), afi.a.Q(), false);
/*     */       
/* 694 */       a(☃, aqe1, 0, 0, 7, 2, 2, 8, afi.a.Q(), afi.a.Q(), false);
/*     */       
/* 696 */       for (int i = 0; i < 5; i++) {
/* 697 */         a(☃, aqe1, 0, 5 - i - ((i < 4) ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, afi.a.Q(), afi.a.Q(), false);
/*     */       }
/*     */       
/* 700 */       return true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/* 705 */   private static final List<ob> a = Lists.newArrayList((Object[])new ob[] { new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.aW, zd.l.b(), 4, 9, 5), new ob(zy.i, 0, 1, 2, 3), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1), new ob(zw.a(afi.av), 0, 4, 8, 1), new ob(zy.bh, 0, 2, 4, 10), new ob(zy.bg, 0, 2, 4, 10), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1) });
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */