/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alf
/*    */   extends akw
/*    */   implements km
/*    */ {
/*    */   public float a;
/*    */   public float f;
/*    */   public int g;
/*    */   private int h;
/*    */   
/*    */   public void c() {
/* 18 */     if (++this.h % 20 * 4 == 0) {
/* 19 */       this.b.c(this.c, afi.bQ, 1, this.g);
/*    */     }
/*    */     
/* 22 */     this.f = this.a;
/*    */     
/* 24 */     int ☃ = this.c.n();
/* 25 */     int i = this.c.o();
/* 26 */     int j = this.c.p();
/*    */     
/* 28 */     float f = 0.1F;
/* 29 */     if (this.g > 0 && this.a == 0.0F) {
/* 30 */       double d1 = ☃ + 0.5D;
/* 31 */       double d2 = j + 0.5D;
/*    */       
/* 33 */       this.b.a(d1, i + 0.5D, d2, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*    */     } 
/* 35 */     if ((this.g == 0 && this.a > 0.0F) || (this.g > 0 && this.a < 1.0F)) {
/* 36 */       float f1 = this.a;
/* 37 */       if (this.g > 0) {
/* 38 */         this.a += f;
/*    */       } else {
/* 40 */         this.a -= f;
/*    */       } 
/* 42 */       if (this.a > 1.0F) {
/* 43 */         this.a = 1.0F;
/*    */       }
/* 45 */       float f2 = 0.5F;
/* 46 */       if (this.a < f2 && f1 >= f2) {
/* 47 */         double d1 = ☃ + 0.5D;
/* 48 */         double d2 = j + 0.5D;
/*    */         
/* 50 */         this.b.a(d1, i + 0.5D, d2, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*    */       } 
/* 52 */       if (this.a < 0.0F) {
/* 53 */         this.a = 0.0F;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c(int ☃, int i) {
/* 60 */     if (☃ == 1) {
/* 61 */       this.g = i;
/* 62 */       return true;
/*    */     } 
/* 64 */     return super.c(☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void y() {
/* 69 */     E();
/* 70 */     super.y();
/*    */   }
/*    */   
/*    */   public void b() {
/* 74 */     this.g++;
/* 75 */     this.b.c(this.c, afi.bQ, 1, this.g);
/*    */   }
/*    */   
/*    */   public void d() {
/* 79 */     this.g--;
/* 80 */     this.b.c(this.c, afi.bQ, 1, this.g);
/*    */   }
/*    */   
/*    */   public boolean a(wn ☃) {
/* 84 */     if (this.b.s(this.c) != this) {
/* 85 */       return false;
/*    */     }
/* 87 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 88 */       return false;
/*    */     }
/*    */     
/* 91 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */