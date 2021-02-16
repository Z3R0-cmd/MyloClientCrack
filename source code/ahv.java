/*     */ import java.util.Iterator;
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
/*     */ public abstract class ahv
/*     */   extends afh
/*     */ {
/*  24 */   public static final amn b = amn.a("level", 0, 15);
/*     */   
/*     */   protected ahv(arm ☃) {
/*  27 */     super(☃);
/*  28 */     j(this.M.b().a(b, Integer.valueOf(0)));
/*  29 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  30 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  35 */     return (this.J != arm.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  40 */     if (this.J == arm.h) {
/*  41 */       return aea.c(☃, cj1);
/*     */     }
/*  43 */     return 16777215;
/*     */   }
/*     */   
/*     */   public static float b(int ☃) {
/*  47 */     if (☃ >= 8) {
/*  48 */       ☃ = 0;
/*     */     }
/*  50 */     return (☃ + 1) / 9.0F;
/*     */   }
/*     */   
/*     */   protected int e(adq ☃, cj cj1) {
/*  54 */     if (☃.p(cj1).c().t() == this.J) {
/*  55 */       return ((Integer)☃.p(cj1).<Integer>b(b)).intValue();
/*     */     }
/*     */     
/*  58 */     return -1;
/*     */   }
/*     */   
/*     */   protected int f(adq ☃, cj cj1) {
/*  62 */     int i = e(☃, cj1);
/*     */     
/*  64 */     return (i >= 8) ? 0 : i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  74 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(alz ☃, boolean bool) {
/*  79 */     return (bool && ((Integer)☃.<Integer>b(b)).intValue() == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1, cq cq1) {
/*  84 */     arm arm = ☃.p(cj1).c().t();
/*  85 */     if (arm == this.J) {
/*  86 */       return false;
/*     */     }
/*  88 */     if (cq1 == cq.b) {
/*  89 */       return true;
/*     */     }
/*  91 */     if (arm == arm.w) {
/*  92 */       return false;
/*     */     }
/*  94 */     return super.b(☃, cj1, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/*  99 */     if (☃.p(cj1).c().t() == this.J) {
/* 100 */       return false;
/*     */     }
/* 102 */     if (cq1 == cq.b) {
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     return super.a(☃, cj1, cq1);
/*     */   }
/*     */   
/*     */   public boolean g(adq ☃, cj cj1) {
/* 110 */     for (int i = -1; i <= 1; i++) {
/* 111 */       for (int j = -1; j <= 1; j++) {
/* 112 */         alz alz = ☃.p(cj1.a(i, 0, j));
/* 113 */         afh afh1 = alz.c();
/* 114 */         arm arm = afh1.t();
/* 115 */         if (arm != this.J && !afh1.o()) {
/* 116 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 120 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 126 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 131 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 137 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 142 */     return 0;
/*     */   }
/*     */   
/*     */   protected aui h(adq ☃, cj cj1) {
/* 146 */     aui aui = new aui(0.0D, 0.0D, 0.0D);
/* 147 */     int i = f(☃, cj1);
/* 148 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 149 */       cj cj2 = cj1.a(cq);
/*     */       
/* 151 */       int j = f(☃, cj2);
/* 152 */       if (j < 0) {
/* 153 */         if (!☃.p(cj2).c().t().c()) {
/* 154 */           j = f(☃, cj2.b());
/* 155 */           if (j >= 0) {
/* 156 */             int k = j - i - 8;
/* 157 */             aui = aui.b(((cj2.n() - cj1.n()) * k), ((cj2.o() - cj1.o()) * k), ((cj2.p() - cj1.p()) * k));
/*     */           } 
/*     */         }  continue;
/* 160 */       }  if (j >= 0) {
/* 161 */         int k = j - i;
/* 162 */         aui = aui.b(((cj2.n() - cj1.n()) * k), ((cj2.o() - cj1.o()) * k), ((cj2.p() - cj1.p()) * k));
/*     */       }  }
/*     */     
/* 165 */     if (((Integer)☃.p(cj1).b(b)).intValue() >= 8) {
/* 166 */       for (Iterator<cq> iterator1 = cq.c.a.iterator(); iterator1.hasNext(); ) { cq cq = iterator1.next();
/* 167 */         cj cj2 = cj1.a(cq);
/* 168 */         if (b(☃, cj2, cq) || b(☃, cj2.a(), cq)) {
/* 169 */           aui = aui.a().b(0.0D, -6.0D, 0.0D);
/*     */           break;
/*     */         }  }
/*     */     
/*     */     }
/* 174 */     return aui.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public aui a(adm ☃, cj cj1, pk pk1, aui aui1) {
/* 179 */     return aui1.e(h(☃, cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/* 184 */     if (this.J == arm.h) {
/* 185 */       return 5;
/*     */     }
/* 187 */     if (this.J == arm.i) {
/* 188 */       return ☃.t.o() ? 10 : 30;
/*     */     }
/* 190 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(adq ☃, cj cj1) {
/* 195 */     int i = ☃.b(cj1, 0);
/* 196 */     int j = ☃.b(cj1.a(), 0);
/*     */     
/* 198 */     int k = i & 0xFF;
/* 199 */     int m = j & 0xFF;
/* 200 */     int n = i >> 16 & 0xFF;
/* 201 */     int i1 = j >> 16 & 0xFF;
/*     */     
/* 203 */     return ((k > m) ? k : m) | ((n > i1) ? n : i1) << 16;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 208 */     return (this.J == arm.h) ? adf.d : adf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 213 */     double d1 = cj1.n();
/* 214 */     double d2 = cj1.o();
/* 215 */     double d3 = cj1.p();
/*     */     
/* 217 */     if (this.J == arm.h) {
/* 218 */       int i = ((Integer)alz1.<Integer>b(b)).intValue();
/* 219 */       if (i > 0 && i < 8) {
/* 220 */         if (random.nextInt(64) == 0) {
/* 221 */           ☃.a(d1 + 0.5D, d2 + 0.5D, d3 + 0.5D, "liquid.water", random.nextFloat() * 0.25F + 0.75F, random.nextFloat() * 1.0F + 0.5F, false);
/*     */         }
/* 223 */       } else if (random.nextInt(10) == 0) {
/* 224 */         ☃.a(cy.h, d1 + random.nextFloat(), d2 + random.nextFloat(), d3 + random.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
/*     */       } 
/*     */     } 
/*     */     
/* 228 */     if (this.J == arm.i && 
/* 229 */       ☃.p(cj1.a()).c().t() == arm.a && !☃.p(cj1.a()).c().c()) {
/* 230 */       if (random.nextInt(100) == 0) {
/* 231 */         double d4 = d1 + random.nextFloat();
/* 232 */         double d5 = d2 + this.F;
/* 233 */         double d6 = d3 + random.nextFloat();
/* 234 */         ☃.a(cy.B, d4, d5, d6, 0.0D, 0.0D, 0.0D, new int[0]);
/* 235 */         ☃.a(d4, d5, d6, "liquid.lavapop", 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
/*     */       } 
/* 237 */       if (random.nextInt(200) == 0) {
/* 238 */         ☃.a(d1, d2, d3, "liquid.lava", 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 243 */     if (random.nextInt(10) == 0 && adm.a(☃, cj1.b())) {
/* 244 */       arm arm = ☃.p(cj1.c(2)).c().t();
/* 245 */       if (!arm.c() && !arm.d()) {
/* 246 */         double d4 = d1 + random.nextFloat();
/* 247 */         double d5 = d2 - 1.05D;
/* 248 */         double d6 = d3 + random.nextFloat();
/*     */         
/* 250 */         if (this.J == arm.h) {
/* 251 */           ☃.a(cy.s, d4, d5, d6, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } else {
/* 253 */           ☃.a(cy.t, d4, d5, d6, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static double a(adq ☃, cj cj1, arm arm1) {
/* 260 */     aui aui = a(arm1).h(☃, cj1);
/* 261 */     if (aui.a == 0.0D && aui.c == 0.0D) {
/* 262 */       return -1000.0D;
/*     */     }
/*     */     
/* 265 */     return ns.b(aui.c, aui.a) - 1.5707963267948966D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 270 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 275 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1, alz alz1) {
/* 279 */     if (this.J == arm.i) {
/* 280 */       boolean bool = false; cq[] arrayOfCq; int i, j;
/* 281 */       for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 282 */         if (cq != cq.a && ☃.p(cj1.a(cq)).c().t() == arm.h) {
/* 283 */           bool = true; break;
/*     */         } 
/*     */         j++; }
/*     */       
/* 287 */       if (bool) {
/* 288 */         Integer integer = alz1.<Integer>b(b);
/* 289 */         if (integer.intValue() == 0) {
/* 290 */           ☃.a(cj1, afi.Z.Q());
/* 291 */           e(☃, cj1);
/* 292 */           return true;
/* 293 */         }  if (integer.intValue() <= 4) {
/* 294 */           ☃.a(cj1, afi.e.Q());
/* 295 */           e(☃, cj1);
/* 296 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     return false;
/*     */   }
/*     */   
/*     */   protected void e(adm ☃, cj cj1) {
/* 305 */     double d1 = cj1.n();
/* 306 */     double d2 = cj1.o();
/* 307 */     double d3 = cj1.p();
/*     */     
/* 309 */     ☃.a(d1 + 0.5D, d2 + 0.5D, d3 + 0.5D, "random.fizz", 0.5F, 2.6F + (☃.s.nextFloat() - ☃.s.nextFloat()) * 0.8F);
/* 310 */     for (int i = 0; i < 8; i++) {
/* 311 */       ☃.a(cy.m, d1 + Math.random(), d2 + 1.2D, d3 + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 317 */     return Q().a(b, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 322 */     return ((Integer)☃.<Integer>b(b)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 327 */     return new ama(this, new amo[] { b });
/*     */   }
/*     */   
/*     */   public static agl a(arm ☃) {
/* 331 */     if (☃ == arm.h)
/* 332 */       return afi.i; 
/* 333 */     if (☃ == arm.i) {
/* 334 */       return afi.k;
/*     */     }
/*     */     
/* 337 */     throw new IllegalArgumentException("Invalid material");
/*     */   }
/*     */   
/*     */   public static ajw b(arm ☃) {
/* 341 */     if (☃ == arm.h)
/* 342 */       return afi.j; 
/* 343 */     if (☃ == arm.i) {
/* 344 */       return afi.l;
/*     */     }
/*     */     
/* 347 */     throw new IllegalArgumentException("Invalid material");
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */