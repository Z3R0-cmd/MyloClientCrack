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
/*     */ public class aji
/*     */   extends afh
/*     */ {
/*  16 */   public static final amm<a> a = amm.a("type", a.class);
/*     */   
/*     */   public aji() {
/*  19 */     super(arm.e);
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
/*     */   public arn g(alz ☃) {
/*  38 */     return arn.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  43 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
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
/*  58 */     a(0, "sandstone", "default"),
/*  59 */     b(1, "chiseled_sandstone", "chiseled"),
/*  60 */     c(2, "smooth_sandstone", "smooth");
/*     */ 
/*     */     
/*     */     private final int e;
/*     */     
/*     */     private final String f;
/*     */     
/*     */     private final String g;
/*     */     
/*  69 */     private static final a[] d = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/*  71 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  72 */         d[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/*  77 */       this.e = ☃;
/*  78 */       this.f = str1;
/*  79 */       this.g = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/*  83 */       return this.e;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/*  92 */       return this.f;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/*  96 */       if (☃ < 0 || ☃ >= d.length) {
/*  97 */         ☃ = 0;
/*     */       }
/*  99 */       return d[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 104 */       return this.f;
/*     */     }
/*     */     
/*     */     public String c() {
/* 108 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */