/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajw
/*    */   extends ahv
/*    */ {
/*    */   protected ajw(arm ☃) {
/* 14 */     super(☃);
/*    */     
/* 16 */     a(false);
/* 17 */     if (☃ == arm.i) {
/* 18 */       a(true);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 24 */     if (!e(☃, cj1, alz1)) {
/* 25 */       f(☃, cj1, alz1);
/*    */     }
/*    */   }
/*    */   
/*    */   private void f(adm ☃, cj cj1, alz alz1) {
/* 30 */     agl agl = a(this.J);
/* 31 */     ☃.a(cj1, agl.Q().a(b, alz1.b(b)), 2);
/* 32 */     ☃.a(cj1, agl, a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 37 */     if (this.J != arm.i) {
/*    */       return;
/*    */     }
/*    */     
/* 41 */     if (!☃.Q().b("doFireTick")) {
/*    */       return;
/*    */     }
/*    */     
/* 45 */     int i = random.nextInt(3);
/* 46 */     if (i > 0) {
/* 47 */       cj cj2 = cj1;
/*    */       
/* 49 */       for (int j = 0; j < i; j++) {
/* 50 */         cj2 = cj2.a(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
/* 51 */         afh afh = ☃.p(cj2).c();
/* 52 */         if (afh.J == arm.a) {
/* 53 */           if (f(☃, cj2)) {
/* 54 */             ☃.a(cj2, afi.ab.Q());
/*    */             return;
/*    */           } 
/* 57 */         } else if (afh.J.c()) {
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } else {
/* 62 */       for (int j = 0; j < 3; j++) {
/* 63 */         cj cj2 = cj1.a(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
/* 64 */         if (☃.d(cj2.a()) && m(☃, cj2))
/* 65 */           ☃.a(cj2.a(), afi.ab.Q()); 
/*    */       } 
/*    */     } 
/*    */   } protected boolean f(adm ☃, cj cj1) {
/*    */     cq[] arrayOfCq;
/*    */     int i;
/*    */     int j;
/* 72 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 73 */       if (m(☃, cj1.a(cq)))
/* 74 */         return true; 
/*    */       j++; }
/*    */     
/* 77 */     return false;
/*    */   }
/*    */   
/*    */   private boolean m(adm ☃, cj cj1) {
/* 81 */     return ☃.p(cj1).c().t().h();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */