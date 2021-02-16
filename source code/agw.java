/*     */ import com.google.common.base.Predicate;
/*     */ import com.google.common.collect.Collections2;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
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
/*     */ public abstract class agw
/*     */   extends afm
/*     */ {
/*     */   protected amm<a> a;
/*     */   
/*     */   protected agw() {
/*  23 */     j(this.M.b().a(n(), (l() == b.b) ? a.b : a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  28 */     return ((a)☃.<a>b(n())).b();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/*  33 */     for (arrayOfA = a.a(l()), i = arrayOfA.length, j = 0; j < i; ) { a a = arrayOfA[j];
/*  34 */       list.add(new zx(☃, 1, a.b()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public alz a(int ☃) {
/*  40 */     return Q().a(n(), a.a(l(), ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract b l();
/*     */   
/*     */   public amo<a> n() {
/*  47 */     if (this.a == null) {
/*  48 */       this.a = amm.a("type", a.class, new Predicate<a>(this)
/*     */           {
/*     */             public boolean a(agw.a ☃) {
/*  51 */               return (☃.a() == this.a.l());
/*     */             }
/*     */           });
/*     */     }
/*  55 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/*  60 */     return ((a)☃.<a>b(n())).b();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/*  65 */     return new ama(this, new amo[] { n() });
/*     */   }
/*     */   
/*     */   public enum b {
/*  69 */     a,
/*  70 */     b;
/*     */ 
/*     */     
/*     */     public agw a() {
/*  74 */       if (this == a) {
/*  75 */         return afi.N;
/*     */       }
/*  77 */       return afi.O;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum a
/*     */     implements nw {
/*  83 */     a((String)agw.b.a, 0, (agw.b)"dandelion"),
/*  84 */     b((String)agw.b.b, 0, (agw.b)"poppy"),
/*  85 */     c((String)agw.b.b, 1, (agw.b)"blue_orchid", "blueOrchid"),
/*  86 */     d((String)agw.b.b, 2, (agw.b)"allium"),
/*  87 */     e((String)agw.b.b, 3, (agw.b)"houstonia"),
/*  88 */     f((String)agw.b.b, 4, (agw.b)"red_tulip", "tulipRed"),
/*  89 */     g((String)agw.b.b, 5, (agw.b)"orange_tulip", "tulipOrange"),
/*  90 */     h((String)agw.b.b, 6, (agw.b)"white_tulip", "tulipWhite"),
/*  91 */     i((String)agw.b.b, 7, (agw.b)"pink_tulip", "tulipPink"),
/*  92 */     j((String)agw.b.b, 8, (agw.b)"oxeye_daisy", "oxeyeDaisy");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     private static final a[][] k = new a[(agw.b.values()).length][]; private final agw.b l; static { agw.b[] ☃;
/*     */       int i, j;
/* 104 */       for (☃ = agw.b.values(), i = ☃.length, j = 0; j < i; ) { agw.b b1 = ☃[j];
/* 105 */         Collection<a> collection = Collections2.filter(Lists.newArrayList((Object[])values()), new Predicate<a>(b1)
/*     */             {
/*     */               public boolean a(agw.a ☃) {
/* 108 */                 return (☃.a() == this.a);
/*     */               }
/*     */             });
/*     */         
/* 112 */         k[b1.ordinal()] = collection.<a>toArray(new a[collection.size()]);
/*     */         j++; }
/*     */        }
/*     */     
/*     */     private final int m;
/*     */     private final String n;
/*     */     private final String o;
/*     */     
/*     */     a(agw.b ☃, int i, String str1, String str2) {
/* 121 */       this.l = ☃;
/* 122 */       this.m = i;
/* 123 */       this.n = str1;
/* 124 */       this.o = str2;
/*     */     }
/*     */     
/*     */     public agw.b a() {
/* 128 */       return this.l;
/*     */     }
/*     */     
/*     */     public int b() {
/* 132 */       return this.m;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a(agw.b ☃, int i) {
/* 140 */       a[] arrayOfA = k[☃.ordinal()];
/* 141 */       if (i < 0 || i >= arrayOfA.length) {
/* 142 */         i = 0;
/*     */       }
/* 144 */       return arrayOfA[i];
/*     */     }
/*     */     
/*     */     public static a[] a(agw.b ☃) {
/* 148 */       return k[☃.ordinal()];
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 153 */       return this.n;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 158 */       return this.n;
/*     */     }
/*     */     
/*     */     public String d() {
/* 162 */       return this.o;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public afh.a R() {
/* 168 */     return afh.a.b;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */