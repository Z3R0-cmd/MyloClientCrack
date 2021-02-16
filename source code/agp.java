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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agp
/*     */   extends afc
/*     */ {
/*  30 */   public static final aml a = aml.a("facing", cq.c.a);
/*     */   
/*     */   protected agp() {
/*  33 */     super(arm.e);
/*  34 */     j(this.M.b().a(a, cq.c));
/*  35 */     a(yz.c);
/*  36 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  41 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  51 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  57 */     return zw.a(afi.Z);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  62 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean I() {
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  72 */     return Q().a(a, pr1.aP().d());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  77 */     ☃.a(cj1, alz1.a(a, pr1.aP().d()), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  82 */     yd yd = wn1.co();
/*  83 */     akw akw = ☃.s(cj1);
/*  84 */     if (yd == null || !(akw instanceof alf)) {
/*  85 */       return true;
/*     */     }
/*     */     
/*  88 */     if (☃.p(cj1.a()).c().v()) {
/*  89 */       return true;
/*     */     }
/*     */     
/*  92 */     if (☃.D) {
/*  93 */       return true;
/*     */     }
/*     */     
/*  96 */     yd.a((alf)akw);
/*  97 */     wn1.a(yd);
/*  98 */     wn1.b(na.V);
/*     */     
/* 100 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 105 */     return new alf();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 110 */     for (int i = 0; i < 3; i++) {
/* 111 */       int j = random.nextInt(2) * 2 - 1;
/* 112 */       int k = random.nextInt(2) * 2 - 1;
/*     */       
/* 114 */       double d1 = cj1.n() + 0.5D + 0.25D * j;
/* 115 */       double d2 = (cj1.o() + random.nextFloat());
/* 116 */       double d3 = cj1.p() + 0.5D + 0.25D * k;
/* 117 */       double d4 = (random.nextFloat() * j);
/* 118 */       double d5 = (random.nextFloat() - 0.5D) * 0.125D;
/* 119 */       double d6 = (random.nextFloat() * k);
/*     */       
/* 121 */       ☃.a(cy.y, d1, d2, d3, d4, d5, d6, new int[0]);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 127 */     cq cq = cq.a(☃);
/* 128 */     if (cq.k() == cq.a.b) {
/* 129 */       cq = cq.c;
/*     */     }
/* 131 */     return Q().a(a, cq);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 137 */     return ((cq)☃.<cq>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 142 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */