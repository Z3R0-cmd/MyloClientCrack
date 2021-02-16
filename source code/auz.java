/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.util.glu.GLU;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class auz
/*     */ {
/*  21 */   private static final IntBuffer a = avd.f(16);
/*  22 */   private static final FloatBuffer b = avd.h(16);
/*  23 */   private static final FloatBuffer c = avd.h(16);
/*  24 */   private static final FloatBuffer d = avd.h(3);
/*     */   
/*  26 */   private static aui e = new aui(0.0D, 0.0D, 0.0D);
/*     */   
/*     */   private static float f;
/*     */   private static float g;
/*     */   private static float h;
/*     */   private static float i;
/*     */   private static float j;
/*     */   
/*     */   public static void a(wn ☃, boolean bool) {
/*  35 */     bfl.a(2982, b);
/*  36 */     bfl.a(2983, c);
/*  37 */     GL11.glGetInteger(2978, a);
/*     */     
/*  39 */     float f1 = ((a.get(0) + a.get(2)) / 2);
/*  40 */     float f2 = ((a.get(1) + a.get(3)) / 2);
/*  41 */     GLU.gluUnProject(f1, f2, 0.0F, b, c, a, d);
/*     */     
/*  43 */     e = new aui(d.get(0), d.get(1), d.get(2));
/*     */     
/*  45 */     int i = bool ? 1 : 0;
/*     */     
/*  47 */     float f3 = ☃.z;
/*  48 */     float f4 = ☃.y;
/*     */     
/*  50 */     f = ns.b(f4 * 3.1415927F / 180.0F) * (1 - i * 2);
/*  51 */     h = ns.a(f4 * 3.1415927F / 180.0F) * (1 - i * 2);
/*     */     
/*  53 */     i = -h * ns.a(f3 * 3.1415927F / 180.0F) * (1 - i * 2);
/*  54 */     j = f * ns.a(f3 * 3.1415927F / 180.0F) * (1 - i * 2);
/*  55 */     g = ns.b(f3 * 3.1415927F / 180.0F);
/*     */   }
/*     */   
/*     */   public static aui a(pk ☃, double d) {
/*  59 */     double d1 = ☃.p + (☃.s - ☃.p) * d;
/*  60 */     double d2 = ☃.q + (☃.t - ☃.q) * d;
/*  61 */     double d3 = ☃.r + (☃.u - ☃.r) * d;
/*     */     
/*  63 */     double d4 = d1 + e.a;
/*  64 */     double d5 = d2 + e.b;
/*  65 */     double d6 = d3 + e.c;
/*     */     
/*  67 */     return new aui(d4, d5, d6);
/*     */   }
/*     */   
/*     */   public static afh a(adm ☃, pk pk1, float f) {
/*  71 */     aui aui1 = a(pk1, f);
/*  72 */     cj cj = new cj(aui1);
/*  73 */     alz alz = ☃.p(cj);
/*  74 */     afh afh = alz.c();
/*  75 */     if (afh.t().d()) {
/*  76 */       float f1 = 0.0F;
/*  77 */       if (alz.c() instanceof ahv) {
/*  78 */         f1 = ahv.b(((Integer)alz.<Integer>b(ahv.b)).intValue()) - 0.11111111F;
/*     */       }
/*  80 */       float f2 = (cj.o() + 1) - f1;
/*  81 */       if (aui1.b >= f2) {
/*  82 */         afh = ☃.p(cj.a()).c();
/*     */       }
/*     */     } 
/*  85 */     return afh;
/*     */   }
/*     */   
/*     */   public static aui a() {
/*  89 */     return e;
/*     */   }
/*     */   
/*     */   public static float b() {
/*  93 */     return f;
/*     */   }
/*     */   
/*     */   public static float c() {
/*  97 */     return g;
/*     */   }
/*     */   
/*     */   public static float d() {
/* 101 */     return h;
/*     */   }
/*     */   
/*     */   public static float e() {
/* 105 */     return i;
/*     */   }
/*     */   
/*     */   public static float f() {
/* 109 */     return j;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/auz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */