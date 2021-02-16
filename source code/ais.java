/*     */ import com.google.common.base.Predicate;
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
/*     */ public class ais
/*     */   extends afe
/*     */ {
/*  15 */   public static final amm<afe.b> b = amm.a("shape", afe.b.class, new Predicate<afe.b>()
/*     */       {
/*     */         public boolean a(afe.b ☃) {
/*  18 */           return (☃ != afe.b.j && ☃ != afe.b.i && ☃ != afe.b.g && ☃ != afe.b.h);
/*     */         }
/*     */       });
/*     */ 
/*     */ 
/*     */   
/*  24 */   public static final amk N = amk.a("powered");
/*     */   
/*     */   protected ais() {
/*  27 */     super(true);
/*  28 */     j(this.M.b().<afe.b, afe.b>a(b, afe.b.a).a(N, Boolean.valueOf(false)));
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, cj cj1, alz alz1, boolean bool, int i) {
/*  32 */     if (i >= 8) {
/*  33 */       return false;
/*     */     }
/*     */     
/*  36 */     int j = cj1.n();
/*  37 */     int k = cj1.o();
/*  38 */     int m = cj1.p();
/*     */     
/*  40 */     boolean bool1 = true;
/*  41 */     afe.b b = alz1.<afe.b>b(b);
/*  42 */     switch (null.a[b.ordinal()]) {
/*     */       case 1:
/*  44 */         if (bool) {
/*  45 */           m++; break;
/*     */         } 
/*  47 */         m--;
/*     */         break;
/*     */       
/*     */       case 2:
/*  51 */         if (bool) {
/*  52 */           j--; break;
/*     */         } 
/*  54 */         j++;
/*     */         break;
/*     */       
/*     */       case 3:
/*  58 */         if (bool) {
/*  59 */           j--;
/*     */         } else {
/*  61 */           j++;
/*  62 */           k++;
/*  63 */           bool1 = false;
/*     */         } 
/*  65 */         b = afe.b.b;
/*     */         break;
/*     */       case 4:
/*  68 */         if (bool) {
/*  69 */           j--;
/*  70 */           k++;
/*  71 */           bool1 = false;
/*     */         } else {
/*  73 */           j++;
/*     */         } 
/*  75 */         b = afe.b.b;
/*     */         break;
/*     */       case 5:
/*  78 */         if (bool) {
/*  79 */           m++;
/*     */         } else {
/*  81 */           m--;
/*  82 */           k++;
/*  83 */           bool1 = false;
/*     */         } 
/*  85 */         b = afe.b.a;
/*     */         break;
/*     */       case 6:
/*  88 */         if (bool) {
/*  89 */           m++;
/*  90 */           k++;
/*  91 */           bool1 = false;
/*     */         } else {
/*  93 */           m--;
/*     */         } 
/*  95 */         b = afe.b.a;
/*     */         break;
/*     */     } 
/*     */     
/*  99 */     if (a(☃, new cj(j, k, m), bool, i, b)) {
/* 100 */       return true;
/*     */     }
/* 102 */     if (bool1 && a(☃, new cj(j, k - 1, m), bool, i, b)) {
/* 103 */       return true;
/*     */     }
/* 105 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, cj cj1, boolean bool, int i, afe.b b1) {
/* 109 */     alz alz = ☃.p(cj1);
/*     */     
/* 111 */     if (alz.c() != this) {
/* 112 */       return false;
/*     */     }
/*     */     
/* 115 */     afe.b b2 = alz.<afe.b>b(b);
/* 116 */     if (b1 == afe.b.b && (b2 == afe.b.a || b2 == afe.b.e || b2 == afe.b.f)) {
/* 117 */       return false;
/*     */     }
/* 119 */     if (b1 == afe.b.a && (b2 == afe.b.b || b2 == afe.b.c || b2 == afe.b.d)) {
/* 120 */       return false;
/*     */     }
/*     */     
/* 123 */     if (((Boolean)alz.<Boolean>b(N)).booleanValue()) {
/* 124 */       if (☃.z(cj1)) {
/* 125 */         return true;
/*     */       }
/* 127 */       return a(☃, cj1, alz, bool, i + 1);
/*     */     } 
/*     */     
/* 130 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 135 */     boolean bool1 = ((Boolean)alz1.<Boolean>b(N)).booleanValue();
/* 136 */     boolean bool2 = (☃.z(cj1) || a(☃, cj1, alz1, true, 0) || a(☃, cj1, alz1, false, 0));
/*     */     
/* 138 */     if (bool2 != bool1) {
/* 139 */       ☃.a(cj1, alz1.a(N, Boolean.valueOf(bool2)), 3);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       ☃.c(cj1.b(), this);
/* 145 */       if (((afe.b)alz1.<afe.b>b(b)).c()) {
/* 146 */         ☃.c(cj1.a(), this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public amo<afe.b> n() {
/* 153 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 158 */     return Q().<afe.b, afe.b>a(b, afe.b.a(☃ & 0x7)).a(N, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 165 */     int i = 0;
/*     */     
/* 167 */     i |= ((afe.b)☃.<afe.b>b(b)).a();
/*     */     
/* 169 */     if (((Boolean)☃.<Boolean>b(N)).booleanValue()) {
/* 170 */       i |= 0x8;
/*     */     }
/*     */     
/* 173 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 178 */     return new ama(this, new amo[] { b, N });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ais.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */