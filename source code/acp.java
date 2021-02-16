/*    */ 
/*    */ 
/*    */ public class acp
/*    */   extends aci
/*    */ {
/*    */   protected acp(int ☃, jy jy1, int i, acj acj1) {
/*  7 */     super(☃, jy1, i, acj1);
/*    */     
/*  9 */     if (acj1 == acj.h) {
/* 10 */       c("lootBonusDigger");
/* 11 */     } else if (acj1 == acj.i) {
/* 12 */       c("lootBonusFishing");
/*    */     } else {
/* 14 */       c("lootBonus");
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 20 */     return 15 + (☃ - 1) * 9;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 25 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 30 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aci ☃) {
/* 35 */     return (super.a(☃) && ☃.B != s.B);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/acp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */