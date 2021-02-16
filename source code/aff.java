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
/*     */ public class aff
/*     */   extends afc
/*     */ {
/*     */   public aff() {
/*  23 */     super(arm.s, arn.G);
/*  24 */     c(3.0F);
/*  25 */     a(yz.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/*  30 */     return new akv();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  35 */     if (☃.D) {
/*  36 */       return true;
/*     */     }
/*     */     
/*  39 */     akw akw = ☃.s(cj1);
/*  40 */     if (akw instanceof akv) {
/*  41 */       wn1.a((akv)akw);
/*  42 */       wn1.b(na.N);
/*     */     } 
/*     */     
/*  45 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  50 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  55 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  60 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  65 */     super.a(☃, cj1, alz1, pr1, zx1);
/*     */     
/*  67 */     if (zx1.s()) {
/*  68 */       akw akw = ☃.s(cj1);
/*  69 */       if (akw instanceof akv) {
/*  70 */         ((akv)akw).a(zx1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  77 */     akw akw = ☃.s(cj1);
/*  78 */     if (akw instanceof akv) {
/*  79 */       ((akv)akw).m();
/*  80 */       ☃.c(cj1, this, 1, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/*  86 */     return adf.c;
/*     */   }
/*     */   
/*     */   public static void f(adm ☃, cj cj1) {
/*  90 */     nj.a.submit(new Runnable(☃, cj1)
/*     */         {
/*     */           public void run() {
/*  93 */             amy ☃ = this.a.f(this.b);
/*  94 */             for (int i = this.b.o() - 1; i >= 0; ) {
/*  95 */               cj cj1 = new cj(this.b.n(), i, this.b.p());
/*  96 */               if (☃.d(cj1)) {
/*  97 */                 alz alz = this.a.p(cj1);
/*  98 */                 if (alz.c() == afi.bY)
/*  99 */                   ((le)this.a).a(new Runnable(this, cj1)
/*     */                       {
/*     */                         public void run() {
/* 102 */                           akw ☃ = this.b.a.s(this.a);
/* 103 */                           if (☃ instanceof akv) {
/* 104 */                             ((akv)☃).m();
/* 105 */                             this.b.a.c(this.a, afi.bY, 1, 0);
/*     */                           } 
/*     */                         }
/*     */                       }); 
/*     */                 i--;
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */