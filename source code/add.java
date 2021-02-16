/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class add
/*     */ {
/*  25 */   private int a = 20;
/*  26 */   private String b = "Pig";
/*  27 */   private final List<a> c = Lists.newArrayList();
/*     */   private a d;
/*     */   private double e;
/*     */   private double f;
/*  31 */   private int g = 200;
/*  32 */   private int h = 800;
/*  33 */   private int i = 4;
/*     */   private pk j;
/*  35 */   private int k = 6;
/*  36 */   private int l = 16;
/*  37 */   private int m = 4;
/*     */   
/*     */   private String f() {
/*  40 */     if (i() == null) {
/*  41 */       if (this.b != null && this.b.equals("Minecart")) {
/*  42 */         this.b = "MinecartRideable";
/*     */       }
/*  44 */       return this.b;
/*     */     } 
/*  46 */     return a.a(i());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃) {
/*  51 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   private boolean g() {
/*  55 */     cj ☃ = b();
/*  56 */     return a().b(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, this.l);
/*     */   }
/*     */   
/*     */   public void c() {
/*  60 */     if (!g()) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     cj ☃ = b();
/*  65 */     if ((a()).D) {
/*  66 */       double d1 = (☃.n() + (a()).s.nextFloat());
/*  67 */       double d2 = (☃.o() + (a()).s.nextFloat());
/*  68 */       double d3 = (☃.p() + (a()).s.nextFloat());
/*  69 */       a().a(cy.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*  70 */       a().a(cy.A, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */       
/*  72 */       if (this.a > 0) {
/*  73 */         this.a--;
/*     */       }
/*  75 */       this.f = this.e;
/*  76 */       this.e = (this.e + (1000.0F / (this.a + 200.0F))) % 360.0D;
/*     */     } else {
/*  78 */       if (this.a == -1) {
/*  79 */         h();
/*     */       }
/*     */       
/*  82 */       if (this.a > 0) {
/*  83 */         this.a--;
/*     */         
/*     */         return;
/*     */       } 
/*  87 */       boolean bool = false;
/*     */       
/*  89 */       for (int i = 0; i < this.i; i++) {
/*  90 */         pk pk1 = pm.a(f(), a());
/*  91 */         if (pk1 == null) {
/*     */           return;
/*     */         }
/*     */         
/*  95 */         int j = a().a(pk1.getClass(), (new aug(☃.n(), ☃.o(), ☃.p(), (☃.n() + 1), (☃.o() + 1), (☃.p() + 1))).b(this.m, this.m, this.m)).size();
/*  96 */         if (j >= this.k) {
/*  97 */           h();
/*     */           
/*     */           return;
/*     */         } 
/* 101 */         double d1 = ☃.n() + ((a()).s.nextDouble() - (a()).s.nextDouble()) * this.m + 0.5D;
/* 102 */         double d2 = (☃.o() + (a()).s.nextInt(3) - 1);
/* 103 */         double d3 = ☃.p() + ((a()).s.nextDouble() - (a()).s.nextDouble()) * this.m + 0.5D;
/* 104 */         ps ps = (pk1 instanceof ps) ? (ps)pk1 : null;
/*     */         
/* 106 */         pk1.b(d1, d2, d3, (a()).s.nextFloat() * 360.0F, 0.0F);
/*     */         
/* 108 */         if (ps == null || (ps.bR() && ps.bS())) {
/* 109 */           a(pk1, true);
/* 110 */           a().b(2004, ☃, 0);
/*     */           
/* 112 */           if (ps != null) {
/* 113 */             ps.y();
/*     */           }
/*     */           
/* 116 */           bool = true;
/*     */         } 
/*     */       } 
/*     */       
/* 120 */       if (bool) {
/* 121 */         h();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private pk a(pk ☃, boolean bool) {
/* 127 */     if (i() != null) {
/* 128 */       dn dn = new dn();
/* 129 */       ☃.d(dn);
/*     */       
/* 131 */       for (Iterator<String> iterator = a.b(i()).c().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 132 */         eb eb = a.b(i()).a(str);
/* 133 */         dn.a(str, eb.b()); }
/*     */ 
/*     */       
/* 136 */       ☃.f(dn);
/* 137 */       if (☃.o != null && bool) {
/* 138 */         ☃.o.d(☃);
/*     */       }
/*     */ 
/*     */       
/* 142 */       pk pk1 = ☃;
/* 143 */       while (dn.b("Riding", 10)) {
/* 144 */         dn dn1 = dn.m("Riding");
/* 145 */         pk pk2 = pm.a(dn1.j("id"), ☃.o);
/* 146 */         if (pk2 != null) {
/* 147 */           dn dn2 = new dn();
/* 148 */           pk2.d(dn2);
/*     */           
/* 150 */           for (Iterator<String> iterator1 = dn1.c().iterator(); iterator1.hasNext(); ) { String str = iterator1.next();
/* 151 */             eb eb = dn1.a(str);
/* 152 */             dn2.a(str, eb.b()); }
/*     */           
/* 154 */           pk2.f(dn2);
/* 155 */           pk2.b(pk1.s, pk1.t, pk1.u, pk1.y, pk1.z);
/*     */           
/* 157 */           if (☃.o != null && bool) {
/* 158 */             ☃.o.d(pk2);
/*     */           }
/* 160 */           pk1.a(pk2);
/*     */         } 
/* 162 */         pk1 = pk2;
/* 163 */         dn = dn1;
/*     */       } 
/* 165 */     } else if (☃ instanceof pr && ☃.o != null && bool) {
/* 166 */       if (☃ instanceof ps) {
/* 167 */         ((ps)☃).a(☃.o.E(new cj(☃)), (pu)null);
/*     */       }
/* 169 */       ☃.o.d(☃);
/*     */     } 
/*     */     
/* 172 */     return ☃;
/*     */   }
/*     */   
/*     */   private void h() {
/* 176 */     if (this.h <= this.g) {
/* 177 */       this.a = this.g;
/*     */     } else {
/* 179 */       this.a = this.g + (a()).s.nextInt(this.h - this.g);
/*     */     } 
/*     */     
/* 182 */     if (this.c.size() > 0) {
/* 183 */       a(oa.<a>a((a()).s, this.c));
/*     */     }
/*     */     
/* 186 */     a(1);
/*     */   }
/*     */   
/*     */   public void a(dn ☃) {
/* 190 */     this.b = ☃.j("EntityId");
/* 191 */     this.a = ☃.e("Delay");
/*     */     
/* 193 */     this.c.clear();
/* 194 */     if (☃.b("SpawnPotentials", 9)) {
/* 195 */       du du = ☃.c("SpawnPotentials", 10);
/*     */       
/* 197 */       for (int i = 0; i < du.c(); i++) {
/* 198 */         this.c.add(new a(du.b(i)));
/*     */       }
/*     */     } 
/*     */     
/* 202 */     if (☃.b("SpawnData", 10)) {
/* 203 */       a(new a(☃.m("SpawnData"), this.b));
/*     */     } else {
/* 205 */       a((a)null);
/*     */     } 
/*     */     
/* 208 */     if (☃.b("MinSpawnDelay", 99)) {
/* 209 */       this.g = ☃.e("MinSpawnDelay");
/* 210 */       this.h = ☃.e("MaxSpawnDelay");
/* 211 */       this.i = ☃.e("SpawnCount");
/*     */     } 
/*     */     
/* 214 */     if (☃.b("MaxNearbyEntities", 99)) {
/* 215 */       this.k = ☃.e("MaxNearbyEntities");
/* 216 */       this.l = ☃.e("RequiredPlayerRange");
/*     */     } 
/*     */     
/* 219 */     if (☃.b("SpawnRange", 99)) {
/* 220 */       this.m = ☃.e("SpawnRange");
/*     */     }
/*     */     
/* 223 */     if (a() != null) {
/* 224 */       this.j = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dn ☃) {
/* 229 */     String str = f();
/* 230 */     if (nx.b(str)) {
/*     */       return;
/*     */     }
/* 233 */     ☃.a("EntityId", str);
/* 234 */     ☃.a("Delay", (short)this.a);
/* 235 */     ☃.a("MinSpawnDelay", (short)this.g);
/* 236 */     ☃.a("MaxSpawnDelay", (short)this.h);
/* 237 */     ☃.a("SpawnCount", (short)this.i);
/* 238 */     ☃.a("MaxNearbyEntities", (short)this.k);
/* 239 */     ☃.a("RequiredPlayerRange", (short)this.l);
/* 240 */     ☃.a("SpawnRange", (short)this.m);
/*     */     
/* 242 */     if (i() != null) {
/* 243 */       ☃.a("SpawnData", a.b(i()).b());
/*     */     }
/*     */     
/* 246 */     if (i() != null || this.c.size() > 0) {
/* 247 */       du du = new du();
/*     */       
/* 249 */       if (this.c.size() > 0) {
/* 250 */         for (Iterator<a> iterator = this.c.iterator(); iterator.hasNext(); ) { a a1 = iterator.next();
/* 251 */           du.a(a1.a()); }
/*     */       
/*     */       } else {
/* 254 */         du.a(i().a());
/*     */       } 
/*     */       
/* 257 */       ☃.a("SpawnPotentials", du);
/*     */     } 
/*     */   }
/*     */   
/*     */   public pk a(adm ☃) {
/* 262 */     if (this.j == null) {
/* 263 */       pk pk1 = pm.a(f(), ☃);
/* 264 */       if (pk1 != null) {
/* 265 */         pk1 = a(pk1, false);
/* 266 */         this.j = pk1;
/*     */       } 
/*     */     } 
/*     */     
/* 270 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean b(int ☃) {
/* 274 */     if (☃ == 1 && (a()).D) {
/* 275 */       this.a = this.g;
/* 276 */       return true;
/*     */     } 
/* 278 */     return false;
/*     */   }
/*     */   
/*     */   private a i() {
/* 282 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/* 286 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public abstract void a(int paramInt);
/*     */   
/*     */   public abstract adm a();
/*     */   
/*     */   public abstract cj b();
/*     */   
/*     */   public double d() {
/* 296 */     return this.e;
/*     */   }
/*     */   
/*     */   public double e() {
/* 300 */     return this.f;
/*     */   }
/*     */   
/*     */   public class a
/*     */     extends oa.a {
/*     */     private final dn c;
/*     */     private final String d;
/*     */     
/*     */     public a(dn ☃) {
/* 309 */       this(☃.m("Properties"), ☃.j("Type"), ☃.f("Weight"));
/*     */     }
/*     */     
/*     */     public a(dn ☃, String str) {
/* 313 */       this(☃, str, 1);
/*     */     }
/*     */     
/*     */     private a(dn ☃, String str, int i) {
/* 317 */       super(i);
/*     */ 
/*     */       
/* 320 */       if (str.equals("Minecart")) {
/* 321 */         if (☃ != null) {
/* 322 */           str = va.a.a(☃.f("Type")).b();
/*     */         } else {
/* 324 */           str = "MinecartRideable";
/*     */         } 
/*     */       }
/*     */       
/* 328 */       this.c = ☃;
/* 329 */       this.d = str;
/*     */     }
/*     */     
/*     */     public dn a() {
/* 333 */       dn ☃ = new dn();
/*     */       
/* 335 */       ☃.a("Properties", this.c);
/* 336 */       ☃.a("Type", this.d);
/* 337 */       ☃.a("Weight", this.a);
/*     */       
/* 339 */       return ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/add.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */