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
/*     */ public class aiu
/*     */   extends afh
/*     */ {
/*  17 */   public static final amm<a> a = amm.a("variant", a.class);
/*  18 */   public static final int b = a.a.a();
/*  19 */   public static final int N = a.b.a();
/*  20 */   public static final int O = a.c.a();
/*     */   
/*     */   public aiu() {
/*  23 */     super(arm.e);
/*  24 */     j(this.M.b().a(a, a.a));
/*  25 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  30 */     return di.a(a() + "." + a.a.c() + ".name");
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  35 */     if (☃.b(a) == a.a) {
/*  36 */       return arn.y;
/*     */     }
/*  38 */     return arn.G;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  43 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  48 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  53 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  58 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  63 */     list.add(new zx(☃, 1, b));
/*  64 */     list.add(new zx(☃, 1, N));
/*  65 */     list.add(new zx(☃, 1, O));
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  69 */     a(0, "prismarine", "rough"),
/*  70 */     b(1, "prismarine_bricks", "bricks"),
/*  71 */     c(2, "dark_prismarine", "dark");
/*     */     
/*     */     private final int e;
/*     */     
/*     */     private final String f;
/*     */     
/*     */     private final String g;
/*     */     
/*  79 */     private static final a[] d = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/*  81 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  82 */         d[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/*  87 */       this.e = ☃;
/*  88 */       this.f = str1;
/*  89 */       this.g = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/*  93 */       return this.e;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 102 */       return this.f;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 106 */       if (☃ < 0 || ☃ >= d.length) {
/* 107 */         ☃ = 0;
/*     */       }
/* 109 */       return d[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 114 */       return this.f;
/*     */     }
/*     */     
/*     */     public String c() {
/* 118 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */