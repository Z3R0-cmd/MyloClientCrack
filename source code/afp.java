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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afp
/*     */   extends afh
/*     */ {
/*  25 */   public static final amn a = amn.a("bites", 0, 6);
/*     */   
/*     */   protected afp() {
/*  28 */     super(arm.F);
/*  29 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  30 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  35 */     float f1 = 0.0625F;
/*  36 */     float f2 = (1 + ((Integer)☃.p(cj1).<Integer>b(a)).intValue() * 2) / 16.0F;
/*  37 */     float f3 = 0.5F;
/*  38 */     a(f2, 0.0F, f1, 1.0F - f1, f3, 1.0F - f1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  43 */     float ☃ = 0.0625F;
/*  44 */     float f1 = 0.5F;
/*  45 */     a(☃, 0.0F, ☃, 1.0F - ☃, f1, 1.0F - ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  51 */     float f1 = 0.0625F;
/*  52 */     float f2 = (1 + ((Integer)alz1.<Integer>b(a)).intValue() * 2) / 16.0F;
/*  53 */     float f3 = 0.5F;
/*  54 */     return new aug((cj1.n() + f2), cj1.o(), (cj1.p() + f1), ((cj1.n() + 1) - f1), (cj1.o() + f3), ((cj1.p() + 1) - f1));
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  59 */     return a(☃, cj1, ☃.p(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  74 */     b(☃, cj1, alz1, wn1);
/*  75 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, wn wn1) {
/*  80 */     b(☃, cj1, ☃.p(cj1), wn1);
/*     */   }
/*     */   
/*     */   private void b(adm ☃, cj cj1, alz alz1, wn wn1) {
/*  84 */     if (!wn1.j(false)) {
/*     */       return;
/*     */     }
/*  87 */     wn1.b(na.H);
/*     */     
/*  89 */     wn1.cl().a(2, 0.1F);
/*  90 */     int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  91 */     if (i < 6) {
/*  92 */       ☃.a(cj1, alz1.a(a, Integer.valueOf(i + 1)), 3);
/*     */     } else {
/*  94 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 100 */     if (super.d(☃, cj1)) {
/* 101 */       return e(☃, cj1);
/*     */     }
/*     */     
/* 104 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 109 */     if (!e(☃, cj1)) {
/* 110 */       ☃.g(cj1);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1) {
/* 115 */     return ☃.p(cj1.b()).c().t().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 120 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 126 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 131 */     return zy.aZ;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 136 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 141 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 147 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 152 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 157 */     return (7 - ((Integer)☃.p(cj1).<Integer>b(a)).intValue()) * 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 162 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */