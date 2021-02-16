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
/*  69 */   a(0, "prismarine", "rough"),
/*  70 */   b(1, "prismarine_bricks", "bricks"),
/*  71 */   c(2, "dark_prismarine", "dark");
/*     */   
/*     */   private static final a[] d;
/*     */   private final int e;
/*     */   private final String f;
/*     */   private final String g;
/*     */   
/*     */   static {
/*  79 */     d = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  81 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  82 */       d[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, String str2) {
/*  87 */     this.e = ☃;
/*  88 */     this.f = str1;
/*  89 */     this.g = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/*  93 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 102 */     return this.f;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 106 */     if (☃ < 0 || ☃ >= d.length) {
/* 107 */       ☃ = 0;
/*     */     }
/* 109 */     return d[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 114 */     return this.f;
/*     */   }
/*     */   
/*     */   public String c() {
/* 118 */     return this.g;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiu$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */