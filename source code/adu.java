/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ public class adu
/*     */ {
/*     */   private final le a;
/*     */   private final Random b;
/*  24 */   private final nq<a> c = new nq<a>();
/*  25 */   private final List<Long> d = Lists.newArrayList();
/*     */   
/*     */   public adu(le ☃) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = new Random(☃.J());
/*     */   }
/*     */   
/*     */   public void a(pk ☃, float f) {
/*  33 */     if (this.a.t.q() == 1) {
/*  34 */       int i = ns.c(☃.s);
/*  35 */       int j = ns.c(☃.t) - 1;
/*  36 */       int k = ns.c(☃.u);
/*     */       
/*  38 */       int m = 1;
/*  39 */       int n = 0;
/*  40 */       for (int i1 = -2; i1 <= 2; i1++) {
/*  41 */         for (int i2 = -2; i2 <= 2; i2++) {
/*  42 */           for (int i3 = -1; i3 < 3; i3++) {
/*  43 */             int i4 = i + i2 * m + i1 * n;
/*  44 */             int i5 = j + i3;
/*  45 */             int i6 = k + i2 * n - i1 * m;
/*     */             
/*  47 */             boolean bool = (i3 < 0);
/*     */             
/*  49 */             this.a.a(new cj(i4, i5, i6), bool ? afi.Z.Q() : afi.a.Q());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  54 */       ☃.b(i, j, k, ☃.y, 0.0F);
/*  55 */       ☃.v = ☃.w = ☃.x = 0.0D;
/*     */       
/*     */       return;
/*     */     } 
/*  59 */     if (b(☃, f)) {
/*     */       return;
/*     */     }
/*     */     
/*  63 */     a(☃);
/*  64 */     b(☃, f);
/*     */   }
/*     */   
/*     */   public boolean b(pk ☃, float f) {
/*  68 */     int i = 128;
/*  69 */     double d = -1.0D;
/*     */     
/*  71 */     int j = ns.c(☃.s);
/*  72 */     int k = ns.c(☃.u);
/*  73 */     boolean bool = true;
/*     */     
/*  75 */     cj cj = cj.a;
/*     */     
/*  77 */     long l = adg.a(j, k);
/*  78 */     if (this.c.b(l)) {
/*  79 */       a a = this.c.a(l);
/*     */       
/*  81 */       d = 0.0D;
/*     */       
/*  83 */       cj = a;
/*  84 */       a.c = this.a.K();
/*  85 */       bool = false;
/*     */     } else {
/*  87 */       cj cj1 = new cj(☃);
/*     */       
/*  89 */       for (int m = -128; m <= 128; m++) {
/*  90 */         for (int n = -128; n <= 128; n++) {
/*  91 */           cj cj2 = cj1.a(m, this.a.V() - 1 - cj1.o(), n);
/*  92 */           while (cj2.o() >= 0) {
/*  93 */             cj cj3 = cj2.b();
/*     */             
/*  95 */             if (this.a.p(cj2).c() == afi.aY) {
/*     */               
/*  97 */               while (this.a.p(cj3 = cj2.b()).c() == afi.aY) {
/*  98 */                 cj2 = cj3;
/*     */               }
/*     */               
/* 101 */               double d1 = cj2.i(cj1);
/* 102 */               if (d < 0.0D || d1 < d) {
/* 103 */                 d = d1;
/* 104 */                 cj = cj2;
/*     */               } 
/*     */             } 
/* 107 */             cj2 = cj3;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 113 */     if (d >= 0.0D) {
/* 114 */       if (bool) {
/* 115 */         this.c.a(l, new a(this, cj, this.a.K()));
/* 116 */         this.d.add(Long.valueOf(l));
/*     */       } 
/*     */       
/* 119 */       double d1 = cj.n() + 0.5D;
/* 120 */       double d2 = cj.o() + 0.5D;
/* 121 */       double d3 = cj.p() + 0.5D;
/*     */       
/* 123 */       amd.b b = afi.aY.f(this.a, cj);
/* 124 */       boolean bool1 = (b.b().e().c() == cq.b.b);
/* 125 */       double d4 = (b.b().k() == cq.a.a) ? b.a().p() : b.a().n();
/* 126 */       d2 = (b.a().o() + 1) - (☃.aG()).b * b.e();
/*     */       
/* 128 */       if (bool1) {
/* 129 */         d4++;
/*     */       }
/*     */       
/* 132 */       if (b.b().k() == cq.a.a) {
/* 133 */         d3 = d4 + (1.0D - (☃.aG()).a) * b.d() * b.b().e().c().a();
/*     */       } else {
/* 135 */         d1 = d4 + (1.0D - (☃.aG()).a) * b.d() * b.b().e().c().a();
/*     */       } 
/*     */       
/* 138 */       float f1 = 0.0F;
/* 139 */       float f2 = 0.0F;
/* 140 */       float f3 = 0.0F;
/* 141 */       float f4 = 0.0F;
/*     */       
/* 143 */       if (b.b().d() == ☃.aH()) {
/* 144 */         f1 = 1.0F;
/* 145 */         f2 = 1.0F;
/* 146 */       } else if (b.b().d() == ☃.aH().d()) {
/* 147 */         f1 = -1.0F;
/* 148 */         f2 = -1.0F;
/* 149 */       } else if (b.b().d() == ☃.aH().e()) {
/* 150 */         f3 = 1.0F;
/* 151 */         f4 = -1.0F;
/*     */       } else {
/* 153 */         f3 = -1.0F;
/* 154 */         f4 = 1.0F;
/*     */       } 
/*     */       
/* 157 */       double d5 = ☃.v;
/* 158 */       double d6 = ☃.x;
/* 159 */       ☃.v = d5 * f1 + d6 * f4;
/* 160 */       ☃.x = d5 * f3 + d6 * f2;
/* 161 */       ☃.y = f - (☃.aH().d().b() * 90) + (b.b().b() * 90);
/*     */       
/* 163 */       ☃.b(d1, d2, d3, ☃.y, ☃.z);
/* 164 */       return true;
/*     */     } 
/*     */     
/* 167 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(pk ☃) {
/* 175 */     int i = 16;
/* 176 */     double d = -1.0D;
/*     */     
/* 178 */     int j = ns.c(☃.s);
/* 179 */     int k = ns.c(☃.t);
/* 180 */     int m = ns.c(☃.u);
/*     */     
/* 182 */     int n = j;
/* 183 */     int i1 = k;
/* 184 */     int i2 = m;
/* 185 */     int i3 = 0;
/*     */     
/* 187 */     int i4 = this.b.nextInt(4);
/*     */     
/* 189 */     cj.a a = new cj.a(); int i5;
/* 190 */     for (i5 = j - i; i5 <= j + i; i5++) {
/* 191 */       double d1 = i5 + 0.5D - ☃.s;
/* 192 */       for (int i12 = m - i; i12 <= m + i; i12++) {
/* 193 */         double d2 = i12 + 0.5D - ☃.u; int i13;
/* 194 */         label174: for (i13 = this.a.V() - 1; i13 >= 0; i13--) {
/* 195 */           if (this.a.d(a.c(i5, i13, i12))) {
/* 196 */             while (i13 > 0 && this.a.d(a.c(i5, i13 - 1, i12))) {
/* 197 */               i13--;
/*     */             }
/*     */             
/* 200 */             for (int i14 = i4; i14 < i4 + 4; i14++) {
/* 201 */               int i15 = i14 % 2;
/* 202 */               int i16 = 1 - i15;
/*     */               
/* 204 */               if (i14 % 4 >= 2) {
/* 205 */                 i15 = -i15;
/* 206 */                 i16 = -i16;
/*     */               } 
/*     */               
/* 209 */               for (int i17 = 0; i17 < 3; i17++) {
/* 210 */                 for (int i18 = 0; i18 < 4; i18++) {
/* 211 */                   for (int i19 = -1; i19 < 4; i19++) {
/* 212 */                     int i20 = i5 + (i18 - 1) * i15 + i17 * i16;
/* 213 */                     int i21 = i13 + i19;
/* 214 */                     int i22 = i12 + (i18 - 1) * i16 - i17 * i15;
/*     */                     
/* 216 */                     a.c(i20, i21, i22);
/* 217 */                     if (i19 < 0 && !this.a.p(a).c().t().a()) {
/*     */                       continue label174;
/*     */                     }
/* 220 */                     if (i19 >= 0 && !this.a.d(a)) {
/*     */                       continue label174;
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */               
/* 227 */               double d3 = i13 + 0.5D - ☃.t;
/* 228 */               double d4 = d1 * d1 + d3 * d3 + d2 * d2;
/* 229 */               if (d < 0.0D || d4 < d) {
/* 230 */                 d = d4;
/* 231 */                 n = i5;
/* 232 */                 i1 = i13;
/* 233 */                 i2 = i12;
/* 234 */                 i3 = i14 % 4;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 241 */     if (d < 0.0D) {
/* 242 */       for (i5 = j - i; i5 <= j + i; i5++) {
/* 243 */         double d1 = i5 + 0.5D - ☃.s;
/* 244 */         for (int i12 = m - i; i12 <= m + i; i12++) {
/* 245 */           double d2 = i12 + 0.5D - ☃.u; int i13;
/* 246 */           label171: for (i13 = this.a.V() - 1; i13 >= 0; i13--) {
/* 247 */             if (this.a.d(a.c(i5, i13, i12))) {
/* 248 */               while (i13 > 0 && this.a.d(a.c(i5, i13 - 1, i12))) {
/* 249 */                 i13--;
/*     */               }
/*     */               
/* 252 */               for (int i14 = i4; i14 < i4 + 2; i14++) {
/* 253 */                 int i15 = i14 % 2;
/* 254 */                 int i16 = 1 - i15;
/* 255 */                 for (int i17 = 0; i17 < 4; i17++) {
/* 256 */                   for (int i18 = -1; i18 < 4; i18++) {
/* 257 */                     int i19 = i5 + (i17 - 1) * i15;
/* 258 */                     int i20 = i13 + i18;
/* 259 */                     int i21 = i12 + (i17 - 1) * i16;
/*     */                     
/* 261 */                     a.c(i19, i20, i21);
/* 262 */                     if (i18 < 0 && !this.a.p(a).c().t().a()) {
/*     */                       continue label171;
/*     */                     }
/* 265 */                     if (i18 >= 0 && !this.a.d(a)) {
/*     */                       continue label171;
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */                 
/* 271 */                 double d3 = i13 + 0.5D - ☃.t;
/* 272 */                 double d4 = d1 * d1 + d3 * d3 + d2 * d2;
/* 273 */                 if (d < 0.0D || d4 < d) {
/* 274 */                   d = d4;
/* 275 */                   n = i5;
/* 276 */                   i1 = i13;
/* 277 */                   i2 = i12;
/* 278 */                   i3 = i14 % 2;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 287 */     i5 = i3;
/*     */     
/* 289 */     int i6 = n;
/* 290 */     int i7 = i1;
/* 291 */     int i8 = i2;
/*     */     
/* 293 */     int i9 = i5 % 2;
/* 294 */     int i10 = 1 - i9;
/*     */     
/* 296 */     if (i5 % 4 >= 2) {
/* 297 */       i9 = -i9;
/* 298 */       i10 = -i10;
/*     */     } 
/*     */     
/* 301 */     if (d < 0.0D) {
/* 302 */       i1 = ns.a(i1, 70, this.a.V() - 10);
/* 303 */       i7 = i1;
/*     */       
/* 305 */       for (int i12 = -1; i12 <= 1; i12++) {
/* 306 */         for (int i13 = 1; i13 < 3; i13++) {
/* 307 */           for (int i14 = -1; i14 < 3; i14++) {
/* 308 */             int i15 = i6 + (i13 - 1) * i9 + i12 * i10;
/* 309 */             int i16 = i7 + i14;
/* 310 */             int i17 = i8 + (i13 - 1) * i10 - i12 * i9;
/*     */             
/* 312 */             boolean bool = (i14 < 0);
/*     */             
/* 314 */             this.a.a(new cj(i15, i16, i17), bool ? afi.Z.Q() : afi.a.Q());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 320 */     alz alz = afi.aY.Q().a(aip.a, (i9 != 0) ? cq.a.a : cq.a.c);
/* 321 */     for (int i11 = 0; i11 < 4; i11++) {
/* 322 */       int i12; for (i12 = 0; i12 < 4; i12++) {
/* 323 */         for (int i13 = -1; i13 < 4; i13++) {
/* 324 */           int i14 = i6 + (i12 - 1) * i9;
/* 325 */           int i15 = i7 + i13;
/* 326 */           int i16 = i8 + (i12 - 1) * i10;
/*     */           
/* 328 */           boolean bool = (i12 == 0 || i12 == 3 || i13 == -1 || i13 == 3);
/* 329 */           this.a.a(new cj(i14, i15, i16), bool ? afi.Z.Q() : alz, 2);
/*     */         } 
/*     */       } 
/*     */       
/* 333 */       for (i12 = 0; i12 < 4; i12++) {
/* 334 */         for (int i13 = -1; i13 < 4; i13++) {
/* 335 */           int i14 = i6 + (i12 - 1) * i9;
/* 336 */           int i15 = i7 + i13;
/* 337 */           int i16 = i8 + (i12 - 1) * i10;
/*     */           
/* 339 */           cj cj = new cj(i14, i15, i16);
/* 340 */           this.a.c(cj, this.a.p(cj).c());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 345 */     return true;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 349 */     if (☃ % 100L == 0L) {
/* 350 */       Iterator<Long> iterator = this.d.iterator();
/* 351 */       long l = ☃ - 300L;
/*     */       
/* 353 */       while (iterator.hasNext()) {
/* 354 */         Long long_ = iterator.next();
/* 355 */         a a = this.c.a(long_.longValue());
/*     */         
/* 357 */         if (a == null || a.c < l) {
/* 358 */           iterator.remove();
/* 359 */           this.c.d(long_.longValue());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public class a extends cj {
/*     */     public long c;
/*     */     
/*     */     public a(adu this$0, cj ☃, long l) {
/* 369 */       super(☃.n(), ☃.o(), ☃.p());
/* 370 */       this.c = l;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */