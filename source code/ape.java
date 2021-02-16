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
/*     */ public class ape
/*     */   extends apg
/*     */ {
/*     */   public ape(boolean ☃, int i, int j, alz alz1, alz alz2) {
/*  15 */     super(☃, i, j, alz1, alz2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, Random random, cj cj1) {
/*  20 */     int i = a(random);
/*  21 */     if (!a(☃, random, cj1, i)) {
/*  22 */       return false;
/*     */     }
/*     */     
/*  25 */     c(☃, cj1.b(i), 2);
/*     */     
/*  27 */     int j = cj1.o() + i - 2 - random.nextInt(4);
/*     */ 
/*     */     
/*  30 */     while (j > cj1.o() + i / 2) {
/*  31 */       float f = random.nextFloat() * 3.1415927F * 2.0F;
/*  32 */       int m = cj1.n() + (int)(0.5F + ns.b(f) * 4.0F);
/*  33 */       int n = cj1.p() + (int)(0.5F + ns.a(f) * 4.0F);
/*     */       int i1;
/*  35 */       for (i1 = 0; i1 < 5; i1++) {
/*  36 */         m = cj1.n() + (int)(1.5F + ns.b(f) * i1);
/*  37 */         n = cj1.p() + (int)(1.5F + ns.a(f) * i1);
/*  38 */         a(☃, new cj(m, j - 3 + i1 / 2, n), this.b);
/*     */       } 
/*  40 */       i1 = 1 + random.nextInt(2);
/*  41 */       int i2 = j;
/*  42 */       for (int i3 = i2 - i1; i3 <= i2; i3++) {
/*  43 */         int i4 = i3 - i2;
/*  44 */         b(☃, new cj(m, i3, n), 1 - i4);
/*     */       } 
/*     */       
/*  47 */       j -= 2 + random.nextInt(4);
/*     */     } 
/*     */     
/*  50 */     for (int k = 0; k < i; k++) {
/*  51 */       cj cj2 = cj1.b(k);
/*  52 */       if (a(☃.p(cj2).c())) {
/*  53 */         a(☃, cj2, this.b);
/*  54 */         if (k > 0) {
/*  55 */           a(☃, random, cj2.e(), akk.N);
/*  56 */           a(☃, random, cj2.c(), akk.O);
/*     */         } 
/*     */       } 
/*     */       
/*  60 */       if (k < i - 1) {
/*  61 */         cj cj3 = cj2.f();
/*  62 */         if (a(☃.p(cj3).c())) {
/*  63 */           a(☃, cj3, this.b);
/*  64 */           if (k > 0) {
/*  65 */             a(☃, random, cj3.f(), akk.P);
/*  66 */             a(☃, random, cj3.c(), akk.O);
/*     */           } 
/*     */         } 
/*     */         
/*  70 */         cj cj4 = cj2.d().f();
/*  71 */         if (a(☃.p(cj4).c())) {
/*  72 */           a(☃, cj4, this.b);
/*  73 */           if (k > 0) {
/*  74 */             a(☃, random, cj4.f(), akk.P);
/*  75 */             a(☃, random, cj4.d(), akk.b);
/*     */           } 
/*     */         } 
/*     */         
/*  79 */         cj cj5 = cj2.d();
/*  80 */         if (a(☃.p(cj5).c())) {
/*  81 */           a(☃, cj5, this.b);
/*  82 */           if (k > 0) {
/*  83 */             a(☃, random, cj5.e(), akk.N);
/*  84 */             a(☃, random, cj5.d(), akk.b);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  90 */     return true;
/*     */   }
/*     */   
/*     */   private void a(adm ☃, Random random, cj cj1, amk amk1) {
/*  94 */     if (random.nextInt(3) > 0 && ☃.d(cj1)) {
/*  95 */       a(☃, cj1, afi.bn.Q().a(amk1, Boolean.valueOf(true)));
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(adm ☃, cj cj1, int i) {
/* 100 */     int j = 2;
/* 101 */     for (int k = -j; k <= 0; k++)
/* 102 */       a(☃, cj1.b(k), i + 1 - k); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */