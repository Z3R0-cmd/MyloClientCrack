/*     */ import com.google.common.base.Objects;
/*     */ import com.google.common.cache.LoadingCache;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   private final cj a;
/*     */   private final cq b;
/*     */   private final cq c;
/*     */   private final LoadingCache<cj, amc> d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final int g;
/*     */   
/*     */   public b(cj ☃, cq cq1, cq cq2, LoadingCache<cj, amc> loadingCache, int i, int j, int k) {
/* 146 */     this.a = ☃;
/* 147 */     this.b = cq1;
/* 148 */     this.c = cq2;
/* 149 */     this.d = loadingCache;
/* 150 */     this.e = i;
/* 151 */     this.f = j;
/* 152 */     this.g = k;
/*     */   }
/*     */   
/*     */   public cj a() {
/* 156 */     return this.a;
/*     */   }
/*     */   
/*     */   public cq b() {
/* 160 */     return this.b;
/*     */   }
/*     */   
/*     */   public cq c() {
/* 164 */     return this.c;
/*     */   }
/*     */   
/*     */   public int d() {
/* 168 */     return this.e;
/*     */   }
/*     */   
/*     */   public int e() {
/* 172 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public amc a(int ☃, int i, int j) {
/* 180 */     return (amc)this.d.getUnchecked(amd.a(this.a, b(), c(), ☃, i, j));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 185 */     return Objects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amd$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */