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
/*     */ public class aig
/*     */   extends ahw
/*     */ {
/*  15 */   public static final amm<aio.a> b = amm.a("variant", aio.a.class, new Predicate<aio.a>()
/*     */       {
/*     */         public boolean a(aio.a ☃) {
/*  18 */           return (☃.a() >= 4);
/*     */         }
/*     */       });
/*     */   
/*     */   public aig() {
/*  23 */     j(this.M.b().<aio.a, aio.a>a(b, aio.a.e).a(a, ahw.a.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  28 */     aio.a a = ☃.<aio.a>b(b);
/*  29 */     switch (null.b[((ahw.a)☃.b((amo)a)).ordinal()]) {
/*     */ 
/*     */ 
/*     */       
/*     */       default:
/*  34 */         switch (null.a[a.ordinal()])
/*     */         
/*     */         { default:
/*  37 */             return arn.m;
/*     */           case 2:
/*  39 */             break; }  return aio.a.f.c();
/*     */       case 4:
/*     */         break;
/*  42 */     }  return a.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  48 */     list.add(new zx(☃, 1, aio.a.e.a() - 4));
/*  49 */     list.add(new zx(☃, 1, aio.a.f.a() - 4));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  54 */     alz alz = Q().a(b, aio.a.a((☃ & 0x3) + 4));
/*     */ 
/*     */     
/*  57 */     switch (☃ & 0xC)
/*     */     { case 0:
/*  59 */         alz = alz.a(a, ahw.a.b);
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
/*  72 */         return alz;case 4: alz = alz.a(a, ahw.a.a); return alz;case 8: alz = alz.a(a, ahw.a.c); return alz; }  alz = alz.a(a, ahw.a.d); return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  77 */     int i = 0;
/*     */     
/*  79 */     i |= ((aio.a)☃.<aio.a>b(b)).a() - 4;
/*     */     
/*  81 */     switch (null.b[((ahw.a)☃.b((amo)a)).ordinal()]) {
/*     */       case 1:
/*  83 */         i |= 0x4;
/*     */         break;
/*     */       case 2:
/*  86 */         i |= 0x8;
/*     */         break;
/*     */       case 3:
/*  89 */         i |= 0xC;
/*     */         break;
/*     */     } 
/*     */     
/*  93 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  98 */     return new ama(this, new amo[] { b, a });
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/* 103 */     return new zx(zw.a(this), 1, ((aio.a)☃.<aio.a>b(b)).a() - 4);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 108 */     return ((aio.a)☃.<aio.a>b(b)).a() - 4;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */