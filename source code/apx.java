/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apx
/*    */   extends aot
/*    */ {
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 13 */     for (int i = 0; i < 10; i++) {
/* 14 */       int j = cj1.n() + random.nextInt(8) - random.nextInt(8);
/* 15 */       int k = cj1.o() + random.nextInt(4) - random.nextInt(4);
/* 16 */       int m = cj1.p() + random.nextInt(8) - random.nextInt(8);
/* 17 */       if (☃.d(new cj(j, k, m)) && 
/* 18 */         afi.bx.d(☃, new cj(j, k, m))) {
/* 19 */         ☃.a(new cj(j, k, m), afi.bx.Q(), 2);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 24 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */