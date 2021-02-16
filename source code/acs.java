/*    */ import java.util.Random;
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
/*    */ public class acs
/*    */   extends aci
/*    */ {
/*    */   public acs(int ☃, jy jy1, int i) {
/* 16 */     super(☃, jy1, i, acj.e);
/*    */     
/* 18 */     c("thorns");
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 23 */     return 10 + 20 * (☃ - 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 28 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 33 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃) {
/* 38 */     if (☃.b() instanceof yj) {
/* 39 */       return true;
/*    */     }
/* 41 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(pr ☃, pk pk1, int i) {
/* 46 */     Random random = ☃.bc();
/* 47 */     zx zx = ack.a(aci.j, ☃);
/*    */     
/* 49 */     if (a(i, random)) {
/* 50 */       if (pk1 != null) {
/* 51 */         pk1.a(ow.a(☃), b(i, random));
/* 52 */         pk1.a("damage.thorns", 0.5F, 1.0F);
/*    */       } 
/*    */       
/* 55 */       if (zx != null) {
/* 56 */         zx.a(3, ☃);
/*    */       }
/*    */     }
/* 59 */     else if (zx != null) {
/* 60 */       zx.a(1, ☃);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean a(int ☃, Random random) {
/* 66 */     if (☃ <= 0) {
/* 67 */       return false;
/*    */     }
/* 69 */     return (random.nextFloat() < 0.15F * ☃);
/*    */   }
/*    */   
/*    */   public static int b(int ☃, Random random) {
/* 73 */     if (☃ > 10) {
/* 74 */       return ☃ - 10;
/*    */     }
/* 76 */     return 1 + random.nextInt(4);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/acs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */