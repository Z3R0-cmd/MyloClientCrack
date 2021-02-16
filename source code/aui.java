/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aui
/*     */ {
/*     */   public final double a;
/*     */   public final double b;
/*     */   public final double c;
/*     */   
/*     */   public aui(double ☃, double d1, double d2) {
/*  12 */     if (☃ == -0.0D) {
/*  13 */       ☃ = 0.0D;
/*     */     }
/*  15 */     if (d1 == -0.0D) {
/*  16 */       d1 = 0.0D;
/*     */     }
/*  18 */     if (d2 == -0.0D) {
/*  19 */       d2 = 0.0D;
/*     */     }
/*  21 */     this.a = ☃;
/*  22 */     this.b = d1;
/*  23 */     this.c = d2;
/*     */   }
/*     */   
/*     */   public aui(df ☃) {
/*  27 */     this(☃.n(), ☃.o(), ☃.p());
/*     */   }
/*     */   
/*     */   public aui a(aui ☃) {
/*  31 */     return new aui(☃.a - this.a, ☃.b - this.b, ☃.c - this.c);
/*     */   }
/*     */   
/*     */   public aui a() {
/*  35 */     double ☃ = ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
/*  36 */     if (☃ < 1.0E-4D) {
/*  37 */       return new aui(0.0D, 0.0D, 0.0D);
/*     */     }
/*  39 */     return new aui(this.a / ☃, this.b / ☃, this.c / ☃);
/*     */   }
/*     */   
/*     */   public double b(aui ☃) {
/*  43 */     return this.a * ☃.a + this.b * ☃.b + this.c * ☃.c;
/*     */   }
/*     */   
/*     */   public aui c(aui ☃) {
/*  47 */     return new aui(this.b * ☃.c - this.c * ☃.b, this.c * ☃.a - this.a * ☃.c, this.a * ☃.b - this.b * ☃.a);
/*     */   }
/*     */   
/*     */   public aui d(aui ☃) {
/*  51 */     return a(☃.a, ☃.b, ☃.c);
/*     */   }
/*     */   
/*     */   public aui a(double ☃, double d1, double d2) {
/*  55 */     return b(-☃, -d1, -d2);
/*     */   }
/*     */   
/*     */   public aui e(aui ☃) {
/*  59 */     return b(☃.a, ☃.b, ☃.c);
/*     */   }
/*     */   
/*     */   public aui b(double ☃, double d1, double d2) {
/*  63 */     return new aui(this.a + ☃, this.b + d1, this.c + d2);
/*     */   }
/*     */   
/*     */   public double f(aui ☃) {
/*  67 */     double d1 = ☃.a - this.a;
/*  68 */     double d2 = ☃.b - this.b;
/*  69 */     double d3 = ☃.c - this.c;
/*  70 */     return ns.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double g(aui ☃) {
/*  74 */     double d1 = ☃.a - this.a;
/*  75 */     double d2 = ☃.b - this.b;
/*  76 */     double d3 = ☃.c - this.c;
/*  77 */     return d1 * d1 + d2 * d2 + d3 * d3;
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
/*     */   public double b() {
/*  92 */     return ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
/*     */   }
/*     */   
/*     */   public aui a(aui ☃, double d) {
/*  96 */     double d1 = ☃.a - this.a;
/*  97 */     double d2 = ☃.b - this.b;
/*  98 */     double d3 = ☃.c - this.c;
/*     */     
/* 100 */     if (d1 * d1 < 1.0000000116860974E-7D) {
/* 101 */       return null;
/*     */     }
/*     */     
/* 104 */     double d4 = (d - this.a) / d1;
/* 105 */     if (d4 < 0.0D || d4 > 1.0D) {
/* 106 */       return null;
/*     */     }
/* 108 */     return new aui(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public aui b(aui ☃, double d) {
/* 112 */     double d1 = ☃.a - this.a;
/* 113 */     double d2 = ☃.b - this.b;
/* 114 */     double d3 = ☃.c - this.c;
/*     */     
/* 116 */     if (d2 * d2 < 1.0000000116860974E-7D) {
/* 117 */       return null;
/*     */     }
/*     */     
/* 120 */     double d4 = (d - this.b) / d2;
/* 121 */     if (d4 < 0.0D || d4 > 1.0D) {
/* 122 */       return null;
/*     */     }
/* 124 */     return new aui(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public aui c(aui ☃, double d) {
/* 128 */     double d1 = ☃.a - this.a;
/* 129 */     double d2 = ☃.b - this.b;
/* 130 */     double d3 = ☃.c - this.c;
/*     */     
/* 132 */     if (d3 * d3 < 1.0000000116860974E-7D) {
/* 133 */       return null;
/*     */     }
/*     */     
/* 136 */     double d4 = (d - this.c) / d3;
/* 137 */     if (d4 < 0.0D || d4 > 1.0D) {
/* 138 */       return null;
/*     */     }
/* 140 */     return new aui(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/*     */   }
/*     */   
/*     */   public String toString() {
/* 144 */     return "(" + this.a + ", " + this.b + ", " + this.c + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aui a(float ☃) {
/* 152 */     float f1 = ns.b(☃);
/* 153 */     float f2 = ns.a(☃);
/*     */     
/* 155 */     double d1 = this.a;
/* 156 */     double d2 = this.b * f1 + this.c * f2;
/* 157 */     double d3 = this.c * f1 - this.b * f2;
/*     */     
/* 159 */     return new aui(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public aui b(float ☃) {
/* 163 */     float f1 = ns.b(☃);
/* 164 */     float f2 = ns.a(☃);
/*     */     
/* 166 */     double d1 = this.a * f1 + this.c * f2;
/* 167 */     double d2 = this.b;
/* 168 */     double d3 = this.c * f1 - this.a * f2;
/*     */     
/* 170 */     return new aui(d1, d2, d3);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */