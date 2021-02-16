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
/*     */ public class akc
/*     */   extends afm
/*     */   implements afj
/*     */ {
/*  25 */   public static final amm<a> a = amm.a("type", a.class);
/*     */   
/*     */   protected akc() {
/*  28 */     super(arm.l);
/*  29 */     j(this.M.b().a(a, a.a));
/*  30 */     float ☃ = 0.4F;
/*  31 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.8F, 0.5F + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int H() {
/*  36 */     return adl.a(0.5D, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(adm ☃, cj cj1, alz alz1) {
/*  41 */     return c(☃.p(cj1.b()).c());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1) {
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h(alz ☃) {
/*  51 */     if (☃.c() != this) {
/*  52 */       return super.h(☃);
/*     */     }
/*     */     
/*  55 */     a a = ☃.<a>b(a);
/*  56 */     if (a == a.a) {
/*  57 */       return 16777215;
/*     */     }
/*     */     
/*  60 */     return adl.a(0.5D, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  65 */     return ☃.b(cj1).b(cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  71 */     if (random.nextInt(8) == 0) {
/*  72 */       return zy.N;
/*     */     }
/*     */     
/*  75 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, Random random) {
/*  80 */     return 1 + random.nextInt(☃ * 2 + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/*  85 */     if (!☃.D && wn1.bZ() != null && wn1.bZ().b() == zy.be) {
/*  86 */       wn1.b(na.ab[afh.a(this)]);
/*     */ 
/*     */       
/*  89 */       a(☃, cj1, new zx(afi.H, 1, ((a)alz1.<a>b(a)).a()));
/*     */     } else {
/*  91 */       super.a(☃, wn1, cj1, alz1, akw1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/*  97 */     alz alz = ☃.p(cj1);
/*  98 */     return alz.c().c(alz);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/* 103 */     for (int i = 1; i < 3; i++) {
/* 104 */       list.add(new zx(☃, 1, i));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 110 */     return (alz1.b(a) != a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 120 */     agi.b b = agi.b.c;
/* 121 */     if (alz1.b(a) == a.c) {
/* 122 */       b = agi.b.d;
/*     */     }
/* 124 */     if (afi.cF.d(☃, cj1)) {
/* 125 */       afi.cF.a(☃, cj1, b, 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 131 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 137 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 142 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 146 */     a(0, "dead_bush"),
/* 147 */     b(1, "tall_grass"),
/* 148 */     c(2, "fern");
/*     */ 
/*     */     
/*     */     private final int e;
/*     */ 
/*     */     
/*     */     private final String f;
/*     */     
/* 156 */     private static final a[] d = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/* 158 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 159 */         d[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1) {
/* 164 */       this.e = ☃;
/* 165 */       this.f = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 169 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 174 */       return this.f;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 178 */       if (☃ < 0 || ☃ >= d.length) {
/* 179 */         ☃ = 0;
/*     */       }
/* 181 */       return d[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 186 */       return this.f;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public afh.a R() {
/* 192 */     return afh.a.c;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */