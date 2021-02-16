/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avl
/*    */ {
/*    */   float a;
/*    */   private double f;
/*    */   public int b;
/*    */   public float c;
/* 12 */   public float d = 1.0F;
/*    */   
/*    */   public float e;
/*    */   private long g;
/*    */   private long h;
/*    */   private long i;
/* 18 */   private double j = 1.0D;
/*    */   
/*    */   public avl(float ☃) {
/* 21 */     this.a = ☃;
/* 22 */     this.g = ave.J();
/* 23 */     this.h = System.nanoTime() / 1000000L;
/*    */   }
/*    */   
/*    */   public void a() {
/* 27 */     long ☃ = ave.J();
/* 28 */     long l1 = ☃ - this.g;
/* 29 */     long l2 = System.nanoTime() / 1000000L;
/* 30 */     double d1 = l2 / 1000.0D;
/*    */     
/* 32 */     if (l1 > 1000L || l1 < 0L) {
/* 33 */       this.f = d1;
/*    */     } else {
/* 35 */       this.i += l1;
/* 36 */       if (this.i > 1000L) {
/* 37 */         long l = l2 - this.h;
/*    */         
/* 39 */         double d = this.i / l;
/* 40 */         this.j += (d - this.j) * 0.20000000298023224D;
/*    */         
/* 42 */         this.h = l2;
/* 43 */         this.i = 0L;
/*    */       } 
/* 45 */       if (this.i < 0L) {
/* 46 */         this.h = l2;
/*    */       }
/*    */     } 
/* 49 */     this.g = ☃;
/*    */     
/* 51 */     double d2 = (d1 - this.f) * this.j;
/* 52 */     this.f = d1;
/*    */     
/* 54 */     d2 = ns.a(d2, 0.0D, 1.0D);
/*    */     
/* 56 */     this.e = (float)(this.e + d2 * this.d * this.a);
/*    */     
/* 58 */     this.b = (int)this.e;
/* 59 */     this.e -= this.b;
/* 60 */     if (this.b > 10) {
/* 61 */       this.b = 10;
/*    */     }
/* 63 */     this.c = this.e;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */