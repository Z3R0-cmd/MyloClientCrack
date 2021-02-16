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
/*     */ public class ajy
/*     */   extends afh
/*     */ {
/*  19 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*     */   public ajy() {
/*  22 */     super(arm.e);
/*  23 */     j(this.M.b().a(a, a.a));
/*  24 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  29 */     return di.a(a() + "." + a.a.d() + ".name");
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  34 */     return ((a)☃.<a>b(a)).c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  40 */     if (☃.b(a) == a.a) {
/*  41 */       return zw.a(afi.e);
/*     */     }
/*  43 */     return zw.a(afi.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  48 */     return ((a)☃.<a>b(a)).a();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  53 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  54 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  60 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  66 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  71 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  75 */     a(0, arn.m, "stone"),
/*  76 */     b(1, arn.l, "granite"),
/*  77 */     c(2, arn.l, "smooth_granite", (arn)"graniteSmooth"),
/*  78 */     d(3, arn.p, "diorite"),
/*  79 */     e(4, arn.p, "smooth_diorite", (arn)"dioriteSmooth"),
/*  80 */     f(5, arn.m, "andesite"),
/*  81 */     g(6, arn.m, "smooth_andesite", (arn)"andesiteSmooth");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     private static final a[] h = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/*  93 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  94 */         h[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final int i;
/*     */     private final String j;
/*     */     private final String k;
/*     */     private final arn l;
/*     */     
/*     */     a(int ☃, arn arn1, String str1, String str2) {
/* 104 */       this.i = ☃;
/* 105 */       this.j = str1;
/* 106 */       this.k = str2;
/* 107 */       this.l = arn1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 111 */       return this.i;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public arn c() {
/* 119 */       return this.l;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 124 */       return this.j;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 128 */       if (☃ < 0 || ☃ >= h.length) {
/* 129 */         ☃ = 0;
/*     */       }
/* 131 */       return h[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 136 */       return this.j;
/*     */     }
/*     */     
/*     */     public String d() {
/* 140 */       return this.k;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */