/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.Callable;
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
/*     */ public abstract class akw
/*     */ {
/*  21 */   private static final Logger a = LogManager.getLogger();
/*  22 */   private static Map<String, Class<? extends akw>> f = Maps.newHashMap();
/*  23 */   private static Map<Class<? extends akw>, String> g = Maps.newHashMap();
/*     */   
/*     */   private static void a(Class<? extends akw> ☃, String str) {
/*  26 */     if (f.containsKey(str)) {
/*  27 */       throw new IllegalArgumentException("Duplicate id: " + str);
/*     */     }
/*  29 */     f.put(str, ☃);
/*  30 */     g.put(☃, str);
/*     */   }
/*     */   protected adm b;
/*     */   static {
/*  34 */     a((Class)alh.class, "Furnace");
/*  35 */     a((Class)aky.class, "Chest");
/*  36 */     a((Class)alf.class, "EnderChest");
/*  37 */     a((Class)ahq.a.class, "RecordPlayer");
/*  38 */     a((Class)alc.class, "Trap");
/*  39 */     a((Class)ald.class, "Dropper");
/*  40 */     a((Class)aln.class, "Sign");
/*  41 */     a((Class)all.class, "MobSpawner");
/*  42 */     a((Class)alm.class, "Music");
/*  43 */     a((Class)alu.class, "Piston");
/*  44 */     a((Class)akx.class, "Cauldron");
/*  45 */     a((Class)ale.class, "EnchantTable");
/*  46 */     a((Class)alp.class, "Airportal");
/*  47 */     a((Class)akz.class, "Control");
/*  48 */     a((Class)akv.class, "Beacon");
/*  49 */     a((Class)alo.class, "Skull");
/*  50 */     a((Class)alb.class, "DLDetector");
/*  51 */     a((Class)alj.class, "Hopper");
/*  52 */     a((Class)ala.class, "Comparator");
/*  53 */     a((Class)alg.class, "FlowerPot");
/*  54 */     a((Class)aku.class, "Banner");
/*     */   }
/*     */ 
/*     */   
/*  58 */   protected cj c = cj.a;
/*     */   
/*     */   protected boolean d;
/*  61 */   private int h = -1;
/*     */   protected afh e;
/*     */   
/*     */   public adm z() {
/*  65 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(adm ☃) {
/*  69 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public boolean t() {
/*  73 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   public void a(dn ☃) {
/*  77 */     this.c = new cj(☃.f("x"), ☃.f("y"), ☃.f("z"));
/*     */   }
/*     */   
/*     */   public void b(dn ☃) {
/*  81 */     String str = g.get(getClass());
/*  82 */     if (str == null) {
/*  83 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*     */     }
/*  85 */     ☃.a("id", str);
/*  86 */     ☃.a("x", this.c.n());
/*  87 */     ☃.a("y", this.c.o());
/*  88 */     ☃.a("z", this.c.p());
/*     */   }
/*     */   
/*     */   public static akw c(dn ☃) {
/*  92 */     akw akw1 = null;
/*     */     try {
/*  94 */       Class<? extends akw> clazz = f.get(☃.j("id"));
/*  95 */       if (clazz != null) {
/*  96 */         akw1 = clazz.newInstance();
/*     */       }
/*  98 */     } catch (Exception exception) {
/*  99 */       exception.printStackTrace();
/*     */     } 
/* 101 */     if (akw1 != null) {
/* 102 */       akw1.a(☃);
/*     */     } else {
/* 104 */       a.warn("Skipping BlockEntity with id " + ☃.j("id"));
/*     */     } 
/* 106 */     return akw1;
/*     */   }
/*     */   
/*     */   public int u() {
/* 110 */     if (this.h == -1) {
/* 111 */       alz ☃ = this.b.p(this.c);
/* 112 */       this.h = ☃.c().c(☃);
/*     */     } 
/* 114 */     return this.h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void p_() {
/* 122 */     if (this.b != null) {
/* 123 */       alz ☃ = this.b.p(this.c);
/* 124 */       this.h = ☃.c().c(☃);
/* 125 */       this.b.b(this.c, this);
/*     */       
/* 127 */       if (w() != afi.a) {
/* 128 */         this.b.e(this.c, w());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2) {
/* 134 */     double d3 = this.c.n() + 0.5D - ☃;
/* 135 */     double d4 = this.c.o() + 0.5D - d1;
/* 136 */     double d5 = this.c.p() + 0.5D - d2;
/* 137 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*     */   }
/*     */   
/*     */   public double s() {
/* 141 */     return 4096.0D;
/*     */   }
/*     */   
/*     */   public cj v() {
/* 145 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public afh w() {
/* 151 */     if (this.e == null) {
/* 152 */       this.e = this.b.p(this.c).c();
/*     */     }
/* 154 */     return this.e;
/*     */   }
/*     */   
/*     */   public ff y_() {
/* 158 */     return null;
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 162 */     return this.d;
/*     */   }
/*     */   
/*     */   public void y() {
/* 166 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void D() {
/* 170 */     this.d = false;
/*     */   }
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 174 */     return false;
/*     */   }
/*     */   
/*     */   public void E() {
/* 178 */     this.e = null;
/* 179 */     this.h = -1;
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/* 183 */     ☃.a("Name", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 186 */             return (String)akw.G().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
/*     */           }
/*     */         });
/*     */     
/* 190 */     if (this.b == null) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     c.a(☃, this.c, w(), u());
/*     */     
/* 196 */     ☃.a("Actual block type", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 199 */             int ☃ = afh.a(this.a.b.p(this.a.c).c());
/*     */             try {
/* 201 */               return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(☃), afh.c(☃).a(), afh.c(☃).getClass().getCanonicalName() });
/* 202 */             } catch (Throwable throwable) {
/* 203 */               return "ID #" + ☃;
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 208 */     ☃.a("Actual block data value", new Callable<String>(this)
/*     */         {
/*     */           public String a() throws Exception {
/* 211 */             alz ☃ = this.a.b.p(this.a.c);
/* 212 */             int i = ☃.c().c(☃);
/* 213 */             if (i < 0) {
/* 214 */               return "Unknown? (Got " + i + ")";
/*     */             }
/* 216 */             String str = String.format("%4s", new Object[] { Integer.toBinaryString(i) }).replace(" ", "0");
/*     */ 
/*     */             
/* 219 */             return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(i), str });
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void a(cj ☃) {
/* 225 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean F() {
/* 229 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */