/*    */ 
/*    */ 
/*    */ public class arq
/*    */   extends ase
/*    */ {
/*    */   public arq(long ☃, ase ase1) {
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
/* 22 */         int i5 = arrayOfInt1[i4 + 1 + (i3 + 1 - 1) * (j + 2)];
/* 23 */         int i6 = arrayOfInt1[i4 + 1 + 1 + (i3 + 1) * (j + 2)];
/* 24 */         int i7 = arrayOfInt1[i4 + 1 - 1 + (i3 + 1) * (j + 2)];
/* 25 */         int i8 = arrayOfInt1[i4 + 1 + (i3 + 1 + 1) * (j + 2)];
/*    */         
/* 27 */         int i9 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/* 28 */         int i10 = 0;
/* 29 */         if (i5 == 0) {
/* 30 */           i10++;
/*    */         }
/* 32 */         if (i6 == 0) {
/* 33 */           i10++;
/*    */         }
/* 35 */         if (i7 == 0) {
/* 36 */           i10++;
/*    */         }
/* 38 */         if (i8 == 0) {
/* 39 */           i10++;
/*    */         }
/*    */         
/* 42 */         if (i9 == 0 && i10 > 3) {
/* 43 */           arrayOfInt2[i4 + i3 * j] = ady.N.az;
/*    */         } else {
/* 45 */           arrayOfInt2[i4 + i3 * j] = i9;
/*    */         } 
/*    */       } 
/*    */     } 
/* 49 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */