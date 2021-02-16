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
/*    */ public class apu
/*    */   extends aot
/*    */ {
/*    */   private final alz a;
/*    */   
/*    */   public apu(akc.a ☃) {
/* 17 */     this.a = afi.H.Q().a(akc.a, ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/*    */     afh afh;
/* 24 */     while (((afh = ☃.p(cj1).c()).t() == arm.a || afh.t() == arm.j) && cj1.o() > 0) {
/* 25 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 28 */     for (int i = 0; i < 128; i++) {
/* 29 */       cj cj2 = cj1.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
/* 30 */       if (☃.d(cj2) && 
/* 31 */         afi.H.f(☃, cj2, this.a)) {
/* 32 */         ☃.a(cj2, this.a, 2);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 37 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */