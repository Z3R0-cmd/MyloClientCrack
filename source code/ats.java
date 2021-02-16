/*    */ 
/*    */ 
/*    */ public class ats
/*    */   implements Comparable<ats>
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final long c;
/*    */   private final long d;
/*    */   private final boolean e;
/*    */   private final adp.a f;
/*    */   private final boolean g;
/*    */   private final boolean h;
/*    */   
/*    */   public ats(String ☃, String str1, long l1, long l2, adp.a a1, boolean bool1, boolean bool2, boolean bool3) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = str1;
/* 18 */     this.c = l1;
/* 19 */     this.d = l2;
/* 20 */     this.f = a1;
/* 21 */     this.e = bool1;
/* 22 */     this.g = bool2;
/* 23 */     this.h = bool3;
/*    */   }
/*    */   
/*    */   public String a() {
/* 27 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b() {
/* 31 */     return this.b;
/*    */   }
/*    */   
/*    */   public long c() {
/* 35 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 39 */     return this.e;
/*    */   }
/*    */   
/*    */   public long e() {
/* 43 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(ats ☃) {
/* 48 */     if (this.c < ☃.c) {
/* 49 */       return 1;
/*    */     }
/* 51 */     if (this.c > ☃.c) {
/* 52 */       return -1;
/*    */     }
/* 54 */     return this.a.compareTo(☃.a);
/*    */   }
/*    */   
/*    */   public adp.a f() {
/* 58 */     return this.f;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 62 */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 66 */     return this.h;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */