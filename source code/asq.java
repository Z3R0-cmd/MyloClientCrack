/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asq
/*    */   extends ase
/*    */ {
/*    */   public asq(long ☃, ase ase1) {
/* 10 */     super(☃);
/* 11 */     this.a = ase1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] a(int ☃, int i, int j, int k) {
/* 16 */     ☃ -= 2;
/* 17 */     i -= 2;
/* 18 */     int m = ☃ >> 2;
/* 19 */     int n = i >> 2;
/* 20 */     int i1 = (j >> 2) + 2;
/* 21 */     int i2 = (k >> 2) + 2;
/* 22 */     int[] arrayOfInt1 = this.a.a(m, n, i1, i2);
/*    */     
/* 24 */     int i3 = i1 - 1 << 2;
/* 25 */     int i4 = i2 - 1 << 2;
/*    */     
/* 27 */     int[] arrayOfInt2 = asc.a(i3 * i4);
/* 28 */     for (int i5 = 0; i5 < i2 - 1; i5++) {
/* 29 */       int i7 = 0;
/* 30 */       int i8 = arrayOfInt1[i7 + 0 + (i5 + 0) * i1];
/* 31 */       int i9 = arrayOfInt1[i7 + 0 + (i5 + 1) * i1];
/* 32 */       for (; i7 < i1 - 1; i7++) {
/* 33 */         double d1 = 3.6D;
/* 34 */         a((i7 + m << 2), (i5 + n << 2));
/* 35 */         double d2 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 36 */         double d3 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/*    */         
/* 38 */         a((i7 + m + 1 << 2), (i5 + n << 2));
/* 39 */         double d4 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 40 */         double d5 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/*    */         
/* 42 */         a((i7 + m << 2), (i5 + n + 1 << 2));
/* 43 */         double d6 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 44 */         double d7 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/*    */         
/* 46 */         a((i7 + m + 1 << 2), (i5 + n + 1 << 2));
/* 47 */         double d8 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 48 */         double d9 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/*    */         
/* 50 */         int i10 = arrayOfInt1[i7 + 1 + (i5 + 0) * i1] & 0xFF;
/* 51 */         int i11 = arrayOfInt1[i7 + 1 + (i5 + 1) * i1] & 0xFF;
/*    */         
/* 53 */         for (int i12 = 0; i12 < 4; i12++) {
/* 54 */           int i13 = ((i5 << 2) + i12) * i3 + (i7 << 2);
/* 55 */           for (int i14 = 0; i14 < 4; i14++) {
/* 56 */             double d10 = (i12 - d3) * (i12 - d3) + (i14 - d2) * (i14 - d2);
/* 57 */             double d11 = (i12 - d5) * (i12 - d5) + (i14 - d4) * (i14 - d4);
/* 58 */             double d12 = (i12 - d7) * (i12 - d7) + (i14 - d6) * (i14 - d6);
/* 59 */             double d13 = (i12 - d9) * (i12 - d9) + (i14 - d8) * (i14 - d8);
/*    */             
/* 61 */             if (d10 < d11 && d10 < d12 && d10 < d13) {
/* 62 */               arrayOfInt2[i13++] = i8;
/* 63 */             } else if (d11 < d10 && d11 < d12 && d11 < d13) {
/* 64 */               arrayOfInt2[i13++] = i10;
/* 65 */             } else if (d12 < d10 && d12 < d11 && d12 < d13) {
/* 66 */               arrayOfInt2[i13++] = i9;
/*    */             } else {
/* 68 */               arrayOfInt2[i13++] = i11;
/*    */             } 
/*    */           } 
/*    */         } 
/*    */         
/* 73 */         i8 = i10;
/* 74 */         i9 = i11;
/*    */       } 
/*    */     } 
/*    */     
/* 78 */     int[] arrayOfInt3 = asc.a(j * k);
/* 79 */     for (int i6 = 0; i6 < k; i6++) {
/* 80 */       System.arraycopy(arrayOfInt2, (i6 + (i & 0x3)) * i3 + (☃ & 0x3), arrayOfInt3, i6 * j, j);
/*    */     }
/* 82 */     return arrayOfInt3;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */