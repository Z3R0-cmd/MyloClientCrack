/*     */ import java.util.concurrent.Callable;
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
/*     */ public abstract class ase
/*     */ {
/*     */   private long c;
/*     */   protected ase a;
/*     */   private long d;
/*     */   protected long b;
/*     */   
/*     */   public static ase[] a(long ☃, adr adr1, String str) {
/*  28 */     ase ase1 = new asd(1L);
/*  29 */     ase1 = new asa(2000L, ase1);
/*  30 */     ase1 = new ars(1L, ase1);
/*  31 */     ase1 = new asr(2001L, ase1);
/*  32 */     ase1 = new ars(2L, ase1);
/*  33 */     ase1 = new ars(50L, ase1);
/*  34 */     ase1 = new ars(70L, ase1);
/*  35 */     ase1 = new ash(2L, ase1);
/*  36 */     ase1 = new aru(2L, ase1);
/*  37 */     ase1 = new ars(3L, ase1);
/*  38 */     ase1 = new arr(2L, ase1, arr.a.a);
/*  39 */     ase1 = new arr(2L, ase1, arr.a.b);
/*  40 */     ase1 = new arr(3L, ase1, arr.a.c);
/*  41 */     ase1 = new asr(2002L, ase1);
/*  42 */     ase1 = new asr(2003L, ase1);
/*  43 */     ase1 = new ars(4L, ase1);
/*  44 */     ase1 = new art(5L, ase1);
/*  45 */     ase1 = new arq(4L, ase1);
/*  46 */     ase1 = asr.b(1000L, ase1, 0);
/*     */     
/*  48 */     ant ant = null;
/*  49 */     int i = 4;
/*  50 */     int j = i;
/*  51 */     if (adr1 == adr.f && str.length() > 0) {
/*  52 */       ant = ant.a.a(str).b();
/*  53 */       i = ant.G;
/*  54 */       j = ant.H;
/*     */     } 
/*  56 */     if (adr1 == adr.d) {
/*  57 */       i = 6;
/*     */     }
/*     */     
/*  60 */     ase ase2 = ase1;
/*  61 */     ase2 = asr.b(1000L, ase2, 0);
/*  62 */     ase2 = new asi(100L, ase2);
/*     */     
/*  64 */     ase ase3 = ase1;
/*  65 */     ase3 = new arw(200L, ase3, adr1, str);
/*  66 */     ase3 = asr.b(1000L, ase3, 2);
/*  67 */     ase3 = new arv(1000L, ase3);
/*  68 */     ase ase4 = ase2;
/*  69 */     ase4 = asr.b(1000L, ase4, 2);
/*  70 */     ase3 = new asg(1000L, ase3, ase4);
/*     */     
/*  72 */     ase2 = asr.b(1000L, ase2, 2);
/*  73 */     ase2 = asr.b(1000L, ase2, j);
/*  74 */     ase2 = new asj(1L, ase2);
/*  75 */     ase2 = new asm(1000L, ase2);
/*     */     
/*  77 */     ase3 = new asf(1001L, ase3);
/*  78 */     for (int k = 0; k < i; k++) {
/*  79 */       ase3 = new asr((1000 + k), ase3);
/*  80 */       if (k == 0) {
/*  81 */         ase3 = new ars(3L, ase3);
/*     */       }
/*     */       
/*  84 */       if (k == 1 || i == 1) {
/*  85 */         ase3 = new asl(1000L, ase3);
/*     */       }
/*     */     } 
/*     */     
/*  89 */     ase3 = new asm(1000L, ase3);
/*     */     
/*  91 */     ase3 = new ask(100L, ase3, ase2);
/*     */     
/*  93 */     ase ase5 = ase3;
/*  94 */     ase ase6 = new asq(10L, ase3);
/*     */     
/*  96 */     ase3.a(☃);
/*  97 */     ase6.a(☃);
/*     */     
/*  99 */     return new ase[] { ase3, ase6, ase5 };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ase(long ☃) {
/* 105 */     this.b = ☃;
/* 106 */     this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
/* 107 */     this.b += ☃;
/* 108 */     this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
/* 109 */     this.b += ☃;
/* 110 */     this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
/* 111 */     this.b += ☃;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 115 */     this.c = ☃;
/* 116 */     if (this.a != null) {
/* 117 */       this.a.a(☃);
/*     */     }
/* 119 */     this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
/* 120 */     this.c += this.b;
/* 121 */     this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
/* 122 */     this.c += this.b;
/* 123 */     this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
/* 124 */     this.c += this.b;
/*     */   }
/*     */   
/*     */   public void a(long ☃, long l1) {
/* 128 */     this.d = this.c;
/* 129 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 130 */     this.d += ☃;
/* 131 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 132 */     this.d += l1;
/* 133 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 134 */     this.d += ☃;
/* 135 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 136 */     this.d += l1;
/*     */   }
/*     */   
/*     */   protected int a(int ☃) {
/* 140 */     int i = (int)((this.d >> 24L) % ☃);
/* 141 */     if (i < 0) {
/* 142 */       i += ☃;
/*     */     }
/* 144 */     this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
/* 145 */     this.d += this.c;
/* 146 */     return i;
/*     */   }
/*     */   
/*     */   public abstract int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   protected static boolean a(int ☃, int i) {
/* 152 */     if (☃ == i) {
/* 153 */       return true;
/*     */     }
/* 155 */     if (☃ == ady.ab.az || ☃ == ady.ac.az) {
/* 156 */       return (i == ady.ab.az || i == ady.ac.az);
/*     */     }
/*     */     
/* 159 */     ady ady1 = ady.e(☃);
/* 160 */     ady ady2 = ady.e(i);
/*     */     try {
/* 162 */       if (ady1 != null && ady2 != null) {
/* 163 */         return ady1.a(ady2);
/*     */       }
/* 165 */     } catch (Throwable throwable) {
/* 166 */       b b = b.a(throwable, "Comparing biomes");
/* 167 */       c c = b.a("Biomes being compared");
/*     */       
/* 169 */       c.a("Biome A ID", Integer.valueOf(☃));
/* 170 */       c.a("Biome B ID", Integer.valueOf(i));
/*     */       
/* 172 */       c.a("Biome A", new Callable<String>(ady1)
/*     */           {
/*     */             public String a() throws Exception {
/* 175 */               return String.valueOf(this.a);
/*     */             }
/*     */           });
/* 178 */       c.a("Biome B", new Callable<String>(ady2)
/*     */           {
/*     */             public String a() throws Exception {
/* 181 */               return String.valueOf(this.a);
/*     */             }
/*     */           });
/*     */       
/* 185 */       throw new e(b);
/*     */     } 
/*     */     
/* 188 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean b(int ☃) {
/* 192 */     return (☃ == ady.p.az || ☃ == ady.N.az || ☃ == ady.z.az);
/*     */   }
/*     */   
/*     */   protected int a(int... ☃) {
/* 196 */     return ☃[a(☃.length)];
/*     */   }
/*     */   
/*     */   protected int b(int ☃, int i, int j, int k) {
/* 200 */     if (i == j && j == k) {
/* 201 */       return i;
/*     */     }
/* 203 */     if (☃ == i && ☃ == j) {
/* 204 */       return ☃;
/*     */     }
/* 206 */     if (☃ == i && ☃ == k) {
/* 207 */       return ☃;
/*     */     }
/* 209 */     if (☃ == j && ☃ == k) {
/* 210 */       return ☃;
/*     */     }
/*     */     
/* 213 */     if (☃ == i && j != k) {
/* 214 */       return ☃;
/*     */     }
/* 216 */     if (☃ == j && i != k) {
/* 217 */       return ☃;
/*     */     }
/* 219 */     if (☃ == k && i != j) {
/* 220 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 224 */     if (i == j && ☃ != k) {
/* 225 */       return i;
/*     */     }
/* 227 */     if (i == k && ☃ != j) {
/* 228 */       return i;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 233 */     if (j == k && ☃ != i) {
/* 234 */       return j;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     return a(new int[] { ☃, i, j, k });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */