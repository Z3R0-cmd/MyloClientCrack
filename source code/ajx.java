/*     */ import com.google.common.base.Predicate;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ public class ajx
/*     */   extends afm
/*     */   implements afj
/*     */ {
/*  23 */   public static final amn a = amn.a("age", 0, 7);
/*  24 */   public static final aml b = aml.a("facing", new Predicate<cq>()
/*     */       {
/*     */         public boolean a(cq ☃) {
/*  27 */           return (☃ != cq.a);
/*     */         }
/*     */       });
/*     */   
/*     */   private final afh N;
/*     */   
/*     */   protected ajx(afh ☃) {
/*  34 */     j(this.M.b().<Comparable, Integer>a(a, Integer.valueOf(0)).a(b, cq.b));
/*  35 */     this.N = ☃;
/*  36 */     a(true);
/*  37 */     float f = 0.125F;
/*  38 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  39 */     a((yz)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(alz ☃, adq adq1, cj cj1) {
/*  44 */     ☃ = ☃.a(b, cq.b);
/*  45 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  46 */       if (adq1.p(cj1.a(cq)).c() == this.N) {
/*  47 */         ☃ = ☃.a(b, cq);
/*     */         break;
/*     */       }  }
/*     */     
/*  51 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(afh ☃) {
/*  56 */     return (☃ == afi.ak);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  61 */     super.b(☃, cj1, alz1, random);
/*  62 */     if (☃.l(cj1.a()) < 9) {
/*     */       return;
/*     */     }
/*     */     
/*  66 */     float f = afz.a(this, ☃, cj1);
/*  67 */     if (random.nextInt((int)(25.0F / f) + 1) == 0) {
/*  68 */       int i = ((Integer)alz1.<Integer>b(a)).intValue();
/*  69 */       if (i < 7) {
/*  70 */         alz1 = alz1.a(a, Integer.valueOf(i + 1));
/*  71 */         ☃.a(cj1, alz1, 2);
/*     */       } else {
/*  73 */         for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  74 */           if (☃.p(cj1.a(cq)).c() == this.N) {
/*     */             return;
/*     */           } }
/*     */ 
/*     */         
/*  79 */         cj1 = cj1.a(cq.c.a.a(random));
/*     */         
/*  81 */         afh afh1 = ☃.p(cj1.b()).c();
/*  82 */         if ((☃.p(cj1).c()).J == arm.a && (afh1 == afi.ak || afh1 == afi.d || afh1 == afi.c)) {
/*  83 */           ☃.a(cj1, this.N.Q());
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void g(adm ☃, cj cj1, alz alz1) {
/*  90 */     int i = ((Integer)alz1.<Integer>b(a)).intValue() + ns.a(☃.s, 2, 5);
/*  91 */     ☃.a(cj1, alz1.a(a, Integer.valueOf(Math.min(7, i))), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int h(alz ☃) {
/*  96 */     if (☃.c() != this) {
/*  97 */       return super.h(☃);
/*     */     }
/*     */     
/* 100 */     int i = ((Integer)☃.<Integer>b(a)).intValue();
/* 101 */     int j = i * 32;
/* 102 */     int k = 255 - i * 8;
/* 103 */     int m = i * 4;
/* 104 */     return j << 16 | k << 8 | m;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/* 109 */     return h(☃.p(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 114 */     float ☃ = 0.125F;
/* 115 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 120 */     this.F = ((((Integer)☃.p(cj1).<Integer>b(a)).intValue() * 2 + 2) / 16.0F);
/* 121 */     float f = 0.125F;
/* 122 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)this.F, 0.5F + f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 130 */     super.a(☃, cj1, alz1, f, i);
/*     */     
/* 132 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     zw zw = l();
/* 137 */     if (zw == null) {
/*     */       return;
/*     */     }
/*     */     
/* 141 */     int j = ((Integer)alz1.<Integer>b(a)).intValue();
/* 142 */     for (int k = 0; k < 3; k++) {
/* 143 */       if (☃.s.nextInt(15) <= j)
/*     */       {
/*     */         
/* 146 */         a(☃, cj1, new zx(zw));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected zw l() {
/* 152 */     if (this.N == afi.aU) {
/* 153 */       return zy.bg;
/*     */     }
/*     */     
/* 156 */     if (this.N == afi.bk) {
/* 157 */       return zy.bh;
/*     */     }
/*     */     
/* 160 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 166 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 171 */     zw zw = l();
/*     */     
/* 173 */     return (zw != null) ? zw : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 178 */     return (((Integer)alz1.<Integer>b(a)).intValue() != 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/* 183 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 188 */     g(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 193 */     return Q().a(a, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 199 */     return ((Integer)☃.<Integer>b(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 204 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */