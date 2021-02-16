/*     */ import java.util.EnumSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agl
/*     */   extends ahv
/*     */ {
/*     */   int a;
/*     */   
/*     */   protected agl(arm ☃) {
/*  15 */     super(☃);
/*     */   }
/*     */   
/*     */   private void f(adm ☃, cj cj1, alz alz1) {
/*  19 */     ☃.a(cj1, b(this.J).Q().a(b, alz1.b(b)), 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  26 */     int i = ((Integer)alz1.<Integer>b(b)).intValue();
/*     */     
/*  28 */     int j = 1;
/*  29 */     if (this.J == arm.i && !☃.t.n()) {
/*  30 */       j = 2;
/*     */     }
/*     */     
/*  33 */     int k = a(☃);
/*  34 */     if (i > 0) {
/*  35 */       int m = -100;
/*  36 */       this.a = 0;
/*     */       
/*  38 */       for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/*  39 */         m = a(☃, cj1.a(cq), m); }
/*     */ 
/*     */       
/*  42 */       int n = m + j;
/*  43 */       if (n >= 8 || m < 0) {
/*  44 */         n = -1;
/*     */       }
/*  46 */       if (e(☃, cj1.a()) >= 0) {
/*  47 */         int i1 = e(☃, cj1.a());
/*  48 */         if (i1 >= 8) {
/*  49 */           n = i1;
/*     */         } else {
/*  51 */           n = i1 + 8;
/*     */         } 
/*     */       } 
/*  54 */       if (this.a >= 2 && this.J == arm.h) {
/*     */ 
/*     */         
/*  57 */         alz alz3 = ☃.p(cj1.b());
/*  58 */         if (alz3.c().t().a()) {
/*  59 */           n = 0;
/*  60 */         } else if (alz3.c().t() == this.J && ((Integer)alz3.<Integer>b(b)).intValue() == 0) {
/*  61 */           n = 0;
/*     */         } 
/*     */       } 
/*  64 */       if (this.J == arm.i && 
/*  65 */         i < 8 && n < 8 && 
/*  66 */         n > i && 
/*  67 */         random.nextInt(4) != 0) {
/*  68 */         k *= 4;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  73 */       if (n == i) {
/*  74 */         f(☃, cj1, alz1);
/*     */       } else {
/*  76 */         i = n;
/*  77 */         if (i < 0) {
/*  78 */           ☃.g(cj1);
/*     */         } else {
/*  80 */           alz1 = alz1.a(b, Integer.valueOf(i));
/*  81 */           ☃.a(cj1, alz1, 2);
/*  82 */           ☃.a(cj1, this, k);
/*  83 */           ☃.c(cj1, this);
/*     */         } 
/*     */       } 
/*     */     } else {
/*  87 */       f(☃, cj1, alz1);
/*     */     } 
/*     */     
/*  90 */     alz alz2 = ☃.p(cj1.b());
/*     */     
/*  92 */     if (h(☃, cj1.b(), alz2)) {
/*  93 */       if (this.J == arm.i && 
/*  94 */         ☃.p(cj1.b()).c().t() == arm.h) {
/*  95 */         ☃.a(cj1.b(), afi.b.Q());
/*  96 */         e(☃, cj1.b());
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 101 */       if (i >= 8) {
/* 102 */         a(☃, cj1.b(), alz2, i);
/*     */       } else {
/* 104 */         a(☃, cj1.b(), alz2, i + 8);
/*     */       } 
/* 106 */     } else if (i >= 0 && (i == 0 || g(☃, cj1.b(), alz2))) {
/* 107 */       Set<cq> set = f(☃, cj1);
/* 108 */       int m = i + j;
/* 109 */       if (i >= 8) {
/* 110 */         m = 1;
/*     */       }
/* 112 */       if (m >= 8) {
/*     */         return;
/*     */       }
/* 115 */       for (Iterator<cq> iterator = set.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 116 */         a(☃, cj1.a(cq), ☃.p(cj1.a(cq)), m); }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(adm ☃, cj cj1, alz alz1, int i) {
/* 122 */     if (h(☃, cj1, alz1)) {
/* 123 */       if (alz1.c() != afi.a) {
/* 124 */         if (this.J == arm.i) {
/* 125 */           e(☃, cj1);
/*     */         } else {
/* 127 */           alz1.c().b(☃, cj1, alz1, 0);
/*     */         } 
/*     */       }
/* 130 */       ☃.a(cj1, Q().a(b, Integer.valueOf(i)), 3);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(adm ☃, cj cj1, int i, cq cq1) {
/* 135 */     int j = 1000;
/* 136 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq2 = iterator.next();
/* 137 */       if (cq2 == cq1) {
/*     */         continue;
/*     */       }
/*     */       
/* 141 */       cj cj2 = cj1.a(cq2);
/* 142 */       alz alz = ☃.p(cj2);
/*     */       
/* 144 */       if (!g(☃, cj2, alz) && (alz.c().t() != this.J || ((Integer)alz.<Integer>b(b)).intValue() > 0)) {
/* 145 */         if (g(☃, cj2.b(), alz)) {
/* 146 */           if (i < 4) {
/* 147 */             int k = a(☃, cj2, i + 1, cq2.d());
/* 148 */             if (k < j)
/* 149 */               j = k; 
/*     */           } 
/*     */           continue;
/*     */         } 
/* 153 */         return i;
/*     */       }  }
/*     */ 
/*     */     
/* 157 */     return j;
/*     */   }
/*     */   
/*     */   private Set<cq> f(adm ☃, cj cj1) {
/* 161 */     int i = 1000;
/* 162 */     Set<cq> set = EnumSet.noneOf(cq.class);
/*     */     
/* 164 */     for (Iterator<cq> iterator = cq.c.a.iterator(); iterator.hasNext(); ) { cq cq = iterator.next();
/* 165 */       cj cj2 = cj1.a(cq);
/* 166 */       alz alz = ☃.p(cj2);
/*     */       
/* 168 */       if (!g(☃, cj2, alz) && (alz.c().t() != this.J || ((Integer)alz.<Integer>b(b)).intValue() > 0)) {
/*     */         int j;
/* 170 */         if (g(☃, cj2.b(), ☃.p(cj2.b()))) {
/* 171 */           j = a(☃, cj2, 1, cq.d());
/*     */         } else {
/* 173 */           j = 0;
/*     */         } 
/*     */         
/* 176 */         if (j < i) {
/* 177 */           set.clear();
/*     */         }
/*     */         
/* 180 */         if (j <= i) {
/* 181 */           set.add(cq);
/* 182 */           i = j;
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/* 187 */     return set;
/*     */   }
/*     */   
/*     */   private boolean g(adm ☃, cj cj1, alz alz1) {
/* 191 */     afh afh = ☃.p(cj1).c();
/* 192 */     if (afh instanceof agh || afh == afi.an || afh == afi.au || afh == afi.aM) {
/* 193 */       return true;
/*     */     }
/* 195 */     if (afh.J == arm.E) {
/* 196 */       return true;
/*     */     }
/*     */     
/* 199 */     return afh.J.c();
/*     */   }
/*     */   
/*     */   protected int a(adm ☃, cj cj1, int i) {
/* 203 */     int j = e(☃, cj1);
/* 204 */     if (j < 0) {
/* 205 */       return i;
/*     */     }
/* 207 */     if (j == 0) {
/* 208 */       this.a++;
/*     */     }
/* 210 */     if (j >= 8) {
/* 211 */       j = 0;
/*     */     }
/* 213 */     return (i < 0 || j < i) ? j : i;
/*     */   }
/*     */   
/*     */   private boolean h(adm ☃, cj cj1, alz alz1) {
/* 217 */     arm arm = alz1.c().t();
/* 218 */     return (arm != this.J && arm != arm.i && !g(☃, cj1, alz1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 223 */     if (!e(☃, cj1, alz1))
/* 224 */       ☃.a(cj1, this, a(☃)); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */