/*     */ import com.google.common.base.Predicate;
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
/*     */ public class afx
/*     */   extends agd
/*     */   implements agq
/*     */ {
/*  31 */   public static final amk a = amk.a("powered");
/*  32 */   public static final amm<a> b = amm.a("mode", a.class);
/*     */   
/*     */   public afx(boolean ☃) {
/*  35 */     super(☃);
/*  36 */     j(this.M.b().<Comparable, cq>a(O, cq.c).<Comparable, Boolean>a(a, Boolean.valueOf(false)).a(b, a.a));
/*  37 */     this.A = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  42 */     return di.a("item.comparator.name");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  48 */     return zy.ce;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  53 */     return zy.ce;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(alz ☃) {
/*  58 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected alz e(alz ☃) {
/*  63 */     Boolean bool = ☃.<Boolean>b(a);
/*  64 */     a a = ☃.<a>b(b);
/*  65 */     cq cq = ☃.<cq>b(O);
/*     */     
/*  67 */     return afi.ck.Q().<Comparable, cq>a(O, cq).<Comparable, Boolean>a(a, bool).a(b, a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected alz k(alz ☃) {
/*  72 */     Boolean bool = ☃.<Boolean>b(a);
/*  73 */     a a = ☃.<a>b(b);
/*  74 */     cq cq = ☃.<cq>b(O);
/*     */     
/*  76 */     return afi.cj.Q().<Comparable, cq>a(O, cq).<Comparable, Boolean>a(a, bool).a(b, a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean l(alz ☃) {
/*  81 */     return (this.N || ((Boolean)☃.<Boolean>b(a)).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   protected int a(adq ☃, cj cj1, alz alz1) {
/*  86 */     akw akw = ☃.s(cj1);
/*  87 */     if (akw instanceof ala) {
/*  88 */       return ((ala)akw).b();
/*     */     }
/*     */     
/*  91 */     return 0;
/*     */   }
/*     */   
/*     */   private int j(adm ☃, cj cj1, alz alz1) {
/*  95 */     if (alz1.b(b) == a.b) {
/*  96 */       return Math.max(f(☃, cj1, alz1) - c(☃, cj1, alz1), 0);
/*     */     }
/*     */     
/*  99 */     return f(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean e(adm ☃, cj cj1, alz alz1) {
/* 104 */     int i = f(☃, cj1, alz1);
/* 105 */     if (i >= 15) {
/* 106 */       return true;
/*     */     }
/* 108 */     if (i == 0) {
/* 109 */       return false;
/*     */     }
/*     */     
/* 112 */     int j = c(☃, cj1, alz1);
/* 113 */     if (j == 0) {
/* 114 */       return true;
/*     */     }
/*     */     
/* 117 */     return (i >= j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int f(adm ☃, cj cj1, alz alz1) {
/* 122 */     int i = super.f(☃, cj1, alz1);
/*     */     
/* 124 */     cq cq = alz1.<cq>b(O);
/* 125 */     cj cj2 = cj1.a(cq);
/* 126 */     afh afh = ☃.p(cj2).c();
/*     */     
/* 128 */     if (afh.O()) {
/* 129 */       i = afh.l(☃, cj2);
/* 130 */     } else if (i < 15 && afh.v()) {
/* 131 */       cj2 = cj2.a(cq);
/* 132 */       afh = ☃.p(cj2).c();
/*     */       
/* 134 */       if (afh.O()) {
/* 135 */         i = afh.l(☃, cj2);
/* 136 */       } else if (afh.t() == arm.a) {
/* 137 */         uo uo = a(☃, cq, cj2);
/* 138 */         if (uo != null) {
/* 139 */           i = uo.q();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   private uo a(adm ☃, cq cq1, cj cj1) {
/* 149 */     List<uo> list = (List)☃.a((Class)uo.class, new aug(cj1.n(), cj1.o(), cj1.p(), (cj1.n() + 1), (cj1.o() + 1), (cj1.p() + 1)), new Predicate<pk>(this, cq1)
/*     */         {
/*     */           public boolean a(pk ☃) {
/* 152 */             return (☃ != null && ☃.aP() == this.a);
/*     */           }
/*     */         });
/*     */     
/* 156 */     if (list.size() == 1) {
/* 157 */       return list.get(0);
/*     */     }
/*     */     
/* 160 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 165 */     if (!wn1.bA.e) {
/* 166 */       return false;
/*     */     }
/*     */     
/* 169 */     alz1 = alz1.a(b);
/* 170 */     ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "random.click", 0.3F, (alz1.b(b) == a.b) ? 0.55F : 0.5F);
/*     */     
/* 172 */     ☃.a(cj1, alz1, 2);
/* 173 */     k(☃, cj1, alz1);
/* 174 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void g(adm ☃, cj cj1, alz alz1) {
/* 179 */     if (☃.a(cj1, this)) {
/*     */       return;
/*     */     }
/*     */     
/* 183 */     int i = j(☃, cj1, alz1);
/* 184 */     akw akw = ☃.s(cj1);
/* 185 */     int j = (akw instanceof ala) ? ((ala)akw).b() : 0;
/*     */     
/* 187 */     if (i != j || l(alz1) != e(☃, cj1, alz1))
/*     */     {
/* 189 */       if (i(☃, cj1, alz1)) {
/* 190 */         ☃.a(cj1, this, 2, -1);
/*     */       } else {
/* 192 */         ☃.a(cj1, this, 2, 0);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void k(adm ☃, cj cj1, alz alz1) {
/* 198 */     int i = j(☃, cj1, alz1);
/*     */     
/* 200 */     akw akw = ☃.s(cj1);
/* 201 */     int j = 0;
/* 202 */     if (akw instanceof ala) {
/* 203 */       ala ala = (ala)akw;
/*     */       
/* 205 */       j = ala.b();
/* 206 */       ala.a(i);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 211 */     if (j != i || alz1.b(b) == a.a) {
/* 212 */       boolean bool1 = e(☃, cj1, alz1);
/* 213 */       boolean bool2 = l(alz1);
/*     */       
/* 215 */       if (bool2 && !bool1) {
/* 216 */         ☃.a(cj1, alz1.a(a, Boolean.valueOf(false)), 2);
/* 217 */       } else if (!bool2 && bool1) {
/* 218 */         ☃.a(cj1, alz1.a(a, Boolean.valueOf(true)), 2);
/*     */       } 
/*     */       
/* 221 */       h(☃, cj1, alz1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/* 227 */     if (this.N)
/*     */     {
/* 229 */       ☃.a(cj1, k(alz1).a(a, Boolean.valueOf(true)), 4);
/*     */     }
/* 231 */     k(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 236 */     super.c(☃, cj1, alz1);
/* 237 */     ☃.a(cj1, a(☃, 0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 242 */     super.b(☃, cj1, alz1);
/* 243 */     ☃.t(cj1);
/*     */     
/* 245 */     h(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, int i, int j) {
/* 250 */     super.a(☃, cj1, alz1, i, j);
/*     */     
/* 252 */     akw akw = ☃.s(cj1);
/* 253 */     if (akw == null) {
/* 254 */       return false;
/*     */     }
/*     */     
/* 257 */     return akw.c(i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 262 */     return new ala();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 267 */     return Q().<Comparable, cq>a(O, cq.b(☃)).<Comparable, Boolean>a(a, Boolean.valueOf(((☃ & 0x8) > 0))).a(b, ((☃ & 0x4) > 0) ? a.b : a.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 275 */     int i = 0;
/*     */     
/* 277 */     i |= ((cq)☃.<cq>b(O)).b();
/*     */     
/* 279 */     if (((Boolean)☃.<Boolean>b(a)).booleanValue()) {
/* 280 */       i |= 0x8;
/*     */     }
/*     */     
/* 283 */     if (☃.b(b) == a.b) {
/* 284 */       i |= 0x4;
/*     */     }
/*     */     
/* 287 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 292 */     return new ama(this, new amo[] { O, b, a });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 296 */     a("compare"),
/* 297 */     b("subtract");
/*     */     
/*     */     private final String c;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 303 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 308 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 313 */       return this.c;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 319 */     return Q().<Comparable, cq>a(O, pr1.aP().d()).<Comparable, Boolean>a(a, Boolean.valueOf(false)).a(b, a.a);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */