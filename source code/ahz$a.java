/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 100 */   a(0, "stone")
/*     */   {
/*     */     public alz d() {
/* 103 */       return afi.b.Q().a(ajy.a, ajy.a.a);
/*     */     }
/*     */   },
/* 106 */   b(1, "cobblestone", "cobble")
/*     */   {
/*     */     public alz d() {
/* 109 */       return afi.e.Q();
/*     */     }
/*     */   },
/* 112 */   c(2, "stone_brick", "brick")
/*     */   {
/*     */     public alz d() {
/* 115 */       return afi.bf.Q().a(ajz.a, ajz.a.a);
/*     */     }
/*     */   },
/* 118 */   d(3, "mossy_brick", "mossybrick")
/*     */   {
/*     */     public alz d() {
/* 121 */       return afi.bf.Q().a(ajz.a, ajz.a.b);
/*     */     }
/*     */   },
/* 124 */   e(4, "cracked_brick", "crackedbrick")
/*     */   {
/*     */     public alz d() {
/* 127 */       return afi.bf.Q().a(ajz.a, ajz.a.c);
/*     */     }
/*     */   },
/* 130 */   f(5, "chiseled_brick", "chiseledbrick")
/*     */   {
/*     */     public alz d() {
/* 133 */       return afi.bf.Q().a(ajz.a, ajz.a.d);
/*     */     }
/*     */   };
/*     */ 
/*     */   
/*     */   private static final a[] g;
/*     */   private final int h;
/*     */   private final String i;
/*     */   private final String j;
/*     */   
/*     */   static {
/* 144 */     g = new a[(values()).length]; a[] ☃;
/*     */     int i, j;
/* 146 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 147 */       g[a1.a()] = a1;
/*     */       j++; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(int ☃, String str1, String str2) {
/* 156 */     this.h = ☃;
/* 157 */     this.i = str1;
/* 158 */     this.j = str2;
/*     */   }
/*     */   
/*     */   public int a() {
/* 162 */     return this.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 171 */     return this.i;
/*     */   }
/*     */   
/*     */   public static a a(int ☃) {
/* 175 */     if (☃ < 0 || ☃ >= g.length) {
/* 176 */       ☃ = 0;
/*     */     }
/* 178 */     return g[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 183 */     return this.i;
/*     */   }
/*     */   
/*     */   public String c() {
/* 187 */     return this.j;
/*     */   }
/*     */   public static a a(alz ☃) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/* 193 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 194 */       if (☃ == a1.d()) {
/* 195 */         return a1;
/*     */       }
/*     */       j++; }
/*     */     
/* 199 */     return a;
/*     */   }
/*     */   
/*     */   public abstract alz d();
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahz$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */