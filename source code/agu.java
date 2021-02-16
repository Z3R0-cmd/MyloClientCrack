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
/*     */ public class agu
/*     */   extends age
/*     */ {
/*  19 */   public static final amk a = amk.a("open");
/*  20 */   public static final amk b = amk.a("powered");
/*  21 */   public static final amk N = amk.a("in_wall");
/*     */   
/*     */   public agu(aio.a ☃) {
/*  24 */     super(arm.d, ☃.c());
/*     */     
/*  26 */     j(this.M.b().<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)));
/*  27 */     a(yz.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  32 */     cq.a a = ((cq)☃.<cq>b(O)).k();
/*  33 */     if ((a == cq.a.c && (adq1.p(cj1.e()).c() == afi.bZ || adq1.p(cj1.f()).c() == afi.bZ)) || (a == cq.a.a && (adq1.p(cj1.c()).c() == afi.bZ || adq1.p(cj1.d()).c() == afi.bZ)))
/*     */     {
/*     */ 
/*     */       
/*  37 */       ☃ = ☃.a(N, Boolean.valueOf(true));
/*     */     }
/*     */     
/*  40 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  45 */     if (☃.p(cj1.b()).c().t().a()) {
/*  46 */       return super.d(☃, cj1);
/*     */     }
/*     */     
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  55 */     if (((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/*  56 */       return null;
/*     */     }
/*     */     
/*  59 */     cq.a a = ((cq)alz1.<cq>b(O)).k();
/*  60 */     if (a == cq.a.c) {
/*  61 */       return new aug(cj1.n(), cj1.o(), (cj1.p() + 0.375F), (cj1.n() + 1), (cj1.o() + 1.5F), (cj1.p() + 0.625F));
/*     */     }
/*     */     
/*  64 */     return new aug((cj1.n() + 0.375F), cj1.o(), cj1.p(), (cj1.n() + 0.625F), (cj1.o() + 1.5F), (cj1.p() + 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  69 */     cq.a a = ((cq)☃.p(cj1).<cq>b(O)).k();
/*  70 */     if (a == cq.a.c) {
/*  71 */       a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
/*     */     } else {
/*  73 */       a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  79 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  89 */     return ((Boolean)☃.p(cj1).<Boolean>b(a)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  94 */     return Q().<Comparable, cq>a(O, pr1.aP()).<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  99 */     if (((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/* 100 */       alz1 = alz1.a(a, Boolean.valueOf(false));
/* 101 */       ☃.a(cj1, alz1, 2);
/*     */     } else {
/*     */       
/* 104 */       cq cq2 = cq.a(wn1.y);
/* 105 */       if (alz1.b(O) == cq2.d()) {
/* 106 */         alz1 = alz1.a(O, cq2);
/*     */       }
/* 108 */       alz1 = alz1.a(a, Boolean.valueOf(true));
/* 109 */       ☃.a(cj1, alz1, 2);
/*     */     } 
/*     */     
/* 112 */     ☃.a(wn1, ((Boolean)alz1.<Boolean>b(a)).booleanValue() ? 1003 : 1006, cj1, 0);
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 118 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 122 */     boolean bool = ☃.z(cj1);
/* 123 */     if (bool || afh1.i()) {
/* 124 */       if (bool && !((Boolean)alz1.<Boolean>b(a)).booleanValue() && !((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 125 */         ☃.a(cj1, alz1.<Comparable, Boolean>a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)), 2);
/* 126 */         ☃.a((wn)null, 1003, cj1, 0);
/* 127 */       } else if (!bool && ((Boolean)alz1.<Boolean>b(a)).booleanValue() && ((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 128 */         ☃.a(cj1, alz1.<Comparable, Boolean>a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
/* 129 */         ☃.a((wn)null, 1006, cj1, 0);
/* 130 */       } else if (bool != ((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 131 */         ☃.a(cj1, alz1.a(b, Boolean.valueOf(bool)), 2);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 138 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 143 */     return Q().<Comparable, cq>a(O, cq.b(☃)).<Comparable, Boolean>a(a, Boolean.valueOf(((☃ & 0x4) != 0))).a(b, Boolean.valueOf(((☃ & 0x8) != 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 151 */     int i = 0;
/*     */     
/* 153 */     i |= ((cq)☃.<cq>b(O)).b();
/*     */     
/* 155 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 156 */       i |= 0x8;
/*     */     }
/*     */     
/* 159 */     if (((Boolean)☃.<Boolean>b(a)).booleanValue()) {
/* 160 */       i |= 0x4;
/*     */     }
/*     */     
/* 163 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 168 */     return new ama(this, new amo[] { O, a, b, N });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */