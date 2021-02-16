/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  57 */   a(0, "stonebrick", "default"),
/*  58 */   b(1, "mossy_stonebrick", "mossy"),
/*  59 */   c(2, "cracked_stonebrick", "cracked"),
/*  60 */   d(3, "chiseled_stonebrick", "chiseled");
/*     */   
/*     */   private static final a[] e;
/*     */   
/*     */   private final int f;
/*     */   private final String g;
/*     */   private final String h;
/*     */   
/*     */   static {
/*  69 */     e = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/*  71 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  72 */       e[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, String str2) {
/*  77 */     this.f = ☃;
/*  78 */     this.g = str1;
/*  79 */     this.h = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/*  83 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  92 */     return this.g;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/*  96 */     if (☃ < 0 || ☃ >= e.length) {
/*  97 */       ☃ = 0;
/*     */     }
/*  99 */     return e[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 104 */     return this.g;
/*     */   }
/*     */   
/*     */   public String c() {
/* 108 */     return this.h;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajz$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */