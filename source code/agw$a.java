/*     */ import com.google.common.base.Predicate;
/*     */ import com.google.common.collect.Collections2;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
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
/*     */ public enum a
/*     */   implements nw
/*     */ {
/*  83 */   a(agw.b.a, 0, "dandelion"),
/*  84 */   b(agw.b.b, 0, "poppy"),
/*  85 */   c(agw.b.b, 1, "blue_orchid", "blueOrchid"),
/*  86 */   d(agw.b.b, 2, "allium"),
/*  87 */   e(agw.b.b, 3, "houstonia"),
/*  88 */   f(agw.b.b, 4, "red_tulip", "tulipRed"),
/*  89 */   g(agw.b.b, 5, "orange_tulip", "tulipOrange"),
/*  90 */   h(agw.b.b, 6, "white_tulip", "tulipWhite"),
/*  91 */   i(agw.b.b, 7, "pink_tulip", "tulipPink"),
/*  92 */   j(agw.b.b, 8, "oxeye_daisy", "oxeyeDaisy");
/*     */   
/*     */   private static final a[][] k;
/*     */   
/*     */   private final agw.b l;
/*     */   private final int m;
/*     */   private final String n;
/*     */   private final String o;
/*     */   
/*     */   static {
/* 102 */     k = new a[(agw.b.values()).length][]; agw.b[] ☃;
/*     */     int i, j;
/* 104 */     for (☃ = agw.b.values(), i = ☃.length, j = 0; j < i; ) { agw.b b1 = ☃[j];
/* 105 */       Collection<a> collection = Collections2.filter(Lists.newArrayList((Object[])values()), new Predicate<a>(b1)
/*     */           {
/*     */             public boolean a(agw.a ☃) {
/* 108 */               return (☃.a() == this.a);
/*     */             }
/*     */           });
/*     */       
/* 112 */       k[b1.ordinal()] = collection.<a>toArray(new a[collection.size()]);
/*     */       j++; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(agw.b ☃, int i, String str1, String str2) {
/* 121 */     this.l = ☃;
/* 122 */     this.m = i;
/* 123 */     this.n = str1;
/* 124 */     this.o = str2;
/*     */   }
/*     */   
/*     */   public agw.b a() {
/* 128 */     return this.l;
/*     */   }
/*     */   
/*     */   public int b() {
/* 132 */     return this.m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a(agw.b ☃, int i) {
/* 140 */     a[] arrayOfA = k[☃.ordinal()];
/* 141 */     if (i < 0 || i >= arrayOfA.length) {
/* 142 */       i = 0;
/*     */     }
/* 144 */     return arrayOfA[i];
/*     */   }
/*     */   
/*     */   public static a[] a(agw.b ☃) {
/* 148 */     return k[☃.ordinal()];
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 153 */     return this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public String l() {
/* 158 */     return this.n;
/*     */   }
/*     */   
/*     */   public String d() {
/* 162 */     return this.o;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/agw$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */