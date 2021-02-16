/*     */ import com.google.common.base.Objects;
/*     */ import com.google.common.base.Predicate;
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amd
/*     */ {
/*     */   private final Predicate<amc>[][][] a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   
/*     */   public amd(Predicate<amc>[][][] ☃) {
/*  22 */     this.a = ☃;
/*     */     
/*  24 */     this.b = ☃.length;
/*     */     
/*  26 */     if (this.b > 0) {
/*  27 */       this.c = (☃[0]).length;
/*     */       
/*  29 */       if (this.c > 0) {
/*  30 */         this.d = (☃[0][0]).length;
/*     */       } else {
/*  32 */         this.d = 0;
/*     */       } 
/*     */     } else {
/*  35 */       this.c = 0;
/*  36 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/*  45 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/*  49 */     return this.d;
/*     */   }
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
/*     */   private b a(cj ☃, cq cq1, cq cq2, LoadingCache<cj, amc> loadingCache) {
/*  64 */     for (int i = 0; i < this.d; i++) {
/*  65 */       for (int j = 0; j < this.c; j++) {
/*  66 */         for (int k = 0; k < this.b; k++) {
/*  67 */           if (!this.a[k][j][i].apply(loadingCache.getUnchecked(a(☃, cq1, cq2, i, j, k)))) {
/*  68 */             return null;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     return new b(☃, cq1, cq2, loadingCache, this.d, this.c, this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public b a(adm ☃, cj cj1) {
/*  79 */     LoadingCache<cj, amc> loadingCache = a(☃, false);
/*     */     
/*  81 */     int i = Math.max(Math.max(this.d, this.c), this.b);
/*     */     
/*  83 */     for (Iterator<cj> iterator = cj.a(cj1, cj1.a(i - 1, i - 1, i - 1)).iterator(); iterator.hasNext(); ) { cj cj2 = iterator.next(); cq[] arrayOfCq; int j, k;
/*  84 */       for (arrayOfCq = cq.values(), j = arrayOfCq.length, k = 0; k < j; ) { cq cq = arrayOfCq[k]; cq[] arrayOfCq1; int m, n;
/*  85 */         for (arrayOfCq1 = cq.values(), m = arrayOfCq1.length, n = 0; n < m; ) { cq cq1 = arrayOfCq1[n];
/*  86 */           if (cq1 != cq && cq1 != cq.d()) {
/*     */ 
/*     */ 
/*     */             
/*  90 */             b b = a(cj2, cq, cq1, loadingCache);
/*  91 */             if (b != null)
/*  92 */               return b; 
/*     */           }  n++; }
/*     */         
/*     */         k++; }
/*     */        }
/*     */     
/*  98 */     return null;
/*     */   }
/*     */   
/*     */   public static LoadingCache<cj, amc> a(adm ☃, boolean bool) {
/* 102 */     return CacheBuilder.newBuilder().build(new a(☃, bool));
/*     */   }
/*     */   
/*     */   protected static cj a(cj ☃, cq cq1, cq cq2, int i, int j, int k) {
/* 106 */     if (cq1 == cq2 || cq1 == cq2.d()) {
/* 107 */       throw new IllegalArgumentException("Invalid forwards & up combination");
/*     */     }
/*     */     
/* 110 */     df df1 = new df(cq1.g(), cq1.h(), cq1.i());
/* 111 */     df df2 = new df(cq2.g(), cq2.h(), cq2.i());
/* 112 */     df df3 = df1.d(df2);
/*     */     
/* 114 */     return ☃.a(df2.n() * -j + df3.n() * i + df1.n() * k, df2.o() * -j + df3.o() * i + df1.o() * k, df2.p() * -j + df3.p() * i + df1.p() * k);
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */     extends CacheLoader<cj, amc>
/*     */   {
/*     */     private final adm a;
/*     */     
/*     */     private final boolean b;
/*     */     
/*     */     public a(adm ☃, boolean bool) {
/* 126 */       this.a = ☃;
/* 127 */       this.b = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public amc a(cj ☃) throws Exception {
/* 132 */       return new amc(this.a, ☃, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final cj a;
/*     */     private final cq b;
/*     */     private final cq c;
/*     */     private final LoadingCache<cj, amc> d;
/*     */     private final int e;
/*     */     private final int f;
/*     */     private final int g;
/*     */     
/*     */     public b(cj ☃, cq cq1, cq cq2, LoadingCache<cj, amc> loadingCache, int i, int j, int k) {
/* 146 */       this.a = ☃;
/* 147 */       this.b = cq1;
/* 148 */       this.c = cq2;
/* 149 */       this.d = loadingCache;
/* 150 */       this.e = i;
/* 151 */       this.f = j;
/* 152 */       this.g = k;
/*     */     }
/*     */     
/*     */     public cj a() {
/* 156 */       return this.a;
/*     */     }
/*     */     
/*     */     public cq b() {
/* 160 */       return this.b;
/*     */     }
/*     */     
/*     */     public cq c() {
/* 164 */       return this.c;
/*     */     }
/*     */     
/*     */     public int d() {
/* 168 */       return this.e;
/*     */     }
/*     */     
/*     */     public int e() {
/* 172 */       return this.f;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public amc a(int ☃, int i, int j) {
/* 180 */       return (amc)this.d.getUnchecked(amd.a(this.a, b(), c(), ☃, i, j));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 185 */       return Objects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */