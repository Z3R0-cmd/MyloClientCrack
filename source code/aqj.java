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
/*      */ public class aqj
/*      */ {
/*      */   public static void a() {
/*   26 */     aqr.a((Class)a.class, "NeBCr");
/*   27 */     aqr.a((Class)b.class, "NeBEF");
/*   28 */     aqr.a((Class)c.class, "NeBS");
/*   29 */     aqr.a((Class)d.class, "NeCCS");
/*   30 */     aqr.a((Class)e.class, "NeCTB");
/*   31 */     aqr.a((Class)f.class, "NeCE");
/*   32 */     aqr.a((Class)g.class, "NeSCSC");
/*   33 */     aqr.a((Class)h.class, "NeSCLT");
/*   34 */     aqr.a((Class)i.class, "NeSC");
/*   35 */     aqr.a((Class)j.class, "NeSCRT");
/*   36 */     aqr.a((Class)k.class, "NeCSR");
/*   37 */     aqr.a((Class)l.class, "NeMT");
/*   38 */     aqr.a((Class)o.class, "NeRC");
/*   39 */     aqr.a((Class)p.class, "NeSR");
/*   40 */     aqr.a((Class)q.class, "NeStart");
/*      */   }
/*      */   
/*      */   static class n {
/*      */     public Class<? extends aqj.m> a;
/*      */     public final int b;
/*      */     public int c;
/*      */     public int d;
/*      */     public boolean e;
/*      */     
/*      */     public n(Class<? extends aqj.m> ☃, int i, int j, boolean bool) {
/*   51 */       this.a = ☃;
/*   52 */       this.b = i;
/*   53 */       this.d = j;
/*   54 */       this.e = bool;
/*      */     }
/*      */     
/*      */     public n(Class<? extends aqj.m> ☃, int i, int j) {
/*   58 */       this(☃, i, j, false);
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/*   62 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */     
/*      */     public boolean a() {
/*   66 */       return (this.d == 0 || this.c < this.d);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*   71 */   private static final n[] a = new n[] { new n((Class)c.class, 30, 0, true), new n((Class)a.class, 10, 4), new n((Class)o.class, 10, 4), new n((Class)p.class, 10, 3), new n((Class)l.class, 5, 2), new n((Class)f.class, 5, 1) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   79 */   private static final n[] b = new n[] { new n((Class)i.class, 25, 0, true), new n((Class)g.class, 15, 5), new n((Class)j.class, 5, 10), new n((Class)h.class, 5, 10), new n((Class)d.class, 10, 3, true), new n((Class)e.class, 7, 2), new n((Class)k.class, 5, 2) };
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
/*      */   private static m b(n ☃, List<aqt> list, Random random, int i, int j, int k, cq cq1, int m) {
/*   91 */     Class<? extends m> clazz = ☃.a;
/*   92 */     m m1 = null;
/*      */     
/*   94 */     if (clazz == c.class) {
/*   95 */       m1 = c.a(list, random, i, j, k, cq1, m);
/*   96 */     } else if (clazz == a.class) {
/*   97 */       m1 = a.a(list, random, i, j, k, cq1, m);
/*   98 */     } else if (clazz == o.class) {
/*   99 */       m1 = o.a(list, random, i, j, k, cq1, m);
/*  100 */     } else if (clazz == p.class) {
/*  101 */       m1 = p.a(list, random, i, j, k, m, cq1);
/*  102 */     } else if (clazz == l.class) {
/*  103 */       m1 = l.a(list, random, i, j, k, m, cq1);
/*  104 */     } else if (clazz == f.class) {
/*  105 */       m1 = f.a(list, random, i, j, k, cq1, m);
/*  106 */     } else if (clazz == i.class) {
/*  107 */       m1 = i.a(list, random, i, j, k, cq1, m);
/*  108 */     } else if (clazz == j.class) {
/*  109 */       m1 = j.a(list, random, i, j, k, cq1, m);
/*  110 */     } else if (clazz == h.class) {
/*  111 */       m1 = h.a(list, random, i, j, k, cq1, m);
/*  112 */     } else if (clazz == d.class) {
/*  113 */       m1 = d.a(list, random, i, j, k, cq1, m);
/*  114 */     } else if (clazz == e.class) {
/*  115 */       m1 = e.a(list, random, i, j, k, cq1, m);
/*  116 */     } else if (clazz == g.class) {
/*  117 */       m1 = g.a(list, random, i, j, k, cq1, m);
/*  118 */     } else if (clazz == k.class) {
/*  119 */       m1 = k.a(list, random, i, j, k, cq1, m);
/*      */     } 
/*  121 */     return m1;
/*      */   }
/*      */   
/*      */   static abstract class m
/*      */     extends aqt {
/*  126 */     protected static final List<ob> a = Lists.newArrayList((Object[])new ob[] { new ob(zy.i, 0, 1, 3, 5), new ob(zy.j, 0, 1, 5, 5), new ob(zy.k, 0, 1, 3, 15), new ob(zy.B, 0, 1, 1, 5), new ob(zy.ah, 0, 1, 1, 5), new ob(zy.d, 0, 1, 1, 5), new ob(zy.by, 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 8), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 3), new ob(zw.a(afi.Z), 0, 2, 4, 2) });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public m() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected m(int ☃) {
/*  147 */       super(☃);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {}
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {}
/*      */ 
/*      */     
/*      */     private int a(List<aqj.n> ☃) {
/*  159 */       boolean bool = false;
/*  160 */       int i = 0;
/*  161 */       for (Iterator<aqj.n> iterator = ☃.iterator(); iterator.hasNext(); ) { aqj.n n = iterator.next();
/*  162 */         if (n.d > 0 && n.c < n.d) {
/*  163 */           bool = true;
/*      */         }
/*  165 */         i += n.b; }
/*      */       
/*  167 */       return bool ? i : -1;
/*      */     }
/*      */     
/*      */     private m a(aqj.q ☃, List<aqj.n> list, List<aqt> list1, Random random, int i, int j, int k, cq cq1, int n) {
/*  171 */       int i1 = a(list);
/*  172 */       boolean bool = (i1 > 0 && n <= 30);
/*      */       
/*  174 */       int i2 = 0;
/*  175 */       while (i2 < 5 && bool) {
/*  176 */         i2++;
/*      */         
/*  178 */         int i3 = random.nextInt(i1);
/*  179 */         for (Iterator<aqj.n> iterator = list.iterator(); iterator.hasNext(); ) { aqj.n n1 = iterator.next();
/*  180 */           i3 -= n1.b;
/*  181 */           if (i3 < 0) {
/*  182 */             if (!n1.a(n) || (n1 == ☃.b && !n1.e)) {
/*      */               break;
/*      */             }
/*      */             
/*  186 */             m m1 = aqj.a(n1, list1, random, i, j, k, cq1, n);
/*  187 */             if (m1 != null) {
/*  188 */               n1.c++;
/*  189 */               ☃.b = n1;
/*      */               
/*  191 */               if (!n1.a()) {
/*  192 */                 list.remove(n1);
/*      */               }
/*  194 */               return m1;
/*      */             } 
/*      */           }  }
/*      */       
/*      */       } 
/*  199 */       return aqj.b.a(list1, random, i, j, k, cq1, n);
/*      */     }
/*      */     
/*      */     private aqt a(aqj.q ☃, List<aqt> list, Random random, int i, int j, int k, cq cq1, int n, boolean bool) {
/*  203 */       if (Math.abs(i - (☃.c()).a) > 112 || Math.abs(k - (☃.c()).c) > 112) {
/*  204 */         return aqj.b.a(list, random, i, j, k, cq1, n);
/*      */       }
/*  206 */       List<aqj.n> list1 = ☃.c;
/*  207 */       if (bool) {
/*  208 */         list1 = ☃.d;
/*      */       }
/*  210 */       aqt aqt1 = a(☃, list1, list, random, i, j, k, cq1, n + 1);
/*  211 */       if (aqt1 != null) {
/*  212 */         list.add(aqt1);
/*  213 */         ☃.e.add(aqt1);
/*      */       } 
/*  215 */       return aqt1;
/*      */     }
/*      */     
/*      */     protected aqt a(aqj.q ☃, List<aqt> list, Random random, int i, int j, boolean bool) {
/*  219 */       if (this.m != null) {
/*  220 */         switch (aqj.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  222 */             return a(☃, list, random, this.l.a + i, this.l.b + j, this.l.c - 1, this.m, d(), bool);
/*      */           case 2:
/*  224 */             return a(☃, list, random, this.l.a + i, this.l.b + j, this.l.f + 1, this.m, d(), bool);
/*      */           case 3:
/*  226 */             return a(☃, list, random, this.l.a - 1, this.l.b + j, this.l.c + i, this.m, d(), bool);
/*      */           case 4:
/*  228 */             return a(☃, list, random, this.l.d + 1, this.l.b + j, this.l.c + i, this.m, d(), bool);
/*      */         } 
/*      */       }
/*  231 */       return null;
/*      */     }
/*      */     
/*      */     protected aqt b(aqj.q ☃, List<aqt> list, Random random, int i, int j, boolean bool) {
/*  235 */       if (this.m != null) {
/*  236 */         switch (aqj.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  238 */             return a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d(), bool);
/*      */           case 2:
/*  240 */             return a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d(), bool);
/*      */           case 3:
/*  242 */             return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d(), bool);
/*      */           case 4:
/*  244 */             return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d(), bool);
/*      */         } 
/*      */       }
/*  247 */       return null;
/*      */     }
/*      */     
/*      */     protected aqt c(aqj.q ☃, List<aqt> list, Random random, int i, int j, boolean bool) {
/*  251 */       if (this.m != null) {
/*  252 */         switch (aqj.null.a[this.m.ordinal()]) {
/*      */           case 1:
/*  254 */             return a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d(), bool);
/*      */           case 2:
/*  256 */             return a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d(), bool);
/*      */           case 3:
/*  258 */             return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d(), bool);
/*      */           case 4:
/*  260 */             return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d(), bool);
/*      */         } 
/*      */       }
/*  263 */       return null;
/*      */     }
/*      */     
/*      */     protected static boolean a(aqe ☃) {
/*  267 */       return (☃ != null && ☃.b > 10);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public static class q
/*      */     extends a
/*      */   {
/*      */     public aqj.n b;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<aqj.n> c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<aqj.n> d;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  314 */     public List<aqt> e = Lists.newArrayList();
/*      */ 
/*      */     
/*      */     public q() {}
/*      */ 
/*      */     
/*      */     public q(Random ☃, int i, int j) {
/*  321 */       super(☃, i, j);
/*      */       
/*  323 */       this.c = Lists.newArrayList(); aqj.n[] arrayOfN; int k, m;
/*  324 */       for (arrayOfN = aqj.b(), k = arrayOfN.length, m = 0; m < k; ) { aqj.n n1 = arrayOfN[m];
/*  325 */         n1.c = 0;
/*  326 */         this.c.add(n1);
/*      */         m++; }
/*      */       
/*  329 */       this.d = Lists.newArrayList();
/*  330 */       for (arrayOfN = aqj.c(), k = arrayOfN.length, m = 0; m < k; ) { aqj.n n1 = arrayOfN[m];
/*  331 */         n1.c = 0;
/*  332 */         this.d.add(n1);
/*      */         m++; }
/*      */     
/*      */     }
/*      */     
/*      */     protected void b(dn ☃) {
/*  338 */       super.b(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  343 */       super.a(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class c
/*      */     extends m
/*      */   {
/*      */     public c() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public c(int ☃, Random random, aqe aqe1, cq cq1) {
/*  357 */       super(☃);
/*      */       
/*  359 */       this.m = cq1;
/*  360 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  365 */       a((aqj.q)☃, list, random, 1, 3, false);
/*      */     }
/*      */     
/*      */     public static c a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/*  369 */       aqe aqe = aqe.a(i, j, k, -1, -3, 0, 5, 10, 19, cq1);
/*      */       
/*  371 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  372 */         return null;
/*      */       }
/*      */       
/*  375 */       return new c(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  381 */       a(☃, aqe1, 0, 3, 0, 4, 4, 18, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  383 */       a(☃, aqe1, 1, 5, 0, 3, 7, 18, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  386 */       a(☃, aqe1, 0, 5, 0, 0, 5, 18, afi.by.Q(), afi.by.Q(), false);
/*  387 */       a(☃, aqe1, 4, 5, 0, 4, 5, 18, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  390 */       a(☃, aqe1, 0, 2, 0, 4, 2, 5, afi.by.Q(), afi.by.Q(), false);
/*  391 */       a(☃, aqe1, 0, 2, 13, 4, 2, 18, afi.by.Q(), afi.by.Q(), false);
/*  392 */       a(☃, aqe1, 0, 0, 0, 4, 1, 3, afi.by.Q(), afi.by.Q(), false);
/*  393 */       a(☃, aqe1, 0, 0, 15, 4, 1, 18, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  395 */       for (int i = 0; i <= 4; i++) {
/*  396 */         for (int j = 0; j <= 2; j++) {
/*  397 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*  398 */           b(☃, afi.by.Q(), i, -1, 18 - j, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/*  402 */       a(☃, aqe1, 0, 1, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
/*  403 */       a(☃, aqe1, 0, 3, 4, 0, 4, 4, afi.bz.Q(), afi.bz.Q(), false);
/*  404 */       a(☃, aqe1, 0, 3, 14, 0, 4, 14, afi.bz.Q(), afi.bz.Q(), false);
/*  405 */       a(☃, aqe1, 0, 1, 17, 0, 4, 17, afi.bz.Q(), afi.bz.Q(), false);
/*  406 */       a(☃, aqe1, 4, 1, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
/*  407 */       a(☃, aqe1, 4, 3, 4, 4, 4, 4, afi.bz.Q(), afi.bz.Q(), false);
/*  408 */       a(☃, aqe1, 4, 3, 14, 4, 4, 14, afi.bz.Q(), afi.bz.Q(), false);
/*  409 */       a(☃, aqe1, 4, 1, 17, 4, 4, 17, afi.bz.Q(), afi.bz.Q(), false);
/*      */       
/*  411 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class b
/*      */     extends m
/*      */   {
/*      */     private int b;
/*      */ 
/*      */     
/*      */     public b() {}
/*      */ 
/*      */     
/*      */     public b(int ☃, Random random, aqe aqe1, cq cq1) {
/*  427 */       super(☃);
/*      */       
/*  429 */       this.m = cq1;
/*  430 */       this.l = aqe1;
/*  431 */       this.b = random.nextInt();
/*      */     }
/*      */     
/*      */     public static b a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/*  435 */       aqe aqe = aqe.a(i, j, k, -1, -3, 0, 5, 10, 8, cq1);
/*      */       
/*  437 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  438 */         return null;
/*      */       }
/*      */       
/*  441 */       return new b(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  446 */       super.b(☃);
/*      */       
/*  448 */       this.b = ☃.f("Seed");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  453 */       super.a(☃);
/*      */       
/*  455 */       ☃.a("Seed", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  460 */       Random random1 = new Random(this.b);
/*      */       
/*      */       int i;
/*  463 */       for (i = 0; i <= 4; i++) {
/*  464 */         for (int j = 3; j <= 4; j++) {
/*  465 */           int k = random1.nextInt(8);
/*  466 */           a(☃, aqe1, i, j, 0, i, j, k, afi.by.Q(), afi.by.Q(), false);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  472 */       i = random1.nextInt(8);
/*  473 */       a(☃, aqe1, 0, 5, 0, 0, 5, i, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  476 */       i = random1.nextInt(8);
/*  477 */       a(☃, aqe1, 4, 5, 0, 4, 5, i, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */ 
/*      */       
/*  481 */       for (i = 0; i <= 4; i++) {
/*  482 */         int j = random1.nextInt(5);
/*  483 */         a(☃, aqe1, i, 2, 0, i, 2, j, afi.by.Q(), afi.by.Q(), false);
/*      */       } 
/*  485 */       for (i = 0; i <= 4; i++) {
/*  486 */         for (int j = 0; j <= 1; j++) {
/*  487 */           int k = random1.nextInt(3);
/*  488 */           a(☃, aqe1, i, j, 0, i, j, k, afi.by.Q(), afi.by.Q(), false);
/*      */         } 
/*      */       } 
/*      */       
/*  492 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class a
/*      */     extends m
/*      */   {
/*      */     public a() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public a(int ☃, Random random, aqe aqe1, cq cq1) {
/*  506 */       super(☃);
/*      */       
/*  508 */       this.m = cq1;
/*  509 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     protected a(Random ☃, int i, int j) {
/*  513 */       super(0);
/*      */       
/*  515 */       this.m = cq.c.a.a(☃);
/*      */       
/*  517 */       switch (aqj.null.a[this.m.ordinal()]) {
/*      */         case 1:
/*      */         case 2:
/*  520 */           this.l = new aqe(i, 64, j, i + 19 - 1, 73, j + 19 - 1);
/*      */           return;
/*      */       } 
/*  523 */       this.l = new aqe(i, 64, j, i + 19 - 1, 73, j + 19 - 1);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  530 */       a((aqj.q)☃, list, random, 8, 3, false);
/*  531 */       b((aqj.q)☃, list, random, 3, 8, false);
/*  532 */       c((aqj.q)☃, list, random, 3, 8, false);
/*      */     }
/*      */     
/*      */     public static a a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/*  536 */       aqe aqe = aqe.a(i, j, k, -8, -3, 0, 19, 10, 19, cq1);
/*      */       
/*  538 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  539 */         return null;
/*      */       }
/*      */       
/*  542 */       return new a(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  548 */       a(☃, aqe1, 7, 3, 0, 11, 4, 18, afi.by.Q(), afi.by.Q(), false);
/*  549 */       a(☃, aqe1, 0, 3, 7, 18, 4, 11, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  551 */       a(☃, aqe1, 8, 5, 0, 10, 7, 18, afi.a.Q(), afi.a.Q(), false);
/*  552 */       a(☃, aqe1, 0, 5, 8, 18, 7, 10, afi.a.Q(), afi.a.Q(), false);
/*      */       
/*  554 */       a(☃, aqe1, 7, 5, 0, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
/*  555 */       a(☃, aqe1, 7, 5, 11, 7, 5, 18, afi.by.Q(), afi.by.Q(), false);
/*  556 */       a(☃, aqe1, 11, 5, 0, 11, 5, 7, afi.by.Q(), afi.by.Q(), false);
/*  557 */       a(☃, aqe1, 11, 5, 11, 11, 5, 18, afi.by.Q(), afi.by.Q(), false);
/*  558 */       a(☃, aqe1, 0, 5, 7, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
/*  559 */       a(☃, aqe1, 11, 5, 7, 18, 5, 7, afi.by.Q(), afi.by.Q(), false);
/*  560 */       a(☃, aqe1, 0, 5, 11, 7, 5, 11, afi.by.Q(), afi.by.Q(), false);
/*  561 */       a(☃, aqe1, 11, 5, 11, 18, 5, 11, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  564 */       a(☃, aqe1, 7, 2, 0, 11, 2, 5, afi.by.Q(), afi.by.Q(), false);
/*  565 */       a(☃, aqe1, 7, 2, 13, 11, 2, 18, afi.by.Q(), afi.by.Q(), false);
/*  566 */       a(☃, aqe1, 7, 0, 0, 11, 1, 3, afi.by.Q(), afi.by.Q(), false);
/*  567 */       a(☃, aqe1, 7, 0, 15, 11, 1, 18, afi.by.Q(), afi.by.Q(), false); int i;
/*  568 */       for (i = 7; i <= 11; i++) {
/*  569 */         for (int j = 0; j <= 2; j++) {
/*  570 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*  571 */           b(☃, afi.by.Q(), i, -1, 18 - j, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/*  575 */       a(☃, aqe1, 0, 2, 7, 5, 2, 11, afi.by.Q(), afi.by.Q(), false);
/*  576 */       a(☃, aqe1, 13, 2, 7, 18, 2, 11, afi.by.Q(), afi.by.Q(), false);
/*  577 */       a(☃, aqe1, 0, 0, 7, 3, 1, 11, afi.by.Q(), afi.by.Q(), false);
/*  578 */       a(☃, aqe1, 15, 0, 7, 18, 1, 11, afi.by.Q(), afi.by.Q(), false);
/*  579 */       for (i = 0; i <= 2; i++) {
/*  580 */         for (int j = 7; j <= 11; j++) {
/*  581 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*  582 */           b(☃, afi.by.Q(), 18 - i, -1, j, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/*  586 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class o
/*      */     extends m
/*      */   {
/*      */     public o() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public o(int ☃, Random random, aqe aqe1, cq cq1) {
/*  600 */       super(☃);
/*      */       
/*  602 */       this.m = cq1;
/*  603 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  608 */       a((aqj.q)☃, list, random, 2, 0, false);
/*  609 */       b((aqj.q)☃, list, random, 0, 2, false);
/*  610 */       c((aqj.q)☃, list, random, 0, 2, false);
/*      */     }
/*      */     
/*      */     public static o a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/*  614 */       aqe aqe = aqe.a(i, j, k, -2, 0, 0, 7, 9, 7, cq1);
/*      */       
/*  616 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  617 */         return null;
/*      */       }
/*      */       
/*  620 */       return new o(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  626 */       a(☃, aqe1, 0, 0, 0, 6, 1, 6, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  628 */       a(☃, aqe1, 0, 2, 0, 6, 7, 6, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  631 */       a(☃, aqe1, 0, 2, 0, 1, 6, 0, afi.by.Q(), afi.by.Q(), false);
/*  632 */       a(☃, aqe1, 0, 2, 6, 1, 6, 6, afi.by.Q(), afi.by.Q(), false);
/*  633 */       a(☃, aqe1, 5, 2, 0, 6, 6, 0, afi.by.Q(), afi.by.Q(), false);
/*  634 */       a(☃, aqe1, 5, 2, 6, 6, 6, 6, afi.by.Q(), afi.by.Q(), false);
/*  635 */       a(☃, aqe1, 0, 2, 0, 0, 6, 1, afi.by.Q(), afi.by.Q(), false);
/*  636 */       a(☃, aqe1, 0, 2, 5, 0, 6, 6, afi.by.Q(), afi.by.Q(), false);
/*  637 */       a(☃, aqe1, 6, 2, 0, 6, 6, 1, afi.by.Q(), afi.by.Q(), false);
/*  638 */       a(☃, aqe1, 6, 2, 5, 6, 6, 6, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  641 */       a(☃, aqe1, 2, 6, 0, 4, 6, 0, afi.by.Q(), afi.by.Q(), false);
/*  642 */       a(☃, aqe1, 2, 5, 0, 4, 5, 0, afi.bz.Q(), afi.bz.Q(), false);
/*  643 */       a(☃, aqe1, 2, 6, 6, 4, 6, 6, afi.by.Q(), afi.by.Q(), false);
/*  644 */       a(☃, aqe1, 2, 5, 6, 4, 5, 6, afi.bz.Q(), afi.bz.Q(), false);
/*  645 */       a(☃, aqe1, 0, 6, 2, 0, 6, 4, afi.by.Q(), afi.by.Q(), false);
/*  646 */       a(☃, aqe1, 0, 5, 2, 0, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
/*  647 */       a(☃, aqe1, 6, 6, 2, 6, 6, 4, afi.by.Q(), afi.by.Q(), false);
/*  648 */       a(☃, aqe1, 6, 5, 2, 6, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
/*      */ 
/*      */       
/*  651 */       for (int i = 0; i <= 6; i++) {
/*  652 */         for (int j = 0; j <= 6; j++) {
/*  653 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*      */         }
/*      */       } 
/*      */       
/*  657 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class p
/*      */     extends m
/*      */   {
/*      */     public p() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public p(int ☃, Random random, aqe aqe1, cq cq1) {
/*  671 */       super(☃);
/*      */       
/*  673 */       this.m = cq1;
/*  674 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  679 */       c((aqj.q)☃, list, random, 6, 2, false);
/*      */     }
/*      */     
/*      */     public static p a(List<aqt> ☃, Random random, int i, int j, int k, int n, cq cq1) {
/*  683 */       aqe aqe = aqe.a(i, j, k, -2, 0, 0, 7, 11, 7, cq1);
/*      */       
/*  685 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  686 */         return null;
/*      */       }
/*      */       
/*  689 */       return new p(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  695 */       a(☃, aqe1, 0, 0, 0, 6, 1, 6, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  697 */       a(☃, aqe1, 0, 2, 0, 6, 10, 6, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  700 */       a(☃, aqe1, 0, 2, 0, 1, 8, 0, afi.by.Q(), afi.by.Q(), false);
/*  701 */       a(☃, aqe1, 5, 2, 0, 6, 8, 0, afi.by.Q(), afi.by.Q(), false);
/*  702 */       a(☃, aqe1, 0, 2, 1, 0, 8, 6, afi.by.Q(), afi.by.Q(), false);
/*  703 */       a(☃, aqe1, 6, 2, 1, 6, 8, 6, afi.by.Q(), afi.by.Q(), false);
/*  704 */       a(☃, aqe1, 1, 2, 6, 5, 8, 6, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  707 */       a(☃, aqe1, 0, 3, 2, 0, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
/*  708 */       a(☃, aqe1, 6, 3, 2, 6, 5, 2, afi.bz.Q(), afi.bz.Q(), false);
/*  709 */       a(☃, aqe1, 6, 3, 4, 6, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
/*      */ 
/*      */       
/*  712 */       a(☃, afi.by.Q(), 5, 2, 5, aqe1);
/*  713 */       a(☃, aqe1, 4, 2, 5, 4, 3, 5, afi.by.Q(), afi.by.Q(), false);
/*  714 */       a(☃, aqe1, 3, 2, 5, 3, 4, 5, afi.by.Q(), afi.by.Q(), false);
/*  715 */       a(☃, aqe1, 2, 2, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
/*  716 */       a(☃, aqe1, 1, 2, 5, 1, 6, 5, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  719 */       a(☃, aqe1, 1, 7, 1, 5, 7, 4, afi.by.Q(), afi.by.Q(), false);
/*  720 */       a(☃, aqe1, 6, 8, 2, 6, 8, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  723 */       a(☃, aqe1, 2, 6, 0, 4, 8, 0, afi.by.Q(), afi.by.Q(), false);
/*  724 */       a(☃, aqe1, 2, 5, 0, 4, 5, 0, afi.bz.Q(), afi.bz.Q(), false);
/*      */       
/*  726 */       for (int i = 0; i <= 6; i++) {
/*  727 */         for (int j = 0; j <= 6; j++) {
/*  728 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*      */         }
/*      */       } 
/*      */       
/*  732 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class l
/*      */     extends m
/*      */   {
/*      */     private boolean b;
/*      */ 
/*      */     
/*      */     public l() {}
/*      */ 
/*      */     
/*      */     public l(int ☃, Random random, aqe aqe1, cq cq1) {
/*  748 */       super(☃);
/*      */       
/*  750 */       this.m = cq1;
/*  751 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/*  756 */       super.b(☃);
/*      */       
/*  758 */       this.b = ☃.n("Mob");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/*  763 */       super.a(☃);
/*      */       
/*  765 */       ☃.a("Mob", this.b);
/*      */     }
/*      */     
/*      */     public static l a(List<aqt> ☃, Random random, int i, int j, int k, int n, cq cq1) {
/*  769 */       aqe aqe = aqe.a(i, j, k, -2, 0, 0, 7, 8, 9, cq1);
/*      */       
/*  771 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  772 */         return null;
/*      */       }
/*      */       
/*  775 */       return new l(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  781 */       a(☃, aqe1, 0, 2, 0, 6, 7, 7, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  784 */       a(☃, aqe1, 1, 0, 0, 5, 1, 7, afi.by.Q(), afi.by.Q(), false);
/*  785 */       a(☃, aqe1, 1, 2, 1, 5, 2, 7, afi.by.Q(), afi.by.Q(), false);
/*  786 */       a(☃, aqe1, 1, 3, 2, 5, 3, 7, afi.by.Q(), afi.by.Q(), false);
/*  787 */       a(☃, aqe1, 1, 4, 3, 5, 4, 7, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  790 */       a(☃, aqe1, 1, 2, 0, 1, 4, 2, afi.by.Q(), afi.by.Q(), false);
/*  791 */       a(☃, aqe1, 5, 2, 0, 5, 4, 2, afi.by.Q(), afi.by.Q(), false);
/*  792 */       a(☃, aqe1, 1, 5, 2, 1, 5, 3, afi.by.Q(), afi.by.Q(), false);
/*  793 */       a(☃, aqe1, 5, 5, 2, 5, 5, 3, afi.by.Q(), afi.by.Q(), false);
/*  794 */       a(☃, aqe1, 0, 5, 3, 0, 5, 8, afi.by.Q(), afi.by.Q(), false);
/*  795 */       a(☃, aqe1, 6, 5, 3, 6, 5, 8, afi.by.Q(), afi.by.Q(), false);
/*  796 */       a(☃, aqe1, 1, 5, 8, 5, 5, 8, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  798 */       a(☃, afi.bz.Q(), 1, 6, 3, aqe1);
/*  799 */       a(☃, afi.bz.Q(), 5, 6, 3, aqe1);
/*  800 */       a(☃, aqe1, 0, 6, 3, 0, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
/*  801 */       a(☃, aqe1, 6, 6, 3, 6, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
/*  802 */       a(☃, aqe1, 1, 6, 8, 5, 7, 8, afi.bz.Q(), afi.bz.Q(), false);
/*  803 */       a(☃, aqe1, 2, 8, 8, 4, 8, 8, afi.bz.Q(), afi.bz.Q(), false);
/*      */       
/*  805 */       if (!this.b) {
/*  806 */         cj cj = new cj(a(3, 5), d(5), b(3, 5));
/*  807 */         if (aqe1.b(cj)) {
/*  808 */           this.b = true;
/*  809 */           ☃.a(cj, afi.ac.Q(), 2);
/*      */           
/*  811 */           akw akw = ☃.s(cj);
/*  812 */           if (akw instanceof all) {
/*  813 */             ((all)akw).b().a("Blaze");
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  819 */       for (int i = 0; i <= 6; i++) {
/*  820 */         for (int j = 0; j <= 6; j++) {
/*  821 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*      */         }
/*      */       } 
/*      */       
/*  825 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class f
/*      */     extends m
/*      */   {
/*      */     public f() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public f(int ☃, Random random, aqe aqe1, cq cq1) {
/*  839 */       super(☃);
/*      */       
/*  841 */       this.m = cq1;
/*  842 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  847 */       a((aqj.q)☃, list, random, 5, 3, true);
/*      */     }
/*      */     
/*      */     public static f a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/*  851 */       aqe aqe = aqe.a(i, j, k, -5, -3, 0, 13, 14, 13, cq1);
/*      */       
/*  853 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  854 */         return null;
/*      */       }
/*      */       
/*  857 */       return new f(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  863 */       a(☃, aqe1, 0, 3, 0, 12, 4, 12, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  865 */       a(☃, aqe1, 0, 5, 0, 12, 13, 12, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  868 */       a(☃, aqe1, 0, 5, 0, 1, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  869 */       a(☃, aqe1, 11, 5, 0, 12, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  870 */       a(☃, aqe1, 2, 5, 11, 4, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  871 */       a(☃, aqe1, 8, 5, 11, 10, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  872 */       a(☃, aqe1, 5, 9, 11, 7, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  873 */       a(☃, aqe1, 2, 5, 0, 4, 12, 1, afi.by.Q(), afi.by.Q(), false);
/*  874 */       a(☃, aqe1, 8, 5, 0, 10, 12, 1, afi.by.Q(), afi.by.Q(), false);
/*  875 */       a(☃, aqe1, 5, 9, 0, 7, 12, 1, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  878 */       a(☃, aqe1, 2, 11, 2, 10, 12, 10, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  881 */       a(☃, aqe1, 5, 8, 0, 7, 8, 0, afi.bz.Q(), afi.bz.Q(), false);
/*      */       
/*      */       int i;
/*  884 */       for (i = 1; i <= 11; i += 2) {
/*  885 */         a(☃, aqe1, i, 10, 0, i, 11, 0, afi.bz.Q(), afi.bz.Q(), false);
/*  886 */         a(☃, aqe1, i, 10, 12, i, 11, 12, afi.bz.Q(), afi.bz.Q(), false);
/*  887 */         a(☃, aqe1, 0, 10, i, 0, 11, i, afi.bz.Q(), afi.bz.Q(), false);
/*  888 */         a(☃, aqe1, 12, 10, i, 12, 11, i, afi.bz.Q(), afi.bz.Q(), false);
/*  889 */         a(☃, afi.by.Q(), i, 13, 0, aqe1);
/*  890 */         a(☃, afi.by.Q(), i, 13, 12, aqe1);
/*  891 */         a(☃, afi.by.Q(), 0, 13, i, aqe1);
/*  892 */         a(☃, afi.by.Q(), 12, 13, i, aqe1);
/*  893 */         a(☃, afi.bz.Q(), i + 1, 13, 0, aqe1);
/*  894 */         a(☃, afi.bz.Q(), i + 1, 13, 12, aqe1);
/*  895 */         a(☃, afi.bz.Q(), 0, 13, i + 1, aqe1);
/*  896 */         a(☃, afi.bz.Q(), 12, 13, i + 1, aqe1);
/*      */       } 
/*  898 */       a(☃, afi.bz.Q(), 0, 13, 0, aqe1);
/*  899 */       a(☃, afi.bz.Q(), 0, 13, 12, aqe1);
/*  900 */       a(☃, afi.bz.Q(), 0, 13, 0, aqe1);
/*  901 */       a(☃, afi.bz.Q(), 12, 13, 0, aqe1);
/*      */ 
/*      */       
/*  904 */       for (i = 3; i <= 9; i += 2) {
/*  905 */         a(☃, aqe1, 1, 7, i, 1, 8, i, afi.bz.Q(), afi.bz.Q(), false);
/*  906 */         a(☃, aqe1, 11, 7, i, 11, 8, i, afi.bz.Q(), afi.bz.Q(), false);
/*      */       } 
/*      */ 
/*      */       
/*  910 */       a(☃, aqe1, 4, 2, 0, 8, 2, 12, afi.by.Q(), afi.by.Q(), false);
/*  911 */       a(☃, aqe1, 0, 2, 4, 12, 2, 8, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  913 */       a(☃, aqe1, 4, 0, 0, 8, 1, 3, afi.by.Q(), afi.by.Q(), false);
/*  914 */       a(☃, aqe1, 4, 0, 9, 8, 1, 12, afi.by.Q(), afi.by.Q(), false);
/*  915 */       a(☃, aqe1, 0, 0, 4, 3, 1, 8, afi.by.Q(), afi.by.Q(), false);
/*  916 */       a(☃, aqe1, 9, 0, 4, 12, 1, 8, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  918 */       for (i = 4; i <= 8; i++) {
/*  919 */         for (int j = 0; j <= 2; j++) {
/*  920 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*  921 */           b(☃, afi.by.Q(), i, -1, 12 - j, aqe1);
/*      */         } 
/*      */       } 
/*  924 */       for (i = 0; i <= 2; i++) {
/*  925 */         for (int j = 4; j <= 8; j++) {
/*  926 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*  927 */           b(☃, afi.by.Q(), 12 - i, -1, j, aqe1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  932 */       a(☃, aqe1, 5, 5, 5, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
/*  933 */       a(☃, aqe1, 6, 1, 6, 6, 4, 6, afi.a.Q(), afi.a.Q(), false);
/*  934 */       a(☃, afi.by.Q(), 6, 0, 6, aqe1);
/*  935 */       a(☃, afi.k.Q(), 6, 5, 6, aqe1);
/*      */       
/*  937 */       cj cj = new cj(a(6, 6), d(5), b(6, 6));
/*  938 */       if (aqe1.b(cj)) {
/*  939 */         ☃.a(afi.k, cj, random);
/*      */       }
/*      */       
/*  942 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class k
/*      */     extends m
/*      */   {
/*      */     public k() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public k(int ☃, Random random, aqe aqe1, cq cq1) {
/*  956 */       super(☃);
/*      */       
/*  958 */       this.m = cq1;
/*  959 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/*  964 */       a((aqj.q)☃, list, random, 5, 3, true);
/*  965 */       a((aqj.q)☃, list, random, 5, 11, true);
/*      */     }
/*      */     
/*      */     public static k a(List<aqt> ☃, Random random, int i, int j, int n, cq cq1, int i1) {
/*  969 */       aqe aqe = aqe.a(i, j, n, -5, -3, 0, 13, 14, 13, cq1);
/*      */       
/*  971 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/*  972 */         return null;
/*      */       }
/*      */       
/*  975 */       return new k(i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  981 */       a(☃, aqe1, 0, 3, 0, 12, 4, 12, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*  983 */       a(☃, aqe1, 0, 5, 0, 12, 13, 12, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/*  986 */       a(☃, aqe1, 0, 5, 0, 1, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  987 */       a(☃, aqe1, 11, 5, 0, 12, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  988 */       a(☃, aqe1, 2, 5, 11, 4, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  989 */       a(☃, aqe1, 8, 5, 11, 10, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  990 */       a(☃, aqe1, 5, 9, 11, 7, 12, 12, afi.by.Q(), afi.by.Q(), false);
/*  991 */       a(☃, aqe1, 2, 5, 0, 4, 12, 1, afi.by.Q(), afi.by.Q(), false);
/*  992 */       a(☃, aqe1, 8, 5, 0, 10, 12, 1, afi.by.Q(), afi.by.Q(), false);
/*  993 */       a(☃, aqe1, 5, 9, 0, 7, 12, 1, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/*  996 */       a(☃, aqe1, 2, 11, 2, 10, 12, 10, afi.by.Q(), afi.by.Q(), false);
/*      */       
/*      */       int i;
/*  999 */       for (i = 1; i <= 11; i += 2) {
/* 1000 */         a(☃, aqe1, i, 10, 0, i, 11, 0, afi.bz.Q(), afi.bz.Q(), false);
/* 1001 */         a(☃, aqe1, i, 10, 12, i, 11, 12, afi.bz.Q(), afi.bz.Q(), false);
/* 1002 */         a(☃, aqe1, 0, 10, i, 0, 11, i, afi.bz.Q(), afi.bz.Q(), false);
/* 1003 */         a(☃, aqe1, 12, 10, i, 12, 11, i, afi.bz.Q(), afi.bz.Q(), false);
/* 1004 */         a(☃, afi.by.Q(), i, 13, 0, aqe1);
/* 1005 */         a(☃, afi.by.Q(), i, 13, 12, aqe1);
/* 1006 */         a(☃, afi.by.Q(), 0, 13, i, aqe1);
/* 1007 */         a(☃, afi.by.Q(), 12, 13, i, aqe1);
/* 1008 */         a(☃, afi.bz.Q(), i + 1, 13, 0, aqe1);
/* 1009 */         a(☃, afi.bz.Q(), i + 1, 13, 12, aqe1);
/* 1010 */         a(☃, afi.bz.Q(), 0, 13, i + 1, aqe1);
/* 1011 */         a(☃, afi.bz.Q(), 12, 13, i + 1, aqe1);
/*      */       } 
/* 1013 */       a(☃, afi.bz.Q(), 0, 13, 0, aqe1);
/* 1014 */       a(☃, afi.bz.Q(), 0, 13, 12, aqe1);
/* 1015 */       a(☃, afi.bz.Q(), 0, 13, 0, aqe1);
/* 1016 */       a(☃, afi.bz.Q(), 12, 13, 0, aqe1);
/*      */ 
/*      */       
/* 1019 */       for (i = 3; i <= 9; i += 2) {
/* 1020 */         a(☃, aqe1, 1, 7, i, 1, 8, i, afi.bz.Q(), afi.bz.Q(), false);
/* 1021 */         a(☃, aqe1, 11, 7, i, 11, 8, i, afi.bz.Q(), afi.bz.Q(), false);
/*      */       } 
/*      */ 
/*      */       
/* 1025 */       i = a(afi.bA, 3); int j;
/* 1026 */       for (j = 0; j <= 6; j++) {
/* 1027 */         int i2 = j + 4;
/* 1028 */         for (int i3 = 5; i3 <= 7; i3++) {
/* 1029 */           a(☃, afi.bA.a(i), i3, 5 + j, i2, aqe1);
/*      */         }
/* 1031 */         if (i2 >= 5 && i2 <= 8) {
/* 1032 */           a(☃, aqe1, 5, 5, i2, 7, j + 4, i2, afi.by.Q(), afi.by.Q(), false);
/* 1033 */         } else if (i2 >= 9 && i2 <= 10) {
/* 1034 */           a(☃, aqe1, 5, 8, i2, 7, j + 4, i2, afi.by.Q(), afi.by.Q(), false);
/*      */         } 
/* 1036 */         if (j >= 1) {
/* 1037 */           a(☃, aqe1, 5, 6 + j, i2, 7, 9 + j, i2, afi.a.Q(), afi.a.Q(), false);
/*      */         }
/*      */       } 
/* 1040 */       for (j = 5; j <= 7; j++) {
/* 1041 */         a(☃, afi.bA.a(i), j, 12, 11, aqe1);
/*      */       }
/* 1043 */       a(☃, aqe1, 5, 6, 7, 5, 7, 7, afi.bz.Q(), afi.bz.Q(), false);
/* 1044 */       a(☃, aqe1, 7, 6, 7, 7, 7, 7, afi.bz.Q(), afi.bz.Q(), false);
/* 1045 */       a(☃, aqe1, 5, 13, 12, 7, 13, 12, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1048 */       a(☃, aqe1, 2, 5, 2, 3, 5, 3, afi.by.Q(), afi.by.Q(), false);
/* 1049 */       a(☃, aqe1, 2, 5, 9, 3, 5, 10, afi.by.Q(), afi.by.Q(), false);
/* 1050 */       a(☃, aqe1, 2, 5, 4, 2, 5, 8, afi.by.Q(), afi.by.Q(), false);
/* 1051 */       a(☃, aqe1, 9, 5, 2, 10, 5, 3, afi.by.Q(), afi.by.Q(), false);
/* 1052 */       a(☃, aqe1, 9, 5, 9, 10, 5, 10, afi.by.Q(), afi.by.Q(), false);
/* 1053 */       a(☃, aqe1, 10, 5, 4, 10, 5, 8, afi.by.Q(), afi.by.Q(), false);
/* 1054 */       j = a(afi.bA, 0);
/* 1055 */       int n = a(afi.bA, 1);
/* 1056 */       a(☃, afi.bA.a(n), 4, 5, 2, aqe1);
/* 1057 */       a(☃, afi.bA.a(n), 4, 5, 3, aqe1);
/* 1058 */       a(☃, afi.bA.a(n), 4, 5, 9, aqe1);
/* 1059 */       a(☃, afi.bA.a(n), 4, 5, 10, aqe1);
/* 1060 */       a(☃, afi.bA.a(j), 8, 5, 2, aqe1);
/* 1061 */       a(☃, afi.bA.a(j), 8, 5, 3, aqe1);
/* 1062 */       a(☃, afi.bA.a(j), 8, 5, 9, aqe1);
/* 1063 */       a(☃, afi.bA.a(j), 8, 5, 10, aqe1);
/*      */ 
/*      */       
/* 1066 */       a(☃, aqe1, 3, 4, 4, 4, 4, 8, afi.aW.Q(), afi.aW.Q(), false);
/* 1067 */       a(☃, aqe1, 8, 4, 4, 9, 4, 8, afi.aW.Q(), afi.aW.Q(), false);
/* 1068 */       a(☃, aqe1, 3, 5, 4, 4, 5, 8, afi.bB.Q(), afi.bB.Q(), false);
/* 1069 */       a(☃, aqe1, 8, 5, 4, 9, 5, 8, afi.bB.Q(), afi.bB.Q(), false);
/*      */ 
/*      */       
/* 1072 */       a(☃, aqe1, 4, 2, 0, 8, 2, 12, afi.by.Q(), afi.by.Q(), false);
/* 1073 */       a(☃, aqe1, 0, 2, 4, 12, 2, 8, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1075 */       a(☃, aqe1, 4, 0, 0, 8, 1, 3, afi.by.Q(), afi.by.Q(), false);
/* 1076 */       a(☃, aqe1, 4, 0, 9, 8, 1, 12, afi.by.Q(), afi.by.Q(), false);
/* 1077 */       a(☃, aqe1, 0, 0, 4, 3, 1, 8, afi.by.Q(), afi.by.Q(), false);
/* 1078 */       a(☃, aqe1, 9, 0, 4, 12, 1, 8, afi.by.Q(), afi.by.Q(), false);
/*      */       int i1;
/* 1080 */       for (i1 = 4; i1 <= 8; i1++) {
/* 1081 */         for (int i2 = 0; i2 <= 2; i2++) {
/* 1082 */           b(☃, afi.by.Q(), i1, -1, i2, aqe1);
/* 1083 */           b(☃, afi.by.Q(), i1, -1, 12 - i2, aqe1);
/*      */         } 
/*      */       } 
/* 1086 */       for (i1 = 0; i1 <= 2; i1++) {
/* 1087 */         for (int i2 = 4; i2 <= 8; i2++) {
/* 1088 */           b(☃, afi.by.Q(), i1, -1, i2, aqe1);
/* 1089 */           b(☃, afi.by.Q(), 12 - i1, -1, i2, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1093 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class i
/*      */     extends m
/*      */   {
/*      */     public i() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public i(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1107 */       super(☃);
/*      */       
/* 1109 */       this.m = cq1;
/* 1110 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1115 */       a((aqj.q)☃, list, random, 1, 0, true);
/*      */     }
/*      */     
/*      */     public static i a(List<aqt> ☃, Random random, int j, int k, int n, cq cq1, int i1) {
/* 1119 */       aqe aqe = aqe.a(j, k, n, -1, 0, 0, 5, 7, 5, cq1);
/*      */       
/* 1121 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1122 */         return null;
/*      */       }
/*      */       
/* 1125 */       return new i(i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1131 */       a(☃, aqe1, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1133 */       a(☃, aqe1, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1136 */       a(☃, aqe1, 0, 2, 0, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1137 */       a(☃, aqe1, 4, 2, 0, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1138 */       a(☃, aqe1, 0, 3, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
/* 1139 */       a(☃, aqe1, 0, 3, 3, 0, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
/* 1140 */       a(☃, aqe1, 4, 3, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
/* 1141 */       a(☃, aqe1, 4, 3, 3, 4, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
/*      */ 
/*      */       
/* 1144 */       a(☃, aqe1, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/* 1147 */       for (int j = 0; j <= 4; j++) {
/* 1148 */         for (int k = 0; k <= 4; k++) {
/* 1149 */           b(☃, afi.by.Q(), j, -1, k, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1153 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class g
/*      */     extends m
/*      */   {
/*      */     public g() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public g(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1167 */       super(☃);
/*      */       
/* 1169 */       this.m = cq1;
/* 1170 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1175 */       a((aqj.q)☃, list, random, 1, 0, true);
/* 1176 */       b((aqj.q)☃, list, random, 0, 1, true);
/* 1177 */       c((aqj.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static g a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/* 1181 */       aqe aqe = aqe.a(i, j, k, -1, 0, 0, 5, 7, 5, cq1);
/*      */       
/* 1183 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1184 */         return null;
/*      */       }
/*      */       
/* 1187 */       return new g(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1193 */       a(☃, aqe1, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1195 */       a(☃, aqe1, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1198 */       a(☃, aqe1, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
/* 1199 */       a(☃, aqe1, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
/* 1200 */       a(☃, aqe1, 0, 2, 4, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1201 */       a(☃, aqe1, 4, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/* 1204 */       a(☃, aqe1, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/* 1207 */       for (int i = 0; i <= 4; i++) {
/* 1208 */         for (int j = 0; j <= 4; j++) {
/* 1209 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1213 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class j
/*      */     extends m
/*      */   {
/*      */     private boolean b;
/*      */ 
/*      */     
/*      */     public j() {}
/*      */ 
/*      */     
/*      */     public j(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1229 */       super(☃);
/*      */       
/* 1231 */       this.m = cq1;
/* 1232 */       this.l = aqe1;
/*      */       
/* 1234 */       this.b = (random.nextInt(3) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1239 */       super.b(☃);
/*      */       
/* 1241 */       this.b = ☃.n("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1246 */       super.a(☃);
/*      */       
/* 1248 */       ☃.a("Chest", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1253 */       c((aqj.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static j a(List<aqt> ☃, Random random, int i, int k, int n, cq cq1, int i1) {
/* 1257 */       aqe aqe = aqe.a(i, k, n, -1, 0, 0, 5, 7, 5, cq1);
/*      */       
/* 1259 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1260 */         return null;
/*      */       }
/*      */       
/* 1263 */       return new j(i1, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1269 */       a(☃, aqe1, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1271 */       a(☃, aqe1, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1274 */       a(☃, aqe1, 0, 2, 0, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1275 */       a(☃, aqe1, 0, 3, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
/* 1276 */       a(☃, aqe1, 0, 3, 3, 0, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
/*      */       
/* 1278 */       a(☃, aqe1, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1280 */       a(☃, aqe1, 1, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1281 */       a(☃, aqe1, 1, 3, 4, 1, 4, 4, afi.bz.Q(), afi.by.Q(), false);
/* 1282 */       a(☃, aqe1, 3, 3, 4, 3, 4, 4, afi.bz.Q(), afi.by.Q(), false);
/*      */       
/* 1284 */       if (this.b && 
/* 1285 */         aqe1.b(new cj(a(1, 3), d(2), b(1, 3)))) {
/* 1286 */         this.b = false;
/* 1287 */         a(☃, aqe1, random, 1, 2, 3, a, 2 + random.nextInt(4));
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1292 */       a(☃, aqe1, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/* 1295 */       for (int i = 0; i <= 4; i++) {
/* 1296 */         for (int k = 0; k <= 4; k++) {
/* 1297 */           b(☃, afi.by.Q(), i, -1, k, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1301 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends m
/*      */   {
/*      */     private boolean b;
/*      */ 
/*      */     
/*      */     public h() {}
/*      */ 
/*      */     
/*      */     public h(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1317 */       super(☃);
/*      */       
/* 1319 */       this.m = cq1;
/* 1320 */       this.l = aqe1;
/*      */       
/* 1322 */       this.b = (random.nextInt(3) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {
/* 1327 */       super.b(☃);
/*      */       
/* 1329 */       this.b = ☃.n("Chest");
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {
/* 1334 */       super.a(☃);
/*      */       
/* 1336 */       ☃.a("Chest", this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1341 */       b((aqj.q)☃, list, random, 0, 1, true);
/*      */     }
/*      */     
/*      */     public static h a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/* 1345 */       aqe aqe = aqe.a(i, j, k, -1, 0, 0, 5, 7, 5, cq1);
/*      */       
/* 1347 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1348 */         return null;
/*      */       }
/*      */       
/* 1351 */       return new h(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1357 */       a(☃, aqe1, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1359 */       a(☃, aqe1, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1362 */       a(☃, aqe1, 4, 2, 0, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1363 */       a(☃, aqe1, 4, 3, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
/* 1364 */       a(☃, aqe1, 4, 3, 3, 4, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
/*      */       
/* 1366 */       a(☃, aqe1, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1368 */       a(☃, aqe1, 0, 2, 4, 3, 5, 4, afi.by.Q(), afi.by.Q(), false);
/* 1369 */       a(☃, aqe1, 1, 3, 4, 1, 4, 4, afi.bz.Q(), afi.by.Q(), false);
/* 1370 */       a(☃, aqe1, 3, 3, 4, 3, 4, 4, afi.bz.Q(), afi.by.Q(), false);
/*      */       
/* 1372 */       if (this.b && 
/* 1373 */         aqe1.b(new cj(a(3, 3), d(2), b(3, 3)))) {
/* 1374 */         this.b = false;
/* 1375 */         a(☃, aqe1, random, 3, 2, 3, a, 2 + random.nextInt(4));
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1380 */       a(☃, aqe1, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/* 1383 */       for (int i = 0; i <= 4; i++) {
/* 1384 */         for (int j = 0; j <= 4; j++) {
/* 1385 */           b(☃, afi.by.Q(), i, -1, j, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1389 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class d
/*      */     extends m
/*      */   {
/*      */     public d() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public d(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1403 */       super(☃);
/*      */       
/* 1405 */       this.m = cq1;
/* 1406 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1411 */       a((aqj.q)☃, list, random, 1, 0, true);
/*      */     }
/*      */     
/*      */     public static d a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/* 1415 */       aqe aqe = aqe.a(i, j, k, -1, -7, 0, 5, 14, 10, cq1);
/*      */       
/* 1417 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1418 */         return null;
/*      */       }
/*      */       
/* 1421 */       return new d(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1427 */       int i = a(afi.bA, 2);
/* 1428 */       for (int j = 0; j <= 9; j++) {
/* 1429 */         int k = Math.max(1, 7 - j);
/* 1430 */         int n = Math.min(Math.max(k + 5, 14 - j), 13);
/* 1431 */         int i1 = j;
/*      */ 
/*      */         
/* 1434 */         a(☃, aqe1, 0, 0, i1, 4, k, i1, afi.by.Q(), afi.by.Q(), false);
/*      */         
/* 1436 */         a(☃, aqe1, 1, k + 1, i1, 3, n - 1, i1, afi.a.Q(), afi.a.Q(), false);
/* 1437 */         if (j <= 6) {
/* 1438 */           a(☃, afi.bA.a(i), 1, k + 1, i1, aqe1);
/* 1439 */           a(☃, afi.bA.a(i), 2, k + 1, i1, aqe1);
/* 1440 */           a(☃, afi.bA.a(i), 3, k + 1, i1, aqe1);
/*      */         } 
/*      */         
/* 1443 */         a(☃, aqe1, 0, n, i1, 4, n, i1, afi.by.Q(), afi.by.Q(), false);
/*      */         
/* 1445 */         a(☃, aqe1, 0, k + 1, i1, 0, n - 1, i1, afi.by.Q(), afi.by.Q(), false);
/* 1446 */         a(☃, aqe1, 4, k + 1, i1, 4, n - 1, i1, afi.by.Q(), afi.by.Q(), false);
/* 1447 */         if ((j & 0x1) == 0) {
/* 1448 */           a(☃, aqe1, 0, k + 2, i1, 0, k + 3, i1, afi.bz.Q(), afi.bz.Q(), false);
/* 1449 */           a(☃, aqe1, 4, k + 2, i1, 4, k + 3, i1, afi.bz.Q(), afi.bz.Q(), false);
/*      */         } 
/*      */ 
/*      */         
/* 1453 */         for (int i2 = 0; i2 <= 4; i2++) {
/* 1454 */           b(☃, afi.by.Q(), i2, -1, i1, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1458 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class e
/*      */     extends m
/*      */   {
/*      */     public e() {}
/*      */ 
/*      */ 
/*      */     
/*      */     public e(int ☃, Random random, aqe aqe1, cq cq1) {
/* 1472 */       super(☃);
/*      */       
/* 1474 */       this.m = cq1;
/* 1475 */       this.l = aqe1;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(aqt ☃, List<aqt> list, Random random) {
/* 1480 */       int i = 1;
/*      */       
/* 1482 */       if (this.m == cq.e || this.m == cq.c) {
/* 1483 */         i = 5;
/*      */       }
/*      */       
/* 1486 */       b((aqj.q)☃, list, random, 0, i, (random.nextInt(8) > 0));
/* 1487 */       c((aqj.q)☃, list, random, 0, i, (random.nextInt(8) > 0));
/*      */     }
/*      */     
/*      */     public static e a(List<aqt> ☃, Random random, int i, int j, int k, cq cq1, int n) {
/* 1491 */       aqe aqe = aqe.a(i, j, k, -3, 0, 0, 9, 7, 9, cq1);
/*      */       
/* 1493 */       if (!a(aqe) || aqt.a(☃, aqe) != null) {
/* 1494 */         return null;
/*      */       }
/*      */       
/* 1497 */       return new e(n, random, aqe, cq1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1503 */       a(☃, aqe1, 0, 0, 0, 8, 1, 8, afi.by.Q(), afi.by.Q(), false);
/*      */       
/* 1505 */       a(☃, aqe1, 0, 2, 0, 8, 5, 8, afi.a.Q(), afi.a.Q(), false);
/*      */       
/* 1507 */       a(☃, aqe1, 0, 6, 0, 8, 6, 5, afi.by.Q(), afi.by.Q(), false);
/*      */ 
/*      */       
/* 1510 */       a(☃, aqe1, 0, 2, 0, 2, 5, 0, afi.by.Q(), afi.by.Q(), false);
/* 1511 */       a(☃, aqe1, 6, 2, 0, 8, 5, 0, afi.by.Q(), afi.by.Q(), false);
/* 1512 */       a(☃, aqe1, 1, 3, 0, 1, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
/* 1513 */       a(☃, aqe1, 7, 3, 0, 7, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
/*      */ 
/*      */       
/* 1516 */       a(☃, aqe1, 0, 2, 4, 8, 2, 8, afi.by.Q(), afi.by.Q(), false);
/* 1517 */       a(☃, aqe1, 1, 1, 4, 2, 2, 4, afi.a.Q(), afi.a.Q(), false);
/* 1518 */       a(☃, aqe1, 6, 1, 4, 7, 2, 4, afi.a.Q(), afi.a.Q(), false);
/*      */ 
/*      */       
/* 1521 */       a(☃, aqe1, 0, 3, 8, 8, 3, 8, afi.bz.Q(), afi.bz.Q(), false);
/* 1522 */       a(☃, aqe1, 0, 3, 6, 0, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
/* 1523 */       a(☃, aqe1, 8, 3, 6, 8, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
/*      */ 
/*      */       
/* 1526 */       a(☃, aqe1, 0, 3, 4, 0, 5, 5, afi.by.Q(), afi.by.Q(), false);
/* 1527 */       a(☃, aqe1, 8, 3, 4, 8, 5, 5, afi.by.Q(), afi.by.Q(), false);
/* 1528 */       a(☃, aqe1, 1, 3, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
/* 1529 */       a(☃, aqe1, 6, 3, 5, 7, 5, 5, afi.by.Q(), afi.by.Q(), false);
/* 1530 */       a(☃, aqe1, 1, 4, 5, 1, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
/* 1531 */       a(☃, aqe1, 7, 4, 5, 7, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
/*      */ 
/*      */       
/* 1534 */       for (int i = 0; i <= 5; i++) {
/* 1535 */         for (int j = 0; j <= 8; j++) {
/* 1536 */           b(☃, afi.by.Q(), j, -1, i, aqe1);
/*      */         }
/*      */       } 
/*      */       
/* 1540 */       return true;
/*      */     }
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */