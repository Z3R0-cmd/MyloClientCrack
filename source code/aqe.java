/*     */ import com.google.common.base.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqe
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   
/*     */   public aqe() {}
/*     */   
/*     */   public aqe(int[] ☃) {
/*  21 */     if (☃.length == 6) {
/*  22 */       this.a = ☃[0];
/*  23 */       this.b = ☃[1];
/*  24 */       this.c = ☃[2];
/*  25 */       this.d = ☃[3];
/*  26 */       this.e = ☃[4];
/*  27 */       this.f = ☃[5];
/*     */     } 
/*     */   }
/*     */   
/*     */   public static aqe a() {
/*  32 */     return new aqe(2147483647, 2147483647, 2147483647, -2147483648, -2147483648, -2147483648);
/*     */   }
/*     */   
/*     */   public static aqe a(int ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3, cq cq1) {
/*  36 */     switch (null.a[cq1.ordinal()]) {
/*     */       default:
/*  38 */         return new aqe(☃ + k, i + m, j + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + i3 - 1 + n);
/*     */       
/*     */       case 1:
/*  41 */         return new aqe(☃ + k, i + m, j - i3 + 1 + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + n);
/*     */       
/*     */       case 2:
/*  44 */         return new aqe(☃ + k, i + m, j + n, ☃ + i1 - 1 + k, i + i2 - 1 + m, j + i3 - 1 + n);
/*     */       
/*     */       case 3:
/*  47 */         return new aqe(☃ - i3 + 1 + n, i + m, j + k, ☃ + n, i + i2 - 1 + m, j + i1 - 1 + k);
/*     */       case 4:
/*     */         break;
/*  50 */     }  return new aqe(☃ + n, i + m, j + k, ☃ + i3 - 1 + n, i + i2 - 1 + m, j + i1 - 1 + k);
/*     */   }
/*     */ 
/*     */   
/*     */   public static aqe a(int ☃, int i, int j, int k, int m, int n) {
/*  55 */     return new aqe(Math.min(☃, k), Math.min(i, m), Math.min(j, n), Math.max(☃, k), Math.max(i, m), Math.max(j, n));
/*     */   }
/*     */   
/*     */   public aqe(aqe ☃) {
/*  59 */     this.a = ☃.a;
/*  60 */     this.b = ☃.b;
/*  61 */     this.c = ☃.c;
/*  62 */     this.d = ☃.d;
/*  63 */     this.e = ☃.e;
/*  64 */     this.f = ☃.f;
/*     */   }
/*     */   
/*     */   public aqe(int ☃, int i, int j, int k, int m, int n) {
/*  68 */     this.a = ☃;
/*  69 */     this.b = i;
/*  70 */     this.c = j;
/*  71 */     this.d = k;
/*  72 */     this.e = m;
/*  73 */     this.f = n;
/*     */   }
/*     */   
/*     */   public aqe(df ☃, df df1) {
/*  77 */     this.a = Math.min(☃.n(), df1.n());
/*  78 */     this.b = Math.min(☃.o(), df1.o());
/*  79 */     this.c = Math.min(☃.p(), df1.p());
/*  80 */     this.d = Math.max(☃.n(), df1.n());
/*  81 */     this.e = Math.max(☃.o(), df1.o());
/*  82 */     this.f = Math.max(☃.p(), df1.p());
/*     */   }
/*     */   
/*     */   public aqe(int ☃, int i, int j, int k) {
/*  86 */     this.a = ☃;
/*  87 */     this.c = i;
/*  88 */     this.d = j;
/*  89 */     this.f = k;
/*     */ 
/*     */     
/*  92 */     this.b = 1;
/*  93 */     this.e = 512;
/*     */   }
/*     */   
/*     */   public boolean a(aqe ☃) {
/*  97 */     return (this.d >= ☃.a && this.a <= ☃.d && this.f >= ☃.c && this.c <= ☃.f && this.e >= ☃.b && this.b <= ☃.e);
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
/*     */   public boolean a(int ☃, int i, int j, int k) {
/* 109 */     return (this.d >= ☃ && this.a <= j && this.f >= i && this.c <= k);
/*     */   }
/*     */   
/*     */   public void b(aqe ☃) {
/* 113 */     this.a = Math.min(this.a, ☃.a);
/* 114 */     this.b = Math.min(this.b, ☃.b);
/* 115 */     this.c = Math.min(this.c, ☃.c);
/* 116 */     this.d = Math.max(this.d, ☃.d);
/* 117 */     this.e = Math.max(this.e, ☃.e);
/* 118 */     this.f = Math.max(this.f, ☃.f);
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
/*     */   public void a(int ☃, int i, int j) {
/* 137 */     this.a += ☃;
/* 138 */     this.b += i;
/* 139 */     this.c += j;
/* 140 */     this.d += ☃;
/* 141 */     this.e += i;
/* 142 */     this.f += j;
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
/*     */   public boolean b(df ☃) {
/* 155 */     return (☃.n() >= this.a && ☃.n() <= this.d && ☃.p() >= this.c && ☃.p() <= this.f && ☃.o() >= this.b && ☃.o() <= this.e);
/*     */   }
/*     */   
/*     */   public df b() {
/* 159 */     return new df(this.d - this.a, this.e - this.b, this.f - this.c);
/*     */   }
/*     */   
/*     */   public int c() {
/* 163 */     return this.d - this.a + 1;
/*     */   }
/*     */   
/*     */   public int d() {
/* 167 */     return this.e - this.b + 1;
/*     */   }
/*     */   
/*     */   public int e() {
/* 171 */     return this.f - this.c + 1;
/*     */   }
/*     */   
/*     */   public df f() {
/* 175 */     return new cj(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 180 */     return Objects.toStringHelper(this).add("x0", this.a).add("y0", this.b).add("z0", this.c).add("x1", this.d).add("y1", this.e).add("z1", this.f).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ds g() {
/* 191 */     return new ds(new int[] { this.a, this.b, this.c, this.d, this.e, this.f });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */