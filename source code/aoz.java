/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoz
/*     */   extends aot
/*     */ {
/*     */   private afh a;
/*     */   
/*     */   public aoz(afh ☃) {
/*  16 */     super(true);
/*  17 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public aoz() {
/*  21 */     super(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  26 */     if (this.a == null) {
/*  27 */       this.a = random.nextBoolean() ? afi.bg : afi.bh;
/*     */     }
/*     */     
/*  30 */     int i = random.nextInt(3) + 4;
/*     */     
/*  32 */     boolean bool = true;
/*  33 */     if (cj1.o() < 1 || cj1.o() + i + 1 >= 256) {
/*  34 */       return false;
/*     */     }
/*     */     
/*  37 */     for (int j = cj1.o(); j <= cj1.o() + 1 + i; j++) {
/*  38 */       int n = 3;
/*  39 */       if (j <= cj1.o() + 3) {
/*  40 */         n = 0;
/*     */       }
/*  42 */       cj.a a = new cj.a();
/*  43 */       for (int i1 = cj1.n() - n; i1 <= cj1.n() + n && bool; i1++) {
/*  44 */         for (int i2 = cj1.p() - n; i2 <= cj1.p() + n && bool; i2++) {
/*  45 */           if (j >= 0 && j < 256) {
/*  46 */             afh afh2 = ☃.p(a.c(i1, j, i2)).c();
/*  47 */             if (afh2.t() != arm.a && afh2.t() != arm.j) {
/*  48 */               bool = false;
/*     */             }
/*     */           } else {
/*  51 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  57 */     if (!bool) {
/*  58 */       return false;
/*     */     }
/*     */     
/*  61 */     afh afh1 = ☃.p(cj1.b()).c();
/*  62 */     if (afh1 != afi.d && afh1 != afi.c && afh1 != afi.bw) {
/*  63 */       return false;
/*     */     }
/*     */     
/*  66 */     int k = cj1.o() + i;
/*  67 */     if (this.a == afi.bh)
/*  68 */       k = cj1.o() + i - 3; 
/*     */     int m;
/*  70 */     for (m = k; m <= cj1.o() + i; m++) {
/*  71 */       int n = 1;
/*  72 */       if (m < cj1.o() + i) {
/*  73 */         n++;
/*     */       }
/*  75 */       if (this.a == afi.bg) {
/*  76 */         n = 3;
/*     */       }
/*  78 */       int i1 = cj1.n() - n;
/*  79 */       int i2 = cj1.n() + n;
/*  80 */       int i3 = cj1.p() - n;
/*  81 */       int i4 = cj1.p() + n;
/*  82 */       for (int i5 = i1; i5 <= i2; i5++) {
/*  83 */         for (int i6 = i3; i6 <= i4; i6++) {
/*  84 */           int i7 = 5;
/*  85 */           if (i5 == i1) {
/*  86 */             i7--;
/*  87 */           } else if (i5 == i2) {
/*  88 */             i7++;
/*     */           } 
/*  90 */           if (i6 == i3) {
/*  91 */             i7 -= 3;
/*  92 */           } else if (i6 == i4) {
/*  93 */             i7 += 3;
/*     */           } 
/*     */           
/*  96 */           aho.a a = aho.a.a(i7);
/*     */           
/*  98 */           if (this.a == afi.bg || m < cj1.o() + i) {
/*  99 */             if ((i5 == i1 || i5 == i2) && (i6 == i3 || i6 == i4)) {
/*     */               continue;
/*     */             }
/* 102 */             if (i5 == cj1.n() - n - 1 && i6 == i3) {
/* 103 */               a = aho.a.a;
/*     */             }
/* 105 */             if (i5 == i1 && i6 == cj1.p() - n - 1) {
/* 106 */               a = aho.a.a;
/*     */             }
/*     */             
/* 109 */             if (i5 == cj1.n() + n - 1 && i6 == i3) {
/* 110 */               a = aho.a.c;
/*     */             }
/* 112 */             if (i5 == i2 && i6 == cj1.p() - n - 1) {
/* 113 */               a = aho.a.c;
/*     */             }
/*     */             
/* 116 */             if (i5 == cj1.n() - n - 1 && i6 == i4) {
/* 117 */               a = aho.a.g;
/*     */             }
/* 119 */             if (i5 == i1 && i6 == cj1.p() + n - 1) {
/* 120 */               a = aho.a.g;
/*     */             }
/*     */             
/* 123 */             if (i5 == cj1.n() + n - 1 && i6 == i4) {
/* 124 */               a = aho.a.i;
/*     */             }
/* 126 */             if (i5 == i2 && i6 == cj1.p() + n - 1) {
/* 127 */               a = aho.a.i;
/*     */             }
/*     */           } 
/*     */           
/* 131 */           if (a == aho.a.e && m < cj1.o() + i) {
/* 132 */             a = aho.a.k;
/*     */           }
/* 134 */           if (cj1.o() >= cj1.o() + i - 1 || a != aho.a.k) {
/* 135 */             cj cj2 = new cj(i5, m, i6);
/* 136 */             if (!☃.p(cj2).c().o())
/* 137 */               a(☃, cj2, this.a.Q().a(aho.a, a)); 
/*     */           } 
/*     */           continue;
/*     */         } 
/*     */       } 
/*     */     } 
/* 143 */     for (m = 0; m < i; m++) {
/* 144 */       afh afh2 = ☃.p(cj1.b(m)).c();
/* 145 */       if (!afh2.o()) {
/* 146 */         a(☃, cj1.b(m), this.a.Q().a(aho.a, aho.a.j));
/*     */       }
/*     */     } 
/* 149 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aoz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */