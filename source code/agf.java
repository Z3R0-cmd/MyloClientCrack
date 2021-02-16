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
/*     */ public class agf
/*     */   extends afh
/*     */ {
/*  20 */   public static final amm<a> a = amm.a("variant", a.class);
/*  21 */   public static final amk b = amk.a("snowy");
/*     */   
/*     */   protected agf() {
/*  24 */     super(arm.c);
/*  25 */     j(this.M.b().<a, a>a(a, a.a).a(b, Boolean.valueOf(false)));
/*  26 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  31 */     return ((a)☃.<a>b(a)).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  36 */     if (☃.b(a) == a.c) {
/*  37 */       afh afh1 = adq1.p(cj1.a()).c();
/*  38 */       ☃ = ☃.a(b, Boolean.valueOf((afh1 == afi.aJ || afh1 == afi.aH)));
/*     */     } 
/*  40 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  45 */     list.add(new zx(this, 1, a.a.a()));
/*  46 */     list.add(new zx(this, 1, a.b.a()));
/*  47 */     list.add(new zx(this, 1, a.c.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/*  52 */     alz alz = ☃.p(cj1);
/*  53 */     if (alz.c() != this) {
/*  54 */       return 0;
/*     */     }
/*  56 */     return ((a)alz.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  61 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  67 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  72 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  77 */     a a = ☃.<a>b(a);
/*  78 */     if (a == a.c) {
/*  79 */       a = a.a;
/*     */     }
/*  81 */     return a.a();
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  85 */     a(0, "dirt", "default", (String)arn.l),
/*  86 */     b(1, "coarse_dirt", "coarse", (String)arn.l),
/*  87 */     c(2, "podzol", arn.J);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     private static final a[] d = new a[(values()).length]; private final int e; static { a[] ☃;
/*     */       int i, j;
/*  99 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 100 */         d[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final String f;
/*     */     private final String g;
/*     */     private final arn h;
/*     */     
/*     */     a(int ☃, String str1, String str2, arn arn1) {
/* 109 */       this.e = ☃;
/* 110 */       this.f = str1;
/* 111 */       this.g = str2;
/* 112 */       this.h = arn1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 116 */       return this.e;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String c() {
/* 124 */       return this.g;
/*     */     }
/*     */     
/*     */     public arn d() {
/* 128 */       return this.h;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 133 */       return this.f;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 137 */       if (☃ < 0 || ☃ >= d.length) {
/* 138 */         ☃ = 0;
/*     */       }
/* 140 */       return d[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 145 */       return this.f;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */