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
/*     */ public class ale
/*     */   extends akw
/*     */   implements km, ol
/*     */ {
/*     */   public int a;
/*     */   public float f;
/*     */   public float g;
/*     */   public float h;
/*     */   public float i;
/*     */   public float j;
/*     */   public float k;
/*     */   public float l;
/*     */   public float m;
/*     */   public float n;
/*  25 */   private static Random o = new Random();
/*     */   
/*     */   private String p;
/*     */   
/*     */   public void b(dn ☃) {
/*  30 */     super.b(☃);
/*  31 */     if (l_()) {
/*  32 */       ☃.a("CustomName", this.p);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/*  38 */     super.a(☃);
/*  39 */     if (☃.b("CustomName", 8)) {
/*  40 */       this.p = ☃.j("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  46 */     this.k = this.j;
/*  47 */     this.m = this.l;
/*     */     
/*  49 */     wn ☃ = this.b.a((this.c.n() + 0.5F), (this.c.o() + 0.5F), (this.c.p() + 0.5F), 3.0D);
/*  50 */     if (☃ != null) {
/*  51 */       double d1 = ☃.s - (this.c.n() + 0.5F);
/*  52 */       double d2 = ☃.u - (this.c.p() + 0.5F);
/*     */       
/*  54 */       this.n = (float)ns.b(d2, d1);
/*     */       
/*  56 */       this.j += 0.1F;
/*     */       
/*  58 */       if (this.j < 0.5F || o.nextInt(40) == 0) {
/*  59 */         float f = this.h;
/*     */         do {
/*  61 */           this.h += (o.nextInt(4) - o.nextInt(4));
/*  62 */         } while (f == this.h);
/*     */       } 
/*     */     } else {
/*  65 */       this.n += 0.02F;
/*  66 */       this.j -= 0.1F;
/*     */     } 
/*     */     
/*  69 */     while (this.l >= 3.1415927F) {
/*  70 */       this.l -= 6.2831855F;
/*     */     }
/*  72 */     while (this.l < -3.1415927F) {
/*  73 */       this.l += 6.2831855F;
/*     */     }
/*  75 */     while (this.n >= 3.1415927F) {
/*  76 */       this.n -= 6.2831855F;
/*     */     }
/*  78 */     while (this.n < -3.1415927F) {
/*  79 */       this.n += 6.2831855F;
/*     */     }
/*  81 */     float f1 = this.n - this.l;
/*  82 */     while (f1 >= 3.1415927F) {
/*  83 */       f1 -= 6.2831855F;
/*     */     }
/*  85 */     while (f1 < -3.1415927F) {
/*  86 */       f1 += 6.2831855F;
/*     */     }
/*     */     
/*  89 */     this.l += f1 * 0.4F;
/*     */     
/*  91 */     this.j = ns.a(this.j, 0.0F, 1.0F);
/*     */     
/*  93 */     this.a++;
/*  94 */     this.g = this.f;
/*     */     
/*  96 */     float f2 = (this.h - this.f) * 0.4F;
/*  97 */     float f3 = 0.2F;
/*  98 */     f2 = ns.a(f2, -f3, f3);
/*  99 */     this.i += (f2 - this.i) * 0.9F;
/*     */     
/* 101 */     this.f += this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 106 */     return l_() ? this.p : "container.enchant";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l_() {
/* 111 */     return (this.p != null && this.p.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 115 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public eu f_() {
/* 120 */     if (l_()) {
/* 121 */       return new fa(e_());
/*     */     }
/* 123 */     return new fb(e_(), new Object[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public xi a(wm ☃, wn wn1) {
/* 128 */     return new xs(☃, this.b, this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public String k() {
/* 133 */     return "minecraft:enchanting_table";
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */