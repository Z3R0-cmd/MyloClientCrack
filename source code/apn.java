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
/*     */ public class apn
/*     */   extends aoh
/*     */ {
/*  16 */   private static final alz a = afi.s.Q().a(aig.b, aio.a.f);
/*  17 */   private static final alz b = afi.u.Q().<aio.a, aio.a>a(aif.Q, aio.a.f).a(ahs.b, Boolean.valueOf(false));
/*     */   
/*     */   public apn(boolean ☃) {
/*  20 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  25 */     int i = random.nextInt(3) + random.nextInt(2) + 6;
/*     */     
/*  27 */     int j = cj1.n();
/*  28 */     int k = cj1.o();
/*  29 */     int m = cj1.p();
/*     */     
/*  31 */     if (k < 1 || k + i + 1 >= 256) {
/*  32 */       return false;
/*     */     }
/*     */     
/*  35 */     cj cj2 = cj1.b();
/*  36 */     afh afh = ☃.p(cj2).c();
/*  37 */     if (afh != afi.c && afh != afi.d) {
/*  38 */       return false;
/*     */     }
/*     */     
/*  41 */     if (!a(☃, cj1, i)) {
/*  42 */       return false;
/*     */     }
/*     */     
/*  45 */     a(☃, cj2);
/*  46 */     a(☃, cj2.f());
/*  47 */     a(☃, cj2.d());
/*  48 */     a(☃, cj2.d().f());
/*     */     
/*  50 */     cq cq = cq.c.a.a(random);
/*  51 */     int n = i - random.nextInt(4);
/*  52 */     int i1 = 2 - random.nextInt(3);
/*     */     
/*  54 */     int i2 = j;
/*  55 */     int i3 = m;
/*  56 */     int i4 = k + i - 1;
/*     */     
/*     */     int i5;
/*  59 */     for (i5 = 0; i5 < i; i5++) {
/*  60 */       if (i5 >= n && i1 > 0) {
/*  61 */         i2 += cq.g();
/*  62 */         i3 += cq.i();
/*  63 */         i1--;
/*     */       } 
/*     */       
/*  66 */       int i6 = k + i5;
/*  67 */       cj cj3 = new cj(i2, i6, i3);
/*  68 */       arm arm = ☃.p(cj3).c().t();
/*  69 */       if (arm == arm.a || arm == arm.j) {
/*  70 */         b(☃, cj3);
/*  71 */         b(☃, cj3.f());
/*  72 */         b(☃, cj3.d());
/*  73 */         b(☃, cj3.f().d());
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  78 */     for (i5 = -2; i5 <= 0; i5++) {
/*  79 */       for (int i6 = -2; i6 <= 0; i6++) {
/*  80 */         int i7 = -1;
/*  81 */         a(☃, i2 + i5, i4 + i7, i3 + i6);
/*  82 */         a(☃, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  83 */         a(☃, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  84 */         a(☃, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*  85 */         if ((i5 > -2 || i6 > -1) && (i5 != -1 || i6 != -2)) {
/*     */ 
/*     */           
/*  88 */           i7 = 1;
/*  89 */           a(☃, i2 + i5, i4 + i7, i3 + i6);
/*  90 */           a(☃, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  91 */           a(☃, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  92 */           a(☃, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*     */         } 
/*     */       } 
/*  95 */     }  if (random.nextBoolean()) {
/*  96 */       a(☃, i2, i4 + 2, i3);
/*  97 */       a(☃, i2 + 1, i4 + 2, i3);
/*  98 */       a(☃, i2 + 1, i4 + 2, i3 + 1);
/*  99 */       a(☃, i2, i4 + 2, i3 + 1);
/*     */     } 
/* 101 */     for (i5 = -3; i5 <= 4; i5++) {
/* 102 */       for (int i6 = -3; i6 <= 4; i6++) {
/* 103 */         if ((i5 != -3 || i6 != -3) && (i5 != -3 || i6 != 4) && (i5 != 4 || i6 != -3) && (i5 != 4 || i6 != 4))
/*     */         {
/*     */           
/* 106 */           if (Math.abs(i5) < 3 || Math.abs(i6) < 3)
/*     */           {
/*     */             
/* 109 */             a(☃, i2 + i5, i4, i3 + i6);
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/* 114 */     for (i5 = -1; i5 <= 2; i5++) {
/* 115 */       for (int i6 = -1; i6 <= 2; i6++) {
/* 116 */         if (i5 < 0 || i5 > 1 || i6 < 0 || i6 > 1)
/*     */         {
/*     */           
/* 119 */           if (random.nextInt(3) <= 0) {
/*     */ 
/*     */             
/* 122 */             int i7 = random.nextInt(3) + 2; int i8;
/* 123 */             for (i8 = 0; i8 < i7; i8++) {
/* 124 */               b(☃, new cj(j + i5, i4 - i8 - 1, m + i6));
/*     */             }
/* 126 */             for (i8 = -1; i8 <= 1; i8++) {
/* 127 */               for (int i9 = -1; i9 <= 1; i9++) {
/* 128 */                 a(☃, i2 + i5 + i8, i4, i3 + i6 + i9);
/*     */               }
/*     */             } 
/* 131 */             for (i8 = -2; i8 <= 2; i8++) {
/* 132 */               for (int i9 = -2; i9 <= 2; i9++) {
/* 133 */                 if (Math.abs(i8) != 2 || Math.abs(i9) != 2)
/*     */                 {
/*     */                   
/* 136 */                   a(☃, i2 + i5 + i8, i4 - 1, i3 + i6 + i9); } 
/*     */               } 
/*     */             } 
/*     */           }  } 
/*     */       } 
/*     */     } 
/* 142 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(adm ☃, cj cj1, int i) {
/* 146 */     int j = cj1.n();
/* 147 */     int k = cj1.o();
/* 148 */     int m = cj1.p();
/*     */     
/* 150 */     cj.a a = new cj.a();
/* 151 */     for (int n = 0; n <= i + 1; n++) {
/* 152 */       int i1 = 1;
/* 153 */       if (n == 0) {
/* 154 */         i1 = 0;
/*     */       }
/* 156 */       if (n >= i - 1) {
/* 157 */         i1 = 2;
/*     */       }
/*     */       
/* 160 */       for (int i2 = -i1; i2 <= i1; i2++) {
/* 161 */         for (int i3 = -i1; i3 <= i1; i3++) {
/* 162 */           if (!a(☃.p(a.c(j + i2, k + n, m + i3)).c())) {
/* 163 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 168 */     return true;
/*     */   }
/*     */   
/*     */   private void b(adm ☃, cj cj1) {
/* 172 */     if (a(☃.p(cj1).c())) {
/* 173 */       a(☃, cj1, a);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(adm ☃, int i, int j, int k) {
/* 178 */     cj cj = new cj(i, j, k);
/* 179 */     afh afh = ☃.p(cj).c();
/*     */     
/* 181 */     if (afh.t() == arm.a)
/* 182 */       a(☃, cj, b); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */