/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class asg
/*     */   extends ase
/*     */ {
/*   8 */   private static final Logger c = LogManager.getLogger();
/*     */   private ase d;
/*     */   
/*     */   public asg(long ☃, ase ase1, ase ase2) {
/*  12 */     super(☃);
/*  13 */     this.a = ase1;
/*  14 */     this.d = ase2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(int ☃, int i, int j, int k) {
/*  19 */     int[] arrayOfInt1 = this.a.a(☃ - 1, i - 1, j + 2, k + 2);
/*  20 */     int[] arrayOfInt2 = this.d.a(☃ - 1, i - 1, j + 2, k + 2);
/*     */     
/*  22 */     int[] arrayOfInt3 = asc.a(j * k);
/*  23 */     for (int m = 0; m < k; m++) {
/*  24 */       for (int n = 0; n < j; n++) {
/*  25 */         a((n + ☃), (m + i));
/*  26 */         int i1 = arrayOfInt1[n + 1 + (m + 1) * (j + 2)];
/*  27 */         int i2 = arrayOfInt2[n + 1 + (m + 1) * (j + 2)];
/*  28 */         boolean bool = ((i2 - 2) % 29 == 0);
/*  29 */         if (i1 > 255) {
/*  30 */           c.debug("old! " + i1);
/*     */         }
/*  32 */         if (i1 != 0 && i2 >= 2 && (i2 - 2) % 29 == 1 && i1 < 128) {
/*  33 */           if (ady.e(i1 + 128) != null) {
/*  34 */             arrayOfInt3[n + m * j] = i1 + 128;
/*     */           } else {
/*  36 */             arrayOfInt3[n + m * j] = i1;
/*     */           } 
/*  38 */         } else if (a(3) == 0 || bool) {
/*  39 */           int i3 = i1;
/*  40 */           if (i1 == ady.r.az) {
/*  41 */             i3 = ady.G.az;
/*  42 */           } else if (i1 == ady.t.az) {
/*  43 */             i3 = ady.H.az;
/*  44 */           } else if (i1 == ady.Q.az) {
/*  45 */             i3 = ady.R.az;
/*  46 */           } else if (i1 == ady.S.az) {
/*  47 */             i3 = ady.q.az;
/*  48 */           } else if (i1 == ady.u.az) {
/*  49 */             i3 = ady.I.az;
/*  50 */           } else if (i1 == ady.V.az) {
/*  51 */             i3 = ady.W.az;
/*  52 */           } else if (i1 == ady.T.az) {
/*  53 */             i3 = ady.U.az;
/*  54 */           } else if (i1 == ady.q.az) {
/*  55 */             if (a(3) == 0) {
/*  56 */               i3 = ady.H.az;
/*     */             } else {
/*  58 */               i3 = ady.t.az;
/*     */             } 
/*  60 */           } else if (i1 == ady.B.az) {
/*  61 */             i3 = ady.C.az;
/*  62 */           } else if (i1 == ady.K.az) {
/*  63 */             i3 = ady.L.az;
/*  64 */           } else if (i1 == ady.p.az) {
/*  65 */             i3 = ady.N.az;
/*  66 */           } else if (i1 == ady.s.az) {
/*  67 */             i3 = ady.X.az;
/*  68 */           } else if (i1 == ady.Y.az) {
/*  69 */             i3 = ady.Z.az;
/*  70 */           } else if (a(i1, ady.ab.az)) {
/*  71 */             i3 = ady.aa.az;
/*  72 */           } else if (i1 == ady.N.az && 
/*  73 */             a(3) == 0) {
/*  74 */             int i4 = a(2);
/*  75 */             if (i4 == 0) {
/*  76 */               i3 = ady.q.az;
/*     */             } else {
/*  78 */               i3 = ady.t.az;
/*     */             } 
/*     */           } 
/*     */           
/*  82 */           if (bool && i3 != i1) {
/*  83 */             if (ady.e(i3 + 128) != null) {
/*  84 */               i3 += 128;
/*     */             } else {
/*  86 */               i3 = i1;
/*     */             } 
/*     */           }
/*  89 */           if (i3 == i1) {
/*  90 */             arrayOfInt3[n + m * j] = i1;
/*     */           } else {
/*  92 */             int i4 = arrayOfInt1[n + 1 + (m + 1 - 1) * (j + 2)];
/*  93 */             int i5 = arrayOfInt1[n + 1 + 1 + (m + 1) * (j + 2)];
/*  94 */             int i6 = arrayOfInt1[n + 1 - 1 + (m + 1) * (j + 2)];
/*  95 */             int i7 = arrayOfInt1[n + 1 + (m + 1 + 1) * (j + 2)];
/*  96 */             int i8 = 0;
/*  97 */             if (a(i4, i1)) {
/*  98 */               i8++;
/*     */             }
/* 100 */             if (a(i5, i1)) {
/* 101 */               i8++;
/*     */             }
/* 103 */             if (a(i6, i1)) {
/* 104 */               i8++;
/*     */             }
/* 106 */             if (a(i7, i1)) {
/* 107 */               i8++;
/*     */             }
/* 109 */             if (i8 >= 3) {
/* 110 */               arrayOfInt3[n + m * j] = i3;
/*     */             } else {
/* 112 */               arrayOfInt3[n + m * j] = i1;
/*     */             } 
/*     */           } 
/*     */         } else {
/* 116 */           arrayOfInt3[n + m * j] = i1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 121 */     return arrayOfInt3;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */