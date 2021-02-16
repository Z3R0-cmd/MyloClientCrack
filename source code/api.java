/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class api
/*     */   extends aot
/*     */ {
/*  22 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*  25 */   private static final String[] b = new String[] { "Skeleton", "Zombie", "Zombie", "Spider" };
/*  26 */   private static final List<ob> c = Lists.newArrayList((Object[])new ob[] { new ob(zy.aA, 0, 1, 1, 10), new ob(zy.j, 0, 1, 4, 10), new ob(zy.P, 0, 1, 1, 10), new ob(zy.O, 0, 1, 4, 10), new ob(zy.H, 0, 1, 4, 10), new ob(zy.F, 0, 1, 4, 10), new ob(zy.aw, 0, 1, 1, 10), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aC, 0, 1, 4, 10), new ob(zy.cq, 0, 1, 1, 4), new ob(zy.cr, 0, 1, 1, 4), new ob(zy.co, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 2), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 1) });
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
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  47 */     int i = 3;
/*  48 */     int j = random.nextInt(2) + 2;
/*  49 */     int k = -j - 1;
/*  50 */     int m = j + 1;
/*     */     
/*  52 */     int n = -1;
/*  53 */     int i1 = 4;
/*     */     
/*  55 */     int i2 = random.nextInt(2) + 2;
/*  56 */     int i3 = -i2 - 1;
/*  57 */     int i4 = i2 + 1;
/*     */     
/*  59 */     int i5 = 0; int i6;
/*  60 */     for (i6 = k; i6 <= m; i6++) {
/*  61 */       for (int i7 = -1; i7 <= 4; i7++) {
/*  62 */         for (int i8 = i3; i8 <= i4; i8++) {
/*  63 */           cj cj2 = cj1.a(i6, i7, i8);
/*  64 */           arm arm = ☃.p(cj2).c().t();
/*  65 */           boolean bool = arm.a();
/*     */           
/*  67 */           if (i7 == -1 && !bool) {
/*  68 */             return false;
/*     */           }
/*  70 */           if (i7 == 4 && !bool) {
/*  71 */             return false;
/*     */           }
/*     */           
/*  74 */           if ((i6 == k || i6 == m || i8 == i3 || i8 == i4) && 
/*  75 */             i7 == 0 && ☃.d(cj2) && ☃.d(cj2.a())) {
/*  76 */             i5++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  83 */     if (i5 < 1 || i5 > 5) {
/*  84 */       return false;
/*     */     }
/*     */     
/*  87 */     for (i6 = k; i6 <= m; i6++) {
/*  88 */       for (int i7 = 3; i7 >= -1; i7--) {
/*  89 */         for (int i8 = i3; i8 <= i4; i8++) {
/*  90 */           cj cj2 = cj1.a(i6, i7, i8);
/*     */           
/*  92 */           if (i6 == k || i7 == -1 || i8 == i3 || i6 == m || i7 == 4 || i8 == i4) {
/*  93 */             if (cj2.o() >= 0 && !☃.p(cj2.b()).c().t().a()) {
/*  94 */               ☃.g(cj2);
/*  95 */             } else if (☃.p(cj2).c().t().a() && 
/*  96 */               ☃.p(cj2).c() != afi.ae) {
/*  97 */               if (i7 == -1 && random.nextInt(4) != 0) {
/*  98 */                 ☃.a(cj2, afi.Y.Q(), 2);
/*     */               } else {
/* 100 */                 ☃.a(cj2, afi.e.Q(), 2);
/*     */               }
/*     */             
/*     */             }
/*     */           
/* 105 */           } else if (☃.p(cj2).c() != afi.ae) {
/* 106 */             ☃.g(cj2);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 113 */     for (i6 = 0; i6 < 2; i6++) {
/* 114 */       for (int i7 = 0; i7 < 3; i7++) {
/* 115 */         int i8 = cj1.n() + random.nextInt(j * 2 + 1) - j;
/* 116 */         int i9 = cj1.o();
/* 117 */         int i10 = cj1.p() + random.nextInt(i2 * 2 + 1) - i2;
/* 118 */         cj cj2 = new cj(i8, i9, i10);
/*     */         
/* 120 */         if (☃.d(cj2)) {
/*     */ 
/*     */ 
/*     */           
/* 124 */           int i11 = 0;
/* 125 */           for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 126 */             if (☃.p(cj2.a(cq)).c().t().a()) {
/* 127 */               i11++;
/*     */             } }
/*     */ 
/*     */           
/* 131 */           if (i11 == 1) {
/*     */ 
/*     */ 
/*     */             
/* 135 */             ☃.a(cj2, afi.ae.f(☃, cj2, afi.ae.Q()), 2);
/*     */             
/* 137 */             List<ob> list = ob.a(c, new ob[] { zy.cd.b(random) });
/*     */             
/* 139 */             akw akw1 = ☃.s(cj2);
/* 140 */             if (akw1 instanceof aky) {
/* 141 */               ob.a(random, list, (aky)akw1, 8);
/*     */             }
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 148 */     ☃.a(cj1, afi.ac.Q(), 2);
/* 149 */     akw akw = ☃.s(cj1);
/*     */     
/* 151 */     if (akw instanceof all) {
/* 152 */       ((all)akw).b().a(a(random));
/*     */     } else {
/* 154 */       a.error("Failed to fetch mob spawner entity at (" + cj1.n() + ", " + cj1.o() + ", " + cj1.p() + ")");
/*     */     } 
/*     */     
/* 157 */     return true;
/*     */   }
/*     */   
/*     */   private String a(Random ☃) {
/* 161 */     return b[☃.nextInt(b.length)];
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */