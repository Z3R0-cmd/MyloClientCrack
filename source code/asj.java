/*    */ 
/*    */ 
/*    */ public class asj
/*    */   extends ase
/*    */ {
/*    */   public asj(long ☃, ase ase1) {
/*  7 */     super(☃);
/*  8 */     this.a = ase1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] a(int ☃, int i, int j, int k) {
/* 13 */     int m = ☃ - 1;
/* 14 */     int n = i - 1;
/* 15 */     int i1 = j + 2;
/* 16 */     int i2 = k + 2;
/* 17 */     int[] arrayOfInt1 = this.a.a(m, n, i1, i2);
/*    */     
/* 19 */     int[] arrayOfInt2 = asc.a(j * k);
/* 20 */     for (int i3 = 0; i3 < k; i3++) {
/* 21 */       for (int i4 = 0; i4 < j; i4++) {
/* 22 */         int i5 = c(arrayOfInt1[i4 + 0 + (i3 + 1) * i1]);
/* 23 */         int i6 = c(arrayOfInt1[i4 + 2 + (i3 + 1) * i1]);
/* 24 */         int i7 = c(arrayOfInt1[i4 + 1 + (i3 + 0) * i1]);
/* 25 */         int i8 = c(arrayOfInt1[i4 + 1 + (i3 + 2) * i1]);
/* 26 */         int i9 = c(arrayOfInt1[i4 + 1 + (i3 + 1) * i1]);
/* 27 */         if (i9 != i5 || i9 != i7 || i9 != i6 || i9 != i8) {
/* 28 */           arrayOfInt2[i4 + i3 * j] = ady.w.az;
/*    */         } else {
/* 30 */           arrayOfInt2[i4 + i3 * j] = -1;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 35 */     return arrayOfInt2;
/*    */   }
/*    */   
/*    */   private int c(int ☃) {
/* 39 */     if (☃ >= 2) {
/* 40 */       return 2 + (☃ & 0x1);
/*    */     }
/* 42 */     return ☃;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */