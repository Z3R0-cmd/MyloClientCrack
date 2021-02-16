/*    */ import com.google.common.collect.Maps;
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
/*    */ public enum a
/*    */ {
/* 54 */   a("legacy"),
/* 55 */   b("mojang");
/*    */   static {
/* 57 */     c = Maps.newHashMap();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     a[] ☃;
/*    */ 
/*    */ 
/*    */     
/*    */     int i, j;
/*    */ 
/*    */ 
/*    */     
/* 70 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 71 */       c.put(a1.d, a1);
/*    */       j++; }
/*    */   
/*    */   }
/*    */   
/*    */   private static final Map<String, a> c;
/*    */   private final String d;
/*    */   
/*    */   a(String ☃) {
/*    */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/*    */     return c.get(☃.toLowerCase());
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avm$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */