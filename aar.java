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
/*    */ public class aar
/*    */   extends zw
/*    */ {
/*    */   public aar() {
/* 19 */     this.h = 16;
/* 20 */     a(yz.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/* 25 */     if (cq1 == cq.a) {
/* 26 */       return false;
/*    */     }
/* 28 */     if (!adm1.p(cj1).c().t().a()) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     cj1 = cj1.a(cq1);
/*    */     
/* 34 */     if (!wn1.a(cj1, cq1, ☃)) {
/* 35 */       return false;
/*    */     }
/* 37 */     if (!afi.an.d(adm1, cj1)) {
/* 38 */       return false;
/*    */     }
/*    */     
/* 41 */     if (adm1.D) {
/* 42 */       return true;
/*    */     }
/*    */     
/* 45 */     if (cq1 == cq.b) {
/* 46 */       int i = ns.c(((wn1.y + 180.0F) * 16.0F / 360.0F) + 0.5D) & 0xF;
/* 47 */       adm1.a(cj1, afi.an.Q().a(ajv.a, Integer.valueOf(i)), 3);
/*    */     } else {
/* 49 */       adm1.a(cj1, afi.ax.Q().a(akm.a, cq1), 3);
/*    */     } 
/*    */     
/* 52 */     ☃.b--;
/* 53 */     akw akw = adm1.s(cj1);
/* 54 */     if (akw instanceof aln && 
/* 55 */       !yo.a(adm1, wn1, cj1, ☃)) {
/* 56 */       wn1.a((aln)akw);
/*    */     }
/*    */     
/* 59 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */