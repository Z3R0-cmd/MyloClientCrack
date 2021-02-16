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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class p
/*     */   extends aqt
/*     */ {
/* 211 */   protected a d = a.a;
/*     */ 
/*     */   
/*     */   public p() {}
/*     */ 
/*     */   
/*     */   protected p(int ☃) {
/* 218 */     super(☃);
/*     */   }
/*     */   
/*     */   public enum a {
/* 222 */     a, b, c, d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dn ☃) {
/* 227 */     ☃.a("EntryDoor", this.d.name());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {
/* 232 */     this.d = a.valueOf(☃.j("EntryDoor"));
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, Random random, aqe aqe1, a a1, int i, int j, int k) {
/* 236 */     switch (aqp.null.a[a1.ordinal()]) {
/*     */       
/*     */       default:
/* 239 */         a(☃, aqe1, i, j, k, i + 3 - 1, j + 3 - 1, k, afi.a.Q(), afi.a.Q(), false);
/*     */         return;
/*     */       case 2:
/* 242 */         a(☃, afi.bf.Q(), i, j, k, aqe1);
/* 243 */         a(☃, afi.bf.Q(), i, j + 1, k, aqe1);
/* 244 */         a(☃, afi.bf.Q(), i, j + 2, k, aqe1);
/* 245 */         a(☃, afi.bf.Q(), i + 1, j + 2, k, aqe1);
/* 246 */         a(☃, afi.bf.Q(), i + 2, j + 2, k, aqe1);
/* 247 */         a(☃, afi.bf.Q(), i + 2, j + 1, k, aqe1);
/* 248 */         a(☃, afi.bf.Q(), i + 2, j, k, aqe1);
/* 249 */         a(☃, afi.ao.Q(), i + 1, j, k, aqe1);
/* 250 */         a(☃, afi.ao.a(8), i + 1, j + 1, k, aqe1);
/*     */         return;
/*     */       case 3:
/* 253 */         a(☃, afi.a.Q(), i + 1, j, k, aqe1);
/* 254 */         a(☃, afi.a.Q(), i + 1, j + 1, k, aqe1);
/* 255 */         a(☃, afi.bi.Q(), i, j, k, aqe1);
/* 256 */         a(☃, afi.bi.Q(), i, j + 1, k, aqe1);
/* 257 */         a(☃, afi.bi.Q(), i, j + 2, k, aqe1);
/* 258 */         a(☃, afi.bi.Q(), i + 1, j + 2, k, aqe1);
/* 259 */         a(☃, afi.bi.Q(), i + 2, j + 2, k, aqe1);
/* 260 */         a(☃, afi.bi.Q(), i + 2, j + 1, k, aqe1);
/* 261 */         a(☃, afi.bi.Q(), i + 2, j, k, aqe1); return;
/*     */       case 4:
/*     */         break;
/* 264 */     }  a(☃, afi.bf.Q(), i, j, k, aqe1);
/* 265 */     a(☃, afi.bf.Q(), i, j + 1, k, aqe1);
/* 266 */     a(☃, afi.bf.Q(), i, j + 2, k, aqe1);
/* 267 */     a(☃, afi.bf.Q(), i + 1, j + 2, k, aqe1);
/* 268 */     a(☃, afi.bf.Q(), i + 2, j + 2, k, aqe1);
/* 269 */     a(☃, afi.bf.Q(), i + 2, j + 1, k, aqe1);
/* 270 */     a(☃, afi.bf.Q(), i + 2, j, k, aqe1);
/* 271 */     a(☃, afi.aA.Q(), i + 1, j, k, aqe1);
/* 272 */     a(☃, afi.aA.a(8), i + 1, j + 1, k, aqe1);
/* 273 */     a(☃, afi.aG.a(a(afi.aG, 4)), i + 2, j + 1, k + 1, aqe1);
/* 274 */     a(☃, afi.aG.a(a(afi.aG, 3)), i + 2, j + 1, k - 1, aqe1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected a a(Random ☃) {
/* 280 */     int i = ☃.nextInt(5);
/* 281 */     switch (i)
/*     */     
/*     */     { 
/*     */       default:
/* 285 */         return a.a;
/*     */       case 2:
/* 287 */         return a.b;
/*     */       case 3:
/* 289 */         return a.c;
/*     */       case 4:
/* 291 */         break; }  return a.d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aqt a(aqp.m ☃, List<aqt> list, Random random, int i, int j) {
/* 296 */     if (this.m != null) {
/* 297 */       switch (aqp.null.b[this.m.ordinal()]) {
/*     */         case 1:
/* 299 */           return aqp.a(☃, list, random, this.l.a + i, this.l.b + j, this.l.c - 1, this.m, d());
/*     */         case 2:
/* 301 */           return aqp.a(☃, list, random, this.l.a + i, this.l.b + j, this.l.f + 1, this.m, d());
/*     */         case 3:
/* 303 */           return aqp.a(☃, list, random, this.l.a - 1, this.l.b + j, this.l.c + i, this.m, d());
/*     */         case 4:
/* 305 */           return aqp.a(☃, list, random, this.l.d + 1, this.l.b + j, this.l.c + i, this.m, d());
/*     */       } 
/*     */     }
/* 308 */     return null;
/*     */   }
/*     */   
/*     */   protected aqt b(aqp.m ☃, List<aqt> list, Random random, int i, int j) {
/* 312 */     if (this.m != null) {
/* 313 */       switch (aqp.null.b[this.m.ordinal()]) {
/*     */         case 1:
/* 315 */           return aqp.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*     */         case 2:
/* 317 */           return aqp.a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d());
/*     */         case 3:
/* 319 */           return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*     */         case 4:
/* 321 */           return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d());
/*     */       } 
/*     */     }
/* 324 */     return null;
/*     */   }
/*     */   
/*     */   protected aqt c(aqp.m ☃, List<aqt> list, Random random, int i, int j) {
/* 328 */     if (this.m != null) {
/* 329 */       switch (aqp.null.b[this.m.ordinal()]) {
/*     */         case 1:
/* 331 */           return aqp.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*     */         case 2:
/* 333 */           return aqp.a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d());
/*     */         case 3:
/* 335 */           return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*     */         case 4:
/* 337 */           return aqp.a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d());
/*     */       } 
/*     */     }
/* 340 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(aqe ☃) {
/* 344 */     return (☃ != null && ☃.b > 10);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqp$p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */