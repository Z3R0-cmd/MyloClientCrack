/*     */ public class arr
/*     */   extends ase
/*     */ {
/*     */   private final a c;
/*     */   
/*     */   public enum a
/*     */   {
/*   8 */     a, b, c;
/*     */   }
/*     */   
/*     */   public arr(long ☃, ase ase1, a a1) {
/*  12 */     super(☃);
/*  13 */     this.a = ase1;
/*  14 */     this.c = a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(int ☃, int i, int j, int k) {
/*  19 */     switch (null.a[this.c.ordinal()])
/*     */     
/*     */     { default:
/*  22 */         return c(☃, i, j, k);
/*     */       case 2:
/*  24 */         return d(☃, i, j, k);
/*     */       case 3:
/*  26 */         break; }  return e(☃, i, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   private int[] c(int ☃, int i, int j, int k) {
/*  31 */     int m = ☃ - 1;
/*  32 */     int n = i - 1;
/*  33 */     int i1 = 1 + j + 1;
/*  34 */     int i2 = 1 + k + 1;
/*  35 */     int[] arrayOfInt1 = this.a.a(m, n, i1, i2);
/*     */     
/*  37 */     int[] arrayOfInt2 = asc.a(j * k);
/*     */     
/*  39 */     for (int i3 = 0; i3 < k; i3++) {
/*  40 */       for (int i4 = 0; i4 < j; i4++) {
/*  41 */         a((i4 + ☃), (i3 + i));
/*     */         
/*  43 */         int i5 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/*     */         
/*  45 */         if (i5 == 1) {
/*  46 */           int i6 = arrayOfInt1[i4 + 1 + (i3 + 1 - 1) * i1];
/*  47 */           int i7 = arrayOfInt1[i4 + 1 + 1 + (i3 + 1) * i1];
/*  48 */           int i8 = arrayOfInt1[i4 + 1 - 1 + (i3 + 1) * i1];
/*  49 */           int i9 = arrayOfInt1[i4 + 1 + (i3 + 1 + 1) * i1];
/*     */           
/*  51 */           boolean bool1 = (i6 == 3 || i7 == 3 || i8 == 3 || i9 == 3);
/*  52 */           boolean bool2 = (i6 == 4 || i7 == 4 || i8 == 4 || i9 == 4);
/*  53 */           if (bool1 || bool2) {
/*  54 */             i5 = 2;
/*     */           }
/*     */         } 
/*     */         
/*  58 */         arrayOfInt2[i4 + i3 * j] = i5;
/*     */       } 
/*     */     } 
/*     */     
/*  62 */     return arrayOfInt2;
/*     */   }
/*     */   
/*     */   private int[] d(int ☃, int i, int j, int k) {
/*  66 */     int m = ☃ - 1;
/*  67 */     int n = i - 1;
/*  68 */     int i1 = 1 + j + 1;
/*  69 */     int i2 = 1 + k + 1;
/*  70 */     int[] arrayOfInt1 = this.a.a(m, n, i1, i2);
/*     */     
/*  72 */     int[] arrayOfInt2 = asc.a(j * k);
/*     */     
/*  74 */     for (int i3 = 0; i3 < k; i3++) {
/*  75 */       for (int i4 = 0; i4 < j; i4++) {
/*  76 */         int i5 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/*     */         
/*  78 */         if (i5 == 4) {
/*  79 */           int i6 = arrayOfInt1[i4 + 1 + (i3 + 1 - 1) * i1];
/*  80 */           int i7 = arrayOfInt1[i4 + 1 + 1 + (i3 + 1) * i1];
/*  81 */           int i8 = arrayOfInt1[i4 + 1 - 1 + (i3 + 1) * i1];
/*  82 */           int i9 = arrayOfInt1[i4 + 1 + (i3 + 1 + 1) * i1];
/*     */           
/*  84 */           boolean bool1 = (i6 == 2 || i7 == 2 || i8 == 2 || i9 == 2);
/*  85 */           boolean bool2 = (i6 == 1 || i7 == 1 || i8 == 1 || i9 == 1);
/*     */           
/*  87 */           if (bool2 || bool1) {
/*  88 */             i5 = 3;
/*     */           }
/*     */         } 
/*     */         
/*  92 */         arrayOfInt2[i4 + i3 * j] = i5;
/*     */       } 
/*     */     } 
/*     */     
/*  96 */     return arrayOfInt2;
/*     */   }
/*     */   
/*     */   private int[] e(int ☃, int i, int j, int k) {
/* 100 */     int[] arrayOfInt1 = this.a.a(☃, i, j, k);
/* 101 */     int[] arrayOfInt2 = asc.a(j * k);
/*     */     
/* 103 */     for (int m = 0; m < k; m++) {
/* 104 */       for (int n = 0; n < j; n++) {
/* 105 */         a((n + ☃), (m + i));
/*     */         
/* 107 */         int i1 = arrayOfInt1[n + m * j];
/*     */         
/* 109 */         if (i1 != 0 && a(13) == 0) {
/* 110 */           i1 |= 1 + a(15) << 8 & 0xF00;
/*     */         }
/*     */         
/* 113 */         arrayOfInt2[n + m * j] = i1;
/*     */       } 
/*     */     } 
/*     */     
/* 117 */     return arrayOfInt2;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */