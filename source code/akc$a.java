/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 146 */   a(0, "dead_bush"),
/* 147 */   b(1, "tall_grass"),
/* 148 */   c(2, "fern");
/*     */   
/*     */   private static final a[] d;
/*     */   
/*     */   private final int e;
/*     */   private final String f;
/*     */   
/*     */   static {
/* 156 */     d = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/* 158 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 159 */       d[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1) {
/* 164 */     this.e = ☃;
/* 165 */     this.f = str1;
/*     */   }
/*     */   
/*     */   public int a() {
/* 169 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 174 */     return this.f;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 178 */     if (☃ < 0 || ☃ >= d.length) {
/* 179 */       ☃ = 0;
/*     */     }
/* 181 */     return d[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 186 */     return this.f;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akc$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */