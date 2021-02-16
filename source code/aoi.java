/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoi
/*     */   extends aoh
/*     */ {
/*     */   private Random k;
/*     */   private adm l;
/*     */   
/*     */   static class a
/*     */     extends cj
/*     */   {
/*     */     private final int c;
/*     */     
/*     */     public a(cj ☃, int i) {
/*  22 */       super(☃.n(), ☃.o(), ☃.p());
/*  23 */       this.c = i;
/*     */     }
/*     */     
/*     */     public int q() {
/*  27 */       return this.c;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  33 */   private cj m = cj.a;
/*     */   
/*     */   int a;
/*     */   int b;
/*  37 */   double c = 0.618D;
/*  38 */   double d = 0.381D;
/*  39 */   double e = 1.0D;
/*  40 */   double f = 1.0D;
/*  41 */   int g = 1;
/*  42 */   int h = 12;
/*  43 */   int i = 4;
/*     */   
/*     */   List<a> j;
/*     */   
/*     */   public aoi(boolean ☃) {
/*  48 */     super(☃);
/*     */   }
/*     */   
/*     */   void a() {
/*  52 */     this.b = (int)(this.a * this.c);
/*  53 */     if (this.b >= this.a) {
/*  54 */       this.b = this.a - 1;
/*     */     }
/*     */ 
/*     */     
/*  58 */     int ☃ = (int)(1.382D + Math.pow(this.f * this.a / 13.0D, 2.0D));
/*  59 */     if (☃ < 1) {
/*  60 */       ☃ = 1;
/*     */     }
/*     */     
/*  63 */     int i = this.m.o() + this.b;
/*  64 */     int j = this.a - this.i;
/*     */     
/*  66 */     this.j = Lists.newArrayList();
/*  67 */     this.j.add(new a(this.m.b(j), i));
/*     */     
/*  69 */     for (; j >= 0; j--) {
/*  70 */       float f = a(j);
/*  71 */       if (f >= 0.0F)
/*     */       {
/*     */ 
/*     */         
/*  75 */         for (int k = 0; k < ☃; k++) {
/*  76 */           double d1 = this.e * f * (this.k.nextFloat() + 0.328D);
/*  77 */           double d2 = (this.k.nextFloat() * 2.0F) * Math.PI;
/*     */           
/*  79 */           double d3 = d1 * Math.sin(d2) + 0.5D;
/*  80 */           double d4 = d1 * Math.cos(d2) + 0.5D;
/*     */           
/*  82 */           cj cj1 = this.m.a(d3, (j - 1), d4);
/*  83 */           cj cj2 = cj1.b(this.i);
/*     */ 
/*     */           
/*  86 */           if (a(cj1, cj2) == -1) {
/*     */             
/*  88 */             int m = this.m.n() - cj1.n();
/*  89 */             int n = this.m.p() - cj1.p();
/*     */             
/*  91 */             double d = cj1.o() - Math.sqrt((m * m + n * n)) * this.d;
/*  92 */             int i1 = (d > i) ? i : (int)d;
/*  93 */             cj cj3 = new cj(this.m.n(), i1, this.m.p());
/*     */ 
/*     */             
/*  96 */             if (a(cj3, cj1) == -1)
/*     */             {
/*  98 */               this.j.add(new a(cj1, cj3.o()));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   void a(cj ☃, float f, alz alz1) {
/* 107 */     int i = (int)(f + 0.618D);
/*     */     
/* 109 */     for (int j = -i; j <= i; j++) {
/* 110 */       for (int k = -i; k <= i; k++) {
/* 111 */         if (Math.pow(Math.abs(j) + 0.5D, 2.0D) + Math.pow(Math.abs(k) + 0.5D, 2.0D) <= (f * f)) {
/* 112 */           cj cj1 = ☃.a(j, 0, k);
/*     */ 
/*     */ 
/*     */           
/* 116 */           arm arm = this.l.p(cj1).c().t();
/* 117 */           if (arm == arm.a || arm == arm.j) {
/* 118 */             a(this.l, cj1, alz1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   float a(int ☃) {
/* 127 */     if (☃ < this.a * 0.3F) {
/* 128 */       return -1.0F;
/*     */     }
/*     */     
/* 131 */     float f1 = this.a / 2.0F;
/* 132 */     float f2 = f1 - ☃;
/*     */     
/* 134 */     float f3 = ns.c(f1 * f1 - f2 * f2);
/* 135 */     if (f2 == 0.0F) {
/* 136 */       f3 = f1;
/* 137 */     } else if (Math.abs(f2) >= f1) {
/* 138 */       return 0.0F;
/*     */     } 
/*     */     
/* 141 */     return f3 * 0.5F;
/*     */   }
/*     */   
/*     */   float b(int ☃) {
/* 145 */     if (☃ < 0 || ☃ >= this.i) {
/* 146 */       return -1.0F;
/*     */     }
/* 148 */     if (☃ == 0 || ☃ == this.i - 1) {
/* 149 */       return 2.0F;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     return 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   void a(cj ☃) {
/* 163 */     for (int i = 0; i < this.i; i++) {
/* 164 */       a(☃.b(i), b(i), afi.t.Q().a(ahs.b, Boolean.valueOf(false)));
/*     */     }
/*     */   }
/*     */   
/*     */   void a(cj ☃, cj cj1, afh afh1) {
/* 169 */     cj cj2 = cj1.a(-☃.n(), -☃.o(), -☃.p());
/*     */     
/* 171 */     int i = b(cj2);
/*     */     
/* 173 */     float f1 = cj2.n() / i;
/* 174 */     float f2 = cj2.o() / i;
/* 175 */     float f3 = cj2.p() / i;
/*     */     
/* 177 */     for (int j = 0; j <= i; j++) {
/* 178 */       cj cj3 = ☃.a((0.5F + j * f1), (0.5F + j * f2), (0.5F + j * f3));
/* 179 */       ahw.a a = b(☃, cj3);
/*     */       
/* 181 */       a(this.l, cj3, afh1.Q().a(ahw.a, a));
/*     */     } 
/*     */   }
/*     */   
/*     */   private int b(cj ☃) {
/* 186 */     int i = ns.a(☃.n());
/* 187 */     int j = ns.a(☃.o());
/* 188 */     int k = ns.a(☃.p());
/*     */     
/* 190 */     if (k > i && k > j)
/* 191 */       return k; 
/* 192 */     if (j > i) {
/* 193 */       return j;
/*     */     }
/*     */     
/* 196 */     return i;
/*     */   }
/*     */   
/*     */   private ahw.a b(cj ☃, cj cj1) {
/* 200 */     ahw.a a = ahw.a.b;
/* 201 */     int i = Math.abs(cj1.n() - ☃.n());
/* 202 */     int j = Math.abs(cj1.p() - ☃.p());
/* 203 */     int k = Math.max(i, j);
/*     */     
/* 205 */     if (k > 0) {
/* 206 */       if (i == k) {
/* 207 */         a = ahw.a.a;
/* 208 */       } else if (j == k) {
/* 209 */         a = ahw.a.c;
/*     */       } 
/*     */     }
/* 212 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   void b() {
/* 217 */     for (Iterator<a> ☃ = this.j.iterator(); ☃.hasNext(); ) { a a = ☃.next();
/* 218 */       a(a); }
/*     */   
/*     */   }
/*     */   
/*     */   boolean c(int ☃) {
/* 223 */     return (☃ >= this.a * 0.2D);
/*     */   }
/*     */ 
/*     */   
/*     */   void c() {
/* 228 */     cj ☃ = this.m;
/* 229 */     cj cj1 = this.m.b(this.b);
/* 230 */     afh afh = afi.r;
/*     */     
/* 232 */     a(☃, cj1, afh);
/* 233 */     if (this.g == 2) {
/* 234 */       a(☃.f(), cj1.f(), afh);
/* 235 */       a(☃.f().d(), cj1.f().d(), afh);
/* 236 */       a(☃.d(), cj1.d(), afh);
/*     */     } 
/*     */   }
/*     */   
/*     */   void d() {
/* 241 */     for (Iterator<a> ☃ = this.j.iterator(); ☃.hasNext(); ) { a a = ☃.next();
/* 242 */       int i = a.q();
/* 243 */       cj cj1 = new cj(this.m.n(), i, this.m.p());
/*     */       
/* 245 */       if (!cj1.equals(a) && 
/* 246 */         c(i - this.m.o())) {
/* 247 */         a(cj1, a, afi.r);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   int a(cj ☃, cj cj1) {
/* 254 */     cj cj2 = cj1.a(-☃.n(), -☃.o(), -☃.p());
/*     */     
/* 256 */     int i = b(cj2);
/*     */     
/* 258 */     float f1 = cj2.n() / i;
/* 259 */     float f2 = cj2.o() / i;
/* 260 */     float f3 = cj2.p() / i;
/*     */ 
/*     */     
/* 263 */     if (i == 0) {
/* 264 */       return -1;
/*     */     }
/*     */     
/* 267 */     for (int j = 0; j <= i; j++) {
/* 268 */       cj cj3 = ☃.a((0.5F + j * f1), (0.5F + j * f2), (0.5F + j * f3));
/*     */       
/* 270 */       if (!a(this.l.p(cj3).c())) {
/* 271 */         return j;
/*     */       }
/*     */     } 
/*     */     
/* 275 */     return -1;
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
/*     */   public void e() {
/* 295 */     this.i = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/* 300 */     this.l = ☃;
/* 301 */     this.m = cj1;
/*     */     
/* 303 */     this.k = new Random(random.nextLong());
/*     */     
/* 305 */     if (this.a == 0) {
/* 306 */       this.a = 5 + this.k.nextInt(this.h);
/*     */     }
/*     */     
/* 309 */     if (!f()) {
/* 310 */       return false;
/*     */     }
/*     */     
/* 313 */     a();
/* 314 */     b();
/* 315 */     c();
/* 316 */     d();
/*     */     
/* 318 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean f() {
/* 324 */     afh ☃ = this.l.p(this.m.b()).c();
/* 325 */     if (☃ != afi.d && ☃ != afi.c && ☃ != afi.ak) {
/* 326 */       return false;
/*     */     }
/*     */     
/* 329 */     int i = a(this.m, this.m.b(this.a - 1));
/*     */ 
/*     */     
/* 332 */     if (i == -1) {
/* 333 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 337 */     if (i < 6) {
/* 338 */       return false;
/*     */     }
/*     */     
/* 341 */     this.a = i;
/* 342 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */