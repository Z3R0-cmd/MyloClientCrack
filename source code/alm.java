/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alm
/*    */   extends akw
/*    */ {
/*    */   public byte a;
/*    */   public boolean f;
/*    */   
/*    */   public void b(dn ☃) {
/* 16 */     super.b(☃);
/* 17 */     ☃.a("note", this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dn ☃) {
/* 22 */     super.a(☃);
/* 23 */     this.a = ☃.d("note");
/* 24 */     this.a = (byte)ns.a(this.a, 0, 24);
/*    */   }
/*    */   
/*    */   public void b() {
/* 28 */     this.a = (byte)((this.a + 1) % 25);
/* 29 */     p_();
/*    */   }
/*    */   
/*    */   public void a(adm ☃, cj cj1) {
/* 33 */     if (☃.p(cj1.a()).c().t() != arm.a) {
/*    */       return;
/*    */     }
/*    */     
/* 37 */     arm arm = ☃.p(cj1.b()).c().t();
/*    */     
/* 39 */     int i = 0;
/* 40 */     if (arm == arm.e) {
/* 41 */       i = 1;
/*    */     }
/* 43 */     if (arm == arm.p) {
/* 44 */       i = 2;
/*    */     }
/* 46 */     if (arm == arm.s) {
/* 47 */       i = 3;
/*    */     }
/* 49 */     if (arm == arm.d) {
/* 50 */       i = 4;
/*    */     }
/*    */     
/* 53 */     ☃.c(cj1, afi.B, i, this.a);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */