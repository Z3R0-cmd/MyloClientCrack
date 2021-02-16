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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aib
/*    */   extends afh
/*    */ {
/* 19 */   public static final amk a = amk.a("snowy");
/*    */ 
/*    */ 
/*    */   
/*    */   protected aib() {
/* 24 */     super(arm.b, arn.z);
/* 25 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/* 26 */     a(true);
/* 27 */     a(yz.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 32 */     afh afh1 = adq1.p(cj1.a()).c();
/* 33 */     return ☃.a(a, Boolean.valueOf((afh1 == afi.aJ || afh1 == afi.aH)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 38 */     if (☃.D) {
/*    */       return;
/*    */     }
/*    */     
/* 42 */     if (☃.l(cj1.a()) < 4 && ☃.p(cj1.a()).c().p() > 2) {
/* 43 */       ☃.a(cj1, afi.d.Q().a(agf.a, agf.a.a));
/*    */       
/*    */       return;
/*    */     } 
/* 47 */     if (☃.l(cj1.a()) >= 9) {
/* 48 */       for (int i = 0; i < 4; i++) {
/* 49 */         cj cj2 = cj1.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
/* 50 */         alz alz2 = ☃.p(cj2);
/* 51 */         afh afh1 = ☃.p(cj2.a()).c();
/* 52 */         if (alz2.c() == afi.d && alz2.b(agf.a) == agf.a.a && ☃.l(cj2.a()) >= 4 && afh1.p() <= 2) {
/* 53 */           ☃.a(cj2, Q());
/*    */         }
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 61 */     super.c(☃, cj1, alz1, random);
/* 62 */     if (random.nextInt(10) == 0) {
/* 63 */       ☃.a(cy.w, (cj1.n() + random.nextFloat()), (cj1.o() + 1.1F), (cj1.p() + random.nextFloat()), 0.0D, 0.0D, 0.0D, new int[0]);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public zw a(alz ☃, Random random, int i) {
/* 70 */     return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), random, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public int c(alz ☃) {
/* 75 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ama e() {
/* 80 */     return new ama(this, new amo[] { a });
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */