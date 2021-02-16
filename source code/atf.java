/*    */ 
/*    */ public class atf
/*    */ {
/*    */   private byte a;
/*    */   private byte b;
/*    */   private byte c;
/*    */   private byte d;
/*    */   
/*    */   public atf(byte ☃, byte b1, byte b2, byte b3) {
/* 10 */     this.a = ☃;
/* 11 */     this.b = b1;
/* 12 */     this.c = b2;
/* 13 */     this.d = b3;
/*    */   }
/*    */   
/*    */   public atf(atf ☃) {
/* 17 */     this.a = ☃.a;
/* 18 */     this.b = ☃.b;
/* 19 */     this.c = ☃.c;
/* 20 */     this.d = ☃.d;
/*    */   }
/*    */   
/*    */   public byte a() {
/* 24 */     return this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte b() {
/* 32 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte c() {
/* 40 */     return this.c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte d() {
/* 48 */     return this.d;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 57 */     if (this == ☃) {
/* 58 */       return true;
/*    */     }
/* 60 */     if (!(☃ instanceof atf)) {
/* 61 */       return false;
/*    */     }
/*    */     
/* 64 */     atf atf1 = (atf)☃;
/*    */     
/* 66 */     if (this.a != atf1.a) {
/* 67 */       return false;
/*    */     }
/* 69 */     if (this.d != atf1.d) {
/* 70 */       return false;
/*    */     }
/* 72 */     if (this.b != atf1.b) {
/* 73 */       return false;
/*    */     }
/* 75 */     if (this.c != atf1.c) {
/* 76 */       return false;
/*    */     }
/*    */     
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 84 */     int ☃ = this.a;
/* 85 */     ☃ = 31 * ☃ + this.b;
/* 86 */     ☃ = 31 * ☃ + this.c;
/* 87 */     ☃ = 31 * ☃ + this.d;
/* 88 */     return ☃;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/atf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */