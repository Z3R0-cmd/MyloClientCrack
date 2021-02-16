/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asl
/*     */   extends ase
/*     */ {
/*     */   public asl(long ☃, ase ase1) {
/*   9 */     super(☃);
/*  10 */     this.a = ase1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(int ☃, int i, int j, int k) {
/*  15 */     int[] arrayOfInt1 = this.a.a(☃ - 1, i - 1, j + 2, k + 2);
/*     */     
/*  17 */     int[] arrayOfInt2 = asc.a(j * k);
/*  18 */     for (int m = 0; m < k; m++) {
/*  19 */       for (int n = 0; n < j; n++) {
/*  20 */         a((n + ☃), (m + i));
/*  21 */         int i1 = arrayOfInt1[n + 1 + (m + 1) * (j + 2)];
/*  22 */         ady ady = ady.e(i1);
/*  23 */         if (i1 == ady.D.az) {
/*  24 */           int i2 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  25 */           int i3 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  26 */           int i4 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  27 */           int i5 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  28 */           if (i2 == ady.p.az || i3 == ady.p.az || i4 == ady.p.az || i5 == ady.p.az) {
/*  29 */             arrayOfInt2[n + m * j] = ady.E.az;
/*     */           } else {
/*  31 */             arrayOfInt2[n + m * j] = i1;
/*     */           } 
/*  33 */         } else if (ady != null && ady.l() == aej.class) {
/*  34 */           int i2 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  35 */           int i3 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  36 */           int i4 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  37 */           int i5 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  38 */           if (!c(i2) || !c(i3) || !c(i4) || !c(i5)) {
/*  39 */             arrayOfInt2[n + m * j] = ady.M.az;
/*  40 */           } else if (b(i2) || b(i3) || b(i4) || b(i5)) {
/*  41 */             arrayOfInt2[n + m * j] = ady.F.az;
/*     */           } else {
/*  43 */             arrayOfInt2[n + m * j] = i1;
/*     */           } 
/*  45 */         } else if (i1 == ady.s.az || i1 == ady.X.az || i1 == ady.J.az) {
/*  46 */           a(arrayOfInt1, arrayOfInt2, n, m, j, i1, ady.O.az);
/*  47 */         } else if (ady != null && ady.j()) {
/*  48 */           a(arrayOfInt1, arrayOfInt2, n, m, j, i1, ady.P.az);
/*  49 */         } else if (i1 == ady.aa.az || i1 == ady.ab.az) {
/*  50 */           int i2 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  51 */           int i3 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  52 */           int i4 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  53 */           int i5 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  54 */           if (b(i2) || b(i3) || b(i4) || b(i5)) {
/*  55 */             arrayOfInt2[n + m * j] = i1;
/*  56 */           } else if (!d(i2) || !d(i3) || !d(i4) || !d(i5)) {
/*  57 */             arrayOfInt2[n + m * j] = ady.r.az;
/*     */           } else {
/*  59 */             arrayOfInt2[n + m * j] = i1;
/*     */           } 
/*  61 */         } else if (i1 != ady.p.az && i1 != ady.N.az && i1 != ady.w.az && i1 != ady.v.az) {
/*  62 */           int i2 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  63 */           int i3 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  64 */           int i4 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  65 */           int i5 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  66 */           if (b(i2) || b(i3) || b(i4) || b(i5)) {
/*  67 */             arrayOfInt2[n + m * j] = ady.F.az;
/*     */           } else {
/*  69 */             arrayOfInt2[n + m * j] = i1;
/*     */           } 
/*     */         } else {
/*  72 */           arrayOfInt2[n + m * j] = i1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  77 */     return arrayOfInt2;
/*     */   }
/*     */   
/*     */   private void a(int[] ☃, int[] arrayOfInt1, int i, int j, int k, int m, int n) {
/*  81 */     if (b(m)) {
/*  82 */       arrayOfInt1[i + j * k] = m;
/*     */       return;
/*     */     } 
/*  85 */     int i1 = ☃[i + 1 + (j + 1 - 1) * (k + 2)];
/*  86 */     int i2 = ☃[i + 1 + 1 + (j + 1) * (k + 2)];
/*  87 */     int i3 = ☃[i + 1 - 1 + (j + 1) * (k + 2)];
/*  88 */     int i4 = ☃[i + 1 + (j + 1 + 1) * (k + 2)];
/*  89 */     if (b(i1) || b(i2) || b(i3) || b(i4)) {
/*  90 */       arrayOfInt1[i + j * k] = n;
/*     */     } else {
/*  92 */       arrayOfInt1[i + j * k] = m;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean c(int ☃) {
/*  97 */     if (ady.e(☃) != null && ady.e(☃).l() == aej.class) {
/*  98 */       return true;
/*     */     }
/*     */     
/* 101 */     return (☃ == ady.M.az || ☃ == ady.K.az || ☃ == ady.L.az || ☃ == ady.t.az || ☃ == ady.u.az || b(☃));
/*     */   }
/*     */   
/*     */   private boolean d(int ☃) {
/* 105 */     return ady.e(☃) instanceof aek;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */