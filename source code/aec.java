/*     */ import com.google.common.collect.Lists;
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
/*     */ public class aec
/*     */ {
/*     */   private ase b;
/*     */   private ase c;
/*  21 */   private adz d = new adz(this);
/*     */   
/*     */   private List<ady> e;
/*  24 */   private String f = "";
/*     */   
/*     */   protected aec() {
/*  27 */     this.e = Lists.newArrayList();
/*  28 */     this.e.add(ady.t);
/*  29 */     this.e.add(ady.q);
/*  30 */     this.e.add(ady.u);
/*  31 */     this.e.add(ady.I);
/*  32 */     this.e.add(ady.H);
/*  33 */     this.e.add(ady.K);
/*  34 */     this.e.add(ady.L);
/*     */   }
/*     */   
/*     */   public aec(long ☃, adr adr1, String str) {
/*  38 */     this();
/*  39 */     this.f = str;
/*     */     
/*  41 */     ase[] arrayOfAse = ase.a(☃, adr1, str);
/*  42 */     this.b = arrayOfAse[0];
/*  43 */     this.c = arrayOfAse[1];
/*     */   }
/*     */   
/*     */   public aec(adm ☃) {
/*  47 */     this(☃.J(), ☃.P().u(), ☃.P().B());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ady> a() {
/*  56 */     return this.e;
/*     */   }
/*     */   
/*     */   public ady a(cj ☃) {
/*  60 */     return a(☃, (ady)null);
/*     */   }
/*     */   
/*     */   public ady a(cj ☃, ady ady1) {
/*  64 */     return this.d.a(☃.n(), ☃.p(), ady1);
/*     */   }
/*     */   
/*     */   public float[] a(float[] ☃, int i, int j, int k, int m) {
/*  68 */     asc.a();
/*  69 */     if (☃ == null || ☃.length < k * m) {
/*  70 */       ☃ = new float[k * m];
/*     */     }
/*     */     
/*  73 */     int[] arrayOfInt = this.c.a(i, j, k, m);
/*  74 */     for (int n = 0; n < k * m; n++) {
/*     */       try {
/*  76 */         float f = ady.a(arrayOfInt[n], ady.ad).h() / 65536.0F;
/*  77 */         if (f > 1.0F) {
/*  78 */           f = 1.0F;
/*     */         }
/*  80 */         ☃[n] = f;
/*  81 */       } catch (Throwable throwable) {
/*  82 */         b b = b.a(throwable, "Invalid Biome id");
/*  83 */         c c = b.a("DownfallBlock");
/*  84 */         c.a("biome id", Integer.valueOf(n));
/*  85 */         c.a("downfalls[] size", Integer.valueOf(☃.length));
/*  86 */         c.a("x", Integer.valueOf(i));
/*  87 */         c.a("z", Integer.valueOf(j));
/*  88 */         c.a("w", Integer.valueOf(k));
/*  89 */         c.a("h", Integer.valueOf(m));
/*     */         
/*  91 */         throw new e(b);
/*     */       } 
/*     */     } 
/*     */     
/*  95 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(float ☃, int i) {
/* 103 */     return ☃;
/*     */   }
/*     */   
/*     */   public ady[] a(ady[] ☃, int i, int j, int k, int m) {
/* 107 */     asc.a();
/* 108 */     if (☃ == null || ☃.length < k * m) {
/* 109 */       ☃ = new ady[k * m];
/*     */     }
/*     */     
/* 112 */     int[] arrayOfInt = this.b.a(i, j, k, m);
/*     */     try {
/* 114 */       for (int n = 0; n < k * m; n++) {
/* 115 */         ☃[n] = ady.a(arrayOfInt[n], ady.ad);
/*     */       }
/* 117 */     } catch (Throwable throwable) {
/* 118 */       b b = b.a(throwable, "Invalid Biome id");
/* 119 */       c c = b.a("RawBiomeBlock");
/* 120 */       c.a("biomes[] size", Integer.valueOf(☃.length));
/* 121 */       c.a("x", Integer.valueOf(i));
/* 122 */       c.a("z", Integer.valueOf(j));
/* 123 */       c.a("w", Integer.valueOf(k));
/* 124 */       c.a("h", Integer.valueOf(m));
/*     */       
/* 126 */       throw new e(b);
/*     */     } 
/*     */     
/* 129 */     return ☃;
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
/*     */   public ady[] b(ady[] ☃, int i, int j, int k, int m) {
/* 142 */     return a(☃, i, j, k, m, true);
/*     */   }
/*     */   
/*     */   public ady[] a(ady[] ☃, int i, int j, int k, int m, boolean bool) {
/* 146 */     asc.a();
/* 147 */     if (☃ == null || ☃.length < k * m) {
/* 148 */       ☃ = new ady[k * m];
/*     */     }
/*     */     
/* 151 */     if (bool && k == 16 && m == 16 && (i & 0xF) == 0 && (j & 0xF) == 0) {
/* 152 */       ady[] arrayOfAdy = this.d.c(i, j);
/* 153 */       System.arraycopy(arrayOfAdy, 0, ☃, 0, k * m);
/* 154 */       return ☃;
/*     */     } 
/*     */     
/* 157 */     int[] arrayOfInt = this.c.a(i, j, k, m);
/* 158 */     for (int n = 0; n < k * m; n++) {
/* 159 */       ☃[n] = ady.a(arrayOfInt[n], ady.ad);
/*     */     }
/*     */     
/* 162 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j, List<ady> list) {
/* 173 */     asc.a();
/* 174 */     int k = ☃ - j >> 2;
/* 175 */     int m = i - j >> 2;
/* 176 */     int n = ☃ + j >> 2;
/* 177 */     int i1 = i + j >> 2;
/*     */     
/* 179 */     int i2 = n - k + 1;
/* 180 */     int i3 = i1 - m + 1;
/*     */     
/* 182 */     int[] arrayOfInt = this.b.a(k, m, i2, i3);
/*     */     try {
/* 184 */       for (int i4 = 0; i4 < i2 * i3; i4++) {
/* 185 */         ady ady = ady.e(arrayOfInt[i4]);
/* 186 */         if (!list.contains(ady)) {
/* 187 */           return false;
/*     */         }
/*     */       } 
/* 190 */     } catch (Throwable throwable) {
/* 191 */       b b = b.a(throwable, "Invalid Biome id");
/* 192 */       c c = b.a("Layer");
/* 193 */       c.a("Layer", this.b.toString());
/* 194 */       c.a("x", Integer.valueOf(☃));
/* 195 */       c.a("z", Integer.valueOf(i));
/* 196 */       c.a("radius", Integer.valueOf(j));
/* 197 */       c.a("allowed", list);
/*     */       
/* 199 */       throw new e(b);
/*     */     } 
/*     */     
/* 202 */     return true;
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
/*     */   public cj a(int ☃, int i, int j, List<ady> list, Random random) {
/* 270 */     asc.a();
/* 271 */     int k = ☃ - j >> 2;
/* 272 */     int m = i - j >> 2;
/* 273 */     int n = ☃ + j >> 2;
/* 274 */     int i1 = i + j >> 2;
/*     */     
/* 276 */     int i2 = n - k + 1;
/* 277 */     int i3 = i1 - m + 1;
/* 278 */     int[] arrayOfInt = this.b.a(k, m, i2, i3);
/* 279 */     cj cj = null;
/* 280 */     int i4 = 0;
/* 281 */     for (int i5 = 0; i5 < i2 * i3; i5++) {
/* 282 */       int i6 = k + i5 % i2 << 2;
/* 283 */       int i7 = m + i5 / i2 << 2;
/* 284 */       ady ady = ady.e(arrayOfInt[i5]);
/* 285 */       if (list.contains(ady) && (
/* 286 */         cj == null || random.nextInt(i4 + 1) == 0)) {
/* 287 */         cj = new cj(i6, 0, i7);
/* 288 */         i4++;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 293 */     return cj;
/*     */   }
/*     */   
/*     */   public void b() {
/* 297 */     this.d.a();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */