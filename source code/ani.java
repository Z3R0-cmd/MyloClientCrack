/*    */ import com.google.common.collect.Maps;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.Iterator;
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
/*    */ public class ani
/*    */ {
/* 42 */   private static final Map<File, anh> a = Maps.newHashMap();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static synchronized anh a(File ☃, int i, int j) {
/* 48 */     File file1 = new File(☃, "region");
/* 49 */     File file2 = new File(file1, "r." + (i >> 5) + "." + (j >> 5) + ".mca");
/*    */     
/* 51 */     anh anh1 = a.get(file2);
/* 52 */     if (anh1 != null) {
/* 53 */       return anh1;
/*    */     }
/*    */     
/* 56 */     if (!file1.exists()) {
/* 57 */       file1.mkdirs();
/*    */     }
/*    */     
/* 60 */     if (a.size() >= 256) {
/* 61 */       a();
/*    */     }
/*    */     
/* 64 */     anh anh2 = new anh(file2);
/* 65 */     a.put(file2, anh2);
/* 66 */     return anh2;
/*    */   }
/*    */   
/*    */   public static synchronized void a() {
/* 70 */     for (Iterator<anh> ☃ = a.values().iterator(); ☃.hasNext(); ) { anh anh = ☃.next();
/*    */       try {
/* 72 */         if (anh != null) {
/* 73 */           anh.c();
/*    */         }
/* 75 */       } catch (IOException iOException) {
/* 76 */         iOException.printStackTrace();
/*    */       }  }
/*    */     
/* 79 */     a.clear();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static DataInputStream c(File ☃, int i, int j) {
/* 88 */     anh anh = a(☃, i, j);
/* 89 */     return anh.a(i & 0x1F, j & 0x1F);
/*    */   }
/*    */   
/*    */   public static DataOutputStream d(File ☃, int i, int j) {
/* 93 */     anh anh = a(☃, i, j);
/* 94 */     return anh.b(i & 0x1F, j & 0x1F);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ani.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */