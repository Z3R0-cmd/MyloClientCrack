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
/*     */ 
/*     */ 
/*     */ public class aax
/*     */   extends zw
/*     */ {
/*     */   public aax() {
/*  30 */     a(true);
/*  31 */     a(yz.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(zx ☃) {
/*  36 */     String str1 = ("" + di.a(a() + ".name")).trim();
/*     */     
/*  38 */     String str2 = pm.b(☃.i());
/*  39 */     if (str2 != null) {
/*  40 */       str1 = str1 + " " + di.a("entity." + str2 + ".name");
/*     */     }
/*     */     
/*  43 */     return str1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(zx ☃, int i) {
/*  48 */     pm.a a = pm.a.get(Integer.valueOf(☃.i()));
/*  49 */     if (a != null) {
/*  50 */       if (i == 0) {
/*  51 */         return a.b;
/*     */       }
/*  53 */       return a.c;
/*     */     } 
/*  55 */     return 16777215;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/*  60 */     if (adm1.D) {
/*  61 */       return true;
/*     */     }
/*  63 */     if (!wn1.a(cj1.a(cq1), cq1, ☃)) {
/*  64 */       return false;
/*     */     }
/*     */     
/*  67 */     alz alz = adm1.p(cj1);
/*  68 */     if (alz.c() == afi.ac) {
/*  69 */       akw akw = adm1.s(cj1);
/*  70 */       if (akw instanceof all) {
/*  71 */         add add = ((all)akw).b();
/*  72 */         add.a(pm.b(☃.i()));
/*  73 */         akw.p_();
/*  74 */         adm1.h(cj1);
/*  75 */         if (!wn1.bA.d) {
/*  76 */           ☃.b--;
/*     */         }
/*  78 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     cj1 = cj1.a(cq1);
/*     */     
/*  84 */     double d = 0.0D;
/*  85 */     if (cq1 == cq.b && alz instanceof agt)
/*     */     {
/*  87 */       d = 0.5D;
/*     */     }
/*     */     
/*  90 */     pk pk = a(adm1, ☃.i(), cj1.n() + 0.5D, cj1.o() + d, cj1.p() + 0.5D);
/*  91 */     if (pk != null) {
/*  92 */       if (pk instanceof pr && ☃.s()) {
/*  93 */         pk.a(☃.q());
/*     */       }
/*  95 */       if (!wn1.bA.d) {
/*  96 */         ☃.b--;
/*     */       }
/*     */     } 
/*     */     
/* 100 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx a(zx ☃, adm adm1, wn wn1) {
/* 105 */     if (adm1.D) {
/* 106 */       return ☃;
/*     */     }
/*     */     
/* 109 */     auh auh = a(adm1, wn1, true);
/* 110 */     if (auh == null) {
/* 111 */       return ☃;
/*     */     }
/*     */     
/* 114 */     if (auh.a == auh.a.b) {
/* 115 */       cj cj = auh.a();
/*     */       
/* 117 */       if (!adm1.a(wn1, cj)) {
/* 118 */         return ☃;
/*     */       }
/* 120 */       if (!wn1.a(cj, auh.b, ☃)) {
/* 121 */         return ☃;
/*     */       }
/*     */       
/* 124 */       if (adm1.p(cj).c() instanceof ahv) {
/* 125 */         pk pk = a(adm1, ☃.i(), cj.n() + 0.5D, cj.o() + 0.5D, cj.p() + 0.5D);
/* 126 */         if (pk != null) {
/* 127 */           if (pk instanceof pr && ☃.s()) {
/* 128 */             ((ps)pk).a(☃.q());
/*     */           }
/* 130 */           if (!wn1.bA.d) {
/* 131 */             ☃.b--;
/*     */           }
/* 133 */           wn1.b(na.ad[zw.b(this)]);
/*     */         } 
/*     */       } 
/*     */     } 
/* 137 */     return ☃;
/*     */   }
/*     */   
/*     */   public static pk a(adm ☃, int i, double d1, double d2, double d3) {
/* 141 */     if (!pm.a.containsKey(Integer.valueOf(i))) {
/* 142 */       return null;
/*     */     }
/*     */     
/* 145 */     pk pk = null;
/*     */     
/* 147 */     for (int j = 0; j < 1; j++) {
/* 148 */       pk = pm.a(i, ☃);
/*     */       
/* 150 */       if (pk instanceof pr) {
/* 151 */         ps ps = (ps)pk;
/* 152 */         pk.b(d1, d2, d3, ns.g(☃.s.nextFloat() * 360.0F), 0.0F);
/* 153 */         ps.aK = ps.y;
/* 154 */         ps.aI = ps.y;
/*     */         
/* 156 */         ps.a(☃.E(new cj(ps)), (pu)null);
/* 157 */         ☃.d(pk);
/* 158 */         ps.x();
/*     */       } 
/*     */     } 
/*     */     
/* 162 */     return pk;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/* 167 */     for (Iterator<pm.a> iterator = pm.a.values().iterator(); iterator.hasNext(); ) { pm.a a = iterator.next();
/* 168 */       list.add(new zx(☃, 1, a.a)); }
/*     */   
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */