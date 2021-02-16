/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Queue;
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
/*     */ public class ajr
/*     */   extends afh
/*     */ {
/*  25 */   public static final amk a = amk.a("wet");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ajr() {
/*  34 */     super(arm.m);
/*  35 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/*  36 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  41 */     return di.a(a() + ".dry.name");
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  46 */     return ((Boolean)☃.<Boolean>b(a)).booleanValue() ? 1 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  51 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  56 */     e(☃, cj1, alz1);
/*  57 */     super.a(☃, cj1, alz1, afh1);
/*     */   }
/*     */   
/*     */   protected void e(adm ☃, cj cj1, alz alz1) {
/*  61 */     if (!((Boolean)alz1.<Boolean>b(a)).booleanValue() && e(☃, cj1)) {
/*     */       
/*  63 */       ☃.a(cj1, alz1.a(a, Boolean.valueOf(true)), 2);
/*  64 */       ☃.b(2001, cj1, afh.a(afi.j));
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1) {
/*  69 */     Queue<nz<cj, Integer>> queue = Lists.newLinkedList();
/*  70 */     ArrayList<cj> arrayList = Lists.newArrayList();
/*  71 */     queue.add(new nz<cj, Integer>(cj1, Integer.valueOf(0)));
/*     */     
/*  73 */     int i = 0;
/*  74 */     while (!queue.isEmpty()) {
/*  75 */       nz<cj, Integer> nz = queue.poll();
/*  76 */       cj cj2 = nz.a();
/*  77 */       int j = ((Integer)nz.b()).intValue(); cq[] arrayOfCq;
/*     */       int k, m;
/*  79 */       for (arrayOfCq = cq.values(), k = arrayOfCq.length, m = 0; m < k; ) { cq cq = arrayOfCq[m];
/*  80 */         cj cj3 = cj2.a(cq);
/*  81 */         if (☃.p(cj3).c().t() == arm.h) {
/*  82 */           ☃.a(cj3, afi.a.Q(), 2);
/*  83 */           arrayList.add(cj3);
/*  84 */           i++;
/*  85 */           if (j < 6)
/*  86 */             queue.add(new nz<cj, Integer>(cj3, Integer.valueOf(j + 1))); 
/*     */         } 
/*     */         m++; }
/*     */       
/*  90 */       if (i > 64) {
/*     */         break;
/*     */       }
/*     */     } 
/*  94 */     for (Iterator<cj> iterator = arrayList.iterator(); iterator.hasNext(); ) { cj cj2 = iterator.next();
/*  95 */       ☃.c(cj2, afi.a); }
/*     */     
/*  97 */     return (i > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/* 102 */     list.add(new zx(☃, 1, 0));
/* 103 */     list.add(new zx(☃, 1, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 108 */     return Q().a(a, Boolean.valueOf(((☃ & 0x1) == 1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 113 */     return ((Boolean)☃.<Boolean>b(a)).booleanValue() ? 1 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 118 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 123 */     if (!((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 127 */     cq cq = cq.a(random);
/* 128 */     if (cq == cq.b || adm.a(☃, cj1.a(cq))) {
/*     */       return;
/*     */     }
/*     */     
/* 132 */     double d1 = cj1.n();
/* 133 */     double d2 = cj1.o();
/* 134 */     double d3 = cj1.p();
/*     */ 
/*     */ 
/*     */     
/* 138 */     if (cq == cq.a) {
/* 139 */       d2 -= 0.05D;
/* 140 */       d1 += random.nextDouble();
/* 141 */       d3 += random.nextDouble();
/*     */     } else {
/* 143 */       d2 += random.nextDouble() * 0.8D;
/* 144 */       if (cq.k() == cq.a.a) {
/* 145 */         d3 += random.nextDouble();
/* 146 */         if (cq == cq.f) {
/* 147 */           d1 += 1.1D;
/*     */         } else {
/* 149 */           d1 += 0.05D;
/*     */         } 
/*     */       } else {
/* 152 */         d1 += random.nextDouble();
/* 153 */         if (cq == cq.d) {
/* 154 */           d3 += 1.1D;
/*     */         } else {
/* 156 */           d3 += 0.05D;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 161 */     ☃.a(cy.s, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */