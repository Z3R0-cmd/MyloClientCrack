/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aoy
/*    */   extends aot
/*    */ {
/*    */   private final afh a;
/*    */   private final boolean b;
/*    */   
/*    */   public aoy(afh ☃, boolean bool) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 22 */     if (☃.p(cj1.a()).c() != afi.aV) {
/* 23 */       return false;
/*    */     }
/* 25 */     if (☃.p(cj1).c().t() != arm.a && ☃.p(cj1).c() != afi.aV) {
/* 26 */       return false;
/*    */     }
/*    */     
/* 29 */     int i = 0;
/* 30 */     if (☃.p(cj1.e()).c() == afi.aV) {
/* 31 */       i++;
/*    */     }
/* 33 */     if (☃.p(cj1.f()).c() == afi.aV) {
/* 34 */       i++;
/*    */     }
/* 36 */     if (☃.p(cj1.c()).c() == afi.aV) {
/* 37 */       i++;
/*    */     }
/* 39 */     if (☃.p(cj1.d()).c() == afi.aV) {
/* 40 */       i++;
/*    */     }
/* 42 */     if (☃.p(cj1.b()).c() == afi.aV) {
/* 43 */       i++;
/*    */     }
/*    */     
/* 46 */     int j = 0;
/* 47 */     if (☃.d(cj1.e())) {
/* 48 */       j++;
/*    */     }
/* 50 */     if (☃.d(cj1.f())) {
/* 51 */       j++;
/*    */     }
/* 53 */     if (☃.d(cj1.c())) {
/* 54 */       j++;
/*    */     }
/* 56 */     if (☃.d(cj1.d())) {
/* 57 */       j++;
/*    */     }
/* 59 */     if (☃.d(cj1.b())) {
/* 60 */       j++;
/*    */     }
/*    */     
/* 63 */     if ((!this.b && i == 4 && j == 1) || i == 5) {
/* 64 */       ☃.a(cj1, this.a.Q(), 2);
/* 65 */       ☃.a(this.a, cj1, random);
/*    */     } 
/*    */     
/* 68 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aoy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */