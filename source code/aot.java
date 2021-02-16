/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class aot
/*    */ {
/*    */   private final boolean a;
/*    */   
/*    */   public aot() {
/* 14 */     this(false);
/*    */   }
/*    */   
/*    */   public aot(boolean ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract boolean b(adm paramadm, Random paramRandom, cj paramcj);
/*    */ 
/*    */   
/*    */   public void e() {}
/*    */   
/*    */   protected void a(adm ☃, cj cj1, alz alz1) {
/* 28 */     if (this.a) {
/* 29 */       ☃.a(cj1, alz1, 3);
/*    */     } else {
/* 31 */       ☃.a(cj1, alz1, 2);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */