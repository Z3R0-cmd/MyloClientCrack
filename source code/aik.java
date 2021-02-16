/*     */ import com.google.common.base.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aik
/*     */   extends ahs
/*     */ {
/*  22 */   public static final amm<aio.a> Q = amm.a("variant", aio.a.class, new Predicate<aio.a>()
/*     */       {
/*     */         public boolean a(aio.a ☃) {
/*  25 */           return (☃.a() < 4);
/*     */         }
/*     */       });
/*     */   
/*     */   public aik() {
/*  30 */     j(this.M.b().<aio.a, aio.a>a(Q, aio.a.a).<Comparable, Boolean>a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int h(alz ☃) {
/*  35 */     if (☃.c() != this) {
/*  36 */       return super.h(☃);
/*     */     }
/*     */     
/*  39 */     aio.a a = ☃.<aio.a>b(Q);
/*  40 */     if (a == aio.a.b) {
/*  41 */       return adj.a();
/*     */     }
/*  43 */     if (a == aio.a.c) {
/*  44 */       return adj.b();
/*     */     }
/*     */     
/*  47 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adq ☃, cj cj1, int i) {
/*  52 */     alz alz = ☃.p(cj1);
/*  53 */     if (alz.c() == this) {
/*  54 */       aio.a a = alz.<aio.a>b(Q);
/*     */       
/*  56 */       if (a == aio.a.b) {
/*  57 */         return adj.a();
/*     */       }
/*  59 */       if (a == aio.a.c) {
/*  60 */         return adj.b();
/*     */       }
/*     */     } 
/*     */     
/*  64 */     return super.a(☃, cj1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, cj cj1, alz alz1, int i) {
/*  69 */     if (alz1.b(Q) == aio.a.a && ☃.s.nextInt(i) == 0) {
/*  70 */       a(☃, cj1, new zx(zy.e, 1, 0));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(alz ☃) {
/*  76 */     if (☃.b(Q) == aio.a.d) {
/*  77 */       return 40;
/*     */     }
/*     */     
/*  80 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  85 */     list.add(new zx(☃, 1, aio.a.a.a()));
/*  86 */     list.add(new zx(☃, 1, aio.a.b.a()));
/*  87 */     list.add(new zx(☃, 1, aio.a.c.a()));
/*  88 */     list.add(new zx(☃, 1, aio.a.d.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/*  93 */     return new zx(zw.a(this), 1, ((aio.a)☃.<aio.a>b(Q)).a());
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  98 */     return Q().<aio.a, aio.a>a(Q, b(☃)).<Comparable, Boolean>a(a, Boolean.valueOf(((☃ & 0x4) == 0))).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 106 */     int i = 0;
/*     */     
/* 108 */     i |= ((aio.a)☃.<aio.a>b(Q)).a();
/*     */     
/* 110 */     if (!((Boolean)☃.<Boolean>b(a)).booleanValue()) {
/* 111 */       i |= 0x4;
/*     */     }
/*     */     
/* 114 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 115 */       i |= 0x8;
/*     */     }
/*     */     
/* 118 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public aio.a b(int ☃) {
/* 123 */     return aio.a.a((☃ & 0x3) % 4);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 128 */     return new ama(this, new amo[] { Q, b, a });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 133 */     return ((aio.a)☃.<aio.a>b(Q)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 138 */     if (!☃.D && wn1.bZ() != null && wn1.bZ().b() == zy.be) {
/* 139 */       wn1.b(na.ab[afh.a(this)]);
/*     */ 
/*     */       
/* 142 */       a(☃, cj1, new zx(zw.a(this), 1, ((aio.a)alz1.<aio.a>b(Q)).a()));
/*     */       
/*     */       return;
/*     */     } 
/* 146 */     super.a(☃, wn1, cj1, alz1, akw1);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */