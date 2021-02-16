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
/*     */ public class ang
/*     */ {
/*     */   public static a a(dn ☃) {
/*  17 */     int i = ☃.f("xPos");
/*  18 */     int j = ☃.f("zPos");
/*     */     
/*  20 */     a a = new a(i, j);
/*  21 */     a.g = ☃.k("Blocks");
/*  22 */     a.f = new ana(☃.k("Data"), 7);
/*  23 */     a.e = new ana(☃.k("SkyLight"), 7);
/*  24 */     a.d = new ana(☃.k("BlockLight"), 7);
/*  25 */     a.c = ☃.k("HeightMap");
/*  26 */     a.b = ☃.n("TerrainPopulated");
/*  27 */     a.h = ☃.c("Entities", 10);
/*  28 */     a.i = ☃.c("TileEntities", 10);
/*  29 */     a.j = ☃.c("TileTicks", 10);
/*     */ 
/*     */     
/*     */     try {
/*  33 */       a.a = ☃.g("LastUpdate");
/*  34 */     } catch (ClassCastException classCastException) {
/*  35 */       a.a = ☃.f("LastUpdate");
/*     */     } 
/*     */     
/*  38 */     return a;
/*     */   }
/*     */   
/*     */   public static void a(a ☃, dn dn1, aec aec1) {
/*  42 */     dn1.a("xPos", ☃.k);
/*  43 */     dn1.a("zPos", ☃.l);
/*  44 */     dn1.a("LastUpdate", ☃.a);
/*  45 */     int[] arrayOfInt = new int[☃.c.length];
/*  46 */     for (int i = 0; i < ☃.c.length; i++) {
/*  47 */       arrayOfInt[i] = ☃.c[i];
/*     */     }
/*  49 */     dn1.a("HeightMap", arrayOfInt);
/*  50 */     dn1.a("TerrainPopulated", ☃.b);
/*     */     
/*  52 */     du du = new du();
/*  53 */     for (int j = 0; j < 8; j++) {
/*     */       
/*  55 */       boolean bool = true;
/*  56 */       for (int m = 0; m < 16 && bool; m++) {
/*  57 */         for (int n = 0; n < 16 && bool; n++) {
/*  58 */           for (int i1 = 0; i1 < 16; i1++) {
/*  59 */             int i2 = m << 11 | i1 << 7 | n + (j << 4);
/*  60 */             int i3 = ☃.g[i2];
/*  61 */             if (i3 != 0) {
/*  62 */               bool = false;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*  69 */       if (!bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  74 */         byte[] arrayOfByte1 = new byte[4096];
/*  75 */         amw amw1 = new amw();
/*  76 */         amw amw2 = new amw();
/*  77 */         amw amw3 = new amw();
/*     */         
/*  79 */         for (int n = 0; n < 16; n++) {
/*  80 */           for (int i1 = 0; i1 < 16; i1++) {
/*  81 */             for (int i2 = 0; i2 < 16; i2++) {
/*  82 */               int i3 = n << 11 | i2 << 7 | i1 + (j << 4);
/*  83 */               int i4 = ☃.g[i3];
/*     */               
/*  85 */               arrayOfByte1[i1 << 8 | i2 << 4 | n] = (byte)(i4 & 0xFF);
/*  86 */               amw1.a(n, i1, i2, ☃.f.a(n, i1 + (j << 4), i2));
/*  87 */               amw2.a(n, i1, i2, ☃.e.a(n, i1 + (j << 4), i2));
/*  88 */               amw3.a(n, i1, i2, ☃.d.a(n, i1 + (j << 4), i2));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/*  93 */         dn dn2 = new dn();
/*     */         
/*  95 */         dn2.a("Y", (byte)(j & 0xFF));
/*  96 */         dn2.a("Blocks", arrayOfByte1);
/*  97 */         dn2.a("Data", amw1.a());
/*  98 */         dn2.a("SkyLight", amw2.a());
/*  99 */         dn2.a("BlockLight", amw3.a());
/*     */         
/* 101 */         du.a(dn2);
/*     */       } 
/* 103 */     }  dn1.a("Sections", du);
/*     */ 
/*     */     
/* 106 */     byte[] arrayOfByte = new byte[256];
/* 107 */     cj.a a1 = new cj.a();
/* 108 */     for (int k = 0; k < 16; k++) {
/* 109 */       for (int m = 0; m < 16; m++) {
/* 110 */         a1.c(☃.k << 4 | k, 0, ☃.l << 4 | m);
/* 111 */         arrayOfByte[m << 4 | k] = (byte)((aec1.a(a1, ady.ad)).az & 0xFF);
/*     */       } 
/*     */     } 
/* 114 */     dn1.a("Biomes", arrayOfByte);
/* 115 */     dn1.a("Entities", ☃.h);
/* 116 */     dn1.a("TileEntities", ☃.i);
/* 117 */     if (☃.j != null) {
/* 118 */       dn1.a("TileTicks", ☃.j);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public long a;
/*     */     
/*     */     public boolean b;
/*     */     public byte[] c;
/*     */     public ana d;
/*     */     public ana e;
/*     */     public ana f;
/*     */     public byte[] g;
/*     */     public du h;
/*     */     public du i;
/*     */     public du j;
/*     */     public final int k;
/*     */     public final int l;
/*     */     
/*     */     public a(int ☃, int i) {
/* 140 */       this.k = ☃;
/* 141 */       this.l = i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ang.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */