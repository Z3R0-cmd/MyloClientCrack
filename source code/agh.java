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
/*     */ public class agh
/*     */   extends afh
/*     */ {
/*  27 */   public static final aml a = aml.a("facing", cq.c.a);
/*  28 */   public static final amk b = amk.a("open");
/*  29 */   public static final amm<b> N = amm.a("hinge", b.class);
/*  30 */   public static final amk O = amk.a("powered");
/*  31 */   public static final amm<a> P = amm.a("half", a.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected agh(arm ☃) {
/*  43 */     super(☃);
/*  44 */     j(this.M.b().<Comparable, cq>a(a, cq.c).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<b, b>a(N, b.a).<Comparable, Boolean>a(O, Boolean.valueOf(false)).a(P, a.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  49 */     return di.a((a() + ".name").replaceAll("tile", "item"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  59 */     return g(e(☃, cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  69 */     a(☃, cj1);
/*  70 */     return super.b(☃, cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  76 */     a(☃, cj1);
/*  77 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  82 */     k(e(☃, cj1));
/*     */   }
/*     */   
/*     */   private void k(int ☃) {
/*  86 */     float f = 0.1875F;
/*  87 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/*  88 */     cq cq = f(☃);
/*  89 */     boolean bool1 = g(☃);
/*  90 */     boolean bool2 = j(☃);
/*  91 */     if (bool1) {
/*  92 */       if (cq == cq.f) {
/*  93 */         if (!bool2) {
/*  94 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*     */         } else {
/*  96 */           a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*     */         } 
/*  98 */       } else if (cq == cq.d) {
/*  99 */         if (!bool2) {
/* 100 */           a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         } else {
/* 102 */           a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*     */         } 
/* 104 */       } else if (cq == cq.e) {
/* 105 */         if (!bool2) {
/* 106 */           a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*     */         } else {
/* 108 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*     */         } 
/* 110 */       } else if (cq == cq.c) {
/* 111 */         if (!bool2) {
/* 112 */           a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*     */         } else {
/* 114 */           a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         }
/*     */       
/*     */       } 
/* 118 */     } else if (cq == cq.f) {
/* 119 */       a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/* 120 */     } else if (cq == cq.d) {
/* 121 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/* 122 */     } else if (cq == cq.e) {
/* 123 */       a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 124 */     } else if (cq == cq.c) {
/* 125 */       a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 132 */     if (this.J == arm.f) {
/* 133 */       return true;
/*     */     }
/*     */     
/* 136 */     cj cj2 = (alz1.b(P) == a.b) ? cj1 : cj1.b();
/* 137 */     alz alz2 = cj1.equals(cj2) ? alz1 : ☃.p(cj2);
/* 138 */     if (alz2.c() != this) {
/* 139 */       return false;
/*     */     }
/*     */     
/* 142 */     alz1 = alz2.a(b);
/* 143 */     ☃.a(cj2, alz1, 2);
/* 144 */     ☃.b(cj2, cj1);
/*     */     
/* 146 */     ☃.a(wn1, ((Boolean)alz1.<Boolean>b(b)).booleanValue() ? 1003 : 1006, cj1, 0);
/* 147 */     return true;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, boolean bool) {
/* 151 */     alz alz1 = ☃.p(cj1);
/* 152 */     if (alz1.c() != this) {
/*     */       return;
/*     */     }
/* 155 */     cj cj2 = (alz1.b(P) == a.b) ? cj1 : cj1.b();
/* 156 */     alz alz2 = (cj1 == cj2) ? alz1 : ☃.p(cj2);
/*     */     
/* 158 */     if (alz2.c() == this && ((Boolean)alz2.<Boolean>b(b)).booleanValue() != bool) {
/* 159 */       ☃.a(cj2, alz2.a(b, Boolean.valueOf(bool)), 2);
/* 160 */       ☃.b(cj2, cj1);
/*     */       
/* 162 */       ☃.a((wn)null, bool ? 1003 : 1006, cj1, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 168 */     if (alz1.b(P) == a.a) {
/* 169 */       cj cj2 = cj1.b();
/* 170 */       alz alz2 = ☃.p(cj2);
/* 171 */       if (alz2.c() != this) {
/* 172 */         ☃.g(cj1);
/* 173 */       } else if (afh1 != this) {
/* 174 */         a(☃, cj2, alz2, afh1);
/*     */       } 
/*     */     } else {
/* 177 */       boolean bool = false;
/* 178 */       cj cj2 = cj1.a();
/* 179 */       alz alz2 = ☃.p(cj2);
/*     */       
/* 181 */       if (alz2.c() != this) {
/* 182 */         ☃.g(cj1);
/* 183 */         bool = true;
/*     */       } 
/*     */       
/* 186 */       if (!adm.a(☃, cj1.b())) {
/* 187 */         ☃.g(cj1);
/* 188 */         bool = true;
/* 189 */         if (alz2.c() == this) {
/* 190 */           ☃.g(cj2);
/*     */         }
/*     */       } 
/*     */       
/* 194 */       if (bool) {
/* 195 */         if (!☃.D) {
/* 196 */           b(☃, cj1, alz1, 0);
/*     */         }
/*     */       } else {
/* 199 */         boolean bool1 = (☃.z(cj1) || ☃.z(cj2));
/* 200 */         if ((bool1 || afh1.i()) && afh1 != this && 
/* 201 */           bool1 != ((Boolean)alz2.<Boolean>b(O)).booleanValue()) {
/* 202 */           ☃.a(cj2, alz2.a(O, Boolean.valueOf(bool1)), 2);
/*     */           
/* 204 */           if (bool1 != ((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 205 */             ☃.a(cj1, alz1.a(b, Boolean.valueOf(bool1)), 2);
/* 206 */             ☃.b(cj1, cj1);
/* 207 */             ☃.a((wn)null, bool1 ? 1003 : 1006, cj1, 0);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 218 */     if (☃.b(P) == a.a) {
/* 219 */       return null;
/*     */     }
/*     */     
/* 222 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/* 227 */     a(☃, cj1);
/* 228 */     return super.a(☃, cj1, aui1, aui2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 233 */     if (cj1.o() >= 255) {
/* 234 */       return false;
/*     */     }
/*     */     
/* 237 */     return (adm.a(☃, cj1.b()) && super.d(☃, cj1) && super.d(☃, cj1.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 242 */     return 1;
/*     */   }
/*     */   
/*     */   public static int e(adq ☃, cj cj1) {
/* 246 */     alz alz1 = ☃.p(cj1);
/* 247 */     int i = alz1.c().c(alz1);
/* 248 */     boolean bool1 = i(i);
/*     */     
/* 250 */     alz alz2 = ☃.p(cj1.b());
/* 251 */     int j = alz2.c().c(alz2);
/* 252 */     int k = bool1 ? j : i;
/* 253 */     alz alz3 = ☃.p(cj1.a());
/* 254 */     int m = alz3.c().c(alz3);
/* 255 */     int n = bool1 ? i : m;
/*     */ 
/*     */     
/* 258 */     boolean bool2 = ((n & 0x1) != 0);
/* 259 */     boolean bool3 = ((n & 0x2) != 0);
/* 260 */     return b(k) | (bool1 ? 8 : 0) | (bool2 ? 16 : 0) | (bool3 ? 32 : 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 265 */     return l();
/*     */   }
/*     */   
/*     */   private zw l() {
/* 269 */     if (this == afi.aA)
/* 270 */       return zy.aB; 
/* 271 */     if (this == afi.ap)
/* 272 */       return zy.ar; 
/* 273 */     if (this == afi.aq)
/* 274 */       return zy.as; 
/* 275 */     if (this == afi.ar)
/* 276 */       return zy.at; 
/* 277 */     if (this == afi.as)
/* 278 */       return zy.au; 
/* 279 */     if (this == afi.at) {
/* 280 */       return zy.av;
/*     */     }
/* 282 */     return zy.aq;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 288 */     cj cj2 = cj1.b();
/* 289 */     if (wn1.bA.d && alz1.b(P) == a.a && ☃.p(cj2).c() == this) {
/* 290 */       ☃.g(cj2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 296 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 301 */     if (☃.b(P) == a.b) {
/* 302 */       alz alz1 = adq1.p(cj1.a());
/* 303 */       if (alz1.c() == this) {
/* 304 */         ☃ = ☃.<b, b>a(N, alz1.b(N)).a(O, alz1.b(O));
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 309 */       alz alz1 = adq1.p(cj1.b());
/* 310 */       if (alz1.c() == this) {
/* 311 */         ☃ = ☃.<Comparable, Comparable>a(a, alz1.b(a)).a(b, alz1.b(b));
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 317 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 322 */     if ((☃ & 0x8) > 0) {
/* 323 */       return Q().<a, a>a(P, a.a).<b, b>a(N, ((☃ & 0x1) > 0) ? b.b : b.a).a(O, Boolean.valueOf(((☃ & 0x2) > 0)));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 328 */     return Q().<a, a>a(P, a.b).<Comparable, cq>a(a, cq.b(☃ & 0x3).f()).a(b, Boolean.valueOf(((☃ & 0x4) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 337 */     int i = 0;
/*     */     
/* 339 */     if (☃.b(P) == a.a) {
/* 340 */       i |= 0x8;
/*     */       
/* 342 */       if (☃.b(N) == b.b) {
/* 343 */         i |= 0x1;
/*     */       }
/* 345 */       if (((Boolean)☃.<Boolean>b(O)).booleanValue()) {
/* 346 */         i |= 0x2;
/*     */       }
/*     */     } else {
/* 349 */       i |= ((cq)☃.<cq>b(a)).e().b();
/*     */       
/* 351 */       if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 352 */         i |= 0x4;
/*     */       }
/*     */     } 
/*     */     
/* 356 */     return i;
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 360 */     a,
/* 361 */     b;
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 366 */       return l();
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 371 */       return (this == a) ? "upper" : "lower";
/*     */     }
/*     */   }
/*     */   
/*     */   public enum b implements nw {
/* 376 */     a,
/* 377 */     b;
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 382 */       return l();
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 387 */       return (this == a) ? "left" : "right";
/*     */     }
/*     */   }
/*     */   
/*     */   protected static int b(int ☃) {
/* 392 */     return ☃ & 0x7;
/*     */   }
/*     */   
/*     */   public static boolean f(adq ☃, cj cj1) {
/* 396 */     return g(e(☃, cj1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static cq h(adq ☃, cj cj1) {
/* 404 */     return f(e(☃, cj1));
/*     */   }
/*     */   
/*     */   public static cq f(int ☃) {
/* 408 */     return cq.b(☃ & 0x3).f();
/*     */   }
/*     */   
/*     */   protected static boolean g(int ☃) {
/* 412 */     return ((☃ & 0x4) != 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static boolean i(int ☃) {
/* 420 */     return ((☃ & 0x8) != 0);
/*     */   }
/*     */   
/*     */   protected static boolean j(int ☃) {
/* 424 */     return ((☃ & 0x10) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 429 */     return new ama(this, new amo[] { P, a, b, N, O });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */