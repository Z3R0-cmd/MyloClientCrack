/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aid
/*     */   extends afm
/*     */ {
/*  19 */   public static final amn a = amn.a("age", 0, 3);
/*     */   
/*     */   protected aid() {
/*  22 */     super(arm.k, arn.D);
/*  23 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  24 */     a(true);
/*  25 */     float ☃ = 0.5F;
/*  26 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
/*  27 */     a((yz)null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(afh ☃) {
/*  32 */     return (☃ == afi.aW);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(adm ☃, cj cj1, alz alz1) {
/*  37 */     return c(☃.p(cj1.b()).c());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  42 */     int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  43 */     if (i < 3 && random.nextInt(10) == 0) {
/*  44 */       alz1 = alz1.a(a, Integer.valueOf(i + 1));
/*  45 */       ☃.a(cj1, alz1, 2);
/*     */     } 
/*     */     
/*  48 */     super.b(☃, cj1, alz1, random);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/*  57 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  61 */     int j = 1;
/*  62 */     if (((Integer)alz1.b(a)).intValue() >= 3) {
/*  63 */       j = 2 + ☃.s.nextInt(3);
/*  64 */       if (i > 0) {
/*  65 */         j += ☃.s.nextInt(i + 1);
/*     */       }
/*     */     } 
/*     */     
/*  69 */     for (int k = 0; k < j; k++) {
/*  70 */       a(☃, cj1, new zx(zy.by));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  77 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  82 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  87 */     return zy.by;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  92 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  98 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 103 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */