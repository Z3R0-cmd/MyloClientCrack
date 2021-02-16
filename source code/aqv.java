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
/*     */ public class aqv
/*     */   extends aqq
/*     */ {
/*  18 */   public static final List<ady> d = Arrays.asList(new ady[] { ady.q, ady.r, ady.Y });
/*     */   
/*     */   private int f;
/*  21 */   private int g = 32;
/*  22 */   private int h = 8;
/*     */ 
/*     */   
/*     */   public aqv() {}
/*     */ 
/*     */   
/*     */   public aqv(Map<String, String> ☃) {
/*  29 */     this();
/*     */     
/*  31 */     for (Iterator<Map.Entry<String, String>> iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<String, String> entry = iterator.next();
/*  32 */       if (((String)entry.getKey()).equals("size")) {
/*  33 */         this.f = ns.a(entry.getValue(), this.f, 0); continue;
/*  34 */       }  if (((String)entry.getKey()).equals("distance")) {
/*  35 */         this.g = ns.a(entry.getValue(), this.g, this.h + 1);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  42 */     return "Village";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i) {
/*  47 */     int j = ☃;
/*  48 */     int k = i;
/*  49 */     if (☃ < 0) {
/*  50 */       ☃ -= this.g - 1;
/*     */     }
/*  52 */     if (i < 0) {
/*  53 */       i -= this.g - 1;
/*     */     }
/*     */     
/*  56 */     int m = ☃ / this.g;
/*  57 */     int n = i / this.g;
/*  58 */     Random random = this.c.a(m, n, 10387312);
/*  59 */     m *= this.g;
/*  60 */     n *= this.g;
/*  61 */     m += random.nextInt(this.g - this.h);
/*  62 */     n += random.nextInt(this.g - this.h);
/*  63 */     ☃ = j;
/*  64 */     i = k;
/*     */     
/*  66 */     if (☃ == m && i == n) {
/*  67 */       boolean bool = this.c.v().a(☃ * 16 + 8, i * 16 + 8, 0, d);
/*  68 */       if (bool) {
/*  69 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aqu b(int ☃, int i) {
/*  78 */     return new a(this.c, this.b, ☃, i, this.f);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends aqu
/*     */   {
/*     */     private boolean c;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public a(adm ☃, Random random, int i, int j, int k) {
/*  89 */       super(i, j);
/*     */       
/*  91 */       List<aqw.e> list = aqw.a(random, k);
/*     */       
/*  93 */       aqw.k k1 = new aqw.k(☃.v(), 0, random, (i << 4) + 2, (j << 4) + 2, list, k);
/*  94 */       this.a.add(k1);
/*  95 */       k1.a(k1, this.a, random);
/*     */       
/*  97 */       List<aqt> list1 = k1.g;
/*  98 */       List<aqt> list2 = k1.f;
/*  99 */       while (!list1.isEmpty() || !list2.isEmpty()) {
/*     */         
/* 101 */         if (list1.isEmpty()) {
/* 102 */           int i1 = random.nextInt(list2.size());
/* 103 */           aqt aqt1 = list2.remove(i1);
/* 104 */           aqt1.a(k1, this.a, random); continue;
/*     */         } 
/* 106 */         int n = random.nextInt(list1.size());
/* 107 */         aqt aqt = list1.remove(n);
/* 108 */         aqt.a(k1, this.a, random);
/*     */       } 
/*     */ 
/*     */       
/* 112 */       c();
/*     */       
/* 114 */       int m = 0;
/* 115 */       for (Iterator<aqt> iterator = this.a.iterator(); iterator.hasNext(); ) { aqt aqt = iterator.next();
/* 116 */         if (!(aqt instanceof aqw.o)) {
/* 117 */           m++;
/*     */         } }
/*     */       
/* 120 */       this.c = (m > 2);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean d() {
/* 125 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dn ☃) {
/* 130 */       super.a(☃);
/*     */       
/* 132 */       ☃.a("Valid", this.c);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dn ☃) {
/* 137 */       super.b(☃);
/* 138 */       this.c = ☃.n("Valid");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */