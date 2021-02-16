/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  75 */   a(0, arn.m, "stone"),
/*  76 */   b(1, arn.l, "granite"),
/*  77 */   c(2, arn.l, "smooth_granite", "graniteSmooth"),
/*  78 */   d(3, arn.p, "diorite"),
/*  79 */   e(4, arn.p, "smooth_diorite", "dioriteSmooth"),
/*  80 */   f(5, arn.m, "andesite"),
/*  81 */   g(6, arn.m, "smooth_andesite", "andesiteSmooth");
/*     */   
/*     */   private static final a[] h;
/*     */   
/*     */   private final int i;
/*     */   private final String j;
/*     */   private final String k;
/*     */   private final arn l;
/*     */   
/*     */   static {
/*  91 */     h = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  93 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  94 */       h[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(int ☃, arn arn1, String str1, String str2) {
/* 104 */     this.i = ☃;
/* 105 */     this.j = str1;
/* 106 */     this.k = str2;
/* 107 */     this.l = arn1;
/*     */   }
/*     */   
/*     */   public int a() {
/* 111 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public arn c() {
/* 119 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 124 */     return this.j;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 128 */     if (☃ < 0 || ☃ >= h.length) {
/* 129 */       ☃ = 0;
/*     */     }
/* 131 */     return h[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 136 */     return this.j;
/*     */   }
/*     */   
/*     */   public String d() {
/* 140 */     return this.k;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajy$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */