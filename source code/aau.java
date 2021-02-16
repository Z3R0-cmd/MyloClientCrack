/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aau
/*     */   extends yo
/*     */ {
/*     */   private final ahh b;
/*     */   private final ahh c;
/*     */   
/*     */   public aau(afh ☃, ahh ahh1, ahh ahh2) {
/*  17 */     super(☃);
/*  18 */     this.b = ahh1;
/*  19 */     this.c = ahh2;
/*     */     
/*  21 */     d(0);
/*  22 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃) {
/*  27 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_(zx ☃) {
/*  32 */     return this.b.b(☃.i());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/*  37 */     if (☃.b == 0) {
/*  38 */       return false;
/*     */     }
/*  40 */     if (!wn1.a(cj1.a(cq1), cq1, ☃)) {
/*  41 */       return false;
/*     */     }
/*     */     
/*  44 */     Object object = this.b.a(☃);
/*  45 */     alz alz = adm1.p(cj1);
/*     */     
/*  47 */     if (alz.c() == this.b) {
/*  48 */       amo<?> amo = this.b.n();
/*  49 */       Comparable comparable = (Comparable)alz.b(amo);
/*  50 */       ahh.a a = alz.<ahh.a>b(ahh.a);
/*     */       
/*  52 */       if (((cq1 == cq.b && a == ahh.a.b) || (cq1 == cq.a && a == ahh.a.a)) && comparable == object) {
/*  53 */         alz alz1 = this.c.Q().a(amo, comparable);
/*     */         
/*  55 */         if (adm1.b(this.c.a(adm1, cj1, alz1)) && adm1.a(cj1, alz1, 3)) {
/*  56 */           adm1.a((cj1.n() + 0.5F), (cj1.o() + 0.5F), (cj1.p() + 0.5F), this.c.H.b(), (this.c.H.d() + 1.0F) / 2.0F, this.c.H.e() * 0.8F);
/*  57 */           ☃.b--;
/*     */         } 
/*  59 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     if (a(☃, adm1, cj1.a(cq1), object)) {
/*  64 */       return true;
/*     */     }
/*     */     
/*  67 */     return super.a(☃, wn1, adm1, cj1, cq1, f1, f2, f3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, cq cq1, wn wn1, zx zx1) {
/*  72 */     cj cj2 = cj1;
/*     */     
/*  74 */     amo<?> amo = this.b.n();
/*  75 */     Object object = this.b.a(zx1);
/*     */     
/*  77 */     alz alz1 = ☃.p(cj1);
/*     */     
/*  79 */     if (alz1.c() == this.b) {
/*  80 */       boolean bool = (alz1.b(ahh.a) == ahh.a.a);
/*     */       
/*  82 */       if (((cq1 == cq.b && !bool) || (cq1 == cq.a && bool)) && object == alz1.b(amo)) {
/*  83 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  87 */     cj1 = cj1.a(cq1);
/*  88 */     alz alz2 = ☃.p(cj1);
/*  89 */     if (alz2.c() == this.b && object == alz2.b(amo)) {
/*  90 */       return true;
/*     */     }
/*     */     
/*  93 */     return super.a(☃, cj2, cq1, wn1, zx1);
/*     */   }
/*     */   
/*     */   private boolean a(zx ☃, adm adm1, cj cj1, Object object) {
/*  97 */     alz alz = adm1.p(cj1);
/*  98 */     if (alz.c() == this.b) {
/*  99 */       Comparable comparable = (Comparable)alz.b(this.b.n());
/*     */       
/* 101 */       if (comparable == object) {
/* 102 */         alz alz1 = this.c.Q().a(this.b.n(), comparable);
/*     */         
/* 104 */         if (adm1.b(this.c.a(adm1, cj1, alz1)) && adm1.a(cj1, alz1, 3)) {
/* 105 */           adm1.a((cj1.n() + 0.5F), (cj1.o() + 0.5F), (cj1.p() + 0.5F), this.c.H.b(), (this.c.H.d() + 1.0F) / 2.0F, this.c.H.e() * 0.8F);
/* 106 */           ☃.b--;
/*     */         } 
/*     */         
/* 109 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 113 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */