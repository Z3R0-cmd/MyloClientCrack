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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class n
/*     */   extends aqt
/*     */ {
/* 226 */   protected int h = -1;
/*     */   
/*     */   private int a;
/*     */   
/*     */   private boolean b;
/*     */   
/*     */   public n() {}
/*     */   
/*     */   protected n(aqw.k ☃, int i) {
/* 235 */     super(i);
/* 236 */     if (☃ != null) {
/* 237 */       this.b = ☃.b;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dn ☃) {
/* 243 */     ☃.a("HPos", this.h);
/* 244 */     ☃.a("VCount", this.a);
/* 245 */     ☃.a("Desert", this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {
/* 250 */     this.h = ☃.f("HPos");
/* 251 */     this.a = ☃.f("VCount");
/* 252 */     this.b = ☃.n("Desert");
/*     */   }
/*     */   
/*     */   protected aqt a(aqw.k ☃, List<aqt> list, Random random, int i, int j) {
/* 256 */     if (this.m != null) {
/* 257 */       switch (aqw.null.a[this.m.ordinal()]) {
/*     */         case 1:
/* 259 */           return aqw.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*     */         case 2:
/* 261 */           return aqw.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*     */         case 3:
/* 263 */           return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*     */         case 4:
/* 265 */           return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*     */       } 
/*     */     }
/* 268 */     return null;
/*     */   }
/*     */   
/*     */   protected aqt b(aqw.k ☃, List<aqt> list, Random random, int i, int j) {
/* 272 */     if (this.m != null) {
/* 273 */       switch (aqw.null.a[this.m.ordinal()]) {
/*     */         case 1:
/* 275 */           return aqw.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*     */         case 2:
/* 277 */           return aqw.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*     */         case 3:
/* 279 */           return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*     */         case 4:
/* 281 */           return aqw.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*     */       } 
/*     */     }
/* 284 */     return null;
/*     */   }
/*     */   
/*     */   protected int b(adm ☃, aqe aqe1) {
/* 288 */     int i = 0;
/* 289 */     int j = 0;
/* 290 */     cj.a a = new cj.a();
/* 291 */     for (int k = this.l.c; k <= this.l.f; k++) {
/* 292 */       for (int m = this.l.a; m <= this.l.d; m++) {
/* 293 */         a.c(m, 64, k);
/* 294 */         if (aqe1.b(a)) {
/* 295 */           i += Math.max(☃.r(a).o(), ☃.t.i());
/* 296 */           j++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     if (j == 0) {
/* 302 */       return -1;
/*     */     }
/* 304 */     return i / j;
/*     */   }
/*     */   
/*     */   protected static boolean a(aqe ☃) {
/* 308 */     return (☃ != null && ☃.b > 10);
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
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m) {
/* 323 */     if (this.a >= m) {
/*     */       return;
/*     */     }
/*     */     
/* 327 */     int i1 = this.a;
/* 328 */     int i2 = a(i + i1, k);
/* 329 */     int i3 = d(j);
/* 330 */     int i4 = b(i + i1, k);
/*     */     
/* 332 */     for (; i1 < m && aqe1.b(new cj(i2, i3, i4)); i1++) {
/* 333 */       this.a++;
/*     */       
/* 335 */       wi wi = new wi(☃);
/* 336 */       wi.b(i2 + 0.5D, i3, i4 + 0.5D, 0.0F, 0.0F);
/* 337 */       wi.a(☃.E(new cj(wi)), (pu)null);
/* 338 */       wi.r(c(i1, wi.cl()));
/* 339 */       ☃.d(wi);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int c(int ☃, int i) {
/* 348 */     return i;
/*     */   }
/*     */   
/*     */   protected alz a(alz ☃) {
/* 352 */     if (this.b) {
/* 353 */       if (☃.c() == afi.r || ☃.c() == afi.s)
/* 354 */         return afi.A.Q(); 
/* 355 */       if (☃.c() == afi.e)
/* 356 */         return afi.A.a(aji.a.a.a()); 
/* 357 */       if (☃.c() == afi.f)
/* 358 */         return afi.A.a(aji.a.c.a()); 
/* 359 */       if (☃.c() == afi.ad)
/* 360 */         return afi.bO.Q().a(aju.a, ☃.b(aju.a)); 
/* 361 */       if (☃.c() == afi.aw)
/* 362 */         return afi.bO.Q().a(aju.a, ☃.b(aju.a)); 
/* 363 */       if (☃.c() == afi.n) {
/* 364 */         return afi.A.Q();
/*     */       }
/*     */     } 
/* 367 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, alz alz1, int i, int j, int k, aqe aqe1) {
/* 372 */     alz alz2 = a(alz1);
/* 373 */     super.a(☃, alz2, i, j, k, aqe1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int i1, int i2, alz alz1, alz alz2, boolean bool) {
/* 378 */     alz alz3 = a(alz1);
/* 379 */     alz alz4 = a(alz2);
/* 380 */     super.a(☃, aqe1, i, j, k, m, i1, i2, alz3, alz4, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(adm ☃, alz alz1, int i, int j, int k, aqe aqe1) {
/* 385 */     alz alz2 = a(alz1);
/* 386 */     super.b(☃, alz2, i, j, k, aqe1);
/*     */   }
/*     */   
/*     */   protected void a(boolean ☃) {
/* 390 */     this.b = ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqw$n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */