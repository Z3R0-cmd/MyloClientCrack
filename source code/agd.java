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
/*     */ public abstract class agd
/*     */   extends age
/*     */ {
/*     */   protected final boolean N;
/*     */   
/*     */   protected agd(boolean ☃) {
/*  22 */     super(arm.q);
/*  23 */     this.N = ☃;
/*  24 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  29 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  34 */     if (adm.a(☃, cj1.b())) {
/*  35 */       return super.d(☃, cj1);
/*     */     }
/*     */     
/*  38 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1) {
/*  42 */     if (adm.a(☃, cj1.b())) {
/*  43 */       return true;
/*     */     }
/*     */     
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  55 */     if (b(☃, cj1, alz1)) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     boolean bool = e(☃, cj1, alz1);
/*  60 */     if (this.N && !bool) {
/*  61 */       ☃.a(cj1, k(alz1), 2);
/*  62 */     } else if (!this.N) {
/*     */ 
/*     */       
/*  65 */       ☃.a(cj1, e(alz1), 2);
/*  66 */       if (!bool) {
/*  67 */         ☃.a(cj1, e(alz1).c(), m(alz1), -1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/*  75 */     return (cq1.k() != cq.a.b);
/*     */   }
/*     */   
/*     */   protected boolean l(alz ☃) {
/*  79 */     return this.N;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  84 */     return a(☃, cj1, alz1, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  89 */     if (!l(alz1)) {
/*  90 */       return 0;
/*     */     }
/*     */     
/*  93 */     if (alz1.b(O) == cq1) {
/*  94 */       return a(☃, cj1, alz1);
/*     */     }
/*     */     
/*  97 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 102 */     if (e(☃, cj1)) {
/* 103 */       g(☃, cj1, alz1);
/*     */       
/*     */       return;
/*     */     } 
/* 107 */     b(☃, cj1, alz1, 0);
/* 108 */     ☃.g(cj1); cq[] arrayOfCq; int i, j;
/* 109 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 110 */       ☃.c(cj1.a(cq), this);
/*     */       j++; }
/*     */   
/*     */   }
/*     */   protected void g(adm ☃, cj cj1, alz alz1) {
/* 115 */     if (b(☃, cj1, alz1)) {
/*     */       return;
/*     */     }
/*     */     
/* 119 */     boolean bool = e(☃, cj1, alz1);
/* 120 */     if (((this.N && !bool) || (!this.N && bool)) && !☃.a(cj1, this)) {
/* 121 */       int i = -1;
/*     */ 
/*     */       
/* 124 */       if (i(☃, cj1, alz1)) {
/* 125 */         i = -3;
/* 126 */       } else if (this.N) {
/* 127 */         i = -2;
/*     */       } 
/*     */       
/* 130 */       ☃.a(cj1, this, d(alz1), i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(adq ☃, cj cj1, alz alz1) {
/* 135 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean e(adm ☃, cj cj1, alz alz1) {
/* 139 */     return (f(☃, cj1, alz1) > 0);
/*     */   }
/*     */   
/*     */   protected int f(adm ☃, cj cj1, alz alz1) {
/* 143 */     cq cq = alz1.<cq>b(O);
/*     */     
/* 145 */     cj cj2 = cj1.a(cq);
/* 146 */     int i = ☃.c(cj2, cq);
/* 147 */     if (i >= 15) {
/* 148 */       return i;
/*     */     }
/*     */     
/* 151 */     alz alz2 = ☃.p(cj2);
/* 152 */     return Math.max(i, (alz2.c() == afi.af) ? ((Integer)alz2.<Integer>b(ajb.P)).intValue() : 0);
/*     */   }
/*     */   
/*     */   protected int c(adq ☃, cj cj1, alz alz1) {
/* 156 */     cq cq1 = alz1.<cq>b(O);
/* 157 */     cq cq2 = cq1.e();
/* 158 */     cq cq3 = cq1.f();
/* 159 */     return Math.max(c(☃, cj1.a(cq2), cq2), c(☃, cj1.a(cq3), cq3));
/*     */   }
/*     */   
/*     */   protected int c(adq ☃, cj cj1, cq cq1) {
/* 163 */     alz alz = ☃.p(cj1);
/* 164 */     afh afh = alz.c();
/* 165 */     if (c(afh)) {
/* 166 */       if (afh == afi.af) {
/* 167 */         return ((Integer)alz.<Integer>b(ajb.P)).intValue();
/*     */       }
/* 169 */       return ☃.a(cj1, cq1);
/*     */     } 
/*     */     
/* 172 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 177 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 182 */     return Q().a(O, pr1.aP().d());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/* 187 */     if (e(☃, cj1, alz1)) {
/* 188 */       ☃.a(cj1, this, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 194 */     h(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   protected void h(adm ☃, cj cj1, alz alz1) {
/* 198 */     cq cq = alz1.<cq>b(O);
/* 199 */     cj cj2 = cj1.a(cq.d());
/*     */     
/* 201 */     ☃.d(cj2, this);
/* 202 */     ☃.a(cj2, this, cq);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(adm ☃, cj cj1, alz alz1) {
/* 207 */     if (this.N) {
/* 208 */       cq[] arrayOfCq; int i; int j; for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 209 */         ☃.c(cj1.a(cq), this); j++; }
/*     */     
/*     */     } 
/* 212 */     super.d(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 217 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean c(afh ☃) {
/* 228 */     return ☃.i();
/*     */   }
/*     */   
/*     */   protected int a(adq ☃, cj cj1, alz alz1) {
/* 232 */     return 15;
/*     */   }
/*     */   
/*     */   public static boolean d(afh ☃) {
/* 236 */     return (afi.bb.e(☃) || afi.cj.e(☃));
/*     */   }
/*     */   
/*     */   public boolean e(afh ☃) {
/* 240 */     return (☃ == e(Q()).c() || ☃ == k(Q()).c());
/*     */   }
/*     */   
/*     */   public boolean i(adm ☃, cj cj1, alz alz1) {
/* 244 */     cq cq = ((cq)alz1.<cq>b(O)).d();
/* 245 */     cj cj2 = cj1.a(cq);
/*     */     
/* 247 */     if (d(☃.p(cj2).c())) {
/* 248 */       return (☃.p(cj2).b(O) != cq);
/*     */     }
/* 250 */     return false;
/*     */   }
/*     */   
/*     */   protected int m(alz ☃) {
/* 254 */     return d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract int d(alz paramalz);
/*     */   
/*     */   protected abstract alz e(alz paramalz);
/*     */   
/*     */   protected abstract alz k(alz paramalz);
/*     */   
/*     */   public boolean b(afh ☃) {
/* 265 */     return e(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 270 */     return adf.c;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */