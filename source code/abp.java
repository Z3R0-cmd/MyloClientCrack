/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abp
/*    */   implements abs
/*    */ {
/*    */   public boolean a(xp ☃, adm adm1) {
/* 13 */     int i = 0;
/* 14 */     zx zx = null;
/*    */     
/* 16 */     for (int j = 0; j < ☃.o_(); j++) {
/* 17 */       zx zx1 = ☃.a(j);
/* 18 */       if (zx1 != null)
/*    */       {
/*    */ 
/*    */         
/* 22 */         if (zx1.b() == zy.bd) {
/* 23 */           if (zx != null) {
/* 24 */             return false;
/*    */           }
/* 26 */           zx = zx1;
/* 27 */         } else if (zx1.b() == zy.bV) {
/* 28 */           i++;
/*    */         } else {
/* 30 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 34 */     return (zx != null && i > 0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx a(xp ☃) {
/* 40 */     int i = 0;
/* 41 */     zx zx1 = null;
/*    */     
/* 43 */     for (int j = 0; j < ☃.o_(); j++) {
/* 44 */       zx zx = ☃.a(j);
/* 45 */       if (zx != null)
/*    */       {
/*    */ 
/*    */         
/* 49 */         if (zx.b() == zy.bd) {
/* 50 */           if (zx1 != null) {
/* 51 */             return null;
/*    */           }
/* 53 */           zx1 = zx;
/* 54 */         } else if (zx.b() == zy.bV) {
/* 55 */           i++;
/*    */         } else {
/* 57 */           return null;
/*    */         } 
/*    */       }
/*    */     } 
/* 61 */     if (zx1 == null || i < 1) {
/* 62 */       return null;
/*    */     }
/*    */     
/* 65 */     zx zx2 = new zx(zy.bd, i + 1, zx1.i());
/* 66 */     if (zx1.s()) {
/* 67 */       zx2.c(zx1.q());
/*    */     }
/* 69 */     return zx2;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 74 */     return 9;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx b() {
/* 80 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public zx[] b(xp ☃) {
/* 85 */     zx[] arrayOfZx = new zx[☃.o_()];
/*    */     
/* 87 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 88 */       zx zx = ☃.a(i);
/* 89 */       if (zx != null && zx.b().r()) {
/* 90 */         arrayOfZx[i] = new zx(zx.b().q());
/*    */       }
/*    */     } 
/*    */     
/* 94 */     return arrayOfZx;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */