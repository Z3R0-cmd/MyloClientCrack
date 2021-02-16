/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agk
/*    */   extends agg
/*    */ {
/* 13 */   private final cr P = new cn();
/*    */ 
/*    */   
/*    */   protected cr a(zx ☃) {
/* 17 */     return this.P;
/*    */   }
/*    */ 
/*    */   
/*    */   public akw a(adm ☃, int i) {
/* 22 */     return new ald();
/*    */   }
/*    */   
/*    */   protected void f(adm ☃, cj cj1) {
/*    */     zx zx2;
/* 27 */     cl cl = new cl(☃, cj1);
/* 28 */     alc alc = cl.<alc>h();
/* 29 */     if (alc == null) {
/*    */       return;
/*    */     }
/*    */     
/* 33 */     int i = alc.m();
/* 34 */     if (i < 0) {
/* 35 */       ☃.b(1001, cj1, 0);
/*    */       
/*    */       return;
/*    */     } 
/* 39 */     zx zx1 = alc.a(i);
/* 40 */     if (zx1 == null) {
/*    */       return;
/*    */     }
/*    */     
/* 44 */     cq cq = ☃.p(cj1).<cq>b(a);
/* 45 */     cj cj2 = cj1.a(cq);
/* 46 */     og og = alj.b(☃, cj2.n(), cj2.o(), cj2.p());
/*    */ 
/*    */     
/* 49 */     if (og == null) {
/* 50 */       zx2 = this.P.a(cl, zx1);
/* 51 */       if (zx2 != null && zx2.b <= 0) {
/* 52 */         zx2 = null;
/*    */       }
/*    */     } else {
/* 55 */       zx2 = alj.a(og, zx1.k().a(1), cq.d());
/*    */       
/* 57 */       if (zx2 == null) {
/* 58 */         zx2 = zx1.k();
/* 59 */         if (--zx2.b <= 0) {
/* 60 */           zx2 = null;
/*    */         }
/*    */       } else {
/*    */         
/* 64 */         zx2 = zx1.k();
/*    */       } 
/*    */     } 
/*    */     
/* 68 */     alc.a(i, zx2);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */