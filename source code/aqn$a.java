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
/*     */   extends aqn.c
/*     */ {
/*  99 */   private boolean[] e = new boolean[4];
/*     */ 
/*     */   
/* 102 */   private static final List<ob> f = Lists.newArrayList((Object[])new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a(Random ☃, int i, int j) {
/* 122 */     super(☃, i, 64, j, 21, 15, 21);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dn ☃) {
/* 127 */     super.a(☃);
/* 128 */     ☃.a("hasPlacedChest0", this.e[0]);
/* 129 */     ☃.a("hasPlacedChest1", this.e[1]);
/* 130 */     ☃.a("hasPlacedChest2", this.e[2]);
/* 131 */     ☃.a("hasPlacedChest3", this.e[3]);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {
/* 136 */     super.b(☃);
/* 137 */     this.e[0] = ☃.n("hasPlacedChest0");
/* 138 */     this.e[1] = ☃.n("hasPlacedChest1");
/* 139 */     this.e[2] = ☃.n("hasPlacedChest2");
/* 140 */     this.e[3] = ☃.n("hasPlacedChest3");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, aqe aqe1) {
/* 146 */     a(☃, aqe1, 0, -4, 0, this.a - 1, 0, this.c - 1, afi.A.Q(), afi.A.Q(), false); int i;
/* 147 */     for (i = 1; i <= 9; i++) {
/* 148 */       a(☃, aqe1, i, i, i, this.a - 1 - i, i, this.c - 1 - i, afi.A.Q(), afi.A.Q(), false);
/* 149 */       a(☃, aqe1, i + 1, i, i + 1, this.a - 2 - i, i, this.c - 2 - i, afi.a.Q(), afi.a.Q(), false);
/*     */     } 
/* 151 */     for (i = 0; i < this.a; i++) {
/* 152 */       for (int i3 = 0; i3 < this.c; i3++) {
/* 153 */         int i4 = -5;
/* 154 */         b(☃, afi.A.Q(), i, i4, i3, aqe1);
/*     */       } 
/*     */     } 
/*     */     
/* 158 */     i = a(afi.bO, 3);
/* 159 */     int j = a(afi.bO, 2);
/* 160 */     int k = a(afi.bO, 0);
/* 161 */     int m = a(afi.bO, 1);
/* 162 */     int n = (zd.b.b() ^ 0xFFFFFFFF) & 0xF;
/* 163 */     int i1 = (zd.l.b() ^ 0xFFFFFFFF) & 0xF;
/*     */ 
/*     */     
/* 166 */     a(☃, aqe1, 0, 0, 0, 4, 9, 4, afi.A.Q(), afi.a.Q(), false);
/* 167 */     a(☃, aqe1, 1, 10, 1, 3, 10, 3, afi.A.Q(), afi.A.Q(), false);
/* 168 */     a(☃, afi.bO.a(i), 2, 10, 0, aqe1);
/* 169 */     a(☃, afi.bO.a(j), 2, 10, 4, aqe1);
/* 170 */     a(☃, afi.bO.a(k), 0, 10, 2, aqe1);
/* 171 */     a(☃, afi.bO.a(m), 4, 10, 2, aqe1);
/* 172 */     a(☃, aqe1, this.a - 5, 0, 0, this.a - 1, 9, 4, afi.A.Q(), afi.a.Q(), false);
/* 173 */     a(☃, aqe1, this.a - 4, 10, 1, this.a - 2, 10, 3, afi.A.Q(), afi.A.Q(), false);
/* 174 */     a(☃, afi.bO.a(i), this.a - 3, 10, 0, aqe1);
/* 175 */     a(☃, afi.bO.a(j), this.a - 3, 10, 4, aqe1);
/* 176 */     a(☃, afi.bO.a(k), this.a - 5, 10, 2, aqe1);
/* 177 */     a(☃, afi.bO.a(m), this.a - 1, 10, 2, aqe1);
/*     */ 
/*     */     
/* 180 */     a(☃, aqe1, 8, 0, 0, 12, 4, 4, afi.A.Q(), afi.a.Q(), false);
/* 181 */     a(☃, aqe1, 9, 1, 0, 11, 3, 4, afi.a.Q(), afi.a.Q(), false);
/* 182 */     a(☃, afi.A.a(aji.a.c.a()), 9, 1, 1, aqe1);
/* 183 */     a(☃, afi.A.a(aji.a.c.a()), 9, 2, 1, aqe1);
/* 184 */     a(☃, afi.A.a(aji.a.c.a()), 9, 3, 1, aqe1);
/* 185 */     a(☃, afi.A.a(aji.a.c.a()), 10, 3, 1, aqe1);
/* 186 */     a(☃, afi.A.a(aji.a.c.a()), 11, 3, 1, aqe1);
/* 187 */     a(☃, afi.A.a(aji.a.c.a()), 11, 2, 1, aqe1);
/* 188 */     a(☃, afi.A.a(aji.a.c.a()), 11, 1, 1, aqe1);
/*     */ 
/*     */     
/* 191 */     a(☃, aqe1, 4, 1, 1, 8, 3, 3, afi.A.Q(), afi.a.Q(), false);
/* 192 */     a(☃, aqe1, 4, 1, 2, 8, 2, 2, afi.a.Q(), afi.a.Q(), false);
/* 193 */     a(☃, aqe1, 12, 1, 1, 16, 3, 3, afi.A.Q(), afi.a.Q(), false);
/* 194 */     a(☃, aqe1, 12, 1, 2, 16, 2, 2, afi.a.Q(), afi.a.Q(), false);
/*     */ 
/*     */     
/* 197 */     a(☃, aqe1, 5, 4, 5, this.a - 6, 4, this.c - 6, afi.A.Q(), afi.A.Q(), false);
/* 198 */     a(☃, aqe1, 9, 4, 9, 11, 4, 11, afi.a.Q(), afi.a.Q(), false);
/* 199 */     a(☃, aqe1, 8, 1, 8, 8, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 200 */     a(☃, aqe1, 12, 1, 8, 12, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 201 */     a(☃, aqe1, 8, 1, 12, 8, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 202 */     a(☃, aqe1, 12, 1, 12, 12, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/*     */ 
/*     */     
/* 205 */     a(☃, aqe1, 1, 1, 5, 4, 4, 11, afi.A.Q(), afi.A.Q(), false);
/* 206 */     a(☃, aqe1, this.a - 5, 1, 5, this.a - 2, 4, 11, afi.A.Q(), afi.A.Q(), false);
/* 207 */     a(☃, aqe1, 6, 7, 9, 6, 7, 11, afi.A.Q(), afi.A.Q(), false);
/* 208 */     a(☃, aqe1, this.a - 7, 7, 9, this.a - 7, 7, 11, afi.A.Q(), afi.A.Q(), false);
/* 209 */     a(☃, aqe1, 5, 5, 9, 5, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 210 */     a(☃, aqe1, this.a - 6, 5, 9, this.a - 6, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 211 */     a(☃, afi.a.Q(), 5, 5, 10, aqe1);
/* 212 */     a(☃, afi.a.Q(), 5, 6, 10, aqe1);
/* 213 */     a(☃, afi.a.Q(), 6, 6, 10, aqe1);
/* 214 */     a(☃, afi.a.Q(), this.a - 6, 5, 10, aqe1);
/* 215 */     a(☃, afi.a.Q(), this.a - 6, 6, 10, aqe1);
/* 216 */     a(☃, afi.a.Q(), this.a - 7, 6, 10, aqe1);
/*     */ 
/*     */     
/* 219 */     a(☃, aqe1, 2, 4, 4, 2, 6, 4, afi.a.Q(), afi.a.Q(), false);
/* 220 */     a(☃, aqe1, this.a - 3, 4, 4, this.a - 3, 6, 4, afi.a.Q(), afi.a.Q(), false);
/* 221 */     a(☃, afi.bO.a(i), 2, 4, 5, aqe1);
/* 222 */     a(☃, afi.bO.a(i), 2, 3, 4, aqe1);
/* 223 */     a(☃, afi.bO.a(i), this.a - 3, 4, 5, aqe1);
/* 224 */     a(☃, afi.bO.a(i), this.a - 3, 3, 4, aqe1);
/* 225 */     a(☃, aqe1, 1, 1, 3, 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
/* 226 */     a(☃, aqe1, this.a - 3, 1, 3, this.a - 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
/* 227 */     a(☃, afi.bO.Q(), 1, 1, 2, aqe1);
/* 228 */     a(☃, afi.bO.Q(), this.a - 2, 1, 2, aqe1);
/* 229 */     a(☃, afi.U.a(akb.a.b.a()), 1, 2, 2, aqe1);
/* 230 */     a(☃, afi.U.a(akb.a.b.a()), this.a - 2, 2, 2, aqe1);
/* 231 */     a(☃, afi.bO.a(m), 2, 1, 2, aqe1);
/* 232 */     a(☃, afi.bO.a(k), this.a - 3, 1, 2, aqe1);
/*     */ 
/*     */     
/* 235 */     a(☃, aqe1, 4, 3, 5, 4, 3, 18, afi.A.Q(), afi.A.Q(), false);
/* 236 */     a(☃, aqe1, this.a - 5, 3, 5, this.a - 5, 3, 17, afi.A.Q(), afi.A.Q(), false);
/* 237 */     a(☃, aqe1, 3, 1, 5, 4, 2, 16, afi.a.Q(), afi.a.Q(), false);
/* 238 */     a(☃, aqe1, this.a - 6, 1, 5, this.a - 5, 2, 16, afi.a.Q(), afi.a.Q(), false); int i2;
/* 239 */     for (i2 = 5; i2 <= 17; i2 += 2) {
/* 240 */       a(☃, afi.A.a(aji.a.c.a()), 4, 1, i2, aqe1);
/* 241 */       a(☃, afi.A.a(aji.a.b.a()), 4, 2, i2, aqe1);
/* 242 */       a(☃, afi.A.a(aji.a.c.a()), this.a - 5, 1, i2, aqe1);
/* 243 */       a(☃, afi.A.a(aji.a.b.a()), this.a - 5, 2, i2, aqe1);
/*     */     } 
/* 245 */     a(☃, afi.cu.a(n), 10, 0, 7, aqe1);
/* 246 */     a(☃, afi.cu.a(n), 10, 0, 8, aqe1);
/* 247 */     a(☃, afi.cu.a(n), 9, 0, 9, aqe1);
/* 248 */     a(☃, afi.cu.a(n), 11, 0, 9, aqe1);
/* 249 */     a(☃, afi.cu.a(n), 8, 0, 10, aqe1);
/* 250 */     a(☃, afi.cu.a(n), 12, 0, 10, aqe1);
/* 251 */     a(☃, afi.cu.a(n), 7, 0, 10, aqe1);
/* 252 */     a(☃, afi.cu.a(n), 13, 0, 10, aqe1);
/* 253 */     a(☃, afi.cu.a(n), 9, 0, 11, aqe1);
/* 254 */     a(☃, afi.cu.a(n), 11, 0, 11, aqe1);
/* 255 */     a(☃, afi.cu.a(n), 10, 0, 12, aqe1);
/* 256 */     a(☃, afi.cu.a(n), 10, 0, 13, aqe1);
/* 257 */     a(☃, afi.cu.a(i1), 10, 0, 10, aqe1);
/*     */ 
/*     */     
/* 260 */     for (i2 = 0; i2 <= this.a - 1; i2 += this.a - 1) {
/* 261 */       a(☃, afi.A.a(aji.a.c.a()), i2, 2, 1, aqe1);
/* 262 */       a(☃, afi.cu.a(n), i2, 2, 2, aqe1);
/* 263 */       a(☃, afi.A.a(aji.a.c.a()), i2, 2, 3, aqe1);
/* 264 */       a(☃, afi.A.a(aji.a.c.a()), i2, 3, 1, aqe1);
/* 265 */       a(☃, afi.cu.a(n), i2, 3, 2, aqe1);
/* 266 */       a(☃, afi.A.a(aji.a.c.a()), i2, 3, 3, aqe1);
/* 267 */       a(☃, afi.cu.a(n), i2, 4, 1, aqe1);
/* 268 */       a(☃, afi.A.a(aji.a.b.a()), i2, 4, 2, aqe1);
/* 269 */       a(☃, afi.cu.a(n), i2, 4, 3, aqe1);
/* 270 */       a(☃, afi.A.a(aji.a.c.a()), i2, 5, 1, aqe1);
/* 271 */       a(☃, afi.cu.a(n), i2, 5, 2, aqe1);
/* 272 */       a(☃, afi.A.a(aji.a.c.a()), i2, 5, 3, aqe1);
/* 273 */       a(☃, afi.cu.a(n), i2, 6, 1, aqe1);
/* 274 */       a(☃, afi.A.a(aji.a.b.a()), i2, 6, 2, aqe1);
/* 275 */       a(☃, afi.cu.a(n), i2, 6, 3, aqe1);
/* 276 */       a(☃, afi.cu.a(n), i2, 7, 1, aqe1);
/* 277 */       a(☃, afi.cu.a(n), i2, 7, 2, aqe1);
/* 278 */       a(☃, afi.cu.a(n), i2, 7, 3, aqe1);
/* 279 */       a(☃, afi.A.a(aji.a.c.a()), i2, 8, 1, aqe1);
/* 280 */       a(☃, afi.A.a(aji.a.c.a()), i2, 8, 2, aqe1);
/* 281 */       a(☃, afi.A.a(aji.a.c.a()), i2, 8, 3, aqe1);
/*     */     } 
/* 283 */     for (i2 = 2; i2 <= this.a - 3; i2 += this.a - 3 - 2) {
/* 284 */       a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 2, 0, aqe1);
/* 285 */       a(☃, afi.cu.a(n), i2, 2, 0, aqe1);
/* 286 */       a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 2, 0, aqe1);
/* 287 */       a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 3, 0, aqe1);
/* 288 */       a(☃, afi.cu.a(n), i2, 3, 0, aqe1);
/* 289 */       a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 3, 0, aqe1);
/* 290 */       a(☃, afi.cu.a(n), i2 - 1, 4, 0, aqe1);
/* 291 */       a(☃, afi.A.a(aji.a.b.a()), i2, 4, 0, aqe1);
/* 292 */       a(☃, afi.cu.a(n), i2 + 1, 4, 0, aqe1);
/* 293 */       a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 5, 0, aqe1);
/* 294 */       a(☃, afi.cu.a(n), i2, 5, 0, aqe1);
/* 295 */       a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 5, 0, aqe1);
/* 296 */       a(☃, afi.cu.a(n), i2 - 1, 6, 0, aqe1);
/* 297 */       a(☃, afi.A.a(aji.a.b.a()), i2, 6, 0, aqe1);
/* 298 */       a(☃, afi.cu.a(n), i2 + 1, 6, 0, aqe1);
/* 299 */       a(☃, afi.cu.a(n), i2 - 1, 7, 0, aqe1);
/* 300 */       a(☃, afi.cu.a(n), i2, 7, 0, aqe1);
/* 301 */       a(☃, afi.cu.a(n), i2 + 1, 7, 0, aqe1);
/* 302 */       a(☃, afi.A.a(aji.a.c.a()), i2 - 1, 8, 0, aqe1);
/* 303 */       a(☃, afi.A.a(aji.a.c.a()), i2, 8, 0, aqe1);
/* 304 */       a(☃, afi.A.a(aji.a.c.a()), i2 + 1, 8, 0, aqe1);
/*     */     } 
/* 306 */     a(☃, aqe1, 8, 4, 0, 12, 6, 0, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 307 */     a(☃, afi.a.Q(), 8, 6, 0, aqe1);
/* 308 */     a(☃, afi.a.Q(), 12, 6, 0, aqe1);
/* 309 */     a(☃, afi.cu.a(n), 9, 5, 0, aqe1);
/* 310 */     a(☃, afi.A.a(aji.a.b.a()), 10, 5, 0, aqe1);
/* 311 */     a(☃, afi.cu.a(n), 11, 5, 0, aqe1);
/*     */ 
/*     */     
/* 314 */     a(☃, aqe1, 8, -14, 8, 12, -11, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 315 */     a(☃, aqe1, 8, -10, 8, 12, -10, 12, afi.A.a(aji.a.b.a()), afi.A.a(aji.a.b.a()), false);
/* 316 */     a(☃, aqe1, 8, -9, 8, 12, -9, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
/* 317 */     a(☃, aqe1, 8, -8, 8, 12, -1, 12, afi.A.Q(), afi.A.Q(), false);
/* 318 */     a(☃, aqe1, 9, -11, 9, 11, -1, 11, afi.a.Q(), afi.a.Q(), false);
/* 319 */     a(☃, afi.az.Q(), 10, -11, 10, aqe1);
/* 320 */     a(☃, aqe1, 9, -13, 9, 11, -13, 11, afi.W.Q(), afi.a.Q(), false);
/* 321 */     a(☃, afi.a.Q(), 8, -11, 10, aqe1);
/* 322 */     a(☃, afi.a.Q(), 8, -10, 10, aqe1);
/* 323 */     a(☃, afi.A.a(aji.a.b.a()), 7, -10, 10, aqe1);
/* 324 */     a(☃, afi.A.a(aji.a.c.a()), 7, -11, 10, aqe1);
/* 325 */     a(☃, afi.a.Q(), 12, -11, 10, aqe1);
/* 326 */     a(☃, afi.a.Q(), 12, -10, 10, aqe1);
/* 327 */     a(☃, afi.A.a(aji.a.b.a()), 13, -10, 10, aqe1);
/* 328 */     a(☃, afi.A.a(aji.a.c.a()), 13, -11, 10, aqe1);
/* 329 */     a(☃, afi.a.Q(), 10, -11, 8, aqe1);
/* 330 */     a(☃, afi.a.Q(), 10, -10, 8, aqe1);
/* 331 */     a(☃, afi.A.a(aji.a.b.a()), 10, -10, 7, aqe1);
/* 332 */     a(☃, afi.A.a(aji.a.c.a()), 10, -11, 7, aqe1);
/* 333 */     a(☃, afi.a.Q(), 10, -11, 12, aqe1);
/* 334 */     a(☃, afi.a.Q(), 10, -10, 12, aqe1);
/* 335 */     a(☃, afi.A.a(aji.a.b.a()), 10, -10, 13, aqe1);
/* 336 */     a(☃, afi.A.a(aji.a.c.a()), 10, -11, 13, aqe1);
/*     */ 
/*     */     
/* 339 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 340 */       if (!this.e[cq.b()]) {
/* 341 */         int i3 = cq.g() * 2;
/* 342 */         int i4 = cq.i() * 2;
/* 343 */         this.e[cq.b()] = a(☃, aqe1, random, 10 + i3, -11, 10 + i4, ob.a(f, new ob[] { zy.cd.b(random) }), 2 + random.nextInt(5));
/*     */       }  }
/*     */ 
/*     */     
/* 347 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqn$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */