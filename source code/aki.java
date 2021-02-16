/*     */ import java.util.Iterator;
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
/*     */ public class aki
/*     */   extends afh
/*     */ {
/*  23 */   public static final amk a = amk.a("powered");
/*  24 */   public static final amk b = amk.a("suspended");
/*  25 */   public static final amk N = amk.a("attached");
/*  26 */   public static final amk O = amk.a("disarmed");
/*  27 */   public static final amk P = amk.a("north");
/*  28 */   public static final amk Q = amk.a("east");
/*  29 */   public static final amk R = amk.a("south");
/*  30 */   public static final amk S = amk.a("west");
/*     */   
/*     */   public aki() {
/*  33 */     super(arm.q);
/*  34 */     j(this.M.b().<Comparable, Boolean>a(a, Boolean.valueOf(false)).<Comparable, Boolean>a(b, Boolean.valueOf(false)).<Comparable, Boolean>a(N, Boolean.valueOf(false)).<Comparable, Boolean>a(O, Boolean.valueOf(false)).<Comparable, Boolean>a(P, Boolean.valueOf(false)).<Comparable, Boolean>a(Q, Boolean.valueOf(false)).<Comparable, Boolean>a(R, Boolean.valueOf(false)).a(S, Boolean.valueOf(false)));
/*  35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
/*  36 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  41 */     return ☃.<Comparable, Boolean>a(P, Boolean.valueOf(c(adq1, cj1, ☃, cq.c))).<Comparable, Boolean>a(Q, Boolean.valueOf(c(adq1, cj1, ☃, cq.f))).<Comparable, Boolean>a(R, Boolean.valueOf(c(adq1, cj1, ☃, cq.d))).a(S, Boolean.valueOf(c(adq1, cj1, ☃, cq.e)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  51 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/*  66 */     return adf.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  72 */     return zy.F;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  77 */     return zy.F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  82 */     boolean bool1 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/*  83 */     boolean bool2 = !adm.a(☃, cj1.b());
/*     */     
/*  85 */     if (bool1 != bool2) {
/*  86 */       b(☃, cj1, alz1, 0);
/*  87 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  93 */     alz alz = ☃.p(cj1);
/*  94 */     boolean bool1 = ((Boolean)alz.<Boolean>b(N)).booleanValue();
/*  95 */     boolean bool2 = ((Boolean)alz.<Boolean>b(b)).booleanValue();
/*     */     
/*  97 */     if (!bool2) {
/*  98 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
/*  99 */     } else if (!bool1) {
/* 100 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     } else {
/* 102 */       a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 108 */     alz1 = alz1.a(b, Boolean.valueOf(!adm.a(☃, cj1.b())));
/* 109 */     ☃.a(cj1, alz1, 3);
/* 110 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 115 */     e(☃, cj1, alz1.a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 120 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 124 */     if (wn1.bZ() != null && wn1.bZ().b() == zy.be)
/* 125 */       ☃.a(cj1, alz1.a(O, Boolean.valueOf(true)), 4); 
/*     */   } private void e(adm ☃, cj cj1, alz alz1) {
/*     */     cq[] arrayOfCq;
/*     */     int i;
/*     */     int j;
/* 130 */     for (arrayOfCq = new cq[] { cq.d, cq.e }, i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/* 131 */       for (int k = 1; k < 42; k++) {
/* 132 */         cj cj2 = cj1.a(cq, k);
/* 133 */         alz alz2 = ☃.p(cj2);
/*     */         
/* 135 */         if (alz2.c() == afi.bR) {
/* 136 */           if (alz2.b(akj.a) == cq.d()) {
/* 137 */             afi.bR.a(☃, cj2, alz2, false, true, k, alz1);
/*     */           }
/*     */           break;
/*     */         } 
/* 141 */         if (alz2.c() != afi.bS) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/* 150 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 154 */     if (((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 158 */     e(☃, cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 167 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 171 */     if (!((Boolean)☃.p(cj1).<Boolean>b(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 175 */     e(☃, cj1);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1) {
/* 179 */     alz alz = ☃.p(cj1);
/* 180 */     boolean bool1 = ((Boolean)alz.<Boolean>b(a)).booleanValue();
/* 181 */     boolean bool2 = false;
/*     */     
/* 183 */     List<? extends pk> list = ☃.b((pk)null, new aug(cj1.n() + this.B, cj1.o() + this.C, cj1.p() + this.D, cj1.n() + this.E, cj1.o() + this.F, cj1.p() + this.G));
/* 184 */     if (!list.isEmpty()) {
/* 185 */       for (Iterator<? extends pk> iterator = list.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 186 */         if (!pk.aI()) {
/* 187 */           bool2 = true;
/*     */           
/*     */           break;
/*     */         }  }
/*     */     
/*     */     }
/* 193 */     if (bool2 != bool1) {
/* 194 */       alz = alz.a(a, Boolean.valueOf(bool2));
/* 195 */       ☃.a(cj1, alz, 3);
/* 196 */       e(☃, cj1, alz);
/*     */     } 
/*     */     
/* 199 */     if (bool2) {
/* 200 */       ☃.a(cj1, this, a(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean c(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 205 */     cj cj2 = cj1.a(cq1);
/* 206 */     alz alz2 = ☃.p(cj2);
/* 207 */     afh afh1 = alz2.c();
/*     */     
/* 209 */     if (afh1 == afi.bR) {
/* 210 */       cq cq2 = cq1.d();
/* 211 */       return (alz2.b(akj.a) == cq2);
/*     */     } 
/*     */     
/* 214 */     if (afh1 == afi.bS) {
/* 215 */       boolean bool1 = ((Boolean)alz1.<Boolean>b(b)).booleanValue();
/* 216 */       boolean bool2 = ((Boolean)alz2.<Boolean>b(b)).booleanValue();
/* 217 */       return (bool1 == bool2);
/*     */     } 
/*     */     
/* 220 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 225 */     return Q().<Comparable, Boolean>a(a, Boolean.valueOf(((☃ & 0x1) > 0))).<Comparable, Boolean>a(b, Boolean.valueOf(((☃ & 0x2) > 0))).<Comparable, Boolean>a(N, Boolean.valueOf(((☃ & 0x4) > 0))).a(O, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 234 */     int i = 0;
/*     */     
/* 236 */     if (((Boolean)☃.<Boolean>b(a)).booleanValue()) {
/* 237 */       i |= 0x1;
/*     */     }
/*     */     
/* 240 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 241 */       i |= 0x2;
/*     */     }
/*     */     
/* 244 */     if (((Boolean)☃.<Boolean>b(N)).booleanValue()) {
/* 245 */       i |= 0x4;
/*     */     }
/*     */     
/* 248 */     if (((Boolean)☃.<Boolean>b(O)).booleanValue()) {
/* 249 */       i |= 0x8;
/*     */     }
/*     */     
/* 252 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 257 */     return new ama(this, new amo[] { a, b, N, O, P, Q, S, R });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */