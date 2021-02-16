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
/*     */ public class ahb
/*     */   extends afc
/*     */ {
/*  25 */   public static final aml a = aml.a("facing", cq.c.a);
/*     */   
/*     */   private final boolean b;
/*     */   private static boolean N;
/*     */   
/*     */   protected ahb(boolean ☃) {
/*  31 */     super(arm.e);
/*  32 */     j(this.M.b().a(a, cq.c));
/*  33 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  39 */     return zw.a(afi.al);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  44 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1, alz alz1) {
/*  48 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     afh afh1 = ☃.p(cj1.c()).c();
/*  53 */     afh afh2 = ☃.p(cj1.d()).c();
/*  54 */     afh afh3 = ☃.p(cj1.e()).c();
/*  55 */     afh afh4 = ☃.p(cj1.f()).c();
/*     */     
/*  57 */     cq cq = alz1.<cq>b(a);
/*     */     
/*  59 */     if (cq == cq.c && afh1.o() && !afh2.o()) {
/*  60 */       cq = cq.d;
/*  61 */     } else if (cq == cq.d && afh2.o() && !afh1.o()) {
/*  62 */       cq = cq.c;
/*  63 */     } else if (cq == cq.e && afh3.o() && !afh4.o()) {
/*  64 */       cq = cq.f;
/*  65 */     } else if (cq == cq.f && afh4.o() && !afh3.o()) {
/*  66 */       cq = cq.e;
/*     */     } 
/*     */     
/*  69 */     ☃.a(cj1, alz1.a(a, cq), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/*  74 */     if (!this.b) {
/*     */       return;
/*     */     }
/*     */     
/*  78 */     cq cq = alz1.<cq>b(a);
/*     */     
/*  80 */     double d1 = cj1.n() + 0.5D;
/*  81 */     double d2 = cj1.o() + random.nextDouble() * 6.0D / 16.0D;
/*  82 */     double d3 = cj1.p() + 0.5D;
/*  83 */     double d4 = 0.52D;
/*  84 */     double d5 = random.nextDouble() * 0.6D - 0.3D;
/*     */     
/*  86 */     switch (null.a[cq.ordinal()]) {
/*     */       case 1:
/*  88 */         ☃.a(cy.l, d1 - d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  89 */         ☃.a(cy.A, d1 - d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         break;
/*     */       case 2:
/*  92 */         ☃.a(cy.l, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  93 */         ☃.a(cy.A, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         break;
/*     */       case 3:
/*  96 */         ☃.a(cy.l, d1 + d5, d2, d3 - d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*  97 */         ☃.a(cy.A, d1 + d5, d2, d3 - d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         break;
/*     */       case 4:
/* 100 */         ☃.a(cy.l, d1 + d5, d2, d3 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
/* 101 */         ☃.a(cy.A, d1 + d5, d2, d3 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 108 */     if (☃.D) {
/* 109 */       return true;
/*     */     }
/*     */     
/* 112 */     akw akw = ☃.s(cj1);
/* 113 */     if (akw instanceof alh) {
/* 114 */       wn1.a((alh)akw);
/* 115 */       wn1.b(na.Y);
/*     */     } 
/*     */     
/* 118 */     return true;
/*     */   }
/*     */   
/*     */   public static void a(boolean ☃, adm adm1, cj cj1) {
/* 122 */     alz alz = adm1.p(cj1);
/* 123 */     akw akw = adm1.s(cj1);
/*     */     
/* 125 */     N = true;
/*     */     
/* 127 */     if (☃) {
/* 128 */       adm1.a(cj1, afi.am.Q().a(a, alz.b(a)), 3);
/* 129 */       adm1.a(cj1, afi.am.Q().a(a, alz.b(a)), 3);
/*     */     } else {
/* 131 */       adm1.a(cj1, afi.al.Q().a(a, alz.b(a)), 3);
/* 132 */       adm1.a(cj1, afi.al.Q().a(a, alz.b(a)), 3);
/*     */     } 
/* 134 */     N = false;
/*     */     
/* 136 */     if (akw != null) {
/* 137 */       akw.D();
/* 138 */       adm1.a(cj1, akw);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 144 */     return new alh();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 149 */     return Q().a(a, pr1.aP().d());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/* 154 */     ☃.a(cj1, alz1.a(a, pr1.aP().d()), 2);
/*     */     
/* 156 */     if (zx1.s()) {
/* 157 */       akw akw = ☃.s(cj1);
/* 158 */       if (akw instanceof alh) {
/* 159 */         ((alh)akw).a(zx1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 166 */     if (!N) {
/* 167 */       akw akw = ☃.s(cj1);
/* 168 */       if (akw instanceof alh) {
/* 169 */         oi.a(☃, cj1, (alh)akw);
/*     */         
/* 171 */         ☃.e(cj1, this);
/*     */       } 
/*     */     } 
/* 174 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 179 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 184 */     return xi.a(☃.s(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 189 */     return zw.a(afi.al);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 194 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz b(alz ☃) {
/* 199 */     return Q().a(a, cq.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 204 */     cq cq = cq.a(☃);
/* 205 */     if (cq.k() == cq.a.b) {
/* 206 */       cq = cq.c;
/*     */     }
/* 208 */     return Q().a(a, cq);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 214 */     return ((cq)☃.<cq>b(a)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 219 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */