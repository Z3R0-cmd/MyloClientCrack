/*     */ import java.util.Iterator;
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
/*     */ public class ahu
/*     */   extends afh
/*     */ {
/*  22 */   public static final amm<a> a = amm.a("facing", a.class);
/*  23 */   public static final amk b = amk.a("powered");
/*     */   
/*     */   protected ahu() {
/*  26 */     super(arm.q);
/*  27 */     j(this.M.b().<a, a>a(a, a.e).a(b, Boolean.valueOf(false)));
/*  28 */     a(yz.d);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  34 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  39 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  44 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/*  49 */     return a(☃, cj1, cq1.d());
/*     */   } public boolean d(adm ☃, cj cj1) {
/*     */     cq[] arrayOfCq;
/*     */     int i;
/*     */     int j;
/*  54 */     for (arrayOfCq = cq.values(), i = arrayOfCq.length, j = 0; j < i; ) { cq cq = arrayOfCq[j];
/*  55 */       if (a(☃, cj1, cq)) {
/*  56 */         return true;
/*     */       }
/*     */       j++; }
/*     */     
/*  60 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean a(adm ☃, cj cj1, cq cq1) {
/*  64 */     return afn.a(☃, cj1, cq1);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  69 */     alz alz = Q().a(b, Boolean.valueOf(false));
/*     */     
/*  71 */     if (a(☃, cj1, cq1.d())) {
/*  72 */       return alz.a(a, a.a(cq1, pr1.aP()));
/*     */     }
/*     */     
/*  75 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq2 = iterator.next();
/*  76 */       if (cq2 != cq1 && a(☃, cj1, cq2.d())) {
/*  77 */         return alz.a(a, a.a(cq2, pr1.aP()));
/*     */       } }
/*     */ 
/*     */     
/*  81 */     if (adm.a(☃, cj1.b())) {
/*  82 */       return alz.a(a, a.a(cq.b, pr1.aP()));
/*     */     }
/*     */     
/*  85 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a(cq ☃) {
/*  90 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*  92 */         return 0;
/*     */       case 2:
/*  94 */         return 5;
/*     */       case 3:
/*  96 */         return 4;
/*     */       case 4:
/*  98 */         return 3;
/*     */       case 5:
/* 100 */         return 2;
/*     */       case 6:
/* 102 */         return 1;
/*     */     } 
/* 104 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 109 */     if (e(☃, cj1, alz1) && 
/* 110 */       !a(☃, cj1, ((a)alz1.<a>b(a)).c().d())) {
/* 111 */       b(☃, cj1, alz1, 0);
/* 112 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean e(adm ☃, cj cj1, alz alz1) {
/* 118 */     if (d(☃, cj1)) {
/* 119 */       return true;
/*     */     }
/*     */     
/* 122 */     b(☃, cj1, alz1, 0);
/* 123 */     ☃.g(cj1);
/* 124 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 129 */     float f = 0.1875F;
/* 130 */     switch (null.b[((a)☃.p(cj1).b((amo)a)).ordinal()]) {
/*     */       case 1:
/* 132 */         a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/*     */         break;
/*     */       case 2:
/* 135 */         a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/*     */         break;
/*     */       case 3:
/* 138 */         a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/*     */         break;
/*     */       case 4:
/* 141 */         a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */         break;
/*     */       case 5:
/*     */       case 6:
/* 145 */         f = 0.25F;
/* 146 */         a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */         break;
/*     */       case 7:
/*     */       case 8:
/* 150 */         f = 0.25F;
/* 151 */         a(0.5F - f, 0.4F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 158 */     if (☃.D) {
/* 159 */       return true;
/*     */     }
/*     */     
/* 162 */     alz1 = alz1.a(b);
/* 163 */     ☃.a(cj1, alz1, 3);
/* 164 */     ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "random.click", 0.3F, ((Boolean)alz1.<Boolean>b(b)).booleanValue() ? 0.6F : 0.5F);
/* 165 */     ☃.c(cj1, this);
/*     */     
/* 167 */     cq cq2 = ((a)alz1.<a>b(a)).c();
/* 168 */     ☃.c(cj1.a(cq2.d()), this);
/*     */     
/* 170 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 175 */     if (((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 176 */       ☃.c(cj1, this);
/* 177 */       cq cq = ((a)alz1.<a>b(a)).c();
/* 178 */       ☃.c(cj1.a(cq.d()), this);
/*     */     } 
/* 180 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 185 */     return ((Boolean)alz1.<Boolean>b(b)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/* 190 */     if (!((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 191 */       return 0;
/*     */     }
/*     */     
/* 194 */     if (((a)alz1.<a>b(a)).c() == cq1) {
/* 195 */       return 15;
/*     */     }
/*     */     
/* 198 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 203 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 208 */     return Q().<a, a>a(a, a.a(☃ & 0x7)).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 215 */     int i = 0;
/*     */     
/* 217 */     i |= ((a)☃.<a>b(a)).a();
/*     */     
/* 219 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 220 */       i |= 0x8;
/*     */     }
/*     */     
/* 223 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 228 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 232 */     a(0, "down_x", cq.a),
/* 233 */     b(1, "east", cq.f),
/* 234 */     c(2, "west", cq.e),
/* 235 */     d(3, "south", cq.d),
/* 236 */     e(4, "north", cq.c),
/* 237 */     f(5, "up_z", cq.b),
/* 238 */     g(6, "up_x", cq.b),
/* 239 */     h(7, "down_z", cq.a);
/*     */ 
/*     */     
/*     */     private final int j;
/*     */     
/*     */     private final String k;
/*     */     
/*     */     private final cq l;
/*     */     
/* 248 */     private static final a[] i = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/* 250 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 251 */         i[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, cq cq1) {
/* 256 */       this.j = ☃;
/* 257 */       this.k = str1;
/* 258 */       this.l = cq1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 262 */       return this.j;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public cq c() {
/* 270 */       return this.l;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 275 */       return this.k;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 279 */       if (☃ < 0 || ☃ >= i.length) {
/* 280 */         ☃ = 0;
/*     */       }
/* 282 */       return i[☃];
/*     */     }
/*     */     
/*     */     public static a a(cq ☃, cq cq1) {
/* 286 */       switch (ahu.null.a[☃.ordinal()]) {
/*     */         case 1:
/* 288 */           switch (ahu.null.c[cq1.k().ordinal()]) {
/*     */             case 1:
/* 290 */               return a;
/*     */             case 2:
/* 292 */               return h;
/*     */           } 
/* 294 */           throw new IllegalArgumentException("Invalid entityFacing " + cq1 + " for facing " + ☃);
/*     */         
/*     */         case 2:
/* 297 */           switch (ahu.null.c[cq1.k().ordinal()]) {
/*     */             case 1:
/* 299 */               return g;
/*     */             case 2:
/* 301 */               return f;
/*     */           } 
/* 303 */           throw new IllegalArgumentException("Invalid entityFacing " + cq1 + " for facing " + ☃);
/*     */         
/*     */         case 3:
/* 306 */           return e;
/*     */         case 4:
/* 308 */           return d;
/*     */         case 5:
/* 310 */           return c;
/*     */         case 6:
/* 312 */           return b;
/*     */       } 
/*     */       
/* 315 */       throw new IllegalArgumentException("Invalid facing: " + ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 320 */       return this.k;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */