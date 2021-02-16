/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aov
/*    */   extends apv
/*    */ {
/*    */   private final alz a;
/*    */   private final alz b;
/*    */   
/*    */   public aov(alz ☃, alz alz1) {
/* 17 */     super(false);
/* 18 */     this.b = ☃;
/* 19 */     this.a = alz1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/*    */     afh afh1;
/* 26 */     while (((afh1 = ☃.p(cj1).c()).t() == arm.a || afh1.t() == arm.j) && cj1.o() > 0) {
/* 27 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 30 */     afh afh2 = ☃.p(cj1).c();
/* 31 */     if (afh2 == afi.d || afh2 == afi.c) {
/* 32 */       cj1 = cj1.a();
/* 33 */       a(☃, cj1, this.b);
/*    */       
/* 35 */       for (int i = cj1.o(); i <= cj1.o() + 2; i++) {
/* 36 */         int j = i - cj1.o();
/* 37 */         int k = 2 - j;
/* 38 */         for (int m = cj1.n() - k; m <= cj1.n() + k; m++) {
/* 39 */           int n = m - cj1.n();
/* 40 */           for (int i1 = cj1.p() - k; i1 <= cj1.p() + k; i1++) {
/* 41 */             int i2 = i1 - cj1.p();
/* 42 */             if (Math.abs(n) != k || Math.abs(i2) != k || random.nextInt(2) != 0) {
/*    */ 
/*    */               
/* 45 */               cj cj2 = new cj(m, i, i1);
/* 46 */               if (!☃.p(cj2).c().o())
/* 47 */                 a(☃, cj2, this.a); 
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 53 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */