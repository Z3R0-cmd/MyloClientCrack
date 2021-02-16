/*    */ import com.google.common.base.Function;
/*    */ import java.util.Map;
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
/*    */ final class null
/*    */   implements Function<Map.Entry<amo, Comparable>, String>
/*    */ {
/*    */   public String a(Map.Entry<amo, Comparable> ☃) {
/* 20 */     if (☃ == null) {
/* 21 */       return "<NULL>";
/*    */     }
/*    */     
/* 24 */     amo<Comparable> amo = ☃.getKey();
/* 25 */     return amo.a() + "=" + amo.a(☃.getValue());
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aly$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */