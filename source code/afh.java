/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
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
/*      */ public class afh
/*      */ {
/*   43 */   private static final jy a = new jy("air");
/*   44 */   public static final co<jy, afh> c = new co<jy, afh>(a);
/*   45 */   public static final ct<alz> d = new ct<alz>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private yz b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int a(afh ☃) {
/*   65 */     return c.b(☃);
/*      */   }
/*      */   
/*      */   public static int f(alz ☃) {
/*   69 */     afh afh1 = ☃.c();
/*   70 */     return a(afh1) + (afh1.c(☃) << 12);
/*      */   }
/*      */   
/*      */   public static afh c(int ☃) {
/*   74 */     return c.a(☃);
/*      */   }
/*      */   
/*      */   public static alz d(int ☃) {
/*   78 */     int i = ☃ & 0xFFF;
/*   79 */     int j = ☃ >> 12 & 0xF;
/*   80 */     return c(i).a(j);
/*      */   }
/*      */   
/*      */   public static afh a(zw ☃) {
/*   84 */     if (☃ instanceof yo) {
/*   85 */       return ((yo)☃).d();
/*      */     }
/*      */     
/*   88 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static afh b(String ☃) {
/*   93 */     jy jy1 = new jy(☃);
/*   94 */     if (c.d(jy1)) {
/*   95 */       return c.a(jy1);
/*      */     }
/*      */     
/*      */     try {
/*   99 */       return c.a(Integer.parseInt(☃));
/*  100 */     } catch (NumberFormatException numberFormatException) {
/*      */ 
/*      */       
/*  103 */       return null;
/*      */     } 
/*      */   }
/*      */   public boolean o() {
/*  107 */     return this.r;
/*      */   }
/*      */   
/*      */   public int p() {
/*  111 */     return this.s;
/*      */   }
/*      */   
/*      */   public boolean q() {
/*  115 */     return this.t;
/*      */   }
/*      */   
/*      */   public int r() {
/*  119 */     return this.u;
/*      */   }
/*      */   
/*      */   public boolean s() {
/*  123 */     return this.v;
/*      */   }
/*      */   
/*      */   public arm t() {
/*  127 */     return this.J;
/*      */   }
/*      */   
/*      */   public arn g(alz ☃) {
/*  131 */     return this.K;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public alz a(int ☃) {
/*  137 */     return Q();
/*      */   }
/*      */   
/*      */   public int c(alz ☃) {
/*  141 */     if (☃ == null || ☃.a().isEmpty()) {
/*  142 */       return 0;
/*      */     }
/*      */     
/*  145 */     throw new IllegalArgumentException("Don't know how to convert " + ☃ + " back into data...");
/*      */   }
/*      */   
/*      */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  149 */     return ☃;
/*      */   }
/*      */   
/*      */   public static class b {
/*      */     public final String a;
/*      */     public final float b;
/*      */     public final float c;
/*      */     
/*      */     public b(String ☃, float f1, float f2) {
/*  158 */       this.a = ☃;
/*  159 */       this.b = f1;
/*  160 */       this.c = f2;
/*      */     }
/*      */     
/*      */     public float d() {
/*  164 */       return this.b;
/*      */     }
/*      */     
/*      */     public float e() {
/*  168 */       return this.c;
/*      */     }
/*      */     
/*      */     public String a() {
/*  172 */       return "dig." + this.a;
/*      */     }
/*      */     
/*      */     public String c() {
/*  176 */       return "step." + this.a;
/*      */     }
/*      */     
/*      */     public String b() {
/*  180 */       return a();
/*      */     }
/*      */   }
/*      */   
/*  184 */   public static final b e = new b("stone", 1.0F, 1.0F);
/*  185 */   public static final b f = new b("wood", 1.0F, 1.0F);
/*  186 */   public static final b g = new b("gravel", 1.0F, 1.0F);
/*  187 */   public static final b h = new b("grass", 1.0F, 1.0F);
/*  188 */   public static final b i = new b("stone", 1.0F, 1.0F);
/*  189 */   public static final b j = new b("stone", 1.0F, 1.5F);
/*  190 */   public static final b k = new b("stone", 1.0F, 1.0F)
/*      */     {
/*      */       public String a() {
/*  193 */         return "dig.glass";
/*      */       }
/*      */ 
/*      */       
/*      */       public String b() {
/*  198 */         return "step.stone";
/*      */       }
/*      */     };
/*  201 */   public static final b l = new b("cloth", 1.0F, 1.0F);
/*  202 */   public static final b m = new b("sand", 1.0F, 1.0F);
/*  203 */   public static final b n = new b("snow", 1.0F, 1.0F);
/*  204 */   public static final b o = new b("ladder", 1.0F, 1.0F)
/*      */     {
/*      */       public String a() {
/*  207 */         return "dig.wood";
/*      */       }
/*      */     };
/*  210 */   public static final b p = new b("anvil", 0.3F, 1.0F)
/*      */     {
/*      */       public String a() {
/*  213 */         return "dig.stone";
/*      */       }
/*      */ 
/*      */       
/*      */       public String b() {
/*  218 */         return "random.anvil_land";
/*      */       }
/*      */     };
/*  221 */   public static final b q = new b("slime", 1.0F, 1.0F)
/*      */     {
/*      */       public String a() {
/*  224 */         return "mob.slime.big";
/*      */       }
/*      */ 
/*      */       
/*      */       public String b() {
/*  229 */         return "mob.slime.big";
/*      */       }
/*      */       
/*      */       public String c() {
/*  233 */         return "mob.slime.small";
/*      */       }
/*      */     };
/*      */ 
/*      */   
/*      */   protected boolean r;
/*      */   
/*      */   protected int s;
/*      */   
/*      */   protected boolean t;
/*      */   protected int u;
/*      */   protected boolean v;
/*      */   protected float w;
/*      */   protected float x;
/*      */   protected boolean y = true;
/*      */   protected boolean z;
/*      */   protected boolean A;
/*      */   protected double B;
/*      */   protected double C;
/*      */   protected double D;
/*      */   protected double E;
/*      */   protected double F;
/*      */   protected double G;
/*  256 */   public b H = e;
/*      */   
/*  258 */   public float I = 1.0F;
/*      */   protected final arm J;
/*      */   protected final arn K;
/*  261 */   public float L = 0.6F;
/*      */   
/*      */   protected final ama M;
/*      */   private alz N;
/*      */   private String O;
/*      */   
/*      */   public afh(arm ☃, arn arn1) {
/*  268 */     this.J = ☃;
/*  269 */     this.K = arn1;
/*      */     
/*  271 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  272 */     this.r = c();
/*  273 */     this.s = c() ? 255 : 0;
/*  274 */     this.t = !☃.b();
/*      */     
/*  276 */     this.M = e();
/*  277 */     j(this.M.b());
/*      */   }
/*      */   
/*      */   protected afh(arm ☃) {
/*  281 */     this(☃, ☃.r());
/*      */   }
/*      */   
/*      */   protected afh a(b ☃) {
/*  285 */     this.H = ☃;
/*  286 */     return this;
/*      */   }
/*      */   
/*      */   protected afh e(int ☃) {
/*  290 */     this.s = ☃;
/*  291 */     return this;
/*      */   }
/*      */   
/*      */   protected afh a(float ☃) {
/*  295 */     this.u = (int)(15.0F * ☃);
/*  296 */     return this;
/*      */   }
/*      */   
/*      */   protected afh b(float ☃) {
/*  300 */     this.x = ☃ * 3.0F;
/*  301 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean u() {
/*  309 */     return (this.J.c() && d());
/*      */   }
/*      */   
/*      */   public boolean v() {
/*  313 */     return (this.J.k() && d() && !i());
/*      */   }
/*      */   
/*      */   public boolean w() {
/*  317 */     return (this.J.c() && d());
/*      */   }
/*      */   
/*      */   public boolean d() {
/*  321 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(adq ☃, cj cj1) {
/*  326 */     return !this.J.c();
/*      */   }
/*      */   
/*      */   public int b() {
/*  330 */     return 3;
/*      */   }
/*      */   
/*      */   public boolean a(adm ☃, cj cj1) {
/*  334 */     return false;
/*      */   }
/*      */   
/*      */   protected afh c(float ☃) {
/*  338 */     this.w = ☃;
/*  339 */     if (this.x < ☃ * 5.0F) {
/*  340 */       this.x = ☃ * 5.0F;
/*      */     }
/*  342 */     return this;
/*      */   }
/*      */   
/*      */   protected afh x() {
/*  346 */     c(-1.0F);
/*  347 */     return this;
/*      */   }
/*      */   
/*      */   public float g(adm ☃, cj cj1) {
/*  351 */     return this.w;
/*      */   }
/*      */   
/*      */   protected afh a(boolean ☃) {
/*  355 */     this.z = ☃;
/*  356 */     return this;
/*      */   }
/*      */   
/*      */   public boolean y() {
/*  360 */     return this.z;
/*      */   }
/*      */   
/*      */   public boolean z() {
/*  364 */     return this.A;
/*      */   }
/*      */   
/*      */   protected final void a(float ☃, float f1, float f2, float f3, float f4, float f5) {
/*  368 */     this.B = ☃;
/*  369 */     this.C = f1;
/*  370 */     this.D = f2;
/*  371 */     this.E = f3;
/*  372 */     this.F = f4;
/*  373 */     this.G = f5;
/*      */   }
/*      */   
/*      */   public int c(adq ☃, cj cj1) {
/*  377 */     afh afh1 = ☃.p(cj1).c();
/*  378 */     int i = ☃.b(cj1, afh1.r());
/*      */ 
/*      */     
/*  381 */     if (i == 0 && afh1 instanceof ahh) {
/*  382 */       cj1 = cj1.b();
/*  383 */       afh1 = ☃.p(cj1).c();
/*  384 */       return ☃.b(cj1, afh1.r());
/*      */     } 
/*  386 */     return i;
/*      */   }
/*      */   
/*      */   public boolean a(adq ☃, cj cj1, cq cq1) {
/*  390 */     if (cq1 == cq.a && this.C > 0.0D) {
/*  391 */       return true;
/*      */     }
/*  393 */     if (cq1 == cq.b && this.F < 1.0D) {
/*  394 */       return true;
/*      */     }
/*  396 */     if (cq1 == cq.c && this.D > 0.0D) {
/*  397 */       return true;
/*      */     }
/*  399 */     if (cq1 == cq.d && this.G < 1.0D) {
/*  400 */       return true;
/*      */     }
/*  402 */     if (cq1 == cq.e && this.B > 0.0D) {
/*  403 */       return true;
/*      */     }
/*  405 */     if (cq1 == cq.f && this.E < 1.0D) {
/*  406 */       return true;
/*      */     }
/*  408 */     return !☃.p(cj1).c().c();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(adq ☃, cj cj1, cq cq1) {
/*  413 */     return ☃.p(cj1).c().t().a();
/*      */   }
/*      */   
/*      */   public aug b(adm ☃, cj cj1) {
/*  417 */     return new aug(cj1.n() + this.B, cj1.o() + this.C, cj1.p() + this.D, cj1.n() + this.E, cj1.o() + this.F, cj1.p() + this.G);
/*      */   }
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  421 */     aug aug2 = a(☃, cj1, alz1);
/*  422 */     if (aug2 != null && aug1.b(aug2)) {
/*  423 */       list.add(aug2);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  429 */     return new aug(cj1.n() + this.B, cj1.o() + this.C, cj1.p() + this.D, cj1.n() + this.E, cj1.o() + this.F, cj1.p() + this.G);
/*      */   }
/*      */   
/*      */   public boolean c() {
/*  433 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(alz ☃, boolean bool) {
/*  437 */     return A();
/*      */   }
/*      */   
/*      */   public boolean A() {
/*  441 */     return true;
/*      */   }
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, Random random) {
/*  445 */     b(☃, cj1, alz1, random);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(adm ☃, cj cj1, alz alz1, Random random) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(adm ☃, cj cj1, alz alz1, Random random) {}
/*      */ 
/*      */   
/*      */   public void d(adm ☃, cj cj1, alz alz1) {}
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {}
/*      */ 
/*      */   
/*      */   public int a(adm ☃) {
/*  464 */     return 10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(adm ☃, cj cj1, alz alz1) {}
/*      */ 
/*      */   
/*      */   public void b(adm ☃, cj cj1, alz alz1) {}
/*      */   
/*      */   public int a(Random ☃) {
/*  474 */     return 1;
/*      */   }
/*      */ 
/*      */   
/*      */   public zw a(alz ☃, Random random, int i) {
/*  479 */     return zw.a(this);
/*      */   }
/*      */   
/*      */   public float a(wn ☃, adm adm1, cj cj1) {
/*  483 */     float f = g(adm1, cj1);
/*  484 */     if (f < 0.0F) {
/*  485 */       return 0.0F;
/*      */     }
/*  487 */     if (!☃.b(this)) {
/*  488 */       return ☃.a(this) / f / 100.0F;
/*      */     }
/*  490 */     return ☃.a(this) / f / 30.0F;
/*      */   }
/*      */   
/*      */   public final void b(adm ☃, cj cj1, alz alz1, int i) {
/*  494 */     a(☃, cj1, alz1, 1.0F, i);
/*      */   }
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/*  498 */     if (☃.D) {
/*      */       return;
/*      */     }
/*  501 */     int j = a(i, ☃.s);
/*  502 */     for (int k = 0; k < j; k++) {
/*  503 */       if (☃.s.nextFloat() <= f) {
/*      */ 
/*      */         
/*  506 */         zw zw = a(alz1, ☃.s, i);
/*  507 */         if (zw != null)
/*      */         {
/*      */ 
/*      */           
/*  511 */           a(☃, cj1, new zx(zw, 1, a(alz1))); } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   public static void a(adm ☃, cj cj1, zx zx1) {
/*  516 */     if (☃.D || !☃.Q().b("doTileDrops")) {
/*      */       return;
/*      */     }
/*      */     
/*  520 */     float f = 0.5F;
/*  521 */     double d1 = (☃.s.nextFloat() * f) + (1.0F - f) * 0.5D;
/*  522 */     double d2 = (☃.s.nextFloat() * f) + (1.0F - f) * 0.5D;
/*  523 */     double d3 = (☃.s.nextFloat() * f) + (1.0F - f) * 0.5D;
/*  524 */     uz uz = new uz(☃, cj1.n() + d1, cj1.o() + d2, cj1.p() + d3, zx1);
/*  525 */     uz.p();
/*  526 */     ☃.d(uz);
/*      */   }
/*      */   
/*      */   protected void b(adm ☃, cj cj1, int i) {
/*  530 */     if (!☃.D) {
/*  531 */       while (i > 0) {
/*  532 */         int j = pp.a(i);
/*  533 */         i -= j;
/*  534 */         ☃.d(new pp(☃, cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, j));
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int a(alz ☃) {
/*  547 */     return 0;
/*      */   }
/*      */   
/*      */   public float a(pk ☃) {
/*  551 */     return this.x / 5.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/*  556 */     a(☃, cj1);
/*      */     
/*  558 */     aui1 = aui1.b(-cj1.n(), -cj1.o(), -cj1.p());
/*  559 */     aui2 = aui2.b(-cj1.n(), -cj1.o(), -cj1.p());
/*      */     
/*  561 */     aui aui3 = aui1.a(aui2, this.B);
/*  562 */     aui aui4 = aui1.a(aui2, this.E);
/*      */     
/*  564 */     aui aui5 = aui1.b(aui2, this.C);
/*  565 */     aui aui6 = aui1.b(aui2, this.F);
/*      */     
/*  567 */     aui aui7 = aui1.c(aui2, this.D);
/*  568 */     aui aui8 = aui1.c(aui2, this.G);
/*      */     
/*  570 */     if (!a(aui3)) {
/*  571 */       aui3 = null;
/*      */     }
/*  573 */     if (!a(aui4)) {
/*  574 */       aui4 = null;
/*      */     }
/*  576 */     if (!b(aui5)) {
/*  577 */       aui5 = null;
/*      */     }
/*  579 */     if (!b(aui6)) {
/*  580 */       aui6 = null;
/*      */     }
/*  582 */     if (!c(aui7)) {
/*  583 */       aui7 = null;
/*      */     }
/*  585 */     if (!c(aui8)) {
/*  586 */       aui8 = null;
/*      */     }
/*      */     
/*  589 */     aui aui9 = null;
/*      */     
/*  591 */     if (aui3 != null && (aui9 == null || aui1.g(aui3) < aui1.g(aui9))) {
/*  592 */       aui9 = aui3;
/*      */     }
/*  594 */     if (aui4 != null && (aui9 == null || aui1.g(aui4) < aui1.g(aui9))) {
/*  595 */       aui9 = aui4;
/*      */     }
/*  597 */     if (aui5 != null && (aui9 == null || aui1.g(aui5) < aui1.g(aui9))) {
/*  598 */       aui9 = aui5;
/*      */     }
/*  600 */     if (aui6 != null && (aui9 == null || aui1.g(aui6) < aui1.g(aui9))) {
/*  601 */       aui9 = aui6;
/*      */     }
/*  603 */     if (aui7 != null && (aui9 == null || aui1.g(aui7) < aui1.g(aui9))) {
/*  604 */       aui9 = aui7;
/*      */     }
/*  606 */     if (aui8 != null && (aui9 == null || aui1.g(aui8) < aui1.g(aui9))) {
/*  607 */       aui9 = aui8;
/*      */     }
/*      */     
/*  610 */     if (aui9 == null) {
/*  611 */       return null;
/*      */     }
/*      */     
/*  614 */     cq cq = null;
/*      */     
/*  616 */     if (aui9 == aui3) {
/*  617 */       cq = cq.e;
/*      */     }
/*  619 */     if (aui9 == aui4) {
/*  620 */       cq = cq.f;
/*      */     }
/*  622 */     if (aui9 == aui5) {
/*  623 */       cq = cq.a;
/*      */     }
/*  625 */     if (aui9 == aui6) {
/*  626 */       cq = cq.b;
/*      */     }
/*  628 */     if (aui9 == aui7) {
/*  629 */       cq = cq.c;
/*      */     }
/*  631 */     if (aui9 == aui8) {
/*  632 */       cq = cq.d;
/*      */     }
/*      */     
/*  635 */     return new auh(aui9.b(cj1.n(), cj1.o(), cj1.p()), cq, cj1);
/*      */   }
/*      */   
/*      */   private boolean a(aui ☃) {
/*  639 */     if (☃ == null) {
/*  640 */       return false;
/*      */     }
/*  642 */     return (☃.b >= this.C && ☃.b <= this.F && ☃.c >= this.D && ☃.c <= this.G);
/*      */   }
/*      */   
/*      */   private boolean b(aui ☃) {
/*  646 */     if (☃ == null) {
/*  647 */       return false;
/*      */     }
/*  649 */     return (☃.a >= this.B && ☃.a <= this.E && ☃.c >= this.D && ☃.c <= this.G);
/*      */   }
/*      */   
/*      */   private boolean c(aui ☃) {
/*  653 */     if (☃ == null) {
/*  654 */       return false;
/*      */     }
/*  656 */     return (☃.a >= this.B && ☃.a <= this.E && ☃.b >= this.C && ☃.b <= this.F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, adi adi1) {}
/*      */   
/*      */   public adf m() {
/*  663 */     return adf.a;
/*      */   }
/*      */   
/*      */   public boolean a(adm ☃, cj cj1, cq cq1, zx zx1) {
/*  667 */     return b(☃, cj1, cq1);
/*      */   }
/*      */   
/*      */   public boolean b(adm ☃, cj cj1, cq cq1) {
/*  671 */     return d(☃, cj1);
/*      */   }
/*      */   
/*      */   public boolean d(adm ☃, cj cj1) {
/*  675 */     return (☃.p(cj1).c()).J.j();
/*      */   }
/*      */   
/*      */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  679 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, pk pk1) {}
/*      */   
/*      */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  686 */     return a(i);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, wn wn1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public aui a(adm ☃, cj cj1, pk pk1, aui aui1) {
/*  696 */     return aui1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adq ☃, cj cj1) {}
/*      */   
/*      */   public final double B() {
/*  703 */     return this.B;
/*      */   }
/*      */   
/*      */   public final double C() {
/*  707 */     return this.E;
/*      */   }
/*      */   
/*      */   public final double D() {
/*  711 */     return this.C;
/*      */   }
/*      */   
/*      */   public final double E() {
/*  715 */     return this.F;
/*      */   }
/*      */   
/*      */   public final double F() {
/*  719 */     return this.D;
/*      */   }
/*      */   
/*      */   public final double G() {
/*  723 */     return this.G;
/*      */   }
/*      */   
/*      */   public int H() {
/*  727 */     return 16777215;
/*      */   }
/*      */   
/*      */   public int h(alz ☃) {
/*  731 */     return 16777215;
/*      */   }
/*      */   
/*      */   public int a(adq ☃, cj cj1, int i) {
/*  735 */     return 16777215;
/*      */   }
/*      */   
/*      */   public final int d(adq ☃, cj cj1) {
/*  739 */     return a(☃, cj1, 0);
/*      */   }
/*      */   
/*      */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  743 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean i() {
/*  747 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {}
/*      */   
/*      */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  754 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {}
/*      */   
/*      */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/*  761 */     wn1.b(na.ab[a(this)]);
/*  762 */     wn1.a(0.025F);
/*      */     
/*  764 */     if (I() && ack.e(wn1)) {
/*  765 */       zx zx = i(alz1);
/*  766 */       if (zx != null) {
/*  767 */         a(☃, cj1, zx);
/*      */       }
/*      */     } else {
/*  770 */       int i = ack.f(wn1);
/*  771 */       b(☃, cj1, alz1, i);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean I() {
/*  776 */     return (d() && !this.A);
/*      */   }
/*      */   
/*      */   protected zx i(alz ☃) {
/*  780 */     int i = 0;
/*  781 */     zw zw = zw.a(this);
/*  782 */     if (zw != null && zw.k()) {
/*  783 */       i = c(☃);
/*      */     }
/*  785 */     return new zx(zw, 1, i);
/*      */   }
/*      */   
/*      */   public int a(int ☃, Random random) {
/*  789 */     return a(random);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {}
/*      */   
/*      */   public boolean g() {
/*  796 */     return (!this.J.a() && !this.J.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public afh c(String ☃) {
/*  801 */     this.O = ☃;
/*  802 */     return this;
/*      */   }
/*      */   
/*      */   public String f() {
/*  806 */     return di.a(a() + ".name");
/*      */   }
/*      */ 
/*      */   
/*      */   public String a() {
/*  811 */     return "tile." + this.O;
/*      */   }
/*      */   
/*      */   public boolean a(adm ☃, cj cj1, alz alz1, int i, int j) {
/*  815 */     return false;
/*      */   }
/*      */   
/*      */   public boolean J() {
/*  819 */     return this.y;
/*      */   }
/*      */   
/*      */   protected afh K() {
/*  823 */     this.y = false;
/*  824 */     return this;
/*      */   }
/*      */   
/*      */   public int k() {
/*  828 */     return this.J.m();
/*      */   }
/*      */   
/*      */   public float h() {
/*  832 */     return u() ? 0.2F : 1.0F;
/*      */   }
/*      */   
/*      */   public void a(adm ☃, cj cj1, pk pk1, float f) {
/*  836 */     pk1.e(f, 1.0F);
/*      */   }
/*      */   
/*      */   public void a(adm ☃, pk pk1) {
/*  840 */     pk1.w = 0.0D;
/*      */   }
/*      */   
/*      */   public zw c(adm ☃, cj cj1) {
/*  844 */     return zw.a(this);
/*      */   }
/*      */   
/*      */   public int j(adm ☃, cj cj1) {
/*  848 */     return a(☃.p(cj1));
/*      */   }
/*      */   
/*      */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  852 */     list.add(new zx(☃, 1, 0));
/*      */   }
/*      */   
/*      */   public yz L() {
/*  856 */     return this.b;
/*      */   }
/*      */   
/*      */   public afh a(yz ☃) {
/*  860 */     this.b = ☃;
/*  861 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {}
/*      */ 
/*      */   
/*      */   public void k(adm ☃, cj cj1) {}
/*      */   
/*      */   public boolean M() {
/*  871 */     return false;
/*      */   }
/*      */   
/*      */   public boolean N() {
/*  875 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(adi ☃) {
/*  879 */     return true;
/*      */   }
/*      */   
/*      */   public boolean b(afh ☃) {
/*  883 */     return (this == ☃);
/*      */   }
/*      */   
/*      */   public static boolean a(afh ☃, afh afh1) {
/*  887 */     if (☃ == null || afh1 == null) {
/*  888 */       return false;
/*      */     }
/*  890 */     if (☃ == afh1) {
/*  891 */       return true;
/*      */     }
/*  893 */     return ☃.b(afh1);
/*      */   }
/*      */   
/*      */   public boolean O() {
/*  897 */     return false;
/*      */   }
/*      */   
/*      */   public int l(adm ☃, cj cj1) {
/*  901 */     return 0;
/*      */   }
/*      */   
/*      */   public alz b(alz ☃) {
/*  905 */     return ☃;
/*      */   }
/*      */   
/*      */   protected ama e() {
/*  909 */     return new ama(this, new amo[0]);
/*      */   }
/*      */   
/*      */   public ama P() {
/*  913 */     return this.M;
/*      */   }
/*      */   
/*      */   protected final void j(alz ☃) {
/*  917 */     this.N = ☃;
/*      */   }
/*      */   
/*      */   public final alz Q() {
/*  921 */     return this.N;
/*      */   }
/*      */   
/*      */   public a R() {
/*  925 */     return a.a;
/*      */   }
/*      */   
/*      */   public enum a {
/*  929 */     a,
/*  930 */     b,
/*  931 */     c;
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/*  936 */     return "Block{" + c.c(this) + "}";
/*      */   }
/*      */ 
/*      */   
/*      */   public static void S() {
/*  941 */     a(0, a, (new aey()).c("air"));
/*  942 */     a(1, "stone", (new ajy()).c(1.5F).b(10.0F).a(i).c("stone"));
/*  943 */     a(2, "grass", (new ahe()).c(0.6F).a(h).c("grass"));
/*  944 */     a(3, "dirt", (new agf()).c(0.5F).a(g).c("dirt"));
/*  945 */     afh ☃ = (new afh(arm.e)).c(2.0F).b(10.0F).a(i).c("stonebrick").a(yz.b);
/*  946 */     a(4, "cobblestone", ☃);
/*  947 */     afh afh1 = (new aio()).c(2.0F).b(5.0F).a(f).c("wood");
/*  948 */     a(5, "planks", afh1);
/*  949 */     a(6, "sapling", (new ajj()).c(0.0F).a(h).c("sapling"));
/*  950 */     a(7, "bedrock", (new afh(arm.e)).x().b(6000000.0F).a(i).c("bedrock").K().a(yz.b));
/*  951 */     a(8, "flowing_water", (new agl(arm.h)).c(100.0F).e(3).c("water").K());
/*  952 */     a(9, "water", (new ajw(arm.h)).c(100.0F).e(3).c("water").K());
/*  953 */     a(10, "flowing_lava", (new agl(arm.i)).c(100.0F).a(1.0F).c("lava").K());
/*  954 */     a(11, "lava", (new ajw(arm.i)).c(100.0F).a(1.0F).c("lava").K());
/*  955 */     a(12, "sand", (new ajh()).c(0.5F).a(m).c("sand"));
/*  956 */     a(13, "gravel", (new ahf()).c(0.6F).a(g).c("gravel"));
/*  957 */     a(14, "gold_ore", (new aim()).c(3.0F).b(5.0F).a(i).c("oreGold"));
/*  958 */     a(15, "iron_ore", (new aim()).c(3.0F).b(5.0F).a(i).c("oreIron"));
/*  959 */     a(16, "coal_ore", (new aim()).c(3.0F).b(5.0F).a(i).c("oreCoal"));
/*  960 */     a(17, "log", (new ail()).c("log"));
/*  961 */     a(18, "leaves", (new aik()).c("leaves"));
/*  962 */     a(19, "sponge", (new ajr()).c(0.6F).a(h).c("sponge"));
/*  963 */     a(20, "glass", (new ahc(arm.s, false)).c(0.3F).a(k).c("glass"));
/*  964 */     a(21, "lapis_ore", (new aim()).c(3.0F).b(5.0F).a(i).c("oreLapis"));
/*  965 */     a(22, "lapis_block", (new afh(arm.f, arn.H)).c(3.0F).b(5.0F).a(i).c("blockLapis").a(yz.b));
/*  966 */     a(23, "dispenser", (new agg()).c(3.5F).a(i).c("dispenser"));
/*  967 */     afh afh2 = (new aji()).a(i).c(0.8F).c("sandStone");
/*  968 */     a(24, "sandstone", afh2);
/*  969 */     a(25, "noteblock", (new aii()).c(0.8F).c("musicBlock"));
/*  970 */     a(26, "bed", (new afg()).a(f).c(0.2F).c("bed").K());
/*  971 */     a(27, "golden_rail", (new ais()).c(0.7F).a(j).c("goldenRail"));
/*  972 */     a(28, "detector_rail", (new agc()).c(0.7F).a(j).c("detectorRail"));
/*  973 */     a(29, "sticky_piston", (new als(true)).c("pistonStickyBase"));
/*  974 */     a(30, "web", (new ako()).e(1).c(4.0F).c("web"));
/*  975 */     a(31, "tallgrass", (new akc()).c(0.0F).a(h).c("tallgrass"));
/*  976 */     a(32, "deadbush", (new agb()).c(0.0F).a(h).c("deadbush"));
/*  977 */     a(33, "piston", (new als(false)).c("pistonBase"));
/*  978 */     a(34, "piston_head", (new alt()).c("pistonBase"));
/*  979 */     a(35, "wool", (new afv(arm.n)).c(0.8F).a(l).c("cloth"));
/*  980 */     a(36, "piston_extension", new alv());
/*  981 */     a(37, "yellow_flower", (new akt()).c(0.0F).a(h).c("flower1"));
/*  982 */     a(38, "red_flower", (new aiy()).c(0.0F).a(h).c("flower2"));
/*  983 */     afh afh3 = (new aia()).c(0.0F).a(h).a(0.125F).c("mushroom");
/*  984 */     a(39, "brown_mushroom", afh3);
/*  985 */     afh afh4 = (new aia()).c(0.0F).a(h).c("mushroom");
/*  986 */     a(40, "red_mushroom", afh4);
/*  987 */     a(41, "gold_block", (new afh(arm.f, arn.F)).c(3.0F).b(10.0F).a(j).c("blockGold").a(yz.b));
/*  988 */     a(42, "iron_block", (new afh(arm.f, arn.h)).c(5.0F).b(10.0F).a(j).c("blockIron").a(yz.b));
/*  989 */     a(43, "double_stone_slab", (new agz()).c(2.0F).b(10.0F).a(i).c("stoneSlab"));
/*  990 */     a(44, "stone_slab", (new ahi()).c(2.0F).b(10.0F).a(i).c("stoneSlab"));
/*  991 */     afh afh5 = (new afh(arm.e, arn.D)).c(2.0F).b(10.0F).a(i).c("brick").a(yz.b);
/*  992 */     a(45, "brick_block", afh5);
/*  993 */     a(46, "tnt", (new ake()).c(0.0F).a(h).c("tnt"));
/*  994 */     a(47, "bookshelf", (new afk()).c(1.5F).a(f).c("bookshelf"));
/*  995 */     a(48, "mossy_cobblestone", (new afh(arm.e)).c(2.0F).b(10.0F).a(i).c("stoneMoss").a(yz.b));
/*  996 */     a(49, "obsidian", (new aij()).c(50.0F).b(2000.0F).a(i).c("obsidian"));
/*  997 */     a(50, "torch", (new akf()).c(0.0F).a(0.9375F).a(f).c("torch"));
/*  998 */     a(51, "fire", (new agv()).c(0.0F).a(1.0F).a(l).c("fire").K());
/*  999 */     a(52, "mob_spawner", (new ahy()).c(5.0F).a(j).c("mobSpawner").K());
/* 1000 */     a(53, "oak_stairs", (new aju(afh1.Q().a(aio.a, aio.a.a))).c("stairsWood"));
/* 1001 */     a(54, "chest", (new afs(0)).c(2.5F).a(f).c("chest"));
/* 1002 */     a(55, "redstone_wire", (new ajb()).c(0.0F).a(e).c("redstoneDust").K());
/* 1003 */     a(56, "diamond_ore", (new aim()).c(3.0F).b(5.0F).a(i).c("oreDiamond"));
/* 1004 */     a(57, "diamond_block", (new afh(arm.f, arn.G)).c(5.0F).b(10.0F).a(j).c("blockDiamond").a(yz.b));
/* 1005 */     a(58, "crafting_table", (new afy()).c(2.5F).a(f).c("workbench"));
/* 1006 */     a(59, "wheat", (new afz()).c("crops"));
/* 1007 */     afh afh6 = (new ags()).c(0.6F).a(g).c("farmland");
/* 1008 */     a(60, "farmland", afh6);
/* 1009 */     a(61, "furnace", (new ahb(false)).c(3.5F).a(i).c("furnace").a(yz.c));
/* 1010 */     a(62, "lit_furnace", (new ahb(true)).c(3.5F).a(i).a(0.875F).c("furnace"));
/* 1011 */     a(63, "standing_sign", (new ajv()).c(1.0F).a(f).c("sign").K());
/* 1012 */     a(64, "wooden_door", (new agh(arm.d)).c(3.0F).a(f).c("doorOak").K());
/* 1013 */     a(65, "ladder", (new ahr()).c(0.4F).a(o).c("ladder"));
/* 1014 */     a(66, "rail", (new aix()).c(0.7F).a(j).c("rail"));
/* 1015 */     a(67, "stone_stairs", (new aju(☃.Q())).c("stairsStone"));
/* 1016 */     a(68, "wall_sign", (new akm()).c(1.0F).a(f).c("sign").K());
/* 1017 */     a(69, "lever", (new ahu()).c(0.5F).a(f).c("lever"));
/* 1018 */     a(70, "stone_pressure_plate", (new ait(arm.e, ait.a.b)).c(0.5F).a(i).c("pressurePlateStone"));
/* 1019 */     a(71, "iron_door", (new agh(arm.f)).c(5.0F).a(j).c("doorIron").K());
/* 1020 */     a(72, "wooden_pressure_plate", (new ait(arm.d, ait.a.a)).c(0.5F).a(f).c("pressurePlateWood"));
/* 1021 */     a(73, "redstone_ore", (new aja(false)).c(3.0F).b(5.0F).a(i).c("oreRedstone").a(yz.b));
/* 1022 */     a(74, "lit_redstone_ore", (new aja(true)).a(0.625F).c(3.0F).b(5.0F).a(i).c("oreRedstone"));
/* 1023 */     a(75, "unlit_redstone_torch", (new ajd(false)).c(0.0F).a(f).c("notGate"));
/* 1024 */     a(76, "redstone_torch", (new ajd(true)).c(0.0F).a(0.5F).a(f).c("notGate").a(yz.d));
/* 1025 */     a(77, "stone_button", (new aka()).c(0.5F).a(i).c("button"));
/* 1026 */     a(78, "snow_layer", (new ajp()).c(0.1F).a(n).c("snow").e(0));
/* 1027 */     a(79, "ice", (new ahp()).c(0.5F).e(3).a(k).c("ice"));
/* 1028 */     a(80, "snow", (new ajo()).c(0.2F).a(n).c("snow"));
/* 1029 */     a(81, "cactus", (new afo()).c(0.4F).a(l).c("cactus"));
/* 1030 */     a(82, "clay", (new aft()).c(0.6F).a(g).c("clay"));
/* 1031 */     a(83, "reeds", (new aje()).c(0.0F).a(h).c("reeds").K());
/* 1032 */     a(84, "jukebox", (new ahq()).c(2.0F).b(10.0F).a(i).c("jukebox"));
/* 1033 */     a(85, "fence", (new agt(arm.d, aio.a.a.c())).c(2.0F).b(5.0F).a(f).c("fence"));
/* 1034 */     afh afh7 = (new aiv()).c(1.0F).a(f).c("pumpkin");
/* 1035 */     a(86, "pumpkin", afh7);
/* 1036 */     a(87, "netherrack", (new aie()).c(0.4F).a(i).c("hellrock"));
/* 1037 */     a(88, "soul_sand", (new ajq()).c(0.5F).a(m).c("hellsand"));
/* 1038 */     a(89, "glowstone", (new ahd(arm.s)).c(0.3F).a(k).a(1.0F).c("lightgem"));
/* 1039 */     a(90, "portal", (new aip()).c(-1.0F).a(k).a(0.75F).c("portal"));
/* 1040 */     a(91, "lit_pumpkin", (new aiv()).c(1.0F).a(f).a(1.0F).c("litpumpkin"));
/* 1041 */     a(92, "cake", (new afp()).c(0.5F).a(l).c("cake").K());
/* 1042 */     a(93, "unpowered_repeater", (new ajf(false)).c(0.0F).a(f).c("diode").K());
/* 1043 */     a(94, "powered_repeater", (new ajf(true)).c(0.0F).a(f).c("diode").K());
/* 1044 */     a(95, "stained_glass", (new ajs(arm.s)).c(0.3F).a(k).c("stainedGlass"));
/* 1045 */     a(96, "trapdoor", (new akh(arm.d)).c(3.0F).a(f).c("trapdoor").K());
/* 1046 */     a(97, "monster_egg", (new ahz()).c(0.75F).c("monsterStoneEgg"));
/* 1047 */     afh afh8 = (new ajz()).c(1.5F).b(10.0F).a(i).c("stonebricksmooth");
/* 1048 */     a(98, "stonebrick", afh8);
/* 1049 */     a(99, "brown_mushroom_block", (new aho(arm.d, arn.l, afh3)).c(0.2F).a(f).c("mushroom"));
/* 1050 */     a(100, "red_mushroom_block", (new aho(arm.d, arn.D, afh4)).c(0.2F).a(f).c("mushroom"));
/* 1051 */     a(101, "iron_bars", (new akd(arm.f, true)).c(5.0F).b(10.0F).a(j).c("fenceIron"));
/* 1052 */     a(102, "glass_pane", (new akd(arm.s, false)).c(0.3F).a(k).c("thinGlass"));
/* 1053 */     afh afh9 = (new ahx()).c(1.0F).a(f).c("melon");
/* 1054 */     a(103, "melon_block", afh9);
/* 1055 */     a(104, "pumpkin_stem", (new ajx(afh7)).c(0.0F).a(f).c("pumpkinStem"));
/* 1056 */     a(105, "melon_stem", (new ajx(afh9)).c(0.0F).a(f).c("pumpkinStem"));
/* 1057 */     a(106, "vine", (new akk()).c(0.2F).a(h).c("vine"));
/* 1058 */     a(107, "fence_gate", (new agu(aio.a.a)).c(2.0F).b(5.0F).a(f).c("fenceGate"));
/* 1059 */     a(108, "brick_stairs", (new aju(afh5.Q())).c("stairsBrick"));
/* 1060 */     a(109, "stone_brick_stairs", (new aju(afh8.Q().a(ajz.a, ajz.a.a))).c("stairsStoneBrickSmooth"));
/* 1061 */     a(110, "mycelium", (new aib()).c(0.6F).a(h).c("mycel"));
/* 1062 */     a(111, "waterlily", (new akn()).c(0.0F).a(h).c("waterlily"));
/* 1063 */     afh afh10 = (new aic()).c(2.0F).b(10.0F).a(i).c("netherBrick").a(yz.b);
/* 1064 */     a(112, "nether_brick", afh10);
/* 1065 */     a(113, "nether_brick_fence", (new agt(arm.e, arn.K)).c(2.0F).b(10.0F).a(i).c("netherFence"));
/* 1066 */     a(114, "nether_brick_stairs", (new aju(afh10.Q())).c("stairsNetherBrick"));
/* 1067 */     a(115, "nether_wart", (new aid()).c("netherStalk"));
/* 1068 */     a(116, "enchanting_table", (new agm()).c(5.0F).b(2000.0F).c("enchantmentTable"));
/* 1069 */     a(117, "brewing_stand", (new afl()).c(0.5F).a(0.125F).c("brewingStand"));
/* 1070 */     a(118, "cauldron", (new afr()).c(2.0F).c("cauldron"));
/* 1071 */     a(119, "end_portal", (new agn(arm.E)).c(-1.0F).b(6000000.0F));
/* 1072 */     a(120, "end_portal_frame", (new ago()).a(k).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(yz.c));
/* 1073 */     a(121, "end_stone", (new afh(arm.e, arn.d)).c(3.0F).b(15.0F).a(i).c("whiteStone").a(yz.b));
/* 1074 */     a(122, "dragon_egg", (new agj()).c(3.0F).b(15.0F).a(i).a(0.125F).c("dragonEgg"));
/* 1075 */     a(123, "redstone_lamp", (new ajc(false)).c(0.3F).a(k).c("redstoneLight").a(yz.d));
/* 1076 */     a(124, "lit_redstone_lamp", (new ajc(true)).c(0.3F).a(k).c("redstoneLight"));
/* 1077 */     a(125, "double_wooden_slab", (new aha()).c(2.0F).b(5.0F).a(f).c("woodSlab"));
/* 1078 */     a(126, "wooden_slab", (new ahk()).c(2.0F).b(5.0F).a(f).c("woodSlab"));
/* 1079 */     a(127, "cocoa", (new afu()).c(0.2F).b(5.0F).a(f).c("cocoa"));
/* 1080 */     a(128, "sandstone_stairs", (new aju(afh2.Q().a(aji.a, aji.a.c))).c("stairsSandStone"));
/* 1081 */     a(129, "emerald_ore", (new aim()).c(3.0F).b(5.0F).a(i).c("oreEmerald"));
/* 1082 */     a(130, "ender_chest", (new agp()).c(22.5F).b(1000.0F).a(i).c("enderChest").a(0.5F));
/* 1083 */     a(131, "tripwire_hook", (new akj()).c("tripWireSource"));
/* 1084 */     a(132, "tripwire", (new aki()).c("tripWire"));
/* 1085 */     a(133, "emerald_block", (new afh(arm.f, arn.I)).c(5.0F).b(10.0F).a(j).c("blockEmerald").a(yz.b));
/* 1086 */     a(134, "spruce_stairs", (new aju(afh1.Q().a(aio.a, aio.a.b))).c("stairsWoodSpruce"));
/* 1087 */     a(135, "birch_stairs", (new aju(afh1.Q().a(aio.a, aio.a.c))).c("stairsWoodBirch"));
/* 1088 */     a(136, "jungle_stairs", (new aju(afh1.Q().a(aio.a, aio.a.d))).c("stairsWoodJungle"));
/* 1089 */     a(137, "command_block", (new afw()).x().b(6000000.0F).c("commandBlock"));
/* 1090 */     a(138, "beacon", (new aff()).c("beacon").a(1.0F));
/* 1091 */     a(139, "cobblestone_wall", (new akl(☃)).c("cobbleWall"));
/* 1092 */     a(140, "flower_pot", (new agx()).c(0.0F).a(e).c("flowerPot"));
/* 1093 */     a(141, "carrots", (new afq()).c("carrots"));
/* 1094 */     a(142, "potatoes", (new aiq()).c("potatoes"));
/* 1095 */     a(143, "wooden_button", (new akq()).c(0.5F).a(f).c("button"));
/* 1096 */     a(144, "skull", (new ajm()).c(1.0F).a(i).c("skull"));
/* 1097 */     a(145, "anvil", (new aez()).c(5.0F).a(p).b(2000.0F).c("anvil"));
/* 1098 */     a(146, "trapped_chest", (new afs(1)).c(2.5F).a(f).c("chestTrap"));
/* 1099 */     a(147, "light_weighted_pressure_plate", (new akp(arm.f, 15, arn.F)).c(0.5F).a(f).c("weightedPlate_light"));
/* 1100 */     a(148, "heavy_weighted_pressure_plate", (new akp(arm.f, 150)).c(0.5F).a(f).c("weightedPlate_heavy"));
/* 1101 */     a(149, "unpowered_comparator", (new afx(false)).c(0.0F).a(f).c("comparator").K());
/* 1102 */     a(150, "powered_comparator", (new afx(true)).c(0.0F).a(0.625F).a(f).c("comparator").K());
/* 1103 */     a(151, "daylight_detector", new aga(false));
/* 1104 */     a(152, "redstone_block", (new air(arm.f, arn.f)).c(5.0F).b(10.0F).a(j).c("blockRedstone").a(yz.d));
/* 1105 */     a(153, "quartz_ore", (new aim(arn.K)).c(3.0F).b(5.0F).a(i).c("netherquartz"));
/* 1106 */     a(154, "hopper", (new ahn()).c(3.0F).b(8.0F).a(j).c("hopper"));
/* 1107 */     afh afh11 = (new aiw()).a(i).c(0.8F).c("quartzBlock");
/* 1108 */     a(155, "quartz_block", afh11);
/* 1109 */     a(156, "quartz_stairs", (new aju(afh11.Q().a(aiw.a, aiw.a.a))).c("stairsQuartz"));
/* 1110 */     a(157, "activator_rail", (new ais()).c(0.7F).a(j).c("activatorRail"));
/* 1111 */     a(158, "dropper", (new agk()).c(3.5F).a(i).c("dropper"));
/* 1112 */     a(159, "stained_hardened_clay", (new afv(arm.e)).c(1.25F).b(7.0F).a(i).c("clayHardenedStained"));
/* 1113 */     a(160, "stained_glass_pane", (new ajt()).c(0.3F).a(k).c("thinStainedGlass"));
/* 1114 */     a(161, "leaves2", (new aif()).c("leaves"));
/* 1115 */     a(162, "log2", (new aig()).c("log"));
/* 1116 */     a(163, "acacia_stairs", (new aju(afh1.Q().a(aio.a, aio.a.e))).c("stairsWoodAcacia"));
/* 1117 */     a(164, "dark_oak_stairs", (new aju(afh1.Q().a(aio.a, aio.a.f))).c("stairsWoodDarkOak"));
/* 1118 */     a(165, "slime", (new ajn()).c("slime").a(q));
/* 1119 */     a(166, "barrier", (new afb()).c("barrier"));
/* 1120 */     a(167, "iron_trapdoor", (new akh(arm.f)).c(5.0F).a(j).c("ironTrapdoor").K());
/* 1121 */     a(168, "prismarine", (new aiu()).c(1.5F).b(10.0F).a(i).c("prismarine"));
/* 1122 */     a(169, "sea_lantern", (new ajk(arm.s)).c(0.3F).a(k).a(1.0F).c("seaLantern"));
/* 1123 */     a(170, "hay_block", (new ahm()).c(0.5F).a(h).c("hayBlock").a(yz.b));
/* 1124 */     a(171, "carpet", (new aks()).c(0.1F).a(l).c("woolCarpet").e(0));
/* 1125 */     a(172, "hardened_clay", (new ahl()).c(1.25F).b(7.0F).a(i).c("clayHardened"));
/* 1126 */     a(173, "coal_block", (new afh(arm.e, arn.E)).c(5.0F).b(10.0F).a(i).c("blockCoal").a(yz.b));
/* 1127 */     a(174, "packed_ice", (new ain()).c(0.5F).a(k).c("icePacked"));
/* 1128 */     a(175, "double_plant", new agi());
/* 1129 */     a(176, "standing_banner", (new afa.a()).c(1.0F).a(f).c("banner").K());
/* 1130 */     a(177, "wall_banner", (new afa.b()).c(1.0F).a(f).c("banner").K());
/* 1131 */     a(178, "daylight_detector_inverted", new aga(true));
/* 1132 */     afh afh12 = (new aiz()).a(i).c(0.8F).c("redSandStone");
/* 1133 */     a(179, "red_sandstone", afh12);
/* 1134 */     a(180, "red_sandstone_stairs", (new aju(afh12.Q().a(aiz.a, aiz.a.c))).c("stairsRedSandStone"));
/* 1135 */     a(181, "double_stone_slab2", (new agy()).c(2.0F).b(10.0F).a(i).c("stoneSlab2"));
/* 1136 */     a(182, "stone_slab2", (new ahg()).c(2.0F).b(10.0F).a(i).c("stoneSlab2"));
/* 1137 */     a(183, "spruce_fence_gate", (new agu(aio.a.b)).c(2.0F).b(5.0F).a(f).c("spruceFenceGate"));
/* 1138 */     a(184, "birch_fence_gate", (new agu(aio.a.c)).c(2.0F).b(5.0F).a(f).c("birchFenceGate"));
/* 1139 */     a(185, "jungle_fence_gate", (new agu(aio.a.d)).c(2.0F).b(5.0F).a(f).c("jungleFenceGate"));
/* 1140 */     a(186, "dark_oak_fence_gate", (new agu(aio.a.f)).c(2.0F).b(5.0F).a(f).c("darkOakFenceGate"));
/* 1141 */     a(187, "acacia_fence_gate", (new agu(aio.a.e)).c(2.0F).b(5.0F).a(f).c("acaciaFenceGate"));
/* 1142 */     a(188, "spruce_fence", (new agt(arm.d, aio.a.b.c())).c(2.0F).b(5.0F).a(f).c("spruceFence"));
/* 1143 */     a(189, "birch_fence", (new agt(arm.d, aio.a.c.c())).c(2.0F).b(5.0F).a(f).c("birchFence"));
/* 1144 */     a(190, "jungle_fence", (new agt(arm.d, aio.a.d.c())).c(2.0F).b(5.0F).a(f).c("jungleFence"));
/* 1145 */     a(191, "dark_oak_fence", (new agt(arm.d, aio.a.f.c())).c(2.0F).b(5.0F).a(f).c("darkOakFence"));
/* 1146 */     a(192, "acacia_fence", (new agt(arm.d, aio.a.e.c())).c(2.0F).b(5.0F).a(f).c("acaciaFence"));
/* 1147 */     a(193, "spruce_door", (new agh(arm.d)).c(3.0F).a(f).c("doorSpruce").K());
/* 1148 */     a(194, "birch_door", (new agh(arm.d)).c(3.0F).a(f).c("doorBirch").K());
/* 1149 */     a(195, "jungle_door", (new agh(arm.d)).c(3.0F).a(f).c("doorJungle").K());
/* 1150 */     a(196, "acacia_door", (new agh(arm.d)).c(3.0F).a(f).c("doorAcacia").K());
/* 1151 */     a(197, "dark_oak_door", (new agh(arm.d)).c(3.0F).a(f).c("doorDarkOak").K());
/*      */     
/* 1153 */     c.a();
/*      */ 
/*      */     
/* 1156 */     for (Iterator<afh> iterator2 = c.iterator(); iterator2.hasNext(); ) { afh afh13 = iterator2.next();
/* 1157 */       if (afh13.J == arm.a) {
/* 1158 */         afh13.v = false;
/*      */         
/*      */         continue;
/*      */       } 
/*      */       
/* 1163 */       boolean bool1 = false;
/* 1164 */       boolean bool2 = afh13 instanceof aju;
/* 1165 */       boolean bool3 = afh13 instanceof ahh;
/* 1166 */       boolean bool4 = (afh13 == afh6);
/* 1167 */       boolean bool5 = afh13.t;
/* 1168 */       boolean bool6 = (afh13.s == 0);
/* 1169 */       if (bool2 || bool3 || bool4 || bool5 || bool6) {
/* 1170 */         bool1 = true;
/*      */       }
/*      */       
/* 1173 */       afh13.v = bool1; }
/*      */ 
/*      */     
/* 1176 */     for (Iterator<afh> iterator1 = c.iterator(); iterator1.hasNext(); ) { afh afh13 = iterator1.next();
/* 1177 */       for (Iterator<alz> iterator = afh13.P().a().iterator(); iterator.hasNext(); ) { alz alz1 = iterator.next();
/* 1178 */         int i = c.b(afh13) << 4 | afh13.c(alz1);
/* 1179 */         d.a(alz1, i); }
/*      */        }
/*      */   
/*      */   }
/*      */   
/*      */   private static void a(int ☃, jy jy1, afh afh1) {
/* 1185 */     c.a(☃, jy1, afh1);
/*      */   }
/*      */   
/*      */   private static void a(int ☃, String str, afh afh1) {
/* 1189 */     a(☃, new jy(str), afh1);
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */