/*    */ import java.util.Random;
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
/*    */ abstract class c
/*    */   extends aqt
/*    */ {
/*    */   protected int a;
/*    */   protected int b;
/*    */   protected int c;
/* 29 */   protected int d = -1;
/*    */ 
/*    */   
/*    */   public c() {}
/*    */ 
/*    */   
/*    */   protected c(Random ☃, int i, int j, int k, int m, int n, int i1) {
/* 36 */     super(0);
/*    */     
/* 38 */     this.a = m;
/* 39 */     this.b = n;
/* 40 */     this.c = i1;
/*    */     
/* 42 */     this.m = cq.c.a.a(☃);
/*    */     
/* 44 */     switch (aqn.null.a[this.m.ordinal()]) {
/*    */       case 1:
/*    */       case 2:
/* 47 */         this.l = new aqe(i, j, k, i + m - 1, j + n - 1, k + i1 - 1);
/*    */         return;
/*    */     } 
/* 50 */     this.l = new aqe(i, j, k, i + i1 - 1, j + n - 1, k + m - 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(dn ☃) {
/* 57 */     ☃.a("Width", this.a);
/* 58 */     ☃.a("Height", this.b);
/* 59 */     ☃.a("Depth", this.c);
/* 60 */     ☃.a("HPos", this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(dn ☃) {
/* 65 */     this.a = ☃.f("Width");
/* 66 */     this.b = ☃.f("Height");
/* 67 */     this.c = ☃.f("Depth");
/* 68 */     this.d = ☃.f("HPos");
/*    */   }
/*    */   
/*    */   protected boolean a(adm ☃, aqe aqe1, int i) {
/* 72 */     if (this.d >= 0) {
/* 73 */       return true;
/*    */     }
/*    */     
/* 76 */     int j = 0;
/* 77 */     int k = 0;
/* 78 */     cj.a a = new cj.a();
/* 79 */     for (int m = this.l.c; m <= this.l.f; m++) {
/* 80 */       for (int n = this.l.a; n <= this.l.d; n++) {
/* 81 */         a.c(n, 64, m);
/* 82 */         if (aqe1.b(a)) {
/* 83 */           j += Math.max(☃.r(a).o(), ☃.t.i());
/* 84 */           k++;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 89 */     if (k == 0) {
/* 90 */       return false;
/*    */     }
/* 92 */     this.d = j / k;
/* 93 */     this.l.a(0, this.d - this.l.b + i, 0);
/* 94 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqn$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */