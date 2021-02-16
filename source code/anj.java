/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.ConcurrentHashMap;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anj
/*     */   implements and, aud
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*  39 */   private Map<adg, dn> b = new ConcurrentHashMap<adg, dn>();
/*  40 */   private Set<adg> c = Collections.newSetFromMap(new ConcurrentHashMap<adg, Boolean>());
/*     */   
/*     */   private final File d;
/*     */   private boolean e = false;
/*     */   
/*     */   public anj(File ☃) {
/*  46 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public amy a(adm ☃, int i, int j) throws IOException {
/*  51 */     adg adg = new adg(i, j);
/*     */     
/*  53 */     dn dn = this.b.get(adg);
/*     */     
/*  55 */     if (dn == null) {
/*  56 */       DataInputStream dataInputStream = ani.c(this.d, i, j);
/*  57 */       if (dataInputStream != null) {
/*  58 */         dn = dx.a(dataInputStream);
/*     */       } else {
/*  60 */         return null;
/*     */       } 
/*     */     } 
/*     */     
/*  64 */     return a(☃, i, j, dn);
/*     */   }
/*     */   
/*     */   protected amy a(adm ☃, int i, int j, dn dn1) {
/*  68 */     if (!dn1.b("Level", 10)) {
/*  69 */       a.error("Chunk file at " + i + "," + j + " is missing level data, skipping");
/*  70 */       return null;
/*     */     } 
/*  72 */     dn dn2 = dn1.m("Level");
/*  73 */     if (!dn2.b("Sections", 9)) {
/*  74 */       a.error("Chunk file at " + i + "," + j + " is missing block data, skipping");
/*  75 */       return null;
/*     */     } 
/*  77 */     amy amy = a(☃, dn2);
/*  78 */     if (!amy.a(i, j)) {
/*  79 */       a.error("Chunk file at " + i + "," + j + " is in the wrong location; relocating. (Expected " + i + ", " + j + ", got " + amy.a + ", " + amy.b + ")");
/*  80 */       dn2.a("xPos", i);
/*  81 */       dn2.a("zPos", j);
/*  82 */       amy = a(☃, dn2);
/*     */     } 
/*  84 */     return amy;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, amy amy1) throws IOException, adn {
/*  89 */     ☃.I();
/*     */     
/*     */     try {
/*  92 */       dn dn1 = new dn();
/*  93 */       dn dn2 = new dn();
/*  94 */       dn1.a("Level", dn2);
/*  95 */       a(amy1, ☃, dn2);
/*  96 */       a(amy1.j(), dn1);
/*  97 */     } catch (Exception exception) {
/*  98 */       a.error("Failed to save chunk", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(adg ☃, dn dn1) {
/* 103 */     if (!this.c.contains(☃)) {
/* 104 */       this.b.put(☃, dn1);
/*     */     }
/* 106 */     auc.a().a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 111 */     if (this.b.isEmpty()) {
/* 112 */       if (this.e) {
/* 113 */         a.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[] { this.d.getName() });
/*     */       }
/* 115 */       return false;
/*     */     } 
/*     */     
/* 118 */     adg ☃ = this.b.keySet().iterator().next();
/*     */     try {
/* 120 */       this.c.add(☃);
/* 121 */       dn dn = this.b.remove(☃);
/* 122 */       if (dn != null) {
/*     */         try {
/* 124 */           b(☃, dn);
/* 125 */         } catch (Exception exception) {
/* 126 */           a.error("Failed to save chunk", exception);
/*     */         } 
/*     */       }
/*     */       
/* 130 */       return true;
/*     */     } finally {
/* 132 */       this.c.remove(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void b(adg ☃, dn dn1) throws IOException {
/* 138 */     DataOutputStream dataOutputStream = ani.d(this.d, ☃.a, ☃.b);
/* 139 */     dx.a(dn1, dataOutputStream);
/* 140 */     dataOutputStream.close();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(adm ☃, amy amy1) throws IOException {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */   
/*     */   public void b() {
/*     */     try {
/* 154 */       this.e = true;
/* 155 */       while (c());
/*     */     } finally {
/*     */       
/* 158 */       this.e = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(amy ☃, adm adm1, dn dn1) {
/* 163 */     dn1.a("V", (byte)1);
/* 164 */     dn1.a("xPos", ☃.a);
/* 165 */     dn1.a("zPos", ☃.b);
/* 166 */     dn1.a("LastUpdate", adm1.K());
/* 167 */     dn1.a("HeightMap", ☃.q());
/* 168 */     dn1.a("TerrainPopulated", ☃.t());
/* 169 */     dn1.a("LightPopulated", ☃.u());
/* 170 */     dn1.a("InhabitedTime", ☃.w());
/*     */     
/* 172 */     amz[] arrayOfAmz1 = ☃.h();
/* 173 */     du du1 = new du();
/*     */     
/* 175 */     boolean bool = !adm1.t.o(); amz[] arrayOfAmz2;
/*     */     int i, j;
/* 177 */     for (arrayOfAmz2 = arrayOfAmz1, i = arrayOfAmz2.length, j = 0; j < i; ) { amz amz = arrayOfAmz2[j];
/* 178 */       if (amz != null) {
/*     */ 
/*     */         
/* 181 */         dn dn2 = new dn();
/*     */         
/* 183 */         dn2.a("Y", (byte)(amz.d() >> 4 & 0xFF));
/* 184 */         byte[] arrayOfByte = new byte[(amz.g()).length];
/* 185 */         amw amw1 = new amw();
/* 186 */         amw amw2 = null;
/* 187 */         for (int k = 0; k < (amz.g()).length; k++) {
/* 188 */           char c = amz.g()[k];
/* 189 */           int m = k & 0xF;
/* 190 */           int n = k >> 8 & 0xF;
/* 191 */           int i1 = k >> 4 & 0xF;
/*     */           
/* 193 */           if (c >> 12 != 0) {
/* 194 */             if (amw2 == null) {
/* 195 */               amw2 = new amw();
/*     */             }
/* 197 */             amw2.a(m, n, i1, c >> 12);
/*     */           } 
/* 199 */           arrayOfByte[k] = (byte)(c >> 4 & 0xFF);
/* 200 */           amw1.a(m, n, i1, c & 0xF);
/*     */         } 
/* 202 */         dn2.a("Blocks", arrayOfByte);
/* 203 */         dn2.a("Data", amw1.a());
/* 204 */         if (amw2 != null) {
/* 205 */           dn2.a("Add", amw2.a());
/*     */         }
/* 207 */         dn2.a("BlockLight", amz.h().a());
/* 208 */         if (bool) {
/* 209 */           dn2.a("SkyLight", amz.i().a());
/*     */         } else {
/*     */           
/* 212 */           dn2.a("SkyLight", new byte[(amz.h().a()).length]);
/*     */         } 
/*     */         
/* 215 */         du1.a(dn2);
/*     */       }  j++; }
/* 217 */      dn1.a("Sections", du1);
/* 218 */     dn1.a("Biomes", ☃.k());
/*     */     
/* 220 */     ☃.g(false);
/* 221 */     du du2 = new du();
/* 222 */     for (i = 0; i < (☃.s()).length; i++) {
/* 223 */       for (Iterator<pk> iterator1 = ☃.s()[i].iterator(); iterator1.hasNext(); ) { pk pk = iterator1.next();
/* 224 */         dn dn2 = new dn();
/* 225 */         if (pk.d(dn2)) {
/* 226 */           ☃.g(true);
/* 227 */           du2.a(dn2);
/*     */         }  }
/*     */     
/*     */     } 
/* 231 */     dn1.a("Entities", du2);
/*     */     
/* 233 */     du du3 = new du();
/* 234 */     for (Iterator<akw> iterator = ☃.r().values().iterator(); iterator.hasNext(); ) { akw akw = iterator.next();
/* 235 */       dn dn2 = new dn();
/* 236 */       akw.b(dn2);
/* 237 */       du3.a(dn2); }
/*     */     
/* 239 */     dn1.a("TileEntities", du3);
/*     */     
/* 241 */     List<adw> list = adm1.a(☃, false);
/* 242 */     if (list != null) {
/* 243 */       long l = adm1.K();
/*     */       
/* 245 */       du du = new du();
/* 246 */       for (Iterator<adw> iterator1 = list.iterator(); iterator1.hasNext(); ) { adw adw = iterator1.next();
/* 247 */         dn dn2 = new dn();
/* 248 */         jy jy = afh.c.c(adw.a());
/* 249 */         dn2.a("i", (jy == null) ? "" : jy.toString());
/* 250 */         dn2.a("x", adw.a.n());
/* 251 */         dn2.a("y", adw.a.o());
/* 252 */         dn2.a("z", adw.a.p());
/* 253 */         dn2.a("t", (int)(adw.b - l));
/* 254 */         dn2.a("p", adw.c);
/*     */         
/* 256 */         du.a(dn2); }
/*     */       
/* 258 */       dn1.a("TileTicks", du);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private amy a(adm ☃, dn dn1) {
/* 264 */     int i = dn1.f("xPos");
/* 265 */     int j = dn1.f("zPos");
/*     */     
/* 267 */     amy amy = new amy(☃, i, j);
/* 268 */     amy.a(dn1.l("HeightMap"));
/* 269 */     amy.d(dn1.n("TerrainPopulated"));
/* 270 */     amy.e(dn1.n("LightPopulated"));
/* 271 */     amy.c(dn1.g("InhabitedTime"));
/*     */     
/* 273 */     du du1 = dn1.c("Sections", 10);
/* 274 */     int k = 16;
/* 275 */     amz[] arrayOfAmz = new amz[k];
/*     */     
/* 277 */     boolean bool = !☃.t.o();
/*     */     
/* 279 */     for (int m = 0; m < du1.c(); m++) {
/* 280 */       dn dn2 = du1.b(m);
/*     */       
/* 282 */       int n = dn2.d("Y");
/* 283 */       amz amz = new amz(n << 4, bool);
/* 284 */       byte[] arrayOfByte = dn2.k("Blocks");
/* 285 */       amw amw1 = new amw(dn2.k("Data"));
/* 286 */       amw amw2 = dn2.b("Add", 7) ? new amw(dn2.k("Add")) : null;
/* 287 */       char[] arrayOfChar = new char[arrayOfByte.length];
/* 288 */       for (int i1 = 0; i1 < arrayOfChar.length; i1++) {
/* 289 */         int i2 = i1 & 0xF;
/* 290 */         int i3 = i1 >> 8 & 0xF;
/* 291 */         int i4 = i1 >> 4 & 0xF;
/* 292 */         int i5 = (amw2 != null) ? amw2.a(i2, i3, i4) : 0;
/* 293 */         arrayOfChar[i1] = (char)(i5 << 12 | (arrayOfByte[i1] & 0xFF) << 4 | amw1.a(i2, i3, i4));
/*     */       } 
/* 295 */       amz.a(arrayOfChar);
/* 296 */       amz.a(new amw(dn2.k("BlockLight")));
/* 297 */       if (bool) {
/* 298 */         amz.b(new amw(dn2.k("SkyLight")));
/*     */       }
/* 300 */       amz.e();
/*     */       
/* 302 */       arrayOfAmz[n] = amz;
/*     */     } 
/* 304 */     amy.a(arrayOfAmz);
/* 305 */     if (dn1.b("Biomes", 7)) {
/* 306 */       amy.a(dn1.k("Biomes"));
/*     */     }
/*     */     
/* 309 */     du du2 = dn1.c("Entities", 10);
/* 310 */     if (du2 != null) {
/* 311 */       for (int n = 0; n < du2.c(); n++) {
/* 312 */         dn dn2 = du2.b(n);
/* 313 */         pk pk = pm.a(dn2, ☃);
/* 314 */         amy.g(true);
/* 315 */         if (pk != null) {
/* 316 */           amy.a(pk);
/*     */ 
/*     */           
/* 319 */           pk pk1 = pk;
/* 320 */           dn dn3 = dn2;
/* 321 */           while (dn3.b("Riding", 10)) {
/* 322 */             pk pk2 = pm.a(dn3.m("Riding"), ☃);
/* 323 */             if (pk2 != null) {
/* 324 */               amy.a(pk2);
/* 325 */               pk1.a(pk2);
/*     */             } 
/* 327 */             pk1 = pk2;
/* 328 */             dn3 = dn3.m("Riding");
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 334 */     du du3 = dn1.c("TileEntities", 10);
/* 335 */     if (du3 != null) {
/* 336 */       for (int n = 0; n < du3.c(); n++) {
/* 337 */         dn dn2 = du3.b(n);
/* 338 */         akw akw = akw.c(dn2);
/* 339 */         if (akw != null) {
/* 340 */           amy.a(akw);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 345 */     if (dn1.b("TileTicks", 9)) {
/* 346 */       du du = dn1.c("TileTicks", 10);
/*     */       
/* 348 */       if (du != null) {
/* 349 */         for (int n = 0; n < du.c(); n++) {
/* 350 */           afh afh; dn dn2 = du.b(n);
/*     */ 
/*     */           
/* 353 */           if (dn2.b("i", 8)) {
/* 354 */             afh = afh.b(dn2.j("i"));
/*     */           } else {
/* 356 */             afh = afh.c(dn2.f("i"));
/*     */           } 
/* 358 */           ☃.b(new cj(dn2.f("x"), dn2.f("y"), dn2.f("z")), afh, dn2.f("t"), dn2.f("p"));
/*     */         } 
/*     */       }
/*     */     } 
/* 362 */     return amy;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */