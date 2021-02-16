/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class afc
/*    */   extends afh
/*    */   implements agq
/*    */ {
/*    */   protected afc(arm ☃) {
/* 13 */     this(☃, ☃.r());
/*    */   }
/*    */   
/*    */   protected afc(arm ☃, arn arn1) {
/* 17 */     super(☃, arn1);
/* 18 */     this.A = true;
/*    */   }
/*    */   
/*    */   protected boolean a(adm ☃, cj cj1, cq cq1) {
/* 22 */     return (☃.p(cj1.a(cq1)).c().t() == arm.A);
/*    */   }
/*    */   
/*    */   protected boolean e(adm ☃, cj cj1) {
/* 26 */     return (a(☃, cj1, cq.c) || a(☃, cj1, cq.d) || a(☃, cj1, cq.e) || a(☃, cj1, cq.f));
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 31 */     return -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1) {
/* 36 */     super.b(☃, cj1, alz1);
/* 37 */     ☃.t(cj1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(adm ☃, cj cj1, alz alz1, int i, int j) {
/* 42 */     super.a(☃, cj1, alz1, i, j);
/*    */     
/* 44 */     akw akw = ☃.s(cj1);
/* 45 */     if (akw == null) {
/* 46 */       return false;
/*    */     }
/* 48 */     return akw.c(i, j);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */