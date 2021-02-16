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
/*     */ public class apc
/*     */   extends aot
/*     */ {
/*     */   private afh a;
/*     */   
/*     */   public apc(afh ☃) {
/*  17 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  22 */     cj1 = cj1.a(-8, 0, -8);
/*  23 */     while (cj1.o() > 5 && ☃.d(cj1)) {
/*  24 */       cj1 = cj1.b();
/*     */     }
/*  26 */     if (cj1.o() <= 4) {
/*  27 */       return false;
/*     */     }
/*     */     
/*  30 */     cj1 = cj1.c(4);
/*     */     
/*  32 */     boolean[] arrayOfBoolean = new boolean[2048];
/*     */     
/*  34 */     int i = random.nextInt(4) + 4; int j;
/*  35 */     for (j = 0; j < i; j++) {
/*  36 */       double d1 = random.nextDouble() * 6.0D + 3.0D;
/*  37 */       double d2 = random.nextDouble() * 4.0D + 2.0D;
/*  38 */       double d3 = random.nextDouble() * 6.0D + 3.0D;
/*     */       
/*  40 */       double d4 = random.nextDouble() * (16.0D - d1 - 2.0D) + 1.0D + d1 / 2.0D;
/*  41 */       double d5 = random.nextDouble() * (8.0D - d2 - 4.0D) + 2.0D + d2 / 2.0D;
/*  42 */       double d6 = random.nextDouble() * (16.0D - d3 - 2.0D) + 1.0D + d3 / 2.0D;
/*     */       
/*  44 */       for (int k = 1; k < 15; k++) {
/*  45 */         for (int m = 1; m < 15; m++) {
/*  46 */           for (int n = 1; n < 7; n++) {
/*  47 */             double d7 = (k - d4) / d1 / 2.0D;
/*  48 */             double d8 = (n - d5) / d2 / 2.0D;
/*  49 */             double d9 = (m - d6) / d3 / 2.0D;
/*  50 */             double d10 = d7 * d7 + d8 * d8 + d9 * d9;
/*  51 */             if (d10 < 1.0D) {
/*  52 */               arrayOfBoolean[(k * 16 + m) * 8 + n] = true;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  59 */     for (j = 0; j < 16; j++) {
/*  60 */       for (int k = 0; k < 16; k++) {
/*  61 */         for (int m = 0; m < 8; m++) {
/*  62 */           boolean bool = (!arrayOfBoolean[(j * 16 + k) * 8 + m] && ((j < 15 && arrayOfBoolean[((j + 1) * 16 + k) * 8 + m]) || (j > 0 && arrayOfBoolean[((j - 1) * 16 + k) * 8 + m]) || (k < 15 && arrayOfBoolean[(j * 16 + k + 1) * 8 + m]) || (k > 0 && arrayOfBoolean[(j * 16 + k - 1) * 8 + m]) || (m < 7 && arrayOfBoolean[(j * 16 + k) * 8 + m + 1]) || (m > 0 && arrayOfBoolean[(j * 16 + k) * 8 + m - 1])));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  71 */           if (bool) {
/*  72 */             arm arm = ☃.p(cj1.a(j, m, k)).c().t();
/*  73 */             if (m >= 4 && arm.d()) {
/*  74 */               return false;
/*     */             }
/*  76 */             if (m < 4 && !arm.a() && ☃.p(cj1.a(j, m, k)).c() != this.a) {
/*  77 */               return false;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  84 */     for (j = 0; j < 16; j++) {
/*  85 */       for (int k = 0; k < 16; k++) {
/*  86 */         for (int m = 0; m < 8; m++) {
/*  87 */           if (arrayOfBoolean[(j * 16 + k) * 8 + m]) {
/*  88 */             ☃.a(cj1.a(j, m, k), (m >= 4) ? afi.a.Q() : this.a.Q(), 2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     for (j = 0; j < 16; j++) {
/*  95 */       for (int k = 0; k < 16; k++) {
/*  96 */         for (int m = 4; m < 8; m++) {
/*  97 */           if (arrayOfBoolean[(j * 16 + k) * 8 + m]) {
/*  98 */             cj cj2 = cj1.a(j, m - 1, k);
/*     */             
/* 100 */             if (☃.p(cj2).c() == afi.d && ☃.b(ads.a, cj1.a(j, m, k)) > 0) {
/* 101 */               ady ady = ☃.b(cj2);
/* 102 */               if (ady.ak.c() == afi.bw) {
/* 103 */                 ☃.a(cj2, afi.bw.Q(), 2);
/*     */               } else {
/* 105 */                 ☃.a(cj2, afi.c.Q(), 2);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 113 */     if (this.a.t() == arm.i) {
/* 114 */       for (j = 0; j < 16; j++) {
/* 115 */         for (int k = 0; k < 16; k++) {
/* 116 */           for (int m = 0; m < 8; m++) {
/* 117 */             boolean bool = (!arrayOfBoolean[(j * 16 + k) * 8 + m] && ((j < 15 && arrayOfBoolean[((j + 1) * 16 + k) * 8 + m]) || (j > 0 && arrayOfBoolean[((j - 1) * 16 + k) * 8 + m]) || (k < 15 && arrayOfBoolean[(j * 16 + k + 1) * 8 + m]) || (k > 0 && arrayOfBoolean[(j * 16 + k - 1) * 8 + m]) || (m < 7 && arrayOfBoolean[(j * 16 + k) * 8 + m + 1]) || (m > 0 && arrayOfBoolean[(j * 16 + k) * 8 + m - 1])));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 126 */             if (bool && (
/* 127 */               m < 4 || random.nextInt(2) != 0) && ☃.p(cj1.a(j, m, k)).c().t().a()) {
/* 128 */               ☃.a(cj1.a(j, m, k), afi.b.Q(), 2);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 136 */     if (this.a.t() == arm.h) {
/* 137 */       for (j = 0; j < 16; j++) {
/* 138 */         for (int k = 0; k < 16; k++) {
/* 139 */           int m = 4;
/* 140 */           if (☃.v(cj1.a(j, m, k))) {
/* 141 */             ☃.a(cj1.a(j, m, k), afi.aI.Q(), 2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 147 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */