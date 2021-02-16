/*    */ import java.util.List;
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
/*    */   extends aqu
/*    */ {
/*    */   public a() {}
/*    */   
/*    */   public a(adm ☃, Random random, int i, int j) {
/* 70 */     super(i, j);
/*    */     
/* 72 */     aqj.q q = new aqj.q(random, (i << 4) + 2, (j << 4) + 2);
/* 73 */     this.a.add(q);
/* 74 */     q.a(q, this.a, random);
/*    */     
/* 76 */     List<aqt> list = q.e;
/* 77 */     while (!list.isEmpty()) {
/* 78 */       int k = random.nextInt(list.size());
/* 79 */       aqt aqt = list.remove(k);
/* 80 */       aqt.a(q, this.a, random);
/*    */     } 
/*    */     
/* 83 */     c();
/* 84 */     a(☃, random, 48, 70);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqi$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */