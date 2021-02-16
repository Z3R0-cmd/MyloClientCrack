/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aob
/*     */   implements amv
/*     */ {
/*     */   private Random h;
/*     */   private arc i;
/*     */   private arc j;
/*     */   private arc k;
/*     */   public arc a;
/*     */   public arc b;
/*     */   private adm l;
/*     */   private double[] m;
/*     */   private ady[] n;
/*     */   double[] c;
/*     */   double[] d;
/*     */   double[] e;
/*     */   double[] f;
/*     */   double[] g;
/*     */   
/*     */   public aob(adm ☃, long l) {
/*  35 */     this.l = ☃;
/*     */     
/*  37 */     this.h = new Random(l);
/*  38 */     this.i = new arc(this.h, 16);
/*  39 */     this.j = new arc(this.h, 16);
/*  40 */     this.k = new arc(this.h, 8);
/*     */     
/*  42 */     this.a = new arc(this.h, 10);
/*  43 */     this.b = new arc(this.h, 16);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, ans ans1) {
/*  49 */     int j = 2;
/*     */     
/*  51 */     int k = j + 1;
/*  52 */     int m = 33;
/*  53 */     int n = j + 1;
/*  54 */     this.m = a(this.m, ☃ * j, 0, i * j, k, m, n);
/*     */     
/*  56 */     for (int i1 = 0; i1 < j; i1++) {
/*  57 */       for (int i2 = 0; i2 < j; i2++) {
/*  58 */         for (int i3 = 0; i3 < 32; i3++) {
/*  59 */           double d1 = 0.25D;
/*  60 */           double d2 = this.m[((i1 + 0) * n + i2 + 0) * m + i3 + 0];
/*  61 */           double d3 = this.m[((i1 + 0) * n + i2 + 1) * m + i3 + 0];
/*  62 */           double d4 = this.m[((i1 + 1) * n + i2 + 0) * m + i3 + 0];
/*  63 */           double d5 = this.m[((i1 + 1) * n + i2 + 1) * m + i3 + 0];
/*     */           
/*  65 */           double d6 = (this.m[((i1 + 0) * n + i2 + 0) * m + i3 + 1] - d2) * d1;
/*  66 */           double d7 = (this.m[((i1 + 0) * n + i2 + 1) * m + i3 + 1] - d3) * d1;
/*  67 */           double d8 = (this.m[((i1 + 1) * n + i2 + 0) * m + i3 + 1] - d4) * d1;
/*  68 */           double d9 = (this.m[((i1 + 1) * n + i2 + 1) * m + i3 + 1] - d5) * d1;
/*     */           
/*  70 */           for (int i4 = 0; i4 < 4; i4++) {
/*  71 */             double d10 = 0.125D;
/*     */             
/*  73 */             double d11 = d2;
/*  74 */             double d12 = d3;
/*  75 */             double d13 = (d4 - d2) * d10;
/*  76 */             double d14 = (d5 - d3) * d10;
/*     */             
/*  78 */             for (int i5 = 0; i5 < 8; i5++) {
/*  79 */               double d15 = 0.125D;
/*     */               
/*  81 */               double d16 = d11;
/*  82 */               double d17 = (d12 - d11) * d15;
/*  83 */               for (int i6 = 0; i6 < 8; i6++) {
/*  84 */                 alz alz = null;
/*  85 */                 if (d16 > 0.0D) {
/*  86 */                   alz = afi.bH.Q();
/*     */                 }
/*     */                 
/*  89 */                 int i7 = i5 + i1 * 8;
/*  90 */                 int i8 = i4 + i3 * 4;
/*  91 */                 int i9 = i6 + i2 * 8;
/*  92 */                 ans1.a(i7, i8, i9, alz);
/*  93 */                 d16 += d17;
/*     */               } 
/*  95 */               d11 += d13;
/*  96 */               d12 += d14;
/*     */             } 
/*     */             
/*  99 */             d2 += d6;
/* 100 */             d3 += d7;
/* 101 */             d4 += d8;
/* 102 */             d5 += d9;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(ans ☃) {
/* 110 */     for (int i = 0; i < 16; i++) {
/* 111 */       for (int j = 0; j < 16; j++) {
/* 112 */         int k = 1;
/* 113 */         int m = -1;
/*     */         
/* 115 */         alz alz1 = afi.bH.Q();
/* 116 */         alz alz2 = afi.bH.Q();
/*     */         
/* 118 */         for (int n = 127; n >= 0; n--) {
/* 119 */           alz alz = ☃.a(i, n, j);
/* 120 */           if (alz.c().t() == arm.a) {
/* 121 */             m = -1;
/* 122 */           } else if (alz.c() == afi.b) {
/* 123 */             if (m == -1) {
/* 124 */               if (k <= 0) {
/* 125 */                 alz1 = afi.a.Q();
/* 126 */                 alz2 = afi.bH.Q();
/*     */               } 
/*     */               
/* 129 */               m = k;
/* 130 */               if (n >= 0) {
/* 131 */                 ☃.a(i, n, j, alz1);
/*     */               } else {
/* 133 */                 ☃.a(i, n, j, alz2);
/*     */               } 
/* 135 */             } else if (m > 0) {
/* 136 */               m--;
/* 137 */               ☃.a(i, n, j, alz2);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
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
/*     */   public amy d(int ☃, int i) {
/* 154 */     this.h.setSeed(☃ * 341873128712L + i * 132897987541L);
/*     */     
/* 156 */     ans ans = new ans();
/* 157 */     this.n = this.l.v().b(this.n, ☃ * 16, i * 16, 16, 16);
/*     */     
/* 159 */     a(☃, i, ans);
/* 160 */     a(ans);
/*     */     
/* 162 */     amy amy = new amy(this.l, ans, ☃, i);
/* 163 */     byte[] arrayOfByte = amy.k();
/*     */     
/* 165 */     for (int j = 0; j < arrayOfByte.length; j++) {
/* 166 */       arrayOfByte[j] = (byte)(this.n[j]).az;
/*     */     }
/*     */     
/* 169 */     amy.b();
/*     */     
/* 171 */     return amy;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private double[] a(double[] ☃, int i, int j, int k, int m, int n, int i1) {
/* 177 */     if (☃ == null) {
/* 178 */       ☃ = new double[m * n * i1];
/*     */     }
/*     */     
/* 181 */     double d1 = 684.412D;
/* 182 */     double d2 = 684.412D;
/*     */     
/* 184 */     this.f = this.a.a(this.f, i, k, m, i1, 1.121D, 1.121D, 0.5D);
/* 185 */     this.g = this.b.a(this.g, i, k, m, i1, 200.0D, 200.0D, 0.5D);
/*     */     
/* 187 */     d1 *= 2.0D;
/*     */     
/* 189 */     this.c = this.k.a(this.c, i, j, k, m, n, i1, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
/* 190 */     this.d = this.i.a(this.d, i, j, k, m, n, i1, d1, d2, d1);
/* 191 */     this.e = this.j.a(this.e, i, j, k, m, n, i1, d1, d2, d1);
/*     */     
/* 193 */     int i2 = 0;
/*     */     
/* 195 */     for (int i3 = 0; i3 < m; i3++) {
/* 196 */       for (int i4 = 0; i4 < i1; i4++) {
/* 197 */         float f1 = (i3 + i) / 1.0F;
/* 198 */         float f2 = (i4 + k) / 1.0F;
/* 199 */         float f3 = 100.0F - ns.c(f1 * f1 + f2 * f2) * 8.0F;
/* 200 */         if (f3 > 80.0F) {
/* 201 */           f3 = 80.0F;
/*     */         }
/* 203 */         if (f3 < -100.0F) {
/* 204 */           f3 = -100.0F;
/*     */         }
/*     */         
/* 207 */         for (int i5 = 0; i5 < n; i5++) {
/* 208 */           double d3 = 0.0D;
/* 209 */           double d4 = this.d[i2] / 512.0D;
/* 210 */           double d5 = this.e[i2] / 512.0D;
/*     */           
/* 212 */           double d6 = (this.c[i2] / 10.0D + 1.0D) / 2.0D;
/* 213 */           if (d6 < 0.0D) {
/* 214 */             d3 = d4;
/* 215 */           } else if (d6 > 1.0D) {
/* 216 */             d3 = d5;
/*     */           } else {
/* 218 */             d3 = d4 + (d5 - d4) * d6;
/*     */           } 
/* 220 */           d3 -= 8.0D;
/*     */           
/* 222 */           d3 += f3;
/*     */           
/* 224 */           int i6 = 2;
/* 225 */           if (i5 > n / 2 - i6) {
/* 226 */             double d = ((i5 - n / 2 - i6) / 64.0F);
/* 227 */             d = ns.a(d, 0.0D, 1.0D);
/* 228 */             d3 = d3 * (1.0D - d) + -3000.0D * d;
/*     */           } 
/* 230 */           i6 = 8;
/* 231 */           if (i5 < i6) {
/* 232 */             double d = ((i6 - i5) / (i6 - 1.0F));
/* 233 */             d3 = d3 * (1.0D - d) + -30.0D * d;
/*     */           } 
/*     */           
/* 236 */           ☃[i2] = d3;
/* 237 */           i2++;
/*     */         } 
/*     */       } 
/*     */     } 
/* 241 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 246 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amv ☃, int i, int j) {
/* 251 */     agr.N = true;
/*     */     
/* 253 */     cj cj = new cj(i * 16, 0, j * 16);
/* 254 */     this.l.b(cj.a(16, 0, 16)).a(this.l, this.l.s, cj);
/*     */     
/* 256 */     agr.N = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(amv ☃, amy amy1, int i, int j) {
/* 261 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boolean ☃, nu nu1) {
/* 266 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 275 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 280 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 285 */     return "RandomLevelSource";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ady.c> a(pt ☃, cj cj1) {
/* 290 */     return this.l.b(cj1).a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cj a(adm ☃, String str, cj cj1) {
/* 295 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 300 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(amy ☃, int i, int j) {}
/*     */ 
/*     */   
/*     */   public amy a(cj ☃) {
/* 309 */     return d(☃.n() >> 4, ☃.p() >> 4);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */