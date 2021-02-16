/*     */ import java.util.Arrays;
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
/*     */ public class aju
/*     */   extends afh
/*     */ {
/*  29 */   public static final aml a = aml.a("facing", cq.c.a);
/*  30 */   public static final amm<a> b = amm.a("half", a.class);
/*  31 */   public static final amm<b> N = amm.a("shape", b.class);
/*     */   
/*  33 */   private static final int[][] O = new int[][] { { 4, 5 }, { 5, 7 }, { 6, 7 }, { 4, 6 }, { 0, 1 }, { 1, 3 }, { 2, 3 }, { 0, 2 } };
/*     */ 
/*     */   
/*     */   private final afh P;
/*     */ 
/*     */   
/*     */   private final alz Q;
/*     */ 
/*     */   
/*     */   private boolean R;
/*     */ 
/*     */   
/*     */   private int S;
/*     */ 
/*     */   
/*     */   protected aju(alz ☃) {
/*  49 */     super((☃.c()).J);
/*  50 */     j(this.M.b().<Comparable, cq>a(a, cq.c).<a, a>a(b, a.b).a(N, b.a));
/*  51 */     this.P = ☃.c();
/*  52 */     this.Q = ☃;
/*  53 */     c(this.P.w);
/*  54 */     b(this.P.x / 3.0F);
/*  55 */     a(this.P.H);
/*  56 */     e(255);
/*  57 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  62 */     if (this.R) {
/*  63 */       a(0.5F * (this.S % 2), 0.5F * (this.S / 4 % 2), 0.5F * (this.S / 2 % 2), 0.5F + 0.5F * (this.S % 2), 0.5F + 0.5F * (this.S / 4 % 2), 0.5F + 0.5F * (this.S / 2 % 2));
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */       
/*  72 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  78 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  83 */     return false;
/*     */   }
/*     */   
/*     */   public void e(adq ☃, cj cj1) {
/*  87 */     if (☃.p(cj1).b(b) == a.a) {
/*  88 */       a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  90 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean c(afh ☃) {
/*  95 */     return ☃ instanceof aju;
/*     */   }
/*     */   
/*     */   public static boolean a(adq ☃, cj cj1, alz alz1) {
/*  99 */     alz alz2 = ☃.p(cj1);
/* 100 */     afh afh1 = alz2.c();
/* 101 */     if (c(afh1) && alz2.b(b) == alz1.b(b) && alz2.b(a) == alz1.b(a)) {
/* 102 */       return true;
/*     */     }
/*     */     
/* 105 */     return false;
/*     */   }
/*     */   
/*     */   public int f(adq ☃, cj cj1) {
/* 109 */     alz alz1 = ☃.p(cj1);
/* 110 */     cq cq = alz1.<cq>b(a);
/* 111 */     a a = alz1.<a>b(b);
/* 112 */     boolean bool = (a == a.a);
/*     */     
/* 114 */     if (cq == cq.f) {
/* 115 */       alz alz2 = ☃.p(cj1.f());
/* 116 */       afh afh1 = alz2.c();
/* 117 */       if (c(afh1) && a == alz2.b(b)) {
/* 118 */         cq cq1 = alz2.<cq>b(a);
/* 119 */         if (cq1 == cq.c && !a(☃, cj1.d(), alz1))
/* 120 */           return bool ? 1 : 2; 
/* 121 */         if (cq1 == cq.d && !a(☃, cj1.c(), alz1)) {
/* 122 */           return bool ? 2 : 1;
/*     */         }
/*     */       } 
/* 125 */     } else if (cq == cq.e) {
/* 126 */       alz alz2 = ☃.p(cj1.e());
/* 127 */       afh afh1 = alz2.c();
/* 128 */       if (c(afh1) && a == alz2.b(b)) {
/* 129 */         cq cq1 = alz2.<cq>b(a);
/* 130 */         if (cq1 == cq.c && !a(☃, cj1.d(), alz1))
/* 131 */           return bool ? 2 : 1; 
/* 132 */         if (cq1 == cq.d && !a(☃, cj1.c(), alz1)) {
/* 133 */           return bool ? 1 : 2;
/*     */         }
/*     */       } 
/* 136 */     } else if (cq == cq.d) {
/* 137 */       alz alz2 = ☃.p(cj1.d());
/* 138 */       afh afh1 = alz2.c();
/* 139 */       if (c(afh1) && a == alz2.b(b)) {
/* 140 */         cq cq1 = alz2.<cq>b(a);
/* 141 */         if (cq1 == cq.e && !a(☃, cj1.f(), alz1))
/* 142 */           return bool ? 2 : 1; 
/* 143 */         if (cq1 == cq.f && !a(☃, cj1.e(), alz1)) {
/* 144 */           return bool ? 1 : 2;
/*     */         }
/*     */       } 
/* 147 */     } else if (cq == cq.c) {
/* 148 */       alz alz2 = ☃.p(cj1.c());
/* 149 */       afh afh1 = alz2.c();
/* 150 */       if (c(afh1) && a == alz2.b(b)) {
/* 151 */         cq cq1 = alz2.<cq>b(a);
/* 152 */         if (cq1 == cq.e && !a(☃, cj1.f(), alz1))
/* 153 */           return bool ? 1 : 2; 
/* 154 */         if (cq1 == cq.f && !a(☃, cj1.e(), alz1)) {
/* 155 */           return bool ? 2 : 1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 160 */     return 0;
/*     */   }
/*     */   
/*     */   public int g(adq ☃, cj cj1) {
/* 164 */     alz alz1 = ☃.p(cj1);
/* 165 */     cq cq = alz1.<cq>b(a);
/* 166 */     a a = alz1.<a>b(b);
/* 167 */     boolean bool = (a == a.a);
/*     */     
/* 169 */     if (cq == cq.f) {
/* 170 */       alz alz2 = ☃.p(cj1.e());
/* 171 */       afh afh1 = alz2.c();
/* 172 */       if (c(afh1) && a == alz2.b(b)) {
/* 173 */         cq cq1 = alz2.<cq>b(a);
/* 174 */         if (cq1 == cq.c && !a(☃, cj1.c(), alz1))
/* 175 */           return bool ? 1 : 2; 
/* 176 */         if (cq1 == cq.d && !a(☃, cj1.d(), alz1)) {
/* 177 */           return bool ? 2 : 1;
/*     */         }
/*     */       } 
/* 180 */     } else if (cq == cq.e) {
/* 181 */       alz alz2 = ☃.p(cj1.f());
/* 182 */       afh afh1 = alz2.c();
/* 183 */       if (c(afh1) && a == alz2.b(b)) {
/* 184 */         cq cq1 = alz2.<cq>b(a);
/* 185 */         if (cq1 == cq.c && !a(☃, cj1.c(), alz1))
/* 186 */           return bool ? 2 : 1; 
/* 187 */         if (cq1 == cq.d && !a(☃, cj1.d(), alz1)) {
/* 188 */           return bool ? 1 : 2;
/*     */         }
/*     */       } 
/* 191 */     } else if (cq == cq.d) {
/* 192 */       alz alz2 = ☃.p(cj1.c());
/* 193 */       afh afh1 = alz2.c();
/* 194 */       if (c(afh1) && a == alz2.b(b)) {
/* 195 */         cq cq1 = alz2.<cq>b(a);
/* 196 */         if (cq1 == cq.e && !a(☃, cj1.e(), alz1))
/* 197 */           return bool ? 2 : 1; 
/* 198 */         if (cq1 == cq.f && !a(☃, cj1.f(), alz1)) {
/* 199 */           return bool ? 1 : 2;
/*     */         }
/*     */       } 
/* 202 */     } else if (cq == cq.c) {
/* 203 */       alz alz2 = ☃.p(cj1.d());
/* 204 */       afh afh1 = alz2.c();
/* 205 */       if (c(afh1) && a == alz2.b(b)) {
/* 206 */         cq cq1 = alz2.<cq>b(a);
/* 207 */         if (cq1 == cq.e && !a(☃, cj1.e(), alz1))
/* 208 */           return bool ? 1 : 2; 
/* 209 */         if (cq1 == cq.f && !a(☃, cj1.f(), alz1)) {
/* 210 */           return bool ? 2 : 1;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 215 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean h(adq ☃, cj cj1) {
/* 219 */     alz alz1 = ☃.p(cj1);
/* 220 */     cq cq = alz1.<cq>b(a);
/* 221 */     a a = alz1.<a>b(b);
/* 222 */     boolean bool1 = (a == a.a);
/*     */     
/* 224 */     float f1 = 0.5F;
/* 225 */     float f2 = 1.0F;
/*     */     
/* 227 */     if (bool1) {
/* 228 */       f1 = 0.0F;
/* 229 */       f2 = 0.5F;
/*     */     } 
/*     */     
/* 232 */     float f3 = 0.0F;
/* 233 */     float f4 = 1.0F;
/* 234 */     float f5 = 0.0F;
/* 235 */     float f6 = 0.5F;
/*     */     
/* 237 */     boolean bool2 = true;
/*     */     
/* 239 */     if (cq == cq.f) {
/* 240 */       f3 = 0.5F;
/* 241 */       f6 = 1.0F;
/*     */       
/* 243 */       alz alz2 = ☃.p(cj1.f());
/* 244 */       afh afh1 = alz2.c();
/* 245 */       if (c(afh1) && a == alz2.b(b)) {
/* 246 */         cq cq1 = alz2.<cq>b(a);
/* 247 */         if (cq1 == cq.c && !a(☃, cj1.d(), alz1)) {
/* 248 */           f6 = 0.5F;
/* 249 */           bool2 = false;
/* 250 */         } else if (cq1 == cq.d && !a(☃, cj1.c(), alz1)) {
/* 251 */           f5 = 0.5F;
/* 252 */           bool2 = false;
/*     */         } 
/*     */       } 
/* 255 */     } else if (cq == cq.e) {
/* 256 */       f4 = 0.5F;
/* 257 */       f6 = 1.0F;
/*     */       
/* 259 */       alz alz2 = ☃.p(cj1.e());
/* 260 */       afh afh1 = alz2.c();
/* 261 */       if (c(afh1) && a == alz2.b(b)) {
/* 262 */         cq cq1 = alz2.<cq>b(a);
/* 263 */         if (cq1 == cq.c && !a(☃, cj1.d(), alz1)) {
/* 264 */           f6 = 0.5F;
/* 265 */           bool2 = false;
/* 266 */         } else if (cq1 == cq.d && !a(☃, cj1.c(), alz1)) {
/* 267 */           f5 = 0.5F;
/* 268 */           bool2 = false;
/*     */         } 
/*     */       } 
/* 271 */     } else if (cq == cq.d) {
/* 272 */       f5 = 0.5F;
/* 273 */       f6 = 1.0F;
/*     */       
/* 275 */       alz alz2 = ☃.p(cj1.d());
/* 276 */       afh afh1 = alz2.c();
/* 277 */       if (c(afh1) && a == alz2.b(b)) {
/* 278 */         cq cq1 = alz2.<cq>b(a);
/* 279 */         if (cq1 == cq.e && !a(☃, cj1.f(), alz1)) {
/* 280 */           f4 = 0.5F;
/* 281 */           bool2 = false;
/* 282 */         } else if (cq1 == cq.f && !a(☃, cj1.e(), alz1)) {
/* 283 */           f3 = 0.5F;
/* 284 */           bool2 = false;
/*     */         } 
/*     */       } 
/* 287 */     } else if (cq == cq.c) {
/* 288 */       alz alz2 = ☃.p(cj1.c());
/* 289 */       afh afh1 = alz2.c();
/* 290 */       if (c(afh1) && a == alz2.b(b)) {
/* 291 */         cq cq1 = alz2.<cq>b(a);
/* 292 */         if (cq1 == cq.e && !a(☃, cj1.f(), alz1)) {
/* 293 */           f4 = 0.5F;
/* 294 */           bool2 = false;
/* 295 */         } else if (cq1 == cq.f && !a(☃, cj1.e(), alz1)) {
/* 296 */           f3 = 0.5F;
/* 297 */           bool2 = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 302 */     a(f3, f1, f5, f4, f2, f6);
/* 303 */     return bool2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i(adq ☃, cj cj1) {
/* 311 */     alz alz1 = ☃.p(cj1);
/* 312 */     cq cq = alz1.<cq>b(a);
/* 313 */     a a = alz1.<a>b(b);
/* 314 */     boolean bool1 = (a == a.a);
/*     */     
/* 316 */     float f1 = 0.5F;
/* 317 */     float f2 = 1.0F;
/*     */     
/* 319 */     if (bool1) {
/* 320 */       f1 = 0.0F;
/* 321 */       f2 = 0.5F;
/*     */     } 
/*     */     
/* 324 */     float f3 = 0.0F;
/* 325 */     float f4 = 0.5F;
/* 326 */     float f5 = 0.5F;
/* 327 */     float f6 = 1.0F;
/*     */     
/* 329 */     boolean bool2 = false;
/*     */     
/* 331 */     if (cq == cq.f) {
/* 332 */       alz alz2 = ☃.p(cj1.e());
/* 333 */       afh afh1 = alz2.c();
/* 334 */       if (c(afh1) && a == alz2.b(b)) {
/* 335 */         cq cq1 = alz2.<cq>b(a);
/* 336 */         if (cq1 == cq.c && !a(☃, cj1.c(), alz1)) {
/* 337 */           f5 = 0.0F;
/* 338 */           f6 = 0.5F;
/* 339 */           bool2 = true;
/* 340 */         } else if (cq1 == cq.d && !a(☃, cj1.d(), alz1)) {
/* 341 */           f5 = 0.5F;
/* 342 */           f6 = 1.0F;
/* 343 */           bool2 = true;
/*     */         } 
/*     */       } 
/* 346 */     } else if (cq == cq.e) {
/* 347 */       alz alz2 = ☃.p(cj1.f());
/* 348 */       afh afh1 = alz2.c();
/* 349 */       if (c(afh1) && a == alz2.b(b)) {
/* 350 */         f3 = 0.5F;
/* 351 */         f4 = 1.0F;
/* 352 */         cq cq1 = alz2.<cq>b(a);
/* 353 */         if (cq1 == cq.c && !a(☃, cj1.c(), alz1)) {
/* 354 */           f5 = 0.0F;
/* 355 */           f6 = 0.5F;
/* 356 */           bool2 = true;
/* 357 */         } else if (cq1 == cq.d && !a(☃, cj1.d(), alz1)) {
/* 358 */           f5 = 0.5F;
/* 359 */           f6 = 1.0F;
/* 360 */           bool2 = true;
/*     */         } 
/*     */       } 
/* 363 */     } else if (cq == cq.d) {
/* 364 */       alz alz2 = ☃.p(cj1.c());
/* 365 */       afh afh1 = alz2.c();
/* 366 */       if (c(afh1) && a == alz2.b(b)) {
/* 367 */         f5 = 0.0F;
/* 368 */         f6 = 0.5F;
/*     */         
/* 370 */         cq cq1 = alz2.<cq>b(a);
/* 371 */         if (cq1 == cq.e && !a(☃, cj1.e(), alz1)) {
/* 372 */           bool2 = true;
/* 373 */         } else if (cq1 == cq.f && !a(☃, cj1.f(), alz1)) {
/* 374 */           f3 = 0.5F;
/* 375 */           f4 = 1.0F;
/* 376 */           bool2 = true;
/*     */         } 
/*     */       } 
/* 379 */     } else if (cq == cq.c) {
/* 380 */       alz alz2 = ☃.p(cj1.d());
/* 381 */       afh afh1 = alz2.c();
/* 382 */       if (c(afh1) && a == alz2.b(b)) {
/* 383 */         cq cq1 = alz2.<cq>b(a);
/* 384 */         if (cq1 == cq.e && !a(☃, cj1.e(), alz1)) {
/* 385 */           bool2 = true;
/* 386 */         } else if (cq1 == cq.f && !a(☃, cj1.f(), alz1)) {
/* 387 */           f3 = 0.5F;
/* 388 */           f4 = 1.0F;
/* 389 */           bool2 = true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 394 */     if (bool2) {
/* 395 */       a(f3, f1, f5, f4, f2, f6);
/*     */     }
/* 397 */     return bool2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/* 402 */     e(☃, cj1);
/* 403 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/* 405 */     boolean bool = h(☃, cj1);
/* 406 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/* 408 */     if (bool && 
/* 409 */       i(☃, cj1)) {
/* 410 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     }
/*     */ 
/*     */     
/* 414 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 427 */     this.P.c(☃, cj1, alz1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, wn wn1) {
/* 432 */     this.P.a(☃, cj1, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(adm ☃, cj cj1, alz alz1) {
/* 437 */     this.P.d(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(adq ☃, cj cj1) {
/* 442 */     return this.P.c(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(pk ☃) {
/* 447 */     return this.P.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 452 */     return this.P.m();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/* 457 */     return this.P.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/* 462 */     return this.P.b(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public aui a(adm ☃, cj cj1, pk pk1, aui aui1) {
/* 467 */     return this.P.a(☃, cj1, pk1, aui1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean A() {
/* 472 */     return this.P.A();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(alz ☃, boolean bool) {
/* 477 */     return this.P.a(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 482 */     return this.P.d(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 487 */     a(☃, cj1, this.Q, afi.a);
/* 488 */     this.P.c(☃, cj1, this.Q);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 493 */     this.P.b(☃, cj1, this.Q);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, pk pk1) {
/* 503 */     this.P.a(☃, cj1, pk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 508 */     this.P.b(☃, cj1, alz1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 513 */     return this.P.a(☃, cj1, this.Q, wn1, cq.a, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, adi adi1) {
/* 518 */     this.P.a(☃, cj1, adi1);
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/* 523 */     return this.P.g(this.Q);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 528 */     alz alz1 = super.a(☃, cj1, cq1, f1, f2, f3, i, pr1);
/*     */     
/* 530 */     alz1 = alz1.<Comparable, cq>a(a, pr1.aP()).a(N, b.a);
/*     */     
/* 532 */     if (cq1 == cq.a || (cq1 != cq.b && f2 > 0.5D)) {
/* 533 */       return alz1.a(b, a.a);
/*     */     }
/*     */     
/* 536 */     return alz1.a(b, a.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/* 542 */     auh[] arrayOfAuh1 = new auh[8];
/* 543 */     alz alz1 = ☃.p(cj1);
/* 544 */     int i = ((cq)alz1.<cq>b(a)).b();
/* 545 */     boolean bool = (alz1.b(b) == a.a);
/* 546 */     int[] arrayOfInt1 = O[i + (bool ? 4 : 0)];
/*     */     
/* 548 */     this.R = true;
/* 549 */     for (int j = 0; j < 8; j++) {
/* 550 */       this.S = j;
/*     */       
/* 552 */       if (Arrays.binarySearch(arrayOfInt1, j) < 0)
/*     */       {
/*     */ 
/*     */         
/* 556 */         arrayOfAuh1[j] = super.a(☃, cj1, aui1, aui2);
/*     */       }
/*     */     } 
/* 559 */     for (int arrayOfInt2[] = arrayOfInt1, k = arrayOfInt2.length, m = 0; m < k; ) { int i2 = arrayOfInt2[m];
/* 560 */       arrayOfAuh1[i2] = null;
/*     */       
/*     */       m++; }
/*     */     
/* 564 */     auh auh = null;
/* 565 */     double d = 0.0D; auh[] arrayOfAuh2;
/*     */     int n, i1;
/* 567 */     for (arrayOfAuh2 = arrayOfAuh1, n = arrayOfAuh2.length, i1 = 0; i1 < n; ) { auh auh1 = arrayOfAuh2[i1];
/* 568 */       if (auh1 != null) {
/*     */ 
/*     */         
/* 571 */         double d1 = auh1.c.g(aui2);
/*     */         
/* 573 */         if (d1 > d) {
/* 574 */           auh = auh1;
/* 575 */           d = d1;
/*     */         } 
/*     */       }  i1++; }
/*     */     
/* 579 */     return auh;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 584 */     alz alz1 = Q().a(b, ((☃ & 0x4) > 0) ? a.a : a.b);
/*     */ 
/*     */     
/* 587 */     alz1 = alz1.a(a, cq.a(5 - (☃ & 0x3)));
/*     */     
/* 589 */     return alz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 594 */     int i = 0;
/*     */     
/* 596 */     if (☃.b(b) == a.a) {
/* 597 */       i |= 0x4;
/*     */     }
/*     */     
/* 600 */     i |= 5 - ((cq)☃.<cq>b(a)).a();
/*     */     
/* 602 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 607 */     if (h(adq1, cj1)) {
/* 608 */       switch (g(adq1, cj1)) {
/*     */         case 0:
/* 610 */           ☃ = ☃.a(N, b.a);
/*     */           break;
/*     */         case 1:
/* 613 */           ☃ = ☃.a(N, b.c);
/*     */           break;
/*     */         case 2:
/* 616 */           ☃ = ☃.a(N, b.b);
/*     */           break;
/*     */       } 
/*     */     } else {
/* 620 */       switch (f(adq1, cj1)) {
/*     */         case 0:
/* 622 */           ☃ = ☃.a(N, b.a);
/*     */           break;
/*     */         case 1:
/* 625 */           ☃ = ☃.a(N, b.e);
/*     */           break;
/*     */         case 2:
/* 628 */           ☃ = ☃.a(N, b.d);
/*     */           break;
/*     */       } 
/*     */     
/*     */     } 
/* 633 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 638 */     return new ama(this, new amo[] { a, b, N });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 642 */     a("top"),
/* 643 */     b("bottom");
/*     */     
/*     */     private final String c;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 649 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 654 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 659 */       return this.c;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum b implements nw {
/* 664 */     a("straight"),
/* 665 */     b("inner_left"),
/* 666 */     c("inner_right"),
/* 667 */     d("outer_left"),
/* 668 */     e("outer_right");
/*     */     
/*     */     private final String f;
/*     */ 
/*     */     
/*     */     b(String ☃) {
/* 674 */       this.f = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 679 */       return this.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 684 */       return this.f;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */