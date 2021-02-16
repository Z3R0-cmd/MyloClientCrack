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
/*     */ public class aiw
/*     */   extends afh
/*     */ {
/*  20 */   public static final amm<a> a = amm.a("variant", a.class);
/*     */   
/*     */   public aiw() {
/*  23 */     super(arm.e);
/*  24 */     j(this.M.b().a(a, a.a));
/*  25 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  30 */     if (i == a.c.a()) {
/*  31 */       switch (null.a[cq1.k().ordinal()]) {
/*     */         case 1:
/*  33 */           return Q().a(a, a.e);
/*     */         case 2:
/*  35 */           return Q().a(a, a.d);
/*     */       } 
/*     */       
/*  38 */       return Q().a(a, a.c);
/*     */     } 
/*     */ 
/*     */     
/*  42 */     if (i == a.b.a()) {
/*  43 */       return Q().a(a, a.b);
/*     */     }
/*     */     
/*  46 */     return Q().a(a, a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  51 */     a a = ☃.<a>b(a);
/*  52 */     if (a == a.d || a == a.e) {
/*  53 */       return a.c.a();
/*     */     }
/*     */     
/*  56 */     return a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/*  61 */     a a = ☃.<a>b(a);
/*  62 */     if (a == a.d || a == a.e) {
/*  63 */       return new zx(zw.a(this), 1, a.c.a());
/*     */     }
/*  65 */     return super.i(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  70 */     list.add(new zx(☃, 1, a.a.a()));
/*  71 */     list.add(new zx(☃, 1, a.b.a()));
/*  72 */     list.add(new zx(☃, 1, a.c.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  77 */     return arn.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  82 */     return Q().a(a, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  88 */     return ((a)☃.<a>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  93 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/*  97 */     a(0, "default", "default"),
/*  98 */     b(1, "chiseled", "chiseled"),
/*  99 */     c(2, "lines_y", "lines"),
/* 100 */     d(3, "lines_x", "lines"),
/* 101 */     e(4, "lines_z", "lines");
/*     */ 
/*     */     
/*     */     private final int g;
/*     */     
/*     */     private final String h;
/*     */     
/*     */     private final String i;
/*     */     
/* 110 */     private static final a[] f = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/* 112 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 113 */         f[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/* 118 */       this.g = ☃;
/* 119 */       this.h = str1;
/* 120 */       this.i = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/* 124 */       return this.g;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 133 */       return this.i;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 137 */       if (☃ < 0 || ☃ >= f.length) {
/* 138 */         ☃ = 0;
/*     */       }
/* 140 */       return f[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 145 */       return this.h;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */