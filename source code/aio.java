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
/*     */ public class aio
/*     */   extends afh
/*     */ {
/*  16 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*     */   public aio() {
/*  19 */     super(arm.d);
/*  20 */     j(this.M.b().a(a, a.a));
/*  21 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  26 */     return ((a)☃.<a>b(a)).a();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  31 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  32 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  38 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  44 */     return ((a)☃.<a>b(a)).c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  49 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  54 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  58 */     a(0, "oak", arn.o),
/*  59 */     b(1, "spruce", arn.J),
/*  60 */     c(2, "birch", arn.d),
/*  61 */     d(3, "jungle", arn.l),
/*  62 */     e(4, "acacia", arn.q),
/*  63 */     f(5, "dark_oak", "big_oak", (String)arn.B);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     private static final a[] g = new a[(values()).length]; private final int h; static { a[] ☃;
/*     */       int i, j;
/*  75 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  76 */         g[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final String i;
/*     */     private final String j;
/*     */     private final arn k;
/*     */     
/*     */     a(int ☃, String str1, String str2, arn arn1) {
/*  85 */       this.h = ☃;
/*  86 */       this.i = str1;
/*  87 */       this.j = str2;
/*  88 */       this.k = arn1;
/*     */     }
/*     */     
/*     */     public int a() {
/*  92 */       return this.h;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public arn c() {
/* 100 */       return this.k;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 105 */       return this.i;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 109 */       if (☃ < 0 || ☃ >= g.length) {
/* 110 */         ☃ = 0;
/*     */       }
/* 112 */       return g[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 117 */       return this.i;
/*     */     }
/*     */     
/*     */     public String d() {
/* 121 */       return this.j;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */