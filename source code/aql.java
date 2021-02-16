/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Collections;
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
/*      */ public class aql
/*      */ {
/*      */   public static void a() {
/*   21 */     aqr.a((Class)h.class, "OMB");
/*   22 */     aqr.a((Class)j.class, "OMCR");
/*   23 */     aqr.a((Class)k.class, "OMDXR");
/*   24 */     aqr.a((Class)l.class, "OMDXYR");
/*   25 */     aqr.a((Class)m.class, "OMDYR");
/*   26 */     aqr.a((Class)n.class, "OMDYZR");
/*   27 */     aqr.a((Class)o.class, "OMDZR");
/*   28 */     aqr.a((Class)p.class, "OMEntry");
/*   29 */     aqr.a((Class)q.class, "OMPenthouse");
/*   30 */     aqr.a((Class)s.class, "OMSimple");
/*   31 */     aqr.a((Class)t.class, "OMSimpleT");
/*      */   }
/*      */ 
/*      */   
/*      */   public static abstract class r
/*      */     extends aqt
/*      */   {
/*   38 */     protected static final alz a = afi.cI.a(aiu.b);
/*   39 */     protected static final alz b = afi.cI.a(aiu.N);
/*   40 */     protected static final alz c = afi.cI.a(aiu.O);
/*      */     
/*   42 */     protected static final alz d = b;
/*      */     
/*   44 */     protected static final alz e = afi.cJ.Q();
/*      */ 
/*      */     
/*   47 */     protected static final alz f = afi.j.Q();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   58 */     protected static final int g = b(2, 0, 0);
/*   59 */     protected static final int h = b(2, 2, 0);
/*   60 */     protected static final int i = b(0, 1, 0);
/*   61 */     protected static final int j = b(4, 1, 0);
/*      */ 
/*      */ 
/*      */     
/*      */     protected aql.v k;
/*      */ 
/*      */ 
/*      */     
/*      */     protected static final int b(int ☃, int i, int j) {
/*   70 */       return i * 25 + j * 5 + ☃;
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
/*      */ 
/*      */ 
/*      */     
/*      */     public r() {
/*   88 */       super(0);
/*      */     }
/*      */     
/*      */     public r(int ☃) {
/*   92 */       super(☃);
/*      */     }
/*      */     
/*      */     public r(cq ☃, aqe aqe1) {
/*   96 */       super(1);
/*   97 */       this.m = ☃;
/*   98 */       this.l = aqe1;
/*      */     }
/*      */     
/*      */     protected r(int ☃, cq cq1, aql.v v1, int i, int j, int k) {
/*  102 */       super(☃);
/*  103 */       this.m = cq1;
/*  104 */       this.k = v1;
/*      */       
/*  106 */       int m = v1.a;
/*  107 */       int n = m % 5;
/*  108 */       int i1 = m / 5 % 5;
/*  109 */       int i2 = m / 25;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  114 */       if (cq1 == cq.c || cq1 == cq.d) {
/*  115 */         this.l = new aqe(0, 0, 0, i * 8 - 1, j * 4 - 1, k * 8 - 1);
/*      */       } else {
/*      */         
/*  118 */         this.l = new aqe(0, 0, 0, k * 8 - 1, j * 4 - 1, i * 8 - 1);
/*      */       } 
/*      */       
/*  121 */       switch (aql.null.a[cq1.ordinal()]) {
/*      */         case 1:
/*  123 */           this.l.a(n * 8, i2 * 4, -(i1 + k) * 8 + 1);
/*      */           return;
/*      */         
/*      */         case 2:
/*  127 */           this.l.a(n * 8, i2 * 4, i1 * 8);
/*      */           return;
/*      */         case 3:
/*  130 */           this.l.a(-(i1 + k) * 8 + 1, i2 * 4, n * 8);
/*      */           return;
/*      */       } 
/*  133 */       this.l.a(i1 * 8, i2 * 4, n * 8);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected void a(dn ☃) {}
/*      */ 
/*      */ 
/*      */     
/*      */     protected void b(dn ☃) {}
/*      */ 
/*      */ 
/*      */     
/*      */     protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, boolean bool) {
/*  147 */       for (int i2 = j; i2 <= n; i2++) {
/*  148 */         for (int i3 = i; i3 <= m; i3++) {
/*  149 */           for (int i4 = k; i4 <= i1; i4++) {
/*  150 */             if (!bool || a(☃, i3, i2, i4, aqe1).c().t() != arm.a)
/*      */             {
/*      */               
/*  153 */               if (d(i2) >= ☃.F()) {
/*  154 */                 a(☃, afi.a.Q(), i3, i2, i4, aqe1);
/*      */               } else {
/*  156 */                 a(☃, f, i3, i2, i4, aqe1);
/*      */               }  } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     protected void a(adm ☃, aqe aqe1, int i, int j, boolean bool) {
/*  164 */       if (bool) {
/*  165 */         a(☃, aqe1, i + 0, 0, j + 0, i + 2, 0, j + 8 - 1, a, a, false);
/*  166 */         a(☃, aqe1, i + 5, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*  167 */         a(☃, aqe1, i + 3, 0, j + 0, i + 4, 0, j + 2, a, a, false);
/*  168 */         a(☃, aqe1, i + 3, 0, j + 5, i + 4, 0, j + 8 - 1, a, a, false);
/*      */         
/*  170 */         a(☃, aqe1, i + 3, 0, j + 2, i + 4, 0, j + 2, b, b, false);
/*  171 */         a(☃, aqe1, i + 3, 0, j + 5, i + 4, 0, j + 5, b, b, false);
/*  172 */         a(☃, aqe1, i + 2, 0, j + 3, i + 2, 0, j + 4, b, b, false);
/*  173 */         a(☃, aqe1, i + 5, 0, j + 3, i + 5, 0, j + 4, b, b, false);
/*      */       } else {
/*  175 */         a(☃, aqe1, i + 0, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*      */       } 
/*      */     }
/*      */     
/*      */     protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, alz alz1) {
/*  180 */       for (int i2 = j; i2 <= n; i2++) {
/*  181 */         for (int i3 = i; i3 <= m; i3++) {
/*  182 */           for (int i4 = k; i4 <= i1; i4++) {
/*  183 */             if (a(☃, i3, i2, i4, aqe1) == f)
/*      */             {
/*      */               
/*  186 */               a(☃, alz1, i3, i2, i4, aqe1); } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     protected boolean a(aqe ☃, int i, int j, int k, int m) {
/*  193 */       int n = a(i, j);
/*  194 */       int i1 = b(i, j);
/*  195 */       int i2 = a(k, m);
/*  196 */       int i3 = b(k, m);
/*  197 */       return ☃.a(Math.min(n, i2), Math.min(i1, i3), Math.max(n, i2), Math.max(i1, i3));
/*      */     }
/*      */     
/*      */     protected boolean a(adm ☃, aqe aqe1, int i, int j, int k) {
/*  201 */       int m = a(i, k);
/*  202 */       int n = d(j);
/*  203 */       int i1 = b(i, k);
/*      */       
/*  205 */       if (aqe1.b(new cj(m, n, i1))) {
/*  206 */         vt vt = new vt(☃);
/*  207 */         vt.a(true);
/*  208 */         vt.h(vt.bu());
/*  209 */         vt.b(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/*  210 */         vt.a(☃.E(new cj(vt)), (pu)null);
/*  211 */         ☃.d(vt);
/*  212 */         return true;
/*      */       } 
/*  214 */       return false;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class h
/*      */     extends r
/*      */   {
/*      */     private aql.v o;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private aql.v p;
/*      */ 
/*      */ 
/*      */     
/*  234 */     private List<aql.r> q = Lists.newArrayList();
/*      */ 
/*      */ 
/*      */     
/*      */     public h() {}
/*      */ 
/*      */     
/*      */     public h(Random ☃, int i, int j, cq cq1) {
/*  242 */       super(0);
/*      */       
/*  244 */       this.m = cq1;
/*      */       
/*  246 */       switch (aql.null.a[this.m.ordinal()]) {
/*      */         case 1:
/*      */         case 2:
/*  249 */           this.l = new aqe(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*      */           break;
/*      */         default:
/*  252 */           this.l = new aqe(i, 39, j, i + 58 - 1, 61, j + 58 - 1);
/*      */           break;
/*      */       } 
/*      */       
/*  256 */       List<aql.v> list = a(☃);
/*      */       
/*  258 */       this.o.d = true;
/*  259 */       this.q.add(new aql.p(this.m, this.o));
/*  260 */       this.q.add(new aql.j(this.m, this.p, ☃));
/*      */       
/*  262 */       List<aql.i> list1 = Lists.newArrayList();
/*  263 */       list1.add(new aql.b());
/*  264 */       list1.add(new aql.d());
/*  265 */       list1.add(new aql.e());
/*  266 */       list1.add(new aql.a());
/*  267 */       list1.add(new aql.c());
/*  268 */       list1.add(new aql.g());
/*  269 */       list1.add(new aql.f());
/*      */       
/*  271 */       for (Iterator<aql.v> iterator = list.iterator(); iterator.hasNext(); ) { aql.v v1 = iterator.next();
/*  272 */         if (!v1.d && !v1.b())
/*      */         {
/*  274 */           for (Iterator<aql.i> iterator2 = list1.iterator(); iterator2.hasNext(); ) { aql.i i2 = iterator2.next();
/*  275 */             if (i2.a(v1)) {
/*  276 */               this.q.add(i2.a(this.m, v1, ☃));
/*      */             } }
/*      */         
/*      */         } }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  284 */       int k = this.l.b;
/*  285 */       int m = a(9, 22);
/*  286 */       int n = b(9, 22);
/*  287 */       for (Iterator<aql.r> iterator1 = this.q.iterator(); iterator1.hasNext(); ) { aql.r r1 = iterator1.next();
/*  288 */         r1.c().a(m, k, n); }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  293 */       aqe aqe1 = aqe.a(a(1, 1), d(1), b(1, 1), a(23, 21), d(8), b(23, 21));
/*  294 */       aqe aqe2 = aqe.a(a(34, 1), d(1), b(34, 1), a(56, 21), d(8), b(56, 21));
/*  295 */       aqe aqe3 = aqe.a(a(22, 22), d(13), b(22, 22), a(35, 35), d(17), b(35, 35));
/*      */ 
/*      */       
/*  298 */       int i1 = ☃.nextInt();
/*  299 */       this.q.add(new aql.u(this.m, aqe1, i1++));
/*  300 */       this.q.add(new aql.u(this.m, aqe2, i1++));
/*      */       
/*  302 */       this.q.add(new aql.q(this.m, aqe3));
/*      */     }
/*      */ 
/*      */     
/*      */     private List<aql.v> a(Random ☃) {
/*  307 */       aql.v[] arrayOfV1 = new aql.v[75];
/*      */       int i;
/*  309 */       for (i = 0; i < 5; i++) {
/*  310 */         for (int n = 0; n < 4; n++) {
/*  311 */           int i1 = 0;
/*  312 */           int i2 = b(i, i1, n);
/*  313 */           arrayOfV1[i2] = new aql.v(i2);
/*      */         } 
/*      */       } 
/*  316 */       for (i = 0; i < 5; i++) {
/*  317 */         for (int n = 0; n < 4; n++) {
/*  318 */           int i1 = 1;
/*  319 */           int i2 = b(i, i1, n);
/*  320 */           arrayOfV1[i2] = new aql.v(i2);
/*      */         } 
/*      */       } 
/*  323 */       for (i = 1; i < 4; i++) {
/*  324 */         for (int n = 0; n < 2; n++) {
/*  325 */           int i1 = 2;
/*  326 */           int i2 = b(i, i1, n);
/*  327 */           arrayOfV1[i2] = new aql.v(i2);
/*      */         } 
/*      */       } 
/*      */       
/*  331 */       this.o = arrayOfV1[g];
/*      */       
/*  333 */       for (i = 0; i < 5; i++) {
/*  334 */         for (int n = 0; n < 5; n++) {
/*  335 */           for (int i1 = 0; i1 < 3; i1++) {
/*  336 */             int i2 = b(i, i1, n);
/*  337 */             if (arrayOfV1[i2] != null) {
/*      */               cq[] arrayOfCq; int i3;
/*      */               int i4;
/*  340 */               for (arrayOfCq = cq.values(), i3 = arrayOfCq.length, i4 = 0; i4 < i3; ) { cq cq = arrayOfCq[i4];
/*  341 */                 int i5 = i + cq.g();
/*  342 */                 int i6 = i1 + cq.h();
/*  343 */                 int i7 = n + cq.i();
/*  344 */                 if (i5 >= 0 && i5 < 5 && i7 >= 0 && i7 < 5 && i6 >= 0 && i6 < 3) {
/*  345 */                   int i8 = b(i5, i6, i7);
/*  346 */                   if (arrayOfV1[i8] != null)
/*      */                   {
/*      */                     
/*  349 */                     if (i7 != n) {
/*  350 */                       arrayOfV1[i2].a(cq.d(), arrayOfV1[i8]);
/*      */                     } else {
/*  352 */                       arrayOfV1[i2].a(cq, arrayOfV1[i8]);
/*      */                     }  } 
/*      */                 }  i4++; }
/*      */             
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       aql.v v1;
/*  361 */       arrayOfV1[h].a(cq.b, v1 = new aql.v(1003)); aql.v v2;
/*  362 */       arrayOfV1[i].a(cq.d, v2 = new aql.v(1001)); aql.v v3;
/*  363 */       arrayOfV1[j].a(cq.d, v3 = new aql.v(1002));
/*  364 */       v1.d = true;
/*  365 */       v2.d = true;
/*  366 */       v3.d = true;
/*  367 */       this.o.e = true;
/*      */ 
/*      */       
/*  370 */       this.p = arrayOfV1[b(☃.nextInt(4), 0, 2)];
/*  371 */       this.p.d = true;
/*  372 */       (this.p.b[cq.f.a()]).d = true;
/*  373 */       (this.p.b[cq.c.a()]).d = true;
/*  374 */       ((this.p.b[cq.f.a()]).b[cq.c.a()]).d = true;
/*  375 */       (this.p.b[cq.b.a()]).d = true;
/*  376 */       ((this.p.b[cq.f.a()]).b[cq.b.a()]).d = true;
/*  377 */       ((this.p.b[cq.c.a()]).b[cq.b.a()]).d = true;
/*  378 */       (((this.p.b[cq.f.a()]).b[cq.c.a()]).b[cq.b.a()]).d = true;
/*      */       
/*  380 */       List<aql.v> list = Lists.newArrayList(); aql.v[] arrayOfV2; int k, m;
/*  381 */       for (arrayOfV2 = arrayOfV1, k = arrayOfV2.length, m = 0; m < k; ) { aql.v v4 = arrayOfV2[m];
/*  382 */         if (v4 != null) {
/*  383 */           v4.a();
/*  384 */           list.add(v4);
/*      */         }  m++; }
/*      */       
/*  387 */       v1.a();
/*      */       
/*  389 */       Collections.shuffle(list, ☃);
/*  390 */       int j = 1;
/*  391 */       for (Iterator<aql.v> iterator = list.iterator(); iterator.hasNext(); ) { aql.v v4 = iterator.next();
/*      */         
/*  393 */         int n = 0;
/*  394 */         int i1 = 0;
/*  395 */         while (n < 2 && i1 < 5) {
/*  396 */           i1++;
/*      */           
/*  398 */           int i2 = ☃.nextInt(6);
/*  399 */           if (v4.c[i2]) {
/*  400 */             int i3 = cq.a(i2).d().a();
/*      */ 
/*      */             
/*  403 */             v4.c[i2] = false;
/*  404 */             (v4.b[i2]).c[i3] = false;
/*      */             
/*  406 */             if (v4.a(j++) && v4.b[i2].a(j++)) {
/*  407 */               n++;
/*      */               continue;
/*      */             } 
/*  410 */             v4.c[i2] = true;
/*  411 */             (v4.b[i2]).c[i3] = true;
/*      */           } 
/*      */         }  }
/*      */ 
/*      */       
/*  416 */       list.add(v1);
/*  417 */       list.add(v2);
/*  418 */       list.add(v3);
/*      */       
/*  420 */       return list;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  426 */       int i = Math.max(☃.F(), 64) - this.l.b;
/*      */       
/*  428 */       a(☃, aqe1, 0, 0, 0, 58, i, 58, false);
/*      */ 
/*      */       
/*  431 */       a(false, 0, ☃, random, aqe1);
/*      */ 
/*      */       
/*  434 */       a(true, 33, ☃, random, aqe1);
/*      */ 
/*      */       
/*  437 */       b(☃, random, aqe1);
/*      */       
/*  439 */       c(☃, random, aqe1);
/*  440 */       d(☃, random, aqe1);
/*      */       
/*  442 */       e(☃, random, aqe1);
/*  443 */       f(☃, random, aqe1);
/*  444 */       g(☃, random, aqe1);
/*      */       
/*      */       int j;
/*  447 */       for (j = 0; j < 7; j++) {
/*  448 */         for (int k = 0; k < 7; ) {
/*  449 */           if (k == 0 && j == 3)
/*      */           {
/*  451 */             k = 6;
/*      */           }
/*      */           
/*  454 */           int m = j * 9;
/*  455 */           int n = k * 9;
/*  456 */           for (int i1 = 0; i1 < 4; i1++) {
/*  457 */             for (int i2 = 0; i2 < 4; i2++) {
/*  458 */               a(☃, b, m + i1, 0, n + i2, aqe1);
/*  459 */               b(☃, b, m + i1, -1, n + i2, aqe1);
/*      */             } 
/*      */           } 
/*      */           
/*  463 */           if (j == 0 || j == 6) {
/*  464 */             k++; continue;
/*      */           } 
/*  466 */           k += 6;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  472 */       for (j = 0; j < 5; j++) {
/*  473 */         a(☃, aqe1, -1 - j, 0 + j * 2, -1 - j, -1 - j, 23, 58 + j, false);
/*  474 */         a(☃, aqe1, 58 + j, 0 + j * 2, -1 - j, 58 + j, 23, 58 + j, false);
/*  475 */         a(☃, aqe1, 0 - j, 0 + j * 2, -1 - j, 57 + j, 23, -1 - j, false);
/*  476 */         a(☃, aqe1, 0 - j, 0 + j * 2, 58 + j, 57 + j, 23, 58 + j, false);
/*      */       } 
/*      */       
/*  479 */       for (Iterator<aql.r> iterator = this.q.iterator(); iterator.hasNext(); ) { aql.r r1 = iterator.next();
/*  480 */         if (r1.c().a(aqe1)) {
/*  481 */           r1.a(☃, random, aqe1);
/*      */         } }
/*      */ 
/*      */       
/*  485 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     private void a(boolean ☃, int i, adm adm1, Random random, aqe aqe1) {
/*  490 */       int j = 24;
/*  491 */       if (a(aqe1, i, 0, i + 23, 20)) {
/*  492 */         a(adm1, aqe1, i + 0, 0, 0, i + 24, 0, 20, a, a, false);
/*      */         
/*  494 */         a(adm1, aqe1, i + 0, 1, 0, i + 24, 10, 20, false);
/*      */         int k;
/*  496 */         for (k = 0; k < 4; k++) {
/*  497 */           a(adm1, aqe1, i + k, k + 1, k, i + k, k + 1, 20, b, b, false);
/*  498 */           a(adm1, aqe1, i + k + 7, k + 5, k + 7, i + k + 7, k + 5, 20, b, b, false);
/*  499 */           a(adm1, aqe1, i + 17 - k, k + 5, k + 7, i + 17 - k, k + 5, 20, b, b, false);
/*  500 */           a(adm1, aqe1, i + 24 - k, k + 1, k, i + 24 - k, k + 1, 20, b, b, false);
/*      */           
/*  502 */           a(adm1, aqe1, i + k + 1, k + 1, k, i + 23 - k, k + 1, k, b, b, false);
/*  503 */           a(adm1, aqe1, i + k + 8, k + 5, k + 7, i + 16 - k, k + 5, k + 7, b, b, false);
/*      */         } 
/*  505 */         a(adm1, aqe1, i + 4, 4, 4, i + 6, 4, 20, a, a, false);
/*  506 */         a(adm1, aqe1, i + 7, 4, 4, i + 17, 4, 6, a, a, false);
/*  507 */         a(adm1, aqe1, i + 18, 4, 4, i + 20, 4, 20, a, a, false);
/*  508 */         a(adm1, aqe1, i + 11, 8, 11, i + 13, 8, 20, a, a, false);
/*  509 */         a(adm1, d, i + 12, 9, 12, aqe1);
/*  510 */         a(adm1, d, i + 12, 9, 15, aqe1);
/*  511 */         a(adm1, d, i + 12, 9, 18, aqe1);
/*      */         
/*  513 */         k = ☃ ? (i + 19) : (i + 5);
/*  514 */         int m = ☃ ? (i + 5) : (i + 19); int n;
/*  515 */         for (n = 20; n >= 5; n -= 3) {
/*  516 */           a(adm1, d, k, 5, n, aqe1);
/*      */         }
/*  518 */         for (n = 19; n >= 7; n -= 3) {
/*  519 */           a(adm1, d, m, 5, n, aqe1);
/*      */         }
/*  521 */         for (n = 0; n < 4; n++) {
/*  522 */           int i1 = ☃ ? (i + 24 - 17 - n * 3) : (i + 17 - n * 3);
/*  523 */           a(adm1, d, i1, 5, 5, aqe1);
/*      */         } 
/*  525 */         a(adm1, d, m, 5, 5, aqe1);
/*      */ 
/*      */         
/*  528 */         a(adm1, aqe1, i + 11, 1, 12, i + 13, 7, 12, a, a, false);
/*  529 */         a(adm1, aqe1, i + 12, 1, 11, i + 12, 7, 13, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     private void b(adm ☃, Random random, aqe aqe1) {
/*  535 */       if (a(aqe1, 22, 5, 35, 17)) {
/*      */         
/*  537 */         a(☃, aqe1, 25, 0, 0, 32, 8, 20, false);
/*      */ 
/*      */         
/*  540 */         for (int i = 0; i < 4; i++) {
/*  541 */           a(☃, aqe1, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, b, b, false);
/*  542 */           a(☃, aqe1, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, b, b, false);
/*  543 */           a(☃, b, 25, 5, 5 + i * 4, aqe1);
/*  544 */           a(☃, b, 26, 6, 5 + i * 4, aqe1);
/*  545 */           a(☃, e, 26, 5, 5 + i * 4, aqe1);
/*      */           
/*  547 */           a(☃, aqe1, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, b, b, false);
/*  548 */           a(☃, aqe1, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, b, b, false);
/*  549 */           a(☃, b, 32, 5, 5 + i * 4, aqe1);
/*  550 */           a(☃, b, 31, 6, 5 + i * 4, aqe1);
/*  551 */           a(☃, e, 31, 5, 5 + i * 4, aqe1);
/*      */           
/*  553 */           a(☃, aqe1, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, a, a, false);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void c(adm ☃, Random random, aqe aqe1) {
/*  561 */       if (a(aqe1, 15, 20, 42, 21)) {
/*  562 */         a(☃, aqe1, 15, 0, 21, 42, 0, 21, a, a, false);
/*      */         
/*  564 */         a(☃, aqe1, 26, 1, 21, 31, 3, 21, false);
/*      */ 
/*      */ 
/*      */         
/*  568 */         a(☃, aqe1, 21, 12, 21, 36, 12, 21, a, a, false);
/*  569 */         a(☃, aqe1, 17, 11, 21, 40, 11, 21, a, a, false);
/*  570 */         a(☃, aqe1, 16, 10, 21, 41, 10, 21, a, a, false);
/*  571 */         a(☃, aqe1, 15, 7, 21, 42, 9, 21, a, a, false);
/*  572 */         a(☃, aqe1, 16, 6, 21, 41, 6, 21, a, a, false);
/*  573 */         a(☃, aqe1, 17, 5, 21, 40, 5, 21, a, a, false);
/*  574 */         a(☃, aqe1, 21, 4, 21, 36, 4, 21, a, a, false);
/*  575 */         a(☃, aqe1, 22, 3, 21, 26, 3, 21, a, a, false);
/*  576 */         a(☃, aqe1, 31, 3, 21, 35, 3, 21, a, a, false);
/*  577 */         a(☃, aqe1, 23, 2, 21, 25, 2, 21, a, a, false);
/*  578 */         a(☃, aqe1, 32, 2, 21, 34, 2, 21, a, a, false);
/*      */ 
/*      */         
/*  581 */         a(☃, aqe1, 28, 4, 20, 29, 4, 21, b, b, false);
/*  582 */         a(☃, b, 27, 3, 21, aqe1);
/*  583 */         a(☃, b, 30, 3, 21, aqe1);
/*  584 */         a(☃, b, 26, 2, 21, aqe1);
/*  585 */         a(☃, b, 31, 2, 21, aqe1);
/*  586 */         a(☃, b, 25, 1, 21, aqe1);
/*  587 */         a(☃, b, 32, 1, 21, aqe1); int i;
/*  588 */         for (i = 0; i < 7; i++) {
/*  589 */           a(☃, c, 28 - i, 6 + i, 21, aqe1);
/*  590 */           a(☃, c, 29 + i, 6 + i, 21, aqe1);
/*      */         } 
/*  592 */         for (i = 0; i < 4; i++) {
/*  593 */           a(☃, c, 28 - i, 9 + i, 21, aqe1);
/*  594 */           a(☃, c, 29 + i, 9 + i, 21, aqe1);
/*      */         } 
/*  596 */         a(☃, c, 28, 12, 21, aqe1);
/*  597 */         a(☃, c, 29, 12, 21, aqe1);
/*  598 */         for (i = 0; i < 3; i++) {
/*  599 */           a(☃, c, 22 - i * 2, 8, 21, aqe1);
/*  600 */           a(☃, c, 22 - i * 2, 9, 21, aqe1);
/*      */           
/*  602 */           a(☃, c, 35 + i * 2, 8, 21, aqe1);
/*  603 */           a(☃, c, 35 + i * 2, 9, 21, aqe1);
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  608 */         a(☃, aqe1, 15, 13, 21, 42, 15, 21, false);
/*  609 */         a(☃, aqe1, 15, 1, 21, 15, 6, 21, false);
/*  610 */         a(☃, aqe1, 16, 1, 21, 16, 5, 21, false);
/*  611 */         a(☃, aqe1, 17, 1, 21, 20, 4, 21, false);
/*  612 */         a(☃, aqe1, 21, 1, 21, 21, 3, 21, false);
/*  613 */         a(☃, aqe1, 22, 1, 21, 22, 2, 21, false);
/*  614 */         a(☃, aqe1, 23, 1, 21, 24, 1, 21, false);
/*  615 */         a(☃, aqe1, 42, 1, 21, 42, 6, 21, false);
/*  616 */         a(☃, aqe1, 41, 1, 21, 41, 5, 21, false);
/*  617 */         a(☃, aqe1, 37, 1, 21, 40, 4, 21, false);
/*  618 */         a(☃, aqe1, 36, 1, 21, 36, 3, 21, false);
/*  619 */         a(☃, aqe1, 33, 1, 21, 34, 1, 21, false);
/*  620 */         a(☃, aqe1, 35, 1, 21, 35, 2, 21, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private void d(adm ☃, Random random, aqe aqe1) {
/*  628 */       if (a(aqe1, 21, 21, 36, 36)) {
/*  629 */         a(☃, aqe1, 21, 0, 22, 36, 0, 36, a, a, false);
/*      */ 
/*      */ 
/*      */         
/*  633 */         a(☃, aqe1, 21, 1, 22, 36, 23, 36, false);
/*      */ 
/*      */         
/*  636 */         for (int i = 0; i < 4; i++) {
/*  637 */           a(☃, aqe1, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, b, b, false);
/*  638 */           a(☃, aqe1, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, b, b, false);
/*  639 */           a(☃, aqe1, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, b, b, false);
/*  640 */           a(☃, aqe1, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, b, b, false);
/*      */         } 
/*  642 */         a(☃, aqe1, 25, 16, 25, 32, 16, 32, a, a, false);
/*  643 */         a(☃, aqe1, 25, 17, 25, 25, 19, 25, b, b, false);
/*  644 */         a(☃, aqe1, 32, 17, 25, 32, 19, 25, b, b, false);
/*  645 */         a(☃, aqe1, 25, 17, 32, 25, 19, 32, b, b, false);
/*  646 */         a(☃, aqe1, 32, 17, 32, 32, 19, 32, b, b, false);
/*      */         
/*  648 */         a(☃, b, 26, 20, 26, aqe1);
/*  649 */         a(☃, b, 27, 21, 27, aqe1);
/*  650 */         a(☃, e, 27, 20, 27, aqe1);
/*  651 */         a(☃, b, 26, 20, 31, aqe1);
/*  652 */         a(☃, b, 27, 21, 30, aqe1);
/*  653 */         a(☃, e, 27, 20, 30, aqe1);
/*  654 */         a(☃, b, 31, 20, 31, aqe1);
/*  655 */         a(☃, b, 30, 21, 30, aqe1);
/*  656 */         a(☃, e, 30, 20, 30, aqe1);
/*  657 */         a(☃, b, 31, 20, 26, aqe1);
/*  658 */         a(☃, b, 30, 21, 27, aqe1);
/*  659 */         a(☃, e, 30, 20, 27, aqe1);
/*      */         
/*  661 */         a(☃, aqe1, 28, 21, 27, 29, 21, 27, a, a, false);
/*  662 */         a(☃, aqe1, 27, 21, 28, 27, 21, 29, a, a, false);
/*  663 */         a(☃, aqe1, 28, 21, 30, 29, 21, 30, a, a, false);
/*  664 */         a(☃, aqe1, 30, 21, 28, 30, 21, 29, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void e(adm ☃, Random random, aqe aqe1) {
/*  671 */       if (a(aqe1, 0, 21, 6, 58)) {
/*  672 */         a(☃, aqe1, 0, 0, 21, 6, 0, 57, a, a, false);
/*      */         
/*  674 */         a(☃, aqe1, 0, 1, 21, 6, 7, 57, false);
/*      */ 
/*      */         
/*  677 */         a(☃, aqe1, 4, 4, 21, 6, 4, 53, a, a, false); int i;
/*  678 */         for (i = 0; i < 4; i++) {
/*  679 */           a(☃, aqe1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*      */         }
/*  681 */         for (i = 23; i < 53; i += 3) {
/*  682 */           a(☃, d, 5, 5, i, aqe1);
/*      */         }
/*  684 */         a(☃, d, 5, 5, 52, aqe1);
/*      */         
/*  686 */         for (i = 0; i < 4; i++) {
/*  687 */           a(☃, aqe1, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/*      */         }
/*      */         
/*  690 */         a(☃, aqe1, 4, 1, 52, 6, 3, 52, a, a, false);
/*  691 */         a(☃, aqe1, 5, 1, 51, 5, 3, 53, a, a, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  696 */       if (a(aqe1, 51, 21, 58, 58)) {
/*  697 */         a(☃, aqe1, 51, 0, 21, 57, 0, 57, a, a, false);
/*      */         
/*  699 */         a(☃, aqe1, 51, 1, 21, 57, 7, 57, false);
/*      */ 
/*      */         
/*  702 */         a(☃, aqe1, 51, 4, 21, 53, 4, 53, a, a, false); int i;
/*  703 */         for (i = 0; i < 4; i++) {
/*  704 */           a(☃, aqe1, 57 - i, i + 1, 21, 57 - i, i + 1, 57 - i, b, b, false);
/*      */         }
/*  706 */         for (i = 23; i < 53; i += 3) {
/*  707 */           a(☃, d, 52, 5, i, aqe1);
/*      */         }
/*  709 */         a(☃, d, 52, 5, 52, aqe1);
/*      */ 
/*      */         
/*  712 */         a(☃, aqe1, 51, 1, 52, 53, 3, 52, a, a, false);
/*  713 */         a(☃, aqe1, 52, 1, 51, 52, 3, 53, a, a, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  718 */       if (a(aqe1, 0, 51, 57, 57)) {
/*  719 */         a(☃, aqe1, 7, 0, 51, 50, 0, 57, a, a, false);
/*      */         
/*  721 */         a(☃, aqe1, 7, 1, 51, 50, 10, 57, false);
/*      */ 
/*      */         
/*  724 */         for (int i = 0; i < 4; i++) {
/*  725 */           a(☃, aqe1, i + 1, i + 1, 57 - i, 56 - i, i + 1, 57 - i, b, b, false);
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void f(adm ☃, Random random, aqe aqe1) {
/*  733 */       if (a(aqe1, 7, 21, 13, 50)) {
/*  734 */         a(☃, aqe1, 7, 0, 21, 13, 0, 50, a, a, false);
/*      */         
/*  736 */         a(☃, aqe1, 7, 1, 21, 13, 10, 50, false);
/*      */ 
/*      */         
/*  739 */         a(☃, aqe1, 11, 8, 21, 13, 8, 53, a, a, false); int i;
/*  740 */         for (i = 0; i < 4; i++) {
/*  741 */           a(☃, aqe1, i + 7, i + 5, 21, i + 7, i + 5, 54, b, b, false);
/*      */         }
/*  743 */         for (i = 21; i <= 45; i += 3) {
/*  744 */           a(☃, d, 12, 9, i, aqe1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  750 */       if (a(aqe1, 44, 21, 50, 54)) {
/*  751 */         a(☃, aqe1, 44, 0, 21, 50, 0, 50, a, a, false);
/*      */         
/*  753 */         a(☃, aqe1, 44, 1, 21, 50, 10, 50, false);
/*      */ 
/*      */         
/*  756 */         a(☃, aqe1, 44, 8, 21, 46, 8, 53, a, a, false); int i;
/*  757 */         for (i = 0; i < 4; i++) {
/*  758 */           a(☃, aqe1, 50 - i, i + 5, 21, 50 - i, i + 5, 54, b, b, false);
/*      */         }
/*  760 */         for (i = 21; i <= 45; i += 3) {
/*  761 */           a(☃, d, 45, 9, i, aqe1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  767 */       if (a(aqe1, 8, 44, 49, 54)) {
/*  768 */         a(☃, aqe1, 14, 0, 44, 43, 0, 50, a, a, false);
/*      */         
/*  770 */         a(☃, aqe1, 14, 1, 44, 43, 10, 50, false);
/*      */ 
/*      */         
/*      */         int i;
/*      */         
/*  775 */         for (i = 12; i <= 45; i += 3) {
/*  776 */           a(☃, d, i, 9, 45, aqe1);
/*  777 */           a(☃, d, i, 9, 52, aqe1);
/*  778 */           if (i == 12 || i == 18 || i == 24 || i == 33 || i == 39 || i == 45) {
/*  779 */             a(☃, d, i, 9, 47, aqe1);
/*  780 */             a(☃, d, i, 9, 50, aqe1);
/*  781 */             a(☃, d, i, 10, 45, aqe1);
/*  782 */             a(☃, d, i, 10, 46, aqe1);
/*  783 */             a(☃, d, i, 10, 51, aqe1);
/*  784 */             a(☃, d, i, 10, 52, aqe1);
/*  785 */             a(☃, d, i, 11, 47, aqe1);
/*  786 */             a(☃, d, i, 11, 50, aqe1);
/*  787 */             a(☃, d, i, 12, 48, aqe1);
/*  788 */             a(☃, d, i, 12, 49, aqe1);
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  793 */         for (i = 0; i < 3; i++) {
/*  794 */           a(☃, aqe1, 8 + i, 5 + i, 54, 49 - i, 5 + i, 54, a, a, false);
/*      */         }
/*  796 */         a(☃, aqe1, 11, 8, 54, 46, 8, 54, b, b, false);
/*  797 */         a(☃, aqe1, 14, 8, 44, 43, 8, 53, a, a, false);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private void g(adm ☃, Random random, aqe aqe1) {
/*  804 */       if (a(aqe1, 14, 21, 20, 43)) {
/*  805 */         a(☃, aqe1, 14, 0, 21, 20, 0, 43, a, a, false);
/*      */         
/*  807 */         a(☃, aqe1, 14, 1, 22, 20, 14, 43, false);
/*      */ 
/*      */         
/*  810 */         a(☃, aqe1, 18, 12, 22, 20, 12, 39, a, a, false);
/*  811 */         a(☃, aqe1, 18, 12, 21, 20, 12, 21, b, b, false); int i;
/*  812 */         for (i = 0; i < 4; i++) {
/*  813 */           a(☃, aqe1, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, b, b, false);
/*      */         }
/*  815 */         for (i = 23; i <= 39; i += 3) {
/*  816 */           a(☃, d, 19, 13, i, aqe1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  822 */       if (a(aqe1, 37, 21, 43, 43)) {
/*  823 */         a(☃, aqe1, 37, 0, 21, 43, 0, 43, a, a, false);
/*      */         
/*  825 */         a(☃, aqe1, 37, 1, 22, 43, 14, 43, false);
/*      */ 
/*      */         
/*  828 */         a(☃, aqe1, 37, 12, 22, 39, 12, 39, a, a, false);
/*  829 */         a(☃, aqe1, 37, 12, 21, 39, 12, 21, b, b, false); int i;
/*  830 */         for (i = 0; i < 4; i++) {
/*  831 */           a(☃, aqe1, 43 - i, i + 9, 21, 43 - i, i + 9, 43 - i, b, b, false);
/*      */         }
/*  833 */         for (i = 23; i <= 39; i += 3) {
/*  834 */           a(☃, d, 38, 13, i, aqe1);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  840 */       if (a(aqe1, 15, 37, 42, 43)) {
/*  841 */         a(☃, aqe1, 21, 0, 37, 36, 0, 43, a, a, false);
/*      */         
/*  843 */         a(☃, aqe1, 21, 1, 37, 36, 14, 43, false);
/*      */ 
/*      */         
/*  846 */         a(☃, aqe1, 21, 12, 37, 36, 12, 39, a, a, false); int i;
/*  847 */         for (i = 0; i < 4; i++) {
/*  848 */           a(☃, aqe1, 15 + i, i + 9, 43 - i, 42 - i, i + 9, 43 - i, b, b, false);
/*      */         }
/*  850 */         for (i = 21; i <= 36; i += 3) {
/*  851 */           a(☃, d, i, 13, 38, aqe1);
/*      */         }
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public static class p
/*      */     extends r
/*      */   {
/*      */     public p() {}
/*      */     
/*      */     public p(cq ☃, aql.v v1) {
/*  863 */       super(1, ☃, v1, 1, 1, 1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  869 */       a(☃, aqe1, 0, 3, 0, 2, 3, 7, b, b, false);
/*  870 */       a(☃, aqe1, 5, 3, 0, 7, 3, 7, b, b, false);
/*  871 */       a(☃, aqe1, 0, 2, 0, 1, 2, 7, b, b, false);
/*  872 */       a(☃, aqe1, 6, 2, 0, 7, 2, 7, b, b, false);
/*  873 */       a(☃, aqe1, 0, 1, 0, 0, 1, 7, b, b, false);
/*  874 */       a(☃, aqe1, 7, 1, 0, 7, 1, 7, b, b, false);
/*      */ 
/*      */       
/*  877 */       a(☃, aqe1, 0, 1, 7, 7, 3, 7, b, b, false);
/*      */ 
/*      */       
/*  880 */       a(☃, aqe1, 1, 1, 0, 2, 3, 0, b, b, false);
/*  881 */       a(☃, aqe1, 5, 1, 0, 6, 3, 0, b, b, false);
/*      */       
/*  883 */       if (this.k.c[cq.c.a()]) {
/*  884 */         a(☃, aqe1, 3, 1, 7, 4, 2, 7, false);
/*      */       }
/*  886 */       if (this.k.c[cq.e.a()]) {
/*  887 */         a(☃, aqe1, 0, 1, 3, 1, 2, 4, false);
/*      */       }
/*  889 */       if (this.k.c[cq.f.a()]) {
/*  890 */         a(☃, aqe1, 6, 1, 3, 7, 2, 4, false);
/*      */       }
/*      */       
/*  893 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class s
/*      */     extends r
/*      */   {
/*      */     private int o;
/*      */     
/*      */     public s() {}
/*      */     
/*      */     public s(cq ☃, aql.v v1, Random random) {
/*  905 */       super(1, ☃, v1, 1, 1, 1);
/*  906 */       this.o = random.nextInt(3);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/*  911 */       if (this.k.a / 25 > 0) {
/*  912 */         a(☃, aqe1, 0, 0, this.k.c[cq.a.a()]);
/*      */       }
/*  914 */       if (this.k.b[cq.b.a()] == null) {
/*  915 */         a(☃, aqe1, 1, 4, 1, 6, 4, 6, a);
/*      */       }
/*      */       
/*  918 */       boolean bool = (this.o != 0 && random.nextBoolean() && !this.k.c[cq.a.a()] && !this.k.c[cq.b.a()] && this.k.c() > 1);
/*      */       
/*  920 */       if (this.o == 0) {
/*      */         
/*  922 */         a(☃, aqe1, 0, 1, 0, 2, 1, 2, b, b, false);
/*  923 */         a(☃, aqe1, 0, 3, 0, 2, 3, 2, b, b, false);
/*  924 */         a(☃, aqe1, 0, 2, 0, 0, 2, 2, a, a, false);
/*  925 */         a(☃, aqe1, 1, 2, 0, 2, 2, 0, a, a, false);
/*  926 */         a(☃, e, 1, 2, 1, aqe1);
/*      */ 
/*      */         
/*  929 */         a(☃, aqe1, 5, 1, 0, 7, 1, 2, b, b, false);
/*  930 */         a(☃, aqe1, 5, 3, 0, 7, 3, 2, b, b, false);
/*  931 */         a(☃, aqe1, 7, 2, 0, 7, 2, 2, a, a, false);
/*  932 */         a(☃, aqe1, 5, 2, 0, 6, 2, 0, a, a, false);
/*  933 */         a(☃, e, 6, 2, 1, aqe1);
/*      */ 
/*      */         
/*  936 */         a(☃, aqe1, 0, 1, 5, 2, 1, 7, b, b, false);
/*  937 */         a(☃, aqe1, 0, 3, 5, 2, 3, 7, b, b, false);
/*  938 */         a(☃, aqe1, 0, 2, 5, 0, 2, 7, a, a, false);
/*  939 */         a(☃, aqe1, 1, 2, 7, 2, 2, 7, a, a, false);
/*  940 */         a(☃, e, 1, 2, 6, aqe1);
/*      */ 
/*      */         
/*  943 */         a(☃, aqe1, 5, 1, 5, 7, 1, 7, b, b, false);
/*  944 */         a(☃, aqe1, 5, 3, 5, 7, 3, 7, b, b, false);
/*  945 */         a(☃, aqe1, 7, 2, 5, 7, 2, 7, a, a, false);
/*  946 */         a(☃, aqe1, 5, 2, 7, 6, 2, 7, a, a, false);
/*  947 */         a(☃, e, 6, 2, 6, aqe1);
/*      */         
/*  949 */         if (this.k.c[cq.d.a()]) {
/*  950 */           a(☃, aqe1, 3, 3, 0, 4, 3, 0, b, b, false);
/*      */         } else {
/*  952 */           a(☃, aqe1, 3, 3, 0, 4, 3, 1, b, b, false);
/*  953 */           a(☃, aqe1, 3, 2, 0, 4, 2, 0, a, a, false);
/*  954 */           a(☃, aqe1, 3, 1, 0, 4, 1, 1, b, b, false);
/*      */         } 
/*  956 */         if (this.k.c[cq.c.a()]) {
/*  957 */           a(☃, aqe1, 3, 3, 7, 4, 3, 7, b, b, false);
/*      */         } else {
/*  959 */           a(☃, aqe1, 3, 3, 6, 4, 3, 7, b, b, false);
/*  960 */           a(☃, aqe1, 3, 2, 7, 4, 2, 7, a, a, false);
/*  961 */           a(☃, aqe1, 3, 1, 6, 4, 1, 7, b, b, false);
/*      */         } 
/*  963 */         if (this.k.c[cq.e.a()]) {
/*  964 */           a(☃, aqe1, 0, 3, 3, 0, 3, 4, b, b, false);
/*      */         } else {
/*  966 */           a(☃, aqe1, 0, 3, 3, 1, 3, 4, b, b, false);
/*  967 */           a(☃, aqe1, 0, 2, 3, 0, 2, 4, a, a, false);
/*  968 */           a(☃, aqe1, 0, 1, 3, 1, 1, 4, b, b, false);
/*      */         } 
/*  970 */         if (this.k.c[cq.f.a()]) {
/*  971 */           a(☃, aqe1, 7, 3, 3, 7, 3, 4, b, b, false);
/*      */         } else {
/*  973 */           a(☃, aqe1, 6, 3, 3, 7, 3, 4, b, b, false);
/*  974 */           a(☃, aqe1, 7, 2, 3, 7, 2, 4, a, a, false);
/*  975 */           a(☃, aqe1, 6, 1, 3, 7, 1, 4, b, b, false);
/*      */         } 
/*  977 */       } else if (this.o == 1) {
/*      */         
/*  979 */         a(☃, aqe1, 2, 1, 2, 2, 3, 2, b, b, false);
/*  980 */         a(☃, aqe1, 2, 1, 5, 2, 3, 5, b, b, false);
/*  981 */         a(☃, aqe1, 5, 1, 5, 5, 3, 5, b, b, false);
/*  982 */         a(☃, aqe1, 5, 1, 2, 5, 3, 2, b, b, false);
/*  983 */         a(☃, e, 2, 2, 2, aqe1);
/*  984 */         a(☃, e, 2, 2, 5, aqe1);
/*  985 */         a(☃, e, 5, 2, 5, aqe1);
/*  986 */         a(☃, e, 5, 2, 2, aqe1);
/*      */ 
/*      */         
/*  989 */         a(☃, aqe1, 0, 1, 0, 1, 3, 0, b, b, false);
/*  990 */         a(☃, aqe1, 0, 1, 1, 0, 3, 1, b, b, false);
/*  991 */         a(☃, aqe1, 0, 1, 7, 1, 3, 7, b, b, false);
/*  992 */         a(☃, aqe1, 0, 1, 6, 0, 3, 6, b, b, false);
/*  993 */         a(☃, aqe1, 6, 1, 7, 7, 3, 7, b, b, false);
/*  994 */         a(☃, aqe1, 7, 1, 6, 7, 3, 6, b, b, false);
/*  995 */         a(☃, aqe1, 6, 1, 0, 7, 3, 0, b, b, false);
/*  996 */         a(☃, aqe1, 7, 1, 1, 7, 3, 1, b, b, false);
/*  997 */         a(☃, a, 1, 2, 0, aqe1);
/*  998 */         a(☃, a, 0, 2, 1, aqe1);
/*  999 */         a(☃, a, 1, 2, 7, aqe1);
/* 1000 */         a(☃, a, 0, 2, 6, aqe1);
/* 1001 */         a(☃, a, 6, 2, 7, aqe1);
/* 1002 */         a(☃, a, 7, 2, 6, aqe1);
/* 1003 */         a(☃, a, 6, 2, 0, aqe1);
/* 1004 */         a(☃, a, 7, 2, 1, aqe1);
/* 1005 */         if (!this.k.c[cq.d.a()]) {
/* 1006 */           a(☃, aqe1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1007 */           a(☃, aqe1, 1, 2, 0, 6, 2, 0, a, a, false);
/* 1008 */           a(☃, aqe1, 1, 1, 0, 6, 1, 0, b, b, false);
/*      */         } 
/* 1010 */         if (!this.k.c[cq.c.a()]) {
/* 1011 */           a(☃, aqe1, 1, 3, 7, 6, 3, 7, b, b, false);
/* 1012 */           a(☃, aqe1, 1, 2, 7, 6, 2, 7, a, a, false);
/* 1013 */           a(☃, aqe1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */         } 
/* 1015 */         if (!this.k.c[cq.e.a()]) {
/* 1016 */           a(☃, aqe1, 0, 3, 1, 0, 3, 6, b, b, false);
/* 1017 */           a(☃, aqe1, 0, 2, 1, 0, 2, 6, a, a, false);
/* 1018 */           a(☃, aqe1, 0, 1, 1, 0, 1, 6, b, b, false);
/*      */         } 
/* 1020 */         if (!this.k.c[cq.f.a()]) {
/* 1021 */           a(☃, aqe1, 7, 3, 1, 7, 3, 6, b, b, false);
/* 1022 */           a(☃, aqe1, 7, 2, 1, 7, 2, 6, a, a, false);
/* 1023 */           a(☃, aqe1, 7, 1, 1, 7, 1, 6, b, b, false);
/*      */         } 
/* 1025 */       } else if (this.o == 2) {
/* 1026 */         a(☃, aqe1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1027 */         a(☃, aqe1, 7, 1, 0, 7, 1, 7, b, b, false);
/* 1028 */         a(☃, aqe1, 1, 1, 0, 6, 1, 0, b, b, false);
/* 1029 */         a(☃, aqe1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */         
/* 1031 */         a(☃, aqe1, 0, 2, 0, 0, 2, 7, c, c, false);
/* 1032 */         a(☃, aqe1, 7, 2, 0, 7, 2, 7, c, c, false);
/* 1033 */         a(☃, aqe1, 1, 2, 0, 6, 2, 0, c, c, false);
/* 1034 */         a(☃, aqe1, 1, 2, 7, 6, 2, 7, c, c, false);
/*      */         
/* 1036 */         a(☃, aqe1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1037 */         a(☃, aqe1, 7, 3, 0, 7, 3, 7, b, b, false);
/* 1038 */         a(☃, aqe1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1039 */         a(☃, aqe1, 1, 3, 7, 6, 3, 7, b, b, false);
/*      */         
/* 1041 */         a(☃, aqe1, 0, 1, 3, 0, 2, 4, c, c, false);
/* 1042 */         a(☃, aqe1, 7, 1, 3, 7, 2, 4, c, c, false);
/* 1043 */         a(☃, aqe1, 3, 1, 0, 4, 2, 0, c, c, false);
/* 1044 */         a(☃, aqe1, 3, 1, 7, 4, 2, 7, c, c, false);
/*      */         
/* 1046 */         if (this.k.c[cq.d.a()]) {
/* 1047 */           a(☃, aqe1, 3, 1, 0, 4, 2, 0, false);
/*      */         }
/* 1049 */         if (this.k.c[cq.c.a()]) {
/* 1050 */           a(☃, aqe1, 3, 1, 7, 4, 2, 7, false);
/*      */         }
/* 1052 */         if (this.k.c[cq.e.a()]) {
/* 1053 */           a(☃, aqe1, 0, 1, 3, 0, 2, 4, false);
/*      */         }
/* 1055 */         if (this.k.c[cq.f.a()]) {
/* 1056 */           a(☃, aqe1, 7, 1, 3, 7, 2, 4, false);
/*      */         }
/*      */       } 
/* 1059 */       if (bool) {
/* 1060 */         a(☃, aqe1, 3, 1, 3, 4, 1, 4, b, b, false);
/* 1061 */         a(☃, aqe1, 3, 2, 3, 4, 2, 4, a, a, false);
/* 1062 */         a(☃, aqe1, 3, 3, 3, 4, 3, 4, b, b, false);
/*      */       } 
/*      */       
/* 1065 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class t
/*      */     extends r
/*      */   {
/*      */     public t() {}
/*      */     
/*      */     public t(cq ☃, aql.v v1, Random random) {
/* 1075 */       super(1, ☃, v1, 1, 1, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1080 */       if (this.k.a / 25 > 0) {
/* 1081 */         a(☃, aqe1, 0, 0, this.k.c[cq.a.a()]);
/*      */       }
/* 1083 */       if (this.k.b[cq.b.a()] == null) {
/* 1084 */         a(☃, aqe1, 1, 4, 1, 6, 4, 6, a);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1089 */       for (int i = 1; i <= 6; i++) {
/* 1090 */         for (int j = 1; j <= 6; j++) {
/* 1091 */           if (random.nextInt(3) != 0) {
/* 1092 */             int k = 2 + ((random.nextInt(4) == 0) ? 0 : 1);
/* 1093 */             a(☃, aqe1, i, k, j, i, 3, j, afi.v.a(1), afi.v.a(1), false);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1098 */       a(☃, aqe1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1099 */       a(☃, aqe1, 7, 1, 0, 7, 1, 7, b, b, false);
/* 1100 */       a(☃, aqe1, 1, 1, 0, 6, 1, 0, b, b, false);
/* 1101 */       a(☃, aqe1, 1, 1, 7, 6, 1, 7, b, b, false);
/*      */       
/* 1103 */       a(☃, aqe1, 0, 2, 0, 0, 2, 7, c, c, false);
/* 1104 */       a(☃, aqe1, 7, 2, 0, 7, 2, 7, c, c, false);
/* 1105 */       a(☃, aqe1, 1, 2, 0, 6, 2, 0, c, c, false);
/* 1106 */       a(☃, aqe1, 1, 2, 7, 6, 2, 7, c, c, false);
/*      */       
/* 1108 */       a(☃, aqe1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1109 */       a(☃, aqe1, 7, 3, 0, 7, 3, 7, b, b, false);
/* 1110 */       a(☃, aqe1, 1, 3, 0, 6, 3, 0, b, b, false);
/* 1111 */       a(☃, aqe1, 1, 3, 7, 6, 3, 7, b, b, false);
/*      */       
/* 1113 */       a(☃, aqe1, 0, 1, 3, 0, 2, 4, c, c, false);
/* 1114 */       a(☃, aqe1, 7, 1, 3, 7, 2, 4, c, c, false);
/* 1115 */       a(☃, aqe1, 3, 1, 0, 4, 2, 0, c, c, false);
/* 1116 */       a(☃, aqe1, 3, 1, 7, 4, 2, 7, c, c, false);
/*      */       
/* 1118 */       if (this.k.c[cq.d.a()]) {
/* 1119 */         a(☃, aqe1, 3, 1, 0, 4, 2, 0, false);
/*      */       }
/*      */ 
/*      */       
/* 1123 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class m
/*      */     extends r
/*      */   {
/*      */     public m() {}
/*      */     
/*      */     public m(cq ☃, aql.v v1, Random random) {
/* 1133 */       super(1, ☃, v1, 1, 2, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1138 */       if (this.k.a / 25 > 0) {
/* 1139 */         a(☃, aqe1, 0, 0, this.k.c[cq.a.a()]);
/*      */       }
/* 1141 */       aql.v v1 = this.k.b[cq.b.a()];
/* 1142 */       if (v1.b[cq.b.a()] == null) {
/* 1143 */         a(☃, aqe1, 1, 8, 1, 6, 8, 6, a);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1148 */       a(☃, aqe1, 0, 4, 0, 0, 4, 7, b, b, false);
/* 1149 */       a(☃, aqe1, 7, 4, 0, 7, 4, 7, b, b, false);
/* 1150 */       a(☃, aqe1, 1, 4, 0, 6, 4, 0, b, b, false);
/* 1151 */       a(☃, aqe1, 1, 4, 7, 6, 4, 7, b, b, false);
/*      */       
/* 1153 */       a(☃, aqe1, 2, 4, 1, 2, 4, 2, b, b, false);
/* 1154 */       a(☃, aqe1, 1, 4, 2, 1, 4, 2, b, b, false);
/* 1155 */       a(☃, aqe1, 5, 4, 1, 5, 4, 2, b, b, false);
/* 1156 */       a(☃, aqe1, 6, 4, 2, 6, 4, 2, b, b, false);
/* 1157 */       a(☃, aqe1, 2, 4, 5, 2, 4, 6, b, b, false);
/* 1158 */       a(☃, aqe1, 1, 4, 5, 1, 4, 5, b, b, false);
/* 1159 */       a(☃, aqe1, 5, 4, 5, 5, 4, 6, b, b, false);
/* 1160 */       a(☃, aqe1, 6, 4, 5, 6, 4, 5, b, b, false);
/*      */       
/* 1162 */       aql.v v2 = this.k;
/* 1163 */       for (int i = 1; i <= 5; i += 4) {
/* 1164 */         int j = 0;
/* 1165 */         if (v2.c[cq.d.a()]) {
/* 1166 */           a(☃, aqe1, 2, i, j, 2, i + 2, j, b, b, false);
/* 1167 */           a(☃, aqe1, 5, i, j, 5, i + 2, j, b, b, false);
/* 1168 */           a(☃, aqe1, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*      */         } else {
/* 1170 */           a(☃, aqe1, 0, i, j, 7, i + 2, j, b, b, false);
/* 1171 */           a(☃, aqe1, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*      */         } 
/* 1173 */         j = 7;
/* 1174 */         if (v2.c[cq.c.a()]) {
/* 1175 */           a(☃, aqe1, 2, i, j, 2, i + 2, j, b, b, false);
/* 1176 */           a(☃, aqe1, 5, i, j, 5, i + 2, j, b, b, false);
/* 1177 */           a(☃, aqe1, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*      */         } else {
/* 1179 */           a(☃, aqe1, 0, i, j, 7, i + 2, j, b, b, false);
/* 1180 */           a(☃, aqe1, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*      */         } 
/* 1182 */         int k = 0;
/* 1183 */         if (v2.c[cq.e.a()]) {
/* 1184 */           a(☃, aqe1, k, i, 2, k, i + 2, 2, b, b, false);
/* 1185 */           a(☃, aqe1, k, i, 5, k, i + 2, 5, b, b, false);
/* 1186 */           a(☃, aqe1, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*      */         } else {
/* 1188 */           a(☃, aqe1, k, i, 0, k, i + 2, 7, b, b, false);
/* 1189 */           a(☃, aqe1, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*      */         } 
/* 1191 */         k = 7;
/* 1192 */         if (v2.c[cq.f.a()]) {
/* 1193 */           a(☃, aqe1, k, i, 2, k, i + 2, 2, b, b, false);
/* 1194 */           a(☃, aqe1, k, i, 5, k, i + 2, 5, b, b, false);
/* 1195 */           a(☃, aqe1, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*      */         } else {
/* 1197 */           a(☃, aqe1, k, i, 0, k, i + 2, 7, b, b, false);
/* 1198 */           a(☃, aqe1, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*      */         } 
/* 1200 */         v2 = v1;
/*      */       } 
/*      */ 
/*      */       
/* 1204 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class k
/*      */     extends r
/*      */   {
/*      */     public k() {}
/*      */     
/*      */     public k(cq ☃, aql.v v1, Random random) {
/* 1214 */       super(1, ☃, v1, 2, 1, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1219 */       aql.v v1 = this.k.b[cq.f.a()];
/* 1220 */       aql.v v2 = this.k;
/* 1221 */       if (this.k.a / 25 > 0) {
/* 1222 */         a(☃, aqe1, 8, 0, v1.c[cq.a.a()]);
/* 1223 */         a(☃, aqe1, 0, 0, v2.c[cq.a.a()]);
/*      */       } 
/* 1225 */       if (v2.b[cq.b.a()] == null) {
/* 1226 */         a(☃, aqe1, 1, 4, 1, 7, 4, 6, a);
/*      */       }
/* 1228 */       if (v1.b[cq.b.a()] == null) {
/* 1229 */         a(☃, aqe1, 8, 4, 1, 14, 4, 6, a);
/*      */       }
/*      */ 
/*      */       
/* 1233 */       a(☃, aqe1, 0, 3, 0, 0, 3, 7, b, b, false);
/* 1234 */       a(☃, aqe1, 15, 3, 0, 15, 3, 7, b, b, false);
/* 1235 */       a(☃, aqe1, 1, 3, 0, 15, 3, 0, b, b, false);
/* 1236 */       a(☃, aqe1, 1, 3, 7, 14, 3, 7, b, b, false);
/* 1237 */       a(☃, aqe1, 0, 2, 0, 0, 2, 7, a, a, false);
/* 1238 */       a(☃, aqe1, 15, 2, 0, 15, 2, 7, a, a, false);
/* 1239 */       a(☃, aqe1, 1, 2, 0, 15, 2, 0, a, a, false);
/* 1240 */       a(☃, aqe1, 1, 2, 7, 14, 2, 7, a, a, false);
/* 1241 */       a(☃, aqe1, 0, 1, 0, 0, 1, 7, b, b, false);
/* 1242 */       a(☃, aqe1, 15, 1, 0, 15, 1, 7, b, b, false);
/* 1243 */       a(☃, aqe1, 1, 1, 0, 15, 1, 0, b, b, false);
/* 1244 */       a(☃, aqe1, 1, 1, 7, 14, 1, 7, b, b, false);
/*      */ 
/*      */       
/* 1247 */       a(☃, aqe1, 5, 1, 0, 10, 1, 4, b, b, false);
/* 1248 */       a(☃, aqe1, 6, 2, 0, 9, 2, 3, a, a, false);
/* 1249 */       a(☃, aqe1, 5, 3, 0, 10, 3, 4, b, b, false);
/*      */       
/* 1251 */       a(☃, e, 6, 2, 3, aqe1);
/* 1252 */       a(☃, e, 9, 2, 3, aqe1);
/*      */ 
/*      */       
/* 1255 */       if (v2.c[cq.d.a()]) {
/* 1256 */         a(☃, aqe1, 3, 1, 0, 4, 2, 0, false);
/*      */       }
/* 1258 */       if (v2.c[cq.c.a()]) {
/* 1259 */         a(☃, aqe1, 3, 1, 7, 4, 2, 7, false);
/*      */       }
/* 1261 */       if (v2.c[cq.e.a()]) {
/* 1262 */         a(☃, aqe1, 0, 1, 3, 0, 2, 4, false);
/*      */       }
/* 1264 */       if (v1.c[cq.d.a()]) {
/* 1265 */         a(☃, aqe1, 11, 1, 0, 12, 2, 0, false);
/*      */       }
/* 1267 */       if (v1.c[cq.c.a()]) {
/* 1268 */         a(☃, aqe1, 11, 1, 7, 12, 2, 7, false);
/*      */       }
/* 1270 */       if (v1.c[cq.f.a()]) {
/* 1271 */         a(☃, aqe1, 15, 1, 3, 15, 2, 4, false);
/*      */       }
/*      */       
/* 1274 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class o
/*      */     extends r
/*      */   {
/*      */     public o() {}
/*      */     
/*      */     public o(cq ☃, aql.v v1, Random random) {
/* 1284 */       super(1, ☃, v1, 1, 1, 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1289 */       aql.v v1 = this.k.b[cq.c.a()];
/* 1290 */       aql.v v2 = this.k;
/* 1291 */       if (this.k.a / 25 > 0) {
/* 1292 */         a(☃, aqe1, 0, 8, v1.c[cq.a.a()]);
/* 1293 */         a(☃, aqe1, 0, 0, v2.c[cq.a.a()]);
/*      */       } 
/* 1295 */       if (v2.b[cq.b.a()] == null) {
/* 1296 */         a(☃, aqe1, 1, 4, 1, 6, 4, 7, a);
/*      */       }
/* 1298 */       if (v1.b[cq.b.a()] == null) {
/* 1299 */         a(☃, aqe1, 1, 4, 8, 6, 4, 14, a);
/*      */       }
/*      */ 
/*      */       
/* 1303 */       a(☃, aqe1, 0, 3, 0, 0, 3, 15, b, b, false);
/* 1304 */       a(☃, aqe1, 7, 3, 0, 7, 3, 15, b, b, false);
/* 1305 */       a(☃, aqe1, 1, 3, 0, 7, 3, 0, b, b, false);
/* 1306 */       a(☃, aqe1, 1, 3, 15, 6, 3, 15, b, b, false);
/* 1307 */       a(☃, aqe1, 0, 2, 0, 0, 2, 15, a, a, false);
/* 1308 */       a(☃, aqe1, 7, 2, 0, 7, 2, 15, a, a, false);
/* 1309 */       a(☃, aqe1, 1, 2, 0, 7, 2, 0, a, a, false);
/* 1310 */       a(☃, aqe1, 1, 2, 15, 6, 2, 15, a, a, false);
/* 1311 */       a(☃, aqe1, 0, 1, 0, 0, 1, 15, b, b, false);
/* 1312 */       a(☃, aqe1, 7, 1, 0, 7, 1, 15, b, b, false);
/* 1313 */       a(☃, aqe1, 1, 1, 0, 7, 1, 0, b, b, false);
/* 1314 */       a(☃, aqe1, 1, 1, 15, 6, 1, 15, b, b, false);
/*      */ 
/*      */       
/* 1317 */       a(☃, aqe1, 1, 1, 1, 1, 1, 2, b, b, false);
/* 1318 */       a(☃, aqe1, 6, 1, 1, 6, 1, 2, b, b, false);
/* 1319 */       a(☃, aqe1, 1, 3, 1, 1, 3, 2, b, b, false);
/* 1320 */       a(☃, aqe1, 6, 3, 1, 6, 3, 2, b, b, false);
/* 1321 */       a(☃, aqe1, 1, 1, 13, 1, 1, 14, b, b, false);
/* 1322 */       a(☃, aqe1, 6, 1, 13, 6, 1, 14, b, b, false);
/* 1323 */       a(☃, aqe1, 1, 3, 13, 1, 3, 14, b, b, false);
/* 1324 */       a(☃, aqe1, 6, 3, 13, 6, 3, 14, b, b, false);
/*      */ 
/*      */       
/* 1327 */       a(☃, aqe1, 2, 1, 6, 2, 3, 6, b, b, false);
/* 1328 */       a(☃, aqe1, 5, 1, 6, 5, 3, 6, b, b, false);
/* 1329 */       a(☃, aqe1, 2, 1, 9, 2, 3, 9, b, b, false);
/* 1330 */       a(☃, aqe1, 5, 1, 9, 5, 3, 9, b, b, false);
/*      */       
/* 1332 */       a(☃, aqe1, 3, 2, 6, 4, 2, 6, b, b, false);
/* 1333 */       a(☃, aqe1, 3, 2, 9, 4, 2, 9, b, b, false);
/* 1334 */       a(☃, aqe1, 2, 2, 7, 2, 2, 8, b, b, false);
/* 1335 */       a(☃, aqe1, 5, 2, 7, 5, 2, 8, b, b, false);
/*      */       
/* 1337 */       a(☃, e, 2, 2, 5, aqe1);
/* 1338 */       a(☃, e, 5, 2, 5, aqe1);
/* 1339 */       a(☃, e, 2, 2, 10, aqe1);
/* 1340 */       a(☃, e, 5, 2, 10, aqe1);
/* 1341 */       a(☃, b, 2, 3, 5, aqe1);
/* 1342 */       a(☃, b, 5, 3, 5, aqe1);
/* 1343 */       a(☃, b, 2, 3, 10, aqe1);
/* 1344 */       a(☃, b, 5, 3, 10, aqe1);
/*      */ 
/*      */       
/* 1347 */       if (v2.c[cq.d.a()]) {
/* 1348 */         a(☃, aqe1, 3, 1, 0, 4, 2, 0, false);
/*      */       }
/* 1350 */       if (v2.c[cq.f.a()]) {
/* 1351 */         a(☃, aqe1, 7, 1, 3, 7, 2, 4, false);
/*      */       }
/* 1353 */       if (v2.c[cq.e.a()]) {
/* 1354 */         a(☃, aqe1, 0, 1, 3, 0, 2, 4, false);
/*      */       }
/* 1356 */       if (v1.c[cq.c.a()]) {
/* 1357 */         a(☃, aqe1, 3, 1, 15, 4, 2, 15, false);
/*      */       }
/* 1359 */       if (v1.c[cq.e.a()]) {
/* 1360 */         a(☃, aqe1, 0, 1, 11, 0, 2, 12, false);
/*      */       }
/* 1362 */       if (v1.c[cq.f.a()]) {
/* 1363 */         a(☃, aqe1, 7, 1, 11, 7, 2, 12, false);
/*      */       }
/*      */       
/* 1366 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class l
/*      */     extends r
/*      */   {
/*      */     public l() {}
/*      */     
/*      */     public l(cq ☃, aql.v v1, Random random) {
/* 1376 */       super(1, ☃, v1, 2, 2, 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1381 */       aql.v v1 = this.k.b[cq.f.a()];
/* 1382 */       aql.v v2 = this.k;
/* 1383 */       aql.v v3 = v2.b[cq.b.a()];
/* 1384 */       aql.v v4 = v1.b[cq.b.a()];
/*      */ 
/*      */ 
/*      */       
/* 1388 */       if (this.k.a / 25 > 0) {
/* 1389 */         a(☃, aqe1, 8, 0, v1.c[cq.a.a()]);
/* 1390 */         a(☃, aqe1, 0, 0, v2.c[cq.a.a()]);
/*      */       } 
/* 1392 */       if (v3.b[cq.b.a()] == null) {
/* 1393 */         a(☃, aqe1, 1, 8, 1, 7, 8, 6, a);
/*      */       }
/* 1395 */       if (v4.b[cq.b.a()] == null) {
/* 1396 */         a(☃, aqe1, 8, 8, 1, 14, 8, 6, a);
/*      */       }
/*      */ 
/*      */       
/* 1400 */       for (int i = 1; i <= 7; i++) {
/* 1401 */         alz alz = b;
/* 1402 */         if (i == 2 || i == 6) {
/* 1403 */           alz = a;
/*      */         }
/* 1405 */         a(☃, aqe1, 0, i, 0, 0, i, 7, alz, alz, false);
/* 1406 */         a(☃, aqe1, 15, i, 0, 15, i, 7, alz, alz, false);
/* 1407 */         a(☃, aqe1, 1, i, 0, 15, i, 0, alz, alz, false);
/* 1408 */         a(☃, aqe1, 1, i, 7, 14, i, 7, alz, alz, false);
/*      */       } 
/*      */ 
/*      */       
/* 1412 */       a(☃, aqe1, 2, 1, 3, 2, 7, 4, b, b, false);
/* 1413 */       a(☃, aqe1, 3, 1, 2, 4, 7, 2, b, b, false);
/* 1414 */       a(☃, aqe1, 3, 1, 5, 4, 7, 5, b, b, false);
/* 1415 */       a(☃, aqe1, 13, 1, 3, 13, 7, 4, b, b, false);
/* 1416 */       a(☃, aqe1, 11, 1, 2, 12, 7, 2, b, b, false);
/* 1417 */       a(☃, aqe1, 11, 1, 5, 12, 7, 5, b, b, false);
/*      */       
/* 1419 */       a(☃, aqe1, 5, 1, 3, 5, 3, 4, b, b, false);
/* 1420 */       a(☃, aqe1, 10, 1, 3, 10, 3, 4, b, b, false);
/*      */       
/* 1422 */       a(☃, aqe1, 5, 7, 2, 10, 7, 5, b, b, false);
/* 1423 */       a(☃, aqe1, 5, 5, 2, 5, 7, 2, b, b, false);
/* 1424 */       a(☃, aqe1, 10, 5, 2, 10, 7, 2, b, b, false);
/* 1425 */       a(☃, aqe1, 5, 5, 5, 5, 7, 5, b, b, false);
/* 1426 */       a(☃, aqe1, 10, 5, 5, 10, 7, 5, b, b, false);
/* 1427 */       a(☃, b, 6, 6, 2, aqe1);
/* 1428 */       a(☃, b, 9, 6, 2, aqe1);
/* 1429 */       a(☃, b, 6, 6, 5, aqe1);
/* 1430 */       a(☃, b, 9, 6, 5, aqe1);
/*      */       
/* 1432 */       a(☃, aqe1, 5, 4, 3, 6, 4, 4, b, b, false);
/* 1433 */       a(☃, aqe1, 9, 4, 3, 10, 4, 4, b, b, false);
/* 1434 */       a(☃, e, 5, 4, 2, aqe1);
/* 1435 */       a(☃, e, 5, 4, 5, aqe1);
/* 1436 */       a(☃, e, 10, 4, 2, aqe1);
/* 1437 */       a(☃, e, 10, 4, 5, aqe1);
/*      */ 
/*      */       
/* 1440 */       if (v2.c[cq.d.a()]) {
/* 1441 */         a(☃, aqe1, 3, 1, 0, 4, 2, 0, false);
/*      */       }
/* 1443 */       if (v2.c[cq.c.a()]) {
/* 1444 */         a(☃, aqe1, 3, 1, 7, 4, 2, 7, false);
/*      */       }
/* 1446 */       if (v2.c[cq.e.a()]) {
/* 1447 */         a(☃, aqe1, 0, 1, 3, 0, 2, 4, false);
/*      */       }
/* 1449 */       if (v1.c[cq.d.a()]) {
/* 1450 */         a(☃, aqe1, 11, 1, 0, 12, 2, 0, false);
/*      */       }
/* 1452 */       if (v1.c[cq.c.a()]) {
/* 1453 */         a(☃, aqe1, 11, 1, 7, 12, 2, 7, false);
/*      */       }
/* 1455 */       if (v1.c[cq.f.a()]) {
/* 1456 */         a(☃, aqe1, 15, 1, 3, 15, 2, 4, false);
/*      */       }
/* 1458 */       if (v3.c[cq.d.a()]) {
/* 1459 */         a(☃, aqe1, 3, 5, 0, 4, 6, 0, false);
/*      */       }
/* 1461 */       if (v3.c[cq.c.a()]) {
/* 1462 */         a(☃, aqe1, 3, 5, 7, 4, 6, 7, false);
/*      */       }
/* 1464 */       if (v3.c[cq.e.a()]) {
/* 1465 */         a(☃, aqe1, 0, 5, 3, 0, 6, 4, false);
/*      */       }
/* 1467 */       if (v4.c[cq.d.a()]) {
/* 1468 */         a(☃, aqe1, 11, 5, 0, 12, 6, 0, false);
/*      */       }
/* 1470 */       if (v4.c[cq.c.a()]) {
/* 1471 */         a(☃, aqe1, 11, 5, 7, 12, 6, 7, false);
/*      */       }
/* 1473 */       if (v4.c[cq.f.a()]) {
/* 1474 */         a(☃, aqe1, 15, 5, 3, 15, 6, 4, false);
/*      */       }
/*      */       
/* 1477 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class n
/*      */     extends r
/*      */   {
/*      */     public n() {}
/*      */     
/*      */     public n(cq ☃, aql.v v1, Random random) {
/* 1487 */       super(1, ☃, v1, 1, 2, 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1492 */       aql.v v1 = this.k.b[cq.c.a()];
/* 1493 */       aql.v v2 = this.k;
/* 1494 */       aql.v v3 = v1.b[cq.b.a()];
/* 1495 */       aql.v v4 = v2.b[cq.b.a()];
/* 1496 */       if (this.k.a / 25 > 0) {
/* 1497 */         a(☃, aqe1, 0, 8, v1.c[cq.a.a()]);
/* 1498 */         a(☃, aqe1, 0, 0, v2.c[cq.a.a()]);
/*      */       } 
/* 1500 */       if (v4.b[cq.b.a()] == null) {
/* 1501 */         a(☃, aqe1, 1, 8, 1, 6, 8, 7, a);
/*      */       }
/* 1503 */       if (v3.b[cq.b.a()] == null) {
/* 1504 */         a(☃, aqe1, 1, 8, 8, 6, 8, 14, a);
/*      */       }
/*      */       
/*      */       int i;
/* 1508 */       for (i = 1; i <= 7; i++) {
/* 1509 */         alz alz = b;
/* 1510 */         if (i == 2 || i == 6) {
/* 1511 */           alz = a;
/*      */         }
/* 1513 */         a(☃, aqe1, 0, i, 0, 0, i, 15, alz, alz, false);
/* 1514 */         a(☃, aqe1, 7, i, 0, 7, i, 15, alz, alz, false);
/* 1515 */         a(☃, aqe1, 1, i, 0, 6, i, 0, alz, alz, false);
/* 1516 */         a(☃, aqe1, 1, i, 15, 6, i, 15, alz, alz, false);
/*      */       } 
/*      */ 
/*      */       
/* 1520 */       for (i = 1; i <= 7; i++) {
/* 1521 */         alz alz = c;
/* 1522 */         if (i == 2 || i == 6) {
/* 1523 */           alz = e;
/*      */         }
/* 1525 */         a(☃, aqe1, 3, i, 7, 4, i, 8, alz, alz, false);
/*      */       } 
/*      */ 
/*      */       
/* 1529 */       if (v2.c[cq.d.a()]) {
/* 1530 */         a(☃, aqe1, 3, 1, 0, 4, 2, 0, false);
/*      */       }
/* 1532 */       if (v2.c[cq.f.a()]) {
/* 1533 */         a(☃, aqe1, 7, 1, 3, 7, 2, 4, false);
/*      */       }
/* 1535 */       if (v2.c[cq.e.a()]) {
/* 1536 */         a(☃, aqe1, 0, 1, 3, 0, 2, 4, false);
/*      */       }
/* 1538 */       if (v1.c[cq.c.a()]) {
/* 1539 */         a(☃, aqe1, 3, 1, 15, 4, 2, 15, false);
/*      */       }
/* 1541 */       if (v1.c[cq.e.a()]) {
/* 1542 */         a(☃, aqe1, 0, 1, 11, 0, 2, 12, false);
/*      */       }
/* 1544 */       if (v1.c[cq.f.a()]) {
/* 1545 */         a(☃, aqe1, 7, 1, 11, 7, 2, 12, false);
/*      */       }
/*      */       
/* 1548 */       if (v4.c[cq.d.a()]) {
/* 1549 */         a(☃, aqe1, 3, 5, 0, 4, 6, 0, false);
/*      */       }
/* 1551 */       if (v4.c[cq.f.a()]) {
/* 1552 */         a(☃, aqe1, 7, 5, 3, 7, 6, 4, false);
/* 1553 */         a(☃, aqe1, 5, 4, 2, 6, 4, 5, b, b, false);
/* 1554 */         a(☃, aqe1, 6, 1, 2, 6, 3, 2, b, b, false);
/* 1555 */         a(☃, aqe1, 6, 1, 5, 6, 3, 5, b, b, false);
/*      */       } 
/* 1557 */       if (v4.c[cq.e.a()]) {
/* 1558 */         a(☃, aqe1, 0, 5, 3, 0, 6, 4, false);
/* 1559 */         a(☃, aqe1, 1, 4, 2, 2, 4, 5, b, b, false);
/* 1560 */         a(☃, aqe1, 1, 1, 2, 1, 3, 2, b, b, false);
/* 1561 */         a(☃, aqe1, 1, 1, 5, 1, 3, 5, b, b, false);
/*      */       } 
/* 1563 */       if (v3.c[cq.c.a()]) {
/* 1564 */         a(☃, aqe1, 3, 5, 15, 4, 6, 15, false);
/*      */       }
/* 1566 */       if (v3.c[cq.e.a()]) {
/* 1567 */         a(☃, aqe1, 0, 5, 11, 0, 6, 12, false);
/* 1568 */         a(☃, aqe1, 1, 4, 10, 2, 4, 13, b, b, false);
/* 1569 */         a(☃, aqe1, 1, 1, 10, 1, 3, 10, b, b, false);
/* 1570 */         a(☃, aqe1, 1, 1, 13, 1, 3, 13, b, b, false);
/*      */       } 
/* 1572 */       if (v3.c[cq.f.a()]) {
/* 1573 */         a(☃, aqe1, 7, 5, 11, 7, 6, 12, false);
/* 1574 */         a(☃, aqe1, 5, 4, 10, 6, 4, 13, b, b, false);
/* 1575 */         a(☃, aqe1, 6, 1, 10, 6, 3, 10, b, b, false);
/* 1576 */         a(☃, aqe1, 6, 1, 13, 6, 3, 13, b, b, false);
/*      */       } 
/*      */       
/* 1579 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class j
/*      */     extends r
/*      */   {
/*      */     public j() {}
/*      */     
/*      */     public j(cq ☃, aql.v v1, Random random) {
/* 1589 */       super(1, ☃, v1, 2, 2, 2);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1595 */       a(☃, aqe1, 1, 8, 0, 14, 8, 14, a);
/*      */ 
/*      */ 
/*      */       
/* 1599 */       int i = 7;
/* 1600 */       alz alz = b;
/* 1601 */       a(☃, aqe1, 0, i, 0, 0, i, 15, alz, alz, false);
/* 1602 */       a(☃, aqe1, 15, i, 0, 15, i, 15, alz, alz, false);
/* 1603 */       a(☃, aqe1, 1, i, 0, 15, i, 0, alz, alz, false);
/* 1604 */       a(☃, aqe1, 1, i, 15, 14, i, 15, alz, alz, false);
/*      */       
/* 1606 */       for (i = 1; i <= 6; i++) {
/* 1607 */         alz = b;
/* 1608 */         if (i == 2 || i == 6) {
/* 1609 */           alz = a;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1614 */         for (int k = 0; k <= 15; k += 15) {
/* 1615 */           a(☃, aqe1, k, i, 0, k, i, 1, alz, alz, false);
/* 1616 */           a(☃, aqe1, k, i, 6, k, i, 9, alz, alz, false);
/* 1617 */           a(☃, aqe1, k, i, 14, k, i, 15, alz, alz, false);
/*      */         } 
/* 1619 */         a(☃, aqe1, 1, i, 0, 1, i, 0, alz, alz, false);
/* 1620 */         a(☃, aqe1, 6, i, 0, 9, i, 0, alz, alz, false);
/* 1621 */         a(☃, aqe1, 14, i, 0, 14, i, 0, alz, alz, false);
/*      */         
/* 1623 */         a(☃, aqe1, 1, i, 15, 14, i, 15, alz, alz, false);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1628 */       a(☃, aqe1, 6, 3, 6, 9, 6, 9, c, c, false);
/* 1629 */       a(☃, aqe1, 7, 4, 7, 8, 5, 8, afi.R.Q(), afi.R.Q(), false);
/* 1630 */       for (i = 3; i <= 6; i += 3) {
/* 1631 */         for (int k = 6; k <= 9; k += 3) {
/* 1632 */           a(☃, e, k, i, 6, aqe1);
/* 1633 */           a(☃, e, k, i, 9, aqe1);
/*      */         } 
/*      */       } 
/*      */       
/* 1637 */       a(☃, aqe1, 5, 1, 6, 5, 2, 6, b, b, false);
/* 1638 */       a(☃, aqe1, 5, 1, 9, 5, 2, 9, b, b, false);
/* 1639 */       a(☃, aqe1, 10, 1, 6, 10, 2, 6, b, b, false);
/* 1640 */       a(☃, aqe1, 10, 1, 9, 10, 2, 9, b, b, false);
/* 1641 */       a(☃, aqe1, 6, 1, 5, 6, 2, 5, b, b, false);
/* 1642 */       a(☃, aqe1, 9, 1, 5, 9, 2, 5, b, b, false);
/* 1643 */       a(☃, aqe1, 6, 1, 10, 6, 2, 10, b, b, false);
/* 1644 */       a(☃, aqe1, 9, 1, 10, 9, 2, 10, b, b, false);
/*      */       
/* 1646 */       a(☃, aqe1, 5, 2, 5, 5, 6, 5, b, b, false);
/* 1647 */       a(☃, aqe1, 5, 2, 10, 5, 6, 10, b, b, false);
/* 1648 */       a(☃, aqe1, 10, 2, 5, 10, 6, 5, b, b, false);
/* 1649 */       a(☃, aqe1, 10, 2, 10, 10, 6, 10, b, b, false);
/*      */       
/* 1651 */       a(☃, aqe1, 5, 7, 1, 5, 7, 6, b, b, false);
/* 1652 */       a(☃, aqe1, 10, 7, 1, 10, 7, 6, b, b, false);
/* 1653 */       a(☃, aqe1, 5, 7, 9, 5, 7, 14, b, b, false);
/* 1654 */       a(☃, aqe1, 10, 7, 9, 10, 7, 14, b, b, false);
/*      */       
/* 1656 */       a(☃, aqe1, 1, 7, 5, 6, 7, 5, b, b, false);
/* 1657 */       a(☃, aqe1, 1, 7, 10, 6, 7, 10, b, b, false);
/* 1658 */       a(☃, aqe1, 9, 7, 5, 14, 7, 5, b, b, false);
/* 1659 */       a(☃, aqe1, 9, 7, 10, 14, 7, 10, b, b, false);
/*      */ 
/*      */       
/* 1662 */       a(☃, aqe1, 2, 1, 2, 2, 1, 3, b, b, false);
/* 1663 */       a(☃, aqe1, 3, 1, 2, 3, 1, 2, b, b, false);
/* 1664 */       a(☃, aqe1, 13, 1, 2, 13, 1, 3, b, b, false);
/* 1665 */       a(☃, aqe1, 12, 1, 2, 12, 1, 2, b, b, false);
/* 1666 */       a(☃, aqe1, 2, 1, 12, 2, 1, 13, b, b, false);
/* 1667 */       a(☃, aqe1, 3, 1, 13, 3, 1, 13, b, b, false);
/* 1668 */       a(☃, aqe1, 13, 1, 12, 13, 1, 13, b, b, false);
/* 1669 */       a(☃, aqe1, 12, 1, 13, 12, 1, 13, b, b, false);
/*      */       
/* 1671 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class u
/*      */     extends r
/*      */   {
/*      */     private int o;
/*      */     
/*      */     public u() {}
/*      */     
/*      */     public u(cq ☃, aqe aqe1, int i) {
/* 1683 */       super(☃, aqe1);
/* 1684 */       this.o = i & 0x1;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1689 */       if (this.o == 0) {
/* 1690 */         int i; for (i = 0; i < 4; i++) {
/* 1691 */           a(☃, aqe1, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, b, b, false);
/*      */         }
/* 1693 */         a(☃, aqe1, 7, 0, 6, 15, 0, 16, b, b, false);
/* 1694 */         a(☃, aqe1, 6, 0, 6, 6, 3, 20, b, b, false);
/* 1695 */         a(☃, aqe1, 16, 0, 6, 16, 3, 20, b, b, false);
/* 1696 */         a(☃, aqe1, 7, 1, 7, 7, 1, 20, b, b, false);
/* 1697 */         a(☃, aqe1, 15, 1, 7, 15, 1, 20, b, b, false);
/*      */         
/* 1699 */         a(☃, aqe1, 7, 1, 6, 9, 3, 6, b, b, false);
/* 1700 */         a(☃, aqe1, 13, 1, 6, 15, 3, 6, b, b, false);
/* 1701 */         a(☃, aqe1, 8, 1, 7, 9, 1, 7, b, b, false);
/* 1702 */         a(☃, aqe1, 13, 1, 7, 14, 1, 7, b, b, false);
/* 1703 */         a(☃, aqe1, 9, 0, 5, 13, 0, 5, b, b, false);
/*      */         
/* 1705 */         a(☃, aqe1, 10, 0, 7, 12, 0, 7, c, c, false);
/* 1706 */         a(☃, aqe1, 8, 0, 10, 8, 0, 12, c, c, false);
/* 1707 */         a(☃, aqe1, 14, 0, 10, 14, 0, 12, c, c, false);
/*      */         
/* 1709 */         for (i = 18; i >= 7; i -= 3) {
/* 1710 */           a(☃, e, 6, 3, i, aqe1);
/* 1711 */           a(☃, e, 16, 3, i, aqe1);
/*      */         } 
/* 1713 */         a(☃, e, 10, 0, 10, aqe1);
/* 1714 */         a(☃, e, 12, 0, 10, aqe1);
/* 1715 */         a(☃, e, 10, 0, 12, aqe1);
/* 1716 */         a(☃, e, 12, 0, 12, aqe1);
/*      */         
/* 1718 */         a(☃, e, 8, 3, 6, aqe1);
/* 1719 */         a(☃, e, 14, 3, 6, aqe1);
/*      */ 
/*      */         
/* 1722 */         a(☃, b, 4, 2, 4, aqe1);
/* 1723 */         a(☃, e, 4, 1, 4, aqe1);
/* 1724 */         a(☃, b, 4, 0, 4, aqe1);
/*      */         
/* 1726 */         a(☃, b, 18, 2, 4, aqe1);
/* 1727 */         a(☃, e, 18, 1, 4, aqe1);
/* 1728 */         a(☃, b, 18, 0, 4, aqe1);
/*      */         
/* 1730 */         a(☃, b, 4, 2, 18, aqe1);
/* 1731 */         a(☃, e, 4, 1, 18, aqe1);
/* 1732 */         a(☃, b, 4, 0, 18, aqe1);
/*      */         
/* 1734 */         a(☃, b, 18, 2, 18, aqe1);
/* 1735 */         a(☃, e, 18, 1, 18, aqe1);
/* 1736 */         a(☃, b, 18, 0, 18, aqe1);
/*      */ 
/*      */         
/* 1739 */         a(☃, b, 9, 7, 20, aqe1);
/* 1740 */         a(☃, b, 13, 7, 20, aqe1);
/* 1741 */         a(☃, aqe1, 6, 0, 21, 7, 4, 21, b, b, false);
/* 1742 */         a(☃, aqe1, 15, 0, 21, 16, 4, 21, b, b, false);
/*      */         
/* 1744 */         a(☃, aqe1, 11, 2, 16);
/* 1745 */       } else if (this.o == 1) {
/* 1746 */         a(☃, aqe1, 9, 3, 18, 13, 3, 20, b, b, false);
/* 1747 */         a(☃, aqe1, 9, 0, 18, 9, 2, 18, b, b, false);
/* 1748 */         a(☃, aqe1, 13, 0, 18, 13, 2, 18, b, b, false);
/* 1749 */         int i = 9;
/* 1750 */         int j = 20;
/* 1751 */         int k = 5; int m;
/* 1752 */         for (m = 0; m < 2; m++) {
/* 1753 */           a(☃, b, i, k + 1, j, aqe1);
/* 1754 */           a(☃, e, i, k, j, aqe1);
/* 1755 */           a(☃, b, i, k - 1, j, aqe1);
/* 1756 */           i = 13;
/*      */         } 
/*      */         
/* 1759 */         a(☃, aqe1, 7, 3, 7, 15, 3, 14, b, b, false);
/* 1760 */         i = 10;
/* 1761 */         for (m = 0; m < 2; m++) {
/* 1762 */           a(☃, aqe1, i, 0, 10, i, 6, 10, b, b, false);
/* 1763 */           a(☃, aqe1, i, 0, 12, i, 6, 12, b, b, false);
/* 1764 */           a(☃, e, i, 0, 10, aqe1);
/* 1765 */           a(☃, e, i, 0, 12, aqe1);
/* 1766 */           a(☃, e, i, 4, 10, aqe1);
/* 1767 */           a(☃, e, i, 4, 12, aqe1);
/* 1768 */           i = 12;
/*      */         } 
/* 1770 */         i = 8;
/* 1771 */         for (m = 0; m < 2; m++) {
/* 1772 */           a(☃, aqe1, i, 0, 7, i, 2, 7, b, b, false);
/* 1773 */           a(☃, aqe1, i, 0, 14, i, 2, 14, b, b, false);
/* 1774 */           i = 14;
/*      */         } 
/* 1776 */         a(☃, aqe1, 8, 3, 8, 8, 3, 13, c, c, false);
/* 1777 */         a(☃, aqe1, 14, 3, 8, 14, 3, 13, c, c, false);
/*      */         
/* 1779 */         a(☃, aqe1, 11, 5, 13);
/*      */       } 
/*      */       
/* 1782 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   public static class q
/*      */     extends r
/*      */   {
/*      */     public q() {}
/*      */     
/*      */     public q(cq ☃, aqe aqe1) {
/* 1792 */       super(☃, aqe1);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 1798 */       a(☃, aqe1, 2, -1, 2, 11, -1, 11, b, b, false);
/* 1799 */       a(☃, aqe1, 0, -1, 0, 1, -1, 11, a, a, false);
/* 1800 */       a(☃, aqe1, 12, -1, 0, 13, -1, 11, a, a, false);
/* 1801 */       a(☃, aqe1, 2, -1, 0, 11, -1, 1, a, a, false);
/* 1802 */       a(☃, aqe1, 2, -1, 12, 11, -1, 13, a, a, false);
/*      */       
/* 1804 */       a(☃, aqe1, 0, 0, 0, 0, 0, 13, b, b, false);
/* 1805 */       a(☃, aqe1, 13, 0, 0, 13, 0, 13, b, b, false);
/* 1806 */       a(☃, aqe1, 1, 0, 0, 12, 0, 0, b, b, false);
/* 1807 */       a(☃, aqe1, 1, 0, 13, 12, 0, 13, b, b, false);
/*      */       int i;
/* 1809 */       for (i = 2; i <= 11; i += 3) {
/* 1810 */         a(☃, e, 0, 0, i, aqe1);
/* 1811 */         a(☃, e, 13, 0, i, aqe1);
/* 1812 */         a(☃, e, i, 0, 0, aqe1);
/*      */       } 
/*      */       
/* 1815 */       a(☃, aqe1, 2, 0, 3, 4, 0, 9, b, b, false);
/* 1816 */       a(☃, aqe1, 9, 0, 3, 11, 0, 9, b, b, false);
/* 1817 */       a(☃, aqe1, 4, 0, 9, 9, 0, 11, b, b, false);
/* 1818 */       a(☃, b, 5, 0, 8, aqe1);
/* 1819 */       a(☃, b, 8, 0, 8, aqe1);
/* 1820 */       a(☃, b, 10, 0, 10, aqe1);
/* 1821 */       a(☃, b, 3, 0, 10, aqe1);
/* 1822 */       a(☃, aqe1, 3, 0, 3, 3, 0, 7, c, c, false);
/* 1823 */       a(☃, aqe1, 10, 0, 3, 10, 0, 7, c, c, false);
/* 1824 */       a(☃, aqe1, 6, 0, 10, 7, 0, 10, c, c, false);
/*      */       
/* 1826 */       i = 3;
/* 1827 */       for (int j = 0; j < 2; j++) {
/* 1828 */         for (int k = 2; k <= 8; k += 3) {
/* 1829 */           a(☃, aqe1, i, 0, k, i, 2, k, b, b, false);
/*      */         }
/* 1831 */         i = 10;
/*      */       } 
/* 1833 */       a(☃, aqe1, 5, 0, 10, 5, 2, 10, b, b, false);
/* 1834 */       a(☃, aqe1, 8, 0, 10, 8, 2, 10, b, b, false);
/*      */       
/* 1836 */       a(☃, aqe1, 6, -1, 7, 7, -1, 8, c, c, false);
/*      */ 
/*      */       
/* 1839 */       a(☃, aqe1, 6, -1, 3, 7, -1, 4, false);
/*      */       
/* 1841 */       a(☃, aqe1, 6, 1, 6);
/*      */       
/* 1843 */       return true;
/*      */     }
/*      */   }
/*      */   
/*      */   static class v {
/*      */     int a;
/* 1849 */     v[] b = new v[6];
/* 1850 */     boolean[] c = new boolean[6];
/*      */     boolean d;
/*      */     boolean e;
/*      */     int f;
/*      */     
/*      */     public v(int ☃) {
/* 1856 */       this.a = ☃;
/*      */     }
/*      */     
/*      */     public void a(cq ☃, v v1) {
/* 1860 */       this.b[☃.a()] = v1;
/* 1861 */       v1.b[☃.d().a()] = this;
/*      */     }
/*      */     
/*      */     public void a() {
/* 1865 */       for (int ☃ = 0; ☃ < 6; ☃++) {
/* 1866 */         this.c[☃] = (this.b[☃] != null);
/*      */       }
/*      */     }
/*      */     
/*      */     public boolean a(int ☃) {
/* 1871 */       if (this.e) {
/* 1872 */         return true;
/*      */       }
/* 1874 */       this.f = ☃;
/* 1875 */       for (int i = 0; i < 6; i++) {
/* 1876 */         if (this.b[i] != null && this.c[i] && 
/* 1877 */           (this.b[i]).f != ☃ && this.b[i].a(☃)) {
/* 1878 */           return true;
/*      */         }
/*      */       } 
/*      */       
/* 1882 */       return false;
/*      */     }
/*      */     
/*      */     public boolean b() {
/* 1886 */       return (this.a >= 75);
/*      */     }
/*      */     
/*      */     public int c() {
/* 1890 */       int ☃ = 0;
/* 1891 */       for (int i = 0; i < 6; i++) {
/* 1892 */         if (this.c[i]) {
/* 1893 */           ☃++;
/*      */         }
/*      */       } 
/* 1896 */       return ☃;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static class f
/*      */     implements i
/*      */   {
/*      */     private f() {}
/*      */ 
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 1909 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 1914 */       v1.d = true;
/* 1915 */       return new aql.s(☃, v1, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class g implements i { private g() {}
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 1922 */       return (!☃.c[cq.e.a()] && !☃.c[cq.f.a()] && !☃.c[cq.c.a()] && !☃.c[cq.d.a()] && !☃.c[cq.b.a()]);
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 1927 */       v1.d = true;
/* 1928 */       return new aql.t(☃, v1, random);
/*      */     } }
/*      */   
/*      */   static class c implements i {
/*      */     private c() {}
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 1935 */       if (☃.c[cq.b.a()] && !(☃.b[cq.b.a()]).d) {
/* 1936 */         return true;
/*      */       }
/* 1938 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 1943 */       aql.v v2 = v1;
/* 1944 */       v2.d = true;
/* 1945 */       (v2.b[cq.b.a()]).d = true;
/* 1946 */       return new aql.m(☃, v2, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class a implements i { private a() {}
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 1953 */       if (☃.c[cq.f.a()] && !(☃.b[cq.f.a()]).d) {
/* 1954 */         return true;
/*      */       }
/* 1956 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 1961 */       aql.v v2 = v1;
/* 1962 */       v2.d = true;
/* 1963 */       (v2.b[cq.f.a()]).d = true;
/* 1964 */       return new aql.k(☃, v2, random);
/*      */     } }
/*      */   
/*      */   static class e implements i {
/*      */     private e() {}
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 1971 */       if (☃.c[cq.c.a()] && !(☃.b[cq.c.a()]).d) {
/* 1972 */         return true;
/*      */       }
/* 1974 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 1979 */       aql.v v2 = v1;
/* 1980 */       if (!v1.c[cq.c.a()] || (v1.b[cq.c.a()]).d) {
/* 1981 */         v2 = v1.b[cq.d.a()];
/*      */       }
/* 1983 */       v2.d = true;
/* 1984 */       (v2.b[cq.c.a()]).d = true;
/* 1985 */       return new aql.o(☃, v2, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static class b implements i { private b() {}
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 1992 */       if (☃.c[cq.f.a()] && !(☃.b[cq.f.a()]).d && 
/* 1993 */         ☃.c[cq.b.a()] && !(☃.b[cq.b.a()]).d) {
/* 1994 */         aql.v v1 = ☃.b[cq.f.a()];
/*      */         
/* 1996 */         return (v1.c[cq.b.a()] && !(v1.b[cq.b.a()]).d);
/*      */       } 
/*      */       
/* 1999 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 2004 */       v1.d = true;
/* 2005 */       (v1.b[cq.f.a()]).d = true;
/* 2006 */       (v1.b[cq.b.a()]).d = true;
/* 2007 */       ((v1.b[cq.f.a()]).b[cq.b.a()]).d = true;
/* 2008 */       return new aql.l(☃, v1, random);
/*      */     } }
/*      */   
/*      */   static class d implements i {
/*      */     private d() {}
/*      */     
/*      */     public boolean a(aql.v ☃) {
/* 2015 */       if (☃.c[cq.c.a()] && !(☃.b[cq.c.a()]).d && 
/* 2016 */         ☃.c[cq.b.a()] && !(☃.b[cq.b.a()]).d) {
/* 2017 */         aql.v v1 = ☃.b[cq.c.a()];
/*      */         
/* 2019 */         return (v1.c[cq.b.a()] && !(v1.b[cq.b.a()]).d);
/*      */       } 
/*      */       
/* 2022 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public aql.r a(cq ☃, aql.v v1, Random random) {
/* 2027 */       v1.d = true;
/* 2028 */       (v1.b[cq.c.a()]).d = true;
/* 2029 */       (v1.b[cq.b.a()]).d = true;
/* 2030 */       ((v1.b[cq.c.a()]).b[cq.b.a()]).d = true;
/* 2031 */       return new aql.n(☃, v1, random);
/*      */     }
/*      */   }
/*      */   
/*      */   static interface i {
/*      */     boolean a(aql.v param1v);
/*      */     
/*      */     aql.r a(cq param1cq, aql.v param1v, Random param1Random);
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */