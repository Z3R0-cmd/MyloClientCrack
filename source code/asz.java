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
/*    */ public class asz
/*    */   extends asw
/*    */ {
/*    */   public void a(adq ☃, pk pk1) {
/* 20 */     super.a(☃, pk1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 25 */     super.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public asv a(pk ☃) {
/* 30 */     return a(ns.c((☃.aR()).a), ns.c((☃.aR()).b + 0.5D), ns.c((☃.aR()).c));
/*    */   }
/*    */ 
/*    */   
/*    */   public asv a(pk ☃, double d1, double d2, double d3) {
/* 35 */     return a(ns.c(d1 - (☃.J / 2.0F)), ns.c(d2 + 0.5D), ns.c(d3 - (☃.J / 2.0F)));
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(asv[] ☃, pk pk1, asv asv1, asv asv2, float f) {
/* 40 */     int i = 0; cq[] arrayOfCq;
/*    */     int j, k;
/* 42 */     for (arrayOfCq = cq.values(), j = arrayOfCq.length, k = 0; k < j; ) { cq cq = arrayOfCq[k];
/* 43 */       asv asv3 = a(pk1, asv1.a + cq.g(), asv1.b + cq.h(), asv1.c + cq.i());
/* 44 */       if (asv3 != null && !asv3.i && asv3.a(asv2) < f) {
/* 45 */         ☃[i++] = asv3;
/*    */       }
/*    */       k++; }
/*    */     
/* 49 */     return i;
/*    */   }
/*    */   
/*    */   private asv a(pk ☃, int i, int j, int k) {
/* 53 */     int m = b(☃, i, j, k);
/* 54 */     if (m == -1) {
/* 55 */       return a(i, j, k);
/*    */     }
/* 57 */     return null;
/*    */   }
/*    */   
/*    */   private int b(pk ☃, int i, int j, int k) {
/* 61 */     cj.a a = new cj.a();
/* 62 */     for (int m = i; m < i + this.c; m++) {
/* 63 */       for (int n = j; n < j + this.d; n++) {
/* 64 */         for (int i1 = k; i1 < k + this.e; i1++) {
/* 65 */           afh afh = this.a.p(a.c(m, n, i1)).c();
/* 66 */           if (afh.t() != arm.h) {
/* 67 */             return 0;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 72 */     return -1;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */