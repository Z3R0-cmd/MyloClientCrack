/*     */ import java.util.concurrent.Callable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ato
/*     */ {
/*  17 */   public static final oj a = oj.c;
/*     */   private long b;
/*  19 */   private adr c = adr.b;
/*  20 */   private String d = "";
/*     */   
/*     */   private int e;
/*     */   
/*     */   private int f;
/*     */   private int g;
/*     */   private long h;
/*     */   private long i;
/*     */   private long j;
/*     */   private long k;
/*     */   private dn l;
/*     */   private int m;
/*     */   private String n;
/*     */   private int o;
/*     */   private int p;
/*     */   private boolean q;
/*     */   private int r;
/*     */   private boolean s;
/*     */   private int t;
/*     */   private adp.a u;
/*     */   private boolean v;
/*     */   private boolean w;
/*     */   private boolean x;
/*     */   private boolean y;
/*     */   private oj z;
/*     */   private boolean A;
/*  46 */   private double B = 0.0D;
/*  47 */   private double C = 0.0D;
/*  48 */   private double D = 6.0E7D;
/*  49 */   private long E = 0L;
/*  50 */   private double F = 0.0D;
/*  51 */   private double G = 5.0D;
/*  52 */   private double H = 0.2D;
/*  53 */   private int I = 5;
/*  54 */   private int J = 15;
/*     */   
/*  56 */   private adk K = new adk();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ato(dn ☃) {
/*  62 */     this.b = ☃.g("RandomSeed");
/*  63 */     if (☃.b("generatorName", 8)) {
/*  64 */       String str = ☃.j("generatorName");
/*  65 */       this.c = adr.a(str);
/*  66 */       if (this.c == null) {
/*  67 */         this.c = adr.b;
/*  68 */       } else if (this.c.f()) {
/*  69 */         int i = 0;
/*  70 */         if (☃.b("generatorVersion", 99)) {
/*  71 */           i = ☃.f("generatorVersion");
/*     */         }
/*  73 */         this.c = this.c.a(i);
/*     */       } 
/*     */       
/*  76 */       if (☃.b("generatorOptions", 8)) {
/*  77 */         this.d = ☃.j("generatorOptions");
/*     */       }
/*     */     } 
/*  80 */     this.u = adp.a.a(☃.f("GameType"));
/*  81 */     if (☃.b("MapFeatures", 99)) {
/*  82 */       this.v = ☃.n("MapFeatures");
/*     */     } else {
/*  84 */       this.v = true;
/*     */     } 
/*  86 */     this.e = ☃.f("SpawnX");
/*  87 */     this.f = ☃.f("SpawnY");
/*  88 */     this.g = ☃.f("SpawnZ");
/*  89 */     this.h = ☃.g("Time");
/*  90 */     if (☃.b("DayTime", 99)) {
/*  91 */       this.i = ☃.g("DayTime");
/*     */     } else {
/*  93 */       this.i = this.h;
/*     */     } 
/*  95 */     this.j = ☃.g("LastPlayed");
/*  96 */     this.k = ☃.g("SizeOnDisk");
/*  97 */     this.n = ☃.j("LevelName");
/*  98 */     this.o = ☃.f("version");
/*  99 */     this.p = ☃.f("clearWeatherTime");
/* 100 */     this.r = ☃.f("rainTime");
/* 101 */     this.q = ☃.n("raining");
/* 102 */     this.t = ☃.f("thunderTime");
/* 103 */     this.s = ☃.n("thundering");
/* 104 */     this.w = ☃.n("hardcore");
/*     */     
/* 106 */     if (☃.b("initialized", 99)) {
/* 107 */       this.y = ☃.n("initialized");
/*     */     } else {
/* 109 */       this.y = true;
/*     */     } 
/*     */     
/* 112 */     if (☃.b("allowCommands", 99)) {
/* 113 */       this.x = ☃.n("allowCommands");
/*     */     } else {
/* 115 */       this.x = (this.u == adp.a.c);
/*     */     } 
/*     */     
/* 118 */     if (☃.b("Player", 10)) {
/* 119 */       this.l = ☃.m("Player");
/* 120 */       this.m = this.l.f("Dimension");
/*     */     } 
/*     */     
/* 123 */     if (☃.b("GameRules", 10)) {
/* 124 */       this.K.a(☃.m("GameRules"));
/*     */     }
/*     */     
/* 127 */     if (☃.b("Difficulty", 99)) {
/* 128 */       this.z = oj.a(☃.d("Difficulty"));
/*     */     }
/*     */     
/* 131 */     if (☃.b("DifficultyLocked", 1)) {
/* 132 */       this.A = ☃.n("DifficultyLocked");
/*     */     }
/*     */     
/* 135 */     if (☃.b("BorderCenterX", 99)) {
/* 136 */       this.B = ☃.i("BorderCenterX");
/*     */     }
/*     */     
/* 139 */     if (☃.b("BorderCenterZ", 99)) {
/* 140 */       this.C = ☃.i("BorderCenterZ");
/*     */     }
/*     */     
/* 143 */     if (☃.b("BorderSize", 99)) {
/* 144 */       this.D = ☃.i("BorderSize");
/*     */     }
/*     */     
/* 147 */     if (☃.b("BorderSizeLerpTime", 99)) {
/* 148 */       this.E = ☃.g("BorderSizeLerpTime");
/*     */     }
/*     */     
/* 151 */     if (☃.b("BorderSizeLerpTarget", 99)) {
/* 152 */       this.F = ☃.i("BorderSizeLerpTarget");
/*     */     }
/*     */     
/* 155 */     if (☃.b("BorderSafeZone", 99)) {
/* 156 */       this.G = ☃.i("BorderSafeZone");
/*     */     }
/*     */     
/* 159 */     if (☃.b("BorderDamagePerBlock", 99)) {
/* 160 */       this.H = ☃.i("BorderDamagePerBlock");
/*     */     }
/*     */     
/* 163 */     if (☃.b("BorderWarningBlocks", 99)) {
/* 164 */       this.I = ☃.f("BorderWarningBlocks");
/*     */     }
/*     */     
/* 167 */     if (☃.b("BorderWarningTime", 99)) {
/* 168 */       this.J = ☃.f("BorderWarningTime");
/*     */     }
/*     */   }
/*     */   
/*     */   public ato(adp ☃, String str) {
/* 173 */     a(☃);
/* 174 */     this.n = str;
/* 175 */     this.z = a;
/* 176 */     this.y = false;
/*     */   }
/*     */   
/*     */   public void a(adp ☃) {
/* 180 */     this.b = ☃.d();
/* 181 */     this.u = ☃.e();
/* 182 */     this.v = ☃.g();
/* 183 */     this.w = ☃.f();
/* 184 */     this.c = ☃.h();
/* 185 */     this.d = ☃.j();
/* 186 */     this.x = ☃.i();
/*     */   }
/*     */   
/*     */   public ato(ato ☃) {
/* 190 */     this.b = ☃.b;
/* 191 */     this.c = ☃.c;
/* 192 */     this.d = ☃.d;
/* 193 */     this.u = ☃.u;
/* 194 */     this.v = ☃.v;
/* 195 */     this.e = ☃.e;
/* 196 */     this.f = ☃.f;
/* 197 */     this.g = ☃.g;
/* 198 */     this.h = ☃.h;
/* 199 */     this.i = ☃.i;
/* 200 */     this.j = ☃.j;
/* 201 */     this.k = ☃.k;
/* 202 */     this.l = ☃.l;
/* 203 */     this.m = ☃.m;
/* 204 */     this.n = ☃.n;
/* 205 */     this.o = ☃.o;
/* 206 */     this.r = ☃.r;
/* 207 */     this.q = ☃.q;
/* 208 */     this.t = ☃.t;
/* 209 */     this.s = ☃.s;
/* 210 */     this.w = ☃.w;
/* 211 */     this.x = ☃.x;
/* 212 */     this.y = ☃.y;
/* 213 */     this.K = ☃.K;
/* 214 */     this.z = ☃.z;
/* 215 */     this.A = ☃.A;
/* 216 */     this.B = ☃.B;
/* 217 */     this.C = ☃.C;
/* 218 */     this.D = ☃.D;
/* 219 */     this.E = ☃.E;
/* 220 */     this.F = ☃.F;
/* 221 */     this.G = ☃.G;
/* 222 */     this.H = ☃.H;
/* 223 */     this.J = ☃.J;
/* 224 */     this.I = ☃.I;
/*     */   }
/*     */   
/*     */   public dn a() {
/* 228 */     dn ☃ = new dn();
/*     */     
/* 230 */     a(☃, this.l);
/*     */     
/* 232 */     return ☃;
/*     */   }
/*     */   
/*     */   public dn a(dn ☃) {
/* 236 */     dn dn1 = new dn();
/* 237 */     a(dn1, ☃);
/*     */     
/* 239 */     return dn1;
/*     */   }
/*     */   
/*     */   private void a(dn ☃, dn dn1) {
/* 243 */     ☃.a("RandomSeed", this.b);
/* 244 */     ☃.a("generatorName", this.c.a());
/* 245 */     ☃.a("generatorVersion", this.c.d());
/* 246 */     ☃.a("generatorOptions", this.d);
/* 247 */     ☃.a("GameType", this.u.a());
/* 248 */     ☃.a("MapFeatures", this.v);
/* 249 */     ☃.a("SpawnX", this.e);
/* 250 */     ☃.a("SpawnY", this.f);
/* 251 */     ☃.a("SpawnZ", this.g);
/* 252 */     ☃.a("Time", this.h);
/* 253 */     ☃.a("DayTime", this.i);
/* 254 */     ☃.a("SizeOnDisk", this.k);
/* 255 */     ☃.a("LastPlayed", MinecraftServer.az());
/* 256 */     ☃.a("LevelName", this.n);
/* 257 */     ☃.a("version", this.o);
/* 258 */     ☃.a("clearWeatherTime", this.p);
/* 259 */     ☃.a("rainTime", this.r);
/* 260 */     ☃.a("raining", this.q);
/* 261 */     ☃.a("thunderTime", this.t);
/* 262 */     ☃.a("thundering", this.s);
/* 263 */     ☃.a("hardcore", this.w);
/* 264 */     ☃.a("allowCommands", this.x);
/* 265 */     ☃.a("initialized", this.y);
/* 266 */     ☃.a("BorderCenterX", this.B);
/* 267 */     ☃.a("BorderCenterZ", this.C);
/* 268 */     ☃.a("BorderSize", this.D);
/* 269 */     ☃.a("BorderSizeLerpTime", this.E);
/* 270 */     ☃.a("BorderSafeZone", this.G);
/* 271 */     ☃.a("BorderDamagePerBlock", this.H);
/* 272 */     ☃.a("BorderSizeLerpTarget", this.F);
/* 273 */     ☃.a("BorderWarningBlocks", this.I);
/* 274 */     ☃.a("BorderWarningTime", this.J);
/* 275 */     if (this.z != null) {
/* 276 */       ☃.a("Difficulty", (byte)this.z.a());
/*     */     }
/* 278 */     ☃.a("DifficultyLocked", this.A);
/* 279 */     ☃.a("GameRules", this.K.a());
/*     */     
/* 281 */     if (dn1 != null) {
/* 282 */       ☃.a("Player", dn1);
/*     */     }
/*     */   }
/*     */   
/*     */   public long b() {
/* 287 */     return this.b;
/*     */   }
/*     */   
/*     */   public int c() {
/* 291 */     return this.e;
/*     */   }
/*     */   
/*     */   public int d() {
/* 295 */     return this.f;
/*     */   }
/*     */   
/*     */   public int e() {
/* 299 */     return this.g;
/*     */   }
/*     */   
/*     */   public long f() {
/* 303 */     return this.h;
/*     */   }
/*     */   
/*     */   public long g() {
/* 307 */     return this.i;
/*     */   }
/*     */   
/*     */   public long h() {
/* 311 */     return this.k;
/*     */   }
/*     */   
/*     */   public dn i() {
/* 315 */     return this.l;
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
/*     */   public void a(int ☃) {
/* 327 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 331 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 335 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public void b(long ☃) {
/* 339 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public void c(long ☃) {
/* 343 */     this.i = ☃;
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
/*     */   public void a(cj ☃) {
/* 359 */     this.e = ☃.n();
/* 360 */     this.f = ☃.o();
/* 361 */     this.g = ☃.p();
/*     */   }
/*     */   
/*     */   public String k() {
/* 365 */     return this.n;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 369 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public int l() {
/* 373 */     return this.o;
/*     */   }
/*     */   
/*     */   public void e(int ☃) {
/* 377 */     this.o = ☃;
/*     */   }
/*     */   
/*     */   public long m() {
/* 381 */     return this.j;
/*     */   }
/*     */   
/*     */   public int A() {
/* 385 */     return this.p;
/*     */   }
/*     */   
/*     */   public void i(int ☃) {
/* 389 */     this.p = ☃;
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 393 */     return this.s;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 397 */     this.s = ☃;
/*     */   }
/*     */   
/*     */   public int o() {
/* 401 */     return this.t;
/*     */   }
/*     */   
/*     */   public void f(int ☃) {
/* 405 */     this.t = ☃;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 409 */     return this.q;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 413 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   public int q() {
/* 417 */     return this.r;
/*     */   }
/*     */   
/*     */   public void g(int ☃) {
/* 421 */     this.r = ☃;
/*     */   }
/*     */   
/*     */   public adp.a r() {
/* 425 */     return this.u;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 429 */     return this.v;
/*     */   }
/*     */   
/*     */   public void f(boolean ☃) {
/* 433 */     this.v = ☃;
/*     */   }
/*     */   
/*     */   public void a(adp.a ☃) {
/* 437 */     this.u = ☃;
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 441 */     return this.w;
/*     */   }
/*     */   
/*     */   public void g(boolean ☃) {
/* 445 */     this.w = ☃;
/*     */   }
/*     */   
/*     */   public adr u() {
/* 449 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(adr ☃) {
/* 453 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public String B() {
/* 457 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean v() {
/* 465 */     return this.x;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 469 */     this.x = ☃;
/*     */   }
/*     */   
/*     */   public boolean w() {
/* 473 */     return this.y;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 477 */     this.y = ☃;
/*     */   }
/*     */   
/*     */   public adk x() {
/* 481 */     return this.K;
/*     */   }
/*     */   
/*     */   public double C() {
/* 485 */     return this.B;
/*     */   }
/*     */   
/*     */   public double D() {
/* 489 */     return this.C;
/*     */   }
/*     */   
/*     */   public double E() {
/* 493 */     return this.D;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 497 */     this.D = ☃;
/*     */   }
/*     */   
/*     */   public long F() {
/* 501 */     return this.E;
/*     */   }
/*     */   
/*     */   public void e(long ☃) {
/* 505 */     this.E = ☃;
/*     */   }
/*     */   
/*     */   public double G() {
/* 509 */     return this.F;
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 513 */     this.F = ☃;
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 517 */     this.C = ☃;
/*     */   }
/*     */   
/*     */   public void d(double ☃) {
/* 521 */     this.B = ☃;
/*     */   }
/*     */   
/*     */   public double H() {
/* 525 */     return this.G;
/*     */   }
/*     */   
/*     */   public void e(double ☃) {
/* 529 */     this.G = ☃;
/*     */   }
/*     */   
/*     */   public double I() {
/* 533 */     return this.H;
/*     */   }
/*     */   
/*     */   public void f(double ☃) {
/* 537 */     this.H = ☃;
/*     */   }
/*     */   
/*     */   public int J() {
/* 541 */     return this.I;
/*     */   }
/*     */   
/*     */   public int K() {
/* 545 */     return this.J;
/*     */   }
/*     */   
/*     */   public void j(int ☃) {
/* 549 */     this.I = ☃;
/*     */   }
/*     */   
/*     */   public void k(int ☃) {
/* 553 */     this.J = ☃;
/*     */   }
/*     */   
/*     */   public oj y() {
/* 557 */     return this.z;
/*     */   }
/*     */   
/*     */   public void a(oj ☃) {
/* 561 */     this.z = ☃;
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 565 */     return this.A;
/*     */   }
/*     */   
/*     */   public void e(boolean ☃) {
/* 569 */     this.A = ☃;
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/* 573 */     ☃.a("Level seed", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 576 */             return String.valueOf(this.a.b());
/*     */           }
/*     */         });
/*     */     
/* 580 */     ☃.a("Level generator", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 583 */             return String.format("ID %02d - %s, ver %d. Features enabled: %b", new Object[] { Integer.valueOf(ato.a(this.a).g()), ato.a(this.a).a(), Integer.valueOf(ato.a(this.a).d()), Boolean.valueOf(ato.b(this.a)) });
/*     */           }
/*     */         });
/*     */     
/* 587 */     ☃.a("Level generator options", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 590 */             return ato.c(this.a);
/*     */           }
/*     */         });
/*     */     
/* 594 */     ☃.a("Level spawn location", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 597 */             return c.a(ato.d(this.a), ato.e(this.a), ato.f(this.a));
/*     */           }
/*     */         });
/*     */     
/* 601 */     ☃.a("Level time", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 604 */             return String.format("%d game time, %d day time", new Object[] { Long.valueOf(ato.g(this.a)), Long.valueOf(ato.h(this.a)) });
/*     */           }
/*     */         });
/*     */     
/* 608 */     ☃.a("Level dimension", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 611 */             return String.valueOf(ato.i(this.a));
/*     */           }
/*     */         });
/*     */     
/* 615 */     ☃.a("Level storage version", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 618 */             String ☃ = "Unknown?";
/*     */             
/*     */             try {
/* 621 */               switch (ato.j(this.a)) {
/*     */                 case 19133:
/* 623 */                   ☃ = "Anvil";
/*     */                   break;
/*     */                 case 19132:
/* 626 */                   ☃ = "McRegion";
/*     */                   break;
/*     */               } 
/* 629 */             } catch (Throwable throwable) {}
/*     */ 
/*     */             
/* 632 */             return String.format("0x%05X - %s", new Object[] { Integer.valueOf(ato.j(this.a)), ☃ });
/*     */           }
/*     */         });
/*     */     
/* 636 */     ☃.a("Level weather", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 639 */             return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[] { Integer.valueOf(ato.k(this.a)), Boolean.valueOf(ato.l(this.a)), Integer.valueOf(ato.m(this.a)), Boolean.valueOf(ato.n(this.a)) });
/*     */           }
/*     */         });
/*     */     
/* 643 */     ☃.a("Level game mode", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 646 */             return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[] { ato.o(this.a).b(), Integer.valueOf(ato.o(this.a).a()), Boolean.valueOf(ato.p(this.a)), Boolean.valueOf(ato.q(this.a)) });
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   protected ato() {}
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ato.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */