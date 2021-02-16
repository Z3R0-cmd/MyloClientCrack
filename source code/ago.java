/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ago
/*     */   extends afh
/*     */ {
/*  23 */   public static final aml a = aml.a("facing", cq.c.a);
/*  24 */   public static final amk b = amk.a("eye");
/*     */   
/*     */   public ago() {
/*  27 */     super(arm.e, arn.C);
/*  28 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  33 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  38 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  43 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/*  44 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/*  46 */     if (((Boolean)☃.p(cj1).<Boolean>b(b)).booleanValue()) {
/*  47 */       a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
/*  48 */       super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     } 
/*  50 */     j();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  56 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  61 */     return Q().<Comparable, cq>a(a, pr1.aP().d()).a(b, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/*  66 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/*  71 */     if (((Boolean)☃.p(cj1).<Boolean>b(b)).booleanValue()) {
/*  72 */       return 15;
/*     */     }
/*     */     
/*  75 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  80 */     return Q().<Comparable, Boolean>a(b, Boolean.valueOf(((☃ & 0x4) != 0))).a(a, cq.b(☃ & 0x3));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  87 */     int i = 0;
/*     */     
/*  89 */     i |= ((cq)☃.<cq>b(a)).b();
/*     */     
/*  91 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/*  92 */       i |= 0x4;
/*     */     }
/*     */     
/*  95 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 100 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ago.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */