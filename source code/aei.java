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
/*    */ public class aei
/*    */   extends ady
/*    */ {
/*    */   private boolean aD;
/* 15 */   private apb aE = new apb();
/* 16 */   private apa aF = new apa(4);
/*    */   
/*    */   public aei(int ☃, boolean bool) {
/* 19 */     super(☃);
/* 20 */     this.aD = bool;
/*    */     
/* 22 */     if (bool) {
/* 23 */       this.ak = afi.aJ.Q();
/*    */     }
/* 25 */     this.au.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, cj cj1) {
/* 30 */     if (this.aD) {
/* 31 */       int i; for (i = 0; i < 3; i++) {
/* 32 */         int j = random.nextInt(16) + 8;
/* 33 */         int k = random.nextInt(16) + 8;
/* 34 */         this.aE.b(☃, random, ☃.m(cj1.a(j, 0, k)));
/*    */       } 
/* 36 */       for (i = 0; i < 2; i++) {
/* 37 */         int j = random.nextInt(16) + 8;
/* 38 */         int k = random.nextInt(16) + 8;
/* 39 */         this.aF.b(☃, random, ☃.m(cj1.a(j, 0, k)));
/*    */       } 
/*    */     } 
/*    */     
/* 43 */     super.a(☃, random, cj1);
/*    */   }
/*    */ 
/*    */   
/*    */   public aoh a(Random ☃) {
/* 48 */     return new aps(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ady d(int ☃) {
/* 53 */     ady ady1 = (new aei(☃, true)).a(13828095, true).a(this.ah + " Spikes").c().a(0.0F, 0.5F).a(new ady.a(this.an + 0.1F, this.ao + 0.1F));
/*    */     
/* 55 */     ady1.an = this.an + 0.3F;
/* 56 */     ady1.ao = this.ao + 0.4F;
/*    */     
/* 58 */     return ady1;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */