/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arc
/*    */   extends arh
/*    */ {
/*    */   private arb[] a;
/*    */   private int b;
/*    */   
/*    */   public arc(Random ☃, int i) {
/* 16 */     this.b = i;
/* 17 */     this.a = new arb[i];
/* 18 */     for (int j = 0; j < i; j++) {
/* 19 */       this.a[j] = new arb(☃);
/*    */     }
/*    */   }
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
/*    */   public double[] a(double[] ☃, int i, int j, int k, int m, int n, int i1, double d1, double d2, double d3) {
/* 49 */     if (☃ == null) {
/* 50 */       ☃ = new double[m * n * i1];
/*    */     } else {
/* 52 */       for (int i3 = 0; i3 < ☃.length; i3++) {
/* 53 */         ☃[i3] = 0.0D;
/*    */       }
/*    */     } 
/*    */     
/* 57 */     double d = 1.0D;
/*    */     
/* 59 */     for (int i2 = 0; i2 < this.b; i2++) {
/* 60 */       double d4 = i * d * d1;
/* 61 */       double d5 = j * d * d2;
/* 62 */       double d6 = k * d * d3;
/* 63 */       long l1 = ns.d(d4);
/* 64 */       long l2 = ns.d(d6);
/* 65 */       d4 -= l1;
/* 66 */       d6 -= l2;
/* 67 */       l1 %= 16777216L;
/* 68 */       l2 %= 16777216L;
/* 69 */       d4 += l1;
/* 70 */       d6 += l2;
/* 71 */       this.a[i2].a(☃, d4, d5, d6, m, n, i1, d1 * d, d2 * d, d3 * d, d);
/* 72 */       d /= 2.0D;
/*    */     } 
/*    */     
/* 75 */     return ☃;
/*    */   }
/*    */   
/*    */   public double[] a(double[] ☃, int i, int j, int k, int m, double d1, double d2, double d3) {
/* 79 */     return a(☃, i, 10, j, k, 1, m, d1, 1.0D, d2);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */