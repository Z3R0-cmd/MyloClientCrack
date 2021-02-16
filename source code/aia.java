/*     */ import java.util.Iterator;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aia
/*     */   extends afm
/*     */   implements afj
/*     */ {
/*     */   protected aia() {
/*  13 */     float ☃ = 0.2F;
/*  14 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃ * 2.0F, 0.5F + ☃);
/*  15 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  20 */     if (random.nextInt(25) == 0) {
/*  21 */       int i = 5;
/*  22 */       int j = 4;
/*  23 */       for (Iterator<cj.a> iterator = cj.b(cj1.a(-4, -1, -4), cj1.a(4, 1, 4)).iterator(); iterator.hasNext(); ) { cj cj3 = iterator.next();
/*  24 */         if (☃.p(cj3).c() == this && --i <= 0) {
/*     */           return;
/*     */         } }
/*     */ 
/*     */ 
/*     */       
/*  30 */       cj cj2 = cj1.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
/*  31 */       for (int k = 0; k < 4; k++) {
/*  32 */         if (☃.d(cj2) && f(☃, cj2, Q())) {
/*  33 */           cj1 = cj2;
/*     */         }
/*  35 */         cj2 = cj1.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
/*     */       } 
/*     */       
/*  38 */       if (☃.d(cj2) && f(☃, cj2, Q())) {
/*  39 */         ☃.a(cj2, Q(), 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  46 */     return (super.d(☃, cj1) && f(☃, cj1, Q()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(afh ☃) {
/*  51 */     return ☃.o();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(adm ☃, cj cj1, alz alz1) {
/*  56 */     if (cj1.o() < 0 || cj1.o() >= 256) {
/*  57 */       return false;
/*     */     }
/*     */     
/*  60 */     alz alz2 = ☃.p(cj1.b());
/*  61 */     if (alz2.c() == afi.bw) {
/*  62 */       return true;
/*     */     }
/*  64 */     if (alz2.c() == afi.d && alz2.b(agf.a) == agf.a.c) {
/*  65 */       return true;
/*     */     }
/*     */     
/*  68 */     return (☃.k(cj1) < 13 && c(alz2.c()));
/*     */   }
/*     */   
/*     */   public boolean d(adm ☃, cj cj1, alz alz1, Random random) {
/*  72 */     ☃.g(cj1);
/*     */     
/*  74 */     aot aot = null;
/*  75 */     if (this == afi.P) {
/*  76 */       aot = new aoz(afi.bg);
/*  77 */     } else if (this == afi.Q) {
/*  78 */       aot = new aoz(afi.bh);
/*     */     } 
/*     */     
/*  81 */     if (aot != null && aot.b(☃, random, cj1)) {
/*  82 */       return true;
/*     */     }
/*     */     
/*  85 */     ☃.a(cj1, alz1, 3);
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/*  96 */     return (random.nextFloat() < 0.4D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 101 */     d(☃, cj1, alz1, random);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */