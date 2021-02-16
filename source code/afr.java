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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afr
/*     */   extends afh
/*     */ {
/*  29 */   public static final amn a = amn.a("level", 0, 3);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public afr() {
/*  35 */     super(arm.f, arn.m);
/*  36 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  41 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
/*  42 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  43 */     float f = 0.125F;
/*  44 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  45 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  46 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  47 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  48 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  49 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  50 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  51 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/*  53 */     j();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  58 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/*  73 */     int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  74 */     float f = cj1.o() + (6.0F + (3 * i)) / 16.0F;
/*     */     
/*  76 */     if (!☃.D && pk1.at() && i > 0 && (pk1.aR()).b <= f) {
/*  77 */       pk1.N();
/*     */       
/*  79 */       a(☃, cj1, alz1, i - 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  85 */     if (☃.D) {
/*  86 */       return true;
/*     */     }
/*     */     
/*  89 */     zx zx = wn1.bi.h();
/*  90 */     if (zx == null) {
/*  91 */       return true;
/*     */     }
/*     */     
/*  94 */     int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  95 */     zw zw = zx.b();
/*  96 */     if (zw == zy.ax) {
/*  97 */       if (i < 3) {
/*  98 */         if (!wn1.bA.d) {
/*  99 */           wn1.bi.a(wn1.bi.c, new zx(zy.aw));
/*     */         }
/* 101 */         wn1.b(na.I);
/*     */         
/* 103 */         a(☃, cj1, alz1, 3);
/*     */       } 
/* 105 */       return true;
/*     */     } 
/*     */     
/* 108 */     if (zw == zy.bA) {
/* 109 */       if (i > 0) {
/* 110 */         if (!wn1.bA.d) {
/* 111 */           zx zx1 = new zx(zy.bz, 1, 0);
/* 112 */           if (!wn1.bi.a(zx1)) {
/* 113 */             ☃.d(new uz(☃, cj1.n() + 0.5D, cj1.o() + 1.5D, cj1.p() + 0.5D, zx1));
/* 114 */           } else if (wn1 instanceof lf) {
/* 115 */             ((lf)wn1).a(wn1.bj);
/*     */           } 
/* 117 */           wn1.b(na.J);
/*     */           
/* 119 */           zx.b--;
/* 120 */           if (zx.b <= 0) {
/* 121 */             wn1.bi.a(wn1.bi.c, (zx)null);
/*     */           }
/*     */         } 
/*     */         
/* 125 */         a(☃, cj1, alz1, i - 1);
/*     */       } 
/* 127 */       return true;
/*     */     } 
/*     */     
/* 130 */     if (i > 0 && zw instanceof yj) {
/* 131 */       yj yj = (yj)zw;
/* 132 */       if (yj.x_() == yj.a.a && yj.d_(zx)) {
/* 133 */         yj.c(zx);
/* 134 */         a(☃, cj1, alz1, i - 1);
/* 135 */         wn1.b(na.K);
/* 136 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 140 */     if (i > 0 && zw instanceof ym && 
/* 141 */       aku.c(zx) > 0) {
/* 142 */       zx zx1 = zx.k();
/* 143 */       zx1.b = 1;
/* 144 */       aku.e(zx1);
/*     */       
/* 146 */       if (zx.b > 1 || wn1.bA.d) {
/*     */         
/* 148 */         if (!wn1.bi.a(zx1)) {
/* 149 */           ☃.d(new uz(☃, cj1.n() + 0.5D, cj1.o() + 1.5D, cj1.p() + 0.5D, zx1));
/* 150 */         } else if (wn1 instanceof lf) {
/* 151 */           ((lf)wn1).a(wn1.bj);
/*     */         } 
/* 153 */         wn1.b(na.L);
/* 154 */         if (!wn1.bA.d) {
/* 155 */           zx.b--;
/*     */         }
/*     */       } else {
/*     */         
/* 159 */         wn1.bi.a(wn1.bi.c, zx1);
/*     */       } 
/*     */       
/* 162 */       if (!wn1.bA.d) {
/* 163 */         a(☃, cj1, alz1, i - 1);
/*     */       }
/* 165 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 169 */     return false;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, int i) {
/* 173 */     ☃.a(cj1, alz1.a(a, Integer.valueOf(ns.a(i, 0, 3))), 2);
/* 174 */     ☃.e(cj1, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(adm ☃, cj cj1) {
/* 179 */     if (☃.s.nextInt(20) != 1) {
/*     */       return;
/*     */     }
/*     */     
/* 183 */     alz alz = ☃.p(cj1);
/* 184 */     if (((Integer)alz.b(a)).intValue() < 3) {
/* 185 */       ☃.a(cj1, alz.a(a), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 192 */     return zy.bG;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 197 */     return zy.bG;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 202 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 207 */     return ((Integer)☃.p(cj1).<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 212 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 218 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 223 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */