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
/*     */ public abstract class akr
/*     */   extends ahh
/*     */ {
/*  20 */   public static final amm<aio.a> b = amm.a("variant", aio.a.class);
/*     */   
/*     */   public akr() {
/*  23 */     super(arm.d);
/*  24 */     alz ☃ = this.M.b();
/*  25 */     if (!l()) {
/*  26 */       ☃ = ☃.a(a, ahh.a.b);
/*     */     }
/*  28 */     j(☃.a(b, aio.a.a));
/*  29 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/*  34 */     return ((aio.a)☃.<aio.a>b(b)).c();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  40 */     return zw.a(afi.bM);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  45 */     return zw.a(afi.bM);
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(int ☃) {
/*  50 */     return a() + "." + aio.a.a(☃).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public amo<?> n() {
/*  55 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object a(zx ☃) {
/*  60 */     return aio.a.a(☃.i() & 0x7);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  65 */     if (☃ == zw.a(afi.bL))
/*     */       return;  aio.a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  69 */     for (arrayOfA = aio.a.values(), i = arrayOfA.length, j = 0; j < i; ) { aio.a a = arrayOfA[j];
/*  70 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  76 */     alz alz = Q().a(b, aio.a.a(☃ & 0x7));
/*     */     
/*  78 */     if (!l()) {
/*  79 */       alz = alz.a(a, ((☃ & 0x8) == 0) ? ahh.a.b : ahh.a.a);
/*     */     }
/*     */     
/*  82 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  87 */     int i = 0;
/*     */     
/*  89 */     i |= ((aio.a)☃.<aio.a>b(b)).a();
/*     */     
/*  91 */     if (!l() && ☃.b(a) == ahh.a.a) {
/*  92 */       i |= 0x8;
/*     */     }
/*     */     
/*  95 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 100 */     if (l()) {
/* 101 */       return new ama(this, new amo[] { b });
/*     */     }
/*     */     
/* 104 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 109 */     return ((aio.a)☃.<aio.a>b(b)).a();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/akr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */