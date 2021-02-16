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
/*     */ public class app
/*     */   extends aoh
/*     */ {
/*  16 */   private static final alz a = afi.s.Q().a(aig.b, aio.a.e);
/*  17 */   private static final alz b = afi.u.Q().<aio.a, aio.a>a(aif.Q, aio.a.e).a(ahs.b, Boolean.valueOf(false));
/*     */   
/*     */   public app(boolean ☃) {
/*  20 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  25 */     int i = random.nextInt(3) + random.nextInt(3) + 5;
/*     */     
/*  27 */     boolean bool = true;
/*  28 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/*  29 */       return false;
/*     */     }
/*     */     
/*  32 */     for (int j = cj1.o(); j <= cj1.o() + 1 + i; j++) {
/*  33 */       int i5 = 1;
/*  34 */       if (j == cj1.o()) {
/*  35 */         i5 = 0;
/*     */       }
/*  37 */       if (j >= cj1.o() + 1 + i - 2) {
/*  38 */         i5 = 2;
/*     */       }
/*  40 */       cj.a a = new cj.a();
/*  41 */       for (int i6 = cj1.n() - i5; i6 <= cj1.n() + i5 && bool; i6++) {
/*  42 */         for (int i7 = cj1.p() - i5; i7 <= cj1.p() + i5 && bool; i7++) {
/*  43 */           if (j >= 0 && j < 256) {
/*  44 */             if (!a(☃.p(a.c(i6, j, i7)).c())) {
/*  45 */               bool = false;
/*     */             }
/*     */           } else {
/*  48 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  54 */     if (!bool) {
/*  55 */       return false;
/*     */     }
/*     */     
/*  58 */     afh afh = ☃.p(cj1.b()).c();
/*  59 */     if ((afh != afi.c && afh != afi.d) || cj1.o() >= 256 - i - 1) {
/*  60 */       return false;
/*     */     }
/*     */     
/*  63 */     a(☃, cj1.b());
/*     */     
/*  65 */     cq cq1 = cq.c.a.a(random);
/*  66 */     int k = i - random.nextInt(4) - 1;
/*  67 */     int m = 3 - random.nextInt(3);
/*     */     
/*  69 */     int n = cj1.n(), i1 = cj1.p();
/*  70 */     int i2 = 0;
/*  71 */     for (int i3 = 0; i3 < i; i3++) {
/*  72 */       int i5 = cj1.o() + i3;
/*  73 */       if (i3 >= k && m > 0) {
/*  74 */         n += cq1.g();
/*  75 */         i1 += cq1.i();
/*  76 */         m--;
/*     */       } 
/*  78 */       cj cj3 = new cj(n, i5, i1);
/*  79 */       arm arm = ☃.p(cj3).c().t();
/*  80 */       if (arm == arm.a || arm == arm.j) {
/*  81 */         b(☃, cj3);
/*  82 */         i2 = i5;
/*     */       } 
/*     */     } 
/*     */     
/*  86 */     cj cj2 = new cj(n, i2, i1); int i4;
/*  87 */     for (i4 = -3; i4 <= 3; i4++) {
/*  88 */       for (int i5 = -3; i5 <= 3; i5++) {
/*  89 */         if (Math.abs(i4) != 3 || Math.abs(i5) != 3)
/*     */         {
/*     */           
/*  92 */           c(☃, cj2.a(i4, 0, i5));
/*     */         }
/*     */       } 
/*     */     } 
/*  96 */     cj2 = cj2.a();
/*     */     
/*  98 */     for (i4 = -1; i4 <= 1; i4++) {
/*  99 */       for (int i5 = -1; i5 <= 1; i5++) {
/* 100 */         c(☃, cj2.a(i4, 0, i5));
/*     */       }
/*     */     } 
/*     */     
/* 104 */     c(☃, cj2.g(2));
/* 105 */     c(☃, cj2.f(2));
/* 106 */     c(☃, cj2.e(2));
/* 107 */     c(☃, cj2.d(2));
/*     */ 
/*     */     
/* 110 */     n = cj1.n();
/* 111 */     i1 = cj1.p();
/* 112 */     cq cq2 = cq.c.a.a(random);
/* 113 */     if (cq2 != cq1) {
/* 114 */       i4 = k - random.nextInt(2) - 1;
/* 115 */       int i5 = 1 + random.nextInt(3);
/*     */       
/* 117 */       i2 = 0;
/* 118 */       for (int i6 = i4; i6 < i && i5 > 0; i6++, i5--) {
/* 119 */         if (i6 >= 1) {
/*     */ 
/*     */           
/* 122 */           int i7 = cj1.o() + i6;
/* 123 */           n += cq2.g();
/* 124 */           i1 += cq2.i();
/* 125 */           cj cj3 = new cj(n, i7, i1);
/* 126 */           arm arm = ☃.p(cj3).c().t();
/* 127 */           if (arm == arm.a || arm == arm.j) {
/* 128 */             b(☃, cj3);
/* 129 */             i2 = i7;
/*     */           } 
/*     */         } 
/* 132 */       }  if (i2 > 0) {
/* 133 */         cj cj3 = new cj(n, i2, i1); int i7;
/* 134 */         for (i7 = -2; i7 <= 2; i7++) {
/* 135 */           for (int i8 = -2; i8 <= 2; i8++) {
/* 136 */             if (Math.abs(i7) != 2 || Math.abs(i8) != 2)
/*     */             {
/*     */               
/* 139 */               c(☃, cj3.a(i7, 0, i8)); } 
/*     */           } 
/*     */         } 
/* 142 */         cj3 = cj3.a();
/* 143 */         for (i7 = -1; i7 <= 1; i7++) {
/* 144 */           for (int i8 = -1; i8 <= 1; i8++) {
/* 145 */             c(☃, cj3.a(i7, 0, i8));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 151 */     return true;
/*     */   }
/*     */   
/*     */   private void b(adm ☃, cj cj1) {
/* 155 */     a(☃, cj1, a);
/*     */   }
/*     */   
/*     */   private void c(adm ☃, cj cj1) {
/* 159 */     arm arm = ☃.p(cj1).c().t();
/* 160 */     if (arm == arm.a || arm == arm.j)
/* 161 */       a(☃, cj1, b); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/app.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */