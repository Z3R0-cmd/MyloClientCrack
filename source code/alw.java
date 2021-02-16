/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class alw
/*     */ {
/*     */   private final adm a;
/*     */   private final cj b;
/*     */   private final cj c;
/*     */   private final cq d;
/*  20 */   private final List<cj> e = Lists.newArrayList();
/*  21 */   private final List<cj> f = Lists.newArrayList();
/*     */   
/*     */   public alw(adm ☃, cj cj1, cq cq1, boolean bool) {
/*  24 */     this.a = ☃;
/*  25 */     this.b = cj1;
/*     */     
/*  27 */     if (bool) {
/*  28 */       this.d = cq1;
/*  29 */       this.c = cj1.a(cq1);
/*     */     } else {
/*  31 */       this.d = cq1.d();
/*  32 */       this.c = cj1.a(cq1, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  37 */     this.e.clear();
/*  38 */     this.f.clear();
/*     */     
/*  40 */     afh ☃ = this.a.p(this.c).c();
/*     */     
/*  42 */     if (!als.a(☃, this.a, this.c, this.d, false)) {
/*  43 */       if (☃.k() != 1)
/*     */       {
/*  45 */         return false;
/*     */       }
/*  47 */       this.f.add(this.c);
/*  48 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  52 */     if (!a(this.c))
/*     */     {
/*  54 */       return false;
/*     */     }
/*     */     
/*  57 */     for (int i = 0; i < this.e.size(); i++) {
/*  58 */       cj cj1 = this.e.get(i);
/*     */ 
/*     */       
/*  61 */       if (this.a.p(cj1).c() == afi.cE && 
/*  62 */         !b(cj1))
/*     */       {
/*  64 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  69 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(cj ☃) {
/*  73 */     afh afh = this.a.p(☃).c();
/*  74 */     if (afh.t() == arm.a)
/*     */     {
/*  76 */       return true; } 
/*  77 */     if (!als.a(afh, this.a, ☃, this.d, false))
/*     */     {
/*  79 */       return true; } 
/*  80 */     if (☃.equals(this.b))
/*     */     {
/*  82 */       return true; } 
/*  83 */     if (this.e.contains(☃))
/*     */     {
/*  85 */       return true;
/*     */     }
/*     */     
/*  88 */     int i = 1;
/*  89 */     if (i + this.e.size() > 12)
/*     */     {
/*  91 */       return false;
/*     */     }
/*     */     
/*  94 */     while (afh == afi.cE) {
/*  95 */       cj cj1 = ☃.a(this.d.d(), i);
/*  96 */       afh = this.a.p(cj1).c();
/*     */       
/*  98 */       if (afh.t() == arm.a || !als.a(afh, this.a, cj1, this.d, false) || cj1.equals(this.b)) {
/*     */         break;
/*     */       }
/* 101 */       i++;
/* 102 */       if (i + this.e.size() > 12) {
/* 103 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 108 */     int j = 0;
/*     */     
/*     */     int k;
/* 111 */     for (k = i - 1; k >= 0; k--) {
/* 112 */       this.e.add(☃.a(this.d.d(), k));
/* 113 */       j++;
/*     */     } 
/*     */ 
/*     */     
/* 117 */     for (k = 1;; k++) {
/* 118 */       cj cj1 = ☃.a(this.d, k);
/*     */       
/* 120 */       int m = this.e.indexOf(cj1);
/* 121 */       if (m > -1) {
/*     */         
/* 123 */         a(j, m);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 128 */         for (int n = 0; n <= m + j; n++) {
/* 129 */           cj cj2 = this.e.get(n);
/* 130 */           if (this.a.p(cj2).c() == afi.cE && 
/* 131 */             !b(cj2)) {
/* 132 */             return false;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 137 */         return true;
/*     */       } 
/*     */       
/* 140 */       afh = this.a.p(cj1).c();
/*     */       
/* 142 */       if (afh.t() == arm.a)
/*     */       {
/* 144 */         return true;
/*     */       }
/*     */       
/* 147 */       if (!als.a(afh, this.a, cj1, this.d, true) || cj1.equals(this.b))
/*     */       {
/* 149 */         return false;
/*     */       }
/*     */       
/* 152 */       if (afh.k() == 1) {
/* 153 */         this.f.add(cj1);
/* 154 */         return true;
/*     */       } 
/*     */       
/* 157 */       if (this.e.size() >= 12) {
/* 158 */         return false;
/*     */       }
/*     */       
/* 161 */       this.e.add(cj1);
/* 162 */       j++;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i) {
/* 167 */     List<cj> list1 = Lists.newArrayList();
/* 168 */     List<cj> list2 = Lists.newArrayList();
/* 169 */     List<cj> list3 = Lists.newArrayList();
/*     */     
/* 171 */     list1.addAll(this.e.subList(0, i));
/* 172 */     list2.addAll(this.e.subList(this.e.size() - ☃, this.e.size()));
/* 173 */     list3.addAll(this.e.subList(i, this.e.size() - ☃));
/*     */     
/* 175 */     this.e.clear();
/* 176 */     this.e.addAll(list1);
/* 177 */     this.e.addAll(list2);
/* 178 */     this.e.addAll(list3); } private boolean b(cj ☃) {
/*     */     cq[] arrayOfCq;
/*     */     int i;
/*     */     int j;
/* 182 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq1 = arrayOfCq[j];
/* 183 */       if (cq1.k() != this.d.k() && 
/* 184 */         !a(☃.a(cq1))) {
/* 185 */         return false;
/*     */       }
/*     */       
/*     */       j++; }
/*     */     
/* 190 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<cj> c() {
/* 198 */     return this.e;
/*     */   }
/*     */   
/*     */   public List<cj> d() {
/* 202 */     return this.f;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */