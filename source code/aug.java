/*     */ 
/*     */ 
/*     */ public class aug
/*     */ {
/*     */   public final double a;
/*     */   public final double b;
/*     */   public final double c;
/*     */   public final double d;
/*     */   public final double e;
/*     */   public final double f;
/*     */   
/*     */   public aug(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  13 */     this.a = Math.min(☃, d3);
/*  14 */     this.b = Math.min(d1, d4);
/*  15 */     this.c = Math.min(d2, d5);
/*  16 */     this.d = Math.max(☃, d3);
/*  17 */     this.e = Math.max(d1, d4);
/*  18 */     this.f = Math.max(d2, d5);
/*     */   }
/*     */   
/*     */   public aug(cj ☃, cj cj1) {
/*  22 */     this.a = ☃.n();
/*  23 */     this.b = ☃.o();
/*  24 */     this.c = ☃.p();
/*  25 */     this.d = cj1.n();
/*  26 */     this.e = cj1.o();
/*  27 */     this.f = cj1.p();
/*     */   }
/*     */   
/*     */   public aug a(double ☃, double d1, double d2) {
/*  31 */     double d3 = this.a;
/*  32 */     double d4 = this.b;
/*  33 */     double d5 = this.c;
/*  34 */     double d6 = this.d;
/*  35 */     double d7 = this.e;
/*  36 */     double d8 = this.f;
/*     */     
/*  38 */     if (☃ < 0.0D) {
/*  39 */       d3 += ☃;
/*  40 */     } else if (☃ > 0.0D) {
/*  41 */       d6 += ☃;
/*     */     } 
/*     */     
/*  44 */     if (d1 < 0.0D) {
/*  45 */       d4 += d1;
/*  46 */     } else if (d1 > 0.0D) {
/*  47 */       d7 += d1;
/*     */     } 
/*     */     
/*  50 */     if (d2 < 0.0D) {
/*  51 */       d5 += d2;
/*  52 */     } else if (d2 > 0.0D) {
/*  53 */       d8 += d2;
/*     */     } 
/*     */     
/*  56 */     return new aug(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public aug b(double ☃, double d1, double d2) {
/*  60 */     double d3 = this.a - ☃;
/*  61 */     double d4 = this.b - d1;
/*  62 */     double d5 = this.c - d2;
/*  63 */     double d6 = this.d + ☃;
/*  64 */     double d7 = this.e + d1;
/*  65 */     double d8 = this.f + d2;
/*     */     
/*  67 */     return new aug(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public aug a(aug ☃) {
/*  71 */     double d1 = Math.min(this.a, ☃.a);
/*  72 */     double d2 = Math.min(this.b, ☃.b);
/*  73 */     double d3 = Math.min(this.c, ☃.c);
/*  74 */     double d4 = Math.max(this.d, ☃.d);
/*  75 */     double d5 = Math.max(this.e, ☃.e);
/*  76 */     double d6 = Math.max(this.f, ☃.f);
/*     */     
/*  78 */     return new aug(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public static aug a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  82 */     double d6 = Math.min(☃, d3);
/*  83 */     double d7 = Math.min(d1, d4);
/*  84 */     double d8 = Math.min(d2, d5);
/*  85 */     double d9 = Math.max(☃, d3);
/*  86 */     double d10 = Math.max(d1, d4);
/*  87 */     double d11 = Math.max(d2, d5);
/*     */     
/*  89 */     return new aug(d6, d7, d8, d9, d10, d11);
/*     */   }
/*     */   
/*     */   public aug c(double ☃, double d1, double d2) {
/*  93 */     return new aug(this.a + ☃, this.b + d1, this.c + d2, this.d + ☃, this.e + d1, this.f + d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public double a(aug ☃, double d) {
/*  98 */     if (☃.e <= this.b || ☃.b >= this.e || ☃.f <= this.c || ☃.c >= this.f) {
/*  99 */       return d;
/*     */     }
/*     */ 
/*     */     
/* 103 */     if (d > 0.0D && ☃.d <= this.a) {
/* 104 */       double d1 = this.a - ☃.d;
/* 105 */       if (d1 < d) {
/* 106 */         d = d1;
/*     */       }
/* 108 */     } else if (d < 0.0D && ☃.a >= this.d) {
/* 109 */       double d1 = this.d - ☃.a;
/* 110 */       if (d1 > d) {
/* 111 */         d = d1;
/*     */       }
/*     */     } 
/*     */     
/* 115 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public double b(aug ☃, double d) {
/* 120 */     if (☃.d <= this.a || ☃.a >= this.d || ☃.f <= this.c || ☃.c >= this.f) {
/* 121 */       return d;
/*     */     }
/*     */ 
/*     */     
/* 125 */     if (d > 0.0D && ☃.e <= this.b) {
/* 126 */       double d1 = this.b - ☃.e;
/* 127 */       if (d1 < d) {
/* 128 */         d = d1;
/*     */       }
/* 130 */     } else if (d < 0.0D && ☃.b >= this.e) {
/* 131 */       double d1 = this.e - ☃.b;
/* 132 */       if (d1 > d) {
/* 133 */         d = d1;
/*     */       }
/*     */     } 
/*     */     
/* 137 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public double c(aug ☃, double d) {
/* 142 */     if (☃.d <= this.a || ☃.a >= this.d || ☃.e <= this.b || ☃.b >= this.e) {
/* 143 */       return d;
/*     */     }
/*     */ 
/*     */     
/* 147 */     if (d > 0.0D && ☃.f <= this.c) {
/* 148 */       double d1 = this.c - ☃.f;
/* 149 */       if (d1 < d) {
/* 150 */         d = d1;
/*     */       }
/* 152 */     } else if (d < 0.0D && ☃.c >= this.f) {
/* 153 */       double d1 = this.f - ☃.c;
/* 154 */       if (d1 > d) {
/* 155 */         d = d1;
/*     */       }
/*     */     } 
/*     */     
/* 159 */     return d;
/*     */   }
/*     */   
/*     */   public boolean b(aug ☃) {
/* 163 */     if (☃.d <= this.a || ☃.a >= this.d) {
/* 164 */       return false;
/*     */     }
/* 166 */     if (☃.e <= this.b || ☃.b >= this.e) {
/* 167 */       return false;
/*     */     }
/* 169 */     if (☃.f <= this.c || ☃.c >= this.f) {
/* 170 */       return false;
/*     */     }
/* 172 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aui ☃) {
/* 202 */     if (☃.a <= this.a || ☃.a >= this.d) {
/* 203 */       return false;
/*     */     }
/* 205 */     if (☃.b <= this.b || ☃.b >= this.e) {
/* 206 */       return false;
/*     */     }
/* 208 */     if (☃.c <= this.c || ☃.c >= this.f) {
/* 209 */       return false;
/*     */     }
/* 211 */     return true;
/*     */   }
/*     */   
/*     */   public double a() {
/* 215 */     double ☃ = this.d - this.a;
/* 216 */     double d1 = this.e - this.b;
/* 217 */     double d2 = this.f - this.c;
/* 218 */     return (☃ + d1 + d2) / 3.0D;
/*     */   }
/*     */   
/*     */   public aug d(double ☃, double d1, double d2) {
/* 222 */     double d3 = this.a + ☃;
/* 223 */     double d4 = this.b + d1;
/* 224 */     double d5 = this.c + d2;
/* 225 */     double d6 = this.d - ☃;
/* 226 */     double d7 = this.e - d1;
/* 227 */     double d8 = this.f - d2;
/*     */     
/* 229 */     return new aug(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */ 
/*     */   
/*     */   public auh a(aui ☃, aui aui1) {
/* 234 */     aui aui2 = ☃.a(aui1, this.a);
/* 235 */     aui aui3 = ☃.a(aui1, this.d);
/*     */     
/* 237 */     aui aui4 = ☃.b(aui1, this.b);
/* 238 */     aui aui5 = ☃.b(aui1, this.e);
/*     */     
/* 240 */     aui aui6 = ☃.c(aui1, this.c);
/* 241 */     aui aui7 = ☃.c(aui1, this.f);
/*     */     
/* 243 */     if (!b(aui2)) {
/* 244 */       aui2 = null;
/*     */     }
/* 246 */     if (!b(aui3)) {
/* 247 */       aui3 = null;
/*     */     }
/* 249 */     if (!c(aui4)) {
/* 250 */       aui4 = null;
/*     */     }
/* 252 */     if (!c(aui5)) {
/* 253 */       aui5 = null;
/*     */     }
/* 255 */     if (!d(aui6)) {
/* 256 */       aui6 = null;
/*     */     }
/* 258 */     if (!d(aui7)) {
/* 259 */       aui7 = null;
/*     */     }
/*     */     
/* 262 */     aui aui8 = null;
/*     */     
/* 264 */     if (aui2 != null) {
/* 265 */       aui8 = aui2;
/*     */     }
/* 267 */     if (aui3 != null && (aui8 == null || ☃.g(aui3) < ☃.g(aui8))) {
/* 268 */       aui8 = aui3;
/*     */     }
/* 270 */     if (aui4 != null && (aui8 == null || ☃.g(aui4) < ☃.g(aui8))) {
/* 271 */       aui8 = aui4;
/*     */     }
/* 273 */     if (aui5 != null && (aui8 == null || ☃.g(aui5) < ☃.g(aui8))) {
/* 274 */       aui8 = aui5;
/*     */     }
/* 276 */     if (aui6 != null && (aui8 == null || ☃.g(aui6) < ☃.g(aui8))) {
/* 277 */       aui8 = aui6;
/*     */     }
/* 279 */     if (aui7 != null && (aui8 == null || ☃.g(aui7) < ☃.g(aui8))) {
/* 280 */       aui8 = aui7;
/*     */     }
/*     */     
/* 283 */     if (aui8 == null) {
/* 284 */       return null;
/*     */     }
/*     */     
/* 287 */     cq cq = null;
/*     */     
/* 289 */     if (aui8 == aui2) {
/* 290 */       cq = cq.e;
/* 291 */     } else if (aui8 == aui3) {
/* 292 */       cq = cq.f;
/* 293 */     } else if (aui8 == aui4) {
/* 294 */       cq = cq.a;
/* 295 */     } else if (aui8 == aui5) {
/* 296 */       cq = cq.b;
/* 297 */     } else if (aui8 == aui6) {
/* 298 */       cq = cq.c;
/*     */     } else {
/* 300 */       cq = cq.d;
/*     */     } 
/*     */     
/* 303 */     return new auh(aui8, cq);
/*     */   }
/*     */   
/*     */   private boolean b(aui ☃) {
/* 307 */     if (☃ == null) {
/* 308 */       return false;
/*     */     }
/* 310 */     return (☃.b >= this.b && ☃.b <= this.e && ☃.c >= this.c && ☃.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean c(aui ☃) {
/* 314 */     if (☃ == null) {
/* 315 */       return false;
/*     */     }
/* 317 */     return (☃.a >= this.a && ☃.a <= this.d && ☃.c >= this.c && ☃.c <= this.f);
/*     */   }
/*     */   
/*     */   private boolean d(aui ☃) {
/* 321 */     if (☃ == null) {
/* 322 */       return false;
/*     */     }
/* 324 */     return (☃.a >= this.a && ☃.a <= this.d && ☃.b >= this.b && ☃.b <= this.e);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 328 */     return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 332 */     if (Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f))
/*     */     {
/* 334 */       return true;
/*     */     }
/*     */     
/* 337 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */