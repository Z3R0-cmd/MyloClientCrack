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
/*  52 */   a(0, "red_sandstone", "default"),
/*  53 */   b(1, "chiseled_red_sandstone", "chiseled"),
/*  54 */   c(2, "smooth_red_sandstone", "smooth");
/*     */   
/*     */   private static final a[] d;
/*     */   
/*     */   private final int e;
/*     */   private final String f;
/*     */   private final String g;
/*     */   
/*     */   static {
/*  63 */     d = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  65 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  66 */       d[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, String str2) {
/*  71 */     this.e = ☃;
/*  72 */     this.f = str1;
/*  73 */     this.g = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/*  77 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  86 */     return this.f;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/*  90 */     if (☃ < 0 || ☃ >= d.length) {
/*  91 */       ☃ = 0;
/*     */     }
/*  93 */     return d[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/*  98 */     return this.f;
/*     */   }
/*     */   
/*     */   public String c() {
/* 102 */     return this.g;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiz$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */