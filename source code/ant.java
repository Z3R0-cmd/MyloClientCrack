/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
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
/*     */ public class ant
/*     */ {
/*     */   public final float a;
/*     */   public final float b;
/*     */   public final float c;
/*     */   public final float d;
/*     */   public final float e;
/*     */   public final float f;
/*     */   public final float g;
/*     */   public final float h;
/*     */   public final float i;
/*     */   public final float j;
/*     */   public final float k;
/*     */   public final float l;
/*     */   public final float m;
/*     */   public final float n;
/*     */   public final float o;
/*     */   public final float p;
/*     */   public final int q;
/*     */   public final boolean r;
/*     */   public final boolean s;
/*     */   public final int t;
/*     */   public final boolean u;
/*     */   public final boolean v;
/*     */   public final boolean w;
/*     */   public final boolean x;
/*     */   public final boolean y;
/*     */   public final boolean z;
/*     */   public final boolean A;
/*     */   public final int B;
/*     */   public final boolean C;
/*     */   public final int D;
/*     */   public final boolean E;
/*     */   public final int F;
/*     */   public final int G;
/*     */   public final int H;
/*     */   public final int I;
/*     */   public final int J;
/*     */   public final int K;
/*     */   public final int L;
/*     */   public final int M;
/*     */   public final int N;
/*     */   public final int O;
/*     */   public final int P;
/*     */   public final int Q;
/*     */   public final int R;
/*     */   public final int S;
/*     */   public final int T;
/*     */   public final int U;
/*     */   public final int V;
/*     */   public final int W;
/*     */   public final int X;
/*     */   public final int Y;
/*     */   public final int Z;
/*     */   public final int aa;
/*     */   public final int ab;
/*     */   public final int ac;
/*     */   public final int ad;
/*     */   public final int ae;
/*     */   public final int af;
/*     */   public final int ag;
/*     */   public final int ah;
/*     */   public final int ai;
/*     */   public final int aj;
/*     */   public final int ak;
/*     */   public final int al;
/*     */   public final int am;
/*     */   public final int an;
/*     */   public final int ao;
/*     */   public final int ap;
/*     */   public final int aq;
/*     */   public final int ar;
/*     */   public final int as;
/*     */   public final int at;
/*     */   public final int au;
/*     */   public final int av;
/*     */   public final int aw;
/*     */   public final int ax;
/*     */   public final int ay;
/*     */   public final int az;
/*     */   
/*     */   private ant(a ☃) {
/* 132 */     this.a = ☃.b;
/* 133 */     this.b = ☃.c;
/* 134 */     this.c = ☃.d;
/* 135 */     this.d = ☃.e;
/* 136 */     this.e = ☃.f;
/* 137 */     this.f = ☃.g;
/* 138 */     this.g = ☃.h;
/* 139 */     this.h = ☃.i;
/* 140 */     this.i = ☃.j;
/* 141 */     this.j = ☃.k;
/* 142 */     this.k = ☃.l;
/* 143 */     this.l = ☃.m;
/* 144 */     this.m = ☃.n;
/* 145 */     this.n = ☃.o;
/* 146 */     this.o = ☃.p;
/* 147 */     this.p = ☃.q;
/* 148 */     this.q = ☃.r;
/*     */     
/* 150 */     this.r = ☃.s;
/* 151 */     this.s = ☃.t;
/* 152 */     this.t = ☃.u;
/* 153 */     this.u = ☃.v;
/* 154 */     this.v = ☃.w;
/* 155 */     this.w = ☃.x;
/* 156 */     this.x = ☃.y;
/* 157 */     this.y = ☃.z;
/* 158 */     this.z = ☃.A;
/* 159 */     this.A = ☃.B;
/* 160 */     this.B = ☃.C;
/* 161 */     this.C = ☃.D;
/* 162 */     this.D = ☃.E;
/* 163 */     this.E = ☃.F;
/*     */     
/* 165 */     this.F = ☃.G;
/* 166 */     this.G = ☃.H;
/* 167 */     this.H = ☃.I;
/*     */     
/* 169 */     this.I = ☃.J;
/* 170 */     this.J = ☃.K;
/* 171 */     this.K = ☃.L;
/* 172 */     this.L = ☃.M;
/* 173 */     this.M = ☃.N;
/* 174 */     this.N = ☃.O;
/* 175 */     this.O = ☃.P;
/* 176 */     this.P = ☃.Q;
/* 177 */     this.Q = ☃.R;
/* 178 */     this.R = ☃.S;
/* 179 */     this.S = ☃.T;
/* 180 */     this.T = ☃.U;
/* 181 */     this.U = ☃.V;
/* 182 */     this.V = ☃.W;
/* 183 */     this.W = ☃.X;
/* 184 */     this.X = ☃.Y;
/* 185 */     this.Y = ☃.Z;
/* 186 */     this.Z = ☃.aa;
/* 187 */     this.aa = ☃.ab;
/* 188 */     this.ab = ☃.ac;
/* 189 */     this.ac = ☃.ad;
/* 190 */     this.ad = ☃.ae;
/* 191 */     this.ae = ☃.af;
/* 192 */     this.af = ☃.ag;
/* 193 */     this.ag = ☃.ah;
/* 194 */     this.ah = ☃.ai;
/* 195 */     this.ai = ☃.aj;
/* 196 */     this.aj = ☃.ak;
/* 197 */     this.ak = ☃.al;
/* 198 */     this.al = ☃.am;
/* 199 */     this.am = ☃.an;
/* 200 */     this.an = ☃.ao;
/* 201 */     this.ao = ☃.ap;
/* 202 */     this.ap = ☃.aq;
/* 203 */     this.aq = ☃.ar;
/* 204 */     this.ar = ☃.as;
/* 205 */     this.as = ☃.at;
/* 206 */     this.at = ☃.au;
/* 207 */     this.au = ☃.av;
/* 208 */     this.av = ☃.aw;
/* 209 */     this.aw = ☃.ax;
/* 210 */     this.ax = ☃.ay;
/* 211 */     this.ay = ☃.az;
/* 212 */     this.az = ☃.aA;
/*     */   }
/*     */   
/*     */   public static class a
/*     */   {
/* 217 */     static final Gson a = (new GsonBuilder()).registerTypeAdapter(a.class, new ant.b()).create();
/*     */     
/*     */     public static a a(String ☃) {
/* 220 */       if (☃.length() == 0) {
/* 221 */         return new a();
/*     */       }
/*     */       try {
/* 224 */         return (a)a.fromJson(☃, a.class);
/* 225 */       } catch (Exception exception) {
/*     */         
/* 227 */         return new a();
/*     */       } 
/*     */     }
/*     */     
/*     */     public String toString() {
/* 232 */       return a.toJson(this);
/*     */     }
/*     */ 
/*     */     
/* 236 */     public float b = 684.412F;
/* 237 */     public float c = 684.412F;
/* 238 */     public float d = 512.0F;
/* 239 */     public float e = 512.0F;
/* 240 */     public float f = 200.0F;
/* 241 */     public float g = 200.0F;
/* 242 */     public float h = 0.5F;
/* 243 */     public float i = 80.0F;
/* 244 */     public float j = 160.0F;
/* 245 */     public float k = 80.0F;
/* 246 */     public float l = 8.5F;
/* 247 */     public float m = 12.0F;
/* 248 */     public float n = 1.0F;
/* 249 */     public float o = 0.0F;
/* 250 */     public float p = 1.0F;
/* 251 */     public float q = 0.0F;
/* 252 */     public int r = 63;
/*     */     
/*     */     public boolean s = true;
/*     */     
/*     */     public boolean t = true;
/* 257 */     public int u = 8;
/*     */     public boolean v = true;
/*     */     public boolean w = true;
/*     */     public boolean x = true;
/*     */     public boolean y = true;
/*     */     public boolean z = true;
/*     */     public boolean A = true;
/*     */     public boolean B = true;
/* 265 */     public int C = 4;
/*     */     public boolean D = true;
/* 267 */     public int E = 80;
/*     */     
/*     */     public boolean F = false;
/*     */     
/* 271 */     public int G = -1;
/* 272 */     public int H = 4;
/* 273 */     public int I = 4;
/*     */ 
/*     */     
/* 276 */     public int J = 33;
/* 277 */     public int K = 10;
/* 278 */     public int L = 0;
/* 279 */     public int M = 256;
/* 280 */     public int N = 33;
/* 281 */     public int O = 8;
/* 282 */     public int P = 0;
/* 283 */     public int Q = 256;
/* 284 */     public int R = 33;
/* 285 */     public int S = 10;
/* 286 */     public int T = 0;
/* 287 */     public int U = 80;
/* 288 */     public int V = 33;
/* 289 */     public int W = 10;
/* 290 */     public int X = 0;
/* 291 */     public int Y = 80;
/* 292 */     public int Z = 33;
/* 293 */     public int aa = 10;
/* 294 */     public int ab = 0;
/* 295 */     public int ac = 80;
/* 296 */     public int ad = 17;
/* 297 */     public int ae = 20;
/* 298 */     public int af = 0;
/* 299 */     public int ag = 128;
/* 300 */     public int ah = 9;
/* 301 */     public int ai = 20;
/* 302 */     public int aj = 0;
/* 303 */     public int ak = 64;
/* 304 */     public int al = 9;
/* 305 */     public int am = 2;
/* 306 */     public int an = 0;
/* 307 */     public int ao = 32;
/* 308 */     public int ap = 8;
/* 309 */     public int aq = 8;
/* 310 */     public int ar = 0;
/* 311 */     public int as = 16;
/* 312 */     public int at = 8;
/* 313 */     public int au = 1;
/* 314 */     public int av = 0;
/* 315 */     public int aw = 16;
/* 316 */     public int ax = 7;
/* 317 */     public int ay = 1;
/* 318 */     public int az = 16;
/* 319 */     public int aA = 16;
/*     */     
/*     */     public a() {
/* 322 */       a();
/*     */     }
/*     */     
/*     */     public void a() {
/* 326 */       this.b = 684.412F;
/* 327 */       this.c = 684.412F;
/* 328 */       this.d = 512.0F;
/* 329 */       this.e = 512.0F;
/* 330 */       this.f = 200.0F;
/* 331 */       this.g = 200.0F;
/* 332 */       this.h = 0.5F;
/* 333 */       this.i = 80.0F;
/* 334 */       this.j = 160.0F;
/* 335 */       this.k = 80.0F;
/* 336 */       this.l = 8.5F;
/* 337 */       this.m = 12.0F;
/* 338 */       this.n = 1.0F;
/* 339 */       this.o = 0.0F;
/* 340 */       this.p = 1.0F;
/* 341 */       this.q = 0.0F;
/* 342 */       this.r = 63;
/*     */       
/* 344 */       this.s = true;
/* 345 */       this.t = true;
/* 346 */       this.u = 8;
/* 347 */       this.v = true;
/* 348 */       this.w = true;
/* 349 */       this.x = true;
/* 350 */       this.y = true;
/* 351 */       this.z = true;
/* 352 */       this.A = true;
/* 353 */       this.B = true;
/* 354 */       this.C = 4;
/* 355 */       this.D = true;
/* 356 */       this.E = 80;
/* 357 */       this.F = false;
/*     */       
/* 359 */       this.G = -1;
/* 360 */       this.H = 4;
/* 361 */       this.I = 4;
/*     */       
/* 363 */       this.J = 33;
/* 364 */       this.K = 10;
/* 365 */       this.L = 0;
/* 366 */       this.M = 256;
/* 367 */       this.N = 33;
/* 368 */       this.O = 8;
/* 369 */       this.P = 0;
/* 370 */       this.Q = 256;
/* 371 */       this.R = 33;
/* 372 */       this.S = 10;
/* 373 */       this.T = 0;
/* 374 */       this.U = 80;
/* 375 */       this.V = 33;
/* 376 */       this.W = 10;
/* 377 */       this.X = 0;
/* 378 */       this.Y = 80;
/* 379 */       this.Z = 33;
/* 380 */       this.aa = 10;
/* 381 */       this.ab = 0;
/* 382 */       this.ac = 80;
/* 383 */       this.ad = 17;
/* 384 */       this.ae = 20;
/* 385 */       this.af = 0;
/* 386 */       this.ag = 128;
/* 387 */       this.ah = 9;
/* 388 */       this.ai = 20;
/* 389 */       this.aj = 0;
/* 390 */       this.ak = 64;
/* 391 */       this.al = 9;
/* 392 */       this.am = 2;
/* 393 */       this.an = 0;
/* 394 */       this.ao = 32;
/* 395 */       this.ap = 8;
/* 396 */       this.aq = 8;
/* 397 */       this.ar = 0;
/* 398 */       this.as = 16;
/* 399 */       this.at = 8;
/* 400 */       this.au = 1;
/* 401 */       this.av = 0;
/* 402 */       this.aw = 16;
/* 403 */       this.ax = 7;
/* 404 */       this.ay = 1;
/* 405 */       this.az = 16;
/* 406 */       this.aA = 16;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 411 */       if (this == ☃) {
/* 412 */         return true;
/*     */       }
/* 414 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 415 */         return false;
/*     */       }
/*     */       
/* 418 */       a a1 = (a)☃;
/*     */       
/* 420 */       if (this.aa != a1.aa) {
/* 421 */         return false;
/*     */       }
/* 423 */       if (this.ac != a1.ac) {
/* 424 */         return false;
/*     */       }
/* 426 */       if (this.ab != a1.ab) {
/* 427 */         return false;
/*     */       }
/* 429 */       if (this.Z != a1.Z) {
/* 430 */         return false;
/*     */       }
/* 432 */       if (Float.compare(a1.l, this.l) != 0) {
/* 433 */         return false;
/*     */       }
/* 435 */       if (Float.compare(a1.o, this.o) != 0) {
/* 436 */         return false;
/*     */       }
/* 438 */       if (Float.compare(a1.n, this.n) != 0) {
/* 439 */         return false;
/*     */       }
/* 441 */       if (Float.compare(a1.q, this.q) != 0) {
/* 442 */         return false;
/*     */       }
/* 444 */       if (Float.compare(a1.p, this.p) != 0) {
/* 445 */         return false;
/*     */       }
/* 447 */       if (this.H != a1.H) {
/* 448 */         return false;
/*     */       }
/* 450 */       if (this.ae != a1.ae) {
/* 451 */         return false;
/*     */       }
/* 453 */       if (this.ag != a1.ag) {
/* 454 */         return false;
/*     */       }
/* 456 */       if (this.af != a1.af) {
/* 457 */         return false;
/*     */       }
/* 459 */       if (this.ad != a1.ad) {
/* 460 */         return false;
/*     */       }
/* 462 */       if (Float.compare(a1.b, this.b) != 0) {
/* 463 */         return false;
/*     */       }
/* 465 */       if (Float.compare(a1.h, this.h) != 0) {
/* 466 */         return false;
/*     */       }
/* 468 */       if (Float.compare(a1.f, this.f) != 0) {
/* 469 */         return false;
/*     */       }
/* 471 */       if (Float.compare(a1.g, this.g) != 0) {
/* 472 */         return false;
/*     */       }
/* 474 */       if (this.au != a1.au) {
/* 475 */         return false;
/*     */       }
/* 477 */       if (this.aw != a1.aw) {
/* 478 */         return false;
/*     */       }
/* 480 */       if (this.av != a1.av) {
/* 481 */         return false;
/*     */       }
/* 483 */       if (this.at != a1.at) {
/* 484 */         return false;
/*     */       }
/* 486 */       if (this.W != a1.W) {
/* 487 */         return false;
/*     */       }
/* 489 */       if (this.Y != a1.Y) {
/* 490 */         return false;
/*     */       }
/* 492 */       if (this.X != a1.X) {
/* 493 */         return false;
/*     */       }
/* 495 */       if (this.V != a1.V) {
/* 496 */         return false;
/*     */       }
/* 498 */       if (this.K != a1.K) {
/* 499 */         return false;
/*     */       }
/* 501 */       if (this.M != a1.M) {
/* 502 */         return false;
/*     */       }
/* 504 */       if (this.L != a1.L) {
/* 505 */         return false;
/*     */       }
/* 507 */       if (this.J != a1.J) {
/* 508 */         return false;
/*     */       }
/* 510 */       if (this.u != a1.u) {
/* 511 */         return false;
/*     */       }
/* 513 */       if (this.G != a1.G) {
/* 514 */         return false;
/*     */       }
/* 516 */       if (this.am != a1.am) {
/* 517 */         return false;
/*     */       }
/* 519 */       if (this.ao != a1.ao) {
/* 520 */         return false;
/*     */       }
/* 522 */       if (this.an != a1.an) {
/* 523 */         return false;
/*     */       }
/* 525 */       if (this.al != a1.al) {
/* 526 */         return false;
/*     */       }
/* 528 */       if (this.S != a1.S) {
/* 529 */         return false;
/*     */       }
/* 531 */       if (this.U != a1.U) {
/* 532 */         return false;
/*     */       }
/* 534 */       if (this.T != a1.T) {
/* 535 */         return false;
/*     */       }
/* 537 */       if (this.R != a1.R) {
/* 538 */         return false;
/*     */       }
/* 540 */       if (this.O != a1.O) {
/* 541 */         return false;
/*     */       }
/* 543 */       if (this.Q != a1.Q) {
/* 544 */         return false;
/*     */       }
/* 546 */       if (this.P != a1.P) {
/* 547 */         return false;
/*     */       }
/* 549 */       if (this.N != a1.N) {
/* 550 */         return false;
/*     */       }
/* 552 */       if (Float.compare(a1.c, this.c) != 0) {
/* 553 */         return false;
/*     */       }
/* 555 */       if (this.ai != a1.ai) {
/* 556 */         return false;
/*     */       }
/* 558 */       if (this.ak != a1.ak) {
/* 559 */         return false;
/*     */       }
/* 561 */       if (this.aj != a1.aj) {
/* 562 */         return false;
/*     */       }
/* 564 */       if (this.ah != a1.ah) {
/* 565 */         return false;
/*     */       }
/* 567 */       if (this.az != a1.az) {
/* 568 */         return false;
/*     */       }
/* 570 */       if (this.ay != a1.ay) {
/* 571 */         return false;
/*     */       }
/* 573 */       if (this.ax != a1.ax) {
/* 574 */         return false;
/*     */       }
/* 576 */       if (this.aA != a1.aA) {
/* 577 */         return false;
/*     */       }
/* 579 */       if (this.E != a1.E) {
/* 580 */         return false;
/*     */       }
/* 582 */       if (Float.compare(a1.e, this.e) != 0) {
/* 583 */         return false;
/*     */       }
/* 585 */       if (Float.compare(a1.i, this.i) != 0) {
/* 586 */         return false;
/*     */       }
/* 588 */       if (Float.compare(a1.j, this.j) != 0) {
/* 589 */         return false;
/*     */       }
/* 591 */       if (Float.compare(a1.k, this.k) != 0) {
/* 592 */         return false;
/*     */       }
/* 594 */       if (this.aq != a1.aq) {
/* 595 */         return false;
/*     */       }
/* 597 */       if (this.as != a1.as) {
/* 598 */         return false;
/*     */       }
/* 600 */       if (this.ar != a1.ar) {
/* 601 */         return false;
/*     */       }
/* 603 */       if (this.ap != a1.ap) {
/* 604 */         return false;
/*     */       }
/* 606 */       if (this.I != a1.I) {
/* 607 */         return false;
/*     */       }
/* 609 */       if (this.r != a1.r) {
/* 610 */         return false;
/*     */       }
/* 612 */       if (Float.compare(a1.m, this.m) != 0) {
/* 613 */         return false;
/*     */       }
/* 615 */       if (Float.compare(a1.d, this.d) != 0) {
/* 616 */         return false;
/*     */       }
/* 618 */       if (this.s != a1.s) {
/* 619 */         return false;
/*     */       }
/* 621 */       if (this.t != a1.t) {
/* 622 */         return false;
/*     */       }
/* 624 */       if (this.D != a1.D) {
/* 625 */         return false;
/*     */       }
/* 627 */       if (this.F != a1.F) {
/* 628 */         return false;
/*     */       }
/* 630 */       if (this.x != a1.x) {
/* 631 */         return false;
/*     */       }
/* 633 */       if (this.A != a1.A) {
/* 634 */         return false;
/*     */       }
/* 636 */       if (this.v != a1.v) {
/* 637 */         return false;
/*     */       }
/* 639 */       if (this.y != a1.y) {
/* 640 */         return false;
/*     */       }
/* 642 */       if (this.z != a1.z) {
/* 643 */         return false;
/*     */       }
/* 645 */       if (this.w != a1.w) {
/* 646 */         return false;
/*     */       }
/* 648 */       if (this.B != a1.B) {
/* 649 */         return false;
/*     */       }
/* 651 */       if (this.C != a1.C) {
/* 652 */         return false;
/*     */       }
/*     */       
/* 655 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 660 */       int ☃ = (this.b != 0.0F) ? Float.floatToIntBits(this.b) : 0;
/* 661 */       ☃ = 31 * ☃ + ((this.c != 0.0F) ? Float.floatToIntBits(this.c) : 0);
/* 662 */       ☃ = 31 * ☃ + ((this.d != 0.0F) ? Float.floatToIntBits(this.d) : 0);
/* 663 */       ☃ = 31 * ☃ + ((this.e != 0.0F) ? Float.floatToIntBits(this.e) : 0);
/* 664 */       ☃ = 31 * ☃ + ((this.f != 0.0F) ? Float.floatToIntBits(this.f) : 0);
/* 665 */       ☃ = 31 * ☃ + ((this.g != 0.0F) ? Float.floatToIntBits(this.g) : 0);
/* 666 */       ☃ = 31 * ☃ + ((this.h != 0.0F) ? Float.floatToIntBits(this.h) : 0);
/* 667 */       ☃ = 31 * ☃ + ((this.i != 0.0F) ? Float.floatToIntBits(this.i) : 0);
/* 668 */       ☃ = 31 * ☃ + ((this.j != 0.0F) ? Float.floatToIntBits(this.j) : 0);
/* 669 */       ☃ = 31 * ☃ + ((this.k != 0.0F) ? Float.floatToIntBits(this.k) : 0);
/* 670 */       ☃ = 31 * ☃ + ((this.l != 0.0F) ? Float.floatToIntBits(this.l) : 0);
/* 671 */       ☃ = 31 * ☃ + ((this.m != 0.0F) ? Float.floatToIntBits(this.m) : 0);
/* 672 */       ☃ = 31 * ☃ + ((this.n != 0.0F) ? Float.floatToIntBits(this.n) : 0);
/* 673 */       ☃ = 31 * ☃ + ((this.o != 0.0F) ? Float.floatToIntBits(this.o) : 0);
/* 674 */       ☃ = 31 * ☃ + ((this.p != 0.0F) ? Float.floatToIntBits(this.p) : 0);
/* 675 */       ☃ = 31 * ☃ + ((this.q != 0.0F) ? Float.floatToIntBits(this.q) : 0);
/* 676 */       ☃ = 31 * ☃ + this.r;
/* 677 */       ☃ = 31 * ☃ + (this.s ? 1 : 0);
/* 678 */       ☃ = 31 * ☃ + (this.t ? 1 : 0);
/* 679 */       ☃ = 31 * ☃ + this.u;
/* 680 */       ☃ = 31 * ☃ + (this.v ? 1 : 0);
/* 681 */       ☃ = 31 * ☃ + (this.w ? 1 : 0);
/* 682 */       ☃ = 31 * ☃ + (this.x ? 1 : 0);
/* 683 */       ☃ = 31 * ☃ + (this.y ? 1 : 0);
/* 684 */       ☃ = 31 * ☃ + (this.z ? 1 : 0);
/* 685 */       ☃ = 31 * ☃ + (this.A ? 1 : 0);
/* 686 */       ☃ = 31 * ☃ + (this.B ? 1 : 0);
/* 687 */       ☃ = 31 * ☃ + this.C;
/* 688 */       ☃ = 31 * ☃ + (this.D ? 1 : 0);
/* 689 */       ☃ = 31 * ☃ + this.E;
/* 690 */       ☃ = 31 * ☃ + (this.F ? 1 : 0);
/* 691 */       ☃ = 31 * ☃ + this.G;
/* 692 */       ☃ = 31 * ☃ + this.H;
/* 693 */       ☃ = 31 * ☃ + this.I;
/* 694 */       ☃ = 31 * ☃ + this.J;
/* 695 */       ☃ = 31 * ☃ + this.K;
/* 696 */       ☃ = 31 * ☃ + this.L;
/* 697 */       ☃ = 31 * ☃ + this.M;
/* 698 */       ☃ = 31 * ☃ + this.N;
/* 699 */       ☃ = 31 * ☃ + this.O;
/* 700 */       ☃ = 31 * ☃ + this.P;
/* 701 */       ☃ = 31 * ☃ + this.Q;
/* 702 */       ☃ = 31 * ☃ + this.R;
/* 703 */       ☃ = 31 * ☃ + this.S;
/* 704 */       ☃ = 31 * ☃ + this.T;
/* 705 */       ☃ = 31 * ☃ + this.U;
/* 706 */       ☃ = 31 * ☃ + this.V;
/* 707 */       ☃ = 31 * ☃ + this.W;
/* 708 */       ☃ = 31 * ☃ + this.X;
/* 709 */       ☃ = 31 * ☃ + this.Y;
/* 710 */       ☃ = 31 * ☃ + this.Z;
/* 711 */       ☃ = 31 * ☃ + this.aa;
/* 712 */       ☃ = 31 * ☃ + this.ab;
/* 713 */       ☃ = 31 * ☃ + this.ac;
/* 714 */       ☃ = 31 * ☃ + this.ad;
/* 715 */       ☃ = 31 * ☃ + this.ae;
/* 716 */       ☃ = 31 * ☃ + this.af;
/* 717 */       ☃ = 31 * ☃ + this.ag;
/* 718 */       ☃ = 31 * ☃ + this.ah;
/* 719 */       ☃ = 31 * ☃ + this.ai;
/* 720 */       ☃ = 31 * ☃ + this.aj;
/* 721 */       ☃ = 31 * ☃ + this.ak;
/* 722 */       ☃ = 31 * ☃ + this.al;
/* 723 */       ☃ = 31 * ☃ + this.am;
/* 724 */       ☃ = 31 * ☃ + this.an;
/* 725 */       ☃ = 31 * ☃ + this.ao;
/* 726 */       ☃ = 31 * ☃ + this.ap;
/* 727 */       ☃ = 31 * ☃ + this.aq;
/* 728 */       ☃ = 31 * ☃ + this.ar;
/* 729 */       ☃ = 31 * ☃ + this.as;
/* 730 */       ☃ = 31 * ☃ + this.at;
/* 731 */       ☃ = 31 * ☃ + this.au;
/* 732 */       ☃ = 31 * ☃ + this.av;
/* 733 */       ☃ = 31 * ☃ + this.aw;
/* 734 */       ☃ = 31 * ☃ + this.ax;
/* 735 */       ☃ = 31 * ☃ + this.ay;
/* 736 */       ☃ = 31 * ☃ + this.az;
/* 737 */       ☃ = 31 * ☃ + this.aA;
/* 738 */       return ☃;
/*     */     }
/*     */     
/*     */     public ant b() {
/* 742 */       return new ant(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements JsonDeserializer<a>, JsonSerializer<a> {
/*     */     public ant.a a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 749 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/* 751 */       ant.a a = new ant.a();
/*     */       
/*     */       try {
/* 754 */         a.b = ni.a(jsonObject, "coordinateScale", a.b);
/* 755 */         a.c = ni.a(jsonObject, "heightScale", a.c);
/* 756 */         a.e = ni.a(jsonObject, "lowerLimitScale", a.e);
/* 757 */         a.d = ni.a(jsonObject, "upperLimitScale", a.d);
/* 758 */         a.f = ni.a(jsonObject, "depthNoiseScaleX", a.f);
/* 759 */         a.g = ni.a(jsonObject, "depthNoiseScaleZ", a.g);
/* 760 */         a.h = ni.a(jsonObject, "depthNoiseScaleExponent", a.h);
/* 761 */         a.i = ni.a(jsonObject, "mainNoiseScaleX", a.i);
/* 762 */         a.j = ni.a(jsonObject, "mainNoiseScaleY", a.j);
/* 763 */         a.k = ni.a(jsonObject, "mainNoiseScaleZ", a.k);
/* 764 */         a.l = ni.a(jsonObject, "baseSize", a.l);
/* 765 */         a.m = ni.a(jsonObject, "stretchY", a.m);
/* 766 */         a.n = ni.a(jsonObject, "biomeDepthWeight", a.n);
/* 767 */         a.o = ni.a(jsonObject, "biomeDepthOffset", a.o);
/* 768 */         a.p = ni.a(jsonObject, "biomeScaleWeight", a.p);
/* 769 */         a.q = ni.a(jsonObject, "biomeScaleOffset", a.q);
/* 770 */         a.r = ni.a(jsonObject, "seaLevel", a.r);
/*     */         
/* 772 */         a.s = ni.a(jsonObject, "useCaves", a.s);
/* 773 */         a.t = ni.a(jsonObject, "useDungeons", a.t);
/* 774 */         a.u = ni.a(jsonObject, "dungeonChance", a.u);
/* 775 */         a.v = ni.a(jsonObject, "useStrongholds", a.v);
/* 776 */         a.w = ni.a(jsonObject, "useVillages", a.w);
/* 777 */         a.x = ni.a(jsonObject, "useMineShafts", a.x);
/* 778 */         a.y = ni.a(jsonObject, "useTemples", a.y);
/* 779 */         a.z = ni.a(jsonObject, "useMonuments", a.z);
/* 780 */         a.A = ni.a(jsonObject, "useRavines", a.A);
/* 781 */         a.B = ni.a(jsonObject, "useWaterLakes", a.B);
/* 782 */         a.C = ni.a(jsonObject, "waterLakeChance", a.C);
/* 783 */         a.D = ni.a(jsonObject, "useLavaLakes", a.D);
/* 784 */         a.E = ni.a(jsonObject, "lavaLakeChance", a.E);
/* 785 */         a.F = ni.a(jsonObject, "useLavaOceans", a.F);
/*     */         
/* 787 */         a.G = ni.a(jsonObject, "fixedBiome", a.G);
/* 788 */         if (a.G >= 38 || a.G < -1) {
/* 789 */           a.G = -1;
/* 790 */         } else if (a.G >= ady.x.az) {
/* 791 */           a.G += 2;
/*     */         } 
/* 793 */         a.H = ni.a(jsonObject, "biomeSize", a.H);
/* 794 */         a.I = ni.a(jsonObject, "riverSize", a.I);
/*     */         
/* 796 */         a.J = ni.a(jsonObject, "dirtSize", a.J);
/* 797 */         a.K = ni.a(jsonObject, "dirtCount", a.K);
/* 798 */         a.L = ni.a(jsonObject, "dirtMinHeight", a.L);
/* 799 */         a.M = ni.a(jsonObject, "dirtMaxHeight", a.M);
/* 800 */         a.N = ni.a(jsonObject, "gravelSize", a.N);
/* 801 */         a.O = ni.a(jsonObject, "gravelCount", a.O);
/* 802 */         a.P = ni.a(jsonObject, "gravelMinHeight", a.P);
/* 803 */         a.Q = ni.a(jsonObject, "gravelMaxHeight", a.Q);
/* 804 */         a.R = ni.a(jsonObject, "graniteSize", a.R);
/* 805 */         a.S = ni.a(jsonObject, "graniteCount", a.S);
/* 806 */         a.T = ni.a(jsonObject, "graniteMinHeight", a.T);
/* 807 */         a.U = ni.a(jsonObject, "graniteMaxHeight", a.U);
/* 808 */         a.V = ni.a(jsonObject, "dioriteSize", a.V);
/* 809 */         a.W = ni.a(jsonObject, "dioriteCount", a.W);
/* 810 */         a.X = ni.a(jsonObject, "dioriteMinHeight", a.X);
/* 811 */         a.Y = ni.a(jsonObject, "dioriteMaxHeight", a.Y);
/* 812 */         a.Z = ni.a(jsonObject, "andesiteSize", a.Z);
/* 813 */         a.aa = ni.a(jsonObject, "andesiteCount", a.aa);
/* 814 */         a.ab = ni.a(jsonObject, "andesiteMinHeight", a.ab);
/* 815 */         a.ac = ni.a(jsonObject, "andesiteMaxHeight", a.ac);
/* 816 */         a.ad = ni.a(jsonObject, "coalSize", a.ad);
/* 817 */         a.ae = ni.a(jsonObject, "coalCount", a.ae);
/* 818 */         a.af = ni.a(jsonObject, "coalMinHeight", a.af);
/* 819 */         a.ag = ni.a(jsonObject, "coalMaxHeight", a.ag);
/* 820 */         a.ah = ni.a(jsonObject, "ironSize", a.ah);
/* 821 */         a.ai = ni.a(jsonObject, "ironCount", a.ai);
/* 822 */         a.aj = ni.a(jsonObject, "ironMinHeight", a.aj);
/* 823 */         a.ak = ni.a(jsonObject, "ironMaxHeight", a.ak);
/* 824 */         a.al = ni.a(jsonObject, "goldSize", a.al);
/* 825 */         a.am = ni.a(jsonObject, "goldCount", a.am);
/* 826 */         a.an = ni.a(jsonObject, "goldMinHeight", a.an);
/* 827 */         a.ao = ni.a(jsonObject, "goldMaxHeight", a.ao);
/* 828 */         a.ap = ni.a(jsonObject, "redstoneSize", a.ap);
/* 829 */         a.aq = ni.a(jsonObject, "redstoneCount", a.aq);
/* 830 */         a.ar = ni.a(jsonObject, "redstoneMinHeight", a.ar);
/* 831 */         a.as = ni.a(jsonObject, "redstoneMaxHeight", a.as);
/* 832 */         a.at = ni.a(jsonObject, "diamondSize", a.at);
/* 833 */         a.au = ni.a(jsonObject, "diamondCount", a.au);
/* 834 */         a.av = ni.a(jsonObject, "diamondMinHeight", a.av);
/* 835 */         a.aw = ni.a(jsonObject, "diamondMaxHeight", a.aw);
/* 836 */         a.ax = ni.a(jsonObject, "lapisSize", a.ax);
/* 837 */         a.ay = ni.a(jsonObject, "lapisCount", a.ay);
/* 838 */         a.az = ni.a(jsonObject, "lapisCenterHeight", a.az);
/* 839 */         a.aA = ni.a(jsonObject, "lapisSpread", a.aA);
/* 840 */       } catch (Exception exception) {}
/*     */ 
/*     */ 
/*     */       
/* 844 */       return a;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(ant.a ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 849 */       JsonObject jsonObject = new JsonObject();
/*     */       
/* 851 */       jsonObject.addProperty("coordinateScale", Float.valueOf(☃.b));
/* 852 */       jsonObject.addProperty("heightScale", Float.valueOf(☃.c));
/* 853 */       jsonObject.addProperty("lowerLimitScale", Float.valueOf(☃.e));
/* 854 */       jsonObject.addProperty("upperLimitScale", Float.valueOf(☃.d));
/* 855 */       jsonObject.addProperty("depthNoiseScaleX", Float.valueOf(☃.f));
/* 856 */       jsonObject.addProperty("depthNoiseScaleZ", Float.valueOf(☃.g));
/* 857 */       jsonObject.addProperty("depthNoiseScaleExponent", Float.valueOf(☃.h));
/* 858 */       jsonObject.addProperty("mainNoiseScaleX", Float.valueOf(☃.i));
/* 859 */       jsonObject.addProperty("mainNoiseScaleY", Float.valueOf(☃.j));
/* 860 */       jsonObject.addProperty("mainNoiseScaleZ", Float.valueOf(☃.k));
/* 861 */       jsonObject.addProperty("baseSize", Float.valueOf(☃.l));
/* 862 */       jsonObject.addProperty("stretchY", Float.valueOf(☃.m));
/* 863 */       jsonObject.addProperty("biomeDepthWeight", Float.valueOf(☃.n));
/* 864 */       jsonObject.addProperty("biomeDepthOffset", Float.valueOf(☃.o));
/* 865 */       jsonObject.addProperty("biomeScaleWeight", Float.valueOf(☃.p));
/* 866 */       jsonObject.addProperty("biomeScaleOffset", Float.valueOf(☃.q));
/* 867 */       jsonObject.addProperty("seaLevel", Integer.valueOf(☃.r));
/*     */       
/* 869 */       jsonObject.addProperty("useCaves", Boolean.valueOf(☃.s));
/* 870 */       jsonObject.addProperty("useDungeons", Boolean.valueOf(☃.t));
/* 871 */       jsonObject.addProperty("dungeonChance", Integer.valueOf(☃.u));
/* 872 */       jsonObject.addProperty("useStrongholds", Boolean.valueOf(☃.v));
/* 873 */       jsonObject.addProperty("useVillages", Boolean.valueOf(☃.w));
/* 874 */       jsonObject.addProperty("useMineShafts", Boolean.valueOf(☃.x));
/* 875 */       jsonObject.addProperty("useTemples", Boolean.valueOf(☃.y));
/* 876 */       jsonObject.addProperty("useMonuments", Boolean.valueOf(☃.z));
/* 877 */       jsonObject.addProperty("useRavines", Boolean.valueOf(☃.A));
/* 878 */       jsonObject.addProperty("useWaterLakes", Boolean.valueOf(☃.B));
/* 879 */       jsonObject.addProperty("waterLakeChance", Integer.valueOf(☃.C));
/* 880 */       jsonObject.addProperty("useLavaLakes", Boolean.valueOf(☃.D));
/* 881 */       jsonObject.addProperty("lavaLakeChance", Integer.valueOf(☃.E));
/* 882 */       jsonObject.addProperty("useLavaOceans", Boolean.valueOf(☃.F));
/*     */       
/* 884 */       jsonObject.addProperty("fixedBiome", Integer.valueOf(☃.G));
/* 885 */       jsonObject.addProperty("biomeSize", Integer.valueOf(☃.H));
/* 886 */       jsonObject.addProperty("riverSize", Integer.valueOf(☃.I));
/*     */       
/* 888 */       jsonObject.addProperty("dirtSize", Integer.valueOf(☃.J));
/* 889 */       jsonObject.addProperty("dirtCount", Integer.valueOf(☃.K));
/* 890 */       jsonObject.addProperty("dirtMinHeight", Integer.valueOf(☃.L));
/* 891 */       jsonObject.addProperty("dirtMaxHeight", Integer.valueOf(☃.M));
/* 892 */       jsonObject.addProperty("gravelSize", Integer.valueOf(☃.N));
/* 893 */       jsonObject.addProperty("gravelCount", Integer.valueOf(☃.O));
/* 894 */       jsonObject.addProperty("gravelMinHeight", Integer.valueOf(☃.P));
/* 895 */       jsonObject.addProperty("gravelMaxHeight", Integer.valueOf(☃.Q));
/* 896 */       jsonObject.addProperty("graniteSize", Integer.valueOf(☃.R));
/* 897 */       jsonObject.addProperty("graniteCount", Integer.valueOf(☃.S));
/* 898 */       jsonObject.addProperty("graniteMinHeight", Integer.valueOf(☃.T));
/* 899 */       jsonObject.addProperty("graniteMaxHeight", Integer.valueOf(☃.U));
/* 900 */       jsonObject.addProperty("dioriteSize", Integer.valueOf(☃.V));
/* 901 */       jsonObject.addProperty("dioriteCount", Integer.valueOf(☃.W));
/* 902 */       jsonObject.addProperty("dioriteMinHeight", Integer.valueOf(☃.X));
/* 903 */       jsonObject.addProperty("dioriteMaxHeight", Integer.valueOf(☃.Y));
/* 904 */       jsonObject.addProperty("andesiteSize", Integer.valueOf(☃.Z));
/* 905 */       jsonObject.addProperty("andesiteCount", Integer.valueOf(☃.aa));
/* 906 */       jsonObject.addProperty("andesiteMinHeight", Integer.valueOf(☃.ab));
/* 907 */       jsonObject.addProperty("andesiteMaxHeight", Integer.valueOf(☃.ac));
/* 908 */       jsonObject.addProperty("coalSize", Integer.valueOf(☃.ad));
/* 909 */       jsonObject.addProperty("coalCount", Integer.valueOf(☃.ae));
/* 910 */       jsonObject.addProperty("coalMinHeight", Integer.valueOf(☃.af));
/* 911 */       jsonObject.addProperty("coalMaxHeight", Integer.valueOf(☃.ag));
/* 912 */       jsonObject.addProperty("ironSize", Integer.valueOf(☃.ah));
/* 913 */       jsonObject.addProperty("ironCount", Integer.valueOf(☃.ai));
/* 914 */       jsonObject.addProperty("ironMinHeight", Integer.valueOf(☃.aj));
/* 915 */       jsonObject.addProperty("ironMaxHeight", Integer.valueOf(☃.ak));
/* 916 */       jsonObject.addProperty("goldSize", Integer.valueOf(☃.al));
/* 917 */       jsonObject.addProperty("goldCount", Integer.valueOf(☃.am));
/* 918 */       jsonObject.addProperty("goldMinHeight", Integer.valueOf(☃.an));
/* 919 */       jsonObject.addProperty("goldMaxHeight", Integer.valueOf(☃.ao));
/* 920 */       jsonObject.addProperty("redstoneSize", Integer.valueOf(☃.ap));
/* 921 */       jsonObject.addProperty("redstoneCount", Integer.valueOf(☃.aq));
/* 922 */       jsonObject.addProperty("redstoneMinHeight", Integer.valueOf(☃.ar));
/* 923 */       jsonObject.addProperty("redstoneMaxHeight", Integer.valueOf(☃.as));
/* 924 */       jsonObject.addProperty("diamondSize", Integer.valueOf(☃.at));
/* 925 */       jsonObject.addProperty("diamondCount", Integer.valueOf(☃.au));
/* 926 */       jsonObject.addProperty("diamondMinHeight", Integer.valueOf(☃.av));
/* 927 */       jsonObject.addProperty("diamondMaxHeight", Integer.valueOf(☃.aw));
/* 928 */       jsonObject.addProperty("lapisSize", Integer.valueOf(☃.ax));
/* 929 */       jsonObject.addProperty("lapisCount", Integer.valueOf(☃.ay));
/* 930 */       jsonObject.addProperty("lapisCenterHeight", Integer.valueOf(☃.az));
/* 931 */       jsonObject.addProperty("lapisSpread", Integer.valueOf(☃.aA));
/*     */       
/* 933 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */