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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afl
/*     */   extends afc
/*     */ {
/*  31 */   public static final amk[] a = new amk[] { amk.a("has_bottle_0"), amk.a("has_bottle_1"), amk.a("has_bottle_2") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public afl() {
/*  38 */     super(arm.f);
/*  39 */     j(this.M.b().<Comparable, Boolean>a(a[0], Boolean.valueOf(false)).<Comparable, Boolean>a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  44 */     return di.a("item.brewingStand.name");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  54 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/*  59 */     return new akx();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  69 */     a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
/*  70 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  71 */     j();
/*  72 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  77 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  82 */     if (☃.D) {
/*  83 */       return true;
/*     */     }
/*     */     
/*  86 */     akw akw = ☃.s(cj1);
/*  87 */     if (akw instanceof akx) {
/*  88 */       wn1.a((akx)akw);
/*  89 */       wn1.b(na.M);
/*     */     } 
/*     */     
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  97 */     if (zx1.s()) {
/*  98 */       akw akw = ☃.s(cj1);
/*  99 */       if (akw instanceof akx) {
/* 100 */         ((akx)akw).a(zx1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 107 */     double d1 = (cj1.n() + 0.4F + random.nextFloat() * 0.2F);
/* 108 */     double d2 = (cj1.o() + 0.7F + random.nextFloat() * 0.3F);
/* 109 */     double d3 = (cj1.p() + 0.4F + random.nextFloat() * 0.2F);
/*     */     
/* 111 */     ☃.a(cy.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 116 */     akw akw = ☃.s(cj1);
/* 117 */     if (akw instanceof akx) {
/* 118 */       oi.a(☃, cj1, (akx)akw);
/*     */     }
/* 120 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 126 */     return zy.bF;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 131 */     return zy.bF;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 141 */     return xi.a(☃.s(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 146 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 151 */     alz alz = Q();
/*     */     
/* 153 */     for (int i = 0; i < 3; i++) {
/* 154 */       alz = alz.a(a[i], Boolean.valueOf(((☃ & 1 << i) > 0)));
/*     */     }
/*     */     
/* 157 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 162 */     int i = 0;
/*     */     
/* 164 */     for (int j = 0; j < 3; j++) {
/* 165 */       if (((Boolean)☃.<Boolean>b(a[j])).booleanValue()) {
/* 166 */         i |= 1 << j;
/*     */       }
/*     */     } 
/*     */     
/* 170 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 175 */     return new ama(this, new amo[] { a[0], a[1], a[2] });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */