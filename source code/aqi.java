/*    */ import com.google.common.collect.Lists;
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
/*    */ public class aqi
/*    */   extends aqq
/*    */ {
/* 15 */   private List<ady.c> d = Lists.newArrayList();
/*    */ 
/*    */ 
/*    */   
/*    */   public aqi() {
/* 20 */     this.d.add(new ady.c((Class)vl.class, 10, 2, 3));
/* 21 */     this.d.add(new ady.c((Class)vw.class, 5, 4, 4));
/* 22 */     this.d.add(new ady.c((Class)wa.class, 10, 4, 4));
/* 23 */     this.d.add(new ady.c((Class)vu.class, 3, 4, 4));
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 28 */     return "Fortress";
/*    */   }
/*    */   
/*    */   public List<ady.c> b() {
/* 32 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(int ☃, int i) {
/* 37 */     int j = ☃ >> 4;
/* 38 */     int k = i >> 4;
/*    */     
/* 40 */     this.b.setSeed((j ^ k << 4) ^ this.c.J());
/* 41 */     this.b.nextInt();
/*    */     
/* 43 */     if (this.b.nextInt(3) != 0) {
/* 44 */       return false;
/*    */     }
/* 46 */     if (☃ != (j << 4) + 4 + this.b.nextInt(8)) {
/* 47 */       return false;
/*    */     }
/* 49 */     if (i != (k << 4) + 4 + this.b.nextInt(8)) {
/* 50 */       return false;
/*    */     }
/* 52 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected aqu b(int ☃, int i) {
/* 57 */     return new a(this.c, this.b, ☃, i);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class a
/*    */     extends aqu
/*    */   {
/*    */     public a() {}
/*    */ 
/*    */ 
/*    */     
/*    */     public a(adm ☃, Random random, int i, int j) {
/* 70 */       super(i, j);
/*    */       
/* 72 */       aqj.q q = new aqj.q(random, (i << 4) + 2, (j << 4) + 2);
/* 73 */       this.a.add(q);
/* 74 */       q.a(q, this.a, random);
/*    */       
/* 76 */       List<aqt> list = q.e;
/* 77 */       while (!list.isEmpty()) {
/* 78 */         int k = random.nextInt(list.size());
/* 79 */         aqt aqt = list.remove(k);
/* 80 */         aqt.a(q, this.a, random);
/*    */       } 
/*    */       
/* 83 */       c();
/* 84 */       a(☃, random, 48, 70);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */