/*    */ import io.netty.buffer.ByteBuf;
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
/*    */ public class akz
/*    */   extends akw
/*    */ {
/* 15 */   private final adc a = new adc(this)
/*    */     {
/*    */       public cj c() {
/* 18 */         return this.a.c;
/*    */       }
/*    */ 
/*    */       
/*    */       public aui d() {
/* 23 */         return new aui(this.a.c.n() + 0.5D, this.a.c.o() + 0.5D, this.a.c.p() + 0.5D);
/*    */       }
/*    */ 
/*    */       
/*    */       public adm e() {
/* 28 */         return this.a.z();
/*    */       }
/*    */ 
/*    */       
/*    */       public void a(String ☃) {
/* 33 */         super.a(☃);
/* 34 */         this.a.p_();
/*    */       }
/*    */ 
/*    */       
/*    */       public void h() {
/* 39 */         this.a.z().h(this.a.c);
/*    */       }
/*    */ 
/*    */       
/*    */       public int i() {
/* 44 */         return 0;
/*    */       }
/*    */ 
/*    */       
/*    */       public void a(ByteBuf ☃) {
/* 49 */         ☃.writeInt(this.a.c.n());
/* 50 */         ☃.writeInt(this.a.c.o());
/* 51 */         ☃.writeInt(this.a.c.p());
/*    */       }
/*    */ 
/*    */       
/*    */       public pk f() {
/* 56 */         return null;
/*    */       }
/*    */     };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(dn ☃) {
/* 65 */     super.b(☃);
/* 66 */     this.a.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dn ☃) {
/* 71 */     super.a(☃);
/* 72 */     this.a.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ff y_() {
/* 77 */     dn ☃ = new dn();
/* 78 */     b(☃);
/* 79 */     return new ft(this.c, 2, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean F() {
/* 84 */     return true;
/*    */   }
/*    */   
/*    */   public adc b() {
/* 88 */     return this.a;
/*    */   }
/*    */   
/*    */   public n c() {
/* 92 */     return this.a.n();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */