/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ady
/*     */ {
/*  33 */   private static final Logger aD = LogManager.getLogger();
/*     */   
/*     */   public enum b {
/*  36 */     a,
/*  37 */     b,
/*  38 */     c,
/*  39 */     d;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public float a;
/*     */     public float b;
/*     */     
/*     */     public a(float ☃, float f1) {
/*  49 */       this.a = ☃;
/*  50 */       this.b = f1;
/*     */     }
/*     */     
/*     */     public a a() {
/*  54 */       return new a(this.a * 0.8F, this.b * 0.6F);
/*     */     }
/*     */   }
/*     */   
/*  58 */   protected static final a a = new a(0.1F, 0.2F);
/*  59 */   protected static final a b = new a(-0.5F, 0.0F);
/*  60 */   protected static final a c = new a(-1.0F, 0.1F);
/*  61 */   protected static final a d = new a(-1.8F, 0.1F);
/*  62 */   protected static final a e = new a(0.125F, 0.05F);
/*  63 */   protected static final a f = new a(0.2F, 0.2F);
/*  64 */   protected static final a g = new a(0.45F, 0.3F);
/*  65 */   protected static final a h = new a(1.5F, 0.025F);
/*  66 */   protected static final a i = new a(1.0F, 0.5F);
/*  67 */   protected static final a j = new a(0.0F, 0.025F);
/*  68 */   protected static final a k = new a(0.1F, 0.8F);
/*  69 */   protected static final a l = new a(0.2F, 0.3F);
/*  70 */   protected static final a m = new a(-0.2F, 0.1F);
/*     */   
/*  72 */   private static final ady[] aE = new ady[256];
/*  73 */   public static final Set<ady> n = Sets.newHashSet();
/*  74 */   public static final Map<String, ady> o = Maps.newHashMap();
/*     */   
/*  76 */   public static final ady p = (new aen(0)).b(112).a("Ocean").a(c);
/*  77 */   public static final ady q = (new aeo(1)).b(9286496).a("Plains");
/*  78 */   public static final ady r = (new aed(2)).b(16421912).a("Desert").b().a(2.0F, 0.0F).a(e);
/*     */   
/*  80 */   public static final ady s = (new aee(3, false)).b(6316128).a("Extreme Hills").a(i).a(0.2F, 0.3F);
/*  81 */   public static final ady t = (new aeg(4, 0)).b(353825).a("Forest");
/*  82 */   public static final ady u = (new aeu(5, 0)).b(747097).a("Taiga").a(5159473).a(0.25F, 0.8F).a(f);
/*     */   
/*  84 */   public static final ady v = (new aet(6)).b(522674).a("Swampland").a(9154376).a(m).a(0.8F, 0.9F);
/*  85 */   public static final ady w = (new aeq(7)).b(255).a("River").a(b);
/*     */   
/*  87 */   public static final ady x = (new aeh(8)).b(16711680).a("Hell").b().a(2.0F, 0.0F);
/*  88 */   public static final ady y = (new aev(9)).b(8421631).a("The End").b();
/*     */   
/*  90 */   public static final ady z = (new aen(10)).b(9474208).a("FrozenOcean").c().a(c).a(0.0F, 0.5F);
/*  91 */   public static final ady A = (new aeq(11)).b(10526975).a("FrozenRiver").c().a(b).a(0.0F, 0.5F);
/*  92 */   public static final ady B = (new aei(12, false)).b(16777215).a("Ice Plains").c().a(0.0F, 0.5F).a(e);
/*  93 */   public static final ady C = (new aei(13, false)).b(10526880).a("Ice Mountains").c().a(g).a(0.0F, 0.5F);
/*     */   
/*  95 */   public static final ady D = (new ael(14)).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).a(l);
/*  96 */   public static final ady E = (new ael(15)).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).a(j);
/*     */   
/*  98 */   public static final ady F = (new adx(16)).b(16440917).a("Beach").a(0.8F, 0.4F).a(j);
/*  99 */   public static final ady G = (new aed(17)).b(13786898).a("DesertHills").b().a(2.0F, 0.0F).a(g);
/* 100 */   public static final ady H = (new aeg(18, 0)).b(2250012).a("ForestHills").a(g);
/* 101 */   public static final ady I = (new aeu(19, 0)).b(1456435).a("TaigaHills").a(5159473).a(0.25F, 0.8F).a(g);
/* 102 */   public static final ady J = (new aee(20, true)).b(7501978).a("Extreme Hills Edge").a(i.a()).a(0.2F, 0.3F);
/*     */   
/* 104 */   public static final ady K = (new aej(21, false)).b(5470985).a("Jungle").a(5470985).a(0.95F, 0.9F);
/* 105 */   public static final ady L = (new aej(22, false)).b(2900485).a("JungleHills").a(5470985).a(0.95F, 0.9F).a(g);
/* 106 */   public static final ady M = (new aej(23, true)).b(6458135).a("JungleEdge").a(5470985).a(0.95F, 0.8F);
/*     */   
/* 108 */   public static final ady N = (new aen(24)).b(48).a("Deep Ocean").a(d);
/* 109 */   public static final ady O = (new aes(25)).b(10658436).a("Stone Beach").a(0.2F, 0.3F).a(k);
/* 110 */   public static final ady P = (new adx(26)).b(16445632).a("Cold Beach").a(0.05F, 0.3F).a(j).c();
/*     */   
/* 112 */   public static final ady Q = (new aeg(27, 2)).a("Birch Forest").b(3175492);
/* 113 */   public static final ady R = (new aeg(28, 2)).a("Birch Forest Hills").b(2055986).a(g);
/* 114 */   public static final ady S = (new aeg(29, 3)).b(4215066).a("Roofed Forest");
/*     */   
/* 116 */   public static final ady T = (new aeu(30, 0)).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5F, 0.4F).a(f).c(16777215);
/* 117 */   public static final ady U = (new aeu(31, 0)).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5F, 0.4F).a(g).c(16777215);
/* 118 */   public static final ady V = (new aeu(32, 1)).b(5858897).a("Mega Taiga").a(5159473).a(0.3F, 0.8F).a(f);
/* 119 */   public static final ady W = (new aeu(33, 1)).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3F, 0.8F).a(g);
/*     */   
/* 121 */   public static final ady X = (new aee(34, true)).b(5271632).a("Extreme Hills+").a(i).a(0.2F, 0.3F);
/*     */   
/* 123 */   public static final ady Y = (new aer(35)).b(12431967).a("Savanna").a(1.2F, 0.0F).b().a(e);
/* 124 */   public static final ady Z = (new aer(36)).b(10984804).a("Savanna Plateau").a(1.0F, 0.0F).b().a(h);
/*     */   
/* 126 */   public static final ady aa = (new aek(37, false, false)).b(14238997).a("Mesa");
/* 127 */   public static final ady ab = (new aek(38, false, true)).b(11573093).a("Mesa Plateau F").a(h);
/* 128 */   public static final ady ac = (new aek(39, false, false)).b(13274213).a("Mesa Plateau").a(h);
/*     */   
/* 130 */   public static final ady ad = p;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 136 */     q.k();
/* 137 */     r.k();
/* 138 */     t.k();
/* 139 */     u.k();
/* 140 */     v.k();
/* 141 */     B.k();
/* 142 */     K.k();
/* 143 */     M.k();
/* 144 */     T.k();
/* 145 */     Y.k();
/* 146 */     Z.k();
/* 147 */     aa.k();
/* 148 */     ab.k();
/* 149 */     ac.k();
/* 150 */     Q.k();
/* 151 */     R.k();
/* 152 */     S.k();
/* 153 */     V.k();
/* 154 */     s.k();
/* 155 */     X.k();
/*     */ 
/*     */     
/* 158 */     V.d(W.az + 128).a("Redwood Taiga Hills M"); ady[] ☃;
/*     */     int i, j;
/* 160 */     for (☃ = aE, i = ☃.length, j = 0; j < i; ) { ady ady1 = ☃[j];
/* 161 */       if (ady1 != null) {
/* 162 */         if (o.containsKey(ady1.ah)) {
/* 163 */           throw new Error("Biome \"" + ady1.ah + "\" is defined as both ID " + ((ady)o.get(ady1.ah)).az + " and " + ady1.az);
/*     */         }
/*     */         
/* 166 */         o.put(ady1.ah, ady1);
/*     */         
/* 168 */         if (ady1.az < 128) {
/* 169 */           n.add(ady1);
/*     */         }
/*     */       } 
/*     */       j++; }
/*     */     
/* 174 */     n.remove(x);
/* 175 */     n.remove(y);
/* 176 */     n.remove(z);
/* 177 */     n.remove(J);
/*     */   }
/*     */   
/* 180 */   protected static final ard ae = new ard(new Random(1234L), 1);
/* 181 */   protected static final ard af = new ard(new Random(2345L), 1);
/* 182 */   protected static final aos ag = new aos();
/*     */   public String ah;
/*     */   public int ai;
/*     */   public int aj;
/* 186 */   public alz ak = afi.c.Q();
/* 187 */   public alz al = afi.d.Q();
/* 188 */   public int am = 5169201;
/* 189 */   public float an = a.a;
/* 190 */   public float ao = a.b;
/* 191 */   public float ap = 0.5F;
/* 192 */   public float aq = 0.5F;
/* 193 */   public int ar = 16777215;
/*     */   
/*     */   public aeb as;
/*     */   
/* 197 */   protected List<c> at = Lists.newArrayList();
/* 198 */   protected List<c> au = Lists.newArrayList();
/* 199 */   protected List<c> av = Lists.newArrayList();
/* 200 */   protected List<c> aw = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean ax;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean ay = true;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int az;
/*     */ 
/*     */ 
/*     */   
/*     */   protected apv aA;
/*     */ 
/*     */ 
/*     */   
/*     */   protected aoi aB;
/*     */ 
/*     */ 
/*     */   
/*     */   protected apt aC;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected aeb a() {
/* 233 */     return new aeb();
/*     */   }
/*     */   
/*     */   protected ady a(float ☃, float f1) {
/* 237 */     if (☃ > 0.1F && ☃ < 0.2F) {
/* 238 */       throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
/*     */     }
/*     */     
/* 241 */     this.ap = ☃;
/* 242 */     this.aq = f1;
/* 243 */     return this;
/*     */   }
/*     */   
/*     */   protected final ady a(a ☃) {
/* 247 */     this.an = ☃.a;
/* 248 */     this.ao = ☃.b;
/* 249 */     return this;
/*     */   }
/*     */   
/*     */   protected ady b() {
/* 253 */     this.ay = false;
/* 254 */     return this;
/*     */   }
/*     */   
/* 257 */   protected ady(int ☃) { this.aA = new apv(false);
/* 258 */     this.aB = new aoi(false);
/* 259 */     this.aC = new apt(); this.az = ☃; aE[☃] = this; this.as = a(); this.au.add(new c((Class)tv.class, 12, 4, 4)); this.au.add(new c((Class)tu.class, 10, 3, 3)); this.au.add(new c((Class)tt.class, 10, 4, 4)); this.au.add(new c((Class)tn.class, 10, 4, 4)); this.au.add(new c((Class)to.class, 8, 4, 4)); this.at.add(new c((Class)wc.class, 100, 4, 4)); this.at.add(new c((Class)we.class, 100, 4, 4)); this.at.add(new c((Class)wa.class, 100, 4, 4)); this.at.add(new c((Class)vn.class, 100, 4, 4)); this.at.add(new c((Class)wb.class, 100, 4, 4)); this.at.add(new c((Class)vo.class, 10, 1, 4));
/*     */     this.at.add(new c((Class)wd.class, 5, 1, 1));
/*     */     this.av.add(new c((Class)tx.class, 10, 4, 4));
/* 262 */     this.aw.add(new c((Class)tk.class, 10, 8, 8)); } public aoh a(Random ☃) { if (☃.nextInt(10) == 0) {
/* 263 */       return this.aB;
/*     */     }
/* 265 */     return this.aA; }
/*     */ 
/*     */   
/*     */   public aot b(Random ☃) {
/* 269 */     return new apu(akc.a.b);
/*     */   }
/*     */   
/*     */   public agw.a a(Random ☃, cj cj1) {
/* 273 */     if (☃.nextInt(3) > 0) {
/* 274 */       return agw.a.a;
/*     */     }
/* 276 */     return agw.a.b;
/*     */   }
/*     */   
/*     */   protected ady c() {
/* 280 */     this.ax = true;
/* 281 */     return this;
/*     */   }
/*     */   
/*     */   protected ady a(String ☃) {
/* 285 */     this.ah = ☃;
/* 286 */     return this;
/*     */   }
/*     */   
/*     */   protected ady a(int ☃) {
/* 290 */     this.am = ☃;
/* 291 */     return this;
/*     */   }
/*     */   
/*     */   protected ady b(int ☃) {
/* 295 */     a(☃, false);
/* 296 */     return this;
/*     */   }
/*     */   
/*     */   protected ady c(int ☃) {
/* 300 */     this.aj = ☃;
/* 301 */     return this;
/*     */   }
/*     */   
/*     */   protected ady a(int ☃, boolean bool) {
/* 305 */     this.ai = ☃;
/* 306 */     if (bool) {
/* 307 */       this.aj = (☃ & 0xFEFEFE) >> 1;
/*     */     } else {
/* 309 */       this.aj = ☃;
/*     */     } 
/* 311 */     return this;
/*     */   }
/*     */   
/*     */   public int a(float ☃) {
/* 315 */     ☃ /= 3.0F;
/* 316 */     ☃ = ns.a(☃, -1.0F, 1.0F);
/* 317 */     return ns.c(0.62222224F - ☃ * 0.05F, 0.5F + ☃ * 0.1F, 1.0F);
/*     */   }
/*     */   
/*     */   public List<c> a(pt ☃) {
/* 321 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 323 */         return this.at;
/*     */       case 2:
/* 325 */         return this.au;
/*     */       case 3:
/* 327 */         return this.av;
/*     */       case 4:
/* 329 */         return this.aw;
/*     */     } 
/* 331 */     return Collections.emptyList();
/*     */   }
/*     */   
/*     */   public static class c extends oa.a {
/*     */     public Class<? extends ps> b;
/*     */     public int c;
/*     */     public int d;
/*     */     
/*     */     public c(Class<? extends ps> ☃, int i, int j, int k) {
/* 340 */       super(i);
/* 341 */       this.b = ☃;
/* 342 */       this.c = j;
/* 343 */       this.d = k;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 348 */       return this.b.getSimpleName() + "*(" + this.c + "-" + this.d + "):" + this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 353 */     return j();
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 357 */     if (j()) {
/* 358 */       return false;
/*     */     }
/* 360 */     return this.ay;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 364 */     return (this.aq > 0.85F);
/*     */   }
/*     */   
/*     */   public float g() {
/* 368 */     return 0.1F;
/*     */   }
/*     */   
/*     */   public final int h() {
/* 372 */     return (int)(this.aq * 65536.0F);
/*     */   }
/*     */   
/*     */   public final float i() {
/* 376 */     return this.aq;
/*     */   }
/*     */   
/*     */   public final float a(cj ☃) {
/* 380 */     if (☃.o() > 64) {
/* 381 */       float f = (float)(ae.a(☃.n() * 1.0D / 8.0D, ☃.p() * 1.0D / 8.0D) * 4.0D);
/* 382 */       return this.ap - (f + ☃.o() - 64.0F) * 0.05F / 30.0F;
/*     */     } 
/* 384 */     return this.ap;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, Random random, cj cj1) {
/* 388 */     this.as.a(☃, random, this, cj1);
/*     */   }
/*     */   
/*     */   public int b(cj ☃) {
/* 392 */     double d1 = ns.a(a(☃), 0.0F, 1.0F);
/* 393 */     double d2 = ns.a(i(), 0.0F, 1.0F);
/*     */     
/* 395 */     return adl.a(d1, d2);
/*     */   }
/*     */   
/*     */   public int c(cj ☃) {
/* 399 */     double d1 = ns.a(a(☃), 0.0F, 1.0F);
/* 400 */     double d2 = ns.a(i(), 0.0F, 1.0F);
/*     */     
/* 402 */     return adj.a(d1, d2);
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 406 */     return this.ax;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, Random random, ans ans1, int i, int j, double d) {
/* 410 */     b(☃, random, ans1, i, j, d);
/*     */   }
/*     */   
/*     */   public final void b(adm ☃, Random random, ans ans1, int i, int j, double d) {
/* 414 */     int k = ☃.F();
/* 415 */     alz alz1 = this.ak;
/* 416 */     alz alz2 = this.al;
/* 417 */     int m = -1;
/* 418 */     int n = (int)(d / 3.0D + 3.0D + random.nextDouble() * 0.25D);
/*     */     
/* 420 */     int i1 = i & 0xF;
/* 421 */     int i2 = j & 0xF;
/* 422 */     cj.a a1 = new cj.a();
/* 423 */     for (int i3 = 255; i3 >= 0; i3--) {
/* 424 */       if (i3 <= random.nextInt(5)) {
/* 425 */         ans1.a(i2, i3, i1, afi.h.Q());
/*     */       } else {
/* 427 */         alz alz3 = ans1.a(i2, i3, i1);
/*     */         
/* 429 */         if (alz3.c().t() == arm.a) {
/* 430 */           m = -1;
/* 431 */         } else if (alz3.c() == afi.b) {
/* 432 */           if (m == -1) {
/* 433 */             if (n <= 0) {
/* 434 */               alz1 = null;
/* 435 */               alz2 = afi.b.Q();
/* 436 */             } else if (i3 >= k - 4 && i3 <= k + 1) {
/* 437 */               alz1 = this.ak;
/* 438 */               alz2 = this.al;
/*     */             } 
/*     */             
/* 441 */             if (i3 < k && (alz1 == null || alz1.c().t() == arm.a)) {
/* 442 */               if (a(a1.c(i, i3, j)) < 0.15F) {
/* 443 */                 alz1 = afi.aI.Q();
/*     */               } else {
/* 445 */                 alz1 = afi.j.Q();
/*     */               } 
/*     */             }
/*     */             
/* 449 */             m = n;
/* 450 */             if (i3 >= k - 1) {
/* 451 */               ans1.a(i2, i3, i1, alz1);
/* 452 */             } else if (i3 < k - 7 - n) {
/* 453 */               alz1 = null;
/* 454 */               alz2 = afi.b.Q();
/* 455 */               ans1.a(i2, i3, i1, afi.n.Q());
/*     */             } else {
/* 457 */               ans1.a(i2, i3, i1, alz2);
/*     */             } 
/* 459 */           } else if (m > 0) {
/* 460 */             m--;
/* 461 */             ans1.a(i2, i3, i1, alz2);
/*     */ 
/*     */             
/* 464 */             if (m == 0 && alz2.c() == afi.m) {
/* 465 */               m = random.nextInt(4) + Math.max(0, i3 - 63);
/* 466 */               alz2 = (alz2.b(ajh.a) == ajh.a.b) ? afi.cM.Q() : afi.A.Q();
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected ady k() {
/* 475 */     return d(this.az + 128);
/*     */   }
/*     */   
/*     */   protected ady d(int ☃) {
/* 479 */     return new aem(☃, this);
/*     */   }
/*     */   
/*     */   public Class<? extends ady> l() {
/* 483 */     return (Class)getClass();
/*     */   }
/*     */   
/*     */   public boolean a(ady ☃) {
/* 487 */     if (☃ == this) {
/* 488 */       return true;
/*     */     }
/* 490 */     if (☃ == null) {
/* 491 */       return false;
/*     */     }
/* 493 */     return (l() == ☃.l());
/*     */   }
/*     */   
/*     */   public b m() {
/* 497 */     if (this.ap < 0.2D) {
/* 498 */       return b.b;
/*     */     }
/* 500 */     if (this.ap < 1.0D) {
/* 501 */       return b.c;
/*     */     }
/* 503 */     return b.d;
/*     */   }
/*     */   
/*     */   public static ady[] n() {
/* 507 */     return aE;
/*     */   }
/*     */   
/*     */   public static ady e(int ☃) {
/* 511 */     return a(☃, (ady)null);
/*     */   }
/*     */   
/*     */   public static ady a(int ☃, ady ady1) {
/* 515 */     if (☃ < 0 || ☃ > aE.length) {
/* 516 */       aD.warn("Biome ID is out of bounds: " + ☃ + ", defaulting to 0 (Ocean)");
/* 517 */       return p;
/*     */     } 
/* 519 */     ady ady2 = aE[☃];
/* 520 */     if (ady2 == null) {
/* 521 */       return ady1;
/*     */     }
/* 523 */     return ady2;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ady.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */