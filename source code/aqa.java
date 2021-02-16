/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqa
/*    */ {
/*    */   private final int a;
/*    */   private alz b;
/* 10 */   private int c = 1;
/*    */   private int d;
/*    */   
/*    */   public aqa(int ☃, afh afh1) {
/* 14 */     this(3, ☃, afh1);
/*    */   }
/*    */   
/*    */   public aqa(int ☃, int i, afh afh1) {
/* 18 */     this.a = ☃;
/* 19 */     this.c = i;
/* 20 */     this.b = afh1.Q();
/*    */   }
/*    */   
/*    */   public aqa(int ☃, int i, afh afh1, int j) {
/* 24 */     this(☃, i, afh1);
/* 25 */     this.b = afh1.a(j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int b() {
/* 33 */     return this.c;
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
/*    */   public alz c() {
/* 45 */     return this.b;
/*    */   }
/*    */   
/*    */   private afh e() {
/* 49 */     return this.b.c();
/*    */   }
/*    */   
/*    */   private int f() {
/* 53 */     return this.b.c().c(this.b);
/*    */   }
/*    */   
/*    */   public int d() {
/* 57 */     return this.d;
/*    */   }
/*    */   
/*    */   public void b(int ☃) {
/* 61 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/*    */     String ☃;
/* 67 */     if (this.a >= 3) {
/* 68 */       jy jy = afh.c.c(e());
/* 69 */       ☃ = (jy == null) ? "null" : jy.toString();
/*    */       
/* 71 */       if (this.c > 1) {
/* 72 */         ☃ = this.c + "*" + ☃;
/*    */       }
/*    */     } else {
/* 75 */       ☃ = Integer.toString(afh.a(e()));
/*    */       
/* 77 */       if (this.c > 1) {
/* 78 */         ☃ = this.c + "x" + ☃;
/*    */       }
/*    */     } 
/*    */     
/* 82 */     int i = f();
/* 83 */     if (i > 0) {
/* 84 */       ☃ = ☃ + ":" + i;
/*    */     }
/*    */     
/* 87 */     return ☃;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */