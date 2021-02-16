/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abw
/*    */   implements abs
/*    */ {
/*    */   private final zx a;
/*    */   private final List<zx> b;
/*    */   
/*    */   public abw(zx ☃, List<zx> list) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = list;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx b() {
/* 23 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public zx[] b(xp ☃) {
/* 28 */     zx[] arrayOfZx = new zx[☃.o_()];
/*    */     
/* 30 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 31 */       zx zx1 = ☃.a(i);
/* 32 */       if (zx1 != null && zx1.b().r()) {
/* 33 */         arrayOfZx[i] = new zx(zx1.b().q());
/*    */       }
/*    */     } 
/*    */     
/* 37 */     return arrayOfZx;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(xp ☃, adm adm1) {
/* 42 */     List<zx> list = Lists.newArrayList(this.b);
/*    */     
/* 44 */     for (int i = 0; i < ☃.h(); i++) {
/* 45 */       for (int j = 0; j < ☃.i(); j++) {
/* 46 */         zx zx1 = ☃.c(j, i);
/*    */         
/* 48 */         if (zx1 != null) {
/* 49 */           boolean bool = false;
/* 50 */           for (Iterator<zx> iterator = list.iterator(); iterator.hasNext(); ) { zx zx2 = iterator.next();
/* 51 */             if (zx1.b() == zx2.b() && (zx2.i() == 32767 || zx1.i() == zx2.i())) {
/* 52 */               bool = true;
/* 53 */               list.remove(zx2);
/*    */               break;
/*    */             }  }
/*    */           
/* 57 */           if (!bool) {
/* 58 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 64 */     return list.isEmpty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zx a(xp ☃) {
/* 70 */     return this.a.k();
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 75 */     return this.b.size();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */