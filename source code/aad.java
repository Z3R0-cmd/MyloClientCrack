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
/*    */ public class aad
/*    */   extends zw
/*    */ {
/* 14 */   private static final cr a = new cn() {
/* 15 */       private final cn b = new cn();
/*    */       
/*    */       public zx b(ck ☃, zx zx1) {
/*    */         double d4;
/* 19 */         cq cq = agg.b(☃.f());
/* 20 */         adm adm = ☃.i();
/*    */ 
/*    */ 
/*    */         
/* 24 */         double d1 = ☃.a() + cq.g() * 1.125D;
/* 25 */         double d2 = Math.floor(☃.b()) + cq.h();
/* 26 */         double d3 = ☃.c() + cq.i() * 1.125D;
/*    */         
/* 28 */         cj cj = ☃.d().a(cq);
/* 29 */         alz alz = adm.p(cj);
/* 30 */         afe.b b = (alz.c() instanceof afe) ? alz.<afe.b>b(((afe)alz.c()).n()) : afe.b.a;
/*    */ 
/*    */         
/* 33 */         if (afe.d(alz)) {
/* 34 */           if (b.c()) {
/* 35 */             d4 = 0.6D;
/*    */           } else {
/* 37 */             d4 = 0.1D;
/*    */           } 
/* 39 */         } else if (alz.c().t() == arm.a && afe.d(adm.p(cj.b()))) {
/* 40 */           alz alz1 = adm.p(cj.b());
/* 41 */           afe.b b1 = (alz1.c() instanceof afe) ? alz1.<afe.b>b(((afe)alz1.c()).n()) : afe.b.a;
/* 42 */           if (cq == cq.a || !b1.c()) {
/* 43 */             d4 = -0.9D;
/*    */           } else {
/* 45 */             d4 = -0.4D;
/*    */           } 
/*    */         } else {
/* 48 */           return this.b.a(☃, zx1);
/*    */         } 
/*    */         
/* 51 */         va va = va.a(adm, d1, d2 + d4, d3, aad.a((aad)zx1.b()));
/* 52 */         if (zx1.s()) {
/* 53 */           va.a(zx1.q());
/*    */         }
/* 55 */         adm.d(va);
/*    */         
/* 57 */         zx1.a(1);
/* 58 */         return zx1;
/*    */       }
/*    */ 
/*    */       
/*    */       protected void a(ck ☃) {
/* 63 */         ☃.i().b(1000, ☃.d(), 0);
/*    */       }
/*    */     };
/*    */   
/*    */   private final va.a b;
/*    */   
/*    */   public aad(va.a ☃) {
/* 70 */     this.h = 1;
/* 71 */     this.b = ☃;
/* 72 */     a(yz.e);
/* 73 */     agg.N.a(this, a);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/* 78 */     alz alz = adm1.p(cj1);
/* 79 */     if (afe.d(alz)) {
/* 80 */       if (!adm1.D) {
/* 81 */         afe.b b = (alz.c() instanceof afe) ? alz.<afe.b>b(((afe)alz.c()).n()) : afe.b.a;
/* 82 */         double d = 0.0D;
/* 83 */         if (b.c()) {
/* 84 */           d = 0.5D;
/*    */         }
/* 86 */         va va = va.a(adm1, cj1.n() + 0.5D, cj1.o() + 0.0625D + d, cj1.p() + 0.5D, this.b);
/* 87 */         if (☃.s()) {
/* 88 */           va.a(☃.q());
/*    */         }
/* 90 */         adm1.d(va);
/*    */       } 
/* 92 */       ☃.b--;
/* 93 */       return true;
/*    */     } 
/* 95 */     return false;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */