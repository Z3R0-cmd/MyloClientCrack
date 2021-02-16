/*      */ import com.google.common.collect.ImmutableSet;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.google.gson.Gson;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.File;
/*      */ import java.io.FileReader;
/*      */ import java.io.FileWriter;
/*      */ import java.io.PrintWriter;
/*      */ import java.lang.reflect.ParameterizedType;
/*      */ import java.lang.reflect.Type;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.lang3.ArrayUtils;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.Display;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class avh
/*      */ {
/*   35 */   private static final Logger aO = LogManager.getLogger();
/*   36 */   private static final Gson aP = new Gson();
/*   37 */   private static final ParameterizedType aQ = new ParameterizedType()
/*      */     {
/*      */       public Type[] getActualTypeArguments() {
/*   40 */         return new Type[] { String.class };
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public Type getRawType() {
/*   47 */         return List.class;
/*      */       }
/*      */ 
/*      */       
/*      */       public Type getOwnerType() {
/*   52 */         return null;
/*      */       }
/*      */     };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum a
/*      */   {
/*   88 */     a("options.invertMouse", false, true),
/*   89 */     b("options.sensitivity", true, false),
/*   90 */     c("options.fov", true, false, 30.0F, 110.0F, 1.0F),
/*   91 */     d("options.gamma", true, false),
/*   92 */     e("options.saturation", true, false),
/*   93 */     f("options.renderDistance", true, false, 2.0F, 16.0F, 1.0F),
/*   94 */     g("options.viewBobbing", false, true),
/*   95 */     h("options.anaglyph", false, true),
/*   96 */     i("options.framerateLimit", true, false, 10.0F, 260.0F, 10.0F),
/*   97 */     j("options.fboEnable", false, true),
/*   98 */     k("options.renderClouds", false, false),
/*   99 */     l("options.graphics", false, false),
/*  100 */     m("options.ao", false, false),
/*  101 */     n("options.guiScale", false, false),
/*  102 */     o("options.particles", false, false),
/*  103 */     p("options.chat.visibility", false, false),
/*  104 */     q("options.chat.color", false, true),
/*  105 */     r("options.chat.links", false, true),
/*  106 */     s("options.chat.opacity", true, false),
/*  107 */     t("options.chat.links.prompt", false, true),
/*  108 */     u("options.snooper", false, true),
/*  109 */     v("options.fullscreen", false, true),
/*  110 */     w("options.vsync", false, true),
/*  111 */     x("options.vbo", false, true),
/*  112 */     y("options.touchscreen", false, true),
/*  113 */     z("options.chat.scale", true, false),
/*  114 */     A("options.chat.width", true, false),
/*  115 */     B("options.chat.height.focused", true, false),
/*  116 */     C("options.chat.height.unfocused", true, false),
/*  117 */     D("options.mipmapLevels", true, false, 0.0F, 4.0F, 1.0F),
/*  118 */     E("options.forceUnicodeFont", false, true),
/*  119 */     F("options.stream.bytesPerPixel", true, false),
/*  120 */     G("options.stream.micVolumne", true, false),
/*  121 */     H("options.stream.systemVolume", true, false),
/*  122 */     I("options.stream.kbps", true, false),
/*  123 */     J("options.stream.fps", true, false),
/*  124 */     K("options.stream.compression", false, false),
/*  125 */     L("options.stream.sendMetadata", false, true),
/*  126 */     M("options.stream.chat.enabled", false, false),
/*  127 */     N("options.stream.chat.userFilter", false, false),
/*  128 */     O("options.stream.micToggleBehavior", false, false),
/*  129 */     P("options.blockAlternatives", false, true),
/*  130 */     Q("options.reducedDebugInfo", false, true),
/*  131 */     R("options.entityShadows", false, true);
/*      */     private final boolean S;
/*      */     private final boolean T;
/*      */     private final String U;
/*      */     private final float V;
/*      */     private float W;
/*      */     private float X;
/*      */     
/*      */     public static a a(int ☃) {
/*      */       a[] arrayOfA;
/*      */       int i;
/*      */       int j;
/*  143 */       for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/*  144 */         if (a1.c() == ☃)
/*  145 */           return a1; 
/*      */         j++; }
/*      */       
/*  148 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     a(String ☃, boolean bool1, boolean bool2, float f1, float f2, float f3) {
/*  156 */       this.U = ☃;
/*  157 */       this.S = bool1;
/*  158 */       this.T = bool2;
/*  159 */       this.W = f1;
/*  160 */       this.X = f2;
/*  161 */       this.V = f3;
/*      */     }
/*      */     
/*      */     public boolean a() {
/*  165 */       return this.S;
/*      */     }
/*      */     
/*      */     public boolean b() {
/*  169 */       return this.T;
/*      */     }
/*      */     
/*      */     public int c() {
/*  173 */       return ordinal();
/*      */     }
/*      */     
/*      */     public String d() {
/*  177 */       return this.U;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float f() {
/*  185 */       return this.X;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void a(float ☃) {
/*  193 */       this.X = ☃;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float c(float ☃) {
/*  201 */       return ns.a((e(☃) - this.W) / (this.X - this.W), 0.0F, 1.0F);
/*      */     }
/*      */     
/*      */     public float d(float ☃) {
/*  205 */       return e(this.W + (this.X - this.W) * ns.a(☃, 0.0F, 1.0F));
/*      */     }
/*      */     
/*      */     public float e(float ☃) {
/*  209 */       ☃ = f(☃);
/*  210 */       return ns.a(☃, this.W, this.X);
/*      */     }
/*      */     
/*      */     protected float f(float ☃) {
/*  214 */       if (this.V > 0.0F) {
/*  215 */         ☃ = this.V * Math.round(☃ / this.V);
/*      */       }
/*  217 */       return ☃;
/*      */     }
/*      */   }
/*      */   
/*  221 */   private static final String[] aR = new String[] { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
/*      */ 
/*      */   
/*  224 */   private static final String[] aS = new String[] { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
/*      */ 
/*      */   
/*  227 */   private static final String[] aT = new String[] { "options.ao.off", "options.ao.min", "options.ao.max" };
/*      */ 
/*      */   
/*  230 */   private static final String[] aU = new String[] { "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high" };
/*      */ 
/*      */   
/*  233 */   private static final String[] aV = new String[] { "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never" };
/*      */ 
/*      */   
/*  236 */   private static final String[] aW = new String[] { "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods" };
/*      */ 
/*      */   
/*  239 */   private static final String[] aX = new String[] { "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk" };
/*      */ 
/*      */   
/*  242 */   private static final String[] aY = new String[] { "options.off", "options.graphics.fast", "options.graphics.fancy" };
/*      */ 
/*      */ 
/*      */   
/*  246 */   public float a = 0.5F;
/*      */   public boolean b;
/*  248 */   public int c = -1;
/*      */   public boolean d = true;
/*      */   public boolean e;
/*      */   public boolean f = true;
/*  252 */   public int g = 120;
/*  253 */   public int h = 2;
/*      */   public boolean i = true;
/*  255 */   public int j = 2;
/*  256 */   public List<String> k = Lists.newArrayList();
/*  257 */   public List<String> l = Lists.newArrayList();
/*  258 */   public wn.b m = wn.b.a;
/*      */   public boolean n = true;
/*      */   public boolean o = true;
/*      */   public boolean p = true;
/*  262 */   public float q = 1.0F;
/*      */   public boolean r = true;
/*      */   public boolean s;
/*      */   public boolean t = true;
/*      */   public boolean u = false;
/*      */   public boolean v = true;
/*      */   public boolean w = false;
/*      */   public boolean x;
/*      */   public boolean y;
/*      */   public boolean z = true;
/*  272 */   private final Set<wo> aZ = Sets.newHashSet((Object[])wo.values());
/*      */   public boolean A;
/*      */   public int B;
/*      */   public int C;
/*      */   public boolean D = true;
/*  277 */   public float E = 1.0F;
/*  278 */   public float F = 1.0F;
/*  279 */   public float G = 0.44366196F;
/*  280 */   public float H = 1.0F;
/*      */   public boolean I = true;
/*  282 */   public int J = 4;
/*  283 */   private Map<bpg, Float> ba = Maps.newEnumMap(bpg.class);
/*  284 */   public float K = 0.5F;
/*  285 */   public float L = 1.0F;
/*  286 */   public float M = 1.0F;
/*  287 */   public float N = 0.5412844F;
/*  288 */   public float O = 0.31690142F;
/*  289 */   public int P = 1;
/*      */   public boolean Q = true;
/*  291 */   public String R = "";
/*  292 */   public int S = 0;
/*  293 */   public int T = 0;
/*  294 */   public int U = 0;
/*      */   
/*      */   public boolean V = true;
/*      */   public boolean W = true;
/*  298 */   public avb X = new avb("key.forward", 17, "key.categories.movement");
/*  299 */   public avb Y = new avb("key.left", 30, "key.categories.movement");
/*  300 */   public avb Z = new avb("key.back", 31, "key.categories.movement");
/*  301 */   public avb aa = new avb("key.right", 32, "key.categories.movement");
/*  302 */   public avb ab = new avb("key.jump", 57, "key.categories.movement");
/*  303 */   public avb ac = new avb("key.sneak", 42, "key.categories.movement");
/*  304 */   public avb ad = new avb("key.sprint", 29, "key.categories.movement");
/*      */   
/*  306 */   public avb ae = new avb("key.inventory", 18, "key.categories.inventory");
/*  307 */   public avb af = new avb("key.use", -99, "key.categories.gameplay");
/*  308 */   public avb ag = new avb("key.drop", 16, "key.categories.gameplay");
/*  309 */   public avb ah = new avb("key.attack", -100, "key.categories.gameplay");
/*  310 */   public avb ai = new avb("key.pickItem", -98, "key.categories.gameplay");
/*      */   
/*  312 */   public avb aj = new avb("key.chat", 20, "key.categories.multiplayer");
/*  313 */   public avb ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
/*  314 */   public avb al = new avb("key.command", 53, "key.categories.multiplayer");
/*      */   
/*  316 */   public avb am = new avb("key.screenshot", 60, "key.categories.misc");
/*  317 */   public avb an = new avb("key.togglePerspective", 63, "key.categories.misc");
/*  318 */   public avb ao = new avb("key.smoothCamera", 0, "key.categories.misc");
/*  319 */   public avb ap = new avb("key.fullscreen", 87, "key.categories.misc");
/*  320 */   public avb aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
/*      */   
/*  322 */   public avb ar = new avb("key.streamStartStop", 64, "key.categories.stream");
/*  323 */   public avb as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
/*  324 */   public avb at = new avb("key.streamCommercial", 0, "key.categories.stream");
/*  325 */   public avb au = new avb("key.streamToggleMic", 0, "key.categories.stream");
/*      */   
/*  327 */   public avb[] av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  339 */   public avb[] aw = (avb[])ArrayUtils.addAll((Object[])new avb[] { this.ah, this.af, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ag, this.ae, this.aj, this.ak, this.ai, this.al, this.am, this.an, this.ao, this.ar, this.as, this.at, this.au, this.ap, this.aq }, (Object[])this.av);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected ave ax;
/*      */ 
/*      */ 
/*      */   
/*      */   private File bb;
/*      */ 
/*      */ 
/*      */   
/*  352 */   public oj ay = oj.c;
/*      */   public boolean az;
/*      */   public int aA;
/*      */   public boolean aB;
/*      */   public boolean aC;
/*      */   public boolean aD;
/*  358 */   public String aE = "";
/*      */   
/*      */   public boolean aF;
/*      */   public boolean aG;
/*  362 */   public float aH = 70.0F;
/*      */   public float aI;
/*      */   public float aJ;
/*      */   public int aK;
/*      */   public int aL;
/*  367 */   public String aM = "en_US";
/*      */   public boolean aN = false;
/*      */   
/*      */   public avh(ave ☃, File file) {
/*  371 */     this.ax = ☃;
/*  372 */     this.bb = new File(file, "options.txt");
/*      */     
/*  374 */     if (☃.U() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
/*  375 */       a.f.a(32.0F);
/*      */     } else {
/*  377 */       a.f.a(16.0F);
/*      */     } 
/*  379 */     this.c = ☃.U() ? 12 : 8;
/*      */     
/*  381 */     a();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public avh() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String c(int ☃) {
/*  397 */     if (☃ < 0) {
/*  398 */       return bnq.a("key.mouseButton", new Object[] { Integer.valueOf(☃ + 101) });
/*      */     }
/*  400 */     if (☃ < 256) {
/*  401 */       return Keyboard.getKeyName(☃);
/*      */     }
/*  403 */     return String.format("%c", new Object[] { Character.valueOf((char)(☃ - 256)) }).toUpperCase();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean a(avb ☃) {
/*  413 */     if (☃.i() == 0) {
/*  414 */       return false;
/*      */     }
/*  416 */     if (☃.i() < 0) {
/*  417 */       return Mouse.isButtonDown(☃.i() + 100);
/*      */     }
/*  419 */     return Keyboard.isKeyDown(☃.i());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(avb ☃, int i) {
/*  424 */     ☃.b(i);
/*  425 */     b();
/*      */   }
/*      */   
/*      */   public void a(a ☃, float f) {
/*  429 */     if (☃ == a.b) {
/*  430 */       this.a = f;
/*      */     }
/*  432 */     if (☃ == a.c) {
/*  433 */       this.aH = f;
/*      */     }
/*  435 */     if (☃ == a.d) {
/*  436 */       this.aI = f;
/*      */     }
/*  438 */     if (☃ == a.i) {
/*  439 */       this.g = (int)f;
/*      */     }
/*  441 */     if (☃ == a.s) {
/*  442 */       this.q = f;
/*  443 */       this.ax.q.d().b();
/*      */     } 
/*  445 */     if (☃ == a.B) {
/*  446 */       this.H = f;
/*  447 */       this.ax.q.d().b();
/*      */     } 
/*  449 */     if (☃ == a.C) {
/*  450 */       this.G = f;
/*  451 */       this.ax.q.d().b();
/*      */     } 
/*  453 */     if (☃ == a.A) {
/*  454 */       this.F = f;
/*  455 */       this.ax.q.d().b();
/*      */     } 
/*  457 */     if (☃ == a.z) {
/*  458 */       this.E = f;
/*  459 */       this.ax.q.d().b();
/*      */     } 
/*  461 */     if (☃ == a.D) {
/*  462 */       int i = this.J;
/*  463 */       this.J = (int)f;
/*  464 */       if (i != f) {
/*  465 */         this.ax.T().a(this.J);
/*  466 */         this.ax.P().a(bmh.g);
/*  467 */         this.ax.T().a(false, (this.J > 0));
/*  468 */         this.ax.B();
/*      */       } 
/*      */     } 
/*  471 */     if (☃ == a.P) {
/*  472 */       this.v = !this.v;
/*  473 */       this.ax.g.a();
/*      */     } 
/*  475 */     if (☃ == a.f) {
/*  476 */       this.c = (int)f;
/*  477 */       this.ax.g.m();
/*      */     } 
/*  479 */     if (☃ == a.F) {
/*  480 */       this.K = f;
/*      */     }
/*  482 */     if (☃ == a.G) {
/*  483 */       this.L = f;
/*  484 */       this.ax.Y().p();
/*      */     } 
/*  486 */     if (☃ == a.H) {
/*  487 */       this.M = f;
/*  488 */       this.ax.Y().p();
/*      */     } 
/*  490 */     if (☃ == a.I) {
/*  491 */       this.N = f;
/*      */     }
/*  493 */     if (☃ == a.J) {
/*  494 */       this.O = f;
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(a ☃, int i) {
/*  499 */     if (☃ == a.a) {
/*  500 */       this.b = !this.b;
/*      */     }
/*  502 */     if (☃ == a.n) {
/*  503 */       this.aK = this.aK + i & 0x3;
/*      */     }
/*  505 */     if (☃ == a.o) {
/*  506 */       this.aL = (this.aL + i) % 3;
/*      */     }
/*  508 */     if (☃ == a.g) {
/*  509 */       this.d = !this.d;
/*      */     }
/*  511 */     if (☃ == a.k) {
/*  512 */       this.h = (this.h + i) % 3;
/*      */     }
/*  514 */     if (☃ == a.E) {
/*  515 */       this.aN = !this.aN;
/*  516 */       this.ax.k.a((this.ax.S().a() || this.aN));
/*      */     } 
/*  518 */     if (☃ == a.j) {
/*  519 */       this.f = !this.f;
/*      */     }
/*  521 */     if (☃ == a.h) {
/*  522 */       this.e = !this.e;
/*  523 */       this.ax.e();
/*      */     } 
/*  525 */     if (☃ == a.l) {
/*  526 */       this.i = !this.i;
/*  527 */       this.ax.g.a();
/*      */     } 
/*  529 */     if (☃ == a.m) {
/*  530 */       this.j = (this.j + i) % 3;
/*  531 */       this.ax.g.a();
/*      */     } 
/*  533 */     if (☃ == a.p) {
/*  534 */       this.m = wn.b.a((this.m.a() + i) % 3);
/*      */     }
/*  536 */     if (☃ == a.K) {
/*  537 */       this.P = (this.P + i) % 3;
/*      */     }
/*  539 */     if (☃ == a.L) {
/*  540 */       this.Q = !this.Q;
/*      */     }
/*  542 */     if (☃ == a.M) {
/*  543 */       this.S = (this.S + i) % 3;
/*      */     }
/*  545 */     if (☃ == a.N) {
/*  546 */       this.T = (this.T + i) % 3;
/*      */     }
/*  548 */     if (☃ == a.O) {
/*  549 */       this.U = (this.U + i) % 2;
/*      */     }
/*  551 */     if (☃ == a.q) {
/*  552 */       this.n = !this.n;
/*      */     }
/*  554 */     if (☃ == a.r) {
/*  555 */       this.o = !this.o;
/*      */     }
/*  557 */     if (☃ == a.t) {
/*  558 */       this.p = !this.p;
/*      */     }
/*  560 */     if (☃ == a.u) {
/*  561 */       this.r = !this.r;
/*      */     }
/*  563 */     if (☃ == a.y) {
/*  564 */       this.A = !this.A;
/*      */     }
/*  566 */     if (☃ == a.v) {
/*  567 */       this.s = !this.s;
/*  568 */       if (this.ax.K() != this.s) {
/*  569 */         this.ax.q();
/*      */       }
/*      */     } 
/*  572 */     if (☃ == a.w) {
/*  573 */       this.t = !this.t;
/*  574 */       Display.setVSyncEnabled(this.t);
/*      */     } 
/*  576 */     if (☃ == a.x) {
/*  577 */       this.u = !this.u;
/*  578 */       this.ax.g.a();
/*      */     } 
/*  580 */     if (☃ == a.P) {
/*  581 */       this.v = !this.v;
/*  582 */       this.ax.g.a();
/*      */     } 
/*  584 */     if (☃ == a.Q) {
/*  585 */       this.w = !this.w;
/*      */     }
/*  587 */     if (☃ == a.R) {
/*  588 */       this.W = !this.W;
/*      */     }
/*  590 */     b();
/*      */   }
/*      */   
/*      */   public float a(a ☃) {
/*  594 */     if (☃ == a.c) {
/*  595 */       return this.aH;
/*      */     }
/*  597 */     if (☃ == a.d) {
/*  598 */       return this.aI;
/*      */     }
/*  600 */     if (☃ == a.e) {
/*  601 */       return this.aJ;
/*      */     }
/*  603 */     if (☃ == a.b) {
/*  604 */       return this.a;
/*      */     }
/*  606 */     if (☃ == a.s) {
/*  607 */       return this.q;
/*      */     }
/*  609 */     if (☃ == a.B) {
/*  610 */       return this.H;
/*      */     }
/*  612 */     if (☃ == a.C) {
/*  613 */       return this.G;
/*      */     }
/*  615 */     if (☃ == a.z) {
/*  616 */       return this.E;
/*      */     }
/*  618 */     if (☃ == a.A) {
/*  619 */       return this.F;
/*      */     }
/*  621 */     if (☃ == a.i) {
/*  622 */       return this.g;
/*      */     }
/*  624 */     if (☃ == a.D) {
/*  625 */       return this.J;
/*      */     }
/*  627 */     if (☃ == a.f) {
/*  628 */       return this.c;
/*      */     }
/*  630 */     if (☃ == a.F) {
/*  631 */       return this.K;
/*      */     }
/*  633 */     if (☃ == a.G) {
/*  634 */       return this.L;
/*      */     }
/*  636 */     if (☃ == a.H) {
/*  637 */       return this.M;
/*      */     }
/*  639 */     if (☃ == a.I) {
/*  640 */       return this.N;
/*      */     }
/*  642 */     if (☃ == a.J) {
/*  643 */       return this.O;
/*      */     }
/*  645 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public boolean b(a ☃) {
/*  649 */     switch (null.a[☃.ordinal()]) {
/*      */       case 1:
/*  651 */         return this.b;
/*      */       case 2:
/*  653 */         return this.d;
/*      */       case 3:
/*  655 */         return this.e;
/*      */       case 4:
/*  657 */         return this.f;
/*      */       case 5:
/*  659 */         return this.n;
/*      */       case 6:
/*  661 */         return this.o;
/*      */       case 7:
/*  663 */         return this.p;
/*      */       case 8:
/*  665 */         return this.r;
/*      */       case 9:
/*  667 */         return this.s;
/*      */       case 10:
/*  669 */         return this.t;
/*      */       case 11:
/*  671 */         return this.u;
/*      */       case 12:
/*  673 */         return this.A;
/*      */       case 13:
/*  675 */         return this.Q;
/*      */       case 14:
/*  677 */         return this.aN;
/*      */       case 15:
/*  679 */         return this.v;
/*      */       case 16:
/*  681 */         return this.w;
/*      */       case 17:
/*  683 */         return this.W;
/*      */     } 
/*  685 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static String a(String[] ☃, int i) {
/*  698 */     if (i < 0 || i >= ☃.length) {
/*  699 */       i = 0;
/*      */     }
/*      */     
/*  702 */     return bnq.a(☃[i], new Object[0]);
/*      */   }
/*      */   
/*      */   public String c(a ☃) {
/*  706 */     String str = bnq.a(☃.d(), new Object[0]) + ": ";
/*      */     
/*  708 */     if (☃.a()) {
/*  709 */       float f1 = a(☃);
/*  710 */       float f2 = ☃.c(f1);
/*      */       
/*  712 */       if (☃ == a.b) {
/*  713 */         if (f2 == 0.0F) {
/*  714 */           return str + bnq.a("options.sensitivity.min", new Object[0]);
/*      */         }
/*  716 */         if (f2 == 1.0F) {
/*  717 */           return str + bnq.a("options.sensitivity.max", new Object[0]);
/*      */         }
/*  719 */         return str + (int)(f2 * 200.0F) + "%";
/*  720 */       }  if (☃ == a.c) {
/*  721 */         if (f1 == 70.0F) {
/*  722 */           return str + bnq.a("options.fov.min", new Object[0]);
/*      */         }
/*  724 */         if (f1 == 110.0F) {
/*  725 */           return str + bnq.a("options.fov.max", new Object[0]);
/*      */         }
/*  727 */         return str + (int)f1;
/*  728 */       }  if (☃ == a.i) {
/*  729 */         if (f1 == a.a(☃)) {
/*  730 */           return str + bnq.a("options.framerateLimit.max", new Object[0]);
/*      */         }
/*  732 */         return str + (int)f1 + " fps";
/*      */       } 
/*  734 */       if (☃ == a.k) {
/*  735 */         if (f1 == a.b(☃)) {
/*  736 */           return str + bnq.a("options.cloudHeight.min", new Object[0]);
/*      */         }
/*  738 */         return str + ((int)f1 + 128);
/*      */       } 
/*  740 */       if (☃ == a.d) {
/*  741 */         if (f2 == 0.0F) {
/*  742 */           return str + bnq.a("options.gamma.min", new Object[0]);
/*      */         }
/*  744 */         if (f2 == 1.0F) {
/*  745 */           return str + bnq.a("options.gamma.max", new Object[0]);
/*      */         }
/*  747 */         return str + "+" + (int)(f2 * 100.0F) + "%";
/*  748 */       }  if (☃ == a.e)
/*  749 */         return str + (int)(f2 * 400.0F) + "%"; 
/*  750 */       if (☃ == a.s)
/*  751 */         return str + (int)(f2 * 90.0F + 10.0F) + "%"; 
/*  752 */       if (☃ == a.C)
/*  753 */         return str + avt.b(f2) + "px"; 
/*  754 */       if (☃ == a.B)
/*  755 */         return str + avt.b(f2) + "px"; 
/*  756 */       if (☃ == a.A)
/*  757 */         return str + avt.a(f2) + "px"; 
/*  758 */       if (☃ == a.f)
/*  759 */         return str + (int)f1 + " chunks"; 
/*  760 */       if (☃ == a.D) {
/*  761 */         if (f1 == 0.0F) {
/*  762 */           return str + bnq.a("options.off", new Object[0]);
/*      */         }
/*  764 */         return str + (int)f1;
/*  765 */       }  if (☃ == a.J)
/*  766 */         return str + bqn.a(f2) + " fps"; 
/*  767 */       if (☃ == a.I)
/*  768 */         return str + bqn.b(f2) + " Kbps"; 
/*  769 */       if (☃ == a.F) {
/*  770 */         return str + String.format("%.3f bpp", new Object[] { Float.valueOf(bqn.c(f2)) });
/*      */       }
/*  772 */       if (f2 == 0.0F) {
/*  773 */         return str + bnq.a("options.off", new Object[0]);
/*      */       }
/*  775 */       return str + (int)(f2 * 100.0F) + "%";
/*      */     } 
/*  777 */     if (☃.b()) {
/*  778 */       boolean bool = b(☃);
/*  779 */       if (bool) {
/*  780 */         return str + bnq.a("options.on", new Object[0]);
/*      */       }
/*  782 */       return str + bnq.a("options.off", new Object[0]);
/*  783 */     }  if (☃ == a.n)
/*  784 */       return str + a(aR, this.aK); 
/*  785 */     if (☃ == a.p)
/*  786 */       return str + bnq.a(this.m.b(), new Object[0]); 
/*  787 */     if (☃ == a.o)
/*  788 */       return str + a(aS, this.aL); 
/*  789 */     if (☃ == a.m)
/*  790 */       return str + a(aT, this.j); 
/*  791 */     if (☃ == a.K)
/*  792 */       return str + a(aU, this.P); 
/*  793 */     if (☃ == a.M)
/*  794 */       return str + a(aV, this.S); 
/*  795 */     if (☃ == a.N)
/*  796 */       return str + a(aW, this.T); 
/*  797 */     if (☃ == a.O)
/*  798 */       return str + a(aX, this.U); 
/*  799 */     if (☃ == a.k)
/*  800 */       return str + a(aY, this.h); 
/*  801 */     if (☃ == a.l) {
/*  802 */       if (this.i) {
/*  803 */         return str + bnq.a("options.graphics.fancy", new Object[0]);
/*      */       }
/*  805 */       String str1 = "options.graphics.fast";
/*  806 */       return str + bnq.a("options.graphics.fast", new Object[0]);
/*      */     } 
/*      */     
/*  809 */     return str;
/*      */   }
/*      */   
/*      */   public void a() {
/*      */     try {
/*  814 */       if (!this.bb.exists()) {
/*      */         return;
/*      */       }
/*  817 */       BufferedReader ☃ = new BufferedReader(new FileReader(this.bb));
/*  818 */       String str = "";
/*  819 */       this.ba.clear();
/*  820 */       while ((str = ☃.readLine()) != null) {
/*      */         try {
/*  822 */           String[] arrayOfString = str.split(":");
/*  823 */           if (arrayOfString[0].equals("mouseSensitivity")) {
/*  824 */             this.a = a(arrayOfString[1]);
/*      */           }
/*  826 */           if (arrayOfString[0].equals("fov")) {
/*  827 */             this.aH = a(arrayOfString[1]) * 40.0F + 70.0F;
/*      */           }
/*  829 */           if (arrayOfString[0].equals("gamma")) {
/*  830 */             this.aI = a(arrayOfString[1]);
/*      */           }
/*  832 */           if (arrayOfString[0].equals("saturation")) {
/*  833 */             this.aJ = a(arrayOfString[1]);
/*      */           }
/*  835 */           if (arrayOfString[0].equals("invertYMouse")) {
/*  836 */             this.b = arrayOfString[1].equals("true");
/*      */           }
/*  838 */           if (arrayOfString[0].equals("renderDistance")) {
/*  839 */             this.c = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  841 */           if (arrayOfString[0].equals("guiScale")) {
/*  842 */             this.aK = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  844 */           if (arrayOfString[0].equals("particles")) {
/*  845 */             this.aL = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  847 */           if (arrayOfString[0].equals("bobView")) {
/*  848 */             this.d = arrayOfString[1].equals("true");
/*      */           }
/*  850 */           if (arrayOfString[0].equals("anaglyph3d")) {
/*  851 */             this.e = arrayOfString[1].equals("true");
/*      */           }
/*  853 */           if (arrayOfString[0].equals("maxFps")) {
/*  854 */             this.g = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  856 */           if (arrayOfString[0].equals("fboEnable")) {
/*  857 */             this.f = arrayOfString[1].equals("true");
/*      */           }
/*  859 */           if (arrayOfString[0].equals("difficulty")) {
/*  860 */             this.ay = oj.a(Integer.parseInt(arrayOfString[1]));
/*      */           }
/*  862 */           if (arrayOfString[0].equals("fancyGraphics")) {
/*  863 */             this.i = arrayOfString[1].equals("true");
/*      */           }
/*  865 */           if (arrayOfString[0].equals("ao")) {
/*  866 */             if (arrayOfString[1].equals("true")) {
/*  867 */               this.j = 2;
/*  868 */             } else if (arrayOfString[1].equals("false")) {
/*  869 */               this.j = 0;
/*      */             } else {
/*  871 */               this.j = Integer.parseInt(arrayOfString[1]);
/*      */             } 
/*      */           }
/*  874 */           if (arrayOfString[0].equals("renderClouds")) {
/*  875 */             if (arrayOfString[1].equals("true")) {
/*  876 */               this.h = 2;
/*  877 */             } else if (arrayOfString[1].equals("false")) {
/*  878 */               this.h = 0;
/*  879 */             } else if (arrayOfString[1].equals("fast")) {
/*  880 */               this.h = 1;
/*      */             } 
/*      */           }
/*  883 */           if (arrayOfString[0].equals("resourcePacks")) {
/*  884 */             this.k = (List<String>)aP.fromJson(str.substring(str.indexOf(':') + 1), aQ);
/*  885 */             if (this.k == null) {
/*  886 */               this.k = Lists.newArrayList();
/*      */             }
/*      */           } 
/*  889 */           if (arrayOfString[0].equals("incompatibleResourcePacks")) {
/*  890 */             this.l = (List<String>)aP.fromJson(str.substring(str.indexOf(':') + 1), aQ);
/*  891 */             if (this.l == null) {
/*  892 */               this.l = Lists.newArrayList();
/*      */             }
/*      */           } 
/*  895 */           if (arrayOfString[0].equals("lastServer") && arrayOfString.length >= 2) {
/*  896 */             this.aE = str.substring(str.indexOf(':') + 1);
/*      */           }
/*  898 */           if (arrayOfString[0].equals("lang") && arrayOfString.length >= 2) {
/*  899 */             this.aM = arrayOfString[1];
/*      */           }
/*  901 */           if (arrayOfString[0].equals("chatVisibility")) {
/*  902 */             this.m = wn.b.a(Integer.parseInt(arrayOfString[1]));
/*      */           }
/*  904 */           if (arrayOfString[0].equals("chatColors")) {
/*  905 */             this.n = arrayOfString[1].equals("true");
/*      */           }
/*  907 */           if (arrayOfString[0].equals("chatLinks")) {
/*  908 */             this.o = arrayOfString[1].equals("true");
/*      */           }
/*  910 */           if (arrayOfString[0].equals("chatLinksPrompt")) {
/*  911 */             this.p = arrayOfString[1].equals("true");
/*      */           }
/*  913 */           if (arrayOfString[0].equals("chatOpacity")) {
/*  914 */             this.q = a(arrayOfString[1]);
/*      */           }
/*  916 */           if (arrayOfString[0].equals("snooperEnabled")) {
/*  917 */             this.r = arrayOfString[1].equals("true");
/*      */           }
/*  919 */           if (arrayOfString[0].equals("fullscreen")) {
/*  920 */             this.s = arrayOfString[1].equals("true");
/*      */           }
/*  922 */           if (arrayOfString[0].equals("enableVsync")) {
/*  923 */             this.t = arrayOfString[1].equals("true");
/*      */           }
/*  925 */           if (arrayOfString[0].equals("useVbo")) {
/*  926 */             this.u = arrayOfString[1].equals("true");
/*      */           }
/*  928 */           if (arrayOfString[0].equals("hideServerAddress")) {
/*  929 */             this.x = arrayOfString[1].equals("true");
/*      */           }
/*  931 */           if (arrayOfString[0].equals("advancedItemTooltips")) {
/*  932 */             this.y = arrayOfString[1].equals("true");
/*      */           }
/*  934 */           if (arrayOfString[0].equals("pauseOnLostFocus")) {
/*  935 */             this.z = arrayOfString[1].equals("true");
/*      */           }
/*  937 */           if (arrayOfString[0].equals("touchscreen")) {
/*  938 */             this.A = arrayOfString[1].equals("true");
/*      */           }
/*  940 */           if (arrayOfString[0].equals("overrideHeight")) {
/*  941 */             this.C = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  943 */           if (arrayOfString[0].equals("overrideWidth")) {
/*  944 */             this.B = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  946 */           if (arrayOfString[0].equals("heldItemTooltips")) {
/*  947 */             this.D = arrayOfString[1].equals("true");
/*      */           }
/*  949 */           if (arrayOfString[0].equals("chatHeightFocused")) {
/*  950 */             this.H = a(arrayOfString[1]);
/*      */           }
/*  952 */           if (arrayOfString[0].equals("chatHeightUnfocused")) {
/*  953 */             this.G = a(arrayOfString[1]);
/*      */           }
/*  955 */           if (arrayOfString[0].equals("chatScale")) {
/*  956 */             this.E = a(arrayOfString[1]);
/*      */           }
/*  958 */           if (arrayOfString[0].equals("chatWidth")) {
/*  959 */             this.F = a(arrayOfString[1]);
/*      */           }
/*  961 */           if (arrayOfString[0].equals("showInventoryAchievementHint")) {
/*  962 */             this.I = arrayOfString[1].equals("true");
/*      */           }
/*  964 */           if (arrayOfString[0].equals("mipmapLevels")) {
/*  965 */             this.J = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  967 */           if (arrayOfString[0].equals("streamBytesPerPixel")) {
/*  968 */             this.K = a(arrayOfString[1]);
/*      */           }
/*  970 */           if (arrayOfString[0].equals("streamMicVolume")) {
/*  971 */             this.L = a(arrayOfString[1]);
/*      */           }
/*  973 */           if (arrayOfString[0].equals("streamSystemVolume")) {
/*  974 */             this.M = a(arrayOfString[1]);
/*      */           }
/*  976 */           if (arrayOfString[0].equals("streamKbps")) {
/*  977 */             this.N = a(arrayOfString[1]);
/*      */           }
/*  979 */           if (arrayOfString[0].equals("streamFps")) {
/*  980 */             this.O = a(arrayOfString[1]);
/*      */           }
/*  982 */           if (arrayOfString[0].equals("streamCompression")) {
/*  983 */             this.P = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  985 */           if (arrayOfString[0].equals("streamSendMetadata")) {
/*  986 */             this.Q = arrayOfString[1].equals("true");
/*      */           }
/*  988 */           if (arrayOfString[0].equals("streamPreferredServer") && arrayOfString.length >= 2) {
/*  989 */             this.R = str.substring(str.indexOf(':') + 1);
/*      */           }
/*  991 */           if (arrayOfString[0].equals("streamChatEnabled")) {
/*  992 */             this.S = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  994 */           if (arrayOfString[0].equals("streamChatUserFilter")) {
/*  995 */             this.T = Integer.parseInt(arrayOfString[1]);
/*      */           }
/*  997 */           if (arrayOfString[0].equals("streamMicToggleBehavior")) {
/*  998 */             this.U = Integer.parseInt(arrayOfString[1]);
/*      */           }
/* 1000 */           if (arrayOfString[0].equals("forceUnicodeFont")) {
/* 1001 */             this.aN = arrayOfString[1].equals("true");
/*      */           }
/* 1003 */           if (arrayOfString[0].equals("allowBlockAlternatives")) {
/* 1004 */             this.v = arrayOfString[1].equals("true");
/*      */           }
/* 1006 */           if (arrayOfString[0].equals("reducedDebugInfo")) {
/* 1007 */             this.w = arrayOfString[1].equals("true");
/*      */           }
/* 1009 */           if (arrayOfString[0].equals("useNativeTransport")) {
/* 1010 */             this.V = arrayOfString[1].equals("true");
/*      */           }
/* 1012 */           if (arrayOfString[0].equals("entityShadows")) {
/* 1013 */             this.W = arrayOfString[1].equals("true");
/*      */           }
/*      */           int i, j;
/* 1016 */           for (avb[] arrayOfAvb = this.aw; j < i; ) { avb avb1 = arrayOfAvb[j];
/* 1017 */             if (arrayOfString[0].equals("key_" + avb1.g())) {
/* 1018 */               avb1.b(Integer.parseInt(arrayOfString[1]));
/*      */             }
/*      */             j++; }
/*      */           
/* 1022 */           for (bpg[] arrayOfBpg = bpg.values(); j < i; ) { bpg bpg = arrayOfBpg[j];
/* 1023 */             if (arrayOfString[0].equals("soundCategory_" + bpg.a())) {
/* 1024 */               this.ba.put(bpg, Float.valueOf(a(arrayOfString[1])));
/*      */             }
/*      */             j++; }
/*      */           
/* 1028 */           for (wo[] arrayOfWo = wo.values(); j < i; ) { wo wo = arrayOfWo[j];
/* 1029 */             if (arrayOfString[0].equals("modelPart_" + wo.c()))
/* 1030 */               a(wo, arrayOfString[1].equals("true")); 
/*      */             j++; }
/*      */         
/* 1033 */         } catch (Exception exception) {
/* 1034 */           aO.warn("Skipping bad option: " + str);
/*      */         } 
/*      */       } 
/* 1037 */       avb.b();
/* 1038 */       ☃.close();
/* 1039 */     } catch (Exception ☃) {
/* 1040 */       aO.error("Failed to load options", ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   private float a(String ☃) {
/* 1045 */     if (☃.equals("true")) {
/* 1046 */       return 1.0F;
/*      */     }
/* 1048 */     if (☃.equals("false")) {
/* 1049 */       return 0.0F;
/*      */     }
/* 1051 */     return Float.parseFloat(☃);
/*      */   }
/*      */   
/*      */   public void b() {
/*      */     try {
/* 1056 */       PrintWriter ☃ = new PrintWriter(new FileWriter(this.bb));
/*      */       
/* 1058 */       ☃.println("invertYMouse:" + this.b);
/* 1059 */       ☃.println("mouseSensitivity:" + this.a);
/* 1060 */       ☃.println("fov:" + ((this.aH - 70.0F) / 40.0F));
/* 1061 */       ☃.println("gamma:" + this.aI);
/* 1062 */       ☃.println("saturation:" + this.aJ);
/* 1063 */       ☃.println("renderDistance:" + this.c);
/* 1064 */       ☃.println("guiScale:" + this.aK);
/* 1065 */       ☃.println("particles:" + this.aL);
/* 1066 */       ☃.println("bobView:" + this.d);
/* 1067 */       ☃.println("anaglyph3d:" + this.e);
/* 1068 */       ☃.println("maxFps:" + this.g);
/* 1069 */       ☃.println("fboEnable:" + this.f);
/* 1070 */       ☃.println("difficulty:" + this.ay.a());
/* 1071 */       ☃.println("fancyGraphics:" + this.i);
/* 1072 */       ☃.println("ao:" + this.j);
/*      */       
/* 1074 */       switch (this.h) {
/*      */         case 2:
/* 1076 */           ☃.println("renderClouds:true");
/*      */           break;
/*      */         case 1:
/* 1079 */           ☃.println("renderClouds:fast");
/*      */           break;
/*      */         case 0:
/* 1082 */           ☃.println("renderClouds:false");
/*      */           break;
/*      */       } 
/*      */       
/* 1086 */       ☃.println("resourcePacks:" + aP.toJson(this.k));
/* 1087 */       ☃.println("incompatibleResourcePacks:" + aP.toJson(this.l));
/* 1088 */       ☃.println("lastServer:" + this.aE);
/* 1089 */       ☃.println("lang:" + this.aM);
/* 1090 */       ☃.println("chatVisibility:" + this.m.a());
/* 1091 */       ☃.println("chatColors:" + this.n);
/* 1092 */       ☃.println("chatLinks:" + this.o);
/* 1093 */       ☃.println("chatLinksPrompt:" + this.p);
/* 1094 */       ☃.println("chatOpacity:" + this.q);
/* 1095 */       ☃.println("snooperEnabled:" + this.r);
/* 1096 */       ☃.println("fullscreen:" + this.s);
/* 1097 */       ☃.println("enableVsync:" + this.t);
/* 1098 */       ☃.println("useVbo:" + this.u);
/* 1099 */       ☃.println("hideServerAddress:" + this.x);
/* 1100 */       ☃.println("advancedItemTooltips:" + this.y);
/* 1101 */       ☃.println("pauseOnLostFocus:" + this.z);
/* 1102 */       ☃.println("touchscreen:" + this.A);
/* 1103 */       ☃.println("overrideWidth:" + this.B);
/* 1104 */       ☃.println("overrideHeight:" + this.C);
/* 1105 */       ☃.println("heldItemTooltips:" + this.D);
/* 1106 */       ☃.println("chatHeightFocused:" + this.H);
/* 1107 */       ☃.println("chatHeightUnfocused:" + this.G);
/* 1108 */       ☃.println("chatScale:" + this.E);
/* 1109 */       ☃.println("chatWidth:" + this.F);
/* 1110 */       ☃.println("showInventoryAchievementHint:" + this.I);
/* 1111 */       ☃.println("mipmapLevels:" + this.J);
/* 1112 */       ☃.println("streamBytesPerPixel:" + this.K);
/* 1113 */       ☃.println("streamMicVolume:" + this.L);
/* 1114 */       ☃.println("streamSystemVolume:" + this.M);
/* 1115 */       ☃.println("streamKbps:" + this.N);
/* 1116 */       ☃.println("streamFps:" + this.O);
/* 1117 */       ☃.println("streamCompression:" + this.P);
/* 1118 */       ☃.println("streamSendMetadata:" + this.Q);
/* 1119 */       ☃.println("streamPreferredServer:" + this.R);
/* 1120 */       ☃.println("streamChatEnabled:" + this.S);
/* 1121 */       ☃.println("streamChatUserFilter:" + this.T);
/* 1122 */       ☃.println("streamMicToggleBehavior:" + this.U);
/* 1123 */       ☃.println("forceUnicodeFont:" + this.aN);
/* 1124 */       ☃.println("allowBlockAlternatives:" + this.v);
/* 1125 */       ☃.println("reducedDebugInfo:" + this.w);
/* 1126 */       ☃.println("useNativeTransport:" + this.V);
/* 1127 */       ☃.println("entityShadows:" + this.W);
/*      */       int i, j;
/* 1129 */       for (avb[] arrayOfAvb = this.aw; j < i; ) { avb avb1 = arrayOfAvb[j];
/* 1130 */         ☃.println("key_" + avb1.g() + ":" + avb1.i());
/*      */         j++; }
/*      */       
/* 1133 */       for (bpg[] arrayOfBpg = bpg.values(); j < i; ) { bpg bpg = arrayOfBpg[j];
/* 1134 */         ☃.println("soundCategory_" + bpg.a() + ":" + a(bpg));
/*      */         j++; }
/*      */       
/* 1137 */       for (wo[] arrayOfWo = wo.values(); j < i; ) { wo wo = arrayOfWo[j];
/* 1138 */         ☃.println("modelPart_" + wo.c() + ":" + this.aZ.contains(wo));
/*      */         j++; }
/*      */       
/* 1141 */       ☃.close();
/* 1142 */     } catch (Exception ☃) {
/* 1143 */       aO.error("Failed to save options", ☃);
/*      */     } 
/*      */     
/* 1146 */     c();
/*      */   }
/*      */   
/*      */   public float a(bpg ☃) {
/* 1150 */     if (this.ba.containsKey(☃)) {
/* 1151 */       return ((Float)this.ba.get(☃)).floatValue();
/*      */     }
/*      */     
/* 1154 */     return 1.0F;
/*      */   }
/*      */   
/*      */   public void a(bpg ☃, float f) {
/* 1158 */     this.ax.W().a(☃, f);
/* 1159 */     this.ba.put(☃, Float.valueOf(f));
/*      */   }
/*      */   
/*      */   public void c() {
/* 1163 */     if (this.ax.h != null) {
/* 1164 */       int ☃ = 0;
/* 1165 */       for (Iterator<wo> iterator = this.aZ.iterator(); iterator.hasNext(); ) { wo wo = iterator.next();
/* 1166 */         ☃ |= wo.a(); }
/*      */       
/* 1168 */       this.ax.h.a.a(new ih(this.aM, this.c, this.m, this.n, ☃));
/*      */     } 
/*      */   }
/*      */   
/*      */   public Set<wo> d() {
/* 1173 */     return (Set<wo>)ImmutableSet.copyOf(this.aZ);
/*      */   }
/*      */   
/*      */   public void a(wo ☃, boolean bool) {
/* 1177 */     if (bool) {
/* 1178 */       this.aZ.add(☃);
/*      */     } else {
/* 1180 */       this.aZ.remove(☃);
/*      */     } 
/* 1182 */     c();
/*      */   }
/*      */   
/*      */   public void a(wo ☃) {
/* 1186 */     if (!d().contains(☃)) {
/* 1187 */       this.aZ.add(☃);
/*      */     } else {
/* 1189 */       this.aZ.remove(☃);
/*      */     } 
/* 1191 */     c();
/*      */   }
/*      */   
/*      */   public int e() {
/* 1195 */     if (this.c >= 4) {
/* 1196 */       return this.h;
/*      */     }
/* 1198 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean f() {
/* 1203 */     return this.V;
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */