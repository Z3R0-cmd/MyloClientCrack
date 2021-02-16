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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */   implements abs
/*     */ {
/*     */   private b() {}
/*     */   
/*     */   public boolean a(xp ☃, adm adm1) {
/*  43 */     zx zx1 = null;
/*  44 */     zx zx2 = null;
/*  45 */     for (int i = 0; i < ☃.o_(); i++) {
/*  46 */       zx zx = ☃.a(i);
/*  47 */       if (zx != null) {
/*     */ 
/*     */ 
/*     */         
/*  51 */         if (zx.b() != zy.cE) {
/*  52 */           return false;
/*     */         }
/*     */         
/*  55 */         if (zx1 != null && zx2 != null)
/*     */         {
/*  57 */           return false;
/*     */         }
/*  59 */         int j = aku.b(zx);
/*  60 */         boolean bool = (aku.c(zx) > 0);
/*     */         
/*  62 */         if (zx1 != null) {
/*  63 */           if (bool)
/*     */           {
/*  65 */             return false;
/*     */           }
/*  67 */           if (j != aku.b(zx1))
/*     */           {
/*  69 */             return false;
/*     */           }
/*  71 */           zx2 = zx;
/*  72 */         } else if (zx2 != null) {
/*  73 */           if (!bool)
/*     */           {
/*  75 */             return false;
/*     */           }
/*  77 */           if (j != aku.b(zx2))
/*     */           {
/*  79 */             return false;
/*     */           }
/*  81 */           zx1 = zx;
/*  82 */         } else if (bool) {
/*  83 */           zx1 = zx;
/*     */         } else {
/*  85 */           zx2 = zx;
/*     */         } 
/*     */       } 
/*     */     } 
/*  89 */     return (zx1 != null && zx2 != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(xp ☃) {
/*  96 */     for (int i = 0; i < ☃.o_(); i++) {
/*  97 */       zx zx = ☃.a(i);
/*  98 */       if (zx != null)
/*     */       {
/*     */         
/* 101 */         if (aku.c(zx) > 0) {
/* 102 */           zx zx1 = zx.k();
/* 103 */           zx1.b = 1;
/* 104 */           return zx1;
/*     */         } 
/*     */       }
/*     */     } 
/* 108 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/* 113 */     return 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b() {
/* 120 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx[] b(xp ☃) {
/* 125 */     zx[] arrayOfZx = new zx[☃.o_()];
/*     */     
/* 127 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 128 */       zx zx = ☃.a(i);
/* 129 */       if (zx != null) {
/* 130 */         if (zx.b().r()) {
/* 131 */           arrayOfZx[i] = new zx(zx.b().q());
/* 132 */         } else if (zx.n() && 
/* 133 */           aku.c(zx) > 0) {
/* 134 */           arrayOfZx[i] = zx.k();
/* 135 */           (arrayOfZx[i]).b = 1;
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 141 */     return arrayOfZx;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abj$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */