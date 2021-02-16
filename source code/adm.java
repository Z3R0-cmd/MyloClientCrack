/*      */ import com.google.common.base.Predicate;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Sets;
/*      */ import java.util.Calendar;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.Callable;
/*      */ import net.minecraft.server.MinecraftServer;
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
/*      */ public abstract class adm
/*      */   implements adq
/*      */ {
/*   70 */   private int a = 63;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean e;
/*      */ 
/*      */ 
/*      */   
/*   78 */   public final List<pk> f = Lists.newArrayList();
/*   79 */   protected final List<pk> g = Lists.newArrayList();
/*   80 */   public final List<akw> h = Lists.newArrayList();
/*   81 */   public final List<akw> i = Lists.newArrayList();
/*   82 */   private final List<akw> b = Lists.newArrayList();
/*   83 */   private final List<akw> c = Lists.newArrayList();
/*      */   
/*   85 */   public final List<wn> j = Lists.newArrayList();
/*   86 */   public final List<pk> k = Lists.newArrayList();
/*   87 */   protected final nm<pk> l = new nm<pk>();
/*      */   
/*   89 */   private long d = 16777215L;
/*      */   
/*      */   private int I;
/*      */   
/*   93 */   protected int m = (new Random()).nextInt();
/*   94 */   protected final int n = 1013904223; protected float o;
/*      */   protected float p;
/*      */   protected float q;
/*      */   protected float r;
/*      */   private int J;
/*   99 */   public final Random s = new Random();
/*      */   
/*      */   public final anm t;
/*  102 */   protected List<ado> u = Lists.newArrayList();
/*      */   
/*      */   protected amv v;
/*      */   
/*      */   protected final atp w;
/*      */   
/*      */   protected ato x;
/*      */   
/*      */   protected boolean y;
/*      */   
/*      */   protected aua z;
/*      */   
/*      */   protected th A;
/*      */   public final nt B;
/*  116 */   private final Calendar K = Calendar.getInstance();
/*  117 */   protected auo C = new auo();
/*      */   
/*      */   public final boolean D;
/*  120 */   protected Set<adg> E = Sets.newHashSet();
/*  121 */   private int L = this.s.nextInt(12000);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean F = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean G = true;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean M;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final ams N;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   int[] H;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public adm b() {
/*  154 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public ady b(cj ☃) {
/*  159 */     if (e(☃)) {
/*  160 */       amy amy = f(☃);
/*      */       try {
/*  162 */         return amy.a(☃, this.t.m());
/*  163 */       } catch (Throwable throwable) {
/*  164 */         b b = b.a(throwable, "Getting biome");
/*  165 */         c c = b.a("Coordinates of biome request");
/*      */         
/*  167 */         c.a("Location", new Callable<String>(this, ☃)
/*      */             {
/*      */               public String a() throws Exception {
/*  170 */                 return c.a(this.a);
/*      */               }
/*      */             });
/*      */         
/*  174 */         throw new e(b);
/*      */       } 
/*      */     } 
/*  177 */     return this.t.m().a(☃, ady.q);
/*      */   }
/*      */ 
/*      */   
/*      */   public aec v() {
/*  182 */     return this.t.m();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(adp ☃) {
/*  188 */     this.x.d(true);
/*      */   }
/*      */   
/*      */   public void g() {
/*  192 */     B(new cj(8, 64, 8));
/*      */   }
/*      */   
/*      */   public afh c(cj ☃) {
/*  196 */     cj cj1 = new cj(☃.n(), F(), ☃.p());
/*  197 */     while (!d(cj1.a())) {
/*  198 */       cj1 = cj1.a();
/*      */     }
/*  200 */     return p(cj1).c();
/*      */   }
/*      */   
/*      */   private boolean a(cj ☃) {
/*  204 */     return (☃.n() >= -30000000 && ☃.p() >= -30000000 && ☃.n() < 30000000 && ☃.p() < 30000000 && ☃.o() >= 0 && ☃.o() < 256);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean d(cj ☃) {
/*  209 */     return (p(☃).c().t() == arm.a);
/*      */   }
/*      */   
/*      */   public boolean e(cj ☃) {
/*  213 */     return a(☃, true);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, boolean bool) {
/*  217 */     if (!a(☃)) {
/*  218 */       return false;
/*      */     }
/*  220 */     return a(☃.n() >> 4, ☃.p() >> 4, bool);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, int i) {
/*  224 */     return a(☃, i, true);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, int i, boolean bool) {
/*  228 */     return a(☃.n() - i, ☃.o() - i, ☃.p() - i, ☃.n() + i, ☃.o() + i, ☃.p() + i, bool);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, cj cj1) {
/*  232 */     return a(☃, cj1, true);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, cj cj1, boolean bool) {
/*  236 */     return a(☃.n(), ☃.o(), ☃.p(), cj1.n(), cj1.o(), cj1.p(), bool);
/*      */   }
/*      */   
/*      */   public boolean a(aqe ☃) {
/*  240 */     return b(☃, true);
/*      */   }
/*      */   
/*      */   public boolean b(aqe ☃, boolean bool) {
/*  244 */     return a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f, bool);
/*      */   }
/*      */   
/*      */   private boolean a(int ☃, int i, int j, int k, int m, int n, boolean bool) {
/*  248 */     if (m < 0 || i >= 256) {
/*  249 */       return false;
/*      */     }
/*      */     
/*  252 */     ☃ >>= 4;
/*  253 */     j >>= 4;
/*  254 */     k >>= 4;
/*  255 */     n >>= 4;
/*      */     
/*  257 */     for (int i1 = ☃; i1 <= k; i1++) {
/*  258 */       for (int i2 = j; i2 <= n; i2++) {
/*  259 */         if (!a(i1, i2, bool)) {
/*  260 */           return false;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  265 */     return true;
/*      */   }
/*      */   
/*      */   protected boolean a(int ☃, int i, boolean bool) {
/*  269 */     return (this.v.a(☃, i) && (bool || !this.v.d(☃, i).f()));
/*      */   }
/*      */   
/*      */   public amy f(cj ☃) {
/*  273 */     return a(☃.n() >> 4, ☃.p() >> 4);
/*      */   }
/*      */   
/*      */   public amy a(int ☃, int i) {
/*  277 */     return this.v.d(☃, i);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, alz alz1, int i) {
/*  281 */     if (!a(☃)) {
/*  282 */       return false;
/*      */     }
/*      */     
/*  285 */     if (!this.D && this.x.u() == adr.g) {
/*  286 */       return false;
/*      */     }
/*      */     
/*  289 */     amy amy = f(☃);
/*  290 */     afh afh = alz1.c();
/*  291 */     alz alz2 = amy.a(☃, alz1);
/*      */     
/*  293 */     if (alz2 != null) {
/*  294 */       afh afh1 = alz2.c();
/*      */       
/*  296 */       if (afh.p() != afh1.p() || afh.r() != afh1.r()) {
/*  297 */         this.B.a("checkLight");
/*  298 */         x(☃);
/*  299 */         this.B.b();
/*      */       } 
/*      */       
/*  302 */       if ((i & 0x2) != 0 && (!this.D || (i & 0x4) == 0) && amy.i()) {
/*  303 */         h(☃);
/*      */       }
/*      */       
/*  306 */       if (!this.D && (i & 0x1) != 0) {
/*  307 */         b(☃, alz2.c());
/*  308 */         if (afh.O()) {
/*  309 */           e(☃, afh);
/*      */         }
/*      */       } 
/*      */       
/*  313 */       return true;
/*      */     } 
/*      */     
/*  316 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean g(cj ☃) {
/*  326 */     return a(☃, afi.a.Q(), 3);
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
/*      */   public boolean b(cj ☃, boolean bool) {
/*  338 */     alz alz = p(☃);
/*  339 */     afh afh = alz.c();
/*  340 */     if (afh.t() == arm.a) {
/*  341 */       return false;
/*      */     }
/*      */     
/*  344 */     b(2001, ☃, afh.f(alz));
/*  345 */     if (bool) {
/*  346 */       afh.b(this, ☃, alz, 0);
/*      */     }
/*  348 */     return a(☃, afi.a.Q(), 3);
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, alz alz1) {
/*  352 */     return a(☃, alz1, 3);
/*      */   }
/*      */   
/*      */   public void h(cj ☃) {
/*  356 */     for (int i = 0; i < this.u.size(); i++) {
/*  357 */       ((ado)this.u.get(i)).a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(cj ☃, afh afh1) {
/*  362 */     if (this.x.u() != adr.g) {
/*  363 */       c(☃, afh1);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, int j, int k) {
/*  368 */     if (j > k) {
/*  369 */       int m = k;
/*  370 */       k = j;
/*  371 */       j = m;
/*      */     } 
/*  373 */     if (!this.t.o()) {
/*  374 */       for (int m = j; m <= k; m++) {
/*  375 */         c(ads.a, new cj(☃, m, i));
/*      */       }
/*      */     }
/*  378 */     b(☃, j, i, ☃, k, i);
/*      */   }
/*      */   
/*      */   public void b(cj ☃, cj cj1) {
/*  382 */     b(☃.n(), ☃.o(), ☃.p(), cj1.n(), cj1.o(), cj1.p());
/*      */   }
/*      */   
/*      */   public void b(int ☃, int i, int j, int k, int m, int n) {
/*  386 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  387 */       ((ado)this.u.get(i1)).a(☃, i, j, k, m, n);
/*      */     }
/*      */   }
/*      */   
/*      */   public void c(cj ☃, afh afh1) {
/*  392 */     d(☃.e(), afh1);
/*  393 */     d(☃.f(), afh1);
/*  394 */     d(☃.b(), afh1);
/*  395 */     d(☃.a(), afh1);
/*  396 */     d(☃.c(), afh1);
/*  397 */     d(☃.d(), afh1);
/*      */   }
/*      */   
/*      */   public void a(cj ☃, afh afh1, cq cq1) {
/*  401 */     if (cq1 != cq.e) {
/*  402 */       d(☃.e(), afh1);
/*      */     }
/*  404 */     if (cq1 != cq.f) {
/*  405 */       d(☃.f(), afh1);
/*      */     }
/*  407 */     if (cq1 != cq.a) {
/*  408 */       d(☃.b(), afh1);
/*      */     }
/*  410 */     if (cq1 != cq.b) {
/*  411 */       d(☃.a(), afh1);
/*      */     }
/*  413 */     if (cq1 != cq.c) {
/*  414 */       d(☃.c(), afh1);
/*      */     }
/*  416 */     if (cq1 != cq.d) {
/*  417 */       d(☃.d(), afh1);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(cj ☃, afh afh1) {
/*  422 */     if (this.D) {
/*      */       return;
/*      */     }
/*  425 */     alz alz = p(☃);
/*      */     
/*      */     try {
/*  428 */       alz.c().a(this, ☃, alz, afh1);
/*  429 */     } catch (Throwable throwable) {
/*  430 */       b b = b.a(throwable, "Exception while updating neighbours");
/*  431 */       c c = b.a("Block being updated");
/*      */       
/*  433 */       c.a("Source block type", new Callable<String>(this, afh1)
/*      */           {
/*      */             public String a() throws Exception {
/*      */               try {
/*  437 */                 return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(afh.a(this.a)), this.a.a(), this.a.getClass().getCanonicalName() });
/*  438 */               } catch (Throwable ☃) {
/*  439 */                 return "ID #" + afh.a(this.a);
/*      */               } 
/*      */             }
/*      */           });
/*      */       
/*  444 */       c.a(c, ☃, alz);
/*      */       
/*  446 */       throw new e(b);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(cj ☃, afh afh1) {
/*  451 */     return false;
/*      */   }
/*      */   
/*      */   public boolean i(cj ☃) {
/*  455 */     return f(☃).d(☃);
/*      */   }
/*      */   
/*      */   public boolean j(cj ☃) {
/*  459 */     if (☃.o() >= F()) {
/*  460 */       return i(☃);
/*      */     }
/*  462 */     cj cj1 = new cj(☃.n(), F(), ☃.p());
/*  463 */     if (!i(cj1)) {
/*  464 */       return false;
/*      */     }
/*  466 */     cj1 = cj1.b();
/*  467 */     while (cj1.o() > ☃.o()) {
/*  468 */       afh afh = p(cj1).c();
/*  469 */       if (afh.p() > 0 && !afh.t().d()) {
/*  470 */         return false;
/*      */       }
/*  472 */       cj1 = cj1.b();
/*      */     } 
/*  474 */     return true;
/*      */   }
/*      */   
/*      */   public int k(cj ☃) {
/*  478 */     if (☃.o() < 0) {
/*  479 */       return 0;
/*      */     }
/*  481 */     if (☃.o() >= 256) {
/*  482 */       ☃ = new cj(☃.n(), 255, ☃.p());
/*      */     }
/*  484 */     return f(☃).a(☃, 0);
/*      */   }
/*      */   
/*      */   public int l(cj ☃) {
/*  488 */     return c(☃, true);
/*      */   }
/*      */   
/*      */   public int c(cj ☃, boolean bool) {
/*  492 */     if (☃.n() < -30000000 || ☃.p() < -30000000 || ☃.n() >= 30000000 || ☃.p() >= 30000000) {
/*  493 */       return 15;
/*      */     }
/*      */     
/*  496 */     if (bool && 
/*  497 */       p(☃).c().s()) {
/*  498 */       int i = c(☃.a(), false);
/*  499 */       int j = c(☃.f(), false);
/*  500 */       int k = c(☃.e(), false);
/*  501 */       int m = c(☃.d(), false);
/*  502 */       int n = c(☃.c(), false);
/*  503 */       if (j > i) {
/*  504 */         i = j;
/*      */       }
/*  506 */       if (k > i) {
/*  507 */         i = k;
/*      */       }
/*  509 */       if (m > i) {
/*  510 */         i = m;
/*      */       }
/*  512 */       if (n > i) {
/*  513 */         i = n;
/*      */       }
/*  515 */       return i;
/*      */     } 
/*      */ 
/*      */     
/*  519 */     if (☃.o() < 0) {
/*  520 */       return 0;
/*      */     }
/*  522 */     if (☃.o() >= 256) {
/*  523 */       ☃ = new cj(☃.n(), 255, ☃.p());
/*      */     }
/*      */     
/*  526 */     amy amy = f(☃);
/*  527 */     return amy.a(☃, this.I);
/*      */   }
/*      */   
/*      */   public cj m(cj ☃) {
/*      */     int i;
/*  532 */     if (☃.n() < -30000000 || ☃.p() < -30000000 || ☃.n() >= 30000000 || ☃.p() >= 30000000) {
/*  533 */       i = F() + 1;
/*  534 */     } else if (a(☃.n() >> 4, ☃.p() >> 4, true)) {
/*  535 */       i = a(☃.n() >> 4, ☃.p() >> 4).b(☃.n() & 0xF, ☃.p() & 0xF);
/*      */     } else {
/*  537 */       i = 0;
/*      */     } 
/*      */     
/*  540 */     return new cj(☃.n(), i, ☃.p());
/*      */   }
/*      */ 
/*      */   
/*      */   public int b(int ☃, int i) {
/*  545 */     if (☃ < -30000000 || i < -30000000 || ☃ >= 30000000 || i >= 30000000) {
/*  546 */       return F() + 1;
/*      */     }
/*  548 */     if (!a(☃ >> 4, i >> 4, true)) {
/*  549 */       return 0;
/*      */     }
/*      */     
/*  552 */     amy amy = a(☃ >> 4, i >> 4);
/*  553 */     return amy.v();
/*      */   }
/*      */   
/*      */   public int a(ads ☃, cj cj1) {
/*  557 */     if (this.t.o() && ☃ == ads.a) {
/*  558 */       return 0;
/*      */     }
/*      */     
/*  561 */     if (cj1.o() < 0) {
/*  562 */       cj1 = new cj(cj1.n(), 0, cj1.p());
/*      */     }
/*  564 */     if (!a(cj1)) {
/*  565 */       return ☃.c;
/*      */     }
/*  567 */     if (!e(cj1)) {
/*  568 */       return ☃.c;
/*      */     }
/*      */     
/*  571 */     if (p(cj1).c().s()) {
/*  572 */       int i = b(☃, cj1.a());
/*  573 */       int j = b(☃, cj1.f());
/*  574 */       int k = b(☃, cj1.e());
/*  575 */       int m = b(☃, cj1.d());
/*  576 */       int n = b(☃, cj1.c());
/*  577 */       if (j > i) {
/*  578 */         i = j;
/*      */       }
/*  580 */       if (k > i) {
/*  581 */         i = k;
/*      */       }
/*  583 */       if (m > i) {
/*  584 */         i = m;
/*      */       }
/*  586 */       if (n > i) {
/*  587 */         i = n;
/*      */       }
/*  589 */       return i;
/*      */     } 
/*      */     
/*  592 */     amy amy = f(cj1);
/*  593 */     return amy.a(☃, cj1);
/*      */   }
/*      */ 
/*      */   
/*      */   public int b(ads ☃, cj cj1) {
/*  598 */     if (cj1.o() < 0) {
/*  599 */       cj1 = new cj(cj1.n(), 0, cj1.p());
/*      */     }
/*  601 */     if (!a(cj1)) {
/*  602 */       return ☃.c;
/*      */     }
/*  604 */     if (!e(cj1)) {
/*  605 */       return ☃.c;
/*      */     }
/*  607 */     amy amy = f(cj1);
/*  608 */     return amy.a(☃, cj1);
/*      */   }
/*      */   
/*      */   public void a(ads ☃, cj cj1, int i) {
/*  612 */     if (!a(cj1)) {
/*      */       return;
/*      */     }
/*  615 */     if (!e(cj1)) {
/*      */       return;
/*      */     }
/*  618 */     amy amy = f(cj1);
/*  619 */     amy.a(☃, cj1, i);
/*  620 */     n(cj1);
/*      */   }
/*      */   
/*      */   public void n(cj ☃) {
/*  624 */     for (int i = 0; i < this.u.size(); i++) {
/*  625 */       ((ado)this.u.get(i)).b(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int b(cj ☃, int i) {
/*  631 */     int j = a(ads.a, ☃);
/*  632 */     int k = a(ads.b, ☃);
/*  633 */     if (k < i) {
/*  634 */       k = i;
/*      */     }
/*  636 */     return j << 20 | k << 4;
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
/*      */   public float o(cj ☃) {
/*  650 */     return this.t.p()[l(☃)];
/*      */   }
/*      */ 
/*      */   
/*      */   public alz p(cj ☃) {
/*  655 */     if (!a(☃)) {
/*  656 */       return afi.a.Q();
/*      */     }
/*  658 */     amy amy = f(☃);
/*  659 */     return amy.g(☃);
/*      */   }
/*      */   
/*      */   public boolean w() {
/*  663 */     return (this.I < 4);
/*      */   }
/*      */ 
/*      */   
/*      */   public auh a(aui ☃, aui aui1) {
/*  668 */     return a(☃, aui1, false, false, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public auh a(aui ☃, aui aui1, boolean bool) {
/*  673 */     return a(☃, aui1, bool, false, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public auh a(aui ☃, aui aui1, boolean bool1, boolean bool2, boolean bool3) {
/*  678 */     if (Double.isNaN(☃.a) || Double.isNaN(☃.b) || Double.isNaN(☃.c)) {
/*  679 */       return null;
/*      */     }
/*  681 */     if (Double.isNaN(aui1.a) || Double.isNaN(aui1.b) || Double.isNaN(aui1.c)) {
/*  682 */       return null;
/*      */     }
/*      */     
/*  685 */     int i = ns.c(aui1.a);
/*  686 */     int j = ns.c(aui1.b);
/*  687 */     int k = ns.c(aui1.c);
/*      */     
/*  689 */     int m = ns.c(☃.a);
/*  690 */     int n = ns.c(☃.b);
/*  691 */     int i1 = ns.c(☃.c);
/*      */     
/*  693 */     cj cj = new cj(m, n, i1);
/*      */     
/*  695 */     alz alz = p(cj);
/*  696 */     afh afh = alz.c();
/*  697 */     if (!bool2 || afh.a(this, cj, alz) != null)
/*      */     {
/*  699 */       if (afh.a(alz, bool1)) {
/*  700 */         auh auh1 = afh.a(this, cj, ☃, aui1);
/*  701 */         if (auh1 != null) {
/*  702 */           return auh1;
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*  707 */     auh auh = null;
/*      */     
/*  709 */     int i2 = 200;
/*  710 */     while (i2-- >= 0) {
/*  711 */       cq cq; if (Double.isNaN(☃.a) || Double.isNaN(☃.b) || Double.isNaN(☃.c)) {
/*  712 */         return null;
/*      */       }
/*  714 */       if (m == i && n == j && i1 == k) {
/*  715 */         return bool3 ? auh : null;
/*      */       }
/*      */       
/*  718 */       boolean bool4 = true;
/*  719 */       boolean bool5 = true;
/*  720 */       boolean bool6 = true;
/*      */       
/*  722 */       double d1 = 999.0D;
/*  723 */       double d2 = 999.0D;
/*  724 */       double d3 = 999.0D;
/*      */       
/*  726 */       if (i > m) {
/*  727 */         d1 = m + 1.0D;
/*  728 */       } else if (i < m) {
/*  729 */         d1 = m + 0.0D;
/*      */       } else {
/*  731 */         bool4 = false;
/*      */       } 
/*      */       
/*  734 */       if (j > n) {
/*  735 */         d2 = n + 1.0D;
/*  736 */       } else if (j < n) {
/*  737 */         d2 = n + 0.0D;
/*      */       } else {
/*  739 */         bool5 = false;
/*      */       } 
/*      */       
/*  742 */       if (k > i1) {
/*  743 */         d3 = i1 + 1.0D;
/*  744 */       } else if (k < i1) {
/*  745 */         d3 = i1 + 0.0D;
/*      */       } else {
/*  747 */         bool6 = false;
/*      */       } 
/*      */       
/*  750 */       double d4 = 999.0D;
/*  751 */       double d5 = 999.0D;
/*  752 */       double d6 = 999.0D;
/*      */       
/*  754 */       double d7 = aui1.a - ☃.a;
/*  755 */       double d8 = aui1.b - ☃.b;
/*  756 */       double d9 = aui1.c - ☃.c;
/*      */       
/*  758 */       if (bool4) {
/*  759 */         d4 = (d1 - ☃.a) / d7;
/*      */       }
/*  761 */       if (bool5) {
/*  762 */         d5 = (d2 - ☃.b) / d8;
/*      */       }
/*  764 */       if (bool6) {
/*  765 */         d6 = (d3 - ☃.c) / d9;
/*      */       }
/*      */ 
/*      */       
/*  769 */       if (d4 == -0.0D) {
/*  770 */         d4 = -1.0E-4D;
/*      */       }
/*  772 */       if (d5 == -0.0D) {
/*  773 */         d5 = -1.0E-4D;
/*      */       }
/*  775 */       if (d6 == -0.0D) {
/*  776 */         d6 = -1.0E-4D;
/*      */       }
/*      */ 
/*      */       
/*  780 */       if (d4 < d5 && d4 < d6) {
/*  781 */         cq = (i > m) ? cq.e : cq.f;
/*  782 */         ☃ = new aui(d1, ☃.b + d8 * d4, ☃.c + d9 * d4);
/*  783 */       } else if (d5 < d6) {
/*  784 */         cq = (j > n) ? cq.a : cq.b;
/*  785 */         ☃ = new aui(☃.a + d7 * d5, d2, ☃.c + d9 * d5);
/*      */       } else {
/*  787 */         cq = (k > i1) ? cq.c : cq.d;
/*  788 */         ☃ = new aui(☃.a + d7 * d6, ☃.b + d8 * d6, d3);
/*      */       } 
/*      */       
/*  791 */       m = ns.c(☃.a) - ((cq == cq.f) ? 1 : 0);
/*  792 */       n = ns.c(☃.b) - ((cq == cq.b) ? 1 : 0);
/*  793 */       i1 = ns.c(☃.c) - ((cq == cq.d) ? 1 : 0);
/*      */       
/*  795 */       cj = new cj(m, n, i1);
/*  796 */       alz alz1 = p(cj);
/*  797 */       afh afh1 = alz1.c();
/*  798 */       if (bool2 && afh1.a(this, cj, alz1) == null)
/*      */         continue; 
/*  800 */       if (afh1.a(alz1, bool1)) {
/*  801 */         auh auh1 = afh1.a(this, cj, ☃, aui1);
/*  802 */         if (auh1 != null)
/*  803 */           return auh1; 
/*      */         continue;
/*      */       } 
/*  806 */       auh = new auh(auh.a.a, ☃, cq, cj);
/*      */     } 
/*      */     
/*  809 */     return bool3 ? auh : null;
/*      */   }
/*      */   
/*      */   public void a(pk ☃, String str, float f1, float f2) {
/*  813 */     for (int i = 0; i < this.u.size(); i++) {
/*  814 */       ((ado)this.u.get(i)).a(str, ☃.s, ☃.t, ☃.u, f1, f2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(wn ☃, String str, float f1, float f2) {
/*  819 */     for (int i = 0; i < this.u.size(); i++) {
/*  820 */       ((ado)this.u.get(i)).a(☃, str, ☃.s, ☃.t, ☃.u, f1, f2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, String str, float f1, float f2) {
/*  825 */     for (int i = 0; i < this.u.size(); i++) {
/*  826 */       ((ado)this.u.get(i)).a(str, ☃, d1, d2, f1, f2);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2, String str, float f1, float f2, boolean bool) {}
/*      */   
/*      */   public void a(cj ☃, String str) {
/*  834 */     for (int i = 0; i < this.u.size(); i++) {
/*  835 */       ((ado)this.u.get(i)).a(str, ☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(cy ☃, double d1, double d2, double d3, double d4, double d5, double d6, int... arrayOfInt) {
/*  840 */     a(☃.c(), ☃.e(), d1, d2, d3, d4, d5, d6, arrayOfInt);
/*      */   }
/*      */   
/*      */   public void a(cy ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6, int... arrayOfInt) {
/*  844 */     a(☃.c(), ☃.e() | bool, d1, d2, d3, d4, d5, d6, arrayOfInt);
/*      */   }
/*      */   
/*      */   private void a(int ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6, int... arrayOfInt) {
/*  848 */     for (int i = 0; i < this.u.size(); i++) {
/*  849 */       ((ado)this.u.get(i)).a(☃, bool, d1, d2, d3, d4, d5, d6, arrayOfInt);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean c(pk ☃) {
/*  854 */     this.k.add(☃);
/*  855 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(pk ☃) {
/*  859 */     int i = ns.c(☃.s / 16.0D);
/*  860 */     int j = ns.c(☃.u / 16.0D);
/*      */     
/*  862 */     boolean bool = ☃.n;
/*  863 */     if (☃ instanceof wn) {
/*  864 */       bool = true;
/*      */     }
/*      */     
/*  867 */     if (bool || a(i, j, true)) {
/*  868 */       if (☃ instanceof wn) {
/*  869 */         wn wn = (wn)☃;
/*  870 */         this.j.add(wn);
/*  871 */         d();
/*      */       } 
/*  873 */       a(i, j).a(☃);
/*  874 */       this.f.add(☃);
/*  875 */       a(☃);
/*  876 */       return true;
/*      */     } 
/*  878 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(pk ☃) {
/*  882 */     for (int i = 0; i < this.u.size(); i++) {
/*  883 */       ((ado)this.u.get(i)).a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void b(pk ☃) {
/*  888 */     for (int i = 0; i < this.u.size(); i++) {
/*  889 */       ((ado)this.u.get(i)).b(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(pk ☃) {
/*  894 */     if (☃.l != null) {
/*  895 */       ☃.l.a((pk)null);
/*      */     }
/*  897 */     if (☃.m != null) {
/*  898 */       ☃.a((pk)null);
/*      */     }
/*  900 */     ☃.J();
/*  901 */     if (☃ instanceof wn) {
/*  902 */       this.j.remove(☃);
/*  903 */       d();
/*  904 */       b(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void f(pk ☃) {
/*  909 */     ☃.J();
/*      */     
/*  911 */     if (☃ instanceof wn) {
/*  912 */       this.j.remove(☃);
/*  913 */       d();
/*      */     } 
/*      */     
/*  916 */     int i = ☃.ae;
/*  917 */     int j = ☃.ag;
/*  918 */     if (☃.ad && a(i, j, true)) {
/*  919 */       a(i, j).b(☃);
/*      */     }
/*      */     
/*  922 */     this.f.remove(☃);
/*  923 */     b(☃);
/*      */   }
/*      */   
/*      */   public void a(ado ☃) {
/*  927 */     this.u.add(☃);
/*      */   }
/*      */   
/*      */   public void b(ado ☃) {
/*  931 */     this.u.remove(☃);
/*      */   }
/*      */   
/*      */   public List<aug> a(pk ☃, aug aug1) {
/*  935 */     List<aug> list = Lists.newArrayList();
/*  936 */     int i = ns.c(aug1.a);
/*  937 */     int j = ns.c(aug1.d + 1.0D);
/*  938 */     int k = ns.c(aug1.b);
/*  939 */     int m = ns.c(aug1.e + 1.0D);
/*  940 */     int n = ns.c(aug1.c);
/*  941 */     int i1 = ns.c(aug1.f + 1.0D);
/*      */     
/*  943 */     ams ams1 = af();
/*  944 */     boolean bool1 = ☃.aT();
/*  945 */     boolean bool2 = a(ams1, ☃);
/*      */ 
/*      */     
/*  948 */     alz alz = afi.b.Q();
/*      */     
/*  950 */     cj.a a = new cj.a();
/*  951 */     for (int i2 = i; i2 < j; i2++) {
/*  952 */       for (int i4 = n; i4 < i1; i4++) {
/*  953 */         if (e(a.c(i2, 64, i4))) {
/*  954 */           for (int i5 = k - 1; i5 < m; i5++) {
/*  955 */             a.c(i2, i5, i4);
/*      */             
/*  957 */             if (bool1 && bool2) {
/*  958 */               ☃.h(false);
/*  959 */             } else if (!bool1 && !bool2) {
/*  960 */               ☃.h(true);
/*      */             } 
/*      */             
/*  963 */             alz alz1 = alz;
/*  964 */             if (ams1.a(a) || !bool2) {
/*  965 */               alz1 = p(a);
/*      */             }
/*  967 */             alz1.c().a(this, a, alz1, aug1, list, ☃);
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  973 */     double d = 0.25D;
/*  974 */     List<pk> list1 = b(☃, aug1.b(d, d, d));
/*  975 */     for (int i3 = 0; i3 < list1.size(); i3++) {
/*  976 */       if (☃.l != list1 && ☃.m != list1) {
/*      */ 
/*      */         
/*  979 */         aug aug2 = ((pk)list1.get(i3)).S();
/*  980 */         if (aug2 != null && aug2.b(aug1)) {
/*  981 */           list.add(aug2);
/*      */         }
/*      */         
/*  984 */         aug2 = ☃.j(list1.get(i3));
/*  985 */         if (aug2 != null && aug2.b(aug1)) {
/*  986 */           list.add(aug2);
/*      */         }
/*      */       } 
/*      */     } 
/*  990 */     return list;
/*      */   }
/*      */   
/*      */   public boolean a(ams ☃, pk pk1) {
/*  994 */     double d1 = ☃.b();
/*  995 */     double d2 = ☃.c();
/*  996 */     double d3 = ☃.d();
/*  997 */     double d4 = ☃.e();
/*      */     
/*  999 */     if (pk1.aT()) {
/* 1000 */       d1++;
/* 1001 */       d2++;
/* 1002 */       d3--;
/* 1003 */       d4--;
/*      */     } else {
/* 1005 */       d1--;
/* 1006 */       d2--;
/* 1007 */       d3++;
/* 1008 */       d4++;
/*      */     } 
/*      */     
/* 1011 */     return (pk1.s > d1 && pk1.s < d3 && pk1.u > d2 && pk1.u < d4);
/*      */   }
/*      */   
/*      */   public List<aug> a(aug ☃) {
/* 1015 */     List<aug> list = Lists.newArrayList();
/* 1016 */     int i = ns.c(☃.a);
/* 1017 */     int j = ns.c(☃.d + 1.0D);
/* 1018 */     int k = ns.c(☃.b);
/* 1019 */     int m = ns.c(☃.e + 1.0D);
/* 1020 */     int n = ns.c(☃.c);
/* 1021 */     int i1 = ns.c(☃.f + 1.0D);
/*      */     
/* 1023 */     cj.a a = new cj.a();
/* 1024 */     for (int i2 = i; i2 < j; i2++) {
/* 1025 */       for (int i3 = n; i3 < i1; i3++) {
/* 1026 */         if (e(a.c(i2, 64, i3))) {
/* 1027 */           for (int i4 = k - 1; i4 < m; i4++) {
/*      */             alz alz;
/* 1029 */             a.c(i2, i4, i3);
/* 1030 */             if (i2 < -30000000 || i2 >= 30000000 || i3 < -30000000 || i3 >= 30000000) {
/* 1031 */               alz = afi.h.Q();
/*      */             } else {
/* 1033 */               alz = p(a);
/*      */             } 
/* 1035 */             alz.c().a(this, a, alz, ☃, list, (pk)null);
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1041 */     return list;
/*      */   }
/*      */   
/*      */   public int a(float ☃) {
/* 1045 */     float f1 = c(☃);
/* 1046 */     float f2 = 1.0F - ns.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 1047 */     f2 = ns.a(f2, 0.0F, 1.0F);
/* 1048 */     f2 = 1.0F - f2;
/* 1049 */     f2 = (float)(f2 * (1.0D - (j(☃) * 5.0F) / 16.0D));
/* 1050 */     f2 = (float)(f2 * (1.0D - (h(☃) * 5.0F) / 16.0D));
/* 1051 */     f2 = 1.0F - f2;
/* 1052 */     return (int)(f2 * 11.0F);
/*      */   }
/*      */   
/*      */   public float b(float ☃) {
/* 1056 */     float f1 = c(☃);
/*      */     
/* 1058 */     float f2 = 1.0F - ns.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F;
/* 1059 */     f2 = ns.a(f2, 0.0F, 1.0F);
/*      */     
/* 1061 */     f2 = 1.0F - f2;
/*      */     
/* 1063 */     f2 = (float)(f2 * (1.0D - (j(☃) * 5.0F) / 16.0D));
/* 1064 */     f2 = (float)(f2 * (1.0D - (h(☃) * 5.0F) / 16.0D));
/*      */     
/* 1066 */     return f2 * 0.8F + 0.2F;
/*      */   }
/*      */   
/*      */   public aui a(pk ☃, float f) {
/* 1070 */     float f1 = c(f);
/*      */     
/* 1072 */     float f2 = ns.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 1073 */     f2 = ns.a(f2, 0.0F, 1.0F);
/*      */     
/* 1075 */     int i = ns.c(☃.s);
/* 1076 */     int j = ns.c(☃.t);
/* 1077 */     int k = ns.c(☃.u);
/* 1078 */     cj cj = new cj(i, j, k);
/* 1079 */     ady ady = b(cj);
/* 1080 */     float f3 = ady.a(cj);
/* 1081 */     int m = ady.a(f3);
/*      */     
/* 1083 */     float f4 = (m >> 16 & 0xFF) / 255.0F;
/* 1084 */     float f5 = (m >> 8 & 0xFF) / 255.0F;
/* 1085 */     float f6 = (m & 0xFF) / 255.0F;
/* 1086 */     f4 *= f2;
/* 1087 */     f5 *= f2;
/* 1088 */     f6 *= f2;
/*      */     
/* 1090 */     float f7 = j(f);
/* 1091 */     if (f7 > 0.0F) {
/* 1092 */       float f9 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.6F;
/*      */       
/* 1094 */       float f10 = 1.0F - f7 * 0.75F;
/* 1095 */       f4 = f4 * f10 + f9 * (1.0F - f10);
/* 1096 */       f5 = f5 * f10 + f9 * (1.0F - f10);
/* 1097 */       f6 = f6 * f10 + f9 * (1.0F - f10);
/*      */     } 
/* 1099 */     float f8 = h(f);
/* 1100 */     if (f8 > 0.0F) {
/* 1101 */       float f9 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.2F;
/*      */       
/* 1103 */       float f10 = 1.0F - f8 * 0.75F;
/* 1104 */       f4 = f4 * f10 + f9 * (1.0F - f10);
/* 1105 */       f5 = f5 * f10 + f9 * (1.0F - f10);
/* 1106 */       f6 = f6 * f10 + f9 * (1.0F - f10);
/*      */     } 
/*      */     
/* 1109 */     if (this.J > 0) {
/* 1110 */       float f9 = this.J - f;
/* 1111 */       if (f9 > 1.0F) {
/* 1112 */         f9 = 1.0F;
/*      */       }
/* 1114 */       f9 *= 0.45F;
/* 1115 */       f4 = f4 * (1.0F - f9) + 0.8F * f9;
/* 1116 */       f5 = f5 * (1.0F - f9) + 0.8F * f9;
/* 1117 */       f6 = f6 * (1.0F - f9) + 1.0F * f9;
/*      */     } 
/*      */     
/* 1120 */     return new aui(f4, f5, f6);
/*      */   }
/*      */   
/*      */   public float c(float ☃) {
/* 1124 */     return this.t.a(this.x.g(), ☃);
/*      */   }
/*      */   
/*      */   public int x() {
/* 1128 */     return this.t.a(this.x.g());
/*      */   }
/*      */   
/*      */   public float y() {
/* 1132 */     return anm.a[this.t.a(this.x.g())];
/*      */   }
/*      */   
/*      */   public float d(float ☃) {
/* 1136 */     float f = c(☃);
/* 1137 */     return f * 3.1415927F * 2.0F;
/*      */   }
/*      */   
/*      */   public aui e(float ☃) {
/* 1141 */     float f1 = c(☃);
/*      */     
/* 1143 */     float f2 = ns.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 1144 */     f2 = ns.a(f2, 0.0F, 1.0F);
/*      */     
/* 1146 */     float f3 = (float)(this.d >> 16L & 0xFFL) / 255.0F;
/* 1147 */     float f4 = (float)(this.d >> 8L & 0xFFL) / 255.0F;
/* 1148 */     float f5 = (float)(this.d & 0xFFL) / 255.0F;
/*      */     
/* 1150 */     float f6 = j(☃);
/* 1151 */     if (f6 > 0.0F) {
/* 1152 */       float f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
/*      */       
/* 1154 */       float f9 = 1.0F - f6 * 0.95F;
/* 1155 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 1156 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 1157 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*      */     } 
/*      */     
/* 1160 */     f3 *= f2 * 0.9F + 0.1F;
/* 1161 */     f4 *= f2 * 0.9F + 0.1F;
/* 1162 */     f5 *= f2 * 0.85F + 0.15F;
/*      */     
/* 1164 */     float f7 = h(☃);
/* 1165 */     if (f7 > 0.0F) {
/* 1166 */       float f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
/*      */       
/* 1168 */       float f9 = 1.0F - f7 * 0.95F;
/* 1169 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 1170 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 1171 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*      */     } 
/*      */     
/* 1174 */     return new aui(f3, f4, f5);
/*      */   }
/*      */   
/*      */   public aui f(float ☃) {
/* 1178 */     float f = c(☃);
/* 1179 */     return this.t.b(f, ☃);
/*      */   }
/*      */   
/*      */   public cj q(cj ☃) {
/* 1183 */     return f(☃).h(☃);
/*      */   }
/*      */   
/*      */   public cj r(cj ☃) {
/* 1187 */     amy amy = f(☃);
/*      */     
/* 1189 */     cj cj1 = new cj(☃.n(), amy.g() + 16, ☃.p());
/* 1190 */     while (cj1.o() >= 0) {
/* 1191 */       cj cj2 = cj1.b();
/* 1192 */       arm arm = amy.a(cj2).t();
/* 1193 */       if (arm.c() && arm != arm.j) {
/*      */         break;
/*      */       }
/*      */       
/* 1197 */       cj1 = cj2;
/*      */     } 
/*      */     
/* 1200 */     return cj1;
/*      */   }
/*      */   
/*      */   public float g(float ☃) {
/* 1204 */     float f1 = c(☃);
/*      */     
/* 1206 */     float f2 = 1.0F - ns.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.25F;
/* 1207 */     f2 = ns.a(f2, 0.0F, 1.0F);
/*      */     
/* 1209 */     return f2 * f2 * 0.5F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cj ☃, afh afh1, int i) {}
/*      */ 
/*      */   
/*      */   public void a(cj ☃, afh afh1, int i, int j) {}
/*      */ 
/*      */   
/*      */   public void b(cj ☃, afh afh1, int i, int j) {}
/*      */   
/*      */   public void i() {
/* 1222 */     this.B.a("entities");
/* 1223 */     this.B.a("global");
/*      */     int i;
/* 1225 */     for (i = 0; i < this.k.size(); i++) {
/* 1226 */       pk pk = this.k.get(i);
/*      */       try {
/* 1228 */         pk.W++;
/* 1229 */         pk.t_();
/* 1230 */       } catch (Throwable throwable) {
/* 1231 */         b b = b.a(throwable, "Ticking entity");
/* 1232 */         c c = b.a("Entity being ticked");
/*      */         
/* 1234 */         if (pk == null) {
/* 1235 */           c.a("Entity", "~~NULL~~");
/*      */         } else {
/* 1237 */           pk.a(c);
/*      */         } 
/*      */         
/* 1240 */         throw new e(b);
/*      */       } 
/*      */       
/* 1243 */       if (pk.I) {
/* 1244 */         this.k.remove(i--);
/*      */       }
/*      */     } 
/*      */     
/* 1248 */     this.B.c("remove");
/* 1249 */     this.f.removeAll(this.g);
/* 1250 */     for (i = 0; i < this.g.size(); i++) {
/* 1251 */       pk pk = this.g.get(i);
/* 1252 */       int j = pk.ae;
/* 1253 */       int k = pk.ag;
/* 1254 */       if (pk.ad && a(j, k, true)) {
/* 1255 */         a(j, k).b(pk);
/*      */       }
/*      */     } 
/* 1258 */     for (i = 0; i < this.g.size(); i++) {
/* 1259 */       b(this.g.get(i));
/*      */     }
/* 1261 */     this.g.clear();
/*      */     
/* 1263 */     this.B.c("regular");
/* 1264 */     for (i = 0; i < this.f.size(); i++) {
/* 1265 */       pk pk = this.f.get(i);
/*      */       
/* 1267 */       if (pk.m != null) {
/* 1268 */         if (pk.m.I || pk.m.l != pk) {
/* 1269 */           pk.m.l = null;
/* 1270 */           pk.m = null;
/*      */         } else {
/*      */           continue;
/*      */         } 
/*      */       }
/*      */       
/* 1276 */       this.B.a("tick");
/* 1277 */       if (!pk.I) {
/*      */         try {
/* 1279 */           g(pk);
/* 1280 */         } catch (Throwable throwable) {
/* 1281 */           b b = b.a(throwable, "Ticking entity");
/* 1282 */           c c = b.a("Entity being ticked");
/*      */           
/* 1284 */           pk.a(c);
/*      */           
/* 1286 */           throw new e(b);
/*      */         } 
/*      */       }
/* 1289 */       this.B.b();
/*      */       
/* 1291 */       this.B.a("remove");
/* 1292 */       if (pk.I) {
/* 1293 */         int j = pk.ae;
/* 1294 */         int k = pk.ag;
/* 1295 */         if (pk.ad && a(j, k, true)) {
/* 1296 */           a(j, k).b(pk);
/*      */         }
/* 1298 */         this.f.remove(i--);
/* 1299 */         b(pk);
/*      */       } 
/* 1301 */       this.B.b();
/*      */       continue;
/*      */     } 
/* 1304 */     this.B.c("blockEntities");
/* 1305 */     this.M = true;
/* 1306 */     Iterator<akw> ☃ = this.i.iterator();
/* 1307 */     while (☃.hasNext()) {
/* 1308 */       akw akw = ☃.next();
/* 1309 */       if (!akw.x() && akw.t()) {
/* 1310 */         cj cj = akw.v();
/* 1311 */         if (e(cj) && this.N.a(cj)) {
/*      */           try {
/* 1313 */             ((km)akw).c();
/* 1314 */           } catch (Throwable throwable) {
/* 1315 */             b b = b.a(throwable, "Ticking block entity");
/* 1316 */             c c = b.a("Block entity being ticked");
/*      */             
/* 1318 */             akw.a(c);
/*      */             
/* 1320 */             throw new e(b);
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/* 1325 */       if (akw.x()) {
/* 1326 */         ☃.remove();
/* 1327 */         this.h.remove(akw);
/*      */         
/* 1329 */         if (e(akw.v())) {
/* 1330 */           f(akw.v()).e(akw.v());
/*      */         }
/*      */       } 
/*      */     } 
/* 1334 */     this.M = false;
/*      */     
/* 1336 */     if (!this.c.isEmpty()) {
/* 1337 */       this.i.removeAll(this.c);
/* 1338 */       this.h.removeAll(this.c);
/* 1339 */       this.c.clear();
/*      */     } 
/*      */     
/* 1342 */     this.B.c("pendingBlockEntities");
/* 1343 */     if (!this.b.isEmpty()) {
/* 1344 */       for (int j = 0; j < this.b.size(); j++) {
/* 1345 */         akw akw = this.b.get(j);
/* 1346 */         if (!akw.x()) {
/* 1347 */           if (!this.h.contains(akw)) {
/* 1348 */             a(akw);
/*      */           }
/*      */           
/* 1351 */           if (e(akw.v())) {
/* 1352 */             f(akw.v()).a(akw.v(), akw);
/*      */           }
/*      */           
/* 1355 */           h(akw.v());
/*      */         } 
/*      */       } 
/* 1358 */       this.b.clear();
/*      */     } 
/* 1360 */     this.B.b();
/* 1361 */     this.B.b();
/*      */   }
/*      */   
/*      */   public boolean a(akw ☃) {
/* 1365 */     boolean bool = this.h.add(☃);
/* 1366 */     if (bool && ☃ instanceof km) {
/* 1367 */       this.i.add(☃);
/*      */     }
/* 1369 */     return bool;
/*      */   }
/*      */   
/*      */   public void a(Collection<akw> ☃) {
/* 1373 */     if (this.M) {
/* 1374 */       this.b.addAll(☃);
/*      */     } else {
/* 1376 */       for (Iterator<akw> iterator = ☃.iterator(); iterator.hasNext(); ) { akw akw = iterator.next();
/* 1377 */         this.h.add(akw);
/* 1378 */         if (akw instanceof km) {
/* 1379 */           this.i.add(akw);
/*      */         } }
/*      */     
/*      */     } 
/*      */   }
/*      */   
/*      */   public void g(pk ☃) {
/* 1386 */     a(☃, true);
/*      */   }
/*      */   
/*      */   public void a(pk ☃, boolean bool) {
/* 1390 */     int i = ns.c(☃.s);
/* 1391 */     int j = ns.c(☃.u);
/* 1392 */     int k = 32;
/* 1393 */     if (bool && !a(i - k, 0, j - k, i + k, 0, j + k, true)) {
/*      */       return;
/*      */     }
/*      */     
/* 1397 */     ☃.P = ☃.s;
/* 1398 */     ☃.Q = ☃.t;
/* 1399 */     ☃.R = ☃.u;
/* 1400 */     ☃.A = ☃.y;
/* 1401 */     ☃.B = ☃.z;
/*      */     
/* 1403 */     if (bool && ☃.ad) {
/* 1404 */       ☃.W++;
/* 1405 */       if (☃.m != null) {
/* 1406 */         ☃.ak();
/*      */       } else {
/* 1408 */         ☃.t_();
/*      */       } 
/*      */     } 
/*      */     
/* 1412 */     this.B.a("chunkCheck");
/*      */     
/* 1414 */     if (Double.isNaN(☃.s) || Double.isInfinite(☃.s)) {
/* 1415 */       ☃.s = ☃.P;
/*      */     }
/* 1417 */     if (Double.isNaN(☃.t) || Double.isInfinite(☃.t)) {
/* 1418 */       ☃.t = ☃.Q;
/*      */     }
/* 1420 */     if (Double.isNaN(☃.u) || Double.isInfinite(☃.u)) {
/* 1421 */       ☃.u = ☃.R;
/*      */     }
/* 1423 */     if (Double.isNaN(☃.z) || Double.isInfinite(☃.z)) {
/* 1424 */       ☃.z = ☃.B;
/*      */     }
/* 1426 */     if (Double.isNaN(☃.y) || Double.isInfinite(☃.y)) {
/* 1427 */       ☃.y = ☃.A;
/*      */     }
/*      */     
/* 1430 */     int m = ns.c(☃.s / 16.0D);
/* 1431 */     int n = ns.c(☃.t / 16.0D);
/* 1432 */     int i1 = ns.c(☃.u / 16.0D);
/*      */     
/* 1434 */     if (!☃.ad || ☃.ae != m || ☃.af != n || ☃.ag != i1) {
/* 1435 */       if (☃.ad && a(☃.ae, ☃.ag, true)) {
/* 1436 */         a(☃.ae, ☃.ag).a(☃, ☃.af);
/*      */       }
/*      */       
/* 1439 */       if (a(m, i1, true)) {
/* 1440 */         ☃.ad = true;
/* 1441 */         a(m, i1).a(☃);
/*      */       } else {
/* 1443 */         ☃.ad = false;
/*      */       } 
/*      */     } 
/* 1446 */     this.B.b();
/*      */     
/* 1448 */     if (bool && ☃.ad && 
/* 1449 */       ☃.l != null) {
/* 1450 */       if (☃.l.I || ☃.l.m != ☃) {
/* 1451 */         ☃.l.m = null;
/* 1452 */         ☃.l = null;
/*      */       } else {
/* 1454 */         g(☃.l);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(aug ☃) {
/* 1461 */     return a(☃, (pk)null);
/*      */   }
/*      */   
/*      */   public boolean a(aug ☃, pk pk1) {
/* 1465 */     List<pk> list = b((pk)null, ☃);
/* 1466 */     for (int i = 0; i < list.size(); i++) {
/* 1467 */       pk pk2 = list.get(i);
/* 1468 */       if (!pk2.I && pk2.k && pk2 != pk1 && (pk1 == null || (pk1.m != pk2 && pk1.l != pk2))) {
/* 1469 */         return false;
/*      */       }
/*      */     } 
/* 1472 */     return true;
/*      */   }
/*      */   
/*      */   public boolean c(aug ☃) {
/* 1476 */     int i = ns.c(☃.a);
/* 1477 */     int j = ns.c(☃.d);
/* 1478 */     int k = ns.c(☃.b);
/* 1479 */     int m = ns.c(☃.e);
/* 1480 */     int n = ns.c(☃.c);
/* 1481 */     int i1 = ns.c(☃.f);
/*      */     
/* 1483 */     cj.a a = new cj.a();
/* 1484 */     for (int i2 = i; i2 <= j; i2++) {
/* 1485 */       for (int i3 = k; i3 <= m; i3++) {
/* 1486 */         for (int i4 = n; i4 <= i1; i4++) {
/* 1487 */           afh afh = p(a.c(i2, i3, i4)).c();
/* 1488 */           if (afh.t() != arm.a) {
/* 1489 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/* 1494 */     return false;
/*      */   }
/*      */   
/*      */   public boolean d(aug ☃) {
/* 1498 */     int i = ns.c(☃.a);
/* 1499 */     int j = ns.c(☃.d);
/* 1500 */     int k = ns.c(☃.b);
/* 1501 */     int m = ns.c(☃.e);
/* 1502 */     int n = ns.c(☃.c);
/* 1503 */     int i1 = ns.c(☃.f);
/*      */     
/* 1505 */     cj.a a = new cj.a();
/* 1506 */     for (int i2 = i; i2 <= j; i2++) {
/* 1507 */       for (int i3 = k; i3 <= m; i3++) {
/* 1508 */         for (int i4 = n; i4 <= i1; i4++) {
/* 1509 */           afh afh = p(a.c(i2, i3, i4)).c();
/* 1510 */           if (afh.t().d()) {
/* 1511 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/* 1516 */     return false;
/*      */   }
/*      */   
/*      */   public boolean e(aug ☃) {
/* 1520 */     int i = ns.c(☃.a);
/* 1521 */     int j = ns.c(☃.d + 1.0D);
/* 1522 */     int k = ns.c(☃.b);
/* 1523 */     int m = ns.c(☃.e + 1.0D);
/* 1524 */     int n = ns.c(☃.c);
/* 1525 */     int i1 = ns.c(☃.f + 1.0D);
/*      */     
/* 1527 */     if (a(i, k, n, j, m, i1, true)) {
/* 1528 */       cj.a a = new cj.a();
/* 1529 */       for (int i2 = i; i2 < j; i2++) {
/* 1530 */         for (int i3 = k; i3 < m; i3++) {
/* 1531 */           for (int i4 = n; i4 < i1; i4++) {
/* 1532 */             afh afh = p(a.c(i2, i3, i4)).c();
/* 1533 */             if (afh == afi.ab || afh == afi.k || afh == afi.l) {
/* 1534 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1540 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(aug ☃, arm arm1, pk pk1) {
/* 1544 */     int i = ns.c(☃.a);
/* 1545 */     int j = ns.c(☃.d + 1.0D);
/*      */     
/* 1547 */     int k = ns.c(☃.b);
/* 1548 */     int m = ns.c(☃.e + 1.0D);
/*      */     
/* 1550 */     int n = ns.c(☃.c);
/* 1551 */     int i1 = ns.c(☃.f + 1.0D);
/*      */     
/* 1553 */     if (!a(i, k, n, j, m, i1, true)) {
/* 1554 */       return false;
/*      */     }
/*      */     
/* 1557 */     boolean bool = false;
/* 1558 */     aui aui = new aui(0.0D, 0.0D, 0.0D);
/* 1559 */     cj.a a = new cj.a();
/* 1560 */     for (int i2 = i; i2 < j; i2++) {
/* 1561 */       for (int i3 = k; i3 < m; i3++) {
/* 1562 */         for (int i4 = n; i4 < i1; i4++) {
/* 1563 */           a.c(i2, i3, i4);
/* 1564 */           alz alz = p(a);
/* 1565 */           afh afh = alz.c();
/* 1566 */           if (afh.t() == arm1) {
/* 1567 */             double d = ((i3 + 1) - ahv.b(((Integer)alz.<Integer>b(ahv.b)).intValue()));
/* 1568 */             if (m >= d) {
/* 1569 */               bool = true;
/* 1570 */               aui = afh.a(this, a, pk1, aui);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1576 */     if (aui.b() > 0.0D && pk1.aL()) {
/* 1577 */       aui = aui.a();
/* 1578 */       double d = 0.014D;
/* 1579 */       pk1.v += aui.a * d;
/* 1580 */       pk1.w += aui.b * d;
/* 1581 */       pk1.x += aui.c * d;
/*      */     } 
/* 1583 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean a(aug ☃, arm arm1) {
/* 1587 */     int i = ns.c(☃.a);
/* 1588 */     int j = ns.c(☃.d + 1.0D);
/* 1589 */     int k = ns.c(☃.b);
/* 1590 */     int m = ns.c(☃.e + 1.0D);
/* 1591 */     int n = ns.c(☃.c);
/* 1592 */     int i1 = ns.c(☃.f + 1.0D);
/*      */     
/* 1594 */     cj.a a = new cj.a();
/* 1595 */     for (int i2 = i; i2 < j; i2++) {
/* 1596 */       for (int i3 = k; i3 < m; i3++) {
/* 1597 */         for (int i4 = n; i4 < i1; i4++) {
/* 1598 */           if (p(a.c(i2, i3, i4)).c().t() == arm1) {
/* 1599 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/* 1604 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(aug ☃, arm arm1) {
/* 1608 */     int i = ns.c(☃.a);
/* 1609 */     int j = ns.c(☃.d + 1.0D);
/* 1610 */     int k = ns.c(☃.b);
/* 1611 */     int m = ns.c(☃.e + 1.0D);
/* 1612 */     int n = ns.c(☃.c);
/* 1613 */     int i1 = ns.c(☃.f + 1.0D);
/*      */     
/* 1615 */     cj.a a = new cj.a();
/* 1616 */     for (int i2 = i; i2 < j; i2++) {
/* 1617 */       for (int i3 = k; i3 < m; i3++) {
/* 1618 */         for (int i4 = n; i4 < i1; i4++) {
/* 1619 */           alz alz = p(a.c(i2, i3, i4));
/* 1620 */           afh afh = alz.c();
/* 1621 */           if (afh.t() == arm1) {
/* 1622 */             int i5 = ((Integer)alz.<Integer>b(ahv.b)).intValue();
/* 1623 */             double d = (i3 + 1);
/* 1624 */             if (i5 < 8) {
/* 1625 */               d = (i3 + 1) - i5 / 8.0D;
/*      */             }
/* 1627 */             if (d >= ☃.b) {
/* 1628 */               return true;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1634 */     return false;
/*      */   }
/*      */   
/*      */   public adi a(pk ☃, double d1, double d2, double d3, float f, boolean bool) {
/* 1638 */     return a(☃, d1, d2, d3, f, false, bool);
/*      */   }
/*      */   
/*      */   public adi a(pk ☃, double d1, double d2, double d3, float f, boolean bool1, boolean bool2) {
/* 1642 */     adi adi = new adi(this, ☃, d1, d2, d3, f, bool1, bool2);
/* 1643 */     adi.a();
/* 1644 */     adi.a(true);
/* 1645 */     return adi;
/*      */   }
/*      */   
/*      */   public float a(aui ☃, aug aug1) {
/* 1649 */     double d1 = 1.0D / ((aug1.d - aug1.a) * 2.0D + 1.0D);
/* 1650 */     double d2 = 1.0D / ((aug1.e - aug1.b) * 2.0D + 1.0D);
/* 1651 */     double d3 = 1.0D / ((aug1.f - aug1.c) * 2.0D + 1.0D);
/*      */     
/* 1653 */     double d4 = (1.0D - Math.floor(1.0D / d1) * d1) / 2.0D;
/* 1654 */     double d5 = (1.0D - Math.floor(1.0D / d3) * d3) / 2.0D;
/*      */     
/* 1656 */     if (d1 < 0.0D || d2 < 0.0D || d3 < 0.0D) {
/* 1657 */       return 0.0F;
/*      */     }
/* 1659 */     int i = 0;
/* 1660 */     int j = 0; float f;
/* 1661 */     for (f = 0.0F; f <= 1.0F; f = (float)(f + d1)) {
/* 1662 */       float f1; for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d2)) {
/* 1663 */         float f2; for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d3)) {
/* 1664 */           double d6 = aug1.a + (aug1.d - aug1.a) * f;
/* 1665 */           double d7 = aug1.b + (aug1.e - aug1.b) * f1;
/* 1666 */           double d8 = aug1.c + (aug1.f - aug1.c) * f2;
/* 1667 */           if (a(new aui(d6 + d4, d7, d8 + d5), ☃) == null) {
/* 1668 */             i++;
/*      */           }
/* 1670 */           j++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1675 */     return i / j;
/*      */   }
/*      */   
/*      */   public boolean a(wn ☃, cj cj1, cq cq1) {
/* 1679 */     cj1 = cj1.a(cq1);
/*      */     
/* 1681 */     if (p(cj1).c() == afi.ab) {
/* 1682 */       a(☃, 1004, cj1, 0);
/* 1683 */       g(cj1);
/* 1684 */       return true;
/*      */     } 
/* 1686 */     return false;
/*      */   }
/*      */   
/*      */   public String z() {
/* 1690 */     return "All: " + this.f.size();
/*      */   }
/*      */   
/*      */   public String A() {
/* 1694 */     return this.v.f();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public akw s(cj ☃) {
/* 1700 */     if (!a(☃)) {
/* 1701 */       return null;
/*      */     }
/* 1703 */     akw akw = null;
/*      */     
/* 1705 */     if (this.M) {
/* 1706 */       for (int i = 0; i < this.b.size(); i++) {
/* 1707 */         akw akw1 = this.b.get(i);
/* 1708 */         if (!akw1.x() && akw1.v().equals(☃)) {
/* 1709 */           akw = akw1;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */     }
/* 1715 */     if (akw == null) {
/* 1716 */       akw = f(☃).a(☃, amy.a.a);
/*      */     }
/*      */     
/* 1719 */     if (akw == null) {
/* 1720 */       for (int i = 0; i < this.b.size(); i++) {
/* 1721 */         akw akw1 = this.b.get(i);
/* 1722 */         if (!akw1.x() && akw1.v().equals(☃)) {
/* 1723 */           akw = akw1;
/*      */           break;
/*      */         } 
/*      */       } 
/*      */     }
/* 1728 */     return akw;
/*      */   }
/*      */   
/*      */   public void a(cj ☃, akw akw1) {
/* 1732 */     if (akw1 != null && !akw1.x()) {
/* 1733 */       if (this.M) {
/* 1734 */         akw1.a(☃);
/*      */ 
/*      */         
/* 1737 */         Iterator<akw> iterator = this.b.iterator();
/* 1738 */         while (iterator.hasNext()) {
/* 1739 */           akw akw2 = iterator.next();
/* 1740 */           if (akw2.v().equals(☃)) {
/* 1741 */             akw2.y();
/* 1742 */             iterator.remove();
/*      */           } 
/*      */         } 
/*      */         
/* 1746 */         this.b.add(akw1);
/*      */       } else {
/* 1748 */         a(akw1);
/*      */         
/* 1750 */         f(☃).a(☃, akw1);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void t(cj ☃) {
/* 1756 */     akw akw = s(☃);
/* 1757 */     if (akw != null && this.M) {
/* 1758 */       akw.y();
/* 1759 */       this.b.remove(akw);
/*      */     } else {
/* 1761 */       if (akw != null) {
/* 1762 */         this.b.remove(akw);
/* 1763 */         this.h.remove(akw);
/* 1764 */         this.i.remove(akw);
/*      */       } 
/*      */       
/* 1767 */       f(☃).e(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void b(akw ☃) {
/* 1772 */     this.c.add(☃);
/*      */   }
/*      */   
/*      */   public boolean u(cj ☃) {
/* 1776 */     alz alz = p(☃);
/* 1777 */     aug aug = alz.c().a(this, ☃, alz);
/* 1778 */     return (aug != null && aug.a() >= 1.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean a(adq ☃, cj cj1) {
/* 1783 */     alz alz = ☃.p(cj1);
/* 1784 */     afh afh = alz.c();
/* 1785 */     if (afh.t().k() && afh.d()) {
/* 1786 */       return true;
/*      */     }
/* 1788 */     if (afh instanceof aju) {
/* 1789 */       return (alz.b(aju.b) == aju.a.a);
/*      */     }
/* 1791 */     if (afh instanceof ahh) {
/* 1792 */       return (alz.b(ahh.a) == ahh.a.a);
/*      */     }
/* 1794 */     if (afh instanceof ahn) {
/* 1795 */       return true;
/*      */     }
/* 1797 */     if (afh instanceof ajp) {
/* 1798 */       return (((Integer)alz.<Integer>b(ajp.a)).intValue() == 7);
/*      */     }
/* 1800 */     return false;
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
/*      */   public boolean d(cj ☃, boolean bool) {
/* 1815 */     if (!a(☃)) {
/* 1816 */       return bool;
/*      */     }
/* 1818 */     amy amy = this.v.a(☃);
/* 1819 */     if (amy.f()) {
/* 1820 */       return bool;
/*      */     }
/*      */     
/* 1823 */     afh afh = p(☃).c();
/* 1824 */     return (afh.t().k() && afh.d());
/*      */   }
/*      */   
/*      */   public void B() {
/* 1828 */     int ☃ = a(1.0F);
/* 1829 */     if (☃ != this.I) {
/* 1830 */       this.I = ☃;
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/* 1835 */     this.F = ☃;
/* 1836 */     this.G = bool1;
/*      */   }
/*      */   
/*      */   public void c() {
/* 1840 */     p();
/*      */   }
/*      */   
/*      */   protected void C() {
/* 1844 */     if (this.x.p()) {
/* 1845 */       this.p = 1.0F;
/* 1846 */       if (this.x.n()) {
/* 1847 */         this.r = 1.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void p() {
/* 1853 */     if (this.t.o()) {
/*      */       return;
/*      */     }
/* 1856 */     if (this.D) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1861 */     int ☃ = this.x.A();
/* 1862 */     if (☃ > 0) {
/* 1863 */       ☃--;
/* 1864 */       this.x.i(☃);
/* 1865 */       this.x.f(this.x.n() ? 1 : 2);
/* 1866 */       this.x.g(this.x.p() ? 1 : 2);
/*      */     } 
/*      */ 
/*      */     
/* 1870 */     int i = this.x.o();
/* 1871 */     if (i <= 0) {
/* 1872 */       if (this.x.n()) {
/* 1873 */         this.x.f(this.s.nextInt(12000) + 3600);
/*      */       } else {
/* 1875 */         this.x.f(this.s.nextInt(168000) + 12000);
/*      */       } 
/*      */     } else {
/* 1878 */       i--;
/* 1879 */       this.x.f(i);
/* 1880 */       if (i <= 0) {
/* 1881 */         this.x.a(!this.x.n());
/*      */       }
/*      */     } 
/*      */     
/* 1885 */     this.q = this.r;
/* 1886 */     if (this.x.n()) {
/* 1887 */       this.r = (float)(this.r + 0.01D);
/*      */     } else {
/* 1889 */       this.r = (float)(this.r - 0.01D);
/*      */     } 
/* 1891 */     this.r = ns.a(this.r, 0.0F, 1.0F);
/*      */ 
/*      */     
/* 1894 */     int j = this.x.q();
/* 1895 */     if (j <= 0) {
/* 1896 */       if (this.x.p()) {
/* 1897 */         this.x.g(this.s.nextInt(12000) + 12000);
/*      */       } else {
/* 1899 */         this.x.g(this.s.nextInt(168000) + 12000);
/*      */       } 
/*      */     } else {
/* 1902 */       j--;
/* 1903 */       this.x.g(j);
/* 1904 */       if (j <= 0) {
/* 1905 */         this.x.b(!this.x.p());
/*      */       }
/*      */     } 
/*      */     
/* 1909 */     this.o = this.p;
/* 1910 */     if (this.x.p()) {
/* 1911 */       this.p = (float)(this.p + 0.01D);
/*      */     } else {
/* 1913 */       this.p = (float)(this.p - 0.01D);
/*      */     } 
/* 1915 */     this.p = ns.a(this.p, 0.0F, 1.0F);
/*      */   }
/*      */   
/*      */   protected void D() {
/* 1919 */     this.E.clear();
/*      */     
/* 1921 */     this.B.a("buildList"); int ☃;
/* 1922 */     for (☃ = 0; ☃ < this.j.size(); ☃++) {
/* 1923 */       wn wn = this.j.get(☃);
/* 1924 */       int i = ns.c(wn.s / 16.0D);
/* 1925 */       int j = ns.c(wn.u / 16.0D);
/*      */       
/* 1927 */       int k = q();
/* 1928 */       for (int m = -k; m <= k; m++) {
/* 1929 */         for (int n = -k; n <= k; n++) {
/* 1930 */           this.E.add(new adg(m + i, n + j));
/*      */         }
/*      */       } 
/*      */     } 
/* 1934 */     this.B.b();
/*      */     
/* 1936 */     if (this.L > 0) {
/* 1937 */       this.L--;
/*      */     }
/*      */     
/* 1940 */     this.B.a("playerCheckLight");
/*      */     
/* 1942 */     if (!this.j.isEmpty()) {
/* 1943 */       ☃ = this.s.nextInt(this.j.size());
/* 1944 */       wn wn = this.j.get(☃);
/* 1945 */       int i = ns.c(wn.s) + this.s.nextInt(11) - 5;
/* 1946 */       int j = ns.c(wn.t) + this.s.nextInt(11) - 5;
/* 1947 */       int k = ns.c(wn.u) + this.s.nextInt(11) - 5;
/* 1948 */       x(new cj(i, j, k));
/*      */     } 
/* 1950 */     this.B.b();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(int ☃, int i, amy amy1) {
/* 1956 */     this.B.c("moodSound");
/* 1957 */     if (this.L == 0 && !this.D) {
/* 1958 */       this.m = this.m * 3 + 1013904223;
/* 1959 */       int j = this.m >> 2;
/* 1960 */       int k = j & 0xF;
/* 1961 */       int m = j >> 8 & 0xF;
/* 1962 */       int n = j >> 16 & 0xFF;
/* 1963 */       cj cj = new cj(k, n, m);
/*      */       
/* 1965 */       afh afh = amy1.a(cj);
/* 1966 */       k += ☃;
/* 1967 */       m += i;
/* 1968 */       if (afh.t() == arm.a && k(cj) <= this.s.nextInt(8) && b(ads.a, cj) <= 0) {
/* 1969 */         wn wn = a(k + 0.5D, n + 0.5D, m + 0.5D, 8.0D);
/* 1970 */         if (wn != null && wn.e(k + 0.5D, n + 0.5D, m + 0.5D) > 4.0D) {
/* 1971 */           a(k + 0.5D, n + 0.5D, m + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.s.nextFloat() * 0.2F);
/* 1972 */           this.L = this.s.nextInt(12000) + 6000;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1977 */     this.B.c("checkLight");
/* 1978 */     amy1.m();
/*      */   }
/*      */   
/*      */   protected void h() {
/* 1982 */     D();
/*      */   }
/*      */   
/*      */   public void a(afh ☃, cj cj1, Random random) {
/* 1986 */     this.e = true;
/* 1987 */     ☃.b(this, cj1, p(cj1), random);
/* 1988 */     this.e = false;
/*      */   }
/*      */   
/*      */   public boolean v(cj ☃) {
/* 1992 */     return e(☃, false);
/*      */   }
/*      */   
/*      */   public boolean w(cj ☃) {
/* 1996 */     return e(☃, true);
/*      */   }
/*      */   
/*      */   public boolean e(cj ☃, boolean bool) {
/* 2000 */     ady ady = b(☃);
/* 2001 */     float f = ady.a(☃);
/* 2002 */     if (f > 0.15F) {
/* 2003 */       return false;
/*      */     }
/*      */     
/* 2006 */     if (☃.o() >= 0 && ☃.o() < 256 && b(ads.b, ☃) < 10) {
/* 2007 */       alz alz = p(☃);
/* 2008 */       afh afh = alz.c();
/* 2009 */       if ((afh == afi.j || afh == afi.i) && ((Integer)alz.<Integer>b(ahv.b)).intValue() == 0) {
/* 2010 */         if (!bool) {
/* 2011 */           return true;
/*      */         }
/*      */         
/* 2014 */         boolean bool1 = (F(☃.e()) && F(☃.f()) && F(☃.c()) && F(☃.d()));
/* 2015 */         if (!bool1) {
/* 2016 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 2020 */     return false;
/*      */   }
/*      */   
/*      */   private boolean F(cj ☃) {
/* 2024 */     return (p(☃).c().t() == arm.h);
/*      */   }
/*      */   
/*      */   public boolean f(cj ☃, boolean bool) {
/* 2028 */     ady ady = b(☃);
/* 2029 */     float f = ady.a(☃);
/* 2030 */     if (f > 0.15F)
/* 2031 */       return false; 
/* 2032 */     if (!bool) {
/* 2033 */       return true;
/*      */     }
/*      */     
/* 2036 */     if (☃.o() >= 0 && ☃.o() < 256 && b(ads.b, ☃) < 10) {
/* 2037 */       afh afh = p(☃).c();
/*      */ 
/*      */       
/* 2040 */       if (afh.t() == arm.a && afi.aH.d(this, ☃)) {
/* 2041 */         return true;
/*      */       }
/*      */     } 
/*      */     
/* 2045 */     return false;
/*      */   }
/*      */   
/*      */   public boolean x(cj ☃) {
/* 2049 */     boolean bool = false;
/* 2050 */     if (!this.t.o()) {
/* 2051 */       bool |= c(ads.a, ☃);
/*      */     }
/* 2053 */     bool |= c(ads.b, ☃);
/* 2054 */     return bool;
/*      */   }
/*      */   
/*      */   protected adm(atp ☃, ato ato1, anm anm1, nt nt1, boolean bool) {
/* 2058 */     this.H = new int[32768]; this.w = ☃; this.B = nt1; this.x = ato1;
/*      */     this.t = anm1;
/*      */     this.D = bool;
/* 2061 */     this.N = anm1.r(); } private int a(cj ☃, ads ads1) { if (ads1 == ads.a && i(☃)) {
/* 2062 */       return 15;
/*      */     }
/* 2064 */     afh afh = p(☃).c();
/* 2065 */     int i = (ads1 == ads.a) ? 0 : afh.r();
/* 2066 */     int j = afh.p();
/* 2067 */     if (j >= 15 && afh.r() > 0) {
/* 2068 */       j = 1;
/*      */     }
/* 2070 */     if (j < 1) {
/* 2071 */       j = 1;
/*      */     }
/* 2073 */     if (j >= 15) {
/* 2074 */       return 0;
/*      */     }
/*      */     
/* 2077 */     if (i >= 14)
/* 2078 */       return i; 
/*      */     cq[] arrayOfCq;
/*      */     int k, m;
/* 2081 */     for (arrayOfCq = cq.values(), k = arrayOfCq.length, m = 0; m < k; ) { cq cq = arrayOfCq[m];
/* 2082 */       cj cj1 = ☃.a(cq);
/* 2083 */       int n = b(ads1, cj1) - j;
/*      */       
/* 2085 */       if (n > i) {
/* 2086 */         i = n;
/*      */       }
/* 2088 */       if (i >= 14) {
/* 2089 */         return i;
/*      */       }
/*      */       m++; }
/*      */     
/* 2093 */     return i; }
/*      */ 
/*      */   
/*      */   public boolean c(ads ☃, cj cj1) {
/* 2097 */     if (!a(cj1, 17, false)) {
/* 2098 */       return false;
/*      */     }
/*      */     
/* 2101 */     int i = 0;
/* 2102 */     int j = 0;
/*      */     
/* 2104 */     this.B.a("getBrightness");
/* 2105 */     int k = b(☃, cj1);
/* 2106 */     int m = a(cj1, ☃);
/* 2107 */     int n = cj1.n();
/* 2108 */     int i1 = cj1.o();
/* 2109 */     int i2 = cj1.p();
/*      */     
/* 2111 */     if (m > k) {
/* 2112 */       this.H[j++] = 133152;
/* 2113 */     } else if (m < k) {
/* 2114 */       this.H[j++] = 0x20820 | k << 18;
/*      */ 
/*      */       
/* 2117 */       while (i < j) {
/* 2118 */         int i3 = this.H[i++];
/* 2119 */         int i4 = (i3 & 0x3F) - 32 + n;
/* 2120 */         int i5 = (i3 >> 6 & 0x3F) - 32 + i1;
/* 2121 */         int i6 = (i3 >> 12 & 0x3F) - 32 + i2;
/* 2122 */         int i7 = i3 >> 18 & 0xF;
/* 2123 */         cj cj2 = new cj(i4, i5, i6);
/* 2124 */         int i8 = b(☃, cj2);
/*      */         
/* 2126 */         if (i8 == i7) {
/* 2127 */           a(☃, cj2, 0);
/*      */           
/* 2129 */           if (i7 > 0) {
/* 2130 */             int i9 = ns.a(i4 - n);
/* 2131 */             int i10 = ns.a(i5 - i1);
/* 2132 */             int i11 = ns.a(i6 - i2);
/*      */             
/* 2134 */             if (i9 + i10 + i11 < 17) {
/* 2135 */               cj.a a = new cj.a(); cq[] arrayOfCq; int i12, i13;
/* 2136 */               for (arrayOfCq = cq.values(), i12 = arrayOfCq.length, i13 = 0; i13 < i12; ) { cq cq = arrayOfCq[i13];
/* 2137 */                 int i14 = i4 + cq.g();
/* 2138 */                 int i15 = i5 + cq.h();
/* 2139 */                 int i16 = i6 + cq.i();
/* 2140 */                 a.c(i14, i15, i16);
/* 2141 */                 int i17 = Math.max(1, p(a).c().p());
/*      */                 
/* 2143 */                 i8 = b(☃, a);
/*      */                 
/* 2145 */                 if (i8 == i7 - i17 && j < this.H.length)
/* 2146 */                   this.H[j++] = i14 - n + 32 | i15 - i1 + 32 << 6 | i16 - i2 + 32 << 12 | i7 - i17 << 18; 
/*      */                 i13++; }
/*      */             
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/* 2153 */       i = 0;
/*      */     } 
/* 2155 */     this.B.b();
/*      */     
/* 2157 */     this.B.a("checkedPosition < toCheckCount");
/* 2158 */     while (i < j) {
/* 2159 */       int i3 = this.H[i++];
/* 2160 */       int i4 = (i3 & 0x3F) - 32 + n;
/* 2161 */       int i5 = (i3 >> 6 & 0x3F) - 32 + i1;
/* 2162 */       int i6 = (i3 >> 12 & 0x3F) - 32 + i2;
/* 2163 */       cj cj2 = new cj(i4, i5, i6);
/*      */       
/* 2165 */       int i7 = b(☃, cj2);
/* 2166 */       int i8 = a(cj2, ☃);
/*      */       
/* 2168 */       if (i8 != i7) {
/* 2169 */         a(☃, cj2, i8);
/*      */         
/* 2171 */         if (i8 > i7) {
/* 2172 */           int i9 = Math.abs(i4 - n);
/* 2173 */           int i10 = Math.abs(i5 - i1);
/* 2174 */           int i11 = Math.abs(i6 - i2);
/* 2175 */           boolean bool = (j < this.H.length - 6);
/*      */           
/* 2177 */           if (i9 + i10 + i11 < 17 && bool) {
/* 2178 */             if (b(☃, cj2.e()) < i8) {
/* 2179 */               this.H[j++] = i4 - 1 - n + 32 + (i5 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 2181 */             if (b(☃, cj2.f()) < i8) {
/* 2182 */               this.H[j++] = i4 + 1 - n + 32 + (i5 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 2184 */             if (b(☃, cj2.b()) < i8) {
/* 2185 */               this.H[j++] = i4 - n + 32 + (i5 - 1 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 2187 */             if (b(☃, cj2.a()) < i8) {
/* 2188 */               this.H[j++] = i4 - n + 32 + (i5 + 1 - i1 + 32 << 6) + (i6 - i2 + 32 << 12);
/*      */             }
/* 2190 */             if (b(☃, cj2.c()) < i8) {
/* 2191 */               this.H[j++] = i4 - n + 32 + (i5 - i1 + 32 << 6) + (i6 - 1 - i2 + 32 << 12);
/*      */             }
/* 2193 */             if (b(☃, cj2.d()) < i8) {
/* 2194 */               this.H[j++] = i4 - n + 32 + (i5 - i1 + 32 << 6) + (i6 + 1 - i2 + 32 << 12);
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 2200 */     this.B.b();
/*      */     
/* 2202 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(boolean ☃) {
/* 2206 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public List<adw> a(amy ☃, boolean bool) {
/* 2211 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public List<adw> a(aqe ☃, boolean bool) {
/* 2216 */     return null;
/*      */   }
/*      */   
/*      */   public List<pk> b(pk ☃, aug aug1) {
/* 2220 */     return a(☃, aug1, po.d);
/*      */   }
/*      */   
/*      */   public List<pk> a(pk ☃, aug aug1, Predicate<? super pk> predicate) {
/* 2224 */     List<pk> list = Lists.newArrayList();
/* 2225 */     int i = ns.c((aug1.a - 2.0D) / 16.0D);
/* 2226 */     int j = ns.c((aug1.d + 2.0D) / 16.0D);
/* 2227 */     int k = ns.c((aug1.c - 2.0D) / 16.0D);
/* 2228 */     int m = ns.c((aug1.f + 2.0D) / 16.0D);
/* 2229 */     for (int n = i; n <= j; n++) {
/* 2230 */       for (int i1 = k; i1 <= m; i1++) {
/* 2231 */         if (a(n, i1, true)) {
/* 2232 */           a(n, i1).a(☃, aug1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/* 2236 */     return list;
/*      */   }
/*      */ 
/*      */   
/*      */   public <T extends pk> List<T> a(Class<? extends T> ☃, Predicate<? super T> predicate) {
/* 2241 */     List<T> list = Lists.newArrayList();
/* 2242 */     for (Iterator<pk> iterator = this.f.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 2243 */       if (☃.isAssignableFrom(pk.getClass()) && predicate.apply(pk)) {
/* 2244 */         list.add((T)pk);
/*      */       } }
/*      */     
/* 2247 */     return list;
/*      */   }
/*      */ 
/*      */   
/*      */   public <T extends pk> List<T> b(Class<? extends T> ☃, Predicate<? super T> predicate) {
/* 2252 */     List<T> list = Lists.newArrayList();
/* 2253 */     for (Iterator<wn> iterator = this.j.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 2254 */       if (☃.isAssignableFrom(pk.getClass()) && predicate.apply(pk)) {
/* 2255 */         list.add((T)pk);
/*      */       } }
/*      */     
/* 2258 */     return list;
/*      */   }
/*      */   
/*      */   public <T extends pk> List<T> a(Class<? extends T> ☃, aug aug1) {
/* 2262 */     return a(☃, aug1, (Predicate)po.d);
/*      */   }
/*      */   
/*      */   public <T extends pk> List<T> a(Class<? extends T> ☃, aug aug1, Predicate<? super T> predicate) {
/* 2266 */     int i = ns.c((aug1.a - 2.0D) / 16.0D);
/* 2267 */     int j = ns.c((aug1.d + 2.0D) / 16.0D);
/* 2268 */     int k = ns.c((aug1.c - 2.0D) / 16.0D);
/* 2269 */     int m = ns.c((aug1.f + 2.0D) / 16.0D);
/* 2270 */     List<T> list = Lists.newArrayList();
/*      */     
/* 2272 */     for (int n = i; n <= j; n++) {
/* 2273 */       for (int i1 = k; i1 <= m; i1++) {
/* 2274 */         if (a(n, i1, true)) {
/* 2275 */           a(n, i1).a(☃, aug1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 2280 */     return list;
/*      */   }
/*      */   
/*      */   public <T extends pk> T a(Class<? extends T> ☃, aug aug1, T t) {
/*      */     pk pk;
/* 2285 */     List<T> list = a(☃, aug1);
/* 2286 */     T t1 = null;
/* 2287 */     double d = Double.MAX_VALUE;
/* 2288 */     for (int i = 0; i < list.size(); i++) {
/* 2289 */       pk pk1 = (pk)list.get(i);
/* 2290 */       if (pk1 != t)
/*      */       {
/*      */         
/* 2293 */         if (po.d.apply(pk1)) {
/*      */ 
/*      */           
/* 2296 */           double d1 = t.h(pk1);
/* 2297 */           if (d1 <= d)
/*      */           
/*      */           { 
/* 2300 */             pk = pk1;
/* 2301 */             d = d1; } 
/*      */         }  } 
/* 2303 */     }  return (T)pk;
/*      */   }
/*      */ 
/*      */   
/*      */   public pk a(int ☃) {
/* 2308 */     return this.l.a(☃);
/*      */   }
/*      */   
/*      */   public List<pk> E() {
/* 2312 */     return this.f;
/*      */   }
/*      */   
/*      */   public void b(cj ☃, akw akw1) {
/* 2316 */     if (e(☃)) {
/* 2317 */       f(☃).e();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(Class<?> ☃) {
/* 2323 */     int i = 0;
/* 2324 */     for (Iterator<pk> iterator = this.f.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 2325 */       if (pk instanceof ps && ((ps)pk).bZ()) {
/*      */         continue;
/*      */       }
/* 2328 */       if (☃.isAssignableFrom(pk.getClass())) {
/* 2329 */         i++;
/*      */       } }
/*      */     
/* 2332 */     return i;
/*      */   }
/*      */   
/*      */   public void b(Collection<pk> ☃) {
/* 2336 */     this.f.addAll(☃);
/* 2337 */     for (Iterator<pk> iterator = ☃.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 2338 */       a(pk); }
/*      */   
/*      */   }
/*      */   
/*      */   public void c(Collection<pk> ☃) {
/* 2343 */     this.g.addAll(☃);
/*      */   }
/*      */   
/*      */   public boolean a(afh ☃, cj cj1, boolean bool, cq cq1, pk pk1, zx zx1) {
/* 2347 */     afh afh1 = p(cj1).c();
/*      */     
/* 2349 */     aug aug = bool ? null : ☃.a(this, cj1, ☃.Q());
/* 2350 */     if (aug != null && !a(aug, pk1)) {
/* 2351 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 2355 */     if (afh1.t() == arm.q && ☃ == afi.cf) {
/* 2356 */       return true;
/*      */     }
/*      */     
/* 2359 */     return (afh1.t().j() && ☃.a(this, cj1, cq1, zx1));
/*      */   }
/*      */   
/*      */   public int F() {
/* 2363 */     return this.a;
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/* 2367 */     this.a = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(cj ☃, cq cq1) {
/* 2372 */     alz alz = p(☃);
/* 2373 */     return alz.c().b(this, ☃, alz, cq1);
/*      */   }
/*      */ 
/*      */   
/*      */   public adr G() {
/* 2378 */     return this.x.u();
/*      */   }
/*      */   
/*      */   public int y(cj ☃) {
/* 2382 */     int i = 0;
/* 2383 */     i = Math.max(i, a(☃.b(), cq.a));
/* 2384 */     if (i >= 15) {
/* 2385 */       return i;
/*      */     }
/* 2387 */     i = Math.max(i, a(☃.a(), cq.b));
/* 2388 */     if (i >= 15) {
/* 2389 */       return i;
/*      */     }
/* 2391 */     i = Math.max(i, a(☃.c(), cq.c));
/* 2392 */     if (i >= 15) {
/* 2393 */       return i;
/*      */     }
/* 2395 */     i = Math.max(i, a(☃.d(), cq.d));
/* 2396 */     if (i >= 15) {
/* 2397 */       return i;
/*      */     }
/* 2399 */     i = Math.max(i, a(☃.e(), cq.e));
/* 2400 */     if (i >= 15) {
/* 2401 */       return i;
/*      */     }
/* 2403 */     i = Math.max(i, a(☃.f(), cq.f));
/* 2404 */     if (i >= 15) {
/* 2405 */       return i;
/*      */     }
/* 2407 */     return i;
/*      */   }
/*      */   
/*      */   public boolean b(cj ☃, cq cq1) {
/* 2411 */     return (c(☃, cq1) > 0);
/*      */   }
/*      */   
/*      */   public int c(cj ☃, cq cq1) {
/* 2415 */     alz alz = p(☃);
/* 2416 */     afh afh = alz.c();
/*      */     
/* 2418 */     if (afh.v()) {
/* 2419 */       return y(☃);
/*      */     }
/* 2421 */     return afh.a(this, ☃, alz, cq1);
/*      */   }
/*      */   
/*      */   public boolean z(cj ☃) {
/* 2425 */     if (c(☃.b(), cq.a) > 0) {
/* 2426 */       return true;
/*      */     }
/* 2428 */     if (c(☃.a(), cq.b) > 0) {
/* 2429 */       return true;
/*      */     }
/* 2431 */     if (c(☃.c(), cq.c) > 0) {
/* 2432 */       return true;
/*      */     }
/* 2434 */     if (c(☃.d(), cq.d) > 0) {
/* 2435 */       return true;
/*      */     }
/* 2437 */     if (c(☃.e(), cq.e) > 0) {
/* 2438 */       return true;
/*      */     }
/* 2440 */     if (c(☃.f(), cq.f) > 0) {
/* 2441 */       return true;
/*      */     }
/* 2443 */     return false;
/*      */   }
/*      */   
/*      */   public int A(cj ☃) {
/* 2447 */     int i = 0; cq[] arrayOfCq;
/*      */     int j, k;
/* 2449 */     for (arrayOfCq = cq.values(), j = arrayOfCq.length, k = 0; k < j; ) { cq cq = arrayOfCq[k];
/* 2450 */       int m = c(☃.a(cq), cq);
/*      */       
/* 2452 */       if (m >= 15) {
/* 2453 */         return 15;
/*      */       }
/* 2455 */       if (m > i) {
/* 2456 */         i = m;
/*      */       }
/*      */       k++; }
/*      */     
/* 2460 */     return i;
/*      */   }
/*      */ 
/*      */   
/*      */   public wn a(pk ☃, double d) {
/* 2465 */     return a(☃.s, ☃.t, ☃.u, d);
/*      */   }
/*      */ 
/*      */   
/*      */   public wn a(double ☃, double d1, double d2, double d3) {
/* 2470 */     double d = -1.0D;
/* 2471 */     wn wn = null;
/* 2472 */     for (int i = 0; i < this.j.size(); i++) {
/* 2473 */       wn wn1 = this.j.get(i);
/* 2474 */       if (po.d.apply(wn1)) {
/*      */ 
/*      */         
/* 2477 */         double d4 = wn1.e(☃, d1, d2);
/* 2478 */         if ((d3 < 0.0D || d4 < d3 * d3) && (d == -1.0D || d4 < d)) {
/* 2479 */           d = d4;
/* 2480 */           wn = wn1;
/*      */         } 
/*      */       } 
/* 2483 */     }  return wn;
/*      */   }
/*      */   
/*      */   public boolean b(double ☃, double d1, double d2, double d3) {
/* 2487 */     for (int i = 0; i < this.j.size(); i++) {
/* 2488 */       wn wn = this.j.get(i);
/* 2489 */       if (po.d.apply(wn)) {
/*      */ 
/*      */         
/* 2492 */         double d = wn.e(☃, d1, d2);
/* 2493 */         if (d3 < 0.0D || d < d3 * d3)
/* 2494 */           return true; 
/*      */       } 
/*      */     } 
/* 2497 */     return false;
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
/*      */   public wn a(String ☃) {
/* 2555 */     for (int i = 0; i < this.j.size(); i++) {
/* 2556 */       wn wn = this.j.get(i);
/* 2557 */       if (☃.equals(wn.e_())) {
/* 2558 */         return wn;
/*      */       }
/*      */     } 
/* 2561 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public wn b(UUID ☃) {
/* 2566 */     for (int i = 0; i < this.j.size(); i++) {
/* 2567 */       wn wn = this.j.get(i);
/* 2568 */       if (☃.equals(wn.aK())) {
/* 2569 */         return wn;
/*      */       }
/*      */     } 
/* 2572 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void H() {}
/*      */   
/*      */   public void I() throws adn {
/* 2579 */     this.w.c();
/*      */   }
/*      */   
/*      */   public void a(long ☃) {
/* 2583 */     this.x.b(☃);
/*      */   }
/*      */   
/*      */   public long J() {
/* 2587 */     return this.x.b();
/*      */   }
/*      */   
/*      */   public long K() {
/* 2591 */     return this.x.f();
/*      */   }
/*      */   
/*      */   public long L() {
/* 2595 */     return this.x.g();
/*      */   }
/*      */   
/*      */   public void b(long ☃) {
/* 2599 */     this.x.c(☃);
/*      */   }
/*      */   
/*      */   public cj M() {
/* 2603 */     cj ☃ = new cj(this.x.c(), this.x.d(), this.x.e());
/* 2604 */     if (!af().a(☃)) {
/* 2605 */       ☃ = m(new cj(af().f(), 0.0D, af().g()));
/*      */     }
/* 2607 */     return ☃;
/*      */   }
/*      */   
/*      */   public void B(cj ☃) {
/* 2611 */     this.x.a(☃);
/*      */   }
/*      */   
/*      */   public void h(pk ☃) {
/* 2615 */     int i = ns.c(☃.s / 16.0D);
/* 2616 */     int j = ns.c(☃.u / 16.0D);
/* 2617 */     int k = 2;
/* 2618 */     for (int m = i - k; m <= i + k; m++) {
/* 2619 */       for (int n = j - k; n <= j + k; n++) {
/* 2620 */         a(m, n);
/*      */       }
/*      */     } 
/*      */     
/* 2624 */     if (!this.f.contains(☃)) {
/* 2625 */       this.f.add(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(wn ☃, cj cj1) {
/* 2630 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pk ☃, byte b) {}
/*      */   
/*      */   public amv N() {
/* 2637 */     return this.v;
/*      */   }
/*      */   
/*      */   public void c(cj ☃, afh afh1, int i, int j) {
/* 2641 */     afh1.a(this, ☃, p(☃), i, j);
/*      */   }
/*      */   
/*      */   public atp O() {
/* 2645 */     return this.w;
/*      */   }
/*      */   
/*      */   public ato P() {
/* 2649 */     return this.x;
/*      */   }
/*      */   
/*      */   public adk Q() {
/* 2653 */     return this.x.x();
/*      */   }
/*      */ 
/*      */   
/*      */   public void d() {}
/*      */   
/*      */   public float h(float ☃) {
/* 2660 */     return (this.q + (this.r - this.q) * ☃) * j(☃);
/*      */   }
/*      */   
/*      */   public void i(float ☃) {
/* 2664 */     this.q = ☃;
/* 2665 */     this.r = ☃;
/*      */   }
/*      */   
/*      */   public float j(float ☃) {
/* 2669 */     return this.o + (this.p - this.o) * ☃;
/*      */   }
/*      */   
/*      */   public void k(float ☃) {
/* 2673 */     this.o = ☃;
/* 2674 */     this.p = ☃;
/*      */   }
/*      */   
/*      */   public boolean R() {
/* 2678 */     return (h(1.0F) > 0.9D);
/*      */   }
/*      */   
/*      */   public boolean S() {
/* 2682 */     return (j(1.0F) > 0.2D);
/*      */   }
/*      */   
/*      */   public boolean C(cj ☃) {
/* 2686 */     if (!S()) {
/* 2687 */       return false;
/*      */     }
/* 2689 */     if (!i(☃)) {
/* 2690 */       return false;
/*      */     }
/* 2692 */     if (q(☃).o() > ☃.o()) {
/* 2693 */       return false;
/*      */     }
/*      */     
/* 2696 */     ady ady = b(☃);
/* 2697 */     if (ady.d()) {
/* 2698 */       return false;
/*      */     }
/* 2700 */     if (f(☃, false)) {
/* 2701 */       return false;
/*      */     }
/* 2703 */     return ady.e();
/*      */   }
/*      */   
/*      */   public boolean D(cj ☃) {
/* 2707 */     ady ady = b(☃);
/* 2708 */     return ady.f();
/*      */   }
/*      */ 
/*      */   
/*      */   public aua T() {
/* 2713 */     return this.z;
/*      */   }
/*      */   
/*      */   public void a(String ☃, ate ate1) {
/* 2717 */     this.z.a(☃, ate1);
/*      */   }
/*      */ 
/*      */   
/*      */   public ate a(Class<? extends ate> ☃, String str) {
/* 2722 */     return this.z.a(☃, str);
/*      */   }
/*      */   
/*      */   public int b(String ☃) {
/* 2726 */     return this.z.a(☃);
/*      */   }
/*      */   
/*      */   public void a(int ☃, cj cj1, int i) {
/* 2730 */     for (int j = 0; j < this.u.size(); j++) {
/* 2731 */       ((ado)this.u.get(j)).a(☃, cj1, i);
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(int ☃, cj cj1, int i) {
/* 2736 */     a((wn)null, ☃, cj1, i);
/*      */   }
/*      */   
/*      */   public void a(wn ☃, int i, cj cj1, int j) {
/*      */     try {
/* 2741 */       for (int k = 0; k < this.u.size(); k++) {
/* 2742 */         ((ado)this.u.get(k)).a(☃, i, cj1, j);
/*      */       }
/* 2744 */     } catch (Throwable throwable) {
/* 2745 */       b b = b.a(throwable, "Playing level event");
/* 2746 */       c c = b.a("Level event being played");
/*      */       
/* 2748 */       c.a("Block coordinates", c.a(cj1));
/* 2749 */       c.a("Event source", ☃);
/* 2750 */       c.a("Event type", Integer.valueOf(i));
/* 2751 */       c.a("Event data", Integer.valueOf(j));
/*      */       
/* 2753 */       throw new e(b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int U() {
/* 2759 */     return 256;
/*      */   }
/*      */   
/*      */   public int V() {
/* 2763 */     return this.t.o() ? 128 : 256;
/*      */   }
/*      */   
/*      */   public Random a(int ☃, int i, int j) {
/* 2767 */     long l = ☃ * 341873128712L + i * 132897987541L + P().b() + j;
/* 2768 */     this.s.setSeed(l);
/* 2769 */     return this.s;
/*      */   }
/*      */ 
/*      */   
/*      */   public cj a(String ☃, cj cj1) {
/* 2774 */     return N().a(this, ☃, cj1);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean W() {
/* 2779 */     return false;
/*      */   }
/*      */   
/*      */   public double X() {
/* 2783 */     if (this.x.u() == adr.c) {
/* 2784 */       return 0.0D;
/*      */     }
/* 2786 */     return 63.0D;
/*      */   }
/*      */   
/*      */   public c a(b ☃) {
/* 2790 */     c c = ☃.a("Affected level", 1);
/*      */     
/* 2792 */     c.a("Level name", (this.x == null) ? "????" : this.x.k());
/*      */     
/* 2794 */     c.a("All players", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2797 */             return this.a.j.size() + " total; " + this.a.j.toString();
/*      */           }
/*      */         });
/*      */     
/* 2801 */     c.a("Chunk stats", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2804 */             return this.a.v.f();
/*      */           }
/*      */         });
/*      */     
/*      */     try {
/* 2809 */       this.x.a(c);
/* 2810 */     } catch (Throwable throwable) {
/* 2811 */       c.a("Level Data Unobtainable", throwable);
/*      */     } 
/*      */     
/* 2814 */     return c;
/*      */   }
/*      */   
/*      */   public void c(int ☃, cj cj1, int i) {
/* 2818 */     for (int j = 0; j < this.u.size(); j++) {
/* 2819 */       ado ado = this.u.get(j);
/* 2820 */       ado.b(☃, cj1, i);
/*      */     } 
/*      */   }
/*      */   
/*      */   public Calendar Y() {
/* 2825 */     if (K() % 600L == 0L) {
/* 2826 */       this.K.setTimeInMillis(MinecraftServer.az());
/*      */     }
/* 2828 */     return this.K;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2, double d3, double d4, double d5, dn dn1) {}
/*      */   
/*      */   public auo Z() {
/* 2835 */     return this.C;
/*      */   }
/*      */   
/*      */   public void e(cj ☃, afh afh1) {
/* 2839 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 2840 */       cj cj1 = ☃.a(cq);
/*      */       
/* 2842 */       if (e(cj1)) {
/* 2843 */         alz alz = p(cj1);
/* 2844 */         if (afi.cj.e(alz.c())) {
/* 2845 */           alz.c().a(this, cj1, alz, afh1); continue;
/* 2846 */         }  if (alz.c().v()) {
/* 2847 */           cj1 = cj1.a(cq);
/* 2848 */           alz = p(cj1);
/*      */           
/* 2850 */           if (afi.cj.e(alz.c())) {
/* 2851 */             alz.c().a(this, cj1, alz, afh1);
/*      */           }
/*      */         } 
/*      */       }  }
/*      */   
/*      */   }
/*      */   
/*      */   public ok E(cj ☃) {
/* 2859 */     long l = 0L;
/* 2860 */     float f = 0.0F;
/* 2861 */     if (e(☃)) {
/* 2862 */       f = y();
/* 2863 */       l = f(☃).w();
/*      */     } 
/*      */     
/* 2866 */     return new ok(aa(), L(), l, f);
/*      */   }
/*      */   
/*      */   public oj aa() {
/* 2870 */     return P().y();
/*      */   }
/*      */   
/*      */   public int ab() {
/* 2874 */     return this.I;
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/* 2878 */     this.I = ☃;
/*      */   }
/*      */   
/*      */   public int ac() {
/* 2882 */     return this.J;
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/* 2886 */     this.J = ☃;
/*      */   }
/*      */   
/*      */   public boolean ad() {
/* 2890 */     return this.y;
/*      */   }
/*      */   
/*      */   public th ae() {
/* 2894 */     return this.A;
/*      */   }
/*      */   
/*      */   public ams af() {
/* 2898 */     return this.N;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(int ☃, int i) {
/* 2906 */     cj cj = M();
/* 2907 */     int j = ☃ * 16 + 8 - cj.n();
/* 2908 */     int k = i * 16 + 8 - cj.p();
/* 2909 */     int m = 128;
/* 2910 */     return (j >= -m && j <= m && k >= -m && k <= m);
/*      */   }
/*      */   
/*      */   protected abstract amv k();
/*      */   
/*      */   protected abstract int q();
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */