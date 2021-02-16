/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class aqm
/*     */   extends aqq
/*     */ {
/*  22 */   private static final List<ady> d = Arrays.asList(new ady[] { ady.r, ady.G, ady.K, ady.L, ady.v });
/*     */   
/*  24 */   private List<ady.c> f = Lists.newArrayList();
/*  25 */   private int g = 32;
/*  26 */   private int h = 8;
/*     */ 
/*     */ 
/*     */   
/*     */   public aqm() {
/*  31 */     this.f.add(new ady.c((Class)wd.class, 1, 1, 1));
/*     */   }
/*     */   
/*     */   public aqm(Map<String, String> ☃) {
/*  35 */     this();
/*     */     
/*  37 */     for (Iterator<Map.Entry<String, String>> iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<String, String> entry = iterator.next();
/*  38 */       if (((String)entry.getKey()).equals("distance")) {
/*  39 */         this.g = ns.a(entry.getValue(), this.g, this.h + 1);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  46 */     return "Temple";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i) {
/*  51 */     int j = ☃;
/*  52 */     int k = i;
/*  53 */     if (☃ < 0) {
/*  54 */       ☃ -= this.g - 1;
/*     */     }
/*  56 */     if (i < 0) {
/*  57 */       i -= this.g - 1;
/*     */     }
/*     */     
/*  60 */     int m = ☃ / this.g;
/*  61 */     int n = i / this.g;
/*  62 */     Random random = this.c.a(m, n, 14357617);
/*  63 */     m *= this.g;
/*  64 */     n *= this.g;
/*  65 */     m += random.nextInt(this.g - this.h);
/*  66 */     n += random.nextInt(this.g - this.h);
/*  67 */     ☃ = j;
/*  68 */     i = k;
/*     */     
/*  70 */     if (☃ == m && i == n) {
/*  71 */       ady ady = this.c.v().a(new cj(☃ * 16 + 8, 0, i * 16 + 8));
/*  72 */       if (ady == null) {
/*  73 */         return false;
/*     */       }
/*  75 */       for (Iterator<ady> iterator = d.iterator(); iterator.hasNext(); ) { ady ady1 = iterator.next();
/*  76 */         if (ady == ady1) {
/*  77 */           return true;
/*     */         } }
/*     */     
/*     */     } 
/*     */     
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aqu b(int ☃, int i) {
/*  87 */     return new a(this.c, this.b, ☃, i);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends aqu
/*     */   {
/*     */     public a() {}
/*     */     
/*     */     public a(adm ☃, Random random, int i, int j) {
/*  96 */       super(i, j);
/*  97 */       ady ady = ☃.b(new cj(i * 16 + 8, 0, j * 16 + 8));
/*  98 */       if (ady == ady.K || ady == ady.L) {
/*  99 */         aqn.b b = new aqn.b(random, i * 16, j * 16);
/* 100 */         this.a.add(b);
/* 101 */       } else if (ady == ady.v) {
/* 102 */         aqn.d d = new aqn.d(random, i * 16, j * 16);
/* 103 */         this.a.add(d);
/* 104 */       } else if (ady == ady.r || ady == ady.G) {
/* 105 */         aqn.a a1 = new aqn.a(random, i * 16, j * 16);
/* 106 */         this.a.add(a1);
/*     */       } 
/*     */       
/* 109 */       c();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(cj ☃) {
/* 114 */     aqu aqu = c(☃);
/* 115 */     if (aqu == null || !(aqu instanceof a) || aqu.a.isEmpty()) {
/* 116 */       return false;
/*     */     }
/* 118 */     aqt aqt = aqu.a.getFirst();
/* 119 */     return aqt instanceof aqn.d;
/*     */   }
/*     */   
/*     */   public List<ady.c> b() {
/* 123 */     return this.f;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */