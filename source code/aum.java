/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aum
/*    */ {
/*  9 */   public static final Comparator<aum> a = new Comparator<aum>()
/*    */     {
/*    */       public int a(aum ☃, aum aum1) {
/* 12 */         if (☃.c() > aum1.c())
/* 13 */           return 1; 
/* 14 */         if (☃.c() < aum1.c()) {
/* 15 */           return -1;
/*    */         }
/* 17 */         return aum1.e().compareToIgnoreCase(☃.e());
/*    */       }
/*    */     };
/*    */ 
/*    */   
/*    */   private final auo b;
/*    */   private final auk c;
/*    */   private final String d;
/*    */   private int e;
/*    */   private boolean f;
/*    */   private boolean g;
/*    */   
/*    */   public aum(auo ☃, auk auk1, String str) {
/* 30 */     this.b = ☃;
/* 31 */     this.c = auk1;
/* 32 */     this.d = str;
/* 33 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 37 */     if (this.c.c().b()) {
/* 38 */       throw new IllegalStateException("Cannot modify read-only score");
/*    */     }
/* 40 */     c(c() + ☃);
/*    */   }
/*    */   
/*    */   public void b(int ☃) {
/* 44 */     if (this.c.c().b()) {
/* 45 */       throw new IllegalStateException("Cannot modify read-only score");
/*    */     }
/* 47 */     c(c() - ☃);
/*    */   }
/*    */   
/*    */   public void a() {
/* 51 */     if (this.c.c().b()) {
/* 52 */       throw new IllegalStateException("Cannot modify read-only score");
/*    */     }
/* 54 */     a(1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int c() {
/* 65 */     return this.e;
/*    */   }
/*    */   
/*    */   public void c(int ☃) {
/* 69 */     int i = this.e;
/* 70 */     this.e = ☃;
/* 71 */     if (i != ☃ || this.g) {
/* 72 */       this.g = false;
/* 73 */       f().a(this);
/*    */     } 
/*    */   }
/*    */   
/*    */   public auk d() {
/* 78 */     return this.c;
/*    */   }
/*    */   
/*    */   public String e() {
/* 82 */     return this.d;
/*    */   }
/*    */   
/*    */   public auo f() {
/* 86 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 90 */     return this.f;
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 94 */     this.f = ☃;
/*    */   }
/*    */   
/*    */   public void a(List<wn> ☃) {
/* 98 */     c(this.c.c().a(☃));
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */