/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
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
/*     */ public class ack
/*     */ {
/*  23 */   private static final Random a = new Random();
/*     */   
/*     */   public static int a(int ☃, zx zx1) {
/*  26 */     if (zx1 == null) {
/*  27 */       return 0;
/*     */     }
/*  29 */     du du = zx1.p();
/*  30 */     if (du == null) {
/*  31 */       return 0;
/*     */     }
/*  33 */     for (int i = 0; i < du.c(); i++) {
/*  34 */       int j = du.b(i).e("id");
/*  35 */       int k = du.b(i).e("lvl");
/*     */       
/*  37 */       if (j == ☃) {
/*  38 */         return k;
/*     */       }
/*     */     } 
/*  41 */     return 0;
/*     */   }
/*     */   
/*     */   public static Map<Integer, Integer> a(zx ☃) {
/*  45 */     Map<Integer, Integer> map = Maps.newLinkedHashMap();
/*  46 */     du du = (☃.b() == zy.cd) ? zy.cd.h(☃) : ☃.p();
/*     */     
/*  48 */     if (du != null) {
/*  49 */       for (int i = 0; i < du.c(); i++) {
/*  50 */         int j = du.b(i).e("id");
/*  51 */         int k = du.b(i).e("lvl");
/*     */         
/*  53 */         map.put(Integer.valueOf(j), Integer.valueOf(k));
/*     */       } 
/*     */     }
/*     */     
/*  57 */     return map;
/*     */   }
/*     */   
/*     */   public static void a(Map<Integer, Integer> ☃, zx zx1) {
/*  61 */     du du = new du();
/*     */     
/*  63 */     for (Iterator<Integer> iterator = ☃.keySet().iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/*  64 */       aci aci = aci.c(i);
/*  65 */       if (aci == null) {
/*     */         continue;
/*     */       }
/*     */       
/*  69 */       dn dn = new dn();
/*     */       
/*  71 */       dn.a("id", (short)i);
/*  72 */       dn.a("lvl", (short)((Integer)☃.get(Integer.valueOf(i))).intValue());
/*     */       
/*  74 */       du.a(dn);
/*     */       
/*  76 */       if (zx1.b() == zy.cd) {
/*  77 */         zy.cd.a(zx1, new acl(aci, ((Integer)☃.get(Integer.valueOf(i))).intValue()));
/*     */       } }
/*     */ 
/*     */     
/*  81 */     if (du.c() > 0) {
/*  82 */       if (zx1.b() != zy.cd) {
/*  83 */         zx1.a("ench", du);
/*     */       }
/*  85 */     } else if (zx1.n()) {
/*  86 */       zx1.o().o("ench");
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int a(int ☃, zx[] arrayOfZx) {
/*  91 */     if (arrayOfZx == null) {
/*  92 */       return 0;
/*     */     }
/*  94 */     int i = 0; zx[] arrayOfZx1; int j, k;
/*  95 */     for (arrayOfZx1 = arrayOfZx, j = arrayOfZx1.length, k = 0; k < j; ) { zx zx1 = arrayOfZx1[k];
/*  96 */       int m = a(☃, zx1);
/*  97 */       if (m > i)
/*  98 */         i = m; 
/*     */       k++; }
/*     */     
/* 101 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(c ☃, zx zx1) {
/* 109 */     if (zx1 == null) {
/*     */       return;
/*     */     }
/* 112 */     du du = zx1.p();
/* 113 */     if (du == null) {
/*     */       return;
/*     */     }
/* 116 */     for (int i = 0; i < du.c(); i++) {
/* 117 */       int j = du.b(i).e("id");
/* 118 */       int k = du.b(i).e("lvl");
/*     */       
/* 120 */       if (aci.c(j) != null)
/* 121 */         ☃.a(aci.c(j), k); 
/*     */     } 
/*     */   } private static void a(c ☃, zx[] arrayOfZx) {
/*     */     zx[] arrayOfZx1;
/*     */     int i;
/*     */     int j;
/* 127 */     for (arrayOfZx1 = arrayOfZx, i = arrayOfZx1.length, j = 0; j < i; ) { zx zx1 = arrayOfZx1[j];
/* 128 */       a(☃, zx1);
/*     */       j++; }
/*     */   
/*     */   }
/*     */   static interface c {
/*     */     void a(aci param1aci, int param1Int); }
/*     */   
/*     */   static final class e implements c { public int a;
/*     */     
/*     */     public void a(aci ☃, int i) {
/* 138 */       this.a += ☃.a(i, this.b);
/*     */     }
/*     */     public ow b;
/*     */     private e() {} }
/* 142 */   private static final e b = new e();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(zx[] ☃, ow ow1) {
/* 152 */     b.a = 0;
/* 153 */     b.b = ow1;
/*     */     
/* 155 */     a(b, ☃);
/*     */     
/* 157 */     if (b.a > 25) {
/* 158 */       b.a = 25;
/* 159 */     } else if (b.a < 0) {
/* 160 */       b.a = 0;
/*     */     } 
/*     */ 
/*     */     
/* 164 */     return (b.a + 1 >> 1) + a.nextInt((b.a >> 1) + 1);
/*     */   }
/*     */   
/*     */   static final class d implements c { public float a;
/*     */     public pw b;
/*     */     
/*     */     private d() {}
/*     */     
/*     */     public void a(aci ☃, int i) {
/* 173 */       this.a += ☃.a(i, this.b);
/*     */     } }
/*     */ 
/*     */   
/* 177 */   private static final d c = new d();
/*     */   
/*     */   public static float a(zx ☃, pw pw1) {
/* 180 */     c.a = 0.0F;
/* 181 */     c.b = pw1;
/*     */     
/* 183 */     a(c, ☃);
/*     */     
/* 185 */     return c.a;
/*     */   }
/*     */   
/*     */   static final class b implements c { public pr a;
/*     */     public pk b;
/*     */     
/*     */     private b() {}
/*     */     
/*     */     public void a(aci ☃, int i) {
/* 194 */       ☃.b(this.a, this.b, i);
/*     */     } }
/*     */ 
/*     */   
/* 198 */   private static final b d = new b();
/*     */   
/*     */   public static void a(pr ☃, pk pk1) {
/* 201 */     d.b = pk1;
/* 202 */     d.a = ☃;
/* 203 */     if (☃ != null) {
/* 204 */       a(d, ☃.as());
/*     */     }
/* 206 */     if (pk1 instanceof wn)
/* 207 */       a(d, ☃.bA()); 
/*     */   }
/*     */   
/*     */   static final class a implements c {
/*     */     public pr a;
/*     */     public pk b;
/*     */     
/*     */     private a() {}
/*     */     
/*     */     public void a(aci ☃, int i) {
/* 217 */       ☃.a(this.a, this.b, i);
/*     */     }
/*     */   }
/*     */   
/* 221 */   private static final a e = new a();
/*     */   
/*     */   public static void b(pr ☃, pk pk1) {
/* 224 */     e.a = ☃;
/* 225 */     e.b = pk1;
/* 226 */     if (☃ != null) {
/* 227 */       a(e, ☃.as());
/*     */     }
/* 229 */     if (☃ instanceof wn) {
/* 230 */       a(e, ☃.bA());
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(pr ☃) {
/* 235 */     return a(aci.o.B, ☃.bA());
/*     */   }
/*     */   
/*     */   public static int b(pr ☃) {
/* 239 */     return a(aci.p.B, ☃.bA());
/*     */   }
/*     */   
/*     */   public static int a(pk ☃) {
/* 243 */     return a(aci.h.B, ☃.as());
/*     */   }
/*     */   
/*     */   public static int b(pk ☃) {
/* 247 */     return a(aci.k.B, ☃.as());
/*     */   }
/*     */   
/*     */   public static int c(pr ☃) {
/* 251 */     return a(aci.r.B, ☃.bA());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean e(pr ☃) {
/* 259 */     return (a(aci.s.B, ☃.bA()) > 0);
/*     */   }
/*     */   
/*     */   public static int f(pr ☃) {
/* 263 */     return a(aci.u.B, ☃.bA());
/*     */   }
/*     */   
/*     */   public static int g(pr ☃) {
/* 267 */     return a(aci.z.B, ☃.bA());
/*     */   }
/*     */   
/*     */   public static int h(pr ☃) {
/* 271 */     return a(aci.A.B, ☃.bA());
/*     */   }
/*     */   
/*     */   public static int i(pr ☃) {
/* 275 */     return a(aci.q.B, ☃.bA());
/*     */   }
/*     */   
/*     */   public static boolean j(pr ☃) {
/* 279 */     return (a(aci.i.B, ☃.as()) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public static zx a(aci ☃, pr pr1) {
/*     */     zx[] arrayOfZx;
/*     */     int i;
/*     */     int j;
/* 287 */     for (arrayOfZx = pr1.as(), i = arrayOfZx.length, j = 0; j < i; ) { zx zx = arrayOfZx[j];
/* 288 */       if (zx != null && a(☃.B, zx) > 0) {
/* 289 */         return zx;
/*     */       }
/*     */       j++; }
/*     */     
/* 293 */     return null;
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
/*     */   public static int a(Random ☃, int i, int j, zx zx1) {
/* 307 */     zw zw = zx1.b();
/* 308 */     int k = zw.b();
/*     */     
/* 310 */     if (k <= 0)
/*     */     {
/* 312 */       return 0;
/*     */     }
/*     */     
/* 315 */     if (j > 15) {
/* 316 */       j = 15;
/*     */     }
/* 318 */     int m = ☃.nextInt(8) + 1 + (j >> 1) + ☃.nextInt(j + 1);
/* 319 */     if (i == 0) {
/* 320 */       return Math.max(m / 3, 1);
/*     */     }
/* 322 */     if (i == 1) {
/* 323 */       return m * 2 / 3 + 1;
/*     */     }
/* 325 */     return Math.max(m, j * 2);
/*     */   }
/*     */   
/*     */   public static zx a(Random ☃, zx zx1, int i) {
/* 329 */     List<acl> list = b(☃, zx1, i);
/* 330 */     boolean bool = (zx1.b() == zy.aL);
/*     */     
/* 332 */     if (bool) {
/* 333 */       zx1.a(zy.cd);
/*     */     }
/*     */     
/* 336 */     if (list != null) {
/* 337 */       for (Iterator<acl> iterator = list.iterator(); iterator.hasNext(); ) { acl acl = iterator.next();
/* 338 */         if (bool) {
/* 339 */           zy.cd.a(zx1, acl); continue;
/*     */         } 
/* 341 */         zx1.a(acl.b, acl.c); }
/*     */     
/*     */     }
/*     */ 
/*     */     
/* 346 */     return zx1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<acl> b(Random ☃, zx zx1, int i) {
/* 357 */     zw zw = zx1.b();
/* 358 */     int j = zw.b();
/*     */     
/* 360 */     if (j <= 0) {
/* 361 */       return null;
/*     */     }
/* 363 */     j /= 2;
/* 364 */     j = 1 + ☃.nextInt((j >> 1) + 1) + ☃.nextInt((j >> 1) + 1);
/*     */     
/* 366 */     int k = j + i;
/*     */ 
/*     */     
/* 369 */     float f = (☃.nextFloat() + ☃.nextFloat() - 1.0F) * 0.15F;
/* 370 */     int m = (int)(k * (1.0F + f) + 0.5F);
/* 371 */     if (m < 1) {
/* 372 */       m = 1;
/*     */     }
/*     */     
/* 375 */     List<acl> list = null;
/*     */     
/* 377 */     Map<Integer, acl> map = b(m, zx1);
/* 378 */     if (map != null && !map.isEmpty()) {
/* 379 */       acl acl = oa.<acl>a(☃, map.values());
/*     */       
/* 381 */       if (acl != null) {
/* 382 */         list = Lists.newArrayList();
/* 383 */         list.add(acl);
/*     */         
/* 385 */         int n = m;
/* 386 */         while (☃.nextInt(50) <= n) {
/*     */           
/* 388 */           Iterator<Integer> iterator = map.keySet().iterator();
/* 389 */           while (iterator.hasNext()) {
/* 390 */             Integer integer = iterator.next();
/* 391 */             boolean bool = true;
/* 392 */             for (Iterator<acl> iterator1 = list.iterator(); iterator1.hasNext(); ) { acl acl1 = iterator1.next();
/* 393 */               if (!acl1.b.a(aci.c(integer.intValue()))) {
/* 394 */                 bool = false;
/*     */                 break;
/*     */               }  }
/*     */             
/* 398 */             if (!bool) {
/* 399 */               iterator.remove();
/*     */             }
/*     */           } 
/*     */           
/* 403 */           if (!map.isEmpty()) {
/* 404 */             acl acl1 = oa.<acl>a(☃, map.values());
/* 405 */             list.add(acl1);
/*     */           } 
/*     */           
/* 408 */           n >>= 1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 413 */     return list;
/*     */   }
/*     */   
/*     */   public static Map<Integer, acl> b(int ☃, zx zx1) {
/* 417 */     zw zw = zx1.b();
/* 418 */     Map<Integer, acl> map = null;
/* 419 */     boolean bool = (zx1.b() == zy.aL); aci[] arrayOfAci;
/*     */     int i, j;
/* 421 */     for (arrayOfAci = aci.b, i = arrayOfAci.length, j = 0; j < i; ) { aci aci = arrayOfAci[j];
/* 422 */       if (aci != null)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 427 */         if (aci.C.a(zw) || bool)
/*     */         {
/*     */ 
/*     */           
/* 431 */           for (int k = aci.e(); k <= aci.b(); k++) {
/* 432 */             if (☃ >= aci.a(k) && ☃ <= aci.b(k)) {
/* 433 */               if (map == null) {
/* 434 */                 map = Maps.newHashMap();
/*     */               }
/*     */               
/* 437 */               map.put(Integer.valueOf(aci.B), new acl(aci, k));
/*     */             } 
/*     */           }  }  } 
/*     */       j++; }
/*     */     
/* 442 */     return map;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */