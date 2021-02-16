/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apa
/*    */   extends aot
/*    */ {
/*    */   private afh a;
/*    */   private int b;
/*    */   
/*    */   public apa(int ☃) {
/* 15 */     this.a = afi.cB;
/* 16 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 21 */     while (☃.d(cj1) && cj1.o() > 2) {
/* 22 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 25 */     if (☃.p(cj1).c() != afi.aJ) {
/* 26 */       return false;
/*    */     }
/* 28 */     int i = random.nextInt(this.b - 2) + 2;
/* 29 */     int j = 1;
/* 30 */     for (int k = cj1.n() - i; k <= cj1.n() + i; k++) {
/* 31 */       for (int m = cj1.p() - i; m <= cj1.p() + i; m++) {
/* 32 */         int n = k - cj1.n();
/* 33 */         int i1 = m - cj1.p();
/* 34 */         if (n * n + i1 * i1 <= i * i)
/*    */         {
/*    */           
/* 37 */           for (int i2 = cj1.o() - j; i2 <= cj1.o() + j; i2++) {
/* 38 */             cj cj2 = new cj(k, i2, m);
/* 39 */             afh afh1 = ☃.p(cj2).c();
/* 40 */             if (afh1 == afi.d || afh1 == afi.aJ || afh1 == afi.aI) {
/* 41 */               ☃.a(cj2, this.a.Q(), 2);
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/* 47 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */