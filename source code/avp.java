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
/*     */ public class avp
/*     */ {
/*  13 */   public static final jy b = new jy("textures/gui/options_background.png");
/*  14 */   public static final jy c = new jy("textures/gui/container/stats_icons.png");
/*  15 */   public static final jy d = new jy("textures/gui/icons.png");
/*     */   protected float e;
/*     */   
/*     */   protected void a(int ☃, int i, int j, int k) {
/*  19 */     if (i < ☃) {
/*  20 */       int m = ☃;
/*  21 */       ☃ = i;
/*  22 */       i = m;
/*     */     } 
/*  24 */     a(☃, j, i + 1, j + 1, k);
/*     */   }
/*     */   
/*     */   protected void b(int ☃, int i, int j, int k) {
/*  28 */     if (j < i) {
/*  29 */       int m = i;
/*  30 */       i = j;
/*  31 */       j = m;
/*     */     } 
/*  33 */     a(☃, i + 1, ☃ + 1, j, k);
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i, int j, int k, int m) {
/*  37 */     if (☃ < j) {
/*  38 */       int n = ☃;
/*  39 */       ☃ = j;
/*  40 */       j = n;
/*     */     } 
/*  42 */     if (i < k) {
/*  43 */       int n = i;
/*  44 */       i = k;
/*  45 */       k = n;
/*     */     } 
/*  47 */     float f1 = (m >> 24 & 0xFF) / 255.0F;
/*  48 */     float f2 = (m >> 16 & 0xFF) / 255.0F;
/*  49 */     float f3 = (m >> 8 & 0xFF) / 255.0F;
/*  50 */     float f4 = (m & 0xFF) / 255.0F;
/*  51 */     bfx bfx = bfx.a();
/*  52 */     bfd bfd = bfx.c();
/*  53 */     bfl.l();
/*  54 */     bfl.x();
/*  55 */     bfl.a(770, 771, 1, 0);
/*  56 */     bfl.c(f2, f3, f4, f1);
/*  57 */     bfd.a(7, bms.e);
/*  58 */     bfd.b(☃, k, 0.0D).d();
/*  59 */     bfd.b(j, k, 0.0D).d();
/*  60 */     bfd.b(j, i, 0.0D).d();
/*  61 */     bfd.b(☃, i, 0.0D).d();
/*  62 */     bfx.b();
/*  63 */     bfl.w();
/*  64 */     bfl.k();
/*     */   }
/*     */   
/*     */   protected void a(int ☃, int i, int j, int k, int m, int n) {
/*  68 */     float f1 = (m >> 24 & 0xFF) / 255.0F;
/*  69 */     float f2 = (m >> 16 & 0xFF) / 255.0F;
/*  70 */     float f3 = (m >> 8 & 0xFF) / 255.0F;
/*  71 */     float f4 = (m & 0xFF) / 255.0F;
/*     */     
/*  73 */     float f5 = (n >> 24 & 0xFF) / 255.0F;
/*  74 */     float f6 = (n >> 16 & 0xFF) / 255.0F;
/*  75 */     float f7 = (n >> 8 & 0xFF) / 255.0F;
/*  76 */     float f8 = (n & 0xFF) / 255.0F;
/*  77 */     bfl.x();
/*  78 */     bfl.l();
/*  79 */     bfl.c();
/*  80 */     bfl.a(770, 771, 1, 0);
/*  81 */     bfl.j(7425);
/*     */     
/*  83 */     bfx bfx = bfx.a();
/*  84 */     bfd bfd = bfx.c();
/*  85 */     bfd.a(7, bms.f);
/*  86 */     bfd.b(j, i, this.e).a(f2, f3, f4, f1).d();
/*  87 */     bfd.b(☃, i, this.e).a(f2, f3, f4, f1).d();
/*  88 */     bfd.b(☃, k, this.e).a(f6, f7, f8, f5).d();
/*  89 */     bfd.b(j, k, this.e).a(f6, f7, f8, f5).d();
/*  90 */     bfx.b();
/*     */     
/*  92 */     bfl.j(7424);
/*  93 */     bfl.k();
/*  94 */     bfl.d();
/*  95 */     bfl.w();
/*     */   }
/*     */   
/*     */   public void a(avn ☃, String str, int i, int j, int k) {
/*  99 */     ☃.a(str, (i - ☃.a(str) / 2), j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(avn ☃, String str, int i, int j, int k) {
/* 107 */     ☃.a(str, i, j, k);
/*     */   }
/*     */   
/*     */   public void b(int ☃, int i, int j, int k, int m, int n) {
/* 111 */     float f1 = 0.00390625F;
/* 112 */     float f2 = 0.00390625F;
/* 113 */     bfx bfx = bfx.a();
/* 114 */     bfd bfd = bfx.c();
/* 115 */     bfd.a(7, bms.g);
/* 116 */     bfd.b((☃ + 0), (i + n), this.e).a(((j + 0) * f1), ((k + n) * f2)).d();
/* 117 */     bfd.b((☃ + m), (i + n), this.e).a(((j + m) * f1), ((k + n) * f2)).d();
/* 118 */     bfd.b((☃ + m), (i + 0), this.e).a(((j + m) * f1), ((k + 0) * f2)).d();
/* 119 */     bfd.b((☃ + 0), (i + 0), this.e).a(((j + 0) * f1), ((k + 0) * f2)).d();
/* 120 */     bfx.b();
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, int i, int j, int k, int m) {
/* 124 */     float f2 = 0.00390625F;
/* 125 */     float f3 = 0.00390625F;
/* 126 */     bfx bfx = bfx.a();
/* 127 */     bfd bfd = bfx.c();
/* 128 */     bfd.a(7, bms.g);
/* 129 */     bfd.b((☃ + 0.0F), (f1 + m), this.e).a(((i + 0) * f2), ((j + m) * f3)).d();
/* 130 */     bfd.b((☃ + k), (f1 + m), this.e).a(((i + k) * f2), ((j + m) * f3)).d();
/* 131 */     bfd.b((☃ + k), (f1 + 0.0F), this.e).a(((i + k) * f2), ((j + 0) * f3)).d();
/* 132 */     bfd.b((☃ + 0.0F), (f1 + 0.0F), this.e).a(((i + 0) * f2), ((j + 0) * f3)).d();
/* 133 */     bfx.b();
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, bmi bmi1, int j, int k) {
/* 137 */     bfx bfx = bfx.a();
/* 138 */     bfd bfd = bfx.c();
/* 139 */     bfd.a(7, bms.g);
/* 140 */     bfd.b((☃ + 0), (i + k), this.e).a(bmi1.e(), bmi1.h()).d();
/* 141 */     bfd.b((☃ + j), (i + k), this.e).a(bmi1.f(), bmi1.h()).d();
/* 142 */     bfd.b((☃ + j), (i + 0), this.e).a(bmi1.f(), bmi1.g()).d();
/* 143 */     bfd.b((☃ + 0), (i + 0), this.e).a(bmi1.e(), bmi1.g()).d();
/* 144 */     bfx.b();
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i, float f1, float f2, int j, int k, float f3, float f4) {
/* 148 */     float f5 = 1.0F / f3;
/* 149 */     float f6 = 1.0F / f4;
/* 150 */     bfx bfx = bfx.a();
/* 151 */     bfd bfd = bfx.c();
/* 152 */     bfd.a(7, bms.g);
/* 153 */     bfd.b(☃, (i + k), 0.0D).a((f1 * f5), ((f2 + k) * f6)).d();
/* 154 */     bfd.b((☃ + j), (i + k), 0.0D).a(((f1 + j) * f5), ((f2 + k) * f6)).d();
/* 155 */     bfd.b((☃ + j), i, 0.0D).a(((f1 + j) * f5), (f2 * f6)).d();
/* 156 */     bfd.b(☃, i, 0.0D).a((f1 * f5), (f2 * f6)).d();
/* 157 */     bfx.b();
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i, float f1, float f2, int j, int k, int m, int n, float f3, float f4) {
/* 161 */     float f5 = 1.0F / f3;
/* 162 */     float f6 = 1.0F / f4;
/* 163 */     bfx bfx = bfx.a();
/* 164 */     bfd bfd = bfx.c();
/* 165 */     bfd.a(7, bms.g);
/* 166 */     bfd.b(☃, (i + n), 0.0D).a((f1 * f5), ((f2 + k) * f6)).d();
/* 167 */     bfd.b((☃ + m), (i + n), 0.0D).a(((f1 + j) * f5), ((f2 + k) * f6)).d();
/* 168 */     bfd.b((☃ + m), i, 0.0D).a(((f1 + j) * f5), (f2 * f6)).d();
/* 169 */     bfd.b(☃, i, 0.0D).a((f1 * f5), (f2 * f6)).d();
/* 170 */     bfx.b();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */