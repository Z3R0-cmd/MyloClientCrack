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
/*     */ public class akh
/*     */   extends afh
/*     */ {
/*  25 */   public static final aml a = aml.a("facing", cq.c.a);
/*  26 */   public static final amk b = amk.a("open");
/*  27 */   public static final amm<a> N = amm.a("half", a.class);
/*     */   
/*     */   protected akh(arm ☃) {
/*  30 */     super(☃);
/*  31 */     j(this.M.b().<Comparable, cq>a(a, cq.c).<Comparable, Boolean>a(b, Boolean.valueOf(false)).a(N, a.b));
/*  32 */     float f1 = 0.5F;
/*  33 */     float f2 = 1.0F;
/*  34 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  35 */     a(yz.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  40 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  45 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  50 */     return !((Boolean)☃.p(cj1).<Boolean>b(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  55 */     a(☃, cj1);
/*  56 */     return super.b(☃, cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  62 */     a(☃, cj1);
/*  63 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  68 */     d(☃.p(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  73 */     float ☃ = 0.1875F;
/*  74 */     a(0.0F, 0.40625F, 0.0F, 1.0F, 0.59375F, 1.0F);
/*     */   }
/*     */   
/*     */   public void d(alz ☃) {
/*  78 */     if (☃.c() != this) {
/*     */       return;
/*     */     }
/*  81 */     boolean bool = (☃.b(N) == a.a);
/*  82 */     Boolean bool1 = ☃.<Boolean>b(b);
/*  83 */     cq cq = ☃.<cq>b(a);
/*     */     
/*  85 */     float f = 0.1875F;
/*  86 */     if (bool) {
/*  87 */       a(0.0F, 0.8125F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  89 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
/*     */     } 
/*     */     
/*  92 */     if (bool1.booleanValue()) {
/*  93 */       if (cq == cq.c) {
/*  94 */         a(0.0F, 0.0F, 0.8125F, 1.0F, 1.0F, 1.0F);
/*     */       }
/*  96 */       if (cq == cq.d) {
/*  97 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1875F);
/*     */       }
/*  99 */       if (cq == cq.e) {
/* 100 */         a(0.8125F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */       }
/* 102 */       if (cq == cq.f) {
/* 103 */         a(0.0F, 0.0F, 0.0F, 0.1875F, 1.0F, 1.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 110 */     if (this.J == arm.f) {
/* 111 */       return true;
/*     */     }
/*     */     
/* 114 */     alz1 = alz1.a(b);
/* 115 */     ☃.a(cj1, alz1, 2);
/*     */     
/* 117 */     ☃.a(wn1, ((Boolean)alz1.<Boolean>b(b)).booleanValue() ? 1003 : 1006, cj1, 0);
/* 118 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 123 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 127 */     cj cj2 = cj1.a(((cq)alz1.<cq>b(a)).d());
/*     */     
/* 129 */     if (!c(☃.p(cj2).c())) {
/* 130 */       ☃.g(cj1);
/* 131 */       b(☃, cj1, alz1, 0);
/*     */       
/*     */       return;
/*     */     } 
/* 135 */     boolean bool = ☃.z(cj1);
/* 136 */     if (bool || afh1.i()) {
/* 137 */       boolean bool1 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/*     */       
/* 139 */       if (bool1 != bool) {
/* 140 */         ☃.a(cj1, alz1.a(b, Boolean.valueOf(bool)), 2);
/* 141 */         ☃.a((wn)null, bool ? 1003 : 1006, cj1, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/* 148 */     a(☃, cj1);
/* 149 */     return super.a(☃, cj1, aui1, aui2);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 154 */     alz alz = Q();
/* 155 */     if (cq1.k().c()) {
/* 156 */       alz = alz.<Comparable, cq>a(a, cq1).a(b, Boolean.valueOf(false));
/* 157 */       alz = alz.a(N, (f2 > 0.5F) ? a.a : a.b);
/*     */     } 
/* 159 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/* 164 */     return (!cq1.k().b() && c(☃.p(cj1.a(cq1.d())).c()));
/*     */   }
/*     */   
/*     */   protected static cq b(int ☃) {
/* 168 */     switch (☃ & 0x3) {
/*     */       case 0:
/* 170 */         return cq.c;
/*     */       case 1:
/* 172 */         return cq.d;
/*     */       case 2:
/* 174 */         return cq.e;
/*     */     } 
/*     */     
/* 177 */     return cq.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected static int a(cq ☃) {
/* 182 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 184 */         return 0;
/*     */       case 2:
/* 186 */         return 1;
/*     */       case 3:
/* 188 */         return 2;
/*     */     } 
/*     */     
/* 191 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean c(afh ☃) {
/* 196 */     return ((☃.J.k() && ☃.d()) || ☃ == afi.aX || ☃ instanceof ahh || ☃ instanceof aju);
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 201 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 206 */     return Q().<Comparable, cq>a(a, b(☃)).<Comparable, Boolean>a(b, Boolean.valueOf(((☃ & 0x4) != 0))).a(N, ((☃ & 0x8) == 0) ? a.b : a.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 214 */     int i = 0;
/*     */     
/* 216 */     i |= a(☃.<cq>b(a));
/*     */     
/* 218 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 219 */       i |= 0x4;
/*     */     }
/*     */     
/* 222 */     if (☃.b(N) == a.a) {
/* 223 */       i |= 0x8;
/*     */     }
/*     */     
/* 226 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 231 */     return new ama(this, new amo[] { a, b, N });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 235 */     a("top"),
/* 236 */     b("bottom");
/*     */     
/*     */     private final String c;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 242 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 247 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 252 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */