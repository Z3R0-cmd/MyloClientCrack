/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acg
/*    */   extends aci
/*    */ {
/*    */   protected acg(int ☃, jy jy1, int i) {
/* 11 */     super(☃, jy1, i, acj.j);
/*    */     
/* 13 */     c("durability");
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 18 */     return 5 + (☃ - 1) * 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 23 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 28 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃) {
/* 33 */     if (☃.e()) {
/* 34 */       return true;
/*    */     }
/* 36 */     return super.a(☃);
/*    */   }
/*    */   
/*    */   public static boolean a(zx ☃, int i, Random random) {
/* 40 */     if (☃.b() instanceof yj && random.nextFloat() < 0.6F) {
/* 41 */       return false;
/*    */     }
/* 43 */     return (random.nextInt(i + 1) > 0);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/acg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */