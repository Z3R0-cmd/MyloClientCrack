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
/*      */ public class aqp
/*      */ {
/*      */   public static void a() {
/*   31 */     aqr.a((Class)a.class, "SHCC");
/*   32 */     aqr.a((Class)b.class, "SHFC");
/*   33 */     aqr.a((Class)c.class, "SH5C");
/*   34 */     aqr.a((Class)d.class, "SHLT");
/*   35 */     aqr.a((Class)e.class, "SHLi");
/*   36 */     aqr.a((Class)g.class, "SHPR");
/*   37 */     aqr.a((Class)h.class, "SHPH");
/*   38 */     aqr.a((Class)i.class, "SHRT");
/*   39 */     aqr.a((Class)j.class, "SHRC");
/*   40 */     aqr.a((Class)l.class, "SHSD");
/*   41 */     aqr.a((Class)m.class, "SHStart");
/*   42 */     aqr.a((Class)n.class, "SHS");
/*   43 */     aqr.a((Class)o.class, "SHSSD");
/*      */   }
/*      */   
/*      */   static class f {
/*      */     public Class<? extends aqp.p> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public int d;
/*      */     
/*      */     public f(Class<? extends aqp.p> ☃, int i, int j) {
/*   53 */       this.a = ☃;
/*   54 */       this.b = i;
/*   55 */       this.d = j;
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   59 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   63 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*   68 */   private static final f[] b = new f[] { new f((Class)n.class, 40, 0), new f((Class)h.class, 5, 5), new f((Class)d.class, 20, 0), new f((Class)i.class, 20, 0), new f((Class)j.class, 10, 6), new f((Class)o.class, 5, 5), new f((Class)l.class, 5, 5), new f((Class)c.class, 5, 4), new f((Class)a.class, 5, 4), new f(e.class, 10, 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public boolean a(int ☃)
/*      */         {
/*   81 */           return (super.a(☃) && ☃ > 4);
/*      */         }
/*      */       }, 
/*      */       new f(g.class, 20, 1)
/*      */       {
/*      */         public boolean a(int ☃) {
/*   87 */           return (super.a(☃) && ☃ > 5);
/*      */         }
/*      */       } };
/*      */ 
/*      */   
/*      */   private static List<f> c;
/*      */   private static Class<? extends p> d;
/*      */   static int a;
/*      */   
/*      */   public static void b() {
/*   97 */     c = Lists.newArrayList(); f[] ☃; int i, j;
/*   98 */     for (☃ = b, i = ☃.length, j = 0; j < i; ) { f f1 = ☃[j];
/*   99 */       f1.c = 0;
/*  100 */       c.add(f1); j++; }
/*      */     
/*  102 */     d = null;
/*      */   }
/*      */   
/*      */   private static boolean d() {
/*  106 */     boolean ☃ = false;
/*  107 */     a = 0;
/*  108 */     for (Iterator<f> iterator = c.iterator(); iterator.hasNext(); ) { f f1 = iterator.next();
/*  109 */       if (f1.d > 0 && f1.c < f1.d) {
/*  110 */         ☃ = true;
/*      */       }
/*  112 */       a += f1.b; }
/*      */     
/*  114 */     return ☃;
/*      */   }
/*      */   
/*      */   private static p a(Class<? extends p> ☃, List<aqt> list, Random random, int i, int j, int m, cq cq1, int n) {
/*  118 */     p p = null;
/*      */     
/*  120 */     if (☃ == n.class) {
/*  121 */       p = n.a(list, random, i, j, m, cq1, n);
/*  122 */     } else if (☃ == h.class) {
/*  123 */       p = h.a(list, random, i, j, m, cq1, n);
/*  124 */     } else if (☃ == d.class) {
/*  125 */       p = d.a(list, random, i, j, m, cq1, n);
/*  126 */     } else if (☃ == i.class) {
/*  127 */       p = i.a(list, random, i, j, m, cq1, n);
/*  128 */     } else if (☃ == j.class) {
/*  129 */       p = j.a(list, random, i, j, m, cq1, n);
/*  130 */     } else if (☃ == o.class) {
/*  131 */       p = o.a(list, random, i, j, m, cq1, n);
/*  132 */     } else if (☃ == l.class) {
/*  133 */       p = l.a(list, random, i, j, m, cq1, n);
/*  134 */     } else if (☃ == c.class) {
/*  135 */       p = c.a(list, random, i, j, m, cq1, n);
/*  136 */     } else if (☃ == a.class) {
/*  137 */       p = a.a(list, random, i, j, m, cq1, n);
/*  138 */     } else if (☃ == e.class) {
/*  139 */       p = e.a(list, random, i, j, m, cq1, n);
/*  140 */     } else if (☃ == g.class) {
/*  141 */       p = g.a(list, random, i, j, m, cq1, n);
/*      */     } 
/*      */     
/*  144 */     return p;
/*      */   }
/*      */   
/*      */   private static p b(m ☃, List<aqt> list, Random random, int i, int j, int n, cq cq1, int i1) {
/*  148 */     if (!d()) {
/*  149 */       return null;
/*      */     }
/*      */     
/*  152 */     if (d != null) {
/*  153 */       p p = a(d, list, random, i, j, n, cq1, i1);
/*  154 */       d = null;
/*      */       
/*  156 */       if (p != null) {
/*  157 */         return p;
/*      */       }
/*      */     } 
/*      */     
/*  161 */     int i2 = 0;
/*  162 */     while (i2 < 5) {
/*  163 */       i2++;
/*      */       
/*  165 */       int i3 = random.nextInt(a);
/*  166 */       for (Iterator<f> iterator = c.iterator(); iterator.hasNext(); ) { f f1 = iterator.next();
/*  167 */         i3 -= f1.b;
/*  168 */         if (i3 < 0) {
/*  169 */           if (!f1.a(i1) || f1 == ☃.a) {
/*      */             break;
/*      */           }
/*      */           
/*  173 */           p p = a(f1.a, list, random, i, j, n, cq1, i1);
/*  174 */           if (p != null) {
/*  175 */             f1.c++;
/*  176 */             ☃.a = f1;
/*      */             
/*  178 */             if (!f1.a()) {
/*  179 */               c.remove(f1);
/*      */             }
/*  181 */             return p;
/*      */           } 
/*      */         }  }
/*      */     
/*      */     } 
/*  186 */     aqe aqe = b.a(list, random, i, j, n, cq1);
/*  187 */     if (aqe != null && aqe.b > 1) {
/*  188 */       return new b(i1, random, aqe, cq1);
/*      */     }
/*      */     
/*  191 */     return null;
/*      */   }
/*      */   
/*      */   private static aqt c(m ☃, List<aqt> list, Random random, int i, int j, int n, cq cq1, int i1) {
/*  195 */     if (i1 > 50) {
/*  196 */       return null;
/*      */     }
/*  198 */     if (Math.abs(i - (☃.c()).a) > 112 || Math.abs(n - (☃.c()).c) > 112) {
/*  199 */       return null;
/*      */     }
/*      */     
/*  202 */     aqt aqt = b(☃, list, random, i, j, n, cq1, i1 + 1);
/*  203 */     if (aqt != null) {
/*  204 */       list.add(aqt);
/*  205 */       ☃.c.add(aqt);
/*      */     } 
/*  207 */     return aqt;
/*      */   }
/*      */   
/*      */   static abstract class p extends aqt {
/*  211 */     protected a d = a.a;
/*      */ 
/*      */     
/*      */     public p() {}
/*      */ 
/*      */     
/*      */     protected p(int ☃) {
/*  218 */       super(☃);
/*      */     }
/*      */     
/*      */     public enum a {
/*  222 */       a, b, c, d;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  227 */       ☃.a("EntryDoor", this.d.name());
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  232 */       this.d = a.valueOf(☃.j("EntryDoor"));
/*      */     }
/*      */     
/*      */     protected void a(adm ☃, Random random, aqe aqe1, a a1, int i, int j, int k) {
/*  236 */       switch (aqp.null.a[a1.ordinal()]) {
/*      */         
/*      */         default:
/*  239 */           a(☃, aqe1, i, j, k, i + 3 - 1, j + 3 - 1, k, afi.a.Q(), afi.a.Q(), false);
/*      */           return;
/*      */         case 2:
/*  242 */           a(☃, afi.bf.Q(), i, j, k, aqe1);
/*  243 */           a(☃, afi.bf.Q(), i, j + 1, k, aqe1);
/*  244 */           a(☃, afi.bf.Q(), i, j + 2, k, aqe1);
/*  245 */           a(☃, afi.bf.Q(), i + 1, j + 2, k, aqe1);
/*  246 */           a(☃, afi.bf.Q(), i + 2, j + 2, k, aqe1);
/*  247 */           a(☃, afi.bf.Q(), i + 2, j + 1, k, aqe1);
/*  248 */           a(☃, afi.bf.Q(), i + 2, j, k, aqe1);
/*  249 */           a(☃, afi.ao.Q(), i + 1, j, k, aqe1);
/*  250 */           a(☃, afi.ao.a(8), i + 1, j + 1, k, aqe1);
/*      */           return;
/*      */         case 3:
/*  253 */           a(☃, afi.a.Q(), i + 1, j, k, aqe1);
/*  254 */           a(☃, afi.a.Q(), i + 1, j + 1, k, aqe1);
/*  255 */           a(☃, afi.bi.Q(), i, j, k, aqe1);
/*  256 */           a(☃, afi.bi.Q(), i, j + 1, k, aqe1);
/*  257 */           a(☃, afi.bi.Q(), i, j + 2, k, aqe1);
/*  258 */           a(☃, afi.bi.Q(), i + 1, j + 2, k, aqe1);
/*  259 */           a(☃, afi.bi.Q(), i + 2, j + 2, k, aqe1);
/*  260 */           a(☃, afi.bi.Q(), i + 2, j + 1, k, aqe1);
/*  261 */           a(☃, afi.bi.Q(), i + 2, j, k, aqe1); return;
/*      */         case 4:
/*      */           break;
/*  264 */       }  a(☃, afi.bf.Q(), i, j, k, aqe1);
/*  265 */       a(☃, afi.bf.Q(), i, j + 1, k, aqe1);
/*  266 */       a(☃, afi.bf.Q(), i, j + 2, k, aqe1);
/*  267 */       a(☃, afi.bf.Q(), i + 1, j + 2, k, aqe1);
/*  268 */       a(☃, afi.bf.Q(), i + 2, j + 2, k, aqe1);
/*  269 */       a(☃, afi.bf.Q(), i + 2, j + 1, k, aqe1);
/*  270 */       a(☃, afi.bf.Q(), i + 2, j, k, aqe1);
/*  271 */       a(☃, afi.aA.Q(), i + 1, j, k, aqe1);
/*  272 */       a(☃, afi.aA.a(8), i + 1, j + 1, k, aqe1);
/*  273 */       a(☃, afi.aG.a(a(afi.aG, 4)), i + 2, j + 1, k + 1, aqe1);
/*  274 */       a(☃, afi.aG.a(a(afi.aG, 3)), i + 2, j + 1, k - 1, aqe1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected a a(Random ☃) {
/*  280 */       int i = ☃.nextInt(5);
/*  281 */       switch (i)
/*      */       
/*      */       { 
/*      */         default:
/*  285 */           return a.a;
/*      */         case 2:
/*  287 */           return a.b;
/*      */         case 3:
/*  289 */           return a.c;
/*      */         case 4:
/*  291 */           break; }  return a.d;
/*      */     }
/*      */ 
/*      */     
/*      */     protected aqt a(aqp.m ☃, List<aqt> list, Random random, int i, int j) {
/*  296 */       if (this.m != null) {
/*  297 */         switch (aqp.null.b[this.m.ordinal()]) {
/*      */           case 1:
/*  299 */             return aqp.a(☃, list, random, this.l.a + i, this.l.b + j, this.l.c - 1, this.m, d());
/*      */           case 2:
/*  301 */             return aqp.a(☃, list, random, this.l.a + i, this.l.b + j, this.l.f + 1, this.m, d());
/*      */           case 3:
/*  303 */             return aqp.a(☃, list, random, this.l.a - 1, this.l.b + j, this.l.c + i, this.m, d());
/*      */           case 4:
/*  305 */             return aqp.a(☃, list, random, this.l.d + 1, this.l.b + j, this.l.c + i, this.m, d());
/*      */         } 
/*      */       }
/*  308 */       return null;
/*      */     }
/*      */     
/*      */     protected aqt b(aqp.m ☃, List<aqt> list, Random random, int i, int j) {
/*  312 */       if (this.m != null) {
/*  313 */         switch (aqp.null.b[this.m.ordinal()]) {
/*      */           case 1:
/*  315 */             return aqp.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*      */           case 2:
/*  317 */             return aqp.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*      */           case 3:
/*  319 */             return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*      */           case 4:
/*  321 */             return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*      */         } 
/*      */       }
/*  324 */       return null;
/*      */     }
/*      */     
/*      */     protected aqt c(aqp.m ☃, List<aqt> list, Random random, int i, int j) {
/*  328 */       if (this.m != null) {
/*  329 */         switch (aqp.null.b[this.m.ordinal()]) {
/*      */           case 1:
/*  331 */             return aqp.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*      */           case 2:
/*  333 */             return aqp.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*      */           case 3:
/*  335 */             return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*      */           case 4:
/*  337 */             return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*      */         } 
/*      */       }
/*  340 */       return null;
/*      */     }
/*      */     
/*      */     protected static boolean a(aqe ☃) {
/*  344 */       return (☃ != null && ☃.b > 10);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends p
/*      */   {
/*      */     private int a;
/*      */ 
/*      */     
/*      */     public b() {}
/*      */ 
/*      */     
/*      */     public b(int ☃, Random random, aqe aqe1, cq cq1) {
/*  359 */       super(☃);
/*      */       
/*  361 */       this.m = cq1;
/*  362 */       this.l = aqe1;
/*  363 */       this.a = (cq1 == cq.c || cq1 == cq.d) ? aqe1.e() : aqe1.c();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  368 */       super.a(☃);
/*  369 */       ☃.a("Steps", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  374 */       super.b(☃);
/*  375 */       this.a = ☃.f("Steps");
/*      */     }
/*      */     
/*      */     public static aqe a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1) {
/*  379 */       int m = 3;
/*      */       
/*  381 */       aqe aqe = aqe.a(i, j, k, -1, -1, 0, 5, 5, 4, cq1);
/*      */       
/*  383 */       aqt aqt = aqt.a(☃, aqe);
/*  384 */       if (aqt == null)
/*      */       {
/*  386 */         return null;
/*      */       }
/*      */       
/*  389 */       if ((aqt.c()).b == aqe.b)
/*      */       {
/*  391 */         for (int n = 3; n >= 1; n--) {
/*  392 */           aqe = aqe.a(i, j, k, -1, -1, 0, 5, 5, n - 1, cq1);
/*  393 */           if (!aqt.c().a(aqe))
/*      */           {
/*      */             
/*  396 */             return aqe.a(i, j, k, -1, -1, 0, 5, 5, n, cq1);
/*      */           }
/*      */         } 
/*      */       }
/*      */       
/*  401 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  406 */       if (a(☃, aqe1)) {
/*  407 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  411 */       for (int i = 0; i < this.a; i++) {
/*      */         
/*  413 */         a(☃, afi.bf.Q(), 0, 0, i, aqe1);
/*  414 */         a(☃, afi.bf.Q(), 1, 0, i, aqe1);
/*  415 */         a(☃, afi.bf.Q(), 2, 0, i, aqe1);
/*  416 */         a(☃, afi.bf.Q(), 3, 0, i, aqe1);
/*  417 */         a(☃, afi.bf.Q(), 4, 0, i, aqe1);
/*      */         
/*  419 */         for (int j = 1; j <= 3; j++) {
/*  420 */           a(☃, afi.bf.Q(), 0, j, i, aqe1);
/*  421 */           a(☃, afi.a.Q(), 1, j, i, aqe1);
/*  422 */           a(☃, afi.a.Q(), 2, j, i, aqe1);
/*  423 */           a(☃, afi.a.Q(), 3, j, i, aqe1);
/*  424 */           a(☃, afi.bf.Q(), 4, j, i, aqe1);
/*      */         } 
/*      */         
/*  427 */         a(☃, afi.bf.Q(), 0, 4, i, aqe1);
/*  428 */         a(☃, afi.bf.Q(), 1, 4, i, aqe1);
/*  429 */         a(☃, afi.bf.Q(), 2, 4, i, aqe1);
/*  430 */         a(☃, afi.bf.Q(), 3, 4, i, aqe1);
/*  431 */         a(☃, afi.bf.Q(), 4, 4, i, aqe1);
/*      */       } 
/*      */       
/*  434 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public l() {}
/*      */ 
/*      */     
/*      */     public l(int ☃, Random random, int i, int j) {
/*  450 */       super(☃);
/*      */       
/*  452 */       this.a = true;
/*  453 */       this.m = cq.c.a.a(random);
/*  454 */       this.d = aqp.p.a.a;
/*      */       
/*  456 */       switch (aqp.null.b[this.m.ordinal()]) {
/*      */         case 1:
/*      */         case 2:
/*  459 */           this.l = new aqe(i, 64, j, i + 5 - 1, 74, j + 5 - 1);
/*      */           return;
/*      */       } 
/*  462 */       this.l = new aqe(i, 64, j, i + 5 - 1, 74, j + 5 - 1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public l(int ☃, Random random, aqe aqe1, cq cq1) {
/*  468 */       super(☃);
/*      */       
/*  470 */       this.a = false;
/*  471 */       this.m = cq1;
/*  472 */       this.d = a(random);
/*  473 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  478 */       super.a(☃);
/*  479 */       ☃.a("Source", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  484 */       super.b(☃);
/*  485 */       this.a = ☃.n("Source");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  490 */       if (this.a)
/*      */       {
/*  492 */         aqp.a(aqp.c.class);
/*      */       }
/*  494 */       a((aqp.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static l a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/*  498 */       aqe aqe = aqe.a(i, j, k, -1, -7, 0, 5, 11, 5, cq1);
/*      */       
/*  500 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  501 */         return null;
/*      */       }
/*      */       
/*  504 */       return new l(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  509 */       if (a(☃, aqe1)) {
/*  510 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  514 */       a(☃, aqe1, 0, 0, 0, 4, 10, 4, true, random, aqp.c());
/*      */       
/*  516 */       a(☃, random, aqe1, this.d, 1, 7, 0);
/*      */       
/*  518 */       a(☃, random, aqe1, aqp.p.a.a, 1, 1, 4);
/*      */ 
/*      */       
/*  521 */       a(☃, afi.bf.Q(), 2, 6, 1, aqe1);
/*  522 */       a(☃, afi.bf.Q(), 1, 5, 1, aqe1);
/*  523 */       a(☃, afi.U.a(akb.a.a.a()), 1, 6, 1, aqe1);
/*  524 */       a(☃, afi.bf.Q(), 1, 5, 2, aqe1);
/*  525 */       a(☃, afi.bf.Q(), 1, 4, 3, aqe1);
/*  526 */       a(☃, afi.U.a(akb.a.a.a()), 1, 5, 3, aqe1);
/*  527 */       a(☃, afi.bf.Q(), 2, 4, 3, aqe1);
/*  528 */       a(☃, afi.bf.Q(), 3, 3, 3, aqe1);
/*  529 */       a(☃, afi.U.a(akb.a.a.a()), 3, 4, 3, aqe1);
/*  530 */       a(☃, afi.bf.Q(), 3, 3, 2, aqe1);
/*  531 */       a(☃, afi.bf.Q(), 3, 2, 1, aqe1);
/*  532 */       a(☃, afi.U.a(akb.a.a.a()), 3, 3, 1, aqe1);
/*  533 */       a(☃, afi.bf.Q(), 2, 2, 1, aqe1);
/*  534 */       a(☃, afi.bf.Q(), 1, 1, 1, aqe1);
/*  535 */       a(☃, afi.U.a(akb.a.a.a()), 1, 2, 1, aqe1);
/*  536 */       a(☃, afi.bf.Q(), 1, 1, 2, aqe1);
/*  537 */       a(☃, afi.U.a(akb.a.a.a()), 1, 1, 3, aqe1);
/*      */       
/*  539 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class m
/*      */     extends l
/*      */   {
/*      */     public aqp.f a;
/*      */     public aqp.g b;
/*  549 */     public List<aqt> c = Lists.newArrayList();
/*      */ 
/*      */     
/*      */     public m() {}
/*      */ 
/*      */     
/*      */     public m(int ☃, Random random, int i, int j) {
/*  556 */       super(0, random, i, j);
/*      */     }
/*      */ 
/*      */     
/*      */     public cj a() {
/*  561 */       if (this.b != null) {
/*  562 */         return this.b.a();
/*      */       }
/*  564 */       return super.a();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class n
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */     
/*      */     private boolean b;
/*      */ 
/*      */     
/*      */     public n() {}
/*      */ 
/*      */     
/*      */     public n(int ☃, Random random, aqe aqe1, cq cq1) {
/*  581 */       super(☃);
/*      */       
/*  583 */       this.m = cq1;
/*  584 */       this.d = a(random);
/*  585 */       this.l = aqe1;
/*      */       
/*  587 */       this.a = (random.nextInt(2) == 0);
/*  588 */       this.b = (random.nextInt(2) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  593 */       super.a(☃);
/*  594 */       ☃.a("Left", this.a);
/*  595 */       ☃.a("Right", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  600 */       super.b(☃);
/*  601 */       this.a = ☃.n("Left");
/*  602 */       this.b = ☃.n("Right");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  607 */       a((aqp.m)☃, list, random, 1, 1);
/*  608 */       if (this.a) {
/*  609 */         b((aqp.m)☃, list, random, 1, 2);
/*      */       }
/*  611 */       if (this.b) {
/*  612 */         c((aqp.m)☃, list, random, 1, 2);
/*      */       }
/*      */     }
/*      */     
/*      */     public static n a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/*  617 */       aqe aqe = aqe.a(i, j, k, -1, -1, 0, 5, 5, 7, cq1);
/*      */       
/*  619 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  620 */         return null;
/*      */       }
/*      */       
/*  623 */       return new n(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  628 */       if (a(☃, aqe1)) {
/*  629 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  633 */       a(☃, aqe1, 0, 0, 0, 4, 4, 6, true, random, aqp.c());
/*      */       
/*  635 */       a(☃, random, aqe1, this.d, 1, 1, 0);
/*      */       
/*  637 */       a(☃, random, aqe1, aqp.p.a.a, 1, 1, 6);
/*      */       
/*  639 */       a(☃, aqe1, random, 0.1F, 1, 2, 1, afi.aa.Q());
/*  640 */       a(☃, aqe1, random, 0.1F, 3, 2, 1, afi.aa.Q());
/*  641 */       a(☃, aqe1, random, 0.1F, 1, 2, 5, afi.aa.Q());
/*  642 */       a(☃, aqe1, random, 0.1F, 3, 2, 5, afi.aa.Q());
/*      */       
/*  644 */       if (this.a) {
/*  645 */         a(☃, aqe1, 0, 1, 2, 0, 3, 4, afi.a.Q(), afi.a.Q(), false);
/*      */       }
/*  647 */       if (this.b) {
/*  648 */         a(☃, aqe1, 4, 1, 2, 4, 3, 4, afi.a.Q(), afi.a.Q(), false);
/*      */       }
/*      */       
/*  651 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class a
/*      */     extends p {
/*  657 */     private static final List<ob> a = Lists.newArrayList((Object[])new ob[] { new ob(zy.bu, 0, 1, 1, 10), new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aA, 0, 1, 1, 1), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
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
/*      */     public a() {}
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
/*      */     public a(int ☃, Random random, aqe aqe1, cq cq1) {
/*  691 */       super(☃);
/*      */       
/*  693 */       this.m = cq1;
/*  694 */       this.d = a(random);
/*  695 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  700 */       super.a(☃);
/*  701 */       ☃.a("Chest", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  706 */       super.b(☃);
/*  707 */       this.b = ☃.n("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  712 */       a((aqp.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static a a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/*  716 */       aqe aqe = aqe.a(i, j, k, -1, -1, 0, 5, 5, 7, cq1);
/*      */       
/*  718 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  719 */         return null;
/*      */       }
/*      */       
/*  722 */       return new a(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  727 */       if (a(☃, aqe1)) {
/*  728 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  732 */       a(☃, aqe1, 0, 0, 0, 4, 4, 6, true, random, aqp.c());
/*      */       
/*  734 */       a(☃, random, aqe1, this.d, 1, 1, 0);
/*      */       
/*  736 */       a(☃, random, aqe1, aqp.p.a.a, 1, 1, 6);
/*      */ 
/*      */       
/*  739 */       a(☃, aqe1, 3, 1, 2, 3, 1, 4, afi.bf.Q(), afi.bf.Q(), false);
/*  740 */       a(☃, afi.U.a(akb.a.f.a()), 3, 1, 1, aqe1);
/*  741 */       a(☃, afi.U.a(akb.a.f.a()), 3, 1, 5, aqe1);
/*  742 */       a(☃, afi.U.a(akb.a.f.a()), 3, 2, 2, aqe1);
/*  743 */       a(☃, afi.U.a(akb.a.f.a()), 3, 2, 4, aqe1);
/*  744 */       for (int i = 2; i <= 4; i++) {
/*  745 */         a(☃, afi.U.a(akb.a.f.a()), 2, 1, i, aqe1);
/*      */       }
/*      */       
/*  748 */       if (!this.b && 
/*  749 */         aqe1.b(new cj(a(3, 3), d(2), b(3, 3)))) {
/*  750 */         this.b = true;
/*  751 */         a(☃, aqe1, random, 3, 2, 3, ob.a(a, new ob[] { zy.cd.b(random) }), 2 + random.nextInt(2));
/*      */       } 
/*      */ 
/*      */       
/*  755 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class o
/*      */     extends p
/*      */   {
/*      */     public o() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public o(int ☃, Random random, aqe aqe1, cq cq1) {
/*  769 */       super(☃);
/*      */       
/*  771 */       this.m = cq1;
/*  772 */       this.d = a(random);
/*  773 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  778 */       a((aqp.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static o a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/*  782 */       aqe aqe = aqe.a(i, j, k, -1, -7, 0, 5, 11, 8, cq1);
/*      */       
/*  784 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  785 */         return null;
/*      */       }
/*      */       
/*  788 */       return new o(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  793 */       if (a(☃, aqe1)) {
/*  794 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  798 */       a(☃, aqe1, 0, 0, 0, 4, 10, 7, true, random, aqp.c());
/*      */       
/*  800 */       a(☃, random, aqe1, this.d, 1, 7, 0);
/*      */       
/*  802 */       a(☃, random, aqe1, aqp.p.a.a, 1, 1, 7);
/*      */ 
/*      */       
/*  805 */       int i = a(afi.aw, 2);
/*  806 */       for (int j = 0; j < 6; j++) {
/*  807 */         a(☃, afi.aw.a(i), 1, 6 - j, 1 + j, aqe1);
/*  808 */         a(☃, afi.aw.a(i), 2, 6 - j, 1 + j, aqe1);
/*  809 */         a(☃, afi.aw.a(i), 3, 6 - j, 1 + j, aqe1);
/*  810 */         if (j < 5) {
/*  811 */           a(☃, afi.bf.Q(), 1, 5 - j, 1 + j, aqe1);
/*  812 */           a(☃, afi.bf.Q(), 2, 5 - j, 1 + j, aqe1);
/*  813 */           a(☃, afi.bf.Q(), 3, 5 - j, 1 + j, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/*  817 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends p
/*      */   {
/*      */     public d() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public d(int ☃, Random random, aqe aqe1, cq cq1) {
/*  831 */       super(☃);
/*      */       
/*  833 */       this.m = cq1;
/*  834 */       this.d = a(random);
/*  835 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  840 */       if (this.m == cq.c || this.m == cq.f) {
/*  841 */         b((aqp.m)☃, list, random, 1, 1);
/*      */       } else {
/*  843 */         c((aqp.m)☃, list, random, 1, 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     public static d a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/*  848 */       aqe aqe = aqe.a(i, j, k, -1, -1, 0, 5, 5, 5, cq1);
/*      */       
/*  850 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  851 */         return null;
/*      */       }
/*      */       
/*  854 */       return new d(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  859 */       if (a(☃, aqe1)) {
/*  860 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  864 */       a(☃, aqe1, 0, 0, 0, 4, 4, 4, true, random, aqp.c());
/*      */       
/*  866 */       a(☃, random, aqe1, this.d, 1, 1, 0);
/*      */       
/*  868 */       if (this.m == cq.c || this.m == cq.f) {
/*  869 */         a(☃, aqe1, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
/*      */       } else {
/*  871 */         a(☃, aqe1, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
/*      */       } 
/*      */       
/*  874 */       return true;
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
/*      */   public static class i
/*      */     extends d
/*      */   {
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  889 */       if (this.m == cq.c || this.m == cq.f) {
/*  890 */         c((aqp.m)☃, list, random, 1, 1);
/*      */       } else {
/*  892 */         b((aqp.m)☃, list, random, 1, 1);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  898 */       if (a(☃, aqe1)) {
/*  899 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  903 */       a(☃, aqe1, 0, 0, 0, 4, 4, 4, true, random, aqp.c());
/*      */       
/*  905 */       a(☃, random, aqe1, this.d, 1, 1, 0);
/*      */       
/*  907 */       if (this.m == cq.c || this.m == cq.f) {
/*  908 */         a(☃, aqe1, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
/*      */       } else {
/*  910 */         a(☃, aqe1, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
/*      */       } 
/*      */       
/*  913 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class j
/*      */     extends p {
/*  919 */     private static final List<ob> b = Lists.newArrayList((Object[])new ob[] { new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1) });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected int a;
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
/*      */     public j(int ☃, Random random, aqe aqe1, cq cq1) {
/*  941 */       super(☃);
/*      */       
/*  943 */       this.m = cq1;
/*  944 */       this.d = a(random);
/*  945 */       this.l = aqe1;
/*  946 */       this.a = random.nextInt(5);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  951 */       super.a(☃);
/*  952 */       ☃.a("Type", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  957 */       super.b(☃);
/*  958 */       this.a = ☃.f("Type");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  963 */       a((aqp.m)☃, list, random, 4, 1);
/*  964 */       b((aqp.m)☃, list, random, 1, 4);
/*  965 */       c((aqp.m)☃, list, random, 1, 4);
/*      */     }
/*      */     
/*      */     public static j a(List<aqt> ☃, Random random, int i, int k, int m, cq cq1, int n) {
/*  969 */       aqe aqe = aqe.a(i, k, m, -4, -1, 0, 11, 7, 11, cq1);
/*      */       
/*  971 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  972 */         return null;
/*      */       }
/*      */       
/*  975 */       return new j(n, random, aqe, cq1);
/*      */     }
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1)
/*      */     {
/*  980 */       if (a(☃, aqe1)) {
/*  981 */         return false;
/*      */       }
/*      */ 
/*      */       
/*  985 */       a(☃, aqe1, 0, 0, 0, 10, 6, 10, true, random, aqp.c());
/*      */       
/*  987 */       a(☃, random, aqe1, this.d, 4, 1, 0);
/*      */       
/*  989 */       a(☃, aqe1, 4, 1, 10, 6, 3, 10, afi.a.Q(), afi.a.Q(), false);
/*  990 */       a(☃, aqe1, 0, 1, 4, 0, 3, 6, afi.a.Q(), afi.a.Q(), false);
/*  991 */       a(☃, aqe1, 10, 1, 4, 10, 3, 6, afi.a.Q(), afi.a.Q(), false);
/*      */       
/*  993 */       switch (this.a) {
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
/*      */         default:
/* 1069 */           return true;
/*      */         case 0:
/*      */           a(☃, afi.bf.Q(), 5, 1, 5, aqe1); a(☃, afi.bf.Q(), 5, 2, 5, aqe1); a(☃, afi.bf.Q(), 5, 3, 5, aqe1); a(☃, afi.aa.Q(), 4, 3, 5, aqe1); a(☃, afi.aa.Q(), 6, 3, 5, aqe1); a(☃, afi.aa.Q(), 5, 3, 4, aqe1); a(☃, afi.aa.Q(), 5, 3, 6, aqe1); a(☃, afi.U.Q(), 4, 1, 4, aqe1); a(☃, afi.U.Q(), 4, 1, 5, aqe1); a(☃, afi.U.Q(), 4, 1, 6, aqe1); a(☃, afi.U.Q(), 6, 1, 4, aqe1); a(☃, afi.U.Q(), 6, 1, 5, aqe1); a(☃, afi.U.Q(), 6, 1, 6, aqe1); a(☃, afi.U.Q(), 5, 1, 4, aqe1); a(☃, afi.U.Q(), 5, 1, 6, aqe1);
/*      */         case 1:
/*      */           for (i = 0; i < 5; i++) { a(☃, afi.bf.Q(), 3, 1, 3 + i, aqe1); a(☃, afi.bf.Q(), 7, 1, 3 + i, aqe1); a(☃, afi.bf.Q(), 3 + i, 1, 3, aqe1); a(☃, afi.bf.Q(), 3 + i, 1, 7, aqe1); }
/*      */            a(☃, afi.bf.Q(), 5, 1, 5, aqe1); a(☃, afi.bf.Q(), 5, 2, 5, aqe1); a(☃, afi.bf.Q(), 5, 3, 5, aqe1); a(☃, afi.i.Q(), 5, 4, 5, aqe1);
/*      */         case 2:
/*      */           break;
/*      */       }  int i; for (i = 1; i <= 9; i++) { a(☃, afi.e.Q(), 1, 3, i, aqe1); a(☃, afi.e.Q(), 9, 3, i, aqe1); }
/*      */        for (i = 1; i <= 9; i++) { a(☃, afi.e.Q(), i, 3, 1, aqe1); a(☃, afi.e.Q(), i, 3, 9, aqe1); }
/*      */        a(☃, afi.e.Q(), 5, 1, 4, aqe1); a(☃, afi.e.Q(), 5, 1, 6, aqe1); a(☃, afi.e.Q(), 5, 3, 4, aqe1); a(☃, afi.e.Q(), 5, 3, 6, aqe1); a(☃, afi.e.Q(), 4, 1, 5, aqe1); a(☃, afi.e.Q(), 6, 1, 5, aqe1); a(☃, afi.e.Q(), 4, 3, 5, aqe1); a(☃, afi.e.Q(), 6, 3, 5, aqe1); for (i = 1; i <= 3; i++) { a(☃, afi.e.Q(), 4, i, 4, aqe1); a(☃, afi.e.Q(), 6, i, 4, aqe1); a(☃, afi.e.Q(), 4, i, 6, aqe1); a(☃, afi.e.Q(), 6, i, 6, aqe1); }
/*      */        a(☃, afi.aa.Q(), 5, 3, 5, aqe1); for (i = 2; i <= 8; i++) { a(☃, afi.f.Q(), 2, 3, i, aqe1); a(☃, afi.f.Q(), 3, 3, i, aqe1); if (i <= 3 || i >= 7) {
/*      */           a(☃, afi.f.Q(), 4, 3, i, aqe1); a(☃, afi.f.Q(), 5, 3, i, aqe1); a(☃, afi.f.Q(), 6, 3, i, aqe1);
/*      */         }  a(☃, afi.f.Q(), 7, 3, i, aqe1); a(☃, afi.f.Q(), 8, 3, i, aqe1); }
/* 1083 */        a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 1, 3, aqe1); a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 2, 3, aqe1); a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 3, 3, aqe1); a(☃, aqe1, random, 3, 4, 8, ob.a(b, new ob[] { zy.cd.b(random) }), 1 + random.nextInt(4)); } } public static class h extends p { public h(int ☃, Random random, aqe aqe1, cq cq1) { super(☃);
/*      */       
/* 1085 */       this.m = cq1;
/* 1086 */       this.d = a(random);
/* 1087 */       this.l = aqe1; }
/*      */     
/*      */     public h() {}
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1092 */       a((aqp.m)☃, list, random, 1, 1);
/*      */     }
/*      */     
/*      */     public static h a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/* 1096 */       aqe aqe = aqe.a(i, j, k, -1, -1, 0, 9, 5, 11, cq1);
/*      */       
/* 1098 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1099 */         return null;
/*      */       }
/*      */       
/* 1102 */       return new h(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1107 */       if (a(☃, aqe1)) {
/* 1108 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1112 */       a(☃, aqe1, 0, 0, 0, 8, 4, 10, true, random, aqp.c());
/*      */       
/* 1114 */       a(☃, random, aqe1, this.d, 1, 1, 0);
/*      */       
/* 1116 */       a(☃, aqe1, 1, 1, 10, 3, 3, 10, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1119 */       a(☃, aqe1, 4, 1, 1, 4, 3, 1, false, random, aqp.c());
/* 1120 */       a(☃, aqe1, 4, 1, 3, 4, 3, 3, false, random, aqp.c());
/* 1121 */       a(☃, aqe1, 4, 1, 7, 4, 3, 7, false, random, aqp.c());
/* 1122 */       a(☃, aqe1, 4, 1, 9, 4, 3, 9, false, random, aqp.c());
/*      */ 
/*      */       
/* 1125 */       a(☃, aqe1, 4, 1, 4, 4, 3, 6, afi.bi.Q(), afi.bi.Q(), false);
/* 1126 */       a(☃, aqe1, 5, 1, 5, 7, 3, 5, afi.bi.Q(), afi.bi.Q(), false);
/*      */ 
/*      */       
/* 1129 */       a(☃, afi.bi.Q(), 4, 3, 2, aqe1);
/* 1130 */       a(☃, afi.bi.Q(), 4, 3, 8, aqe1);
/* 1131 */       a(☃, afi.aA.a(a(afi.aA, 3)), 4, 1, 2, aqe1);
/* 1132 */       a(☃, afi.aA.a(a(afi.aA, 3) + 8), 4, 2, 2, aqe1);
/* 1133 */       a(☃, afi.aA.a(a(afi.aA, 3)), 4, 1, 8, aqe1);
/* 1134 */       a(☃, afi.aA.a(a(afi.aA, 3) + 8), 4, 2, 8, aqe1);
/*      */       
/* 1136 */       return true;
/*      */     } }
/*      */ 
/*      */   
/*      */   public static class e
/*      */     extends p {
/* 1142 */     private static final List<ob> a = Lists.newArrayList((Object[])new ob[] { new ob(zy.aL, 0, 1, 3, 20), new ob(zy.aK, 0, 2, 7, 20), new ob(zy.bV, 0, 1, 1, 1), new ob(zy.aQ, 0, 1, 1, 1) });
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
/*      */     public e() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public e(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1162 */       super(☃);
/*      */       
/* 1164 */       this.m = cq1;
/* 1165 */       this.d = a(random);
/* 1166 */       this.l = aqe1;
/* 1167 */       this.b = (aqe1.d() > 6);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1172 */       super.a(☃);
/* 1173 */       ☃.a("Tall", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1178 */       super.b(☃);
/* 1179 */       this.b = ☃.n("Tall");
/*      */     }
/*      */ 
/*      */     
/*      */     public static e a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/* 1184 */       aqe aqe = aqe.a(i, j, k, -4, -1, 0, 14, 11, 15, cq1);
/*      */       
/* 1186 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*      */         
/* 1188 */         aqe = aqe.a(i, j, k, -4, -1, 0, 14, 6, 15, cq1);
/*      */         
/* 1190 */         if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1191 */           return null;
/*      */         }
/*      */       } 
/*      */       
/* 1195 */       return new e(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1200 */       if (a(☃, aqe1)) {
/* 1201 */         return false;
/*      */       }
/*      */       
/* 1204 */       int i = 11;
/* 1205 */       if (!this.b) {
/* 1206 */         i = 6;
/*      */       }
/*      */ 
/*      */       
/* 1210 */       a(☃, aqe1, 0, 0, 0, 13, i - 1, 14, true, random, aqp.c());
/*      */       
/* 1212 */       a(☃, random, aqe1, this.d, 4, 1, 0);
/*      */ 
/*      */       
/* 1215 */       a(☃, aqe1, random, 0.07F, 2, 1, 1, 11, 4, 13, afi.G.Q(), afi.G.Q(), false);
/*      */       
/* 1217 */       int j = 1;
/* 1218 */       int k = 12;
/*      */       
/*      */       int m;
/* 1221 */       for (m = 1; m <= 13; m++) {
/* 1222 */         if ((m - 1) % 4 == 0) {
/* 1223 */           a(☃, aqe1, 1, 1, m, 1, 4, m, afi.f.Q(), afi.f.Q(), false);
/* 1224 */           a(☃, aqe1, 12, 1, m, 12, 4, m, afi.f.Q(), afi.f.Q(), false);
/*      */           
/* 1226 */           a(☃, afi.aa.Q(), 2, 3, m, aqe1);
/* 1227 */           a(☃, afi.aa.Q(), 11, 3, m, aqe1);
/*      */           
/* 1229 */           if (this.b) {
/* 1230 */             a(☃, aqe1, 1, 6, m, 1, 9, m, afi.f.Q(), afi.f.Q(), false);
/* 1231 */             a(☃, aqe1, 12, 6, m, 12, 9, m, afi.f.Q(), afi.f.Q(), false);
/*      */           } 
/*      */         } else {
/* 1234 */           a(☃, aqe1, 1, 1, m, 1, 4, m, afi.X.Q(), afi.X.Q(), false);
/* 1235 */           a(☃, aqe1, 12, 1, m, 12, 4, m, afi.X.Q(), afi.X.Q(), false);
/*      */           
/* 1237 */           if (this.b) {
/* 1238 */             a(☃, aqe1, 1, 6, m, 1, 9, m, afi.X.Q(), afi.X.Q(), false);
/* 1239 */             a(☃, aqe1, 12, 6, m, 12, 9, m, afi.X.Q(), afi.X.Q(), false);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1245 */       for (m = 3; m < 12; m += 2) {
/* 1246 */         a(☃, aqe1, 3, 1, m, 4, 3, m, afi.X.Q(), afi.X.Q(), false);
/* 1247 */         a(☃, aqe1, 6, 1, m, 7, 3, m, afi.X.Q(), afi.X.Q(), false);
/* 1248 */         a(☃, aqe1, 9, 1, m, 10, 3, m, afi.X.Q(), afi.X.Q(), false);
/*      */       } 
/*      */       
/* 1251 */       if (this.b) {
/*      */         
/* 1253 */         a(☃, aqe1, 1, 5, 1, 3, 5, 13, afi.f.Q(), afi.f.Q(), false);
/* 1254 */         a(☃, aqe1, 10, 5, 1, 12, 5, 13, afi.f.Q(), afi.f.Q(), false);
/* 1255 */         a(☃, aqe1, 4, 5, 1, 9, 5, 2, afi.f.Q(), afi.f.Q(), false);
/* 1256 */         a(☃, aqe1, 4, 5, 12, 9, 5, 13, afi.f.Q(), afi.f.Q(), false);
/*      */         
/* 1258 */         a(☃, afi.f.Q(), 9, 5, 11, aqe1);
/* 1259 */         a(☃, afi.f.Q(), 8, 5, 11, aqe1);
/* 1260 */         a(☃, afi.f.Q(), 9, 5, 10, aqe1);
/*      */ 
/*      */         
/* 1263 */         a(☃, aqe1, 3, 6, 2, 3, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
/* 1264 */         a(☃, aqe1, 10, 6, 2, 10, 6, 10, afi.aO.Q(), afi.aO.Q(), false);
/* 1265 */         a(☃, aqe1, 4, 6, 2, 9, 6, 2, afi.aO.Q(), afi.aO.Q(), false);
/* 1266 */         a(☃, aqe1, 4, 6, 12, 8, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
/* 1267 */         a(☃, afi.aO.Q(), 9, 6, 11, aqe1);
/* 1268 */         a(☃, afi.aO.Q(), 8, 6, 11, aqe1);
/* 1269 */         a(☃, afi.aO.Q(), 9, 6, 10, aqe1);
/*      */ 
/*      */         
/* 1272 */         m = a(afi.au, 3);
/* 1273 */         a(☃, afi.au.a(m), 10, 1, 13, aqe1);
/* 1274 */         a(☃, afi.au.a(m), 10, 2, 13, aqe1);
/* 1275 */         a(☃, afi.au.a(m), 10, 3, 13, aqe1);
/* 1276 */         a(☃, afi.au.a(m), 10, 4, 13, aqe1);
/* 1277 */         a(☃, afi.au.a(m), 10, 5, 13, aqe1);
/* 1278 */         a(☃, afi.au.a(m), 10, 6, 13, aqe1);
/* 1279 */         a(☃, afi.au.a(m), 10, 7, 13, aqe1);
/*      */ 
/*      */         
/* 1282 */         int n = 7;
/* 1283 */         int i1 = 7;
/* 1284 */         a(☃, afi.aO.Q(), n - 1, 9, i1, aqe1);
/* 1285 */         a(☃, afi.aO.Q(), n, 9, i1, aqe1);
/* 1286 */         a(☃, afi.aO.Q(), n - 1, 8, i1, aqe1);
/* 1287 */         a(☃, afi.aO.Q(), n, 8, i1, aqe1);
/* 1288 */         a(☃, afi.aO.Q(), n - 1, 7, i1, aqe1);
/* 1289 */         a(☃, afi.aO.Q(), n, 7, i1, aqe1);
/*      */         
/* 1291 */         a(☃, afi.aO.Q(), n - 2, 7, i1, aqe1);
/* 1292 */         a(☃, afi.aO.Q(), n + 1, 7, i1, aqe1);
/* 1293 */         a(☃, afi.aO.Q(), n - 1, 7, i1 - 1, aqe1);
/* 1294 */         a(☃, afi.aO.Q(), n - 1, 7, i1 + 1, aqe1);
/* 1295 */         a(☃, afi.aO.Q(), n, 7, i1 - 1, aqe1);
/* 1296 */         a(☃, afi.aO.Q(), n, 7, i1 + 1, aqe1);
/*      */         
/* 1298 */         a(☃, afi.aa.Q(), n - 2, 8, i1, aqe1);
/* 1299 */         a(☃, afi.aa.Q(), n + 1, 8, i1, aqe1);
/* 1300 */         a(☃, afi.aa.Q(), n - 1, 8, i1 - 1, aqe1);
/* 1301 */         a(☃, afi.aa.Q(), n - 1, 8, i1 + 1, aqe1);
/* 1302 */         a(☃, afi.aa.Q(), n, 8, i1 - 1, aqe1);
/* 1303 */         a(☃, afi.aa.Q(), n, 8, i1 + 1, aqe1);
/*      */       } 
/*      */ 
/*      */       
/* 1307 */       a(☃, aqe1, random, 3, 3, 5, ob.a(a, new ob[] { zy.cd.a(random, 1, 5, 2) }), 1 + random.nextInt(4));
/* 1308 */       if (this.b) {
/* 1309 */         a(☃, afi.a.Q(), 12, 9, 1, aqe1);
/* 1310 */         a(☃, aqe1, random, 12, 8, 1, ob.a(a, new ob[] { zy.cd.a(random, 1, 5, 2) }), 1 + random.nextInt(4));
/*      */       } 
/*      */       
/* 1313 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */     private boolean b;
/*      */     private boolean c;
/*      */     private boolean e;
/*      */     
/*      */     public c() {}
/*      */     
/*      */     public c(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1329 */       super(☃);
/*      */       
/* 1331 */       this.m = cq1;
/* 1332 */       this.d = a(random);
/* 1333 */       this.l = aqe1;
/*      */       
/* 1335 */       this.a = random.nextBoolean();
/* 1336 */       this.b = random.nextBoolean();
/* 1337 */       this.c = random.nextBoolean();
/* 1338 */       this.e = (random.nextInt(3) > 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1343 */       super.a(☃);
/* 1344 */       ☃.a("leftLow", this.a);
/* 1345 */       ☃.a("leftHigh", this.b);
/* 1346 */       ☃.a("rightLow", this.c);
/* 1347 */       ☃.a("rightHigh", this.e);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1352 */       super.b(☃);
/* 1353 */       this.a = ☃.n("leftLow");
/* 1354 */       this.b = ☃.n("leftHigh");
/* 1355 */       this.c = ☃.n("rightLow");
/* 1356 */       this.e = ☃.n("rightHigh");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1361 */       int i = 3;
/* 1362 */       int j = 5;
/*      */       
/* 1364 */       if (this.m == cq.e || this.m == cq.c) {
/* 1365 */         i = 8 - i;
/* 1366 */         j = 8 - j;
/*      */       } 
/*      */       
/* 1369 */       a((aqp.m)☃, list, random, 5, 1);
/* 1370 */       if (this.a) {
/* 1371 */         b((aqp.m)☃, list, random, i, 1);
/*      */       }
/* 1373 */       if (this.b) {
/* 1374 */         b((aqp.m)☃, list, random, j, 7);
/*      */       }
/* 1376 */       if (this.c) {
/* 1377 */         c((aqp.m)☃, list, random, i, 1);
/*      */       }
/* 1379 */       if (this.e) {
/* 1380 */         c((aqp.m)☃, list, random, j, 7);
/*      */       }
/*      */     }
/*      */     
/*      */     public static c a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/* 1385 */       aqe aqe = aqe.a(i, j, k, -4, -3, 0, 10, 9, 11, cq1);
/*      */       
/* 1387 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1388 */         return null;
/*      */       }
/*      */       
/* 1391 */       return new c(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1396 */       if (a(☃, aqe1)) {
/* 1397 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1401 */       a(☃, aqe1, 0, 0, 0, 9, 8, 10, true, random, aqp.c());
/*      */       
/* 1403 */       a(☃, random, aqe1, this.d, 4, 3, 0);
/*      */ 
/*      */       
/* 1406 */       if (this.a) {
/* 1407 */         a(☃, aqe1, 0, 3, 1, 0, 5, 3, afi.a.Q(), afi.a.Q(), false);
/*      */       }
/* 1409 */       if (this.c) {
/* 1410 */         a(☃, aqe1, 9, 3, 1, 9, 5, 3, afi.a.Q(), afi.a.Q(), false);
/*      */       }
/* 1412 */       if (this.b) {
/* 1413 */         a(☃, aqe1, 0, 5, 7, 0, 7, 9, afi.a.Q(), afi.a.Q(), false);
/*      */       }
/* 1415 */       if (this.e) {
/* 1416 */         a(☃, aqe1, 9, 5, 7, 9, 7, 9, afi.a.Q(), afi.a.Q(), false);
/*      */       }
/* 1418 */       a(☃, aqe1, 5, 1, 10, 7, 3, 10, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1421 */       a(☃, aqe1, 1, 2, 1, 8, 2, 6, false, random, aqp.c());
/*      */       
/* 1423 */       a(☃, aqe1, 4, 1, 5, 4, 4, 9, false, random, aqp.c());
/* 1424 */       a(☃, aqe1, 8, 1, 5, 8, 4, 9, false, random, aqp.c());
/*      */       
/* 1426 */       a(☃, aqe1, 1, 4, 7, 3, 4, 9, false, random, aqp.c());
/*      */ 
/*      */       
/* 1429 */       a(☃, aqe1, 1, 3, 5, 3, 3, 6, false, random, aqp.c());
/* 1430 */       a(☃, aqe1, 1, 3, 4, 3, 3, 4, afi.U.Q(), afi.U.Q(), false);
/* 1431 */       a(☃, aqe1, 1, 4, 6, 3, 4, 6, afi.U.Q(), afi.U.Q(), false);
/*      */ 
/*      */       
/* 1434 */       a(☃, aqe1, 5, 1, 7, 7, 1, 8, false, random, aqp.c());
/* 1435 */       a(☃, aqe1, 5, 1, 9, 7, 1, 9, afi.U.Q(), afi.U.Q(), false);
/* 1436 */       a(☃, aqe1, 5, 2, 7, 7, 2, 7, afi.U.Q(), afi.U.Q(), false);
/*      */ 
/*      */       
/* 1439 */       a(☃, aqe1, 4, 5, 7, 4, 5, 9, afi.U.Q(), afi.U.Q(), false);
/* 1440 */       a(☃, aqe1, 8, 5, 7, 8, 5, 9, afi.U.Q(), afi.U.Q(), false);
/* 1441 */       a(☃, aqe1, 5, 5, 7, 7, 5, 9, afi.T.Q(), afi.T.Q(), false);
/* 1442 */       a(☃, afi.aa.Q(), 6, 5, 6, aqe1);
/*      */       
/* 1444 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends p
/*      */   {
/*      */     private boolean a;
/*      */ 
/*      */     
/*      */     public g() {}
/*      */ 
/*      */     
/*      */     public g(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1460 */       super(☃);
/*      */       
/* 1462 */       this.m = cq1;
/* 1463 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1468 */       super.a(☃);
/* 1469 */       ☃.a("Mob", this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1474 */       super.b(☃);
/* 1475 */       this.a = ☃.n("Mob");
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1480 */       if (☃ != null) {
/* 1481 */         ((aqp.m)☃).b = this;
/*      */       }
/*      */     }
/*      */     
/*      */     public static g a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int m) {
/* 1486 */       aqe aqe = aqe.a(i, j, k, -4, -1, 0, 11, 8, 16, cq1);
/*      */       
/* 1488 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1489 */         return null;
/*      */       }
/*      */       
/* 1492 */       return new g(m, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1498 */       a(☃, aqe1, 0, 0, 0, 10, 7, 15, false, random, aqp.c());
/*      */       
/* 1500 */       a(☃, random, aqe1, aqp.p.a.c, 4, 1, 0);
/*      */ 
/*      */       
/* 1503 */       int i = 6;
/* 1504 */       a(☃, aqe1, 1, i, 1, 1, i, 14, false, random, aqp.c());
/* 1505 */       a(☃, aqe1, 9, i, 1, 9, i, 14, false, random, aqp.c());
/* 1506 */       a(☃, aqe1, 2, i, 1, 8, i, 2, false, random, aqp.c());
/* 1507 */       a(☃, aqe1, 2, i, 14, 8, i, 14, false, random, aqp.c());
/*      */ 
/*      */       
/* 1510 */       a(☃, aqe1, 1, 1, 1, 2, 1, 4, false, random, aqp.c());
/* 1511 */       a(☃, aqe1, 8, 1, 1, 9, 1, 4, false, random, aqp.c());
/* 1512 */       a(☃, aqe1, 1, 1, 1, 1, 1, 3, afi.k.Q(), afi.k.Q(), false);
/* 1513 */       a(☃, aqe1, 9, 1, 1, 9, 1, 3, afi.k.Q(), afi.k.Q(), false);
/*      */ 
/*      */       
/* 1516 */       a(☃, aqe1, 3, 1, 8, 7, 1, 12, false, random, aqp.c());
/* 1517 */       a(☃, aqe1, 4, 1, 9, 6, 1, 11, afi.k.Q(), afi.k.Q(), false);
/*      */       
/*      */       int j;
/* 1520 */       for (j = 3; j < 14; j += 2) {
/* 1521 */         a(☃, aqe1, 0, 3, j, 0, 4, j, afi.bi.Q(), afi.bi.Q(), false);
/* 1522 */         a(☃, aqe1, 10, 3, j, 10, 4, j, afi.bi.Q(), afi.bi.Q(), false);
/*      */       } 
/* 1524 */       for (j = 2; j < 9; j += 2) {
/* 1525 */         a(☃, aqe1, j, 3, 15, j, 4, 15, afi.bi.Q(), afi.bi.Q(), false);
/*      */       }
/*      */ 
/*      */       
/* 1529 */       j = a(afi.bv, 3);
/* 1530 */       a(☃, aqe1, 4, 1, 5, 6, 1, 7, false, random, aqp.c());
/* 1531 */       a(☃, aqe1, 4, 2, 6, 6, 2, 7, false, random, aqp.c());
/* 1532 */       a(☃, aqe1, 4, 3, 7, 6, 3, 7, false, random, aqp.c()); int k;
/* 1533 */       for (k = 4; k <= 6; k++) {
/* 1534 */         a(☃, afi.bv.a(j), k, 1, 4, aqe1);
/* 1535 */         a(☃, afi.bv.a(j), k, 2, 5, aqe1);
/* 1536 */         a(☃, afi.bv.a(j), k, 3, 6, aqe1);
/*      */       } 
/*      */       
/* 1539 */       k = cq.c.b();
/* 1540 */       int m = cq.d.b();
/* 1541 */       int n = cq.f.b();
/* 1542 */       int i1 = cq.e.b();
/*      */       
/* 1544 */       if (this.m != null) {
/* 1545 */         switch (aqp.null.b[this.m.ordinal()]) {
/*      */           case 2:
/* 1547 */             k = cq.d.b();
/* 1548 */             m = cq.c.b();
/*      */             break;
/*      */           case 4:
/* 1551 */             k = cq.f.b();
/* 1552 */             m = cq.e.b();
/* 1553 */             n = cq.d.b();
/* 1554 */             i1 = cq.c.b();
/*      */             break;
/*      */           case 3:
/* 1557 */             k = cq.e.b();
/* 1558 */             m = cq.f.b();
/* 1559 */             n = cq.d.b();
/* 1560 */             i1 = cq.c.b();
/*      */             break;
/*      */         } 
/*      */       
/*      */       }
/* 1565 */       a(☃, afi.bG.a(k).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 4, 3, 8, aqe1);
/* 1566 */       a(☃, afi.bG.a(k).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 5, 3, 8, aqe1);
/* 1567 */       a(☃, afi.bG.a(k).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 6, 3, 8, aqe1);
/* 1568 */       a(☃, afi.bG.a(m).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 4, 3, 12, aqe1);
/* 1569 */       a(☃, afi.bG.a(m).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 5, 3, 12, aqe1);
/* 1570 */       a(☃, afi.bG.a(m).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 6, 3, 12, aqe1);
/* 1571 */       a(☃, afi.bG.a(n).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 3, 3, 9, aqe1);
/* 1572 */       a(☃, afi.bG.a(n).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 3, 3, 10, aqe1);
/* 1573 */       a(☃, afi.bG.a(n).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 3, 3, 11, aqe1);
/* 1574 */       a(☃, afi.bG.a(i1).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 7, 3, 9, aqe1);
/* 1575 */       a(☃, afi.bG.a(i1).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 7, 3, 10, aqe1);
/* 1576 */       a(☃, afi.bG.a(i1).a(ago.b, Boolean.valueOf((random.nextFloat() > 0.9F))), 7, 3, 11, aqe1);
/*      */       
/* 1578 */       if (!this.a) {
/* 1579 */         i = d(3);
/* 1580 */         cj cj = new cj(a(5, 6), i, b(5, 6));
/* 1581 */         if (aqe1.b(cj)) {
/* 1582 */           this.a = true;
/* 1583 */           ☃.a(cj, afi.ac.Q(), 2);
/*      */           
/* 1585 */           akw akw = ☃.s(cj);
/* 1586 */           if (akw instanceof all) {
/* 1587 */             ((all)akw).b().a("Silverfish");
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1592 */       return true;
/*      */     } }
/*      */   
/*      */   static class k extends aqt.a {
/*      */     private k() {}
/*      */     
/*      */     public void a(Random ☃, int i, int j, int m, boolean bool) {
/* 1599 */       if (bool) {
/* 1600 */         float f = ☃.nextFloat();
/* 1601 */         if (f < 0.2F) {
/* 1602 */           this.a = afi.bf.a(ajz.O);
/* 1603 */         } else if (f < 0.5F) {
/* 1604 */           this.a = afi.bf.a(ajz.N);
/* 1605 */         } else if (f < 0.55F) {
/* 1606 */           this.a = afi.be.a(ahz.a.c.a());
/*      */         } else {
/* 1608 */           this.a = afi.bf.Q();
/*      */         } 
/*      */       } else {
/* 1611 */         this.a = afi.a.Q();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/* 1616 */   private static final k e = new k();
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */