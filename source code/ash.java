/*    */ public class ash
/*    */   extends ase
/*    */ {
/*    */   public ash(long ☃, ase ase1) {
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
/* 20 */         int i5 = arrayOfInt1[i4 + 1 + (i3 + 1 - 1) * (j + 2)];
/* 21 */         int i6 = arrayOfInt1[i4 + 1 + 1 + (i3 + 1) * (j + 2)];
/* 22 */         int i7 = arrayOfInt1[i4 + 1 - 1 + (i3 + 1) * (j + 2)];
/* 23 */         int i8 = arrayOfInt1[i4 + 1 + (i3 + 1 + 1) * (j + 2)];
/*    */         
/* 25 */         int i9 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/* 26 */         arrayOfInt2[i4 + i3 * j] = i9;
/* 27 */         a((i4 + ☃), (i3 + i));
/* 28 */         if (i9 == 0 && i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0 && a(2) == 0) {
/* 29 */           arrayOfInt2[i4 + i3 * j] = 1;
/*    */         }
/*    */       } 
/*    */     } 
/* 33 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ash.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */