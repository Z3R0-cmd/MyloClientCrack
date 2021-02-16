/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acf
/*    */   extends aci
/*    */ {
/* 18 */   private static final String[] E = new String[] { "all", "undead", "arthropods" };
/*    */ 
/*    */ 
/*    */   
/* 22 */   private static final int[] F = new int[] { 1, 5, 5 };
/*    */ 
/*    */ 
/*    */   
/* 26 */   private static final int[] G = new int[] { 11, 8, 8 };
/*    */ 
/*    */ 
/*    */   
/* 30 */   private static final int[] H = new int[] { 20, 20, 20 };
/*    */ 
/*    */   
/*    */   public final int a;
/*    */ 
/*    */   
/*    */   public acf(int ☃, jy jy1, int i, int j) {
/* 37 */     super(☃, jy1, i, acj.g);
/* 38 */     this.a = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 43 */     return F[this.a] + (☃ - 1) * G[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 48 */     return a(☃) + H[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 53 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(int ☃, pw pw1) {
/* 58 */     if (this.a == 0) {
/* 59 */       return ☃ * 1.25F;
/*    */     }
/* 61 */     if (this.a == 1 && pw1 == pw.b) {
/* 62 */       return ☃ * 2.5F;
/*    */     }
/* 64 */     if (this.a == 2 && pw1 == pw.c) {
/* 65 */       return ☃ * 2.5F;
/*    */     }
/* 67 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 72 */     return "enchantment.damage." + E[this.a];
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aci ☃) {
/* 77 */     return !(☃ instanceof acf);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃) {
/* 82 */     if (☃.b() instanceof yl) {
/* 83 */       return true;
/*    */     }
/* 85 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(pr ☃, pk pk1, int i) {
/* 90 */     if (pk1 instanceof pr) {
/* 91 */       pr pr1 = (pr)pk1;
/*    */       
/* 93 */       if (this.a == 2 && pr1.bz() == pw.c) {
/* 94 */         int j = 20 + ☃.bc().nextInt(10 * i);
/* 95 */         pr1.c(new pf(pe.d.H, j, 3));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/acf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */