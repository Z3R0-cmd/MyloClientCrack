/*    */ import java.util.Iterator;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aok
/*    */   extends aot
/*    */ {
/*    */   private final afh a;
/*    */   private final int b;
/*    */   
/*    */   public aok(afh ☃, int i) {
/* 15 */     super(false);
/* 16 */     this.a = ☃;
/* 17 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 22 */     while (cj1.o() > 3) {
/* 23 */       if (!☃.d(cj1.b())) {
/* 24 */         afh afh1 = ☃.p(cj1.b()).c();
/* 25 */         if (afh1 == afi.c || afh1 == afi.d || afh1 == afi.b) {
/*    */           break;
/*    */         }
/*    */       } 
/* 29 */       cj1 = cj1.b();
/*    */     } 
/* 31 */     if (cj1.o() <= 3) {
/* 32 */       return false;
/*    */     }
/*    */     
/* 35 */     int i = this.b;
/* 36 */     int j = 0;
/* 37 */     while (i >= 0 && j < 3) {
/* 38 */       int k = i + random.nextInt(2);
/* 39 */       int m = i + random.nextInt(2);
/* 40 */       int n = i + random.nextInt(2);
/* 41 */       float f = (k + m + n) * 0.333F + 0.5F;
/*    */       
/* 43 */       for (Iterator<cj> iterator = cj.a(cj1.a(-k, -m, -n), cj1.a(k, m, n)).iterator(); iterator.hasNext(); ) { cj cj2 = iterator.next();
/* 44 */         if (cj2.i(cj1) <= (f * f)) {
/* 45 */           ☃.a(cj2, this.a.Q(), 4);
/*    */         } }
/*    */ 
/*    */       
/* 49 */       cj1 = cj1.a(-(i + 1) + random.nextInt(2 + i * 2), 0 - random.nextInt(2), -(i + 1) + random.nextInt(2 + i * 2));
/* 50 */       j++;
/*    */     } 
/*    */     
/* 53 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */