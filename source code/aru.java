/*    */ public class aru
/*    */   extends ase
/*    */ {
/*    */   public aru(long ☃, ase ase1) {
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
/* 20 */         int i5 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/* 21 */         a((i4 + ☃), (i3 + i));
/* 22 */         if (i5 == 0) {
/* 23 */           arrayOfInt2[i4 + i3 * j] = 0;
/*    */         } else {
/* 25 */           int i6 = a(6);
/* 26 */           if (i6 == 0) {
/* 27 */             i6 = 4;
/* 28 */           } else if (i6 <= 1) {
/* 29 */             i6 = 3;
/*    */           } else {
/* 31 */             i6 = 1;
/*    */           } 
/* 33 */           arrayOfInt2[i4 + i3 * j] = i6;
/*    */         } 
/*    */       } 
/*    */     } 
/* 37 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */