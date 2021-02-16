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
/*     */ public class ajh
/*     */   extends agr
/*     */ {
/*  15 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*     */   public ajh() {
/*  18 */     j(this.M.b().a(a, a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  23 */     return ((a)☃.<a>b(a)).a();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  28 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  29 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public arn g(alz ☃) {
/*  35 */     return ((a)☃.<a>b(a)).c();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  40 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  46 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  51 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  55 */     a(0, "sand", "default", (String)arn.d),
/*  56 */     b(1, "red_sand", "red", (String)arn.q);
/*     */     
/*     */     private final int d;
/*     */     
/*     */     private final String e;
/*     */     
/*     */     private final arn f;
/*     */     
/*     */     private final String g;
/*     */     
/*  66 */     private static final a[] c = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/*  68 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  69 */         c[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2, arn arn1) {
/*  74 */       this.d = ☃;
/*  75 */       this.e = str1;
/*  76 */       this.f = arn1;
/*  77 */       this.g = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/*  81 */       return this.d;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/*  90 */       return this.e;
/*     */     }
/*     */     
/*     */     public arn c() {
/*  94 */       return this.f;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/*  98 */       if (☃ < 0 || ☃ >= c.length) {
/*  99 */         ☃ = 0;
/*     */       }
/* 101 */       return c[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 106 */       return this.e;
/*     */     }
/*     */     
/*     */     public String d() {
/* 110 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */