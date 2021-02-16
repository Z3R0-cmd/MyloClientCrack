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
/*     */ public class aim
/*     */   extends afh
/*     */ {
/*     */   public aim() {
/*  19 */     this(arm.e.r());
/*     */   }
/*     */   
/*     */   public aim(arn ☃) {
/*  23 */     super(arm.e, ☃);
/*  24 */     a(yz.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  30 */     if (this == afi.q) {
/*  31 */       return zy.h;
/*     */     }
/*  33 */     if (this == afi.ag) {
/*  34 */       return zy.i;
/*     */     }
/*  36 */     if (this == afi.x) {
/*  37 */       return zy.aW;
/*     */     }
/*  39 */     if (this == afi.bP) {
/*  40 */       return zy.bO;
/*     */     }
/*  42 */     if (this == afi.co) {
/*  43 */       return zy.cg;
/*     */     }
/*  45 */     return zw.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  50 */     if (this == afi.x) {
/*  51 */       return 4 + ☃.nextInt(5);
/*     */     }
/*  53 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, Random random) {
/*  58 */     if (☃ > 0 && zw.a(this) != a((alz)P().a().iterator().next(), random, ☃)) {
/*  59 */       int i = random.nextInt(☃ + 2) - 1;
/*  60 */       if (i < 0) {
/*  61 */         i = 0;
/*     */       }
/*  63 */       return a(random) * (i + 1);
/*     */     } 
/*  65 */     return a(random);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/*  70 */     super.a(☃, cj1, alz1, f, i);
/*     */ 
/*     */     
/*  73 */     if (a(alz1, ☃.s, i) != zw.a(this)) {
/*  74 */       int j = 0;
/*  75 */       if (this == afi.q) {
/*  76 */         j = ns.a(☃.s, 0, 2);
/*  77 */       } else if (this == afi.ag) {
/*  78 */         j = ns.a(☃.s, 3, 7);
/*  79 */       } else if (this == afi.bP) {
/*  80 */         j = ns.a(☃.s, 3, 7);
/*  81 */       } else if (this == afi.x) {
/*  82 */         j = ns.a(☃.s, 2, 5);
/*  83 */       } else if (this == afi.co) {
/*  84 */         j = ns.a(☃.s, 2, 5);
/*     */       } 
/*  86 */       b(☃, cj1, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/*  92 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  98 */     if (this == afi.x) {
/*  99 */       return zd.l.b();
/*     */     }
/* 101 */     return 0;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */