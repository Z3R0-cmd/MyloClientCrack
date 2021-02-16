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
/*     */ public class alc
/*     */   extends alk
/*     */   implements og
/*     */ {
/*  19 */   private static final Random f = new Random();
/*     */   
/*  21 */   private zx[] g = new zx[9];
/*     */   
/*     */   protected String a;
/*     */   
/*     */   public int o_() {
/*  26 */     return 9;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃) {
/*  32 */     return this.g[☃];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(int ☃, int i) {
/*  38 */     if (this.g[☃] != null) {
/*  39 */       if ((this.g[☃]).b <= i) {
/*  40 */         zx zx2 = this.g[☃];
/*  41 */         this.g[☃] = null;
/*  42 */         p_();
/*  43 */         return zx2;
/*     */       } 
/*  45 */       zx zx1 = this.g[☃].a(i);
/*  46 */       if ((this.g[☃]).b == 0) {
/*  47 */         this.g[☃] = null;
/*     */       }
/*  49 */       p_();
/*  50 */       return zx1;
/*     */     } 
/*     */     
/*  53 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b(int ☃) {
/*  59 */     if (this.g[☃] != null) {
/*  60 */       zx zx1 = this.g[☃];
/*  61 */       this.g[☃] = null;
/*  62 */       return zx1;
/*     */     } 
/*  64 */     return null;
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
/*     */ 
/*     */   
/*     */   public int m() {
/*  84 */     int ☃ = -1;
/*  85 */     int i = 1;
/*     */     
/*  87 */     for (int j = 0; j < this.g.length; j++) {
/*  88 */       if (this.g[j] != null && f.nextInt(i++) == 0) {
/*  89 */         ☃ = j;
/*     */       }
/*     */     } 
/*     */     
/*  93 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, zx zx1) {
/*  98 */     this.g[☃] = zx1;
/*  99 */     if (zx1 != null && zx1.b > q_()) {
/* 100 */       zx1.b = q_();
/*     */     }
/* 102 */     p_();
/*     */   }
/*     */   
/*     */   public int a(zx ☃) {
/* 106 */     for (int i = 0; i < this.g.length; i++) {
/* 107 */       if (this.g[i] == null || this.g[i].b() == null) {
/* 108 */         a(i, ☃);
/* 109 */         return i;
/*     */       } 
/*     */     } 
/*     */     
/* 113 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 118 */     return l_() ? this.a : "container.dispenser";
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 122 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 127 */     return (this.a != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 133 */     super.a(☃);
/* 134 */     du du = ☃.c("Items", 10);
/* 135 */     this.g = new zx[o_()];
/* 136 */     for (int i = 0; i < du.c(); i++) {
/* 137 */       dn dn1 = du.b(i);
/* 138 */       int j = dn1.d("Slot") & 0xFF;
/* 139 */       if (j >= 0 && j < this.g.length) {
/* 140 */         this.g[j] = zx.a(dn1);
/*     */       }
/*     */     } 
/* 143 */     if (☃.b("CustomName", 8)) {
/* 144 */       this.a = ☃.j("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 150 */     super.b(☃);
/* 151 */     du du = new du();
/*     */     
/* 153 */     for (int i = 0; i < this.g.length; i++) {
/* 154 */       if (this.g[i] != null) {
/* 155 */         dn dn1 = new dn();
/* 156 */         dn1.a("Slot", (byte)i);
/* 157 */         this.g[i].b(dn1);
/* 158 */         du.a(dn1);
/*     */       } 
/*     */     } 
/* 161 */     ☃.a("Items", du);
/* 162 */     if (l_()) {
/* 163 */       ☃.a("CustomName", this.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int q_() {
/* 169 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(wn ☃) {
/* 174 */     if (this.b.s(this.c) != this) {
/* 175 */       return false;
/*     */     }
/* 177 */     if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 178 */       return false;
/*     */     }
/* 180 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(wn ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(wn ☃) {}
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, zx zx1) {
/* 193 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 198 */     return "minecraft:dispenser";
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 203 */     return new xr(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a_(int ☃) {
/* 208 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   public int g() {
/* 217 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 222 */     for (int ☃ = 0; ☃ < this.g.length; ☃++)
/* 223 */       this.g[☃] = null; 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */