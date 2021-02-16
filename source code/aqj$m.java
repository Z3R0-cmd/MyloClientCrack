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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ abstract class m
/*     */   extends aqt
/*     */ {
/* 126 */   protected static final List<ob> a = Lists.newArrayList((Object[])new ob[] { new ob(zy.i, 0, 1, 3, 5), new ob(zy.j, 0, 1, 5, 5), new ob(zy.k, 0, 1, 3, 15), new ob(zy.B, 0, 1, 1, 5), new ob(zy.ah, 0, 1, 1, 5), new ob(zy.d, 0, 1, 1, 5), new ob(zy.by, 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 8), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 3), new ob(zw.a(afi.Z), 0, 2, 4, 2) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public m() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected m(int ☃) {
/* 147 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(dn ☃) {}
/*     */ 
/*     */   
/*     */   protected void a(dn ☃) {}
/*     */ 
/*     */   
/*     */   private int a(List<aqj.n> ☃) {
/* 159 */     boolean bool = false;
/* 160 */     int i = 0;
/* 161 */     for (Iterator<aqj.n> iterator = ☃.iterator(); iterator.hasNext(); ) { aqj.n n = iterator.next();
/* 162 */       if (n.d > 0 && n.c < n.d) {
/* 163 */         bool = true;
/*     */       }
/* 165 */       i += n.b; }
/*     */     
/* 167 */     return bool ? i : -1;
/*     */   }
/*     */   
/*     */   private m a(aqj.q ☃, List<aqj.n> list, List<aqt> list1, Random random, int i, int j, int k, cq cq1, int n) {
/* 171 */     int i1 = a(list);
/* 172 */     boolean bool = (i1 > 0 && n <= 30);
/*     */     
/* 174 */     int i2 = 0;
/* 175 */     while (i2 < 5 && bool) {
/* 176 */       i2++;
/*     */       
/* 178 */       int i3 = random.nextInt(i1);
/* 179 */       for (Iterator<aqj.n> iterator = list.iterator(); iterator.hasNext(); ) { aqj.n n1 = iterator.next();
/* 180 */         i3 -= n1.b;
/* 181 */         if (i3 < 0) {
/* 182 */           if (!n1.a(n) || (n1 == ☃.b && !n1.e)) {
/*     */             break;
/*     */           }
/*     */           
/* 186 */           m m1 = aqj.a(n1, list1, random, i, j, k, cq1, n);
/* 187 */           if (m1 != null) {
/* 188 */             n1.c++;
/* 189 */             ☃.b = n1;
/*     */             
/* 191 */             if (!n1.a()) {
/* 192 */               list.remove(n1);
/*     */             }
/* 194 */             return m1;
/*     */           } 
/*     */         }  }
/*     */     
/*     */     } 
/* 199 */     return aqj.b.a(list1, random, i, j, k, cq1, n);
/*     */   }
/*     */   
/*     */   private aqt a(aqj.q ☃, List<aqt> list, Random random, int i, int j, int k, cq cq1, int n, boolean bool) {
/* 203 */     if (Math.abs(i - (☃.c()).a) > 112 || Math.abs(k - (☃.c()).c) > 112) {
/* 204 */       return aqj.b.a(list, random, i, j, k, cq1, n);
/*     */     }
/* 206 */     List<aqj.n> list1 = ☃.c;
/* 207 */     if (bool) {
/* 208 */       list1 = ☃.d;
/*     */     }
/* 210 */     aqt aqt1 = a(☃, list1, list, random, i, j, k, cq1, n + 1);
/* 211 */     if (aqt1 != null) {
/* 212 */       list.add(aqt1);
/* 213 */       ☃.e.add(aqt1);
/*     */     } 
/* 215 */     return aqt1;
/*     */   }
/*     */   
/*     */   protected aqt a(aqj.q ☃, List<aqt> list, Random random, int i, int j, boolean bool) {
/* 219 */     if (this.m != null) {
/* 220 */       switch (aqj.null.a[this.m.ordinal()]) {
/*     */         case 1:
/* 222 */           return a(☃, list, random, this.l.a + i, this.l.b + j, this.l.c - 1, this.m, d(), bool);
/*     */         case 2:
/* 224 */           return a(☃, list, random, this.l.a + i, this.l.b + j, this.l.f + 1, this.m, d(), bool);
/*     */         case 3:
/* 226 */           return a(☃, list, random, this.l.a - 1, this.l.b + j, this.l.c + i, this.m, d(), bool);
/*     */         case 4:
/* 228 */           return a(☃, list, random, this.l.d + 1, this.l.b + j, this.l.c + i, this.m, d(), bool);
/*     */       } 
/*     */     }
/* 231 */     return null;
/*     */   }
/*     */   
/*     */   protected aqt b(aqj.q ☃, List<aqt> list, Random random, int i, int j, boolean bool) {
/* 235 */     if (this.m != null) {
/* 236 */       switch (aqj.null.a[this.m.ordinal()]) {
/*     */         case 1:
/* 238 */           return a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d(), bool);
/*     */         case 2:
/* 240 */           return a(☃, list, random, this.l.a - 1, this.l.b + i, this.l.c + j, cq.e, d(), bool);
/*     */         case 3:
/* 242 */           return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d(), bool);
/*     */         case 4:
/* 244 */           return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.c - 1, cq.c, d(), bool);
/*     */       } 
/*     */     }
/* 247 */     return null;
/*     */   }
/*     */   
/*     */   protected aqt c(aqj.q ☃, List<aqt> list, Random random, int i, int j, boolean bool) {
/* 251 */     if (this.m != null) {
/* 252 */       switch (aqj.null.a[this.m.ordinal()]) {
/*     */         case 1:
/* 254 */           return a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d(), bool);
/*     */         case 2:
/* 256 */           return a(☃, list, random, this.l.d + 1, this.l.b + i, this.l.c + j, cq.f, d(), bool);
/*     */         case 3:
/* 258 */           return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d(), bool);
/*     */         case 4:
/* 260 */           return a(☃, list, random, this.l.a + j, this.l.b + i, this.l.f + 1, cq.d, d(), bool);
/*     */       } 
/*     */     }
/* 263 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(aqe ☃) {
/* 267 */     return (☃ != null && ☃.b > 10);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqj$m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */