/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abv
/*     */   implements abs
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final zx[] c;
/*     */   private final zx d;
/*     */   private boolean e;
/*     */   
/*     */   public abv(int ☃, int i, zx[] arrayOfZx, zx zx1) {
/*  18 */     this.a = ☃;
/*  19 */     this.b = i;
/*  20 */     this.c = arrayOfZx;
/*  21 */     this.d = zx1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b() {
/*  27 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx[] b(xp ☃) {
/*  32 */     zx[] arrayOfZx = new zx[☃.o_()];
/*     */     
/*  34 */     for (int i = 0; i < arrayOfZx.length; i++) {
/*  35 */       zx zx1 = ☃.a(i);
/*  36 */       if (zx1 != null && zx1.b().r()) {
/*  37 */         arrayOfZx[i] = new zx(zx1.b().q());
/*     */       }
/*     */     } 
/*     */     
/*  41 */     return arrayOfZx;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(xp ☃, adm adm1) {
/*  46 */     for (int i = 0; i <= 3 - this.a; i++) {
/*  47 */       for (int j = 0; j <= 3 - this.b; j++) {
/*  48 */         if (a(☃, i, j, true)) {
/*  49 */           return true;
/*     */         }
/*  51 */         if (a(☃, i, j, false)) {
/*  52 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*  56 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(xp ☃, int i, int j, boolean bool) {
/*  60 */     for (int k = 0; k < 3; k++) {
/*  61 */       for (int m = 0; m < 3; m++) {
/*  62 */         int n = k - i;
/*  63 */         int i1 = m - j;
/*  64 */         zx zx1 = null;
/*  65 */         if (n >= 0 && i1 >= 0 && n < this.a && i1 < this.b) {
/*  66 */           if (bool) {
/*  67 */             zx1 = this.c[this.a - n - 1 + i1 * this.a];
/*     */           } else {
/*  69 */             zx1 = this.c[n + i1 * this.a];
/*     */           } 
/*     */         }
/*  72 */         zx zx2 = ☃.c(k, m);
/*  73 */         if (zx2 != null || zx1 != null) {
/*     */ 
/*     */           
/*  76 */           if ((zx2 == null && zx1 != null) || (zx2 != null && zx1 == null)) {
/*  77 */             return false;
/*     */           }
/*  79 */           if (zx1.b() != zx2.b()) {
/*  80 */             return false;
/*     */           }
/*  82 */           if (zx1.i() != 32767 && zx1.i() != zx2.i())
/*  83 */             return false; 
/*     */         } 
/*     */       } 
/*     */     } 
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(xp ☃) {
/*  93 */     zx zx1 = b().k();
/*     */     
/*  95 */     if (this.e) {
/*  96 */       for (int i = 0; i < ☃.o_(); i++) {
/*  97 */         zx zx2 = ☃.a(i);
/*     */         
/*  99 */         if (zx2 != null && zx2.n()) {
/* 100 */           zx1.d((dn)zx2.o().b());
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 105 */     return zx1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/* 110 */     return this.a * this.b;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */