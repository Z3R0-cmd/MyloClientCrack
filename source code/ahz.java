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
/*     */ public class ahz
/*     */   extends afh
/*     */ {
/*  20 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*     */   public ahz() {
/*  23 */     super(arm.B);
/*  24 */     j(this.M.b().a(a, a.a));
/*  25 */     c(0.0F);
/*  26 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public static boolean d(alz ☃) {
/*  35 */     afh afh1 = ☃.c();
/*     */     
/*  37 */     return (☃ == afi.b.Q().a(ajy.a, ajy.a.a) || afh1 == afi.e || afh1 == afi.bf);
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/*  42 */     switch (null.a[((a)☃.b((amo)a)).ordinal()]) {
/*     */       case 1:
/*  44 */         return new zx(afi.e);
/*     */       case 2:
/*  46 */         return new zx(afi.bf);
/*     */       case 3:
/*  48 */         return new zx(afi.bf, 1, ajz.a.b.a());
/*     */       case 4:
/*  50 */         return new zx(afi.bf, 1, ajz.a.c.a());
/*     */       case 5:
/*  52 */         return new zx(afi.bf, 1, ajz.a.d.a());
/*     */     } 
/*  54 */     return new zx(afi.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/*  60 */     if (!☃.D && ☃.Q().b("doTileDrops")) {
/*  61 */       vz vz = new vz(☃);
/*  62 */       vz.b(cj1.n() + 0.5D, cj1.o(), cj1.p() + 0.5D, 0.0F, 0.0F);
/*  63 */       ☃.d(vz);
/*     */       
/*  65 */       vz.y();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/*  71 */     alz alz = ☃.p(cj1);
/*  72 */     return alz.c().c(alz);
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  77 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  78 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  84 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  90 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  95 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a
/*     */     implements nw {
/* 100 */     a(0, "stone")
/*     */     {
/*     */       public alz d() {
/* 103 */         return afi.b.Q().a(ajy.a, ajy.a.a);
/*     */       }
/*     */     },
/* 106 */     b(1, "cobblestone", "cobble")
/*     */     {
/*     */       public alz d() {
/* 109 */         return afi.e.Q();
/*     */       }
/*     */     },
/* 112 */     c(2, "stone_brick", "brick")
/*     */     {
/*     */       public alz d() {
/* 115 */         return afi.bf.Q().a(ajz.a, ajz.a.a);
/*     */       }
/*     */     },
/* 118 */     d(3, "mossy_brick", "mossybrick")
/*     */     {
/*     */       public alz d() {
/* 121 */         return afi.bf.Q().a(ajz.a, ajz.a.b);
/*     */       }
/*     */     },
/* 124 */     e(4, "cracked_brick", "crackedbrick")
/*     */     {
/*     */       public alz d() {
/* 127 */         return afi.bf.Q().a(ajz.a, ajz.a.c);
/*     */       }
/*     */     },
/* 130 */     f(5, "chiseled_brick", "chiseledbrick")
/*     */     {
/*     */       public alz d() {
/* 133 */         return afi.bf.Q().a(ajz.a, ajz.a.d);
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     private static final a[] g = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/* 146 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 147 */         g[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final int h;
/*     */     private final String i;
/*     */     private final String j;
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/* 156 */       this.h = ☃;
/* 157 */       this.i = str1;
/* 158 */       this.j = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/* 162 */       return this.h;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 171 */       return this.i;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 175 */       if (☃ < 0 || ☃ >= g.length) {
/* 176 */         ☃ = 0;
/*     */       }
/* 178 */       return g[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 183 */       return this.i;
/*     */     }
/*     */     
/*     */     public String c() {
/* 187 */       return this.j;
/*     */     }
/*     */     public static a a(alz ☃) {
/*     */       a[] arrayOfA;
/*     */       int i;
/*     */       int j;
/* 193 */       for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 194 */         if (☃ == a1.d()) {
/* 195 */           return a1;
/*     */         }
/*     */         j++; }
/*     */       
/* 199 */       return a;
/*     */     }
/*     */     
/*     */     public abstract alz d();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */