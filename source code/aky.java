/*     */ import java.util.Iterator;
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
/*     */ public class aky
/*     */   extends alk
/*     */   implements km, og
/*     */ {
/*  27 */   private zx[] m = new zx[27];
/*     */   
/*     */   public boolean a;
/*     */   
/*     */   public aky f;
/*     */   public aky g;
/*     */   public aky h;
/*     */   public aky i;
/*     */   public float j;
/*     */   public float k;
/*     */   public int l;
/*     */   private int n;
/*     */   private int o;
/*     */   private String p;
/*     */   
/*     */   public aky() {
/*  43 */     this.o = -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public aky(int ☃) {
/*  48 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int o_() {
/*  53 */     return 27;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃) {
/*  59 */     return this.m[☃];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃, int i) {
/*  65 */     if (this.m[☃] != null) {
/*  66 */       if ((this.m[☃]).b <= i) {
/*  67 */         zx zx2 = this.m[☃];
/*  68 */         this.m[☃] = null;
/*  69 */         p_();
/*  70 */         return zx2;
/*     */       } 
/*  72 */       zx zx1 = this.m[☃].a(i);
/*  73 */       if ((this.m[☃]).b == 0) {
/*  74 */         this.m[☃] = null;
/*     */       }
/*  76 */       p_();
/*  77 */       return zx1;
/*     */     } 
/*     */     
/*  80 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b(int ☃) {
/*  86 */     if (this.m[☃] != null) {
/*  87 */       zx zx1 = this.m[☃];
/*  88 */       this.m[☃] = null;
/*  89 */       return zx1;
/*     */     } 
/*  91 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, zx zx1) {
/*  96 */     this.m[☃] = zx1;
/*  97 */     if (zx1 != null && zx1.b > q_()) {
/*  98 */       zx1.b = q_();
/*     */     }
/* 100 */     p_();
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 105 */     return l_() ? this.p : "container.chest";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 110 */     return (this.p != null && this.p.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 114 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 120 */     super.a(☃);
/* 121 */     du du = ☃.c("Items", 10);
/* 122 */     this.m = new zx[o_()];
/* 123 */     if (☃.b("CustomName", 8)) {
/* 124 */       this.p = ☃.j("CustomName");
/*     */     }
/* 126 */     for (int i = 0; i < du.c(); i++) {
/* 127 */       dn dn1 = du.b(i);
/* 128 */       int j = dn1.d("Slot") & 0xFF;
/* 129 */       if (j >= 0 && j < this.m.length) {
/* 130 */         this.m[j] = zx.a(dn1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 137 */     super.b(☃);
/* 138 */     du du = new du();
/*     */     
/* 140 */     for (int i = 0; i < this.m.length; i++) {
/* 141 */       if (this.m[i] != null) {
/* 142 */         dn dn1 = new dn();
/* 143 */         dn1.a("Slot", (byte)i);
/* 144 */         this.m[i].b(dn1);
/* 145 */         du.a(dn1);
/*     */       } 
/*     */     } 
/* 148 */     ☃.a("Items", du);
/* 149 */     if (l_()) {
/* 150 */       ☃.a("CustomName", this.p);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int q_() {
/* 156 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(wn ☃) {
/* 161 */     if (this.b.s(this.c) != this) {
/* 162 */       return false;
/*     */     }
/* 164 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 165 */       return false;
/*     */     }
/* 167 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void E() {
/* 172 */     super.E();
/* 173 */     this.a = false;
/*     */   }
/*     */   
/*     */   private void a(aky ☃, cq cq1) {
/* 177 */     if (☃.x()) {
/* 178 */       this.a = false;
/* 179 */     } else if (this.a) {
/* 180 */       switch (null.a[cq1.ordinal()]) {
/*     */         case 1:
/* 182 */           if (this.f != ☃) {
/* 183 */             this.a = false;
/*     */           }
/*     */           break;
/*     */         case 2:
/* 187 */           if (this.i != ☃) {
/* 188 */             this.a = false;
/*     */           }
/*     */           break;
/*     */         case 3:
/* 192 */           if (this.g != ☃) {
/* 193 */             this.a = false;
/*     */           }
/*     */           break;
/*     */         case 4:
/* 197 */           if (this.h != ☃) {
/* 198 */             this.a = false;
/*     */           }
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void m() {
/* 206 */     if (this.a) {
/*     */       return;
/*     */     }
/*     */     
/* 210 */     this.a = true;
/* 211 */     this.h = a(cq.e);
/* 212 */     this.g = a(cq.f);
/* 213 */     this.f = a(cq.c);
/* 214 */     this.i = a(cq.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected aky a(cq ☃) {
/* 219 */     cj cj = this.c.a(☃);
/*     */     
/* 221 */     if (b(cj)) {
/* 222 */       akw akw = this.b.s(cj);
/* 223 */       if (akw instanceof aky) {
/* 224 */         aky aky1 = (aky)akw;
/* 225 */         aky1.a(this, ☃.d());
/*     */         
/* 227 */         return aky1;
/*     */       } 
/*     */     } 
/*     */     
/* 231 */     return null;
/*     */   }
/*     */   
/*     */   private boolean b(cj ☃) {
/* 235 */     if (this.b == null) {
/* 236 */       return false;
/*     */     }
/*     */     
/* 239 */     afh afh = this.b.p(☃).c();
/*     */     
/* 241 */     return (afh instanceof afs && ((afs)afh).b == n());
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 246 */     m();
/*     */     
/* 248 */     int ☃ = this.c.n();
/* 249 */     int i = this.c.o();
/* 250 */     int j = this.c.p();
/*     */     
/* 252 */     this.n++;
/* 253 */     if (!this.b.D && this.l != 0 && (this.n + ☃ + i + j) % 200 == 0) {
/* 254 */       this.l = 0;
/*     */       
/* 256 */       float f1 = 5.0F;
/* 257 */       List<wn> list = this.b.a(wn.class, new aug((☃ - f1), (i - f1), (j - f1), ((☃ + 1) + f1), ((i + 1) + f1), ((j + 1) + f1)));
/* 258 */       for (Iterator<wn> iterator = list.iterator(); iterator.hasNext(); ) { wn wn = iterator.next();
/* 259 */         if (wn.bk instanceof xo) {
/* 260 */           og og1 = ((xo)wn.bk).e();
/* 261 */           if (og1 == this || (og1 instanceof of && ((of)og1).a(this))) {
/* 262 */             this.l++;
/*     */           }
/*     */         }  }
/*     */     
/*     */     } 
/*     */     
/* 268 */     this.k = this.j;
/*     */     
/* 270 */     float f = 0.1F;
/* 271 */     if (this.l > 0 && this.j == 0.0F && 
/* 272 */       this.f == null && this.h == null) {
/* 273 */       double d1 = ☃ + 0.5D;
/* 274 */       double d2 = j + 0.5D;
/* 275 */       if (this.i != null) {
/* 276 */         d2 += 0.5D;
/*     */       }
/* 278 */       if (this.g != null) {
/* 279 */         d1 += 0.5D;
/*     */       }
/*     */       
/* 282 */       this.b.a(d1, i + 0.5D, d2, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*     */     } 
/*     */     
/* 285 */     if ((this.l == 0 && this.j > 0.0F) || (this.l > 0 && this.j < 1.0F)) {
/* 286 */       float f1 = this.j;
/* 287 */       if (this.l > 0) {
/* 288 */         this.j += f;
/*     */       } else {
/* 290 */         this.j -= f;
/*     */       } 
/* 292 */       if (this.j > 1.0F) {
/* 293 */         this.j = 1.0F;
/*     */       }
/* 295 */       float f2 = 0.5F;
/* 296 */       if (this.j < f2 && f1 >= f2 && 
/* 297 */         this.f == null && this.h == null) {
/* 298 */         double d1 = ☃ + 0.5D;
/* 299 */         double d2 = j + 0.5D;
/* 300 */         if (this.i != null) {
/* 301 */           d2 += 0.5D;
/*     */         }
/* 303 */         if (this.g != null) {
/* 304 */           d1 += 0.5D;
/*     */         }
/*     */         
/* 307 */         this.b.a(d1, i + 0.5D, d2, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/*     */       
/* 310 */       if (this.j < 0.0F) {
/* 311 */         this.j = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 318 */     if (☃ == 1) {
/* 319 */       this.l = i;
/* 320 */       return true;
/*     */     } 
/* 322 */     return super.c(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(wn ☃) {
/* 327 */     if (!☃.v()) {
/* 328 */       if (this.l < 0) {
/* 329 */         this.l = 0;
/*     */       }
/* 331 */       this.l++;
/* 332 */       this.b.c(this.c, w(), 1, this.l);
/* 333 */       this.b.c(this.c, w());
/* 334 */       this.b.c(this.c.b(), w());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(wn ☃) {
/* 340 */     if (!☃.v() && 
/* 341 */       w() instanceof afs) {
/* 342 */       this.l--;
/* 343 */       this.b.c(this.c, w(), 1, this.l);
/* 344 */       this.b.c(this.c, w());
/* 345 */       this.b.c(this.c.b(), w());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, zx zx1) {
/* 352 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void y() {
/* 357 */     super.y();
/* 358 */     E();
/* 359 */     m();
/*     */   }
/*     */   
/*     */   public int n() {
/* 363 */     if (this.o == -1) {
/* 364 */       if (this.b != null && w() instanceof afs) {
/* 365 */         this.o = ((afs)w()).b;
/*     */       } else {
/* 367 */         return 0;
/*     */       } 
/*     */     }
/*     */     
/* 371 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 376 */     return "minecraft:chest";
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 381 */     return new xo(☃, this, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a_(int ☃) {
/* 386 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int g() {
/* 395 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 400 */     for (int ☃ = 0; ☃ < this.m.length; ☃++)
/* 401 */       this.m[☃] = null; 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */