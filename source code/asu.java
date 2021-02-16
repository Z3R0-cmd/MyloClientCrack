/*     */ 
/*     */ public class asu
/*     */ {
/*   4 */   private asv[] a = new asv[1024];
/*     */   
/*     */   private int b;
/*     */   
/*     */   public asv a(asv ☃) {
/*   9 */     if (☃.d >= 0) {
/*  10 */       throw new IllegalStateException("OW KNOWS!");
/*     */     }
/*     */     
/*  13 */     if (this.b == this.a.length) {
/*  14 */       asv[] arrayOfAsv = new asv[this.b << 1];
/*  15 */       System.arraycopy(this.a, 0, arrayOfAsv, 0, this.b);
/*  16 */       this.a = arrayOfAsv;
/*     */     } 
/*     */ 
/*     */     
/*  20 */     this.a[this.b] = ☃;
/*  21 */     ☃.d = this.b;
/*  22 */     a(this.b++);
/*     */     
/*  24 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  28 */     this.b = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public asv c() {
/*  36 */     asv ☃ = this.a[0];
/*  37 */     this.a[0] = this.a[--this.b];
/*  38 */     this.a[this.b] = null;
/*  39 */     if (this.b > 0) {
/*  40 */       b(0);
/*     */     }
/*  42 */     ☃.d = -1;
/*  43 */     return ☃;
/*     */   }
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
/*     */   public void a(asv ☃, float f) {
/*  62 */     float f1 = ☃.g;
/*  63 */     ☃.g = f;
/*  64 */     if (f < f1) {
/*  65 */       a(☃.d);
/*     */     } else {
/*  67 */       b(☃.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int ☃) {
/*  76 */     asv asv1 = this.a[☃];
/*  77 */     float f = asv1.g;
/*  78 */     while (☃ > 0) {
/*  79 */       int i = ☃ - 1 >> 1;
/*  80 */       asv asv2 = this.a[i];
/*  81 */       if (f < asv2.g) {
/*  82 */         this.a[☃] = asv2;
/*  83 */         asv2.d = ☃;
/*  84 */         ☃ = i;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  89 */     this.a[☃] = asv1;
/*  90 */     asv1.d = ☃;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/*  94 */     asv asv1 = this.a[☃];
/*  95 */     float f = asv1.g; while (true) {
/*     */       asv asv3;
/*     */       float f2;
/*  98 */       int i = 1 + (☃ << 1);
/*  99 */       int j = i + 1;
/*     */       
/* 101 */       if (i >= this.b) {
/*     */         break;
/*     */       }
/*     */ 
/*     */       
/* 106 */       asv asv2 = this.a[i];
/* 107 */       float f1 = asv2.g;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 112 */       if (j >= this.b) {
/*     */         
/* 114 */         asv3 = null;
/* 115 */         f2 = Float.POSITIVE_INFINITY;
/*     */       } else {
/* 117 */         asv3 = this.a[j];
/* 118 */         f2 = asv3.g;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 123 */       if (f1 < f2) {
/* 124 */         if (f1 < f) {
/* 125 */           this.a[☃] = asv2;
/* 126 */           asv2.d = ☃;
/* 127 */           ☃ = i;
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       } 
/* 132 */       if (f2 < f) {
/* 133 */         this.a[☃] = asv3;
/* 134 */         asv3.d = ☃;
/* 135 */         ☃ = j;
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/*     */       break;
/*     */     } 
/* 142 */     this.a[☃] = asv1;
/* 143 */     asv1.d = ☃;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 147 */     return (this.b == 0);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */