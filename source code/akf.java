/*     */ import com.google.common.base.Predicate;
/*     */ import java.util.Iterator;
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
/*     */ public class akf
/*     */   extends afh
/*     */ {
/*  23 */   public static final aml a = aml.a("facing", new Predicate<cq>()
/*     */       {
/*     */         public boolean a(cq ☃) {
/*  26 */           return (☃ != cq.a);
/*     */         }
/*     */       });
/*     */   
/*     */   protected akf() {
/*  31 */     super(arm.q);
/*  32 */     j(this.M.b().a(a, cq.b));
/*  33 */     a(true);
/*  34 */     a(yz.c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  40 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  45 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1) {
/*  54 */     if (adm.a(☃, cj1)) {
/*  55 */       return true;
/*     */     }
/*  57 */     afh afh1 = ☃.p(cj1).c();
/*  58 */     return (afh1 instanceof agt || afh1 == afi.w || afh1 == afi.bZ || afh1 == afi.cG);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  63 */     for (Iterator<cq> iterator = a.c().iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  64 */       if (a(☃, cj1, cq)) {
/*  65 */         return true;
/*     */       } }
/*     */ 
/*     */     
/*  69 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(adm ☃, cj cj1, cq cq1) {
/*  73 */     cj cj2 = cj1.a(cq1.d());
/*     */     
/*  75 */     boolean bool = cq1.k().c();
/*  76 */     return ((bool && ☃.d(cj2, true)) || (cq1.equals(cq.b) && e(☃, cj2)));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  81 */     if (a(☃, cj1, cq1)) {
/*  82 */       return Q().a(a, cq1);
/*     */     }
/*     */     
/*  85 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq2 = iterator.next();
/*  86 */       if (☃.d(cj1.a(cq2.d()), true)) {
/*  87 */         return Q().a(a, cq2);
/*     */       } }
/*     */ 
/*     */     
/*  91 */     return Q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  96 */     f(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 101 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   protected boolean e(adm ☃, cj cj1, alz alz1) {
/* 105 */     if (!f(☃, cj1, alz1)) {
/* 106 */       return true;
/*     */     }
/*     */     
/* 109 */     cq cq1 = alz1.<cq>b(a);
/* 110 */     cq.a a = cq1.k();
/* 111 */     cq cq2 = cq1.d();
/*     */     
/* 113 */     boolean bool = false;
/* 114 */     if (a.c() && !☃.d(cj1.a(cq2), true)) {
/* 115 */       bool = true;
/* 116 */     } else if (a.b() && !e(☃, cj1.a(cq2))) {
/* 117 */       bool = true;
/*     */     } 
/*     */     
/* 120 */     if (bool) {
/* 121 */       b(☃, cj1, alz1, 0);
/* 122 */       ☃.g(cj1);
/* 123 */       return true;
/*     */     } 
/*     */     
/* 126 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean f(adm ☃, cj cj1, alz alz1) {
/* 130 */     if (alz1.c() == this && 
/* 131 */       a(☃, cj1, alz1.<cq>b(a))) {
/* 132 */       return true;
/*     */     }
/*     */ 
/*     */     
/* 136 */     if (☃.p(cj1).c() == this) {
/* 137 */       b(☃, cj1, alz1, 0);
/* 138 */       ☃.g(cj1);
/*     */     } 
/*     */     
/* 141 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/* 146 */     cq cq = ☃.p(cj1).<cq>b(a);
/*     */     
/* 148 */     float f = 0.15F;
/* 149 */     if (cq == cq.f) {
/* 150 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 151 */     } else if (cq == cq.e) {
/* 152 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 153 */     } else if (cq == cq.d) {
/* 154 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 155 */     } else if (cq == cq.c) {
/* 156 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     } else {
/* 158 */       f = 0.1F;
/* 159 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */     } 
/*     */     
/* 162 */     return super.a(☃, cj1, aui1, aui2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 167 */     cq cq = alz1.<cq>b(a);
/* 168 */     double d1 = cj1.n() + 0.5D;
/* 169 */     double d2 = cj1.o() + 0.7D;
/* 170 */     double d3 = cj1.p() + 0.5D;
/* 171 */     double d4 = 0.22D;
/* 172 */     double d5 = 0.27D;
/*     */     
/* 174 */     if (cq.k().c()) {
/* 175 */       cq cq1 = cq.d();
/* 176 */       ☃.a(cy.l, d1 + d5 * cq1.g(), d2 + d4, d3 + d5 * cq1.i(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 177 */       ☃.a(cy.A, d1 + d5 * cq1.g(), d2 + d4, d3 + d5 * cq1.i(), 0.0D, 0.0D, 0.0D, new int[0]);
/*     */     } else {
/* 179 */       ☃.a(cy.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 180 */       ☃.a(cy.A, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 186 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 191 */     alz alz = Q();
/* 192 */     switch (☃)
/*     */     { case 1:
/* 194 */         alz = alz.a(a, cq.f);
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
/* 211 */         return alz;case 2: alz = alz.a(a, cq.e); return alz;case 3: alz = alz.a(a, cq.d); return alz;case 4: alz = alz.a(a, cq.c); return alz; }  alz = alz.a(a, cq.b); return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 216 */     int i = 0;
/*     */     
/* 218 */     switch (null.a[((cq)☃.b(a)).ordinal()])
/*     */     { case 1:
/* 220 */         i |= 0x1;
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
/* 238 */         return i;case 2: i |= 0x2; return i;case 3: i |= 0x3; return i;case 4: i |= 0x4; return i; }  i |= 0x5; return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 243 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */