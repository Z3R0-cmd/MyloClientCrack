/*     */ import com.google.common.base.Predicate;
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
/*     */ public class aiv
/*     */   extends age
/*     */ {
/*     */   private amd a;
/*     */   private amd b;
/*     */   private amd N;
/*     */   private amd P;
/*     */   
/*     */   protected aiv() {
/*  30 */     super(arm.C, arn.q);
/*  31 */     j(this.M.b().a(O, cq.c));
/*  32 */     a(true);
/*  33 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  38 */     super.c(☃, cj1, alz1);
/*  39 */     f(☃, cj1);
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1) {
/*  43 */     return (l().a(☃, cj1) != null || T().a(☃, cj1) != null);
/*     */   }
/*     */ 
/*     */   
/*     */   private void f(adm ☃, cj cj1) {
/*     */     amd.b b;
/*  49 */     if ((b = n().a(☃, cj1)) != null) {
/*  50 */       for (int i = 0; i < n().b(); i++) {
/*  51 */         amc amc = b.a(0, i, 0);
/*  52 */         ☃.a(amc.d(), afi.a.Q(), 2);
/*     */       } 
/*     */       
/*  55 */       tw tw = new tw(☃);
/*  56 */       cj cj2 = b.a(0, 2, 0).d();
/*  57 */       tw.b(cj2.n() + 0.5D, cj2.o() + 0.05D, cj2.p() + 0.5D, 0.0F, 0.0F);
/*  58 */       ☃.d(tw);
/*     */       int j;
/*  60 */       for (j = 0; j < 120; j++) {
/*  61 */         ☃.a(cy.G, cj2.n() + ☃.s.nextDouble(), cj2.o() + ☃.s.nextDouble() * 2.5D, cj2.p() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*     */       }
/*     */       
/*  64 */       for (j = 0; j < n().b(); j++) {
/*  65 */         amc amc = b.a(0, j, 0);
/*  66 */         ☃.b(amc.d(), afi.a);
/*     */       } 
/*  68 */     } else if ((b = U().a(☃, cj1)) != null) {
/*  69 */       for (int i = 0; i < U().c(); i++) {
/*  70 */         for (int k = 0; k < U().b(); k++) {
/*  71 */           ☃.a(b.a(i, k, 0).d(), afi.a.Q(), 2);
/*     */         }
/*     */       } 
/*     */       
/*  75 */       cj cj2 = b.a(1, 2, 0).d();
/*     */       
/*  77 */       ty ty = new ty(☃);
/*  78 */       ty.l(true);
/*  79 */       ty.b(cj2.n() + 0.5D, cj2.o() + 0.05D, cj2.p() + 0.5D, 0.0F, 0.0F);
/*  80 */       ☃.d(ty);
/*     */       int j;
/*  82 */       for (j = 0; j < 120; j++) {
/*  83 */         ☃.a(cy.F, cj2.n() + ☃.s.nextDouble(), cj2.o() + ☃.s.nextDouble() * 3.9D, cj2.p() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*     */       }
/*     */       
/*  86 */       for (j = 0; j < U().c(); j++) {
/*  87 */         for (int k = 0; k < U().b(); k++) {
/*  88 */           amc amc = b.a(j, k, 0);
/*  89 */           ☃.b(amc.d(), afi.a);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  97 */     return ((☃.p(cj1).c()).J.j() && adm.a(☃, cj1.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 102 */     return Q().a(O, pr1.aP().d());
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 107 */     return Q().a(O, cq.b(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 113 */     return ((cq)☃.<cq>b(O)).b();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 118 */     return new ama(this, new amo[] { O });
/*     */   }
/*     */   
/* 121 */   private static final Predicate<alz> Q = new Predicate<alz>()
/*     */     {
/*     */       public boolean a(alz ☃) {
/* 124 */         return (☃ != null && (☃.c() == afi.aU || ☃.c() == afi.aZ));
/*     */       }
/*     */     };
/*     */   
/*     */   protected amd l() {
/* 129 */     if (this.a == null) {
/* 130 */       this.a = ame.a().a(new String[] { " ", "#", "#" }).a('#', amc.a(amh.a(afi.aJ))).b();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     return this.a;
/*     */   }
/*     */   
/*     */   protected amd n() {
/* 144 */     if (this.b == null) {
/* 145 */       this.b = ame.a().a(new String[] { "^", "#", "#" }).a('^', amc.a(Q)).a('#', amc.a(amh.a(afi.aJ))).b();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     return this.b;
/*     */   }
/*     */   
/*     */   protected amd T() {
/* 160 */     if (this.N == null) {
/* 161 */       this.N = ame.a().a(new String[] { "~ ~", "###", "~#~" }).a('#', amc.a(amh.a(afi.S))).a('~', amc.a(amh.a(afi.a))).b();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     return this.N;
/*     */   }
/*     */   
/*     */   protected amd U() {
/* 176 */     if (this.P == null) {
/* 177 */       this.P = ame.a().a(new String[] { "~^~", "###", "~#~" }).a('^', amc.a(Q)).a('#', amc.a(amh.a(afi.S))).a('~', amc.a(amh.a(afi.a))).b();
/*     */     }
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
/* 189 */     return this.P;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */