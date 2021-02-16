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
/*    */ public class aee
/*    */   extends ady
/*    */ {
/* 19 */   private aot aD = new apj(afi.be.Q().a(ahz.a, ahz.a.a), 9);
/* 20 */   private aps aE = new aps(false);
/*    */   
/* 22 */   private int aF = 0;
/* 23 */   private int aG = 1;
/* 24 */   private int aH = 2;
/*    */   
/*    */   private int aI;
/*    */   
/*    */   protected aee(int ☃, boolean bool) {
/* 29 */     super(☃);
/* 30 */     this.aI = this.aF;
/* 31 */     if (bool) {
/* 32 */       this.as.A = 3;
/* 33 */       this.aI = this.aG;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public aoh a(Random ☃) {
/* 39 */     if (☃.nextInt(3) > 0) {
/* 40 */       return this.aE;
/*    */     }
/* 42 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, cj cj1) {
/* 47 */     super.a(☃, random, cj1);
/*    */ 
/*    */     
/* 50 */     int i = 3 + random.nextInt(6); int j;
/* 51 */     for (j = 0; j < i; j++) {
/* 52 */       int k = random.nextInt(16);
/* 53 */       int m = random.nextInt(28) + 4;
/* 54 */       int n = random.nextInt(16);
/*    */       
/* 56 */       cj cj2 = cj1.a(k, m, n);
/* 57 */       if (☃.p(cj2).c() == afi.b) {
/* 58 */         ☃.a(cj2, afi.bP.Q(), 2);
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 63 */     for (i = 0; i < 7; i++) {
/* 64 */       j = random.nextInt(16);
/* 65 */       int k = random.nextInt(64);
/* 66 */       int m = random.nextInt(16);
/* 67 */       this.aD.b(☃, random, cj1.a(j, k, m));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, ans ans1, int i, int j, double d) {
/* 73 */     this.ak = afi.c.Q();
/* 74 */     this.al = afi.d.Q();
/* 75 */     if ((d < -1.0D || d > 2.0D) && this.aI == this.aH) {
/* 76 */       this.ak = afi.n.Q();
/* 77 */       this.al = afi.n.Q();
/* 78 */     } else if (d > 1.0D && this.aI != this.aG) {
/* 79 */       this.ak = afi.b.Q();
/* 80 */       this.al = afi.b.Q();
/*    */     } 
/* 82 */     b(☃, random, ans1, i, j, d);
/*    */   }
/*    */   
/*    */   private aee b(ady ☃) {
/* 86 */     this.aI = this.aH;
/*    */     
/* 88 */     a(☃.ai, true);
/* 89 */     a(☃.ah + " M");
/* 90 */     a(new ady.a(☃.an, ☃.ao));
/* 91 */     a(☃.ap, ☃.aq);
/* 92 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ady d(int ☃) {
/* 97 */     return (new aee(☃, false)).b(this);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */