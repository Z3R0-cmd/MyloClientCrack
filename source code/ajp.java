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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajp
/*     */   extends afh
/*     */ {
/*  26 */   public static final amn a = amn.a("layers", 1, 8);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ajp() {
/*  33 */     super(arm.y);
/*  34 */     j(this.M.b().a(a, Integer.valueOf(1)));
/*  35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  36 */     a(true);
/*  37 */     a(yz.c);
/*  38 */     j();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  43 */     return (((Integer)☃.p(cj1).b(a)).intValue() < 5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  49 */     int i = ((Integer)alz1.<Integer>b(a)).intValue() - 1;
/*  50 */     float f = 0.125F;
/*  51 */     return new aug(cj1.n() + this.B, cj1.o() + this.C, cj1.p() + this.D, cj1.n() + this.E, (cj1.o() + i * f), cj1.p() + this.G);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  71 */     b(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  76 */     alz alz = ☃.p(cj1);
/*  77 */     b(((Integer)alz.<Integer>b(a)).intValue());
/*     */   }
/*     */   
/*     */   protected void b(int ☃) {
/*  81 */     a(0.0F, 0.0F, 0.0F, 1.0F, ☃ / 8.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  86 */     alz alz = ☃.p(cj1.b());
/*  87 */     afh afh1 = alz.c();
/*     */     
/*  89 */     if (afh1 == afi.aI || afh1 == afi.cB) {
/*  90 */       return false;
/*     */     }
/*     */     
/*  93 */     if (afh1.t() == arm.j) {
/*  94 */       return true;
/*     */     }
/*     */     
/*  97 */     if (afh1 == this && ((Integer)alz.b(a)).intValue() >= 7) {
/*  98 */       return true;
/*     */     }
/*     */     
/* 101 */     return (afh1.c() && afh1.J.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 106 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1, alz alz1) {
/* 110 */     if (!d(☃, cj1)) {
/* 111 */       b(☃, cj1, alz1, 0);
/* 112 */       ☃.g(cj1);
/* 113 */       return false;
/*     */     } 
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 120 */     a(☃, cj1, new zx(zy.aD, ((Integer)alz1.<Integer>b(a)).intValue() + 1, 0));
/* 121 */     ☃.g(cj1);
/*     */     
/* 123 */     wn1.b(na.ab[afh.a(this)]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 129 */     return zy.aD;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 134 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 139 */     if (☃.b(ads.b, cj1) > 11) {
/* 140 */       b(☃, cj1, ☃.p(cj1), 0);
/* 141 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 147 */     if (cq1 == cq.b) {
/* 148 */       return true;
/*     */     }
/* 150 */     return super.a(☃, cj1, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 155 */     return Q().a(a, Integer.valueOf((☃ & 0x7) + 1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1) {
/* 161 */     return (((Integer)☃.p(cj1).<Integer>b(a)).intValue() == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 166 */     return ((Integer)☃.<Integer>b(a)).intValue() - 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 171 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */