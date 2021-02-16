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
/*    */ public class aav
/*    */   extends yo
/*    */ {
/*    */   public aav(afh ☃) {
/* 15 */     super(☃);
/*    */     
/* 17 */     d(0);
/* 18 */     a(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/* 23 */     if (☃.b == 0) {
/* 24 */       return false;
/*    */     }
/* 26 */     if (!wn1.a(cj1, cq1, ☃)) {
/* 27 */       return false;
/*    */     }
/*    */     
/* 30 */     alz alz = adm1.p(cj1);
/* 31 */     afh afh = alz.c();
/* 32 */     cj cj2 = cj1;
/*    */     
/* 34 */     if ((cq1 != cq.b || afh != this.a) && !afh.a(adm1, cj1)) {
/* 35 */       cj2 = cj1.a(cq1);
/* 36 */       alz = adm1.p(cj2);
/* 37 */       afh = alz.c();
/*    */     } 
/*    */     
/* 40 */     if (afh == this.a) {
/* 41 */       int i = ((Integer)alz.<Integer>b(ajp.a)).intValue();
/*    */       
/* 43 */       if (i <= 7) {
/* 44 */         alz alz1 = alz.a(ajp.a, Integer.valueOf(i + 1));
/* 45 */         aug aug = this.a.a(adm1, cj2, alz1);
/* 46 */         if (aug != null && adm1.b(aug) && adm1.a(cj2, alz1, 2)) {
/* 47 */           adm1.a((cj2.n() + 0.5F), (cj2.o() + 0.5F), (cj2.p() + 0.5F), this.a.H.b(), (this.a.H.d() + 1.0F) / 2.0F, this.a.H.e() * 0.8F);
/* 48 */           ☃.b--;
/* 49 */           return true;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 54 */     return super.a(☃, wn1, adm1, cj2, cq1, f1, f2, f3);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 59 */     return ☃;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */