/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collections;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */   extends aql.r
/*     */ {
/*     */   private aql.v o;
/*     */   private aql.v p;
/* 234 */   private List<aql.r> q = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */   
/*     */   public h() {}
/*     */ 
/*     */   
/*     */   public h(Random ☃, int i, int j, cq cq1) {
/* 242 */     super(0);
/*     */     
/* 244 */     this.m = cq1;
/*     */     
/* 246 */     switch (aql.null.a[this.m.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 249 */         this.l = new aqe(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*     */         break;
/*     */       default:
/* 252 */         this.l = new aqe(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*     */         break;
/*     */     } 
/*     */     
/* 256 */     List<aql.v> list = a(☃);
/*     */     
/* 258 */     this.o.d = true;
/* 259 */     this.q.add(new aql.p(this.m, this.o));
/* 260 */     this.q.add(new aql.j(this.m, this.p, ☃));
/*     */     
/* 262 */     List<aql.i> list1 = Lists.newArrayList();
/* 263 */     list1.add(new aql.b(null));
/* 264 */     list1.add(new aql.d(null));
/* 265 */     list1.add(new aql.e(null));
/* 266 */     list1.add(new aql.a(null));
/* 267 */     list1.add(new aql.c(null));
/* 268 */     list1.add(new aql.g(null));
/* 269 */     list1.add(new aql.f(null));
/*     */     
/* 271 */     for (Iterator<aql.v> iterator = list.iterator(); iterator.hasNext(); ) { aql.v v1 = iterator.next();
/* 272 */       if (!v1.d && !v1.b())
/*     */       {
/* 274 */         for (Iterator<aql.i> iterator2 = list1.iterator(); iterator2.hasNext(); ) { aql.i i2 = iterator2.next();
/* 275 */           if (i2.a(v1)) {
/* 276 */             this.q.add(i2.a(this.m, v1, ☃));
/*     */           } }
/*     */       
/*     */       } }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     int k = this.l.b;
/* 285 */     int m = a(9, 22);
/* 286 */     int n = b(9, 22);
/* 287 */     for (Iterator<aql.r> iterator1 = this.q.iterator(); iterator1.hasNext(); ) { aql.r r1 = iterator1.next();
/* 288 */       r1.c().a(m, k, n); }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 293 */     aqe aqe1 = aqe.a(a(1, 1), d(1), b(1, 1), a(23, 21), d(8), b(23, 21));
/* 294 */     aqe aqe2 = aqe.a(a(34, 1), d(1), b(34, 1), a(56, 21), d(8), b(56, 21));
/* 295 */     aqe aqe3 = aqe.a(a(22, 22), d(13), b(22, 22), a(35, 35), d(17), b(35, 35));
/*     */ 
/*     */     
/* 298 */     int i1 = ☃.nextInt();
/* 299 */     this.q.add(new aql.u(this.m, aqe1, i1++));
/* 300 */     this.q.add(new aql.u(this.m, aqe2, i1++));
/*     */     
/* 302 */     this.q.add(new aql.q(this.m, aqe3));
/*     */   }
/*     */ 
/*     */   
/*     */   private List<aql.v> a(Random ☃) {
/* 307 */     aql.v[] arrayOfV1 = new aql.v[75];
/*     */     int i;
/* 309 */     for (i = 0; i < 5; i++) {
/* 310 */       for (int n = 0; n < 4; n++) {
/* 311 */         int i1 = 0;
/* 312 */         int i2 = b(i, i1, n);
/* 313 */         arrayOfV1[i2] = new aql.v(i2);
/*     */       } 
/*     */     } 
/* 316 */     for (i = 0; i < 5; i++) {
/* 317 */       for (int n = 0; n < 4; n++) {
/* 318 */         int i1 = 1;
/* 319 */         int i2 = b(i, i1, n);
/* 320 */         arrayOfV1[i2] = new aql.v(i2);
/*     */       } 
/*     */     } 
/* 323 */     for (i = 1; i < 4; i++) {
/* 324 */       for (int n = 0; n < 2; n++) {
/* 325 */         int i1 = 2;
/* 326 */         int i2 = b(i, i1, n);
/* 327 */         arrayOfV1[i2] = new aql.v(i2);
/*     */       } 
/*     */     } 
/*     */     
/* 331 */     this.o = arrayOfV1[g];
/*     */     
/* 333 */     for (i = 0; i < 5; i++) {
/* 334 */       for (int n = 0; n < 5; n++) {
/* 335 */         for (int i1 = 0; i1 < 3; i1++) {
/* 336 */           int i2 = b(i, i1, n);
/* 337 */           if (arrayOfV1[i2] != null) {
/*     */             cq[] arrayOfCq; int i3;
/*     */             int i4;
/* 340 */             for (arrayOfCq = cq.values(), i3 = arrayOfCq.length, i4 = 0; i4 < i3; ) { cq cq = arrayOfCq[i4];
/* 341 */               int i5 = i + cq.g();
/* 342 */               int i6 = i1 + cq.h();
/* 343 */               int i7 = n + cq.i();
/* 344 */               if (i5 >= 0 && i5 < 5 && i7 >= 0 && i7 < 5 && i6 >= 0 && i6 < 3) {
/* 345 */                 int i8 = b(i5, i6, i7);
/* 346 */                 if (arrayOfV1[i8] != null)
/*     */                 {
/*     */                   
/* 349 */                   if (i7 != n) {
/* 350 */                     arrayOfV1[i2].a(cq.d(), arrayOfV1[i8]);
/*     */                   } else {
/* 352 */                     arrayOfV1[i2].a(cq, arrayOfV1[i8]);
/*     */                   }  } 
/*     */               }  i4++; }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     aql.v v1;
/* 361 */     arrayOfV1[h].a(cq.b, v1 = new aql.v(1003)); aql.v v2;
/* 362 */     arrayOfV1[i].a(cq.d, v2 = new aql.v(1001)); aql.v v3;
/* 363 */     arrayOfV1[j].a(cq.d, v3 = new aql.v(1002));
/* 364 */     v1.d = true;
/* 365 */     v2.d = true;
/* 366 */     v3.d = true;
/* 367 */     this.o.e = true;
/*     */ 
/*     */     
/* 370 */     this.p = arrayOfV1[b(☃.nextInt(4), 0, 2)];
/* 371 */     this.p.d = true;
/* 372 */     (this.p.b[cq.f.a()]).d = true;
/* 373 */     (this.p.b[cq.c.a()]).d = true;
/* 374 */     ((this.p.b[cq.f.a()]).b[cq.c.a()]).d = true;
/* 375 */     (this.p.b[cq.b.a()]).d = true;
/* 376 */     ((this.p.b[cq.f.a()]).b[cq.b.a()]).d = true;
/* 377 */     ((this.p.b[cq.c.a()]).b[cq.b.a()]).d = true;
/* 378 */     (((this.p.b[cq.f.a()]).b[cq.c.a()]).b[cq.b.a()]).d = true;
/*     */     
/* 380 */     List<aql.v> list = Lists.newArrayList(); aql.v[] arrayOfV2; int k, m;
/* 381 */     for (arrayOfV2 = arrayOfV1, k = arrayOfV2.length, m = 0; m < k; ) { aql.v v4 = arrayOfV2[m];
/* 382 */       if (v4 != null) {
/* 383 */         v4.a();
/* 384 */         list.add(v4);
/*     */       }  m++; }
/*     */     
/* 387 */     v1.a();
/*     */     
/* 389 */     Collections.shuffle(list, ☃);
/* 390 */     int j = 1;
/* 391 */     for (Iterator<aql.v> iterator = list.iterator(); iterator.hasNext(); ) { aql.v v4 = iterator.next();
/*     */       
/* 393 */       int n = 0;
/* 394 */       int i1 = 0;
/* 395 */       while (n < 2 && i1 < 5) {
/* 396 */         i1++;
/*     */         
/* 398 */         int i2 = ☃.nextInt(6);
/* 399 */         if (v4.c[i2]) {
/* 400 */           int i3 = cq.a(i2).d().a();
/*     */ 
/*     */           
/* 403 */           v4.c[i2] = false;
/* 404 */           (v4.b[i2]).c[i3] = false;
/*     */           
/* 406 */           if (v4.a(j++) && v4.b[i2].a(j++)) {
/* 407 */             n++;
/*     */             continue;
/*     */           } 
/* 410 */           v4.c[i2] = true;
/* 411 */           (v4.b[i2]).c[i3] = true;
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/* 416 */     list.add(v1);
/* 417 */     list.add(v2);
/* 418 */     list.add(v3);
/*     */     
/* 420 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, aqe aqe1) {
/* 426 */     int i = Math.max(☃.F(), 64) - this.l.b;
/*     */     
/* 428 */     a(☃, aqe1, 0, 0, 0, 58, i, 58, false);
/*     */ 
/*     */     
/* 431 */     a(false, 0, ☃, random, aqe1);
/*     */ 
/*     */     
/* 434 */     a(true, 33, ☃, random, aqe1);
/*     */ 
/*     */     
/* 437 */     b(☃, random, aqe1);
/*     */     
/* 439 */     c(☃, random, aqe1);
/* 440 */     d(☃, random, aqe1);
/*     */     
/* 442 */     e(☃, random, aqe1);
/* 443 */     f(☃, random, aqe1);
/* 444 */     g(☃, random, aqe1);
/*     */     
/*     */     int j;
/* 447 */     for (j = 0; j < 7; j++) {
/* 448 */       for (int k = 0; k < 7; ) {
/* 449 */         if (k == 0 && j == 3)
/*     */         {
/* 451 */           k = 6;
/*     */         }
/*     */         
/* 454 */         int m = j * 9;
/* 455 */         int n = k * 9;
/* 456 */         for (int i1 = 0; i1 < 4; i1++) {
/* 457 */           for (int i2 = 0; i2 < 4; i2++) {
/* 458 */             a(☃, b, m + i1, 0, n + i2, aqe1);
/* 459 */             b(☃, b, m + i1, -1, n + i2, aqe1);
/*     */           } 
/*     */         } 
/*     */         
/* 463 */         if (j == 0 || j == 6) {
/* 464 */           k++; continue;
/*     */         } 
/* 466 */         k += 6;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 472 */     for (j = 0; j < 5; j++) {
/* 473 */       a(☃, aqe1, -1 - j, 0 + j * 2, -1 - j, -1 - j, 23, 58 + j, false);
/* 474 */       a(☃, aqe1, 58 + j, 0 + j * 2, -1 - j, 58 + j, 23, 58 + j, false);
/* 475 */       a(☃, aqe1, 0 - j, 0 + j * 2, -1 - j, 57 + j, 23, -1 - j, false);
/* 476 */       a(☃, aqe1, 0 - j, 0 + j * 2, 58 + j, 57 + j, 23, 58 + j, false);
/*     */     } 
/*     */     
/* 479 */     for (Iterator<aql.r> iterator = this.q.iterator(); iterator.hasNext(); ) { aql.r r1 = iterator.next();
/* 480 */       if (r1.c().a(aqe1)) {
/* 481 */         r1.a(☃, random, aqe1);
/*     */       } }
/*     */ 
/*     */     
/* 485 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(boolean ☃, int i, adm adm1, Random random, aqe aqe1) {
/* 490 */     int j = 24;
/* 491 */     if (a(aqe1, i, 0, i + 23, 20)) {
/* 492 */       a(adm1, aqe1, i + 0, 0, 0, i + 24, 0, 20, a, a, false);
/*     */       
/* 494 */       a(adm1, aqe1, i + 0, 1, 0, i + 24, 10, 20, false);
/*     */       int k;
/* 496 */       for (k = 0; k < 4; k++) {
/* 497 */         a(adm1, aqe1, i + k, k + 1, k, i + k, k + 1, 20, b, b, false);
/* 498 */         a(adm1, aqe1, i + k + 7, k + 5, k + 7, i + k + 7, k + 5, 20, b, b, false);
/* 499 */         a(adm1, aqe1, i + 17 - k, k + 5, k + 7, i + 17 - k, k + 5, 20, b, b, false);
/* 500 */         a(adm1, aqe1, i + 24 - k, k + 1, k, i + 24 - k, k + 1, 20, b, b, false);
/*     */         
/* 502 */         a(adm1, aqe1, i + k + 1, k + 1, k, i + 23 - k, k + 1, k, b, b, false);
/* 503 */         a(adm1, aqe1, i + k + 8, k + 5, k + 7, i + 16 - k, k + 5, k + 7, b, b, false);
/*     */       } 
/* 505 */       a(adm1, aqe1, i + 4, 4, 4, i + 6, 4, 20, a, a, false);
/* 506 */       a(adm1, aqe1, i + 7, 4, 4, i + 17, 4, 6, a, a, false);
/* 507 */       a(adm1, aqe1, i + 18, 4, 4, i + 20, 4, 20, a, a, false);
/* 508 */       a(adm1, aqe1, i + 11, 8, 11, i + 13, 8, 20, a, a, false);
/* 509 */       a(adm1, d, i + 12, 9, 12, aqe1);
/* 510 */       a(adm1, d, i + 12, 9, 15, aqe1);
/* 511 */       a(adm1, d, i + 12, 9, 18, aqe1);
/*     */       
/* 513 */       k = ☃ ? (i + 19) : (i + 5);
/* 514 */       int m = ☃ ? (i + 5) : (i + 19); int n;
/* 515 */       for (n = 20; n >= 5; n -= 3) {
/* 516 */         a(adm1, d, k, 5, n, aqe1);
/*     */       }
/* 518 */       for (n = 19; n >= 7; n -= 3) {
/* 519 */         a(adm1, d, m, 5, n, aqe1);
/*     */       }
/* 521 */       for (n = 0; n < 4; n++) {
/* 522 */         int i1 = ☃ ? (i + 24 - 17 - n * 3) : (i + 17 - n * 3);
/* 523 */         a(adm1, d, i1, 5, 5, aqe1);
/*     */       } 
/* 525 */       a(adm1, d, m, 5, 5, aqe1);
/*     */ 
/*     */       
/* 528 */       a(adm1, aqe1, i + 11, 1, 12, i + 13, 7, 12, a, a, false);
/* 529 */       a(adm1, aqe1, i + 12, 1, 11, i + 12, 7, 13, a, a, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(adm ☃, Random random, aqe aqe1) {
/* 535 */     if (a(aqe1, 22, 5, 35, 17)) {
/*     */       
/* 537 */       a(☃, aqe1, 25, 0, 0, 32, 8, 20, false);
/*     */ 
/*     */       
/* 540 */       for (int i = 0; i < 4; i++) {
/* 541 */         a(☃, aqe1, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, b, b, false);
/* 542 */         a(☃, aqe1, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, b, b, false);
/* 543 */         a(☃, b, 25, 5, 5 + i * 4, aqe1);
/* 544 */         a(☃, b, 26, 6, 5 + i * 4, aqe1);
/* 545 */         a(☃, e, 26, 5, 5 + i * 4, aqe1);
/*     */         
/* 547 */         a(☃, aqe1, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, b, b, false);
/* 548 */         a(☃, aqe1, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, b, b, false);
/* 549 */         a(☃, b, 32, 5, 5 + i * 4, aqe1);
/* 550 */         a(☃, b, 31, 6, 5 + i * 4, aqe1);
/* 551 */         a(☃, e, 31, 5, 5 + i * 4, aqe1);
/*     */         
/* 553 */         a(☃, aqe1, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, a, a, false);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void c(adm ☃, Random random, aqe aqe1) {
/* 561 */     if (a(aqe1, 15, 20, 42, 21)) {
/* 562 */       a(☃, aqe1, 15, 0, 21, 42, 0, 21, a, a, false);
/*     */       
/* 564 */       a(☃, aqe1, 26, 1, 21, 31, 3, 21, false);
/*     */ 
/*     */ 
/*     */       
/* 568 */       a(☃, aqe1, 21, 12, 21, 36, 12, 21, a, a, false);
/* 569 */       a(☃, aqe1, 17, 11, 21, 40, 11, 21, a, a, false);
/* 570 */       a(☃, aqe1, 16, 10, 21, 41, 10, 21, a, a, false);
/* 571 */       a(☃, aqe1, 15, 7, 21, 42, 9, 21, a, a, false);
/* 572 */       a(☃, aqe1, 16, 6, 21, 41, 6, 21, a, a, false);
/* 573 */       a(☃, aqe1, 17, 5, 21, 40, 5, 21, a, a, false);
/* 574 */       a(☃, aqe1, 21, 4, 21, 36, 4, 21, a, a, false);
/* 575 */       a(☃, aqe1, 22, 3, 21, 26, 3, 21, a, a, false);
/* 576 */       a(☃, aqe1, 31, 3, 21, 35, 3, 21, a, a, false);
/* 577 */       a(☃, aqe1, 23, 2, 21, 25, 2, 21, a, a, false);
/* 578 */       a(☃, aqe1, 32, 2, 21, 34, 2, 21, a, a, false);
/*     */ 
/*     */       
/* 581 */       a(☃, aqe1, 28, 4, 20, 29, 4, 21, b, b, false);
/* 582 */       a(☃, b, 27, 3, 21, aqe1);
/* 583 */       a(☃, b, 30, 3, 21, aqe1);
/* 584 */       a(☃, b, 26, 2, 21, aqe1);
/* 585 */       a(☃, b, 31, 2, 21, aqe1);
/* 586 */       a(☃, b, 25, 1, 21, aqe1);
/* 587 */       a(☃, b, 32, 1, 21, aqe1); int i;
/* 588 */       for (i = 0; i < 7; i++) {
/* 589 */         a(☃, c, 28 - i, 6 + i, 21, aqe1);
/* 590 */         a(☃, c, 29 + i, 6 + i, 21, aqe1);
/*     */       } 
/* 592 */       for (i = 0; i < 4; i++) {
/* 593 */         a(☃, c, 28 - i, 9 + i, 21, aqe1);
/* 594 */         a(☃, c, 29 + i, 9 + i, 21, aqe1);
/*     */       } 
/* 596 */       a(☃, c, 28, 12, 21, aqe1);
/* 597 */       a(☃, c, 29, 12, 21, aqe1);
/* 598 */       for (i = 0; i < 3; i++) {
/* 599 */         a(☃, c, 22 - i * 2, 8, 21, aqe1);
/* 600 */         a(☃, c, 22 - i * 2, 9, 21, aqe1);
/*     */         
/* 602 */         a(☃, c, 35 + i * 2, 8, 21, aqe1);
/* 603 */         a(☃, c, 35 + i * 2, 9, 21, aqe1);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 608 */       a(☃, aqe1, 15, 13, 21, 42, 15, 21, false);
/* 609 */       a(☃, aqe1, 15, 1, 21, 15, 6, 21, false);
/* 610 */       a(☃, aqe1, 16, 1, 21, 16, 5, 21, false);
/* 611 */       a(☃, aqe1, 17, 1, 21, 20, 4, 21, false);
/* 612 */       a(☃, aqe1, 21, 1, 21, 21, 3, 21, false);
/* 613 */       a(☃, aqe1, 22, 1, 21, 22, 2, 21, false);
/* 614 */       a(☃, aqe1, 23, 1, 21, 24, 1, 21, false);
/* 615 */       a(☃, aqe1, 42, 1, 21, 42, 6, 21, false);
/* 616 */       a(☃, aqe1, 41, 1, 21, 41, 5, 21, false);
/* 617 */       a(☃, aqe1, 37, 1, 21, 40, 4, 21, false);
/* 618 */       a(☃, aqe1, 36, 1, 21, 36, 3, 21, false);
/* 619 */       a(☃, aqe1, 33, 1, 21, 34, 1, 21, false);
/* 620 */       a(☃, aqe1, 35, 1, 21, 35, 2, 21, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void d(adm ☃, Random random, aqe aqe1) {
/* 628 */     if (a(aqe1, 21, 21, 36, 36)) {
/* 629 */       a(☃, aqe1, 21, 0, 22, 36, 0, 36, a, a, false);
/*     */ 
/*     */ 
/*     */       
/* 633 */       a(☃, aqe1, 21, 1, 22, 36, 23, 36, false);
/*     */ 
/*     */       
/* 636 */       for (int i = 0; i < 4; i++) {
/* 637 */         a(☃, aqe1, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, b, b, false);
/* 638 */         a(☃, aqe1, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, b, b, false);
/* 639 */         a(☃, aqe1, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, b, b, false);
/* 640 */         a(☃, aqe1, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, b, b, false);
/*     */       } 
/* 642 */       a(☃, aqe1, 25, 16, 25, 32, 16, 32, a, a, false);
/* 643 */       a(☃, aqe1, 25, 17, 25, 25, 19, 25, b, b, false);
/* 644 */       a(☃, aqe1, 32, 17, 25, 32, 19, 25, b, b, false);
/* 645 */       a(☃, aqe1, 25, 17, 32, 25, 19, 32, b, b, false);
/* 646 */       a(☃, aqe1, 32, 17, 32, 32, 19, 32, b, b, false);
/*     */       
/* 648 */       a(☃, b, 26, 20, 26, aqe1);
/* 649 */       a(☃, b, 27, 21, 27, aqe1);
/* 650 */       a(☃, e, 27, 20, 27, aqe1);
/* 651 */       a(☃, b, 26, 20, 31, aqe1);
/* 652 */       a(☃, b, 27, 21, 30, aqe1);
/* 653 */       a(☃, e, 27, 20, 30, aqe1);
/* 654 */       a(☃, b, 31, 20, 31, aqe1);
/* 655 */       a(☃, b, 30, 21, 30, aqe1);
/* 656 */       a(☃, e, 30, 20, 30, aqe1);
/* 657 */       a(☃, b, 31, 20, 26, aqe1);
/* 658 */       a(☃, b, 30, 21, 27, aqe1);
/* 659 */       a(☃, e, 30, 20, 27, aqe1);
/*     */       
/* 661 */       a(☃, aqe1, 28, 21, 27, 29, 21, 27, a, a, false);
/* 662 */       a(☃, aqe1, 27, 21, 28, 27, 21, 29, a, a, false);
/* 663 */       a(☃, aqe1, 28, 21, 30, 29, 21, 30, a, a, false);
/* 664 */       a(☃, aqe1, 30, 21, 28, 30, 21, 29, a, a, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void e(adm ☃, Random random, aqe aqe1) {
/* 671 */     if (a(aqe1, 0, 21, 6, 58)) {
/* 672 */       a(☃, aqe1, 0, 0, 21, 6, 0, 57, a, a, false);
/*     */       
/* 674 */       a(☃, aqe1, 0, 1, 21, 6, 7, 57, false);
/*     */ 
/*     */       
/* 677 */       a(☃, aqe1, 4, 4, 21, 6, 4, 53, a, a, false); int i;
/* 678 */       for (i = 0; i < 4; i++) {
/* 679 */         a(☃, aqe1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*     */       }
/* 681 */       for (i = 23; i < 53; i += 3) {
/* 682 */         a(☃, d, 5, 5, i, aqe1);
/*     */       }
/* 684 */       a(☃, d, 5, 5, 52, aqe1);
/*     */       
/* 686 */       for (i = 0; i < 4; i++) {
/* 687 */         a(☃, aqe1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*     */       }
/*     */       
/* 690 */       a(☃, aqe1, 4, 1, 52, 6, 3, 52, a, a, false);
/* 691 */       a(☃, aqe1, 5, 1, 51, 5, 3, 53, a, a, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 696 */     if (a(aqe1, 51, 21, 58, 58)) {
/* 697 */       a(☃, aqe1, 51, 0, 21, 57, 0, 57, a, a, false);
/*     */       
/* 699 */       a(☃, aqe1, 51, 1, 21, 57, 7, 57, false);
/*     */ 
/*     */       
/* 702 */       a(☃, aqe1, 51, 4, 21, 53, 4, 53, a, a, false); int i;
/* 703 */       for (i = 0; i < 4; i++) {
/* 704 */         a(☃, aqe1, 57 - i, i + 1, 21, 57 - i, i + 1, 57 - i, b, b, false);
/*     */       }
/* 706 */       for (i = 23; i < 53; i += 3) {
/* 707 */         a(☃, d, 52, 5, i, aqe1);
/*     */       }
/* 709 */       a(☃, d, 52, 5, 52, aqe1);
/*     */ 
/*     */       
/* 712 */       a(☃, aqe1, 51, 1, 52, 53, 3, 52, a, a, false);
/* 713 */       a(☃, aqe1, 52, 1, 51, 52, 3, 53, a, a, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 718 */     if (a(aqe1, 0, 51, 57, 57)) {
/* 719 */       a(☃, aqe1, 7, 0, 51, 50, 0, 57, a, a, false);
/*     */       
/* 721 */       a(☃, aqe1, 7, 1, 51, 50, 10, 57, false);
/*     */ 
/*     */       
/* 724 */       for (int i = 0; i < 4; i++) {
/* 725 */         a(☃, aqe1, i + 1, i + 1, 57 - i, 56 - i, i + 1, 57 - i, b, b, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void f(adm ☃, Random random, aqe aqe1) {
/* 733 */     if (a(aqe1, 7, 21, 13, 50)) {
/* 734 */       a(☃, aqe1, 7, 0, 21, 13, 0, 50, a, a, false);
/*     */       
/* 736 */       a(☃, aqe1, 7, 1, 21, 13, 10, 50, false);
/*     */ 
/*     */       
/* 739 */       a(☃, aqe1, 11, 8, 21, 13, 8, 53, a, a, false); int i;
/* 740 */       for (i = 0; i < 4; i++) {
/* 741 */         a(☃, aqe1, i + 7, i + 5, 21, i + 7, i + 5, 54, b, b, false);
/*     */       }
/* 743 */       for (i = 21; i <= 45; i += 3) {
/* 744 */         a(☃, d, 12, 9, i, aqe1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 750 */     if (a(aqe1, 44, 21, 50, 54)) {
/* 751 */       a(☃, aqe1, 44, 0, 21, 50, 0, 50, a, a, false);
/*     */       
/* 753 */       a(☃, aqe1, 44, 1, 21, 50, 10, 50, false);
/*     */ 
/*     */       
/* 756 */       a(☃, aqe1, 44, 8, 21, 46, 8, 53, a, a, false); int i;
/* 757 */       for (i = 0; i < 4; i++) {
/* 758 */         a(☃, aqe1, 50 - i, i + 5, 21, 50 - i, i + 5, 54, b, b, false);
/*     */       }
/* 760 */       for (i = 21; i <= 45; i += 3) {
/* 761 */         a(☃, d, 45, 9, i, aqe1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 767 */     if (a(aqe1, 8, 44, 49, 54)) {
/* 768 */       a(☃, aqe1, 14, 0, 44, 43, 0, 50, a, a, false);
/*     */       
/* 770 */       a(☃, aqe1, 14, 1, 44, 43, 10, 50, false);
/*     */ 
/*     */       
/*     */       int i;
/*     */       
/* 775 */       for (i = 12; i <= 45; i += 3) {
/* 776 */         a(☃, d, i, 9, 45, aqe1);
/* 777 */         a(☃, d, i, 9, 52, aqe1);
/* 778 */         if (i == 12 || i == 18 || i == 24 || i == 33 || i == 39 || i == 45) {
/* 779 */           a(☃, d, i, 9, 47, aqe1);
/* 780 */           a(☃, d, i, 9, 50, aqe1);
/* 781 */           a(☃, d, i, 10, 45, aqe1);
/* 782 */           a(☃, d, i, 10, 46, aqe1);
/* 783 */           a(☃, d, i, 10, 51, aqe1);
/* 784 */           a(☃, d, i, 10, 52, aqe1);
/* 785 */           a(☃, d, i, 11, 47, aqe1);
/* 786 */           a(☃, d, i, 11, 50, aqe1);
/* 787 */           a(☃, d, i, 12, 48, aqe1);
/* 788 */           a(☃, d, i, 12, 49, aqe1);
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 793 */       for (i = 0; i < 3; i++) {
/* 794 */         a(☃, aqe1, 8 + i, 5 + i, 54, 49 - i, 5 + i, 54, a, a, false);
/*     */       }
/* 796 */       a(☃, aqe1, 11, 8, 54, 46, 8, 54, b, b, false);
/* 797 */       a(☃, aqe1, 14, 8, 44, 43, 8, 53, a, a, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void g(adm ☃, Random random, aqe aqe1) {
/* 804 */     if (a(aqe1, 14, 21, 20, 43)) {
/* 805 */       a(☃, aqe1, 14, 0, 21, 20, 0, 43, a, a, false);
/*     */       
/* 807 */       a(☃, aqe1, 14, 1, 22, 20, 14, 43, false);
/*     */ 
/*     */       
/* 810 */       a(☃, aqe1, 18, 12, 22, 20, 12, 39, a, a, false);
/* 811 */       a(☃, aqe1, 18, 12, 21, 20, 12, 21, b, b, false); int i;
/* 812 */       for (i = 0; i < 4; i++) {
/* 813 */         a(☃, aqe1, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, b, b, false);
/*     */       }
/* 815 */       for (i = 23; i <= 39; i += 3) {
/* 816 */         a(☃, d, 19, 13, i, aqe1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 822 */     if (a(aqe1, 37, 21, 43, 43)) {
/* 823 */       a(☃, aqe1, 37, 0, 21, 43, 0, 43, a, a, false);
/*     */       
/* 825 */       a(☃, aqe1, 37, 1, 22, 43, 14, 43, false);
/*     */ 
/*     */       
/* 828 */       a(☃, aqe1, 37, 12, 22, 39, 12, 39, a, a, false);
/* 829 */       a(☃, aqe1, 37, 12, 21, 39, 12, 21, b, b, false); int i;
/* 830 */       for (i = 0; i < 4; i++) {
/* 831 */         a(☃, aqe1, 43 - i, i + 9, 21, 43 - i, i + 9, 43 - i, b, b, false);
/*     */       }
/* 833 */       for (i = 23; i <= 39; i += 3) {
/* 834 */         a(☃, d, 38, 13, i, aqe1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 840 */     if (a(aqe1, 15, 37, 42, 43)) {
/* 841 */       a(☃, aqe1, 21, 0, 37, 36, 0, 43, a, a, false);
/*     */       
/* 843 */       a(☃, aqe1, 21, 1, 37, 36, 14, 43, false);
/*     */ 
/*     */       
/* 846 */       a(☃, aqe1, 21, 12, 37, 36, 12, 39, a, a, false); int i;
/* 847 */       for (i = 0; i < 4; i++) {
/* 848 */         a(☃, aqe1, 15 + i, i + 9, 43 - i, 42 - i, i + 9, 43 - i, b, b, false);
/*     */       }
/* 850 */       for (i = 21; i <= 36; i += 3)
/* 851 */         a(☃, d, i, 13, 38, aqe1); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aql$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */