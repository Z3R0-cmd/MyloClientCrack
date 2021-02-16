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
/*     */ 
/*     */ 
/*     */ public class afg
/*     */   extends age
/*     */ {
/*  25 */   public static final amm<a> a = amm.a("part", a.class);
/*  26 */   public static final amk b = amk.a("occupied");
/*     */   
/*     */   public afg() {
/*  29 */     super(arm.n);
/*  30 */     j(this.M.b().<a, a>a(a, a.b).a(b, Boolean.valueOf(false)));
/*  31 */     l();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  36 */     if (☃.D) {
/*  37 */       return true;
/*     */     }
/*     */     
/*  40 */     if (alz1.b(a) != a.a) {
/*     */       
/*  42 */       cj1 = cj1.a(alz1.<cq>b(O));
/*  43 */       alz1 = ☃.p(cj1);
/*  44 */       if (alz1.c() != this) {
/*  45 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  49 */     if (!☃.t.e() || ☃.b(cj1) == ady.x) {
/*     */       
/*  51 */       ☃.g(cj1);
/*     */ 
/*     */       
/*  54 */       cj cj2 = cj1.a(((cq)alz1.<cq>b(O)).d());
/*  55 */       if (☃.p(cj2).c() == this) {
/*  56 */         ☃.g(cj2);
/*     */       }
/*     */       
/*  59 */       ☃.a((pk)null, cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, 5.0F, true, true);
/*  60 */       return true;
/*     */     } 
/*     */     
/*  63 */     if (((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/*  64 */       wn wn2 = f(☃, cj1);
/*  65 */       if (wn2 == null) {
/*  66 */         alz1 = alz1.a(b, Boolean.valueOf(false));
/*  67 */         ☃.a(cj1, alz1, 4);
/*     */       } else {
/*  69 */         wn1.b(new fb("tile.bed.occupied", new Object[0]));
/*  70 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     wn.a a = wn1.a(cj1);
/*  75 */     if (a == wn.a.a) {
/*  76 */       alz1 = alz1.a(b, Boolean.valueOf(true));
/*  77 */       ☃.a(cj1, alz1, 4);
/*  78 */       return true;
/*     */     } 
/*     */     
/*  81 */     if (a == wn.a.c) {
/*  82 */       wn1.b(new fb("tile.bed.noSleep", new Object[0]));
/*  83 */     } else if (a == wn.a.f) {
/*  84 */       wn1.b(new fb("tile.bed.notSafe", new Object[0]));
/*     */     } 
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private wn f(adm ☃, cj cj1) {
/*  91 */     for (Iterator<wn> iterator = ☃.j.iterator(); iterator.hasNext(); ) { wn wn = iterator.next();
/*  92 */       if (wn.bJ() && wn.bx.equals(cj1)) {
/*  93 */         return wn;
/*     */       } }
/*     */ 
/*     */     
/*  97 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 107 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 112 */     l();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 117 */     cq cq = alz1.<cq>b(O);
/*     */     
/* 119 */     if (alz1.b(a) == a.a) {
/* 120 */       if (☃.p(cj1.a(cq.d())).c() != this) {
/* 121 */         ☃.g(cj1);
/*     */       }
/*     */     }
/* 124 */     else if (☃.p(cj1.a(cq)).c() != this) {
/* 125 */       ☃.g(cj1);
/* 126 */       if (!☃.D) {
/* 127 */         b(☃, cj1, alz1, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 136 */     if (☃.b(a) == a.a) {
/* 137 */       return null;
/*     */     }
/* 139 */     return zy.ba;
/*     */   }
/*     */   
/*     */   private void l() {
/* 143 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public static cj a(adm ☃, cj cj1, int i) {
/* 148 */     cq cq = ☃.p(cj1).<cq>b(O);
/*     */ 
/*     */     
/* 151 */     int j = cj1.n();
/* 152 */     int k = cj1.o();
/* 153 */     int m = cj1.p();
/*     */ 
/*     */     
/* 156 */     for (int n = 0; n <= 1; n++) {
/* 157 */       int i1 = j - cq.g() * n - 1;
/* 158 */       int i2 = m - cq.i() * n - 1;
/* 159 */       int i3 = i1 + 2;
/* 160 */       int i4 = i2 + 2;
/*     */       
/* 162 */       for (int i5 = i1; i5 <= i3; i5++) {
/* 163 */         for (int i6 = i2; i6 <= i4; i6++) {
/* 164 */           cj cj2 = new cj(i5, k, i6);
/* 165 */           if (e(☃, cj2)) {
/* 166 */             if (i > 0) {
/* 167 */               i--;
/*     */             } else {
/*     */               
/* 170 */               return cj2;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 176 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean e(adm ☃, cj cj1) {
/* 180 */     return (adm.a(☃, cj1.b()) && !☃.p(cj1).c().t().a() && !☃.p(cj1.a()).c().t().a());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 187 */     if (alz1.b(a) == a.b) {
/* 188 */       super.a(☃, cj1, alz1, f, 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 194 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 199 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 204 */     return zy.ba;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 211 */     if (wn1.bA.d && 
/* 212 */       alz1.b(a) == a.a) {
/* 213 */       cj cj2 = cj1.a(((cq)alz1.<cq>b(O)).d());
/* 214 */       if (☃.p(cj2).c() == this) {
/* 215 */         ☃.g(cj2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 223 */     cq cq = cq.b(☃);
/* 224 */     if ((☃ & 0x8) > 0) {
/* 225 */       return Q().<a, a>a(a, a.a).<Comparable, cq>a(O, cq).a(b, Boolean.valueOf(((☃ & 0x4) > 0)));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 230 */     return Q().<a, a>a(a, a.b).a(O, cq);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/* 238 */     if (☃.b(a) == a.b) {
/* 239 */       alz alz1 = adq1.p(cj1.a(☃.<cq>b(O)));
/* 240 */       if (alz1.c() == this) {
/* 241 */         ☃ = ☃.a(b, alz1.b(b));
/*     */       }
/*     */     } 
/*     */     
/* 245 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 250 */     int i = 0;
/*     */     
/* 252 */     i |= ((cq)☃.<cq>b(O)).b();
/*     */     
/* 254 */     if (☃.b(a) == a.a) {
/* 255 */       i |= 0x8;
/*     */       
/* 257 */       if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 258 */         i |= 0x4;
/*     */       }
/*     */     } 
/*     */     
/* 262 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 267 */     return new ama(this, new amo[] { O, a, b });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 271 */     a("head"),
/* 272 */     b("foot");
/*     */     
/*     */     private final String c;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 278 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 283 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 288 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */