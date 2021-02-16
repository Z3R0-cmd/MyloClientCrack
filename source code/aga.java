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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aga
/*     */   extends afc
/*     */ {
/*  27 */   public static final amn a = amn.a("power", 0, 15);
/*     */   
/*     */   private final boolean b;
/*     */   
/*     */   public aga(boolean ☃) {
/*  32 */     super(arm.d);
/*  33 */     this.b = ☃;
/*     */     
/*  35 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  36 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*  37 */     a(yz.d);
/*     */     
/*  39 */     c(0.2F);
/*  40 */     a(f);
/*  41 */     c("daylightDetector");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  46 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  51 */     return ((Integer)alz1.<Integer>b(a)).intValue();
/*     */   }
/*     */   
/*     */   public void f(adm ☃, cj cj1) {
/*  55 */     if (☃.t.o()) {
/*     */       return;
/*     */     }
/*     */     
/*  59 */     alz alz = ☃.p(cj1);
/*  60 */     int i = ☃.b(ads.a, cj1) - ☃.ab();
/*  61 */     float f1 = ☃.d(1.0F);
/*     */ 
/*     */     
/*  64 */     float f2 = (f1 < 3.1415927F) ? 0.0F : 6.2831855F;
/*  65 */     f1 += (f2 - f1) * 0.2F;
/*     */     
/*  67 */     i = Math.round(i * ns.b(f1));
/*  68 */     i = ns.a(i, 0, 15);
/*     */     
/*  70 */     if (this.b) {
/*  71 */       i = 15 - i;
/*     */     }
/*     */     
/*  74 */     if (((Integer)alz.<Integer>b(a)).intValue() != i) {
/*  75 */       ☃.a(cj1, alz.a(a, Integer.valueOf(i)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  81 */     if (wn1.cn()) {
/*  82 */       if (☃.D) {
/*  83 */         return true;
/*     */       }
/*  85 */       if (this.b) {
/*  86 */         ☃.a(cj1, afi.cl.Q().a(a, alz1.b(a)), 4);
/*  87 */         afi.cl.f(☃, cj1);
/*     */       } else {
/*  89 */         ☃.a(cj1, afi.cm.Q().a(a, alz1.b(a)), 4);
/*  90 */         afi.cm.f(☃, cj1);
/*     */       } 
/*  92 */       return true;
/*     */     } 
/*  94 */     return super.a(☃, cj1, alz1, wn1, cq1, f1, f2, f3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 100 */     return zw.a(afi.cl);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 105 */     return zw.a(afi.cl);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 114 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 124 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 134 */     return new alb();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 139 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 144 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 149 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/* 154 */     if (!this.b)
/*     */     {
/*     */       
/* 157 */       super.a(☃, yz1, list);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */