/*    */ import java.util.List;
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
/*    */ public class aol
/*    */   extends aot
/*    */ {
/*    */   private final List<ob> a;
/*    */   private final int b;
/*    */   
/*    */   public aol(List<ob> ☃, int i) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/*    */     afh afh;
/* 27 */     while (((afh = ☃.p(cj1).c()).t() == arm.a || afh.t() == arm.j) && cj1.o() > 1) {
/* 28 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 31 */     if (cj1.o() < 1) {
/* 32 */       return false;
/*    */     }
/* 34 */     cj1 = cj1.a();
/*    */     
/* 36 */     for (int i = 0; i < 4; i++) {
/* 37 */       cj cj2 = cj1.a(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
/*    */       
/* 39 */       if (☃.d(cj2) && adm.a(☃, cj2.b())) {
/* 40 */         ☃.a(cj2, afi.ae.Q(), 2);
/*    */         
/* 42 */         akw akw = ☃.s(cj2);
/* 43 */         if (akw instanceof aky) {
/* 44 */           ob.a(random, this.a, (aky)akw, this.b);
/*    */         }
/*    */         
/* 47 */         cj cj3 = cj2.f();
/* 48 */         cj cj4 = cj2.e();
/* 49 */         cj cj5 = cj2.c();
/* 50 */         cj cj6 = cj2.d();
/* 51 */         if (☃.d(cj4) && adm.a(☃, cj4.b())) {
/* 52 */           ☃.a(cj4, afi.aa.Q(), 2);
/*    */         }
/* 54 */         if (☃.d(cj3) && adm.a(☃, cj3.b())) {
/* 55 */           ☃.a(cj3, afi.aa.Q(), 2);
/*    */         }
/* 57 */         if (☃.d(cj5) && adm.a(☃, cj5.b())) {
/* 58 */           ☃.a(cj5, afi.aa.Q(), 2);
/*    */         }
/* 60 */         if (☃.d(cj6) && adm.a(☃, cj6.b())) {
/* 61 */           ☃.a(cj6, afi.aa.Q(), 2);
/*    */         }
/* 63 */         return true;
/*    */       } 
/*    */     } 
/*    */     
/* 67 */     return false;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */