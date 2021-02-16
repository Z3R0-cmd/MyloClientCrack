/*    */ 
/*    */ 
/*    */ 
/*    */ public class adw
/*    */   implements Comparable<adw>
/*    */ {
/*    */   private static long d;
/*    */   private final afh e;
/*    */   public final cj a;
/*    */   public long b;
/*    */   public int c;
/* 12 */   private long f = d++;
/*    */   
/*    */   public adw(cj ☃, afh afh1) {
/* 15 */     this.a = ☃;
/* 16 */     this.e = afh1;
/*    */   }
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 20 */     if (☃ instanceof adw) {
/* 21 */       adw adw1 = (adw)☃;
/* 22 */       return (this.a.equals(adw1.a) && afh.a(this.e, adw1.e));
/*    */     } 
/* 24 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 28 */     return this.a.hashCode();
/*    */   }
/*    */   
/*    */   public adw a(long ☃) {
/* 32 */     this.b = ☃;
/* 33 */     return this;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 37 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(adw ☃) {
/* 42 */     if (this.b < ☃.b) {
/* 43 */       return -1;
/*    */     }
/* 45 */     if (this.b > ☃.b) {
/* 46 */       return 1;
/*    */     }
/* 48 */     if (this.c != ☃.c) {
/* 49 */       return this.c - ☃.c;
/*    */     }
/* 51 */     if (this.f < ☃.f) {
/* 52 */       return -1;
/*    */     }
/* 54 */     if (this.f > ☃.f) {
/* 55 */       return 1;
/*    */     }
/* 57 */     return 0;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 61 */     return afh.a(this.e) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
/*    */   }
/*    */   
/*    */   public afh a() {
/* 65 */     return this.e;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */