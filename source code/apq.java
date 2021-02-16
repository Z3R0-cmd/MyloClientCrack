/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apq
/*    */   extends aot
/*    */ {
/*    */   private afh a;
/*    */   
/*    */   public apq(afh ☃) {
/* 16 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 21 */     if (!☃.d(cj1) || ☃.p(cj1.b()).c() != this.a) {
/* 22 */       return false;
/*    */     }
/* 24 */     int i = random.nextInt(32) + 6;
/* 25 */     int j = random.nextInt(4) + 1;
/* 26 */     cj.a a = new cj.a(); int k;
/* 27 */     for (k = cj1.n() - j; k <= cj1.n() + j; k++) {
/* 28 */       for (int m = cj1.p() - j; m <= cj1.p() + j; m++) {
/* 29 */         int n = k - cj1.n();
/* 30 */         int i1 = m - cj1.p();
/* 31 */         if (n * n + i1 * i1 <= j * j + 1 && 
/* 32 */           ☃.p(a.c(k, cj1.o() - 1, m)).c() != this.a) {
/* 33 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 38 */     for (k = cj1.o(); k < cj1.o() + i && 
/* 39 */       k < 256; k++) {
/* 40 */       for (int m = cj1.n() - j; m <= cj1.n() + j; m++) {
/* 41 */         for (int n = cj1.p() - j; n <= cj1.p() + j; n++) {
/* 42 */           int i1 = m - cj1.n();
/* 43 */           int i2 = n - cj1.p();
/* 44 */           if (i1 * i1 + i2 * i2 <= j * j + 1) {
/* 45 */             ☃.a(new cj(m, k, n), afi.Z.Q(), 2);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     pk pk = new uf(☃);
/* 55 */     pk.b((cj1.n() + 0.5F), (cj1.o() + i), (cj1.p() + 0.5F), random.nextFloat() * 360.0F, 0.0F);
/* 56 */     ☃.d(pk);
/* 57 */     ☃.a(cj1.b(i), afi.h.Q(), 2);
/*    */     
/* 59 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */