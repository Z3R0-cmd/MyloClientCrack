/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
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
/*     */ public class aqn
/*     */ {
/*     */   public static void a() {
/*  19 */     aqr.a((Class)a.class, "TeDP");
/*  20 */     aqr.a((Class)b.class, "TeJP");
/*  21 */     aqr.a((Class)d.class, "TeSH");
/*     */   }
/*     */   
/*     */   static abstract class c
/*     */     extends aqt {
/*     */     protected int a;
/*     */     protected int b;
/*     */     protected int c;
/*  29 */     protected int d = -1;
/*     */ 
/*     */     
/*     */     public c() {}
/*     */ 
/*     */     
/*     */     protected c(Random ☃, int i, int j, int k, int m, int n, int i1) {
/*  36 */       super(0);
/*     */       
/*  38 */       this.a = m;
/*  39 */       this.b = n;
/*  40 */       this.c = i1;
/*     */       
/*  42 */       this.m = cq.c.a.a(☃);
/*     */       
/*  44 */       switch (aqn.null.a[this.m.ordinal()]) {
/*     */         case 1:
/*     */         case 2:
/*  47 */           this.l = new aqe(i, j, k, i + m - 1, j + n - 1, k + i1 - 1);
/*     */           return;
/*     */       } 
/*  50 */       this.l = new aqe(i, j, k, i + i1 - 1, j + n - 1, k + m - 1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected void a(dn ☃) {
/*  57 */       ☃.a("Width", this.a);
/*  58 */       ☃.a("Height", this.b);
/*  59 */       ☃.a("Depth", this.c);
/*  60 */       ☃.a("HPos", this.d);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/*  65 */       this.a = ☃.f("Width");
/*  66 */       this.b = ☃.f("Height");
/*  67 */       this.c = ☃.f("Depth");
/*  68 */       this.d = ☃.f("HPos");
/*     */     }
/*     */     
/*     */     protected boolean a(adm ☃, aqe aqe1, int i) {
/*  72 */       if (this.d >= 0) {
/*  73 */         return true;
/*     */       }
/*     */       
/*  76 */       int j = 0;
/*  77 */       int k = 0;
/*  78 */       cj.a a = new cj.a();
/*  79 */       for (int m = this.l.c; m <= this.l.f; m++) {
/*  80 */         for (int n = this.l.a; n <= this.l.d; n++) {
/*  81 */           a.c(n, 64, m);
/*  82 */           if (aqe1.b(a)) {
/*  83 */             j += Math.max(☃.r(a).o(), ☃.t.i());
/*  84 */             k++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  89 */       if (k == 0) {
/*  90 */         return false;
/*     */       }
/*  92 */       this.d = j / k;
/*  93 */       this.l.a(0, this.d - this.l.b + i, 0);
/*  94 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a extends c {
/*  99 */     private boolean[] e = new boolean[4];
/*     */ 
/*     */     
/* 102 */     private static final List<ob> f = Lists.newArrayList((Object[])new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a(Random ☃, int i, int j) {
/* 122 */       super(☃, i, 64, j, 21, 15, 21);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dn ☃) {
/* 127 */       super.a(☃);
/* 128 */       ☃.a("hasPlacedChest0", this.e[0]);
/* 129 */       ☃.a("hasPlacedChest1", this.e[1]);
/* 130 */       ☃.a("hasPlacedChest2", this.e[2]);
/* 131 */       ☃.a("hasPlacedChest3", this.e[3]);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/* 136 */       super.b(☃);
/* 137 */       this.e[0] = ☃.n("hasPlacedChest0");
/* 138 */       this.e[1] = ☃.n("hasPlacedChest1");
/* 139 */       this.e[2] = ☃.n("hasPlacedChest2");
/* 140 */       this.e[3] = ☃.n("hasPlacedChest3");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 146 */       a(☃, aqe1, 0, -4, 0, this.a - 1, 0, this.c - 1, afi.A.Q(), afi.A.Q(), false); int i;
/* 147 */       for (i = 1; i <= 9; i++) {
/* 148 */         a(☃, aqe1, i, i, i, this.a - 1 - i, i, this.c - 1 - i, afi.A.Q(), afi.A.Q(), false);
/* 149 */         a(☃, aqe1, i + 1, i, i + 1, this.a - 2 - i, i, this.c - 2 - i, afi.a.Q(), afi.a.Q(), false);
/*     */       } 
/* 151 */       for (i = 0; i < this.a; i++) {
/* 152 */         for (int i3 = 0; i3 < this.c; i3++) {
/* 153 */           int i4 = -5;
/* 154 */           b(☃, afi.A.Q(), i, i4, i3, aqe1);
/*     */         } 
/*     */       } 
/*     */       
/* 158 */       i = a(afi.bO, 3);
/* 159 */       int j = a(afi.bO, 2);
/* 160 */       int k = a(afi.bO, 0);
/* 161 */       int m = a(afi.bO, 1);
/* 162 */       int n = (zd.b.b() ^ 0xFFFFFFFF) & 0xF;
/* 163 */       int i1 = (zd.l.b() ^ 0xFFFFFFFF) & 0xF;
/*     */ 
/*     */       
/* 166 */       a(☃, aqe1, 0, 0, 0, 4, 9, 4, afi.A.Q(), afi.a.Q(), false);
/* 167 */       a(☃, aqe1, 1, 10, 1, 3, 10, 3, afi.A.Q(), afi.A.Q(), false);
/* 168 */       a(☃, afi.bO.a(i), 2, 10, 0, aqe1);
/* 169 */       a(☃, afi.bO.a(j), 2, 10, 4, aqe1);
/* 170 */       a(☃, afi.bO.a(k), 0, 10, 2, aqe1);
/* 171 */       a(☃, afi.bO.a(m), 4, 10, 2, aqe1);
/* 172 */       a(☃, aqe1, this.a - 5, 0, 0, this.a - 1, 9, 4, afi.A.Q(), afi.a.Q(), false);
/* 173 */       a(☃, aqe1, this.a - 4, 10, 1, this.a - 2, 10, 3, afi.A.Q(), afi.A.Q(), false);
/* 174 */       a(☃, afi.bO.a(i), this.a - 3, 10, 0, aqe1);
/* 175 */       a(☃, afi.bO.a(j), this.a - 3, 10, 4, aqe1);
/* 176 */       a(☃, afi.bO.a(k), this.a - 5, 10, 2, aqe1);
/* 177 */       a(☃, afi.bO.a(m), this.a - 1, 10, 2, aqe1);
/*     */ 
/*     */       
/* 180 */       a(☃, aqe1, 8, 0, 0, 12, 4, 4, afi.A.Q(), afi.a.Q(), false);
/* 181 */       a(☃, aqe1, 9, 1, 0, 11, 3, 4, afi.a.Q(), afi.a.Q(), false);
/* 182 */       a(☃, afi.A.a(aji.a.c.a()), 9, 1, 1, aqe1);
/* 183 */       a(☃, afi.A.a(aji.a.c.a()), 9, 2, 1, aqe1);
/* 184 */       a(☃, afi.A.a(aji.a.c.a()), 9, 3, 1, aqe1);
/* 185 */       a(☃, afi.A.a(aji.a.c.a()), 10, 3, 1, aqe1);
/* 186 */       a(☃, afi.A.a(aji.a.c.a()), 11, 3, 1, aqe1);
/* 187 */       a(☃, afi.A.a(aji.a.c.a()), 11, 2, 1, aqe1);
/* 188 */       a(☃, afi.A.a(aji.a.c.a()), 11, 1, 1, aqe1);
/*     */ 
/*     */       
/* 191 */       a(☃, aqe1, 4, 1, 1, 8, 3, 3, afi.A.Q(), afi.a.Q(), false);
/* 192 */       a(☃, aqe1, 4, 1, 2, 8, 2, 2, afi.a.Q(), afi.a.Q(), false);
/* 193 */       a(☃, aqe1, 12, 1, 1, 16, 3, 3, afi.A.Q(), afi.a.Q(), false);
/* 194 */       a(☃, aqe1, 12, 1, 2, 16, 2, 2, afi.a.Q(), afi.a.Q(), false);
/*     */ 
/*     */       
/* 197 */       a(☃, aqe1, 5, 4, 5, this.a - 6, 4, this.c - 6, afi.A.Q(), afi.A.Q(), false);
/* 198 */       a(☃, aqe1, 9, 4, 9, 11, 4, 11, afi.a.Q(), afi.a.Q(), false);
/* 199 */       a(☃, aqe1, 8, 1, 8, 8, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 200 */       a(☃, aqe1, 12, 1, 8, 12, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 201 */       a(☃, aqe1, 8, 1, 12, 8, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 202 */       a(☃, aqe1, 12, 1, 12, 12, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/*     */ 
/*     */       
/* 205 */       a(☃, aqe1, 1, 1, 5, 4, 4, 11, afi.A.Q(), afi.A.Q(), false);
/* 206 */       a(☃, aqe1, this.a - 5, 1, 5, this.a - 2, 4, 11, afi.A.Q(), afi.A.Q(), false);
/* 207 */       a(☃, aqe1, 6, 7, 9, 6, 7, 11, afi.A.Q(), afi.A.Q(), false);
/* 208 */       a(☃, aqe1, this.a - 7, 7, 9, this.a - 7, 7, 11, afi.A.Q(), afi.A.Q(), false);
/* 209 */       a(☃, aqe1, 5, 5, 9, 5, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 210 */       a(☃, aqe1, this.a - 6, 5, 9, this.a - 6, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 211 */       a(☃, afi.a.Q(), 5, 5, 10, aqe1);
/* 212 */       a(☃, afi.a.Q(), 5, 6, 10, aqe1);
/* 213 */       a(☃, afi.a.Q(), 6, 6, 10, aqe1);
/* 214 */       a(☃, afi.a.Q(), this.a - 6, 5, 10, aqe1);
/* 215 */       a(☃, afi.a.Q(), this.a - 6, 6, 10, aqe1);
/* 216 */       a(☃, afi.a.Q(), this.a - 7, 6, 10, aqe1);
/*     */ 
/*     */       
/* 219 */       a(☃, aqe1, 2, 4, 4, 2, 6, 4, afi.a.Q(), afi.a.Q(), false);
/* 220 */       a(☃, aqe1, this.a - 3, 4, 4, this.a - 3, 6, 4, afi.a.Q(), afi.a.Q(), false);
/* 221 */       a(☃, afi.bO.a(i), 2, 4, 5, aqe1);
/* 222 */       a(☃, afi.bO.a(i), 2, 3, 4, aqe1);
/* 223 */       a(☃, afi.bO.a(i), this.a - 3, 4, 5, aqe1);
/* 224 */       a(☃, afi.bO.a(i), this.a - 3, 3, 4, aqe1);
/* 225 */       a(☃, aqe1, 1, 1, 3, 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
/* 226 */       a(☃, aqe1, this.a - 3, 1, 3, this.a - 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
/* 227 */       a(☃, afi.bO.Q(), 1, 1, 2, aqe1);
/* 228 */       a(☃, afi.bO.Q(), this.a - 2, 1, 2, aqe1);
/* 229 */       a(☃, afi.U.a(akb.a.b.a()), 1, 2, 2, aqe1);
/* 230 */       a(☃, afi.U.a(akb.a.b.a()), this.a - 2, 2, 2, aqe1);
/* 231 */       a(☃, afi.bO.a(m), 2, 1, 2, aqe1);
/* 232 */       a(☃, afi.bO.a(k), this.a - 3, 1, 2, aqe1);
/*     */ 
/*     */       
/* 235 */       a(☃, aqe1, 4, 3, 5, 4, 3, 18, afi.A.Q(), afi.A.Q(), false);
/* 236 */       a(☃, aqe1, this.a - 5, 3, 5, this.a - 5, 3, 17, afi.A.Q(), afi.A.Q(), false);
/* 237 */       a(☃, aqe1, 3, 1, 5, 4, 2, 16, afi.a.Q(), afi.a.Q(), false);
/* 238 */       a(☃, aqe1, this.a - 6, 1, 5, this.a - 5, 2, 16, afi.a.Q(), afi.a.Q(), false); int i2;
/* 239 */       for (i2 = 5; i2 <= 17; i2 += 2) {
/* 240 */         a(☃, afi.A.a(aji.a.c.a()), 4, 1, i2, aqe1);
/* 241 */         a(☃, afi.A.a(aji.a.b.a()), 4, 2, i2, aqe1);
/* 242 */         a(☃, afi.A.a(aji.a.c.a()), this.a - 5, 1, i2, aqe1);
/* 243 */         a(☃, afi.A.a(aji.a.b.a()), this.a - 5, 2, i2, aqe1);
/*     */       } 
/* 245 */       a(☃, afi.cu.a(n), 10, 0, 7, aqe1);
/* 246 */       a(☃, afi.cu.a(n), 10, 0, 8, aqe1);
/* 247 */       a(☃, afi.cu.a(n), 9, 0, 9, aqe1);
/* 248 */       a(☃, afi.cu.a(n), 11, 0, 9, aqe1);
/* 249 */       a(☃, afi.cu.a(n), 8, 0, 10, aqe1);
/* 250 */       a(☃, afi.cu.a(n), 12, 0, 10, aqe1);
/* 251 */       a(☃, afi.cu.a(n), 7, 0, 10, aqe1);
/* 252 */       a(☃, afi.cu.a(n), 13, 0, 10, aqe1);
/* 253 */       a(☃, afi.cu.a(n), 9, 0, 11, aqe1);
/* 254 */       a(☃, afi.cu.a(n), 11, 0, 11, aqe1);
/* 255 */       a(☃, afi.cu.a(n), 10, 0, 12, aqe1);
/* 256 */       a(☃, afi.cu.a(n), 10, 0, 13, aqe1);
/* 257 */       a(☃, afi.cu.a(i1), 10, 0, 10, aqe1);
/*     */ 
/*     */       
/* 260 */       for (i2 = 0; i2 <= this.a - 1; i2 += this.a - 1) {
/* 261 */         a(☃, afi.A.a(aji.a.c.a()), i2, 2, 1, aqe1);
/* 262 */         a(☃, afi.cu.a(n), i2, 2, 2, aqe1);
/* 263 */         a(☃, afi.A.a(aji.a.c.a()), i2, 2, 3, aqe1);
/* 264 */         a(☃, afi.A.a(aji.a.c.a()), i2, 3, 1, aqe1);
/* 265 */         a(☃, afi.cu.a(n), i2, 3, 2, aqe1);
/* 266 */         a(☃, afi.A.a(aji.a.c.a()), i2, 3, 3, aqe1);
/* 267 */         a(☃, afi.cu.a(n), i2, 4, 1, aqe1);
/* 268 */         a(☃, afi.A.a(aji.a.b.a()), i2, 4, 2, aqe1);
/* 269 */         a(☃, afi.cu.a(n), i2, 4, 3, aqe1);
/* 270 */         a(☃, afi.A.a(aji.a.c.a()), i2, 5, 1, aqe1);
/* 271 */         a(☃, afi.cu.a(n), i2, 5, 2, aqe1);
/* 272 */         a(☃, afi.A.a(aji.a.c.a()), i2, 5, 3, aqe1);
/* 273 */         a(☃, afi.cu.a(n), i2, 6, 1, aqe1);
/* 274 */         a(☃, afi.A.a(aji.a.b.a()), i2, 6, 2, aqe1);
/* 275 */         a(☃, afi.cu.a(n), i2, 6, 3, aqe1);
/* 276 */         a(☃, afi.cu.a(n), i2, 7, 1, aqe1);
/* 277 */         a(☃, afi.cu.a(n), i2, 7, 2, aqe1);
/* 278 */         a(☃, afi.cu.a(n), i2, 7, 3, aqe1);
/* 279 */         a(☃, afi.A.a(aji.a.c.a()), i2, 8, 1, aqe1);
/* 280 */         a(☃, afi.A.a(aji.a.c.a()), i2, 8, 2, aqe1);
/* 281 */         a(☃, afi.A.a(aji.a.c.a()), i2, 8, 3, aqe1);
/*     */       } 
/* 283 */       for (i2 = 2; i2 <= this.a - 3; i2 += this.a - 3 - 2) {
/* 284 */         a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 2, 0, aqe1);
/* 285 */         a(☃, afi.cu.a(n), i2, 2, 0, aqe1);
/* 286 */         a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 2, 0, aqe1);
/* 287 */         a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 3, 0, aqe1);
/* 288 */         a(☃, afi.cu.a(n), i2, 3, 0, aqe1);
/* 289 */         a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 3, 0, aqe1);
/* 290 */         a(☃, afi.cu.a(n), i2 - 1, 4, 0, aqe1);
/* 291 */         a(☃, afi.A.a(aji.a.b.a()), i2, 4, 0, aqe1);
/* 292 */         a(☃, afi.cu.a(n), i2 + 1, 4, 0, aqe1);
/* 293 */         a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 5, 0, aqe1);
/* 294 */         a(☃, afi.cu.a(n), i2, 5, 0, aqe1);
/* 295 */         a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 5, 0, aqe1);
/* 296 */         a(☃, afi.cu.a(n), i2 - 1, 6, 0, aqe1);
/* 297 */         a(☃, afi.A.a(aji.a.b.a()), i2, 6, 0, aqe1);
/* 298 */         a(☃, afi.cu.a(n), i2 + 1, 6, 0, aqe1);
/* 299 */         a(☃, afi.cu.a(n), i2 - 1, 7, 0, aqe1);
/* 300 */         a(☃, afi.cu.a(n), i2, 7, 0, aqe1);
/* 301 */         a(☃, afi.cu.a(n), i2 + 1, 7, 0, aqe1);
/* 302 */         a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 8, 0, aqe1);
/* 303 */         a(☃, afi.A.a(aji.a.c.a()), i2, 8, 0, aqe1);
/* 304 */         a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 8, 0, aqe1);
/*     */       } 
/* 306 */       a(☃, aqe1, 8, 4, 0, 12, 6, 0, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 307 */       a(☃, afi.a.Q(), 8, 6, 0, aqe1);
/* 308 */       a(☃, afi.a.Q(), 12, 6, 0, aqe1);
/* 309 */       a(☃, afi.cu.a(n), 9, 5, 0, aqe1);
/* 310 */       a(☃, afi.A.a(aji.a.b.a()), 10, 5, 0, aqe1);
/* 311 */       a(☃, afi.cu.a(n), 11, 5, 0, aqe1);
/*     */ 
/*     */       
/* 314 */       a(☃, aqe1, 8, -14, 8, 12, -11, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 315 */       a(☃, aqe1, 8, -10, 8, 12, -10, 12, afi.A.a(aji.a.b.a()), afi.A.a(aji.a.b.a()), false);
/* 316 */       a(☃, aqe1, 8, -9, 8, 12, -9, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 317 */       a(☃, aqe1, 8, -8, 8, 12, -1, 12, afi.A.Q(), afi.A.Q(), false);
/* 318 */       a(☃, aqe1, 9, -11, 9, 11, -1, 11, afi.a.Q(), afi.a.Q(), false);
/* 319 */       a(☃, afi.az.Q(), 10, -11, 10, aqe1);
/* 320 */       a(☃, aqe1, 9, -13, 9, 11, -13, 11, afi.W.Q(), afi.a.Q(), false);
/* 321 */       a(☃, afi.a.Q(), 8, -11, 10, aqe1);
/* 322 */       a(☃, afi.a.Q(), 8, -10, 10, aqe1);
/* 323 */       a(☃, afi.A.a(aji.a.b.a()), 7, -10, 10, aqe1);
/* 324 */       a(☃, afi.A.a(aji.a.c.a()), 7, -11, 10, aqe1);
/* 325 */       a(☃, afi.a.Q(), 12, -11, 10, aqe1);
/* 326 */       a(☃, afi.a.Q(), 12, -10, 10, aqe1);
/* 327 */       a(☃, afi.A.a(aji.a.b.a()), 13, -10, 10, aqe1);
/* 328 */       a(☃, afi.A.a(aji.a.c.a()), 13, -11, 10, aqe1);
/* 329 */       a(☃, afi.a.Q(), 10, -11, 8, aqe1);
/* 330 */       a(☃, afi.a.Q(), 10, -10, 8, aqe1);
/* 331 */       a(☃, afi.A.a(aji.a.b.a()), 10, -10, 7, aqe1);
/* 332 */       a(☃, afi.A.a(aji.a.c.a()), 10, -11, 7, aqe1);
/* 333 */       a(☃, afi.a.Q(), 10, -11, 12, aqe1);
/* 334 */       a(☃, afi.a.Q(), 10, -10, 12, aqe1);
/* 335 */       a(☃, afi.A.a(aji.a.b.a()), 10, -10, 13, aqe1);
/* 336 */       a(☃, afi.A.a(aji.a.c.a()), 10, -11, 13, aqe1);
/*     */ 
/*     */       
/* 339 */       for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 340 */         if (!this.e[cq.b()]) {
/* 341 */           int i3 = cq.g() * 2;
/* 342 */           int i4 = cq.i() * 2;
/* 343 */           this.e[cq.b()] = a(☃, aqe1, random, 10 + i3, -11, 10 + i4, ob.a(f, new ob[] { zy.cd.b(random) }), 2 + random.nextInt(5));
/*     */         }  }
/*     */ 
/*     */       
/* 347 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends c
/*     */   {
/*     */     private boolean e;
/*     */     private boolean f;
/*     */     private boolean g;
/*     */     private boolean h;
/* 358 */     private static final List<ob> i = Lists.newArrayList((Object[])new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
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
/* 371 */     private static final List<ob> j = Lists.newArrayList((Object[])new ob[] { new ob(zy.g, 0, 2, 7, 30) });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public b() {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public b(Random ☃, int i, int j) {
/* 382 */       super(☃, i, 64, j, 12, 10, 15);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dn ☃) {
/* 387 */       super.a(☃);
/* 388 */       ☃.a("placedMainChest", this.e);
/* 389 */       ☃.a("placedHiddenChest", this.f);
/* 390 */       ☃.a("placedTrap1", this.g);
/* 391 */       ☃.a("placedTrap2", this.h);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/* 396 */       super.b(☃);
/* 397 */       this.e = ☃.n("placedMainChest");
/* 398 */       this.f = ☃.n("placedHiddenChest");
/* 399 */       this.g = ☃.n("placedTrap1");
/* 400 */       this.h = ☃.n("placedTrap2");
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 405 */       if (!a(☃, aqe1, 0)) {
/* 406 */         return false;
/*     */       }
/*     */       
/* 409 */       int i = a(afi.aw, 3);
/* 410 */       int j = a(afi.aw, 2);
/* 411 */       int k = a(afi.aw, 0);
/* 412 */       int m = a(afi.aw, 1);
/*     */ 
/*     */       
/* 415 */       a(☃, aqe1, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, k);
/*     */ 
/*     */       
/* 418 */       a(☃, aqe1, 2, 1, 2, 9, 2, 2, false, random, k);
/* 419 */       a(☃, aqe1, 2, 1, 12, 9, 2, 12, false, random, k);
/* 420 */       a(☃, aqe1, 2, 1, 3, 2, 2, 11, false, random, k);
/* 421 */       a(☃, aqe1, 9, 1, 3, 9, 2, 11, false, random, k);
/*     */ 
/*     */       
/* 424 */       a(☃, aqe1, 1, 3, 1, 10, 6, 1, false, random, k);
/* 425 */       a(☃, aqe1, 1, 3, 13, 10, 6, 13, false, random, k);
/* 426 */       a(☃, aqe1, 1, 3, 2, 1, 6, 12, false, random, k);
/* 427 */       a(☃, aqe1, 10, 3, 2, 10, 6, 12, false, random, k);
/*     */ 
/*     */       
/* 430 */       a(☃, aqe1, 2, 3, 2, 9, 3, 12, false, random, k);
/* 431 */       a(☃, aqe1, 2, 6, 2, 9, 6, 12, false, random, k);
/* 432 */       a(☃, aqe1, 3, 7, 3, 8, 7, 11, false, random, k);
/* 433 */       a(☃, aqe1, 4, 8, 4, 7, 8, 10, false, random, k);
/*     */ 
/*     */       
/* 436 */       a(☃, aqe1, 3, 1, 3, 8, 2, 11);
/* 437 */       a(☃, aqe1, 4, 3, 6, 7, 3, 9);
/* 438 */       a(☃, aqe1, 2, 4, 2, 9, 5, 12);
/* 439 */       a(☃, aqe1, 4, 6, 5, 7, 6, 9);
/* 440 */       a(☃, aqe1, 5, 7, 6, 6, 7, 8);
/*     */ 
/*     */       
/* 443 */       a(☃, aqe1, 5, 1, 2, 6, 2, 2);
/* 444 */       a(☃, aqe1, 5, 2, 12, 6, 2, 12);
/* 445 */       a(☃, aqe1, 5, 5, 1, 6, 5, 1);
/* 446 */       a(☃, aqe1, 5, 5, 13, 6, 5, 13);
/* 447 */       a(☃, afi.a.Q(), 1, 5, 5, aqe1);
/* 448 */       a(☃, afi.a.Q(), 10, 5, 5, aqe1);
/* 449 */       a(☃, afi.a.Q(), 1, 5, 9, aqe1);
/* 450 */       a(☃, afi.a.Q(), 10, 5, 9, aqe1);
/*     */       
/*     */       int n;
/* 453 */       for (n = 0; n <= 14; n += 14) {
/* 454 */         a(☃, aqe1, 2, 4, n, 2, 5, n, false, random, k);
/* 455 */         a(☃, aqe1, 4, 4, n, 4, 5, n, false, random, k);
/* 456 */         a(☃, aqe1, 7, 4, n, 7, 5, n, false, random, k);
/* 457 */         a(☃, aqe1, 9, 4, n, 9, 5, n, false, random, k);
/*     */       } 
/* 459 */       a(☃, aqe1, 5, 6, 0, 6, 6, 0, false, random, k);
/* 460 */       for (n = 0; n <= 11; n += 11) {
/* 461 */         for (int i1 = 2; i1 <= 12; i1 += 2) {
/* 462 */           a(☃, aqe1, n, 4, i1, n, 5, i1, false, random, k);
/*     */         }
/* 464 */         a(☃, aqe1, n, 6, 5, n, 6, 5, false, random, k);
/* 465 */         a(☃, aqe1, n, 6, 9, n, 6, 9, false, random, k);
/*     */       } 
/* 467 */       a(☃, aqe1, 2, 7, 2, 2, 9, 2, false, random, k);
/* 468 */       a(☃, aqe1, 9, 7, 2, 9, 9, 2, false, random, k);
/* 469 */       a(☃, aqe1, 2, 7, 12, 2, 9, 12, false, random, k);
/* 470 */       a(☃, aqe1, 9, 7, 12, 9, 9, 12, false, random, k);
/* 471 */       a(☃, aqe1, 4, 9, 4, 4, 9, 4, false, random, k);
/* 472 */       a(☃, aqe1, 7, 9, 4, 7, 9, 4, false, random, k);
/* 473 */       a(☃, aqe1, 4, 9, 10, 4, 9, 10, false, random, k);
/* 474 */       a(☃, aqe1, 7, 9, 10, 7, 9, 10, false, random, k);
/* 475 */       a(☃, aqe1, 5, 9, 7, 6, 9, 7, false, random, k);
/* 476 */       a(☃, afi.aw.a(i), 5, 9, 6, aqe1);
/* 477 */       a(☃, afi.aw.a(i), 6, 9, 6, aqe1);
/* 478 */       a(☃, afi.aw.a(j), 5, 9, 8, aqe1);
/* 479 */       a(☃, afi.aw.a(j), 6, 9, 8, aqe1);
/*     */ 
/*     */       
/* 482 */       a(☃, afi.aw.a(i), 4, 0, 0, aqe1);
/* 483 */       a(☃, afi.aw.a(i), 5, 0, 0, aqe1);
/* 484 */       a(☃, afi.aw.a(i), 6, 0, 0, aqe1);
/* 485 */       a(☃, afi.aw.a(i), 7, 0, 0, aqe1);
/*     */ 
/*     */       
/* 488 */       a(☃, afi.aw.a(i), 4, 1, 8, aqe1);
/* 489 */       a(☃, afi.aw.a(i), 4, 2, 9, aqe1);
/* 490 */       a(☃, afi.aw.a(i), 4, 3, 10, aqe1);
/* 491 */       a(☃, afi.aw.a(i), 7, 1, 8, aqe1);
/* 492 */       a(☃, afi.aw.a(i), 7, 2, 9, aqe1);
/* 493 */       a(☃, afi.aw.a(i), 7, 3, 10, aqe1);
/* 494 */       a(☃, aqe1, 4, 1, 9, 4, 1, 9, false, random, k);
/* 495 */       a(☃, aqe1, 7, 1, 9, 7, 1, 9, false, random, k);
/* 496 */       a(☃, aqe1, 4, 1, 10, 7, 2, 10, false, random, k);
/*     */ 
/*     */       
/* 499 */       a(☃, aqe1, 5, 4, 5, 6, 4, 5, false, random, k);
/* 500 */       a(☃, afi.aw.a(k), 4, 4, 5, aqe1);
/* 501 */       a(☃, afi.aw.a(m), 7, 4, 5, aqe1);
/*     */ 
/*     */       
/* 504 */       for (n = 0; n < 4; n++) {
/* 505 */         a(☃, afi.aw.a(j), 5, 0 - n, 6 + n, aqe1);
/* 506 */         a(☃, afi.aw.a(j), 6, 0 - n, 6 + n, aqe1);
/* 507 */         a(☃, aqe1, 5, 0 - n, 7 + n, 6, 0 - n, 9 + n);
/*     */       } 
/*     */ 
/*     */       
/* 511 */       a(☃, aqe1, 1, -3, 12, 10, -1, 13);
/* 512 */       a(☃, aqe1, 1, -3, 1, 3, -1, 13);
/* 513 */       a(☃, aqe1, 1, -3, 1, 9, -1, 5);
/* 514 */       for (n = 1; n <= 13; n += 2) {
/* 515 */         a(☃, aqe1, 1, -3, n, 1, -2, n, false, random, k);
/*     */       }
/* 517 */       for (n = 2; n <= 12; n += 2) {
/* 518 */         a(☃, aqe1, 1, -1, n, 3, -1, n, false, random, k);
/*     */       }
/* 520 */       a(☃, aqe1, 2, -2, 1, 5, -2, 1, false, random, k);
/* 521 */       a(☃, aqe1, 7, -2, 1, 9, -2, 1, false, random, k);
/* 522 */       a(☃, aqe1, 6, -3, 1, 6, -3, 1, false, random, k);
/* 523 */       a(☃, aqe1, 6, -1, 1, 6, -1, 1, false, random, k);
/*     */ 
/*     */       
/* 526 */       a(☃, afi.bR.a(a(afi.bR, cq.f.b())).a(akj.N, Boolean.valueOf(true)), 1, -3, 8, aqe1);
/* 527 */       a(☃, afi.bR.a(a(afi.bR, cq.e.b())).a(akj.N, Boolean.valueOf(true)), 4, -3, 8, aqe1);
/* 528 */       a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 2, -3, 8, aqe1);
/* 529 */       a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 3, -3, 8, aqe1);
/* 530 */       a(☃, afi.af.Q(), 5, -3, 7, aqe1);
/* 531 */       a(☃, afi.af.Q(), 5, -3, 6, aqe1);
/* 532 */       a(☃, afi.af.Q(), 5, -3, 5, aqe1);
/* 533 */       a(☃, afi.af.Q(), 5, -3, 4, aqe1);
/* 534 */       a(☃, afi.af.Q(), 5, -3, 3, aqe1);
/* 535 */       a(☃, afi.af.Q(), 5, -3, 2, aqe1);
/* 536 */       a(☃, afi.af.Q(), 5, -3, 1, aqe1);
/* 537 */       a(☃, afi.af.Q(), 4, -3, 1, aqe1);
/* 538 */       a(☃, afi.Y.Q(), 3, -3, 1, aqe1);
/* 539 */       if (!this.g) {
/* 540 */         this.g = a(☃, aqe1, random, 3, -2, 1, cq.c.a(), j, 2);
/*     */       }
/* 542 */       a(☃, afi.bn.a(15), 3, -2, 2, aqe1);
/*     */ 
/*     */       
/* 545 */       a(☃, afi.bR.a(a(afi.bR, cq.c.b())).a(akj.N, Boolean.valueOf(true)), 7, -3, 1, aqe1);
/* 546 */       a(☃, afi.bR.a(a(afi.bR, cq.d.b())).a(akj.N, Boolean.valueOf(true)), 7, -3, 5, aqe1);
/* 547 */       a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 7, -3, 2, aqe1);
/* 548 */       a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 7, -3, 3, aqe1);
/* 549 */       a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 7, -3, 4, aqe1);
/* 550 */       a(☃, afi.af.Q(), 8, -3, 6, aqe1);
/* 551 */       a(☃, afi.af.Q(), 9, -3, 6, aqe1);
/* 552 */       a(☃, afi.af.Q(), 9, -3, 5, aqe1);
/* 553 */       a(☃, afi.Y.Q(), 9, -3, 4, aqe1);
/* 554 */       a(☃, afi.af.Q(), 9, -2, 4, aqe1);
/* 555 */       if (!this.h) {
/* 556 */         this.h = a(☃, aqe1, random, 9, -2, 3, cq.e.a(), j, 2);
/*     */       }
/* 558 */       a(☃, afi.bn.a(15), 8, -1, 3, aqe1);
/* 559 */       a(☃, afi.bn.a(15), 8, -2, 3, aqe1);
/* 560 */       if (!this.e) {
/* 561 */         this.e = a(☃, aqe1, random, 8, -3, 3, ob.a(i, new ob[] { zy.cd.b(random) }), 2 + random.nextInt(5));
/*     */       }
/* 563 */       a(☃, afi.Y.Q(), 9, -3, 2, aqe1);
/* 564 */       a(☃, afi.Y.Q(), 8, -3, 1, aqe1);
/* 565 */       a(☃, afi.Y.Q(), 4, -3, 5, aqe1);
/* 566 */       a(☃, afi.Y.Q(), 5, -2, 5, aqe1);
/* 567 */       a(☃, afi.Y.Q(), 5, -1, 5, aqe1);
/* 568 */       a(☃, afi.Y.Q(), 6, -3, 5, aqe1);
/* 569 */       a(☃, afi.Y.Q(), 7, -2, 5, aqe1);
/* 570 */       a(☃, afi.Y.Q(), 7, -1, 5, aqe1);
/* 571 */       a(☃, afi.Y.Q(), 8, -3, 5, aqe1);
/* 572 */       a(☃, aqe1, 9, -1, 1, 9, -1, 5, false, random, k);
/*     */ 
/*     */       
/* 575 */       a(☃, aqe1, 8, -3, 8, 10, -1, 10);
/* 576 */       a(☃, afi.bf.a(ajz.P), 8, -2, 11, aqe1);
/* 577 */       a(☃, afi.bf.a(ajz.P), 9, -2, 11, aqe1);
/* 578 */       a(☃, afi.bf.a(ajz.P), 10, -2, 11, aqe1);
/* 579 */       a(☃, afi.ay.a(ahu.a(cq.a(a(afi.ay, cq.c.a())))), 8, -2, 12, aqe1);
/* 580 */       a(☃, afi.ay.a(ahu.a(cq.a(a(afi.ay, cq.c.a())))), 9, -2, 12, aqe1);
/* 581 */       a(☃, afi.ay.a(ahu.a(cq.a(a(afi.ay, cq.c.a())))), 10, -2, 12, aqe1);
/* 582 */       a(☃, aqe1, 8, -3, 8, 8, -3, 10, false, random, k);
/* 583 */       a(☃, aqe1, 10, -3, 8, 10, -3, 10, false, random, k);
/* 584 */       a(☃, afi.Y.Q(), 10, -2, 9, aqe1);
/* 585 */       a(☃, afi.af.Q(), 8, -2, 9, aqe1);
/* 586 */       a(☃, afi.af.Q(), 8, -2, 10, aqe1);
/* 587 */       a(☃, afi.af.Q(), 10, -1, 9, aqe1);
/* 588 */       a(☃, afi.F.a(cq.b.a()), 9, -2, 8, aqe1);
/* 589 */       a(☃, afi.F.a(a(afi.F, cq.e.a())), 10, -2, 8, aqe1);
/* 590 */       a(☃, afi.F.a(a(afi.F, cq.e.a())), 10, -1, 8, aqe1);
/* 591 */       a(☃, afi.bb.a(a(afi.bb, cq.c.b())), 10, -2, 10, aqe1);
/* 592 */       if (!this.f) {
/* 593 */         this.f = a(☃, aqe1, random, 9, -3, 10, ob.a(i, new ob[] { zy.cd.b(random) }), 2 + random.nextInt(5));
/*     */       }
/*     */       
/* 596 */       return true;
/*     */     }
/*     */     
/*     */     static class a extends aqt.a { private a() {}
/*     */       
/*     */       public void a(Random ☃, int i, int j, int k, boolean bool) {
/* 602 */         if (☃.nextFloat() < 0.4F) {
/* 603 */           this.a = afi.e.Q();
/*     */         } else {
/* 605 */           this.a = afi.Y.Q();
/*     */         } 
/*     */       } }
/*     */ 
/*     */     
/* 610 */     private static a k = new a();
/*     */   }
/*     */   
/*     */   public static class d
/*     */     extends c
/*     */   {
/*     */     private boolean e;
/*     */     
/*     */     public d() {}
/*     */     
/*     */     public d(Random ☃, int i, int j) {
/* 621 */       super(☃, i, 64, j, 7, 7, 9);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dn ☃) {
/* 626 */       super.a(☃);
/* 627 */       ☃.a("Witch", this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b(dn ☃) {
/* 632 */       super.b(☃);
/* 633 */       this.e = ☃.n("Witch");
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adm ☃, Random random, aqe aqe1) {
/* 638 */       if (!a(☃, aqe1, 0)) {
/* 639 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 643 */       a(☃, aqe1, 1, 1, 1, 5, 1, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/* 644 */       a(☃, aqe1, 1, 4, 2, 5, 4, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/* 645 */       a(☃, aqe1, 2, 1, 0, 4, 1, 0, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/*     */ 
/*     */       
/* 648 */       a(☃, aqe1, 2, 2, 2, 3, 3, 2, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/* 649 */       a(☃, aqe1, 1, 2, 3, 1, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/* 650 */       a(☃, aqe1, 5, 2, 3, 5, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/* 651 */       a(☃, aqe1, 2, 2, 7, 4, 3, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
/*     */ 
/*     */       
/* 654 */       a(☃, aqe1, 1, 0, 2, 1, 3, 2, afi.r.Q(), afi.r.Q(), false);
/* 655 */       a(☃, aqe1, 5, 0, 2, 5, 3, 2, afi.r.Q(), afi.r.Q(), false);
/* 656 */       a(☃, aqe1, 1, 0, 7, 1, 3, 7, afi.r.Q(), afi.r.Q(), false);
/* 657 */       a(☃, aqe1, 5, 0, 7, 5, 3, 7, afi.r.Q(), afi.r.Q(), false);
/*     */ 
/*     */       
/* 660 */       a(☃, afi.aO.Q(), 2, 3, 2, aqe1);
/* 661 */       a(☃, afi.aO.Q(), 3, 3, 7, aqe1);
/* 662 */       a(☃, afi.a.Q(), 1, 3, 4, aqe1);
/* 663 */       a(☃, afi.a.Q(), 5, 3, 4, aqe1);
/* 664 */       a(☃, afi.a.Q(), 5, 3, 5, aqe1);
/* 665 */       a(☃, afi.ca.Q().a(agx.b, agx.a.r), 1, 3, 5, aqe1);
/*     */ 
/*     */       
/* 668 */       a(☃, afi.ai.Q(), 3, 2, 6, aqe1);
/* 669 */       a(☃, afi.bE.Q(), 4, 2, 6, aqe1);
/*     */ 
/*     */       
/* 672 */       a(☃, afi.aO.Q(), 1, 2, 1, aqe1);
/* 673 */       a(☃, afi.aO.Q(), 5, 2, 1, aqe1);
/*     */ 
/*     */       
/* 676 */       int i = a(afi.ad, 3);
/* 677 */       int j = a(afi.ad, 1);
/* 678 */       int k = a(afi.ad, 0);
/* 679 */       int m = a(afi.ad, 2);
/*     */       
/* 681 */       a(☃, aqe1, 0, 4, 1, 6, 4, 1, afi.bU.a(i), afi.bU.a(i), false);
/* 682 */       a(☃, aqe1, 0, 4, 2, 0, 4, 7, afi.bU.a(k), afi.bU.a(k), false);
/* 683 */       a(☃, aqe1, 6, 4, 2, 6, 4, 7, afi.bU.a(j), afi.bU.a(j), false);
/* 684 */       a(☃, aqe1, 0, 4, 8, 6, 4, 8, afi.bU.a(m), afi.bU.a(m), false);
/*     */       
/*     */       int n;
/* 687 */       for (n = 2; n <= 7; n += 5) {
/* 688 */         for (int i3 = 1; i3 <= 5; i3 += 4) {
/* 689 */           b(☃, afi.r.Q(), i3, -1, n, aqe1);
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 694 */       n = a(2, 5);
/* 695 */       int i1 = d(2);
/* 696 */       int i2 = b(2, 5);
/*     */       
/* 698 */       if (!this.e && aqe1.b(new cj(n, i1, i2))) {
/* 699 */         this.e = true;
/*     */         
/* 701 */         wd wd = new wd(☃);
/* 702 */         wd.b(n + 0.5D, i1, i2 + 0.5D, 0.0F, 0.0F);
/* 703 */         wd.a(☃.E(new cj(n, i1, i2)), (pu)null);
/* 704 */         ☃.d(wd);
/*     */       } 
/*     */ 
/*     */       
/* 708 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */