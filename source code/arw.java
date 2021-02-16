/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arw
/*    */   extends ase
/*    */ {
/*  8 */   private ady[] c = new ady[] { ady.r, ady.r, ady.r, ady.Y, ady.Y, ady.q };
/*    */ 
/*    */ 
/*    */   
/* 12 */   private ady[] d = new ady[] { ady.t, ady.S, ady.s, ady.q, ady.Q, ady.v };
/*    */ 
/*    */ 
/*    */   
/* 16 */   private ady[] e = new ady[] { ady.t, ady.s, ady.u, ady.q };
/*    */ 
/*    */ 
/*    */   
/* 20 */   private ady[] f = new ady[] { ady.B, ady.B, ady.B, ady.T };
/*    */ 
/*    */   
/*    */   private final ant g;
/*    */ 
/*    */   
/*    */   public arw(long ☃, ase ase1, adr adr1, String str) {
/* 27 */     super(☃);
/* 28 */     this.a = ase1;
/*    */     
/* 30 */     if (adr1 == adr.h) {
/* 31 */       this.c = new ady[] { ady.r, ady.t, ady.s, ady.v, ady.q, ady.u };
/*    */ 
/*    */       
/* 34 */       this.g = null;
/* 35 */     } else if (adr1 == adr.f) {
/* 36 */       this.g = ant.a.a(str).b();
/*    */     } else {
/* 38 */       this.g = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] a(int ☃, int i, int j, int k) {
/* 44 */     int[] arrayOfInt1 = this.a.a(☃, i, j, k);
/*    */     
/* 46 */     int[] arrayOfInt2 = asc.a(j * k);
/* 47 */     for (int m = 0; m < k; m++) {
/* 48 */       for (int n = 0; n < j; n++) {
/* 49 */         a((n + ☃), (m + i));
/* 50 */         int i1 = arrayOfInt1[n + m * j];
/* 51 */         int i2 = (i1 & 0xF00) >> 8;
/* 52 */         i1 &= 0xFFFFF0FF;
/* 53 */         if (this.g != null && this.g.F >= 0) {
/* 54 */           arrayOfInt2[n + m * j] = this.g.F;
/* 55 */         } else if (b(i1)) {
/* 56 */           arrayOfInt2[n + m * j] = i1;
/* 57 */         } else if (i1 == ady.D.az) {
/* 58 */           arrayOfInt2[n + m * j] = i1;
/* 59 */         } else if (i1 == 1) {
/* 60 */           if (i2 > 0) {
/* 61 */             if (a(3) == 0) {
/* 62 */               arrayOfInt2[n + m * j] = ady.ac.az;
/*    */             } else {
/* 64 */               arrayOfInt2[n + m * j] = ady.ab.az;
/*    */             } 
/*    */           } else {
/* 67 */             arrayOfInt2[n + m * j] = (this.c[a(this.c.length)]).az;
/*    */           } 
/* 69 */         } else if (i1 == 2) {
/* 70 */           if (i2 > 0) {
/* 71 */             arrayOfInt2[n + m * j] = ady.K.az;
/*    */           } else {
/* 73 */             arrayOfInt2[n + m * j] = (this.d[a(this.d.length)]).az;
/*    */           } 
/* 75 */         } else if (i1 == 3) {
/* 76 */           if (i2 > 0) {
/* 77 */             arrayOfInt2[n + m * j] = ady.V.az;
/*    */           } else {
/* 79 */             arrayOfInt2[n + m * j] = (this.e[a(this.e.length)]).az;
/*    */           } 
/* 81 */         } else if (i1 == 4) {
/* 82 */           arrayOfInt2[n + m * j] = (this.f[a(this.f.length)]).az;
/*    */         } else {
/* 84 */           arrayOfInt2[n + m * j] = ady.D.az;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 89 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */