/*    */ public class ars
/*    */   extends ase
/*    */ {
/*    */   public ars(long ☃, ase ase1) {
/*  5 */     super(☃);
/*  6 */     this.a = ase1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] a(int ☃, int i, int j, int k) {
/* 11 */     int m = ☃ - 1;
/* 12 */     int n = i - 1;
/* 13 */     int i1 = j + 2;
/* 14 */     int i2 = k + 2;
/* 15 */     int[] arrayOfInt1 = this.a.a(m, n, i1, i2);
/*    */     
/* 17 */     int[] arrayOfInt2 = asc.a(j * k);
/* 18 */     for (int i3 = 0; i3 < k; i3++) {
/* 19 */       for (int i4 = 0; i4 < j; i4++) {
/* 20 */         int i5 = arrayOfInt1[i4 + 0 + (i3 + 0) * i1];
/* 21 */         int i6 = arrayOfInt1[i4 + 2 + (i3 + 0) * i1];
/* 22 */         int i7 = arrayOfInt1[i4 + 0 + (i3 + 2) * i1];
/* 23 */         int i8 = arrayOfInt1[i4 + 2 + (i3 + 2) * i1];
/* 24 */         int i9 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/* 25 */         a((i4 + ☃), (i3 + i));
/* 26 */         if (i9 == 0 && (i5 != 0 || i6 != 0 || i7 != 0 || i8 != 0)) {
/* 27 */           int i10 = 1;
/* 28 */           int i11 = 1;
/* 29 */           if (i5 != 0 && a(i10++) == 0) {
/* 30 */             i11 = i5;
/*    */           }
/* 32 */           if (i6 != 0 && a(i10++) == 0) {
/* 33 */             i11 = i6;
/*    */           }
/* 35 */           if (i7 != 0 && a(i10++) == 0) {
/* 36 */             i11 = i7;
/*    */           }
/* 38 */           if (i8 != 0 && a(i10++) == 0) {
/* 39 */             i11 = i8;
/*    */           }
/* 41 */           if (a(3) == 0) {
/* 42 */             arrayOfInt2[i4 + i3 * j] = i11;
/*    */           }
/* 44 */           else if (i11 == 4) {
/* 45 */             arrayOfInt2[i4 + i3 * j] = 4;
/*    */           } else {
/* 47 */             arrayOfInt2[i4 + i3 * j] = 0;
/*    */           }
/*    */         
/* 50 */         } else if (i9 > 0 && (i5 == 0 || i6 == 0 || i7 == 0 || i8 == 0)) {
/* 51 */           if (a(5) == 0) {
/* 52 */             if (i9 == 4) {
/* 53 */               arrayOfInt2[i4 + i3 * j] = 4;
/*    */             } else {
/* 55 */               arrayOfInt2[i4 + i3 * j] = 0;
/*    */             } 
/*    */           } else {
/* 58 */             arrayOfInt2[i4 + i3 * j] = i9;
/*    */           } 
/*    */         } else {
/* 61 */           arrayOfInt2[i4 + i3 * j] = i9;
/*    */         } 
/*    */       } 
/*    */     } 
/* 65 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ars.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */