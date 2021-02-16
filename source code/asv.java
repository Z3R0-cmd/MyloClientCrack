/*    */ 
/*    */ 
/*    */ public class asv
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   private final int j;
/*  9 */   int d = -1;
/*    */   
/*    */   float e;
/*    */   float f;
/*    */   
/*    */   public asv(int ☃, int i, int j) {
/* 15 */     this.a = ☃;
/* 16 */     this.b = i;
/* 17 */     this.c = j;
/*    */     
/* 19 */     this.j = a(☃, i, j);
/*    */   }
/*    */   float g; asv h; public boolean i;
/*    */   public static int a(int ☃, int i, int j) {
/* 23 */     return i & 0xFF | (☃ & 0x7FFF) << 8 | (j & 0x7FFF) << 24 | ((☃ < 0) ? Integer.MIN_VALUE : 0) | ((j < 0) ? 32768 : 0);
/*    */   }
/*    */   
/*    */   public float a(asv ☃) {
/* 27 */     float f1 = (☃.a - this.a);
/* 28 */     float f2 = (☃.b - this.b);
/* 29 */     float f3 = (☃.c - this.c);
/* 30 */     return ns.c(f1 * f1 + f2 * f2 + f3 * f3);
/*    */   }
/*    */   
/*    */   public float b(asv ☃) {
/* 34 */     float f1 = (☃.a - this.a);
/* 35 */     float f2 = (☃.b - this.b);
/* 36 */     float f3 = (☃.c - this.c);
/* 37 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*    */   }
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 41 */     if (☃ instanceof asv) {
/* 42 */       asv asv1 = (asv)☃;
/* 43 */       return (this.j == asv1.j && this.a == asv1.a && this.b == asv1.b && this.c == asv1.c);
/*    */     } 
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 49 */     return this.j;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 53 */     return (this.d >= 0);
/*    */   }
/*    */   
/*    */   public String toString() {
/* 57 */     return this.a + ", " + this.b + ", " + this.c;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */