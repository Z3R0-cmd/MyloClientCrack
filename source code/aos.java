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
/*    */ public class aos
/*    */   extends aot
/*    */ {
/*    */   private agi.b a;
/*    */   
/*    */   public void a(agi.b ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 23 */     boolean bool = false;
/*    */     
/* 25 */     for (int i = 0; i < 64; i++) {
/* 26 */       cj cj2 = cj1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 27 */       if (☃.d(cj2) && (!☃.t.o() || cj2.o() < 254) && 
/* 28 */         afi.cF.d(☃, cj2)) {
/* 29 */         afi.cF.a(☃, cj2, this.a, 2);
/* 30 */         bool = true;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 35 */     return bool;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */