/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asr
/*    */   extends ase
/*    */ {
/*    */   public asr(long ☃, ase ase1) {
/*  9 */     super(☃);
/* 10 */     this.a = ase1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] a(int ☃, int i, int j, int k) {
/* 15 */     int m = ☃ >> 1;
/* 16 */     int n = i >> 1;
/* 17 */     int i1 = (j >> 1) + 2;
/* 18 */     int i2 = (k >> 1) + 2;
/* 19 */     int[] arrayOfInt1 = this.a.a(m, n, i1, i2);
/*    */     
/* 21 */     int i3 = i1 - 1 << 1;
/* 22 */     int i4 = i2 - 1 << 1;
/*    */     
/* 24 */     int[] arrayOfInt2 = asc.a(i3 * i4);
/*    */     
/* 26 */     for (int i5 = 0; i5 < i2 - 1; i5++) {
/* 27 */       int i7 = (i5 << 1) * i3;
/*    */       
/* 29 */       int i8 = 0;
/* 30 */       int i9 = arrayOfInt1[i8 + 0 + (i5 + 0) * i1];
/* 31 */       int i10 = arrayOfInt1[i8 + 0 + (i5 + 1) * i1];
/* 32 */       for (; i8 < i1 - 1; i8++) {
/* 33 */         a((i8 + m << 1), (i5 + n << 1));
/*    */         
/* 35 */         int i11 = arrayOfInt1[i8 + 1 + (i5 + 0) * i1];
/* 36 */         int i12 = arrayOfInt1[i8 + 1 + (i5 + 1) * i1];
/*    */         
/* 38 */         arrayOfInt2[i7] = i9;
/* 39 */         arrayOfInt2[i7++ + i3] = a(new int[] { i9, i10 });
/* 40 */         arrayOfInt2[i7] = a(new int[] { i9, i11 });
/* 41 */         arrayOfInt2[i7++ + i3] = b(i9, i11, i10, i12);
/*    */         
/* 43 */         i9 = i11;
/* 44 */         i10 = i12;
/*    */       } 
/*    */     } 
/*    */     
/* 48 */     int[] arrayOfInt3 = asc.a(j * k);
/* 49 */     for (int i6 = 0; i6 < k; i6++) {
/* 50 */       System.arraycopy(arrayOfInt2, (i6 + (i & 0x1)) * i3 + (☃ & 0x1), arrayOfInt3, i6 * j, j);
/*    */     }
/* 52 */     return arrayOfInt3;
/*    */   }
/*    */   
/*    */   public static ase b(long ☃, ase ase1, int i) {
/* 56 */     ase ase2 = ase1;
/* 57 */     for (int j = 0; j < i; j++) {
/* 58 */       ase2 = new asr(☃ + j, ase2);
/*    */     }
/* 60 */     return ase2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */