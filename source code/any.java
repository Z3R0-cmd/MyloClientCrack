/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class any
/*    */ {
/* 11 */   protected int a = 8;
/* 12 */   protected Random b = new Random();
/*    */   protected adm c;
/*    */   
/*    */   public void a(amv ☃, adm adm1, int i, int j, ans ans1) {
/* 16 */     int k = this.a;
/* 17 */     this.c = adm1;
/*    */     
/* 19 */     this.b.setSeed(adm1.J());
/* 20 */     long l1 = this.b.nextLong();
/* 21 */     long l2 = this.b.nextLong();
/*    */     
/* 23 */     for (int m = i - k; m <= i + k; m++) {
/* 24 */       for (int n = j - k; n <= j + k; n++) {
/* 25 */         long l3 = m * l1;
/* 26 */         long l4 = n * l2;
/* 27 */         this.b.setSeed(l3 ^ l4 ^ adm1.J());
/* 28 */         a(adm1, m, n, i, j, ans1);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void a(adm ☃, int i, int j, int k, int m, ans ans1) {}
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/any.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */