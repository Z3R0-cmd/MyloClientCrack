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
/*     */ public abstract class apg
/*     */   extends aoh
/*     */ {
/*     */   protected final int a;
/*     */   protected final alz b;
/*     */   protected final alz c;
/*     */   protected int d;
/*     */   
/*     */   public apg(boolean ☃, int i, int j, alz alz1, alz alz2) {
/*  20 */     super(☃);
/*  21 */     this.a = i;
/*  22 */     this.d = j;
/*     */     
/*  24 */     this.b = alz1;
/*  25 */     this.c = alz2;
/*     */   }
/*     */   
/*     */   protected int a(Random ☃) {
/*  29 */     int i = ☃.nextInt(3) + this.a;
/*  30 */     if (this.d > 1) {
/*  31 */       i += ☃.nextInt(this.d);
/*     */     }
/*  33 */     return i;
/*     */   }
/*     */   
/*     */   private boolean c(adm ☃, cj cj1, int i) {
/*  37 */     boolean bool = true;
/*     */     
/*  39 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     for (int j = 0; j <= 1 + i; j++) {
/*  44 */       int k = 2;
/*  45 */       if (j == 0) {
/*  46 */         k = 1;
/*  47 */       } else if (j >= 1 + i - 2) {
/*  48 */         k = 2;
/*     */       } 
/*     */       
/*  51 */       for (int m = -k; m <= k && bool; m++) {
/*  52 */         for (int n = -k; n <= k && bool; n++) {
/*  53 */           if (cj1.o() + j < 0 || cj1.o() + j >= 256 || 
/*  54 */             !a(☃.p(cj1.a(m, j, n)).c()))
/*     */           {
/*     */ 
/*     */             
/*  58 */             bool = false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*  63 */     return bool;
/*     */   }
/*     */   
/*     */   private boolean a(cj ☃, adm adm1) {
/*  67 */     cj cj1 = ☃.b();
/*  68 */     afh afh = adm1.p(cj1).c();
/*  69 */     if ((afh != afi.c && afh != afi.d) || ☃.o() < 2) {
/*  70 */       return false;
/*     */     }
/*     */     
/*  73 */     a(adm1, cj1);
/*  74 */     a(adm1, cj1.f());
/*  75 */     a(adm1, cj1.d());
/*  76 */     a(adm1, cj1.d().f());
/*     */     
/*  78 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, Random random, cj cj1, int i) {
/*  82 */     return (c(☃, cj1, i) && a(cj1, ☃));
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, cj cj1, int i) {
/*  86 */     int j = i * i;
/*     */     
/*  88 */     for (int k = -i; k <= i + 1; k++) {
/*  89 */       for (int m = -i; m <= i + 1; m++) {
/*  90 */         int n = k - 1;
/*  91 */         int i1 = m - 1;
/*  92 */         if (k * k + m * m <= j || n * n + i1 * i1 <= j || k * k + i1 * i1 <= j || n * n + m * m <= j) {
/*     */ 
/*     */ 
/*     */           
/*  96 */           cj cj2 = cj1.a(k, 0, m);
/*  97 */           arm arm = ☃.p(cj2).c().t();
/*  98 */           if (arm == arm.a || arm == arm.j)
/*  99 */             a(☃, cj2, this.c); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b(adm ☃, cj cj1, int i) {
/* 106 */     int j = i * i;
/*     */     
/* 108 */     for (int k = -i; k <= i; k++) {
/* 109 */       for (int m = -i; m <= i; m++) {
/* 110 */         if (k * k + m * m <= j) {
/*     */ 
/*     */ 
/*     */           
/* 114 */           cj cj2 = cj1.a(k, 0, m);
/* 115 */           arm arm = ☃.p(cj2).c().t();
/* 116 */           if (arm == arm.a || arm == arm.j)
/* 117 */             a(☃, cj2, this.c); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */