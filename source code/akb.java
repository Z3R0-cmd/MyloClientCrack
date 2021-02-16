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
/*     */ public abstract class akb
/*     */   extends ahh
/*     */ {
/*  22 */   public static final amk b = amk.a("seamless");
/*  23 */   public static final amm<a> N = amm.a("variant", a.class);
/*     */   
/*     */   public akb() {
/*  26 */     super(arm.e);
/*  27 */     alz ☃ = this.M.b();
/*  28 */     if (l()) {
/*  29 */       ☃ = ☃.a(b, Boolean.valueOf(false));
/*     */     } else {
/*  31 */       ☃ = ☃.a(a, ahh.a.b);
/*     */     } 
/*  33 */     j(☃.a(N, a.a));
/*  34 */     a(yz.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  40 */     return zw.a(afi.U);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  45 */     return zw.a(afi.U);
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(int ☃) {
/*  50 */     return a() + "." + a.a(☃).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public amo<?> n() {
/*  55 */     return N;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object a(zx ☃) {
/*  60 */     return a.a(☃.i() & 0x7);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  65 */     if (☃ == zw.a(afi.T))
/*     */       return;  a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  69 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  70 */       if (a != a.c)
/*     */       {
/*     */         
/*  73 */         list.add(new zx(☃, 1, a.a())); } 
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  79 */     alz alz = Q().a(N, a.a(☃ & 0x7));
/*     */     
/*  81 */     if (l()) {
/*  82 */       alz = alz.a(b, Boolean.valueOf(((☃ & 0x8) != 0)));
/*     */     } else {
/*  84 */       alz = alz.a(a, ((☃ & 0x8) == 0) ? ahh.a.b : ahh.a.a);
/*     */     } 
/*     */     
/*  87 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  92 */     int i = 0;
/*     */     
/*  94 */     i |= ((a)☃.<a>b(N)).a();
/*     */     
/*  96 */     if (l()) {
/*  97 */       if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/*  98 */         i |= 0x8;
/*     */       }
/*     */     }
/* 101 */     else if (☃.b(a) == ahh.a.a) {
/* 102 */       i |= 0x8;
/*     */     } 
/*     */ 
/*     */     
/* 106 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 111 */     if (l()) {
/* 112 */       return new ama(this, new amo[] { b, N });
/*     */     }
/*     */     
/* 115 */     return new ama(this, new amo[] { a, N });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 120 */     return ((a)☃.<a>b(N)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/* 125 */     return ((a)☃.<a>b(N)).c();
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 129 */     a(0, arn.m, "stone"),
/* 130 */     b(1, arn.d, "sandstone", (arn)"sand"),
/* 131 */     c(2, arn.o, "wood_old", (arn)"wood"),
/* 132 */     d(3, arn.m, "cobblestone", (arn)"cobble"),
/* 133 */     e(4, arn.D, "brick"),
/* 134 */     f(5, arn.m, "stone_brick", (arn)"smoothStoneBrick"),
/* 135 */     g(6, arn.K, "nether_brick", (arn)"netherBrick"),
/* 136 */     h(7, arn.p, "quartz");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     private static final a[] i = new a[(values()).length]; private final int j; static { a[] ☃;
/*     */       int i, j;
/* 148 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 149 */         i[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final arn k;
/*     */     private final String l;
/*     */     private final String m;
/*     */     
/*     */     a(int ☃, arn arn1, String str1, String str2) {
/* 158 */       this.j = ☃;
/* 159 */       this.k = arn1;
/* 160 */       this.l = str1;
/* 161 */       this.m = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/* 165 */       return this.j;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public arn c() {
/* 173 */       return this.k;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 178 */       return this.l;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 182 */       if (☃ < 0 || ☃ >= i.length) {
/* 183 */         ☃ = 0;
/*     */       }
/* 185 */       return i[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 190 */       return this.l;
/*     */     }
/*     */     
/*     */     public String d() {
/* 194 */       return this.m;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */