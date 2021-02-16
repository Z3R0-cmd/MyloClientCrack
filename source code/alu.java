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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alu
/*     */   extends akw
/*     */   implements km
/*     */ {
/*     */   private alz a;
/*     */   private cq f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private float i;
/*     */   private float j;
/*     */   
/*     */   public alu() {}
/*     */   
/*     */   public alu(alz ☃, cq cq1, boolean bool1, boolean bool2) {
/*  29 */     this.a = ☃;
/*  30 */     this.f = cq1;
/*  31 */     this.g = bool1;
/*  32 */     this.h = bool2;
/*     */   }
/*     */   
/*     */   public alz b() {
/*  36 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public int u() {
/*  41 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  45 */     return this.g;
/*     */   }
/*     */   
/*     */   public cq e() {
/*  49 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  53 */     return this.h;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/*  57 */     if (☃ > 1.0F) {
/*  58 */       ☃ = 1.0F;
/*     */     }
/*  60 */     return this.j + (this.i - this.j) * ☃;
/*     */   }
/*     */   
/*     */   public float b(float ☃) {
/*  64 */     if (this.g) {
/*  65 */       return (a(☃) - 1.0F) * this.f.g();
/*     */     }
/*  67 */     return (1.0F - a(☃)) * this.f.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public float c(float ☃) {
/*  72 */     if (this.g) {
/*  73 */       return (a(☃) - 1.0F) * this.f.h();
/*     */     }
/*  75 */     return (1.0F - a(☃)) * this.f.h();
/*     */   }
/*     */ 
/*     */   
/*     */   public float d(float ☃) {
/*  80 */     if (this.g) {
/*  81 */       return (a(☃) - 1.0F) * this.f.i();
/*     */     }
/*  83 */     return (1.0F - a(☃)) * this.f.i();
/*     */   }
/*     */ 
/*     */   
/*  87 */   private List<pk> k = Lists.newArrayList();
/*     */   
/*     */   private void a(float ☃, float f1) {
/*  90 */     if (this.g) {
/*  91 */       ☃ = 1.0F - ☃;
/*     */     } else {
/*  93 */       ☃--;
/*     */     } 
/*     */     
/*  96 */     aug aug = afi.M.a(this.b, this.c, this.a, ☃, this.f);
/*  97 */     if (aug != null) {
/*  98 */       List<pk> list = this.b.b((pk)null, aug);
/*  99 */       if (!list.isEmpty()) {
/* 100 */         this.k.addAll(list);
/*     */         
/* 102 */         for (Iterator<pk> iterator = this.k.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 103 */           if (this.a.c() == afi.cE && this.g) {
/* 104 */             switch (null.a[this.f.k().ordinal()]) {
/*     */               case 1:
/* 106 */                 pk.v = this.f.g();
/*     */                 continue;
/*     */               case 2:
/* 109 */                 pk.w = this.f.h();
/*     */                 continue;
/*     */               case 3:
/* 112 */                 pk.x = this.f.i(); continue;
/*     */             } 
/*     */             continue;
/*     */           } 
/* 116 */           pk.d((f1 * this.f.g()), (f1 * this.f.h()), (f1 * this.f.i())); }
/*     */ 
/*     */         
/* 119 */         this.k.clear();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void h() {
/* 125 */     if (this.j < 1.0F && this.b != null) {
/* 126 */       this.j = this.i = 1.0F;
/* 127 */       this.b.t(this.c);
/* 128 */       y();
/* 129 */       if (this.b.p(this.c).c() == afi.M) {
/* 130 */         this.b.a(this.c, this.a, 3);
/* 131 */         this.b.d(this.c, this.a.c());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 138 */     this.j = this.i;
/*     */     
/* 140 */     if (this.j >= 1.0F) {
/* 141 */       a(1.0F, 0.25F);
/* 142 */       this.b.t(this.c);
/* 143 */       y();
/* 144 */       if (this.b.p(this.c).c() == afi.M) {
/* 145 */         this.b.a(this.c, this.a, 3);
/* 146 */         this.b.d(this.c, this.a.c());
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 151 */     this.i += 0.5F;
/* 152 */     if (this.i >= 1.0F) {
/* 153 */       this.i = 1.0F;
/*     */     }
/*     */     
/* 156 */     if (this.g) {
/* 157 */       a(this.i, this.i - this.j + 0.0625F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 163 */     super.a(☃);
/*     */     
/* 165 */     this.a = afh.c(☃.f("blockId")).a(☃.f("blockData"));
/* 166 */     this.f = cq.a(☃.f("facing"));
/* 167 */     this.j = this.i = ☃.h("progress");
/* 168 */     this.g = ☃.n("extending");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 173 */     super.b(☃);
/*     */     
/* 175 */     ☃.a("blockId", afh.a(this.a.c()));
/* 176 */     ☃.a("blockData", this.a.c().c(this.a));
/* 177 */     ☃.a("facing", this.f.a());
/* 178 */     ☃.a("progress", this.j);
/* 179 */     ☃.a("extending", this.g);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */