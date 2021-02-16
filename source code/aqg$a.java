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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends aqt
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private int d;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   protected void a(dn ☃) {
/* 220 */     ☃.a("hr", this.a);
/* 221 */     ☃.a("sc", this.b);
/* 222 */     ☃.a("hps", this.c);
/* 223 */     ☃.a("Num", this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {
/* 228 */     this.a = ☃.n("hr");
/* 229 */     this.b = ☃.n("sc");
/* 230 */     this.c = ☃.n("hps");
/* 231 */     this.d = ☃.f("Num");
/*     */   }
/*     */   
/*     */   public a(int ☃, Random random, aqe aqe1, cq cq1) {
/* 235 */     super(☃);
/* 236 */     this.m = cq1;
/* 237 */     this.l = aqe1;
/* 238 */     this.a = (random.nextInt(3) == 0);
/* 239 */     this.b = (!this.a && random.nextInt(23) == 0);
/*     */     
/* 241 */     if (this.m == cq.c || this.m == cq.d) {
/* 242 */       this.d = aqe1.e() / 5;
/*     */     } else {
/* 244 */       this.d = aqe1.c() / 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static aqe a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1) {
/* 249 */     aqe aqe = new aqe(i, j, k, i, j + 2, k);
/*     */     
/* 251 */     int m = random.nextInt(3) + 2;
/* 252 */     while (m > 0) {
/* 253 */       int n = m * 5;
/*     */       
/* 255 */       switch (aqg.null.a[cq1.ordinal()]) {
/*     */         case 1:
/* 257 */           aqe.d = i + 2;
/* 258 */           aqe.c = k - n - 1;
/*     */           break;
/*     */         case 2:
/* 261 */           aqe.d = i + 2;
/* 262 */           aqe.f = k + n - 1;
/*     */           break;
/*     */         case 3:
/* 265 */           aqe.a = i - n - 1;
/* 266 */           aqe.f = k + 2;
/*     */           break;
/*     */         case 4:
/* 269 */           aqe.d = i + n - 1;
/* 270 */           aqe.f = k + 2;
/*     */           break;
/*     */       } 
/*     */       
/* 274 */       if (aqt.a(☃, aqe) != null) {
/* 275 */         m--;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 281 */     if (m > 0) {
/* 282 */       return aqe;
/*     */     }
/*     */     
/* 285 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqt ☃, List<aqt> list, Random random) {
/* 290 */     int i = d();
/* 291 */     int j = random.nextInt(4);
/* 292 */     if (this.m != null) {
/* 293 */       switch (aqg.null.a[this.m.ordinal()]) {
/*     */         case 1:
/* 295 */           if (j <= 1) {
/* 296 */             aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, this.m, i); break;
/* 297 */           }  if (j == 2) {
/* 298 */             aqg.a(☃, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, cq.e, i); break;
/*     */           } 
/* 300 */           aqg.a(☃, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, cq.f, i);
/*     */           break;
/*     */         
/*     */         case 2:
/* 304 */           if (j <= 1) {
/* 305 */             aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, this.m, i); break;
/* 306 */           }  if (j == 2) {
/* 307 */             aqg.a(☃, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cq.e, i); break;
/*     */           } 
/* 309 */           aqg.a(☃, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cq.f, i);
/*     */           break;
/*     */         
/*     */         case 3:
/* 313 */           if (j <= 1) {
/* 314 */             aqg.a(☃, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, this.m, i); break;
/* 315 */           }  if (j == 2) {
/* 316 */             aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cq.c, i); break;
/*     */           } 
/* 318 */           aqg.a(☃, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cq.d, i);
/*     */           break;
/*     */         
/*     */         case 4:
/* 322 */           if (j <= 1) {
/* 323 */             aqg.a(☃, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, this.m, i); break;
/* 324 */           }  if (j == 2) {
/* 325 */             aqg.a(☃, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cq.c, i); break;
/*     */           } 
/* 327 */           aqg.a(☃, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cq.d, i);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 334 */     if (i < 8) {
/* 335 */       if (this.m == cq.c || this.m == cq.d) {
/* 336 */         for (int k = this.l.c + 3; k + 3 <= this.l.f; k += 5) {
/* 337 */           int m = random.nextInt(5);
/* 338 */           if (m == 0) {
/* 339 */             aqg.a(☃, list, random, this.l.a - 1, this.l.b, k, cq.e, i + 1);
/* 340 */           } else if (m == 1) {
/* 341 */             aqg.a(☃, list, random, this.l.d + 1, this.l.b, k, cq.f, i + 1);
/*     */           } 
/*     */         } 
/*     */       } else {
/* 345 */         for (int k = this.l.a + 3; k + 3 <= this.l.d; k += 5) {
/* 346 */           int m = random.nextInt(5);
/* 347 */           if (m == 0) {
/* 348 */             aqg.a(☃, list, random, k, this.l.b, this.l.c - 1, cq.c, i + 1);
/* 349 */           } else if (m == 1) {
/* 350 */             aqg.a(☃, list, random, k, this.l.b, this.l.f + 1, cq.d, i + 1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(adm ☃, aqe aqe1, Random random, int i, int j, int k, List<ob> list, int m) {
/* 359 */     cj cj = new cj(a(i, k), d(j), b(i, k));
/* 360 */     if (aqe1.b(cj) && 
/* 361 */       ☃.p(cj).c().t() == arm.a) {
/* 362 */       int n = random.nextBoolean() ? 1 : 0;
/* 363 */       ☃.a(cj, afi.av.a(a(afi.av, n)), 2);
/* 364 */       vb vb = new vb(☃, (cj.n() + 0.5F), (cj.o() + 0.5F), (cj.p() + 0.5F));
/* 365 */       ob.a(random, list, vb, m);
/* 366 */       ☃.d(vb);
/* 367 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 371 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, aqe aqe1) {
/* 376 */     if (a(☃, aqe1)) {
/* 377 */       return false;
/*     */     }
/*     */     
/* 380 */     int i = 0;
/* 381 */     int j = 2;
/* 382 */     int k = 0;
/* 383 */     int m = 2;
/* 384 */     int n = this.d * 5 - 1;
/*     */ 
/*     */     
/* 387 */     a(☃, aqe1, 0, 0, 0, 2, 1, n, afi.a.Q(), afi.a.Q(), false);
/* 388 */     a(☃, aqe1, random, 0.8F, 0, 2, 0, 2, 2, n, afi.a.Q(), afi.a.Q(), false);
/*     */     
/* 390 */     if (this.b) {
/* 391 */       a(☃, aqe1, random, 0.6F, 0, 0, 0, 2, 1, n, afi.G.Q(), afi.a.Q(), false);
/*     */     }
/*     */     
/*     */     int i1;
/* 395 */     for (i1 = 0; i1 < this.d; i1++) {
/* 396 */       int i2 = 2 + i1 * 5;
/*     */       
/* 398 */       a(☃, aqe1, 0, 0, i2, 0, 1, i2, afi.aO.Q(), afi.a.Q(), false);
/* 399 */       a(☃, aqe1, 2, 0, i2, 2, 1, i2, afi.aO.Q(), afi.a.Q(), false);
/* 400 */       if (random.nextInt(4) == 0) {
/* 401 */         a(☃, aqe1, 0, 2, i2, 0, 2, i2, afi.f.Q(), afi.a.Q(), false);
/* 402 */         a(☃, aqe1, 2, 2, i2, 2, 2, i2, afi.f.Q(), afi.a.Q(), false);
/*     */       } else {
/* 404 */         a(☃, aqe1, 0, 2, i2, 2, 2, i2, afi.f.Q(), afi.a.Q(), false);
/*     */       } 
/* 406 */       a(☃, aqe1, random, 0.1F, 0, 2, i2 - 1, afi.G.Q());
/* 407 */       a(☃, aqe1, random, 0.1F, 2, 2, i2 - 1, afi.G.Q());
/* 408 */       a(☃, aqe1, random, 0.1F, 0, 2, i2 + 1, afi.G.Q());
/* 409 */       a(☃, aqe1, random, 0.1F, 2, 2, i2 + 1, afi.G.Q());
/* 410 */       a(☃, aqe1, random, 0.05F, 0, 2, i2 - 2, afi.G.Q());
/* 411 */       a(☃, aqe1, random, 0.05F, 2, 2, i2 - 2, afi.G.Q());
/* 412 */       a(☃, aqe1, random, 0.05F, 0, 2, i2 + 2, afi.G.Q());
/* 413 */       a(☃, aqe1, random, 0.05F, 2, 2, i2 + 2, afi.G.Q());
/*     */       
/* 415 */       a(☃, aqe1, random, 0.05F, 1, 2, i2 - 1, afi.aa.a(cq.b.a()));
/* 416 */       a(☃, aqe1, random, 0.05F, 1, 2, i2 + 1, afi.aa.a(cq.b.a()));
/*     */       
/* 418 */       if (random.nextInt(100) == 0) {
/* 419 */         a(☃, aqe1, random, 2, 0, i2 - 1, ob.a(aqg.b(), new ob[] { zy.cd.b(random) }), 3 + random.nextInt(4));
/*     */       }
/* 421 */       if (random.nextInt(100) == 0) {
/* 422 */         a(☃, aqe1, random, 0, 0, i2 + 1, ob.a(aqg.b(), new ob[] { zy.cd.b(random) }), 3 + random.nextInt(4));
/*     */       }
/* 424 */       if (this.b && !this.c) {
/* 425 */         int i3 = d(0), i4 = i2 - 1 + random.nextInt(3);
/* 426 */         int i5 = a(1, i4);
/* 427 */         i4 = b(1, i4);
/* 428 */         cj cj = new cj(i5, i3, i4);
/* 429 */         if (aqe1.b(cj)) {
/* 430 */           this.c = true;
/* 431 */           ☃.a(cj, afi.ac.Q(), 2);
/*     */           
/* 433 */           akw akw = ☃.s(cj);
/* 434 */           if (akw instanceof all) {
/* 435 */             ((all)akw).b().a("CaveSpider");
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 442 */     for (i1 = 0; i1 <= 2; i1++) {
/* 443 */       for (int i2 = 0; i2 <= n; i2++) {
/* 444 */         int i3 = -1;
/* 445 */         alz alz = a(☃, i1, i3, i2, aqe1);
/* 446 */         if (alz.c().t() == arm.a) {
/* 447 */           int i4 = -1;
/* 448 */           a(☃, afi.f.Q(), i1, i4, i2, aqe1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 453 */     if (this.a) {
/* 454 */       for (i1 = 0; i1 <= n; i1++) {
/* 455 */         alz alz = a(☃, 1, -1, i1, aqe1);
/* 456 */         if (alz.c().t() != arm.a && alz.c().o()) {
/* 457 */           a(☃, aqe1, random, 0.7F, 1, 0, i1, afi.av.a(a(afi.av, 0)));
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 462 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqg$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */