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
/*     */ public class ajz
/*     */   extends afh
/*     */ {
/*  15 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*  17 */   public static final int b = a.a.a();
/*  18 */   public static final int N = a.b.a();
/*  19 */   public static final int O = a.c.a();
/*  20 */   public static final int P = a.d.a();
/*     */   
/*     */   public ajz() {
/*  23 */     super(arm.e);
/*  24 */     j(this.M.b().a(a, a.a));
/*  25 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  30 */     return ((a)☃.<a>b(a)).a();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  35 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  36 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  42 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
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
/*     */   public enum a implements nw {
/*  57 */     a(0, "stonebrick", "default"),
/*  58 */     b(1, "mossy_stonebrick", "mossy"),
/*  59 */     c(2, "cracked_stonebrick", "cracked"),
/*  60 */     d(3, "chiseled_stonebrick", "chiseled");
/*     */ 
/*     */     
/*     */     private final int f;
/*     */     
/*     */     private final String g;
/*     */     
/*     */     private final String h;
/*     */     
/*  69 */     private static final a[] e = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/*  71 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  72 */         e[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/*  77 */       this.f = ☃;
/*  78 */       this.g = str1;
/*  79 */       this.h = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/*  83 */       return this.f;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/*  92 */       return this.g;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/*  96 */       if (☃ < 0 || ☃ >= e.length) {
/*  97 */         ☃ = 0;
/*     */       }
/*  99 */       return e[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 104 */       return this.g;
/*     */     }
/*     */     
/*     */     public String c() {
/* 108 */       return this.h;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */