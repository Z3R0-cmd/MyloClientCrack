/*    */ 
/*    */ 
/*    */ 
/*    */ public class adg
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   
/*    */   public adg(int ☃, int i) {
/* 10 */     this.a = ☃;
/* 11 */     this.b = i;
/*    */   }
/*    */   
/*    */   public static long a(int ☃, int i) {
/* 15 */     return ☃ & 0xFFFFFFFFL | (i & 0xFFFFFFFFL) << 32L;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 24 */     int ☃ = 1664525 * this.a + 1013904223;
/* 25 */     int i = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
/* 26 */     return ☃ ^ i;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 31 */     if (this == ☃) {
/* 32 */       return true;
/*    */     }
/*    */     
/* 35 */     if (☃ instanceof adg) {
/* 36 */       adg adg1 = (adg)☃;
/*    */       
/* 38 */       return (this.a == adg1.a && this.b == adg1.b);
/*    */     } 
/*    */     
/* 41 */     return false;
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
/*    */   public int a() {
/* 55 */     return (this.a << 4) + 8;
/*    */   }
/*    */   
/*    */   public int b() {
/* 59 */     return (this.b << 4) + 8;
/*    */   }
/*    */   
/*    */   public int c() {
/* 63 */     return this.a << 4;
/*    */   }
/*    */   
/*    */   public int d() {
/* 67 */     return this.b << 4;
/*    */   }
/*    */   
/*    */   public int e() {
/* 71 */     return (this.a << 4) + 15;
/*    */   }
/*    */   
/*    */   public int f() {
/* 75 */     return (this.b << 4) + 15;
/*    */   }
/*    */   
/*    */   public cj a(int ☃, int i, int j) {
/* 79 */     return new cj((this.a << 4) + ☃, i, (this.b << 4) + j);
/*    */   }
/*    */   
/*    */   public cj a(int ☃) {
/* 83 */     return new cj(a(), ☃, b());
/*    */   }
/*    */   
/*    */   public String toString() {
/* 87 */     return "[" + this.a + ", " + this.b + "]";
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */