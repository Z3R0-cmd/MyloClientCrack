/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agr
/*    */   extends afh
/*    */ {
/*    */   public static boolean N;
/*    */   
/*    */   public agr() {
/* 16 */     super(arm.p);
/* 17 */     a(yz.b);
/*    */   }
/*    */   
/*    */   public agr(arm ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(adm ☃, cj cj1, alz alz1) {
/* 26 */     ☃.a(cj1, this, a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 31 */     ☃.a(cj1, this, a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 36 */     if (!☃.D) {
/* 37 */       f(☃, cj1);
/*    */     }
/*    */   }
/*    */   
/*    */   private void f(adm ☃, cj cj1) {
/* 42 */     if (!e(☃, cj1.b()) || cj1.o() < 0) {
/*    */       return;
/*    */     }
/*    */     
/* 46 */     int i = 32;
/* 47 */     if (N || !☃.a(cj1.a(-i, -i, -i), cj1.a(i, i, i))) {
/* 48 */       ☃.g(cj1);
/*    */       
/* 50 */       cj cj2 = cj1.b();
/* 51 */       while (e(☃, cj2) && cj2.o() > 0) {
/* 52 */         cj2 = cj2.b();
/*    */       }
/* 54 */       if (cj2.o() > 0)
/*    */       {
/* 56 */         ☃.a(cj2.a(), Q());
/*    */       }
/* 58 */     } else if (!☃.D) {
/* 59 */       uy uy = new uy(☃, cj1.n() + 0.5D, cj1.o(), cj1.p() + 0.5D, ☃.p(cj1));
/* 60 */       a(uy);
/* 61 */       ☃.d(uy);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(uy ☃) {}
/*    */ 
/*    */   
/*    */   public int a(adm ☃) {
/* 70 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean e(adm ☃, cj cj1) {
/* 75 */     afh afh1 = ☃.p(cj1).c();
/* 76 */     arm arm = afh1.J;
/* 77 */     return (afh1 == afi.ab || arm == arm.a || arm == arm.h || arm == arm.i);
/*    */   }
/*    */   
/*    */   public void a_(adm ☃, cj cj1) {}
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */