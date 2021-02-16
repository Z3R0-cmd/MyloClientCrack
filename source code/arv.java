/*     */ 
/*     */ 
/*     */ 
/*     */ public class arv
/*     */   extends ase
/*     */ {
/*     */   public arv(long ☃, ase ase1) {
/*   8 */     super(☃);
/*   9 */     this.a = ase1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(int ☃, int i, int j, int k) {
/*  14 */     int[] arrayOfInt1 = this.a.a(☃ - 1, i - 1, j + 2, k + 2);
/*     */     
/*  16 */     int[] arrayOfInt2 = asc.a(j * k);
/*  17 */     for (int m = 0; m < k; m++) {
/*  18 */       for (int n = 0; n < j; n++) {
/*  19 */         a((n + ☃), (m + i));
/*  20 */         int i1 = arrayOfInt1[n + 1 + (m + 1) * (j + 2)];
/*  21 */         if (!a(arrayOfInt1, arrayOfInt2, n, m, j, i1, ady.s.az, ady.J.az) && 
/*  22 */           !b(arrayOfInt1, arrayOfInt2, n, m, j, i1, ady.ab.az, ady.aa.az) && 
/*  23 */           !b(arrayOfInt1, arrayOfInt2, n, m, j, i1, ady.ac.az, ady.aa.az) && 
/*  24 */           !b(arrayOfInt1, arrayOfInt2, n, m, j, i1, ady.V.az, ady.u.az)) {
/*  25 */           if (i1 == ady.r.az) {
/*  26 */             int i2 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  27 */             int i3 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  28 */             int i4 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  29 */             int i5 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  30 */             if (i2 == ady.B.az || i3 == ady.B.az || i4 == ady.B.az || i5 == ady.B.az) {
/*  31 */               arrayOfInt2[n + m * j] = ady.X.az;
/*     */             } else {
/*  33 */               arrayOfInt2[n + m * j] = i1;
/*     */             } 
/*  35 */           } else if (i1 == ady.v.az) {
/*     */             
/*  37 */             int i2 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  38 */             int i3 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  39 */             int i4 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  40 */             int i5 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  41 */             if (i2 == ady.r.az || i3 == ady.r.az || i4 == ady.r.az || i5 == ady.r.az || i2 == ady.T.az || i3 == ady.T.az || i4 == ady.T.az || i5 == ady.T.az || i2 == ady.B.az || i3 == ady.B.az || i4 == ady.B.az || i5 == ady.B.az) {
/*  42 */               arrayOfInt2[n + m * j] = ady.q.az;
/*  43 */             } else if (i2 == ady.K.az || i5 == ady.K.az || i3 == ady.K.az || i4 == ady.K.az) {
/*  44 */               arrayOfInt2[n + m * j] = ady.M.az;
/*     */             } else {
/*  46 */               arrayOfInt2[n + m * j] = i1;
/*     */             } 
/*     */           } else {
/*  49 */             arrayOfInt2[n + m * j] = i1;
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*  54 */     return arrayOfInt2;
/*     */   }
/*     */   
/*     */   private boolean a(int[] ☃, int[] arrayOfInt1, int i, int j, int k, int m, int n, int i1) {
/*  58 */     if (a(m, n)) {
/*  59 */       int i2 = ☃[i + 1 + (j + 1 - 1) * (k + 2)];
/*  60 */       int i3 = ☃[i + 1 + 1 + (j + 1) * (k + 2)];
/*  61 */       int i4 = ☃[i + 1 - 1 + (j + 1) * (k + 2)];
/*  62 */       int i5 = ☃[i + 1 + (j + 1 + 1) * (k + 2)];
/*  63 */       if (!b(i2, n) || !b(i3, n) || !b(i4, n) || !b(i5, n)) {
/*  64 */         arrayOfInt1[i + j * k] = i1;
/*     */       } else {
/*  66 */         arrayOfInt1[i + j * k] = m;
/*     */       } 
/*  68 */       return true;
/*     */     } 
/*  70 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(int[] ☃, int[] arrayOfInt1, int i, int j, int k, int m, int n, int i1) {
/*  74 */     if (m == n) {
/*  75 */       int i2 = ☃[i + 1 + (j + 1 - 1) * (k + 2)];
/*  76 */       int i3 = ☃[i + 1 + 1 + (j + 1) * (k + 2)];
/*  77 */       int i4 = ☃[i + 1 - 1 + (j + 1) * (k + 2)];
/*  78 */       int i5 = ☃[i + 1 + (j + 1 + 1) * (k + 2)];
/*  79 */       if (!a(i2, n) || !a(i3, n) || !a(i4, n) || !a(i5, n)) {
/*  80 */         arrayOfInt1[i + j * k] = i1;
/*     */       } else {
/*  82 */         arrayOfInt1[i + j * k] = m;
/*     */       } 
/*  84 */       return true;
/*     */     } 
/*  86 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃, int i) {
/*  90 */     if (a(☃, i)) {
/*  91 */       return true;
/*     */     }
/*  93 */     ady ady1 = ady.e(☃);
/*  94 */     ady ady2 = ady.e(i);
/*  95 */     if (ady1 != null && ady2 != null) {
/*  96 */       ady.b b1 = ady1.m();
/*  97 */       ady.b b2 = ady2.m();
/*  98 */       return (b1 == b2 || b1 == ady.b.c || b2 == ady.b.c);
/*     */     } 
/* 100 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */