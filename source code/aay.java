/*     */ import com.google.common.collect.Multimap;
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
/*     */ public class aay
/*     */   extends zw
/*     */ {
/*     */   private float a;
/*     */   private final zw.a b;
/*     */   
/*     */   public aay(zw.a ☃) {
/*  19 */     this.b = ☃;
/*  20 */     this.h = 1;
/*  21 */     d(☃.a());
/*  22 */     a(yz.j);
/*     */     
/*  24 */     this.a = 4.0F + ☃.c();
/*     */   }
/*     */   
/*     */   public float g() {
/*  28 */     return this.b.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(zx ☃, afh afh1) {
/*  33 */     if (afh1 == afi.G)
/*     */     {
/*  35 */       return 15.0F;
/*     */     }
/*     */ 
/*     */     
/*  39 */     arm arm = afh1.t();
/*  40 */     if (arm == arm.k || arm == arm.l || arm == arm.v || arm == arm.j || arm == arm.C) {
/*  41 */       return 1.5F;
/*     */     }
/*  43 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(zx ☃, pr pr1, pr pr2) {
/*  48 */     ☃.a(1, pr2);
/*  49 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(zx ☃, adm adm1, afh afh1, cj cj1, pr pr1) {
/*  55 */     if (afh1.g(adm1, cj1) != 0.0D) {
/*  56 */       ☃.a(2, pr1);
/*     */     }
/*  58 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w_() {
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public aba e(zx ☃) {
/*  68 */     return aba.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d(zx ☃) {
/*  73 */     return 72000;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx a(zx ☃, adm adm1, wn wn1) {
/*  78 */     wn1.a(☃, d(☃));
/*  79 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(afh ☃) {
/*  84 */     return (☃ == afi.G);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  89 */     return this.b.e();
/*     */   }
/*     */   
/*     */   public String h() {
/*  93 */     return this.b.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(zx ☃, zx zx1) {
/*  98 */     if (this.b.f() == zx1.b()) {
/*  99 */       return true;
/*     */     }
/* 101 */     return super.a(☃, zx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<String, qd> i() {
/* 106 */     Multimap<String, qd> ☃ = super.i();
/*     */     
/* 108 */     ☃.put(vy.e.a(), new qd(f, "Weapon modifier", this.a, 0));
/*     */     
/* 110 */     return ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */