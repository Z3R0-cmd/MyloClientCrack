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
/*     */ public abstract class r
/*     */   extends aqt
/*     */ {
/*  38 */   protected static final alz a = afi.cI.a(aiu.b);
/*  39 */   protected static final alz b = afi.cI.a(aiu.N);
/*  40 */   protected static final alz c = afi.cI.a(aiu.O);
/*     */   
/*  42 */   protected static final alz d = b;
/*     */   
/*  44 */   protected static final alz e = afi.cJ.Q();
/*     */ 
/*     */   
/*  47 */   protected static final alz f = afi.j.Q();
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
/*  58 */   protected static final int g = b(2, 0, 0);
/*  59 */   protected static final int h = b(2, 2, 0);
/*  60 */   protected static final int i = b(0, 1, 0);
/*  61 */   protected static final int j = b(4, 1, 0);
/*     */ 
/*     */ 
/*     */   
/*     */   protected aql.v k;
/*     */ 
/*     */ 
/*     */   
/*     */   protected static final int b(int ☃, int i, int j) {
/*  70 */     return i * 25 + j * 5 + ☃;
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
/*     */   public r() {
/*  88 */     super(0);
/*     */   }
/*     */   
/*     */   public r(int ☃) {
/*  92 */     super(☃);
/*     */   }
/*     */   
/*     */   public r(cq ☃, aqe aqe1) {
/*  96 */     super(1);
/*  97 */     this.m = ☃;
/*  98 */     this.l = aqe1;
/*     */   }
/*     */   
/*     */   protected r(int ☃, cq cq1, aql.v v1, int i, int j, int k) {
/* 102 */     super(☃);
/* 103 */     this.m = cq1;
/* 104 */     this.k = v1;
/*     */     
/* 106 */     int m = v1.a;
/* 107 */     int n = m % 5;
/* 108 */     int i1 = m / 5 % 5;
/* 109 */     int i2 = m / 25;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     if (cq1 == cq.c || cq1 == cq.d) {
/* 115 */       this.l = new aqe(0, 0, 0, i * 8 - 1, j * 4 - 1, k * 8 - 1);
/*     */     } else {
/*     */       
/* 118 */       this.l = new aqe(0, 0, 0, k * 8 - 1, j * 4 - 1, i * 8 - 1);
/*     */     } 
/*     */     
/* 121 */     switch (aql.null.a[cq1.ordinal()]) {
/*     */       case 1:
/* 123 */         this.l.a(n * 8, i2 * 4, -(i1 + k) * 8 + 1);
/*     */         return;
/*     */       
/*     */       case 2:
/* 127 */         this.l.a(n * 8, i2 * 4, i1 * 8);
/*     */         return;
/*     */       case 3:
/* 130 */         this.l.a(-(i1 + k) * 8 + 1, i2 * 4, n * 8);
/*     */         return;
/*     */     } 
/* 133 */     this.l.a(i1 * 8, i2 * 4, n * 8);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(dn ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, boolean bool) {
/* 147 */     for (int i2 = j; i2 <= n; i2++) {
/* 148 */       for (int i3 = i; i3 <= m; i3++) {
/* 149 */         for (int i4 = k; i4 <= i1; i4++) {
/* 150 */           if (!bool || a(☃, i3, i2, i4, aqe1).c().t() != arm.a)
/*     */           {
/*     */             
/* 153 */             if (d(i2) >= ☃.F()) {
/* 154 */               a(☃, afi.a.Q(), i3, i2, i4, aqe1);
/*     */             } else {
/* 156 */               a(☃, f, i3, i2, i4, aqe1);
/*     */             }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, boolean bool) {
/* 164 */     if (bool) {
/* 165 */       a(☃, aqe1, i + 0, 0, j + 0, i + 2, 0, j + 8 - 1, a, a, false);
/* 166 */       a(☃, aqe1, i + 5, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/* 167 */       a(☃, aqe1, i + 3, 0, j + 0, i + 4, 0, j + 2, a, a, false);
/* 168 */       a(☃, aqe1, i + 3, 0, j + 5, i + 4, 0, j + 8 - 1, a, a, false);
/*     */       
/* 170 */       a(☃, aqe1, i + 3, 0, j + 2, i + 4, 0, j + 2, b, b, false);
/* 171 */       a(☃, aqe1, i + 3, 0, j + 5, i + 4, 0, j + 5, b, b, false);
/* 172 */       a(☃, aqe1, i + 2, 0, j + 3, i + 2, 0, j + 4, b, b, false);
/* 173 */       a(☃, aqe1, i + 5, 0, j + 3, i + 5, 0, j + 4, b, b, false);
/*     */     } else {
/* 175 */       a(☃, aqe1, i + 0, 0, j + 0, i + 8 - 1, 0, j + 8 - 1, a, a, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, aqe aqe1, int i, int j, int k, int m, int n, int i1, alz alz1) {
/* 180 */     for (int i2 = j; i2 <= n; i2++) {
/* 181 */       for (int i3 = i; i3 <= m; i3++) {
/* 182 */         for (int i4 = k; i4 <= i1; i4++) {
/* 183 */           if (a(☃, i3, i2, i4, aqe1) == f)
/*     */           {
/*     */             
/* 186 */             a(☃, alz1, i3, i2, i4, aqe1); } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(aqe ☃, int i, int j, int k, int m) {
/* 193 */     int n = a(i, j);
/* 194 */     int i1 = b(i, j);
/* 195 */     int i2 = a(k, m);
/* 196 */     int i3 = b(k, m);
/* 197 */     return ☃.a(Math.min(n, i2), Math.min(i1, i3), Math.max(n, i2), Math.max(i1, i3));
/*     */   }
/*     */   
/*     */   protected boolean a(adm ☃, aqe aqe1, int i, int j, int k) {
/* 201 */     int m = a(i, k);
/* 202 */     int n = d(j);
/* 203 */     int i1 = b(i, k);
/*     */     
/* 205 */     if (aqe1.b(new cj(m, n, i1))) {
/* 206 */       vt vt = new vt(☃);
/* 207 */       vt.a(true);
/* 208 */       vt.h(vt.bu());
/* 209 */       vt.b(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/* 210 */       vt.a(☃.E(new cj(vt)), (pu)null);
/* 211 */       ☃.d(vt);
/* 212 */       return true;
/*     */     } 
/* 214 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aql$r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */