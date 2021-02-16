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
/*    */ public class aoq
/*    */   extends aot
/*    */ {
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/*    */     afh afh;
/* 18 */     while (((afh = ☃.p(cj1).c()).t() == arm.a || afh.t() == arm.j) && cj1.o() > 0) {
/* 19 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 22 */     for (int i = 0; i < 4; i++) {
/* 23 */       cj cj2 = cj1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 24 */       if (☃.d(cj2) && 
/* 25 */         afi.I.f(☃, cj2, afi.I.Q())) {
/* 26 */         ☃.a(cj2, afi.I.Q(), 2);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aoq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */