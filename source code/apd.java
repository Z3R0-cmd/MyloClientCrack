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
/*    */ public class apd
/*    */   extends aot
/*    */ {
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 15 */     if (!☃.d(cj1)) {
/* 16 */       return false;
/*    */     }
/* 18 */     if (☃.p(cj1.a()).c() != afi.aV) {
/* 19 */       return false;
/*    */     }
/* 21 */     ☃.a(cj1, afi.aX.Q(), 2);
/*    */     
/* 23 */     for (int i = 0; i < 1500; i++) {
/* 24 */       cj cj2 = cj1.a(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
/* 25 */       if (☃.p(cj2).c().t() == arm.a) {
/*    */ 
/*    */ 
/*    */         
/* 29 */         int j = 0; cq[] arrayOfCq; int k, m;
/* 30 */         for (arrayOfCq = cq.values(), k = arrayOfCq.length, m = 0; m < k; ) { cq cq = arrayOfCq[m];
/* 31 */           if (☃.p(cj2.a(cq)).c() == afi.aX) {
/* 32 */             j++;
/*    */           }
/*    */           
/* 35 */           if (j > 1) {
/*    */             break;
/*    */           }
/*    */           m++; }
/*    */         
/* 40 */         if (j == 1) {
/* 41 */           ☃.a(cj2, afi.aX.Q(), 2);
/*    */         }
/*    */       } 
/*    */     } 
/* 45 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */