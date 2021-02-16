/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ public class akd
/*     */   extends afh
/*     */ {
/*  22 */   public static final amk b = amk.a("north");
/*  23 */   public static final amk N = amk.a("east");
/*  24 */   public static final amk O = amk.a("south");
/*  25 */   public static final amk P = amk.a("west");
/*     */   
/*     */   private final boolean a;
/*     */   
/*     */   protected akd(arm ☃, boolean bool) {
/*  30 */     super(☃);
/*  31 */     j(this.M.b().<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).<Comparable, Boolean>a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)));
/*  32 */     this.a = bool;
/*  33 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  38 */     return ☃.<Comparable, Boolean>a(b, Boolean.valueOf(c(adq1.p(cj1.c()).c()))).<Comparable, Boolean>a(O, Boolean.valueOf(c(adq1.p(cj1.d()).c()))).<Comparable, Boolean>a(P, Boolean.valueOf(c(adq1.p(cj1.e()).c()))).a(N, Boolean.valueOf(c(adq1.p(cj1.f()).c())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  48 */     if (!this.a) {
/*  49 */       return null;
/*     */     }
/*  51 */     return super.a(☃, random, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/*  66 */     if (☃.p(cj1).c() == this) {
/*  67 */       return false;
/*     */     }
/*  69 */     return super.a(☃, cj1, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  74 */     boolean bool1 = c(☃.p(cj1.c()).c());
/*  75 */     boolean bool2 = c(☃.p(cj1.d()).c());
/*  76 */     boolean bool3 = c(☃.p(cj1.e()).c());
/*  77 */     boolean bool4 = c(☃.p(cj1.f()).c());
/*     */     
/*  79 */     if ((bool3 && bool4) || (!bool3 && !bool4 && !bool1 && !bool2)) {
/*  80 */       a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/*  81 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*  82 */     } else if (bool3) {
/*  83 */       a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
/*  84 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*  85 */     } else if (bool4) {
/*  86 */       a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/*  87 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     } 
/*  89 */     if ((bool1 && bool2) || (!bool3 && !bool4 && !bool1 && !bool2)) {
/*  90 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
/*  91 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*  92 */     } else if (bool1) {
/*  93 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
/*  94 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*  95 */     } else if (bool2) {
/*  96 */       a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
/*  97 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 103 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 108 */     float f1 = 0.4375F;
/* 109 */     float f2 = 0.5625F;
/* 110 */     float f3 = 0.4375F;
/* 111 */     float f4 = 0.5625F;
/*     */     
/* 113 */     boolean bool1 = c(☃.p(cj1.c()).c());
/* 114 */     boolean bool2 = c(☃.p(cj1.d()).c());
/* 115 */     boolean bool3 = c(☃.p(cj1.e()).c());
/* 116 */     boolean bool4 = c(☃.p(cj1.f()).c());
/*     */     
/* 118 */     if ((bool3 && bool4) || (!bool3 && !bool4 && !bool1 && !bool2)) {
/* 119 */       f1 = 0.0F;
/* 120 */       f2 = 1.0F;
/* 121 */     } else if (bool3) {
/* 122 */       f1 = 0.0F;
/* 123 */     } else if (bool4) {
/* 124 */       f2 = 1.0F;
/*     */     } 
/* 126 */     if ((bool1 && bool2) || (!bool3 && !bool4 && !bool1 && !bool2)) {
/* 127 */       f3 = 0.0F;
/* 128 */       f4 = 1.0F;
/* 129 */     } else if (bool1) {
/* 130 */       f3 = 0.0F;
/* 131 */     } else if (bool2) {
/* 132 */       f4 = 1.0F;
/*     */     } 
/*     */     
/* 135 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*     */   }
/*     */   
/*     */   public final boolean c(afh ☃) {
/* 139 */     return (☃.o() || ☃ == this || ☃ == afi.w || ☃ == afi.cG || ☃ == afi.cH || ☃ instanceof akd);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean I() {
/* 144 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 149 */     return adf.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 154 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 159 */     return new ama(this, new amo[] { b, N, P, O });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */