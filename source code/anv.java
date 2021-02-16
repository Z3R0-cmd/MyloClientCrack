/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class anv
/*     */   implements amv
/*     */ {
/*     */   private adm a;
/*     */   private Random b;
/*  31 */   private final alz[] c = new alz[256];
/*     */   private final apz d;
/*  33 */   private final List<aqq> e = Lists.newArrayList();
/*     */   private final boolean f;
/*     */   private final boolean g;
/*     */   private apc h;
/*     */   private apc i;
/*     */   
/*     */   public anv(adm ☃, long l, boolean bool, String str) {
/*  40 */     this.a = ☃;
/*  41 */     this.b = new Random(l);
/*  42 */     this.d = apz.a(str);
/*     */     
/*  44 */     if (bool) {
/*  45 */       Map<String, Map<String, String>> map = this.d.b();
/*     */       
/*  47 */       if (map.containsKey("village")) {
/*  48 */         Map<String, String> map1 = map.get("village");
/*  49 */         if (!map1.containsKey("size")) {
/*  50 */           map1.put("size", "1");
/*     */         }
/*  52 */         this.e.add(new aqv(map1));
/*     */       } 
/*     */       
/*  55 */       if (map.containsKey("biome_1")) {
/*  56 */         this.e.add(new aqm(map.get("biome_1")));
/*     */       }
/*  58 */       if (map.containsKey("mineshaft")) {
/*  59 */         this.e.add(new aqf(map.get("mineshaft")));
/*     */       }
/*  61 */       if (map.containsKey("stronghold")) {
/*  62 */         this.e.add(new aqo(map.get("stronghold")));
/*     */       }
/*  64 */       if (map.containsKey("oceanmonument")) {
/*  65 */         this.e.add(new aqk(map.get("oceanmonument")));
/*     */       }
/*     */     } 
/*     */     
/*  69 */     if (this.d.b().containsKey("lake")) {
/*  70 */       this.h = new apc(afi.j);
/*     */     }
/*  72 */     if (this.d.b().containsKey("lava_lake")) {
/*  73 */       this.i = new apc(afi.l);
/*     */     }
/*  75 */     this.g = this.d.b().containsKey("dungeon");
/*     */     
/*  77 */     int i = 0;
/*  78 */     int j = 0;
/*  79 */     boolean bool1 = true;
/*  80 */     for (Iterator<aqa> iterator = this.d.c().iterator(); iterator.hasNext(); ) { aqa aqa = iterator.next();
/*  81 */       for (int k = aqa.d(); k < aqa.d() + aqa.b(); k++) {
/*  82 */         alz alz1 = aqa.c();
/*  83 */         if (alz1.c() != afi.a) {
/*     */ 
/*     */           
/*  86 */           bool1 = false;
/*  87 */           this.c[k] = alz1;
/*     */         } 
/*  89 */       }  if (aqa.c().c() == afi.a) {
/*  90 */         j += aqa.b(); continue;
/*     */       } 
/*  92 */       i += aqa.b() + j;
/*  93 */       j = 0; }
/*     */ 
/*     */     
/*  96 */     ☃.b(i);
/*     */     
/*  98 */     this.f = bool1 ? false : this.d.b().containsKey("decoration");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public amy d(int ☃, int i) {
/* 108 */     ans ans = new ans();
/*     */     
/* 110 */     for (int j = 0; j < this.c.length; j++) {
/* 111 */       alz alz1 = this.c[j];
/* 112 */       if (alz1 != null)
/*     */       {
/*     */ 
/*     */         
/* 116 */         for (int m = 0; m < 16; m++) {
/* 117 */           for (int n = 0; n < 16; n++) {
/* 118 */             ans.a(m, j, n, alz1);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 123 */     for (Iterator<aqq> iterator = this.e.iterator(); iterator.hasNext(); ) { any any = iterator.next();
/* 124 */       any.a(this, this.a, ☃, i, ans); }
/*     */ 
/*     */     
/* 127 */     amy amy = new amy(this.a, ans, ☃, i);
/* 128 */     ady[] arrayOfAdy = this.a.v().b(null, ☃ * 16, i * 16, 16, 16);
/* 129 */     byte[] arrayOfByte = amy.k();
/*     */     
/* 131 */     for (int k = 0; k < arrayOfByte.length; k++) {
/* 132 */       arrayOfByte[k] = (byte)(arrayOfAdy[k]).az;
/*     */     }
/*     */     
/* 135 */     amy.b();
/*     */     
/* 137 */     return amy;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 142 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amv ☃, int i, int j) {
/* 147 */     int k = i * 16;
/* 148 */     int m = j * 16;
/* 149 */     cj cj = new cj(k, 0, m);
/* 150 */     ady ady = this.a.b(new cj(k + 16, 0, m + 16));
/* 151 */     boolean bool = false;
/*     */     
/* 153 */     this.b.setSeed(this.a.J());
/* 154 */     long l1 = this.b.nextLong() / 2L * 2L + 1L;
/* 155 */     long l2 = this.b.nextLong() / 2L * 2L + 1L;
/* 156 */     this.b.setSeed(i * l1 + j * l2 ^ this.a.J());
/*     */     
/* 158 */     adg adg = new adg(i, j);
/*     */     
/* 160 */     for (Iterator<aqq> iterator = this.e.iterator(); iterator.hasNext(); ) { aqq aqq = iterator.next();
/* 161 */       boolean bool1 = aqq.a(this.a, this.b, adg);
/* 162 */       if (aqq instanceof aqv) {
/* 163 */         bool |= bool1;
/*     */       } }
/*     */ 
/*     */     
/* 167 */     if (this.h != null && !bool && this.b.nextInt(4) == 0) {
/* 168 */       this.h.b(this.a, this.b, cj.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
/*     */     }
/*     */     
/* 171 */     if (this.i != null && !bool && this.b.nextInt(8) == 0) {
/* 172 */       cj cj1 = cj.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8);
/* 173 */       if (cj1.o() < this.a.F() || this.b.nextInt(10) == 0) {
/* 174 */         this.i.b(this.a, this.b, cj1);
/*     */       }
/*     */     } 
/*     */     
/* 178 */     if (this.g) {
/* 179 */       for (int n = 0; n < 8; n++) {
/* 180 */         (new api()).b(this.a, this.b, cj.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
/*     */       }
/*     */     }
/*     */     
/* 184 */     if (this.f) {
/* 185 */       ady.a(this.a, this.b, cj);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(amv ☃, amy amy1, int i, int j) {
/* 191 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boolean ☃, nu nu1) {
/* 196 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 205 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 210 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 215 */     return "FlatLevelSource";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ady.c> a(pt ☃, cj cj1) {
/* 220 */     ady ady = this.a.b(cj1);
/* 221 */     return ady.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cj a(adm ☃, String str, cj cj1) {
/* 226 */     if ("Stronghold".equals(str)) {
/* 227 */       for (Iterator<aqq> iterator = this.e.iterator(); iterator.hasNext(); ) { aqq aqq = iterator.next();
/* 228 */         if (aqq instanceof aqo) {
/* 229 */           return aqq.b(☃, cj1);
/*     */         } }
/*     */     
/*     */     }
/* 233 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 238 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(amy ☃, int i, int j) {
/* 243 */     for (Iterator<aqq> iterator = this.e.iterator(); iterator.hasNext(); ) { aqq aqq = iterator.next();
/* 244 */       aqq.a(this, this.a, i, j, null); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public amy a(cj ☃) {
/* 250 */     return d(☃.n() >> 4, ☃.p() >> 4);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */