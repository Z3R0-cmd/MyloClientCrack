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
/*     */ public class apf
/*     */   extends apg
/*     */ {
/*  19 */   private static final alz e = afi.r.Q().a(ail.b, aio.a.b);
/*  20 */   private static final alz f = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.b).a(ahs.b, Boolean.valueOf(false));
/*  21 */   private static final alz g = afi.d.Q().a(agf.a, agf.a.c);
/*     */   
/*     */   private boolean h;
/*     */   
/*     */   public apf(boolean ☃, boolean bool1) {
/*  26 */     super(☃, 13, 15, e, f);
/*  27 */     this.h = bool1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  32 */     int i = a(random);
/*  33 */     if (!a(☃, random, cj1, i)) {
/*  34 */       return false;
/*     */     }
/*     */     
/*  37 */     a(☃, cj1.n(), cj1.p(), cj1.o() + i, 0, random);
/*     */     
/*  39 */     for (int j = 0; j < i; j++) {
/*  40 */       afh afh = ☃.p(cj1.b(j)).c();
/*  41 */       if (afh.t() == arm.a || afh.t() == arm.j) {
/*  42 */         a(☃, cj1.b(j), this.b);
/*     */       }
/*  44 */       if (j < i - 1) {
/*  45 */         afh = ☃.p(cj1.a(1, j, 0)).c();
/*  46 */         if (afh.t() == arm.a || afh.t() == arm.j) {
/*  47 */           a(☃, cj1.a(1, j, 0), this.b);
/*     */         }
/*  49 */         afh = ☃.p(cj1.a(1, j, 1)).c();
/*  50 */         if (afh.t() == arm.a || afh.t() == arm.j) {
/*  51 */           a(☃, cj1.a(1, j, 1), this.b);
/*     */         }
/*  53 */         afh = ☃.p(cj1.a(0, j, 1)).c();
/*  54 */         if (afh.t() == arm.a || afh.t() == arm.j) {
/*  55 */           a(☃, cj1.a(0, j, 1), this.b);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  60 */     return true;
/*     */   }
/*     */   
/*     */   private void a(adm ☃, int i, int j, int k, int m, Random random) {
/*  64 */     int n = random.nextInt(5) + (this.h ? this.a : 3);
/*     */     
/*  66 */     int i1 = 0;
/*  67 */     for (int i2 = k - n; i2 <= k; i2++) {
/*  68 */       int i3 = k - i2;
/*  69 */       int i4 = m + ns.d(i3 / n * 3.5F);
/*  70 */       a(☃, new cj(i, i2, j), i4 + ((i3 > 0 && i4 == i1 && (i2 & 0x1) == 0) ? 1 : 0));
/*  71 */       i1 = i4;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, cj cj1) {
/*  77 */     b(☃, cj1.e().c());
/*  78 */     b(☃, cj1.g(2).c());
/*  79 */     b(☃, cj1.e().e(2));
/*  80 */     b(☃, cj1.g(2).e(2));
/*     */     
/*  82 */     for (int i = 0; i < 5; i++) {
/*  83 */       int j = random.nextInt(64);
/*  84 */       int k = j % 8;
/*  85 */       int m = j / 8;
/*  86 */       if (k == 0 || k == 7 || m == 0 || m == 7) {
/*  87 */         b(☃, cj1.a(-3 + k, 0, -3 + m));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(adm ☃, cj cj1) {
/*  93 */     for (int i = -2; i <= 2; i++) {
/*  94 */       for (int j = -2; j <= 2; j++) {
/*  95 */         if (Math.abs(i) != 2 || Math.abs(j) != 2) {
/*  96 */           c(☃, cj1.a(i, 0, j));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(adm ☃, cj cj1) {
/* 103 */     for (int i = 2; i >= -3; i--) {
/* 104 */       cj cj2 = cj1.b(i);
/* 105 */       afh afh = ☃.p(cj2).c();
/* 106 */       if (afh == afi.c || afh == afi.d) {
/* 107 */         a(☃, cj2, g); break;
/*     */       } 
/* 109 */       if (afh.t() != arm.a && i < 0)
/*     */         break; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */