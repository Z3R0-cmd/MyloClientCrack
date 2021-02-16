/*     */ import java.util.Iterator;
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
/*     */ public class afo
/*     */   extends afh
/*     */ {
/*  20 */   public static final amn a = amn.a("age", 0, 15);
/*     */   
/*     */   protected afo() {
/*  23 */     super(arm.A);
/*  24 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  25 */     a(true);
/*  26 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  31 */     cj cj2 = cj1.a();
/*  32 */     if (!☃.d(cj2)) {
/*     */       return;
/*     */     }
/*     */     
/*  36 */     int i = 1;
/*  37 */     while (☃.p(cj1.c(i)).c() == this) {
/*  38 */       i++;
/*     */     }
/*     */     
/*  41 */     if (i >= 3) {
/*     */       return;
/*     */     }
/*     */     
/*  45 */     int j = ((Integer)alz1.<Integer>b(a)).intValue();
/*  46 */     if (j == 15) {
/*  47 */       ☃.a(cj2, Q());
/*  48 */       alz alz2 = alz1.a(a, Integer.valueOf(0));
/*  49 */       ☃.a(cj1, alz2, 4);
/*  50 */       a(☃, cj2, alz2, this);
/*     */     } else {
/*  52 */       ☃.a(cj1, alz1.a(a, Integer.valueOf(j + 1)), 4);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  59 */     float f = 0.0625F;
/*  60 */     return new aug((cj1.n() + f), cj1.o(), (cj1.p() + f), ((cj1.n() + 1) - f), ((cj1.o() + 1) - f), ((cj1.p() + 1) - f));
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  65 */     float f = 0.0625F;
/*  66 */     return new aug((cj1.n() + f), cj1.o(), (cj1.p() + f), ((cj1.n() + 1) - f), (cj1.o() + 1), ((cj1.p() + 1) - f));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  81 */     if (super.d(☃, cj1)) {
/*  82 */       return e(☃, cj1);
/*     */     }
/*     */     
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  90 */     if (!e(☃, cj1)) {
/*  91 */       ☃.b(cj1, true);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1) {
/*  96 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  97 */       if (☃.p(cj1.a(cq)).c().t().a()) {
/*  98 */         return false;
/*     */       } }
/*     */     
/* 101 */     afh afh1 = ☃.p(cj1.b()).c();
/* 102 */     return (afh1 == afi.aK || afh1 == afi.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/* 107 */     pk1.a(ow.h, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 112 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 117 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 123 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 128 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */