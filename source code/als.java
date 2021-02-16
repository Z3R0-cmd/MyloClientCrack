/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class als
/*     */   extends afh
/*     */ {
/*  27 */   public static final aml a = aml.a("facing");
/*  28 */   public static final amk b = amk.a("extended");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean N;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public als(boolean ☃) {
/*  40 */     super(arm.H);
/*  41 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, Boolean.valueOf(false)));
/*  42 */     this.N = ☃;
/*  43 */     a(i);
/*  44 */     c(0.5F);
/*  45 */     a(yz.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  59 */     ☃.a(cj1, alz1.a(a, a(☃, cj1, pr1)), 2);
/*  60 */     if (!☃.D) {
/*  61 */       e(☃, cj1, alz1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  67 */     if (!☃.D) {
/*  68 */       e(☃, cj1, alz1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  74 */     if (!☃.D && ☃.s(cj1) == null) {
/*  75 */       e(☃, cj1, alz1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  81 */     return Q().<Comparable, cq>a(a, a(☃, cj1, pr1)).a(b, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1, alz alz1) {
/*  85 */     cq cq = alz1.<cq>b(a);
/*     */     
/*  87 */     boolean bool = a(☃, cj1, cq);
/*     */     
/*  89 */     if (bool && !((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/*  90 */       if ((new alw(☃, cj1, cq, true)).a()) {
/*  91 */         ☃.c(cj1, this, 0, cq.a());
/*     */       }
/*  93 */     } else if (!bool && ((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/*  94 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(false)), 2);
/*  95 */       ☃.c(cj1, this, 1, cq.a());
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
/*     */   
/*     */   private boolean a(adm ☃, cj cj1, cq cq1) {
/*     */     cq[] arrayOfCq1;
/*     */     int i, j;
/* 111 */     for (arrayOfCq1 = cq.values(), i = arrayOfCq1.length, j = 0; j < i; ) { cq cq2 = arrayOfCq1[j];
/* 112 */       if (cq2 != cq1 && ☃.b(cj1.a(cq2), cq2)) {
/* 113 */         return true;
/*     */       }
/*     */       
/*     */       j++; }
/*     */     
/* 118 */     if (☃.b(cj1, cq.a)) {
/* 119 */       return true;
/*     */     }
/*     */     
/* 122 */     cj cj2 = cj1.a(); cq[] arrayOfCq2; int k;
/* 123 */     for (arrayOfCq2 = cq.values(), j = arrayOfCq2.length, k = 0; k < j; ) { cq cq2 = arrayOfCq2[k];
/* 124 */       if (cq2 != cq.a && ☃.b(cj2.a(cq2), cq2)) {
/* 125 */         return true;
/*     */       }
/*     */       k++; }
/*     */     
/* 129 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, int i, int j) {
/* 134 */     cq cq = alz1.<cq>b(a);
/* 135 */     if (!☃.D) {
/* 136 */       boolean bool = a(☃, cj1, cq);
/*     */       
/* 138 */       if (bool && i == 1) {
/* 139 */         ☃.a(cj1, alz1.a(b, Boolean.valueOf(true)), 2);
/* 140 */         return false;
/* 141 */       }  if (!bool && i == 0) {
/* 142 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 146 */     if (i == 0) {
/* 147 */       if (a(☃, cj1, cq, true)) {
/* 148 */         ☃.a(cj1, alz1.a(b, Boolean.valueOf(true)), 2);
/* 149 */         ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "tile.piston.out", 0.5F, ☃.s.nextFloat() * 0.25F + 0.6F);
/*     */       } else {
/* 151 */         return false;
/*     */       } 
/* 153 */     } else if (i == 1) {
/* 154 */       akw akw = ☃.s(cj1.a(cq));
/* 155 */       if (akw instanceof alu) {
/* 156 */         ((alu)akw).h();
/*     */       }
/*     */       
/* 159 */       ☃.a(cj1, afi.M.Q().<Comparable, cq>a(alv.a, cq).a(alv.b, this.N ? alt.a.b : alt.a.a), 3);
/* 160 */       ☃.a(cj1, alv.a(a(j), cq, false, true));
/*     */ 
/*     */       
/* 163 */       if (this.N) {
/* 164 */         cj cj2 = cj1.a(cq.g() * 2, cq.h() * 2, cq.i() * 2);
/* 165 */         afh afh1 = ☃.p(cj2).c();
/* 166 */         boolean bool = false;
/*     */         
/* 168 */         if (afh1 == afi.M) {
/*     */ 
/*     */           
/* 171 */           akw akw1 = ☃.s(cj2);
/* 172 */           if (akw1 instanceof alu) {
/* 173 */             alu alu = (alu)akw1;
/*     */             
/* 175 */             if (alu.e() == cq && alu.d()) {
/*     */               
/* 177 */               alu.h();
/* 178 */               bool = true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 183 */         if (!bool && afh1.t() != arm.a && a(afh1, ☃, cj2, cq.d(), false) && (afh1.k() == 0 || afh1 == afi.J || afh1 == afi.F)) {
/* 184 */           a(☃, cj1, cq, false);
/*     */         }
/*     */       } else {
/* 187 */         ☃.g(cj1.a(cq));
/*     */       } 
/*     */       
/* 190 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "tile.piston.in", 0.5F, ☃.s.nextFloat() * 0.15F + 0.6F);
/*     */     } 
/* 192 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 197 */     alz alz = ☃.p(cj1);
/* 198 */     if (alz.c() == this && ((Boolean)alz.<Boolean>b(b)).booleanValue()) {
/* 199 */       float f = 0.25F;
/* 200 */       cq cq = alz.<cq>b(a);
/* 201 */       if (cq != null) {
/* 202 */         switch (null.a[cq.ordinal()]) {
/*     */           case 1:
/* 204 */             a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */             break;
/*     */           case 2:
/* 207 */             a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/*     */             break;
/*     */           case 3:
/* 210 */             a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
/*     */             break;
/*     */           case 4:
/* 213 */             a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
/*     */             break;
/*     */           case 5:
/* 216 */             a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */             break;
/*     */           case 6:
/* 219 */             a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
/*     */             break;
/*     */         } 
/*     */       }
/*     */     } else {
/* 224 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 230 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/* 235 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 236 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 242 */     a(☃, cj1);
/* 243 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 248 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static cq b(int ☃) {
/* 253 */     int i = ☃ & 0x7;
/* 254 */     if (i > 5) {
/* 255 */       return null;
/*     */     }
/* 257 */     return cq.a(i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static cq a(adm ☃, cj cj1, pr pr1) {
/* 265 */     if (ns.e((float)pr1.s - cj1.n()) < 2.0F && ns.e((float)pr1.u - cj1.p()) < 2.0F) {
/*     */       
/* 267 */       double d = pr1.t + pr1.aS();
/* 268 */       if (d - cj1.o() > 2.0D) {
/* 269 */         return cq.b;
/*     */       }
/*     */       
/* 272 */       if (cj1.o() - d > 0.0D) {
/* 273 */         return cq.a;
/*     */       }
/*     */     } 
/*     */     
/* 277 */     return pr1.aP().d();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(afh ☃, adm adm1, cj cj1, cq cq1, boolean bool) {
/* 282 */     if (☃ == afi.Z) {
/* 283 */       return false;
/*     */     }
/*     */     
/* 286 */     if (!adm1.af().a(cj1))
/* 287 */       return false; 
/* 288 */     if (cj1.o() < 0 || (cq1 == cq.a && cj1.o() == 0))
/* 289 */       return false; 
/* 290 */     if (cj1.o() > adm1.U() - 1 || (cq1 == cq.b && cj1.o() == adm1.U() - 1)) {
/* 291 */       return false;
/*     */     }
/*     */     
/* 294 */     if (☃ == afi.J || ☃ == afi.F) {
/*     */       
/* 296 */       if (((Boolean)adm1.p(cj1).<Boolean>b(b)).booleanValue()) {
/* 297 */         return false;
/*     */       }
/*     */     } else {
/* 300 */       if (☃.g(adm1, cj1) == -1.0F) {
/* 301 */         return false;
/*     */       }
/*     */       
/* 304 */       if (☃.k() == 2) {
/* 305 */         return false;
/*     */       }
/*     */       
/* 308 */       if (☃.k() == 1) {
/* 309 */         if (!bool) {
/* 310 */           return false;
/*     */         }
/* 312 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 316 */     if (☃ instanceof agq)
/*     */     {
/* 318 */       return false;
/*     */     }
/*     */     
/* 321 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(adm ☃, cj cj1, cq cq1, boolean bool) {
/* 325 */     if (!bool)
/*     */     {
/*     */       
/* 328 */       ☃.g(cj1.a(cq1));
/*     */     }
/*     */     
/* 331 */     alw alw = new alw(☃, cj1, cq1, bool);
/* 332 */     List<cj> list1 = alw.c();
/* 333 */     List<cj> list2 = alw.d();
/*     */     
/* 335 */     if (!alw.a()) {
/* 336 */       return false;
/*     */     }
/*     */     
/* 339 */     int i = list1.size() + list2.size();
/* 340 */     afh[] arrayOfAfh = new afh[i];
/* 341 */     cq cq2 = bool ? cq1 : cq1.d();
/*     */     
/*     */     int j;
/* 344 */     for (j = list2.size() - 1; j >= 0; j--) {
/* 345 */       cj cj3 = list2.get(j);
/* 346 */       afh afh1 = ☃.p(cj3).c();
/*     */       
/* 348 */       afh1.b(☃, cj3, ☃.p(cj3), 0);
/* 349 */       ☃.g(cj3);
/*     */       
/* 351 */       arrayOfAfh[--i] = afh1;
/*     */     } 
/*     */ 
/*     */     
/* 355 */     for (j = list1.size() - 1; j >= 0; j--) {
/* 356 */       cj cj3 = list1.get(j);
/* 357 */       alz alz = ☃.p(cj3);
/* 358 */       afh afh1 = alz.c();
/* 359 */       int m = afh1.c(alz);
/*     */       
/* 361 */       ☃.g(cj3);
/* 362 */       cj3 = cj3.a(cq2);
/*     */       
/* 364 */       ☃.a(cj3, afi.M.Q().a(a, cq1), 4);
/* 365 */       ☃.a(cj3, alv.a(alz, cq1, bool, false));
/*     */       
/* 367 */       arrayOfAfh[--i] = afh1;
/*     */     } 
/*     */     
/* 370 */     cj cj2 = cj1.a(cq1);
/*     */     
/* 372 */     if (bool) {
/* 373 */       alt.a a = this.N ? alt.a.b : alt.a.a;
/* 374 */       alz alz1 = afi.K.Q().<Comparable, cq>a(alt.a, cq1).a(alt.b, a);
/*     */       
/* 376 */       alz alz2 = afi.M.Q().<Comparable, cq>a(alv.a, cq1).a(alv.b, this.N ? alt.a.b : alt.a.a);
/*     */ 
/*     */       
/* 379 */       ☃.a(cj2, alz2, 4);
/* 380 */       ☃.a(cj2, alv.a(alz1, cq1, true, false));
/*     */     } 
/*     */     
/*     */     int k;
/* 384 */     for (k = list2.size() - 1; k >= 0; k--) {
/* 385 */       ☃.c(list2.get(k), arrayOfAfh[i++]);
/*     */     }
/*     */ 
/*     */     
/* 389 */     for (k = list1.size() - 1; k >= 0; k--) {
/* 390 */       ☃.c(list1.get(k), arrayOfAfh[i++]);
/*     */     }
/*     */     
/* 393 */     if (bool) {
/*     */       
/* 395 */       ☃.c(cj2, afi.K);
/* 396 */       ☃.c(cj1, this);
/*     */     } 
/*     */     
/* 399 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz b(alz ☃) {
/* 404 */     return Q().a(a, cq.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 409 */     return Q().<Comparable, cq>a(a, b(☃)).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 416 */     int i = 0;
/*     */     
/* 418 */     i |= ((cq)☃.<cq>b(a)).a();
/*     */     
/* 420 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 421 */       i |= 0x8;
/*     */     }
/*     */     
/* 424 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 429 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/als.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */