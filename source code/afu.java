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
/*     */ public class afu
/*     */   extends age
/*     */   implements afj
/*     */ {
/*  24 */   public static final amn a = amn.a("age", 0, 2);
/*     */   
/*     */   public afu() {
/*  27 */     super(arm.k);
/*  28 */     j(this.M.b().<Comparable, cq>a(O, cq.c).a(a, Integer.valueOf(0)));
/*  29 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  34 */     if (!e(☃, cj1, alz1)) {
/*  35 */       f(☃, cj1, alz1);
/*  36 */     } else if (☃.s.nextInt(5) == 0) {
/*  37 */       int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  38 */       if (i < 2) {
/*  39 */         ☃.a(cj1, alz1.a(a, Integer.valueOf(i + 1)), 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1, alz alz1) {
/*  45 */     cj1 = cj1.a(alz1.<cq>b(O));
/*     */     
/*  47 */     alz alz2 = ☃.p(cj1);
/*  48 */     return (alz2.c() == afi.r && alz2.b(aio.a) == aio.a.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  64 */     a(☃, cj1);
/*  65 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  70 */     a(☃, cj1);
/*  71 */     return super.b(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  76 */     alz alz = ☃.p(cj1);
/*  77 */     cq cq = alz.<cq>b(O);
/*  78 */     int i = ((Integer)alz.<Integer>b(a)).intValue();
/*     */     
/*  80 */     int j = 4 + i * 2;
/*  81 */     int k = 5 + i * 2;
/*     */     
/*  83 */     float f = j / 2.0F;
/*     */     
/*  85 */     switch (null.a[cq.ordinal()]) {
/*     */       case 1:
/*  87 */         a((8.0F - f) / 16.0F, (12.0F - k) / 16.0F, (15.0F - j) / 16.0F, (8.0F + f) / 16.0F, 0.75F, 0.9375F);
/*     */         break;
/*     */       case 2:
/*  90 */         a((8.0F - f) / 16.0F, (12.0F - k) / 16.0F, 0.0625F, (8.0F + f) / 16.0F, 0.75F, (1.0F + j) / 16.0F);
/*     */         break;
/*     */       case 3:
/*  93 */         a(0.0625F, (12.0F - k) / 16.0F, (8.0F - f) / 16.0F, (1.0F + j) / 16.0F, 0.75F, (8.0F + f) / 16.0F);
/*     */         break;
/*     */       case 4:
/*  96 */         a((15.0F - j) / 16.0F, (12.0F - k) / 16.0F, (8.0F - f) / 16.0F, 0.9375F, 0.75F, (8.0F + f) / 16.0F);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/* 103 */     cq cq = cq.a(pr1.y);
/* 104 */     ☃.a(cj1, alz1.a(O, cq), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 109 */     if (!cq1.k().c()) {
/* 110 */       cq1 = cq.c;
/*     */     }
/* 112 */     return Q().<Comparable, cq>a(O, cq1.d()).a(a, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 117 */     if (!e(☃, cj1, alz1)) {
/* 118 */       f(☃, cj1, alz1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void f(adm ☃, cj cj1, alz alz1) {
/* 123 */     ☃.a(cj1, afi.a.Q(), 3);
/* 124 */     b(☃, cj1, alz1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 129 */     int j = ((Integer)alz1.<Integer>b(a)).intValue();
/* 130 */     int k = 1;
/* 131 */     if (j >= 2) {
/* 132 */       k = 3;
/*     */     }
/* 134 */     for (int m = 0; m < k; m++) {
/* 135 */       a(☃, cj1, new zx(zy.aW, 1, zd.m.b()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 141 */     return zy.aW;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/* 146 */     return zd.m.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 151 */     return (((Integer)alz1.b(a)).intValue() < 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 161 */     ☃.a(cj1, alz1.a(a, Integer.valueOf(((Integer)alz1.<Integer>b(a)).intValue() + 1)), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 166 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 171 */     return Q().<Comparable, cq>a(O, cq.b(☃)).a(a, Integer.valueOf((☃ & 0xF) >> 2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 178 */     int i = 0;
/*     */     
/* 180 */     i |= ((cq)☃.<cq>b(O)).b();
/* 181 */     i |= ((Integer)☃.<Integer>b(a)).intValue() << 2;
/*     */     
/* 183 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 188 */     return new ama(this, new amo[] { O, a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */