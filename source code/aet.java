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
/*    */ public class aet
/*    */   extends ady
/*    */ {
/*    */   protected aet(int ☃) {
/* 18 */     super(☃);
/* 19 */     this.as.A = 2;
/* 20 */     this.as.B = 1;
/* 21 */     this.as.D = 1;
/* 22 */     this.as.E = 8;
/* 23 */     this.as.F = 10;
/* 24 */     this.as.J = 1;
/* 25 */     this.as.z = 4;
/* 26 */     this.as.I = 0;
/* 27 */     this.as.H = 0;
/* 28 */     this.as.C = 5;
/*    */     
/* 30 */     this.ar = 14745518;
/*    */     
/* 32 */     this.at.add(new ady.c((Class)wb.class, 1, 1, 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public aoh a(Random ☃) {
/* 37 */     return this.aC;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(cj ☃) {
/* 42 */     double d = af.a(☃.n() * 0.0225D, ☃.p() * 0.0225D);
/* 43 */     if (d < -0.1D) {
/* 44 */       return 5011004;
/*    */     }
/* 46 */     return 6975545;
/*    */   }
/*    */ 
/*    */   
/*    */   public int c(cj ☃) {
/* 51 */     return 6975545;
/*    */   }
/*    */ 
/*    */   
/*    */   public agw.a a(Random ☃, cj cj1) {
/* 56 */     return agw.a.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, ans ans1, int i, int j, double d) {
/* 61 */     double d1 = af.a(i * 0.25D, j * 0.25D);
/* 62 */     if (d1 > 0.0D) {
/* 63 */       int k = i & 0xF;
/* 64 */       int m = j & 0xF;
/* 65 */       for (int n = 255; n >= 0; n--) {
/* 66 */         if (ans1.a(m, n, k).c().t() != arm.a) {
/* 67 */           if (n == 62 && ans1.a(m, n, k).c() != afi.j) {
/* 68 */             ans1.a(m, n, k, afi.j.Q());
/* 69 */             if (d1 < 0.12D) {
/* 70 */               ans1.a(m, n + 1, k, afi.bx.Q());
/*    */             }
/*    */           } 
/*    */           
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     } 
/* 78 */     b(☃, random, ans1, i, j, d);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */