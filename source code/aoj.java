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
/*    */ public class aoj
/*    */   extends aoh
/*    */ {
/* 19 */   private static final alz a = afi.r.Q().a(ail.b, aio.a.c);
/* 20 */   private static final alz b = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.c).a(aik.b, Boolean.valueOf(false));
/*    */   
/*    */   private boolean c;
/*    */   
/*    */   public aoj(boolean ☃, boolean bool1) {
/* 25 */     super(☃);
/* 26 */     this.c = bool1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 31 */     int i = random.nextInt(3) + 5;
/* 32 */     if (this.c) {
/* 33 */       i += random.nextInt(7);
/*    */     }
/*    */     
/* 36 */     boolean bool = true;
/* 37 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/* 38 */       return false;
/*    */     }
/*    */     
/* 41 */     for (int j = cj1.o(); j <= cj1.o() + 1 + i; j++) {
/* 42 */       int m = 1;
/* 43 */       if (j == cj1.o()) {
/* 44 */         m = 0;
/*    */       }
/* 46 */       if (j >= cj1.o() + 1 + i - 2) {
/* 47 */         m = 2;
/*    */       }
/* 49 */       cj.a a = new cj.a();
/* 50 */       for (int n = cj1.n() - m; n <= cj1.n() + m && bool; n++) {
/* 51 */         for (int i1 = cj1.p() - m; i1 <= cj1.p() + m && bool; i1++) {
/* 52 */           if (j >= 0 && j < 256) {
/* 53 */             if (!a(☃.p(a.c(n, j, i1)).c())) {
/* 54 */               bool = false;
/*    */             }
/*    */           } else {
/* 57 */             bool = false;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 63 */     if (!bool) {
/* 64 */       return false;
/*    */     }
/*    */     
/* 67 */     afh afh = ☃.p(cj1.b()).c();
/* 68 */     if ((afh != afi.c && afh != afi.d && afh != afi.ak) || cj1.o() >= 256 - i - 1) {
/* 69 */       return false;
/*    */     }
/*    */     
/* 72 */     a(☃, cj1.b());
/*    */     int k;
/* 74 */     for (k = cj1.o() - 3 + i; k <= cj1.o() + i; k++) {
/* 75 */       int m = k - cj1.o() + i;
/* 76 */       int n = 1 - m / 2;
/* 77 */       for (int i1 = cj1.n() - n; i1 <= cj1.n() + n; i1++) {
/* 78 */         int i2 = i1 - cj1.n();
/* 79 */         for (int i3 = cj1.p() - n; i3 <= cj1.p() + n; i3++) {
/* 80 */           int i4 = i3 - cj1.p();
/* 81 */           if (Math.abs(i2) != n || Math.abs(i4) != n || (random.nextInt(2) != 0 && m != 0)) {
/*    */ 
/*    */             
/* 84 */             cj cj2 = new cj(i1, k, i3);
/* 85 */             afh afh1 = ☃.p(cj2).c();
/* 86 */             if (afh1.t() == arm.a || afh1.t() == arm.j)
/* 87 */               a(☃, cj2, b); 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 92 */     for (k = 0; k < i; k++) {
/* 93 */       afh afh1 = ☃.p(cj1.b(k)).c();
/* 94 */       if (afh1.t() == arm.a || afh1.t() == arm.j) {
/* 95 */         a(☃, cj1.b(k), a);
/*    */       }
/*    */     } 
/* 98 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aoj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */