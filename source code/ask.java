/*    */ 
/*    */ 
/*    */ public class ask
/*    */   extends ase
/*    */ {
/*    */   private ase c;
/*    */   private ase d;
/*    */   
/*    */   public ask(long ☃, ase ase1, ase ase2) {
/* 10 */     super(☃);
/* 11 */     this.c = ase1;
/* 12 */     this.d = ase2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃) {
/* 17 */     this.c.a(☃);
/* 18 */     this.d.a(☃);
/* 19 */     super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public int[] a(int ☃, int i, int j, int k) {
/* 24 */     int[] arrayOfInt1 = this.c.a(☃, i, j, k);
/* 25 */     int[] arrayOfInt2 = this.d.a(☃, i, j, k);
/*    */     
/* 27 */     int[] arrayOfInt3 = asc.a(j * k);
/* 28 */     for (int m = 0; m < j * k; m++) {
/* 29 */       if (arrayOfInt1[m] == ady.p.az || arrayOfInt1[m] == ady.N.az) {
/* 30 */         arrayOfInt3[m] = arrayOfInt1[m];
/*    */       }
/* 32 */       else if (arrayOfInt2[m] == ady.w.az) {
/* 33 */         if (arrayOfInt1[m] == ady.B.az) {
/* 34 */           arrayOfInt3[m] = ady.A.az;
/* 35 */         } else if (arrayOfInt1[m] == ady.D.az || arrayOfInt1[m] == ady.E.az) {
/* 36 */           arrayOfInt3[m] = ady.E.az;
/*    */         } else {
/* 38 */           arrayOfInt3[m] = arrayOfInt2[m] & 0xFF;
/*    */         } 
/*    */       } else {
/* 41 */         arrayOfInt3[m] = arrayOfInt1[m];
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 46 */     return arrayOfInt3;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */