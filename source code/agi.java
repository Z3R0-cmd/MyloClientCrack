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
/*     */ public class agi
/*     */   extends afm
/*     */   implements afj
/*     */ {
/*  27 */   public static final amm<b> a = amm.a("variant", b.class);
/*  28 */   public static final amm<a> b = amm.a("half", a.class);
/*  29 */   public static final amm<cq> N = age.O;
/*     */   
/*     */   public agi() {
/*  32 */     super(arm.l);
/*  33 */     j(this.M.b().<b, b>a(a, b.a).<a, a>a(b, a.b).a(N, cq.c));
/*  34 */     c(0.0F);
/*  35 */     a(h);
/*  36 */     c("doublePlant");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  41 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public b e(adq ☃, cj cj1) {
/*  45 */     alz alz = ☃.p(cj1);
/*     */     
/*  47 */     if (alz.c() == this) {
/*  48 */       alz = a(alz, ☃, cj1);
/*     */       
/*  50 */       return alz.<b>b(a);
/*     */     } 
/*     */     
/*  53 */     return b.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  58 */     return (super.d(☃, cj1) && ☃.d(cj1.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1) {
/*  63 */     alz alz = ☃.p(cj1);
/*  64 */     if (alz.c() == this) {
/*  65 */       b b = a(alz, ☃, cj1).<b>b(a);
/*  66 */       return (b == b.d || b == b.c);
/*     */     } 
/*  68 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e(adm ☃, cj cj1, alz alz1) {
/*  73 */     if (f(☃, cj1, alz1)) {
/*     */       return;
/*     */     }
/*     */     
/*  77 */     boolean bool = (alz1.b(b) == a.a);
/*  78 */     cj cj2 = bool ? cj1 : cj1.a();
/*  79 */     cj cj3 = bool ? cj1.b() : cj1;
/*     */     
/*  81 */     afh afh1 = bool ? this : ☃.p(cj2).c();
/*  82 */     afh afh2 = bool ? ☃.p(cj3).c() : this;
/*     */     
/*  84 */     if (afh1 == this) {
/*  85 */       ☃.a(cj2, afi.a.Q(), 2);
/*     */     }
/*  87 */     if (afh2 == this) {
/*  88 */       ☃.a(cj3, afi.a.Q(), 3);
/*  89 */       if (!bool) {
/*  90 */         b(☃, cj3, alz1, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(adm ☃, cj cj1, alz alz1) {
/*  97 */     if (alz1.b(b) == a.a) {
/*  98 */       return (☃.p(cj1.b()).c() == this);
/*     */     }
/*     */     
/* 101 */     alz alz2 = ☃.p(cj1.a());
/* 102 */     return (alz2.c() == this && super.f(☃, cj1, alz2));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 108 */     if (☃.b(b) == a.a) {
/* 109 */       return null;
/*     */     }
/* 111 */     b b = ☃.<b>b(a);
/* 112 */     if (b == b.d)
/*     */     {
/* 114 */       return null;
/*     */     }
/*     */     
/* 117 */     if (b == b.c) {
/* 118 */       if (random.nextInt(8) == 0) {
/* 119 */         return zy.N;
/*     */       }
/* 121 */       return null;
/*     */     } 
/* 123 */     return zw.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 128 */     if (☃.b(b) == a.a || ☃.b(a) == b.c) {
/* 129 */       return 0;
/*     */     }
/* 131 */     return ((b)☃.<b>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/* 136 */     b b = e(☃, cj1);
/* 137 */     if (b == b.c || b == b.d) {
/* 138 */       return aea.a(☃, cj1);
/*     */     }
/* 140 */     return 16777215;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, b b1, int i) {
/* 144 */     ☃.a(cj1, Q().<a, a>a(b, a.b).a(a, b1), i);
/* 145 */     ☃.a(cj1.a(), Q().a(b, a.a), i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/* 150 */     ☃.a(cj1.a(), Q().a(b, a.a), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 155 */     if (!☃.D && wn1.bZ() != null && wn1.bZ().b() == zy.be)
/*     */     {
/*     */ 
/*     */       
/* 159 */       if (alz1.b(b) == a.b && 
/* 160 */         b(☃, cj1, alz1, wn1)) {
/*     */         return;
/*     */       }
/*     */     }
/*     */     
/* 165 */     super.a(☃, wn1, cj1, alz1, akw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 170 */     if (alz1.b(b) == a.a) {
/* 171 */       if (☃.p(cj1.b()).c() == this) {
/* 172 */         if (!wn1.bA.d) {
/*     */           
/* 174 */           alz alz2 = ☃.p(cj1.b());
/* 175 */           b b = alz2.<b>b(a);
/* 176 */           if (b == b.d || b == b.c) {
/* 177 */             if (!☃.D) {
/* 178 */               if (wn1.bZ() != null && wn1.bZ().b() == zy.be) {
/* 179 */                 b(☃, cj1, alz2, wn1);
/* 180 */                 ☃.g(cj1.b());
/*     */               } else {
/* 182 */                 ☃.b(cj1.b(), true);
/*     */               } 
/*     */             } else {
/* 185 */               ☃.g(cj1.b());
/*     */             } 
/*     */           } else {
/* 188 */             ☃.b(cj1.b(), true);
/*     */           } 
/*     */         } else {
/* 191 */           ☃.g(cj1.b());
/*     */         }
/*     */       
/*     */       }
/* 195 */     } else if (wn1.bA.d && ☃.p(cj1.a()).c() == this) {
/*     */       
/* 197 */       ☃.a(cj1.a(), afi.a.Q(), 2);
/*     */     } 
/*     */     
/* 200 */     super.a(☃, cj1, alz1, wn1);
/*     */   }
/*     */   
/*     */   private boolean b(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 204 */     b b = alz1.<b>b(a);
/* 205 */     if (b == b.d || b == b.c) {
/* 206 */       wn1.b(na.ab[afh.a(this)]);
/*     */       
/* 208 */       int i = ((b == b.c) ? akc.a.b : akc.a.c).a();
/* 209 */       a(☃, cj1, new zx(afi.H, 2, i));
/* 210 */       return true;
/*     */     } 
/* 212 */     return false;
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     b[] arrayOfB;
/*     */     int i;
/*     */     int j;
/* 217 */     for (arrayOfB = b.values(), i = arrayOfB.length, j = 0; j < i; ) { b b = arrayOfB[j];
/* 218 */       list.add(new zx(☃, 1, b.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/* 224 */     return e(☃, cj1).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 229 */     b b = e(☃, cj1);
/*     */     
/* 231 */     return (b != b.c && b != b.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/* 236 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 241 */     a(☃, cj1, new zx(this, 1, e(☃, cj1).a()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 250 */     if ((☃ & 0x8) > 0) {
/* 251 */       return Q().a(b, a.a);
/*     */     }
/*     */     
/* 254 */     return Q().<a, a>a(b, a.b).a(a, b.a(☃ & 0x7));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 262 */     if (☃.b(b) == a.a) {
/* 263 */       alz alz1 = adq1.p(cj1.b());
/* 264 */       if (alz1.c() == this) {
/* 265 */         ☃ = ☃.a(a, alz1.b(a));
/*     */       }
/*     */     } 
/*     */     
/* 269 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 274 */     if (☃.b(b) == a.a) {
/* 275 */       return 0x8 | ((cq)☃.<cq>b(N)).b();
/*     */     }
/* 277 */     return ((b)☃.<b>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 282 */     return new ama(this, new amo[] { b, a, N });
/*     */   }
/*     */   
/*     */   public enum b implements nw {
/* 286 */     a(0, "sunflower"),
/* 287 */     b(1, "syringa"),
/* 288 */     c(2, "double_grass", "grass"),
/* 289 */     d(3, "double_fern", "fern"),
/* 290 */     e(4, "double_rose", "rose"),
/* 291 */     f(5, "paeonia");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 300 */     private static final b[] g = new b[(values()).length]; static { b[] ☃;
/*     */       int i, j;
/* 302 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { b b1 = ☃[j];
/* 303 */         g[b1.a()] = b1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final int h;
/*     */     private final String i;
/*     */     private final String j;
/*     */     
/*     */     b(int ☃, String str1, String str2) {
/* 312 */       this.h = ☃;
/* 313 */       this.i = str1;
/* 314 */       this.j = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/* 318 */       return this.h;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 327 */       return this.i;
/*     */     }
/*     */     
/*     */     public static b a(int ☃) {
/* 331 */       if (☃ < 0 || ☃ >= g.length) {
/* 332 */         ☃ = 0;
/*     */       }
/* 334 */       return g[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 339 */       return this.i;
/*     */     }
/*     */     
/*     */     public String c() {
/* 343 */       return this.j;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 348 */     a,
/* 349 */     b;
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 354 */       return l();
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 359 */       return (this == a) ? "upper" : "lower";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public afh.a R() {
/* 365 */     return afh.a.b;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */