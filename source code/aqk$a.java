/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends aqu
/*     */ {
/*  97 */   private Set<adg> c = Sets.newHashSet();
/*     */   
/*     */   private boolean d;
/*     */ 
/*     */   
/*     */   public a() {}
/*     */ 
/*     */   
/*     */   public a(adm ☃, Random random, int i, int j) {
/* 106 */     super(i, j);
/* 107 */     b(☃, random, i, j);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(adm ☃, Random random, int i, int j) {
/* 113 */     random.setSeed(☃.J());
/* 114 */     long l1 = random.nextLong();
/* 115 */     long l2 = random.nextLong();
/* 116 */     long l3 = i * l1;
/* 117 */     long l4 = j * l2;
/* 118 */     random.setSeed(l3 ^ l4 ^ ☃.J());
/*     */     
/* 120 */     int k = i * 16 + 8 - 29;
/* 121 */     int m = j * 16 + 8 - 29;
/* 122 */     cq cq = cq.c.a.a(random);
/*     */     
/* 124 */     this.a.add(new aql.h(random, k, m, cq));
/* 125 */     c();
/*     */     
/* 127 */     this.d = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, aqe aqe1) {
/* 132 */     if (!this.d) {
/* 133 */       this.a.clear();
/* 134 */       b(☃, random, e(), f());
/*     */     } 
/* 136 */     super.a(☃, random, aqe1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adg ☃) {
/* 141 */     if (this.c.contains(☃)) {
/* 142 */       return false;
/*     */     }
/* 144 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adg ☃) {
/* 149 */     super.b(☃);
/*     */     
/* 151 */     this.c.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 156 */     super.a(☃);
/*     */     
/* 158 */     du du = new du();
/* 159 */     for (Iterator<adg> iterator = this.c.iterator(); iterator.hasNext(); ) { adg adg = iterator.next();
/* 160 */       dn dn1 = new dn();
/* 161 */       dn1.a("X", adg.a);
/* 162 */       dn1.a("Z", adg.b);
/* 163 */       du.a(dn1); }
/*     */     
/* 165 */     ☃.a("Processed", du);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 170 */     super.b(☃);
/*     */     
/* 172 */     if (☃.b("Processed", 9)) {
/* 173 */       du du = ☃.c("Processed", 10);
/* 174 */       for (int i = 0; i < du.c(); i++) {
/* 175 */         dn dn1 = du.b(i);
/* 176 */         this.c.add(new adg(dn1.f("X"), dn1.f("Z")));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqk$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */