/*    */ 
/*    */ 
/*    */ 
/*    */ public class amw
/*    */ {
/*    */   private final byte[] a;
/*    */   
/*    */   public amw() {
/*  9 */     this.a = new byte[2048];
/*    */   }
/*    */   
/*    */   public amw(byte[] ☃) {
/* 13 */     this.a = ☃;
/*    */     
/* 15 */     if (☃.length != 2048) {
/* 16 */       throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + ☃.length);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(int ☃, int i, int j) {
/* 21 */     return a(b(☃, i, j));
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i, int j, int k) {
/* 25 */     a(b(☃, i, j), k);
/*    */   }
/*    */   
/*    */   private int b(int ☃, int i, int j) {
/* 29 */     return i << 8 | j << 4 | ☃;
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 33 */     int i = c(☃);
/*    */     
/* 35 */     if (b(☃)) {
/* 36 */       return this.a[i] & 0xF;
/*    */     }
/* 38 */     return this.a[i] >> 4 & 0xF;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, int i) {
/* 43 */     int j = c(☃);
/*    */     
/* 45 */     if (b(☃)) {
/* 46 */       this.a[j] = (byte)(this.a[j] & 0xF0 | i & 0xF);
/*    */     } else {
/* 48 */       this.a[j] = (byte)(this.a[j] & 0xF | (i & 0xF) << 4);
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean b(int ☃) {
/* 53 */     return ((☃ & 0x1) == 0);
/*    */   }
/*    */   
/*    */   private int c(int ☃) {
/* 57 */     return ☃ >> 1;
/*    */   }
/*    */   
/*    */   public byte[] a() {
/* 61 */     return this.a;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */