/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum a
/*     */   implements nw
/*     */ {
/*  97 */   a(0, "default", "default"),
/*  98 */   b(1, "chiseled", "chiseled"),
/*  99 */   c(2, "lines_y", "lines"),
/* 100 */   d(3, "lines_x", "lines"),
/* 101 */   e(4, "lines_z", "lines");
/*     */   
/*     */   private static final a[] f;
/*     */   
/*     */   private final int g;
/*     */   private final String h;
/*     */   private final String i;
/*     */   
/*     */   static {
/* 110 */     f = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/* 112 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 113 */       f[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, String str2) {
/* 118 */     this.g = ☃;
/* 119 */     this.h = str1;
/* 120 */     this.i = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/* 124 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 133 */     return this.i;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 137 */     if (☃ < 0 || ☃ >= f.length) {
/* 138 */       ☃ = 0;
/*     */     }
/* 140 */     return f[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 145 */     return this.h;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiw$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */