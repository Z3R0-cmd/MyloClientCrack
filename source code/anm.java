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
/*     */ public abstract class anm
/*     */ {
/*  23 */   public static final float[] a = new float[] { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
/*     */   
/*     */   protected adm b;
/*     */   
/*     */   private adr h;
/*     */   private String i;
/*     */   protected aec c;
/*     */   protected boolean d;
/*     */   protected boolean e;
/*  32 */   protected final float[] f = new float[16];
/*     */   
/*     */   protected int g;
/*     */   
/*  36 */   private final float[] j = new float[4];
/*     */   
/*     */   public final void a(adm ☃) {
/*  39 */     this.b = ☃;
/*  40 */     this.h = ☃.P().u();
/*  41 */     this.i = ☃.P().B();
/*  42 */     b();
/*  43 */     a();
/*     */   }
/*     */   
/*     */   protected void a() {
/*  47 */     float ☃ = 0.0F;
/*  48 */     for (int i = 0; i <= 15; i++) {
/*  49 */       float f = 1.0F - i / 15.0F;
/*  50 */       this.f[i] = (1.0F - f) / (f * 3.0F + 1.0F) * (1.0F - ☃) + ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b() {
/*  55 */     adr ☃ = this.b.P().u();
/*  56 */     if (☃ == adr.c) {
/*  57 */       apz apz = apz.a(this.b.P().B());
/*  58 */       this.c = new aef(ady.a(apz.a(), ady.ad), 0.5F);
/*  59 */     } else if (☃ == adr.g) {
/*  60 */       this.c = new aef(ady.q, 0.0F);
/*     */     } else {
/*  62 */       this.c = new aec(this.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   public amv c() {
/*  67 */     if (this.h == adr.c)
/*  68 */       return new anv(this.b, this.b.J(), this.b.P().s(), this.i); 
/*  69 */     if (this.h == adr.g)
/*  70 */       return new anu(this.b); 
/*  71 */     if (this.h == adr.f) {
/*  72 */       return new aoa(this.b, this.b.J(), this.b.P().s(), this.i);
/*     */     }
/*  74 */     return new aoa(this.b, this.b.J(), this.b.P().s(), this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/*  79 */     return (this.b.c(new cj(☃, 0, i)) == afi.c);
/*     */   }
/*     */   
/*     */   public float a(long ☃, float f) {
/*  83 */     int i = (int)(☃ % 24000L);
/*  84 */     float f1 = (i + f) / 24000.0F - 0.25F;
/*  85 */     if (f1 < 0.0F) {
/*  86 */       f1++;
/*     */     }
/*  88 */     if (f1 > 1.0F) {
/*  89 */       f1--;
/*     */     }
/*  91 */     float f2 = f1;
/*  92 */     f1 = 1.0F - (float)((Math.cos(f1 * Math.PI) + 1.0D) / 2.0D);
/*  93 */     f1 = f2 + (f1 - f2) / 3.0F;
/*  94 */     return f1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(long ☃) {
/*  99 */     return (int)(☃ / 24000L % 8L + 8L) % 8;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 103 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] a(float ☃, float f1) {
/* 108 */     float f2 = 0.4F;
/* 109 */     float f3 = ns.b(☃ * 3.1415927F * 2.0F) - 0.0F;
/* 110 */     float f4 = -0.0F;
/* 111 */     if (f3 >= f4 - f2 && f3 <= f4 + f2) {
/* 112 */       float f5 = (f3 - f4) / f2 * 0.5F + 0.5F;
/* 113 */       float f6 = 1.0F - (1.0F - ns.a(f5 * 3.1415927F)) * 0.99F;
/* 114 */       f6 *= f6;
/* 115 */       this.j[0] = f5 * 0.3F + 0.7F;
/* 116 */       this.j[1] = f5 * f5 * 0.7F + 0.2F;
/* 117 */       this.j[2] = f5 * f5 * 0.0F + 0.2F;
/* 118 */       this.j[3] = f6;
/* 119 */       return this.j;
/*     */     } 
/*     */     
/* 122 */     return null;
/*     */   }
/*     */   
/*     */   public aui b(float ☃, float f1) {
/* 126 */     float f2 = ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 127 */     f2 = ns.a(f2, 0.0F, 1.0F);
/*     */     
/* 129 */     float f3 = 0.7529412F;
/* 130 */     float f4 = 0.84705883F;
/* 131 */     float f5 = 1.0F;
/* 132 */     f3 *= f2 * 0.94F + 0.06F;
/* 133 */     f4 *= f2 * 0.94F + 0.06F;
/* 134 */     f5 *= f2 * 0.91F + 0.09F;
/*     */     
/* 136 */     return new aui(f3, f4, f5);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 140 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static anm a(int ☃) {
/* 145 */     if (☃ == -1) {
/* 146 */       return new ann();
/*     */     }
/* 148 */     if (☃ == 0) {
/* 149 */       return new ano();
/*     */     }
/* 151 */     if (☃ == 1) {
/* 152 */       return new anp();
/*     */     }
/* 154 */     return null;
/*     */   }
/*     */   
/*     */   public float f() {
/* 158 */     return 128.0F;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 162 */     return true;
/*     */   }
/*     */   
/*     */   public cj h() {
/* 166 */     return null;
/*     */   }
/*     */   
/*     */   public int i() {
/* 170 */     if (this.h == adr.c) {
/* 171 */       return 4;
/*     */     }
/* 173 */     return this.b.F() + 1;
/*     */   }
/*     */   
/*     */   public double j() {
/* 177 */     if (this.h == adr.c) {
/* 178 */       return 1.0D;
/*     */     }
/* 180 */     return 0.03125D;
/*     */   }
/*     */   
/*     */   public boolean b(int ☃, int i) {
/* 184 */     return false;
/*     */   }
/*     */   
/*     */   public abstract String k();
/*     */   
/*     */   public abstract String l();
/*     */   
/*     */   public aec m() {
/* 192 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 196 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 200 */     return this.e;
/*     */   }
/*     */   
/*     */   public float[] p() {
/* 204 */     return this.f;
/*     */   }
/*     */   
/*     */   public int q() {
/* 208 */     return this.g;
/*     */   }
/*     */   
/*     */   public ams r() {
/* 212 */     return new ams();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */