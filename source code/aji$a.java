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
/*  58 */   a(0, "sandstone", "default"),
/*  59 */   b(1, "chiseled_sandstone", "chiseled"),
/*  60 */   c(2, "smooth_sandstone", "smooth");
/*     */   
/*     */   private static final a[] d;
/*     */   
/*     */   private final int e;
/*     */   private final String f;
/*     */   private final String g;
/*     */   
/*     */   static {
/*  69 */     d = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  71 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  72 */       d[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, String str2) {
/*  77 */     this.e = ☃;
/*  78 */     this.f = str1;
/*  79 */     this.g = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/*  83 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  92 */     return this.f;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/*  96 */     if (☃ < 0 || ☃ >= d.length) {
/*  97 */       ☃ = 0;
/*     */     }
/*  99 */     return d[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 104 */     return this.f;
/*     */   }
/*     */   
/*     */   public String c() {
/* 108 */     return this.g;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aji$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */