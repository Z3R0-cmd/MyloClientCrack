/*     */ import java.util.Iterator;
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
/*     */ public class ahr
/*     */   extends afh
/*     */ {
/*  19 */   public static final aml a = aml.a("facing", cq.c.a);
/*     */   
/*     */   protected ahr() {
/*  22 */     super(arm.q);
/*  23 */     j(this.M.b().a(a, cq.c));
/*  24 */     a(yz.c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  30 */     a(☃, cj1);
/*  31 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  36 */     a(☃, cj1);
/*  37 */     return super.b(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  42 */     alz alz = ☃.p(cj1);
/*  43 */     if (alz.c() != this) {
/*     */       return;
/*     */     }
/*     */     
/*  47 */     float f = 0.125F;
/*  48 */     switch (null.a[((cq)alz.b(a)).ordinal()]) {
/*     */       case 1:
/*  50 */         a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*     */         return;
/*     */       case 2:
/*  53 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*     */         return;
/*     */       case 3:
/*  56 */         a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         return;
/*     */     } 
/*     */     
/*  60 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  67 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  77 */     if (☃.p(cj1.e()).c().v())
/*  78 */       return true; 
/*  79 */     if (☃.p(cj1.f()).c().v())
/*  80 */       return true; 
/*  81 */     if (☃.p(cj1.c()).c().v())
/*  82 */       return true; 
/*  83 */     if (☃.p(cj1.d()).c().v()) {
/*  84 */       return true;
/*     */     }
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  91 */     if (cq1.k().c() && a(☃, cj1, cq1)) {
/*  92 */       return Q().a(a, cq1);
/*     */     }
/*     */     
/*  95 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq2 = iterator.next();
/*  96 */       if (a(☃, cj1, cq2)) {
/*  97 */         return Q().a(a, cq2);
/*     */       } }
/*     */ 
/*     */     
/* 101 */     return Q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 106 */     cq cq = alz1.<cq>b(a);
/* 107 */     if (!a(☃, cj1, cq)) {
/* 108 */       b(☃, cj1, alz1, 0);
/* 109 */       ☃.g(cj1);
/*     */     } 
/*     */     
/* 112 */     super.a(☃, cj1, alz1, afh1);
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, cj cj1, cq cq1) {
/* 116 */     return ☃.p(cj1.a(cq1.d())).c().v();
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 121 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 126 */     cq cq = cq.a(☃);
/* 127 */     if (cq.k() == cq.a.b) {
/* 128 */       cq = cq.c;
/*     */     }
/* 130 */     return Q().a(a, cq);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 136 */     return ((cq)☃.<cq>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 141 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */