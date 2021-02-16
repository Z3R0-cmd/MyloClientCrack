/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqf
/*    */   extends aqq
/*    */ {
/* 10 */   private double d = 0.004D;
/*    */ 
/*    */   
/*    */   public aqf() {}
/*    */ 
/*    */   
/*    */   public String a() {
/* 17 */     return "Mineshaft";
/*    */   }
/*    */   
/*    */   public aqf(Map<String, String> ☃) {
/* 21 */     for (Iterator<Map.Entry<String, String>> iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<String, String> entry = iterator.next();
/* 22 */       if (((String)entry.getKey()).equals("chance")) {
/* 23 */         this.d = ns.a(entry.getValue(), this.d);
/*    */       } }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(int ☃, int i) {
/* 30 */     return (this.b.nextDouble() < this.d && this.b.nextInt(80) < Math.max(Math.abs(☃), Math.abs(i)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected aqu b(int ☃, int i) {
/* 35 */     return new aqh(this.c, this.b, ☃, i);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */