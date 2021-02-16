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
/*     */ public class afz
/*     */   extends afm
/*     */   implements afj
/*     */ {
/*  20 */   public static final amn a = amn.a("age", 0, 7);
/*     */   
/*     */   protected afz() {
/*  23 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  24 */     a(true);
/*  25 */     float ☃ = 0.5F;
/*  26 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
/*  27 */     a((yz)null);
/*  28 */     c(0.0F);
/*  29 */     a(h);
/*  30 */     K();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(afh ☃) {
/*  35 */     return (☃ == afi.ak);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  40 */     super.b(☃, cj1, alz1, random);
/*  41 */     if (☃.l(cj1.a()) >= 9) {
/*  42 */       int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  43 */       if (i < 7) {
/*  44 */         float f = a(this, ☃, cj1);
/*     */         
/*  46 */         if (random.nextInt((int)(25.0F / f) + 1) == 0) {
/*  47 */           ☃.a(cj1, alz1.a(a, Integer.valueOf(i + 1)), 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void g(adm ☃, cj cj1, alz alz1) {
/*  54 */     int i = ((Integer)alz1.<Integer>b(a)).intValue() + ns.a(☃.s, 2, 5);
/*  55 */     if (i > 7) {
/*  56 */       i = 7;
/*     */     }
/*  58 */     ☃.a(cj1, alz1.a(a, Integer.valueOf(i)), 2);
/*     */   }
/*     */   
/*     */   protected static float a(afh ☃, adm adm1, cj cj1) {
/*  62 */     float f = 1.0F;
/*     */     
/*  64 */     cj cj2 = cj1.b();
/*  65 */     for (int i = -1; i <= 1; i++) {
/*  66 */       for (int j = -1; j <= 1; j++) {
/*  67 */         float f1 = 0.0F;
/*     */         
/*  69 */         alz alz = adm1.p(cj2.a(i, 0, j));
/*  70 */         if (alz.c() == afi.ak) {
/*  71 */           f1 = 1.0F;
/*  72 */           if (((Integer)alz.<Integer>b(ags.a)).intValue() > 0) {
/*  73 */             f1 = 3.0F;
/*     */           }
/*     */         } 
/*     */         
/*  77 */         if (i != 0 || j != 0) {
/*  78 */           f1 /= 4.0F;
/*     */         }
/*     */         
/*  81 */         f += f1;
/*     */       } 
/*     */     } 
/*     */     
/*  85 */     cj cj3 = cj1.c();
/*  86 */     cj cj4 = cj1.d();
/*  87 */     cj cj5 = cj1.e();
/*  88 */     cj cj6 = cj1.f();
/*     */     
/*  90 */     boolean bool1 = (☃ == adm1.p(cj5).c() || ☃ == adm1.p(cj6).c());
/*  91 */     boolean bool2 = (☃ == adm1.p(cj3).c() || ☃ == adm1.p(cj4).c());
/*     */     
/*  93 */     if (bool1 && bool2) {
/*  94 */       f /= 2.0F;
/*     */     } else {
/*     */       
/*  97 */       boolean bool = (☃ == adm1.p(cj5.c()).c() || ☃ == adm1.p(cj6.c()).c() || ☃ == adm1.p(cj6.d()).c() || ☃ == adm1.p(cj5.d()).c());
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 102 */       if (bool) {
/* 103 */         f /= 2.0F;
/*     */       }
/*     */     } 
/*     */     
/* 107 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(adm ☃, cj cj1, alz alz1) {
/* 112 */     return ((☃.k(cj1) >= 8 || ☃.i(cj1)) && c(☃.p(cj1.b()).c()));
/*     */   }
/*     */   
/*     */   protected zw l() {
/* 116 */     return zy.N;
/*     */   }
/*     */   
/*     */   protected zw n() {
/* 120 */     return zy.O;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 130 */     super.a(☃, cj1, alz1, f, 0);
/*     */     
/* 132 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     int j = ((Integer)alz1.<Integer>b(a)).intValue();
/* 137 */     if (j >= 7) {
/*     */       
/* 139 */       int k = 3 + i;
/* 140 */       for (int m = 0; m < k; m++) {
/* 141 */         if (☃.s.nextInt(15) <= j)
/*     */         {
/*     */           
/* 144 */           a(☃, cj1, new zx(l(), 1, 0));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 152 */     if (((Integer)☃.<Integer>b(a)).intValue() == 7) {
/* 153 */       return n();
/*     */     }
/*     */     
/* 156 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 161 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 166 */     return (((Integer)alz1.b(a)).intValue() < 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 176 */     g(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 181 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 187 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 192 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */