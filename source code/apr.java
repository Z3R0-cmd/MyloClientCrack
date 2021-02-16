/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apr
/*    */   extends aot
/*    */ {
/*    */   private afh a;
/*    */   
/*    */   public apr(afh ☃) {
/* 15 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 20 */     if (☃.p(cj1.a()).c() != afi.b) {
/* 21 */       return false;
/*    */     }
/* 23 */     if (☃.p(cj1.b()).c() != afi.b) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     if (☃.p(cj1).c().t() != arm.a && ☃.p(cj1).c() != afi.b) {
/* 28 */       return false;
/*    */     }
/*    */     
/* 31 */     int i = 0;
/* 32 */     if (☃.p(cj1.e()).c() == afi.b) {
/* 33 */       i++;
/*    */     }
/* 35 */     if (☃.p(cj1.f()).c() == afi.b) {
/* 36 */       i++;
/*    */     }
/* 38 */     if (☃.p(cj1.c()).c() == afi.b) {
/* 39 */       i++;
/*    */     }
/* 41 */     if (☃.p(cj1.d()).c() == afi.b) {
/* 42 */       i++;
/*    */     }
/*    */     
/* 45 */     int j = 0;
/* 46 */     if (☃.d(cj1.e())) {
/* 47 */       j++;
/*    */     }
/* 49 */     if (☃.d(cj1.f())) {
/* 50 */       j++;
/*    */     }
/* 52 */     if (☃.d(cj1.c())) {
/* 53 */       j++;
/*    */     }
/* 55 */     if (☃.d(cj1.d())) {
/* 56 */       j++;
/*    */     }
/*    */     
/* 59 */     if (i == 3 && j == 1) {
/* 60 */       ☃.a(cj1, this.a.Q(), 2);
/* 61 */       ☃.a(this.a, cj1, random);
/*    */     } 
/*    */     
/* 64 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */