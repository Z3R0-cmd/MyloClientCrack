/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agm
/*    */   extends afc
/*    */ {
/*    */   protected agm() {
/* 21 */     super(arm.e, arn.D);
/* 22 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 23 */     e(0);
/* 24 */     a(yz.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean d() {
/* 29 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 34 */     super.c(☃, cj1, alz1, random);
/*    */     
/* 36 */     for (int i = -2; i <= 2; i++) {
/* 37 */       for (int j = -2; j <= 2; j++) {
/* 38 */         if (i > -2 && i < 2 && j == -1) {
/* 39 */           j = 2;
/*    */         }
/* 41 */         if (random.nextInt(16) == 0)
/*    */         {
/*    */           
/* 44 */           for (int k = 0; k <= 1; k++) {
/* 45 */             cj cj2 = cj1.a(i, k, j);
/* 46 */             if (☃.p(cj2).c() == afi.X) {
/* 47 */               if (!☃.d(cj1.a(i / 2, 0, j / 2))) {
/*    */                 break;
/*    */               }
/*    */               
/* 51 */               ☃.a(cy.z, cj1.n() + 0.5D, cj1.o() + 2.0D, cj1.p() + 0.5D, (i + random.nextFloat()) - 0.5D, (k - random.nextFloat() - 1.0F), (j + random.nextFloat()) - 0.5D, new int[0]);
/*    */             } 
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 60 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 65 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public akw a(adm ☃, int i) {
/* 70 */     return new ale();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 75 */     if (☃.D) {
/* 76 */       return true;
/*    */     }
/*    */     
/* 79 */     akw akw = ☃.s(cj1);
/* 80 */     if (akw instanceof ale) {
/* 81 */       wn1.a((ale)akw);
/*    */     }
/*    */     
/* 84 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/* 89 */     super.a(☃, cj1, alz1, pr1, zx1);
/* 90 */     if (zx1.s()) {
/* 91 */       akw akw = ☃.s(cj1);
/* 92 */       if (akw instanceof ale)
/* 93 */         ((ale)akw).a(zx1.q()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */