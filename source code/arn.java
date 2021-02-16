/*    */ 
/*    */ public class arn
/*    */ {
/*  4 */   public static final arn[] a = new arn[64];
/*    */   
/*  6 */   public static final arn b = new arn(0, 0);
/*  7 */   public static final arn c = new arn(1, 8368696);
/*  8 */   public static final arn d = new arn(2, 16247203);
/*  9 */   public static final arn e = new arn(3, 13092807);
/* 10 */   public static final arn f = new arn(4, 16711680);
/* 11 */   public static final arn g = new arn(5, 10526975);
/* 12 */   public static final arn h = new arn(6, 10987431);
/* 13 */   public static final arn i = new arn(7, 31744);
/* 14 */   public static final arn j = new arn(8, 16777215);
/* 15 */   public static final arn k = new arn(9, 10791096);
/* 16 */   public static final arn l = new arn(10, 9923917);
/* 17 */   public static final arn m = new arn(11, 7368816);
/* 18 */   public static final arn n = new arn(12, 4210943);
/* 19 */   public static final arn o = new arn(13, 9402184);
/* 20 */   public static final arn p = new arn(14, 16776437);
/* 21 */   public static final arn q = new arn(15, 14188339);
/* 22 */   public static final arn r = new arn(16, 11685080);
/* 23 */   public static final arn s = new arn(17, 6724056);
/* 24 */   public static final arn t = new arn(18, 15066419);
/* 25 */   public static final arn u = new arn(19, 8375321);
/* 26 */   public static final arn v = new arn(20, 15892389);
/* 27 */   public static final arn w = new arn(21, 5000268);
/* 28 */   public static final arn x = new arn(22, 10066329);
/* 29 */   public static final arn y = new arn(23, 5013401);
/* 30 */   public static final arn z = new arn(24, 8339378);
/* 31 */   public static final arn A = new arn(25, 3361970);
/* 32 */   public static final arn B = new arn(26, 6704179);
/* 33 */   public static final arn C = new arn(27, 6717235);
/* 34 */   public static final arn D = new arn(28, 10040115);
/* 35 */   public static final arn E = new arn(29, 1644825);
/* 36 */   public static final arn F = new arn(30, 16445005);
/* 37 */   public static final arn G = new arn(31, 6085589);
/* 38 */   public static final arn H = new arn(32, 4882687);
/* 39 */   public static final arn I = new arn(33, 55610);
/* 40 */   public static final arn J = new arn(34, 8476209);
/* 41 */   public static final arn K = new arn(35, 7340544);
/*    */   
/*    */   public final int L;
/*    */   public final int M;
/*    */   
/*    */   private arn(int ☃, int i) {
/* 47 */     if (☃ < 0 || ☃ > 63) {
/* 48 */       throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
/*    */     }
/* 50 */     this.M = ☃;
/* 51 */     this.L = i;
/* 52 */     a[☃] = this;
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 56 */     int i = 220;
/* 57 */     if (☃ == 3) {
/* 58 */       i = 135;
/*    */     }
/* 60 */     if (☃ == 2) {
/* 61 */       i = 255;
/*    */     }
/* 63 */     if (☃ == 1) {
/* 64 */       i = 220;
/*    */     }
/* 66 */     if (☃ == 0) {
/* 67 */       i = 180;
/*    */     }
/*    */     
/* 70 */     int j = (this.L >> 16 & 0xFF) * i / 255;
/* 71 */     int k = (this.L >> 8 & 0xFF) * i / 255;
/* 72 */     int m = (this.L & 0xFF) * i / 255;
/*    */     
/* 74 */     return 0xFF000000 | j << 16 | k << 8 | m;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/arn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */