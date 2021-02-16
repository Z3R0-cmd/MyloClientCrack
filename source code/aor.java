/*    */ import com.google.common.base.Predicates;
/*    */ import java.util.Iterator;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aor
/*    */   extends aot
/*    */ {
/* 15 */   private static final amh a = amh.a(afi.m).a(ajh.a, Predicates.equalTo(ajh.a.a));
/* 16 */   private final alz b = afi.U.Q().<akb.a, akb.a>a(akb.N, akb.a.b).a(ahh.a, ahh.a.b);
/* 17 */   private final alz c = afi.A.Q();
/* 18 */   private final alz d = afi.i.Q();
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 22 */     while (☃.d(cj1) && cj1.o() > 2) {
/* 23 */       cj1 = cj1.b();
/*    */     }
/*    */     
/* 26 */     if (!a.a(☃.p(cj1))) {
/* 27 */       return false;
/*    */     }
/*    */     
/*    */     int j;
/* 31 */     for (j = -2; j <= 2; j++) {
/* 32 */       for (int k = -2; k <= 2; k++) {
/* 33 */         if (☃.d(cj1.a(j, -1, k)) && ☃.d(cj1.a(j, -2, k))) {
/* 34 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 40 */     for (j = -1; j <= 0; j++) {
/* 41 */       for (int k = -2; k <= 2; k++) {
/* 42 */         for (int m = -2; m <= 2; m++) {
/* 43 */           ☃.a(cj1.a(k, j, m), this.c, 2);
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 49 */     ☃.a(cj1, this.d, 2);
/* 50 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 51 */       ☃.a(cj1.a(cq), this.d, 2); }
/*    */ 
/*    */     
/*    */     int i;
/* 55 */     for (i = -2; i <= 2; i++) {
/* 56 */       for (int k = -2; k <= 2; k++) {
/* 57 */         if (i == -2 || i == 2 || k == -2 || k == 2) {
/* 58 */           ☃.a(cj1.a(i, 1, k), this.c, 2);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 63 */     ☃.a(cj1.a(2, 1, 0), this.b, 2);
/* 64 */     ☃.a(cj1.a(-2, 1, 0), this.b, 2);
/* 65 */     ☃.a(cj1.a(0, 1, 2), this.b, 2);
/* 66 */     ☃.a(cj1.a(0, 1, -2), this.b, 2);
/*    */ 
/*    */     
/* 69 */     for (i = -1; i <= 1; i++) {
/* 70 */       for (int k = -1; k <= 1; k++) {
/* 71 */         if (i == 0 && k == 0) {
/* 72 */           ☃.a(cj1.a(i, 4, k), this.c, 2);
/*    */         } else {
/* 74 */           ☃.a(cj1.a(i, 4, k), this.b, 2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 80 */     for (i = 1; i <= 3; i++) {
/* 81 */       ☃.a(cj1.a(-1, i, -1), this.c, 2);
/* 82 */       ☃.a(cj1.a(-1, i, 1), this.c, 2);
/* 83 */       ☃.a(cj1.a(1, i, -1), this.c, 2);
/* 84 */       ☃.a(cj1.a(1, i, 1), this.c, 2);
/*    */     } 
/*    */     
/* 87 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */