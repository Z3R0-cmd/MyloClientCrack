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
/*     */ public class ahe
/*     */   extends afh
/*     */   implements afj
/*     */ {
/*  20 */   public static final amk a = amk.a("snowy");
/*     */ 
/*     */ 
/*     */   
/*     */   protected ahe() {
/*  25 */     super(arm.b);
/*  26 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/*  27 */     a(true);
/*  28 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  33 */     afh afh1 = adq1.p(cj1.a()).c();
/*  34 */     return ☃.a(a, Boolean.valueOf((afh1 == afi.aJ || afh1 == afi.aH)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int H() {
/*  39 */     return adl.a(0.5D, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int h(alz ☃) {
/*  44 */     return H();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  49 */     return aea.a(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  54 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     if (☃.l(cj1.a()) < 4 && ☃.p(cj1.a()).c().p() > 2) {
/*  59 */       ☃.a(cj1, afi.d.Q());
/*     */       
/*     */       return;
/*     */     } 
/*  63 */     if (☃.l(cj1.a()) >= 9) {
/*  64 */       for (int i = 0; i < 4; i++) {
/*  65 */         cj cj2 = cj1.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
/*  66 */         afh afh1 = ☃.p(cj2.a()).c();
/*  67 */         alz alz2 = ☃.p(cj2);
/*  68 */         if (alz2.c() == afi.d && alz2.b(agf.a) == agf.a.a && ☃.l(cj2.a()) >= 4 && afh1.p() <= 2) {
/*  69 */           ☃.a(cj2, afi.c.Q());
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  78 */     return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), random, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/*  88 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/*  93 */     cj cj2 = cj1.a();
/*     */     int i;
/*  95 */     label27: for (i = 0; i < 128; i++) {
/*  96 */       cj cj3 = cj2;
/*  97 */       for (int j = 0; j < i / 16; ) {
/*  98 */         cj3 = cj3.a(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
/*  99 */         if (☃.p(cj3.b()).c() == afi.c) { if (☃.p(cj3).c().v())
/*     */             continue label27;  j++; }
/*     */         
/*     */         continue label27;
/*     */       } 
/* 104 */       if ((☃.p(cj3).c()).J == arm.a)
/*     */       {
/*     */ 
/*     */         
/* 108 */         if (random.nextInt(8) == 0) {
/* 109 */           agw.a a = ☃.b(cj3).a(random, cj3);
/* 110 */           agw agw = a.a().a();
/* 111 */           alz alz2 = agw.Q().a(agw.n(), a);
/* 112 */           if (agw.f(☃, cj3, alz2)) {
/* 113 */             ☃.a(cj3, alz2, 3);
/*     */           }
/*     */         } else {
/* 116 */           alz alz2 = afi.H.Q().a(akc.a, akc.a.b);
/* 117 */           if (afi.H.f(☃, cj3, alz2)) {
/* 118 */             ☃.a(cj3, alz2, 3);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public adf m() {
/* 126 */     return adf.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 131 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 136 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */