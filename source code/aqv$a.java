/*     */ import java.util.Iterator;
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
/*     */   private boolean c;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(adm ☃, Random random, int i, int j, int k) {
/*  89 */     super(i, j);
/*     */     
/*  91 */     List<aqw.e> list = aqw.a(random, k);
/*     */     
/*  93 */     aqw.k k1 = new aqw.k(☃.v(), 0, random, (i << 4) + 2, (j << 4) + 2, list, k);
/*  94 */     this.a.add(k1);
/*  95 */     k1.a(k1, this.a, random);
/*     */     
/*  97 */     List<aqt> list1 = k1.g;
/*  98 */     List<aqt> list2 = k1.f;
/*  99 */     while (!list1.isEmpty() || !list2.isEmpty()) {
/*     */       
/* 101 */       if (list1.isEmpty()) {
/* 102 */         int i1 = random.nextInt(list2.size());
/* 103 */         aqt aqt1 = list2.remove(i1);
/* 104 */         aqt1.a(k1, this.a, random); continue;
/*     */       } 
/* 106 */       int n = random.nextInt(list1.size());
/* 107 */       aqt aqt = list1.remove(n);
/* 108 */       aqt.a(k1, this.a, random);
/*     */     } 
/*     */ 
/*     */     
/* 112 */     c();
/*     */     
/* 114 */     int m = 0;
/* 115 */     for (Iterator<aqt> iterator = this.a.iterator(); iterator.hasNext(); ) { aqt aqt = iterator.next();
/* 116 */       if (!(aqt instanceof aqw.o)) {
/* 117 */         m++;
/*     */       } }
/*     */     
/* 120 */     this.c = (m > 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 125 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 130 */     super.a(☃);
/*     */     
/* 132 */     ☃.a("Valid", this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 137 */     super.b(☃);
/* 138 */     this.c = ☃.n("Valid");
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqv$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */