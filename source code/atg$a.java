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
/*    */   public final wn a;
/*    */   private boolean d = true;
/* 33 */   private int e = 0;
/* 34 */   private int f = 0;
/* 35 */   private int g = 127;
/* 36 */   private int h = 127;
/*    */   private int i;
/*    */   public int b;
/*    */   
/*    */   public a(atg paramatg, wn ☃) {
/* 41 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public ff a(zx ☃) {
/* 45 */     if (this.d) {
/* 46 */       this.d = false;
/* 47 */       return new gu(☃.i(), this.c.e, this.c.h.values(), this.c.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/* 48 */     }  if (this.i++ % 5 == 0) {
/* 49 */       return new gu(☃.i(), this.c.e, this.c.h.values(), this.c.f, 0, 0, 0, 0);
/*    */     }
/*    */     
/* 52 */     return null;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 56 */     if (this.d) {
/* 57 */       this.e = Math.min(this.e, ☃);
/* 58 */       this.f = Math.min(this.f, i);
/* 59 */       this.g = Math.max(this.g, ☃);
/* 60 */       this.h = Math.max(this.h, i);
/*    */     } else {
/* 62 */       this.d = true;
/* 63 */       this.e = ☃;
/* 64 */       this.f = i;
/* 65 */       this.g = ☃;
/* 66 */       this.h = i;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/atg$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */