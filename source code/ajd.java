/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class ajd
/*     */   extends akf
/*     */ {
/*  24 */   private static Map<adm, List<a>> b = Maps.newHashMap();
/*     */   private final boolean N;
/*     */   
/*     */   static class a
/*     */   {
/*     */     cj a;
/*     */     long b;
/*     */     
/*     */     public a(cj ☃, long l) {
/*  33 */       this.a = ☃;
/*  34 */       this.b = l;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(adm ☃, cj cj1, boolean bool) {
/*  39 */     if (!b.containsKey(☃)) {
/*  40 */       b.put(☃, Lists.newArrayList());
/*     */     }
/*     */     
/*  43 */     List<a> list = b.get(☃);
/*  44 */     if (bool) {
/*  45 */       list.add(new a(cj1, ☃.K()));
/*     */     }
/*     */     
/*  48 */     int i = 0;
/*  49 */     for (int j = 0; j < list.size(); j++) {
/*  50 */       a a = list.get(j);
/*     */       
/*  52 */       i++;
/*  53 */       if (a.a.equals(cj1) && i >= 8) {
/*  54 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  58 */     return false;
/*     */   }
/*     */   
/*     */   protected ajd(boolean ☃) {
/*  62 */     this.N = ☃;
/*  63 */     a(true);
/*  64 */     a((yz)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  69 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  74 */     if (this.N) {
/*  75 */       cq[] arrayOfCq; int i; int j; for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/*  76 */         ☃.c(cj1.a(cq), this);
/*     */         j++; }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/*  83 */     if (this.N) {
/*  84 */       cq[] arrayOfCq; int i; int j; for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/*  85 */         ☃.c(cj1.a(cq), this);
/*     */         j++; }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  92 */     if (this.N && alz1.b(a) != cq1) {
/*  93 */       return 15;
/*     */     }
/*     */     
/*  96 */     return 0;
/*     */   }
/*     */   
/*     */   private boolean g(adm ☃, cj cj1, alz alz1) {
/* 100 */     cq cq = ((cq)alz1.<cq>b(a)).d();
/*     */     
/* 102 */     return ☃.b(cj1.a(cq), cq);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 111 */     boolean bool = g(☃, cj1, alz1);
/*     */ 
/*     */     
/* 114 */     List<a> list = b.get(☃);
/* 115 */     while (list != null && !list.isEmpty() && ☃.K() - ((a)list.get(0)).b > 60L) {
/* 116 */       list.remove(0);
/*     */     }
/*     */     
/* 119 */     if (this.N) {
/* 120 */       if (bool) {
/* 121 */         ☃.a(cj1, afi.aE.Q().a(a, alz1.b(a)), 3);
/*     */         
/* 123 */         if (a(☃, cj1, true)) {
/* 124 */           ☃.a((cj1.n() + 0.5F), (cj1.o() + 0.5F), (cj1.p() + 0.5F), "random.fizz", 0.5F, 2.6F + (☃.s.nextFloat() - ☃.s.nextFloat()) * 0.8F);
/* 125 */           for (int i = 0; i < 5; i++) {
/* 126 */             double d1 = cj1.n() + random.nextDouble() * 0.6D + 0.2D;
/* 127 */             double d2 = cj1.o() + random.nextDouble() * 0.6D + 0.2D;
/* 128 */             double d3 = cj1.p() + random.nextDouble() * 0.6D + 0.2D;
/*     */             
/* 130 */             ☃.a(cy.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */           } 
/*     */           
/* 133 */           ☃.a(cj1, ☃.p(cj1).c(), 160);
/*     */         }
/*     */       
/*     */       } 
/* 137 */     } else if (!bool && 
/* 138 */       !a(☃, cj1, false)) {
/* 139 */       ☃.a(cj1, afi.aF.Q().a(a, alz1.b(a)), 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 147 */     if (e(☃, cj1, alz1)) {
/*     */       return;
/*     */     }
/*     */     
/* 151 */     if (this.N == g(☃, cj1, alz1)) {
/* 152 */       ☃.a(cj1, this, a(☃));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 158 */     if (cq1 == cq.a) {
/* 159 */       return a(☃, cj1, alz1, cq1);
/*     */     }
/* 161 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 167 */     return zw.a(afi.aF);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 172 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 177 */     if (!this.N) {
/*     */       return;
/*     */     }
/* 180 */     double d1 = cj1.n() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
/* 181 */     double d2 = cj1.o() + 0.7D + (random.nextDouble() - 0.5D) * 0.2D;
/* 182 */     double d3 = cj1.p() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D;
/*     */     
/* 184 */     cq cq = alz1.<cq>b(a);
/* 185 */     if (cq.k().c()) {
/* 186 */       cq cq1 = cq.d();
/*     */       
/* 188 */       double d = 0.27D;
/*     */       
/* 190 */       d1 += 0.27D * cq1.g();
/* 191 */       d2 += 0.22D;
/* 192 */       d3 += 0.27D * cq1.i();
/*     */     } 
/* 194 */     ☃.a(cy.E, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 199 */     return zw.a(afi.aF);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(afh ☃) {
/* 204 */     return (☃ == afi.aE || ☃ == afi.aF);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */