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
/*     */ public abstract class afd
/*     */   extends afh
/*     */ {
/*     */   protected afd(arm ☃) {
/*  21 */     this(☃, ☃.r());
/*     */   }
/*     */   
/*     */   protected afd(arm ☃, arn arn1) {
/*  25 */     super(☃, arn1);
/*  26 */     a(yz.d);
/*  27 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  32 */     d(☃.p(cj1));
/*     */   }
/*     */   
/*     */   protected void d(alz ☃) {
/*  36 */     boolean bool = (e(☃) > 0);
/*  37 */     float f = 0.0625F;
/*     */     
/*  39 */     if (bool) {
/*  40 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.03125F, 0.9375F);
/*     */     } else {
/*  42 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.0625F, 0.9375F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  48 */     return 20;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  54 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  64 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  69 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  74 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  79 */     return m(☃, cj1.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  84 */     if (!m(☃, cj1.b())) {
/*  85 */       b(☃, cj1, alz1, 0);
/*  86 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean m(adm ☃, cj cj1) {
/*  91 */     return (adm.a(☃, cj1) || ☃.p(cj1).c() instanceof agt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 100 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 104 */     int i = e(alz1);
/* 105 */     if (i > 0) {
/* 106 */       a(☃, cj1, alz1, i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/* 112 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 116 */     int i = e(alz1);
/* 117 */     if (i == 0) {
/* 118 */       a(☃, cj1, alz1, i);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, cj cj1, alz alz1, int i) {
/* 123 */     int j = f(☃, cj1);
/* 124 */     boolean bool1 = (i > 0);
/* 125 */     boolean bool2 = (j > 0);
/*     */     
/* 127 */     if (i != j) {
/* 128 */       alz1 = a(alz1, j);
/* 129 */       ☃.a(cj1, alz1, 2);
/* 130 */       e(☃, cj1);
/* 131 */       ☃.b(cj1, cj1);
/*     */     } 
/*     */     
/* 134 */     if (!bool2 && bool1) {
/* 135 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.1D, cj1.p() + 0.5D, "random.click", 0.3F, 0.5F);
/* 136 */     } else if (bool2 && !bool1) {
/* 137 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.1D, cj1.p() + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     } 
/*     */     
/* 140 */     if (bool2) {
/* 141 */       ☃.a(cj1, this, a(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   protected aug a(cj ☃) {
/* 146 */     float f = 0.125F;
/* 147 */     return new aug((☃.n() + 0.125F), ☃.o(), (☃.p() + 0.125F), ((☃.n() + 1) - 0.125F), ☃.o() + 0.25D, ((☃.p() + 1) - 0.125F));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 152 */     if (e(alz1) > 0) {
/* 153 */       e(☃, cj1);
/*     */     }
/*     */     
/* 156 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   protected void e(adm ☃, cj cj1) {
/* 160 */     ☃.c(cj1, this);
/* 161 */     ☃.c(cj1.b(), this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 166 */     return e(alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 171 */     if (cq1 == cq.b) {
/* 172 */       return e(alz1);
/*     */     }
/*     */     
/* 175 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 180 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 185 */     float ☃ = 0.5F;
/* 186 */     float f1 = 0.125F;
/* 187 */     float f2 = 0.5F;
/* 188 */     a(0.0F, 0.375F, 0.0F, 1.0F, 0.625F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 193 */     return 1;
/*     */   }
/*     */   
/*     */   protected abstract int f(adm paramadm, cj paramcj);
/*     */   
/*     */   protected abstract int e(alz paramalz);
/*     */   
/*     */   protected abstract alz a(alz paramalz, int paramInt);
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */