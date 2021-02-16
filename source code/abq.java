/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abq
/*    */   extends abv
/*    */ {
/*    */   public abq() {
/* 14 */     super(3, 3, new zx[] { new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.bd, 0, 32767), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK) }new zx(zy.bV, 0, 0));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(xp ☃, adm adm1) {
/* 26 */     if (!super.a(☃, adm1)) {
/* 27 */       return false;
/*    */     }
/* 29 */     zx zx = null;
/*    */     
/* 31 */     for (int i = 0; i < ☃.o_() && zx == null; i++) {
/* 32 */       zx zx1 = ☃.a(i);
/* 33 */       if (zx1 != null && zx1.b() == zy.bd) {
/* 34 */         zx = zx1;
/*    */       }
/*    */     } 
/*    */     
/* 38 */     if (zx == null) {
/* 39 */       return false;
/*    */     }
/* 41 */     atg atg = zy.bd.a(zx, adm1);
/* 42 */     if (atg == null) {
/* 43 */       return false;
/*    */     }
/* 45 */     return (atg.e < 4);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx a(xp ☃) {
/* 51 */     zx zx = null;
/*    */     
/* 53 */     for (int i = 0; i < ☃.o_() && zx == null; i++) {
/* 54 */       zx zx1 = ☃.a(i);
/* 55 */       if (zx1 != null && zx1.b() == zy.bd) {
/* 56 */         zx = zx1;
/*    */       }
/*    */     } 
/*    */     
/* 60 */     zx = zx.k();
/* 61 */     zx.b = 1;
/*    */     
/* 63 */     if (zx.o() == null) {
/* 64 */       zx.d(new dn());
/*    */     }
/* 66 */     zx.o().a("map_is_scaling", true);
/*    */     
/* 68 */     return zx;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */