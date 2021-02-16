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
/*     */ public class amz
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private char[] d;
/*     */   private amw e;
/*     */   private amw f;
/*     */   
/*     */   public amz(int ☃, boolean bool) {
/*  21 */     this.a = ☃;
/*  22 */     this.d = new char[4096];
/*  23 */     this.e = new amw();
/*  24 */     if (bool) {
/*  25 */       this.f = new amw();
/*     */     }
/*     */   }
/*     */   
/*     */   public alz a(int ☃, int i, int j) {
/*  30 */     alz alz = afh.d.a(this.d[i << 8 | j << 4 | ☃]);
/*  31 */     if (alz != null) {
/*  32 */       return alz;
/*     */     }
/*  34 */     return afi.a.Q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, alz alz1) {
/*  39 */     alz alz2 = a(☃, i, j);
/*  40 */     afh afh1 = alz2.c();
/*  41 */     afh afh2 = alz1.c();
/*     */     
/*  43 */     if (afh1 != afi.a) {
/*  44 */       this.b--;
/*  45 */       if (afh1.y()) {
/*  46 */         this.c--;
/*     */       }
/*     */     } 
/*     */     
/*  50 */     if (afh2 != afi.a) {
/*  51 */       this.b++;
/*  52 */       if (afh2.y()) {
/*  53 */         this.c++;
/*     */       }
/*     */     } 
/*     */     
/*  57 */     this.d[i << 8 | j << 4 | ☃] = (char)afh.d.b((T)alz1);
/*     */   }
/*     */   
/*     */   public afh b(int ☃, int i, int j) {
/*  61 */     return a(☃, i, j).c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(int ☃, int i, int j) {
/*  69 */     alz alz = a(☃, i, j);
/*  70 */     return alz.c().c(alz);
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  74 */     return (this.b == 0);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  78 */     return (this.c > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int d() {
/*  86 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k) {
/*  90 */     this.f.a(☃, i, j, k);
/*     */   }
/*     */   
/*     */   public int d(int ☃, int i, int j) {
/*  94 */     return this.f.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public void b(int ☃, int i, int j, int k) {
/*  98 */     this.e.a(☃, i, j, k);
/*     */   }
/*     */   
/*     */   public int e(int ☃, int i, int j) {
/* 102 */     return this.e.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public void e() {
/* 106 */     this.b = 0;
/* 107 */     this.c = 0;
/*     */     
/* 109 */     for (int ☃ = 0; ☃ < 16; ☃++) {
/* 110 */       for (int i = 0; i < 16; i++) {
/* 111 */         for (int j = 0; j < 16; j++) {
/* 112 */           afh afh = b(☃, i, j);
/*     */           
/* 114 */           if (afh != afi.a) {
/* 115 */             this.b++;
/* 116 */             if (afh.y()) {
/* 117 */               this.c++;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public char[] g() {
/* 130 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(char[] ☃) {
/* 134 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public amw h() {
/* 138 */     return this.e;
/*     */   }
/*     */   
/*     */   public amw i() {
/* 142 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(amw ☃) {
/* 146 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void b(amw ☃) {
/* 150 */     this.f = ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */