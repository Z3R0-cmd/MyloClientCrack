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
/*     */ public class ajf
/*     */   extends agd
/*     */ {
/*  22 */   public static final amk a = amk.a("locked");
/*  23 */   public static final amn b = amn.a("delay", 1, 4);
/*     */   
/*     */   protected ajf(boolean ☃) {
/*  26 */     super(☃);
/*  27 */     j(this.M.b().<Comparable, cq>a(O, cq.c).<Comparable, Integer>a(b, Integer.valueOf(1)).a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  32 */     return di.a("item.diode.name");
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  37 */     return ☃.a(a, Boolean.valueOf(b(adq1, cj1, ☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  42 */     if (!wn1.bA.e) {
/*  43 */       return false;
/*     */     }
/*     */     
/*  46 */     ☃.a(cj1, alz1.a(b), 3);
/*  47 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(alz ☃) {
/*  52 */     return ((Integer)☃.<Integer>b(b)).intValue() * 2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected alz e(alz ☃) {
/*  57 */     Integer integer = ☃.<Integer>b(b);
/*  58 */     Boolean bool = ☃.<Boolean>b(a);
/*  59 */     cq cq = ☃.<cq>b(O);
/*  60 */     return afi.bc.Q().<Comparable, cq>a(O, cq).<Comparable, Integer>a(b, integer).a(a, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected alz k(alz ☃) {
/*  65 */     Integer integer = ☃.<Integer>b(b);
/*  66 */     Boolean bool = ☃.<Boolean>b(a);
/*  67 */     cq cq = ☃.<cq>b(O);
/*  68 */     return afi.bb.Q().<Comparable, cq>a(O, cq).<Comparable, Integer>a(b, integer).a(a, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  74 */     return zy.bb;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  79 */     return zy.bb;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1, alz alz1) {
/*  84 */     return (c(☃, cj1, alz1) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(afh ☃) {
/*  89 */     return d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/*  94 */     if (!this.N) {
/*     */       return;
/*     */     }
/*  97 */     cq cq = alz1.<cq>b(O);
/*     */     
/*  99 */     double d1 = (cj1.n() + 0.5F) + (random.nextFloat() - 0.5F) * 0.2D;
/* 100 */     double d2 = (cj1.o() + 0.4F) + (random.nextFloat() - 0.5F) * 0.2D;
/* 101 */     double d3 = (cj1.p() + 0.5F) + (random.nextFloat() - 0.5F) * 0.2D;
/*     */     
/* 103 */     float f = -5.0F;
/* 104 */     if (random.nextBoolean()) {
/* 105 */       f = (((Integer)alz1.<Integer>b(b)).intValue() * 2 - 1);
/*     */     }
/* 107 */     f /= 16.0F;
/*     */     
/* 109 */     double d4 = (f * cq.g());
/* 110 */     double d5 = (f * cq.i());
/*     */     
/* 112 */     ☃.a(cy.E, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 117 */     super.b(☃, cj1, alz1);
/* 118 */     h(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 123 */     return Q().<Comparable, cq>a(O, cq.b(☃)).<Comparable, Boolean>a(a, Boolean.valueOf(false)).a(b, Integer.valueOf(1 + (☃ >> 2)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 131 */     int i = 0;
/*     */     
/* 133 */     i |= ((cq)☃.<cq>b(O)).b();
/* 134 */     i |= ((Integer)☃.<Integer>b(b)).intValue() - 1 << 2;
/*     */     
/* 136 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 141 */     return new ama(this, new amo[] { O, b, a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */