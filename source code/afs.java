/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afs
/*     */   extends afc
/*     */ {
/*  33 */   public static final aml a = aml.a("facing", cq.c.a);
/*     */ 
/*     */ 
/*     */   
/*     */   public final int b;
/*     */ 
/*     */ 
/*     */   
/*     */   protected afs(int ☃) {
/*  42 */     super(arm.d);
/*  43 */     j(this.M.b().a(a, cq.c));
/*  44 */     this.b = ☃;
/*  45 */     a(yz.c);
/*  46 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  61 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  66 */     if (☃.p(cj1.c()).c() == this) {
/*  67 */       a(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
/*  68 */     } else if (☃.p(cj1.d()).c() == this) {
/*  69 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
/*  70 */     } else if (☃.p(cj1.e()).c() == this) {
/*  71 */       a(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  72 */     } else if (☃.p(cj1.f()).c() == this) {
/*  73 */       a(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
/*     */     } else {
/*  75 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  81 */     e(☃, cj1, alz1);
/*     */     
/*  83 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  84 */       cj cj2 = cj1.a(cq);
/*  85 */       alz alz2 = ☃.p(cj2);
/*  86 */       if (alz2.c() == this) {
/*  87 */         e(☃, cj2, alz2);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  94 */     return Q().a(a, pr1.aP());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  99 */     cq cq = cq.b(ns.c((pr1.y * 4.0F / 360.0F) + 0.5D) & 0x3).d();
/* 100 */     alz1 = alz1.a(a, cq);
/*     */     
/* 102 */     cj cj2 = cj1.c();
/* 103 */     cj cj3 = cj1.d();
/* 104 */     cj cj4 = cj1.e();
/* 105 */     cj cj5 = cj1.f();
/*     */     
/* 107 */     boolean bool1 = (this == ☃.p(cj2).c());
/* 108 */     boolean bool2 = (this == ☃.p(cj3).c());
/* 109 */     boolean bool3 = (this == ☃.p(cj4).c());
/* 110 */     boolean bool4 = (this == ☃.p(cj5).c());
/*     */     
/* 112 */     if (bool1 || bool2 || bool3 || bool4) {
/* 113 */       if (cq.k() == cq.a.a && (bool1 || bool2)) {
/* 114 */         if (bool1) {
/* 115 */           ☃.a(cj2, alz1, 3);
/*     */         } else {
/* 117 */           ☃.a(cj3, alz1, 3);
/*     */         } 
/* 119 */         ☃.a(cj1, alz1, 3);
/* 120 */       } else if (cq.k() == cq.a.c && (bool3 || bool4)) {
/* 121 */         if (bool3) {
/* 122 */           ☃.a(cj4, alz1, 3);
/*     */         } else {
/* 124 */           ☃.a(cj5, alz1, 3);
/*     */         } 
/* 126 */         ☃.a(cj1, alz1, 3);
/*     */       } 
/*     */     } else {
/* 129 */       ☃.a(cj1, alz1, 3);
/*     */     } 
/*     */     
/* 132 */     if (zx1.s()) {
/* 133 */       akw akw = ☃.s(cj1);
/* 134 */       if (akw instanceof aky) {
/* 135 */         ((aky)akw).a(zx1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public alz e(adm ☃, cj cj1, alz alz1) {
/* 142 */     if (☃.D) {
/* 143 */       return alz1;
/*     */     }
/*     */     
/* 146 */     alz alz2 = ☃.p(cj1.c());
/* 147 */     alz alz3 = ☃.p(cj1.d());
/* 148 */     alz alz4 = ☃.p(cj1.e());
/* 149 */     alz alz5 = ☃.p(cj1.f());
/*     */ 
/*     */     
/* 152 */     cq cq = alz1.<cq>b(a);
/*     */     
/* 154 */     afh afh1 = alz2.c();
/* 155 */     afh afh2 = alz3.c();
/* 156 */     afh afh3 = alz4.c();
/* 157 */     afh afh4 = alz5.c();
/* 158 */     if (afh1 == this || afh2 == this) {
/* 159 */       cq cq1; cj cj2 = (afh1 == this) ? cj1.c() : cj1.d();
/* 160 */       alz alz6 = ☃.p(cj2.e());
/* 161 */       alz alz7 = ☃.p(cj2.f());
/*     */       
/* 163 */       cq = cq.f;
/*     */ 
/*     */       
/* 166 */       if (afh1 == this) {
/* 167 */         cq1 = alz2.<cq>b(a);
/*     */       } else {
/* 169 */         cq1 = alz3.<cq>b(a);
/*     */       } 
/* 171 */       if (cq1 == cq.e) {
/* 172 */         cq = cq.e;
/*     */       }
/*     */       
/* 175 */       afh afh5 = alz6.c();
/* 176 */       afh afh6 = alz7.c();
/* 177 */       if ((afh3.o() || afh5.o()) && !afh4.o() && !afh6.o()) {
/* 178 */         cq = cq.f;
/*     */       }
/* 180 */       if ((afh4.o() || afh6.o()) && !afh3.o() && !afh5.o()) {
/* 181 */         cq = cq.e;
/*     */       }
/*     */     } else {
/* 184 */       boolean bool1 = afh1.o();
/* 185 */       boolean bool2 = afh2.o();
/* 186 */       if (afh3 == this || afh4 == this) {
/* 187 */         cq cq1; cj cj2 = (afh3 == this) ? cj1.e() : cj1.f();
/* 188 */         alz alz6 = ☃.p(cj2.c());
/* 189 */         alz alz7 = ☃.p(cj2.d());
/*     */         
/* 191 */         cq = cq.d;
/*     */         
/* 193 */         if (afh3 == this) {
/* 194 */           cq1 = alz4.<cq>b(a);
/*     */         } else {
/* 196 */           cq1 = alz5.<cq>b(a);
/*     */         } 
/* 198 */         if (cq1 == cq.c) {
/* 199 */           cq = cq.c;
/*     */         }
/*     */         
/* 202 */         afh afh5 = alz6.c();
/* 203 */         afh afh6 = alz7.c();
/* 204 */         if ((bool1 || afh5.o()) && !bool2 && !afh6.o()) {
/* 205 */           cq = cq.d;
/*     */         }
/* 207 */         if ((bool2 || afh6.o()) && !bool1 && !afh5.o()) {
/* 208 */           cq = cq.c;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 213 */     alz1 = alz1.a(a, cq);
/* 214 */     ☃.a(cj1, alz1, 3);
/* 215 */     return alz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz f(adm ☃, cj cj1, alz alz1) {
/* 220 */     cq cq1 = null;
/* 221 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 222 */       alz alz2 = ☃.p(cj1.a(cq));
/* 223 */       if (alz2.c() == this) {
/* 224 */         return alz1;
/*     */       }
/* 226 */       if (alz2.c().o()) {
/* 227 */         if (cq1 == null) {
/* 228 */           cq1 = cq; continue;
/*     */         } 
/* 230 */         cq1 = null;
/*     */         
/*     */         break;
/*     */       }  }
/*     */     
/* 235 */     if (cq1 != null) {
/* 236 */       return alz1.a(a, cq1.d());
/*     */     }
/*     */ 
/*     */     
/* 240 */     cq cq2 = alz1.<cq>b(a);
/* 241 */     if (☃.p(cj1.a(cq2)).c().o()) {
/* 242 */       cq2 = cq2.d();
/*     */     }
/* 244 */     if (☃.p(cj1.a(cq2)).c().o()) {
/* 245 */       cq2 = cq2.e();
/*     */     }
/* 247 */     if (☃.p(cj1.a(cq2)).c().o()) {
/* 248 */       cq2 = cq2.d();
/*     */     }
/*     */     
/* 251 */     return alz1.a(a, cq2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 257 */     int i = 0;
/*     */     
/* 259 */     cj cj2 = cj1.e();
/* 260 */     cj cj3 = cj1.f();
/* 261 */     cj cj4 = cj1.c();
/* 262 */     cj cj5 = cj1.d();
/*     */     
/* 264 */     if (☃.p(cj2).c() == this) {
/* 265 */       if (m(☃, cj2)) {
/* 266 */         return false;
/*     */       }
/* 268 */       i++;
/*     */     } 
/* 270 */     if (☃.p(cj3).c() == this) {
/* 271 */       if (m(☃, cj3)) {
/* 272 */         return false;
/*     */       }
/* 274 */       i++;
/*     */     } 
/* 276 */     if (☃.p(cj4).c() == this) {
/* 277 */       if (m(☃, cj4)) {
/* 278 */         return false;
/*     */       }
/* 280 */       i++;
/*     */     } 
/* 282 */     if (☃.p(cj5).c() == this) {
/* 283 */       if (m(☃, cj5)) {
/* 284 */         return false;
/*     */       }
/* 286 */       i++;
/*     */     } 
/*     */     
/* 289 */     if (i > 1) {
/* 290 */       return false;
/*     */     }
/*     */     
/* 293 */     return true;
/*     */   }
/*     */   
/*     */   private boolean m(adm ☃, cj cj1) {
/* 297 */     if (☃.p(cj1).c() != this) {
/* 298 */       return false;
/*     */     }
/*     */     
/* 301 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 302 */       if (☃.p(cj1.a(cq)).c() == this) {
/* 303 */         return true;
/*     */       } }
/*     */ 
/*     */     
/* 307 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 312 */     super.a(☃, cj1, alz1, afh1);
/*     */     
/* 314 */     akw akw = ☃.s(cj1);
/* 315 */     if (akw instanceof aky) {
/* 316 */       akw.E();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 322 */     akw akw = ☃.s(cj1);
/* 323 */     if (akw instanceof og) {
/* 324 */       oi.a(☃, cj1, (og)akw);
/*     */       
/* 326 */       ☃.e(cj1, this);
/*     */     } 
/* 328 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 333 */     if (☃.D) {
/* 334 */       return true;
/*     */     }
/* 336 */     oo oo = f(☃, cj1);
/*     */     
/* 338 */     if (oo != null) {
/* 339 */       wn1.a(oo);
/*     */       
/* 341 */       if (this.b == 0) {
/* 342 */         wn1.b(na.aa);
/* 343 */       } else if (this.b == 1) {
/* 344 */         wn1.b(na.U);
/*     */       } 
/*     */     } 
/*     */     
/* 348 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public oo f(adm ☃, cj cj1) {
/* 353 */     akw akw = ☃.s(cj1);
/* 354 */     if (!(akw instanceof aky)) {
/* 355 */       return null;
/*     */     }
/*     */     
/* 358 */     oo oo = (aky)akw;
/*     */     
/* 360 */     if (n(☃, cj1)) {
/* 361 */       return null;
/*     */     }
/*     */     
/* 364 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 365 */       cj cj2 = cj1.a(cq);
/* 366 */       afh afh = ☃.p(cj2).c();
/*     */       
/* 368 */       if (afh == this) {
/* 369 */         if (n(☃, cj2)) {
/* 370 */           return null;
/*     */         }
/*     */         
/* 373 */         akw akw1 = ☃.s(cj2);
/* 374 */         if (akw1 instanceof aky) {
/*     */           
/* 376 */           if (cq == cq.e || cq == cq.c) {
/* 377 */             oo = new of("container.chestDouble", (aky)akw1, oo); continue;
/*     */           } 
/* 379 */           oo = new of("container.chestDouble", oo, (aky)akw1);
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/* 384 */     return oo;
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 389 */     return new aky();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 394 */     return (this.b == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 399 */     if (!i()) {
/* 400 */       return 0;
/*     */     }
/*     */     
/* 403 */     int i = 0;
/* 404 */     akw akw = ☃.s(cj1);
/* 405 */     if (akw instanceof aky) {
/* 406 */       i = ((aky)akw).l;
/*     */     }
/* 408 */     return ns.a(i, 0, 15);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 413 */     if (cq1 == cq.b) {
/* 414 */       return a(☃, cj1, alz1, cq1);
/*     */     }
/* 416 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean n(adm ☃, cj cj1) {
/* 421 */     return (o(☃, cj1) || p(☃, cj1));
/*     */   }
/*     */   
/*     */   private boolean o(adm ☃, cj cj1) {
/* 425 */     return ☃.p(cj1.a()).c().v();
/*     */   }
/*     */   
/*     */   private boolean p(adm ☃, cj cj1) {
/* 429 */     for (Iterator<pk> iterator = ☃.<ts>a(ts.class, new aug(cj1.n(), (cj1.o() + 1), cj1.p(), (cj1.n() + 1), (cj1.o() + 2), (cj1.p() + 1))).iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 430 */       ts ts = (ts)pk;
/* 431 */       if (ts.cn()) {
/* 432 */         return true;
/*     */       } }
/*     */     
/* 435 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 440 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 445 */     return xi.b(f(☃, cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 450 */     cq cq = cq.a(☃);
/* 451 */     if (cq.k() == cq.a.b) {
/* 452 */       cq = cq.c;
/*     */     }
/* 454 */     return Q().a(a, cq);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 460 */     return ((cq)☃.<cq>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 465 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */