/*     */ import com.google.common.collect.HashMultiset;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Multiset;
/*     */ import com.google.common.collect.Multisets;
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
/*     */ 
/*     */ public class aab
/*     */   extends yy
/*     */ {
/*     */   protected aab() {
/*  30 */     a(true);
/*     */   }
/*     */   
/*     */   public static atg a(int ☃, adm adm1) {
/*  34 */     String str = "map_" + ☃;
/*  35 */     atg atg = (atg)adm1.a((Class)atg.class, str);
/*     */     
/*  37 */     if (atg == null) {
/*  38 */       atg = new atg(str);
/*     */       
/*  40 */       adm1.a(str, atg);
/*     */     } 
/*     */     
/*  43 */     return atg;
/*     */   }
/*     */   
/*     */   public atg a(zx ☃, adm adm1) {
/*  47 */     String str = "map_" + ☃.i();
/*  48 */     atg atg = (atg)adm1.a((Class)atg.class, str);
/*     */     
/*  50 */     if (atg == null && !adm1.D) {
/*  51 */       ☃.b(adm1.b("map"));
/*  52 */       str = "map_" + ☃.i();
/*  53 */       atg = new atg(str);
/*     */       
/*  55 */       atg.e = 3;
/*  56 */       atg.a(adm1.P().c(), adm1.P().e(), atg.e);
/*  57 */       atg.d = (byte)adm1.t.q();
/*     */       
/*  59 */       atg.c();
/*     */       
/*  61 */       adm1.a(str, atg);
/*     */     } 
/*     */     
/*  64 */     return atg;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, pk pk1, atg atg1) {
/*  68 */     if (☃.t.q() != atg1.d || !(pk1 instanceof wn)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  73 */     int i = 1 << atg1.e;
/*  74 */     int j = atg1.b;
/*  75 */     int k = atg1.c;
/*     */     
/*  77 */     int m = ns.c(pk1.s - j) / i + 64;
/*  78 */     int n = ns.c(pk1.u - k) / i + 64;
/*  79 */     int i1 = 128 / i;
/*     */     
/*  81 */     if (☃.t.o()) {
/*  82 */       i1 /= 2;
/*     */     }
/*     */     
/*  85 */     atg.a a = atg1.a((wn)pk1);
/*  86 */     a.b++;
/*     */     
/*  88 */     boolean bool = false;
/*  89 */     for (int i2 = m - i1 + 1; i2 < m + i1; i2++) {
/*  90 */       if ((i2 & 0xF) == (a.b & 0xF) || bool) {
/*     */ 
/*     */ 
/*     */         
/*  94 */         bool = false;
/*  95 */         double d = 0.0D;
/*  96 */         for (int i3 = n - i1 - 1; i3 < n + i1; i3++) {
/*  97 */           if (i2 >= 0 && i3 >= -1 && i2 < 128 && i3 < 128) {
/*     */ 
/*     */ 
/*     */             
/* 101 */             int i4 = i2 - m;
/* 102 */             int i5 = i3 - n;
/*     */             
/* 104 */             boolean bool1 = (i4 * i4 + i5 * i5 > (i1 - 2) * (i1 - 2));
/*     */             
/* 106 */             int i6 = (j / i + i2 - 64) * i;
/* 107 */             int i7 = (k / i + i3 - 64) * i;
/*     */             
/* 109 */             HashMultiset hashMultiset = HashMultiset.create();
/*     */             
/* 111 */             amy amy = ☃.f(new cj(i6, 0, i7));
/* 112 */             if (!amy.f()) {
/*     */ 
/*     */               
/* 115 */               int i8 = i6 & 0xF;
/* 116 */               int i9 = i7 & 0xF;
/* 117 */               int i10 = 0;
/*     */               
/* 119 */               double d1 = 0.0D;
/* 120 */               if (☃.t.o()) {
/* 121 */                 int i12 = i6 + i7 * 231871;
/* 122 */                 i12 = i12 * i12 * 31287121 + i12 * 11;
/*     */                 
/* 124 */                 if ((i12 >> 20 & 0x1) == 0) {
/* 125 */                   hashMultiset.add(afi.d.g(afi.d.Q().a(agf.a, agf.a.a)), 10);
/*     */                 } else {
/* 127 */                   hashMultiset.add(afi.b.g(afi.b.Q().a(ajy.a, ajy.a.a)), 100);
/*     */                 } 
/*     */                 
/* 130 */                 d1 = 100.0D;
/*     */               } else {
/* 132 */                 cj.a a1 = new cj.a();
/* 133 */                 for (int i12 = 0; i12 < i; i12++) {
/* 134 */                   for (int i13 = 0; i13 < i; i13++) {
/* 135 */                     int i14 = amy.b(i12 + i8, i13 + i9) + 1;
/* 136 */                     alz alz = afi.a.Q();
/*     */                     
/* 138 */                     if (i14 > 1) {
/*     */                       do {
/* 140 */                         i14--;
/* 141 */                         alz = amy.g(a1.c(i12 + i8, i14, i13 + i9));
/* 142 */                       } while (alz.c().g(alz) == arn.b && i14 > 0);
/*     */                       
/* 144 */                       if (i14 > 0 && alz.c().t().d()) {
/* 145 */                         afh afh; int i15 = i14 - 1;
/*     */                         
/*     */                         do {
/* 148 */                           afh = amy.a(i12 + i8, i15--, i13 + i9);
/* 149 */                           i10++;
/* 150 */                         } while (i15 > 0 && afh.t().d());
/*     */                       } 
/*     */                     } 
/*     */                     
/* 154 */                     d1 += i14 / (i * i);
/*     */                     
/* 156 */                     hashMultiset.add(alz.c().g(alz));
/*     */                   } 
/*     */                 } 
/*     */               } 
/* 160 */               i10 /= i * i;
/*     */               
/* 162 */               double d2 = (d1 - d) * 4.0D / (i + 4) + ((i2 + i3 & 0x1) - 0.5D) * 0.4D;
/* 163 */               int i11 = 1;
/* 164 */               if (d2 > 0.6D) {
/* 165 */                 i11 = 2;
/*     */               }
/* 167 */               if (d2 < -0.6D) {
/* 168 */                 i11 = 0;
/*     */               }
/*     */               
/* 171 */               arn arn = (arn)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), arn.b);
/*     */               
/* 173 */               if (arn == arn.n) {
/* 174 */                 d2 = i10 * 0.1D + (i2 + i3 & 0x1) * 0.2D;
/* 175 */                 i11 = 1;
/* 176 */                 if (d2 < 0.5D) {
/* 177 */                   i11 = 2;
/*     */                 }
/* 179 */                 if (d2 > 0.9D) {
/* 180 */                   i11 = 0;
/*     */                 }
/*     */               } 
/*     */               
/* 184 */               d = d1;
/*     */               
/* 186 */               if (i3 >= 0)
/*     */               {
/*     */                 
/* 189 */                 if (i4 * i4 + i5 * i5 < i1 * i1)
/*     */                 {
/*     */                   
/* 192 */                   if (!bool1 || (i2 + i3 & 0x1) != 0) {
/*     */ 
/*     */                     
/* 195 */                     byte b1 = atg1.f[i2 + i3 * 128];
/* 196 */                     byte b2 = (byte)(arn.M * 4 + i11);
/* 197 */                     if (b1 != b2) {
/* 198 */                       atg1.f[i2 + i3 * 128] = b2;
/* 199 */                       atg1.a(i2, i3);
/* 200 */                       bool = true;
/*     */                     } 
/*     */                   }  }  } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }  } public void a(zx ☃, adm adm1, pk pk1, int i, boolean bool) {
/* 208 */     if (adm1.D) {
/*     */       return;
/*     */     }
/*     */     
/* 212 */     atg atg = a(☃, adm1);
/* 213 */     if (pk1 instanceof wn) {
/* 214 */       wn wn = (wn)pk1;
/* 215 */       atg.a(wn, ☃);
/*     */     } 
/*     */     
/* 218 */     if (bool) {
/* 219 */       a(adm1, pk1, atg);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ff c(zx ☃, adm adm1, wn wn1) {
/* 226 */     return a(☃, adm1).a(☃, adm1, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(zx ☃, adm adm1, wn wn1) {
/* 231 */     if (☃.n() && ☃.o().n("map_is_scaling")) {
/* 232 */       atg atg1 = zy.bd.a(☃, adm1);
/* 233 */       ☃.b(adm1.b("map"));
/* 234 */       atg atg2 = new atg("map_" + ☃.i());
/*     */       
/* 236 */       atg2.e = (byte)(atg1.e + 1);
/* 237 */       if (atg2.e > 4) {
/* 238 */         atg2.e = 4;
/*     */       }
/*     */       
/* 241 */       atg2.a(atg1.b, atg1.c, atg2.e);
/* 242 */       atg2.d = atg1.d;
/* 243 */       atg2.c();
/* 244 */       adm1.a("map_" + ☃.i(), atg2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zx ☃, wn wn1, List<String> list, boolean bool) {
/* 250 */     atg atg = a(☃, wn1.o);
/*     */     
/* 252 */     if (bool)
/* 253 */       if (atg == null) {
/* 254 */         list.add("Unknown map");
/*     */       } else {
/* 256 */         list.add("Scaling at 1:" + (1 << atg.e));
/* 257 */         list.add("(Level " + atg.e + "/" + '\004' + ")");
/*     */       }  
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */