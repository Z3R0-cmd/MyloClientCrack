/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aop
/*    */   extends aot
/*    */ {
/*    */   private afh a;
/*    */   private int b;
/*    */   
/*    */   public aop(int ☃) {
/* 16 */     this.a = afi.aL;
/* 17 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 22 */     if (☃.p(cj1).c().t() != arm.h) {
/* 23 */       return false;
/*    */     }
/* 25 */     int i = random.nextInt(this.b - 2) + 2;
/* 26 */     int j = 1;
/* 27 */     for (int k = cj1.n() - i; k <= cj1.n() + i; k++) {
/* 28 */       for (int m = cj1.p() - i; m <= cj1.p() + i; m++) {
/* 29 */         int n = k - cj1.n();
/* 30 */         int i1 = m - cj1.p();
/* 31 */         if (n * n + i1 * i1 <= i * i)
/*    */         {
/*    */           
/* 34 */           for (int i2 = cj1.o() - j; i2 <= cj1.o() + j; i2++) {
/* 35 */             cj cj2 = new cj(k, i2, m);
/* 36 */             afh afh1 = ☃.p(cj2).c();
/* 37 */             if (afh1 == afi.d || afh1 == afi.aL) {
/* 38 */               ☃.a(cj2, this.a.Q(), 2);
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */