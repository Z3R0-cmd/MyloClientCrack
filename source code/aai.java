/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aai
/*     */   extends zw
/*     */ {
/*  33 */   private Map<Integer, List<pf>> a = Maps.newHashMap();
/*  34 */   private static final Map<List<pf>, Integer> b = Maps.newLinkedHashMap();
/*     */   
/*     */   public aai() {
/*  37 */     c(1);
/*  38 */     a(true);
/*  39 */     d(0);
/*  40 */     a(yz.k);
/*     */   }
/*     */   
/*     */   public List<pf> h(zx ☃) {
/*  44 */     if (!☃.n() || !☃.o().b("CustomPotionEffects", 9)) {
/*  45 */       List<pf> list1 = this.a.get(Integer.valueOf(☃.i()));
/*     */       
/*  47 */       if (list1 == null) {
/*  48 */         list1 = abe.b(☃.i(), false);
/*  49 */         this.a.put(Integer.valueOf(☃.i()), list1);
/*     */       } 
/*     */       
/*  52 */       return list1;
/*     */     } 
/*  54 */     List<pf> list = Lists.newArrayList();
/*  55 */     du du = ☃.o().c("CustomPotionEffects", 10);
/*     */     
/*  57 */     for (int i = 0; i < du.c(); i++) {
/*  58 */       dn dn = du.b(i);
/*  59 */       pf pf = pf.b(dn);
/*  60 */       if (pf != null) {
/*  61 */         list.add(pf);
/*     */       }
/*     */     } 
/*     */     
/*  65 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<pf> e(int ☃) {
/*  70 */     List<pf> list = this.a.get(Integer.valueOf(☃));
/*  71 */     if (list == null) {
/*  72 */       list = abe.b(☃, false);
/*  73 */       this.a.put(Integer.valueOf(☃), list);
/*     */     } 
/*  75 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx b(zx ☃, adm adm1, wn wn1) {
/*  80 */     if (!wn1.bA.d) {
/*  81 */       ☃.b--;
/*     */     }
/*     */     
/*  84 */     if (!adm1.D) {
/*  85 */       List<pf> list = h(☃);
/*  86 */       if (list != null) {
/*  87 */         for (Iterator<pf> iterator = list.iterator(); iterator.hasNext(); ) { pf pf = iterator.next();
/*  88 */           wn1.c(new pf(pf)); }
/*     */       
/*     */       }
/*     */     } 
/*  92 */     wn1.b(na.ad[zw.b(this)]);
/*  93 */     if (!wn1.bA.d) {
/*  94 */       if (☃.b <= 0) {
/*  95 */         return new zx(zy.bA);
/*     */       }
/*  97 */       wn1.bi.a(new zx(zy.bA));
/*     */     } 
/*     */ 
/*     */     
/* 101 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d(zx ☃) {
/* 106 */     return 32;
/*     */   }
/*     */ 
/*     */   
/*     */   public aba e(zx ☃) {
/* 111 */     return aba.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx a(zx ☃, adm adm1, wn wn1) {
/* 116 */     if (f(☃.i())) {
/* 117 */       if (!wn1.bA.d) {
/* 118 */         ☃.b--;
/*     */       }
/* 120 */       adm1.a(wn1, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 121 */       if (!adm1.D) {
/* 122 */         adm1.d(new xc(adm1, wn1, ☃));
/*     */       }
/* 124 */       wn1.b(na.ad[zw.b(this)]);
/* 125 */       return ☃;
/*     */     } 
/* 127 */     wn1.a(☃, d(☃));
/* 128 */     return ☃;
/*     */   }
/*     */   
/*     */   public static boolean f(int ☃) {
/* 132 */     return ((☃ & 0x4000) != 0);
/*     */   }
/*     */   
/*     */   public int g(int ☃) {
/* 136 */     return abe.a(☃, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(zx ☃, int i) {
/* 141 */     if (i > 0) {
/* 142 */       return 16777215;
/*     */     }
/* 144 */     return g(☃.i());
/*     */   }
/*     */   
/*     */   public boolean h(int ☃) {
/* 148 */     List<pf> list = e(☃);
/* 149 */     if (list == null || list.isEmpty()) {
/* 150 */       return false;
/*     */     }
/* 152 */     for (Iterator<pf> iterator = list.iterator(); iterator.hasNext(); ) { pf pf = iterator.next();
/* 153 */       if (pe.a[pf.a()].b()) {
/* 154 */         return true;
/*     */       } }
/*     */     
/* 157 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(zx ☃) {
/* 162 */     if (☃.i() == 0) {
/* 163 */       return di.a("item.emptyPotion.name").trim();
/*     */     }
/*     */     
/* 166 */     String str1 = "";
/* 167 */     if (f(☃.i())) {
/* 168 */       str1 = di.a("potion.prefix.grenade").trim() + " ";
/*     */     }
/*     */     
/* 171 */     List<pf> list = zy.bz.h(☃);
/* 172 */     if (list != null && !list.isEmpty()) {
/* 173 */       String str = ((pf)list.get(0)).g();
/* 174 */       str = str + ".postfix";
/* 175 */       return str1 + di.a(str).trim();
/*     */     } 
/* 177 */     String str2 = abe.c(☃.i());
/* 178 */     return di.a(str2).trim() + " " + super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(zx ☃, wn wn1, List<String> list, boolean bool) {
/* 184 */     if (☃.i() == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 188 */     List<pf> list1 = zy.bz.h(☃);
/* 189 */     HashMultimap hashMultimap = HashMultimap.create();
/*     */     
/* 191 */     if (list1 != null && !list1.isEmpty()) {
/* 192 */       for (Iterator<pf> iterator = list1.iterator(); iterator.hasNext(); ) { pf pf = iterator.next();
/* 193 */         String str = di.a(pf.g()).trim();
/* 194 */         pe pe = pe.a[pf.a()];
/* 195 */         Map<qb, qd> map = pe.l();
/*     */         
/* 197 */         if (map != null && map.size() > 0) {
/* 198 */           for (Iterator<Map.Entry<qb, qd>> iterator1 = map.entrySet().iterator(); iterator1.hasNext(); ) { Map.Entry<qb, qd> entry = iterator1.next();
/* 199 */             qd qd1 = entry.getValue();
/* 200 */             qd qd2 = new qd(qd1.b(), pe.a(pf.c(), qd1), qd1.c());
/* 201 */             hashMultimap.put(((qb)entry.getKey()).a(), qd2); }
/*     */         
/*     */         }
/*     */         
/* 205 */         if (pf.c() > 0) {
/* 206 */           str = str + " " + di.a("potion.potency." + pf.c()).trim();
/*     */         }
/*     */         
/* 209 */         if (pf.b() > 20) {
/* 210 */           str = str + " (" + pe.a(pf) + ")";
/*     */         }
/*     */         
/* 213 */         if (pe.g()) {
/* 214 */           list.add(a.m + str); continue;
/*     */         } 
/* 216 */         list.add(a.h + str); }
/*     */     
/*     */     } else {
/*     */       
/* 220 */       String str = di.a("potion.empty").trim();
/* 221 */       list.add(a.h + str);
/*     */     } 
/*     */     
/* 224 */     if (!hashMultimap.isEmpty()) {
/* 225 */       list.add("");
/* 226 */       list.add(a.f + di.a("potion.effects.whenDrank"));
/*     */       
/* 228 */       for (Iterator<Map.Entry<String, qd>> iterator = hashMultimap.entries().iterator(); iterator.hasNext(); ) { double d2; Map.Entry<String, qd> entry = iterator.next();
/* 229 */         qd qd = entry.getValue();
/* 230 */         double d1 = qd.d();
/*     */ 
/*     */         
/* 233 */         if (qd.c() == 1 || qd.c() == 2) {
/* 234 */           d2 = qd.d() * 100.0D;
/*     */         } else {
/* 236 */           d2 = qd.d();
/*     */         } 
/*     */         
/* 239 */         if (d1 > 0.0D) {
/* 240 */           list.add(a.j + di.a("attribute.modifier.plus." + qd.c(), new Object[] { zx.a.format(d2), di.a("attribute.name." + (String)entry.getKey()) })); continue;
/* 241 */         }  if (d1 < 0.0D) {
/* 242 */           d2 *= -1.0D;
/* 243 */           list.add(a.m + di.a("attribute.modifier.take." + qd.c(), new Object[] { zx.a.format(d2), di.a("attribute.name." + (String)entry.getKey()) }));
/*     */         }  }
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(zx ☃) {
/* 251 */     List<pf> list = h(☃);
/* 252 */     return (list != null && !list.isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/* 257 */     super.a(☃, yz1, list);
/*     */     
/* 259 */     if (b.isEmpty()) {
/* 260 */       for (int i = 0; i <= 15; i++) {
/* 261 */         for (int j = 0; j <= 1; j++) {
/* 262 */           int k = i;
/* 263 */           if (j == 0) {
/* 264 */             k |= 0x2000;
/*     */           } else {
/* 266 */             k |= 0x4000;
/*     */           } 
/* 268 */           for (int m = 0; m <= 2; m++) {
/* 269 */             int n = k;
/* 270 */             if (m != 0)
/*     */             {
/* 272 */               if (m == 1) {
/* 273 */                 n |= 0x20;
/* 274 */               } else if (m == 2) {
/* 275 */                 n |= 0x40;
/*     */               } 
/*     */             }
/* 278 */             List<pf> list1 = abe.b(n, false);
/*     */             
/* 280 */             if (list1 != null && !list1.isEmpty()) {
/* 281 */               b.put(list1, Integer.valueOf(n));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 288 */     for (Iterator<Integer> iterator = b.values().iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/* 289 */       list.add(new zx(☃, 1, i)); }
/*     */   
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */