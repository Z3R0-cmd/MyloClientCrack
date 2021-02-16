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
/*     */ public abstract class aih
/*     */   extends ahh
/*     */ {
/*  23 */   public static final amk b = amk.a("seamless");
/*  24 */   public static final amm<a> N = amm.a("variant", a.class);
/*     */   
/*     */   public aih() {
/*  27 */     super(arm.e);
/*  28 */     alz ☃ = this.M.b();
/*  29 */     if (l()) {
/*  30 */       ☃ = ☃.a(b, Boolean.valueOf(false));
/*     */     } else {
/*  32 */       ☃ = ☃.a(a, ahh.a.b);
/*     */     } 
/*  34 */     j(☃.a(N, a.a));
/*  35 */     a(yz.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  40 */     return di.a(a() + ".red_sandstone.name");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  46 */     return zw.a(afi.cP);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  51 */     return zw.a(afi.cP);
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(int ☃) {
/*  56 */     return a() + "." + a.a(☃).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public amo<?> n() {
/*  61 */     return N;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object a(zx ☃) {
/*  66 */     return a.a(☃.i() & 0x7);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  71 */     if (☃ == zw.a(afi.cO))
/*     */       return;  a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  75 */     for (arrayOfA = a.values(), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  76 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  82 */     alz alz = Q().a(N, a.a(☃ & 0x7));
/*     */     
/*  84 */     if (l()) {
/*  85 */       alz = alz.a(b, Boolean.valueOf(((☃ & 0x8) != 0)));
/*     */     } else {
/*  87 */       alz = alz.a(a, ((☃ & 0x8) == 0) ? ahh.a.b : ahh.a.a);
/*     */     } 
/*     */     
/*  90 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  95 */     int i = 0;
/*     */     
/*  97 */     i |= ((a)☃.<a>b(N)).a();
/*     */     
/*  99 */     if (l()) {
/* 100 */       if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 101 */         i |= 0x8;
/*     */       }
/*     */     }
/* 104 */     else if (☃.b(a) == ahh.a.a) {
/* 105 */       i |= 0x8;
/*     */     } 
/*     */ 
/*     */     
/* 109 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 114 */     if (l()) {
/* 115 */       return new ama(this, new amo[] { b, N });
/*     */     }
/*     */     
/* 118 */     return new ama(this, new amo[] { a, N });
/*     */   }
/*     */ 
/*     */   
/*     */   public arn g(alz ☃) {
/* 123 */     return ((a)☃.<a>b(N)).c();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 128 */     return ((a)☃.<a>b(N)).a();
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 132 */     a(0, "red_sandstone", ajh.a.b.c());
/*     */ 
/*     */     
/*     */     private final arn e;
/*     */     
/*     */     private final String d;
/*     */     
/*     */     private final int c;
/*     */     
/* 141 */     private static final a[] b = new a[(values()).length]; static { a[] ☃;
/*     */       int i, j;
/* 143 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 144 */         b[a1.a()] = a1;
/*     */         j++; }
/*     */        }
/*     */     
/*     */     a(int ☃, String str1, arn arn1) {
/* 149 */       this.c = ☃;
/* 150 */       this.d = str1;
/* 151 */       this.e = arn1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 155 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public arn c() {
/* 163 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 168 */       return this.d;
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 172 */       if (☃ < 0 || ☃ >= b.length) {
/* 173 */         ☃ = 0;
/*     */       }
/* 175 */       return b[☃];
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 180 */       return this.d;
/*     */     }
/*     */     
/*     */     public String d() {
/* 184 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */