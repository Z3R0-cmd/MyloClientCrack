/*     */ import com.google.common.base.Predicate;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agc
/*     */   extends afe
/*     */ {
/*  27 */   public static final amm<afe.b> b = amm.a("shape", afe.b.class, new Predicate<afe.b>()
/*     */       {
/*     */         public boolean a(afe.b ☃) {
/*  30 */           return (☃ != afe.b.j && ☃ != afe.b.i && ☃ != afe.b.g && ☃ != afe.b.h);
/*     */         }
/*     */       });
/*     */ 
/*     */ 
/*     */   
/*  36 */   public static final amk N = amk.a("powered");
/*     */   
/*     */   public agc() {
/*  39 */     super(true);
/*  40 */     j(this.M.b().<Comparable, Boolean>a(N, Boolean.valueOf(false)).a(b, afe.b.a));
/*  41 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  46 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/*  56 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  60 */     if (((Boolean)alz1.<Boolean>b(N)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, Random random) {}
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  73 */     if (☃.D || !((Boolean)alz1.<Boolean>b(N)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  77 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  82 */     return ((Boolean)alz1.<Boolean>b(N)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(adq ☃, cj cj1, alz alz1, cq cq1) {
/*  87 */     if (!((Boolean)alz1.<Boolean>b(N)).booleanValue()) {
/*  88 */       return 0;
/*     */     }
/*  90 */     return (cq1 == cq.b) ? 15 : 0;
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1, alz alz1) {
/*  94 */     boolean bool1 = ((Boolean)alz1.<Boolean>b(N)).booleanValue();
/*  95 */     boolean bool2 = false;
/*     */     
/*  97 */     List<va> list = a(☃, cj1, va.class, (Predicate<pk>[])new Predicate[0]);
/*  98 */     if (!list.isEmpty()) {
/*  99 */       bool2 = true;
/*     */     }
/*     */     
/* 102 */     if (bool2 && !bool1) {
/* 103 */       ☃.a(cj1, alz1.a(N, Boolean.valueOf(true)), 3);
/* 104 */       ☃.c(cj1, this);
/* 105 */       ☃.c(cj1.b(), this);
/* 106 */       ☃.b(cj1, cj1);
/*     */     } 
/*     */     
/* 109 */     if (!bool2 && bool1) {
/* 110 */       ☃.a(cj1, alz1.a(N, Boolean.valueOf(false)), 3);
/* 111 */       ☃.c(cj1, this);
/* 112 */       ☃.c(cj1.b(), this);
/* 113 */       ☃.b(cj1, cj1);
/*     */     } 
/*     */     
/* 116 */     if (bool2) {
/* 117 */       ☃.a(cj1, this, a(☃));
/*     */     }
/*     */     
/* 120 */     ☃.e(cj1, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/* 125 */     super.c(☃, cj1, alz1);
/* 126 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public amo<afe.b> n() {
/* 131 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 141 */     if (((Boolean)☃.p(cj1).<Boolean>b(N)).booleanValue()) {
/* 142 */       List<vc> list = a(☃, cj1, vc.class, (Predicate<pk>[])new Predicate[0]);
/* 143 */       if (!list.isEmpty()) {
/* 144 */         return ((vc)list.get(0)).j().j();
/*     */       }
/*     */       
/* 147 */       List<va> list1 = a(☃, cj1, va.class, (Predicate<pk>[])new Predicate[] { po.c });
/* 148 */       if (!list1.isEmpty()) {
/* 149 */         return xi.b((og)list1.get(0));
/*     */       }
/*     */     } 
/*     */     
/* 153 */     return 0;
/*     */   }
/*     */   
/*     */   protected <T extends va> List<T> a(adm ☃, cj cj1, Class<T> clazz, Predicate<pk>... arrayOfPredicate) {
/* 157 */     aug aug = a(cj1);
/*     */     
/* 159 */     if (arrayOfPredicate.length != 1) {
/* 160 */       return (List)☃.a((Class)clazz, aug);
/*     */     }
/* 162 */     return (List)☃.a((Class)clazz, aug, arrayOfPredicate[0]);
/*     */   }
/*     */   
/*     */   private aug a(cj ☃) {
/* 166 */     float f = 0.2F;
/*     */     
/* 168 */     return new aug((☃.n() + 0.2F), ☃.o(), (☃.p() + 0.2F), ((☃.n() + 1) - 0.2F), ((☃.o() + 1) - 0.2F), ((☃.p() + 1) - 0.2F));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 173 */     return Q().<afe.b, afe.b>a(b, afe.b.a(☃ & 0x7)).a(N, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 180 */     int i = 0;
/*     */     
/* 182 */     i |= ((afe.b)☃.<afe.b>b(b)).a();
/*     */     
/* 184 */     if (((Boolean)☃.<Boolean>b(N)).booleanValue()) {
/* 185 */       i |= 0x8;
/*     */     }
/*     */     
/* 188 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 193 */     return new ama(this, new amo[] { b, N });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */