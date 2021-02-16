/*     */ import com.google.common.base.Objects;
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
/*     */ 
/*     */ public class akj
/*     */   extends afh
/*     */ {
/*  24 */   public static final aml a = aml.a("facing", cq.c.a);
/*  25 */   public static final amk b = amk.a("powered");
/*  26 */   public static final amk N = amk.a("attached");
/*  27 */   public static final amk O = amk.a("suspended");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public akj() {
/*  33 */     super(arm.q);
/*  34 */     j(this.M.b().<Comparable, cq>a(a, cq.c).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
/*  35 */     a(yz.d);
/*  36 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  41 */     return ☃.a(O, Boolean.valueOf(!adm.a(adq1, cj1.b())));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  47 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/*  62 */     return (cq1.k().c() && ☃.p(cj1.a(cq1.d())).c().v());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  67 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  68 */       if (☃.p(cj1.a(cq)).c().v()) {
/*  69 */         return true;
/*     */       } }
/*     */     
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  77 */     alz alz = Q().<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false));
/*  78 */     if (cq1.k().c()) {
/*  79 */       alz = alz.a(a, cq1);
/*     */     }
/*  81 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  86 */     a(☃, cj1, alz1, false, false, -1, (alz)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  91 */     if (afh1 == this) {
/*     */       return;
/*     */     }
/*  94 */     if (e(☃, cj1, alz1)) {
/*  95 */       cq cq = alz1.<cq>b(a);
/*  96 */       if (!☃.p(cj1.a(cq.d())).c().v()) {
/*  97 */         b(☃, cj1, alz1, 0);
/*  98 */         ☃.g(cj1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void a(adm ☃, cj cj1, alz alz1, boolean bool1, boolean bool2, int i, alz alz2) {
/*     */     int m;
/* 104 */     cq cq = alz1.<cq>b(a);
/* 105 */     int j = ((Boolean)alz1.<Boolean>b(N)).booleanValue();
/* 106 */     boolean bool3 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/* 107 */     boolean bool4 = !adm.a(☃, cj1.b());
/*     */     
/* 109 */     boolean bool5 = !bool1;
/* 110 */     boolean bool6 = false;
/* 111 */     int n = 0;
/*     */     
/* 113 */     alz[] arrayOfAlz = new alz[42];
/* 114 */     for (int i1 = 1; i1 < 42; i1++) {
/* 115 */       cj cj2 = cj1.a(cq, i1);
/* 116 */       alz alz4 = ☃.p(cj2);
/*     */       
/* 118 */       if (alz4.c() == afi.bR) {
/* 119 */         if (alz4.b(a) == cq.d()) {
/* 120 */           n = i1;
/*     */         }
/*     */         break;
/*     */       } 
/* 124 */       if (alz4.c() == afi.bS || i1 == i) {
/* 125 */         if (i1 == i) {
/* 126 */           alz4 = (alz)Objects.firstNonNull(alz2, alz4);
/*     */         }
/* 128 */         int i3 = !((Boolean)alz4.<Boolean>b(aki.O)).booleanValue() ? 1 : 0;
/* 129 */         boolean bool7 = ((Boolean)alz4.<Boolean>b(aki.a)).booleanValue();
/* 130 */         boolean bool8 = ((Boolean)alz4.<Boolean>b(aki.b)).booleanValue();
/* 131 */         int i2 = bool5 & ((bool8 == bool4) ? 1 : 0);
/* 132 */         m = bool6 | ((i3 && bool7) ? 1 : 0);
/*     */         
/* 134 */         arrayOfAlz[i1] = alz4;
/*     */         
/* 136 */         if (i1 == i) {
/* 137 */           ☃.a(cj1, this, a(☃));
/* 138 */           int i4 = i2 & i3;
/*     */         } 
/*     */       } else {
/* 141 */         arrayOfAlz[i1] = null;
/* 142 */         bool5 = false;
/*     */       } 
/*     */     } 
/*     */     
/* 146 */     int k = bool5 & ((n > 1) ? 1 : 0);
/* 147 */     m &= k;
/* 148 */     alz alz3 = Q().<Comparable, Boolean>a(N, Boolean.valueOf(k)).a(b, Boolean.valueOf(m));
/*     */     
/* 150 */     if (n > 0) {
/* 151 */       cj cj2 = cj1.a(cq, n);
/* 152 */       cq cq1 = cq.d();
/* 153 */       ☃.a(cj2, alz3.a(a, cq1), 3);
/* 154 */       a(☃, cj2, cq1);
/*     */       
/* 156 */       a(☃, cj2, k, m, j, bool3);
/*     */     } 
/*     */     
/* 159 */     a(☃, cj1, k, m, j, bool3);
/*     */     
/* 161 */     if (!bool1) {
/* 162 */       ☃.a(cj1, alz3.a(a, cq), 3);
/* 163 */       if (bool2) {
/* 164 */         a(☃, cj1, cq);
/*     */       }
/*     */     } 
/*     */     
/* 168 */     if (j != k) {
/* 169 */       for (int i2 = 1; i2 < n; i2++) {
/* 170 */         cj cj2 = cj1.a(cq, i2);
/* 171 */         alz alz4 = arrayOfAlz[i2];
/* 172 */         if (alz4 != null)
/*     */         {
/*     */ 
/*     */           
/* 176 */           if (☃.p(cj2).c() != afi.a) {
/* 177 */             ☃.a(cj2, alz4.a(N, Boolean.valueOf(k)), 3);
/*     */           }
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 189 */     a(☃, cj1, alz1, false, true, -1, (alz)null);
/*     */   }
/*     */   
/*     */   private void a(adm ☃, cj cj1, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 193 */     if (bool2 && !bool4) {
/* 194 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.1D, cj1.p() + 0.5D, "random.click", 0.4F, 0.6F);
/* 195 */     } else if (!bool2 && bool4) {
/* 196 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.1D, cj1.p() + 0.5D, "random.click", 0.4F, 0.5F);
/* 197 */     } else if (bool1 && !bool3) {
/* 198 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.1D, cj1.p() + 0.5D, "random.click", 0.4F, 0.7F);
/* 199 */     } else if (!bool1 && bool3) {
/* 200 */       ☃.a(cj1.n() + 0.5D, cj1.o() + 0.1D, cj1.p() + 0.5D, "random.bowhit", 0.4F, 1.2F / (☃.s.nextFloat() * 0.2F + 0.9F));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(adm ☃, cj cj1, cq cq1) {
/* 205 */     ☃.c(cj1, this);
/* 206 */     ☃.c(cj1.a(cq1.d()), this);
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1, alz alz1) {
/* 210 */     if (!d(☃, cj1)) {
/* 211 */       b(☃, cj1, alz1, 0);
/* 212 */       ☃.g(cj1);
/* 213 */       return false;
/*     */     } 
/*     */     
/* 216 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 221 */     float f = 0.1875F;
/*     */     
/* 223 */     switch (null.a[((cq)☃.p(cj1).b(a)).ordinal()]) {
/*     */       case 1:
/* 225 */         a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/*     */         break;
/*     */       case 2:
/* 228 */         a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/*     */         break;
/*     */       case 3:
/* 231 */         a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/*     */         break;
/*     */       case 4:
/* 234 */         a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 241 */     boolean bool1 = ((Boolean)alz1.<Boolean>b(N)).booleanValue();
/* 242 */     boolean bool2 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/*     */     
/* 244 */     if (bool1 || bool2) {
/* 245 */       a(☃, cj1, alz1, true, false, -1, (alz)null);
/*     */     }
/*     */     
/* 248 */     if (bool2) {
/* 249 */       ☃.c(cj1, this);
/* 250 */       ☃.c(cj1.a(((cq)alz1.<cq>b(a)).d()), this);
/*     */     } 
/*     */     
/* 253 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 258 */     return ((Boolean)alz1.<Boolean>b(b)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 263 */     if (!((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 264 */       return 0;
/*     */     }
/*     */     
/* 267 */     if (alz1.b(a) == cq1) {
/* 268 */       return 15;
/*     */     }
/*     */     
/* 271 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 276 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 281 */     return adf.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 286 */     return Q().<Comparable, cq>a(a, cq.b(☃ & 0x3)).<Comparable, Boolean>a(b, Boolean.valueOf(((☃ & 0x8) > 0))).a(N, Boolean.valueOf(((☃ & 0x4) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 294 */     int i = 0;
/*     */     
/* 296 */     i |= ((cq)☃.<cq>b(a)).b();
/*     */     
/* 298 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 299 */       i |= 0x8;
/*     */     }
/*     */     
/* 302 */     if (((Boolean)☃.<Boolean>b(N)).booleanValue()) {
/* 303 */       i |= 0x4;
/*     */     }
/*     */     
/* 306 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 311 */     return new ama(this, new amo[] { a, b, N, O });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */