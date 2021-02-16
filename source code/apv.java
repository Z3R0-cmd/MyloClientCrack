/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ public class apv
/*     */   extends aoh
/*     */ {
/*  21 */   private static final alz a = afi.r.Q().a(ail.b, aio.a.a);
/*  22 */   private static final alz b = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.a).a(ahs.b, Boolean.valueOf(false));
/*     */   
/*     */   private final int c;
/*     */   private final boolean d;
/*     */   private final alz e;
/*     */   private final alz f;
/*     */   
/*     */   public apv(boolean ☃) {
/*  30 */     this(☃, 4, a, b, false);
/*     */   }
/*     */   
/*     */   public apv(boolean ☃, int i, alz alz1, alz alz2, boolean bool1) {
/*  34 */     super(☃);
/*  35 */     this.c = i;
/*  36 */     this.e = alz1;
/*  37 */     this.f = alz2;
/*  38 */     this.d = bool1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  43 */     int i = random.nextInt(3) + this.c;
/*     */     
/*  45 */     boolean bool = true;
/*  46 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/*  47 */       return false;
/*     */     }
/*     */     
/*  50 */     for (int j = cj1.o(); j <= cj1.o() + 1 + i; j++) {
/*  51 */       int i1 = 1;
/*  52 */       if (j == cj1.o()) {
/*  53 */         i1 = 0;
/*     */       }
/*  55 */       if (j >= cj1.o() + 1 + i - 2) {
/*  56 */         i1 = 2;
/*     */       }
/*  58 */       cj.a a = new cj.a();
/*  59 */       for (int i2 = cj1.n() - i1; i2 <= cj1.n() + i1 && bool; i2++) {
/*  60 */         for (int i3 = cj1.p() - i1; i3 <= cj1.p() + i1 && bool; i3++) {
/*  61 */           if (j >= 0 && j < 256) {
/*  62 */             if (!a(☃.p(a.c(i2, j, i3)).c())) {
/*  63 */               bool = false;
/*     */             }
/*     */           } else {
/*  66 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  72 */     if (!bool) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     afh afh = ☃.p(cj1.b()).c();
/*  77 */     if ((afh != afi.c && afh != afi.d && afh != afi.ak) || cj1.o() >= 256 - i - 1) {
/*  78 */       return false;
/*     */     }
/*     */     
/*  81 */     a(☃, cj1.b());
/*     */     
/*  83 */     int k = 3;
/*  84 */     int m = 0; int n;
/*  85 */     for (n = cj1.o() - k + i; n <= cj1.o() + i; n++) {
/*  86 */       int i1 = n - cj1.o() + i;
/*  87 */       int i2 = m + 1 - i1 / 2;
/*  88 */       for (int i3 = cj1.n() - i2; i3 <= cj1.n() + i2; i3++) {
/*  89 */         int i4 = i3 - cj1.n();
/*  90 */         for (int i5 = cj1.p() - i2; i5 <= cj1.p() + i2; i5++) {
/*  91 */           int i6 = i5 - cj1.p();
/*  92 */           if (Math.abs(i4) != i2 || Math.abs(i6) != i2 || (random.nextInt(2) != 0 && i1 != 0)) {
/*     */ 
/*     */             
/*  95 */             cj cj2 = new cj(i3, n, i5);
/*  96 */             afh afh1 = ☃.p(cj2).c();
/*  97 */             if (afh1.t() == arm.a || afh1.t() == arm.j || afh1.t() == arm.l)
/*  98 */               a(☃, cj2, this.f); 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 103 */     for (n = 0; n < i; n++) {
/* 104 */       afh afh1 = ☃.p(cj1.b(n)).c();
/* 105 */       if (afh1.t() == arm.a || afh1.t() == arm.j || afh1.t() == arm.l) {
/* 106 */         a(☃, cj1.b(n), this.e);
/* 107 */         if (this.d && n > 0) {
/* 108 */           if (random.nextInt(3) > 0 && ☃.d(cj1.a(-1, n, 0))) {
/* 109 */             a(☃, cj1.a(-1, n, 0), akk.N);
/*     */           }
/* 111 */           if (random.nextInt(3) > 0 && ☃.d(cj1.a(1, n, 0))) {
/* 112 */             a(☃, cj1.a(1, n, 0), akk.P);
/*     */           }
/* 114 */           if (random.nextInt(3) > 0 && ☃.d(cj1.a(0, n, -1))) {
/* 115 */             a(☃, cj1.a(0, n, -1), akk.O);
/*     */           }
/* 117 */           if (random.nextInt(3) > 0 && ☃.d(cj1.a(0, n, 1))) {
/* 118 */             a(☃, cj1.a(0, n, 1), akk.b);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 124 */     if (this.d) {
/* 125 */       for (n = cj1.o() - 3 + i; n <= cj1.o() + i; n++) {
/* 126 */         int i1 = n - cj1.o() + i;
/* 127 */         int i2 = 2 - i1 / 2;
/* 128 */         cj.a a = new cj.a();
/* 129 */         for (int i3 = cj1.n() - i2; i3 <= cj1.n() + i2; i3++) {
/* 130 */           for (int i4 = cj1.p() - i2; i4 <= cj1.p() + i2; i4++) {
/* 131 */             a.c(i3, n, i4);
/*     */             
/* 133 */             if (☃.p(a).c().t() == arm.j) {
/* 134 */               cj cj2 = a.e();
/* 135 */               cj cj3 = a.f();
/* 136 */               cj cj4 = a.c();
/* 137 */               cj cj5 = a.d();
/*     */               
/* 139 */               if (random.nextInt(4) == 0 && ☃.p(cj2).c().t() == arm.a) {
/* 140 */                 b(☃, cj2, akk.N);
/*     */               }
/* 142 */               if (random.nextInt(4) == 0 && ☃.p(cj3).c().t() == arm.a) {
/* 143 */                 b(☃, cj3, akk.P);
/*     */               }
/* 145 */               if (random.nextInt(4) == 0 && ☃.p(cj4).c().t() == arm.a) {
/* 146 */                 b(☃, cj4, akk.O);
/*     */               }
/* 148 */               if (random.nextInt(4) == 0 && ☃.p(cj5).c().t() == arm.a) {
/* 149 */                 b(☃, cj5, akk.b);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 157 */       if (random.nextInt(5) == 0 && i > 5) {
/* 158 */         for (n = 0; n < 2; n++) {
/* 159 */           for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 160 */             if (random.nextInt(4 - n) == 0) {
/* 161 */               cq cq1 = cq.d();
/* 162 */               a(☃, random.nextInt(3), cj1.a(cq1.g(), i - 5 + n, cq1.i()), cq);
/*     */             }  }
/*     */         
/*     */         } 
/*     */       }
/*     */     } 
/* 168 */     return true;
/*     */   }
/*     */   
/*     */   private void a(adm ☃, int i, cj cj1, cq cq1) {
/* 172 */     a(☃, cj1, afi.bN.Q().<Comparable, Integer>a(afu.a, Integer.valueOf(i)).a(afu.O, cq1));
/*     */   }
/*     */   
/*     */   private void a(adm ☃, cj cj1, amk amk1) {
/* 176 */     a(☃, cj1, afi.bn.Q().a(amk1, Boolean.valueOf(true)));
/*     */   }
/*     */   
/*     */   private void b(adm ☃, cj cj1, amk amk1) {
/* 180 */     a(☃, cj1, amk1);
/* 181 */     int i = 4;
/*     */     
/* 183 */     cj1 = cj1.b();
/* 184 */     while (☃.p(cj1).c().t() == arm.a && i > 0) {
/* 185 */       a(☃, cj1, amk1);
/* 186 */       cj1 = cj1.b();
/* 187 */       i--;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */