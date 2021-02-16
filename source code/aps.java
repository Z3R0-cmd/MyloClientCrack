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
/*     */ public class aps
/*     */   extends aoh
/*     */ {
/*  17 */   private static final alz a = afi.r.Q().a(ail.b, aio.a.b);
/*  18 */   private static final alz b = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.b).a(ahs.b, Boolean.valueOf(false));
/*     */   
/*     */   public aps(boolean ☃) {
/*  21 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  27 */     int i = random.nextInt(4) + 6;
/*  28 */     int j = 1 + random.nextInt(2);
/*  29 */     int k = i - j;
/*  30 */     int m = 2 + random.nextInt(2);
/*     */     
/*  32 */     boolean bool = true;
/*     */     
/*  34 */     if (cj1.o() < 1 || cj1.o() + i + 1 > 256) {
/*  35 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  39 */     for (int n = cj1.o(); n <= cj1.o() + 1 + i && bool; n++) {
/*  40 */       int i6 = 1;
/*  41 */       if (n - cj1.o() < j) {
/*  42 */         i6 = 0;
/*     */       } else {
/*  44 */         i6 = m;
/*     */       } 
/*  46 */       cj.a a = new cj.a();
/*  47 */       for (int i7 = cj1.n() - i6; i7 <= cj1.n() + i6 && bool; i7++) {
/*  48 */         for (int i8 = cj1.p() - i6; i8 <= cj1.p() + i6 && bool; i8++) {
/*  49 */           if (n >= 0 && n < 256) {
/*  50 */             afh afh1 = ☃.p(a.c(i7, n, i8)).c();
/*  51 */             if (afh1.t() != arm.a && afh1.t() != arm.j) {
/*  52 */               bool = false;
/*     */             }
/*     */           } else {
/*  55 */             bool = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  61 */     if (!bool) {
/*  62 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  66 */     afh afh = ☃.p(cj1.b()).c();
/*  67 */     if ((afh != afi.c && afh != afi.d && afh != afi.ak) || cj1.o() >= 256 - i - 1) {
/*  68 */       return false;
/*     */     }
/*     */     
/*  71 */     a(☃, cj1.b());
/*     */ 
/*     */     
/*  74 */     int i1 = random.nextInt(2);
/*  75 */     int i2 = 1;
/*  76 */     int i3 = 0; int i4;
/*  77 */     for (i4 = 0; i4 <= k; i4++) {
/*  78 */       int i6 = cj1.o() + i - i4;
/*     */       
/*  80 */       for (int i7 = cj1.n() - i1; i7 <= cj1.n() + i1; i7++) {
/*  81 */         int i8 = i7 - cj1.n();
/*  82 */         for (int i9 = cj1.p() - i1; i9 <= cj1.p() + i1; i9++) {
/*  83 */           int i10 = i9 - cj1.p();
/*  84 */           if (Math.abs(i8) != i1 || Math.abs(i10) != i1 || i1 <= 0) {
/*     */ 
/*     */             
/*  87 */             cj cj2 = new cj(i7, i6, i9);
/*  88 */             if (!☃.p(cj2).c().o()) {
/*  89 */               a(☃, cj2, b);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*  94 */       if (i1 >= i2) {
/*  95 */         i1 = i3;
/*  96 */         i3 = 1;
/*  97 */         i2++;
/*  98 */         if (i2 > m) {
/*  99 */           i2 = m;
/*     */         }
/*     */       } else {
/* 102 */         i1++;
/*     */       } 
/*     */     } 
/* 105 */     i4 = random.nextInt(3);
/* 106 */     for (int i5 = 0; i5 < i - i4; i5++) {
/* 107 */       afh afh1 = ☃.p(cj1.b(i5)).c();
/* 108 */       if (afh1.t() == arm.a || afh1.t() == arm.j) {
/* 109 */         a(☃, cj1.b(i5), a);
/*     */       }
/*     */     } 
/* 112 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */