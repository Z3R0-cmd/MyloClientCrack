/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abe
/*     */ {
/*     */   public static final String a;
/*     */   public static final String b;
/*     */   public static final String c;
/*     */   public static final String d;
/*     */   public static final String e;
/*     */   public static final String f;
/*     */   public static final String g;
/*     */   public static final String h;
/*     */   public static final String i;
/*     */   public static final String j;
/*     */   public static final String k;
/*     */   public static final String l;
/*     */   public static final String m;
/*     */   public static final String n;
/*  55 */   private static final Map<Integer, String> o = Maps.newHashMap();
/*  56 */   private static final Map<Integer, String> p = Maps.newHashMap();
/*     */   private static final Map<Integer, Integer> q;
/*     */   private static final String[] r;
/*     */   
/*  60 */   static { a = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     c = "+0-1-2-3&4-4+13";
/*  83 */     o.put(Integer.valueOf(pe.l.d()), "0 & !1 & !2 & !3 & 0+6");
/*     */     
/*  85 */     b = "-0+1-2-3&4-4+13";
/*  86 */     o.put(Integer.valueOf(pe.c.d()), "!0 & 1 & !2 & !3 & 1+6");
/*     */     
/*  88 */     h = "+0+1-2-3&4-4+13";
/*  89 */     o.put(Integer.valueOf(pe.n.d()), "0 & 1 & !2 & !3 & 0+6");
/*     */     
/*  91 */     f = "+0-1+2-3&4-4+13";
/*  92 */     o.put(Integer.valueOf(pe.h.d()), "0 & !1 & 2 & !3");
/*     */     
/*  94 */     d = "-0-1+2-3&4-4+13";
/*  95 */     o.put(Integer.valueOf(pe.u.d()), "!0 & !1 & 2 & !3 & 2+6");
/*     */     
/*  97 */     e = "-0+3-4+13";
/*  98 */     o.put(Integer.valueOf(pe.t.d()), "!0 & !1 & !2 & 3 & 3+6");
/*  99 */     o.put(Integer.valueOf(pe.i.d()), "!0 & !1 & 2 & 3");
/* 100 */     o.put(Integer.valueOf(pe.d.d()), "!0 & 1 & !2 & 3 & 3+6");
/*     */     
/* 102 */     g = "+0-1-2+3&4-4+13";
/* 103 */     o.put(Integer.valueOf(pe.g.d()), "0 & !1 & !2 & 3 & 3+6");
/*     */     
/* 105 */     l = "-0+1+2-3+13&4-4";
/* 106 */     o.put(Integer.valueOf(pe.r.d()), "!0 & 1 & 2 & !3 & 2+6");
/*     */ 
/*     */     
/* 109 */     o.put(Integer.valueOf(pe.p.d()), "!0 & 1 & 2 & 3 & 2+6");
/*     */     
/* 111 */     m = "+0-1+2+3+13&4-4";
/* 112 */     o.put(Integer.valueOf(pe.o.d()), "0 & !1 & 2 & 3 & 2+6");
/*     */     
/* 114 */     n = "+0+1-2+3&4-4+13";
/* 115 */     o.put(Integer.valueOf(pe.j.d()), "0 & 1 & !2 & 3 & 3+6");
/*     */ 
/*     */     
/* 118 */     j = "+5-6-7";
/* 119 */     p.put(Integer.valueOf(pe.c.d()), "5");
/* 120 */     p.put(Integer.valueOf(pe.e.d()), "5");
/* 121 */     p.put(Integer.valueOf(pe.g.d()), "5");
/* 122 */     p.put(Integer.valueOf(pe.l.d()), "5");
/* 123 */     p.put(Integer.valueOf(pe.i.d()), "5");
/* 124 */     p.put(Integer.valueOf(pe.h.d()), "5");
/* 125 */     p.put(Integer.valueOf(pe.m.d()), "5");
/* 126 */     p.put(Integer.valueOf(pe.u.d()), "5");
/* 127 */     p.put(Integer.valueOf(pe.j.d()), "5");
/*     */ 
/*     */     
/* 130 */     i = "-5+6-7";
/*     */ 
/*     */ 
/*     */     
/* 134 */     k = "+14&13-13";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 248 */     q = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     r = new String[] { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" }; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(int ☃, int i) {
/*     */     return ((☃ & 1 << i) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int c(int ☃, int i) {
/*     */     return a(☃, i) ? 1 : 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int d(int ☃, int i) {
/*     */     return a(☃, i) ? 0 : 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String c(int ☃) {
/* 306 */     int i = a(☃);
/* 307 */     return r[i];
/*     */   }
/*     */   public static int a(int ☃) { return a(☃, 5, 4, 3, 2, 1); }
/*     */   public static int a(Collection<pf> ☃) { int i = 3694022; if (☃ == null || ☃.isEmpty())
/*     */       return i;  float f1 = 0.0F; float f2 = 0.0F; float f3 = 0.0F; float f4 = 0.0F; for (Iterator<pf> iterator = ☃.iterator(); iterator.hasNext(); ) { pf pf = iterator.next(); if (!pf.f())
/*     */         continue;  int j = pe.a[pf.a()].k(); for (int k = 0; k <= pf.c(); k++) { f1 += (j >> 16 & 0xFF) / 255.0F; f2 += (j >> 8 & 0xFF) / 255.0F; f3 += (j >> 0 & 0xFF) / 255.0F; f4++; }  }  if (f4 == 0.0F)
/*     */       return 0;  f1 = f1 / f4 * 255.0F; f2 = f2 / f4 * 255.0F; f3 = f3 / f4 * 255.0F; return (int)f1 << 16 | (int)f2 << 8 | (int)f3; }
/*     */   public static boolean b(Collection<pf> ☃) { for (Iterator<pf> iterator = ☃.iterator(); iterator.hasNext(); ) { pf pf = iterator.next(); if (!pf.e())
/*     */         return false;  }  return true; } public static int a(int ☃, boolean bool) { Integer integer = nl.a(☃); if (!bool) { if (q.containsKey(integer))
/* 316 */         return ((Integer)q.get(integer)).intValue();  int i = a(b(integer.intValue(), false)); q.put(integer, Integer.valueOf(i)); return i; }  return a(b(integer.intValue(), true)); } private static int a(boolean ☃, boolean bool1, boolean bool2, int i, int j, int k, int m) { int n = 0;
/* 317 */     if (☃) {
/* 318 */       n = d(m, j);
/* 319 */     } else if (i != -1) {
/* 320 */       if (i == 0 && h(m) == j) {
/* 321 */         n = 1;
/* 322 */       } else if (i == 1 && h(m) > j) {
/* 323 */         n = 1;
/* 324 */       } else if (i == 2 && h(m) < j) {
/* 325 */         n = 1;
/*     */       } 
/*     */     } else {
/* 328 */       n = c(m, j);
/*     */     } 
/* 330 */     if (bool1) {
/* 331 */       n *= k;
/*     */     }
/* 333 */     if (bool2) {
/* 334 */       n *= -1;
/*     */     }
/* 336 */     return n; }
/*     */ 
/*     */   
/*     */   private static int h(int ☃) {
/* 340 */     int i = 0;
/* 341 */     for (; ☃ > 0; i++) {
/* 342 */       ☃ &= ☃ - 1;
/*     */     }
/* 344 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(String ☃, int i, int j, int k) {
/* 348 */     if (i >= ☃.length() || j < 0 || i >= j) {
/* 349 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 353 */     int m = ☃.indexOf('|', i);
/* 354 */     if (m >= 0 && m < j) {
/* 355 */       int i6 = a(☃, i, m - 1, k);
/* 356 */       if (i6 > 0) {
/* 357 */         return i6;
/*     */       }
/*     */       
/* 360 */       int i7 = a(☃, m + 1, j, k);
/* 361 */       if (i7 > 0) {
/* 362 */         return i7;
/*     */       }
/* 364 */       return 0;
/*     */     } 
/*     */     
/* 367 */     int n = ☃.indexOf('&', i);
/* 368 */     if (n >= 0 && n < j) {
/* 369 */       int i6 = a(☃, i, n - 1, k);
/* 370 */       if (i6 <= 0) {
/* 371 */         return 0;
/*     */       }
/*     */       
/* 374 */       int i7 = a(☃, n + 1, j, k);
/* 375 */       if (i7 <= 0) {
/* 376 */         return 0;
/*     */       }
/*     */       
/* 379 */       if (i6 > i7) {
/* 380 */         return i6;
/*     */       }
/* 382 */       return i7;
/*     */     } 
/*     */     
/* 385 */     boolean bool1 = false;
/* 386 */     boolean bool2 = false;
/* 387 */     boolean bool3 = false;
/* 388 */     boolean bool4 = false;
/* 389 */     boolean bool5 = false;
/* 390 */     int i1 = -1;
/* 391 */     int i2 = 0;
/* 392 */     int i3 = 0;
/* 393 */     int i4 = 0;
/* 394 */     for (int i5 = i; i5 < j; i5++) {
/* 395 */       char c = ☃.charAt(i5);
/* 396 */       if (c >= '0' && c <= '9') {
/* 397 */         if (bool1) {
/* 398 */           i3 = c - 48;
/* 399 */           bool2 = true;
/*     */         } else {
/* 401 */           i2 *= 10;
/* 402 */           i2 += c - 48;
/* 403 */           bool3 = true;
/*     */         } 
/* 405 */       } else if (c == '*') {
/* 406 */         bool1 = true;
/* 407 */       } else if (c == '!') {
/* 408 */         if (bool3) {
/* 409 */           i4 += a(bool4, bool2, bool5, i1, i2, i3, k);
/* 410 */           bool3 = bool2 = bool1 = bool5 = bool4 = false;
/* 411 */           i2 = i3 = 0;
/* 412 */           i1 = -1;
/*     */         } 
/*     */         
/* 415 */         bool4 = true;
/* 416 */       } else if (c == '-') {
/* 417 */         if (bool3) {
/* 418 */           i4 += a(bool4, bool2, bool5, i1, i2, i3, k);
/* 419 */           bool3 = bool2 = bool1 = bool5 = bool4 = false;
/* 420 */           i2 = i3 = 0;
/* 421 */           i1 = -1;
/*     */         } 
/*     */         
/* 424 */         bool5 = true;
/* 425 */       } else if (c == '=' || c == '<' || c == '>') {
/* 426 */         if (bool3) {
/* 427 */           i4 += a(bool4, bool2, bool5, i1, i2, i3, k);
/* 428 */           bool3 = bool2 = bool1 = bool5 = bool4 = false;
/* 429 */           i2 = i3 = 0;
/* 430 */           i1 = -1;
/*     */         } 
/*     */         
/* 433 */         if (c == '=') {
/* 434 */           i1 = 0;
/* 435 */         } else if (c == '<') {
/* 436 */           i1 = 2;
/* 437 */         } else if (c == '>') {
/* 438 */           i1 = 1;
/*     */         } 
/* 440 */       } else if (c == '+' && 
/* 441 */         bool3) {
/* 442 */         i4 += a(bool4, bool2, bool5, i1, i2, i3, k);
/* 443 */         bool3 = bool2 = bool1 = bool5 = bool4 = false;
/* 444 */         i2 = i3 = 0;
/* 445 */         i1 = -1;
/*     */       } 
/*     */     } 
/*     */     
/* 449 */     if (bool3) {
/* 450 */       i4 += a(bool4, bool2, bool5, i1, i2, i3, k);
/*     */     }
/*     */     
/* 453 */     return i4;
/*     */   }
/*     */   
/*     */   public static List<pf> b(int ☃, boolean bool) {
/* 457 */     List<pf> list = null; pe[] arrayOfPe;
/*     */     int i, j;
/* 459 */     for (arrayOfPe = pe.a, i = arrayOfPe.length, j = 0; j < i; ) { pe pe = arrayOfPe[j];
/* 460 */       if (pe != null && (!pe.j() || bool)) {
/*     */ 
/*     */         
/* 463 */         String str = o.get(Integer.valueOf(pe.d()));
/* 464 */         if (str != null) {
/*     */ 
/*     */ 
/*     */           
/* 468 */           int k = a(str, 0, str.length(), ☃);
/* 469 */           if (k > 0) {
/* 470 */             int m = 0;
/* 471 */             String str1 = p.get(Integer.valueOf(pe.d()));
/* 472 */             if (str1 != null) {
/* 473 */               m = a(str1, 0, str1.length(), ☃);
/* 474 */               if (m < 0) {
/* 475 */                 m = 0;
/*     */               }
/*     */             } 
/*     */             
/* 479 */             if (pe.b()) {
/* 480 */               k = 1;
/*     */             } else {
/*     */               
/* 483 */               k = 1200 * (k * 3 + (k - 1) * 2);
/* 484 */               k >>= m;
/* 485 */               k = (int)Math.round(k * pe.h());
/*     */               
/* 487 */               if ((☃ & 0x4000) != 0) {
/* 488 */                 k = (int)Math.round(k * 0.75D + 0.5D);
/*     */               }
/*     */             } 
/*     */             
/* 492 */             if (list == null) {
/* 493 */               list = Lists.newArrayList();
/*     */             }
/* 495 */             pf pf = new pf(pe.d(), k, m);
/* 496 */             if ((☃ & 0x4000) != 0) {
/* 497 */               pf.a(true);
/*     */             }
/* 499 */             list.add(pf);
/*     */           } 
/*     */         } 
/*     */       }  j++; }
/* 503 */      return list;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(int ☃, int i, boolean bool1, boolean bool2, boolean bool3) {
/* 586 */     if (bool3) {
/* 587 */       if (!a(☃, i)) {
/* 588 */         return 0;
/*     */       }
/* 590 */     } else if (bool1) {
/* 591 */       ☃ &= 1 << i ^ 0xFFFFFFFF;
/* 592 */     } else if (bool2) {
/* 593 */       if ((☃ & 1 << i) == 0) {
/* 594 */         ☃ |= 1 << i;
/*     */       } else {
/* 596 */         ☃ &= 1 << i ^ 0xFFFFFFFF;
/*     */       } 
/*     */     } else {
/* 599 */       ☃ |= 1 << i;
/*     */     } 
/* 601 */     return ☃;
/*     */   }
/*     */   
/*     */   public static int a(int ☃, String str) {
/* 605 */     int i = 0;
/* 606 */     int j = str.length();
/*     */     
/* 608 */     boolean bool1 = false;
/* 609 */     boolean bool2 = false;
/* 610 */     boolean bool3 = false;
/* 611 */     boolean bool4 = false;
/* 612 */     int k = 0;
/* 613 */     for (int m = i; m < j; m++) {
/* 614 */       char c = str.charAt(m);
/* 615 */       if (c >= '0' && c <= '9') {
/* 616 */         k *= 10;
/* 617 */         k += c - 48;
/* 618 */         bool1 = true;
/* 619 */       } else if (c == '!') {
/* 620 */         if (bool1) {
/* 621 */           ☃ = a(☃, k, bool3, bool2, bool4);
/* 622 */           bool1 = bool3 = bool2 = bool4 = false;
/* 623 */           k = 0;
/*     */         } 
/*     */         
/* 626 */         bool2 = true;
/* 627 */       } else if (c == '-') {
/* 628 */         if (bool1) {
/* 629 */           ☃ = a(☃, k, bool3, bool2, bool4);
/* 630 */           bool1 = bool3 = bool2 = bool4 = false;
/* 631 */           k = 0;
/*     */         } 
/*     */         
/* 634 */         bool3 = true;
/* 635 */       } else if (c == '+') {
/* 636 */         if (bool1) {
/* 637 */           ☃ = a(☃, k, bool3, bool2, bool4);
/* 638 */           bool1 = bool3 = bool2 = bool4 = false;
/* 639 */           k = 0;
/*     */         } 
/* 641 */       } else if (c == '&') {
/* 642 */         if (bool1) {
/* 643 */           ☃ = a(☃, k, bool3, bool2, bool4);
/* 644 */           bool1 = bool3 = bool2 = bool4 = false;
/* 645 */           k = 0;
/*     */         } 
/* 647 */         bool4 = true;
/*     */       } 
/*     */     } 
/* 650 */     if (bool1) {
/* 651 */       ☃ = a(☃, k, bool3, bool2, bool4);
/*     */     }
/*     */     
/* 654 */     return ☃ & 0x7FFF;
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
/*     */   public static int a(int ☃, int i, int j, int k, int m, int n) {
/* 669 */     return (a(☃, i) ? 16 : 0) | (a(☃, j) ? 8 : 0) | (a(☃, k) ? 4 : 0) | (a(☃, m) ? 2 : 0) | (a(☃, n) ? 1 : 0);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */