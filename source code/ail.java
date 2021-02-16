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
/*     */ public class ail
/*     */   extends ahw
/*     */ {
/*  15 */   public static final amm<aio.a> b = amm.a("variant", aio.a.class, new Predicate<aio.a>()
/*     */       {
/*     */         public boolean a(aio.a ☃) {
/*  18 */           return (☃.a() < 4);
/*     */         }
/*     */       });
/*     */   
/*     */   public ail() {
/*  23 */     j(this.M.b().<aio.a, aio.a>a(b, aio.a.a).a(a, ahw.a.b));
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
/*  37 */             return aio.a.b.c();
/*     */           case 2:
/*  39 */             return aio.a.f.c();
/*     */           case 3:
/*  41 */             return arn.p;
/*     */           case 4:
/*  43 */             break; }  return aio.a.b.c();
/*     */       case 4:
/*     */         break;
/*  46 */     }  return a.c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  52 */     list.add(new zx(☃, 1, aio.a.a.a()));
/*  53 */     list.add(new zx(☃, 1, aio.a.b.a()));
/*  54 */     list.add(new zx(☃, 1, aio.a.c.a()));
/*  55 */     list.add(new zx(☃, 1, aio.a.d.a()));
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/*  60 */     alz alz = Q().a(b, aio.a.a((☃ & 0x3) % 4));
/*     */ 
/*     */     
/*  63 */     switch (☃ & 0xC)
/*     */     { case 0:
/*  65 */         alz = alz.a(a, ahw.a.b);
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
/*  78 */         return alz;case 4: alz = alz.a(a, ahw.a.a); return alz;case 8: alz = alz.a(a, ahw.a.c); return alz; }  alz = alz.a(a, ahw.a.d); return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  83 */     int i = 0;
/*     */     
/*  85 */     i |= ((aio.a)☃.<aio.a>b(b)).a();
/*     */     
/*  87 */     switch (null.b[((ahw.a)☃.b((amo)a)).ordinal()]) {
/*     */       case 1:
/*  89 */         i |= 0x4;
/*     */         break;
/*     */       case 2:
/*  92 */         i |= 0x8;
/*     */         break;
/*     */       case 3:
/*  95 */         i |= 0xC;
/*     */         break;
/*     */     } 
/*     */     
/*  99 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 104 */     return new ama(this, new amo[] { b, a });
/*     */   }
/*     */ 
/*     */   
/*     */   protected zx i(alz ☃) {
/* 109 */     return new zx(zw.a(this), 1, ((aio.a)☃.<aio.a>b(b)).a());
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 114 */     return ((aio.a)☃.<aio.a>b(b)).a();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */