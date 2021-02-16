/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class aqk
/*     */   extends aqq
/*     */ {
/*  24 */   private int f = 32;
/*  25 */   private int g = 5;
/*     */   
/*  27 */   public static final List<ady> d = Arrays.asList(new ady[] { ady.p, ady.N, ady.w, ady.z, ady.A });
/*     */   
/*  29 */   private static final List<ady.c> h = Lists.newArrayList();
/*     */   static {
/*  31 */     h.add(new ady.c((Class)vt.class, 1, 2, 4));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aqk(Map<String, String> ☃) {
/*  39 */     this();
/*  40 */     for (Iterator<Map.Entry<String, String>> iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<String, String> entry = iterator.next();
/*  41 */       if (((String)entry.getKey()).equals("spacing")) {
/*  42 */         this.f = ns.a(entry.getValue(), this.f, 1); continue;
/*  43 */       }  if (((String)entry.getKey()).equals("separation")) {
/*  44 */         this.g = ns.a(entry.getValue(), this.g, 1);
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  51 */     return "Monument";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃, int i) {
/*  56 */     int j = ☃;
/*  57 */     int k = i;
/*  58 */     if (☃ < 0) {
/*  59 */       ☃ -= this.f - 1;
/*     */     }
/*  61 */     if (i < 0) {
/*  62 */       i -= this.f - 1;
/*     */     }
/*     */     
/*  65 */     int m = ☃ / this.f;
/*  66 */     int n = i / this.f;
/*     */     
/*  68 */     Random random = this.c.a(m, n, 10387313);
/*  69 */     m *= this.f;
/*  70 */     n *= this.f;
/*  71 */     m += (random.nextInt(this.f - this.g) + random.nextInt(this.f - this.g)) / 2;
/*  72 */     n += (random.nextInt(this.f - this.g) + random.nextInt(this.f - this.g)) / 2;
/*     */     
/*  74 */     ☃ = j;
/*  75 */     i = k;
/*  76 */     if (☃ == m && i == n) {
/*     */       
/*  78 */       if (this.c.v().a(new cj(☃ * 16 + 8, 64, i * 16 + 8), (ady)null) != ady.N) {
/*  79 */         return false;
/*     */       }
/*     */       
/*  82 */       boolean bool = this.c.v().a(☃ * 16 + 8, i * 16 + 8, 29, d);
/*  83 */       if (bool) {
/*  84 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  88 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aqu b(int ☃, int i) {
/*  93 */     return new a(this.c, this.b, ☃, i);
/*     */   }
/*     */   
/*     */   public static class a extends aqu {
/*  97 */     private Set<adg> c = Sets.newHashSet();
/*     */     
/*     */     private boolean d;
/*     */ 
/*     */     
/*     */     public a() {}
/*     */ 
/*     */     
/*     */     public a(adm ☃, Random random, int i, int j) {
/* 106 */       super(i, j);
/* 107 */       b(☃, random, i, j);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private void b(adm ☃, Random random, int i, int j) {
/* 113 */       random.setSeed(☃.J());
/* 114 */       long l1 = random.nextLong();
/* 115 */       long l2 = random.nextLong();
/* 116 */       long l3 = i * l1;
/* 117 */       long l4 = j * l2;
/* 118 */       random.setSeed(l3 ^ l4 ^ ☃.J());
/*     */       
/* 120 */       int k = i * 16 + 8 - 29;
/* 121 */       int m = j * 16 + 8 - 29;
/* 122 */       cq cq = cq.c.a.a(random);
/*     */       
/* 124 */       this.a.add(new aql.h(random, k, m, cq));
/* 125 */       c();
/*     */       
/* 127 */       this.d = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(adm ☃, Random random, aqe aqe1) {
/* 132 */       if (!this.d) {
/* 133 */         this.a.clear();
/* 134 */         b(☃, random, e(), f());
/*     */       } 
/* 136 */       super.a(☃, random, aqe1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(adg ☃) {
/* 141 */       if (this.c.contains(☃)) {
/* 142 */         return false;
/*     */       }
/* 144 */       return super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(adg ☃) {
/* 149 */       super.b(☃);
/*     */       
/* 151 */       this.c.add(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dn ☃) {
/* 156 */       super.a(☃);
/*     */       
/* 158 */       du du = new du();
/* 159 */       for (Iterator<adg> iterator = this.c.iterator(); iterator.hasNext(); ) { adg adg = iterator.next();
/* 160 */         dn dn1 = new dn();
/* 161 */         dn1.a("X", adg.a);
/* 162 */         dn1.a("Z", adg.b);
/* 163 */         du.a(dn1); }
/*     */       
/* 165 */       ☃.a("Processed", du);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dn ☃) {
/* 170 */       super.b(☃);
/*     */       
/* 172 */       if (☃.b("Processed", 9)) {
/* 173 */         du du = ☃.c("Processed", 10);
/* 174 */         for (int i = 0; i < du.c(); i++) {
/* 175 */           dn dn1 = du.b(i);
/* 176 */           this.c.add(new adg(dn1.f("X"), dn1.f("Z")));
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public List<ady.c> b() {
/* 183 */     return h;
/*     */   }
/*     */   
/*     */   public aqk() {}
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */