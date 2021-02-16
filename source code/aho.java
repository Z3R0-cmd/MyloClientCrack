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
/*     */ 
/*     */ public class aho
/*     */   extends afh
/*     */ {
/*  19 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*     */   private final afh b;
/*     */   
/*     */   public aho(arm ☃, arn arn1, afh afh1) {
/*  24 */     super(☃, arn1);
/*  25 */     j(this.M.b().a(a, a.l));
/*  26 */     this.b = afh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  31 */     return Math.max(0, ☃.nextInt(10) - 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  36 */     switch (null.a[((a)☃.b((amo)a)).ordinal()]) {
/*     */       case 1:
/*  38 */         return arn.e;
/*     */       case 2:
/*  40 */         return arn.d;
/*     */       case 3:
/*  42 */         return arn.d;
/*     */     } 
/*  44 */     return super.g(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  51 */     return zw.a(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  56 */     return zw.a(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  61 */     return Q();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  66 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  72 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  77 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  81 */     a(1, "north_west"),
/*  82 */     b(2, "north"),
/*  83 */     c(3, "north_east"),
/*  84 */     d(4, "west"),
/*  85 */     e(5, "center"),
/*  86 */     f(6, "east"),
/*  87 */     g(7, "south_west"),
/*  88 */     h(8, "south"),
/*  89 */     i(9, "south_east"),
/*  90 */     j(10, "stem"),
/*  91 */     k(0, "all_inside"),
/*  92 */     l(14, "all_outside"),
/*  93 */     m(15, "all_stem");
/*     */ 
/*     */     
/*     */     private final int o;
/*     */     
/*     */     private final String p;
/*     */     
/* 100 */     private static final a[] n = new a[16]; static { a[] ☃;
/*     */       int i, j;
/* 102 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 103 */         n[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1) {
/* 108 */       this.o = ☃;
/* 109 */       this.p = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 113 */       return this.o;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 122 */       return this.p;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 126 */       if (☃ < 0 || ☃ >= n.length) {
/* 127 */         ☃ = 0;
/*     */       }
/* 129 */       a a1 = n[☃];
/* 130 */       return (a1 == null) ? n[0] : a1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 135 */       return this.p;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */