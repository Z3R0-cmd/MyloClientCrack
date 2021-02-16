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
/*     */ class a
/*     */   implements abs
/*     */ {
/*     */   private a() {}
/*     */   
/*     */   public boolean a(xp ☃, adm adm1) {
/* 149 */     boolean bool = false;
/* 150 */     for (int i = 0; i < ☃.o_(); i++) {
/* 151 */       zx zx = ☃.a(i);
/* 152 */       if (zx != null && zx.b() == zy.cE) {
/*     */ 
/*     */ 
/*     */         
/* 156 */         if (bool) {
/* 157 */           return false;
/*     */         }
/* 159 */         if (aku.c(zx) >= 6)
/*     */         {
/* 161 */           return false;
/*     */         }
/* 163 */         bool = true;
/*     */       } 
/* 165 */     }  if (!bool) {
/* 166 */       return false;
/*     */     }
/*     */     
/* 169 */     return (c(☃) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(xp ☃) {
/* 175 */     zx zx = null;
/* 176 */     for (int i = 0; i < ☃.o_(); i++) {
/* 177 */       zx zx1 = ☃.a(i);
/* 178 */       if (zx1 != null)
/*     */       {
/*     */         
/* 181 */         if (zx1.b() == zy.cE) {
/* 182 */           zx = zx1.k();
/* 183 */           zx.b = 1;
/*     */           
/*     */           break;
/*     */         } 
/*     */       }
/*     */     } 
/* 189 */     aku.a a1 = c(☃);
/* 190 */     if (a1 != null) {
/*     */       
/* 192 */       int j = 0;
/* 193 */       for (int k = 0; k < ☃.o_(); ) {
/* 194 */         zx zx1 = ☃.a(k);
/* 195 */         if (zx1 == null || zx1.b() != zy.aW) {
/*     */           k++; continue;
/*     */         } 
/* 198 */         j = zx1.i();
/*     */       } 
/*     */ 
/*     */       
/* 202 */       dn dn1 = zx.a("BlockEntityTag", true);
/* 203 */       du du = null;
/* 204 */       if (dn1.b("Patterns", 9)) {
/* 205 */         du = dn1.c("Patterns", 10);
/*     */       } else {
/* 207 */         du = new du();
/* 208 */         dn1.a("Patterns", du);
/*     */       } 
/* 210 */       dn dn2 = new dn();
/* 211 */       dn2.a("Pattern", a1.b());
/* 212 */       dn2.a("Color", j);
/* 213 */       du.a(dn2);
/*     */     } 
/*     */     
/* 216 */     return zx;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 222 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b() {
/* 229 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx[] b(xp ☃) {
/* 234 */     zx[] arrayOfZx = new zx[☃.o_()];
/*     */     
/* 236 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 237 */       zx zx = ☃.a(i);
/* 238 */       if (zx != null && zx.b().r()) {
/* 239 */         arrayOfZx[i] = new zx(zx.b().q());
/*     */       }
/*     */     } 
/*     */     
/* 243 */     return arrayOfZx;
/*     */   } private aku.a c(xp ☃) {
/*     */     aku.a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/* 248 */     for (arrayOfA = aku.a.values(), i = arrayOfA.length, j = 0; j < i; ) { aku.a a1 = arrayOfA[j];
/* 249 */       if (a1.d()) {
/*     */ 
/*     */         
/* 252 */         boolean bool = true;
/* 253 */         if (a1.e())
/*     */         
/* 255 */         { boolean bool1 = false;
/* 256 */           boolean bool2 = false;
/* 257 */           for (int k = 0; k < ☃.o_() && bool; k++) {
/* 258 */             zx zx = ☃.a(k);
/* 259 */             if (zx != null && zx.b() != zy.cE)
/*     */             {
/*     */               
/* 262 */               if (zx.b() == zy.aW) {
/* 263 */                 if (bool2) {
/*     */                   
/* 265 */                   bool = false;
/*     */                   break;
/*     */                 } 
/* 268 */                 bool2 = true;
/* 269 */               } else if (!bool1 && zx.a(a1.f())) {
/* 270 */                 bool1 = true;
/*     */               } else {
/* 272 */                 bool = false;
/*     */                 break;
/*     */               }  } 
/*     */           } 
/* 276 */           if (!bool1) {
/* 277 */             bool = false;
/*     */           } }
/* 279 */         else if (☃.o_() == (a1.c()).length * a1.c()[0].length())
/*     */         
/* 281 */         { int k = -1;
/* 282 */           for (int m = 0; m < ☃.o_() && bool; m++) {
/* 283 */             int n = m / 3;
/* 284 */             int i1 = m % 3;
/*     */             
/* 286 */             zx zx = ☃.a(m);
/* 287 */             if (zx == null || zx.b() == zy.cE) {
/* 288 */               if (a1.c()[n].charAt(i1) != ' ') {
/* 289 */                 bool = false;
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             } else {
/* 294 */               if (zx.b() != zy.aW) {
/* 295 */                 bool = false;
/*     */                 break;
/*     */               } 
/* 298 */               if (k != -1 && k != zx.i()) {
/* 299 */                 bool = false;
/*     */                 break;
/*     */               } 
/* 302 */               if (a1.c()[n].charAt(i1) == ' ') {
/* 303 */                 bool = false;
/*     */                 break;
/*     */               } 
/* 306 */               k = zx.i();
/*     */             } 
/*     */           }  }
/* 309 */         else { bool = false; }
/*     */         
/* 311 */         if (bool)
/* 312 */           return a1; 
/*     */       }  j++; }
/*     */     
/* 315 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abj$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */