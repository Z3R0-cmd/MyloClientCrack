/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aam
/*    */   extends zw
/*    */ {
/*    */   public aam() {
/*  9 */     this.h = 1;
/* 10 */     a(yz.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃, wn wn1, pr pr1) {
/* 15 */     if (pr1 instanceof tt) {
/* 16 */       tt tt = (tt)pr1;
/* 17 */       if (!tt.cl() && !tt.j_()) {
/* 18 */         tt.l(true);
/* 19 */         tt.o.a(tt, "mob.horse.leather", 0.5F, 1.0F);
/* 20 */         ☃.b--;
/*    */       } 
/*    */       
/* 23 */       return true;
/*    */     } 
/* 25 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃, pr pr1, pr pr2) {
/* 30 */     a(☃, (wn)null, pr1);
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */