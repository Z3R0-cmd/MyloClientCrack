/*     */ import com.google.common.collect.Lists;
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
/*     */ public class aqo
/*     */   extends aqq
/*     */ {
/*     */   private List<ady> d;
/*     */   private boolean f;
/*  23 */   private adg[] g = new adg[3];
/*  24 */   private double h = 32.0D;
/*  25 */   private int i = 3;
/*     */ 
/*     */   
/*     */   public aqo() {
/*  29 */     this.d = Lists.newArrayList(); ady[] ☃; int i, j;
/*  30 */     for (☃ = ady.n(), i = ☃.length, j = 0; j < i; ) { ady ady = ☃[j];
/*  31 */       if (ady != null && ady.an > 0.0F)
/*  32 */         this.d.add(ady); 
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public aqo(Map<String, String> ☃) {
/*  38 */     this();
/*  39 */     for (Iterator<Map.Entry<String, String>> iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<String, String> entry = iterator.next();
/*  40 */       if (((String)entry.getKey()).equals("distance")) {
/*  41 */         this.h = ns.a(entry.getValue(), this.h, 1.0D); continue;
/*  42 */       }  if (((String)entry.getKey()).equals("count")) {
/*  43 */         this.g = new adg[ns.a((String)entry.getValue(), this.g.length, 1)]; continue;
/*  44 */       }  if (((String)entry.getKey()).equals("spread")) {
/*  45 */         this.i = ns.a(entry.getValue(), this.i, 1);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  52 */     return "Stronghold";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i) {
/*  57 */     if (!this.f) {
/*  58 */       Random random = new Random();
/*     */       
/*  60 */       random.setSeed(this.c.J());
/*     */       
/*  62 */       double d = random.nextDouble() * Math.PI * 2.0D;
/*  63 */       int m = 1;
/*     */       
/*  65 */       for (int n = 0; n < this.g.length; n++) {
/*  66 */         double d1 = (1.25D * m + random.nextDouble()) * this.h * m;
/*  67 */         int i1 = (int)Math.round(Math.cos(d) * d1);
/*  68 */         int i2 = (int)Math.round(Math.sin(d) * d1);
/*     */         
/*  70 */         cj cj = this.c.v().a((i1 << 4) + 8, (i2 << 4) + 8, 112, this.d, random);
/*  71 */         if (cj != null) {
/*  72 */           i1 = cj.n() >> 4;
/*  73 */           i2 = cj.p() >> 4;
/*     */         } 
/*     */         
/*  76 */         this.g[n] = new adg(i1, i2);
/*     */         
/*  78 */         d += 6.283185307179586D * m / this.i;
/*     */         
/*  80 */         if (n == this.i) {
/*  81 */           m += 2 + random.nextInt(5);
/*  82 */           this.i += 1 + random.nextInt(2);
/*     */         } 
/*     */       } 
/*     */       
/*  86 */       this.f = true;
/*     */     }  adg[] arrayOfAdg; int j; int k;
/*  88 */     for (arrayOfAdg = this.g, j = arrayOfAdg.length, k = 0; k < j; ) { adg adg1 = arrayOfAdg[k];
/*  89 */       if (☃ == adg1.a && i == adg1.b)
/*  90 */         return true; 
/*     */       k++; }
/*     */     
/*  93 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected List<cj> z_() {
/*  98 */     List<cj> ☃ = Lists.newArrayList(); adg[] arrayOfAdg; int i, j;
/*  99 */     for (arrayOfAdg = this.g, i = arrayOfAdg.length, j = 0; j < i; ) { adg adg1 = arrayOfAdg[j];
/* 100 */       if (adg1 != null)
/* 101 */         ☃.add(adg1.a(64)); 
/*     */       j++; }
/*     */     
/* 104 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aqu b(int ☃, int i) {
/* 109 */     a a = new a(this.c, this.b, ☃, i);
/*     */     
/* 111 */     while (a.b().isEmpty() || ((aqp.m)a.b().get(0)).b == null)
/*     */     {
/* 113 */       a = new a(this.c, this.b, ☃, i);
/*     */     }
/*     */     
/* 116 */     return a;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends aqu
/*     */   {
/*     */     public a() {}
/*     */     
/*     */     public a(adm ☃, Random random, int i, int j) {
/* 125 */       super(i, j);
/*     */       
/* 127 */       aqp.b();
/*     */       
/* 129 */       aqp.m m = new aqp.m(0, random, (i << 4) + 2, (j << 4) + 2);
/* 130 */       this.a.add(m);
/* 131 */       m.a(m, this.a, random);
/*     */       
/* 133 */       List<aqt> list = m.c;
/* 134 */       while (!list.isEmpty()) {
/* 135 */         int k = random.nextInt(list.size());
/* 136 */         aqt aqt = list.remove(k);
/* 137 */         aqt.a(m, this.a, random);
/*     */       } 
/*     */       
/* 140 */       c();
/* 141 */       a(☃, random, 10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */