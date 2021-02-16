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
/*    */ 
/*    */ public class afm
/*    */   extends afh
/*    */ {
/*    */   protected afm() {
/* 17 */     this(arm.k);
/*    */   }
/*    */   
/*    */   protected afm(arm ☃) {
/* 21 */     this(☃, ☃.r());
/*    */   }
/*    */   
/*    */   protected afm(arm ☃, arn arn1) {
/* 25 */     super(☃, arn1);
/* 26 */     a(true);
/* 27 */     float f = 0.2F;
/* 28 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/* 29 */     a(yz.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean d(adm ☃, cj cj1) {
/* 34 */     return (super.d(☃, cj1) && c(☃.p(cj1.b()).c()));
/*    */   }
/*    */   
/*    */   protected boolean c(afh ☃) {
/* 38 */     return (☃ == afi.c || ☃ == afi.d || ☃ == afi.ak);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 43 */     super.a(☃, cj1, alz1, afh1);
/* 44 */     e(☃, cj1, alz1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 49 */     e(☃, cj1, alz1);
/*    */   }
/*    */   
/*    */   protected void e(adm ☃, cj cj1, alz alz1) {
/* 53 */     if (!f(☃, cj1, alz1)) {
/* 54 */       b(☃, cj1, alz1, 0);
/* 55 */       ☃.a(cj1, afi.a.Q(), 3);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean f(adm ☃, cj cj1, alz alz1) {
/* 60 */     return c(☃.p(cj1.b()).c());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 66 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 71 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean d() {
/* 76 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public adf m() {
/* 81 */     return adf.c;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */