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
/*    */ public class aer
/*    */   extends ady
/*    */ {
/* 16 */   private static final app aD = new app(false);
/*    */   
/*    */   protected aer(int ☃) {
/* 19 */     super(☃);
/*    */     
/* 21 */     this.au.add(new ady.c((Class)tp.class, 1, 2, 6));
/*    */     
/* 23 */     this.as.A = 1;
/* 24 */     this.as.B = 4;
/* 25 */     this.as.C = 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public aoh a(Random ☃) {
/* 30 */     if (☃.nextInt(5) > 0) {
/* 31 */       return aD;
/*    */     }
/* 33 */     return this.aA;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ady d(int ☃) {
/* 38 */     ady ady1 = new a(☃, this);
/*    */     
/* 40 */     ady1.ap = (this.ap + 1.0F) * 0.5F;
/* 41 */     ady1.an = this.an * 0.5F + 0.3F;
/* 42 */     ady1.ao = this.ao * 0.5F + 1.2F;
/*    */     
/* 44 */     return ady1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, cj cj1) {
/* 49 */     ag.a(agi.b.c);
/* 50 */     for (int i = 0; i < 7; i++) {
/* 51 */       int j = random.nextInt(16) + 8;
/* 52 */       int k = random.nextInt(16) + 8;
/* 53 */       int m = random.nextInt(☃.m(cj1.a(j, 0, k)).o() + 32);
/* 54 */       ag.b(☃, random, cj1.a(j, m, k));
/*    */     } 
/* 56 */     super.a(☃, random, cj1);
/*    */   }
/*    */   
/*    */   public static class a extends aem {
/*    */     public a(int ☃, ady ady1) {
/* 61 */       super(☃, ady1);
/*    */       
/* 63 */       this.as.A = 2;
/* 64 */       this.as.B = 2;
/* 65 */       this.as.C = 5;
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(adm ☃, Random random, ans ans1, int i, int j, double d) {
/* 70 */       this.ak = afi.c.Q();
/* 71 */       this.al = afi.d.Q();
/* 72 */       if (d > 1.75D) {
/* 73 */         this.ak = afi.b.Q();
/* 74 */         this.al = afi.b.Q();
/* 75 */       } else if (d > -0.5D) {
/* 76 */         this.ak = afi.d.Q().a(agf.a, agf.a.b);
/*    */       } 
/* 78 */       b(☃, random, ans1, i, j, d);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(adm ☃, Random random, cj cj1) {
/* 83 */       this.as.a(☃, random, this, cj1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */