/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  55 */   a(0, "sand", "default", arn.d),
/*  56 */   b(1, "red_sand", "red", arn.q);
/*     */   
/*     */   private static final a[] c;
/*     */   
/*     */   private final int d;
/*     */   private final String e;
/*     */   private final arn f;
/*     */   private final String g;
/*     */   
/*     */   static {
/*  66 */     c = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  68 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  69 */       c[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, String str2, arn arn1) {
/*  74 */     this.d = ☃;
/*  75 */     this.e = str1;
/*  76 */     this.f = arn1;
/*  77 */     this.g = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/*  81 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  90 */     return this.e;
/*     */   }
/*     */   
/*     */   public arn c() {
/*  94 */     return this.f;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/*  98 */     if (☃ < 0 || ☃ >= c.length) {
/*  99 */       ☃ = 0;
/*     */     }
/* 101 */     return c[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 106 */     return this.e;
/*     */   }
/*     */   
/*     */   public String d() {
/* 110 */     return this.g;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */