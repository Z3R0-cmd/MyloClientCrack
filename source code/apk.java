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
/*     */ public class apk
/*     */   extends aoh
/*     */ {
/*  17 */   private static final alz a = afi.r.Q().a(ail.b, aio.a.b);
/*  18 */   private static final alz b = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.b).a(ahs.b, Boolean.valueOf(false));
/*     */   
/*     */   public apk() {
/*  21 */     super(false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  27 */     int i = random.nextInt(5) + 7;
/*  28 */     int j = i - random.nextInt(2) - 3;
/*  29 */     int k = i - j;
/*  30 */     int m = 1 + random.nextInt(k + 1);
/*     */     
/*  32 */     boolean bool = true;
/*     */     
/*  34 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/*  35 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  39 */     for (int n = cj1.o(); n <= cj1.o() + 1 + i && bool; n++) {
/*  40 */       int i3 = 1;
/*  41 */       if (n - cj1.o() < j) {
/*  42 */         i3 = 0;
/*     */       } else {
/*  44 */         i3 = m;
/*     */       } 
/*  46 */       cj.a a = new cj.a();
/*  47 */       for (int i4 = cj1.n() - i3; i4 <= cj1.n() + i3 && bool; i4++) {
/*  48 */         for (int i5 = cj1.p() - i3; i5 <= cj1.p() + i3 && bool; i5++) {
/*  49 */           if (n >= 0 && n < 256) {
/*  50 */             if (!a(☃.p(a.c(i4, n, i5)).c())) {
/*  51 */               bool = false;
/*     */             }
/*     */           } else {
/*  54 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  60 */     if (!bool) {
/*  61 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  65 */     afh afh = ☃.p(cj1.b()).c();
/*  66 */     if ((afh != afi.c && afh != afi.d) || cj1.o() >= 256 - i - 1) {
/*  67 */       return false;
/*     */     }
/*     */     
/*  70 */     a(☃, cj1.b());
/*     */ 
/*     */     
/*  73 */     int i1 = 0; int i2;
/*  74 */     for (i2 = cj1.o() + i; i2 >= cj1.o() + j; i2--) {
/*  75 */       for (int i3 = cj1.n() - i1; i3 <= cj1.n() + i1; i3++) {
/*  76 */         int i4 = i3 - cj1.n();
/*  77 */         for (int i5 = cj1.p() - i1; i5 <= cj1.p() + i1; i5++) {
/*  78 */           int i6 = i5 - cj1.p();
/*  79 */           if (Math.abs(i4) != i1 || Math.abs(i6) != i1 || i1 <= 0) {
/*     */ 
/*     */             
/*  82 */             cj cj2 = new cj(i3, i2, i5);
/*  83 */             if (!☃.p(cj2).c().o()) {
/*  84 */               a(☃, cj2, b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*  89 */       if (i1 >= 1 && i2 == cj1.o() + j + 1) {
/*  90 */         i1--;
/*  91 */       } else if (i1 < m) {
/*  92 */         i1++;
/*     */       } 
/*     */     } 
/*  95 */     for (i2 = 0; i2 < i - 1; i2++) {
/*  96 */       afh afh1 = ☃.p(cj1.b(i2)).c();
/*  97 */       if (afh1.t() == arm.a || afh1.t() == arm.j) {
/*  98 */         a(☃, cj1.b(i2), a);
/*     */       }
/*     */     } 
/* 101 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */