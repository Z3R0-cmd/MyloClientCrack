/*     */ import java.util.Iterator;
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
/*     */ public class aje
/*     */   extends afh
/*     */ {
/*  20 */   public static final amn a = amn.a("age", 0, 15);
/*     */   
/*     */   protected aje() {
/*  23 */     super(arm.k);
/*  24 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  25 */     float ☃ = 0.375F;
/*  26 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 1.0F, 0.5F + ☃);
/*  27 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  32 */     if (☃.p(cj1.b()).c() != afi.aM && !e(☃, cj1, alz1)) {
/*     */       return;
/*     */     }
/*     */     
/*  36 */     if (☃.d(cj1.a())) {
/*  37 */       int i = 1;
/*  38 */       while (☃.p(cj1.c(i)).c() == this) {
/*  39 */         i++;
/*     */       }
/*  41 */       if (i < 3) {
/*  42 */         int j = ((Integer)alz1.<Integer>b(a)).intValue();
/*  43 */         if (j == 15) {
/*  44 */           ☃.a(cj1.a(), Q());
/*  45 */           ☃.a(cj1, alz1.a(a, Integer.valueOf(0)), 4);
/*     */         } else {
/*  47 */           ☃.a(cj1, alz1.a(a, Integer.valueOf(j + 1)), 4);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  55 */     afh afh1 = ☃.p(cj1.b()).c();
/*  56 */     if (afh1 == this) {
/*  57 */       return true;
/*     */     }
/*     */     
/*  60 */     if (afh1 == afi.c || afh1 == afi.d || afh1 == afi.m) {
/*  61 */       for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  62 */         if (☃.p(cj1.a(cq).b()).c().t() == arm.h) {
/*  63 */           return true;
/*     */         } }
/*     */       
/*  66 */       return false;
/*     */     } 
/*     */     
/*  69 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  74 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   protected final boolean e(adm ☃, cj cj1, alz alz1) {
/*  78 */     if (e(☃, cj1)) {
/*  79 */       return true;
/*     */     }
/*     */     
/*  82 */     b(☃, cj1, alz1, 0);
/*  83 */     ☃.g(cj1);
/*  84 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(adm ☃, cj cj1) {
/*  88 */     return d(☃, cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  94 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 100 */     return zy.aJ;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 110 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 115 */     return zy.aJ;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/* 120 */     return ☃.b(cj1).b(cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 125 */     return adf.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 130 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 136 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 141 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */