/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 129 */   a(0, arn.m, "stone"),
/* 130 */   b(1, arn.d, "sandstone", "sand"),
/* 131 */   c(2, arn.o, "wood_old", "wood"),
/* 132 */   d(3, arn.m, "cobblestone", "cobble"),
/* 133 */   e(4, arn.D, "brick"),
/* 134 */   f(5, arn.m, "stone_brick", "smoothStoneBrick"),
/* 135 */   g(6, arn.K, "nether_brick", "netherBrick"),
/* 136 */   h(7, arn.p, "quartz");
/*     */   
/*     */   private static final a[] i;
/*     */   
/*     */   private final int j;
/*     */   private final arn k;
/*     */   private final String l;
/*     */   private final String m;
/*     */   
/*     */   static {
/* 146 */     i = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/* 148 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 149 */       i[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(int ☃, arn arn1, String str1, String str2) {
/* 158 */     this.j = ☃;
/* 159 */     this.k = arn1;
/* 160 */     this.l = str1;
/* 161 */     this.m = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/* 165 */     return this.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public arn c() {
/* 173 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 178 */     return this.l;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 182 */     if (☃ < 0 || ☃ >= i.length) {
/* 183 */       ☃ = 0;
/*     */     }
/* 185 */     return i[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 190 */     return this.l;
/*     */   }
/*     */   
/*     */   public String d() {
/* 194 */     return this.m;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */