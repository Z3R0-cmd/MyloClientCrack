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
/*     */ public class agg
/*     */   extends afc
/*     */ {
/*  27 */   public static final aml a = aml.a("facing");
/*  28 */   public static final amk b = amk.a("triggered");
/*     */   
/*  30 */   public static final cp<zw, cr> N = new cp<zw, cr>(new cn());
/*     */   
/*  32 */   protected Random O = new Random();
/*     */   
/*     */   protected agg() {
/*  35 */     super(arm.e);
/*  36 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, Boolean.valueOf(false)));
/*  37 */     a(yz.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  42 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  47 */     super.c(☃, cj1, alz1);
/*  48 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1, alz alz1) {
/*  52 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  56 */     cq cq = alz1.<cq>b(a);
/*  57 */     boolean bool1 = ☃.p(cj1.c()).c().o();
/*  58 */     boolean bool2 = ☃.p(cj1.d()).c().o();
/*  59 */     if (cq == cq.c && bool1 && !bool2) {
/*  60 */       cq = cq.d;
/*  61 */     } else if (cq == cq.d && bool2 && !bool1) {
/*  62 */       cq = cq.c;
/*     */     } else {
/*  64 */       boolean bool3 = ☃.p(cj1.e()).c().o();
/*  65 */       boolean bool4 = ☃.p(cj1.f()).c().o();
/*  66 */       if (cq == cq.e && bool3 && !bool4) {
/*  67 */         cq = cq.f;
/*  68 */       } else if (cq == cq.f && bool4 && !bool3) {
/*  69 */         cq = cq.e;
/*     */       } 
/*     */     } 
/*     */     
/*  73 */     ☃.a(cj1, alz1.<Comparable, cq>a(a, cq).a(b, Boolean.valueOf(false)), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  78 */     if (☃.D) {
/*  79 */       return true;
/*     */     }
/*     */     
/*  82 */     akw akw = ☃.s(cj1);
/*  83 */     if (akw instanceof alc) {
/*  84 */       wn1.a((alc)akw);
/*  85 */       if (akw instanceof ald) {
/*  86 */         wn1.b(na.O);
/*     */       } else {
/*  88 */         wn1.b(na.Q);
/*     */       } 
/*     */     } 
/*     */     
/*  92 */     return true;
/*     */   }
/*     */   
/*     */   protected void f(adm ☃, cj cj1) {
/*  96 */     cl cl = new cl(☃, cj1);
/*  97 */     alc alc = cl.<alc>h();
/*  98 */     if (alc == null) {
/*     */       return;
/*     */     }
/*     */     
/* 102 */     int i = alc.m();
/* 103 */     if (i < 0) {
/* 104 */       ☃.b(1001, cj1, 0);
/*     */       
/*     */       return;
/*     */     } 
/* 108 */     zx zx = alc.a(i);
/* 109 */     cr cr = a(zx);
/*     */     
/* 111 */     if (cr != cr.a) {
/* 112 */       zx zx1 = cr.a(cl, zx);
/*     */       
/* 114 */       alc.a(i, (zx1.b <= 0) ? null : zx1);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected cr a(zx ☃) {
/* 119 */     return N.a((☃ == null) ? null : ☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 124 */     boolean bool1 = (☃.z(cj1) || ☃.z(cj1.a()));
/* 125 */     boolean bool2 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/*     */     
/* 127 */     if (bool1 && !bool2) {
/* 128 */       ☃.a(cj1, this, a(☃));
/* 129 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(true)), 4);
/* 130 */     } else if (!bool1 && bool2) {
/* 131 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(false)), 4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 137 */     if (!☃.D) {
/* 138 */       f(☃, cj1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 144 */     return new alc();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 149 */     return Q().<Comparable, cq>a(a, als.a(☃, cj1, pr1)).a(b, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/* 154 */     ☃.a(cj1, alz1.a(a, als.a(☃, cj1, pr1)), 2);
/*     */     
/* 156 */     if (zx1.s()) {
/* 157 */       akw akw = ☃.s(cj1);
/* 158 */       if (akw instanceof alc) {
/* 159 */         ((alc)akw).a(zx1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 166 */     akw akw = ☃.s(cj1);
/* 167 */     if (akw instanceof alc) {
/* 168 */       oi.a(☃, cj1, (alc)akw);
/*     */       
/* 170 */       ☃.e(cj1, this);
/*     */     } 
/* 172 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   public static cz a(ck ☃) {
/* 176 */     cq cq = b(☃.f());
/*     */     
/* 178 */     double d1 = ☃.a() + 0.7D * cq.g();
/* 179 */     double d2 = ☃.b() + 0.7D * cq.h();
/* 180 */     double d3 = ☃.c() + 0.7D * cq.i();
/*     */     
/* 182 */     return new da(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static cq b(int ☃) {
/* 186 */     return cq.a(☃ & 0x7);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 191 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 196 */     return xi.a(☃.s(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 201 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz b(alz ☃) {
/* 206 */     return Q().a(a, cq.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 211 */     return Q().<Comparable, cq>a(a, b(☃)).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 218 */     int i = 0;
/*     */     
/* 220 */     i |= ((cq)☃.<cq>b(a)).a();
/*     */     
/* 222 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 223 */       i |= 0x8;
/*     */     }
/*     */     
/* 226 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 231 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */