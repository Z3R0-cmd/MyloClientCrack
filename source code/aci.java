/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aci
/*     */ {
/*  20 */   private static final aci[] a = new aci[256];
/*     */   public static final aci[] b;
/*  22 */   private static final Map<jy, aci> E = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  30 */   public static final aci c = new acr(0, new jy("protection"), 10, 0);
/*  31 */   public static final aci d = new acr(1, new jy("fire_protection"), 5, 1);
/*  32 */   public static final aci e = new acr(2, new jy("feather_falling"), 5, 2);
/*  33 */   public static final aci f = new acr(3, new jy("blast_protection"), 2, 3);
/*  34 */   public static final aci g = new acr(4, new jy("projectile_protection"), 5, 4);
/*  35 */   public static final aci h = new acq(5, new jy("respiration"), 2);
/*  36 */   public static final aci i = new acv(6, new jy("aqua_affinity"), 2);
/*  37 */   public static final aci j = new acs(7, new jy("thorns"), 1);
/*  38 */   public static final aci k = new acu(8, new jy("depth_strider"), 2);
/*     */ 
/*     */   
/*  41 */   public static final aci l = new acf(16, new jy("sharpness"), 10, 0);
/*  42 */   public static final aci m = new acf(17, new jy("smite"), 5, 1);
/*  43 */   public static final aci n = new acf(18, new jy("bane_of_arthropods"), 5, 2);
/*  44 */   public static final aci o = new aco(19, new jy("knockback"), 5);
/*  45 */   public static final aci p = new acm(20, new jy("fire_aspect"), 2);
/*  46 */   public static final aci q = new acp(21, new jy("looting"), 2, acj.g);
/*     */ 
/*     */   
/*  49 */   public static final aci r = new ach(32, new jy("efficiency"), 10);
/*  50 */   public static final aci s = new act(33, new jy("silk_touch"), 1);
/*  51 */   public static final aci t = new acg(34, new jy("unbreaking"), 5);
/*  52 */   public static final aci u = new acp(35, new jy("fortune"), 2, acj.h);
/*     */ 
/*     */   
/*  55 */   public static final aci v = new acb(48, new jy("power"), 10);
/*  56 */   public static final aci w = new ace(49, new jy("punch"), 2);
/*  57 */   public static final aci x = new acc(50, new jy("flame"), 2);
/*  58 */   public static final aci y = new acd(51, new jy("infinity"), 1);
/*     */ 
/*     */   
/*  61 */   public static final aci z = new acp(61, new jy("luck_of_the_sea"), 2, acj.i);
/*  62 */   public static final aci A = new acn(62, new jy("lure"), 2, acj.i);
/*     */   
/*     */   public final int B;
/*     */   
/*     */   private final int F;
/*     */   public acj C;
/*     */   protected String D;
/*     */   
/*     */   static {
/*  71 */     List<aci> ☃ = Lists.newArrayList(); aci[] arrayOfAci;
/*     */     int i, j;
/*  73 */     for (arrayOfAci = a, i = arrayOfAci.length, j = 0; j < i; ) { aci aci1 = arrayOfAci[j];
/*  74 */       if (aci1 != null) {
/*  75 */         ☃.add(aci1);
/*     */       }
/*     */       j++; }
/*     */     
/*  79 */     b = ☃.<aci>toArray(new aci[☃.size()]);
/*     */   }
/*     */   
/*     */   public static aci c(int ☃) {
/*  83 */     if (☃ < 0 || ☃ >= a.length) {
/*  84 */       return null;
/*     */     }
/*  86 */     return a[☃];
/*     */   }
/*     */   
/*     */   protected aci(int ☃, jy jy1, int i, acj acj1) {
/*  90 */     this.B = ☃;
/*  91 */     this.F = i;
/*  92 */     this.C = acj1;
/*     */     
/*  94 */     if (a[☃] != null) {
/*  95 */       throw new IllegalArgumentException("Duplicate enchantment id!");
/*     */     }
/*  97 */     a[☃] = this;
/*  98 */     E.put(jy1, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static aci b(String ☃) {
/* 107 */     return E.get(new jy(☃));
/*     */   }
/*     */   
/*     */   public static Set<jy> c() {
/* 111 */     return E.keySet();
/*     */   }
/*     */   
/*     */   public int d() {
/* 115 */     return this.F;
/*     */   }
/*     */   
/*     */   public int e() {
/* 119 */     return 1;
/*     */   }
/*     */   
/*     */   public int b() {
/* 123 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/* 127 */     return 1 + ☃ * 10;
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/* 131 */     return a(☃) + 5;
/*     */   }
/*     */   
/*     */   public int a(int ☃, ow ow1) {
/* 135 */     return 0;
/*     */   }
/*     */   
/*     */   public float a(int ☃, pw pw1) {
/* 139 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean a(aci ☃) {
/* 143 */     return (this != ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public aci c(String ☃) {
/* 148 */     this.D = ☃;
/* 149 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 154 */     return "enchantment." + this.D;
/*     */   }
/*     */   
/*     */   public String d(int ☃) {
/* 158 */     String str = di.a(a());
/* 159 */     return str + " " + di.a("enchantment.level." + ☃);
/*     */   }
/*     */   
/*     */   public boolean a(zx ☃) {
/* 163 */     return this.C.a(☃.b());
/*     */   }
/*     */   
/*     */   public void a(pr ☃, pk pk1, int i) {}
/*     */   
/*     */   public void b(pr ☃, pk pk1, int i) {}
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */