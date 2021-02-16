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
/*     */ public class aiz
/*     */   extends afh
/*     */ {
/*  15 */   public static final amm<a> a = amm.a("type", a.class);
/*     */   
/*     */   public aiz() {
/*  18 */     super(arm.e, ajh.a.b.c());
/*  19 */     j(this.M.b().a(a, a.a));
/*  20 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  25 */     return ((a)☃.<a>b(a)).a();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  30 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  31 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  37 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  43 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  48 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  52 */     a(0, "red_sandstone", "default"),
/*  53 */     b(1, "chiseled_red_sandstone", "chiseled"),
/*  54 */     c(2, "smooth_red_sandstone", "smooth");
/*     */ 
/*     */     
/*     */     private final int e;
/*     */     
/*     */     private final String f;
/*     */     
/*     */     private final String g;
/*     */     
/*  63 */     private static final a[] d = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/*  65 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  66 */         d[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/*  71 */       this.e = ☃;
/*  72 */       this.f = str1;
/*  73 */       this.g = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/*  77 */       return this.e;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/*  86 */       return this.f;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/*  90 */       if (☃ < 0 || ☃ >= d.length) {
/*  91 */         ☃ = 0;
/*     */       }
/*  93 */       return d[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/*  98 */       return this.f;
/*     */     }
/*     */     
/*     */     public String c() {
/* 102 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */