/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asy
/*     */ {
/*  10 */   private asu a = new asu();
/*     */   
/*  12 */   private asv[] b = new asv[32];
/*     */   
/*     */   private asw c;
/*     */   
/*     */   public asy(asw ☃) {
/*  17 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public asx a(adq ☃, pk pk1, pk pk2, float f) {
/*  22 */     return a(☃, pk1, pk2.s, (pk2.aR()).b, pk2.u, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public asx a(adq ☃, pk pk1, cj cj1, float f) {
/*  27 */     return a(☃, pk1, (cj1.n() + 0.5F), (cj1.o() + 0.5F), (cj1.p() + 0.5F), f);
/*     */   }
/*     */ 
/*     */   
/*     */   private asx a(adq ☃, pk pk1, double d1, double d2, double d3, float f) {
/*  32 */     this.a.a();
/*  33 */     this.c.a(☃, pk1);
/*  34 */     asv asv1 = this.c.a(pk1);
/*  35 */     asv asv2 = this.c.a(pk1, d1, d2, d3);
/*     */     
/*  37 */     asx asx = a(pk1, asv1, asv2, f);
/*     */     
/*  39 */     this.c.a();
/*  40 */     return asx;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private asx a(pk ☃, asv asv1, asv asv2, float f) {
/*  46 */     asv1.e = 0.0F;
/*  47 */     asv1.f = asv1.b(asv2);
/*  48 */     asv1.g = asv1.f;
/*     */     
/*  50 */     this.a.a();
/*  51 */     this.a.a(asv1);
/*     */     
/*  53 */     asv asv3 = asv1;
/*     */     
/*  55 */     while (!this.a.e()) {
/*  56 */       asv asv4 = this.a.c();
/*     */       
/*  58 */       if (asv4.equals(asv2)) {
/*  59 */         return a(asv1, asv2);
/*     */       }
/*     */       
/*  62 */       if (asv4.b(asv2) < asv3.b(asv2)) {
/*  63 */         asv3 = asv4;
/*     */       }
/*  65 */       asv4.i = true;
/*     */       
/*  67 */       int i = this.c.a(this.b, ☃, asv4, asv2, f);
/*  68 */       for (int j = 0; j < i; j++) {
/*  69 */         asv asv5 = this.b[j];
/*     */         
/*  71 */         float f1 = asv4.e + asv4.b(asv5);
/*  72 */         if (f1 < f * 2.0F && (!asv5.a() || f1 < asv5.e)) {
/*  73 */           asv5.h = asv4;
/*  74 */           asv5.e = f1;
/*  75 */           asv5.f = asv5.b(asv2);
/*  76 */           if (asv5.a()) {
/*  77 */             this.a.a(asv5, asv5.e + asv5.f);
/*     */           } else {
/*  79 */             asv5.g = asv5.e + asv5.f;
/*  80 */             this.a.a(asv5);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  86 */     if (asv3 == asv1) {
/*  87 */       return null;
/*     */     }
/*  89 */     return a(asv1, asv3);
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
/*     */   private asx a(asv ☃, asv asv1) {
/* 102 */     int i = 1;
/* 103 */     asv asv2 = asv1;
/* 104 */     while (asv2.h != null) {
/* 105 */       i++;
/* 106 */       asv2 = asv2.h;
/*     */     } 
/*     */     
/* 109 */     asv[] arrayOfAsv = new asv[i];
/* 110 */     asv2 = asv1;
/* 111 */     arrayOfAsv[--i] = asv2;
/* 112 */     while (asv2.h != null) {
/* 113 */       asv2 = asv2.h;
/* 114 */       arrayOfAsv[--i] = asv2;
/*     */     } 
/* 116 */     return new asx(arrayOfAsv);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/asy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */