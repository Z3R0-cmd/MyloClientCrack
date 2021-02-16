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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahp
/*    */   extends ahj
/*    */ {
/*    */   public ahp() {
/* 21 */     super(arm.w, false);
/* 22 */     this.L = 0.98F;
/* 23 */     a(true);
/* 24 */     a(yz.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public adf m() {
/* 29 */     return adf.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 34 */     wn1.b(na.ab[afh.a(this)]);
/* 35 */     wn1.a(0.025F);
/*    */     
/* 37 */     if (I() && ack.e(wn1)) {
/* 38 */       zx zx = i(alz1);
/* 39 */       if (zx != null) {
/* 40 */         a(☃, cj1, zx);
/*    */       }
/*    */     } else {
/* 43 */       if (☃.t.n()) {
/* 44 */         ☃.g(cj1);
/*    */         
/*    */         return;
/*    */       } 
/* 48 */       int i = ack.f(wn1);
/* 49 */       b(☃, cj1, alz1, i);
/*    */       
/* 51 */       arm arm = ☃.p(cj1.b()).c().t();
/* 52 */       if (arm.c() || arm.d()) {
/* 53 */         ☃.a(cj1, afi.i.Q());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃) {
/* 60 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 65 */     if (☃.b(ads.b, cj1) <= 11 - p()) {
/*    */       return;
/*    */     }
/*    */     
/* 69 */     if (☃.t.n()) {
/* 70 */       ☃.g(cj1);
/*    */       
/*    */       return;
/*    */     } 
/* 74 */     b(☃, cj1, ☃.p(cj1), 0);
/* 75 */     ☃.a(cj1, afi.j.Q());
/*    */   }
/*    */ 
/*    */   
/*    */   public int k() {
/* 80 */     return 0;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */