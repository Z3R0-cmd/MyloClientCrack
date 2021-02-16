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
/*    */ public class apw
/*    */   extends aot
/*    */ {
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 16 */     while (cj1.o() < 128) {
/* 17 */       if (☃.d(cj1)) {
/*    */         cq[] arrayOfCq; int i; int j;
/* 19 */         for (arrayOfCq = cq.c.a.a(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 20 */           if (afi.bn.b(☃, cj1, cq)) {
/* 21 */             alz alz = afi.bn.Q().<Comparable, Boolean>a(akk.b, Boolean.valueOf((cq == cq.c))).<Comparable, Boolean>a(akk.N, Boolean.valueOf((cq == cq.f))).<Comparable, Boolean>a(akk.O, Boolean.valueOf((cq == cq.d))).a(akk.P, Boolean.valueOf((cq == cq.e)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 27 */             ☃.a(cj1, alz, 2); break;
/*    */           } 
/*    */           j++; }
/*    */       
/*    */       } else {
/* 32 */         cj1 = cj1.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
/*    */       } 
/* 34 */       cj1 = cj1.a();
/*    */     } 
/*    */     
/* 37 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */