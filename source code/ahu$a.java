/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 232 */   a(0, "down_x", cq.a),
/* 233 */   b(1, "east", cq.f),
/* 234 */   c(2, "west", cq.e),
/* 235 */   d(3, "south", cq.d),
/* 236 */   e(4, "north", cq.c),
/* 237 */   f(5, "up_z", cq.b),
/* 238 */   g(6, "up_x", cq.b),
/* 239 */   h(7, "down_z", cq.a);
/*     */   
/*     */   private static final a[] i;
/*     */   
/*     */   private final int j;
/*     */   private final String k;
/*     */   private final cq l;
/*     */   
/*     */   static {
/* 248 */     i = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/* 250 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 251 */       i[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */   a(int ☃, String str1, cq cq1) {
/* 256 */     this.j = ☃;
/* 257 */     this.k = str1;
/* 258 */     this.l = cq1;
/*     */   }
/*     */   
/*     */   public int a() {
/* 262 */     return this.j;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cq c() {
/* 270 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 275 */     return this.k;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 279 */     if (☃ < 0 || ☃ >= i.length) {
/* 280 */       ☃ = 0;
/*     */     }
/* 282 */     return i[☃];
/*     */   }
/*     */   
/*     */   public static a a(cq ☃, cq cq1) {
/* 286 */     switch (ahu.null.a[☃.ordinal()]) {
/*     */       case 1:
/* 288 */         switch (ahu.null.c[cq1.k().ordinal()]) {
/*     */           case 1:
/* 290 */             return a;
/*     */           case 2:
/* 292 */             return h;
/*     */         } 
/* 294 */         throw new IllegalArgumentException("Invalid entityFacing " + cq1 + " for facing " + ☃);
/*     */       
/*     */       case 2:
/* 297 */         switch (ahu.null.c[cq1.k().ordinal()]) {
/*     */           case 1:
/* 299 */             return g;
/*     */           case 2:
/* 301 */             return f;
/*     */         } 
/* 303 */         throw new IllegalArgumentException("Invalid entityFacing " + cq1 + " for facing " + ☃);
/*     */       
/*     */       case 3:
/* 306 */         return e;
/*     */       case 4:
/* 308 */         return d;
/*     */       case 5:
/* 310 */         return c;
/*     */       case 6:
/* 312 */         return b;
/*     */     } 
/*     */     
/* 315 */     throw new IllegalArgumentException("Invalid facing: " + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 320 */     return this.k;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahu$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */