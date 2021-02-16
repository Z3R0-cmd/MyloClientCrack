/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public final class adt
/*     */ {
/*  28 */   private static final int a = (int)Math.pow(17.0D, 2.0D);
/*     */   
/*  30 */   private final Set<adg> b = Sets.newHashSet();
/*     */   
/*     */   public int a(le ☃, boolean bool1, boolean bool2, boolean bool3) {
/*  33 */     if (!bool1 && !bool2) {
/*  34 */       return 0;
/*     */     }
/*     */     
/*  37 */     this.b.clear();
/*  38 */     int i = 0;
/*     */     
/*  40 */     for (Iterator<wn> iterator = ☃.j.iterator(); iterator.hasNext(); ) { wn wn = iterator.next();
/*  41 */       if (!wn.v()) {
/*  42 */         int n = ns.c(wn.s / 16.0D);
/*  43 */         int i1 = ns.c(wn.u / 16.0D);
/*  44 */         int i2 = 8;
/*     */         
/*  46 */         for (int i3 = -i2; i3 <= i2; i3++) {
/*  47 */           for (int i4 = -i2; i4 <= i2; i4++) {
/*  48 */             boolean bool = (i3 == -i2 || i3 == i2 || i4 == -i2 || i4 == i2);
/*  49 */             adg adg = new adg(i3 + n, i4 + i1);
/*  50 */             if (!this.b.contains(adg)) {
/*  51 */               i++;
/*  52 */               if (!bool && ☃.af().a(adg)) {
/*  53 */                 this.b.add(adg);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/*  61 */     int j = 0;
/*  62 */     cj cj = ☃.M(); pt[] arrayOfPt;
/*     */     int k, m;
/*  64 */     for (arrayOfPt = pt.values(), k = arrayOfPt.length, m = 0; m < k; ) { pt pt = arrayOfPt[m];
/*  65 */       if (!pt.d() || bool2)
/*     */       {
/*  67 */         if (pt.d() || bool1)
/*     */         {
/*  69 */           if (!pt.e() || bool3) {
/*     */ 
/*     */ 
/*     */             
/*  73 */             int n = ☃.a(pt.a());
/*  74 */             int i1 = pt.b() * i / a;
/*  75 */             if (n <= i1) {
/*     */               Iterator<adg> iterator1;
/*     */ 
/*     */               
/*  79 */               label92: for (iterator1 = this.b.iterator(); iterator1.hasNext(); ) { adg adg = iterator1.next();
/*  80 */                 cj cj1 = a(☃, adg.a, adg.b);
/*  81 */                 int i2 = cj1.n();
/*  82 */                 int i3 = cj1.o();
/*  83 */                 int i4 = cj1.p();
/*     */                 
/*  85 */                 afh afh = ☃.p(cj1).c();
/*  86 */                 if (afh.v()) {
/*     */                   continue;
/*     */                 }
/*     */                 
/*  90 */                 int i5 = 0;
/*     */                 
/*  92 */                 for (int i6 = 0; i6 < 3; i6++) {
/*  93 */                   int i7 = i2;
/*  94 */                   int i8 = i3;
/*  95 */                   int i9 = i4;
/*  96 */                   int i10 = 6;
/*     */                   
/*  98 */                   ady.c c = null;
/*  99 */                   pu pu = null;
/*     */                   
/* 101 */                   for (int i11 = 0; i11 < 4; i11++) {
/* 102 */                     i7 += ☃.s.nextInt(i10) - ☃.s.nextInt(i10);
/* 103 */                     i8 += ☃.s.nextInt(1) - ☃.s.nextInt(1);
/* 104 */                     i9 += ☃.s.nextInt(i10) - ☃.s.nextInt(i10);
/* 105 */                     cj cj2 = new cj(i7, i8, i9);
/*     */                     
/* 107 */                     float f1 = i7 + 0.5F;
/* 108 */                     float f2 = i9 + 0.5F;
/*     */                     
/* 110 */                     if (!☃.b(f1, i8, f2, 24.0D))
/*     */                     {
/* 112 */                       if (cj.c(f1, i8, f2) >= 576.0D) {
/*     */ 
/*     */ 
/*     */                         
/* 116 */                         if (c == null) {
/* 117 */                           c = ☃.a(pt, cj2);
/* 118 */                           if (c == null) {
/*     */                             break;
/*     */                           }
/*     */                         } 
/* 122 */                         if (☃.a(pt, c, cj2))
/*     */                         {
/*     */ 
/*     */                           
/* 126 */                           if (a(pv.a(c.b), ☃, cj2))
/*     */                           { ps ps;
/*     */                             try {
/* 129 */                               ps = c.b.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
/* 130 */                             } catch (Exception exception) {
/* 131 */                               exception.printStackTrace();
/* 132 */                               return j;
/*     */                             } 
/*     */                             
/* 135 */                             ps.b(f1, i8, f2, ☃.s.nextFloat() * 360.0F, 0.0F);
/*     */                             
/* 137 */                             if (ps.bR() && ps.bS()) {
/* 138 */                               pu = ps.a(☃.E(new cj(ps)), pu);
/*     */                               
/* 140 */                               if (ps.bS()) {
/* 141 */                                 i5++;
/* 142 */                                 ☃.d(ps);
/*     */                               } 
/* 144 */                               if (i5 >= ps.bV()) {
/*     */                                 continue label92;
/*     */                               }
/*     */                             } 
/* 148 */                             j += i5; }  } 
/*     */                       }  } 
/*     */                   } 
/*     */                 }  }
/*     */             
/*     */             } 
/*     */           }  }  }  m++; }
/* 155 */      return j;
/*     */   }
/*     */   
/*     */   protected static cj a(adm ☃, int i, int j) {
/* 159 */     amy amy = ☃.a(i, j);
/* 160 */     int k = i * 16 + ☃.s.nextInt(16);
/* 161 */     int m = j * 16 + ☃.s.nextInt(16);
/* 162 */     int n = ns.c(amy.f(new cj(k, 0, m)) + 1, 16);
/* 163 */     int i1 = ☃.s.nextInt((n > 0) ? n : (amy.g() + 16 - 1));
/*     */     
/* 165 */     return new cj(k, i1, m);
/*     */   }
/*     */   
/*     */   public static boolean a(ps.a ☃, adm adm1, cj cj1) {
/* 169 */     if (adm1.af().a(cj1)) {
/* 170 */       afh afh1 = adm1.p(cj1).c();
/*     */       
/* 172 */       if (☃ == ps.a.c) {
/* 173 */         return (afh1.t().d() && adm1.p(cj1.b()).c().t().d() && !adm1.p(cj1.a()).c().v());
/*     */       }
/* 175 */       cj cj2 = cj1.b();
/* 176 */       if (!adm.a(adm1, cj2)) {
/* 177 */         return false;
/*     */       }
/* 179 */       afh afh2 = adm1.p(cj2).c();
/* 180 */       boolean bool = (afh2 != afi.h && afh2 != afi.cv);
/* 181 */       return (bool && !afh1.v() && !afh1.t().d() && !adm1.p(cj1.a()).c().v());
/*     */     } 
/*     */ 
/*     */     
/* 185 */     return false;
/*     */   }
/*     */   
/*     */   public static void a(adm ☃, ady ady1, int i, int j, int k, int m, Random random) {
/* 189 */     List<ady.c> list = ady1.a(pt.b);
/* 190 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     while (random.nextFloat() < ady1.g()) {
/* 195 */       ady.c c = oa.<ady.c>a(☃.s, list);
/* 196 */       int n = c.c + random.nextInt(1 + c.d - c.c);
/* 197 */       pu pu = null;
/*     */       
/* 199 */       int i1 = i + random.nextInt(k);
/* 200 */       int i2 = j + random.nextInt(m);
/* 201 */       int i3 = i1;
/* 202 */       int i4 = i2;
/*     */       
/* 204 */       for (int i5 = 0; i5 < n; i5++) {
/* 205 */         boolean bool = false;
/* 206 */         for (int i6 = 0; !bool && i6 < 4; i6++) {
/*     */           
/* 208 */           cj cj = ☃.r(new cj(i1, 0, i2));
/*     */           
/* 210 */           if (a(ps.a.a, ☃, cj)) {
/*     */             ps ps;
/*     */             try {
/* 213 */               ps = c.b.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
/* 214 */             } catch (Exception exception) {
/* 215 */               exception.printStackTrace();
/*     */             } 
/*     */ 
/*     */             
/* 219 */             ps.b((i1 + 0.5F), cj.o(), (i2 + 0.5F), random.nextFloat() * 360.0F, 0.0F);
/*     */             
/* 221 */             ☃.d(ps);
/* 222 */             pu = ps.a(☃.E(new cj(ps)), pu);
/* 223 */             bool = true;
/*     */           } 
/*     */           
/* 226 */           i1 += random.nextInt(5) - random.nextInt(5);
/* 227 */           i2 += random.nextInt(5) - random.nextInt(5);
/* 228 */           while (i1 < i || i1 >= i + k || i2 < j || i2 >= j + k) {
/* 229 */             i1 = i3 + random.nextInt(5) - random.nextInt(5);
/* 230 */             i2 = i4 + random.nextInt(5) - random.nextInt(5);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */