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
/*     */ public class adv
/*     */   implements adq
/*     */ {
/*     */   protected int a;
/*     */   protected int b;
/*     */   protected amy[][] c;
/*     */   protected boolean d;
/*     */   protected adm e;
/*     */   
/*     */   public adv(adm ☃, cj cj1, cj cj2, int i) {
/*  24 */     this.e = ☃;
/*     */     
/*  26 */     this.a = cj1.n() - i >> 4;
/*  27 */     this.b = cj1.p() - i >> 4;
/*  28 */     int j = cj2.n() + i >> 4;
/*  29 */     int k = cj2.p() + i >> 4;
/*     */     
/*  31 */     this.c = new amy[j - this.a + 1][k - this.b + 1];
/*     */     
/*  33 */     this.d = true; int m;
/*  34 */     for (m = this.a; m <= j; m++) {
/*  35 */       for (int n = this.b; n <= k; n++) {
/*  36 */         this.c[m - this.a][n - this.b] = ☃.a(m, n);
/*     */       }
/*     */     } 
/*     */     
/*  40 */     for (m = cj1.n() >> 4; m <= cj2.n() >> 4; m++) {
/*  41 */       for (int n = cj1.p() >> 4; n <= cj2.p() >> 4; n++) {
/*  42 */         amy amy1 = this.c[m - this.a][n - this.b];
/*  43 */         if (amy1 != null && 
/*  44 */           !amy1.c(cj1.o(), cj2.o())) {
/*  45 */           this.d = false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean W() {
/*  54 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public akw s(cj ☃) {
/*  60 */     int i = (☃.n() >> 4) - this.a;
/*  61 */     int j = (☃.p() >> 4) - this.b;
/*     */     
/*  63 */     return this.c[i][j].a(☃, amy.a.a);
/*     */   }
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
/*     */   public int b(cj ☃, int i) {
/*  77 */     int j = a(ads.a, ☃);
/*  78 */     int k = a(ads.b, ☃);
/*  79 */     if (k < i) {
/*  80 */       k = i;
/*     */     }
/*  82 */     return j << 20 | k << 4;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public alz p(cj ☃) {
/* 134 */     if (☃.o() >= 0 && 
/* 135 */       ☃.o() < 256) {
/* 136 */       int i = (☃.n() >> 4) - this.a;
/* 137 */       int j = (☃.p() >> 4) - this.b;
/*     */       
/* 139 */       if (i >= 0 && i < this.c.length && j >= 0 && j < (this.c[i]).length) {
/* 140 */         amy amy1 = this.c[i][j];
/* 141 */         if (amy1 != null) {
/* 142 */           return amy1.g(☃);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 148 */     return afi.a.Q();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ady b(cj ☃) {
/* 158 */     return this.e.b(☃);
/*     */   }
/*     */   
/*     */   private int a(ads ☃, cj cj1) {
/* 162 */     if (☃ == ads.a && this.e.t.o()) {
/* 163 */       return 0;
/*     */     }
/* 165 */     if (cj1.o() < 0 || cj1.o() >= 256) {
/* 166 */       return ☃.c;
/*     */     }
/*     */     
/* 169 */     if (p(cj1).c().s()) {
/* 170 */       int k = 0; cq[] arrayOfCq; int m, n;
/* 171 */       for (arrayOfCq = cq.values(), m = arrayOfCq.length, n = 0; n < m; ) { cq cq = arrayOfCq[n];
/* 172 */         int i1 = b(☃, cj1.a(cq));
/* 173 */         if (i1 > k) {
/* 174 */           k = i1;
/*     */         }
/* 176 */         if (k >= 15)
/* 177 */           return k; 
/*     */         n++; }
/*     */       
/* 180 */       return k;
/*     */     } 
/*     */     
/* 183 */     int i = (cj1.n() >> 4) - this.a;
/* 184 */     int j = (cj1.p() >> 4) - this.b;
/*     */     
/* 186 */     return this.c[i][j].a(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(cj ☃) {
/* 191 */     return (p(☃).c().t() == arm.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ads ☃, cj cj1) {
/* 196 */     if (cj1.o() < 0 || cj1.o() >= 256) {
/* 197 */       return ☃.c;
/*     */     }
/* 199 */     int i = (cj1.n() >> 4) - this.a;
/* 200 */     int j = (cj1.p() >> 4) - this.b;
/*     */     
/* 202 */     return this.c[i][j].a(☃, cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(cj ☃, cq cq1) {
/* 212 */     alz alz = p(☃);
/* 213 */     return alz.c().b(this, ☃, alz, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public adr G() {
/* 218 */     return this.e.G();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */