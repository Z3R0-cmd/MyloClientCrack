/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
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
/*     */ public class akv
/*     */   extends alk
/*     */   implements km, og
/*     */ {
/*  42 */   public static final pe[][] a = new pe[][] { { pe.c, pe.e }, { pe.m, pe.j }, { pe.g }, { pe.l } };
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
/*  53 */   private final List<a> f = Lists.newArrayList();
/*     */   
/*     */   private long g;
/*     */   
/*     */   private float h;
/*     */   private boolean i;
/*  59 */   private int j = -1;
/*     */   
/*     */   private int k;
/*     */   
/*     */   private int l;
/*     */   private zx m;
/*     */   private String n;
/*     */   
/*     */   public void c() {
/*  68 */     if (this.b.K() % 80L == 0L) {
/*  69 */       m();
/*     */     }
/*     */   }
/*     */   
/*     */   public void m() {
/*  74 */     B();
/*  75 */     A();
/*     */   }
/*     */   
/*     */   private void A() {
/*  79 */     if (this.i && this.j > 0 && !this.b.D && this.k > 0) {
/*  80 */       double ☃ = (this.j * 10 + 10);
/*  81 */       int i = 0;
/*  82 */       if (this.j >= 4 && this.k == this.l) {
/*  83 */         i = 1;
/*     */       }
/*     */       
/*  86 */       int j = this.c.n();
/*  87 */       int k = this.c.o();
/*  88 */       int m = this.c.p();
/*  89 */       aug aug = (new aug(j, k, m, (j + 1), (k + 1), (m + 1))).b(☃, ☃, ☃).a(0.0D, this.b.U(), 0.0D);
/*  90 */       List<wn> list = this.b.a(wn.class, aug);
/*  91 */       for (Iterator<wn> iterator = list.iterator(); iterator.hasNext(); ) { wn wn = iterator.next();
/*  92 */         wn.c(new pf(this.k, 180, i, true, true)); }
/*     */ 
/*     */       
/*  95 */       if (this.j >= 4 && this.k != this.l && this.l > 0) {
/*  96 */         for (Iterator<wn> iterator1 = list.iterator(); iterator1.hasNext(); ) { wn wn = iterator1.next();
/*  97 */           wn.c(new pf(this.l, 180, 0, true, true)); }
/*     */       
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void B() {
/* 104 */     int ☃ = this.j;
/*     */     
/* 106 */     int i = this.c.n();
/* 107 */     int j = this.c.o();
/* 108 */     int k = this.c.p();
/*     */     
/* 110 */     this.j = 0;
/* 111 */     this.f.clear();
/* 112 */     this.i = true;
/*     */     
/* 114 */     a a = new a(tv.a(zd.a));
/* 115 */     this.f.add(a);
/* 116 */     boolean bool = true;
/*     */     
/* 118 */     cj.a a1 = new cj.a();
/* 119 */     int m = j + 1; while (true) { if (m < 256)
/* 120 */       { float[] arrayOfFloat; alz alz = this.b.p(a1.c(i, m, k));
/*     */         
/* 122 */         if (alz.c() == afi.cG)
/* 123 */         { arrayOfFloat = tv.a(alz.<zd>b(ajs.a)); }
/* 124 */         else if (alz.c() == afi.cH)
/* 125 */         { arrayOfFloat = tv.a(alz.<zd>b(ajt.a)); }
/* 126 */         else { if (alz.c().p() < 15 || alz.c() == afi.h) {
/* 127 */             a.a();
/*     */           } else {
/*     */             
/* 130 */             this.i = false;
/* 131 */             this.f.clear(); break;
/*     */           } 
/*     */           m++; }
/*     */         
/* 135 */         if (!bool) {
/* 136 */           arrayOfFloat = new float[] { (a.b()[0] + arrayOfFloat[0]) / 2.0F, (a.b()[1] + arrayOfFloat[1]) / 2.0F, (a.b()[2] + arrayOfFloat[2]) / 2.0F };
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 143 */         if (Arrays.equals(arrayOfFloat, a.b())) {
/* 144 */           a.a();
/*     */         } else {
/* 146 */           a = new a(arrayOfFloat);
/* 147 */           this.f.add(a);
/*     */         } 
/* 149 */         bool = false; }
/*     */       else { break; }
/*     */        m++; }
/* 152 */      if (this.i) {
/* 153 */       for (m = 1; m <= 4; ) {
/* 154 */         int n = j - m;
/* 155 */         if (n < 0) {
/*     */           break;
/*     */         }
/*     */         
/* 159 */         boolean bool1 = true;
/* 160 */         for (int i1 = i - m; i1 <= i + m && bool1; i1++) {
/* 161 */           for (int i2 = k - m; i2 <= k + m; i2++) {
/* 162 */             afh afh = this.b.p(new cj(i1, n, i2)).c();
/* 163 */             if (afh != afi.bT && afh != afi.R && afh != afi.ah && afh != afi.S) {
/* 164 */               bool1 = false;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/* 170 */         if (bool1) {
/* 171 */           this.j = m;
/*     */           
/*     */           m++;
/*     */         } 
/*     */       } 
/*     */       
/* 177 */       if (this.j == 0) {
/* 178 */         this.i = false;
/*     */       }
/*     */     } 
/*     */     
/* 182 */     if (!this.b.D && 
/* 183 */       this.j == 4 && ☃ < this.j) {
/* 184 */       for (Iterator<wn> iterator = this.b.<wn>a(wn.class, (new aug(i, j, k, i, (j - 4), k)).b(10.0D, 5.0D, 10.0D)).iterator(); iterator.hasNext(); ) { wn wn = iterator.next();
/* 185 */         wn.b(mr.K); }
/*     */     
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public List<a> n() {
/* 192 */     return this.f;
/*     */   }
/*     */   
/*     */   public float o() {
/* 196 */     if (!this.i) {
/* 197 */       return 0.0F;
/*     */     }
/*     */     
/* 200 */     int ☃ = (int)(this.b.K() - this.g);
/* 201 */     this.g = this.b.K();
/* 202 */     if (☃ > 1) {
/* 203 */       this.h -= ☃ / 40.0F;
/*     */       
/* 205 */       if (this.h < 0.0F) {
/* 206 */         this.h = 0.0F;
/*     */       }
/*     */     } 
/* 209 */     this.h += 0.025F;
/* 210 */     if (this.h > 1.0F) {
/* 211 */       this.h = 1.0F;
/*     */     }
/* 213 */     return this.h;
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
/*     */   public ff y_() {
/* 265 */     dn ☃ = new dn();
/* 266 */     b(☃);
/* 267 */     return new ft(this.c, 3, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public double s() {
/* 272 */     return 65536.0D;
/*     */   }
/*     */   
/*     */   private int h(int ☃) {
/* 276 */     if (☃ < 0 || ☃ >= pe.a.length || pe.a[☃] == null) {
/* 277 */       return 0;
/*     */     }
/* 279 */     pe pe1 = pe.a[☃];
/* 280 */     if (pe1 != pe.c && pe1 != pe.e && pe1 != pe.m && pe1 != pe.j && pe1 != pe.g && pe1 != pe.l) {
/* 281 */       return 0;
/*     */     }
/* 283 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 288 */     super.a(☃);
/*     */     
/* 290 */     this.k = h(☃.f("Primary"));
/* 291 */     this.l = h(☃.f("Secondary"));
/* 292 */     this.j = ☃.f("Levels");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 297 */     super.b(☃);
/*     */     
/* 299 */     ☃.a("Primary", this.k);
/* 300 */     ☃.a("Secondary", this.l);
/*     */     
/* 302 */     ☃.a("Levels", this.j);
/*     */   }
/*     */ 
/*     */   
/*     */   public int o_() {
/* 307 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃) {
/* 313 */     if (☃ == 0) {
/* 314 */       return this.m;
/*     */     }
/* 316 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃, int i) {
/* 322 */     if (☃ == 0 && this.m != null) {
/* 323 */       if (i >= this.m.b) {
/* 324 */         zx zx1 = this.m;
/* 325 */         this.m = null;
/* 326 */         return zx1;
/*     */       } 
/* 328 */       this.m.b -= i;
/* 329 */       return new zx(this.m.b(), i, this.m.i());
/*     */     } 
/*     */     
/* 332 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b(int ☃) {
/* 338 */     if (☃ == 0 && this.m != null) {
/* 339 */       zx zx1 = this.m;
/* 340 */       this.m = null;
/* 341 */       return zx1;
/*     */     } 
/* 343 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, zx zx1) {
/* 348 */     if (☃ == 0) {
/* 349 */       this.m = zx1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 355 */     return l_() ? this.n : "container.beacon";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 360 */     return (this.n != null && this.n.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 364 */     this.n = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int q_() {
/* 369 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(wn ☃) {
/* 374 */     if (this.b.s(this.c) != this) {
/* 375 */       return false;
/*     */     }
/* 377 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 378 */       return false;
/*     */     }
/* 380 */     return true;
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
/* 393 */     return (zx1.b() == zy.bO || zx1.b() == zy.i || zx1.b() == zy.k || zx1.b() == zy.j);
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 398 */     return "minecraft:beacon";
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 403 */     return new xl(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a_(int ☃) {
/* 408 */     switch (☃) {
/*     */       case 0:
/* 410 */         return this.j;
/*     */       case 1:
/* 412 */         return this.k;
/*     */       case 2:
/* 414 */         return this.l;
/*     */     } 
/* 416 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {
/* 421 */     switch (☃) {
/*     */       case 0:
/* 423 */         this.j = i;
/*     */         break;
/*     */       case 1:
/* 426 */         this.k = h(i);
/*     */         break;
/*     */       case 2:
/* 429 */         this.l = h(i);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 436 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 441 */     this.m = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 446 */     if (☃ == 1) {
/* 447 */       m();
/* 448 */       return true;
/*     */     } 
/*     */     
/* 451 */     return super.c(☃, i);
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final float[] a;
/*     */     private int b;
/*     */     
/*     */     public a(float[] ☃) {
/* 459 */       this.a = ☃;
/* 460 */       this.b = 1;
/*     */     }
/*     */     
/*     */     protected void a() {
/* 464 */       this.b++;
/*     */     }
/*     */     
/*     */     public float[] b() {
/* 468 */       return this.a;
/*     */     }
/*     */     
/*     */     public int c() {
/* 472 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */