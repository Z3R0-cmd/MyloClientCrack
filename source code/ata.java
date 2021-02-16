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
/*     */ public class ata
/*     */   extends asw
/*     */ {
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   private boolean j;
/*     */   
/*     */   public void a(adq ☃, pk pk1) {
/*  27 */     super.a(☃, pk1);
/*  28 */     this.j = this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  33 */     super.a();
/*  34 */     this.h = this.j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public asv a(pk ☃) {
/*     */     int i;
/*  41 */     if (this.i && ☃.V()) {
/*  42 */       i = (int)(☃.aR()).b;
/*  43 */       cj.a a = new cj.a(ns.c(☃.s), i, ns.c(☃.u));
/*  44 */       afh afh = this.a.p(a).c();
/*  45 */       while (afh == afi.i || afh == afi.j) {
/*  46 */         i++;
/*  47 */         a.c(ns.c(☃.s), i, ns.c(☃.u));
/*  48 */         afh = this.a.p(a).c();
/*     */       } 
/*  50 */       this.h = false;
/*     */     } else {
/*  52 */       i = ns.c((☃.aR()).b + 0.5D);
/*     */     } 
/*     */     
/*  55 */     return a(ns.c((☃.aR()).a), i, ns.c((☃.aR()).c));
/*     */   }
/*     */ 
/*     */   
/*     */   public asv a(pk ☃, double d1, double d2, double d3) {
/*  60 */     return a(ns.c(d1 - (☃.J / 2.0F)), ns.c(d2), ns.c(d3 - (☃.J / 2.0F)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(asv[] ☃, pk pk1, asv asv1, asv asv2, float f) {
/*  65 */     int i = 0;
/*     */     
/*  67 */     int j = 0;
/*  68 */     if (a(pk1, asv1.a, asv1.b + 1, asv1.c) == 1) {
/*  69 */       j = 1;
/*     */     }
/*     */     
/*  72 */     asv asv3 = a(pk1, asv1.a, asv1.b, asv1.c + 1, j);
/*  73 */     asv asv4 = a(pk1, asv1.a - 1, asv1.b, asv1.c, j);
/*  74 */     asv asv5 = a(pk1, asv1.a + 1, asv1.b, asv1.c, j);
/*  75 */     asv asv6 = a(pk1, asv1.a, asv1.b, asv1.c - 1, j);
/*     */     
/*  77 */     if (asv3 != null && !asv3.i && asv3.a(asv2) < f) {
/*  78 */       ☃[i++] = asv3;
/*     */     }
/*  80 */     if (asv4 != null && !asv4.i && asv4.a(asv2) < f) {
/*  81 */       ☃[i++] = asv4;
/*     */     }
/*  83 */     if (asv5 != null && !asv5.i && asv5.a(asv2) < f) {
/*  84 */       ☃[i++] = asv5;
/*     */     }
/*  86 */     if (asv6 != null && !asv6.i && asv6.a(asv2) < f) {
/*  87 */       ☃[i++] = asv6;
/*     */     }
/*     */     
/*  90 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   private asv a(pk ☃, int i, int j, int k, int m) {
/*  95 */     asv asv = null;
/*  96 */     int n = a(☃, i, j, k);
/*  97 */     if (n == 2) {
/*  98 */       return a(i, j, k);
/*     */     }
/* 100 */     if (n == 1) {
/* 101 */       asv = a(i, j, k);
/*     */     }
/* 103 */     if (asv == null && m > 0 && n != -3 && n != -4 && a(☃, i, j + m, k) == 1) {
/* 104 */       asv = a(i, j + m, k);
/* 105 */       j += m;
/*     */     } 
/*     */     
/* 108 */     if (asv != null) {
/* 109 */       int i1 = 0;
/* 110 */       int i2 = 0;
/*     */       
/* 112 */       while (j > 0) {
/* 113 */         i2 = a(☃, i, j - 1, k);
/* 114 */         if (this.h && i2 == -1) {
/* 115 */           return null;
/*     */         }
/* 117 */         if (i2 != 1) {
/*     */           break;
/*     */         }
/*     */ 
/*     */         
/* 122 */         if (i1++ >= ☃.aE()) {
/* 123 */           return null;
/*     */         }
/* 125 */         j--;
/* 126 */         if (j > 0) {
/* 127 */           asv = a(i, j, k); continue;
/*     */         } 
/* 129 */         return null;
/*     */       } 
/*     */ 
/*     */       
/* 133 */       if (i2 == -2) {
/* 134 */         return null;
/*     */       }
/*     */     } 
/*     */     
/* 138 */     return asv;
/*     */   }
/*     */   
/*     */   private int a(pk ☃, int i, int j, int k) {
/* 142 */     return a(this.a, ☃, i, j, k, this.c, this.d, this.e, this.h, this.g, this.f);
/*     */   }
/*     */   
/*     */   public static int a(adq ☃, pk pk1, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2, boolean bool3) {
/* 146 */     boolean bool = false;
/* 147 */     cj cj = new cj(pk1);
/*     */     
/* 149 */     cj.a a = new cj.a();
/* 150 */     for (int i2 = i; i2 < i + m; i2++) {
/* 151 */       for (int i3 = j; i3 < j + n; i3++) {
/* 152 */         for (int i4 = k; i4 < k + i1; i4++) {
/* 153 */           a.c(i2, i3, i4);
/* 154 */           afh afh = ☃.p(a).c();
/* 155 */           if (afh.t() != arm.a) {
/*     */ 
/*     */             
/* 158 */             if (afh == afi.bd || afh == afi.cw) {
/* 159 */               bool = true;
/* 160 */             } else if (afh == afi.i || afh == afi.j) {
/* 161 */               if (bool1) {
/* 162 */                 return -1;
/*     */               }
/* 164 */               bool = true;
/*     */             }
/* 166 */             else if (!bool3 && afh instanceof agh && afh.t() == arm.d) {
/* 167 */               return 0;
/*     */             } 
/*     */             
/* 170 */             if (pk1.o.p(a).c() instanceof afe)
/* 171 */             { if (!(pk1.o.p(cj).c() instanceof afe) && !(pk1.o.p(cj.b()).c() instanceof afe))
/*     */               {
/*     */                 
/* 174 */                 return -3;
/*     */               
/*     */               } }
/*     */             
/* 178 */             else if (!afh.b(☃, a))
/*     */             
/*     */             { 
/* 181 */               if (!bool2 || !(afh instanceof agh) || afh.t() != arm.d)
/*     */               
/*     */               { 
/*     */                 
/* 185 */                 if (afh instanceof agt || afh instanceof agu || afh instanceof akl) {
/* 186 */                   return -3;
/*     */                 }
/*     */                 
/* 189 */                 if (afh == afi.bd || afh == afi.cw) {
/* 190 */                   return -4;
/*     */                 }
/* 192 */                 arm arm = afh.t();
/* 193 */                 if (arm == arm.i)
/* 194 */                 { if (!pk1.ab())
/*     */                   {
/*     */                     
/* 197 */                     return -2; }  }
/*     */                 else
/* 199 */                 { return 0; }  }  } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 203 */     }  return bool ? 2 : 1;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 207 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 211 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 215 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 219 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 223 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 231 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 235 */     return this.h;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */