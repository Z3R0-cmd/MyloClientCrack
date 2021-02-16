/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alg
/*    */   extends akw
/*    */ {
/*    */   private zw a;
/*    */   private int f;
/*    */   
/*    */   public alg() {}
/*    */   
/*    */   public alg(zw ☃, int i) {
/* 19 */     this.a = ☃;
/* 20 */     this.f = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dn ☃) {
/* 25 */     super.b(☃);
/* 26 */     jy jy = zw.e.c(this.a);
/* 27 */     ☃.a("Item", (jy == null) ? "" : jy.toString());
/* 28 */     ☃.a("Data", this.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dn ☃) {
/* 33 */     super.a(☃);
/* 34 */     if (☃.b("Item", 8)) {
/* 35 */       this.a = zw.d(☃.j("Item"));
/*    */     } else {
/*    */       
/* 38 */       this.a = zw.b(☃.f("Item"));
/*    */     } 
/* 40 */     this.f = ☃.f("Data");
/*    */   }
/*    */ 
/*    */   
/*    */   public ff y_() {
/* 45 */     dn ☃ = new dn();
/* 46 */     b(☃);
/*    */     
/* 48 */     ☃.o("Item");
/* 49 */     ☃.a("Item", zw.b(this.a));
/* 50 */     return new ft(this.c, 5, ☃);
/*    */   }
/*    */   
/*    */   public void a(zw ☃, int i) {
/* 54 */     this.a = ☃;
/* 55 */     this.f = i;
/*    */   }
/*    */   
/*    */   public zw b() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 63 */     return this.f;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */