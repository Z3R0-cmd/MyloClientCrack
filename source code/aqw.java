/*      */ import com.google.common.collect.Lists;
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
/*      */ public class aqw
/*      */ {
/*      */   public static void a() {
/*   35 */     aqr.a((Class)a.class, "ViBH");
/*   36 */     aqr.a((Class)b.class, "ViDF");
/*   37 */     aqr.a((Class)c.class, "ViF");
/*   38 */     aqr.a((Class)d.class, "ViL");
/*   39 */     aqr.a((Class)f.class, "ViPH");
/*   40 */     aqr.a((Class)g.class, "ViSH");
/*   41 */     aqr.a((Class)h.class, "ViSmH");
/*   42 */     aqr.a((Class)i.class, "ViST");
/*   43 */     aqr.a((Class)j.class, "ViS");
/*   44 */     aqr.a((Class)k.class, "ViStart");
/*   45 */     aqr.a((Class)l.class, "ViSR");
/*   46 */     aqr.a((Class)m.class, "ViTRH");
/*   47 */     aqr.a((Class)p.class, "ViW");
/*      */   }
/*      */   
/*      */   public static class e {
/*      */     public Class<? extends aqw.n> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public int d;
/*      */     
/*      */     public e(Class<? extends aqw.n> ☃, int i, int j) {
/*   57 */       this.a = ☃;
/*   58 */       this.b = i;
/*   59 */       this.d = j;
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   63 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   67 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */   
/*      */   public static List<e> a(Random ☃, int i) {
/*   72 */     List<e> list = Lists.newArrayList();
/*      */     
/*   74 */     list.add(new e((Class)g.class, 4, ns.a(☃, 2 + i, 4 + i * 2)));
/*   75 */     list.add(new e((Class)i.class, 20, ns.a(☃, 0 + i, 1 + i)));
/*   76 */     list.add(new e((Class)a.class, 20, ns.a(☃, 0 + i, 2 + i)));
/*   77 */     list.add(new e((Class)h.class, 3, ns.a(☃, 2 + i, 5 + i * 3)));
/*   78 */     list.add(new e((Class)f.class, 15, ns.a(☃, 0 + i, 2 + i)));
/*   79 */     list.add(new e((Class)b.class, 3, ns.a(☃, 1 + i, 4 + i)));
/*   80 */     list.add(new e((Class)c.class, 3, ns.a(☃, 2 + i, 4 + i * 2)));
/*   81 */     list.add(new e((Class)j.class, 15, ns.a(☃, 0, 1 + i)));
/*   82 */     list.add(new e((Class)m.class, 8, ns.a(☃, 0 + i, 3 + i * 2)));
/*      */ 
/*      */     
/*   85 */     Iterator<e> iterator = list.iterator();
/*   86 */     while (iterator.hasNext()) {
/*   87 */       if (((e)iterator.next()).d == 0) {
/*   88 */         iterator.remove();
/*      */       }
/*      */     } 
/*      */     
/*   92 */     return list;
/*      */   }
/*      */   
/*      */   private static int a(List<e> ☃) {
/*   96 */     boolean bool = false;
/*   97 */     int i = 0;
/*   98 */     for (Iterator<e> iterator = ☃.iterator(); iterator.hasNext(); ) { e e = iterator.next();
/*   99 */       if (e.d > 0 && e.c < e.d) {
/*  100 */         bool = true;
/*      */       }
/*  102 */       i += e.b; }
/*      */     
/*  104 */     return bool ? i : -1;
/*      */   }
/*      */   
/*      */   private static n a(k ☃, e e1, List<aqt> list, Random random, int i, int j, int m, cq cq1, int n) {
/*  108 */     Class<? extends n> clazz = e1.a;
/*  109 */     n n1 = null;
/*      */     
/*  111 */     if (clazz == g.class) {
/*  112 */       n1 = g.a(☃, list, random, i, j, m, cq1, n);
/*  113 */     } else if (clazz == i.class) {
/*  114 */       n1 = i.a(☃, list, random, i, j, m, cq1, n);
/*  115 */     } else if (clazz == a.class) {
/*  116 */       n1 = a.a(☃, list, random, i, j, m, cq1, n);
/*  117 */     } else if (clazz == h.class) {
/*  118 */       n1 = h.a(☃, list, random, i, j, m, cq1, n);
/*  119 */     } else if (clazz == f.class) {
/*  120 */       n1 = f.a(☃, list, random, i, j, m, cq1, n);
/*  121 */     } else if (clazz == b.class) {
/*  122 */       n1 = b.a(☃, list, random, i, j, m, cq1, n);
/*  123 */     } else if (clazz == c.class) {
/*  124 */       n1 = c.a(☃, list, random, i, j, m, cq1, n);
/*  125 */     } else if (clazz == j.class) {
/*  126 */       n1 = j.a(☃, list, random, i, j, m, cq1, n);
/*  127 */     } else if (clazz == m.class) {
/*  128 */       n1 = m.a(☃, list, random, i, j, m, cq1, n);
/*      */     } 
/*      */     
/*  131 */     return n1;
/*      */   }
/*      */   
/*      */   private static n c(k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int n) {
/*  135 */     int i1 = a(☃.e);
/*  136 */     if (i1 <= 0) {
/*  137 */       return null;
/*      */     }
/*      */     
/*  140 */     int i2 = 0;
/*  141 */     while (i2 < 5) {
/*  142 */       i2++;
/*      */       
/*  144 */       int i3 = random.nextInt(i1);
/*  145 */       for (Iterator<e> iterator = ☃.e.iterator(); iterator.hasNext(); ) { e e = iterator.next();
/*  146 */         i3 -= e.b;
/*  147 */         if (i3 < 0) {
/*  148 */           if (!e.a(n) || (e == ☃.d && ☃.e.size() > 1)) {
/*      */             break;
/*      */           }
/*      */           
/*  152 */           n n1 = a(☃, e, list, random, i, j, m, cq1, n);
/*  153 */           if (n1 != null) {
/*  154 */             e.c++;
/*  155 */             ☃.d = e;
/*      */             
/*  157 */             if (!e.a()) {
/*  158 */               ☃.e.remove(e);
/*      */             }
/*  160 */             return n1;
/*      */           } 
/*      */         }  }
/*      */     
/*      */     } 
/*      */ 
/*      */     
/*  167 */     aqe aqe = d.a(☃, list, random, i, j, m, cq1);
/*  168 */     if (aqe != null) {
/*  169 */       return new d(☃, n, random, aqe, cq1);
/*      */     }
/*      */     
/*  172 */     return null;
/*      */   }
/*      */   
/*      */   private static aqt d(k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int n) {
/*  176 */     if (n > 50) {
/*  177 */       return null;
/*      */     }
/*  179 */     if (Math.abs(i - (☃.c()).a) > 112 || Math.abs(m - (☃.c()).c) > 112) {
/*  180 */       return null;
/*      */     }
/*      */     
/*  183 */     aqt aqt = c(☃, list, random, i, j, m, cq1, n + 1);
/*  184 */     if (aqt != null) {
/*  185 */       int i1 = (aqt.l.a + aqt.l.d) / 2;
/*  186 */       int i2 = (aqt.l.c + aqt.l.f) / 2;
/*  187 */       int i3 = aqt.l.d - aqt.l.a;
/*  188 */       int i4 = aqt.l.f - aqt.l.c;
/*  189 */       int i5 = (i3 > i4) ? i3 : i4;
/*  190 */       if (☃.e().a(i1, i2, i5 / 2 + 4, aqv.d)) {
/*  191 */         list.add(aqt);
/*  192 */         ☃.f.add(aqt);
/*  193 */         return aqt;
/*      */       } 
/*      */     } 
/*  196 */     return null;
/*      */   }
/*      */   
/*      */   private static aqt e(k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int n) {
/*  200 */     if (n > 3 + ☃.c) {
/*  201 */       return null;
/*      */     }
/*  203 */     if (Math.abs(i - (☃.c()).a) > 112 || Math.abs(m - (☃.c()).c) > 112) {
/*  204 */       return null;
/*      */     }
/*      */     
/*  207 */     aqe aqe = l.a(☃, list, random, i, j, m, cq1);
/*  208 */     if (aqe != null && aqe.b > 10) {
/*  209 */       aqt aqt = new l(☃, n, random, aqe, cq1);
/*  210 */       int i1 = (aqt.l.a + aqt.l.d) / 2;
/*  211 */       int i2 = (aqt.l.c + aqt.l.f) / 2;
/*  212 */       int i3 = aqt.l.d - aqt.l.a;
/*  213 */       int i4 = aqt.l.f - aqt.l.c;
/*  214 */       int i5 = (i3 > i4) ? i3 : i4;
/*  215 */       if (☃.e().a(i1, i2, i5 / 2 + 4, aqv.d)) {
/*  216 */         list.add(aqt);
/*  217 */         ☃.g.add(aqt);
/*  218 */         return aqt;
/*      */       } 
/*      */     } 
/*      */     
/*  222 */     return null;
/*      */   }
/*      */   
/*      */   static abstract class n extends aqt {
/*  226 */     protected int h = -1;
/*      */     
/*      */     private int a;
/*      */     
/*      */     private boolean b;
/*      */     
/*      */     public n() {}
/*      */     
/*      */     protected n(aqw.k ☃, int i) {
/*  235 */       super(i);
/*  236 */       if (☃ != null) {
/*  237 */         this.b = ☃.b;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  243 */       ☃.a("HPos", this.h);
/*  244 */       ☃.a("VCount", this.a);
/*  245 */       ☃.a("Desert", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  250 */       this.h = ☃.f("HPos");
/*  251 */       this.a = ☃.f("VCount");
/*  252 */       this.b = ☃.n("Desert");
/*      */     }
/*      */     
/*      */     protected aqt a(aqw.k ☃, List<aqt> list, Random random, int i, int j) {
/*  256 */       if (this.m != null) {
/*  257 */         switch (aqw.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  259 */             return aqw.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*      */           case 2:
/*  261 */             return aqw.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*      */           case 3:
/*  263 */             return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*      */           case 4:
/*  265 */             return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*      */         } 
/*      */       }
/*  268 */       return null;
/*      */     }
/*      */     
/*      */     protected aqt b(aqw.k ☃, List<aqt> list, Random random, int i, int j) {
/*  272 */       if (this.m != null) {
/*  273 */         switch (aqw.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  275 */             return aqw.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*      */           case 2:
/*  277 */             return aqw.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*      */           case 3:
/*  279 */             return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*      */           case 4:
/*  281 */             return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*      */         } 
/*      */       }
/*  284 */       return null;
/*      */     }
/*      */     
/*      */     protected int b(adm ☃, aqe aqe1) {
/*  288 */       int i = 0;
/*  289 */       int j = 0;
/*  290 */       cj.a a = new cj.a();
/*  291 */       for (int k = this.l.c; k <= this.l.f; k++) {
/*  292 */         for (int m = this.l.a; m <= this.l.d; m++) {
/*  293 */           a.c(m, 64, k);
/*  294 */           if (aqe1.b(a)) {
/*  295 */             i += Math.max(☃.r(a).o(), ☃.t.i());
/*  296 */             j++;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  301 */       if (j == 0) {
/*  302 */         return -1;
/*      */       }
/*  304 */       return i / j;
/*      */     }
/*      */     
/*      */     protected static boolean a(aqe ☃) {
/*  308 */       return (☃ != null && ☃.b > 10);
/*      */     }
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
/*      */     protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m) {
/*  323 */       if (this.a >= m) {
/*      */         return;
/*      */       }
/*      */       
/*  327 */       int i1 = this.a;
/*  328 */       int i2 = a(i + i1, k);
/*  329 */       int i3 = d(j);
/*  330 */       int i4 = b(i + i1, k);
/*      */       
/*  332 */       for (; i1 < m && aqe1.b(new cj(i2, i3, i4)); i1++) {
/*  333 */         this.a++;
/*      */         
/*  335 */         wi wi = new wi(☃);
/*  336 */         wi.b(i2 + 0.5D, i3, i4 + 0.5D, 0.0F, 0.0F);
/*  337 */         wi.a(☃.E(new cj(wi)), (pu)null);
/*  338 */         wi.r(c(i1, wi.cl()));
/*  339 */         ☃.d(wi);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/*  348 */       return i;
/*      */     }
/*      */     
/*      */     protected alz a(alz ☃) {
/*  352 */       if (this.b) {
/*  353 */         if (☃.c() == afi.r || ☃.c() == afi.s)
/*  354 */           return afi.A.Q(); 
/*  355 */         if (☃.c() == afi.e)
/*  356 */           return afi.A.a(aji.a.a.a()); 
/*  357 */         if (☃.c() == afi.f)
/*  358 */           return afi.A.a(aji.a.c.a()); 
/*  359 */         if (☃.c() == afi.ad)
/*  360 */           return afi.bO.Q().a(aju.a, ☃.b(aju.a)); 
/*  361 */         if (☃.c() == afi.aw)
/*  362 */           return afi.bO.Q().a(aju.a, ☃.b(aju.a)); 
/*  363 */         if (☃.c() == afi.n) {
/*  364 */           return afi.A.Q();
/*      */         }
/*      */       } 
/*  367 */       return ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(adm ☃, alz alz1, int i, int j, int k, aqe aqe1) {
/*  372 */       alz alz2 = a(alz1);
/*  373 */       super.a(☃, alz2, i, j, k, aqe1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int i1, int i2, alz alz1, alz alz2, boolean bool) {
/*  378 */       alz alz3 = a(alz1);
/*  379 */       alz alz4 = a(alz2);
/*  380 */       super.a(☃, aqe1, i, j, k, m, i1, i2, alz3, alz4, bool);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(adm ☃, alz alz1, int i, int j, int k, aqe aqe1) {
/*  385 */       alz alz2 = a(alz1);
/*  386 */       super.b(☃, alz2, i, j, k, aqe1);
/*      */     }
/*      */     
/*      */     protected void a(boolean ☃) {
/*  390 */       this.b = ☃;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class p
/*      */     extends n
/*      */   {
/*      */     public p() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public p(aqw.k ☃, int i, Random random, int j, int m) {
/*  404 */       super(☃, i);
/*      */       
/*  406 */       this.m = cq.c.a.a(random);
/*      */       
/*  408 */       switch (aqw.null.a[this.m.ordinal()]) {
/*      */         case 1:
/*      */         case 2:
/*  411 */           this.l = new aqe(j, 64, m, j + 6 - 1, 78, m + 6 - 1);
/*      */           return;
/*      */       } 
/*  414 */       this.l = new aqe(j, 64, m, j + 6 - 1, 78, m + 6 - 1);
/*      */     }
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
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  428 */       aqw.b((aqw.k)☃, list, random, this.l.a - 1, this.l.e - 4, this.l.c + 1, cq.e, d());
/*  429 */       aqw.b((aqw.k)☃, list, random, this.l.d + 1, this.l.e - 4, this.l.c + 1, cq.f, d());
/*  430 */       aqw.b((aqw.k)☃, list, random, this.l.a + 1, this.l.e - 4, this.l.c - 1, cq.c, d());
/*  431 */       aqw.b((aqw.k)☃, list, random, this.l.a + 1, this.l.e - 4, this.l.f + 1, cq.d, d());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  436 */       if (this.h < 0) {
/*  437 */         this.h = b(☃, aqe1);
/*  438 */         if (this.h < 0) {
/*  439 */           return true;
/*      */         }
/*  441 */         this.l.a(0, this.h - this.l.e + 3, 0);
/*      */       } 
/*      */       
/*  444 */       a(☃, aqe1, 1, 0, 1, 4, 12, 4, afi.e.Q(), afi.i.Q(), false);
/*  445 */       a(☃, afi.a.Q(), 2, 12, 2, aqe1);
/*  446 */       a(☃, afi.a.Q(), 3, 12, 2, aqe1);
/*  447 */       a(☃, afi.a.Q(), 2, 12, 3, aqe1);
/*  448 */       a(☃, afi.a.Q(), 3, 12, 3, aqe1);
/*      */       
/*  450 */       a(☃, afi.aO.Q(), 1, 13, 1, aqe1);
/*  451 */       a(☃, afi.aO.Q(), 1, 14, 1, aqe1);
/*  452 */       a(☃, afi.aO.Q(), 4, 13, 1, aqe1);
/*  453 */       a(☃, afi.aO.Q(), 4, 14, 1, aqe1);
/*  454 */       a(☃, afi.aO.Q(), 1, 13, 4, aqe1);
/*  455 */       a(☃, afi.aO.Q(), 1, 14, 4, aqe1);
/*  456 */       a(☃, afi.aO.Q(), 4, 13, 4, aqe1);
/*  457 */       a(☃, afi.aO.Q(), 4, 14, 4, aqe1);
/*  458 */       a(☃, aqe1, 1, 15, 1, 4, 15, 4, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  460 */       for (int i = 0; i <= 5; i++) {
/*  461 */         for (int j = 0; j <= 5; j++) {
/*      */           
/*  463 */           if (j == 0 || j == 5 || i == 0 || i == 5) {
/*      */ 
/*      */             
/*  466 */             a(☃, afi.n.Q(), j, 11, i, aqe1);
/*  467 */             b(☃, j, 12, i, aqe1);
/*      */           } 
/*      */         } 
/*      */       } 
/*  471 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class k
/*      */     extends p
/*      */   {
/*      */     public aec a;
/*      */     
/*      */     public boolean b;
/*      */     
/*      */     public int c;
/*      */     public aqw.e d;
/*      */     public List<aqw.e> e;
/*  486 */     public List<aqt> f = Lists.newArrayList();
/*  487 */     public List<aqt> g = Lists.newArrayList();
/*      */ 
/*      */ 
/*      */     
/*      */     public k() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public k(aec ☃, int i, Random random, int j, int m, List<aqw.e> list, int n) {
/*  496 */       super((k)null, 0, random, j, m);
/*  497 */       this.a = ☃;
/*  498 */       this.e = list;
/*  499 */       this.c = n;
/*      */       
/*  501 */       ady ady = ☃.a(new cj(j, 0, m), ady.ad);
/*  502 */       this.b = (ady == ady.r || ady == ady.G);
/*  503 */       a(this.b);
/*      */     }
/*      */     
/*      */     public aec e() {
/*  507 */       return this.a;
/*      */     }
/*      */   }
/*      */   
/*      */   public static abstract class o
/*      */     extends n
/*      */   {
/*      */     public o() {}
/*      */     
/*      */     protected o(aqw.k ☃, int i) {
/*  517 */       super(☃, i);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends o
/*      */   {
/*      */     private int a;
/*      */ 
/*      */     
/*      */     public l() {}
/*      */     
/*      */     public l(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/*  531 */       super(☃, i);
/*      */       
/*  533 */       this.m = cq1;
/*  534 */       this.l = aqe1;
/*  535 */       this.a = Math.max(aqe1.c(), aqe1.e());
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  540 */       super.a(☃);
/*  541 */       ☃.a("Length", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  546 */       super.b(☃);
/*  547 */       this.a = ☃.f("Length");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  552 */       boolean bool = false;
/*      */ 
/*      */       
/*  555 */       int i = random.nextInt(5);
/*  556 */       while (i < this.a - 8) {
/*  557 */         aqt aqt1 = a((aqw.k)☃, list, random, 0, i);
/*  558 */         if (aqt1 != null) {
/*  559 */           i += Math.max(aqt1.l.c(), aqt1.l.e());
/*  560 */           bool = true;
/*      */         } 
/*  562 */         i += 2 + random.nextInt(5);
/*      */       } 
/*      */ 
/*      */       
/*  566 */       i = random.nextInt(5);
/*  567 */       while (i < this.a - 8) {
/*  568 */         aqt aqt1 = b((aqw.k)☃, list, random, 0, i);
/*  569 */         if (aqt1 != null) {
/*  570 */           i += Math.max(aqt1.l.c(), aqt1.l.e());
/*  571 */           bool = true;
/*      */         } 
/*  573 */         i += 2 + random.nextInt(5);
/*      */       } 
/*      */       
/*  576 */       if (bool && random.nextInt(3) > 0 && this.m != null) {
/*  577 */         switch (aqw.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  579 */             aqw.b((aqw.k)☃, list, random, this.l.a - 1, this.l.b, this.l.c, cq.e, d());
/*      */             break;
/*      */           case 2:
/*  582 */             aqw.b((aqw.k)☃, list, random, this.l.a - 1, this.l.b, this.l.f - 2, cq.e, d());
/*      */             break;
/*      */           case 4:
/*  585 */             aqw.b((aqw.k)☃, list, random, this.l.d - 2, this.l.b, this.l.c - 1, cq.c, d());
/*      */             break;
/*      */           case 3:
/*  588 */             aqw.b((aqw.k)☃, list, random, this.l.a, this.l.b, this.l.c - 1, cq.c, d());
/*      */             break;
/*      */         } 
/*      */       }
/*  592 */       if (bool && random.nextInt(3) > 0 && this.m != null) {
/*  593 */         switch (aqw.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  595 */             aqw.b((aqw.k)☃, list, random, this.l.d + 1, this.l.b, this.l.c, cq.f, d());
/*      */             break;
/*      */           case 2:
/*  598 */             aqw.b((aqw.k)☃, list, random, this.l.d + 1, this.l.b, this.l.f - 2, cq.f, d());
/*      */             break;
/*      */           case 4:
/*  601 */             aqw.b((aqw.k)☃, list, random, this.l.d - 2, this.l.b, this.l.f + 1, cq.d, d());
/*      */             break;
/*      */           case 3:
/*  604 */             aqw.b((aqw.k)☃, list, random, this.l.a, this.l.b, this.l.f + 1, cq.d, d());
/*      */             break;
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*      */     public static aqe a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1) {
/*  611 */       int n = 7 * ns.a(random, 3, 5);
/*      */       
/*  613 */       while (n >= 7) {
/*  614 */         aqe aqe = aqe.a(i, j, m, 0, 0, 0, 3, 3, n, cq1);
/*      */         
/*  616 */         if (aqt.a(list, aqe) == null) {
/*  617 */           return aqe;
/*      */         }
/*  619 */         n -= 7;
/*      */       } 
/*      */       
/*  622 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  627 */       alz alz1 = a(afi.n.Q());
/*  628 */       alz alz2 = a(afi.e.Q());
/*  629 */       for (int i = this.l.a; i <= this.l.d; i++) {
/*  630 */         for (int j = this.l.c; j <= this.l.f; j++) {
/*  631 */           cj cj = new cj(i, 64, j);
/*  632 */           if (aqe1.b(cj)) {
/*  633 */             cj = ☃.r(cj).b();
/*  634 */             ☃.a(cj, alz1, 2);
/*  635 */             ☃.a(cj.b(), alz2, 2);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  640 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends n
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public g() {}
/*      */ 
/*      */     
/*      */     public g(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/*  656 */       super(☃, i);
/*      */       
/*  658 */       this.m = cq1;
/*  659 */       this.l = aqe1;
/*  660 */       this.a = random.nextBoolean();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  665 */       super.a(☃);
/*  666 */       ☃.a("Terrace", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  671 */       super.b(☃);
/*  672 */       this.a = ☃.n("Terrace");
/*      */     }
/*      */     
/*      */     public static g a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int i1) {
/*  676 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 5, 6, 5, cq1);
/*      */       
/*  678 */       if (aqt.a(list, aqe) != null) {
/*  679 */         return null;
/*      */       }
/*      */       
/*  682 */       return new g(☃, i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  687 */       if (this.h < 0) {
/*  688 */         this.h = b(☃, aqe1);
/*  689 */         if (this.h < 0) {
/*  690 */           return true;
/*      */         }
/*  692 */         this.l.a(0, this.h - this.l.e + 6 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/*  696 */       a(☃, aqe1, 0, 0, 0, 4, 0, 4, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  698 */       a(☃, aqe1, 0, 4, 0, 4, 4, 4, afi.r.Q(), afi.r.Q(), false);
/*  699 */       a(☃, aqe1, 1, 4, 1, 3, 4, 3, afi.f.Q(), afi.f.Q(), false);
/*      */ 
/*      */       
/*  702 */       a(☃, afi.e.Q(), 0, 1, 0, aqe1);
/*  703 */       a(☃, afi.e.Q(), 0, 2, 0, aqe1);
/*  704 */       a(☃, afi.e.Q(), 0, 3, 0, aqe1);
/*  705 */       a(☃, afi.e.Q(), 4, 1, 0, aqe1);
/*  706 */       a(☃, afi.e.Q(), 4, 2, 0, aqe1);
/*  707 */       a(☃, afi.e.Q(), 4, 3, 0, aqe1);
/*  708 */       a(☃, afi.e.Q(), 0, 1, 4, aqe1);
/*  709 */       a(☃, afi.e.Q(), 0, 2, 4, aqe1);
/*  710 */       a(☃, afi.e.Q(), 0, 3, 4, aqe1);
/*  711 */       a(☃, afi.e.Q(), 4, 1, 4, aqe1);
/*  712 */       a(☃, afi.e.Q(), 4, 2, 4, aqe1);
/*  713 */       a(☃, afi.e.Q(), 4, 3, 4, aqe1);
/*  714 */       a(☃, aqe1, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
/*  715 */       a(☃, aqe1, 4, 1, 1, 4, 3, 3, afi.f.Q(), afi.f.Q(), false);
/*  716 */       a(☃, aqe1, 1, 1, 4, 3, 3, 4, afi.f.Q(), afi.f.Q(), false);
/*  717 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/*  718 */       a(☃, afi.bj.Q(), 2, 2, 4, aqe1);
/*  719 */       a(☃, afi.bj.Q(), 4, 2, 2, aqe1);
/*      */ 
/*      */       
/*  722 */       a(☃, afi.f.Q(), 1, 1, 0, aqe1);
/*  723 */       a(☃, afi.f.Q(), 1, 2, 0, aqe1);
/*  724 */       a(☃, afi.f.Q(), 1, 3, 0, aqe1);
/*  725 */       a(☃, afi.f.Q(), 2, 3, 0, aqe1);
/*  726 */       a(☃, afi.f.Q(), 3, 3, 0, aqe1);
/*  727 */       a(☃, afi.f.Q(), 3, 2, 0, aqe1);
/*  728 */       a(☃, afi.f.Q(), 3, 1, 0, aqe1);
/*  729 */       if (a(☃, 2, 0, -1, aqe1).c().t() == arm.a && a(☃, 2, -1, -1, aqe1).c().t() != arm.a) {
/*  730 */         a(☃, afi.aw.a(a(afi.aw, 3)), 2, 0, -1, aqe1);
/*      */       }
/*      */ 
/*      */       
/*  734 */       a(☃, aqe1, 1, 1, 1, 3, 3, 3, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  737 */       if (this.a) {
/*  738 */         a(☃, afi.aO.Q(), 0, 5, 0, aqe1);
/*  739 */         a(☃, afi.aO.Q(), 1, 5, 0, aqe1);
/*  740 */         a(☃, afi.aO.Q(), 2, 5, 0, aqe1);
/*  741 */         a(☃, afi.aO.Q(), 3, 5, 0, aqe1);
/*  742 */         a(☃, afi.aO.Q(), 4, 5, 0, aqe1);
/*  743 */         a(☃, afi.aO.Q(), 0, 5, 4, aqe1);
/*  744 */         a(☃, afi.aO.Q(), 1, 5, 4, aqe1);
/*  745 */         a(☃, afi.aO.Q(), 2, 5, 4, aqe1);
/*  746 */         a(☃, afi.aO.Q(), 3, 5, 4, aqe1);
/*  747 */         a(☃, afi.aO.Q(), 4, 5, 4, aqe1);
/*  748 */         a(☃, afi.aO.Q(), 4, 5, 1, aqe1);
/*  749 */         a(☃, afi.aO.Q(), 4, 5, 2, aqe1);
/*  750 */         a(☃, afi.aO.Q(), 4, 5, 3, aqe1);
/*  751 */         a(☃, afi.aO.Q(), 0, 5, 1, aqe1);
/*  752 */         a(☃, afi.aO.Q(), 0, 5, 2, aqe1);
/*  753 */         a(☃, afi.aO.Q(), 0, 5, 3, aqe1);
/*      */       } 
/*      */ 
/*      */       
/*  757 */       if (this.a) {
/*  758 */         int j = a(afi.au, 3);
/*  759 */         a(☃, afi.au.a(j), 3, 1, 3, aqe1);
/*  760 */         a(☃, afi.au.a(j), 3, 2, 3, aqe1);
/*  761 */         a(☃, afi.au.a(j), 3, 3, 3, aqe1);
/*  762 */         a(☃, afi.au.a(j), 3, 4, 3, aqe1);
/*      */       } 
/*      */ 
/*      */       
/*  766 */       a(☃, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, aqe1);
/*      */       
/*  768 */       for (int i = 0; i < 5; i++) {
/*  769 */         for (int j = 0; j < 5; j++) {
/*  770 */           b(☃, j, 6, i, aqe1);
/*  771 */           b(☃, afi.e.Q(), j, -1, i, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/*  775 */       a(☃, aqe1, 1, 1, 2, 1);
/*      */       
/*  777 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class i
/*      */     extends n
/*      */   {
/*      */     public i() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public i(aqw.k ☃, int j, Random random, aqe aqe1, cq cq1) {
/*  791 */       super(☃, j);
/*      */       
/*  793 */       this.m = cq1;
/*  794 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     public static i a(aqw.k ☃, List<aqt> list, Random random, int j, int m, int i1, cq cq1, int i2) {
/*  798 */       aqe aqe = aqe.a(j, m, i1, 0, 0, 0, 5, 12, 9, cq1);
/*      */       
/*  800 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/*  801 */         return null;
/*      */       }
/*      */       
/*  804 */       return new i(☃, i2, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  809 */       if (this.h < 0) {
/*  810 */         this.h = b(☃, aqe1);
/*  811 */         if (this.h < 0) {
/*  812 */           return true;
/*      */         }
/*  814 */         this.l.a(0, this.h - this.l.e + 12 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/*  818 */       a(☃, aqe1, 1, 1, 1, 3, 3, 7, afi.a.Q(), afi.a.Q(), false);
/*  819 */       a(☃, aqe1, 1, 5, 1, 3, 9, 3, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  822 */       a(☃, aqe1, 1, 0, 0, 3, 0, 8, afi.e.Q(), afi.e.Q(), false);
/*      */ 
/*      */       
/*  825 */       a(☃, aqe1, 1, 1, 0, 3, 10, 0, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  827 */       a(☃, aqe1, 0, 1, 1, 0, 10, 3, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  829 */       a(☃, aqe1, 4, 1, 1, 4, 10, 3, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  831 */       a(☃, aqe1, 0, 0, 4, 0, 4, 7, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  833 */       a(☃, aqe1, 4, 0, 4, 4, 4, 7, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  835 */       a(☃, aqe1, 1, 1, 8, 3, 4, 8, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  837 */       a(☃, aqe1, 1, 5, 4, 3, 10, 4, afi.e.Q(), afi.e.Q(), false);
/*      */ 
/*      */       
/*  840 */       a(☃, aqe1, 1, 5, 5, 3, 5, 7, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  842 */       a(☃, aqe1, 0, 9, 0, 4, 9, 4, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  844 */       a(☃, aqe1, 0, 4, 0, 4, 4, 4, afi.e.Q(), afi.e.Q(), false);
/*  845 */       a(☃, afi.e.Q(), 0, 11, 2, aqe1);
/*  846 */       a(☃, afi.e.Q(), 4, 11, 2, aqe1);
/*  847 */       a(☃, afi.e.Q(), 2, 11, 0, aqe1);
/*  848 */       a(☃, afi.e.Q(), 2, 11, 4, aqe1);
/*      */ 
/*      */       
/*  851 */       a(☃, afi.e.Q(), 1, 1, 6, aqe1);
/*  852 */       a(☃, afi.e.Q(), 1, 1, 7, aqe1);
/*  853 */       a(☃, afi.e.Q(), 2, 1, 7, aqe1);
/*  854 */       a(☃, afi.e.Q(), 3, 1, 6, aqe1);
/*  855 */       a(☃, afi.e.Q(), 3, 1, 7, aqe1);
/*  856 */       a(☃, afi.aw.a(a(afi.aw, 3)), 1, 1, 5, aqe1);
/*  857 */       a(☃, afi.aw.a(a(afi.aw, 3)), 2, 1, 6, aqe1);
/*  858 */       a(☃, afi.aw.a(a(afi.aw, 3)), 3, 1, 5, aqe1);
/*  859 */       a(☃, afi.aw.a(a(afi.aw, 1)), 1, 2, 7, aqe1);
/*  860 */       a(☃, afi.aw.a(a(afi.aw, 0)), 3, 2, 7, aqe1);
/*      */ 
/*      */       
/*  863 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/*  864 */       a(☃, afi.bj.Q(), 0, 3, 2, aqe1);
/*  865 */       a(☃, afi.bj.Q(), 4, 2, 2, aqe1);
/*  866 */       a(☃, afi.bj.Q(), 4, 3, 2, aqe1);
/*  867 */       a(☃, afi.bj.Q(), 0, 6, 2, aqe1);
/*  868 */       a(☃, afi.bj.Q(), 0, 7, 2, aqe1);
/*  869 */       a(☃, afi.bj.Q(), 4, 6, 2, aqe1);
/*  870 */       a(☃, afi.bj.Q(), 4, 7, 2, aqe1);
/*  871 */       a(☃, afi.bj.Q(), 2, 6, 0, aqe1);
/*  872 */       a(☃, afi.bj.Q(), 2, 7, 0, aqe1);
/*  873 */       a(☃, afi.bj.Q(), 2, 6, 4, aqe1);
/*  874 */       a(☃, afi.bj.Q(), 2, 7, 4, aqe1);
/*  875 */       a(☃, afi.bj.Q(), 0, 3, 6, aqe1);
/*  876 */       a(☃, afi.bj.Q(), 4, 3, 6, aqe1);
/*  877 */       a(☃, afi.bj.Q(), 2, 3, 8, aqe1);
/*      */ 
/*      */       
/*  880 */       a(☃, afi.aa.Q().a(akf.a, this.m.d()), 2, 4, 7, aqe1);
/*  881 */       a(☃, afi.aa.Q().a(akf.a, this.m.e()), 1, 4, 6, aqe1);
/*  882 */       a(☃, afi.aa.Q().a(akf.a, this.m.f()), 3, 4, 6, aqe1);
/*  883 */       a(☃, afi.aa.Q().a(akf.a, this.m), 2, 4, 5, aqe1);
/*      */ 
/*      */       
/*  886 */       int j = a(afi.au, 4); int k;
/*  887 */       for (k = 1; k <= 9; k++) {
/*  888 */         a(☃, afi.au.a(j), 3, k, 3, aqe1);
/*      */       }
/*      */ 
/*      */       
/*  892 */       a(☃, afi.a.Q(), 2, 1, 0, aqe1);
/*  893 */       a(☃, afi.a.Q(), 2, 2, 0, aqe1);
/*  894 */       a(☃, aqe1, random, 2, 1, 0, cq.b(a(afi.ao, 1)));
/*  895 */       if (a(☃, 2, 0, -1, aqe1).c().t() == arm.a && a(☃, 2, -1, -1, aqe1).c().t() != arm.a) {
/*  896 */         a(☃, afi.aw.a(a(afi.aw, 3)), 2, 0, -1, aqe1);
/*      */       }
/*      */       
/*  899 */       for (k = 0; k < 9; k++) {
/*  900 */         for (int m = 0; m < 5; m++) {
/*  901 */           b(☃, m, 12, k, aqe1);
/*  902 */           b(☃, afi.e.Q(), m, -1, k, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/*  906 */       a(☃, aqe1, 2, 1, 2, 1);
/*      */       
/*  908 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int j) {
/*  913 */       return 2;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends n
/*      */   {
/*      */     public a() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public a(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/*  927 */       super(☃, i);
/*      */       
/*  929 */       this.m = cq1;
/*  930 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     public static a a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int i1) {
/*  934 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 9, 9, 6, cq1);
/*      */       
/*  936 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/*  937 */         return null;
/*      */       }
/*      */       
/*  940 */       return new a(☃, i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  945 */       if (this.h < 0) {
/*  946 */         this.h = b(☃, aqe1);
/*  947 */         if (this.h < 0) {
/*  948 */           return true;
/*      */         }
/*  950 */         this.l.a(0, this.h - this.l.e + 9 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/*  954 */       a(☃, aqe1, 1, 1, 1, 7, 5, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  957 */       a(☃, aqe1, 0, 0, 0, 8, 0, 5, afi.e.Q(), afi.e.Q(), false);
/*      */       
/*  959 */       a(☃, aqe1, 0, 5, 0, 8, 5, 5, afi.e.Q(), afi.e.Q(), false);
/*  960 */       a(☃, aqe1, 0, 6, 1, 8, 6, 4, afi.e.Q(), afi.e.Q(), false);
/*  961 */       a(☃, aqe1, 0, 7, 2, 8, 7, 3, afi.e.Q(), afi.e.Q(), false);
/*  962 */       int i = a(afi.ad, 3);
/*  963 */       int j = a(afi.ad, 2); int k;
/*  964 */       for (k = -1; k <= 2; k++) {
/*  965 */         for (int i1 = 0; i1 <= 8; i1++) {
/*  966 */           a(☃, afi.ad.a(i), i1, 6 + k, k, aqe1);
/*  967 */           a(☃, afi.ad.a(j), i1, 6 + k, 5 - k, aqe1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  972 */       a(☃, aqe1, 0, 1, 0, 0, 1, 5, afi.e.Q(), afi.e.Q(), false);
/*  973 */       a(☃, aqe1, 1, 1, 5, 8, 1, 5, afi.e.Q(), afi.e.Q(), false);
/*  974 */       a(☃, aqe1, 8, 1, 0, 8, 1, 4, afi.e.Q(), afi.e.Q(), false);
/*  975 */       a(☃, aqe1, 2, 1, 0, 7, 1, 0, afi.e.Q(), afi.e.Q(), false);
/*  976 */       a(☃, aqe1, 0, 2, 0, 0, 4, 0, afi.e.Q(), afi.e.Q(), false);
/*  977 */       a(☃, aqe1, 0, 2, 5, 0, 4, 5, afi.e.Q(), afi.e.Q(), false);
/*  978 */       a(☃, aqe1, 8, 2, 5, 8, 4, 5, afi.e.Q(), afi.e.Q(), false);
/*  979 */       a(☃, aqe1, 8, 2, 0, 8, 4, 0, afi.e.Q(), afi.e.Q(), false);
/*      */ 
/*      */       
/*  982 */       a(☃, aqe1, 0, 2, 1, 0, 4, 4, afi.f.Q(), afi.f.Q(), false);
/*  983 */       a(☃, aqe1, 1, 2, 5, 7, 4, 5, afi.f.Q(), afi.f.Q(), false);
/*  984 */       a(☃, aqe1, 8, 2, 1, 8, 4, 4, afi.f.Q(), afi.f.Q(), false);
/*  985 */       a(☃, aqe1, 1, 2, 0, 7, 4, 0, afi.f.Q(), afi.f.Q(), false);
/*      */ 
/*      */       
/*  988 */       a(☃, afi.bj.Q(), 4, 2, 0, aqe1);
/*  989 */       a(☃, afi.bj.Q(), 5, 2, 0, aqe1);
/*  990 */       a(☃, afi.bj.Q(), 6, 2, 0, aqe1);
/*  991 */       a(☃, afi.bj.Q(), 4, 3, 0, aqe1);
/*  992 */       a(☃, afi.bj.Q(), 5, 3, 0, aqe1);
/*  993 */       a(☃, afi.bj.Q(), 6, 3, 0, aqe1);
/*  994 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/*  995 */       a(☃, afi.bj.Q(), 0, 2, 3, aqe1);
/*  996 */       a(☃, afi.bj.Q(), 0, 3, 2, aqe1);
/*  997 */       a(☃, afi.bj.Q(), 0, 3, 3, aqe1);
/*  998 */       a(☃, afi.bj.Q(), 8, 2, 2, aqe1);
/*  999 */       a(☃, afi.bj.Q(), 8, 2, 3, aqe1);
/* 1000 */       a(☃, afi.bj.Q(), 8, 3, 2, aqe1);
/* 1001 */       a(☃, afi.bj.Q(), 8, 3, 3, aqe1);
/* 1002 */       a(☃, afi.bj.Q(), 2, 2, 5, aqe1);
/* 1003 */       a(☃, afi.bj.Q(), 3, 2, 5, aqe1);
/* 1004 */       a(☃, afi.bj.Q(), 5, 2, 5, aqe1);
/* 1005 */       a(☃, afi.bj.Q(), 6, 2, 5, aqe1);
/*      */ 
/*      */       
/* 1008 */       a(☃, aqe1, 1, 4, 1, 7, 4, 1, afi.f.Q(), afi.f.Q(), false);
/* 1009 */       a(☃, aqe1, 1, 4, 4, 7, 4, 4, afi.f.Q(), afi.f.Q(), false);
/* 1010 */       a(☃, aqe1, 1, 3, 4, 7, 3, 4, afi.X.Q(), afi.X.Q(), false);
/*      */ 
/*      */       
/* 1013 */       a(☃, afi.f.Q(), 7, 1, 4, aqe1);
/* 1014 */       a(☃, afi.ad.a(a(afi.ad, 0)), 7, 1, 3, aqe1);
/* 1015 */       k = a(afi.ad, 3);
/* 1016 */       a(☃, afi.ad.a(k), 6, 1, 4, aqe1);
/* 1017 */       a(☃, afi.ad.a(k), 5, 1, 4, aqe1);
/* 1018 */       a(☃, afi.ad.a(k), 4, 1, 4, aqe1);
/* 1019 */       a(☃, afi.ad.a(k), 3, 1, 4, aqe1);
/*      */ 
/*      */       
/* 1022 */       a(☃, afi.aO.Q(), 6, 1, 3, aqe1);
/* 1023 */       a(☃, afi.aB.Q(), 6, 2, 3, aqe1);
/* 1024 */       a(☃, afi.aO.Q(), 4, 1, 3, aqe1);
/* 1025 */       a(☃, afi.aB.Q(), 4, 2, 3, aqe1);
/* 1026 */       a(☃, afi.ai.Q(), 7, 1, 1, aqe1);
/*      */ 
/*      */       
/* 1029 */       a(☃, afi.a.Q(), 1, 1, 0, aqe1);
/* 1030 */       a(☃, afi.a.Q(), 1, 2, 0, aqe1);
/* 1031 */       a(☃, aqe1, random, 1, 1, 0, cq.b(a(afi.ao, 1)));
/* 1032 */       if (a(☃, 1, 0, -1, aqe1).c().t() == arm.a && a(☃, 1, -1, -1, aqe1).c().t() != arm.a) {
/* 1033 */         a(☃, afi.aw.a(a(afi.aw, 3)), 1, 0, -1, aqe1);
/*      */       }
/*      */       
/* 1036 */       for (int m = 0; m < 6; m++) {
/* 1037 */         for (int i1 = 0; i1 < 9; i1++) {
/* 1038 */           b(☃, i1, 9, m, aqe1);
/* 1039 */           b(☃, afi.e.Q(), i1, -1, m, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1043 */       a(☃, aqe1, 2, 1, 2, 1);
/*      */       
/* 1045 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/* 1050 */       return 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends n
/*      */   {
/*      */     private boolean a;
/*      */     
/*      */     private int b;
/*      */ 
/*      */     
/*      */     public h() {}
/*      */ 
/*      */     
/*      */     public h(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1067 */       super(☃, i);
/*      */       
/* 1069 */       this.m = cq1;
/* 1070 */       this.l = aqe1;
/* 1071 */       this.a = random.nextBoolean();
/* 1072 */       this.b = random.nextInt(3);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1077 */       super.a(☃);
/* 1078 */       ☃.a("T", this.b);
/* 1079 */       ☃.a("C", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1084 */       super.b(☃);
/* 1085 */       this.b = ☃.f("T");
/* 1086 */       this.a = ☃.n("C");
/*      */     }
/*      */     
/*      */     public static h a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int i1) {
/* 1090 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 4, 6, 5, cq1);
/*      */       
/* 1092 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/* 1093 */         return null;
/*      */       }
/*      */       
/* 1096 */       return new h(☃, i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1101 */       if (this.h < 0) {
/* 1102 */         this.h = b(☃, aqe1);
/* 1103 */         if (this.h < 0) {
/* 1104 */           return true;
/*      */         }
/* 1106 */         this.l.a(0, this.h - this.l.e + 6 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1110 */       a(☃, aqe1, 1, 1, 1, 3, 5, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1113 */       a(☃, aqe1, 0, 0, 0, 3, 0, 4, afi.e.Q(), afi.e.Q(), false);
/* 1114 */       a(☃, aqe1, 1, 0, 1, 2, 0, 3, afi.d.Q(), afi.d.Q(), false);
/*      */       
/* 1116 */       if (this.a) {
/* 1117 */         a(☃, aqe1, 1, 4, 1, 2, 4, 3, afi.r.Q(), afi.r.Q(), false);
/*      */       } else {
/* 1119 */         a(☃, aqe1, 1, 5, 1, 2, 5, 3, afi.r.Q(), afi.r.Q(), false);
/*      */       } 
/* 1121 */       a(☃, afi.r.Q(), 1, 4, 0, aqe1);
/* 1122 */       a(☃, afi.r.Q(), 2, 4, 0, aqe1);
/* 1123 */       a(☃, afi.r.Q(), 1, 4, 4, aqe1);
/* 1124 */       a(☃, afi.r.Q(), 2, 4, 4, aqe1);
/* 1125 */       a(☃, afi.r.Q(), 0, 4, 1, aqe1);
/* 1126 */       a(☃, afi.r.Q(), 0, 4, 2, aqe1);
/* 1127 */       a(☃, afi.r.Q(), 0, 4, 3, aqe1);
/* 1128 */       a(☃, afi.r.Q(), 3, 4, 1, aqe1);
/* 1129 */       a(☃, afi.r.Q(), 3, 4, 2, aqe1);
/* 1130 */       a(☃, afi.r.Q(), 3, 4, 3, aqe1);
/*      */ 
/*      */       
/* 1133 */       a(☃, aqe1, 0, 1, 0, 0, 3, 0, afi.r.Q(), afi.r.Q(), false);
/* 1134 */       a(☃, aqe1, 3, 1, 0, 3, 3, 0, afi.r.Q(), afi.r.Q(), false);
/* 1135 */       a(☃, aqe1, 0, 1, 4, 0, 3, 4, afi.r.Q(), afi.r.Q(), false);
/* 1136 */       a(☃, aqe1, 3, 1, 4, 3, 3, 4, afi.r.Q(), afi.r.Q(), false);
/*      */ 
/*      */       
/* 1139 */       a(☃, aqe1, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
/* 1140 */       a(☃, aqe1, 3, 1, 1, 3, 3, 3, afi.f.Q(), afi.f.Q(), false);
/* 1141 */       a(☃, aqe1, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
/* 1142 */       a(☃, aqe1, 1, 1, 4, 2, 3, 4, afi.f.Q(), afi.f.Q(), false);
/*      */ 
/*      */       
/* 1145 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/* 1146 */       a(☃, afi.bj.Q(), 3, 2, 2, aqe1);
/*      */ 
/*      */       
/* 1149 */       if (this.b > 0) {
/* 1150 */         a(☃, afi.aO.Q(), this.b, 1, 3, aqe1);
/* 1151 */         a(☃, afi.aB.Q(), this.b, 2, 3, aqe1);
/*      */       } 
/*      */ 
/*      */       
/* 1155 */       a(☃, afi.a.Q(), 1, 1, 0, aqe1);
/* 1156 */       a(☃, afi.a.Q(), 1, 2, 0, aqe1);
/* 1157 */       a(☃, aqe1, random, 1, 1, 0, cq.b(a(afi.ao, 1)));
/* 1158 */       if (a(☃, 1, 0, -1, aqe1).c().t() == arm.a && a(☃, 1, -1, -1, aqe1).c().t() != arm.a) {
/* 1159 */         a(☃, afi.aw.a(a(afi.aw, 3)), 1, 0, -1, aqe1);
/*      */       }
/*      */       
/* 1162 */       for (int i = 0; i < 5; i++) {
/* 1163 */         for (int j = 0; j < 4; j++) {
/* 1164 */           b(☃, j, 6, i, aqe1);
/* 1165 */           b(☃, afi.e.Q(), j, -1, i, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1169 */       a(☃, aqe1, 1, 1, 2, 1);
/*      */       
/* 1171 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class f
/*      */     extends n
/*      */   {
/*      */     public f() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public f(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1185 */       super(☃, i);
/*      */       
/* 1187 */       this.m = cq1;
/* 1188 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     public static f a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int i1) {
/* 1192 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 9, 7, 11, cq1);
/*      */       
/* 1194 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/* 1195 */         return null;
/*      */       }
/*      */       
/* 1198 */       return new f(☃, i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1203 */       if (this.h < 0) {
/* 1204 */         this.h = b(☃, aqe1);
/* 1205 */         if (this.h < 0) {
/* 1206 */           return true;
/*      */         }
/* 1208 */         this.l.a(0, this.h - this.l.e + 7 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1212 */       a(☃, aqe1, 1, 1, 1, 7, 4, 4, afi.a.Q(), afi.a.Q(), false);
/* 1213 */       a(☃, aqe1, 2, 1, 6, 8, 4, 10, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1216 */       a(☃, aqe1, 2, 0, 6, 8, 0, 10, afi.d.Q(), afi.d.Q(), false);
/* 1217 */       a(☃, afi.e.Q(), 6, 0, 6, aqe1);
/*      */       
/* 1219 */       a(☃, aqe1, 2, 1, 6, 2, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
/* 1220 */       a(☃, aqe1, 8, 1, 6, 8, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
/* 1221 */       a(☃, aqe1, 3, 1, 10, 7, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
/*      */ 
/*      */       
/* 1224 */       a(☃, aqe1, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
/* 1225 */       a(☃, aqe1, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
/* 1226 */       a(☃, aqe1, 8, 0, 0, 8, 3, 5, afi.e.Q(), afi.e.Q(), false);
/* 1227 */       a(☃, aqe1, 1, 0, 0, 7, 1, 0, afi.e.Q(), afi.e.Q(), false);
/* 1228 */       a(☃, aqe1, 1, 0, 5, 7, 1, 5, afi.e.Q(), afi.e.Q(), false);
/*      */ 
/*      */       
/* 1231 */       a(☃, aqe1, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
/* 1232 */       a(☃, aqe1, 1, 2, 5, 7, 3, 5, afi.f.Q(), afi.f.Q(), false);
/* 1233 */       a(☃, aqe1, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
/* 1234 */       a(☃, aqe1, 0, 4, 4, 8, 4, 4, afi.f.Q(), afi.f.Q(), false);
/* 1235 */       a(☃, aqe1, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
/* 1236 */       a(☃, afi.f.Q(), 0, 4, 2, aqe1);
/* 1237 */       a(☃, afi.f.Q(), 0, 4, 3, aqe1);
/* 1238 */       a(☃, afi.f.Q(), 8, 4, 2, aqe1);
/* 1239 */       a(☃, afi.f.Q(), 8, 4, 3, aqe1);
/*      */       
/* 1241 */       int i = a(afi.ad, 3);
/* 1242 */       int j = a(afi.ad, 2); int k;
/* 1243 */       for (k = -1; k <= 2; k++) {
/* 1244 */         for (int m = 0; m <= 8; m++) {
/* 1245 */           a(☃, afi.ad.a(i), m, 4 + k, k, aqe1);
/* 1246 */           a(☃, afi.ad.a(j), m, 4 + k, 5 - k, aqe1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1251 */       a(☃, afi.r.Q(), 0, 2, 1, aqe1);
/* 1252 */       a(☃, afi.r.Q(), 0, 2, 4, aqe1);
/* 1253 */       a(☃, afi.r.Q(), 8, 2, 1, aqe1);
/* 1254 */       a(☃, afi.r.Q(), 8, 2, 4, aqe1);
/* 1255 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/* 1256 */       a(☃, afi.bj.Q(), 0, 2, 3, aqe1);
/* 1257 */       a(☃, afi.bj.Q(), 8, 2, 2, aqe1);
/* 1258 */       a(☃, afi.bj.Q(), 8, 2, 3, aqe1);
/* 1259 */       a(☃, afi.bj.Q(), 2, 2, 5, aqe1);
/* 1260 */       a(☃, afi.bj.Q(), 3, 2, 5, aqe1);
/* 1261 */       a(☃, afi.bj.Q(), 5, 2, 0, aqe1);
/* 1262 */       a(☃, afi.bj.Q(), 6, 2, 5, aqe1);
/*      */ 
/*      */       
/* 1265 */       a(☃, afi.aO.Q(), 2, 1, 3, aqe1);
/* 1266 */       a(☃, afi.aB.Q(), 2, 2, 3, aqe1);
/* 1267 */       a(☃, afi.f.Q(), 1, 1, 4, aqe1);
/* 1268 */       a(☃, afi.ad.a(a(afi.ad, 3)), 2, 1, 4, aqe1);
/* 1269 */       a(☃, afi.ad.a(a(afi.ad, 1)), 1, 1, 3, aqe1);
/*      */ 
/*      */       
/* 1272 */       a(☃, aqe1, 5, 0, 1, 7, 0, 3, afi.T.Q(), afi.T.Q(), false);
/* 1273 */       a(☃, afi.T.Q(), 6, 1, 1, aqe1);
/* 1274 */       a(☃, afi.T.Q(), 6, 1, 2, aqe1);
/*      */ 
/*      */       
/* 1277 */       a(☃, afi.a.Q(), 2, 1, 0, aqe1);
/* 1278 */       a(☃, afi.a.Q(), 2, 2, 0, aqe1);
/* 1279 */       a(☃, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, aqe1);
/* 1280 */       a(☃, aqe1, random, 2, 1, 0, cq.b(a(afi.ao, 1)));
/* 1281 */       if (a(☃, 2, 0, -1, aqe1).c().t() == arm.a && a(☃, 2, -1, -1, aqe1).c().t() != arm.a) {
/* 1282 */         a(☃, afi.aw.a(a(afi.aw, 3)), 2, 0, -1, aqe1);
/*      */       }
/*      */ 
/*      */       
/* 1286 */       a(☃, afi.a.Q(), 6, 1, 5, aqe1);
/* 1287 */       a(☃, afi.a.Q(), 6, 2, 5, aqe1);
/* 1288 */       a(☃, afi.aa.Q().a(akf.a, this.m.d()), 6, 3, 4, aqe1);
/* 1289 */       a(☃, aqe1, random, 6, 1, 5, cq.b(a(afi.ao, 1)));
/*      */       
/* 1291 */       for (k = 0; k < 5; k++) {
/* 1292 */         for (int m = 0; m < 9; m++) {
/* 1293 */           b(☃, m, 7, k, aqe1);
/* 1294 */           b(☃, afi.e.Q(), m, -1, k, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1298 */       a(☃, aqe1, 4, 1, 2, 2);
/*      */       
/* 1300 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/* 1305 */       if (☃ == 0) {
/* 1306 */         return 4;
/*      */       }
/* 1308 */       return super.c(☃, i);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class m
/*      */     extends n
/*      */   {
/*      */     public m() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public m(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1322 */       super(☃, i);
/*      */       
/* 1324 */       this.m = cq1;
/* 1325 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     public static m a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int i1, cq cq1, int i2) {
/* 1329 */       aqe aqe = aqe.a(i, j, i1, 0, 0, 0, 9, 7, 12, cq1);
/*      */       
/* 1331 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/* 1332 */         return null;
/*      */       }
/*      */       
/* 1335 */       return new m(☃, i2, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1340 */       if (this.h < 0) {
/* 1341 */         this.h = b(☃, aqe1);
/* 1342 */         if (this.h < 0) {
/* 1343 */           return true;
/*      */         }
/* 1345 */         this.l.a(0, this.h - this.l.e + 7 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1349 */       a(☃, aqe1, 1, 1, 1, 7, 4, 4, afi.a.Q(), afi.a.Q(), false);
/* 1350 */       a(☃, aqe1, 2, 1, 6, 8, 4, 10, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1353 */       a(☃, aqe1, 2, 0, 5, 8, 0, 10, afi.f.Q(), afi.f.Q(), false);
/* 1354 */       a(☃, aqe1, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
/* 1355 */       a(☃, aqe1, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
/* 1356 */       a(☃, aqe1, 8, 0, 0, 8, 3, 10, afi.e.Q(), afi.e.Q(), false);
/* 1357 */       a(☃, aqe1, 1, 0, 0, 7, 2, 0, afi.e.Q(), afi.e.Q(), false);
/* 1358 */       a(☃, aqe1, 1, 0, 5, 2, 1, 5, afi.e.Q(), afi.e.Q(), false);
/* 1359 */       a(☃, aqe1, 2, 0, 6, 2, 3, 10, afi.e.Q(), afi.e.Q(), false);
/* 1360 */       a(☃, aqe1, 3, 0, 10, 7, 3, 10, afi.e.Q(), afi.e.Q(), false);
/*      */ 
/*      */       
/* 1363 */       a(☃, aqe1, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
/* 1364 */       a(☃, aqe1, 1, 2, 5, 2, 3, 5, afi.f.Q(), afi.f.Q(), false);
/* 1365 */       a(☃, aqe1, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
/* 1366 */       a(☃, aqe1, 0, 4, 4, 3, 4, 4, afi.f.Q(), afi.f.Q(), false);
/* 1367 */       a(☃, aqe1, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
/* 1368 */       a(☃, afi.f.Q(), 0, 4, 2, aqe1);
/* 1369 */       a(☃, afi.f.Q(), 0, 4, 3, aqe1);
/* 1370 */       a(☃, afi.f.Q(), 8, 4, 2, aqe1);
/* 1371 */       a(☃, afi.f.Q(), 8, 4, 3, aqe1);
/* 1372 */       a(☃, afi.f.Q(), 8, 4, 4, aqe1);
/*      */       
/* 1374 */       int i = a(afi.ad, 3);
/* 1375 */       int j = a(afi.ad, 2); int k;
/* 1376 */       for (k = -1; k <= 2; k++) {
/* 1377 */         for (int i3 = 0; i3 <= 8; i3++) {
/* 1378 */           a(☃, afi.ad.a(i), i3, 4 + k, k, aqe1);
/* 1379 */           if ((k > -1 || i3 <= 1) && (k > 0 || i3 <= 3) && (k > 1 || i3 <= 4 || i3 >= 6)) {
/* 1380 */             a(☃, afi.ad.a(j), i3, 4 + k, 5 - k, aqe1);
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1386 */       a(☃, aqe1, 3, 4, 5, 3, 4, 10, afi.f.Q(), afi.f.Q(), false);
/* 1387 */       a(☃, aqe1, 7, 4, 2, 7, 4, 10, afi.f.Q(), afi.f.Q(), false);
/* 1388 */       a(☃, aqe1, 4, 5, 4, 4, 5, 10, afi.f.Q(), afi.f.Q(), false);
/* 1389 */       a(☃, aqe1, 6, 5, 4, 6, 5, 10, afi.f.Q(), afi.f.Q(), false);
/* 1390 */       a(☃, aqe1, 5, 6, 3, 5, 6, 10, afi.f.Q(), afi.f.Q(), false);
/* 1391 */       k = a(afi.ad, 0); int i1;
/* 1392 */       for (i1 = 4; i1 >= 1; i1--) {
/* 1393 */         a(☃, afi.f.Q(), i1, 2 + i1, 7 - i1, aqe1);
/* 1394 */         for (int i3 = 8 - i1; i3 <= 10; i3++) {
/* 1395 */           a(☃, afi.ad.a(k), i1, 2 + i1, i3, aqe1);
/*      */         }
/*      */       } 
/* 1398 */       i1 = a(afi.ad, 1);
/* 1399 */       a(☃, afi.f.Q(), 6, 6, 3, aqe1);
/* 1400 */       a(☃, afi.f.Q(), 7, 5, 4, aqe1);
/* 1401 */       a(☃, afi.ad.a(i1), 6, 6, 4, aqe1); int i2;
/* 1402 */       for (i2 = 6; i2 <= 8; i2++) {
/* 1403 */         for (int i3 = 5; i3 <= 10; i3++) {
/* 1404 */           a(☃, afi.ad.a(i1), i2, 12 - i2, i3, aqe1);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1409 */       a(☃, afi.r.Q(), 0, 2, 1, aqe1);
/* 1410 */       a(☃, afi.r.Q(), 0, 2, 4, aqe1);
/* 1411 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/* 1412 */       a(☃, afi.bj.Q(), 0, 2, 3, aqe1);
/*      */       
/* 1414 */       a(☃, afi.r.Q(), 4, 2, 0, aqe1);
/* 1415 */       a(☃, afi.bj.Q(), 5, 2, 0, aqe1);
/* 1416 */       a(☃, afi.r.Q(), 6, 2, 0, aqe1);
/*      */       
/* 1418 */       a(☃, afi.r.Q(), 8, 2, 1, aqe1);
/* 1419 */       a(☃, afi.bj.Q(), 8, 2, 2, aqe1);
/* 1420 */       a(☃, afi.bj.Q(), 8, 2, 3, aqe1);
/* 1421 */       a(☃, afi.r.Q(), 8, 2, 4, aqe1);
/* 1422 */       a(☃, afi.f.Q(), 8, 2, 5, aqe1);
/* 1423 */       a(☃, afi.r.Q(), 8, 2, 6, aqe1);
/* 1424 */       a(☃, afi.bj.Q(), 8, 2, 7, aqe1);
/* 1425 */       a(☃, afi.bj.Q(), 8, 2, 8, aqe1);
/* 1426 */       a(☃, afi.r.Q(), 8, 2, 9, aqe1);
/* 1427 */       a(☃, afi.r.Q(), 2, 2, 6, aqe1);
/* 1428 */       a(☃, afi.bj.Q(), 2, 2, 7, aqe1);
/* 1429 */       a(☃, afi.bj.Q(), 2, 2, 8, aqe1);
/* 1430 */       a(☃, afi.r.Q(), 2, 2, 9, aqe1);
/*      */       
/* 1432 */       a(☃, afi.r.Q(), 4, 4, 10, aqe1);
/* 1433 */       a(☃, afi.bj.Q(), 5, 4, 10, aqe1);
/* 1434 */       a(☃, afi.r.Q(), 6, 4, 10, aqe1);
/* 1435 */       a(☃, afi.f.Q(), 5, 5, 10, aqe1);
/*      */ 
/*      */       
/* 1438 */       a(☃, afi.a.Q(), 2, 1, 0, aqe1);
/* 1439 */       a(☃, afi.a.Q(), 2, 2, 0, aqe1);
/* 1440 */       a(☃, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, aqe1);
/* 1441 */       a(☃, aqe1, random, 2, 1, 0, cq.b(a(afi.ao, 1)));
/* 1442 */       a(☃, aqe1, 1, 0, -1, 3, 2, -1, afi.a.Q(), afi.a.Q(), false);
/* 1443 */       if (a(☃, 2, 0, -1, aqe1).c().t() == arm.a && a(☃, 2, -1, -1, aqe1).c().t() != arm.a) {
/* 1444 */         a(☃, afi.aw.a(a(afi.aw, 3)), 2, 0, -1, aqe1);
/*      */       }
/*      */       
/* 1447 */       for (i2 = 0; i2 < 5; i2++) {
/* 1448 */         for (int i3 = 0; i3 < 9; i3++) {
/* 1449 */           b(☃, i3, 7, i2, aqe1);
/* 1450 */           b(☃, afi.e.Q(), i3, -1, i2, aqe1);
/*      */         } 
/*      */       } 
/* 1453 */       for (i2 = 5; i2 < 11; i2++) {
/* 1454 */         for (int i3 = 2; i3 < 9; i3++) {
/* 1455 */           b(☃, i3, 7, i2, aqe1);
/* 1456 */           b(☃, afi.e.Q(), i3, -1, i2, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1460 */       a(☃, aqe1, 4, 1, 2, 2);
/*      */       
/* 1462 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class j
/*      */     extends n {
/* 1468 */     private static final List<ob> a = Lists.newArrayList((Object[])new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zw.a(afi.Z), 0, 3, 7, 5), new ob(zw.a(afi.g), 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private boolean b;
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
/*      */     public j() {}
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
/*      */     public j(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1501 */       super(☃, i);
/*      */       
/* 1503 */       this.m = cq1;
/* 1504 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     public static j a(aqw.k ☃, List<aqt> list, Random random, int i, int m, int i1, cq cq1, int i2) {
/* 1508 */       aqe aqe = aqe.a(i, m, i1, 0, 0, 0, 10, 6, 7, cq1);
/*      */       
/* 1510 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/* 1511 */         return null;
/*      */       }
/*      */       
/* 1514 */       return new j(☃, i2, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1519 */       super.a(☃);
/* 1520 */       ☃.a("Chest", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1525 */       super.b(☃);
/* 1526 */       this.b = ☃.n("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1531 */       if (this.h < 0) {
/* 1532 */         this.h = b(☃, aqe1);
/* 1533 */         if (this.h < 0) {
/* 1534 */           return true;
/*      */         }
/* 1536 */         this.l.a(0, this.h - this.l.e + 6 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1540 */       a(☃, aqe1, 0, 1, 0, 9, 4, 6, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1543 */       a(☃, aqe1, 0, 0, 0, 9, 0, 6, afi.e.Q(), afi.e.Q(), false);
/*      */ 
/*      */       
/* 1546 */       a(☃, aqe1, 0, 4, 0, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
/* 1547 */       a(☃, aqe1, 0, 5, 0, 9, 5, 6, afi.U.Q(), afi.U.Q(), false);
/* 1548 */       a(☃, aqe1, 1, 5, 1, 8, 5, 5, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1551 */       a(☃, aqe1, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
/* 1552 */       a(☃, aqe1, 0, 1, 0, 0, 4, 0, afi.r.Q(), afi.r.Q(), false);
/* 1553 */       a(☃, aqe1, 3, 1, 0, 3, 4, 0, afi.r.Q(), afi.r.Q(), false);
/* 1554 */       a(☃, aqe1, 0, 1, 6, 0, 4, 6, afi.r.Q(), afi.r.Q(), false);
/* 1555 */       a(☃, afi.f.Q(), 3, 3, 1, aqe1);
/* 1556 */       a(☃, aqe1, 3, 1, 2, 3, 3, 2, afi.f.Q(), afi.f.Q(), false);
/* 1557 */       a(☃, aqe1, 4, 1, 3, 5, 3, 3, afi.f.Q(), afi.f.Q(), false);
/* 1558 */       a(☃, aqe1, 0, 1, 1, 0, 3, 5, afi.f.Q(), afi.f.Q(), false);
/* 1559 */       a(☃, aqe1, 1, 1, 6, 5, 3, 6, afi.f.Q(), afi.f.Q(), false);
/*      */ 
/*      */       
/* 1562 */       a(☃, aqe1, 5, 1, 0, 5, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
/* 1563 */       a(☃, aqe1, 9, 1, 0, 9, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
/*      */ 
/*      */       
/* 1566 */       a(☃, aqe1, 6, 1, 4, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
/* 1567 */       a(☃, afi.k.Q(), 7, 1, 5, aqe1);
/* 1568 */       a(☃, afi.k.Q(), 8, 1, 5, aqe1);
/* 1569 */       a(☃, afi.bi.Q(), 9, 2, 5, aqe1);
/* 1570 */       a(☃, afi.bi.Q(), 9, 2, 4, aqe1);
/* 1571 */       a(☃, aqe1, 7, 2, 4, 8, 2, 5, afi.a.Q(), afi.a.Q(), false);
/* 1572 */       a(☃, afi.e.Q(), 6, 1, 3, aqe1);
/* 1573 */       a(☃, afi.al.Q(), 6, 2, 3, aqe1);
/* 1574 */       a(☃, afi.al.Q(), 6, 3, 3, aqe1);
/* 1575 */       a(☃, afi.T.Q(), 8, 1, 1, aqe1);
/*      */ 
/*      */       
/* 1578 */       a(☃, afi.bj.Q(), 0, 2, 2, aqe1);
/* 1579 */       a(☃, afi.bj.Q(), 0, 2, 4, aqe1);
/* 1580 */       a(☃, afi.bj.Q(), 2, 2, 6, aqe1);
/* 1581 */       a(☃, afi.bj.Q(), 4, 2, 6, aqe1);
/*      */ 
/*      */       
/* 1584 */       a(☃, afi.aO.Q(), 2, 1, 4, aqe1);
/* 1585 */       a(☃, afi.aB.Q(), 2, 2, 4, aqe1);
/* 1586 */       a(☃, afi.f.Q(), 1, 1, 5, aqe1);
/* 1587 */       a(☃, afi.ad.a(a(afi.ad, 3)), 2, 1, 5, aqe1);
/* 1588 */       a(☃, afi.ad.a(a(afi.ad, 1)), 1, 1, 4, aqe1);
/*      */       
/* 1590 */       if (!this.b && 
/* 1591 */         aqe1.b(new cj(a(5, 5), d(1), b(5, 5)))) {
/* 1592 */         this.b = true;
/* 1593 */         a(☃, aqe1, random, 5, 1, 5, a, 3 + random.nextInt(6));
/*      */       } 
/*      */       
/*      */       int i;
/*      */       
/* 1598 */       for (i = 6; i <= 8; i++) {
/* 1599 */         if (a(☃, i, 0, -1, aqe1).c().t() == arm.a && a(☃, i, -1, -1, aqe1).c().t() != arm.a) {
/* 1600 */           a(☃, afi.aw.a(a(afi.aw, 3)), i, 0, -1, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1604 */       for (i = 0; i < 7; i++) {
/* 1605 */         for (int k = 0; k < 10; k++) {
/* 1606 */           b(☃, k, 6, i, aqe1);
/* 1607 */           b(☃, afi.e.Q(), k, -1, i, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1611 */       a(☃, aqe1, 7, 1, 1, 1);
/*      */       
/* 1613 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected int c(int ☃, int i) {
/* 1618 */       return 3;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends n
/*      */   {
/*      */     private afh a;
/*      */     
/*      */     private afh b;
/*      */ 
/*      */     
/*      */     public c() {}
/*      */ 
/*      */     
/*      */     public c(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1635 */       super(☃, i);
/*      */       
/* 1637 */       this.m = cq1;
/* 1638 */       this.l = aqe1;
/*      */       
/* 1640 */       this.a = a(random);
/* 1641 */       this.b = a(random);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1646 */       super.a(☃);
/* 1647 */       ☃.a("CA", afh.c.b(this.a));
/* 1648 */       ☃.a("CB", afh.c.b(this.b));
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1653 */       super.b(☃);
/* 1654 */       this.a = afh.c(☃.f("CA"));
/* 1655 */       this.b = afh.c(☃.f("CB"));
/*      */     }
/*      */     
/*      */     private afh a(Random ☃) {
/* 1659 */       switch (☃.nextInt(5))
/*      */       { default:
/* 1661 */           return afi.aj;
/*      */         case 0:
/* 1663 */           return afi.cb;
/*      */         case 1:
/* 1665 */           break; }  return afi.cc;
/*      */     }
/*      */ 
/*      */     
/*      */     public static c a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int i1) {
/* 1670 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 7, 4, 9, cq1);
/*      */       
/* 1672 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/* 1673 */         return null;
/*      */       }
/*      */       
/* 1676 */       return new c(☃, i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1681 */       if (this.h < 0) {
/* 1682 */         this.h = b(☃, aqe1);
/* 1683 */         if (this.h < 0) {
/* 1684 */           return true;
/*      */         }
/* 1686 */         this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1690 */       a(☃, aqe1, 0, 1, 0, 6, 4, 8, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1693 */       a(☃, aqe1, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
/* 1694 */       a(☃, aqe1, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
/*      */       
/* 1696 */       a(☃, aqe1, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
/* 1697 */       a(☃, aqe1, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
/* 1698 */       a(☃, aqe1, 1, 0, 0, 5, 0, 0, afi.r.Q(), afi.r.Q(), false);
/* 1699 */       a(☃, aqe1, 1, 0, 8, 5, 0, 8, afi.r.Q(), afi.r.Q(), false);
/*      */       
/* 1701 */       a(☃, aqe1, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
/*      */       int i;
/* 1703 */       for (i = 1; i <= 7; i++) {
/* 1704 */         a(☃, this.a.a(ns.a(random, 2, 7)), 1, 1, i, aqe1);
/* 1705 */         a(☃, this.a.a(ns.a(random, 2, 7)), 2, 1, i, aqe1);
/* 1706 */         a(☃, this.b.a(ns.a(random, 2, 7)), 4, 1, i, aqe1);
/* 1707 */         a(☃, this.b.a(ns.a(random, 2, 7)), 5, 1, i, aqe1);
/*      */       } 
/*      */       
/* 1710 */       for (i = 0; i < 9; i++) {
/* 1711 */         for (int j = 0; j < 7; j++) {
/* 1712 */           b(☃, j, 4, i, aqe1);
/* 1713 */           b(☃, afi.d.Q(), j, -1, i, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1717 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends n
/*      */   {
/*      */     private afh a;
/*      */     
/*      */     private afh b;
/*      */     
/*      */     private afh c;
/*      */     
/*      */     private afh d;
/*      */     
/*      */     public b() {}
/*      */     
/*      */     public b(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1736 */       super(☃, i);
/*      */       
/* 1738 */       this.m = cq1;
/* 1739 */       this.l = aqe1;
/*      */       
/* 1741 */       this.a = a(random);
/* 1742 */       this.b = a(random);
/* 1743 */       this.c = a(random);
/* 1744 */       this.d = a(random);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1749 */       super.a(☃);
/* 1750 */       ☃.a("CA", afh.c.b(this.a));
/* 1751 */       ☃.a("CB", afh.c.b(this.b));
/* 1752 */       ☃.a("CC", afh.c.b(this.c));
/* 1753 */       ☃.a("CD", afh.c.b(this.d));
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1758 */       super.b(☃);
/* 1759 */       this.a = afh.c(☃.f("CA"));
/* 1760 */       this.b = afh.c(☃.f("CB"));
/* 1761 */       this.c = afh.c(☃.f("CC"));
/* 1762 */       this.d = afh.c(☃.f("CD"));
/*      */     }
/*      */     
/*      */     private afh a(Random ☃) {
/* 1766 */       switch (☃.nextInt(5))
/*      */       { default:
/* 1768 */           return afi.aj;
/*      */         case 0:
/* 1770 */           return afi.cb;
/*      */         case 1:
/* 1772 */           break; }  return afi.cc;
/*      */     }
/*      */ 
/*      */     
/*      */     public static b a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int i1) {
/* 1777 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 13, 4, 9, cq1);
/*      */       
/* 1779 */       if (!a(aqe) || aqt.a(list, aqe) != null) {
/* 1780 */         return null;
/*      */       }
/*      */       
/* 1783 */       return new b(☃, i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1788 */       if (this.h < 0) {
/* 1789 */         this.h = b(☃, aqe1);
/* 1790 */         if (this.h < 0) {
/* 1791 */           return true;
/*      */         }
/* 1793 */         this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1797 */       a(☃, aqe1, 0, 1, 0, 12, 4, 8, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1800 */       a(☃, aqe1, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
/* 1801 */       a(☃, aqe1, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
/* 1802 */       a(☃, aqe1, 7, 0, 1, 8, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
/* 1803 */       a(☃, aqe1, 10, 0, 1, 11, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
/*      */       
/* 1805 */       a(☃, aqe1, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
/* 1806 */       a(☃, aqe1, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
/* 1807 */       a(☃, aqe1, 12, 0, 0, 12, 0, 8, afi.r.Q(), afi.r.Q(), false);
/* 1808 */       a(☃, aqe1, 1, 0, 0, 11, 0, 0, afi.r.Q(), afi.r.Q(), false);
/* 1809 */       a(☃, aqe1, 1, 0, 8, 11, 0, 8, afi.r.Q(), afi.r.Q(), false);
/*      */       
/* 1811 */       a(☃, aqe1, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
/* 1812 */       a(☃, aqe1, 9, 0, 1, 9, 0, 7, afi.j.Q(), afi.j.Q(), false);
/*      */       int i;
/* 1814 */       for (i = 1; i <= 7; i++) {
/* 1815 */         a(☃, this.a.a(ns.a(random, 2, 7)), 1, 1, i, aqe1);
/* 1816 */         a(☃, this.a.a(ns.a(random, 2, 7)), 2, 1, i, aqe1);
/* 1817 */         a(☃, this.b.a(ns.a(random, 2, 7)), 4, 1, i, aqe1);
/* 1818 */         a(☃, this.b.a(ns.a(random, 2, 7)), 5, 1, i, aqe1);
/* 1819 */         a(☃, this.c.a(ns.a(random, 2, 7)), 7, 1, i, aqe1);
/* 1820 */         a(☃, this.c.a(ns.a(random, 2, 7)), 8, 1, i, aqe1);
/* 1821 */         a(☃, this.d.a(ns.a(random, 2, 7)), 10, 1, i, aqe1);
/* 1822 */         a(☃, this.d.a(ns.a(random, 2, 7)), 11, 1, i, aqe1);
/*      */       } 
/*      */       
/* 1825 */       for (i = 0; i < 9; i++) {
/* 1826 */         for (int j = 0; j < 13; j++) {
/* 1827 */           b(☃, j, 4, i, aqe1);
/* 1828 */           b(☃, afi.d.Q(), j, -1, i, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1832 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends n
/*      */   {
/*      */     public d() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public d(aqw.k ☃, int i, Random random, aqe aqe1, cq cq1) {
/* 1846 */       super(☃, i);
/*      */       
/* 1848 */       this.m = cq1;
/* 1849 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     public static aqe a(aqw.k ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1) {
/* 1853 */       aqe aqe = aqe.a(i, j, m, 0, 0, 0, 3, 4, 2, cq1);
/*      */       
/* 1855 */       if (aqt.a(list, aqe) != null) {
/* 1856 */         return null;
/*      */       }
/*      */       
/* 1859 */       return aqe;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1864 */       if (this.h < 0) {
/* 1865 */         this.h = b(☃, aqe1);
/* 1866 */         if (this.h < 0) {
/* 1867 */           return true;
/*      */         }
/* 1869 */         this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*      */       } 
/*      */ 
/*      */       
/* 1873 */       a(☃, aqe1, 0, 0, 0, 2, 3, 1, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1876 */       a(☃, afi.aO.Q(), 1, 0, 0, aqe1);
/* 1877 */       a(☃, afi.aO.Q(), 1, 1, 0, aqe1);
/* 1878 */       a(☃, afi.aO.Q(), 1, 2, 0, aqe1);
/*      */ 
/*      */       
/* 1881 */       a(☃, afi.L.a(zd.a.b()), 1, 3, 0, aqe1);
/*      */ 
/*      */       
/* 1884 */       boolean bool = (this.m == cq.f || this.m == cq.c);
/* 1885 */       a(☃, afi.aa.Q().a(akf.a, this.m.e()), bool ? 2 : 0, 3, 0, aqe1);
/* 1886 */       a(☃, afi.aa.Q().a(akf.a, this.m), 1, 3, 1, aqe1);
/* 1887 */       a(☃, afi.aa.Q().a(akf.a, this.m.f()), bool ? 0 : 2, 3, 0, aqe1);
/* 1888 */       a(☃, afi.aa.Q().a(akf.a, this.m.d()), 1, 3, -1, aqe1);
/*      */       
/* 1890 */       return true;
/*      */     }
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */