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
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ahs
/*     */   extends akg
/*     */ {
/*  22 */   public static final amk a = amk.a("decayable");
/*  23 */   public static final amk b = amk.a("check_decay");
/*     */ 
/*     */   
/*     */   int[] N;
/*     */   
/*     */   protected int O;
/*     */   
/*     */   protected boolean P;
/*     */ 
/*     */   
/*     */   public ahs() {
/*  34 */     super(arm.j, false);
/*  35 */     a(true);
/*  36 */     a(yz.c);
/*  37 */     c(0.2F);
/*  38 */     e(1);
/*  39 */     a(h);
/*     */   }
/*     */ 
/*     */   
/*     */   public int H() {
/*  44 */     return adj.a(0.5D, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int h(alz ☃) {
/*  49 */     return adj.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  54 */     return aea.b(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/*  59 */     int i = 1;
/*  60 */     int j = i + 1;
/*  61 */     int k = cj1.n();
/*  62 */     int m = cj1.o();
/*  63 */     int n = cj1.p();
/*     */     
/*  65 */     if (☃.a(new cj(k - j, m - j, n - j), new cj(k + j, m + j, n + j))) {
/*  66 */       for (int i1 = -i; i1 <= i; i1++) {
/*  67 */         for (int i2 = -i; i2 <= i; i2++) {
/*  68 */           for (int i3 = -i; i3 <= i; i3++) {
/*  69 */             cj cj2 = cj1.a(i1, i2, i3);
/*  70 */             alz alz2 = ☃.p(cj2);
/*  71 */             if (alz2.c().t() == arm.j && 
/*  72 */               !((Boolean)alz2.<Boolean>b(b)).booleanValue()) {
/*  73 */               ☃.a(cj2, alz2.a(b, Boolean.valueOf(true)), 4);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  84 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  89 */     if (((Boolean)alz1.<Boolean>b(b)).booleanValue() && ((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/*  90 */       int i = 4;
/*  91 */       int j = i + 1;
/*  92 */       int k = cj1.n();
/*  93 */       int m = cj1.o();
/*  94 */       int n = cj1.p();
/*     */       
/*  96 */       int i1 = 32;
/*  97 */       int i2 = i1 * i1;
/*  98 */       int i3 = i1 / 2;
/*  99 */       if (this.N == null) {
/* 100 */         this.N = new int[i1 * i1 * i1];
/*     */       }
/*     */       
/* 103 */       if (☃.a(new cj(k - j, m - j, n - j), new cj(k + j, m + j, n + j))) {
/* 104 */         cj.a a = new cj.a(); int i5;
/* 105 */         for (i5 = -i; i5 <= i; i5++) {
/* 106 */           for (int i6 = -i; i6 <= i; i6++) {
/* 107 */             for (int i7 = -i; i7 <= i; i7++) {
/* 108 */               afh afh = ☃.p(a.c(k + i5, m + i6, n + i7)).c();
/* 109 */               if (afh == afi.r || afh == afi.s) {
/* 110 */                 this.N[(i5 + i3) * i2 + (i6 + i3) * i1 + i7 + i3] = 0;
/* 111 */               } else if (afh.t() == arm.j) {
/* 112 */                 this.N[(i5 + i3) * i2 + (i6 + i3) * i1 + i7 + i3] = -2;
/*     */               } else {
/* 114 */                 this.N[(i5 + i3) * i2 + (i6 + i3) * i1 + i7 + i3] = -1;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/* 119 */         for (i5 = 1; i5 <= 4; i5++) {
/* 120 */           for (int i6 = -i; i6 <= i; i6++) {
/* 121 */             for (int i7 = -i; i7 <= i; i7++) {
/* 122 */               for (int i8 = -i; i8 <= i; i8++) {
/* 123 */                 if (this.N[(i6 + i3) * i2 + (i7 + i3) * i1 + i8 + i3] == i5 - 1) {
/* 124 */                   if (this.N[(i6 + i3 - 1) * i2 + (i7 + i3) * i1 + i8 + i3] == -2) {
/* 125 */                     this.N[(i6 + i3 - 1) * i2 + (i7 + i3) * i1 + i8 + i3] = i5;
/*     */                   }
/* 127 */                   if (this.N[(i6 + i3 + 1) * i2 + (i7 + i3) * i1 + i8 + i3] == -2) {
/* 128 */                     this.N[(i6 + i3 + 1) * i2 + (i7 + i3) * i1 + i8 + i3] = i5;
/*     */                   }
/* 130 */                   if (this.N[(i6 + i3) * i2 + (i7 + i3 - 1) * i1 + i8 + i3] == -2) {
/* 131 */                     this.N[(i6 + i3) * i2 + (i7 + i3 - 1) * i1 + i8 + i3] = i5;
/*     */                   }
/* 133 */                   if (this.N[(i6 + i3) * i2 + (i7 + i3 + 1) * i1 + i8 + i3] == -2) {
/* 134 */                     this.N[(i6 + i3) * i2 + (i7 + i3 + 1) * i1 + i8 + i3] = i5;
/*     */                   }
/* 136 */                   if (this.N[(i6 + i3) * i2 + (i7 + i3) * i1 + i8 + i3 - 1] == -2) {
/* 137 */                     this.N[(i6 + i3) * i2 + (i7 + i3) * i1 + i8 + i3 - 1] = i5;
/*     */                   }
/* 139 */                   if (this.N[(i6 + i3) * i2 + (i7 + i3) * i1 + i8 + i3 + 1] == -2) {
/* 140 */                     this.N[(i6 + i3) * i2 + (i7 + i3) * i1 + i8 + i3 + 1] = i5;
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 149 */       int i4 = this.N[i3 * i2 + i3 * i1 + i3];
/* 150 */       if (i4 >= 0) {
/* 151 */         ☃.a(cj1, alz1.a(b, Boolean.valueOf(false)), 4);
/*     */       } else {
/* 153 */         e(☃, cj1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1, Random random) {
/* 160 */     if (☃.C(cj1.a()) && !adm.a(☃, cj1.b()) && random.nextInt(15) == 1) {
/* 161 */       double d1 = (cj1.n() + random.nextFloat());
/* 162 */       double d2 = cj1.o() - 0.05D;
/* 163 */       double d3 = (cj1.p() + random.nextFloat());
/*     */       
/* 165 */       ☃.a(cy.s, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1) {
/* 170 */     b(☃, cj1, ☃.p(cj1), 0);
/* 171 */     ☃.g(cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 176 */     return (☃.nextInt(20) == 0) ? 1 : 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 182 */     return zw.a(afi.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 187 */     if (!☃.D) {
/* 188 */       int j = d(alz1);
/* 189 */       if (i > 0) {
/* 190 */         j -= 2 << i;
/* 191 */         if (j < 10) {
/* 192 */           j = 10;
/*     */         }
/*     */       } 
/* 195 */       if (☃.s.nextInt(j) == 0) {
/* 196 */         zw zw = a(alz1, ☃.s, i);
/* 197 */         a(☃, cj1, new zx(zw, 1, a(alz1)));
/*     */       } 
/*     */       
/* 200 */       j = 200;
/* 201 */       if (i > 0) {
/* 202 */         j -= 10 << i;
/* 203 */         if (j < 40) {
/* 204 */           j = 40;
/*     */         }
/*     */       } 
/* 207 */       a(☃, cj1, alz1, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, cj cj1, alz alz1, int i) {}
/*     */ 
/*     */   
/*     */   protected int d(alz ☃) {
/* 216 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 221 */     return !this.R;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 225 */     this.P = ☃;
/* 226 */     this.R = ☃;
/* 227 */     this.O = ☃ ? 0 : 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public adf m() {
/* 235 */     return this.P ? adf.b : adf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w() {
/* 240 */     return false;
/*     */   }
/*     */   
/*     */   public abstract aio.a b(int paramInt);
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */