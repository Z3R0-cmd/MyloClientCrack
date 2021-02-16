/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class akm
/*    */   extends ajl
/*    */ {
/* 12 */   public static final aml a = aml.a("facing", cq.c.a);
/*    */   
/*    */   public akm() {
/* 15 */     j(this.M.b().a(a, cq.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adq ☃, cj cj1) {
/* 20 */     cq cq = ☃.p(cj1).<cq>b(a);
/*    */     
/* 22 */     float f1 = 0.28125F;
/* 23 */     float f2 = 0.78125F;
/* 24 */     float f3 = 0.0F;
/* 25 */     float f4 = 1.0F;
/*    */     
/* 27 */     float f5 = 0.125F;
/*    */     
/* 29 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 31 */     switch (null.a[cq.ordinal()]) {
/*    */       case 1:
/* 33 */         a(f3, f1, 1.0F - f5, f4, f2, 1.0F);
/*    */         break;
/*    */       case 2:
/* 36 */         a(f3, f1, 0.0F, f4, f2, f5);
/*    */         break;
/*    */       case 3:
/* 39 */         a(1.0F - f5, f1, f3, 1.0F, f2, f4);
/*    */         break;
/*    */       case 4:
/* 42 */         a(0.0F, f1, f3, f5, f2, f4);
/*    */         break;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 49 */     cq cq = alz1.<cq>b(a);
/*    */     
/* 51 */     if (!☃.p(cj1.a(cq.d())).c().t().a()) {
/* 52 */       b(☃, cj1, alz1, 0);
/* 53 */       ☃.g(cj1);
/*    */     } 
/*    */     
/* 56 */     super.a(☃, cj1, alz1, afh1);
/*    */   }
/*    */ 
/*    */   
/*    */   public alz a(int ☃) {
/* 61 */     cq cq = cq.a(☃);
/* 62 */     if (cq.k() == cq.a.b) {
/* 63 */       cq = cq.c;
/*    */     }
/* 65 */     return Q().a(a, cq);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int c(alz ☃) {
/* 71 */     return ((cq)☃.<cq>b(a)).a();
/*    */   }
/*    */ 
/*    */   
/*    */   protected ama e() {
/* 76 */     return new ama(this, new amo[] { a });
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */