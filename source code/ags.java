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
/*     */ 
/*     */ 
/*     */ public class ags
/*     */   extends afh
/*     */ {
/*  22 */   public static final amn a = amn.a("moisture", 0, 7);
/*     */ 
/*     */ 
/*     */   
/*     */   protected ags() {
/*  27 */     super(arm.c);
/*  28 */     j(this.M.b().a(a, Integer.valueOf(0)));
/*  29 */     a(true);
/*  30 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
/*  31 */     e(255);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  37 */     return new aug(cj1.n(), cj1.o(), cj1.p(), (cj1.n() + 1), (cj1.o() + 1), (cj1.p() + 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  42 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  47 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  52 */     int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*     */     
/*  54 */     if (f(☃, cj1) || ☃.C(cj1.a())) {
/*  55 */       if (i < 7) {
/*  56 */         ☃.a(cj1, alz1.a(a, Integer.valueOf(7)), 2);
/*     */       }
/*  58 */     } else if (i > 0) {
/*  59 */       ☃.a(cj1, alz1.a(a, Integer.valueOf(i - 1)), 2);
/*  60 */     } else if (!e(☃, cj1)) {
/*  61 */       ☃.a(cj1, afi.d.Q());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, pk pk1, float f) {
/*  67 */     if (!(pk1 instanceof pr)) {
/*     */       return;
/*     */     }
/*  70 */     if (!☃.D && ☃.s.nextFloat() < f - 0.5F) {
/*  71 */       if (!(pk1 instanceof wn) && !☃.Q().b("mobGriefing")) {
/*     */         return;
/*     */       }
/*  74 */       ☃.a(cj1, afi.d.Q());
/*     */     } 
/*  76 */     super.a(☃, cj1, pk1, f);
/*     */   }
/*     */   
/*     */   private boolean e(adm ☃, cj cj1) {
/*  80 */     afh afh1 = ☃.p(cj1.a()).c();
/*  81 */     return (afh1 instanceof afz || afh1 instanceof ajx);
/*     */   }
/*     */   
/*     */   private boolean f(adm ☃, cj cj1) {
/*  85 */     for (Iterator<cj.a> iterator = cj.b(cj1.a(-4, 0, -4), cj1.a(4, 1, 4)).iterator(); iterator.hasNext(); ) { cj.a a = iterator.next();
/*  86 */       if (☃.p(a).c().t() == arm.h) {
/*  87 */         return true;
/*     */       } }
/*     */     
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  95 */     super.a(☃, cj1, alz1, afh1);
/*     */     
/*  97 */     if (☃.p(cj1.a()).c().t().a()) {
/*  98 */       ☃.a(cj1, afi.d.Q());
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/*     */     afh afh1;
/* 104 */     switch (null.a[cq1.ordinal()]) {
/*     */       case 1:
/* 106 */         return true;
/*     */       case 2:
/*     */       case 3:
/*     */       case 4:
/*     */       case 5:
/* 111 */         afh1 = ☃.p(cj1).c();
/* 112 */         return (!afh1.c() && afh1 != afi.ak);
/*     */     } 
/* 114 */     return super.a(☃, cj1, cq1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 120 */     return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), random, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 125 */     return zw.a(afi.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 130 */     return Q().a(a, Integer.valueOf(☃ & 0x7));
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


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */