/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ams
/*     */ {
/*  13 */   private final List<amq> a = Lists.newArrayList();
/*  14 */   private double b = 0.0D;
/*  15 */   private double c = 0.0D;
/*  16 */   private double d = 6.0E7D;
/*  17 */   private double e = this.d;
/*     */   private long f;
/*     */   private long g;
/*  20 */   private int h = 29999984;
/*  21 */   private double i = 0.2D;
/*  22 */   private double j = 5.0D;
/*  23 */   private int k = 15;
/*  24 */   private int l = 5;
/*     */   
/*     */   public boolean a(cj ☃) {
/*  27 */     return ((☃.n() + 1) > b() && ☃.n() < d() && (☃.p() + 1) > c() && ☃.p() < e());
/*     */   }
/*     */   
/*     */   public boolean a(adg ☃) {
/*  31 */     return (☃.e() > b() && ☃.c() < d() && ☃.f() > c() && ☃.d() < e());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aug ☃) {
/*  39 */     return (☃.d > b() && ☃.a < d() && ☃.f > c() && ☃.c < e());
/*     */   }
/*     */   
/*     */   public double a(pk ☃) {
/*  43 */     return b(☃.s, ☃.u);
/*     */   }
/*     */   
/*     */   public double b(double ☃, double d1) {
/*  47 */     double d2 = d1 - c();
/*  48 */     double d3 = e() - d1;
/*  49 */     double d4 = ☃ - b();
/*  50 */     double d5 = d() - ☃;
/*  51 */     double d6 = Math.min(d4, d5);
/*  52 */     d6 = Math.min(d6, d2);
/*  53 */     return Math.min(d6, d3);
/*     */   }
/*     */   
/*     */   public amr a() {
/*  57 */     if (this.e < this.d)
/*  58 */       return amr.b; 
/*  59 */     if (this.e > this.d) {
/*  60 */       return amr.a;
/*     */     }
/*  62 */     return amr.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public double b() {
/*  67 */     double ☃ = f() - h() / 2.0D;
/*  68 */     if (☃ < -this.h) {
/*  69 */       ☃ = -this.h;
/*     */     }
/*  71 */     return ☃;
/*     */   }
/*     */   
/*     */   public double c() {
/*  75 */     double ☃ = g() - h() / 2.0D;
/*  76 */     if (☃ < -this.h) {
/*  77 */       ☃ = -this.h;
/*     */     }
/*  79 */     return ☃;
/*     */   }
/*     */   
/*     */   public double d() {
/*  83 */     double ☃ = f() + h() / 2.0D;
/*  84 */     if (☃ > this.h) {
/*  85 */       ☃ = this.h;
/*     */     }
/*  87 */     return ☃;
/*     */   }
/*     */   
/*     */   public double e() {
/*  91 */     double ☃ = g() + h() / 2.0D;
/*  92 */     if (☃ > this.h) {
/*  93 */       ☃ = this.h;
/*     */     }
/*  95 */     return ☃;
/*     */   }
/*     */   
/*     */   public double f() {
/*  99 */     return this.b;
/*     */   }
/*     */   
/*     */   public double g() {
/* 103 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c(double ☃, double d1) {
/* 107 */     this.b = ☃;
/* 108 */     this.c = d1;
/*     */     
/* 110 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 111 */       amq.a(this, ☃, d1); }
/*     */   
/*     */   }
/*     */   
/*     */   public double h() {
/* 116 */     if (a() != amr.c) {
/* 117 */       double ☃ = ((float)(System.currentTimeMillis() - this.g) / (float)(this.f - this.g));
/* 118 */       if (☃ >= 1.0D) {
/* 119 */         a(this.e);
/*     */       } else {
/* 121 */         return this.d + (this.e - this.d) * ☃;
/*     */       } 
/*     */     } 
/*     */     
/* 125 */     return this.d;
/*     */   }
/*     */   
/*     */   public long i() {
/* 129 */     if (a() != amr.c) {
/* 130 */       return this.f - System.currentTimeMillis();
/*     */     }
/* 132 */     return 0L;
/*     */   }
/*     */ 
/*     */   
/*     */   public double j() {
/* 137 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 141 */     this.d = ☃;
/* 142 */     this.e = ☃;
/* 143 */     this.f = System.currentTimeMillis();
/* 144 */     this.g = this.f;
/*     */     
/* 146 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 147 */       amq.a(this, ☃); }
/*     */   
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, long l) {
/* 152 */     this.d = ☃;
/* 153 */     this.e = d1;
/* 154 */     this.g = System.currentTimeMillis();
/* 155 */     this.f = this.g + l;
/*     */     
/* 157 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 158 */       amq.a(this, ☃, d1, l); }
/*     */   
/*     */   }
/*     */   
/*     */   protected List<amq> k() {
/* 163 */     return Lists.newArrayList(this.a);
/*     */   }
/*     */   
/*     */   public void a(amq ☃) {
/* 167 */     this.a.add(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 175 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public int l() {
/* 179 */     return this.h;
/*     */   }
/*     */   
/*     */   public double m() {
/* 183 */     return this.j;
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 187 */     this.j = ☃;
/*     */     
/* 189 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 190 */       amq.c(this, ☃); }
/*     */   
/*     */   }
/*     */   
/*     */   public double n() {
/* 195 */     return this.i;
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 199 */     this.i = ☃;
/*     */     
/* 201 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 202 */       amq.b(this, ☃); }
/*     */   
/*     */   }
/*     */   
/*     */   public double o() {
/* 207 */     if (this.f == this.g) {
/* 208 */       return 0.0D;
/*     */     }
/* 210 */     return Math.abs(this.d - this.e) / (this.f - this.g);
/*     */   }
/*     */   
/*     */   public int p() {
/* 214 */     return this.k;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 218 */     this.k = ☃;
/*     */     
/* 220 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 221 */       amq.a(this, ☃); }
/*     */   
/*     */   }
/*     */   
/*     */   public int q() {
/* 226 */     return this.l;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 230 */     this.l = ☃;
/*     */     
/* 232 */     for (Iterator<amq> iterator = k().iterator(); iterator.hasNext(); ) { amq amq = iterator.next();
/* 233 */       amq.b(this, ☃); }
/*     */   
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */