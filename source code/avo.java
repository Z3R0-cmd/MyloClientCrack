/*     */ import com.google.common.base.Predicate;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
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
/*     */ public class avo
/*     */   extends avp
/*     */ {
/*  58 */   private static final jy f = new jy("textures/misc/vignette.png");
/*  59 */   private static final jy g = new jy("textures/gui/widgets.png");
/*  60 */   private static final jy h = new jy("textures/misc/pumpkinblur.png");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   private final Random i = new Random();
/*     */   
/*     */   private final ave j;
/*     */   private final bjh k;
/*     */   private final avt l;
/*     */   private final awk m;
/*     */   private int n;
/*  72 */   private String o = "";
/*     */   private int p;
/*     */   private boolean q;
/*  75 */   public float a = 1.0F;
/*     */   
/*     */   private int r;
/*     */   
/*     */   private zx s;
/*     */   private final avv t;
/*     */   private final awm u;
/*     */   private final awh v;
/*     */   private int w;
/*  84 */   private String x = "";
/*  85 */   private String y = "";
/*     */   private int z;
/*     */   private int A;
/*     */   private int B;
/*  89 */   private int C = 0;
/*  90 */   private int D = 0;
/*  91 */   private long E = 0L;
/*  92 */   private long F = 0L;
/*     */   
/*     */   public avo(ave ☃) {
/*  95 */     this.j = ☃;
/*  96 */     this.k = ☃.ag();
/*  97 */     this.t = new avv(☃);
/*  98 */     this.u = new awm(☃);
/*  99 */     this.l = new avt(☃);
/* 100 */     this.m = new awk(☃);
/* 101 */     this.v = new awh(☃, this);
/*     */     
/* 103 */     a();
/*     */   }
/*     */   
/*     */   public void a() {
/* 107 */     this.z = 10;
/* 108 */     this.A = 70;
/* 109 */     this.B = 20;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 113 */     avr avr = new avr(this.j);
/* 114 */     int i = avr.a();
/* 115 */     int j = avr.b();
/*     */     
/* 117 */     this.j.o.j();
/*     */     
/* 119 */     bfl.l();
/*     */     
/* 121 */     if (ave.w()) {
/* 122 */       a(this.j.h.c(☃), avr);
/*     */     } else {
/*     */       
/* 125 */       bfl.a(770, 771, 1, 0);
/*     */     } 
/*     */ 
/*     */     
/* 129 */     zx zx1 = this.j.h.bi.e(3);
/* 130 */     if (this.j.t.aA == 0 && zx1 != null && zx1.b() == zw.a(afi.aU)) {
/* 131 */       e(avr);
/*     */     }
/*     */     
/* 134 */     if (!this.j.h.a(pe.k)) {
/* 135 */       float f = this.j.h.bI + (this.j.h.bH - this.j.h.bI) * ☃;
/* 136 */       if (f > 0.0F) {
/* 137 */         b(f, avr);
/*     */       }
/*     */     } 
/*     */     
/* 141 */     if (this.j.c.a()) {
/* 142 */       this.u.a(avr, ☃);
/*     */     } else {
/* 144 */       a(avr, ☃);
/*     */     } 
/*     */     
/* 147 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 148 */     this.j.P().a(d);
/* 149 */     bfl.l();
/*     */     
/* 151 */     if (b()) {
/*     */       
/* 153 */       bfl.a(775, 769, 1, 0);
/* 154 */       bfl.d();
/* 155 */       b(i / 2 - 7, j / 2 - 7, 0, 0, 16, 16);
/*     */     } 
/*     */     
/* 158 */     bfl.a(770, 771, 1, 0);
/* 159 */     this.j.A.a("bossHealth");
/* 160 */     j();
/* 161 */     this.j.A.b();
/*     */     
/* 163 */     if (this.j.c.b()) {
/* 164 */       d(avr);
/*     */     }
/*     */     
/* 167 */     bfl.k();
/*     */ 
/*     */     
/* 170 */     if (this.j.h.cg() > 0) {
/* 171 */       this.j.A.a("sleep");
/* 172 */       bfl.i();
/* 173 */       bfl.c();
/*     */       
/* 175 */       int m = this.j.h.cg();
/* 176 */       float f = m / 100.0F;
/* 177 */       if (f > 1.0F)
/*     */       {
/* 179 */         f = 1.0F - (m - 100) / 10.0F;
/*     */       }
/*     */       
/* 182 */       int n = (int)(220.0F * f) << 24 | 0x101020;
/* 183 */       a(0, 0, i, j, n);
/* 184 */       bfl.d();
/* 185 */       bfl.j();
/* 186 */       this.j.A.b();
/*     */     } 
/*     */     
/* 189 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 190 */     int k = i / 2 - 91;
/*     */     
/* 192 */     if (this.j.h.y()) {
/* 193 */       a(avr, k);
/*     */     }
/* 195 */     else if (this.j.c.f()) {
/*     */       
/* 197 */       b(avr, k);
/*     */     } 
/*     */     
/* 200 */     if (this.j.t.D && !this.j.c.a()) {
/* 201 */       a(avr);
/* 202 */     } else if (this.j.h.v()) {
/* 203 */       this.u.a(avr);
/*     */     } 
/*     */     
/* 206 */     if (this.j.t()) {
/* 207 */       b(avr);
/*     */     }
/*     */     
/* 210 */     if (this.j.t.aB) {
/* 211 */       this.t.a(avr);
/*     */     }
/*     */     
/* 214 */     if (this.p > 0) {
/* 215 */       this.j.A.a("overlayMessage");
/* 216 */       float f = this.p - ☃;
/* 217 */       int m = (int)(f * 255.0F / 20.0F);
/* 218 */       if (m > 255) {
/* 219 */         m = 255;
/*     */       }
/* 221 */       if (m > 8) {
/* 222 */         bfl.E();
/* 223 */         bfl.b((i / 2), (j - 68), 0.0F);
/* 224 */         bfl.l();
/* 225 */         bfl.a(770, 771, 1, 0);
/*     */         
/* 227 */         int n = 16777215;
/* 228 */         if (this.q) {
/* 229 */           n = ns.c(f / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
/*     */         }
/* 231 */         f().a(this.o, -f().a(this.o) / 2, -4, n + (m << 24 & 0xFF000000));
/* 232 */         bfl.k();
/* 233 */         bfl.F();
/*     */       } 
/* 235 */       this.j.A.b();
/*     */     } 
/*     */     
/* 238 */     if (this.w > 0) {
/* 239 */       this.j.A.a("titleAndSubtitle");
/* 240 */       float f = this.w - ☃;
/* 241 */       int m = 255;
/* 242 */       if (this.w > this.B + this.A) {
/* 243 */         float f1 = (this.z + this.A + this.B) - f;
/* 244 */         m = (int)(f1 * 255.0F / this.z);
/*     */       } 
/* 246 */       if (this.w <= this.B) {
/* 247 */         float f1 = f;
/* 248 */         m = (int)(f1 * 255.0F / this.B);
/*     */       } 
/* 250 */       m = ns.a(m, 0, 255);
/* 251 */       if (m > 8) {
/* 252 */         bfl.E();
/* 253 */         bfl.b((i / 2), (j / 2), 0.0F);
/* 254 */         bfl.l();
/* 255 */         bfl.a(770, 771, 1, 0);
/*     */         
/* 257 */         bfl.E();
/* 258 */         bfl.a(4.0F, 4.0F, 4.0F);
/* 259 */         int n = m << 24 & 0xFF000000;
/* 260 */         f().a(this.x, (-f().a(this.x) / 2), -10.0F, 0xFFFFFF | n, true);
/* 261 */         bfl.F();
/* 262 */         bfl.E();
/* 263 */         bfl.a(2.0F, 2.0F, 2.0F);
/* 264 */         f().a(this.y, (-f().a(this.y) / 2), 5.0F, 0xFFFFFF | n, true);
/* 265 */         bfl.F();
/* 266 */         bfl.k();
/* 267 */         bfl.F();
/*     */       } 
/* 269 */       this.j.A.b();
/*     */     } 
/*     */     
/* 272 */     auo auo = this.j.f.Z();
/* 273 */     auk auk1 = null;
/* 274 */     aul aul = auo.h(this.j.h.e_());
/* 275 */     if (aul != null) {
/* 276 */       int m = aul.l().b();
/* 277 */       if (m >= 0) {
/* 278 */         auk1 = auo.a(3 + m);
/*     */       }
/*     */     } 
/* 281 */     auk auk2 = (auk1 != null) ? auk1 : auo.a(1);
/* 282 */     if (auk2 != null) {
/* 283 */       a(auk2, avr);
/*     */     }
/*     */     
/* 286 */     bfl.l();
/* 287 */     bfl.a(770, 771, 1, 0);
/* 288 */     bfl.c();
/*     */     
/* 290 */     bfl.E();
/* 291 */     bfl.b(0.0F, (j - 48), 0.0F);
/*     */     
/* 293 */     this.j.A.a("chat");
/* 294 */     this.l.a(this.n);
/* 295 */     this.j.A.b();
/*     */     
/* 297 */     bfl.F();
/*     */     
/* 299 */     auk2 = auo.a(0);
/* 300 */     if (this.j.t.ak.d() && (!this.j.E() || this.j.h.a.d().size() > 1 || auk2 != null)) {
/* 301 */       this.v.a(true);
/* 302 */       this.v.a(i, auo, auk2);
/*     */     } else {
/* 304 */       this.v.a(false);
/*     */     } 
/*     */     
/* 307 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 308 */     bfl.f();
/* 309 */     bfl.d();
/*     */   }
/*     */   
/*     */   protected void a(avr ☃, float f) {
/* 313 */     if (!(this.j.ac() instanceof wn)) {
/*     */       return;
/*     */     }
/*     */     
/* 317 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 318 */     this.j.P().a(g);
/*     */     
/* 320 */     wn wn = (wn)this.j.ac();
/* 321 */     int i = ☃.a() / 2;
/* 322 */     float f1 = this.e;
/* 323 */     this.e = -90.0F;
/* 324 */     b(i - 91, ☃.b() - 22, 0, 0, 182, 22);
/* 325 */     b(i - 91 - 1 + wn.bi.c * 20, ☃.b() - 22 - 1, 0, 22, 24, 22);
/* 326 */     this.e = f1;
/*     */     
/* 328 */     bfl.B();
/* 329 */     bfl.l();
/* 330 */     bfl.a(770, 771, 1, 0);
/* 331 */     avc.c();
/*     */     
/* 333 */     for (int j = 0; j < 9; j++) {
/* 334 */       int k = ☃.a() / 2 - 90 + j * 20 + 2;
/* 335 */       int m = ☃.b() - 16 - 3;
/* 336 */       a(j, k, m, f, wn);
/*     */     } 
/*     */     
/* 339 */     avc.a();
/* 340 */     bfl.C();
/* 341 */     bfl.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(avr ☃, int i) {
/* 346 */     this.j.A.a("jumpBar");
/* 347 */     this.j.P().a(avp.d);
/* 348 */     float f = this.j.h.z();
/* 349 */     int j = 182;
/*     */     
/* 351 */     int k = (int)(f * (j + 1));
/*     */     
/* 353 */     int m = ☃.b() - 32 + 3;
/* 354 */     b(i, m, 0, 84, j, 5);
/* 355 */     if (k > 0) {
/* 356 */       b(i, m, 0, 89, k, 5);
/*     */     }
/* 358 */     this.j.A.b();
/*     */   }
/*     */   
/*     */   public void b(avr ☃, int i) {
/* 362 */     this.j.A.a("expBar");
/* 363 */     this.j.P().a(avp.d);
/* 364 */     int j = this.j.h.ck();
/* 365 */     if (j > 0) {
/* 366 */       int k = 182;
/*     */       
/* 368 */       int m = (int)(this.j.h.bD * (k + 1));
/*     */       
/* 370 */       int n = ☃.b() - 32 + 3;
/* 371 */       b(i, n, 0, 64, k, 5);
/* 372 */       if (m > 0) {
/* 373 */         b(i, n, 0, 69, m, 5);
/*     */       }
/*     */     } 
/* 376 */     this.j.A.b();
/*     */     
/* 378 */     if (this.j.h.bB > 0) {
/* 379 */       this.j.A.a("expLevel");
/* 380 */       int k = 8453920;
/*     */       
/* 382 */       String str = "" + this.j.h.bB;
/* 383 */       int m = (☃.a() - f().a(str)) / 2;
/* 384 */       int n = ☃.b() - 31 - 4;
/*     */       
/* 386 */       int i1 = 0;
/* 387 */       f().a(str, m + 1, n, 0);
/* 388 */       f().a(str, m - 1, n, 0);
/* 389 */       f().a(str, m, n + 1, 0);
/* 390 */       f().a(str, m, n - 1, 0);
/* 391 */       f().a(str, m, n, k);
/* 392 */       this.j.A.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(avr ☃) {
/* 397 */     this.j.A.a("selectedItemName");
/*     */     
/* 399 */     if (this.r > 0 && this.s != null) {
/* 400 */       String str = this.s.q();
/* 401 */       if (this.s.s()) {
/* 402 */         str = a.u + str;
/*     */       }
/*     */       
/* 405 */       int i = (☃.a() - f().a(str)) / 2;
/* 406 */       int j = ☃.b() - 59;
/* 407 */       if (!this.j.c.b())
/*     */       {
/* 409 */         j += 14;
/*     */       }
/*     */       
/* 412 */       int k = (int)(this.r * 256.0F / 10.0F);
/* 413 */       if (k > 255) {
/* 414 */         k = 255;
/*     */       }
/* 416 */       if (k > 0) {
/* 417 */         bfl.E();
/* 418 */         bfl.l();
/* 419 */         bfl.a(770, 771, 1, 0);
/* 420 */         f().a(str, i, j, 16777215 + (k << 24));
/* 421 */         bfl.k();
/* 422 */         bfl.F();
/*     */       } 
/*     */     } 
/*     */     
/* 426 */     this.j.A.b();
/*     */   }
/*     */   
/*     */   public void b(avr ☃) {
/* 430 */     this.j.A.a("demo");
/* 431 */     String str = "";
/*     */     
/* 433 */     if (this.j.f.K() >= 120500L) {
/* 434 */       str = bnq.a("demo.demoExpired", new Object[0]);
/*     */     } else {
/* 436 */       str = bnq.a("demo.remainingTime", new Object[] { nx.a((int)(120500L - this.j.f.K())) });
/*     */     } 
/*     */     
/* 439 */     int i = f().a(str);
/* 440 */     f().a(str, (☃.a() - i - 10), 5.0F, 16777215);
/* 441 */     this.j.A.b();
/*     */   }
/*     */   
/*     */   protected boolean b() {
/* 445 */     if (this.j.t.aB && !this.j.h.cq() && !this.j.t.w) {
/* 446 */       return false;
/*     */     }
/*     */     
/* 449 */     if (this.j.c.a()) {
/* 450 */       if (this.j.i != null)
/* 451 */         return true; 
/* 452 */       if (this.j.s != null && this.j.s.a == auh.a.b) {
/* 453 */         cj ☃ = this.j.s.a();
/* 454 */         if (this.j.f.s(☃) instanceof og) {
/* 455 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 459 */       return false;
/*     */     } 
/*     */     
/* 462 */     return true;
/*     */   }
/*     */   
/*     */   public void c(avr ☃) {
/* 466 */     this.m.a(☃.a() - 10, 10);
/*     */   }
/*     */   
/*     */   private void a(auk ☃, avr avr1) {
/* 470 */     auo auo = ☃.a();
/* 471 */     Collection<aum> collection = auo.i(☃);
/* 472 */     List<aum> list = Lists.newArrayList(Iterables.filter(collection, new Predicate<aum>(this)
/*     */           {
/*     */             public boolean a(aum ☃) {
/* 475 */               return (☃.e() != null && !☃.e().startsWith("#"));
/*     */             }
/*     */           }));
/* 478 */     if (list.size() > 15) {
/* 479 */       collection = Lists.newArrayList(Iterables.skip(list, collection.size() - 15));
/*     */     } else {
/* 481 */       collection = list;
/*     */     } 
/*     */     
/* 484 */     int i = f().a(☃.d());
/* 485 */     for (Iterator<aum> iterator1 = collection.iterator(); iterator1.hasNext(); ) { aum aum = iterator1.next();
/* 486 */       aul aul = auo.h(aum.e());
/* 487 */       String str = aul.a(aul, aum.e()) + ": " + a.m + aum.c();
/* 488 */       i = Math.max(i, f().a(str)); }
/*     */ 
/*     */     
/* 491 */     int j = collection.size() * (f()).a;
/* 492 */     int k = avr1.b() / 2 + j / 3;
/* 493 */     int m = 3;
/* 494 */     int n = avr1.a() - i - m;
/* 495 */     int i1 = 0;
/*     */     
/* 497 */     for (Iterator<aum> iterator2 = collection.iterator(); iterator2.hasNext(); ) { aum aum = iterator2.next();
/* 498 */       i1++;
/* 499 */       aul aul = auo.h(aum.e());
/* 500 */       String str1 = aul.a(aul, aum.e());
/* 501 */       String str2 = a.m + "" + aum.c();
/* 502 */       int i2 = n;
/* 503 */       int i3 = k - i1 * (f()).a;
/* 504 */       int i4 = avr1.a() - m + 2;
/*     */       
/* 506 */       a(i2 - 2, i3, i4, i3 + (f()).a, 1342177280);
/* 507 */       f().a(str1, i2, i3, 553648127);
/* 508 */       f().a(str2, i4 - f().a(str2), i3, 553648127);
/*     */       
/* 510 */       if (i1 == collection.size()) {
/* 511 */         String str = ☃.d();
/* 512 */         a(i2 - 2, i3 - (f()).a - 1, i4, i3 - 1, 1610612736);
/* 513 */         a(i2 - 2, i3 - 1, i4, i3, 1342177280);
/* 514 */         f().a(str, i2 + i / 2 - f().a(str) / 2, i3 - (f()).a, 553648127);
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   private void d(avr ☃) {
/* 520 */     if (!(this.j.ac() instanceof wn)) {
/*     */       return;
/*     */     }
/*     */     
/* 524 */     wn wn = (wn)this.j.ac();
/* 525 */     int i = ns.f(wn.bn());
/*     */     
/* 527 */     boolean bool1 = (this.F > this.n && (this.F - this.n) / 3L % 2L == 1L);
/* 528 */     if (i < this.C && wn.Z > 0) {
/* 529 */       this.E = ave.J();
/* 530 */       this.F = (this.n + 20);
/* 531 */     } else if (i > this.C && wn.Z > 0) {
/* 532 */       this.E = ave.J();
/* 533 */       this.F = (this.n + 10);
/*     */     } 
/* 535 */     if (ave.J() - this.E > 1000L) {
/* 536 */       this.C = i;
/* 537 */       this.D = i;
/* 538 */       this.E = ave.J();
/*     */     } 
/* 540 */     this.C = i;
/* 541 */     int j = this.D;
/* 542 */     this.i.setSeed((this.n * 312871));
/*     */     
/* 544 */     boolean bool2 = false;
/* 545 */     xg xg = wn.cl();
/* 546 */     int k = xg.a();
/* 547 */     int m = xg.b();
/* 548 */     qc qc = wn.a(vy.a);
/*     */     
/* 550 */     int n = ☃.a() / 2 - 91;
/* 551 */     int i1 = ☃.a() / 2 + 91;
/*     */     
/* 553 */     int i2 = ☃.b() - 39;
/* 554 */     float f1 = (float)qc.e();
/* 555 */     float f2 = wn.bN();
/* 556 */     int i3 = ns.f((f1 + f2) / 2.0F / 10.0F);
/* 557 */     int i4 = Math.max(10 - i3 - 2, 3);
/* 558 */     int i5 = i2 - (i3 - 1) * i4 - 10;
/* 559 */     float f3 = f2;
/*     */     
/* 561 */     int i6 = wn.br();
/* 562 */     int i7 = -1;
/* 563 */     if (wn.a(pe.l)) {
/* 564 */       i7 = this.n % ns.f(f1 + 5.0F);
/*     */     }
/*     */ 
/*     */     
/* 568 */     this.j.A.a("armor"); int i8;
/* 569 */     for (i8 = 0; i8 < 10; i8++) {
/* 570 */       if (i6 > 0) {
/* 571 */         int i9 = n + i8 * 8;
/* 572 */         if (i8 * 2 + 1 < i6) {
/* 573 */           b(i9, i5, 34, 9, 9, 9);
/*     */         }
/* 575 */         if (i8 * 2 + 1 == i6) {
/* 576 */           b(i9, i5, 25, 9, 9, 9);
/*     */         }
/* 578 */         if (i8 * 2 + 1 > i6) {
/* 579 */           b(i9, i5, 16, 9, 9, 9);
/*     */         }
/*     */       } 
/*     */     } 
/* 583 */     this.j.A.c("health");
/* 584 */     for (i8 = ns.f((f1 + f2) / 2.0F) - 1; i8 >= 0; i8--) {
/* 585 */       int i9 = 16;
/* 586 */       if (wn.a(pe.u)) {
/* 587 */         i9 += 36;
/* 588 */       } else if (wn.a(pe.v)) {
/* 589 */         i9 += 72;
/*     */       } 
/*     */       
/* 592 */       int i10 = 0;
/* 593 */       if (bool1) {
/* 594 */         i10 = 1;
/*     */       }
/* 596 */       int i11 = ns.f((i8 + 1) / 10.0F) - 1;
/* 597 */       int i12 = n + i8 % 10 * 8;
/* 598 */       int i13 = i2 - i11 * i4;
/* 599 */       if (i <= 4) {
/* 600 */         i13 += this.i.nextInt(2);
/*     */       }
/*     */       
/* 603 */       if (i8 == i7) {
/* 604 */         i13 -= 2;
/*     */       }
/*     */       
/* 607 */       int i14 = 0;
/* 608 */       if (wn.o.P().t()) {
/* 609 */         i14 = 5;
/*     */       }
/*     */       
/* 612 */       b(i12, i13, 16 + i10 * 9, 9 * i14, 9, 9);
/* 613 */       if (bool1) {
/* 614 */         if (i8 * 2 + 1 < j) {
/* 615 */           b(i12, i13, i9 + 54, 9 * i14, 9, 9);
/*     */         }
/* 617 */         if (i8 * 2 + 1 == j) {
/* 618 */           b(i12, i13, i9 + 63, 9 * i14, 9, 9);
/*     */         }
/*     */       } 
/*     */       
/* 622 */       if (f3 > 0.0F) {
/* 623 */         if (f3 == f2 && f2 % 2.0F == 1.0F) {
/* 624 */           b(i12, i13, i9 + 153, 9 * i14, 9, 9);
/*     */         } else {
/* 626 */           b(i12, i13, i9 + 144, 9 * i14, 9, 9);
/*     */         } 
/* 628 */         f3 -= 2.0F;
/*     */       } else {
/* 630 */         if (i8 * 2 + 1 < i) {
/* 631 */           b(i12, i13, i9 + 36, 9 * i14, 9, 9);
/*     */         }
/* 633 */         if (i8 * 2 + 1 == i) {
/* 634 */           b(i12, i13, i9 + 45, 9 * i14, 9, 9);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 639 */     pk pk = wn.m;
/* 640 */     if (pk == null) {
/*     */       
/* 642 */       this.j.A.c("food");
/* 643 */       for (int i9 = 0; i9 < 10; i9++) {
/* 644 */         int i10 = i2;
/*     */         
/* 646 */         int i11 = 16;
/* 647 */         int i12 = 0;
/* 648 */         if (wn.a(pe.s)) {
/* 649 */           i11 += 36;
/* 650 */           i12 = 13;
/*     */         } 
/*     */         
/* 653 */         if (wn.cl().e() <= 0.0F && 
/* 654 */           this.n % (k * 3 + 1) == 0) {
/* 655 */           i10 += this.i.nextInt(3) - 1;
/*     */         }
/*     */ 
/*     */         
/* 659 */         if (bool2) {
/* 660 */           i12 = 1;
/*     */         }
/* 662 */         int i13 = i1 - i9 * 8 - 9;
/* 663 */         b(i13, i10, 16 + i12 * 9, 27, 9, 9);
/* 664 */         if (bool2) {
/* 665 */           if (i9 * 2 + 1 < m) {
/* 666 */             b(i13, i10, i11 + 54, 27, 9, 9);
/*     */           }
/* 668 */           if (i9 * 2 + 1 == m) {
/* 669 */             b(i13, i10, i11 + 63, 27, 9, 9);
/*     */           }
/*     */         } 
/* 672 */         if (i9 * 2 + 1 < k) {
/* 673 */           b(i13, i10, i11 + 36, 27, 9, 9);
/*     */         }
/* 675 */         if (i9 * 2 + 1 == k) {
/* 676 */           b(i13, i10, i11 + 45, 27, 9, 9);
/*     */         }
/*     */       } 
/* 679 */     } else if (pk instanceof pr) {
/*     */       
/* 681 */       this.j.A.c("mountHealth");
/*     */       
/* 683 */       pr pr = (pr)pk;
/* 684 */       int i9 = (int)Math.ceil(pr.bn());
/* 685 */       float f = pr.bu();
/* 686 */       int i10 = (int)(f + 0.5F) / 2;
/* 687 */       if (i10 > 30) {
/* 688 */         i10 = 30;
/*     */       }
/*     */       
/* 691 */       int i11 = i2;
/* 692 */       int i12 = 0;
/*     */       
/* 694 */       while (i10 > 0) {
/* 695 */         int i13 = Math.min(i10, 10);
/* 696 */         i10 -= i13;
/*     */         
/* 698 */         for (int i14 = 0; i14 < i13; i14++) {
/* 699 */           int i15 = 52;
/* 700 */           int i16 = 0;
/*     */           
/* 702 */           if (bool2) {
/* 703 */             i16 = 1;
/*     */           }
/* 705 */           int i17 = i1 - i14 * 8 - 9;
/* 706 */           b(i17, i11, i15 + i16 * 9, 9, 9, 9);
/* 707 */           if (i14 * 2 + 1 + i12 < i9) {
/* 708 */             b(i17, i11, i15 + 36, 9, 9, 9);
/*     */           }
/* 710 */           if (i14 * 2 + 1 + i12 == i9) {
/* 711 */             b(i17, i11, i15 + 45, 9, 9, 9);
/*     */           }
/*     */         } 
/* 714 */         i11 -= 10;
/* 715 */         i12 += 20;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 720 */     this.j.A.c("air");
/* 721 */     if (wn.a(arm.h)) {
/* 722 */       int i9 = this.j.h.az();
/*     */       
/* 724 */       int i10 = ns.f((i9 - 2) * 10.0D / 300.0D);
/* 725 */       int i11 = ns.f(i9 * 10.0D / 300.0D) - i10;
/*     */       
/* 727 */       for (int i12 = 0; i12 < i10 + i11; i12++) {
/* 728 */         if (i12 < i10) {
/* 729 */           b(i1 - i12 * 8 - 9, i5, 16, 18, 9, 9);
/*     */         } else {
/* 731 */           b(i1 - i12 * 8 - 9, i5, 25, 18, 9, 9);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 736 */     this.j.A.b();
/*     */   }
/*     */   
/*     */   private void j() {
/* 740 */     if (bfc.c == null || bfc.b <= 0) {
/*     */       return;
/*     */     }
/* 743 */     bfc.b--;
/*     */     
/* 745 */     avn ☃ = this.j.k;
/*     */     
/* 747 */     avr avr = new avr(this.j);
/* 748 */     int i = avr.a();
/*     */     
/* 750 */     int j = 182;
/* 751 */     int k = i / 2 - j / 2;
/*     */     
/* 753 */     int m = (int)(bfc.a * (j + 1));
/*     */     
/* 755 */     int n = 12;
/* 756 */     b(k, n, 0, 74, j, 5);
/* 757 */     b(k, n, 0, 74, j, 5);
/* 758 */     if (m > 0) {
/* 759 */       b(k, n, 0, 79, m, 5);
/*     */     }
/* 761 */     String str = bfc.c;
/* 762 */     f().a(str, (i / 2 - f().a(str) / 2), (n - 10), 16777215);
/* 763 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 764 */     this.j.P().a(d);
/*     */   }
/*     */   
/*     */   private void e(avr ☃) {
/* 768 */     bfl.i();
/* 769 */     bfl.a(false);
/* 770 */     bfl.a(770, 771, 1, 0);
/* 771 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 772 */     bfl.c();
/*     */     
/* 774 */     this.j.P().a(h);
/* 775 */     bfx bfx = bfx.a();
/* 776 */     bfd bfd = bfx.c();
/* 777 */     bfd.a(7, bms.g);
/* 778 */     bfd.b(0.0D, ☃.b(), -90.0D).a(0.0D, 1.0D).d();
/* 779 */     bfd.b(☃.a(), ☃.b(), -90.0D).a(1.0D, 1.0D).d();
/* 780 */     bfd.b(☃.a(), 0.0D, -90.0D).a(1.0D, 0.0D).d();
/* 781 */     bfd.b(0.0D, 0.0D, -90.0D).a(0.0D, 0.0D).d();
/* 782 */     bfx.b();
/* 783 */     bfl.a(true);
/* 784 */     bfl.j();
/* 785 */     bfl.d();
/* 786 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void a(float ☃, avr avr1) {
/* 790 */     ☃ = 1.0F - ☃;
/* 791 */     ☃ = ns.a(☃, 0.0F, 1.0F);
/*     */     
/* 793 */     ams ams = this.j.f.af();
/* 794 */     float f = (float)ams.a(this.j.h);
/* 795 */     double d1 = Math.min(ams.o() * ams.p() * 1000.0D, Math.abs(ams.j() - ams.h()));
/* 796 */     double d2 = Math.max(ams.q(), d1);
/*     */     
/* 798 */     if (f < d2) {
/* 799 */       f = 1.0F - (float)(f / d2);
/*     */     } else {
/* 801 */       f = 0.0F;
/*     */     } 
/*     */     
/* 804 */     this.a = (float)(this.a + (☃ - this.a) * 0.01D);
/*     */     
/* 806 */     bfl.i();
/* 807 */     bfl.a(false);
/* 808 */     bfl.a(0, 769, 1, 0);
/*     */     
/* 810 */     if (f > 0.0F) {
/* 811 */       bfl.c(0.0F, f, f, 1.0F);
/*     */     } else {
/* 813 */       bfl.c(this.a, this.a, this.a, 1.0F);
/*     */     } 
/*     */     
/* 816 */     this.j.P().a(f);
/* 817 */     bfx bfx = bfx.a();
/* 818 */     bfd bfd = bfx.c();
/* 819 */     bfd.a(7, bms.g);
/* 820 */     bfd.b(0.0D, avr1.b(), -90.0D).a(0.0D, 1.0D).d();
/* 821 */     bfd.b(avr1.a(), avr1.b(), -90.0D).a(1.0D, 1.0D).d();
/* 822 */     bfd.b(avr1.a(), 0.0D, -90.0D).a(1.0D, 0.0D).d();
/* 823 */     bfd.b(0.0D, 0.0D, -90.0D).a(0.0D, 0.0D).d();
/* 824 */     bfx.b();
/* 825 */     bfl.a(true);
/* 826 */     bfl.j();
/* 827 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 828 */     bfl.a(770, 771, 1, 0);
/*     */   }
/*     */   
/*     */   private void b(float ☃, avr avr1) {
/* 832 */     if (☃ < 1.0F) {
/* 833 */       ☃ *= ☃;
/* 834 */       ☃ *= ☃;
/* 835 */       ☃ = ☃ * 0.8F + 0.2F;
/*     */     } 
/*     */     
/* 838 */     bfl.c();
/* 839 */     bfl.i();
/* 840 */     bfl.a(false);
/* 841 */     bfl.a(770, 771, 1, 0);
/* 842 */     bfl.c(1.0F, 1.0F, 1.0F, ☃);
/*     */     
/* 844 */     this.j.P().a(bmh.g);
/* 845 */     bmi bmi = this.j.ae().a().a(afi.aY.Q());
/*     */     
/* 847 */     float f1 = bmi.e();
/* 848 */     float f2 = bmi.g();
/* 849 */     float f3 = bmi.f();
/* 850 */     float f4 = bmi.h();
/* 851 */     bfx bfx = bfx.a();
/* 852 */     bfd bfd = bfx.c();
/* 853 */     bfd.a(7, bms.g);
/* 854 */     bfd.b(0.0D, avr1.b(), -90.0D).a(f1, f4).d();
/* 855 */     bfd.b(avr1.a(), avr1.b(), -90.0D).a(f3, f4).d();
/* 856 */     bfd.b(avr1.a(), 0.0D, -90.0D).a(f3, f2).d();
/* 857 */     bfd.b(0.0D, 0.0D, -90.0D).a(f1, f2).d();
/* 858 */     bfx.b();
/* 859 */     bfl.a(true);
/* 860 */     bfl.j();
/* 861 */     bfl.d();
/* 862 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j, float f, wn wn1) {
/* 866 */     zx zx1 = wn1.bi.a[☃];
/* 867 */     if (zx1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 871 */     float f1 = zx1.c - f;
/* 872 */     if (f1 > 0.0F) {
/* 873 */       bfl.E();
/* 874 */       float f2 = 1.0F + f1 / 5.0F;
/* 875 */       bfl.b((i + 8), (j + 12), 0.0F);
/* 876 */       bfl.a(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
/* 877 */       bfl.b(-(i + 8), -(j + 12), 0.0F);
/*     */     } 
/*     */     
/* 880 */     this.k.b(zx1, i, j);
/*     */     
/* 882 */     if (f1 > 0.0F) {
/* 883 */       bfl.F();
/*     */     }
/*     */     
/* 886 */     this.k.a(this.j.k, zx1, i, j);
/*     */   }
/*     */   
/*     */   public void c() {
/* 890 */     if (this.p > 0) {
/* 891 */       this.p--;
/*     */     }
/* 893 */     if (this.w > 0) {
/* 894 */       this.w--;
/* 895 */       if (this.w <= 0) {
/* 896 */         this.x = "";
/* 897 */         this.y = "";
/*     */       } 
/*     */     } 
/* 900 */     this.n++;
/*     */     
/* 902 */     this.m.a();
/*     */     
/* 904 */     if (this.j.h != null) {
/* 905 */       zx ☃ = this.j.h.bi.h();
/*     */       
/* 907 */       if (☃ == null) {
/* 908 */         this.r = 0;
/* 909 */       } else if (this.s == null || ☃.b() != this.s.b() || !zx.a(☃, this.s) || (!☃.e() && ☃.i() != this.s.i())) {
/* 910 */         this.r = 40;
/* 911 */       } else if (this.r > 0) {
/* 912 */         this.r--;
/*     */       } 
/* 914 */       this.s = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 919 */     a(bnq.a("record.nowPlaying", new Object[] { ☃ }), true);
/*     */   }
/*     */   
/*     */   public void a(String ☃, boolean bool) {
/* 923 */     this.o = ☃;
/* 924 */     this.p = 60;
/* 925 */     this.q = bool;
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1, int i, int j, int k) {
/* 929 */     if (☃ == null && str1 == null && i < 0 && j < 0 && k < 0) {
/* 930 */       this.x = "";
/* 931 */       this.y = "";
/* 932 */       this.w = 0;
/*     */       
/*     */       return;
/*     */     } 
/* 936 */     if (☃ != null) {
/* 937 */       this.x = ☃;
/* 938 */       this.w = this.z + this.A + this.B;
/*     */       return;
/*     */     } 
/* 941 */     if (str1 != null) {
/* 942 */       this.y = str1;
/*     */       
/*     */       return;
/*     */     } 
/* 946 */     if (i >= 0) {
/* 947 */       this.z = i;
/*     */     }
/* 949 */     if (j >= 0) {
/* 950 */       this.A = j;
/*     */     }
/* 952 */     if (k >= 0) {
/* 953 */       this.B = k;
/*     */     }
/* 955 */     if (this.w > 0) {
/* 956 */       this.w = this.z + this.A + this.B;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(eu ☃, boolean bool) {
/* 961 */     a(☃.c(), bool);
/*     */   }
/*     */   
/*     */   public avt d() {
/* 965 */     return this.l;
/*     */   }
/*     */   
/*     */   public int e() {
/* 969 */     return this.n;
/*     */   }
/*     */   
/*     */   public avn f() {
/* 973 */     return this.j.k;
/*     */   }
/*     */   
/*     */   public awm g() {
/* 977 */     return this.u;
/*     */   }
/*     */   
/*     */   public awh h() {
/* 981 */     return this.v;
/*     */   }
/*     */   
/*     */   public void i() {
/* 985 */     this.v.a();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */