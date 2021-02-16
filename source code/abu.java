/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abu
/*    */   implements abs
/*    */ {
/*    */   public boolean a(xp ☃, adm adm1) {
/* 15 */     List<zx> list = Lists.newArrayList();
/*    */     
/* 17 */     for (int i = 0; i < ☃.o_(); i++) {
/* 18 */       zx zx = ☃.a(i);
/*    */       
/* 20 */       if (zx != null) {
/* 21 */         list.add(zx);
/*    */         
/* 23 */         if (list.size() > 1) {
/* 24 */           zx zx1 = list.get(0);
/* 25 */           if (zx.b() != zx1.b() || zx1.b != 1 || zx.b != 1 || !zx1.b().m()) {
/* 26 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     return (list.size() == 2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx a(xp ☃) {
/* 38 */     List<zx> list = Lists.newArrayList();
/*    */     
/* 40 */     for (int i = 0; i < ☃.o_(); i++) {
/* 41 */       zx zx = ☃.a(i);
/*    */       
/* 43 */       if (zx != null) {
/* 44 */         list.add(zx);
/*    */         
/* 46 */         if (list.size() > 1) {
/* 47 */           zx zx1 = list.get(0);
/* 48 */           if (zx.b() != zx1.b() || zx1.b != 1 || zx.b != 1 || !zx1.b().m()) {
/* 49 */             return null;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 55 */     if (list.size() == 2) {
/* 56 */       zx zx1 = list.get(0);
/* 57 */       zx zx2 = list.get(1);
/*    */       
/* 59 */       if (zx1.b() == zx2.b() && zx1.b == 1 && zx2.b == 1 && zx1.b().m()) {
/* 60 */         zw zw = zx1.b();
/* 61 */         int j = zw.l() - zx1.h();
/* 62 */         int k = zw.l() - zx2.h();
/* 63 */         int m = j + k + zw.l() * 5 / 100;
/* 64 */         int n = zw.l() - m;
/* 65 */         if (n < 0) {
/* 66 */           n = 0;
/*    */         }
/* 68 */         return new zx(zx1.b(), 1, n);
/*    */       } 
/*    */     } 
/*    */     
/* 72 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 77 */     return 4;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx b() {
/* 83 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public zx[] b(xp ☃) {
/* 88 */     zx[] arrayOfZx = new zx[☃.o_()];
/*    */     
/* 90 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 91 */       zx zx = ☃.a(i);
/* 92 */       if (zx != null && zx.b().r()) {
/* 93 */         arrayOfZx[i] = new zx(zx.b().q());
/*    */       }
/*    */     } 
/*    */     
/* 97 */     return arrayOfZx;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */