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
/*    */ public class abk
/*    */   implements abs
/*    */ {
/*    */   public boolean a(xp ☃, adm adm1) {
/* 15 */     int i = 0;
/* 16 */     zx zx = null;
/*    */     
/* 18 */     for (int j = 0; j < ☃.o_(); j++) {
/* 19 */       zx zx1 = ☃.a(j);
/* 20 */       if (zx1 != null)
/*    */       {
/*    */ 
/*    */         
/* 24 */         if (zx1.b() == zy.bN) {
/* 25 */           if (zx != null) {
/* 26 */             return false;
/*    */           }
/* 28 */           zx = zx1;
/* 29 */         } else if (zx1.b() == zy.bM) {
/* 30 */           i++;
/*    */         } else {
/* 32 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 36 */     return (zx != null && i > 0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx a(xp ☃) {
/* 42 */     int i = 0;
/* 43 */     zx zx1 = null;
/*    */     
/* 45 */     for (int j = 0; j < ☃.o_(); j++) {
/* 46 */       zx zx = ☃.a(j);
/* 47 */       if (zx != null)
/*    */       {
/*    */ 
/*    */         
/* 51 */         if (zx.b() == zy.bN) {
/* 52 */           if (zx1 != null) {
/* 53 */             return null;
/*    */           }
/* 55 */           zx1 = zx;
/* 56 */         } else if (zx.b() == zy.bM) {
/* 57 */           i++;
/*    */         } else {
/* 59 */           return null;
/*    */         } 
/*    */       }
/*    */     } 
/* 63 */     if (zx1 == null || i < 1 || abd.h(zx1) >= 2) {
/* 64 */       return null;
/*    */     }
/*    */     
/* 67 */     zx zx2 = new zx(zy.bN, i);
/* 68 */     zx2.d((dn)zx1.o().b());
/* 69 */     zx2.o().a("generation", abd.h(zx1) + 1);
/* 70 */     if (zx1.s()) {
/* 71 */       zx2.c(zx1.q());
/*    */     }
/* 73 */     return zx2;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 78 */     return 9;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx b() {
/* 84 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public zx[] b(xp ☃) {
/* 89 */     zx[] arrayOfZx = new zx[☃.o_()];
/*    */     
/* 91 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 92 */       zx zx = ☃.a(i);
/* 93 */       if (zx != null && zx.b() instanceof abd) {
/* 94 */         arrayOfZx[i] = zx;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 99 */     return arrayOfZx;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */