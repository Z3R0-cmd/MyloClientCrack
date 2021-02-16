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
/*     */ public class abj
/*     */ {
/*     */   void a(abt ☃) {
/*     */     zd[] arrayOfZd;
/*     */     int i;
/*     */     int j;
/*  24 */     for (arrayOfZd = zd.values(), i = arrayOfZd.length, j = 0; j < i; ) { zd zd = arrayOfZd[j];
/*  25 */       ☃.a(new zx(zy.cE, 1, zd.b()), new Object[] { "###", "###", " | ", Character.valueOf('#'), new zx(afi.L, 1, zd.a()), Character.valueOf('|'), zy.y });
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       j++; }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     ☃.a(new b());
/*  36 */     ☃.a(new a());
/*     */   }
/*     */   
/*     */   static class b implements abs {
/*     */     private b() {}
/*     */     
/*     */     public boolean a(xp ☃, adm adm1) {
/*  43 */       zx zx1 = null;
/*  44 */       zx zx2 = null;
/*  45 */       for (int i = 0; i < ☃.o_(); i++) {
/*  46 */         zx zx = ☃.a(i);
/*  47 */         if (zx != null) {
/*     */ 
/*     */ 
/*     */           
/*  51 */           if (zx.b() != zy.cE) {
/*  52 */             return false;
/*     */           }
/*     */           
/*  55 */           if (zx1 != null && zx2 != null)
/*     */           {
/*  57 */             return false;
/*     */           }
/*  59 */           int j = aku.b(zx);
/*  60 */           boolean bool = (aku.c(zx) > 0);
/*     */           
/*  62 */           if (zx1 != null) {
/*  63 */             if (bool)
/*     */             {
/*  65 */               return false;
/*     */             }
/*  67 */             if (j != aku.b(zx1))
/*     */             {
/*  69 */               return false;
/*     */             }
/*  71 */             zx2 = zx;
/*  72 */           } else if (zx2 != null) {
/*  73 */             if (!bool)
/*     */             {
/*  75 */               return false;
/*     */             }
/*  77 */             if (j != aku.b(zx2))
/*     */             {
/*  79 */               return false;
/*     */             }
/*  81 */             zx1 = zx;
/*  82 */           } else if (bool) {
/*  83 */             zx1 = zx;
/*     */           } else {
/*  85 */             zx2 = zx;
/*     */           } 
/*     */         } 
/*     */       } 
/*  89 */       return (zx1 != null && zx2 != null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public zx a(xp ☃) {
/*  96 */       for (int i = 0; i < ☃.o_(); i++) {
/*  97 */         zx zx = ☃.a(i);
/*  98 */         if (zx != null)
/*     */         {
/*     */           
/* 101 */           if (aku.c(zx) > 0) {
/* 102 */             zx zx1 = zx.k();
/* 103 */             zx1.b = 1;
/* 104 */             return zx1;
/*     */           } 
/*     */         }
/*     */       } 
/* 108 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 113 */       return 2;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public zx b() {
/* 120 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public zx[] b(xp ☃) {
/* 125 */       zx[] arrayOfZx = new zx[☃.o_()];
/*     */       
/* 127 */       for (int i = 0; i < arrayOfZx.length; i++) {
/* 128 */         zx zx = ☃.a(i);
/* 129 */         if (zx != null) {
/* 130 */           if (zx.b().r()) {
/* 131 */             arrayOfZx[i] = new zx(zx.b().q());
/* 132 */           } else if (zx.n() && 
/* 133 */             aku.c(zx) > 0) {
/* 134 */             arrayOfZx[i] = zx.k();
/* 135 */             (arrayOfZx[i]).b = 1;
/*     */           } 
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 141 */       return arrayOfZx;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a implements abs {
/*     */     private a() {}
/*     */     
/*     */     public boolean a(xp ☃, adm adm1) {
/* 149 */       boolean bool = false;
/* 150 */       for (int i = 0; i < ☃.o_(); i++) {
/* 151 */         zx zx = ☃.a(i);
/* 152 */         if (zx != null && zx.b() == zy.cE) {
/*     */ 
/*     */ 
/*     */           
/* 156 */           if (bool) {
/* 157 */             return false;
/*     */           }
/* 159 */           if (aku.c(zx) >= 6)
/*     */           {
/* 161 */             return false;
/*     */           }
/* 163 */           bool = true;
/*     */         } 
/* 165 */       }  if (!bool) {
/* 166 */         return false;
/*     */       }
/*     */       
/* 169 */       return (c(☃) != null);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public zx a(xp ☃) {
/* 175 */       zx zx = null;
/* 176 */       for (int i = 0; i < ☃.o_(); i++) {
/* 177 */         zx zx1 = ☃.a(i);
/* 178 */         if (zx1 != null)
/*     */         {
/*     */           
/* 181 */           if (zx1.b() == zy.cE) {
/* 182 */             zx = zx1.k();
/* 183 */             zx.b = 1;
/*     */             
/*     */             break;
/*     */           } 
/*     */         }
/*     */       } 
/* 189 */       aku.a a1 = c(☃);
/* 190 */       if (a1 != null) {
/*     */         
/* 192 */         int j = 0;
/* 193 */         for (int k = 0; k < ☃.o_(); ) {
/* 194 */           zx zx1 = ☃.a(k);
/* 195 */           if (zx1 == null || zx1.b() != zy.aW) {
/*     */             k++; continue;
/*     */           } 
/* 198 */           j = zx1.i();
/*     */         } 
/*     */ 
/*     */         
/* 202 */         dn dn1 = zx.a("BlockEntityTag", true);
/* 203 */         du du = null;
/* 204 */         if (dn1.b("Patterns", 9)) {
/* 205 */           du = dn1.c("Patterns", 10);
/*     */         } else {
/* 207 */           du = new du();
/* 208 */           dn1.a("Patterns", du);
/*     */         } 
/* 210 */         dn dn2 = new dn();
/* 211 */         dn2.a("Pattern", a1.b());
/* 212 */         dn2.a("Color", j);
/* 213 */         du.a(dn2);
/*     */       } 
/*     */       
/* 216 */       return zx;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int a() {
/* 222 */       return 10;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public zx b() {
/* 229 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public zx[] b(xp ☃) {
/* 234 */       zx[] arrayOfZx = new zx[☃.o_()];
/*     */       
/* 236 */       for (int i = 0; i < arrayOfZx.length; i++) {
/* 237 */         zx zx = ☃.a(i);
/* 238 */         if (zx != null && zx.b().r()) {
/* 239 */           arrayOfZx[i] = new zx(zx.b().q());
/*     */         }
/*     */       } 
/*     */       
/* 243 */       return arrayOfZx;
/*     */     } private aku.a c(xp ☃) {
/*     */       aku.a[] arrayOfA;
/*     */       int i;
/*     */       int j;
/* 248 */       for (arrayOfA = aku.a.values(), i = arrayOfA.length, j = 0; j < i; ) { aku.a a1 = arrayOfA[j];
/* 249 */         if (a1.d()) {
/*     */ 
/*     */           
/* 252 */           boolean bool = true;
/* 253 */           if (a1.e())
/*     */           
/* 255 */           { boolean bool1 = false;
/* 256 */             boolean bool2 = false;
/* 257 */             for (int k = 0; k < ☃.o_() && bool; k++) {
/* 258 */               zx zx = ☃.a(k);
/* 259 */               if (zx != null && zx.b() != zy.cE)
/*     */               {
/*     */                 
/* 262 */                 if (zx.b() == zy.aW) {
/* 263 */                   if (bool2) {
/*     */                     
/* 265 */                     bool = false;
/*     */                     break;
/*     */                   } 
/* 268 */                   bool2 = true;
/* 269 */                 } else if (!bool1 && zx.a(a1.f())) {
/* 270 */                   bool1 = true;
/*     */                 } else {
/* 272 */                   bool = false;
/*     */                   break;
/*     */                 }  } 
/*     */             } 
/* 276 */             if (!bool1) {
/* 277 */               bool = false;
/*     */             } }
/* 279 */           else if (☃.o_() == (a1.c()).length * a1.c()[0].length())
/*     */           
/* 281 */           { int k = -1;
/* 282 */             for (int m = 0; m < ☃.o_() && bool; m++) {
/* 283 */               int n = m / 3;
/* 284 */               int i1 = m % 3;
/*     */               
/* 286 */               zx zx = ☃.a(m);
/* 287 */               if (zx == null || zx.b() == zy.cE) {
/* 288 */                 if (a1.c()[n].charAt(i1) != ' ') {
/* 289 */                   bool = false;
/*     */                   
/*     */                   break;
/*     */                 } 
/*     */               } else {
/* 294 */                 if (zx.b() != zy.aW) {
/* 295 */                   bool = false;
/*     */                   break;
/*     */                 } 
/* 298 */                 if (k != -1 && k != zx.i()) {
/* 299 */                   bool = false;
/*     */                   break;
/*     */                 } 
/* 302 */                 if (a1.c()[n].charAt(i1) == ' ') {
/* 303 */                   bool = false;
/*     */                   break;
/*     */                 } 
/* 306 */                 k = zx.i();
/*     */               } 
/*     */             }  }
/* 309 */           else { bool = false; }
/*     */           
/* 311 */           if (bool)
/* 312 */             return a1; 
/*     */         }  j++; }
/*     */       
/* 315 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */