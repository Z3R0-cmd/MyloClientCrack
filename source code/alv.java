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
/*     */ public class alv
/*     */   extends afc
/*     */ {
/*  26 */   public static final aml a = alt.a;
/*  27 */   public static final amm<alt.a> b = alt.b;
/*     */   
/*     */   public alv() {
/*  30 */     super(arm.H);
/*  31 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, alt.a.a));
/*  32 */     c(-1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/*  37 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static akw a(alz ☃, cq cq1, boolean bool1, boolean bool2) {
/*  42 */     return new alu(☃, cq1, bool1, bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/*  47 */     akw akw = ☃.s(cj1);
/*  48 */     if (akw instanceof alu) {
/*  49 */       ((alu)akw).h();
/*     */     } else {
/*  51 */       super.b(☃, cj1, alz1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/*  62 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(adm ☃, cj cj1, alz alz1) {
/*  68 */     cj cj2 = cj1.a(((cq)alz1.<cq>b(a)).d());
/*  69 */     alz alz2 = ☃.p(cj2);
/*  70 */     if (alz2.c() instanceof als && ((Boolean)alz2.<Boolean>b(als.b)).booleanValue()) {
/*  71 */       ☃.g(cj2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  88 */     if (!☃.D && ☃.s(cj1) == null) {
/*     */       
/*  90 */       ☃.g(cj1);
/*  91 */       return true;
/*     */     } 
/*  93 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  99 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 104 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 108 */     alu alu = e(☃, cj1);
/* 109 */     if (alu == null) {
/*     */       return;
/*     */     }
/*     */     
/* 113 */     alz alz2 = alu.b();
/* 114 */     alz2.c().b(☃, cj1, alz2, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/* 120 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 125 */     if (!☃.D) {
/* 126 */       ☃.s(cj1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 133 */     alu alu = e(☃, cj1);
/* 134 */     if (alu == null) {
/* 135 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 139 */     float f = alu.a(0.0F);
/* 140 */     if (alu.d()) {
/* 141 */       f = 1.0F - f;
/*     */     }
/* 143 */     return a(☃, cj1, alu.b(), f, alu.e());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 148 */     alu alu = e(☃, cj1);
/* 149 */     if (alu != null) {
/* 150 */       alz alz = alu.b();
/* 151 */       afh afh = alz.c();
/* 152 */       if (afh == this || afh.t() == arm.a) {
/*     */         return;
/*     */       }
/*     */       
/* 156 */       float f = alu.a(0.0F);
/* 157 */       if (alu.d()) {
/* 158 */         f = 1.0F - f;
/*     */       }
/* 160 */       afh.a(☃, cj1);
/* 161 */       if (afh == afi.J || afh == afi.F) {
/* 162 */         f = 0.0F;
/*     */       }
/* 164 */       cq cq = alu.e();
/* 165 */       this.B = afh.B() - (cq.g() * f);
/* 166 */       this.C = afh.D() - (cq.h() * f);
/* 167 */       this.D = afh.F() - (cq.i() * f);
/* 168 */       this.E = afh.C() - (cq.g() * f);
/* 169 */       this.F = afh.E() - (cq.h() * f);
/* 170 */       this.G = afh.G() - (cq.i() * f);
/*     */     } 
/*     */   }
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1, float f, cq cq1) {
/* 175 */     if (alz1.c() == this || alz1.c().t() == arm.a) {
/* 176 */       return null;
/*     */     }
/* 178 */     aug aug = alz1.c().a(☃, cj1, alz1);
/*     */     
/* 180 */     if (aug == null) {
/* 181 */       return null;
/*     */     }
/*     */     
/* 184 */     double d1 = aug.a;
/* 185 */     double d2 = aug.b;
/* 186 */     double d3 = aug.c;
/* 187 */     double d4 = aug.d;
/* 188 */     double d5 = aug.e;
/* 189 */     double d6 = aug.f;
/*     */ 
/*     */     
/* 192 */     if (cq1.g() < 0) {
/* 193 */       d1 -= (cq1.g() * f);
/*     */     } else {
/* 195 */       d4 -= (cq1.g() * f);
/*     */     } 
/* 197 */     if (cq1.h() < 0) {
/* 198 */       d2 -= (cq1.h() * f);
/*     */     } else {
/* 200 */       d5 -= (cq1.h() * f);
/*     */     } 
/* 202 */     if (cq1.i() < 0) {
/* 203 */       d3 -= (cq1.i() * f);
/*     */     } else {
/* 205 */       d6 -= (cq1.i() * f);
/*     */     } 
/* 207 */     return new aug(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   private alu e(adq ☃, cj cj1) {
/* 211 */     akw akw = ☃.s(cj1);
/* 212 */     if (akw instanceof alu) {
/* 213 */       return (alu)akw;
/*     */     }
/* 215 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 220 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 225 */     return Q().<Comparable, cq>a(a, alt.b(☃)).a(b, ((☃ & 0x8) > 0) ? alt.a.b : alt.a.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 232 */     int i = 0;
/*     */     
/* 234 */     i |= ((cq)☃.<cq>b(a)).a();
/*     */     
/* 236 */     if (☃.b(b) == alt.a.b) {
/* 237 */       i |= 0x8;
/*     */     }
/*     */     
/* 240 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 245 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */