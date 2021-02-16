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
/*     */ public class aif
/*     */   extends ahs
/*     */ {
/*  20 */   public static final amm<aio.a> Q = amm.a("variant", aio.a.class, new Predicate<aio.a>()
/*     */       {
/*     */         public boolean a(aio.a ☃) {
/*  23 */           return (☃.a() >= 4);
/*     */         }
/*     */       });
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aif() {
/*  31 */     j(this.M.b().<aio.a, aio.a>a(Q, aio.a.e).<Comparable, Boolean>a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(adm ☃, cj cj1, alz alz1, int i) {
/*  36 */     if (alz1.b(Q) == aio.a.f && ☃.s.nextInt(i) == 0) {
/*  37 */       a(☃, cj1, new zx(zy.e, 1, 0));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  43 */     return ((aio.a)☃.<aio.a>b(Q)).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/*  48 */     alz alz = ☃.p(cj1);
/*  49 */     return alz.c().c(alz) & 0x3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  54 */     list.add(new zx(☃, 1, 0));
/*  55 */     list.add(new zx(☃, 1, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/*  60 */     return new zx(zw.a(this), 1, ((aio.a)☃.<aio.a>b(Q)).a() - 4);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  65 */     return Q().<aio.a, aio.a>a(Q, b(☃)).<Comparable, Boolean>a(a, Boolean.valueOf(((☃ & 0x4) == 0))).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  73 */     int i = 0;
/*     */     
/*  75 */     i |= ((aio.a)☃.<aio.a>b(Q)).a() - 4;
/*     */     
/*  77 */     if (!((Boolean)☃.<Boolean>b(a)).booleanValue()) {
/*  78 */       i |= 0x4;
/*     */     }
/*     */     
/*  81 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/*  82 */       i |= 0x8;
/*     */     }
/*     */     
/*  85 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public aio.a b(int ☃) {
/*  90 */     return aio.a.a((☃ & 0x3) + 4);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  95 */     return new ama(this, new amo[] { Q, b, a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 100 */     if (!☃.D && wn1.bZ() != null && wn1.bZ().b() == zy.be) {
/* 101 */       wn1.b(na.ab[afh.a(this)]);
/*     */ 
/*     */       
/* 104 */       a(☃, cj1, new zx(zw.a(this), 1, ((aio.a)alz1.<aio.a>b(Q)).a() - 4));
/*     */       
/*     */       return;
/*     */     } 
/* 108 */     super.a(☃, wn1, cj1, alz1, akw1);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */