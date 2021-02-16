/*     */ import com.google.common.collect.Lists;
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
/*     */ public abstract class afe
/*     */   extends afh
/*     */ {
/*     */   protected final boolean a;
/*     */   
/*     */   public class a
/*     */   {
/*     */     private final adm b;
/*     */     private final cj c;
/*     */     private final afe d;
/*     */     private alz e;
/*     */     private final boolean f;
/*  42 */     private final List<cj> g = Lists.newArrayList();
/*     */     
/*     */     public a(afe this$0, adm ☃, cj cj1, alz alz1) {
/*  45 */       this.b = ☃;
/*  46 */       this.c = cj1;
/*  47 */       this.e = alz1;
/*  48 */       this.d = (afe)alz1.c();
/*  49 */       afe.b b = alz1.<afe.b>b(this$0.n());
/*  50 */       this.f = this.d.a;
/*  51 */       a(b);
/*     */     }
/*     */     
/*     */     private void a(afe.b ☃) {
/*  55 */       this.g.clear();
/*  56 */       switch (afe.null.a[☃.ordinal()]) {
/*     */         case 1:
/*  58 */           this.g.add(this.c.c());
/*  59 */           this.g.add(this.c.d());
/*     */           break;
/*     */         case 2:
/*  62 */           this.g.add(this.c.e());
/*  63 */           this.g.add(this.c.f());
/*     */           break;
/*     */         case 3:
/*  66 */           this.g.add(this.c.e());
/*  67 */           this.g.add(this.c.f().a());
/*     */           break;
/*     */         case 4:
/*  70 */           this.g.add(this.c.e().a());
/*  71 */           this.g.add(this.c.f());
/*     */           break;
/*     */         case 5:
/*  74 */           this.g.add(this.c.c().a());
/*  75 */           this.g.add(this.c.d());
/*     */           break;
/*     */         case 6:
/*  78 */           this.g.add(this.c.c());
/*  79 */           this.g.add(this.c.d().a());
/*     */           break;
/*     */         case 7:
/*  82 */           this.g.add(this.c.f());
/*  83 */           this.g.add(this.c.d());
/*     */           break;
/*     */         case 8:
/*  86 */           this.g.add(this.c.e());
/*  87 */           this.g.add(this.c.d());
/*     */           break;
/*     */         case 9:
/*  90 */           this.g.add(this.c.e());
/*  91 */           this.g.add(this.c.c());
/*     */           break;
/*     */         case 10:
/*  94 */           this.g.add(this.c.f());
/*  95 */           this.g.add(this.c.c());
/*     */           break;
/*     */       } 
/*     */     }
/*     */     
/*     */     private void c() {
/* 101 */       for (int ☃ = 0; ☃ < this.g.size(); ☃++) {
/* 102 */         a a1 = b(this.g.get(☃));
/* 103 */         if (a1 == null || !a1.a(this)) {
/* 104 */           this.g.remove(☃--);
/*     */         } else {
/* 106 */           this.g.set(☃, a1.c);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean a(cj ☃) {
/* 112 */       return (afe.e(this.b, ☃) || afe.e(this.b, ☃.a()) || afe.e(this.b, ☃.b()));
/*     */     }
/*     */ 
/*     */     
/*     */     private a b(cj ☃) {
/* 117 */       cj cj1 = ☃;
/* 118 */       alz alz1 = this.b.p(cj1);
/* 119 */       if (afe.d(alz1)) {
/* 120 */         return new a(this.a, this.b, cj1, alz1);
/*     */       }
/*     */       
/* 123 */       cj1 = ☃.a();
/* 124 */       alz1 = this.b.p(cj1);
/* 125 */       if (afe.d(alz1)) {
/* 126 */         return new a(this.a, this.b, cj1, alz1);
/*     */       }
/*     */       
/* 129 */       cj1 = ☃.b();
/* 130 */       alz1 = this.b.p(cj1);
/* 131 */       if (afe.d(alz1)) {
/* 132 */         return new a(this.a, this.b, cj1, alz1);
/*     */       }
/*     */       
/* 135 */       return null;
/*     */     }
/*     */     
/*     */     private boolean a(a ☃) {
/* 139 */       return c(☃.c);
/*     */     }
/*     */     
/*     */     private boolean c(cj ☃) {
/* 143 */       for (int i = 0; i < this.g.size(); i++) {
/* 144 */         cj cj1 = this.g.get(i);
/* 145 */         if (cj1.n() == ☃.n() && cj1.p() == ☃.p()) {
/* 146 */           return true;
/*     */         }
/*     */       } 
/* 149 */       return false;
/*     */     }
/*     */     
/*     */     protected int a() {
/* 153 */       int ☃ = 0;
/*     */       
/* 155 */       for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 156 */         if (a(this.c.a(cq))) {
/* 157 */           ☃++;
/*     */         } }
/*     */ 
/*     */       
/* 161 */       return ☃;
/*     */     }
/*     */     
/*     */     private boolean b(a ☃) {
/* 165 */       return (a(☃) || this.g.size() != 2);
/*     */     }
/*     */     
/*     */     private void c(a ☃) {
/* 169 */       this.g.add(☃.c);
/*     */       
/* 171 */       cj cj1 = this.c.c();
/* 172 */       cj cj2 = this.c.d();
/* 173 */       cj cj3 = this.c.e();
/* 174 */       cj cj4 = this.c.f();
/*     */       
/* 176 */       boolean bool1 = c(cj1);
/* 177 */       boolean bool2 = c(cj2);
/* 178 */       boolean bool3 = c(cj3);
/* 179 */       boolean bool4 = c(cj4);
/*     */       
/* 181 */       afe.b b = null;
/*     */       
/* 183 */       if (bool1 || bool2) {
/* 184 */         b = afe.b.a;
/*     */       }
/* 186 */       if (bool3 || bool4) {
/* 187 */         b = afe.b.b;
/*     */       }
/* 189 */       if (!this.f) {
/* 190 */         if (bool2 && bool4 && !bool1 && !bool3) {
/* 191 */           b = afe.b.g;
/*     */         }
/* 193 */         if (bool2 && bool3 && !bool1 && !bool4) {
/* 194 */           b = afe.b.h;
/*     */         }
/* 196 */         if (bool1 && bool3 && !bool2 && !bool4) {
/* 197 */           b = afe.b.i;
/*     */         }
/* 199 */         if (bool1 && bool4 && !bool2 && !bool3) {
/* 200 */           b = afe.b.j;
/*     */         }
/*     */       } 
/* 203 */       if (b == afe.b.a) {
/* 204 */         if (afe.e(this.b, cj1.a())) {
/* 205 */           b = afe.b.e;
/*     */         }
/* 207 */         if (afe.e(this.b, cj2.a())) {
/* 208 */           b = afe.b.f;
/*     */         }
/*     */       } 
/* 211 */       if (b == afe.b.b) {
/* 212 */         if (afe.e(this.b, cj4.a())) {
/* 213 */           b = afe.b.c;
/*     */         }
/* 215 */         if (afe.e(this.b, cj3.a())) {
/* 216 */           b = afe.b.d;
/*     */         }
/*     */       } 
/*     */       
/* 220 */       if (b == null) {
/* 221 */         b = afe.b.a;
/*     */       }
/*     */       
/* 224 */       this.e = this.e.a(this.d.n(), b);
/* 225 */       this.b.a(this.c, this.e, 3);
/*     */     }
/*     */     
/*     */     private boolean d(cj ☃) {
/* 229 */       a a1 = b(☃);
/* 230 */       if (a1 == null) {
/* 231 */         return false;
/*     */       }
/*     */       
/* 234 */       a1.c();
/* 235 */       return a1.b(this);
/*     */     }
/*     */     
/*     */     public a a(boolean ☃, boolean bool1) {
/* 239 */       cj cj1 = this.c.c();
/* 240 */       cj cj2 = this.c.d();
/* 241 */       cj cj3 = this.c.e();
/* 242 */       cj cj4 = this.c.f();
/*     */       
/* 244 */       boolean bool2 = d(cj1);
/* 245 */       boolean bool3 = d(cj2);
/* 246 */       boolean bool4 = d(cj3);
/* 247 */       boolean bool5 = d(cj4);
/*     */       
/* 249 */       afe.b b = null;
/*     */       
/* 251 */       if ((bool2 || bool3) && !bool4 && !bool5) {
/* 252 */         b = afe.b.a;
/*     */       }
/* 254 */       if ((bool4 || bool5) && !bool2 && !bool3) {
/* 255 */         b = afe.b.b;
/*     */       }
/*     */       
/* 258 */       if (!this.f) {
/* 259 */         if (bool3 && bool5 && !bool2 && !bool4) {
/* 260 */           b = afe.b.g;
/*     */         }
/* 262 */         if (bool3 && bool4 && !bool2 && !bool5) {
/* 263 */           b = afe.b.h;
/*     */         }
/* 265 */         if (bool2 && bool4 && !bool3 && !bool5) {
/* 266 */           b = afe.b.i;
/*     */         }
/* 268 */         if (bool2 && bool5 && !bool3 && !bool4) {
/* 269 */           b = afe.b.j;
/*     */         }
/*     */       } 
/* 272 */       if (b == null) {
/* 273 */         if (bool2 || bool3) {
/* 274 */           b = afe.b.a;
/*     */         }
/* 276 */         if (bool4 || bool5) {
/* 277 */           b = afe.b.b;
/*     */         }
/*     */         
/* 280 */         if (!this.f) {
/* 281 */           if (☃) {
/* 282 */             if (bool3 && bool5) {
/* 283 */               b = afe.b.g;
/*     */             }
/* 285 */             if (bool4 && bool3) {
/* 286 */               b = afe.b.h;
/*     */             }
/* 288 */             if (bool5 && bool2) {
/* 289 */               b = afe.b.j;
/*     */             }
/* 291 */             if (bool2 && bool4) {
/* 292 */               b = afe.b.i;
/*     */             }
/*     */           } else {
/* 295 */             if (bool2 && bool4) {
/* 296 */               b = afe.b.i;
/*     */             }
/* 298 */             if (bool5 && bool2) {
/* 299 */               b = afe.b.j;
/*     */             }
/* 301 */             if (bool4 && bool3) {
/* 302 */               b = afe.b.h;
/*     */             }
/* 304 */             if (bool3 && bool5) {
/* 305 */               b = afe.b.g;
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */       
/* 311 */       if (b == afe.b.a) {
/* 312 */         if (afe.e(this.b, cj1.a())) {
/* 313 */           b = afe.b.e;
/*     */         }
/* 315 */         if (afe.e(this.b, cj2.a())) {
/* 316 */           b = afe.b.f;
/*     */         }
/*     */       } 
/* 319 */       if (b == afe.b.b) {
/* 320 */         if (afe.e(this.b, cj4.a())) {
/* 321 */           b = afe.b.c;
/*     */         }
/* 323 */         if (afe.e(this.b, cj3.a())) {
/* 324 */           b = afe.b.d;
/*     */         }
/*     */       } 
/*     */       
/* 328 */       if (b == null) {
/* 329 */         b = afe.b.a;
/*     */       }
/*     */       
/* 332 */       a(b);
/* 333 */       this.e = this.e.a(this.d.n(), b);
/*     */       
/* 335 */       if (bool1 || this.b.p(this.c) != this.e) {
/* 336 */         this.b.a(this.c, this.e, 3);
/*     */         
/* 338 */         for (int i = 0; i < this.g.size(); i++) {
/* 339 */           a a1 = b(this.g.get(i));
/* 340 */           if (a1 != null) {
/*     */ 
/*     */             
/* 343 */             a1.c();
/*     */             
/* 345 */             if (a1.b(this)) {
/* 346 */               a1.c(this);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 351 */       return this;
/*     */     }
/*     */     
/*     */     public alz b() {
/* 355 */       return this.e;
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean e(adm ☃, cj cj1) {
/* 360 */     return d(☃.p(cj1));
/*     */   }
/*     */   
/*     */   public static boolean d(alz ☃) {
/* 364 */     afh afh1 = ☃.c();
/* 365 */     return (afh1 == afi.av || afh1 == afi.D || afh1 == afi.E || afh1 == afi.cs);
/*     */   }
/*     */   
/*     */   protected afe(boolean ☃) {
/* 369 */     super(arm.q);
/* 370 */     this.a = ☃;
/* 371 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/* 372 */     a(yz.e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/* 382 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 387 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public auh a(adm ☃, cj cj1, aui aui1, aui aui2) {
/* 392 */     a(☃, cj1);
/* 393 */     return super.a(☃, cj1, aui1, aui2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 398 */     alz alz = ☃.p(cj1);
/* 399 */     b b = (alz.c() == this) ? alz.<b>b(n()) : null;
/* 400 */     if (b != null && b.c()) {
/* 401 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*     */     } else {
/* 403 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 409 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 414 */     if (adm.a(☃, cj1.b())) {
/* 415 */       return true;
/*     */     }
/* 417 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 422 */     if (!☃.D) {
/* 423 */       alz1 = a(☃, cj1, alz1, true);
/*     */       
/* 425 */       if (this.a) {
/* 426 */         a(☃, cj1, alz1, this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 433 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 437 */     b b = alz1.<b>b(n());
/* 438 */     boolean bool = false;
/*     */     
/* 440 */     if (!adm.a(☃, cj1.b())) {
/* 441 */       bool = true;
/*     */     }
/* 443 */     if (b == b.c && !adm.a(☃, cj1.f())) {
/* 444 */       bool = true;
/* 445 */     } else if (b == b.d && !adm.a(☃, cj1.e())) {
/* 446 */       bool = true;
/* 447 */     } else if (b == b.e && !adm.a(☃, cj1.c())) {
/* 448 */       bool = true;
/* 449 */     } else if (b == b.f && !adm.a(☃, cj1.d())) {
/* 450 */       bool = true;
/*     */     } 
/*     */     
/* 453 */     if (bool) {
/* 454 */       b(☃, cj1, alz1, 0);
/* 455 */       ☃.g(cj1);
/*     */     } else {
/* 457 */       b(☃, cj1, alz1, afh1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(adm ☃, cj cj1, alz alz1, afh afh1) {}
/*     */   
/*     */   protected alz a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 465 */     if (☃.D) {
/* 466 */       return alz1;
/*     */     }
/* 468 */     return (new a(this, ☃, cj1, alz1)).a(☃.z(cj1), bool).b();
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 473 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 478 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 483 */     super.b(☃, cj1, alz1);
/*     */     
/* 485 */     if (((b)alz1.<b>b(n())).c()) {
/* 486 */       ☃.c(cj1.a(), this);
/*     */     }
/*     */     
/* 489 */     if (this.a) {
/* 490 */       ☃.c(cj1, this);
/* 491 */       ☃.c(cj1.b(), this);
/*     */     } 
/*     */   }
/*     */   
/*     */   public abstract amo<b> n();
/*     */   
/*     */   public enum b implements nw {
/* 498 */     a(0, "north_south"),
/* 499 */     b(1, "east_west"),
/* 500 */     c(2, "ascending_east"),
/* 501 */     d(3, "ascending_west"),
/* 502 */     e(4, "ascending_north"),
/* 503 */     f(5, "ascending_south"),
/* 504 */     g(6, "south_east"),
/* 505 */     h(7, "south_west"),
/* 506 */     i(8, "north_west"),
/* 507 */     j(9, "north_east");
/*     */ 
/*     */     
/*     */     private final int l;
/*     */ 
/*     */     
/*     */     private final String m;
/*     */     
/* 515 */     private static final b[] k = new b[(values()).length]; static { b[] ☃;
/*     */       int i, j;
/* 517 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { b b1 = ☃[j];
/* 518 */         k[b1.a()] = b1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     b(int ☃, String str1) {
/* 523 */       this.l = ☃;
/* 524 */       this.m = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 528 */       return this.l;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 537 */       return this.m;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 541 */       return (this == e || this == c || this == f || this == d);
/*     */     }
/*     */     
/*     */     public static b a(int ☃) {
/* 545 */       if (☃ < 0 || ☃ >= k.length) {
/* 546 */         ☃ = 0;
/*     */       }
/* 548 */       return k[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 553 */       return this.m;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */