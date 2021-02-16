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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akl
/*     */   extends afh
/*     */ {
/*  23 */   public static final amk a = amk.a("up");
/*  24 */   public static final amk b = amk.a("north");
/*  25 */   public static final amk N = amk.a("east");
/*  26 */   public static final amk O = amk.a("south");
/*  27 */   public static final amk P = amk.a("west");
/*  28 */   public static final amm<a> Q = amm.a("variant", a.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public akl(afh ☃) {
/*  36 */     super(☃.J);
/*  37 */     j(this.M.b().<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).<Comparable, Boolean>a(O, Boolean.valueOf(false)).<Comparable, Boolean>a(P, Boolean.valueOf(false)).a(Q, a.a));
/*  38 */     c(☃.w);
/*  39 */     b(☃.x / 3.0F);
/*  40 */     a(☃.H);
/*  41 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  46 */     return di.a(a() + "." + a.a.c() + ".name");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  66 */     boolean bool1 = e(☃, cj1.c());
/*  67 */     boolean bool2 = e(☃, cj1.d());
/*  68 */     boolean bool3 = e(☃, cj1.e());
/*  69 */     boolean bool4 = e(☃, cj1.f());
/*     */     
/*  71 */     float f1 = 0.25F;
/*  72 */     float f2 = 0.75F;
/*  73 */     float f3 = 0.25F;
/*  74 */     float f4 = 0.75F;
/*  75 */     float f5 = 1.0F;
/*     */     
/*  77 */     if (bool1) {
/*  78 */       f3 = 0.0F;
/*     */     }
/*  80 */     if (bool2) {
/*  81 */       f4 = 1.0F;
/*     */     }
/*  83 */     if (bool3) {
/*  84 */       f1 = 0.0F;
/*     */     }
/*  86 */     if (bool4) {
/*  87 */       f2 = 1.0F;
/*     */     }
/*     */     
/*  90 */     if (bool1 && bool2 && !bool3 && !bool4) {
/*  91 */       f5 = 0.8125F;
/*  92 */       f1 = 0.3125F;
/*  93 */       f2 = 0.6875F;
/*  94 */     } else if (!bool1 && !bool2 && bool3 && bool4) {
/*  95 */       f5 = 0.8125F;
/*  96 */       f3 = 0.3125F;
/*  97 */       f4 = 0.6875F;
/*     */     } 
/*     */     
/* 100 */     a(f1, 0.0F, f3, f2, f5, f4);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 106 */     a(☃, cj1);
/* 107 */     this.F = 1.5D;
/* 108 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   public boolean e(adq ☃, cj cj1) {
/* 112 */     afh afh1 = ☃.p(cj1).c();
/* 113 */     if (afh1 == afi.cv) {
/* 114 */       return false;
/*     */     }
/* 116 */     if (afh1 == this || afh1 instanceof agu) {
/* 117 */       return true;
/*     */     }
/* 119 */     if (afh1.J.k() && afh1.d()) {
/* 120 */       return (afh1.J != arm.C);
/*     */     }
/* 122 */     return false;
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/* 127 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/* 128 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public int a(alz ☃) {
/* 134 */     return ((a)☃.<a>b(Q)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 139 */     if (cq1 == cq.a) {
/* 140 */       return super.a(☃, cj1, cq1);
/*     */     }
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 147 */     return Q().a(Q, a.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 153 */     return ((a)☃.<a>b(Q)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 158 */     return ☃.<Comparable, Boolean>a(a, Boolean.valueOf(!adq1.d(cj1.a()))).<Comparable, Boolean>a(b, Boolean.valueOf(e(adq1, cj1.c()))).<Comparable, Boolean>a(N, Boolean.valueOf(e(adq1, cj1.f()))).<Comparable, Boolean>a(O, Boolean.valueOf(e(adq1, cj1.d()))).a(P, Boolean.valueOf(e(adq1, cj1.e())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 168 */     return new ama(this, new amo[] { a, b, N, P, O, Q });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 172 */     a(0, "cobblestone", "normal"),
/* 173 */     b(1, "mossy_cobblestone", "mossy");
/*     */ 
/*     */     
/*     */     private final int d;
/*     */     
/*     */     private final String e;
/*     */     
/*     */     private String f;
/*     */     
/* 182 */     private static final a[] c = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/* 184 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 185 */         c[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, String str2) {
/* 190 */       this.d = ☃;
/* 191 */       this.e = str1;
/* 192 */       this.f = str2;
/*     */     }
/*     */     
/*     */     public int a() {
/* 196 */       return this.d;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 205 */       return this.e;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 209 */       if (☃ < 0 || ☃ >= c.length) {
/* 210 */         ☃ = 0;
/*     */       }
/* 212 */       return c[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 217 */       return this.e;
/*     */     }
/*     */     
/*     */     public String c() {
/* 221 */       return this.f;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */