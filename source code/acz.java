/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acz
/*     */ {
/*     */   private zx a;
/*     */   private zx b;
/*     */   private zx c;
/*     */   private int d;
/*     */   private int e;
/*     */   private boolean f;
/*     */   
/*     */   public acz(dn ☃) {
/*  20 */     a(☃);
/*     */   }
/*     */   
/*     */   public acz(zx ☃, zx zx1, zx zx2) {
/*  24 */     this(☃, zx1, zx2, 0, 7);
/*     */   }
/*     */   
/*     */   public acz(zx ☃, zx zx1, zx zx2, int i, int j) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = zx1;
/*  30 */     this.c = zx2;
/*  31 */     this.d = i;
/*  32 */     this.e = j;
/*  33 */     this.f = true;
/*     */   }
/*     */   
/*     */   public acz(zx ☃, zx zx1) {
/*  37 */     this(☃, null, zx1);
/*     */   }
/*     */   
/*     */   public acz(zx ☃, zw zw1) {
/*  41 */     this(☃, new zx(zw1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a() {
/*  49 */     return this.a;
/*     */   }
/*     */   
/*     */   public zx b() {
/*  53 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  57 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   public zx d() {
/*  61 */     return this.c;
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
/*     */   public int e() {
/*  77 */     return this.d;
/*     */   }
/*     */   
/*     */   public int f() {
/*  81 */     return this.e;
/*     */   }
/*     */   
/*     */   public void g() {
/*  85 */     this.d++;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  89 */     this.e += ☃;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  93 */     return (this.d >= this.e);
/*     */   }
/*     */   
/*     */   public void i() {
/*  97 */     this.d = this.e;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 101 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(dn ☃) {
/* 105 */     dn dn1 = ☃.m("buy");
/* 106 */     this.a = zx.a(dn1);
/* 107 */     dn dn2 = ☃.m("sell");
/* 108 */     this.c = zx.a(dn2);
/* 109 */     if (☃.b("buyB", 10)) {
/* 110 */       this.b = zx.a(☃.m("buyB"));
/*     */     }
/* 112 */     if (☃.b("uses", 99)) {
/* 113 */       this.d = ☃.f("uses");
/*     */     }
/* 115 */     if (☃.b("maxUses", 99)) {
/* 116 */       this.e = ☃.f("maxUses");
/*     */     } else {
/* 118 */       this.e = 7;
/*     */     } 
/* 120 */     if (☃.b("rewardExp", 1)) {
/* 121 */       this.f = ☃.n("rewardExp");
/*     */     } else {
/* 123 */       this.f = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public dn k() {
/* 128 */     dn ☃ = new dn();
/* 129 */     ☃.a("buy", this.a.b(new dn()));
/* 130 */     ☃.a("sell", this.c.b(new dn()));
/* 131 */     if (this.b != null) {
/* 132 */       ☃.a("buyB", this.b.b(new dn()));
/*     */     }
/* 134 */     ☃.a("uses", this.d);
/* 135 */     ☃.a("maxUses", this.e);
/* 136 */     ☃.a("rewardExp", this.f);
/* 137 */     return ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/acz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */