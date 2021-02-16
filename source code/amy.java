/*      */ import com.google.common.base.Predicate;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Queues;
/*      */ import java.util.Arrays;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.concurrent.Callable;
/*      */ import java.util.concurrent.ConcurrentLinkedQueue;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class amy
/*      */ {
/*   42 */   private static final Logger c = LogManager.getLogger();
/*      */ 
/*      */ 
/*      */   
/*   46 */   private final amz[] d = new amz[16];
/*   47 */   private final byte[] e = new byte[256];
/*   48 */   private final int[] f = new int[256];
/*   49 */   private final boolean[] g = new boolean[256];
/*      */   private boolean h;
/*      */   private final adm i;
/*      */   private final int[] j;
/*      */   public final int a;
/*      */   public final int b;
/*      */   private boolean k;
/*   56 */   private final Map<cj, akw> l = Maps.newHashMap();
/*      */   
/*      */   private final ne<pk>[] m;
/*      */   
/*      */   private boolean n;
/*      */   
/*      */   private boolean o;
/*      */   private boolean p;
/*      */   private boolean q;
/*      */   private boolean r;
/*      */   private long s;
/*      */   private int t;
/*      */   private long u;
/*   69 */   private int v = 4096;
/*      */   
/*   71 */   private ConcurrentLinkedQueue<cj> w = Queues.newConcurrentLinkedQueue();
/*      */   
/*      */   public amy(adm ☃, int i, int j) {
/*   74 */     this.m = (ne<pk>[])new ne[16];
/*   75 */     this.i = ☃;
/*   76 */     this.a = i;
/*   77 */     this.b = j;
/*   78 */     this.j = new int[256];
/*   79 */     for (int k = 0; k < this.m.length; k++) {
/*   80 */       this.m[k] = new ne<pk>(pk.class);
/*      */     }
/*   82 */     Arrays.fill(this.f, -999);
/*   83 */     Arrays.fill(this.e, (byte)-1);
/*      */   }
/*      */   
/*      */   public amy(adm ☃, ans ans1, int i, int j) {
/*   87 */     this(☃, i, j);
/*      */     
/*   89 */     int k = 256;
/*   90 */     boolean bool = !☃.t.o();
/*   91 */     for (int m = 0; m < 16; m++) {
/*   92 */       for (int n = 0; n < 16; n++) {
/*   93 */         for (int i1 = 0; i1 < k; i1++) {
/*   94 */           int i2 = m * k * 16 | n * k | i1;
/*   95 */           alz alz = ans1.a(i2);
/*      */           
/*   97 */           if (alz.c().t() != arm.a) {
/*      */ 
/*      */ 
/*      */             
/*  101 */             int i3 = i1 >> 4;
/*  102 */             if (this.d[i3] == null) {
/*  103 */               this.d[i3] = new amz(i3 << 4, bool);
/*      */             }
/*  105 */             this.d[i3].a(m, i1 & 0xF, n, alz);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   public boolean a(int ☃, int i) {
/*  112 */     return (☃ == this.a && i == this.b);
/*      */   }
/*      */   
/*      */   public int f(cj ☃) {
/*  116 */     return b(☃.n() & 0xF, ☃.p() & 0xF);
/*      */   }
/*      */   
/*      */   public int b(int ☃, int i) {
/*  120 */     return this.j[i << 4 | ☃];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int g() {
/*  135 */     for (int ☃ = this.d.length - 1; ☃ >= 0; ☃--) {
/*  136 */       if (this.d[☃] != null) {
/*  137 */         return this.d[☃].d();
/*      */       }
/*      */     } 
/*  140 */     return 0;
/*      */   }
/*      */   
/*      */   public amz[] h() {
/*  144 */     return this.d;
/*      */   }
/*      */   
/*      */   protected void a() {
/*  148 */     int ☃ = g();
/*  149 */     this.t = Integer.MAX_VALUE;
/*      */     
/*  151 */     for (int i = 0; i < 16; i++) {
/*  152 */       for (int j = 0; j < 16; j++) {
/*  153 */         this.f[i + (j << 4)] = -999;
/*      */         
/*  155 */         for (int k = ☃ + 16; k > 0; k--) {
/*  156 */           afh afh = f(i, k - 1, j);
/*  157 */           if (afh.p() != 0) {
/*  158 */             this.j[j << 4 | i] = k;
/*  159 */             if (k < this.t) {
/*  160 */               this.t = k;
/*      */             }
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*  168 */     this.q = true;
/*      */   }
/*      */   
/*      */   public void b() {
/*  172 */     int ☃ = g();
/*  173 */     this.t = Integer.MAX_VALUE;
/*      */     
/*  175 */     for (int i = 0; i < 16; i++) {
/*  176 */       for (int j = 0; j < 16; j++) {
/*  177 */         this.f[i + (j << 4)] = -999;
/*      */         int k;
/*  179 */         for (k = ☃ + 16; k > 0; k--) {
/*  180 */           if (e(i, k - 1, j) != 0) {
/*  181 */             this.j[j << 4 | i] = k;
/*  182 */             if (k < this.t) {
/*  183 */               this.t = k;
/*      */             }
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*  189 */         if (!this.i.t.o()) {
/*  190 */           k = 15;
/*  191 */           int m = ☃ + 16 - 1;
/*      */           do {
/*  193 */             int n = e(i, m, j);
/*  194 */             if (n == 0 && k != 15) {
/*  195 */               n = 1;
/*      */             }
/*  197 */             k -= n;
/*      */             
/*  199 */             if (k <= 0)
/*  200 */               continue;  amz amz1 = this.d[m >> 4];
/*  201 */             if (amz1 == null)
/*  202 */               continue;  amz1.a(i, m & 0xF, j, k);
/*  203 */             this.i.n(new cj((this.a << 4) + i, m, (this.b << 4) + j));
/*      */ 
/*      */             
/*  206 */             --m;
/*  207 */           } while (m > 0 && k > 0);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  212 */     this.q = true;
/*      */   }
/*      */   
/*      */   private void d(int ☃, int i) {
/*  216 */     this.g[☃ + i * 16] = true;
/*  217 */     this.k = true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void h(boolean ☃) {
/*  223 */     this.i.B.a("recheckGaps");
/*  224 */     if (this.i.a(new cj(this.a * 16 + 8, 0, this.b * 16 + 8), 16)) {
/*  225 */       for (int i = 0; i < 16; i++) {
/*  226 */         for (int j = 0; j < 16; j++) {
/*  227 */           if (this.g[i + j * 16]) {
/*  228 */             this.g[i + j * 16] = false;
/*  229 */             int k = b(i, j);
/*  230 */             int m = this.a * 16 + i;
/*  231 */             int n = this.b * 16 + j;
/*      */             
/*  233 */             int i1 = Integer.MAX_VALUE;
/*  234 */             for (Iterator<cq> iterator2 = cq.c.a.iterator(); iterator2.hasNext(); ) { cq cq = iterator2.next();
/*  235 */               i1 = Math.min(i1, this.i.b(m + cq.g(), n + cq.i())); }
/*      */ 
/*      */             
/*  238 */             c(m, n, i1);
/*  239 */             for (Iterator<cq> iterator1 = cq.c.a.iterator(); iterator1.hasNext(); ) { cq cq = iterator1.next();
/*  240 */               c(m + cq.g(), n + cq.i(), k); }
/*      */ 
/*      */             
/*  243 */             if (☃) {
/*  244 */               this.i.B.b();
/*      */               return;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*  250 */       this.k = false;
/*      */     } 
/*  252 */     this.i.B.b();
/*      */   }
/*      */   
/*      */   private void c(int ☃, int i, int j) {
/*  256 */     int k = this.i.m(new cj(☃, 0, i)).o();
/*      */     
/*  258 */     if (k > j) {
/*  259 */       a(☃, i, j, k + 1);
/*  260 */     } else if (k < j) {
/*  261 */       a(☃, i, k, j + 1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(int ☃, int i, int j, int k) {
/*  266 */     if (k > j && 
/*  267 */       this.i.a(new cj(☃, 0, i), 16)) {
/*  268 */       for (int m = j; m < k; m++) {
/*  269 */         this.i.c(ads.a, new cj(☃, m, i));
/*      */       }
/*  271 */       this.q = true;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void d(int ☃, int i, int j) {
/*  277 */     int k = this.j[j << 4 | ☃] & 0xFF;
/*  278 */     int m = k;
/*  279 */     if (i > k) {
/*  280 */       m = i;
/*      */     }
/*      */     
/*  283 */     while (m > 0 && e(☃, m - 1, j) == 0) {
/*  284 */       m--;
/*      */     }
/*  286 */     if (m == k) {
/*      */       return;
/*      */     }
/*      */     
/*  290 */     this.i.a(☃ + this.a * 16, j + this.b * 16, m, k);
/*  291 */     this.j[j << 4 | ☃] = m;
/*      */     
/*  293 */     int n = this.a * 16 + ☃;
/*  294 */     int i1 = this.b * 16 + j;
/*  295 */     if (!this.i.t.o()) {
/*  296 */       if (m < k) {
/*  297 */         for (int i6 = m; i6 < k; i6++) {
/*  298 */           amz amz1 = this.d[i6 >> 4];
/*  299 */           if (amz1 != null) {
/*  300 */             amz1.a(☃, i6 & 0xF, j, 15);
/*  301 */             this.i.n(new cj((this.a << 4) + ☃, i6, (this.b << 4) + j));
/*      */           } 
/*      */         } 
/*      */       } else {
/*  305 */         for (int i6 = k; i6 < m; i6++) {
/*  306 */           amz amz1 = this.d[i6 >> 4];
/*  307 */           if (amz1 != null) {
/*  308 */             amz1.a(☃, i6 & 0xF, j, 0);
/*  309 */             this.i.n(new cj((this.a << 4) + ☃, i6, (this.b << 4) + j));
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  314 */       int i5 = 15;
/*  315 */       while (m > 0 && i5 > 0) {
/*  316 */         m--;
/*  317 */         int i6 = e(☃, m, j);
/*  318 */         if (i6 == 0) {
/*  319 */           i6 = 1;
/*      */         }
/*  321 */         i5 -= i6;
/*  322 */         if (i5 < 0) {
/*  323 */           i5 = 0;
/*      */         }
/*      */         
/*  326 */         amz amz1 = this.d[m >> 4];
/*  327 */         if (amz1 != null) {
/*  328 */           amz1.a(☃, m & 0xF, j, i5);
/*      */         }
/*      */       } 
/*      */     } 
/*  332 */     int i2 = this.j[j << 4 | ☃];
/*  333 */     int i3 = k;
/*  334 */     int i4 = i2;
/*  335 */     if (i4 < i3) {
/*  336 */       int i5 = i3;
/*  337 */       i3 = i4;
/*  338 */       i4 = i5;
/*      */     } 
/*  340 */     if (i2 < this.t) {
/*  341 */       this.t = i2;
/*      */     }
/*  343 */     if (!this.i.t.o()) {
/*  344 */       for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  345 */         a(n + cq.g(), i1 + cq.i(), i3, i4); }
/*      */       
/*  347 */       a(n, i1, i3, i4);
/*      */     } 
/*      */     
/*  350 */     this.q = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int b(cj ☃) {
/*  361 */     return a(☃).p();
/*      */   }
/*      */   
/*      */   private int e(int ☃, int i, int j) {
/*  365 */     return f(☃, i, j).p();
/*      */   }
/*      */   
/*      */   private afh f(int ☃, int i, int j) {
/*  369 */     afh afh = afi.a;
/*  370 */     if (i >= 0 && i >> 4 < this.d.length) {
/*  371 */       amz amz1 = this.d[i >> 4];
/*  372 */       if (amz1 != null) {
/*      */         try {
/*  374 */           afh = amz1.b(☃, i & 0xF, j);
/*  375 */         } catch (Throwable throwable) {
/*  376 */           b b = b.a(throwable, "Getting block");
/*      */           
/*  378 */           throw new e(b);
/*      */         } 
/*      */       }
/*      */     } 
/*  382 */     return afh;
/*      */   }
/*      */   
/*      */   public afh a(int ☃, int i, int j) {
/*      */     try {
/*  387 */       return f(☃ & 0xF, i, j & 0xF);
/*  388 */     } catch (e e) {
/*  389 */       c c = e.a().a("Block being got");
/*  390 */       c.a("Location", new Callable<String>(this, ☃, i, j)
/*      */           {
/*      */             public String a() throws Exception {
/*  393 */               return c.a(new cj(this.d.a * 16 + this.a, this.b, this.d.b * 16 + this.c));
/*      */             }
/*      */           });
/*  396 */       throw e;
/*      */     } 
/*      */   }
/*      */   
/*      */   public afh a(cj ☃) {
/*      */     try {
/*  402 */       return f(☃.n() & 0xF, ☃.o(), ☃.p() & 0xF);
/*  403 */     } catch (e e) {
/*  404 */       c c = e.a().a("Block being got");
/*  405 */       c.a("Location", new Callable<String>(this, ☃)
/*      */           {
/*      */             public String a() throws Exception {
/*  408 */               return c.a(this.a);
/*      */             }
/*      */           });
/*  411 */       throw e;
/*      */     } 
/*      */   }
/*      */   
/*      */   public alz g(cj ☃) {
/*  416 */     if (this.i.G() == adr.g) {
/*  417 */       alz alz = null;
/*  418 */       if (☃.o() == 60) {
/*  419 */         alz = afi.cv.Q();
/*      */       }
/*  421 */       if (☃.o() == 70) {
/*  422 */         alz = anu.b(☃.n(), ☃.p());
/*      */       }
/*  424 */       return (alz == null) ? afi.a.Q() : alz;
/*      */     } 
/*      */     
/*      */     try {
/*  428 */       if (☃.o() >= 0 && ☃.o() >> 4 < this.d.length) {
/*  429 */         amz amz1 = this.d[☃.o() >> 4];
/*  430 */         if (amz1 != null) {
/*  431 */           int i = ☃.n() & 0xF;
/*  432 */           int j = ☃.o() & 0xF;
/*  433 */           int k = ☃.p() & 0xF;
/*  434 */           return amz1.a(i, j, k);
/*      */         } 
/*      */       } 
/*  437 */       return afi.a.Q();
/*  438 */     } catch (Throwable throwable) {
/*  439 */       b b = b.a(throwable, "Getting block state");
/*  440 */       c c = b.a("Block being got");
/*  441 */       c.a("Location", new Callable<String>(this, ☃)
/*      */           {
/*      */             public String a() throws Exception {
/*  444 */               return c.a(this.a);
/*      */             }
/*      */           });
/*  447 */       throw new e(b);
/*      */     } 
/*      */   }
/*      */   
/*      */   private int g(int ☃, int i, int j) {
/*  452 */     if (i >> 4 >= this.d.length) {
/*  453 */       return 0;
/*      */     }
/*  455 */     amz amz1 = this.d[i >> 4];
/*  456 */     if (amz1 != null) {
/*  457 */       return amz1.c(☃, i & 0xF, j);
/*      */     }
/*  459 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int c(cj ☃) {
/*  467 */     return g(☃.n() & 0xF, ☃.o(), ☃.p() & 0xF);
/*      */   }
/*      */ 
/*      */   
/*      */   public alz a(cj ☃, alz alz1) {
/*  472 */     int i = ☃.n() & 0xF;
/*  473 */     int j = ☃.o();
/*  474 */     int k = ☃.p() & 0xF;
/*      */     
/*  476 */     int m = k << 4 | i;
/*      */     
/*  478 */     if (j >= this.f[m] - 1) {
/*  479 */       this.f[m] = -999;
/*      */     }
/*      */     
/*  482 */     int n = this.j[m];
/*      */     
/*  484 */     alz alz2 = g(☃);
/*      */     
/*  486 */     if (alz2 == alz1) {
/*  487 */       return null;
/*      */     }
/*      */     
/*  490 */     afh afh1 = alz1.c();
/*  491 */     afh afh2 = alz2.c();
/*      */     
/*  493 */     amz amz1 = this.d[j >> 4];
/*  494 */     boolean bool = false;
/*  495 */     if (amz1 == null) {
/*      */       
/*  497 */       if (afh1 == afi.a) {
/*  498 */         return null;
/*      */       }
/*      */       
/*  501 */       amz1 = this.d[j >> 4] = new amz(j >> 4 << 4, !this.i.t.o());
/*  502 */       bool = (j >= n);
/*      */     } 
/*      */     
/*  505 */     amz1.a(i, j & 0xF, k, alz1);
/*      */     
/*  507 */     if (afh2 != afh1) {
/*  508 */       if (!this.i.D) {
/*  509 */         afh2.b(this.i, ☃, alz2);
/*  510 */       } else if (afh2 instanceof agq) {
/*  511 */         this.i.t(☃);
/*      */       } 
/*      */     }
/*      */     
/*  515 */     if (amz1.b(i, j & 0xF, k) != afh1) {
/*  516 */       return null;
/*      */     }
/*      */     
/*  519 */     if (bool) {
/*  520 */       b();
/*      */     } else {
/*  522 */       int i1 = afh1.p();
/*  523 */       int i2 = afh2.p();
/*      */       
/*  525 */       if (i1 > 0) {
/*  526 */         if (j >= n) {
/*  527 */           d(i, j + 1, k);
/*      */         }
/*      */       }
/*  530 */       else if (j == n - 1) {
/*  531 */         d(i, j, k);
/*      */       } 
/*      */ 
/*      */       
/*  535 */       if (i1 != i2)
/*      */       {
/*  537 */         if (i1 < i2 || a(ads.a, ☃) > 0 || a(ads.b, ☃) > 0) {
/*  538 */           d(i, k);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/*  543 */     if (afh2 instanceof agq) {
/*  544 */       akw akw = a(☃, a.c);
/*  545 */       if (akw != null) {
/*  546 */         akw.E();
/*      */       }
/*      */     } 
/*      */     
/*  550 */     if (!this.i.D && afh2 != afh1) {
/*  551 */       afh1.c(this.i, ☃, alz1);
/*      */     }
/*  553 */     if (afh1 instanceof agq) {
/*  554 */       akw akw = a(☃, a.c);
/*  555 */       if (akw == null) {
/*  556 */         akw = ((agq)afh1).a(this.i, afh1.c(alz1));
/*  557 */         this.i.a(☃, akw);
/*      */       } 
/*      */       
/*  560 */       if (akw != null) {
/*  561 */         akw.E();
/*      */       }
/*      */     } 
/*      */     
/*  565 */     this.q = true;
/*  566 */     return alz2;
/*      */   }
/*      */   
/*      */   public int a(ads ☃, cj cj1) {
/*  570 */     int i = cj1.n() & 0xF;
/*  571 */     int j = cj1.o();
/*  572 */     int k = cj1.p() & 0xF;
/*      */     
/*  574 */     amz amz1 = this.d[j >> 4];
/*  575 */     if (amz1 == null) {
/*  576 */       if (d(cj1)) {
/*  577 */         return ☃.c;
/*      */       }
/*  579 */       return 0;
/*      */     } 
/*      */ 
/*      */     
/*  583 */     if (☃ == ads.a) {
/*  584 */       if (this.i.t.o()) {
/*  585 */         return 0;
/*      */       }
/*  587 */       return amz1.d(i, j & 0xF, k);
/*  588 */     }  if (☃ == ads.b) {
/*  589 */       return amz1.e(i, j & 0xF, k);
/*      */     }
/*  591 */     return ☃.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ads ☃, cj cj1, int i) {
/*  596 */     int j = cj1.n() & 0xF;
/*  597 */     int k = cj1.o();
/*  598 */     int m = cj1.p() & 0xF;
/*      */     
/*  600 */     amz amz1 = this.d[k >> 4];
/*  601 */     if (amz1 == null) {
/*  602 */       amz1 = this.d[k >> 4] = new amz(k >> 4 << 4, !this.i.t.o());
/*  603 */       b();
/*      */     } 
/*      */     
/*  606 */     this.q = true;
/*  607 */     if (☃ == ads.a) {
/*  608 */       if (!this.i.t.o()) {
/*  609 */         amz1.a(j, k & 0xF, m, i);
/*      */       }
/*  611 */     } else if (☃ == ads.b) {
/*  612 */       amz1.b(j, k & 0xF, m, i);
/*      */     } 
/*      */   }
/*      */   
/*      */   public int a(cj ☃, int i) {
/*  617 */     int j = ☃.n() & 0xF;
/*  618 */     int k = ☃.o();
/*  619 */     int m = ☃.p() & 0xF;
/*  620 */     amz amz1 = this.d[k >> 4];
/*  621 */     if (amz1 == null) {
/*  622 */       if (!this.i.t.o() && i < ads.a.c) {
/*  623 */         return ads.a.c - i;
/*      */       }
/*  625 */       return 0;
/*      */     } 
/*      */     
/*  628 */     int n = this.i.t.o() ? 0 : amz1.d(j, k & 0xF, m);
/*  629 */     n -= i;
/*  630 */     int i1 = amz1.e(j, k & 0xF, m);
/*  631 */     if (i1 > n) {
/*  632 */       n = i1;
/*      */     }
/*      */     
/*  635 */     return n;
/*      */   }
/*      */   
/*      */   public void a(pk ☃) {
/*  639 */     this.r = true;
/*      */     
/*  641 */     int i = ns.c(☃.s / 16.0D);
/*  642 */     int j = ns.c(☃.u / 16.0D);
/*  643 */     if (i != this.a || j != this.b) {
/*  644 */       c.warn("Wrong location! (" + i + ", " + j + ") should be (" + this.a + ", " + this.b + "), " + ☃, new Object[] { ☃ });
/*      */       
/*  646 */       ☃.J();
/*      */     } 
/*  648 */     int k = ns.c(☃.t / 16.0D);
/*  649 */     if (k < 0) {
/*  650 */       k = 0;
/*      */     }
/*  652 */     if (k >= this.m.length) {
/*  653 */       k = this.m.length - 1;
/*      */     }
/*  655 */     ☃.ad = true;
/*  656 */     ☃.ae = this.a;
/*  657 */     ☃.af = k;
/*  658 */     ☃.ag = this.b;
/*  659 */     this.m[k].add(☃);
/*      */   }
/*      */   
/*      */   public void b(pk ☃) {
/*  663 */     a(☃, ☃.af);
/*      */   }
/*      */   
/*      */   public void a(pk ☃, int i) {
/*  667 */     if (i < 0) {
/*  668 */       i = 0;
/*      */     }
/*  670 */     if (i >= this.m.length) {
/*  671 */       i = this.m.length - 1;
/*      */     }
/*  673 */     this.m[i].remove(☃);
/*      */   }
/*      */   
/*      */   public boolean d(cj ☃) {
/*  677 */     int i = ☃.n() & 0xF;
/*  678 */     int j = ☃.o();
/*  679 */     int k = ☃.p() & 0xF;
/*  680 */     return (j >= this.j[k << 4 | i]);
/*      */   }
/*      */ 
/*      */   
/*      */   private akw i(cj ☃) {
/*  685 */     afh afh = a(☃);
/*  686 */     if (!afh.z()) {
/*  687 */       return null;
/*      */     }
/*      */     
/*  690 */     return ((agq)afh).a(this.i, c(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public akw a(cj ☃, a a1) {
/*  695 */     akw akw = this.l.get(☃);
/*  696 */     if (akw == null) {
/*  697 */       if (a1 == a.a) {
/*  698 */         akw = i(☃);
/*  699 */         this.i.a(☃, akw);
/*  700 */       } else if (a1 == a.b) {
/*  701 */         this.w.add(☃);
/*      */       } 
/*  703 */     } else if (akw.x()) {
/*  704 */       this.l.remove(☃);
/*  705 */       return null;
/*      */     } 
/*      */     
/*  708 */     return akw;
/*      */   }
/*      */   
/*      */   public void a(akw ☃) {
/*  712 */     a(☃.v(), ☃);
/*  713 */     if (this.h) {
/*  714 */       this.i.a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(cj ☃, akw akw1) {
/*  719 */     akw1.a(this.i);
/*  720 */     akw1.a(☃);
/*      */     
/*  722 */     if (!(a(☃) instanceof agq)) {
/*      */       return;
/*      */     }
/*  725 */     if (this.l.containsKey(☃)) {
/*  726 */       ((akw)this.l.get(☃)).y();
/*      */     }
/*      */     
/*  729 */     akw1.D();
/*  730 */     this.l.put(☃, akw1);
/*      */   }
/*      */   
/*      */   public void e(cj ☃) {
/*  734 */     if (this.h) {
/*  735 */       akw akw = this.l.remove(☃);
/*  736 */       if (akw != null) {
/*  737 */         akw.y();
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void c() {
/*  743 */     this.h = true;
/*  744 */     this.i.a(this.l.values());
/*  745 */     for (int ☃ = 0; ☃ < this.m.length; ☃++) {
/*  746 */       for (Iterator<pk> iterator = this.m[☃].iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/*  747 */         pk.ah(); }
/*      */       
/*  749 */       this.i.b(this.m[☃]);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void d() {
/*  754 */     this.h = false;
/*  755 */     for (Iterator<akw> iterator = this.l.values().iterator(); iterator.hasNext(); ) { akw akw = iterator.next();
/*  756 */       this.i.b(akw); }
/*      */     
/*  758 */     for (int ☃ = 0; ☃ < this.m.length; ☃++) {
/*  759 */       this.i.c(this.m[☃]);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e() {
/*  764 */     this.q = true;
/*      */   }
/*      */   
/*      */   public void a(pk ☃, aug aug1, List<pk> list, Predicate<? super pk> predicate) {
/*  768 */     int i = ns.c((aug1.b - 2.0D) / 16.0D);
/*  769 */     int j = ns.c((aug1.e + 2.0D) / 16.0D);
/*  770 */     i = ns.a(i, 0, this.m.length - 1);
/*  771 */     j = ns.a(j, 0, this.m.length - 1);
/*      */     
/*  773 */     for (int k = i; k <= j; k++) {
/*  774 */       if (!this.m[k].isEmpty())
/*      */       {
/*      */         
/*  777 */         for (Iterator<pk> iterator = this.m[k].iterator(); iterator.hasNext(); ) { pk pk1 = iterator.next();
/*  778 */           if (pk1.aR().b(aug1) && pk1 != ☃) {
/*  779 */             if (predicate == null || predicate.apply(pk1)) {
/*  780 */               list.add(pk1);
/*      */             }
/*      */             
/*  783 */             pk[] arrayOfPk = pk1.aB();
/*  784 */             if (arrayOfPk != null)
/*  785 */               for (int m = 0; m < arrayOfPk.length; m++) {
/*  786 */                 pk1 = arrayOfPk[m];
/*  787 */                 if (pk1 != ☃ && pk1.aR().b(aug1) && (predicate == null || predicate.apply(pk1))) {
/*  788 */                   list.add(pk1);
/*      */                 }
/*      */               }  
/*      */           }  }
/*      */       
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public <T extends pk> void a(Class<? extends T> ☃, aug aug1, List<T> list, Predicate<? super T> predicate) {
/*  798 */     int i = ns.c((aug1.b - 2.0D) / 16.0D);
/*  799 */     int j = ns.c((aug1.e + 2.0D) / 16.0D);
/*  800 */     i = ns.a(i, 0, this.m.length - 1);
/*  801 */     j = ns.a(j, 0, this.m.length - 1);
/*      */     
/*  803 */     for (int k = i; k <= j; k++) {
/*  804 */       for (Iterator<pk> iterator = this.m[k].<T>c(☃).iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/*  805 */         if (pk.aR().b(aug1) && (
/*  806 */           predicate == null || predicate.apply(pk))) {
/*  807 */           list.add((T)pk);
/*      */         } }
/*      */     
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(boolean ☃) {
/*  815 */     if (☃) {
/*  816 */       if ((this.r && this.i.K() != this.s) || this.q) {
/*  817 */         return true;
/*      */       }
/*      */     }
/*  820 */     else if (this.r && this.i.K() >= this.s + 600L) {
/*  821 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  825 */     return this.q;
/*      */   }
/*      */   
/*      */   public Random a(long ☃) {
/*  829 */     return new Random(this.i.J() + (this.a * this.a * 4987142) + (this.a * 5947611) + (this.b * this.b) * 4392871L + (this.b * 389711) ^ ☃);
/*      */   }
/*      */   
/*      */   public boolean f() {
/*  833 */     return false;
/*      */   }
/*      */   
/*      */   public void a(amv ☃, amv amv1, int i, int j) {
/*  837 */     boolean bool1 = ☃.a(i, j - 1);
/*  838 */     boolean bool2 = ☃.a(i + 1, j);
/*  839 */     boolean bool3 = ☃.a(i, j + 1);
/*  840 */     boolean bool4 = ☃.a(i - 1, j);
/*  841 */     boolean bool5 = ☃.a(i - 1, j - 1);
/*  842 */     boolean bool6 = ☃.a(i + 1, j + 1);
/*  843 */     boolean bool7 = ☃.a(i - 1, j + 1);
/*  844 */     boolean bool8 = ☃.a(i + 1, j - 1);
/*      */     
/*  846 */     if (bool2 && bool3 && bool6) {
/*  847 */       if (!this.n) {
/*  848 */         ☃.a(amv1, i, j);
/*      */       } else {
/*  850 */         ☃.a(amv1, this, i, j);
/*      */       } 
/*      */     }
/*      */     
/*  854 */     if (bool4 && bool3 && bool7) {
/*  855 */       amy amy1 = ☃.d(i - 1, j);
/*  856 */       if (!amy1.n) {
/*  857 */         ☃.a(amv1, i - 1, j);
/*      */       } else {
/*  859 */         ☃.a(amv1, amy1, i - 1, j);
/*      */       } 
/*      */     } 
/*      */     
/*  863 */     if (bool1 && bool2 && bool8) {
/*  864 */       amy amy1 = ☃.d(i, j - 1);
/*  865 */       if (!amy1.n) {
/*  866 */         ☃.a(amv1, i, j - 1);
/*      */       } else {
/*  868 */         ☃.a(amv1, amy1, i, j - 1);
/*      */       } 
/*      */     } 
/*      */     
/*  872 */     if (bool5 && bool1 && bool4) {
/*  873 */       amy amy1 = ☃.d(i - 1, j - 1);
/*  874 */       if (!amy1.n) {
/*  875 */         ☃.a(amv1, i - 1, j - 1);
/*      */       } else {
/*  877 */         ☃.a(amv1, amy1, i - 1, j - 1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public cj h(cj ☃) {
/*  883 */     int i = ☃.n() & 0xF;
/*  884 */     int j = ☃.p() & 0xF;
/*  885 */     int k = i | j << 4;
/*      */     
/*  887 */     cj cj1 = new cj(☃.n(), this.f[k], ☃.p());
/*      */     
/*  889 */     if (cj1.o() == -999) {
/*  890 */       int m = g() + 15;
/*  891 */       cj1 = new cj(☃.n(), m, ☃.p());
/*      */       
/*  893 */       int n = -1;
/*  894 */       while (cj1.o() > 0 && n == -1) {
/*  895 */         afh afh = a(cj1);
/*  896 */         arm arm = afh.t();
/*  897 */         if (!arm.c() && !arm.d()) {
/*  898 */           cj1 = cj1.b(); continue;
/*      */         } 
/*  900 */         n = cj1.o() + 1;
/*      */       } 
/*      */       
/*  903 */       this.f[k] = n;
/*      */     } 
/*      */     
/*  906 */     return new cj(☃.n(), this.f[k], ☃.p());
/*      */   }
/*      */   
/*      */   public void b(boolean ☃) {
/*  910 */     if (this.k && !this.i.t.o() && !☃) {
/*  911 */       h(this.i.D);
/*      */     }
/*  913 */     this.p = true;
/*      */     
/*  915 */     if (!this.o && this.n) {
/*  916 */       n();
/*      */     }
/*      */     
/*  919 */     while (!this.w.isEmpty()) {
/*  920 */       cj cj = this.w.poll();
/*  921 */       if (a(cj, a.c) == null && a(cj).z()) {
/*  922 */         akw akw = i(cj);
/*  923 */         this.i.a(cj, akw);
/*  924 */         this.i.b(cj, cj);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean i() {
/*  930 */     return (this.p && this.n && this.o);
/*      */   }
/*      */   
/*      */   public adg j() {
/*  934 */     return new adg(this.a, this.b);
/*      */   }
/*      */   
/*      */   public boolean c(int ☃, int i) {
/*  938 */     if (☃ < 0) {
/*  939 */       ☃ = 0;
/*      */     }
/*  941 */     if (i >= 256) {
/*  942 */       i = 255;
/*      */     }
/*  944 */     for (int j = ☃; j <= i; j += 16) {
/*  945 */       amz amz1 = this.d[j >> 4];
/*  946 */       if (amz1 != null && !amz1.a()) {
/*  947 */         return false;
/*      */       }
/*      */     } 
/*  950 */     return true;
/*      */   }
/*      */   
/*      */   public void a(amz[] ☃) {
/*  954 */     if (this.d.length != ☃.length) {
/*  955 */       c.warn("Could not set level chunk sections, array length is " + ☃.length + " instead of " + this.d.length);
/*      */       
/*      */       return;
/*      */     } 
/*  959 */     for (int i = 0; i < this.d.length; i++) {
/*  960 */       this.d[i] = ☃[i];
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(byte[] ☃, int i, boolean bool) {
/*  965 */     int j = 0;
/*      */     
/*  967 */     boolean bool1 = !this.i.t.o();
/*      */     int k;
/*  969 */     for (k = 0; k < this.d.length; k++) {
/*  970 */       if ((i & 1 << k) != 0) {
/*  971 */         if (this.d[k] == null) {
/*  972 */           this.d[k] = new amz(k << 4, bool1);
/*      */         }
/*  974 */         char[] arrayOfChar = this.d[k].g();
/*  975 */         for (int m = 0; m < arrayOfChar.length; m++) {
/*  976 */           arrayOfChar[m] = (char)((☃[j + 1] & 0xFF) << 8 | ☃[j] & 0xFF);
/*  977 */           j += 2;
/*      */         }
/*      */       
/*  980 */       } else if (bool && this.d[k] != null) {
/*  981 */         this.d[k] = null;
/*      */       } 
/*      */     } 
/*  984 */     for (k = 0; k < this.d.length; k++) {
/*  985 */       if ((i & 1 << k) != 0 && this.d[k] != null) {
/*  986 */         amw amw = this.d[k].h();
/*  987 */         System.arraycopy(☃, j, amw.a(), 0, (amw.a()).length);
/*  988 */         j += (amw.a()).length;
/*      */       } 
/*      */     } 
/*  991 */     if (bool1) {
/*  992 */       for (k = 0; k < this.d.length; k++) {
/*  993 */         if ((i & 1 << k) != 0 && this.d[k] != null) {
/*  994 */           amw amw = this.d[k].i();
/*  995 */           System.arraycopy(☃, j, amw.a(), 0, (amw.a()).length);
/*  996 */           j += (amw.a()).length;
/*      */         } 
/*      */       } 
/*      */     }
/* 1000 */     if (bool) {
/* 1001 */       System.arraycopy(☃, j, this.e, 0, this.e.length);
/* 1002 */       j += this.e.length;
/*      */     } 
/*      */     
/* 1005 */     for (k = 0; k < this.d.length; k++) {
/* 1006 */       if (this.d[k] != null && (i & 1 << k) != 0) {
/* 1007 */         this.d[k].e();
/*      */       }
/*      */     } 
/*      */     
/* 1011 */     this.o = true;
/* 1012 */     this.n = true;
/* 1013 */     a();
/* 1014 */     for (Iterator<akw> iterator = this.l.values().iterator(); iterator.hasNext(); ) { akw akw = iterator.next();
/* 1015 */       akw.E(); }
/*      */   
/*      */   }
/*      */   
/*      */   public ady a(cj ☃, aec aec1) {
/* 1020 */     int i = ☃.n() & 0xF;
/* 1021 */     int j = ☃.p() & 0xF;
/*      */     
/* 1023 */     int k = this.e[j << 4 | i] & 0xFF;
/* 1024 */     if (k == 255) {
/* 1025 */       ady ady1 = aec1.a(☃, ady.q);
/* 1026 */       k = ady1.az;
/* 1027 */       this.e[j << 4 | i] = (byte)(k & 0xFF);
/*      */     } 
/* 1029 */     ady ady = ady.e(k);
/* 1030 */     if (ady == null) {
/* 1031 */       return ady.q;
/*      */     }
/* 1033 */     return ady;
/*      */   }
/*      */   
/*      */   public byte[] k() {
/* 1037 */     return this.e;
/*      */   }
/*      */   
/*      */   public void a(byte[] ☃) {
/* 1041 */     if (this.e.length != ☃.length) {
/* 1042 */       c.warn("Could not set level chunk biomes, array length is " + ☃.length + " instead of " + this.e.length);
/*      */       
/*      */       return;
/*      */     } 
/* 1046 */     for (int i = 0; i < this.e.length; i++) {
/* 1047 */       this.e[i] = ☃[i];
/*      */     }
/*      */   }
/*      */   
/*      */   public void l() {
/* 1052 */     this.v = 0;
/*      */   }
/*      */   
/*      */   public void m() {
/* 1056 */     cj ☃ = new cj(this.a << 4, 0, this.b << 4);
/* 1057 */     for (int i = 0; i < 8; i++) {
/* 1058 */       if (this.v >= 4096) {
/*      */         return;
/*      */       }
/*      */       
/* 1062 */       int j = this.v % 16;
/* 1063 */       int k = this.v / 16 % 16;
/* 1064 */       int m = this.v / 256;
/* 1065 */       this.v++;
/*      */       
/* 1067 */       for (int n = 0; n < 16; n++) {
/* 1068 */         cj cj = ☃.a(k, (j << 4) + n, m);
/* 1069 */         boolean bool = (n == 0 || n == 15 || k == 0 || k == 15 || m == 0 || m == 15);
/*      */         
/* 1071 */         if ((this.d[j] == null && bool) || (this.d[j] != null && this.d[j].b(k, n, m).t() == arm.a)) {
/* 1072 */           cq[] arrayOfCq; int i1; int i2; for (arrayOfCq = cq.values(), i1 = arrayOfCq.length, i2 = 0; i2 < i1; ) { cq cq = arrayOfCq[i2];
/* 1073 */             cj cj1 = cj.a(cq);
/* 1074 */             if (this.i.p(cj1).c().r() > 0)
/* 1075 */               this.i.x(cj1); 
/*      */             i2++; }
/*      */           
/* 1078 */           this.i.x(cj);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void n() {
/* 1085 */     this.n = true;
/* 1086 */     this.o = true;
/*      */     
/* 1088 */     cj ☃ = new cj(this.a << 4, 0, this.b << 4);
/*      */     
/* 1090 */     if (!this.i.t.o()) {
/* 1091 */       if (this.i.a(☃.a(-1, 0, -1), ☃.a(16, this.i.F(), 16))) {
/* 1092 */         int i; label31: for (i = 0; i < 16; i++) {
/* 1093 */           for (int j = 0; j < 16; j++) {
/* 1094 */             if (!e(i, j)) {
/* 1095 */               this.o = false;
/*      */               break label31;
/*      */             } 
/*      */           } 
/*      */         } 
/* 1100 */         if (this.o) {
/* 1101 */           for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 1102 */             int j = (cq.c() == cq.b.a) ? 16 : 1;
/* 1103 */             this.i.f(☃.a(cq, j)).a(cq.d()); }
/*      */           
/* 1105 */           y();
/*      */         } 
/*      */       } else {
/* 1108 */         this.o = false;
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private void y() {
/* 1114 */     for (int ☃ = 0; ☃ < this.g.length; ☃++) {
/* 1115 */       this.g[☃] = true;
/*      */     }
/* 1117 */     h(false);
/*      */   }
/*      */   
/*      */   private void a(cq ☃) {
/* 1121 */     if (!this.n) {
/*      */       return;
/*      */     }
/*      */     
/* 1125 */     if (☃ == cq.f) {
/* 1126 */       for (int i = 0; i < 16; i++) {
/* 1127 */         e(15, i);
/*      */       }
/* 1129 */     } else if (☃ == cq.e) {
/* 1130 */       for (int i = 0; i < 16; i++) {
/* 1131 */         e(0, i);
/*      */       }
/* 1133 */     } else if (☃ == cq.d) {
/* 1134 */       for (int i = 0; i < 16; i++) {
/* 1135 */         e(i, 15);
/*      */       }
/* 1137 */     } else if (☃ == cq.c) {
/* 1138 */       for (int i = 0; i < 16; i++) {
/* 1139 */         e(i, 0);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean e(int ☃, int i) {
/* 1145 */     int j = g();
/* 1146 */     boolean bool1 = false;
/* 1147 */     boolean bool2 = false;
/* 1148 */     cj.a a = new cj.a((this.a << 4) + ☃, 0, (this.b << 4) + i);
/*      */     int k;
/* 1150 */     for (k = j + 16 - 1; k > this.i.F() || (k > 0 && !bool2); k--) {
/* 1151 */       a.c(a.n(), k, a.p());
/* 1152 */       int m = b(a);
/*      */       
/* 1154 */       if (m == 255 && a.o() < this.i.F()) {
/* 1155 */         bool2 = true;
/*      */       }
/*      */       
/* 1158 */       if (!bool1 && m > 0) {
/* 1159 */         bool1 = true;
/* 1160 */       } else if (bool1 && m == 0 && 
/* 1161 */         !this.i.x(a)) {
/* 1162 */         return false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1167 */     for (k = a.o(); k > 0; k--) {
/* 1168 */       a.c(a.n(), k, a.p());
/* 1169 */       if (a(a).r() > 0) {
/* 1170 */         this.i.x(a);
/*      */       }
/*      */     } 
/* 1173 */     return true;
/*      */   }
/*      */   
/*      */   public boolean o() {
/* 1177 */     return this.h;
/*      */   }
/*      */   
/*      */   public void c(boolean ☃) {
/* 1181 */     this.h = ☃;
/*      */   }
/*      */   
/*      */   public adm p() {
/* 1185 */     return this.i;
/*      */   }
/*      */   
/*      */   public int[] q() {
/* 1189 */     return this.j;
/*      */   }
/*      */   
/*      */   public void a(int[] ☃) {
/* 1193 */     if (this.j.length != ☃.length) {
/* 1194 */       c.warn("Could not set level chunk heightmap, array length is " + ☃.length + " instead of " + this.j.length);
/*      */       
/*      */       return;
/*      */     } 
/* 1198 */     for (int i = 0; i < this.j.length; i++) {
/* 1199 */       this.j[i] = ☃[i];
/*      */     }
/*      */   }
/*      */   
/*      */   public Map<cj, akw> r() {
/* 1204 */     return this.l;
/*      */   }
/*      */   
/*      */   public ne<pk>[] s() {
/* 1208 */     return this.m;
/*      */   }
/*      */   
/*      */   public boolean t() {
/* 1212 */     return this.n;
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/* 1216 */     this.n = ☃;
/*      */   }
/*      */   
/*      */   public boolean u() {
/* 1220 */     return this.o;
/*      */   }
/*      */   
/*      */   public void e(boolean ☃) {
/* 1224 */     this.o = ☃;
/*      */   }
/*      */   
/*      */   public void f(boolean ☃) {
/* 1228 */     this.q = ☃;
/*      */   }
/*      */   
/*      */   public void g(boolean ☃) {
/* 1232 */     this.r = ☃;
/*      */   }
/*      */   
/*      */   public void b(long ☃) {
/* 1236 */     this.s = ☃;
/*      */   }
/*      */   
/*      */   public int v() {
/* 1240 */     return this.t;
/*      */   }
/*      */   
/*      */   public long w() {
/* 1244 */     return this.u;
/*      */   }
/*      */   
/*      */   public void c(long ☃) {
/* 1248 */     this.u = ☃;
/*      */   }
/*      */   
/*      */   public enum a {
/* 1252 */     a,
/* 1253 */     b,
/* 1254 */     c;
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */