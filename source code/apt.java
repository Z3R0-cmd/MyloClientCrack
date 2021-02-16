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
/*     */ 
/*     */ 
/*     */ public class apt
/*     */   extends aoh
/*     */ {
/*  18 */   private static final alz a = afi.r.Q().a(ail.b, aio.a.a);
/*  19 */   private static final alz b = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.a).a(aik.b, Boolean.valueOf(false));
/*     */   
/*     */   public apt() {
/*  22 */     super(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  27 */     int i = random.nextInt(4) + 5;
/*  28 */     while (☃.p(cj1.b()).c().t() == arm.h) {
/*  29 */       cj1 = cj1.b();
/*     */     }
/*     */     
/*  32 */     boolean bool = true;
/*  33 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/*  34 */       return false;
/*     */     }
/*     */     
/*  37 */     for (int j = cj1.o(); j <= cj1.o() + 1 + i; j++) {
/*  38 */       int m = 1;
/*  39 */       if (j == cj1.o()) {
/*  40 */         m = 0;
/*     */       }
/*  42 */       if (j >= cj1.o() + 1 + i - 2) {
/*  43 */         m = 3;
/*     */       }
/*  45 */       cj.a a = new cj.a();
/*  46 */       for (int n = cj1.n() - m; n <= cj1.n() + m && bool; n++) {
/*  47 */         for (int i1 = cj1.p() - m; i1 <= cj1.p() + m && bool; i1++) {
/*  48 */           if (j >= 0 && j < 256) {
/*  49 */             afh afh1 = ☃.p(a.c(n, j, i1)).c();
/*  50 */             if (afh1.t() != arm.a && afh1.t() != arm.j) {
/*  51 */               if (afh1 == afi.j || afh1 == afi.i) {
/*  52 */                 if (j > cj1.o()) {
/*  53 */                   bool = false;
/*     */                 }
/*     */               } else {
/*  56 */                 bool = false;
/*     */               } 
/*     */             }
/*     */           } else {
/*  60 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  66 */     if (!bool) {
/*  67 */       return false;
/*     */     }
/*     */     
/*  70 */     afh afh = ☃.p(cj1.b()).c();
/*  71 */     if ((afh != afi.c && afh != afi.d) || cj1.o() >= 256 - i - 1) {
/*  72 */       return false;
/*     */     }
/*     */     
/*  75 */     a(☃, cj1.b());
/*     */     int k;
/*  77 */     for (k = cj1.o() - 3 + i; k <= cj1.o() + i; k++) {
/*  78 */       int m = k - cj1.o() + i;
/*  79 */       int n = 2 - m / 2;
/*  80 */       for (int i1 = cj1.n() - n; i1 <= cj1.n() + n; i1++) {
/*  81 */         int i2 = i1 - cj1.n();
/*  82 */         for (int i3 = cj1.p() - n; i3 <= cj1.p() + n; i3++) {
/*  83 */           int i4 = i3 - cj1.p();
/*  84 */           if (Math.abs(i2) != n || Math.abs(i4) != n || (random.nextInt(2) != 0 && m != 0)) {
/*     */ 
/*     */             
/*  87 */             cj cj2 = new cj(i1, k, i3);
/*  88 */             if (!☃.p(cj2).c().o()) {
/*  89 */               a(☃, cj2, b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  95 */     for (k = 0; k < i; k++) {
/*  96 */       afh afh1 = ☃.p(cj1.b(k)).c();
/*  97 */       if (afh1.t() == arm.a || afh1.t() == arm.j || afh1 == afi.i || afh1 == afi.j) {
/*  98 */         a(☃, cj1.b(k), a);
/*     */       }
/*     */     } 
/*     */     
/* 102 */     for (k = cj1.o() - 3 + i; k <= cj1.o() + i; k++) {
/* 103 */       int m = k - cj1.o() + i;
/* 104 */       int n = 2 - m / 2;
/* 105 */       cj.a a = new cj.a();
/* 106 */       for (int i1 = cj1.n() - n; i1 <= cj1.n() + n; i1++) {
/* 107 */         for (int i2 = cj1.p() - n; i2 <= cj1.p() + n; i2++) {
/* 108 */           a.c(i1, k, i2);
/*     */           
/* 110 */           if (☃.p(a).c().t() == arm.j) {
/* 111 */             cj cj2 = a.e();
/* 112 */             cj cj3 = a.f();
/* 113 */             cj cj4 = a.c();
/* 114 */             cj cj5 = a.d();
/*     */             
/* 116 */             if (random.nextInt(4) == 0 && ☃.p(cj2).c().t() == arm.a) {
/* 117 */               a(☃, cj2, akk.N);
/*     */             }
/* 119 */             if (random.nextInt(4) == 0 && ☃.p(cj3).c().t() == arm.a) {
/* 120 */               a(☃, cj3, akk.P);
/*     */             }
/* 122 */             if (random.nextInt(4) == 0 && ☃.p(cj4).c().t() == arm.a) {
/* 123 */               a(☃, cj4, akk.O);
/*     */             }
/* 125 */             if (random.nextInt(4) == 0 && ☃.p(cj5).c().t() == arm.a) {
/* 126 */               a(☃, cj5, akk.b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 132 */     return true;
/*     */   }
/*     */   
/*     */   private void a(adm ☃, cj cj1, amk amk1) {
/* 136 */     alz alz1 = afi.bn.Q().a(amk1, Boolean.valueOf(true));
/* 137 */     a(☃, cj1, alz1);
/* 138 */     int i = 4;
/*     */     
/* 140 */     cj1 = cj1.b();
/* 141 */     while (☃.p(cj1).c().t() == arm.a && i > 0) {
/* 142 */       a(☃, cj1, alz1);
/* 143 */       cj1 = cj1.b();
/* 144 */       i--;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */