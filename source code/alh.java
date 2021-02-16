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
/*     */ 
/*     */ 
/*     */ public class alh
/*     */   extends alk
/*     */   implements km, ot
/*     */ {
/*  32 */   private static final int[] a = new int[] { 0 };
/*     */ 
/*     */   
/*  35 */   private static final int[] f = new int[] { 2, 1 };
/*     */ 
/*     */   
/*  38 */   private static final int[] g = new int[] { 1 };
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
/*  51 */   private zx[] h = new zx[3];
/*     */   
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   private int l;
/*     */   private String m;
/*     */   
/*     */   public int o_() {
/*  60 */     return this.h.length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃) {
/*  66 */     return this.h[☃];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃, int i) {
/*  72 */     if (this.h[☃] != null) {
/*  73 */       if ((this.h[☃]).b <= i) {
/*  74 */         zx zx2 = this.h[☃];
/*  75 */         this.h[☃] = null;
/*  76 */         return zx2;
/*     */       } 
/*  78 */       zx zx1 = this.h[☃].a(i);
/*  79 */       if ((this.h[☃]).b == 0) {
/*  80 */         this.h[☃] = null;
/*     */       }
/*  82 */       return zx1;
/*     */     } 
/*     */     
/*  85 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b(int ☃) {
/*  91 */     if (this.h[☃] != null) {
/*  92 */       zx zx1 = this.h[☃];
/*  93 */       this.h[☃] = null;
/*  94 */       return zx1;
/*     */     } 
/*  96 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, zx zx1) {
/* 101 */     boolean bool = (zx1 != null && zx1.a(this.h[☃]) && zx.a(zx1, this.h[☃]));
/* 102 */     this.h[☃] = zx1;
/* 103 */     if (zx1 != null && zx1.b > q_()) {
/* 104 */       zx1.b = q_();
/*     */     }
/*     */     
/* 107 */     if (☃ == 0 && !bool) {
/* 108 */       this.l = a(zx1);
/* 109 */       this.k = 0;
/* 110 */       p_();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 116 */     return l_() ? this.m : "container.furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 121 */     return (this.m != null && this.m.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 125 */     this.m = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 131 */     super.a(☃);
/* 132 */     du du = ☃.c("Items", 10);
/* 133 */     this.h = new zx[o_()];
/* 134 */     for (int i = 0; i < du.c(); i++) {
/* 135 */       dn dn1 = du.b(i);
/* 136 */       int j = dn1.d("Slot");
/* 137 */       if (j >= 0 && j < this.h.length) {
/* 138 */         this.h[j] = zx.a(dn1);
/*     */       }
/*     */     } 
/*     */     
/* 142 */     this.i = ☃.e("BurnTime");
/* 143 */     this.k = ☃.e("CookTime");
/* 144 */     this.l = ☃.e("CookTimeTotal");
/* 145 */     this.j = b(this.h[1]);
/* 146 */     if (☃.b("CustomName", 8)) {
/* 147 */       this.m = ☃.j("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 153 */     super.b(☃);
/* 154 */     ☃.a("BurnTime", (short)this.i);
/* 155 */     ☃.a("CookTime", (short)this.k);
/* 156 */     ☃.a("CookTimeTotal", (short)this.l);
/* 157 */     du du = new du();
/*     */     
/* 159 */     for (int i = 0; i < this.h.length; i++) {
/* 160 */       if (this.h[i] != null) {
/* 161 */         dn dn1 = new dn();
/* 162 */         dn1.a("Slot", (byte)i);
/* 163 */         this.h[i].b(dn1);
/* 164 */         du.a(dn1);
/*     */       } 
/*     */     } 
/* 167 */     ☃.a("Items", du);
/* 168 */     if (l_()) {
/* 169 */       ☃.a("CustomName", this.m);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int q_() {
/* 175 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 179 */     return (this.i > 0);
/*     */   }
/*     */   
/*     */   public static boolean a(og ☃) {
/* 183 */     return (☃.a_(0) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 188 */     boolean ☃ = m();
/* 189 */     boolean bool1 = false;
/*     */     
/* 191 */     if (m())
/*     */     {
/* 193 */       this.i--;
/*     */     }
/*     */     
/* 196 */     if (!this.b.D) {
/* 197 */       if (m() || (this.h[1] != null && this.h[0] != null)) {
/*     */ 
/*     */         
/* 200 */         if (!m() && o()) {
/*     */           
/* 202 */           this.j = this.i = b(this.h[1]);
/*     */           
/* 204 */           if (m()) {
/* 205 */             bool1 = true;
/*     */             
/* 207 */             if (this.h[1] != null) {
/* 208 */               (this.h[1]).b--;
/* 209 */               if ((this.h[1]).b == 0) {
/* 210 */                 zw zw = this.h[1].b().q();
/* 211 */                 this.h[1] = (zw != null) ? new zx(zw) : null;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 217 */         if (m() && o()) {
/* 218 */           this.k++;
/*     */           
/* 220 */           if (this.k == this.l) {
/* 221 */             this.k = 0;
/* 222 */             this.l = a(this.h[0]);
/* 223 */             n();
/* 224 */             bool1 = true;
/*     */           } 
/*     */         } else {
/* 227 */           this.k = 0;
/*     */         } 
/* 229 */       } else if (!m() && 
/* 230 */         this.k > 0) {
/* 231 */         this.k = ns.a(this.k - 2, 0, this.l);
/*     */       } 
/*     */ 
/*     */       
/* 235 */       if (☃ != m()) {
/* 236 */         bool1 = true;
/* 237 */         ahb.a(m(), this.b, this.c);
/*     */       } 
/*     */     } 
/*     */     
/* 241 */     if (bool1) {
/* 242 */       p_();
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(zx ☃) {
/* 247 */     return 200;
/*     */   }
/*     */   
/*     */   private boolean o() {
/* 251 */     if (this.h[0] == null) {
/* 252 */       return false;
/*     */     }
/* 254 */     zx ☃ = abo.a().a(this.h[0]);
/* 255 */     if (☃ == null) {
/* 256 */       return false;
/*     */     }
/* 258 */     if (this.h[2] == null) {
/* 259 */       return true;
/*     */     }
/* 261 */     if (!this.h[2].a(☃)) {
/* 262 */       return false;
/*     */     }
/* 264 */     if ((this.h[2]).b < q_() && (this.h[2]).b < this.h[2].c()) {
/* 265 */       return true;
/*     */     }
/* 267 */     if ((this.h[2]).b < ☃.c()) {
/* 268 */       return true;
/*     */     }
/* 270 */     return false;
/*     */   }
/*     */   
/*     */   public void n() {
/* 274 */     if (!o()) {
/*     */       return;
/*     */     }
/*     */     
/* 278 */     zx ☃ = abo.a().a(this.h[0]);
/* 279 */     if (this.h[2] == null) {
/* 280 */       this.h[2] = ☃.k();
/* 281 */     } else if (this.h[2].b() == ☃.b()) {
/* 282 */       (this.h[2]).b++;
/*     */     } 
/*     */     
/* 285 */     if (this.h[0].b() == zw.a(afi.v) && this.h[0].i() == 1 && this.h[1] != null && this.h[1].b() == zy.aw) {
/* 286 */       this.h[1] = new zx(zy.ax);
/*     */     }
/*     */     
/* 289 */     (this.h[0]).b--;
/* 290 */     if ((this.h[0]).b <= 0) {
/* 291 */       this.h[0] = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int b(zx ☃) {
/* 296 */     if (☃ == null) {
/* 297 */       return 0;
/*     */     }
/* 299 */     zw zw = ☃.b();
/*     */ 
/*     */     
/* 302 */     if (zw instanceof yo && afh.a(zw) != afi.a) {
/* 303 */       afh afh = afh.a(zw);
/*     */       
/* 305 */       if (afh == afi.bM) {
/* 306 */         return 150;
/*     */       }
/*     */       
/* 309 */       if (afh.t() == arm.d) {
/* 310 */         return 300;
/*     */       }
/*     */       
/* 313 */       if (afh == afi.cA) {
/* 314 */         return 16000;
/*     */       }
/*     */     } 
/*     */     
/* 318 */     if (zw instanceof za && ((za)zw).h().equals("WOOD"))
/* 319 */       return 200; 
/* 320 */     if (zw instanceof aay && ((aay)zw).h().equals("WOOD"))
/* 321 */       return 200; 
/* 322 */     if (zw instanceof zv && ((zv)zw).g().equals("WOOD")) {
/* 323 */       return 200;
/*     */     }
/*     */     
/* 326 */     if (zw == zy.y) {
/* 327 */       return 100;
/*     */     }
/*     */     
/* 330 */     if (zw == zy.h) {
/* 331 */       return 1600;
/*     */     }
/*     */     
/* 334 */     if (zw == zy.ay) {
/* 335 */       return 20000;
/*     */     }
/*     */     
/* 338 */     if (zw == zw.a(afi.g)) {
/* 339 */       return 100;
/*     */     }
/*     */     
/* 342 */     if (zw == zy.bv) {
/* 343 */       return 2400;
/*     */     }
/*     */     
/* 346 */     return 0;
/*     */   }
/*     */   
/*     */   public static boolean c(zx ☃) {
/* 350 */     return (b(☃) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(wn ☃) {
/* 355 */     if (this.b.s(this.c) != this) {
/* 356 */       return false;
/*     */     }
/* 358 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 359 */       return false;
/*     */     }
/* 361 */     return true;
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
/* 374 */     if (☃ == 2) {
/* 375 */       return false;
/*     */     }
/* 377 */     if (☃ == 1) {
/* 378 */       return (c(zx1) || xt.c_(zx1));
/*     */     }
/* 380 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(cq ☃) {
/* 385 */     if (☃ == cq.a)
/* 386 */       return f; 
/* 387 */     if (☃ == cq.b) {
/* 388 */       return a;
/*     */     }
/* 390 */     return g;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, zx zx1, cq cq1) {
/* 396 */     return b(☃, zx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, zx zx1, cq cq1) {
/* 401 */     if (cq1 == cq.a && ☃ == 1) {
/* 402 */       zw zw = zx1.b();
/* 403 */       if (zw != zy.ax && zw != zy.aw) {
/* 404 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 408 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 413 */     return "minecraft:furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 418 */     return new xu(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a_(int ☃) {
/* 423 */     switch (☃) {
/*     */       case 0:
/* 425 */         return this.i;
/*     */       case 1:
/* 427 */         return this.j;
/*     */       case 2:
/* 429 */         return this.k;
/*     */       case 3:
/* 431 */         return this.l;
/*     */     } 
/* 433 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {
/* 438 */     switch (☃) {
/*     */       case 0:
/* 440 */         this.i = i;
/*     */         break;
/*     */       case 1:
/* 443 */         this.j = i;
/*     */         break;
/*     */       case 2:
/* 446 */         this.k = i;
/*     */         break;
/*     */       case 3:
/* 449 */         this.l = i;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 456 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 461 */     for (int ☃ = 0; ☃ < this.h.length; ☃++)
/* 462 */       this.h[☃] = null; 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */