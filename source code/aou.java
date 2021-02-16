/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aou
/*    */   extends aot
/*    */ {
/*    */   private agw a;
/*    */   private alz b;
/*    */   
/*    */   public aou(agw ☃, agw.a a1) {
/* 16 */     a(☃, a1);
/*    */   }
/*    */   
/*    */   public void a(agw ☃, agw.a a1) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = ☃.Q().a(☃.n(), a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 26 */     for (int i = 0; i < 64; i++) {
/* 27 */       cj cj2 = cj1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 28 */       if (☃.d(cj2) && (!☃.t.o() || cj2.o() < 255) && 
/* 29 */         this.a.f(☃, cj2, this.b)) {
/* 30 */         ☃.a(cj2, this.b, 2);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 35 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */