/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ard
/*    */   extends arh
/*    */ {
/*    */   private arg[] a;
/*    */   private int b;
/*    */   
/*    */   public ard(Random ☃, int i) {
/* 14 */     this.b = i;
/* 15 */     this.a = new arg[i];
/* 16 */     for (int j = 0; j < i; j++) {
/* 17 */       this.a[j] = new arg(☃);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double ☃, double d1) {
/* 23 */     double d2 = 0.0D;
/* 24 */     double d3 = 1.0D;
/*    */     
/* 26 */     for (int i = 0; i < this.b; i++) {
/* 27 */       d2 += this.a[i].a(☃ * d3, d1 * d3) / d3;
/* 28 */       d3 /= 2.0D;
/*    */     } 
/*    */     
/* 31 */     return d2;
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
/*    */   public double[] a(double[] ☃, double d1, double d2, int i, int j, double d3, double d4, double d5) {
/* 47 */     return a(☃, d1, d2, i, j, d3, d4, d5, 0.5D);
/*    */   }
/*    */   
/*    */   public double[] a(double[] ☃, double d1, double d2, int i, int j, double d3, double d4, double d5, double d6) {
/* 51 */     if (☃ == null || ☃.length < i * j) {
/* 52 */       ☃ = new double[i * j];
/*    */     } else {
/* 54 */       for (int m = 0; m < ☃.length; m++) {
/* 55 */         ☃[m] = 0.0D;
/*    */       }
/*    */     } 
/*    */     
/* 59 */     double d7 = 1.0D;
/* 60 */     double d8 = 1.0D;
/* 61 */     for (int k = 0; k < this.b; k++) {
/* 62 */       this.a[k].a(☃, d1, d2, i, j, d3 * d8 * d7, d4 * d8 * d7, 0.55D / d7);
/* 63 */       d8 *= d5;
/* 64 */       d7 *= d6;
/*    */     } 
/*    */     
/* 67 */     return ☃;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */