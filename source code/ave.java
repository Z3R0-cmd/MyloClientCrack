/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Multimap;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.google.common.util.concurrent.Futures;
/*      */ import com.google.common.util.concurrent.ListenableFuture;
/*      */ import com.google.common.util.concurrent.ListenableFutureTask;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*      */ import com.mojang.authlib.properties.Property;
/*      */ import com.mojang.authlib.properties.PropertyMap;
/*      */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.net.Proxy;
/*      */ import java.net.SocketAddress;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.ByteOrder;
/*      */ import java.text.DecimalFormat;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Queue;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.Callable;
/*      */ import java.util.concurrent.Executors;
/*      */ import java.util.concurrent.FutureTask;
/*      */ import javax.imageio.ImageIO;
/*      */ import net.minecraft.client.ClientBrandRetriever;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.commons.io.IOUtils;
/*      */ import org.apache.commons.lang3.Validate;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.Sys;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.ContextCapabilities;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.DisplayMode;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GLContext;
/*      */ import org.lwjgl.opengl.OpenGLException;
/*      */ import org.lwjgl.opengl.PixelFormat;
/*      */ import org.lwjgl.util.glu.GLU;
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
/*      */ public class ave
/*      */   implements od, os
/*      */ {
/*  145 */   private static final Logger K = LogManager.getLogger();
/*  146 */   private static final jy L = new jy("textures/gui/title/mojang.png");
/*  147 */   public static final boolean a = (g.a() == g.a.d);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  152 */   public static byte[] b = new byte[10485760];
/*  153 */   private static final List<DisplayMode> M = Lists.newArrayList((Object[])new DisplayMode[] { new DisplayMode(2560, 1600), new DisplayMode(2880, 1800) });
/*      */   
/*      */   private final File N;
/*      */   
/*      */   private final PropertyMap O;
/*      */   
/*      */   private final PropertyMap P;
/*      */   
/*      */   private bde Q;
/*      */   
/*      */   private bmj R;
/*      */   
/*      */   private static ave S;
/*      */   public bda c;
/*      */   private boolean T;
/*      */   private boolean U = true;
/*      */   private boolean V;
/*      */   private b W;
/*      */   public int d;
/*      */   public int e;
/*      */   private boolean X = false;
/*  174 */   private avl Y = new avl(20.0F);
/*  175 */   private or Z = new or("client", this, MinecraftServer.az());
/*      */   
/*      */   public bdb f;
/*      */   
/*      */   public bfr g;
/*      */   
/*      */   private biu aa;
/*      */   
/*      */   private bjh ab;
/*      */   
/*      */   private bfn ac;
/*      */   
/*      */   public bew h;
/*      */   
/*      */   private pk ad;
/*      */   
/*      */   public pk i;
/*      */   
/*      */   public bec j;
/*      */   
/*      */   private final avm ae;
/*      */   
/*      */   private boolean af;
/*      */   public avn k;
/*      */   public avn l;
/*      */   public axu m;
/*      */   public avi n;
/*      */   public bfk o;
/*      */   private int ag;
/*      */   private int ah;
/*      */   private int ai;
/*      */   private bpo aj;
/*      */   public ayd p;
/*      */   public avo q;
/*      */   public boolean r;
/*      */   public auh s;
/*      */   public avh t;
/*      */   public avf u;
/*      */   public final File v;
/*      */   private final File ak;
/*      */   private final String al;
/*      */   private final Proxy am;
/*      */   private atr an;
/*      */   private static int ao;
/*      */   private int ap;
/*      */   private String aq;
/*      */   private int ar;
/*      */   public boolean w;
/*  223 */   long x = J();
/*      */   
/*      */   private int as;
/*  226 */   public final nh y = new nh();
/*  227 */   long z = System.nanoTime();
/*      */   
/*      */   private final boolean at;
/*      */   private final boolean au;
/*      */   private ek av;
/*      */   private boolean aw;
/*  233 */   public final nt A = new nt();
/*  234 */   private long ax = -1L;
/*      */   private bng ay;
/*  236 */   private final bny az = new bny();
/*  237 */   private final List<bnk> aA = Lists.newArrayList();
/*      */   
/*      */   private final bna aB;
/*      */   
/*      */   private bnm aC;
/*      */   private bns aD;
/*      */   private bqm aE;
/*      */   private bfw aF;
/*      */   private bmh aG;
/*      */   private bpz aH;
/*      */   private bpv aI;
/*      */   private jy aJ;
/*      */   private final MinecraftSessionService aK;
/*      */   private bnp aL;
/*  251 */   private final Queue<FutureTask<?>> aM = Queues.newArrayDeque();
/*  252 */   private long aN = 0L;
/*  253 */   private final Thread aO = Thread.currentThread();
/*      */   
/*      */   private bou aP;
/*      */   private bgd aQ;
/*      */   volatile boolean B = true;
/*  258 */   public String C = "";
/*      */   
/*      */   public boolean D = false;
/*      */   public boolean E = false;
/*      */   public boolean F = false;
/*      */   public boolean G = true;
/*  264 */   long H = J();
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
/*      */   int I;
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
/*      */   long J;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String aR;
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
/*      */   public void a() {
/*  308 */     this.B = true;
/*      */     try {
/*  310 */       am();
/*  311 */     } catch (Throwable ☃) {
/*  312 */       b b1 = b.a(☃, "Initializing game");
/*  313 */       b1.a("Initialization");
/*  314 */       c(b(b1));
/*      */       return;
/*      */     } 
/*      */     
/*  318 */     try { while (this.B) {
/*  319 */         if (this.V && this.W != null) {
/*  320 */           c(this.W);
/*      */           
/*      */           return;
/*      */         } 
/*      */         try {
/*  325 */           av();
/*  326 */         } catch (OutOfMemoryError ☃) {
/*  327 */           l();
/*  328 */           a(new axo());
/*  329 */           System.gc();
/*      */         } 
/*      */       }  }
/*  332 */     catch (avk avk) {  }
/*  333 */     catch (e ☃)
/*  334 */     { b(☃.a());
/*  335 */       l();
/*  336 */       K.fatal("Reported exception thrown!", ☃);
/*  337 */       c(☃.a()); }
/*  338 */     catch (Throwable ☃)
/*  339 */     { b b1 = b(new b("Unexpected error", ☃));
/*  340 */       l();
/*  341 */       K.fatal("Unreported exception thrown!", ☃);
/*  342 */       c(b1); }
/*      */     finally
/*  344 */     { g(); }
/*      */   
/*      */   }
/*      */   
/*      */   private void am() throws LWJGLException, IOException {
/*  349 */     this.t = new avh(this, this.v);
/*      */     
/*  351 */     this.aA.add(this.aB);
/*      */     
/*  353 */     at();
/*      */     
/*  355 */     if (this.t.C > 0 && this.t.B > 0) {
/*  356 */       this.d = this.t.B;
/*  357 */       this.e = this.t.C;
/*      */     } 
/*      */     
/*  360 */     K.info("LWJGL Version: " + Sys.getVersion());
/*  361 */     ar();
/*  362 */     aq();
/*  363 */     ap();
/*      */ 
/*      */     
/*  366 */     bqs.a();
/*      */     
/*  368 */     this.aF = new bfw(this.d, this.e, true);
/*  369 */     this.aF.a(0.0F, 0.0F, 0.0F, 0.0F);
/*      */     
/*  371 */     an();
/*      */     
/*  373 */     this.aC = new bnm(this.N, new File(this.v, "server-resource-packs"), this.aB, this.az, this.t);
/*  374 */     this.ay = new bnn(this.az);
/*      */     
/*  376 */     this.aD = new bns(this.az, this.t.aM);
/*  377 */     this.ay.a(this.aD);
/*      */     
/*  379 */     e();
/*      */     
/*  381 */     this.R = new bmj(this.ay);
/*  382 */     this.ay.a(this.R);
/*      */     
/*  384 */     a(this.R);
/*      */     
/*  386 */     ao();
/*      */     
/*  388 */     this.aL = new bnp(this.R, new File(this.ak, "skins"), this.aK);
/*      */     
/*  390 */     this.an = new atk(new File(this.v, "saves"));
/*      */     
/*  392 */     this.aH = new bpz(this.ay, this.t);
/*  393 */     this.ay.a(this.aH);
/*      */     
/*  395 */     this.aI = new bpv(this);
/*      */ 
/*      */     
/*  398 */     this.k = new avn(this.t, new jy("textures/font/ascii.png"), this.R, false);
/*  399 */     if (this.t.aM != null) {
/*  400 */       this.k.a(d());
/*  401 */       this.k.b(this.aD.b());
/*      */     } 
/*      */     
/*  404 */     this.l = new avn(this.t, new jy("textures/font/ascii_sga.png"), this.R, false);
/*      */     
/*  406 */     this.ay.a(this.k);
/*  407 */     this.ay.a(this.l);
/*      */     
/*  409 */     this.ay.a(new bnf());
/*  410 */     this.ay.a(new bne());
/*      */     
/*  412 */     mr.f.a(new ms(this)
/*      */         {
/*      */           public String a(String ☃) {
/*      */             try {
/*  416 */               return String.format(☃, new Object[] { avh.c(this.a.t.ae.i()) });
/*  417 */             } catch (Exception exception) {
/*  418 */               return "Error: " + exception.getLocalizedMessage();
/*      */             } 
/*      */           }
/*      */         });
/*      */     
/*  423 */     this.u = new avf();
/*      */     
/*  425 */     b("Pre startup");
/*      */     
/*  427 */     bfl.w();
/*  428 */     bfl.j(7425);
/*  429 */     bfl.a(1.0D);
/*  430 */     bfl.j();
/*  431 */     bfl.c(515);
/*  432 */     bfl.d();
/*  433 */     bfl.a(516, 0.1F);
/*  434 */     bfl.e(1029);
/*      */     
/*  436 */     bfl.n(5889);
/*  437 */     bfl.D();
/*  438 */     bfl.n(5888);
/*  439 */     b("Startup");
/*      */     
/*  441 */     this.aG = new bmh("textures");
/*  442 */     this.aG.a(this.t.J);
/*  443 */     this.R.a(bmh.g, this.aG);
/*  444 */     this.R.a(bmh.g);
/*  445 */     this.aG.a(false, (this.t.J > 0));
/*      */     
/*  447 */     this.aP = new bou(this.aG);
/*  448 */     this.ay.a(this.aP);
/*      */     
/*  450 */     this.ab = new bjh(this.R, this.aP);
/*  451 */     this.aa = new biu(this.R, this.ab);
/*  452 */     this.ac = new bfn(this);
/*  453 */     this.ay.a(this.ab);
/*      */     
/*  455 */     this.o = new bfk(this, this.ay);
/*  456 */     this.ay.a(this.o);
/*      */     
/*  458 */     this.aQ = new bgd(this.aP.c(), this.t);
/*  459 */     this.ay.a(this.aQ);
/*      */     
/*  461 */     this.g = new bfr(this);
/*  462 */     this.ay.a(this.g);
/*      */     
/*  464 */     this.p = new ayd(this);
/*      */     
/*  466 */     bfl.b(0, 0, this.d, this.e);
/*      */     
/*  468 */     this.j = new bec(this.f, this.R);
/*      */     
/*  470 */     b("Post startup");
/*  471 */     this.q = new avo(this);
/*      */     
/*  473 */     if (this.aq != null) {
/*  474 */       a(new awz(new aya(), this, this.aq, this.ar));
/*      */     } else {
/*  476 */       a(new aya());
/*      */     } 
/*      */ 
/*      */     
/*  480 */     this.R.c(this.aJ);
/*  481 */     this.aJ = null;
/*      */     
/*  483 */     this.n = new avi(this);
/*      */     
/*  485 */     if (this.t.s && !this.T) {
/*  486 */       q();
/*      */     }
/*      */     try {
/*  489 */       Display.setVSyncEnabled(this.t.t);
/*  490 */     } catch (OpenGLException ☃) {
/*  491 */       this.t.t = false;
/*  492 */       this.t.b();
/*      */     } 
/*      */     
/*  495 */     this.g.b();
/*      */   }
/*      */   
/*      */   private void an() {
/*  499 */     this.az.a(new boo(), bon.class);
/*  500 */     this.az.a(new boe(), bod.class);
/*  501 */     this.az.a(new bob(), boa.class);
/*  502 */     this.az.a(new bok(), boj.class);
/*  503 */     this.az.a(new boh(), bog.class);
/*      */   }
/*      */   
/*      */   private void ao() {
/*      */     try {
/*  508 */       this.aE = new bqn(this, (Property)Iterables.getFirst(this.O.get("twitch_access_token"), null));
/*  509 */     } catch (Throwable ☃) {
/*  510 */       this.aE = new bqo(☃);
/*  511 */       K.error("Couldn't initialize twitch stream");
/*      */     } 
/*      */   }
/*      */   
/*      */   private void ap() throws LWJGLException {
/*  516 */     Display.setResizable(true);
/*  517 */     Display.setTitle("Minecraft 1.8.8");
/*      */ 
/*      */     
/*      */     try {
/*  521 */       Display.create((new PixelFormat()).withDepthBits(24));
/*  522 */     } catch (LWJGLException ☃) {
/*      */       
/*  524 */       K.error("Couldn't set pixel format", (Throwable)☃);
/*      */       try {
/*  526 */         Thread.sleep(1000L);
/*  527 */       } catch (InterruptedException interruptedException) {}
/*      */ 
/*      */       
/*  530 */       if (this.T) {
/*  531 */         au();
/*      */       }
/*      */       
/*  534 */       Display.create();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void aq() throws LWJGLException {
/*  539 */     if (this.T) {
/*  540 */       Display.setFullscreen(true);
/*  541 */       DisplayMode ☃ = Display.getDisplayMode();
/*  542 */       this.d = Math.max(1, ☃.getWidth());
/*  543 */       this.e = Math.max(1, ☃.getHeight());
/*      */     } else {
/*  545 */       Display.setDisplayMode(new DisplayMode(this.d, this.e));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void ar() {
/*  551 */     g.a ☃ = g.a();
/*  552 */     if (☃ != g.a.d) {
/*  553 */       InputStream inputStream1 = null;
/*  554 */       InputStream inputStream2 = null;
/*      */       try {
/*  556 */         inputStream1 = this.aB.c(new jy("icons/icon_16x16.png"));
/*  557 */         inputStream2 = this.aB.c(new jy("icons/icon_32x32.png"));
/*      */         
/*  559 */         if (inputStream1 != null && inputStream2 != null) {
/*  560 */           Display.setIcon(new ByteBuffer[] { a(inputStream1), a(inputStream2) });
/*      */         
/*      */         }
/*      */       }
/*  564 */       catch (IOException iOException) {
/*  565 */         K.error("Couldn't set icon", iOException);
/*      */       } finally {
/*  567 */         IOUtils.closeQuietly(inputStream1);
/*  568 */         IOUtils.closeQuietly(inputStream2);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static boolean as() {
/*  574 */     String[] ☃ = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" }; String[] arrayOfString1;
/*      */     int i, j;
/*  576 */     for (arrayOfString1 = ☃, i = arrayOfString1.length, j = 0; j < i; ) { String str1 = arrayOfString1[j];
/*  577 */       String str2 = System.getProperty(str1);
/*  578 */       if (str2 != null && 
/*  579 */         str2.contains("64")) {
/*  580 */         return true;
/*      */       }
/*      */       
/*      */       j++; }
/*      */     
/*  585 */     return false;
/*      */   }
/*      */   
/*      */   public bfw b() {
/*  589 */     return this.aF;
/*      */   }
/*      */   
/*      */   public String c() {
/*  593 */     return this.al;
/*      */   }
/*      */ 
/*      */   
/*      */   private void at() {
/*  598 */     Thread ☃ = new Thread(this, "Timer hack thread")
/*      */       {
/*      */         public void run() {
/*  601 */           while (this.a.B) {
/*      */             try {
/*  603 */               Thread.sleep(2147483647L);
/*  604 */             } catch (InterruptedException interruptedException) {}
/*      */           } 
/*      */         }
/*      */       };
/*      */     
/*  609 */     ☃.setDaemon(true);
/*  610 */     ☃.start();
/*      */   }
/*      */   
/*      */   public void a(b ☃) {
/*  614 */     this.V = true;
/*  615 */     this.W = ☃;
/*      */   }
/*      */   
/*      */   public void c(b ☃) {
/*  619 */     File file1 = new File((A()).v, "crash-reports");
/*  620 */     File file2 = new File(file1, "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-client.txt");
/*      */ 
/*      */     
/*  623 */     kb.a(☃.e());
/*  624 */     if (☃.f() != null) {
/*  625 */       kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + ☃.f());
/*  626 */       System.exit(-1);
/*  627 */     } else if (☃.a(file2)) {
/*  628 */       kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
/*  629 */       System.exit(-1);
/*      */     } else {
/*  631 */       kb.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
/*  632 */       System.exit(-2);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean d() {
/*  637 */     return (this.aD.a() || this.t.aN);
/*      */   }
/*      */   
/*      */   public void e() {
/*  641 */     List<bnk> ☃ = Lists.newArrayList(this.aA);
/*      */     
/*  643 */     for (Iterator<bnm.a> iterator = this.aC.c().iterator(); iterator.hasNext(); ) { bnm.a a = iterator.next();
/*  644 */       ☃.add(a.c()); }
/*      */ 
/*      */     
/*  647 */     if (this.aC.e() != null) {
/*  648 */       ☃.add(this.aC.e());
/*      */     }
/*      */     
/*      */     try {
/*  652 */       this.ay.a(☃);
/*  653 */     } catch (RuntimeException runtimeException) {
/*  654 */       K.info("Caught error stitching, removing all assigned resourcepacks", runtimeException);
/*      */       
/*  656 */       ☃.clear();
/*  657 */       ☃.addAll(this.aA);
/*  658 */       this.aC.a(Collections.emptyList());
/*      */       
/*  660 */       this.ay.a(☃);
/*      */       
/*  662 */       this.t.k.clear();
/*  663 */       this.t.l.clear();
/*  664 */       this.t.b();
/*      */     } 
/*  666 */     this.aD.a(☃);
/*      */     
/*  668 */     if (this.g != null) {
/*  669 */       this.g.a();
/*      */     }
/*      */   }
/*      */   
/*      */   private ByteBuffer a(InputStream ☃) throws IOException {
/*  674 */     BufferedImage bufferedImage = ImageIO.read(☃);
/*  675 */     int[] arrayOfInt1 = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
/*      */     
/*  677 */     ByteBuffer byteBuffer = ByteBuffer.allocate(4 * arrayOfInt1.length);
/*  678 */     for (int arrayOfInt2[] = arrayOfInt1, i = arrayOfInt2.length, j = 0; j < i; ) { int k = arrayOfInt2[j];
/*  679 */       byteBuffer.putInt(k << 8 | k >> 24 & 0xFF); j++; }
/*      */     
/*  681 */     byteBuffer.flip();
/*  682 */     return byteBuffer;
/*      */   }
/*      */   
/*      */   private void au() throws LWJGLException {
/*  686 */     Set<DisplayMode> ☃ = Sets.newHashSet();
/*  687 */     Collections.addAll(☃, Display.getAvailableDisplayModes());
/*      */     
/*  689 */     DisplayMode displayMode = Display.getDesktopDisplayMode();
/*  690 */     if (!☃.contains(displayMode))
/*      */     {
/*  692 */       if (g.a() == g.a.d) {
/*  693 */         for (Iterator<DisplayMode> iterator = M.iterator(); iterator.hasNext(); ) { DisplayMode displayMode1 = iterator.next();
/*      */           
/*  695 */           boolean bool = true;
/*  696 */           for (Iterator<DisplayMode> iterator2 = ☃.iterator(); iterator2.hasNext(); ) { DisplayMode displayMode2 = iterator2.next();
/*  697 */             if (displayMode2.getBitsPerPixel() == 32 && displayMode2.getWidth() == displayMode1.getWidth() && displayMode2.getHeight() == displayMode1.getHeight()) {
/*  698 */               bool = false;
/*      */               
/*      */               break;
/*      */             }  }
/*      */           
/*  703 */           if (bool) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/*  708 */           for (Iterator<DisplayMode> iterator1 = ☃.iterator(); iterator1.hasNext(); ) { DisplayMode displayMode2 = iterator1.next();
/*  709 */             if (displayMode2.getBitsPerPixel() == 32 && displayMode2.getWidth() == displayMode1.getWidth() / 2 && displayMode2.getHeight() == displayMode1.getHeight() / 2) {
/*  710 */               displayMode = displayMode2;
/*      */             } }
/*      */            }
/*      */       
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  718 */     Display.setDisplayMode(displayMode);
/*  719 */     this.d = displayMode.getWidth();
/*  720 */     this.e = displayMode.getHeight();
/*      */   }
/*      */   
/*      */   private void a(bmj ☃) throws LWJGLException {
/*  724 */     avr avr = new avr(this);
/*  725 */     int i = avr.e();
/*  726 */     bfw bfw1 = new bfw(avr.a() * i, avr.b() * i, true);
/*  727 */     bfw1.a(false);
/*      */     
/*  729 */     bfl.n(5889);
/*  730 */     bfl.D();
/*  731 */     bfl.a(0.0D, avr.a(), avr.b(), 0.0D, 1000.0D, 3000.0D);
/*  732 */     bfl.n(5888);
/*  733 */     bfl.D();
/*  734 */     bfl.b(0.0F, 0.0F, -2000.0F);
/*      */     
/*  736 */     bfl.f();
/*  737 */     bfl.n();
/*  738 */     bfl.i();
/*      */     
/*  740 */     bfl.w();
/*      */     
/*  742 */     InputStream inputStream = null;
/*      */     try {
/*  744 */       inputStream = this.aB.a(L);
/*  745 */       this.aJ = ☃.a("logo", new blz(ImageIO.read(inputStream)));
/*  746 */       ☃.a(this.aJ);
/*  747 */     } catch (IOException iOException) {
/*  748 */       K.error("Unable to load logo: " + L, iOException);
/*      */     } finally {
/*  750 */       IOUtils.closeQuietly(inputStream);
/*      */     } 
/*      */     
/*  753 */     bfx bfx = bfx.a();
/*  754 */     bfd bfd = bfx.c();
/*  755 */     bfd.a(7, bms.i);
/*  756 */     bfd.b(0.0D, this.e, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
/*  757 */     bfd.b(this.d, this.e, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
/*  758 */     bfd.b(this.d, 0.0D, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
/*  759 */     bfd.b(0.0D, 0.0D, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
/*  760 */     bfx.b();
/*      */     
/*  762 */     bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     
/*  764 */     int j = 256;
/*  765 */     int k = 256;
/*  766 */     a((avr.a() - j) / 2, (avr.b() - k) / 2, 0, 0, j, k, 255, 255, 255, 255);
/*      */     
/*  768 */     bfl.f();
/*  769 */     bfl.n();
/*      */     
/*  771 */     bfw1.e();
/*  772 */     bfw1.c(avr.a() * i, avr.b() * i);
/*      */     
/*  774 */     bfl.d();
/*  775 */     bfl.a(516, 0.1F);
/*      */     
/*  777 */     h();
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3, int i4) {
/*  781 */     float f1 = 0.00390625F;
/*  782 */     float f2 = 0.00390625F;
/*  783 */     bfd bfd = bfx.a().c();
/*  784 */     bfd.a(7, bms.i);
/*  785 */     bfd.b(☃, (i + n), 0.0D).a((j * f1), ((k + n) * f2)).b(i1, i2, i3, i4).d();
/*  786 */     bfd.b((☃ + m), (i + n), 0.0D).a(((j + m) * f1), ((k + n) * f2)).b(i1, i2, i3, i4).d();
/*  787 */     bfd.b((☃ + m), i, 0.0D).a(((j + m) * f1), (k * f2)).b(i1, i2, i3, i4).d();
/*  788 */     bfd.b(☃, i, 0.0D).a((j * f1), (k * f2)).b(i1, i2, i3, i4).d();
/*  789 */     bfx.a().b();
/*      */   }
/*      */   
/*      */   public atr f() {
/*  793 */     return this.an;
/*      */   }
/*      */   
/*      */   public void a(axu ☃) {
/*  797 */     if (this.m != null) {
/*  798 */       this.m.m();
/*      */     }
/*      */     
/*  801 */     if (☃ == null && this.f == null) {
/*  802 */       ☃ = new aya();
/*  803 */     } else if (☃ == null && this.h.bn() <= 0.0F) {
/*  804 */       ☃ = new axe();
/*      */     } 
/*      */     
/*  807 */     if (☃ instanceof aya) {
/*  808 */       this.t.aB = false;
/*  809 */       this.q.d().a();
/*      */     } 
/*      */     
/*  812 */     this.m = ☃;
/*      */     
/*  814 */     if (☃ != null) {
/*  815 */       o();
/*  816 */       avr avr = new avr(this);
/*  817 */       int i = avr.a();
/*  818 */       int j = avr.b();
/*  819 */       ☃.a(this, i, j);
/*  820 */       this.r = false;
/*      */     } else {
/*  822 */       this.aH.e();
/*  823 */       n();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void b(String ☃) {
/*  828 */     if (!this.U) {
/*      */       return;
/*      */     }
/*      */     
/*  832 */     int i = GL11.glGetError();
/*  833 */     if (i != 0) {
/*  834 */       String str = GLU.gluErrorString(i);
/*  835 */       K.error("########## GL ERROR ##########");
/*  836 */       K.error("@ " + ☃);
/*  837 */       K.error(i + ": " + str);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void g() {
/*      */     try {
/*  843 */       this.aE.f();
/*      */       
/*  845 */       K.info("Stopping!");
/*      */       try {
/*  847 */         a((bdb)null);
/*  848 */       } catch (Throwable throwable) {}
/*      */ 
/*      */       
/*  851 */       this.aH.d();
/*      */     } finally {
/*  853 */       Display.destroy();
/*  854 */       if (!this.V) {
/*  855 */         System.exit(0);
/*      */       }
/*      */     } 
/*  858 */     System.gc();
/*      */   }
/*      */   
/*      */   private void av() {
/*  862 */     long ☃ = System.nanoTime();
/*      */     
/*  864 */     this.A.a("root");
/*  865 */     if (Display.isCreated() && Display.isCloseRequested()) {
/*  866 */       m();
/*      */     }
/*      */ 
/*      */     
/*  870 */     if (this.af && this.f != null) {
/*  871 */       float f = this.Y.c;
/*  872 */       this.Y.a();
/*  873 */       this.Y.c = f;
/*      */     } else {
/*  875 */       this.Y.a();
/*      */     } 
/*      */     
/*  878 */     this.A.a("scheduledExecutables");
/*  879 */     synchronized (this.aM) {
/*  880 */       while (!this.aM.isEmpty()) {
/*  881 */         g.a(this.aM.poll(), K);
/*      */       }
/*      */     } 
/*  884 */     this.A.b();
/*      */     
/*  886 */     long l1 = System.nanoTime();
/*  887 */     this.A.a("tick");
/*  888 */     for (int i = 0; i < this.Y.b; i++) {
/*  889 */       s();
/*      */     }
/*      */     
/*  892 */     this.A.c("preRenderErrors");
/*  893 */     long l2 = System.nanoTime() - l1;
/*  894 */     b("Pre render");
/*      */     
/*  896 */     this.A.c("sound");
/*  897 */     this.aH.a(this.h, this.Y.c);
/*  898 */     this.A.b();
/*      */     
/*  900 */     this.A.a("render");
/*      */     
/*  902 */     bfl.E();
/*  903 */     bfl.m(16640);
/*  904 */     this.aF.a(true);
/*      */     
/*  906 */     this.A.a("display");
/*  907 */     bfl.w();
/*      */     
/*  909 */     if (this.h != null && this.h.aj()) {
/*  910 */       this.t.aA = 0;
/*      */     }
/*  912 */     this.A.b();
/*  913 */     if (!this.r) {
/*  914 */       this.A.c("gameRenderer");
/*  915 */       this.o.a(this.Y.c, ☃);
/*  916 */       this.A.b();
/*      */     } 
/*      */     
/*  919 */     this.A.b();
/*      */     
/*  921 */     if (this.t.aB && this.t.aC && !this.t.az) {
/*  922 */       if (!this.A.a) {
/*  923 */         this.A.a();
/*      */       }
/*  925 */       this.A.a = true;
/*  926 */       a(l2);
/*      */     } else {
/*  928 */       this.A.a = false;
/*  929 */       this.J = System.nanoTime();
/*      */     } 
/*      */     
/*  932 */     this.p.a();
/*      */     
/*  934 */     this.aF.e();
/*  935 */     bfl.F();
/*  936 */     bfl.E();
/*  937 */     this.aF.c(this.d, this.e);
/*  938 */     bfl.F();
/*  939 */     bfl.E();
/*  940 */     this.o.b(this.Y.c);
/*  941 */     bfl.F();
/*  942 */     this.A.a("root");
/*      */     
/*  944 */     h();
/*      */     
/*  946 */     Thread.yield();
/*      */     
/*  948 */     this.A.a("stream");
/*  949 */     this.A.a("update");
/*  950 */     this.aE.g();
/*  951 */     this.A.c("submit");
/*  952 */     this.aE.h();
/*  953 */     this.A.b();
/*  954 */     this.A.b();
/*      */     
/*  956 */     b("Post render");
/*  957 */     this.I++;
/*  958 */     this.af = (F() && this.m != null && this.m.d() && !this.aj.b());
/*      */     
/*  960 */     long l3 = System.nanoTime();
/*  961 */     this.y.a(l3 - this.z);
/*  962 */     this.z = l3;
/*      */     
/*  964 */     while (J() >= this.H + 1000L) {
/*  965 */       ao = this.I;
/*  966 */       this.C = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", new Object[] { Integer.valueOf(ao), Integer.valueOf(bht.a), (bht.a != 1) ? "s" : "", (this.t.g == avh.a.i.f()) ? "inf" : Integer.valueOf(this.t.g), this.t.t ? " vsync" : "", this.t.i ? "" : " fast", (this.t.h == 0) ? "" : ((this.t.h == 1) ? " fast-clouds" : " fancy-clouds"), bqs.f() ? " vbo" : "" });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  976 */       bht.a = 0;
/*  977 */       this.H += 1000L;
/*  978 */       this.I = 0;
/*  979 */       this.Z.b();
/*      */       
/*  981 */       if (!this.Z.d()) {
/*  982 */         this.Z.a();
/*      */       }
/*      */     } 
/*  985 */     if (k()) {
/*  986 */       this.A.a("fpslimit_wait");
/*  987 */       Display.sync(j());
/*  988 */       this.A.b();
/*      */     } 
/*  990 */     this.A.b();
/*      */   }
/*      */   
/*      */   public void h() {
/*  994 */     this.A.a("display_update");
/*  995 */     Display.update();
/*  996 */     this.A.b();
/*  997 */     i();
/*      */   }
/*      */   
/*      */   protected void i() {
/* 1001 */     if (!this.T && Display.wasResized()) {
/* 1002 */       int ☃ = this.d;
/* 1003 */       int i = this.e;
/* 1004 */       this.d = Display.getWidth();
/* 1005 */       this.e = Display.getHeight();
/* 1006 */       if (this.d != ☃ || this.e != i) {
/* 1007 */         if (this.d <= 0) {
/* 1008 */           this.d = 1;
/*      */         }
/* 1010 */         if (this.e <= 0) {
/* 1011 */           this.e = 1;
/*      */         }
/*      */         
/* 1014 */         a(this.d, this.e);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public int j() {
/* 1020 */     if (this.f == null && this.m != null) {
/* 1021 */       return 30;
/*      */     }
/* 1023 */     return this.t.g;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean k() {
/* 1028 */     return (j() < avh.a.i.f());
/*      */   }
/*      */   
/*      */   public void l() {
/*      */     try {
/* 1033 */       b = new byte[0];
/* 1034 */       this.g.k();
/* 1035 */     } catch (Throwable throwable) {}
/*      */     
/*      */     try {
/* 1038 */       System.gc();
/* 1039 */       a((bdb)null);
/* 1040 */     } catch (Throwable throwable) {}
/*      */     
/* 1042 */     System.gc();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ave(bao ☃) {
/* 1122 */     this.J = -1L;
/*      */     
/* 1124 */     this.aR = "root"; S = this; this.v = ☃.c.a; this.ak = ☃.c.c; this.N = ☃.c.b; this.al = ☃.d.b; this.O = ☃.a.b; this.P = ☃.a.c; this.aB = new bna((new bmy(☃.c.c, ☃.c.d)).a()); this.am = (☃.a.d == null) ? Proxy.NO_PROXY : ☃.a.d; this.aK = (new YggdrasilAuthenticationService(☃.a.d, UUID.randomUUID().toString())).createMinecraftSessionService(); this.ae = ☃.a.a; K.info("Setting user: " + this.ae.c()); K.info("(Session ID is " + this.ae.a() + ")"); this.au = ☃.d.a; this.d = (☃.b.a > 0) ? ☃.b.a : 1; this.e = (☃.b.b > 0) ? ☃.b.b : 1; this.ah = ☃.b.a; this.ai = ☃.b.b; this.T = ☃.b.c; this.at = as(); this.aj = new bpo(this); if (☃.e.a != null) {
/*      */       this.aq = ☃.e.a; this.ar = ☃.e.b;
/*      */     }  ImageIO.setUseCache(false);
/* 1127 */     kb.c(); } private void b(int ☃) { List<nt.a> list = this.A.b(this.aR);
/* 1128 */     if (list == null || list.isEmpty()) {
/*      */       return;
/*      */     }
/*      */     
/* 1132 */     nt.a a = list.remove(0);
/* 1133 */     if (☃ == 0) {
/* 1134 */       if (a.c.length() > 0) {
/* 1135 */         int i = this.aR.lastIndexOf(".");
/* 1136 */         if (i >= 0) {
/* 1137 */           this.aR = this.aR.substring(0, i);
/*      */         }
/*      */       } 
/*      */     } else {
/* 1141 */       ☃--;
/* 1142 */       if (☃ < list.size() && !((nt.a)list.get(☃)).c.equals("unspecified")) {
/* 1143 */         if (this.aR.length() > 0) {
/* 1144 */           this.aR += ".";
/*      */         }
/* 1146 */         this.aR += ((nt.a)list.get(☃)).c;
/*      */       } 
/*      */     }  }
/*      */ 
/*      */   
/*      */   private void a(long ☃) {
/* 1152 */     if (!this.A.a) {
/*      */       return;
/*      */     }
/* 1155 */     List<nt.a> list = this.A.b(this.aR);
/* 1156 */     nt.a a = list.remove(0);
/*      */     
/* 1158 */     bfl.m(256);
/* 1159 */     bfl.n(5889);
/* 1160 */     bfl.g();
/* 1161 */     bfl.D();
/* 1162 */     bfl.a(0.0D, this.d, this.e, 0.0D, 1000.0D, 3000.0D);
/* 1163 */     bfl.n(5888);
/* 1164 */     bfl.D();
/* 1165 */     bfl.b(0.0F, 0.0F, -2000.0F);
/*      */     
/* 1167 */     GL11.glLineWidth(1.0F);
/* 1168 */     bfl.x();
/* 1169 */     bfx bfx = bfx.a();
/* 1170 */     bfd bfd = bfx.c();
/*      */     
/* 1172 */     int i = 160;
/* 1173 */     int j = this.d - i - 10;
/* 1174 */     int k = this.e - i * 2;
/* 1175 */     bfl.l();
/* 1176 */     bfd.a(7, bms.f);
/* 1177 */     bfd.b((j - i * 1.1F), (k - i * 0.6F - 16.0F), 0.0D).b(200, 0, 0, 0).d();
/* 1178 */     bfd.b((j - i * 1.1F), (k + i * 2), 0.0D).b(200, 0, 0, 0).d();
/* 1179 */     bfd.b((j + i * 1.1F), (k + i * 2), 0.0D).b(200, 0, 0, 0).d();
/* 1180 */     bfd.b((j + i * 1.1F), (k - i * 0.6F - 16.0F), 0.0D).b(200, 0, 0, 0).d();
/* 1181 */     bfx.b();
/* 1182 */     bfl.k();
/*      */     
/* 1184 */     double d = 0.0D;
/* 1185 */     for (int m = 0; m < list.size(); m++) {
/* 1186 */       nt.a a1 = list.get(m);
/*      */       
/* 1188 */       int i2 = ns.c(a1.a / 4.0D) + 1;
/*      */       
/* 1190 */       bfd.a(6, bms.f);
/* 1191 */       int i3 = a1.a();
/* 1192 */       int i4 = i3 >> 16 & 0xFF;
/* 1193 */       int i5 = i3 >> 8 & 0xFF;
/* 1194 */       int i6 = i3 & 0xFF;
/* 1195 */       bfd.b(j, k, 0.0D).b(i4, i5, i6, 255).d(); int i7;
/* 1196 */       for (i7 = i2; i7 >= 0; i7--) {
/* 1197 */         float f1 = (float)((d + a1.a * i7 / i2) * 3.1415927410125732D * 2.0D / 100.0D);
/* 1198 */         float f2 = ns.a(f1) * i;
/* 1199 */         float f3 = ns.b(f1) * i * 0.5F;
/* 1200 */         bfd.b((j + f2), (k - f3), 0.0D).b(i4, i5, i6, 255).d();
/*      */       } 
/* 1202 */       bfx.b();
/*      */       
/* 1204 */       bfd.a(5, bms.f);
/* 1205 */       for (i7 = i2; i7 >= 0; i7--) {
/* 1206 */         float f1 = (float)((d + a1.a * i7 / i2) * 3.1415927410125732D * 2.0D / 100.0D);
/* 1207 */         float f2 = ns.a(f1) * i;
/* 1208 */         float f3 = ns.b(f1) * i * 0.5F;
/* 1209 */         bfd.b((j + f2), (k - f3), 0.0D).b(i4 >> 1, i5 >> 1, i6 >> 1, 255).d();
/* 1210 */         bfd.b((j + f2), (k - f3 + 10.0F), 0.0D).b(i4 >> 1, i5 >> 1, i6 >> 1, 255).d();
/*      */       } 
/* 1212 */       bfx.b();
/*      */       
/* 1214 */       d += a1.a;
/*      */     } 
/* 1216 */     DecimalFormat decimalFormat = new DecimalFormat("##0.00");
/*      */     
/* 1218 */     bfl.w();
/*      */ 
/*      */     
/* 1221 */     String str = "";
/* 1222 */     if (!a.c.equals("unspecified")) {
/* 1223 */       str = str + "[0] ";
/*      */     }
/* 1225 */     if (a.c.length() == 0) {
/* 1226 */       str = str + "ROOT ";
/*      */     } else {
/* 1228 */       str = str + a.c + " ";
/*      */     } 
/* 1230 */     int i1 = 16777215;
/* 1231 */     this.k.a(str, (j - i), (k - i / 2 - 16), i1);
/* 1232 */     this.k.a(str = decimalFormat.format(a.b) + "%", (j + i - this.k.a(str)), (k - i / 2 - 16), i1);
/*      */ 
/*      */     
/* 1235 */     for (int n = 0; n < list.size(); n++) {
/* 1236 */       nt.a a1 = list.get(n);
/* 1237 */       String str1 = "";
/* 1238 */       if (a1.c.equals("unspecified")) {
/* 1239 */         str1 = str1 + "[?] ";
/*      */       } else {
/* 1241 */         str1 = str1 + "[" + (n + 1) + "] ";
/*      */       } 
/*      */       
/* 1244 */       str1 = str1 + a1.c;
/* 1245 */       this.k.a(str1, (j - i), (k + i / 2 + n * 8 + 20), a1.a());
/* 1246 */       this.k.a(str1 = decimalFormat.format(a1.a) + "%", (j + i - 50 - this.k.a(str1)), (k + i / 2 + n * 8 + 20), a1.a());
/* 1247 */       this.k.a(str1 = decimalFormat.format(a1.b) + "%", (j + i - this.k.a(str1)), (k + i / 2 + n * 8 + 20), a1.a());
/*      */     } 
/*      */   }
/*      */   
/*      */   public void m() {
/* 1252 */     this.B = false;
/*      */   }
/*      */   
/*      */   public void n() {
/* 1256 */     if (!Display.isActive()) {
/*      */       return;
/*      */     }
/* 1259 */     if (this.w) {
/*      */       return;
/*      */     }
/* 1262 */     this.w = true;
/* 1263 */     this.u.a();
/* 1264 */     a((axu)null);
/* 1265 */     this.ag = 10000;
/*      */   }
/*      */   
/*      */   public void o() {
/* 1269 */     if (!this.w) {
/*      */       return;
/*      */     }
/* 1272 */     avb.a();
/* 1273 */     this.w = false;
/* 1274 */     this.u.b();
/*      */   }
/*      */   
/*      */   public void p() {
/* 1278 */     if (this.m != null) {
/*      */       return;
/*      */     }
/*      */     
/* 1282 */     a(new axp());
/* 1283 */     if (F() && !this.aj.b()) {
/* 1284 */       this.aH.a();
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(boolean ☃) {
/* 1289 */     if (!☃) {
/* 1290 */       this.ag = 0;
/*      */     }
/* 1292 */     if (this.ag > 0 || this.h.bS()) {
/*      */       return;
/*      */     }
/*      */     
/* 1296 */     if (☃ && this.s != null && this.s.a == auh.a.b) {
/* 1297 */       cj cj = this.s.a();
/*      */       
/* 1299 */       if (this.f.p(cj).c().t() != arm.a && 
/* 1300 */         this.c.c(cj, this.s.b)) {
/* 1301 */         this.j.a(cj, this.s.b);
/* 1302 */         this.h.bw();
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1308 */     this.c.c();
/*      */   }
/*      */   private void aw() {
/*      */     cj ☃;
/* 1312 */     if (this.ag > 0) {
/*      */       return;
/*      */     }
/* 1315 */     this.h.bw();
/*      */     
/* 1317 */     if (this.s == null) {
/* 1318 */       K.error("Null returned as 'hitResult', this shouldn't happen!");
/* 1319 */       if (this.c.g()) {
/* 1320 */         this.ag = 10;
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/* 1325 */     switch (null.a[this.s.a.ordinal()]) {
/*      */       case 1:
/* 1327 */         this.c.a(this.h, this.s.d);
/*      */         return;
/*      */       case 2:
/* 1330 */         ☃ = this.s.a();
/*      */         
/* 1332 */         if (this.f.p(☃).c().t() != arm.a) {
/* 1333 */           this.c.b(☃, this.s.b);
/*      */           return;
/*      */         } 
/*      */         break;
/*      */     } 
/*      */     
/* 1339 */     if (this.c.g()) {
/* 1340 */       this.ag = 10;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private void ax() {
/* 1346 */     if (this.c.m()) {
/*      */       return;
/*      */     }
/*      */     
/* 1350 */     this.ap = 4;
/* 1351 */     boolean ☃ = true;
/*      */     
/* 1353 */     zx zx = this.h.bi.h();
/* 1354 */     if (this.s == null) {
/* 1355 */       K.warn("Null returned as 'hitResult', this shouldn't happen!");
/*      */     } else {
/* 1357 */       cj cj; switch (null.a[this.s.a.ordinal()]) {
/*      */         case 1:
/* 1359 */           if (this.c.a(this.h, this.s.d, this.s)) {
/* 1360 */             ☃ = false;
/*      */             break;
/*      */           } 
/* 1363 */           if (this.c.b(this.h, this.s.d)) {
/* 1364 */             ☃ = false;
/*      */           }
/*      */           break;
/*      */         case 2:
/* 1368 */           cj = this.s.a();
/*      */           
/* 1370 */           if (this.f.p(cj).c().t() != arm.a) {
/* 1371 */             int i = (zx != null) ? zx.b : 0;
/* 1372 */             if (this.c.a(this.h, this.f, zx, cj, this.s.b, this.s.c)) {
/* 1373 */               ☃ = false;
/* 1374 */               this.h.bw();
/*      */             } 
/* 1376 */             if (zx == null) {
/*      */               return;
/*      */             }
/*      */             
/* 1380 */             if (zx.b == 0) {
/* 1381 */               this.h.bi.a[this.h.bi.c] = null; break;
/* 1382 */             }  if (zx.b != i || this.c.h()) {
/* 1383 */               this.o.c.b();
/*      */             }
/*      */           } 
/*      */           break;
/*      */       } 
/*      */     
/*      */     } 
/* 1390 */     if (☃) {
/* 1391 */       zx zx1 = this.h.bi.h();
/* 1392 */       if (zx1 != null && 
/* 1393 */         this.c.a(this.h, this.f, zx1)) {
/* 1394 */         this.o.c.c();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void q() {
/*      */     try {
/* 1402 */       this.T = !this.T;
/* 1403 */       this.t.s = this.T;
/* 1404 */       if (this.T) {
/* 1405 */         au();
/* 1406 */         this.d = Display.getDisplayMode().getWidth();
/* 1407 */         this.e = Display.getDisplayMode().getHeight();
/* 1408 */         if (this.d <= 0) {
/* 1409 */           this.d = 1;
/*      */         }
/* 1411 */         if (this.e <= 0) {
/* 1412 */           this.e = 1;
/*      */         }
/*      */       } else {
/* 1415 */         Display.setDisplayMode(new DisplayMode(this.ah, this.ai));
/* 1416 */         this.d = this.ah;
/* 1417 */         this.e = this.ai;
/* 1418 */         if (this.d <= 0) {
/* 1419 */           this.d = 1;
/*      */         }
/* 1421 */         if (this.e <= 0) {
/* 1422 */           this.e = 1;
/*      */         }
/*      */       } 
/* 1425 */       if (this.m != null) {
/* 1426 */         a(this.d, this.e);
/*      */       } else {
/* 1428 */         ay();
/*      */       } 
/* 1430 */       Display.setFullscreen(this.T);
/* 1431 */       Display.setVSyncEnabled(this.t.t);
/* 1432 */       h();
/* 1433 */     } catch (Exception ☃) {
/* 1434 */       K.error("Couldn't toggle fullscreen", ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(int ☃, int i) {
/* 1439 */     this.d = Math.max(1, ☃);
/* 1440 */     this.e = Math.max(1, i);
/*      */     
/* 1442 */     if (this.m != null) {
/* 1443 */       avr avr = new avr(this);
/* 1444 */       this.m.b(this, avr.a(), avr.b());
/*      */     } 
/* 1446 */     this.n = new avi(this);
/* 1447 */     ay();
/*      */   }
/*      */   
/*      */   private void ay() {
/* 1451 */     this.aF.a(this.d, this.e);
/* 1452 */     if (this.o != null) {
/* 1453 */       this.o.a(this.d, this.e);
/*      */     }
/*      */   }
/*      */   
/*      */   public bpv r() {
/* 1458 */     return this.aI;
/*      */   }
/*      */   
/*      */   public void s() {
/* 1462 */     if (this.ap > 0) {
/* 1463 */       this.ap--;
/*      */     }
/*      */     
/* 1466 */     this.A.a("gui");
/* 1467 */     if (!this.af) {
/* 1468 */       this.q.c();
/*      */     }
/* 1470 */     this.A.b();
/* 1471 */     this.o.a(1.0F);
/*      */     
/* 1473 */     this.A.a("gameMode");
/* 1474 */     if (!this.af && this.f != null) {
/* 1475 */       this.c.e();
/*      */     }
/* 1477 */     this.A.c("textures");
/* 1478 */     if (!this.af) {
/* 1479 */       this.R.e();
/*      */     }
/*      */     
/* 1482 */     if (this.m == null && this.h != null) {
/* 1483 */       if (this.h.bn() <= 0.0F) {
/* 1484 */         a((axu)null);
/* 1485 */       } else if (this.h.bJ() && this.f != null) {
/* 1486 */         a(new axk());
/*      */       } 
/* 1488 */     } else if (this.m != null && this.m instanceof axk && !this.h.bJ()) {
/* 1489 */       a((axu)null);
/*      */     } 
/*      */     
/* 1492 */     if (this.m != null) {
/* 1493 */       this.ag = 10000;
/*      */     }
/*      */     
/* 1496 */     if (this.m != null) {
/*      */       try {
/* 1498 */         this.m.p();
/* 1499 */       } catch (Throwable ☃) {
/* 1500 */         b b1 = b.a(☃, "Updating screen events");
/* 1501 */         c c = b1.a("Affected screen");
/* 1502 */         c.a("Screen name", new Callable<String>(this)
/*      */             {
/*      */               public String a() throws Exception {
/* 1505 */                 return this.a.m.getClass().getCanonicalName();
/*      */               }
/*      */             });
/* 1508 */         throw new e(b1);
/*      */       } 
/*      */       
/* 1511 */       if (this.m != null) {
/*      */         try {
/* 1513 */           this.m.e();
/* 1514 */         } catch (Throwable ☃) {
/* 1515 */           b b1 = b.a(☃, "Ticking screen");
/* 1516 */           c c = b1.a("Affected screen");
/* 1517 */           c.a("Screen name", new Callable<String>(this)
/*      */               {
/*      */                 public String a() throws Exception {
/* 1520 */                   return this.a.m.getClass().getCanonicalName();
/*      */                 }
/*      */               });
/* 1523 */           throw new e(b1);
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1528 */     if (this.m == null || this.m.p) {
/* 1529 */       this.A.c("mouse");
/*      */       
/* 1531 */       while (Mouse.next()) {
/* 1532 */         int j = Mouse.getEventButton();
/*      */         
/* 1534 */         avb.a(j - 100, Mouse.getEventButtonState());
/* 1535 */         if (Mouse.getEventButtonState()) {
/* 1536 */           if (this.h.v() && j == 2) {
/* 1537 */             this.q.g().b();
/*      */           } else {
/* 1539 */             avb.a(j - 100);
/*      */           } 
/*      */         }
/*      */         
/* 1543 */         long l = J() - this.x;
/* 1544 */         if (l > 200L) {
/*      */           continue;
/*      */         }
/*      */         
/* 1548 */         int k = Mouse.getEventDWheel();
/* 1549 */         if (k != 0) {
/* 1550 */           if (this.h.v()) {
/* 1551 */             k = (k < 0) ? -1 : 1;
/*      */             
/* 1553 */             if (this.q.g().a()) {
/* 1554 */               this.q.g().b(-k);
/*      */             } else {
/* 1556 */               float f = ns.a(this.h.bA.a() + k * 0.005F, 0.0F, 0.2F);
/* 1557 */               this.h.bA.a(f);
/*      */             } 
/*      */           } else {
/* 1560 */             this.h.bi.d(k);
/*      */           } 
/*      */         }
/*      */         
/* 1564 */         if (this.m == null) {
/* 1565 */           if (!this.w && Mouse.getEventButtonState())
/* 1566 */             n();  continue;
/*      */         } 
/* 1568 */         if (this.m != null) {
/* 1569 */           this.m.k();
/*      */         }
/*      */       } 
/*      */       
/* 1573 */       if (this.ag > 0) {
/* 1574 */         this.ag--;
/*      */       }
/*      */       
/* 1577 */       this.A.c("keyboard");
/* 1578 */       while (Keyboard.next()) {
/* 1579 */         int j = (Keyboard.getEventKey() == 0) ? (Keyboard.getEventCharacter() + 256) : Keyboard.getEventKey();
/* 1580 */         avb.a(j, Keyboard.getEventKeyState());
/*      */         
/* 1582 */         if (Keyboard.getEventKeyState()) {
/* 1583 */           avb.a(j);
/*      */         }
/*      */         
/* 1586 */         if (this.ax > 0L) {
/* 1587 */           if (J() - this.ax >= 6000L) {
/* 1588 */             throw new e(new b("Manually triggered debug crash", new Throwable()));
/*      */           }
/*      */           
/* 1591 */           if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
/* 1592 */             this.ax = -1L;
/*      */           }
/* 1594 */         } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
/* 1595 */           this.ax = J();
/*      */         } 
/*      */         
/* 1598 */         Z();
/*      */         
/* 1600 */         if (Keyboard.getEventKeyState()) {
/* 1601 */           if (j == 62 && 
/* 1602 */             this.o != null) {
/* 1603 */             this.o.c();
/*      */           }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1672 */           if (this.m != null) {
/* 1673 */             this.m.l();
/*      */           } else {
/* 1675 */             if (j == 1) {
/* 1676 */               p();
/*      */             }
/*      */             
/* 1679 */             if (j == 32 && Keyboard.isKeyDown(61) && 
/* 1680 */               this.q != null) {
/* 1681 */               this.q.d().a();
/*      */             }
/*      */             
/* 1684 */             if (j == 31 && Keyboard.isKeyDown(61)) {
/* 1685 */               e();
/*      */             }
/* 1687 */             if (j != 17 || Keyboard.isKeyDown(61));
/*      */ 
/*      */             
/* 1690 */             if (j != 18 || Keyboard.isKeyDown(61));
/*      */ 
/*      */             
/* 1693 */             if (j != 47 || Keyboard.isKeyDown(61));
/*      */ 
/*      */             
/* 1696 */             if (j != 38 || Keyboard.isKeyDown(61));
/*      */ 
/*      */             
/* 1699 */             if (j != 22 || Keyboard.isKeyDown(61));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1707 */             if (j == 20 && Keyboard.isKeyDown(61)) {
/* 1708 */               e();
/*      */             }
/* 1710 */             if (j == 33 && Keyboard.isKeyDown(61)) {
/* 1711 */               this.t.a(avh.a.f, axu.r() ? -1 : 1);
/*      */             }
/* 1713 */             if (j == 30 && Keyboard.isKeyDown(61)) {
/* 1714 */               this.g.a();
/*      */             }
/* 1716 */             if (j == 35 && Keyboard.isKeyDown(61)) {
/* 1717 */               this.t.y = !this.t.y;
/* 1718 */               this.t.b();
/*      */             } 
/* 1720 */             if (j == 48 && Keyboard.isKeyDown(61)) {
/* 1721 */               this.aa.b(!this.aa.b());
/*      */             }
/* 1723 */             if (j == 25 && Keyboard.isKeyDown(61)) {
/* 1724 */               this.t.z = !this.t.z;
/* 1725 */               this.t.b();
/*      */             } 
/* 1727 */             if (j == 59) {
/* 1728 */               this.t.az = !this.t.az;
/*      */             }
/* 1730 */             if (j == 61) {
/* 1731 */               this.t.aB = !this.t.aB;
/* 1732 */               this.t.aC = axu.r();
/* 1733 */               this.t.aD = axu.s();
/*      */             } 
/* 1735 */             if (this.t.an.f()) {
/* 1736 */               this.t.aA++;
/* 1737 */               if (this.t.aA > 2) {
/* 1738 */                 this.t.aA = 0;
/*      */               }
/* 1740 */               if (this.t.aA == 0) {
/* 1741 */                 this.o.a(ac());
/* 1742 */               } else if (this.t.aA == 1) {
/* 1743 */                 this.o.a((pk)null);
/*      */               } 
/* 1745 */               this.g.m();
/*      */             } 
/* 1747 */             if (this.t.ao.f()) {
/* 1748 */               this.t.aF = !this.t.aF;
/*      */             }
/*      */           } 
/*      */           
/* 1752 */           if (this.t.aB && this.t.aC) {
/* 1753 */             if (j == 11) {
/* 1754 */               b(0);
/*      */             }
/* 1756 */             for (int k = 0; k < 9; k++) {
/* 1757 */               if (j == 2 + k) {
/* 1758 */                 b(k + 1);
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1765 */       for (int i = 0; i < 9; i++) {
/* 1766 */         if (this.t.av[i].f()) {
/* 1767 */           if (this.h.v()) {
/* 1768 */             this.q.g().a(i);
/*      */           } else {
/* 1770 */             this.h.bi.c = i;
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/* 1775 */       boolean ☃ = (this.t.m != wn.b.c);
/*      */       
/* 1777 */       while (this.t.ae.f()) {
/* 1778 */         if (this.c.j()) {
/* 1779 */           this.h.u(); continue;
/*      */         } 
/* 1781 */         u().a(new ig(ig.a.c));
/* 1782 */         a(new azc(this.h));
/*      */       } 
/*      */       
/* 1785 */       while (this.t.ag.f()) {
/* 1786 */         if (!this.h.v()) {
/* 1787 */           this.h.a(axu.q());
/*      */         }
/*      */       } 
/* 1790 */       while (this.t.aj.f() && ☃) {
/* 1791 */         a(new awv());
/*      */       }
/* 1793 */       if (this.m == null && this.t.al.f() && ☃) {
/* 1794 */         a(new awv("/"));
/*      */       }
/*      */       
/* 1797 */       if (this.h.bS()) {
/* 1798 */         if (!this.t.af.d()) {
/* 1799 */           this.c.c(this.h);
/*      */         }
/*      */         
/* 1802 */         while (this.t.ah.f());
/*      */         
/* 1804 */         while (this.t.af.f());
/*      */         
/* 1806 */         while (this.t.ai.f());
/*      */       } else {
/*      */         
/* 1809 */         while (this.t.ah.f()) {
/* 1810 */           aw();
/*      */         }
/* 1812 */         while (this.t.af.f()) {
/* 1813 */           ax();
/*      */         }
/* 1815 */         while (this.t.ai.f()) {
/* 1816 */           az();
/*      */         }
/*      */       } 
/*      */       
/* 1820 */       if (this.t.af.d() && this.ap == 0 && !this.h.bS()) {
/* 1821 */         ax();
/*      */       }
/*      */       
/* 1824 */       b((this.m == null && this.t.ah.d() && this.w));
/*      */     } 
/*      */     
/* 1827 */     if (this.f != null) {
/* 1828 */       if (this.h != null) {
/* 1829 */         this.as++;
/* 1830 */         if (this.as == 30) {
/* 1831 */           this.as = 0;
/* 1832 */           this.f.h(this.h);
/*      */         } 
/*      */       } 
/*      */       
/* 1836 */       this.A.c("gameRenderer");
/* 1837 */       if (!this.af) {
/* 1838 */         this.o.e();
/*      */       }
/* 1840 */       this.A.c("levelRenderer");
/* 1841 */       if (!this.af) {
/* 1842 */         this.g.j();
/*      */       }
/* 1844 */       this.A.c("level");
/* 1845 */       if (!this.af) {
/*      */         
/* 1847 */         if (this.f.ac() > 0) {
/* 1848 */           this.f.d(this.f.ac() - 1);
/*      */         }
/* 1850 */         this.f.i();
/*      */       } 
/* 1852 */     } else if (this.o.a()) {
/* 1853 */       this.o.b();
/*      */     } 
/*      */ 
/*      */     
/* 1857 */     if (!this.af) {
/* 1858 */       this.aI.c();
/* 1859 */       this.aH.c();
/*      */     } 
/*      */     
/* 1862 */     if (this.f != null) {
/* 1863 */       if (!this.af) {
/* 1864 */         this.f.a((this.f.aa() != oj.a), true);
/*      */         
/*      */         try {
/* 1867 */           this.f.c();
/* 1868 */         } catch (Throwable ☃) {
/* 1869 */           b b1 = b.a(☃, "Exception in world tick");
/* 1870 */           if (this.f == null) {
/* 1871 */             c c = b1.a("Affected level");
/* 1872 */             c.a("Problem", "Level is null!");
/*      */           } else {
/* 1874 */             this.f.a(b1);
/*      */           } 
/* 1876 */           throw new e(b1);
/*      */         } 
/*      */       } 
/* 1879 */       this.A.c("animateTick");
/* 1880 */       if (!this.af && this.f != null) {
/* 1881 */         this.f.b(ns.c(this.h.s), ns.c(this.h.t), ns.c(this.h.u));
/*      */       }
/* 1883 */       this.A.c("particles");
/* 1884 */       if (!this.af) {
/* 1885 */         this.j.a();
/*      */       }
/* 1887 */     } else if (this.av != null) {
/* 1888 */       this.A.c("pendingConnection");
/* 1889 */       this.av.a();
/*      */     } 
/*      */     
/* 1892 */     this.A.b();
/*      */     
/* 1894 */     this.x = J();
/*      */   }
/*      */   
/*      */   public void a(String ☃, String str1, adp adp1) {
/* 1898 */     a((bdb)null);
/* 1899 */     System.gc();
/*      */     
/* 1901 */     atp atp = this.an.a(☃, false);
/* 1902 */     ato ato = atp.d();
/*      */     
/* 1904 */     if (ato == null && adp1 != null) {
/* 1905 */       ato = new ato(adp1, ☃);
/* 1906 */       atp.a(ato);
/*      */     } 
/*      */     
/* 1909 */     if (adp1 == null) {
/* 1910 */       adp1 = new adp(ato);
/*      */     }
/*      */     
/*      */     try {
/* 1914 */       this.aj = new bpo(this, ☃, str1, adp1);
/* 1915 */       this.aj.D();
/* 1916 */       this.aw = true;
/* 1917 */     } catch (Throwable throwable) {
/* 1918 */       b b1 = b.a(throwable, "Starting integrated server");
/* 1919 */       c c = b1.a("Starting integrated server");
/*      */       
/* 1921 */       c.a("Level ID", ☃);
/* 1922 */       c.a("Level Name", str1);
/*      */       
/* 1924 */       throw new e(b1);
/*      */     } 
/*      */     
/* 1927 */     this.n.a(bnq.a("menu.loadingLevel", new Object[0]));
/* 1928 */     while (!this.aj.ar()) {
/* 1929 */       String str = this.aj.j();
/* 1930 */       if (str != null) {
/* 1931 */         this.n.c(bnq.a(str, new Object[0]));
/*      */       } else {
/* 1933 */         this.n.c("");
/*      */       } 
/*      */       try {
/* 1936 */         Thread.sleep(200L);
/* 1937 */       } catch (InterruptedException interruptedException) {}
/*      */     } 
/*      */     
/* 1940 */     a((axu)null);
/*      */     
/* 1942 */     SocketAddress socketAddress = this.aj.aq().a();
/* 1943 */     ek ek1 = ek.a(socketAddress);
/* 1944 */     ek1.a(new bcx(ek1, this, null));
/* 1945 */     ek1.a(new jc(47, socketAddress.toString(), 0, el.d));
/* 1946 */     ek1.a(new jl(L().e()));
/* 1947 */     this.av = ek1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bdb ☃) {
/* 1956 */     a(☃, "");
/*      */   }
/*      */   
/*      */   public void a(bdb ☃, String str) {
/* 1960 */     if (☃ == null) {
/*      */       
/* 1962 */       bcy bcy = u();
/* 1963 */       if (bcy != null) {
/* 1964 */         bcy.b();
/*      */       }
/*      */       
/* 1967 */       if (this.aj != null && this.aj.O()) {
/* 1968 */         this.aj.w();
/* 1969 */         this.aj.a();
/*      */       } 
/* 1971 */       this.aj = null;
/* 1972 */       this.p.b();
/*      */       
/* 1974 */       this.o.k().a();
/*      */     } 
/*      */     
/* 1977 */     this.ad = null;
/* 1978 */     this.av = null;
/*      */     
/* 1980 */     if (this.n != null) {
/* 1981 */       this.n.b(str);
/* 1982 */       this.n.c("");
/*      */     } 
/*      */     
/* 1985 */     if (☃ == null && this.f != null) {
/* 1986 */       this.aC.f();
/* 1987 */       this.q.i();
/* 1988 */       a((bde)null);
/* 1989 */       this.aw = false;
/*      */     } 
/*      */     
/* 1992 */     this.aH.b();
/*      */     
/* 1994 */     this.f = ☃;
/*      */     
/* 1996 */     if (☃ != null) {
/* 1997 */       if (this.g != null) {
/* 1998 */         this.g.a(☃);
/*      */       }
/* 2000 */       if (this.j != null) {
/* 2001 */         this.j.a(☃);
/*      */       }
/*      */       
/* 2004 */       if (this.h == null) {
/* 2005 */         this.h = this.c.a(☃, new nb());
/* 2006 */         this.c.b(this.h);
/*      */       } 
/*      */       
/* 2009 */       this.h.I();
/* 2010 */       ☃.d(this.h);
/*      */       
/* 2012 */       this.h.b = new bev(this.t);
/*      */       
/* 2014 */       this.c.a(this.h);
/* 2015 */       this.ad = this.h;
/*      */     } else {
/* 2017 */       this.an.d();
/* 2018 */       this.h = null;
/*      */     } 
/*      */     
/* 2021 */     System.gc();
/* 2022 */     this.x = 0L;
/*      */   }
/*      */   
/*      */   public void a(int ☃) {
/* 2026 */     this.f.g();
/* 2027 */     this.f.a();
/*      */     
/* 2029 */     int i = 0;
/* 2030 */     String str = null;
/* 2031 */     if (this.h != null) {
/* 2032 */       i = this.h.F();
/* 2033 */       this.f.e(this.h);
/* 2034 */       str = this.h.w();
/*      */     } 
/*      */     
/* 2037 */     this.ad = null;
/* 2038 */     bew bew1 = this.h;
/* 2039 */     this.h = this.c.a(this.f, (this.h == null) ? new nb() : this.h.x());
/* 2040 */     this.h.H().a(bew1.H().c());
/* 2041 */     this.h.am = ☃;
/* 2042 */     this.ad = this.h;
/* 2043 */     this.h.I();
/* 2044 */     this.h.f(str);
/* 2045 */     this.f.d(this.h);
/* 2046 */     this.c.b(this.h);
/*      */     
/* 2048 */     this.h.b = new bev(this.t);
/* 2049 */     this.h.d(i);
/* 2050 */     this.c.a(this.h);
/* 2051 */     this.h.k(bew1.cq());
/*      */     
/* 2053 */     if (this.m instanceof axe) {
/* 2054 */       a((axu)null);
/*      */     }
/*      */   }
/*      */   
/*      */   public final boolean t() {
/* 2059 */     return this.au;
/*      */   }
/*      */   
/*      */   public bcy u() {
/* 2063 */     if (this.h != null) {
/* 2064 */       return this.h.a;
/*      */     }
/* 2066 */     return null;
/*      */   }
/*      */   
/*      */   public static boolean v() {
/* 2070 */     return (S == null || !S.t.az);
/*      */   }
/*      */   
/*      */   public static boolean w() {
/* 2074 */     return (S != null && S.t.i);
/*      */   }
/*      */   
/*      */   public static boolean x() {
/* 2078 */     return (S != null && S.t.j != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void az() {
/*      */     zw zw;
/* 2090 */     if (this.s == null) {
/*      */       return;
/*      */     }
/*      */     
/* 2094 */     boolean ☃ = this.h.bA.d;
/*      */     
/* 2096 */     int i = 0;
/* 2097 */     boolean bool1 = false;
/* 2098 */     akw akw = null;
/*      */     
/* 2100 */     if (this.s.a == auh.a.b) {
/* 2101 */       cj cj = this.s.a();
/*      */       
/* 2103 */       afh afh1 = this.f.p(cj).c();
/*      */       
/* 2105 */       if (afh1.t() == arm.a) {
/*      */         return;
/*      */       }
/*      */       
/* 2109 */       zw = afh1.c(this.f, cj);
/* 2110 */       if (zw == null) {
/*      */         return;
/*      */       }
/*      */       
/* 2114 */       if (☃ && axu.q()) {
/* 2115 */         akw = this.f.s(cj);
/*      */       }
/*      */       
/* 2118 */       afh afh2 = (zw instanceof yo && !afh1.M()) ? afh.a(zw) : afh1;
/* 2119 */       i = afh2.j(this.f, cj);
/* 2120 */       bool1 = zw.k();
/* 2121 */     } else if (this.s.a == auh.a.c && this.s.d != null && ☃) {
/* 2122 */       if (this.s.d instanceof uq) {
/* 2123 */         zw = zy.an;
/* 2124 */       } else if (this.s.d instanceof up) {
/* 2125 */         zw = zy.cn;
/* 2126 */       } else if (this.s.d instanceof uo) {
/* 2127 */         uo uo = (uo)this.s.d;
/* 2128 */         zx zx = uo.o();
/* 2129 */         if (zx == null) {
/* 2130 */           zw = zy.bP;
/*      */         } else {
/* 2132 */           zw = zx.b();
/* 2133 */           i = zx.i();
/* 2134 */           bool1 = true;
/*      */         } 
/* 2136 */       } else if (this.s.d instanceof va) {
/* 2137 */         va va = (va)this.s.d;
/*      */         
/* 2139 */         switch (null.b[va.s().ordinal()]) {
/*      */           case 1:
/* 2141 */             zw = zy.aO;
/*      */             break;
/*      */           case 2:
/* 2144 */             zw = zy.aN;
/*      */             break;
/*      */           case 3:
/* 2147 */             zw = zy.ch;
/*      */             break;
/*      */           case 4:
/* 2150 */             zw = zy.ci;
/*      */             break;
/*      */           case 5:
/* 2153 */             zw = zy.cp;
/*      */             break;
/*      */           default:
/* 2156 */             zw = zy.az;
/*      */             break;
/*      */         } 
/* 2159 */       } else if (this.s.d instanceof ux) {
/* 2160 */         zw = zy.aE;
/* 2161 */       } else if (this.s.d instanceof um) {
/* 2162 */         zw = zy.cj;
/*      */       } else {
/* 2164 */         zw = zy.bJ;
/* 2165 */         i = pm.a(this.s.d);
/* 2166 */         bool1 = true;
/*      */         
/* 2168 */         if (!pm.a.containsKey(Integer.valueOf(i))) {
/*      */           return;
/*      */         }
/*      */       } 
/*      */     } else {
/*      */       return;
/*      */     } 
/*      */     
/* 2176 */     wm wm = this.h.bi;
/* 2177 */     if (akw == null) {
/* 2178 */       wm.a(zw, i, bool1, ☃);
/*      */     } else {
/* 2180 */       zx zx = a(zw, i, akw);
/* 2181 */       wm.a(wm.c, zx);
/*      */     } 
/*      */     
/* 2184 */     if (☃) {
/* 2185 */       int j = this.h.bj.c.size() - 9 + wm.c;
/* 2186 */       this.c.a(wm.a(wm.c), j);
/*      */     } 
/*      */   }
/*      */   
/*      */   private zx a(zw ☃, int i, akw akw1) {
/* 2191 */     zx zx = new zx(☃, 1, i);
/* 2192 */     dn dn1 = new dn();
/* 2193 */     akw1.b(dn1);
/*      */     
/* 2195 */     if (☃ == zy.bX && dn1.c("Owner")) {
/* 2196 */       dn dn3 = dn1.m("Owner");
/* 2197 */       dn dn4 = new dn();
/* 2198 */       dn4.a("SkullOwner", dn3);
/* 2199 */       zx.d(dn4);
/* 2200 */       return zx;
/*      */     } 
/*      */     
/* 2203 */     zx.a("BlockEntityTag", dn1);
/* 2204 */     dn dn2 = new dn();
/*      */     
/* 2206 */     du du = new du();
/* 2207 */     du.a(new ea("(+NBT)"));
/* 2208 */     dn2.a("Lore", du);
/* 2209 */     zx.a("display", dn2);
/*      */     
/* 2211 */     return zx;
/*      */   }
/*      */ 
/*      */   
/*      */   public b b(b ☃) {
/* 2216 */     ☃.g().a("Launched Version", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2219 */             return ave.a(this.a);
/*      */           }
/*      */         });
/*      */     
/* 2223 */     ☃.g().a("LWJGL", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2226 */             return Sys.getVersion();
/*      */           }
/*      */         });
/*      */     
/* 2230 */     ☃.g().a("OpenGL", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2233 */             return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
/*      */           }
/*      */         });
/*      */     
/* 2237 */     ☃.g().a("GL Caps", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2240 */             return bqs.c();
/*      */           }
/*      */         });
/*      */     
/* 2244 */     ☃.g().a("Using VBOs", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2247 */             return this.a.t.u ? "Yes" : "No";
/*      */           }
/*      */         });
/*      */     
/* 2251 */     ☃.g().a("Is Modded", new Callable<String>(this)
/*      */         {
/*      */           public String a() throws Exception {
/* 2254 */             String ☃ = ClientBrandRetriever.getClientModName();
/* 2255 */             if (!☃.equals("vanilla")) {
/* 2256 */               return "Definitely; Client brand changed to '" + ☃ + "'";
/*      */             }
/* 2258 */             if (ave.class.getSigners() == null) {
/* 2259 */               return "Very likely; Jar signature invalidated";
/*      */             }
/* 2261 */             return "Probably not. Jar signature remains and client brand is untouched.";
/*      */           }
/*      */         });
/*      */     
/* 2265 */     ☃.g().a("Type", new Callable<String>(this)
/*      */         {
/*      */           public String a() throws Exception {
/* 2268 */             return "Client (map_client.txt)";
/*      */           }
/*      */         });
/*      */     
/* 2272 */     ☃.g().a("Resource Packs", new Callable<String>(this)
/*      */         {
/*      */           public String a() throws Exception {
/* 2275 */             StringBuilder ☃ = new StringBuilder();
/* 2276 */             for (Iterator<String> iterator = this.a.t.k.iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 2277 */               if (☃.length() > 0) {
/* 2278 */                 ☃.append(", ");
/*      */               }
/* 2280 */               ☃.append(str);
/* 2281 */               if (this.a.t.l.contains(str)) {
/* 2282 */                 ☃.append(" (incompatible)");
/*      */               } }
/*      */             
/* 2285 */             return ☃.toString();
/*      */           }
/*      */         });
/*      */     
/* 2289 */     ☃.g().a("Current Language", new Callable<String>(this)
/*      */         {
/*      */           public String a() throws Exception {
/* 2292 */             return ave.b(this.a).c().toString();
/*      */           }
/*      */         });
/*      */     
/* 2296 */     ☃.g().a("Profiler Position", new Callable<String>(this)
/*      */         {
/*      */           public String a() throws Exception {
/* 2299 */             return this.a.A.a ? this.a.A.c() : "N/A (disabled)";
/*      */           }
/*      */         });
/*      */     
/* 2303 */     ☃.g().a("CPU", new Callable<String>(this)
/*      */         {
/*      */           public String a() {
/* 2306 */             return bqs.j();
/*      */           }
/*      */         });
/*      */     
/* 2310 */     if (this.f != null) {
/* 2311 */       this.f.a(☃);
/*      */     }
/*      */     
/* 2314 */     return ☃;
/*      */   }
/*      */   
/*      */   public static ave A() {
/* 2318 */     return S;
/*      */   }
/*      */   
/*      */   public ListenableFuture<Object> B() {
/* 2322 */     return a(new Runnable(this)
/*      */         {
/*      */           public void run() {
/* 2325 */             this.a.e();
/*      */           }
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(or ☃) {
/* 2332 */     ☃.a("fps", Integer.valueOf(ao));
/* 2333 */     ☃.a("vsync_enabled", Boolean.valueOf(this.t.t));
/* 2334 */     ☃.a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
/* 2335 */     ☃.a("display_type", this.T ? "fullscreen" : "windowed");
/* 2336 */     ☃.a("run_time", Long.valueOf((MinecraftServer.az() - ☃.g()) / 60L * 1000L));
/* 2337 */     ☃.a("current_action", aA());
/*      */     
/* 2339 */     String str = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) ? "little" : "big";
/* 2340 */     ☃.a("endianness", str);
/*      */     
/* 2342 */     ☃.a("resource_packs", Integer.valueOf(this.aC.c().size()));
/* 2343 */     int i = 0;
/* 2344 */     for (Iterator<bnm.a> iterator = this.aC.c().iterator(); iterator.hasNext(); ) { bnm.a a = iterator.next();
/* 2345 */       ☃.a("resource_pack[" + i++ + "]", a.d()); }
/*      */ 
/*      */     
/* 2348 */     if (this.aj != null && this.aj.av() != null) {
/* 2349 */       ☃.a("snooper_partner", this.aj.av().f());
/*      */     }
/*      */   }
/*      */   
/*      */   private String aA() {
/* 2354 */     if (this.aj != null) {
/* 2355 */       if (this.aj.b()) {
/* 2356 */         return "hosting_lan";
/*      */       }
/* 2358 */       return "singleplayer";
/*      */     } 
/* 2360 */     if (this.Q != null) {
/* 2361 */       if (this.Q.d()) {
/* 2362 */         return "playing_lan";
/*      */       }
/* 2364 */       return "multiplayer";
/*      */     } 
/*      */     
/* 2367 */     return "out_of_game";
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(or ☃) {
/* 2372 */     ☃.b("opengl_version", GL11.glGetString(7938));
/* 2373 */     ☃.b("opengl_vendor", GL11.glGetString(7936));
/* 2374 */     ☃.b("client_brand", ClientBrandRetriever.getClientModName());
/* 2375 */     ☃.b("launched_version", this.al);
/*      */     
/* 2377 */     ContextCapabilities contextCapabilities = GLContext.getCapabilities();
/* 2378 */     ☃.b("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(contextCapabilities.GL_ARB_arrays_of_arrays));
/* 2379 */     ☃.b("gl_caps[ARB_base_instance]", Boolean.valueOf(contextCapabilities.GL_ARB_base_instance));
/* 2380 */     ☃.b("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(contextCapabilities.GL_ARB_blend_func_extended));
/* 2381 */     ☃.b("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_clear_buffer_object));
/* 2382 */     ☃.b("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(contextCapabilities.GL_ARB_color_buffer_float));
/* 2383 */     ☃.b("gl_caps[ARB_compatibility]", Boolean.valueOf(contextCapabilities.GL_ARB_compatibility));
/* 2384 */     ☃.b("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(contextCapabilities.GL_ARB_compressed_texture_pixel_storage));
/* 2385 */     ☃.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_compute_shader));
/* 2386 */     ☃.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(contextCapabilities.GL_ARB_copy_buffer));
/* 2387 */     ☃.b("gl_caps[ARB_copy_image]", Boolean.valueOf(contextCapabilities.GL_ARB_copy_image));
/* 2388 */     ☃.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(contextCapabilities.GL_ARB_depth_buffer_float));
/* 2389 */     ☃.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_compute_shader));
/* 2390 */     ☃.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(contextCapabilities.GL_ARB_copy_buffer));
/* 2391 */     ☃.b("gl_caps[ARB_copy_image]", Boolean.valueOf(contextCapabilities.GL_ARB_copy_image));
/* 2392 */     ☃.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(contextCapabilities.GL_ARB_depth_buffer_float));
/* 2393 */     ☃.b("gl_caps[ARB_depth_clamp]", Boolean.valueOf(contextCapabilities.GL_ARB_depth_clamp));
/* 2394 */     ☃.b("gl_caps[ARB_depth_texture]", Boolean.valueOf(contextCapabilities.GL_ARB_depth_texture));
/* 2395 */     ☃.b("gl_caps[ARB_draw_buffers]", Boolean.valueOf(contextCapabilities.GL_ARB_draw_buffers));
/* 2396 */     ☃.b("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(contextCapabilities.GL_ARB_draw_buffers_blend));
/* 2397 */     ☃.b("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(contextCapabilities.GL_ARB_draw_elements_base_vertex));
/* 2398 */     ☃.b("gl_caps[ARB_draw_indirect]", Boolean.valueOf(contextCapabilities.GL_ARB_draw_indirect));
/* 2399 */     ☃.b("gl_caps[ARB_draw_instanced]", Boolean.valueOf(contextCapabilities.GL_ARB_draw_instanced));
/* 2400 */     ☃.b("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(contextCapabilities.GL_ARB_explicit_attrib_location));
/* 2401 */     ☃.b("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(contextCapabilities.GL_ARB_explicit_uniform_location));
/* 2402 */     ☃.b("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(contextCapabilities.GL_ARB_fragment_layer_viewport));
/* 2403 */     ☃.b("gl_caps[ARB_fragment_program]", Boolean.valueOf(contextCapabilities.GL_ARB_fragment_program));
/* 2404 */     ☃.b("gl_caps[ARB_fragment_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_fragment_shader));
/* 2405 */     ☃.b("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(contextCapabilities.GL_ARB_fragment_program_shadow));
/* 2406 */     ☃.b("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_framebuffer_object));
/* 2407 */     ☃.b("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(contextCapabilities.GL_ARB_framebuffer_sRGB));
/* 2408 */     ☃.b("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(contextCapabilities.GL_ARB_geometry_shader4));
/* 2409 */     ☃.b("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(contextCapabilities.GL_ARB_gpu_shader5));
/* 2410 */     ☃.b("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(contextCapabilities.GL_ARB_half_float_pixel));
/* 2411 */     ☃.b("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(contextCapabilities.GL_ARB_half_float_vertex));
/* 2412 */     ☃.b("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(contextCapabilities.GL_ARB_instanced_arrays));
/* 2413 */     ☃.b("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(contextCapabilities.GL_ARB_map_buffer_alignment));
/* 2414 */     ☃.b("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(contextCapabilities.GL_ARB_map_buffer_range));
/* 2415 */     ☃.b("gl_caps[ARB_multisample]", Boolean.valueOf(contextCapabilities.GL_ARB_multisample));
/* 2416 */     ☃.b("gl_caps[ARB_multitexture]", Boolean.valueOf(contextCapabilities.GL_ARB_multitexture));
/* 2417 */     ☃.b("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(contextCapabilities.GL_ARB_occlusion_query2));
/* 2418 */     ☃.b("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_pixel_buffer_object));
/* 2419 */     ☃.b("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(contextCapabilities.GL_ARB_seamless_cube_map));
/* 2420 */     ☃.b("gl_caps[ARB_shader_objects]", Boolean.valueOf(contextCapabilities.GL_ARB_shader_objects));
/* 2421 */     ☃.b("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(contextCapabilities.GL_ARB_shader_stencil_export));
/* 2422 */     ☃.b("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(contextCapabilities.GL_ARB_shader_texture_lod));
/* 2423 */     ☃.b("gl_caps[ARB_shadow]", Boolean.valueOf(contextCapabilities.GL_ARB_shadow));
/* 2424 */     ☃.b("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(contextCapabilities.GL_ARB_shadow_ambient));
/* 2425 */     ☃.b("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(contextCapabilities.GL_ARB_stencil_texturing));
/* 2426 */     ☃.b("gl_caps[ARB_sync]", Boolean.valueOf(contextCapabilities.GL_ARB_sync));
/* 2427 */     ☃.b("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_tessellation_shader));
/* 2428 */     ☃.b("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_border_clamp));
/* 2429 */     ☃.b("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_buffer_object));
/* 2430 */     ☃.b("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_cube_map));
/* 2431 */     ☃.b("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_cube_map_array));
/* 2432 */     ☃.b("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(contextCapabilities.GL_ARB_texture_non_power_of_two));
/* 2433 */     ☃.b("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_uniform_buffer_object));
/* 2434 */     ☃.b("gl_caps[ARB_vertex_blend]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_blend));
/* 2435 */     ☃.b("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_buffer_object));
/* 2436 */     ☃.b("gl_caps[ARB_vertex_program]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_program));
/* 2437 */     ☃.b("gl_caps[ARB_vertex_shader]", Boolean.valueOf(contextCapabilities.GL_ARB_vertex_shader));
/*      */     
/* 2439 */     ☃.b("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(contextCapabilities.GL_EXT_bindable_uniform));
/* 2440 */     ☃.b("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(contextCapabilities.GL_EXT_blend_equation_separate));
/* 2441 */     ☃.b("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(contextCapabilities.GL_EXT_blend_func_separate));
/* 2442 */     ☃.b("gl_caps[EXT_blend_minmax]", Boolean.valueOf(contextCapabilities.GL_EXT_blend_minmax));
/* 2443 */     ☃.b("gl_caps[EXT_blend_subtract]", Boolean.valueOf(contextCapabilities.GL_EXT_blend_subtract));
/* 2444 */     ☃.b("gl_caps[EXT_draw_instanced]", Boolean.valueOf(contextCapabilities.GL_EXT_draw_instanced));
/* 2445 */     ☃.b("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(contextCapabilities.GL_EXT_framebuffer_multisample));
/* 2446 */     ☃.b("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(contextCapabilities.GL_EXT_framebuffer_object));
/* 2447 */     ☃.b("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(contextCapabilities.GL_EXT_framebuffer_sRGB));
/* 2448 */     ☃.b("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(contextCapabilities.GL_EXT_geometry_shader4));
/* 2449 */     ☃.b("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(contextCapabilities.GL_EXT_gpu_program_parameters));
/* 2450 */     ☃.b("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(contextCapabilities.GL_EXT_gpu_shader4));
/* 2451 */     ☃.b("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(contextCapabilities.GL_EXT_multi_draw_arrays));
/* 2452 */     ☃.b("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(contextCapabilities.GL_EXT_packed_depth_stencil));
/* 2453 */     ☃.b("gl_caps[EXT_paletted_texture]", Boolean.valueOf(contextCapabilities.GL_EXT_paletted_texture));
/* 2454 */     ☃.b("gl_caps[EXT_rescale_normal]", Boolean.valueOf(contextCapabilities.GL_EXT_rescale_normal));
/* 2455 */     ☃.b("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(contextCapabilities.GL_EXT_separate_shader_objects));
/* 2456 */     ☃.b("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(contextCapabilities.GL_EXT_shader_image_load_store));
/* 2457 */     ☃.b("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(contextCapabilities.GL_EXT_shadow_funcs));
/* 2458 */     ☃.b("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(contextCapabilities.GL_EXT_shared_texture_palette));
/* 2459 */     ☃.b("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(contextCapabilities.GL_EXT_stencil_clear_tag));
/* 2460 */     ☃.b("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(contextCapabilities.GL_EXT_stencil_two_side));
/* 2461 */     ☃.b("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(contextCapabilities.GL_EXT_stencil_wrap));
/* 2462 */     ☃.b("gl_caps[EXT_texture_3d]", Boolean.valueOf(contextCapabilities.GL_EXT_texture_3d));
/* 2463 */     ☃.b("gl_caps[EXT_texture_array]", Boolean.valueOf(contextCapabilities.GL_EXT_texture_array));
/* 2464 */     ☃.b("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(contextCapabilities.GL_EXT_texture_buffer_object));
/* 2465 */     ☃.b("gl_caps[EXT_texture_integer]", Boolean.valueOf(contextCapabilities.GL_EXT_texture_integer));
/* 2466 */     ☃.b("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(contextCapabilities.GL_EXT_texture_lod_bias));
/* 2467 */     ☃.b("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(contextCapabilities.GL_EXT_texture_sRGB));
/* 2468 */     ☃.b("gl_caps[EXT_vertex_shader]", Boolean.valueOf(contextCapabilities.GL_EXT_vertex_shader));
/* 2469 */     ☃.b("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(contextCapabilities.GL_EXT_vertex_weighting));
/*      */     
/* 2471 */     ☃.b("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
/* 2472 */     GL11.glGetError();
/* 2473 */     ☃.b("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
/* 2474 */     GL11.glGetError();
/* 2475 */     ☃.b("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(GL11.glGetInteger(34921)));
/* 2476 */     GL11.glGetError();
/* 2477 */     ☃.b("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35660)));
/* 2478 */     GL11.glGetError();
/* 2479 */     ☃.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(34930)));
/* 2480 */     GL11.glGetError();
/* 2481 */     ☃.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35071)));
/* 2482 */     GL11.glGetError();
/*      */     
/* 2484 */     ☃.b("gl_max_texture_size", Integer.valueOf(C()));
/*      */   }
/*      */   
/*      */   public static int C() {
/* 2488 */     for (int ☃ = 16384; ☃ > 0; ☃ >>= 1) {
/* 2489 */       GL11.glTexImage2D(32868, 0, 6408, ☃, ☃, 0, 6408, 5121, (ByteBuffer)null);
/* 2490 */       int i = GL11.glGetTexLevelParameteri(32868, 0, 4096);
/* 2491 */       if (i != 0) {
/* 2492 */         return ☃;
/*      */       }
/*      */     } 
/* 2495 */     return -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean ad() {
/* 2500 */     return this.t.r;
/*      */   }
/*      */   
/*      */   public void a(bde ☃) {
/* 2504 */     this.Q = ☃;
/*      */   }
/*      */   
/*      */   public bde D() {
/* 2508 */     return this.Q;
/*      */   }
/*      */   
/*      */   public boolean E() {
/* 2512 */     return this.aw;
/*      */   }
/*      */   
/*      */   public boolean F() {
/* 2516 */     return (this.aw && this.aj != null);
/*      */   }
/*      */   
/*      */   public bpo G() {
/* 2520 */     return this.aj;
/*      */   }
/*      */   
/*      */   public static void H() {
/* 2524 */     if (S == null) {
/*      */       return;
/*      */     }
/*      */     
/* 2528 */     bpo ☃ = S.G();
/* 2529 */     if (☃ != null) {
/* 2530 */       ☃.t();
/*      */     }
/*      */   }
/*      */   
/*      */   public or I() {
/* 2535 */     return this.Z;
/*      */   }
/*      */   
/*      */   public static long J() {
/* 2539 */     return Sys.getTime() * 1000L / Sys.getTimerResolution();
/*      */   }
/*      */   
/*      */   public boolean K() {
/* 2543 */     return this.T;
/*      */   }
/*      */   
/*      */   public avm L() {
/* 2547 */     return this.ae;
/*      */   }
/*      */   
/*      */   public PropertyMap M() {
/* 2551 */     return this.O;
/*      */   }
/*      */   
/*      */   public PropertyMap N() {
/* 2555 */     if (this.P.isEmpty()) {
/* 2556 */       GameProfile ☃ = aa().fillProfileProperties(this.ae.e(), false);
/* 2557 */       this.P.putAll((Multimap)☃.getProperties());
/*      */     } 
/*      */     
/* 2560 */     return this.P;
/*      */   }
/*      */   
/*      */   public Proxy O() {
/* 2564 */     return this.am;
/*      */   }
/*      */   
/*      */   public bmj P() {
/* 2568 */     return this.R;
/*      */   }
/*      */   
/*      */   public bni Q() {
/* 2572 */     return this.ay;
/*      */   }
/*      */   
/*      */   public bnm R() {
/* 2576 */     return this.aC;
/*      */   }
/*      */   
/*      */   public bns S() {
/* 2580 */     return this.aD;
/*      */   }
/*      */   
/*      */   public bmh T() {
/* 2584 */     return this.aG;
/*      */   }
/*      */   
/*      */   public boolean U() {
/* 2588 */     return this.at;
/*      */   }
/*      */   
/*      */   public boolean V() {
/* 2592 */     return this.af;
/*      */   }
/*      */   
/*      */   public bpz W() {
/* 2596 */     return this.aH;
/*      */   }
/*      */   
/*      */   public bpv.a X() {
/* 2600 */     if (this.h != null) {
/* 2601 */       if (this.h.o.t instanceof ann)
/* 2602 */         return bpv.a.e; 
/* 2603 */       if (this.h.o.t instanceof anp) {
/* 2604 */         if (bfc.c != null && bfc.b > 0) {
/* 2605 */           return bpv.a.f;
/*      */         }
/* 2607 */         return bpv.a.g;
/*      */       } 
/*      */ 
/*      */       
/* 2611 */       if (this.h.bA.d && this.h.bA.c) {
/* 2612 */         return bpv.a.c;
/*      */       }
/*      */       
/* 2615 */       return bpv.a.b;
/*      */     } 
/*      */     
/* 2618 */     return bpv.a.a;
/*      */   }
/*      */   
/*      */   public bqm Y() {
/* 2622 */     return this.aE;
/*      */   }
/*      */   
/*      */   public void Z() {
/* 2626 */     int ☃ = (Keyboard.getEventKey() == 0) ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
/* 2627 */     if (☃ == 0 || Keyboard.isRepeatEvent()) {
/*      */       return;
/*      */     }
/*      */     
/* 2631 */     if (this.m instanceof ayj && ((ayj)this.m).g > J() - 20L) {
/*      */       return;
/*      */     }
/*      */     
/* 2635 */     if (Keyboard.getEventKeyState()) {
/* 2636 */       if (☃ == this.t.ar.i()) {
/* 2637 */         if (Y().k()) {
/* 2638 */           Y().r();
/* 2639 */         } else if (Y().j()) {
/* 2640 */           a(new awy(new awx(this)
/*      */                 {
/*      */                   public void a(boolean ☃, int i) {
/* 2643 */                     if (☃) {
/* 2644 */                       this.a.Y().q();
/*      */                     }
/* 2646 */                     this.a.a((axu)null);
/*      */                   }
/*      */                 },  bnq.a("stream.confirm_start", new Object[0]), "", 0));
/* 2649 */         } else if (!Y().A() || !Y().i()) {
/* 2650 */           baa.a(this.m);
/* 2651 */         } else if (this.f != null) {
/* 2652 */           this.q.d().a(new fa("Not ready to start streaming yet!"));
/*      */         } 
/* 2654 */       } else if (☃ == this.t.as.i()) {
/* 2655 */         if (Y().k()) {
/* 2656 */           if (Y().l()) {
/* 2657 */             Y().o();
/*      */           } else {
/* 2659 */             Y().n();
/*      */           } 
/*      */         }
/* 2662 */       } else if (☃ == this.t.at.i()) {
/* 2663 */         if (Y().k()) {
/* 2664 */           Y().m();
/*      */         }
/* 2666 */       } else if (☃ == this.t.au.i()) {
/* 2667 */         this.aE.a(true);
/* 2668 */       } else if (☃ == this.t.ap.i()) {
/* 2669 */         q();
/* 2670 */       } else if (☃ == this.t.am.i()) {
/* 2671 */         this.q.d().a(avj.a(this.v, this.d, this.e, this.aF));
/*      */       }
/*      */     
/* 2674 */     } else if (☃ == this.t.au.i()) {
/* 2675 */       this.aE.a(false);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public MinecraftSessionService aa() {
/* 2681 */     return this.aK;
/*      */   }
/*      */   
/*      */   public bnp ab() {
/* 2685 */     return this.aL;
/*      */   }
/*      */   
/*      */   public pk ac() {
/* 2689 */     return this.ad;
/*      */   }
/*      */   
/*      */   public void a(pk ☃) {
/* 2693 */     this.ad = ☃;
/* 2694 */     this.o.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public <V> ListenableFuture<V> a(Callable<V> ☃) {
/* 2699 */     Validate.notNull(☃);
/*      */     
/* 2701 */     if (!aJ()) {
/* 2702 */       ListenableFutureTask<V> listenableFutureTask = ListenableFutureTask.create(☃);
/* 2703 */       synchronized (this.aM) {
/* 2704 */         this.aM.add(listenableFutureTask);
/*      */       } 
/* 2706 */       return (ListenableFuture<V>)listenableFutureTask;
/*      */     } 
/*      */     try {
/* 2709 */       return Futures.immediateFuture(☃.call());
/* 2710 */     } catch (Exception exception) {
/* 2711 */       return (ListenableFuture<V>)Futures.immediateFailedCheckedFuture(exception);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ListenableFuture<Object> a(Runnable ☃) {
/* 2718 */     Validate.notNull(☃);
/*      */     
/* 2720 */     return a(Executors.callable(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aJ() {
/* 2725 */     return (Thread.currentThread() == this.aO);
/*      */   }
/*      */   
/*      */   public bgd ae() {
/* 2729 */     return this.aQ;
/*      */   }
/*      */   
/*      */   public biu af() {
/* 2733 */     return this.aa;
/*      */   }
/*      */   
/*      */   public bjh ag() {
/* 2737 */     return this.ab;
/*      */   }
/*      */   
/*      */   public bfn ah() {
/* 2741 */     return this.ac;
/*      */   }
/*      */   
/*      */   public static int ai() {
/* 2745 */     return ao;
/*      */   }
/*      */   
/*      */   public nh aj() {
/* 2749 */     return this.y;
/*      */   }
/*      */   
/*      */   public static Map<String, String> ak() {
/* 2753 */     Map<String, String> ☃ = Maps.newHashMap();
/* 2754 */     ☃.put("X-Minecraft-Username", A().L().c());
/* 2755 */     ☃.put("X-Minecraft-UUID", A().L().b());
/* 2756 */     ☃.put("X-Minecraft-Version", "1.8.8");
/* 2757 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean al() {
/* 2762 */     return this.X;
/*      */   }
/*      */   
/*      */   public void a(boolean ☃) {
/* 2766 */     this.X = ☃;
/*      */   }
/*      */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ave.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */