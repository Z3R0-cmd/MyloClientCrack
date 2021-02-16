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
/*     */ public class aja
/*     */   extends afh
/*     */ {
/*     */   private final boolean a;
/*     */   
/*     */   public aja(boolean ☃) {
/*  22 */     super(arm.e);
/*  23 */     if (☃) {
/*  24 */       a(true);
/*     */     }
/*  26 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  31 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, wn wn1) {
/*  36 */     e(☃, cj1);
/*  37 */     super.a(☃, cj1, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, pk pk1) {
/*  42 */     e(☃, cj1);
/*  43 */     super.a(☃, cj1, pk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  48 */     e(☃, cj1);
/*  49 */     return super.a(☃, cj1, alz1, wn1, cq1, f1, f2, f3);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1) {
/*  53 */     f(☃, cj1);
/*  54 */     if (this == afi.aC) {
/*  55 */       ☃.a(cj1, afi.aD.Q());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  61 */     if (this == afi.aD) {
/*  62 */       ☃.a(cj1, afi.aC.Q());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  69 */     return zy.aC;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, Random random) {
/*  74 */     return a(random) + random.nextInt(☃ + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  79 */     return 4 + ☃.nextInt(2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/*  84 */     super.a(☃, cj1, alz1, f, i);
/*     */ 
/*     */     
/*  87 */     if (a(alz1, ☃.s, i) != zw.a(this)) {
/*  88 */       int j = 1 + ☃.s.nextInt(5);
/*  89 */       b(☃, cj1, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/*  95 */     if (this.a) {
/*  96 */       f(☃, cj1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void f(adm ☃, cj cj1) {
/* 101 */     Random random = ☃.s;
/* 102 */     double d = 0.0625D;
/* 103 */     for (int i = 0; i < 6; i++) {
/* 104 */       double d1 = (cj1.n() + random.nextFloat());
/* 105 */       double d2 = (cj1.o() + random.nextFloat());
/* 106 */       double d3 = (cj1.p() + random.nextFloat());
/* 107 */       if (i == 0 && !☃.p(cj1.a()).c().c()) {
/* 108 */         d2 = cj1.o() + d + 1.0D;
/*     */       }
/* 110 */       if (i == 1 && !☃.p(cj1.b()).c().c()) {
/* 111 */         d2 = cj1.o() - d;
/*     */       }
/* 113 */       if (i == 2 && !☃.p(cj1.d()).c().c()) {
/* 114 */         d3 = cj1.p() + d + 1.0D;
/*     */       }
/* 116 */       if (i == 3 && !☃.p(cj1.c()).c().c()) {
/* 117 */         d3 = cj1.p() - d;
/*     */       }
/* 119 */       if (i == 4 && !☃.p(cj1.f()).c().c()) {
/* 120 */         d1 = cj1.n() + d + 1.0D;
/*     */       }
/* 122 */       if (i == 5 && !☃.p(cj1.e()).c().c()) {
/* 123 */         d1 = cj1.n() - d;
/*     */       }
/* 125 */       if (d1 < cj1.n() || d1 > (cj1.n() + 1) || d2 < 0.0D || d2 > (cj1.o() + 1) || d3 < cj1.p() || d3 > (cj1.p() + 1)) {
/* 126 */         ☃.a(cy.E, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/* 133 */     return new zx(afi.aC);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */