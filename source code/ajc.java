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
/*    */ public class ajc
/*    */   extends afh
/*    */ {
/*    */   private final boolean a;
/*    */   
/*    */   public ajc(boolean ☃) {
/* 17 */     super(arm.t);
/* 18 */     this.a = ☃;
/*    */     
/* 20 */     if (☃) {
/* 21 */       a(1.0F);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(adm ☃, cj cj1, alz alz1) {
/* 27 */     if (☃.D) {
/*    */       return;
/*    */     }
/*    */     
/* 31 */     if (this.a && !☃.z(cj1)) {
/* 32 */       ☃.a(cj1, afi.bJ.Q(), 2);
/* 33 */     } else if (!this.a && ☃.z(cj1)) {
/* 34 */       ☃.a(cj1, afi.bK.Q(), 2);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 40 */     if (☃.D) {
/*    */       return;
/*    */     }
/*    */     
/* 44 */     if (this.a && !☃.z(cj1)) {
/* 45 */       ☃.a(cj1, this, 4);
/* 46 */     } else if (!this.a && ☃.z(cj1)) {
/* 47 */       ☃.a(cj1, afi.bK.Q(), 2);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 53 */     if (☃.D) {
/*    */       return;
/*    */     }
/*    */     
/* 57 */     if (this.a && !☃.z(cj1)) {
/* 58 */       ☃.a(cj1, afi.bJ.Q(), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zw a(alz ☃, Random random, int i) {
/* 65 */     return zw.a(afi.bJ);
/*    */   }
/*    */ 
/*    */   
/*    */   public zw c(adm ☃, cj cj1) {
/* 70 */     return zw.a(afi.bJ);
/*    */   }
/*    */ 
/*    */   
/*    */   protected zx i(alz ☃) {
/* 75 */     return new zx(afi.bJ);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */