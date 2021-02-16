/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asx
/*    */ {
/*    */   private final asv[] a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public asx(asv[] ☃) {
/* 12 */     this.a = ☃;
/* 13 */     this.c = ☃.length;
/*    */   }
/*    */   
/*    */   public void a() {
/* 17 */     this.b++;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 21 */     return (this.b >= this.c);
/*    */   }
/*    */   
/*    */   public asv c() {
/* 25 */     if (this.c > 0) {
/* 26 */       return this.a[this.c - 1];
/*    */     }
/* 28 */     return null;
/*    */   }
/*    */   
/*    */   public asv a(int ☃) {
/* 32 */     return this.a[☃];
/*    */   }
/*    */   
/*    */   public int d() {
/* 36 */     return this.c;
/*    */   }
/*    */   
/*    */   public void b(int ☃) {
/* 40 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public int e() {
/* 44 */     return this.b;
/*    */   }
/*    */   
/*    */   public void c(int ☃) {
/* 48 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public aui a(pk ☃, int i) {
/* 52 */     double d1 = (this.a[i]).a + (int)(☃.J + 1.0F) * 0.5D;
/* 53 */     double d2 = (this.a[i]).b;
/* 54 */     double d3 = (this.a[i]).c + (int)(☃.J + 1.0F) * 0.5D;
/* 55 */     return new aui(d1, d2, d3);
/*    */   }
/*    */   
/*    */   public aui a(pk ☃) {
/* 59 */     return a(☃, this.b);
/*    */   }
/*    */   
/*    */   public boolean a(asx ☃) {
/* 63 */     if (☃ == null) {
/* 64 */       return false;
/*    */     }
/* 66 */     if (☃.a.length != this.a.length) {
/* 67 */       return false;
/*    */     }
/* 69 */     for (int i = 0; i < this.a.length; i++) {
/* 70 */       if ((this.a[i]).a != (☃.a[i]).a || (this.a[i]).b != (☃.a[i]).b || (this.a[i]).c != (☃.a[i]).c) {
/* 71 */         return false;
/*    */       }
/*    */     } 
/* 74 */     return true;
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
/*    */   public boolean b(aui ☃) {
/* 86 */     asv asv1 = c();
/* 87 */     if (asv1 == null) {
/* 88 */       return false;
/*    */     }
/* 90 */     return (asv1.a == (int)☃.a && asv1.c == (int)☃.c);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */