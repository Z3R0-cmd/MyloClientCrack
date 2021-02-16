/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class auo
/*     */ {
/*  24 */   private final Map<String, auk> a = Maps.newHashMap();
/*  25 */   private final Map<auu, List<auk>> b = Maps.newHashMap();
/*  26 */   private final Map<String, Map<auk, aum>> c = Maps.newHashMap();
/*  27 */   private final auk[] d = new auk[19];
/*  28 */   private final Map<String, aul> e = Maps.newHashMap();
/*  29 */   private final Map<String, aul> f = Maps.newHashMap();
/*     */   
/*     */   public auk b(String ☃) {
/*  32 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   public auk a(String ☃, auu auu1) {
/*  36 */     if (☃.length() > 16) {
/*  37 */       throw new IllegalArgumentException("The objective name '" + ☃ + "' is too long!");
/*     */     }
/*  39 */     auk auk1 = b(☃);
/*  40 */     if (auk1 != null) {
/*  41 */       throw new IllegalArgumentException("An objective with the name '" + ☃ + "' already exists!");
/*     */     }
/*     */     
/*  44 */     auk1 = new auk(this, ☃, auu1);
/*     */     
/*  46 */     List<auk> list = this.b.get(auu1);
/*     */     
/*  48 */     if (list == null) {
/*  49 */       list = Lists.newArrayList();
/*  50 */       this.b.put(auu1, list);
/*     */     } 
/*     */     
/*  53 */     list.add(auk1);
/*  54 */     this.a.put(☃, auk1);
/*  55 */     a(auk1);
/*     */     
/*  57 */     return auk1;
/*     */   }
/*     */   
/*     */   public Collection<auk> a(auu ☃) {
/*  61 */     Collection<auk> collection = this.b.get(☃);
/*     */ 
/*     */     
/*  64 */     return (collection == null) ? Lists.newArrayList() : Lists.newArrayList(collection);
/*     */   }
/*     */   
/*     */   public boolean b(String ☃, auk auk1) {
/*  68 */     Map<auk, aum> map = this.c.get(☃);
/*  69 */     if (map == null) {
/*  70 */       return false;
/*     */     }
/*  72 */     aum aum = map.get(auk1);
/*  73 */     if (aum == null) {
/*  74 */       return false;
/*     */     }
/*  76 */     return true;
/*     */   }
/*     */   
/*     */   public aum c(String ☃, auk auk1) {
/*  80 */     if (☃.length() > 40) {
/*  81 */       throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
/*     */     }
/*  83 */     Map<auk, aum> map = this.c.get(☃);
/*     */     
/*  85 */     if (map == null) {
/*  86 */       map = Maps.newHashMap();
/*  87 */       this.c.put(☃, map);
/*     */     } 
/*     */     
/*  90 */     aum aum = map.get(auk1);
/*     */     
/*  92 */     if (aum == null) {
/*  93 */       aum = new aum(this, auk1, ☃);
/*  94 */       map.put(auk1, aum);
/*     */     } 
/*     */     
/*  97 */     return aum;
/*     */   }
/*     */   
/*     */   public Collection<aum> i(auk ☃) {
/* 101 */     List<aum> list = Lists.newArrayList();
/*     */     
/* 103 */     for (Iterator<Map<auk, aum>> iterator = this.c.values().iterator(); iterator.hasNext(); ) { Map<auk, aum> map = iterator.next();
/* 104 */       aum aum = map.get(☃);
/* 105 */       if (aum != null) {
/* 106 */         list.add(aum);
/*     */       } }
/*     */ 
/*     */     
/* 110 */     Collections.sort(list, aum.a);
/*     */     
/* 112 */     return list;
/*     */   }
/*     */   
/*     */   public Collection<auk> c() {
/* 116 */     return this.a.values();
/*     */   }
/*     */   
/*     */   public Collection<String> d() {
/* 120 */     return this.c.keySet();
/*     */   }
/*     */   
/*     */   public void d(String ☃, auk auk1) {
/* 124 */     if (auk1 == null) {
/* 125 */       Map<auk, aum> map = this.c.remove(☃);
/* 126 */       if (map != null) {
/* 127 */         a(☃);
/*     */       }
/*     */     } else {
/* 130 */       Map<auk, aum> map = this.c.get(☃);
/* 131 */       if (map != null) {
/* 132 */         aum aum = map.remove(auk1);
/* 133 */         if (map.size() < 1) {
/* 134 */           Map<auk, aum> map1 = this.c.remove(☃);
/* 135 */           if (map1 != null) {
/* 136 */             a(☃);
/*     */           }
/* 138 */         } else if (aum != null) {
/* 139 */           a(☃, auk1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Collection<aum> e() {
/* 146 */     Collection<Map<auk, aum>> ☃ = this.c.values();
/* 147 */     List<aum> list = Lists.newArrayList();
/*     */     
/* 149 */     for (Iterator<Map<auk, aum>> iterator = ☃.iterator(); iterator.hasNext(); ) { Map<auk, aum> map = iterator.next();
/* 150 */       list.addAll(map.values()); }
/*     */ 
/*     */     
/* 153 */     return list;
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
/*     */   public Map<auk, aum> c(String ☃) {
/* 171 */     Map<auk, aum> map = this.c.get(☃);
/* 172 */     if (map == null) {
/* 173 */       map = Maps.newHashMap();
/*     */     }
/* 175 */     return map;
/*     */   }
/*     */   
/*     */   public void k(auk ☃) {
/* 179 */     this.a.remove(☃.b());
/*     */     
/* 181 */     for (int i = 0; i < 19; i++) {
/* 182 */       if (a(i) == ☃) {
/* 183 */         a(i, (auk)null);
/*     */       }
/*     */     } 
/*     */     
/* 187 */     List<auk> list = this.b.get(☃.c());
/* 188 */     if (list != null) {
/* 189 */       list.remove(☃);
/*     */     }
/*     */     
/* 192 */     for (Iterator<Map<auk, aum>> iterator = this.c.values().iterator(); iterator.hasNext(); ) { Map<auk, aum> map = iterator.next();
/* 193 */       map.remove(☃); }
/*     */ 
/*     */     
/* 196 */     c(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, auk auk1) {
/* 200 */     this.d[☃] = auk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public auk a(int ☃) {
/* 205 */     return this.d[☃];
/*     */   }
/*     */   
/*     */   public aul d(String ☃) {
/* 209 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public aul e(String ☃) {
/* 213 */     if (☃.length() > 16) {
/* 214 */       throw new IllegalArgumentException("The team name '" + ☃ + "' is too long!");
/*     */     }
/* 216 */     aul aul = d(☃);
/* 217 */     if (aul != null) {
/* 218 */       throw new IllegalArgumentException("A team with the name '" + ☃ + "' already exists!");
/*     */     }
/*     */     
/* 221 */     aul = new aul(this, ☃);
/* 222 */     this.e.put(☃, aul);
/* 223 */     a(aul);
/*     */     
/* 225 */     return aul;
/*     */   }
/*     */   
/*     */   public void d(aul ☃) {
/* 229 */     this.e.remove(☃.b());
/*     */ 
/*     */ 
/*     */     
/* 233 */     for (Iterator<String> iterator = ☃.d().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 234 */       this.f.remove(str); }
/*     */ 
/*     */     
/* 237 */     c(☃);
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, String str1) {
/* 241 */     if (☃.length() > 40) {
/* 242 */       throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
/*     */     }
/* 244 */     if (!this.e.containsKey(str1)) {
/* 245 */       return false;
/*     */     }
/* 247 */     aul aul = d(str1);
/*     */     
/* 249 */     if (h(☃) != null) {
/* 250 */       f(☃);
/*     */     }
/*     */     
/* 253 */     this.f.put(☃, aul);
/* 254 */     aul.d().add(☃);
/* 255 */     return true;
/*     */   }
/*     */   
/*     */   public boolean f(String ☃) {
/* 259 */     aul aul = h(☃);
/*     */     
/* 261 */     if (aul != null) {
/* 262 */       a(☃, aul);
/* 263 */       return true;
/*     */     } 
/* 265 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, aul aul1) {
/* 270 */     if (h(☃) != aul1) {
/* 271 */       throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + aul1.b() + "'.");
/*     */     }
/*     */     
/* 274 */     this.f.remove(☃);
/* 275 */     aul1.d().remove(☃);
/*     */   }
/*     */   
/*     */   public Collection<String> f() {
/* 279 */     return this.e.keySet();
/*     */   }
/*     */   
/*     */   public Collection<aul> g() {
/* 283 */     return this.e.values();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aul h(String ☃) {
/* 291 */     return this.f.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(auk ☃) {}
/*     */ 
/*     */   
/*     */   public void b(auk ☃) {}
/*     */ 
/*     */   
/*     */   public void c(auk ☃) {}
/*     */ 
/*     */   
/*     */   public void a(aum ☃) {}
/*     */ 
/*     */   
/*     */   public void a(String ☃) {}
/*     */ 
/*     */   
/*     */   public void a(String ☃, auk auk1) {}
/*     */ 
/*     */   
/*     */   public void a(aul ☃) {}
/*     */ 
/*     */   
/*     */   public void b(aul ☃) {}
/*     */ 
/*     */   
/*     */   public void c(aul ☃) {}
/*     */   
/*     */   public static String b(int ☃) {
/* 322 */     switch (☃) {
/*     */       case 0:
/* 324 */         return "list";
/*     */       case 1:
/* 326 */         return "sidebar";
/*     */       case 2:
/* 328 */         return "belowName";
/*     */     } 
/* 330 */     if (☃ >= 3 && ☃ <= 18) {
/* 331 */       a a = a.a(☃ - 3);
/* 332 */       if (a != null && a != a.v) {
/* 333 */         return "sidebar.team." + a.e();
/*     */       }
/*     */     } 
/* 336 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int i(String ☃) {
/* 341 */     if (☃.equalsIgnoreCase("list"))
/* 342 */       return 0; 
/* 343 */     if (☃.equalsIgnoreCase("sidebar"))
/* 344 */       return 1; 
/* 345 */     if (☃.equalsIgnoreCase("belowName")) {
/* 346 */       return 2;
/*     */     }
/* 348 */     if (☃.startsWith("sidebar.team.")) {
/* 349 */       String str = ☃.substring("sidebar.team.".length());
/* 350 */       a a = a.b(str);
/* 351 */       if (a != null && a.b() >= 0) {
/* 352 */         return a.b() + 3;
/*     */       }
/*     */     } 
/* 355 */     return -1;
/*     */   }
/*     */ 
/*     */   
/* 359 */   private static String[] g = null;
/*     */   public static String[] h() {
/* 361 */     if (g == null) {
/* 362 */       g = new String[19];
/* 363 */       for (int ☃ = 0; ☃ < 19; ☃++) {
/* 364 */         g[☃] = b(☃);
/*     */       }
/*     */     } 
/* 367 */     return g;
/*     */   }
/*     */   
/*     */   public void a(pk ☃) {
/* 371 */     if (☃ == null || ☃ instanceof wn || ☃.ai()) {
/*     */       return;
/*     */     }
/* 374 */     String str = ☃.aK().toString();
/* 375 */     d(str, null);
/* 376 */     f(str);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/auo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */