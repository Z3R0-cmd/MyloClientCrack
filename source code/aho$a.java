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
/*  81 */   a(1, "north_west"),
/*  82 */   b(2, "north"),
/*  83 */   c(3, "north_east"),
/*  84 */   d(4, "west"),
/*  85 */   e(5, "center"),
/*  86 */   f(6, "east"),
/*  87 */   g(7, "south_west"),
/*  88 */   h(8, "south"),
/*  89 */   i(9, "south_east"),
/*  90 */   j(10, "stem"),
/*  91 */   k(0, "all_inside"),
/*  92 */   l(14, "all_outside"),
/*  93 */   m(15, "all_stem");
/*     */   
/*     */   private static final a[] n;
/*     */   private final int o;
/*     */   private final String p;
/*     */   
/*     */   static {
/* 100 */     n = new a[16]; a[] ☃;
/*     */     int i, j;
/* 102 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 103 */       n[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1) {
/* 108 */     this.o = ☃;
/* 109 */     this.p = str1;
/*     */   }
/*     */   
/*     */   public int a() {
/* 113 */     return this.o;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 122 */     return this.p;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 126 */     if (☃ < 0 || ☃ >= n.length) {
/* 127 */       ☃ = 0;
/*     */     }
/* 129 */     a a1 = n[☃];
/* 130 */     return (a1 == null) ? n[0] : a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 135 */     return this.p;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aho$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */