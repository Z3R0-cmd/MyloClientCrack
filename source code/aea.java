/*    */ import java.util.Iterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aea
/*    */ {
/* 11 */   private static final a a = new a()
/*    */     {
/*    */       public int a(ady ☃, cj cj1) {
/* 14 */         return ☃.b(cj1);
/*    */       }
/*    */     };
/* 17 */   private static final a b = new a()
/*    */     {
/*    */       public int a(ady ☃, cj cj1) {
/* 20 */         return ☃.c(cj1);
/*    */       }
/*    */     };
/* 23 */   private static final a c = new a()
/*    */     {
/*    */       public int a(ady ☃, cj cj1) {
/* 26 */         return ☃.ar;
/*    */       }
/*    */     };
/*    */   
/*    */   private static int a(adq ☃, cj cj1, a a1) {
/* 31 */     int i = 0;
/* 32 */     int j = 0;
/* 33 */     int k = 0;
/*    */     
/* 35 */     for (Iterator<cj.a> iterator = cj.b(cj1.a(-1, 0, -1), cj1.a(1, 0, 1)).iterator(); iterator.hasNext(); ) { cj.a a2 = iterator.next();
/* 36 */       int m = a1.a(☃.b(a2), a2);
/*    */       
/* 38 */       i += (m & 0xFF0000) >> 16;
/* 39 */       j += (m & 0xFF00) >> 8;
/* 40 */       k += m & 0xFF; }
/*    */ 
/*    */     
/* 43 */     return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
/*    */   }
/*    */   
/*    */   public static int a(adq ☃, cj cj1) {
/* 47 */     return a(☃, cj1, a);
/*    */   }
/*    */   
/*    */   public static int b(adq ☃, cj cj1) {
/* 51 */     return a(☃, cj1, b);
/*    */   }
/*    */   
/*    */   public static int c(adq ☃, cj cj1) {
/* 55 */     return a(☃, cj1, c);
/*    */   }
/*    */   
/*    */   static interface a {
/*    */     int a(ady param1ady, cj param1cj);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */