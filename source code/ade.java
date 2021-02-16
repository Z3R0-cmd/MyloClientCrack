/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ade
/*    */ {
/*    */   private cj a;
/*    */   private afh b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public ade(cj ☃, afh afh1, int i, int j) {
/* 13 */     this.a = ☃;
/* 14 */     this.c = i;
/* 15 */     this.d = j;
/* 16 */     this.b = afh1;
/*    */   }
/*    */   
/*    */   public cj a() {
/* 20 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 24 */     return this.c;
/*    */   }
/*    */   
/*    */   public int c() {
/* 28 */     return this.d;
/*    */   }
/*    */   
/*    */   public afh d() {
/* 32 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 37 */     if (☃ instanceof ade) {
/* 38 */       ade ade1 = (ade)☃;
/* 39 */       return (this.a.equals(ade1.a) && this.c == ade1.c && this.d == ade1.d && this.b == ade1.b);
/*    */     } 
/* 41 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */