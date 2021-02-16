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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final adm b;
/*     */   private final cj c;
/*     */   private final afe d;
/*     */   private alz e;
/*     */   private final boolean f;
/*  42 */   private final List<cj> g = Lists.newArrayList();
/*     */   
/*     */   public a(afe paramafe, adm ☃, cj cj1, alz alz1) {
/*  45 */     this.b = ☃;
/*  46 */     this.c = cj1;
/*  47 */     this.e = alz1;
/*  48 */     this.d = (afe)alz1.c();
/*  49 */     afe.b b = alz1.<afe.b>b(paramafe.n());
/*  50 */     this.f = this.d.a;
/*  51 */     a(b);
/*     */   }
/*     */   
/*     */   private void a(afe.b ☃) {
/*  55 */     this.g.clear();
/*  56 */     switch (afe.null.a[☃.ordinal()]) {
/*     */       case 1:
/*  58 */         this.g.add(this.c.c());
/*  59 */         this.g.add(this.c.d());
/*     */         break;
/*     */       case 2:
/*  62 */         this.g.add(this.c.e());
/*  63 */         this.g.add(this.c.f());
/*     */         break;
/*     */       case 3:
/*  66 */         this.g.add(this.c.e());
/*  67 */         this.g.add(this.c.f().a());
/*     */         break;
/*     */       case 4:
/*  70 */         this.g.add(this.c.e().a());
/*  71 */         this.g.add(this.c.f());
/*     */         break;
/*     */       case 5:
/*  74 */         this.g.add(this.c.c().a());
/*  75 */         this.g.add(this.c.d());
/*     */         break;
/*     */       case 6:
/*  78 */         this.g.add(this.c.c());
/*  79 */         this.g.add(this.c.d().a());
/*     */         break;
/*     */       case 7:
/*  82 */         this.g.add(this.c.f());
/*  83 */         this.g.add(this.c.d());
/*     */         break;
/*     */       case 8:
/*  86 */         this.g.add(this.c.e());
/*  87 */         this.g.add(this.c.d());
/*     */         break;
/*     */       case 9:
/*  90 */         this.g.add(this.c.e());
/*  91 */         this.g.add(this.c.c());
/*     */         break;
/*     */       case 10:
/*  94 */         this.g.add(this.c.f());
/*  95 */         this.g.add(this.c.c());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c() {
/* 101 */     for (int ☃ = 0; ☃ < this.g.size(); ☃++) {
/* 102 */       a a1 = b(this.g.get(☃));
/* 103 */       if (a1 == null || !a1.a(this)) {
/* 104 */         this.g.remove(☃--);
/*     */       } else {
/* 106 */         this.g.set(☃, a1.c);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(cj ☃) {
/* 112 */     return (afe.e(this.b, ☃) || afe.e(this.b, ☃.a()) || afe.e(this.b, ☃.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   private a b(cj ☃) {
/* 117 */     cj cj1 = ☃;
/* 118 */     alz alz1 = this.b.p(cj1);
/* 119 */     if (afe.d(alz1)) {
/* 120 */       return new a(this.a, this.b, cj1, alz1);
/*     */     }
/*     */     
/* 123 */     cj1 = ☃.a();
/* 124 */     alz1 = this.b.p(cj1);
/* 125 */     if (afe.d(alz1)) {
/* 126 */       return new a(this.a, this.b, cj1, alz1);
/*     */     }
/*     */     
/* 129 */     cj1 = ☃.b();
/* 130 */     alz1 = this.b.p(cj1);
/* 131 */     if (afe.d(alz1)) {
/* 132 */       return new a(this.a, this.b, cj1, alz1);
/*     */     }
/*     */     
/* 135 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(a ☃) {
/* 139 */     return c(☃.c);
/*     */   }
/*     */   
/*     */   private boolean c(cj ☃) {
/* 143 */     for (int i = 0; i < this.g.size(); i++) {
/* 144 */       cj cj1 = this.g.get(i);
/* 145 */       if (cj1.n() == ☃.n() && cj1.p() == ☃.p()) {
/* 146 */         return true;
/*     */       }
/*     */     } 
/* 149 */     return false;
/*     */   }
/*     */   
/*     */   protected int a() {
/* 153 */     int ☃ = 0;
/*     */     
/* 155 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 156 */       if (a(this.c.a(cq))) {
/* 157 */         ☃++;
/*     */       } }
/*     */ 
/*     */     
/* 161 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean b(a ☃) {
/* 165 */     return (a(☃) || this.g.size() != 2);
/*     */   }
/*     */   
/*     */   private void c(a ☃) {
/* 169 */     this.g.add(☃.c);
/*     */     
/* 171 */     cj cj1 = this.c.c();
/* 172 */     cj cj2 = this.c.d();
/* 173 */     cj cj3 = this.c.e();
/* 174 */     cj cj4 = this.c.f();
/*     */     
/* 176 */     boolean bool1 = c(cj1);
/* 177 */     boolean bool2 = c(cj2);
/* 178 */     boolean bool3 = c(cj3);
/* 179 */     boolean bool4 = c(cj4);
/*     */     
/* 181 */     afe.b b = null;
/*     */     
/* 183 */     if (bool1 || bool2) {
/* 184 */       b = afe.b.a;
/*     */     }
/* 186 */     if (bool3 || bool4) {
/* 187 */       b = afe.b.b;
/*     */     }
/* 189 */     if (!this.f) {
/* 190 */       if (bool2 && bool4 && !bool1 && !bool3) {
/* 191 */         b = afe.b.g;
/*     */       }
/* 193 */       if (bool2 && bool3 && !bool1 && !bool4) {
/* 194 */         b = afe.b.h;
/*     */       }
/* 196 */       if (bool1 && bool3 && !bool2 && !bool4) {
/* 197 */         b = afe.b.i;
/*     */       }
/* 199 */       if (bool1 && bool4 && !bool2 && !bool3) {
/* 200 */         b = afe.b.j;
/*     */       }
/*     */     } 
/* 203 */     if (b == afe.b.a) {
/* 204 */       if (afe.e(this.b, cj1.a())) {
/* 205 */         b = afe.b.e;
/*     */       }
/* 207 */       if (afe.e(this.b, cj2.a())) {
/* 208 */         b = afe.b.f;
/*     */       }
/*     */     } 
/* 211 */     if (b == afe.b.b) {
/* 212 */       if (afe.e(this.b, cj4.a())) {
/* 213 */         b = afe.b.c;
/*     */       }
/* 215 */       if (afe.e(this.b, cj3.a())) {
/* 216 */         b = afe.b.d;
/*     */       }
/*     */     } 
/*     */     
/* 220 */     if (b == null) {
/* 221 */       b = afe.b.a;
/*     */     }
/*     */     
/* 224 */     this.e = this.e.a(this.d.n(), b);
/* 225 */     this.b.a(this.c, this.e, 3);
/*     */   }
/*     */   
/*     */   private boolean d(cj ☃) {
/* 229 */     a a1 = b(☃);
/* 230 */     if (a1 == null) {
/* 231 */       return false;
/*     */     }
/*     */     
/* 234 */     a1.c();
/* 235 */     return a1.b(this);
/*     */   }
/*     */   
/*     */   public a a(boolean ☃, boolean bool1) {
/* 239 */     cj cj1 = this.c.c();
/* 240 */     cj cj2 = this.c.d();
/* 241 */     cj cj3 = this.c.e();
/* 242 */     cj cj4 = this.c.f();
/*     */     
/* 244 */     boolean bool2 = d(cj1);
/* 245 */     boolean bool3 = d(cj2);
/* 246 */     boolean bool4 = d(cj3);
/* 247 */     boolean bool5 = d(cj4);
/*     */     
/* 249 */     afe.b b = null;
/*     */     
/* 251 */     if ((bool2 || bool3) && !bool4 && !bool5) {
/* 252 */       b = afe.b.a;
/*     */     }
/* 254 */     if ((bool4 || bool5) && !bool2 && !bool3) {
/* 255 */       b = afe.b.b;
/*     */     }
/*     */     
/* 258 */     if (!this.f) {
/* 259 */       if (bool3 && bool5 && !bool2 && !bool4) {
/* 260 */         b = afe.b.g;
/*     */       }
/* 262 */       if (bool3 && bool4 && !bool2 && !bool5) {
/* 263 */         b = afe.b.h;
/*     */       }
/* 265 */       if (bool2 && bool4 && !bool3 && !bool5) {
/* 266 */         b = afe.b.i;
/*     */       }
/* 268 */       if (bool2 && bool5 && !bool3 && !bool4) {
/* 269 */         b = afe.b.j;
/*     */       }
/*     */     } 
/* 272 */     if (b == null) {
/* 273 */       if (bool2 || bool3) {
/* 274 */         b = afe.b.a;
/*     */       }
/* 276 */       if (bool4 || bool5) {
/* 277 */         b = afe.b.b;
/*     */       }
/*     */       
/* 280 */       if (!this.f) {
/* 281 */         if (☃) {
/* 282 */           if (bool3 && bool5) {
/* 283 */             b = afe.b.g;
/*     */           }
/* 285 */           if (bool4 && bool3) {
/* 286 */             b = afe.b.h;
/*     */           }
/* 288 */           if (bool5 && bool2) {
/* 289 */             b = afe.b.j;
/*     */           }
/* 291 */           if (bool2 && bool4) {
/* 292 */             b = afe.b.i;
/*     */           }
/*     */         } else {
/* 295 */           if (bool2 && bool4) {
/* 296 */             b = afe.b.i;
/*     */           }
/* 298 */           if (bool5 && bool2) {
/* 299 */             b = afe.b.j;
/*     */           }
/* 301 */           if (bool4 && bool3) {
/* 302 */             b = afe.b.h;
/*     */           }
/* 304 */           if (bool3 && bool5) {
/* 305 */             b = afe.b.g;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 311 */     if (b == afe.b.a) {
/* 312 */       if (afe.e(this.b, cj1.a())) {
/* 313 */         b = afe.b.e;
/*     */       }
/* 315 */       if (afe.e(this.b, cj2.a())) {
/* 316 */         b = afe.b.f;
/*     */       }
/*     */     } 
/* 319 */     if (b == afe.b.b) {
/* 320 */       if (afe.e(this.b, cj4.a())) {
/* 321 */         b = afe.b.c;
/*     */       }
/* 323 */       if (afe.e(this.b, cj3.a())) {
/* 324 */         b = afe.b.d;
/*     */       }
/*     */     } 
/*     */     
/* 328 */     if (b == null) {
/* 329 */       b = afe.b.a;
/*     */     }
/*     */     
/* 332 */     a(b);
/* 333 */     this.e = this.e.a(this.d.n(), b);
/*     */     
/* 335 */     if (bool1 || this.b.p(this.c) != this.e) {
/* 336 */       this.b.a(this.c, this.e, 3);
/*     */       
/* 338 */       for (int i = 0; i < this.g.size(); i++) {
/* 339 */         a a1 = b(this.g.get(i));
/* 340 */         if (a1 != null) {
/*     */ 
/*     */           
/* 343 */           a1.c();
/*     */           
/* 345 */           if (a1.b(this)) {
/* 346 */             a1.c(this);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 351 */     return this;
/*     */   }
/*     */   
/*     */   public alz b() {
/* 355 */     return this.e;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afe$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */