/*    */ public class asm
/*    */   extends ase
/*    */ {
/*    */   public asm(long ☃, ase ase1) {
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
/* 20 */         int i5 = arrayOfInt1[i4 + 0 + (i3 + 1) * i1];
/* 21 */         int i6 = arrayOfInt1[i4 + 2 + (i3 + 1) * i1];
/* 22 */         int i7 = arrayOfInt1[i4 + 1 + (i3 + 0) * i1];
/* 23 */         int i8 = arrayOfInt1[i4 + 1 + (i3 + 2) * i1];
/* 24 */         int i9 = arrayOfInt1[i4 + 1 + (i3 + 1) * i1];
/* 25 */         if (i5 == i6 && i7 == i8) {
/* 26 */           a((i4 + ☃), (i3 + i));
/* 27 */           if (a(2) == 0) {
/* 28 */             i9 = i5;
/*    */           } else {
/* 30 */             i9 = i7;
/*    */           } 
/*    */         } else {
/* 33 */           if (i5 == i6) {
/* 34 */             i9 = i5;
/*    */           }
/* 36 */           if (i7 == i8) {
/* 37 */             i9 = i7;
/*    */           }
/*    */         } 
/* 40 */         arrayOfInt2[i4 + i3 * j] = i9;
/*    */       } 
/*    */     } 
/*    */     
/* 44 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */