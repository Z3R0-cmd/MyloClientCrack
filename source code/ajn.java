/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajn
/*    */   extends ahj
/*    */ {
/*    */   public ajn() {
/* 13 */     super(arm.B, false, arn.c);
/* 14 */     a(yz.c);
/* 15 */     this.L = 0.8F;
/*    */   }
/*    */ 
/*    */   
/*    */   public adf m() {
/* 20 */     return adf.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, pk pk1, float f) {
/* 25 */     if (pk1.av()) {
/* 26 */       super.a(☃, cj1, pk1, f);
/*    */     } else {
/* 28 */       pk1.e(f, 0.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, pk pk1) {
/* 34 */     if (pk1.av()) {
/* 35 */       super.a(☃, pk1);
/*    */     }
/* 37 */     else if (pk1.w < 0.0D) {
/* 38 */       pk1.w = -pk1.w;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, pk pk1) {
/* 45 */     if (Math.abs(pk1.w) < 0.1D && !pk1.av()) {
/* 46 */       double d = 0.4D + Math.abs(pk1.w) * 0.2D;
/* 47 */       pk1.v *= d;
/* 48 */       pk1.x *= d;
/*    */     } 
/* 50 */     super.a(☃, cj1, pk1);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */