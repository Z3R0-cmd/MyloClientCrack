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
/*    */ public class a
/*    */ {
/* 19 */   public float[] a = new float[256];
/* 20 */   public ady[] b = new ady[256];
/*    */   
/*    */   public int c;
/*    */   
/*    */   public a(adz paramadz, int ☃, int i) {
/* 25 */     this.c = ☃;
/* 26 */     this.d = i;
/* 27 */     adz.a(paramadz).a(this.a, ☃ << 4, i << 4, 16, 16);
/* 28 */     adz.a(paramadz).a(this.b, ☃ << 4, i << 4, 16, 16, false);
/*    */   }
/*    */   public int d; public long e;
/*    */   public ady a(int ☃, int i) {
/* 32 */     return this.b[☃ & 0xF | (i & 0xF) << 4];
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adz$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */