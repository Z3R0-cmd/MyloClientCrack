/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alj
/*     */   extends alk
/*     */   implements ali, km
/*     */ {
/*  34 */   private zx[] a = new zx[5];
/*     */   private String f;
/*  36 */   private int g = -1;
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/*  40 */     super.a(☃);
/*     */ 
/*     */     
/*  43 */     du du = ☃.c("Items", 10);
/*  44 */     this.a = new zx[o_()];
/*  45 */     if (☃.b("CustomName", 8)) {
/*  46 */       this.f = ☃.j("CustomName");
/*     */     }
/*  48 */     this.g = ☃.f("TransferCooldown");
/*  49 */     for (int i = 0; i < du.c(); i++) {
/*  50 */       dn dn1 = du.b(i);
/*  51 */       int j = dn1.d("Slot");
/*  52 */       if (j >= 0 && j < this.a.length) {
/*  53 */         this.a[j] = zx.a(dn1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/*  60 */     super.b(☃);
/*  61 */     du du = new du();
/*     */     
/*  63 */     for (int i = 0; i < this.a.length; i++) {
/*  64 */       if (this.a[i] != null) {
/*  65 */         dn dn1 = new dn();
/*  66 */         dn1.a("Slot", (byte)i);
/*  67 */         this.a[i].b(dn1);
/*  68 */         du.a(dn1);
/*     */       } 
/*     */     } 
/*  71 */     ☃.a("Items", du);
/*  72 */     ☃.a("TransferCooldown", this.g);
/*  73 */     if (l_()) {
/*  74 */       ☃.a("CustomName", this.f);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void p_() {
/*  80 */     super.p_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int o_() {
/*  85 */     return this.a.length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃) {
/*  91 */     return this.a[☃];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃, int i) {
/*  97 */     if (this.a[☃] != null) {
/*  98 */       if ((this.a[☃]).b <= i) {
/*  99 */         zx zx2 = this.a[☃];
/* 100 */         this.a[☃] = null;
/* 101 */         return zx2;
/*     */       } 
/* 103 */       zx zx1 = this.a[☃].a(i);
/* 104 */       if ((this.a[☃]).b == 0) {
/* 105 */         this.a[☃] = null;
/*     */       }
/* 107 */       return zx1;
/*     */     } 
/*     */     
/* 110 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b(int ☃) {
/* 116 */     if (this.a[☃] != null) {
/* 117 */       zx zx1 = this.a[☃];
/* 118 */       this.a[☃] = null;
/* 119 */       return zx1;
/*     */     } 
/* 121 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, zx zx1) {
/* 126 */     this.a[☃] = zx1;
/* 127 */     if (zx1 != null && zx1.b > q_()) {
/* 128 */       zx1.b = q_();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 134 */     return l_() ? this.f : "container.hopper";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 139 */     return (this.f != null && this.f.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 143 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int q_() {
/* 148 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(wn ☃) {
/* 153 */     if (this.b.s(this.c) != this) {
/* 154 */       return false;
/*     */     }
/* 156 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 157 */       return false;
/*     */     }
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(wn ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(wn ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, zx zx1) {
/* 172 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 177 */     if (this.b == null || this.b.D) {
/*     */       return;
/*     */     }
/*     */     
/* 181 */     this.g--;
/*     */     
/* 183 */     if (!n()) {
/* 184 */       d(0);
/* 185 */       m();
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 190 */     if (this.b == null || this.b.D) {
/* 191 */       return false;
/*     */     }
/*     */     
/* 194 */     if (!n() && ahn.f(u())) {
/* 195 */       boolean ☃ = false;
/*     */       
/* 197 */       if (!p()) {
/* 198 */         ☃ = r();
/*     */       }
/* 200 */       if (!q()) {
/* 201 */         ☃ = (a(this) || ☃);
/*     */       }
/*     */       
/* 204 */       if (☃) {
/* 205 */         d(8);
/* 206 */         p_();
/* 207 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 211 */     return false;
/*     */   } private boolean p() { zx[] ☃;
/*     */     int i;
/*     */     int j;
/* 215 */     for (☃ = this.a, i = ☃.length, j = 0; j < i; ) { zx zx1 = ☃[j];
/* 216 */       if (zx1 != null) {
/* 217 */         return false;
/*     */       }
/*     */       j++; }
/*     */     
/* 221 */     return true; } private boolean q() {
/*     */     zx[] ☃;
/*     */     int i;
/*     */     int j;
/* 225 */     for (☃ = this.a, i = ☃.length, j = 0; j < i; ) { zx zx1 = ☃[j];
/* 226 */       if (zx1 == null || zx1.b != zx1.c()) {
/* 227 */         return false;
/*     */       }
/*     */       j++; }
/*     */     
/* 231 */     return true;
/*     */   }
/*     */   
/*     */   private boolean r() {
/* 235 */     og ☃ = H();
/* 236 */     if (☃ == null) {
/* 237 */       return false;
/*     */     }
/*     */     
/* 240 */     cq cq = ahn.b(u()).d();
/* 241 */     if (a(☃, cq)) {
/* 242 */       return false;
/*     */     }
/*     */     
/* 245 */     for (int i = 0; i < o_(); i++) {
/* 246 */       if (a(i) != null) {
/*     */ 
/*     */ 
/*     */         
/* 250 */         zx zx1 = a(i).k();
/* 251 */         zx zx2 = a(☃, a(i, 1), cq);
/*     */         
/* 253 */         if (zx2 == null || zx2.b == 0) {
/* 254 */           ☃.p_();
/* 255 */           return true;
/*     */         } 
/* 257 */         a(i, zx1);
/*     */       } 
/*     */     } 
/*     */     
/* 261 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(og ☃, cq cq1) {
/* 265 */     if (☃ instanceof ot) {
/* 266 */       ot ot = (ot)☃;
/* 267 */       int[] arrayOfInt = ot.a(cq1);
/*     */       
/* 269 */       for (int i = 0; i < arrayOfInt.length; i++) {
/* 270 */         zx zx1 = ot.a(arrayOfInt[i]);
/* 271 */         if (zx1 == null || zx1.b != zx1.c()) {
/* 272 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 276 */       int i = ☃.o_();
/* 277 */       for (int j = 0; j < i; j++) {
/* 278 */         zx zx1 = ☃.a(j);
/* 279 */         if (zx1 == null || zx1.b != zx1.c()) {
/* 280 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 285 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(og ☃, cq cq1) {
/* 289 */     if (☃ instanceof ot) {
/* 290 */       ot ot = (ot)☃;
/* 291 */       int[] arrayOfInt = ot.a(cq1);
/*     */       
/* 293 */       for (int i = 0; i < arrayOfInt.length; i++) {
/* 294 */         if (ot.a(arrayOfInt[i]) != null) {
/* 295 */           return false;
/*     */         }
/*     */       } 
/*     */     } else {
/* 299 */       int i = ☃.o_();
/* 300 */       for (int j = 0; j < i; j++) {
/* 301 */         if (☃.a(j) != null) {
/* 302 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 306 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean a(ali ☃) {
/* 310 */     og og = b(☃);
/*     */     
/* 312 */     if (og != null) {
/* 313 */       cq cq = cq.a;
/* 314 */       if (b(og, cq)) {
/* 315 */         return false;
/*     */       }
/*     */       
/* 318 */       if (og instanceof ot) {
/* 319 */         ot ot = (ot)og;
/* 320 */         int[] arrayOfInt = ot.a(cq);
/*     */         
/* 322 */         for (int i = 0; i < arrayOfInt.length; i++) {
/* 323 */           if (a(☃, og, arrayOfInt[i], cq)) {
/* 324 */             return true;
/*     */           }
/*     */         } 
/*     */       } else {
/* 328 */         int i = og.o_();
/* 329 */         for (int j = 0; j < i; j++) {
/* 330 */           if (a(☃, og, j, cq)) {
/* 331 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } else {
/* 336 */       for (Iterator<uz> iterator = a(☃.z(), ☃.A(), ☃.B() + 1.0D, ☃.C()).iterator(); iterator.hasNext(); ) { uz uz = iterator.next();
/* 337 */         if (a(☃, uz)) {
/* 338 */           return true;
/*     */         } }
/*     */     
/*     */     } 
/*     */     
/* 343 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean a(ali ☃, og og1, int i, cq cq1) {
/* 347 */     zx zx1 = og1.a(i);
/*     */     
/* 349 */     if (zx1 != null && b(og1, zx1, i, cq1)) {
/* 350 */       zx zx2 = zx1.k();
/* 351 */       zx zx3 = a(☃, og1.a(i, 1), (cq)null);
/*     */       
/* 353 */       if (zx3 == null || zx3.b == 0) {
/* 354 */         og1.p_();
/* 355 */         return true;
/*     */       } 
/* 357 */       og1.a(i, zx2);
/*     */     } 
/*     */ 
/*     */     
/* 361 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(og ☃, uz uz1) {
/* 365 */     boolean bool = false;
/* 366 */     if (uz1 == null) {
/* 367 */       return false;
/*     */     }
/*     */     
/* 370 */     zx zx1 = uz1.l().k();
/* 371 */     zx zx2 = a(☃, zx1, (cq)null);
/*     */     
/* 373 */     if (zx2 == null || zx2.b == 0) {
/* 374 */       bool = true;
/*     */       
/* 376 */       uz1.J();
/*     */     } else {
/* 378 */       uz1.a(zx2);
/*     */     } 
/*     */     
/* 381 */     return bool;
/*     */   }
/*     */   
/*     */   public static zx a(og ☃, zx zx1, cq cq1) {
/* 385 */     if (☃ instanceof ot && cq1 != null) {
/* 386 */       ot ot = (ot)☃;
/* 387 */       int[] arrayOfInt = ot.a(cq1);
/*     */       
/* 389 */       for (int i = 0; i < arrayOfInt.length && zx1 != null && zx1.b > 0; i++) {
/* 390 */         zx1 = c(☃, zx1, arrayOfInt[i], cq1);
/*     */       }
/*     */     } else {
/* 393 */       int i = ☃.o_();
/* 394 */       for (int j = 0; j < i && zx1 != null && zx1.b > 0; j++) {
/* 395 */         zx1 = c(☃, zx1, j, cq1);
/*     */       }
/*     */     } 
/*     */     
/* 399 */     if (zx1 != null && zx1.b == 0) {
/* 400 */       zx1 = null;
/*     */     }
/*     */     
/* 403 */     return zx1;
/*     */   }
/*     */   
/*     */   private static boolean a(og ☃, zx zx1, int i, cq cq1) {
/* 407 */     if (!☃.b(i, zx1)) {
/* 408 */       return false;
/*     */     }
/* 410 */     if (☃ instanceof ot && !((ot)☃).a(i, zx1, cq1)) {
/* 411 */       return false;
/*     */     }
/* 413 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(og ☃, zx zx1, int i, cq cq1) {
/* 417 */     if (☃ instanceof ot && !((ot)☃).b(i, zx1, cq1)) {
/* 418 */       return false;
/*     */     }
/* 420 */     return true;
/*     */   }
/*     */   
/*     */   private static zx c(og ☃, zx zx1, int i, cq cq1) {
/* 424 */     zx zx2 = ☃.a(i);
/*     */     
/* 426 */     if (a(☃, zx1, i, cq1)) {
/* 427 */       boolean bool = false;
/* 428 */       if (zx2 == null) {
/* 429 */         ☃.a(i, zx1);
/* 430 */         zx1 = null;
/* 431 */         bool = true;
/* 432 */       } else if (a(zx2, zx1)) {
/* 433 */         int j = zx1.c() - zx2.b;
/* 434 */         int k = Math.min(zx1.b, j);
/*     */         
/* 436 */         zx1.b -= k;
/* 437 */         zx2.b += k;
/* 438 */         bool = (k > 0);
/*     */       } 
/* 440 */       if (bool) {
/* 441 */         if (☃ instanceof alj) {
/* 442 */           alj alj1 = (alj)☃;
/* 443 */           if (alj1.o()) {
/* 444 */             alj1.d(8);
/*     */           }
/* 446 */           ☃.p_();
/*     */         } 
/* 448 */         ☃.p_();
/*     */       } 
/*     */     } 
/* 451 */     return zx1;
/*     */   }
/*     */   
/*     */   private og H() {
/* 455 */     cq ☃ = ahn.b(u());
/* 456 */     return b(z(), (this.c.n() + ☃.g()), (this.c.o() + ☃.h()), (this.c.p() + ☃.i()));
/*     */   }
/*     */   
/*     */   public static og b(ali ☃) {
/* 460 */     return b(☃.z(), ☃.A(), ☃.B() + 1.0D, ☃.C());
/*     */   }
/*     */   
/*     */   public static List<uz> a(adm ☃, double d1, double d2, double d3) {
/* 464 */     return (List)☃.a((Class)uz.class, new aug(d1 - 0.5D, d2 - 0.5D, d3 - 0.5D, d1 + 0.5D, d2 + 0.5D, d3 + 0.5D), po.a);
/*     */   }
/*     */   
/*     */   public static og b(adm ☃, double d1, double d2, double d3) {
/* 468 */     og og = null;
/* 469 */     int i = ns.c(d1);
/* 470 */     int j = ns.c(d2);
/* 471 */     int k = ns.c(d3);
/* 472 */     cj cj = new cj(i, j, k);
/*     */     
/* 474 */     afh afh = ☃.p(cj).c();
/* 475 */     if (afh.z()) {
/* 476 */       akw akw = ☃.s(cj);
/*     */       
/* 478 */       if (akw instanceof og) {
/* 479 */         og = (og)akw;
/*     */         
/* 481 */         if (og instanceof aky && 
/* 482 */           afh instanceof afs) {
/* 483 */           og = ((afs)afh).f(☃, cj);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 489 */     if (og == null) {
/* 490 */       List<pk> list = ☃.a((pk)null, new aug(d1 - 0.5D, d2 - 0.5D, d3 - 0.5D, d1 + 0.5D, d2 + 0.5D, d3 + 0.5D), po.c);
/*     */       
/* 492 */       if (list.size() > 0) {
/* 493 */         og = (og)list.get(☃.s.nextInt(list.size()));
/*     */       }
/*     */     } 
/*     */     
/* 497 */     return og;
/*     */   }
/*     */   
/*     */   private static boolean a(zx ☃, zx zx1) {
/* 501 */     if (☃.b() != zx1.b()) {
/* 502 */       return false;
/*     */     }
/* 504 */     if (☃.i() != zx1.i()) {
/* 505 */       return false;
/*     */     }
/* 507 */     if (☃.b > ☃.c()) {
/* 508 */       return false;
/*     */     }
/* 510 */     if (!zx.a(☃, zx1)) {
/* 511 */       return false;
/*     */     }
/* 513 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public double A() {
/* 518 */     return this.c.n() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double B() {
/* 523 */     return this.c.o() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double C() {
/* 528 */     return this.c.p() + 0.5D;
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 532 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 536 */     return (this.g > 0);
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 540 */     return (this.g <= 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 545 */     return "minecraft:hopper";
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 550 */     return new xw(☃, this, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a_(int ☃) {
/* 555 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int g() {
/* 564 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 569 */     for (int ☃ = 0; ☃ < this.a.length; ☃++)
/* 570 */       this.a[☃] = null; 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */