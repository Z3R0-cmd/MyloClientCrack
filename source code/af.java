/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ public class af
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  29 */     return "fill";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  34 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  39 */     return "commands.fill.usage";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*  44 */     if (arrayOfString.length < 7) {
/*  45 */       throw new cf("commands.fill.usage", new Object[0]);
/*     */     }
/*  47 */     ☃.a(n.a.b, 0);
/*     */     
/*  49 */     cj cj1 = a(☃, arrayOfString, 0, false);
/*  50 */     cj cj2 = a(☃, arrayOfString, 3, false);
/*  51 */     afh afh = i.g(☃, arrayOfString[6]);
/*     */     
/*  53 */     int j = 0;
/*  54 */     if (arrayOfString.length >= 8) {
/*  55 */       j = a(arrayOfString[7], 0, 15);
/*     */     }
/*     */     
/*  58 */     cj cj3 = new cj(Math.min(cj1.n(), cj2.n()), Math.min(cj1.o(), cj2.o()), Math.min(cj1.p(), cj2.p()));
/*  59 */     cj cj4 = new cj(Math.max(cj1.n(), cj2.n()), Math.max(cj1.o(), cj2.o()), Math.max(cj1.p(), cj2.p()));
/*     */     
/*  61 */     int k = (cj4.n() - cj3.n() + 1) * (cj4.o() - cj3.o() + 1) * (cj4.p() - cj3.p() + 1);
/*  62 */     if (k > 32768) {
/*  63 */       throw new bz("commands.fill.tooManyBlocks", new Object[] { Integer.valueOf(k), Integer.valueOf(32768) });
/*     */     }
/*     */     
/*  66 */     if (cj3.o() < 0 || cj4.o() >= 256) {
/*  67 */       throw new bz("commands.fill.outOfWorld", new Object[0]);
/*     */     }
/*     */     
/*  70 */     adm adm = ☃.e();
/*  71 */     for (int n = cj3.p(); n < cj4.p() + 16; n += 16) {
/*  72 */       for (int i2 = cj3.n(); i2 < cj4.n() + 16; i2 += 16) {
/*  73 */         if (!adm.e(new cj(i2, cj4.o() - cj3.o(), n))) {
/*  74 */           throw new bz("commands.fill.outOfWorld", new Object[0]);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  79 */     dn dn = new dn();
/*  80 */     boolean bool = false;
/*  81 */     if (arrayOfString.length >= 10 && afh.z()) {
/*  82 */       String str = a(☃, arrayOfString, 9).c();
/*     */       try {
/*  84 */         dn = ed.a(str);
/*  85 */         bool = true;
/*  86 */       } catch (ec ec) {
/*  87 */         throw new bz("commands.fill.tagError", new Object[] { ec.getMessage() });
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     List<cj> list = Lists.newArrayList();
/*     */     
/*  93 */     k = 0;
/*  94 */     for (int i1 = cj3.p(); i1 <= cj4.p(); i1++) {
/*  95 */       for (int i2 = cj3.o(); i2 <= cj4.o(); i2++) {
/*  96 */         for (int i3 = cj3.n(); i3 <= cj4.n(); i3++) {
/*  97 */           cj cj = new cj(i3, i2, i1);
/*     */           
/*  99 */           if (arrayOfString.length >= 9) {
/* 100 */             if (arrayOfString[8].equals("outline") || arrayOfString[8].equals("hollow")) {
/* 101 */               if (i3 != cj3.n() && i3 != cj4.n() && i2 != cj3.o() && i2 != cj4.o() && i1 != cj3.p() && i1 != cj4.p()) {
/* 102 */                 if (arrayOfString[8].equals("hollow")) {
/* 103 */                   adm.a(cj, afi.a.Q(), 2);
/* 104 */                   list.add(cj);
/*     */                 } 
/*     */                 continue;
/*     */               } 
/* 108 */             } else if (arrayOfString[8].equals("destroy")) {
/* 109 */               adm.b(cj, true);
/* 110 */             } else if (arrayOfString[8].equals("keep")) {
/* 111 */               if (!adm.d(cj)) {
/*     */                 continue;
/*     */               }
/* 114 */             } else if (arrayOfString[8].equals("replace") && !afh.z()) {
/* 115 */               if (arrayOfString.length > 9) {
/* 116 */                 afh afh1 = i.g(☃, arrayOfString[9]);
/* 117 */                 if (adm.p(cj).c() != afh1) {
/*     */                   continue;
/*     */                 }
/*     */               } 
/* 121 */               if (arrayOfString.length > 10) {
/* 122 */                 int i4 = i.a(arrayOfString[10]);
/* 123 */                 alz alz1 = adm.p(cj);
/* 124 */                 if (alz1.c().c(alz1) != i4) {
/*     */                   continue;
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           }
/*     */           
/* 131 */           akw akw = adm.s(cj);
/* 132 */           if (akw != null) {
/* 133 */             if (akw instanceof og) {
/* 134 */               ((og)akw).l();
/*     */             }
/* 136 */             adm.a(cj, afi.cv.Q(), (afh == afi.cv) ? 2 : 4);
/*     */           } 
/*     */           
/* 139 */           alz alz = afh.a(j);
/* 140 */           if (adm.a(cj, alz, 2)) {
/*     */ 
/*     */             
/* 143 */             list.add(cj);
/* 144 */             k++;
/*     */             
/* 146 */             if (bool) {
/* 147 */               akw akw1 = adm.s(cj);
/* 148 */               if (akw1 != null) {
/* 149 */                 dn.a("x", cj.n());
/* 150 */                 dn.a("y", cj.o());
/* 151 */                 dn.a("z", cj.p());
/*     */                 
/* 153 */                 akw1.a(dn);
/*     */               } 
/*     */             } 
/*     */           }  continue;
/*     */         } 
/*     */       } 
/*     */     } 
/* 160 */     for (Iterator<cj> iterator = list.iterator(); iterator.hasNext(); ) { cj cj = iterator.next();
/* 161 */       afh afh1 = adm.p(cj).c();
/* 162 */       adm.b(cj, afh1); }
/*     */ 
/*     */     
/* 165 */     if (k <= 0) {
/* 166 */       throw new bz("commands.fill.failed", new Object[0]);
/*     */     }
/* 168 */     ☃.a(n.a.b, k);
/* 169 */     a(☃, this, "commands.fill.success", new Object[] { Integer.valueOf(k) });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 175 */     if (arrayOfString.length > 0 && arrayOfString.length <= 3)
/* 176 */       return a(arrayOfString, 0, cj1); 
/* 177 */     if (arrayOfString.length > 3 && arrayOfString.length <= 6)
/* 178 */       return a(arrayOfString, 3, cj1); 
/* 179 */     if (arrayOfString.length == 7)
/* 180 */       return a(arrayOfString, afh.c.c()); 
/* 181 */     if (arrayOfString.length == 9)
/* 182 */       return a(arrayOfString, new String[] { "replace", "destroy", "keep", "hollow", "outline" }); 
/* 183 */     if (arrayOfString.length == 10 && "replace".equals(arrayOfString[8])) {
/* 184 */       return a(arrayOfString, afh.c.c());
/*     */     }
/*     */     
/* 187 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */