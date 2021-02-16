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
/*     */ public abstract class afn
/*     */   extends afh
/*     */ {
/*  25 */   public static final aml a = aml.a("facing");
/*  26 */   public static final amk b = amk.a("powered");
/*     */   
/*     */   private final boolean N;
/*     */   
/*     */   protected afn(boolean ☃) {
/*  31 */     super(arm.q);
/*  32 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, Boolean.valueOf(false)));
/*  33 */     a(true);
/*  34 */     a(yz.d);
/*  35 */     this.N = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  41 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  46 */     return this.N ? 30 : 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  51 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/*  61 */     return a(☃, cj1, cq1.d());
/*     */   } public boolean d(adm ☃, cj cj1) {
/*     */     cq[] arrayOfCq;
/*     */     int i;
/*     */     int j;
/*  66 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/*  67 */       if (a(☃, cj1, cq)) {
/*  68 */         return true;
/*     */       }
/*     */       j++; }
/*     */     
/*  72 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean a(adm ☃, cj cj1, cq cq1) {
/*  76 */     cj cj2 = cj1.a(cq1);
/*  77 */     if (cq1 == cq.a) {
/*  78 */       return adm.a(☃, cj2);
/*     */     }
/*  80 */     return ☃.p(cj2).c().v();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  85 */     if (a(☃, cj1, cq1.d())) {
/*  86 */       return Q().<Comparable, cq>a(a, cq1).a(b, Boolean.valueOf(false));
/*     */     }
/*  88 */     return Q().<Comparable, cq>a(a, cq.a).a(b, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  94 */     if (e(☃, cj1, alz1) && 
/*  95 */       !a(☃, cj1, ((cq)alz1.<cq>b(a)).d())) {
/*  96 */       b(☃, cj1, alz1, 0);
/*  97 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean e(adm ☃, cj cj1, alz alz1) {
/* 103 */     if (d(☃, cj1)) {
/* 104 */       return true;
/*     */     }
/*     */     
/* 107 */     b(☃, cj1, alz1, 0);
/* 108 */     ☃.g(cj1);
/* 109 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 114 */     d(☃.p(cj1));
/*     */   }
/*     */   
/*     */   private void d(alz ☃) {
/* 118 */     cq cq = ☃.<cq>b(a);
/* 119 */     boolean bool = ((Boolean)☃.<Boolean>b(b)).booleanValue();
/*     */     
/* 121 */     float f1 = 0.25F;
/* 122 */     float f2 = 0.375F;
/* 123 */     float f3 = (bool ? true : 2) / 16.0F;
/* 124 */     float f4 = 0.125F;
/* 125 */     float f5 = 0.1875F;
/*     */     
/* 127 */     switch (null.a[cq.ordinal()]) {
/*     */       case 1:
/* 129 */         a(0.0F, 0.375F, 0.3125F, f3, 0.625F, 0.6875F);
/*     */         break;
/*     */       case 2:
/* 132 */         a(1.0F - f3, 0.375F, 0.3125F, 1.0F, 0.625F, 0.6875F);
/*     */         break;
/*     */       case 3:
/* 135 */         a(0.3125F, 0.375F, 0.0F, 0.6875F, 0.625F, f3);
/*     */         break;
/*     */       case 4:
/* 138 */         a(0.3125F, 0.375F, 1.0F - f3, 0.6875F, 0.625F, 1.0F);
/*     */         break;
/*     */       case 5:
/* 141 */         a(0.3125F, 0.0F, 0.375F, 0.6875F, 0.0F + f3, 0.625F);
/*     */         break;
/*     */       case 6:
/* 144 */         a(0.3125F, 1.0F - f3, 0.375F, 0.6875F, 1.0F, 0.625F);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 151 */     if (((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 152 */       return true;
/*     */     }
/*     */     
/* 155 */     ☃.a(cj1, alz1.a(b, Boolean.valueOf(true)), 3);
/* 156 */     ☃.b(cj1, cj1);
/*     */     
/* 158 */     ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     
/* 160 */     c(☃, cj1, alz1.<cq>b(a));
/*     */     
/* 162 */     ☃.a(cj1, this, a(☃));
/*     */     
/* 164 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 169 */     if (((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 170 */       c(☃, cj1, alz1.<cq>b(a));
/*     */     }
/* 172 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 177 */     return ((Boolean)alz1.<Boolean>b(b)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 182 */     if (!((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 183 */       return 0;
/*     */     }
/*     */     
/* 186 */     if (alz1.b(a) == cq1) {
/* 187 */       return 15;
/*     */     }
/*     */     
/* 190 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 195 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 204 */     if (☃.D) {
/*     */       return;
/*     */     }
/* 207 */     if (!((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/*     */       return;
/*     */     }
/* 210 */     if (this.N) {
/* 211 */       f(☃, cj1, alz1);
/*     */     } else {
/* 213 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(false)));
/*     */       
/* 215 */       c(☃, cj1, alz1.<cq>b(a));
/*     */       
/* 217 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "random.click", 0.3F, 0.5F);
/* 218 */       ☃.b(cj1, cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 224 */     float ☃ = 0.1875F;
/* 225 */     float f1 = 0.125F;
/* 226 */     float f2 = 0.125F;
/* 227 */     a(0.5F - ☃, 0.5F - f1, 0.5F - f2, 0.5F + ☃, 0.5F + f1, 0.5F + f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/* 232 */     if (☃.D) {
/*     */       return;
/*     */     }
/* 235 */     if (!this.N) {
/*     */       return;
/*     */     }
/*     */     
/* 239 */     if (((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 243 */     f(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   private void f(adm ☃, cj cj1, alz alz1) {
/* 247 */     d(alz1);
/* 248 */     List<? extends pk> list = ☃.a((Class)wq.class, new aug(cj1.n() + this.B, cj1.o() + this.C, cj1.p() + this.D, cj1.n() + this.E, cj1.o() + this.F, cj1.p() + this.G));
/* 249 */     boolean bool1 = !list.isEmpty();
/* 250 */     boolean bool2 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/*     */     
/* 252 */     if (bool1 && !bool2) {
/* 253 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(true)));
/* 254 */       c(☃, cj1, alz1.<cq>b(a));
/* 255 */       ☃.b(cj1, cj1);
/*     */       
/* 257 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     } 
/* 259 */     if (!bool1 && bool2) {
/* 260 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(false)));
/* 261 */       c(☃, cj1, alz1.<cq>b(a));
/* 262 */       ☃.b(cj1, cj1);
/*     */       
/* 264 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "random.click", 0.3F, 0.5F);
/*     */     } 
/*     */     
/* 267 */     if (bool1) {
/* 268 */       ☃.a(cj1, this, a(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(adm ☃, cj cj1, cq cq1) {
/* 273 */     ☃.c(cj1, this);
/* 274 */     ☃.c(cj1.a(cq1.d()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*     */     cq cq;
/* 280 */     switch (☃ & 0x7) {
/*     */       case 0:
/* 282 */         cq = cq.a;
/*     */         break;
/*     */       case 1:
/* 285 */         cq = cq.f;
/*     */         break;
/*     */       case 2:
/* 288 */         cq = cq.e;
/*     */         break;
/*     */       case 3:
/* 291 */         cq = cq.d;
/*     */         break;
/*     */       case 4:
/* 294 */         cq = cq.c;
/*     */         break;
/*     */       
/*     */       default:
/* 298 */         cq = cq.b;
/*     */         break;
/*     */     } 
/*     */     
/* 302 */     return Q().<Comparable, cq>a(a, cq).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*     */     int i;
/* 310 */     switch (null.a[((cq)☃.b(a)).ordinal()]) {
/*     */       case 6:
/* 312 */         i = 0;
/*     */         break;
/*     */       case 1:
/* 315 */         i = 1;
/*     */         break;
/*     */       case 2:
/* 318 */         i = 2;
/*     */         break;
/*     */       case 3:
/* 321 */         i = 3;
/*     */         break;
/*     */       case 4:
/* 324 */         i = 4;
/*     */         break;
/*     */       
/*     */       default:
/* 328 */         i = 5;
/*     */         break;
/*     */     } 
/*     */     
/* 332 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 333 */       i |= 0x8;
/*     */     }
/*     */     
/* 336 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 341 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */