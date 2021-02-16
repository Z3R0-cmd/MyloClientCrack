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
/*     */ public class avi
/*     */   implements nu
/*     */ {
/*  16 */   private String a = "";
/*     */   private ave b;
/*  18 */   private String c = "";
/*  19 */   private long d = ave.J();
/*     */   private boolean e;
/*     */   private avr f;
/*     */   private bfw g;
/*     */   
/*     */   public avi(ave ☃) {
/*  25 */     this.b = ☃;
/*  26 */     this.f = new avr(☃);
/*  27 */     this.g = new bfw(☃.d, ☃.e, false);
/*  28 */     this.g.a(9728);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String ☃) {
/*  33 */     this.e = false;
/*  34 */     d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃) {
/*  39 */     this.e = true;
/*  40 */     d(☃);
/*     */   }
/*     */   
/*     */   private void d(String ☃) {
/*  44 */     this.c = ☃;
/*  45 */     if (!this.b.B) {
/*  46 */       if (this.e) {
/*     */         return;
/*     */       }
/*  49 */       throw new avk();
/*     */     } 
/*     */     
/*  52 */     bfl.m(256);
/*  53 */     bfl.n(5889);
/*  54 */     bfl.D();
/*  55 */     if (bqs.i()) {
/*  56 */       int i = this.f.e();
/*  57 */       bfl.a(0.0D, (this.f.a() * i), (this.f.b() * i), 0.0D, 100.0D, 300.0D);
/*     */     } else {
/*  59 */       avr avr1 = new avr(this.b);
/*  60 */       bfl.a(0.0D, avr1.c(), avr1.d(), 0.0D, 100.0D, 300.0D);
/*     */     } 
/*  62 */     bfl.n(5888);
/*  63 */     bfl.D();
/*  64 */     bfl.b(0.0F, 0.0F, -200.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(String ☃) {
/*  69 */     if (!this.b.B) {
/*  70 */       if (this.e) {
/*     */         return;
/*     */       }
/*  73 */       throw new avk();
/*     */     } 
/*     */     
/*  76 */     this.d = 0L;
/*  77 */     this.a = ☃;
/*  78 */     a(-1);
/*  79 */     this.d = 0L;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/*  84 */     if (!this.b.B) {
/*  85 */       if (this.e) {
/*     */         return;
/*     */       }
/*  88 */       throw new avk();
/*     */     } 
/*     */     
/*  91 */     long l = ave.J();
/*  92 */     if (l - this.d < 100L) {
/*     */       return;
/*     */     }
/*  95 */     this.d = l;
/*     */     
/*  97 */     avr avr1 = new avr(this.b);
/*  98 */     int i = avr1.e();
/*  99 */     int j = avr1.a();
/* 100 */     int k = avr1.b();
/*     */     
/* 102 */     if (bqs.i()) {
/* 103 */       this.g.f();
/*     */     } else {
/* 105 */       bfl.m(256);
/*     */     } 
/* 107 */     this.g.a(false);
/* 108 */     bfl.n(5889);
/* 109 */     bfl.D();
/* 110 */     bfl.a(0.0D, avr1.c(), avr1.d(), 0.0D, 100.0D, 300.0D);
/* 111 */     bfl.n(5888);
/* 112 */     bfl.D();
/* 113 */     bfl.b(0.0F, 0.0F, -200.0F);
/*     */     
/* 115 */     if (!bqs.i()) {
/* 116 */       bfl.m(16640);
/*     */     }
/*     */     
/* 119 */     bfx bfx = bfx.a();
/* 120 */     bfd bfd = bfx.c();
/* 121 */     this.b.P().a(avp.b);
/* 122 */     float f = 32.0F;
/* 123 */     bfd.a(7, bms.i);
/* 124 */     bfd.b(0.0D, k, 0.0D).a(0.0D, (k / f)).b(64, 64, 64, 255).d();
/* 125 */     bfd.b(j, k, 0.0D).a((j / f), (k / f)).b(64, 64, 64, 255).d();
/* 126 */     bfd.b(j, 0.0D, 0.0D).a((j / f), 0.0D).b(64, 64, 64, 255).d();
/* 127 */     bfd.b(0.0D, 0.0D, 0.0D).a(0.0D, 0.0D).b(64, 64, 64, 255).d();
/* 128 */     bfx.b();
/*     */     
/* 130 */     if (☃ >= 0) {
/* 131 */       int m = 100;
/* 132 */       int n = 2;
/* 133 */       int i1 = j / 2 - m / 2;
/* 134 */       int i2 = k / 2 + 16;
/*     */       
/* 136 */       bfl.x();
/* 137 */       bfd.a(7, bms.f);
/* 138 */       bfd.b(i1, i2, 0.0D).b(128, 128, 128, 255).d();
/* 139 */       bfd.b(i1, (i2 + n), 0.0D).b(128, 128, 128, 255).d();
/* 140 */       bfd.b((i1 + m), (i2 + n), 0.0D).b(128, 128, 128, 255).d();
/* 141 */       bfd.b((i1 + m), i2, 0.0D).b(128, 128, 128, 255).d();
/*     */       
/* 143 */       bfd.b(i1, i2, 0.0D).b(128, 255, 128, 255).d();
/* 144 */       bfd.b(i1, (i2 + n), 0.0D).b(128, 255, 128, 255).d();
/* 145 */       bfd.b((i1 + ☃), (i2 + n), 0.0D).b(128, 255, 128, 255).d();
/* 146 */       bfd.b((i1 + ☃), i2, 0.0D).b(128, 255, 128, 255).d();
/* 147 */       bfx.b();
/* 148 */       bfl.w();
/*     */     } 
/*     */     
/* 151 */     bfl.l();
/* 152 */     bfl.a(770, 771, 1, 0);
/* 153 */     this.b.k.a(this.c, ((j - this.b.k.a(this.c)) / 2), (k / 2 - 4 - 16), 16777215);
/* 154 */     this.b.k.a(this.a, ((j - this.b.k.a(this.a)) / 2), (k / 2 - 4 + 8), 16777215);
/* 155 */     this.g.e();
/* 156 */     if (bqs.i()) {
/* 157 */       this.g.c(j * i, k * i);
/*     */     }
/* 159 */     this.b.h();
/*     */     
/*     */     try {
/* 162 */       Thread.yield();
/* 163 */     } catch (Exception exception) {}
/*     */   }
/*     */   
/*     */   public void a() {}
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */