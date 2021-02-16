/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ans
/*    */ {
/* 11 */   private final short[] a = new short[65536];
/* 12 */   private final alz b = afi.a.Q();
/*    */   
/*    */   public alz a(int ☃, int i, int j) {
/* 15 */     int k = ☃ << 12 | j << 8 | i;
/* 16 */     return a(k);
/*    */   }
/*    */ 
/*    */   
/*    */   public alz a(int ☃) {
/* 21 */     if (☃ < 0 || ☃ >= this.a.length) {
/* 22 */       throw new IndexOutOfBoundsException("The coordinate is out of range");
/*    */     }
/*    */     
/* 25 */     alz alz1 = afh.d.a(this.a[☃]);
/*    */     
/* 27 */     if (alz1 != null) {
/* 28 */       return alz1;
/*    */     }
/* 30 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, int i, int j, alz alz1) {
/* 35 */     int k = ☃ << 12 | j << 8 | i;
/*    */     
/* 37 */     a(k, alz1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, alz alz1) {
/* 42 */     if (☃ < 0 || ☃ >= this.a.length) {
/* 43 */       throw new IndexOutOfBoundsException("The coordinate is out of range");
/*    */     }
/*    */     
/* 46 */     this.a[☃] = (short)afh.d.b((T)alz1);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */