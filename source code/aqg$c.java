/*     */ import com.google.common.collect.Lists;
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
/*     */ public class c
/*     */   extends aqt
/*     */ {
/*  82 */   private List<aqe> a = Lists.newLinkedList();
/*     */ 
/*     */   
/*     */   public c() {}
/*     */ 
/*     */   
/*     */   public c(int ☃, Random random, int i, int j) {
/*  89 */     super(☃);
/*     */     
/*  91 */     this.l = new aqe(i, 50, j, i + 7 + random.nextInt(6), 54 + random.nextInt(6), j + 7 + random.nextInt(6));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqt ☃, List<aqt> list, Random random) {
/*  96 */     int i = d();
/*     */ 
/*     */ 
/*     */     
/* 100 */     int k = this.l.d() - 3 - 1;
/* 101 */     if (k <= 0) {
/* 102 */       k = 1;
/*     */     }
/*     */ 
/*     */     
/* 106 */     int j = 0;
/* 107 */     while (j < this.l.c()) {
/* 108 */       j += random.nextInt(this.l.c());
/* 109 */       if (j + 3 > this.l.c()) {
/*     */         break;
/*     */       }
/* 112 */       aqt aqt1 = aqg.a(☃, list, random, this.l.a + j, this.l.b + random.nextInt(k) + 1, this.l.c - 1, cq.c, i);
/* 113 */       if (aqt1 != null) {
/* 114 */         aqe aqe = aqt1.c();
/* 115 */         this.a.add(new aqe(aqe.a, aqe.b, this.l.c, aqe.d, aqe.e, this.l.c + 1));
/*     */       } 
/* 117 */       j += 4;
/*     */     } 
/*     */     
/* 120 */     j = 0;
/* 121 */     while (j < this.l.c()) {
/* 122 */       j += random.nextInt(this.l.c());
/* 123 */       if (j + 3 > this.l.c()) {
/*     */         break;
/*     */       }
/* 126 */       aqt aqt1 = aqg.a(☃, list, random, this.l.a + j, this.l.b + random.nextInt(k) + 1, this.l.f + 1, cq.d, i);
/* 127 */       if (aqt1 != null) {
/* 128 */         aqe aqe = aqt1.c();
/* 129 */         this.a.add(new aqe(aqe.a, aqe.b, this.l.f - 1, aqe.d, aqe.e, this.l.f));
/*     */       } 
/* 131 */       j += 4;
/*     */     } 
/*     */     
/* 134 */     j = 0;
/* 135 */     while (j < this.l.e()) {
/* 136 */       j += random.nextInt(this.l.e());
/* 137 */       if (j + 3 > this.l.e()) {
/*     */         break;
/*     */       }
/* 140 */       aqt aqt1 = aqg.a(☃, list, random, this.l.a - 1, this.l.b + random.nextInt(k) + 1, this.l.c + j, cq.e, i);
/* 141 */       if (aqt1 != null) {
/* 142 */         aqe aqe = aqt1.c();
/* 143 */         this.a.add(new aqe(this.l.a, aqe.b, aqe.c, this.l.a + 1, aqe.e, aqe.f));
/*     */       } 
/* 145 */       j += 4;
/*     */     } 
/*     */     
/* 148 */     j = 0;
/* 149 */     while (j < this.l.e()) {
/* 150 */       j += random.nextInt(this.l.e());
/* 151 */       if (j + 3 > this.l.e()) {
/*     */         break;
/*     */       }
/* 154 */       aqt aqt1 = aqg.a(☃, list, random, this.l.d + 1, this.l.b + random.nextInt(k) + 1, this.l.c + j, cq.f, i);
/* 155 */       if (aqt1 != null) {
/* 156 */         aqe aqe = aqt1.c();
/* 157 */         this.a.add(new aqe(this.l.d - 1, aqe.b, aqe.c, this.l.d, aqe.e, aqe.f));
/*     */       } 
/* 159 */       j += 4;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, aqe aqe1) {
/* 165 */     if (a(☃, aqe1)) {
/* 166 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 170 */     a(☃, aqe1, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, afi.d.Q(), afi.a.Q(), true);
/*     */ 
/*     */     
/* 173 */     a(☃, aqe1, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, afi.a.Q(), afi.a.Q(), false);
/* 174 */     for (Iterator<aqe> iterator = this.a.iterator(); iterator.hasNext(); ) { aqe aqe2 = iterator.next();
/* 175 */       a(☃, aqe1, aqe2.a, aqe2.e - 2, aqe2.c, aqe2.d, aqe2.e, aqe2.f, afi.a.Q(), afi.a.Q(), false); }
/*     */     
/* 177 */     a(☃, aqe1, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, afi.a.Q(), false);
/*     */     
/* 179 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 184 */     super.a(☃, i, j);
/* 185 */     for (Iterator<aqe> iterator = this.a.iterator(); iterator.hasNext(); ) { aqe aqe = iterator.next();
/* 186 */       aqe.a(☃, i, j); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dn ☃) {
/* 192 */     du du = new du();
/* 193 */     for (Iterator<aqe> iterator = this.a.iterator(); iterator.hasNext(); ) { aqe aqe = iterator.next();
/* 194 */       du.a(aqe.g()); }
/*     */     
/* 196 */     ☃.a("Entrances", du);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {
/* 201 */     du du = ☃.c("Entrances", 11);
/* 202 */     for (int i = 0; i < du.c(); i++)
/* 203 */       this.a.add(new aqe(du.c(i))); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqg$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */