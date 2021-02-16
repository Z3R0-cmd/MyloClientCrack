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
/*    */ public class aej
/*    */   extends ady
/*    */ {
/*    */   private boolean aD;
/* 20 */   private static final alz aE = afi.r.Q().a(ail.b, aio.a.d);
/* 21 */   private static final alz aF = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.d).a(ahs.b, Boolean.valueOf(false));
/* 22 */   private static final alz aG = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.a).a(ahs.b, Boolean.valueOf(false));
/*    */   
/*    */   public aej(int ☃, boolean bool) {
/* 25 */     super(☃);
/* 26 */     this.aD = bool;
/* 27 */     if (bool) {
/* 28 */       this.as.A = 2;
/*    */     } else {
/* 30 */       this.as.A = 50;
/*    */     } 
/* 32 */     this.as.C = 25;
/* 33 */     this.as.B = 4;
/*    */     
/* 35 */     if (!bool) {
/* 36 */       this.at.add(new ady.c((Class)ts.class, 2, 1, 1));
/*    */     }
/*    */ 
/*    */     
/* 40 */     this.au.add(new ady.c((Class)tn.class, 10, 4, 4));
/*    */   }
/*    */ 
/*    */   
/*    */   public aoh a(Random ☃) {
/* 45 */     if (☃.nextInt(10) == 0) {
/* 46 */       return this.aB;
/*    */     }
/* 48 */     if (☃.nextInt(2) == 0) {
/* 49 */       return new aov(aE, aG);
/*    */     }
/* 51 */     if (!this.aD && ☃.nextInt(3) == 0) {
/* 52 */       return new ape(false, 10, 20, aE, aF);
/*    */     }
/* 54 */     return new apv(false, 4 + ☃.nextInt(7), aE, aF, true);
/*    */   }
/*    */ 
/*    */   
/*    */   public aot b(Random ☃) {
/* 59 */     if (☃.nextInt(4) == 0) {
/* 60 */       return new apu(akc.a.c);
/*    */     }
/* 62 */     return new apu(akc.a.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, cj cj1) {
/* 67 */     super.a(☃, random, cj1);
/*    */ 
/*    */     
/* 70 */     int i = random.nextInt(16) + 8;
/* 71 */     int j = random.nextInt(16) + 8;
/* 72 */     int k = random.nextInt(☃.m(cj1.a(i, 0, j)).o() * 2);
/* 73 */     (new aph()).b(☃, random, cj1.a(i, k, j));
/*    */ 
/*    */     
/* 76 */     apw apw = new apw();
/*    */     
/* 78 */     for (j = 0; j < 50; j++) {
/* 79 */       k = random.nextInt(16) + 8;
/* 80 */       int m = 128;
/* 81 */       int n = random.nextInt(16) + 8;
/*    */       
/* 83 */       apw.b(☃, random, cj1.a(k, 128, n));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */