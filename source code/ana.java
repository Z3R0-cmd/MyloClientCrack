/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ana
/*    */ {
/*    */   public final byte[] a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   public ana(byte[] ☃, int i) {
/* 15 */     this.a = ☃;
/* 16 */     this.b = i;
/* 17 */     this.c = i + 4;
/*    */   }
/*    */   
/*    */   public int a(int ☃, int i, int j) {
/* 21 */     int k = ☃ << this.c | j << this.b | i;
/* 22 */     int m = k >> 1;
/* 23 */     int n = k & 0x1;
/*    */     
/* 25 */     if (n == 0) {
/* 26 */       return this.a[m] & 0xF;
/*    */     }
/* 28 */     return this.a[m] >> 4 & 0xF;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ana.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */