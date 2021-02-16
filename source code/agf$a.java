/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  85 */   a(0, "dirt", "default", arn.l),
/*  86 */   b(1, "coarse_dirt", "coarse", arn.l),
/*  87 */   c(2, "podzol", arn.J);
/*     */   
/*     */   private static final a[] d;
/*     */   
/*     */   private final int e;
/*     */   private final String f;
/*     */   private final String g;
/*     */   private final arn h;
/*     */   
/*     */   static {
/*  97 */     d = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  99 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 100 */       d[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(int ☃, String str1, String str2, arn arn1) {
/* 109 */     this.e = ☃;
/* 110 */     this.f = str1;
/* 111 */     this.g = str2;
/* 112 */     this.h = arn1;
/*     */   }
/*     */   
/*     */   public int a() {
/* 116 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c() {
/* 124 */     return this.g;
/*     */   }
/*     */   
/*     */   public arn d() {
/* 128 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 133 */     return this.f;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 137 */     if (☃ < 0 || ☃ >= d.length) {
/* 138 */       ☃ = 0;
/*     */     }
/* 140 */     return d[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 145 */     return this.f;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agf$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */