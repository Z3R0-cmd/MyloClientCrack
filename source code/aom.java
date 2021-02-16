/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aom
/*    */   extends aot
/*    */ {
/*    */   private afm a;
/*    */   
/*    */   public aom(afm ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 19 */     for (int i = 0; i < 64; i++) {
/* 20 */       cj cj2 = cj1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 21 */       if (☃.d(cj2) && (!☃.t.o() || cj2.o() < 255) && 
/* 22 */         this.a.f(☃, cj2, this.a.Q())) {
/* 23 */         ☃.a(cj2, this.a.Q(), 2);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 28 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */