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
/*     */ public class agt
/*     */   extends afh
/*     */ {
/*  21 */   public static final amk a = amk.a("north");
/*  22 */   public static final amk b = amk.a("east");
/*  23 */   public static final amk N = amk.a("south");
/*  24 */   public static final amk O = amk.a("west");
/*     */   
/*     */   public agt(arm ☃) {
/*  27 */     this(☃, ☃.r());
/*     */   }
/*     */   
/*     */   public agt(arm ☃, arn arn1) {
/*  31 */     super(☃, arn1);
/*  32 */     j(this.M.b().<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
/*  33 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  38 */     boolean bool1 = e(☃, cj1.c());
/*  39 */     boolean bool2 = e(☃, cj1.d());
/*  40 */     boolean bool3 = e(☃, cj1.e());
/*  41 */     boolean bool4 = e(☃, cj1.f());
/*     */     
/*  43 */     float f1 = 0.375F;
/*  44 */     float f2 = 0.625F;
/*  45 */     float f3 = 0.375F;
/*  46 */     float f4 = 0.625F;
/*     */     
/*  48 */     if (bool1) {
/*  49 */       f3 = 0.0F;
/*     */     }
/*  51 */     if (bool2) {
/*  52 */       f4 = 1.0F;
/*     */     }
/*  54 */     if (bool1 || bool2) {
/*  55 */       a(f1, 0.0F, f3, f2, 1.5F, f4);
/*  56 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     } 
/*  58 */     f3 = 0.375F;
/*  59 */     f4 = 0.625F;
/*  60 */     if (bool3) {
/*  61 */       f1 = 0.0F;
/*     */     }
/*  63 */     if (bool4) {
/*  64 */       f2 = 1.0F;
/*     */     }
/*  66 */     if (bool3 || bool4 || (!bool1 && !bool2)) {
/*  67 */       a(f1, 0.0F, f3, f2, 1.5F, f4);
/*  68 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     } 
/*     */     
/*  71 */     if (bool1) {
/*  72 */       f3 = 0.0F;
/*     */     }
/*  74 */     if (bool2) {
/*  75 */       f4 = 1.0F;
/*     */     }
/*     */     
/*  78 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  83 */     boolean bool1 = e(☃, cj1.c());
/*  84 */     boolean bool2 = e(☃, cj1.d());
/*  85 */     boolean bool3 = e(☃, cj1.e());
/*  86 */     boolean bool4 = e(☃, cj1.f());
/*     */     
/*  88 */     float f1 = 0.375F;
/*  89 */     float f2 = 0.625F;
/*  90 */     float f3 = 0.375F;
/*  91 */     float f4 = 0.625F;
/*     */     
/*  93 */     if (bool1) {
/*  94 */       f3 = 0.0F;
/*     */     }
/*  96 */     if (bool2) {
/*  97 */       f4 = 1.0F;
/*     */     }
/*  99 */     if (bool3) {
/* 100 */       f1 = 0.0F;
/*     */     }
/* 102 */     if (bool4) {
/* 103 */       f2 = 1.0F;
/*     */     }
/*     */     
/* 106 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/* 121 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(adq ☃, cj cj1) {
/* 125 */     afh afh1 = ☃.p(cj1).c();
/* 126 */     if (afh1 == afi.cv) {
/* 127 */       return false;
/*     */     }
/* 129 */     if ((afh1 instanceof agt && afh1.J == this.J) || afh1 instanceof agu) {
/* 130 */       return true;
/*     */     }
/* 132 */     if (afh1.J.k() && afh1.d()) {
/* 133 */       return (afh1.J != arm.C);
/*     */     }
/* 135 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 140 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 145 */     if (☃.D) {
/* 146 */       return true;
/*     */     }
/*     */     
/* 149 */     return zz.a(wn1, ☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 154 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 159 */     return ☃.<Comparable, Boolean>a(a, Boolean.valueOf(e(adq1, cj1.c()))).<Comparable, Boolean>a(b, Boolean.valueOf(e(adq1, cj1.f()))).<Comparable, Boolean>a(N, Boolean.valueOf(e(adq1, cj1.d()))).a(O, Boolean.valueOf(e(adq1, cj1.e())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 168 */     return new ama(this, new amo[] { a, b, O, N });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */