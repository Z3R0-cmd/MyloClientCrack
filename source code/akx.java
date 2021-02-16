/*     */ import java.util.Arrays;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ public class akx
/*     */   extends alk
/*     */   implements km, ot
/*     */ {
/*  32 */   private static final int[] a = new int[] { 3 };
/*     */ 
/*     */   
/*  35 */   private static final int[] f = new int[] { 0, 1, 2 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  42 */   private zx[] g = new zx[4];
/*     */   
/*     */   private int h;
/*     */   
/*     */   private boolean[] i;
/*     */   private zw j;
/*     */   private String k;
/*     */   
/*     */   public String e_() {
/*  51 */     return l_() ? this.k : "container.brewing";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/*  56 */     return (this.k != null && this.k.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  60 */     this.k = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int o_() {
/*  65 */     return this.g.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  70 */     if (this.h > 0) {
/*  71 */       this.h--;
/*     */       
/*  73 */       if (this.h == 0) {
/*     */         
/*  75 */         o();
/*  76 */         p_();
/*  77 */       } else if (!n()) {
/*  78 */         this.h = 0;
/*  79 */         p_();
/*  80 */       } else if (this.j != this.g[3].b()) {
/*  81 */         this.h = 0;
/*  82 */         p_();
/*     */       } 
/*  84 */     } else if (n()) {
/*  85 */       this.h = 400;
/*  86 */       this.j = this.g[3].b();
/*     */     } 
/*     */     
/*  89 */     if (!this.b.D) {
/*  90 */       boolean[] ☃ = m();
/*  91 */       if (!Arrays.equals(☃, this.i)) {
/*  92 */         this.i = ☃;
/*  93 */         alz alz = this.b.p(v());
/*  94 */         if (!(alz.c() instanceof afl)) {
/*     */           return;
/*     */         }
/*  97 */         for (int i = 0; i < afl.a.length; i++) {
/*  98 */           alz = alz.a(afl.a[i], Boolean.valueOf(☃[i]));
/*     */         }
/* 100 */         this.b.a(this.c, alz, 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean n() {
/* 106 */     if (this.g[3] == null || (this.g[3]).b <= 0) {
/* 107 */       return false;
/*     */     }
/* 109 */     zx ☃ = this.g[3];
/*     */     
/* 111 */     if (!☃.b().l(☃)) {
/* 112 */       return false;
/*     */     }
/*     */     
/* 115 */     boolean bool = false;
/* 116 */     for (int i = 0; i < 3; i++) {
/* 117 */       if (this.g[i] != null && this.g[i].b() == zy.bz) {
/* 118 */         int j = this.g[i].i();
/* 119 */         int k = c(j, ☃);
/*     */         
/* 121 */         if (!aai.f(j) && aai.f(k)) {
/* 122 */           bool = true;
/*     */           
/*     */           break;
/*     */         } 
/* 126 */         List<pf> list1 = zy.bz.e(j);
/* 127 */         List<pf> list2 = zy.bz.e(k);
/*     */         
/* 129 */         if ((j <= 0 || list1 != list2) && (list1 == null || (!list1.equals(list2) && list2 != null)))
/*     */         {
/* 131 */           if (j != k) {
/* 132 */             bool = true;
/*     */             break;
/*     */           }  } 
/*     */       } 
/*     */     } 
/* 137 */     return bool;
/*     */   }
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
/*     */ 
/*     */   
/*     */   private void o() {
/* 165 */     if (!n()) {
/*     */       return;
/*     */     }
/*     */     
/* 169 */     zx ☃ = this.g[3];
/*     */ 
/*     */     
/* 172 */     for (int i = 0; i < 3; i++) {
/* 173 */       if (this.g[i] != null && this.g[i].b() == zy.bz) {
/* 174 */         int j = this.g[i].i();
/* 175 */         int k = c(j, ☃);
/*     */         
/* 177 */         List<pf> list1 = zy.bz.e(j);
/* 178 */         List<pf> list2 = zy.bz.e(k);
/*     */         
/* 180 */         if ((j > 0 && list1 == list2) || (list1 != null && (list1.equals(list2) || list2 == null))) {
/* 181 */           if (!aai.f(j) && aai.f(k)) {
/* 182 */             this.g[i].b(k);
/*     */           }
/* 184 */         } else if (j != k) {
/* 185 */           this.g[i].b(k);
/*     */         } 
/*     */       } 
/*     */     } 
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
/* 203 */     if (☃.b().r()) {
/* 204 */       this.g[3] = new zx(☃.b().q());
/*     */     } else {
/* 206 */       (this.g[3]).b--;
/* 207 */       if ((this.g[3]).b <= 0) {
/* 208 */         this.g[3] = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private int c(int ☃, zx zx1) {
/* 214 */     if (zx1 == null) {
/* 215 */       return ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     if (zx1.b().l(zx1)) {
/* 226 */       return abe.a(☃, zx1.b().j(zx1));
/*     */     }
/* 228 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 234 */     super.a(☃);
/*     */     
/* 236 */     du du = ☃.c("Items", 10);
/* 237 */     this.g = new zx[o_()];
/* 238 */     for (int i = 0; i < du.c(); i++) {
/* 239 */       dn dn1 = du.b(i);
/* 240 */       int j = dn1.d("Slot");
/* 241 */       if (j >= 0 && j < this.g.length) {
/* 242 */         this.g[j] = zx.a(dn1);
/*     */       }
/*     */     } 
/*     */     
/* 246 */     this.h = ☃.e("BrewTime");
/* 247 */     if (☃.b("CustomName", 8)) {
/* 248 */       this.k = ☃.j("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 254 */     super.b(☃);
/*     */     
/* 256 */     ☃.a("BrewTime", (short)this.h);
/* 257 */     du du = new du();
/*     */     
/* 259 */     for (int i = 0; i < this.g.length; i++) {
/* 260 */       if (this.g[i] != null) {
/* 261 */         dn dn1 = new dn();
/* 262 */         dn1.a("Slot", (byte)i);
/* 263 */         this.g[i].b(dn1);
/* 264 */         du.a(dn1);
/*     */       } 
/*     */     } 
/* 267 */     ☃.a("Items", du);
/* 268 */     if (l_()) {
/* 269 */       ☃.a("CustomName", this.k);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃) {
/* 276 */     if (☃ >= 0 && ☃ < this.g.length) {
/* 277 */       return this.g[☃];
/*     */     }
/* 279 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃, int i) {
/* 285 */     if (☃ >= 0 && ☃ < this.g.length) {
/* 286 */       zx zx1 = this.g[☃];
/* 287 */       this.g[☃] = null;
/* 288 */       return zx1;
/*     */     } 
/* 290 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b(int ☃) {
/* 296 */     if (☃ >= 0 && ☃ < this.g.length) {
/* 297 */       zx zx1 = this.g[☃];
/* 298 */       this.g[☃] = null;
/* 299 */       return zx1;
/*     */     } 
/* 301 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, zx zx1) {
/* 306 */     if (☃ >= 0 && ☃ < this.g.length) {
/* 307 */       this.g[☃] = zx1;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int q_() {
/* 314 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(wn ☃) {
/* 319 */     if (this.b.s(this.c) != this) {
/* 320 */       return false;
/*     */     }
/* 322 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 323 */       return false;
/*     */     }
/* 325 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(wn ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(wn ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, zx zx1) {
/* 338 */     if (☃ == 3)
/*     */     {
/* 340 */       return zx1.b().l(zx1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 346 */     return (zx1.b() == zy.bz || zx1.b() == zy.bA);
/*     */   }
/*     */   
/*     */   public boolean[] m() {
/* 350 */     boolean[] ☃ = new boolean[3];
/* 351 */     for (int i = 0; i < 3; i++) {
/* 352 */       if (this.g[i] != null) {
/* 353 */         ☃[i] = true;
/*     */       }
/*     */     } 
/* 356 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(cq ☃) {
/* 361 */     if (☃ == cq.b) {
/* 362 */       return a;
/*     */     }
/*     */     
/* 365 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, zx zx1, cq cq1) {
/* 370 */     return b(☃, zx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, zx zx1, cq cq1) {
/* 375 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 380 */     return "minecraft:brewing_stand";
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 385 */     return new xm(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a_(int ☃) {
/* 390 */     switch (☃) {
/*     */       case 0:
/* 392 */         return this.h;
/*     */     } 
/* 394 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {
/* 399 */     switch (☃) {
/*     */       case 0:
/* 401 */         this.h = i;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 408 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 413 */     for (int ☃ = 0; ☃ < this.g.length; ☃++)
/* 414 */       this.g[☃] = null; 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */