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
/*    */ public class apb
/*    */   extends aot
/*    */ {
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 15 */     while (☃.d(cj1) && cj1.o() > 2) {
/* 16 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 19 */     if (☃.p(cj1).c() != afi.aJ) {
/* 20 */       return false;
/*    */     }
/* 22 */     cj1 = cj1.b(random.nextInt(4));
/*    */     
/* 24 */     int i = random.nextInt(4) + 7;
/* 25 */     int j = i / 4 + random.nextInt(2);
/*    */     
/* 27 */     if (j > 1 && random.nextInt(60) == 0) {
/* 28 */       cj1 = cj1.b(10 + random.nextInt(30));
/*    */     }
/*    */     int k;
/* 31 */     for (k = 0; k < i; k++) {
/* 32 */       float f = (1.0F - k / i) * j;
/* 33 */       int n = ns.f(f);
/*    */       
/* 35 */       for (int i1 = -n; i1 <= n; i1++) {
/* 36 */         float f1 = ns.a(i1) - 0.25F;
/* 37 */         for (int i2 = -n; i2 <= n; i2++) {
/* 38 */           float f2 = ns.a(i2) - 0.25F;
/* 39 */           if ((i1 == 0 && i2 == 0) || f1 * f1 + f2 * f2 <= f * f)
/*    */           {
/*    */             
/* 42 */             if ((i1 != -n && i1 != n && i2 != -n && i2 != n) || 
/* 43 */               random.nextFloat() <= 0.75F) {
/*    */ 
/*    */ 
/*    */ 
/*    */               
/* 48 */               afh afh = ☃.p(cj1.a(i1, k, i2)).c();
/* 49 */               if (afh.t() == arm.a || afh == afi.d || afh == afi.aJ || afh == afi.aI) {
/* 50 */                 a(☃, cj1.a(i1, k, i2), afi.cB.Q());
/*    */               }
/* 52 */               if (k != 0 && n > 1) {
/* 53 */                 afh = ☃.p(cj1.a(i1, -k, i2)).c();
/* 54 */                 if (afh.t() == arm.a || afh == afi.d || afh == afi.aJ || afh == afi.aI)
/* 55 */                   a(☃, cj1.a(i1, -k, i2), afi.cB.Q()); 
/*    */               } 
/*    */             }  } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 61 */     k = j - 1;
/* 62 */     if (k < 0) {
/* 63 */       k = 0;
/* 64 */     } else if (k > 1) {
/* 65 */       k = 1;
/*    */     } 
/* 67 */     for (int m = -k; m <= k; m++) {
/* 68 */       for (int n = -k; n <= k; n++) {
/* 69 */         cj cj2 = cj1.a(m, -1, n);
/* 70 */         int i1 = 50;
/* 71 */         if (Math.abs(m) == 1 && Math.abs(n) == 1) {
/* 72 */           i1 = random.nextInt(5);
/*    */         }
/* 74 */         while (cj2.o() > 50) {
/* 75 */           afh afh = ☃.p(cj2).c();
/* 76 */           if (afh.t() == arm.a || afh == afi.d || afh == afi.aJ || afh == afi.aI || afh == afi.cB) {
/* 77 */             a(☃, cj2, afi.cB.Q());
/*    */ 
/*    */ 
/*    */             
/* 81 */             cj2 = cj2.b();
/* 82 */             i1--;
/* 83 */             if (i1 <= 0) {
/* 84 */               cj2 = cj2.c(random.nextInt(5) + 1);
/* 85 */               i1 = random.nextInt(5);
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 91 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */