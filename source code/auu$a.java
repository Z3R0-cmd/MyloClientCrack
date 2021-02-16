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
/*    */ public enum a
/*    */ {
/*    */   private static final Map<String, a> c;
/*    */   private final String d;
/* 46 */   a("integer"),
/* 47 */   b("hearts");
/*    */   
/*    */   static {
/* 50 */     c = Maps.newHashMap();
/*    */     
/*    */     a[] ☃;
/*    */     int i, j;
/* 54 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 55 */       c.put(a1.a(), a1);
/*    */       j++; }
/*    */   
/*    */   }
/*    */   a(String ☃) {
/* 60 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public String a() {
/* 64 */     return this.d;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 68 */     a a1 = c.get(☃);
/* 69 */     return (a1 == null) ? a : a1;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/auu$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */