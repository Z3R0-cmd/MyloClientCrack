/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asc
/*    */ {
/*  9 */   private static int a = 256;
/*    */   
/* 11 */   private static List<int[]> b = Lists.newArrayList();
/* 12 */   private static List<int[]> c = Lists.newArrayList();
/*    */   
/* 14 */   private static List<int[]> d = Lists.newArrayList();
/* 15 */   private static List<int[]> e = Lists.newArrayList();
/*    */   
/*    */   public static synchronized int[] a(int ☃) {
/* 18 */     if (☃ <= 256) {
/* 19 */       if (b.isEmpty()) {
/* 20 */         int[] arrayOfInt2 = new int[256];
/* 21 */         c.add(arrayOfInt2);
/* 22 */         return arrayOfInt2;
/*    */       } 
/* 24 */       int[] arrayOfInt1 = b.remove(b.size() - 1);
/* 25 */       c.add(arrayOfInt1);
/* 26 */       return arrayOfInt1;
/*    */     } 
/*    */ 
/*    */     
/* 30 */     if (☃ > a) {
/* 31 */       a = ☃;
/*    */       
/* 33 */       d.clear();
/* 34 */       e.clear();
/*    */       
/* 36 */       int[] arrayOfInt1 = new int[a];
/* 37 */       e.add(arrayOfInt1);
/* 38 */       return arrayOfInt1;
/*    */     } 
/* 40 */     if (d.isEmpty()) {
/* 41 */       int[] arrayOfInt1 = new int[a];
/* 42 */       e.add(arrayOfInt1);
/* 43 */       return arrayOfInt1;
/*    */     } 
/* 45 */     int[] arrayOfInt = d.remove(d.size() - 1);
/* 46 */     e.add(arrayOfInt);
/* 47 */     return arrayOfInt;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static synchronized void a() {
/* 53 */     if (!d.isEmpty()) {
/* 54 */       d.remove(d.size() - 1);
/*    */     }
/* 56 */     if (!b.isEmpty()) {
/* 57 */       b.remove(b.size() - 1);
/*    */     }
/*    */     
/* 60 */     d.addAll(e);
/* 61 */     b.addAll(c);
/*    */     
/* 63 */     e.clear();
/* 64 */     c.clear();
/*    */   }
/*    */   
/*    */   public static synchronized String b() {
/* 68 */     return "cache: " + d.size() + ", tcache: " + b.size() + ", allocated: " + e.size() + ", tallocated: " + c.size();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */