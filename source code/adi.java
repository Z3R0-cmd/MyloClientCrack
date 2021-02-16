/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class adi
/*     */ {
/*     */   private final boolean a;
/*     */   private final boolean b;
/*  30 */   private final Random c = new Random();
/*     */   
/*     */   private final adm d;
/*     */   
/*     */   private final double e;
/*     */   private final double f;
/*  36 */   private final List<cj> j = Lists.newArrayList(); private final double g; private final pk h; private final float i;
/*  37 */   private final Map<wn, aui> k = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public adi(adm ☃, pk pk1, double d1, double d2, double d3, float f, List<cj> list) {
/*  44 */     this(☃, pk1, d1, d2, d3, f, false, true, list);
/*     */   }
/*     */   
/*     */   public adi(adm ☃, pk pk1, double d1, double d2, double d3, float f, boolean bool1, boolean bool2, List<cj> list) {
/*  48 */     this(☃, pk1, d1, d2, d3, f, bool1, bool2);
/*  49 */     this.j.addAll(list);
/*     */   }
/*     */   
/*     */   public adi(adm ☃, pk pk1, double d1, double d2, double d3, float f, boolean bool1, boolean bool2) {
/*  53 */     this.d = ☃;
/*  54 */     this.h = pk1;
/*  55 */     this.i = f;
/*  56 */     this.e = d1;
/*  57 */     this.f = d2;
/*  58 */     this.g = d3;
/*  59 */     this.a = bool1;
/*  60 */     this.b = bool2;
/*     */   }
/*     */   
/*     */   public void a() {
/*  64 */     Set<cj> ☃ = Sets.newHashSet();
/*     */     
/*  66 */     int i = 16;
/*  67 */     for (int j = 0; j < 16; j++) {
/*  68 */       for (int i5 = 0; i5 < 16; i5++) {
/*  69 */         for (int i6 = 0; i6 < 16; i6++) {
/*  70 */           if (j == 0 || j == 15 || i5 == 0 || i5 == 15 || i6 == 0 || i6 == 15) {
/*     */ 
/*     */ 
/*     */             
/*  74 */             double d1 = (j / 15.0F * 2.0F - 1.0F);
/*  75 */             double d2 = (i5 / 15.0F * 2.0F - 1.0F);
/*  76 */             double d3 = (i6 / 15.0F * 2.0F - 1.0F);
/*  77 */             double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */             
/*  79 */             d1 /= d4;
/*  80 */             d2 /= d4;
/*  81 */             d3 /= d4;
/*     */             
/*  83 */             float f1 = this.i * (0.7F + this.d.s.nextFloat() * 0.6F);
/*  84 */             double d5 = this.e;
/*  85 */             double d6 = this.f;
/*  86 */             double d7 = this.g;
/*     */             
/*  88 */             float f2 = 0.3F;
/*  89 */             while (f1 > 0.0F) {
/*  90 */               cj cj = new cj(d5, d6, d7);
/*  91 */               alz alz = this.d.p(cj);
/*     */               
/*  93 */               if (alz.c().t() != arm.a) {
/*  94 */                 float f3 = (this.h != null) ? this.h.a(this, this.d, cj, alz) : alz.c().a((pk)null);
/*  95 */                 f1 -= (f3 + 0.3F) * 0.3F;
/*     */               } 
/*     */               
/*  98 */               if (f1 > 0.0F && (this.h == null || this.h.a(this, this.d, cj, alz, f1))) {
/*  99 */                 ☃.add(cj);
/*     */               }
/*     */               
/* 102 */               d5 += d1 * 0.30000001192092896D;
/* 103 */               d6 += d2 * 0.30000001192092896D;
/* 104 */               d7 += d3 * 0.30000001192092896D;
/* 105 */               f1 -= 0.22500001F;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 111 */     this.j.addAll(☃);
/*     */     
/* 113 */     float f = this.i * 2.0F;
/*     */     
/* 115 */     int k = ns.c(this.e - f - 1.0D);
/* 116 */     int m = ns.c(this.e + f + 1.0D);
/* 117 */     int n = ns.c(this.f - f - 1.0D);
/* 118 */     int i1 = ns.c(this.f + f + 1.0D);
/* 119 */     int i2 = ns.c(this.g - f - 1.0D);
/* 120 */     int i3 = ns.c(this.g + f + 1.0D);
/* 121 */     List<pk> list = this.d.b(this.h, new aug(k, n, i2, m, i1, i3));
/* 122 */     aui aui = new aui(this.e, this.f, this.g);
/*     */     
/* 124 */     for (int i4 = 0; i4 < list.size(); i4++) {
/* 125 */       pk pk1 = list.get(i4);
/* 126 */       if (!pk1.aW()) {
/*     */ 
/*     */         
/* 129 */         double d = pk1.f(this.e, this.f, this.g) / f;
/*     */         
/* 131 */         if (d <= 1.0D) {
/* 132 */           double d1 = pk1.s - this.e;
/* 133 */           double d2 = pk1.t + pk1.aS() - this.f;
/* 134 */           double d3 = pk1.u - this.g;
/*     */           
/* 136 */           double d4 = ns.a(d1 * d1 + d2 * d2 + d3 * d3);
/* 137 */           if (d4 != 0.0D) {
/*     */ 
/*     */ 
/*     */             
/* 141 */             d1 /= d4;
/* 142 */             d2 /= d4;
/* 143 */             d3 /= d4;
/*     */             
/* 145 */             double d5 = this.d.a(aui, pk1.aR());
/* 146 */             double d6 = (1.0D - d) * d5;
/* 147 */             pk1.a(ow.a(this), (int)((d6 * d6 + d6) / 2.0D * 8.0D * f + 1.0D));
/*     */             
/* 149 */             double d7 = acr.a(pk1, d6);
/* 150 */             pk1.v += d1 * d7;
/* 151 */             pk1.w += d2 * d7;
/* 152 */             pk1.x += d3 * d7;
/*     */             
/* 154 */             if (pk1 instanceof wn && !((wn)pk1).bA.a)
/* 155 */               this.k.put((wn)pk1, new aui(d1 * d6, d2 * d6, d3 * d6)); 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void a(boolean ☃) {
/* 162 */     this.d.a(this.e, this.f, this.g, "random.explode", 4.0F, (1.0F + (this.d.s.nextFloat() - this.d.s.nextFloat()) * 0.2F) * 0.7F);
/* 163 */     if (this.i < 2.0F || !this.b) {
/* 164 */       this.d.a(cy.b, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D, new int[0]);
/*     */     } else {
/* 166 */       this.d.a(cy.c, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D, new int[0]);
/*     */     } 
/*     */     
/* 169 */     if (this.b) {
/* 170 */       for (Iterator<cj> iterator = this.j.iterator(); iterator.hasNext(); ) { cj cj = iterator.next();
/* 171 */         afh afh = this.d.p(cj).c();
/*     */         
/* 173 */         if (☃) {
/* 174 */           double d1 = (cj.n() + this.d.s.nextFloat());
/* 175 */           double d2 = (cj.o() + this.d.s.nextFloat());
/* 176 */           double d3 = (cj.p() + this.d.s.nextFloat());
/*     */           
/* 178 */           double d4 = d1 - this.e;
/* 179 */           double d5 = d2 - this.f;
/* 180 */           double d6 = d3 - this.g;
/*     */           
/* 182 */           double d7 = ns.a(d4 * d4 + d5 * d5 + d6 * d6);
/*     */           
/* 184 */           d4 /= d7;
/* 185 */           d5 /= d7;
/* 186 */           d6 /= d7;
/*     */           
/* 188 */           double d8 = 0.5D / (d7 / this.i + 0.1D);
/* 189 */           d8 *= (this.d.s.nextFloat() * this.d.s.nextFloat() + 0.3F);
/* 190 */           d4 *= d8;
/* 191 */           d5 *= d8;
/* 192 */           d6 *= d8;
/*     */           
/* 194 */           this.d.a(cy.a, (d1 + this.e * 1.0D) / 2.0D, (d2 + this.f * 1.0D) / 2.0D, (d3 + this.g * 1.0D) / 2.0D, d4, d5, d6, new int[0]);
/* 195 */           this.d.a(cy.l, d1, d2, d3, d4, d5, d6, new int[0]);
/*     */         } 
/*     */         
/* 198 */         if (afh.t() != arm.a) {
/* 199 */           if (afh.a(this)) {
/* 200 */             afh.a(this.d, cj, this.d.p(cj), 1.0F / this.i, 0);
/*     */           }
/* 202 */           this.d.a(cj, afi.a.Q(), 3);
/* 203 */           afh.a(this.d, cj, this);
/*     */         }  }
/*     */     
/*     */     }
/* 207 */     if (this.a) {
/* 208 */       for (Iterator<cj> iterator = this.j.iterator(); iterator.hasNext(); ) { cj cj = iterator.next();
/* 209 */         if (this.d.p(cj).c().t() == arm.a && this.d.p(cj.b()).c().o() && this.c.nextInt(3) == 0) {
/* 210 */           this.d.a(cj, afi.ab.Q());
/*     */         } }
/*     */     
/*     */     }
/*     */   }
/*     */   
/*     */   public Map<wn, aui> b() {
/* 217 */     return this.k;
/*     */   }
/*     */   
/*     */   public pr c() {
/* 221 */     if (this.h == null) {
/* 222 */       return null;
/*     */     }
/* 224 */     if (this.h instanceof vj) {
/* 225 */       return ((vj)this.h).j();
/*     */     }
/* 227 */     if (this.h instanceof pr) {
/* 228 */       return (pr)this.h;
/*     */     }
/* 230 */     return null;
/*     */   }
/*     */   
/*     */   public void d() {
/* 234 */     this.j.clear();
/*     */   }
/*     */   
/*     */   public List<cj> e() {
/* 238 */     return this.j;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */