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
/*     */ public class agj
/*     */   extends afh
/*     */ {
/*     */   public agj() {
/*  19 */     super(arm.D, arn.E);
/*     */     
/*  21 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  26 */     ☃.a(cj1, this, a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  31 */     ☃.a(cj1, this, a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  36 */     e(☃, cj1);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1) {
/*  40 */     if (!agr.e(☃, cj1.b()) || cj1.o() < 0) {
/*     */       return;
/*     */     }
/*     */     
/*  44 */     int i = 32;
/*  45 */     if (agr.N || !☃.a(cj1.a(-i, -i, -i), cj1.a(i, i, i))) {
/*  46 */       ☃.g(cj1);
/*     */       
/*  48 */       cj cj2 = cj1;
/*  49 */       while (agr.e(☃, cj2) && cj2.o() > 0) {
/*  50 */         cj2 = cj2.b();
/*     */       }
/*  52 */       if (cj2.o() > 0) {
/*  53 */         ☃.a(cj2, Q(), 2);
/*     */       }
/*     */     } else {
/*  56 */       ☃.d(new uy(☃, (cj1.n() + 0.5F), cj1.o(), (cj1.p() + 0.5F), Q()));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  62 */     f(☃, cj1);
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, wn wn1) {
/*  68 */     f(☃, cj1);
/*     */   }
/*     */   
/*     */   private void f(adm ☃, cj cj1) {
/*  72 */     alz alz = ☃.p(cj1);
/*  73 */     if (alz.c() != this) {
/*     */       return;
/*     */     }
/*     */     
/*  77 */     for (int i = 0; i < 1000; i++) {
/*  78 */       cj cj2 = cj1.a(☃.s.nextInt(16) - ☃.s.nextInt(16), ☃.s.nextInt(8) - ☃.s.nextInt(8), ☃.s.nextInt(16) - ☃.s.nextInt(16));
/*  79 */       if ((☃.p(cj2).c()).J == arm.a) {
/*  80 */         if (☃.D) {
/*  81 */           for (int j = 0; j < 128; j++) {
/*  82 */             double d1 = ☃.s.nextDouble();
/*  83 */             float f1 = (☃.s.nextFloat() - 0.5F) * 0.2F;
/*  84 */             float f2 = (☃.s.nextFloat() - 0.5F) * 0.2F;
/*  85 */             float f3 = (☃.s.nextFloat() - 0.5F) * 0.2F;
/*     */             
/*  87 */             double d2 = cj2.n() + (cj1.n() - cj2.n()) * d1 + (☃.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  88 */             double d3 = cj2.o() + (cj1.o() - cj2.o()) * d1 + ☃.s.nextDouble() * 1.0D - 0.5D;
/*  89 */             double d4 = cj2.p() + (cj1.p() - cj2.p()) * d1 + (☃.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  90 */             ☃.a(cy.y, d2, d3, d4, f1, f2, f3, new int[0]);
/*     */           } 
/*     */         } else {
/*  93 */           ☃.a(cj2, alz, 2);
/*  94 */           ☃.g(cj1);
/*     */         } 
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/* 103 */     return 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 113 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 118 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 123 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */