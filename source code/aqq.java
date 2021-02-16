/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.Callable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aqq
/*     */   extends any
/*     */ {
/*     */   private aqs d;
/*  23 */   protected Map<Long, aqu> e = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract String a();
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void a(adm ☃, int i, int j, int k, int m, ans ans1) {
/*  33 */     a(☃);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     if (this.e.containsKey(Long.valueOf(adg.a(i, j)))) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  44 */     this.b.nextInt();
/*     */     
/*     */     try {
/*  47 */       if (a(i, j)) {
/*  48 */         aqu aqu = b(i, j);
/*  49 */         this.e.put(Long.valueOf(adg.a(i, j)), aqu);
/*  50 */         a(i, j, aqu);
/*     */       } 
/*  52 */     } catch (Throwable throwable) {
/*  53 */       b b = b.a(throwable, "Exception preparing structure feature");
/*  54 */       c c = b.a("Feature being prepared");
/*     */       
/*  56 */       c.a("Is feature chunk", new Callable<String>(this, i, j)
/*     */           {
/*     */             public String a() throws Exception {
/*  59 */               return this.c.a(this.a, this.b) ? "True" : "False";
/*     */             }
/*     */           });
/*     */       
/*  63 */       c.a("Chunk location", String.format("%d,%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
/*     */       
/*  65 */       c.a("Chunk pos hash", new Callable<String>(this, i, j)
/*     */           {
/*     */             public String a() throws Exception {
/*  68 */               return String.valueOf(adg.a(this.a, this.b));
/*     */             }
/*     */           });
/*     */       
/*  72 */       c.a("Structure type", new Callable<String>(this)
/*     */           {
/*     */             public String a() throws Exception {
/*  75 */               return this.a.getClass().getCanonicalName();
/*     */             }
/*     */           });
/*     */       
/*  79 */       throw new e(b);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(adm ☃, Random random, adg adg1) {
/*  84 */     a(☃);
/*     */     
/*  86 */     int i = (adg1.a << 4) + 8;
/*  87 */     int j = (adg1.b << 4) + 8;
/*     */     
/*  89 */     boolean bool = false;
/*  90 */     for (Iterator<aqu> iterator = this.e.values().iterator(); iterator.hasNext(); ) { aqu aqu = iterator.next();
/*  91 */       if (aqu.d() && aqu.a(adg1) && 
/*  92 */         aqu.a().a(i, j, i + 15, j + 15)) {
/*  93 */         aqu.a(☃, random, new aqe(i, j, i + 15, j + 15));
/*  94 */         aqu.b(adg1);
/*  95 */         bool = true;
/*     */ 
/*     */         
/*  98 */         a(aqu.e(), aqu.f(), aqu);
/*     */       }  }
/*     */ 
/*     */ 
/*     */     
/* 103 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(cj ☃) {
/* 133 */     a(this.c);
/* 134 */     return (c(☃) != null);
/*     */   }
/*     */   
/*     */   protected aqu c(cj ☃) {
/* 138 */     for (Iterator<aqu> iterator = this.e.values().iterator(); iterator.hasNext(); ) { aqu aqu = iterator.next();
/* 139 */       if (aqu.d() && 
/* 140 */         aqu.a().b(☃)) {
/* 141 */         Iterator<aqt> iterator1 = aqu.b().iterator();
/* 142 */         while (iterator1.hasNext()) {
/* 143 */           aqt aqt = iterator1.next();
/* 144 */           if (aqt.c().b(☃)) {
/* 145 */             return aqu;
/*     */           }
/*     */         } 
/*     */       }  }
/*     */ 
/*     */     
/* 151 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1) {
/* 165 */     a(☃);
/*     */     
/* 167 */     for (Iterator<aqu> iterator = this.e.values().iterator(); iterator.hasNext(); ) { aqu aqu = iterator.next();
/* 168 */       if (aqu.d() && 
/* 169 */         aqu.a().b(cj1)) {
/* 170 */         return true;
/*     */       } }
/*     */ 
/*     */     
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cj b(adm ☃, cj cj1) {
/* 180 */     this.c = ☃;
/*     */     
/* 182 */     a(☃);
/*     */     
/* 184 */     this.b.setSeed(☃.J());
/* 185 */     long l1 = this.b.nextLong();
/* 186 */     long l2 = this.b.nextLong();
/* 187 */     long l3 = (cj1.n() >> 4) * l1;
/* 188 */     long l4 = (cj1.p() >> 4) * l2;
/* 189 */     this.b.setSeed(l3 ^ l4 ^ ☃.J());
/*     */     
/* 191 */     a(☃, cj1.n() >> 4, cj1.p() >> 4, 0, 0, (ans)null);
/*     */     
/* 193 */     double d = Double.MAX_VALUE;
/* 194 */     cj cj2 = null;
/*     */     
/* 196 */     for (Iterator<aqu> iterator = this.e.values().iterator(); iterator.hasNext(); ) { aqu aqu = iterator.next();
/* 197 */       if (aqu.d()) {
/* 198 */         aqt aqt = aqu.b().get(0);
/* 199 */         cj cj3 = aqt.a();
/*     */         
/* 201 */         double d1 = cj3.i(cj1);
/*     */         
/* 203 */         if (d1 < d) {
/* 204 */           d = d1;
/* 205 */           cj2 = cj3;
/*     */         } 
/*     */       }  }
/*     */     
/* 209 */     if (cj2 != null) {
/* 210 */       return cj2;
/*     */     }
/* 212 */     List<cj> list = z_();
/* 213 */     if (list != null) {
/* 214 */       cj cj3 = null;
/* 215 */       for (Iterator<cj> iterator1 = list.iterator(); iterator1.hasNext(); ) { cj cj4 = iterator1.next();
/* 216 */         double d1 = cj4.i(cj1);
/*     */         
/* 218 */         if (d1 < d) {
/* 219 */           d = d1;
/* 220 */           cj3 = cj4;
/*     */         }  }
/*     */       
/* 223 */       return cj3;
/*     */     } 
/*     */     
/* 226 */     return null;
/*     */   }
/*     */   
/*     */   protected List<cj> z_() {
/* 230 */     return null;
/*     */   }
/*     */   
/*     */   private void a(adm ☃) {
/* 234 */     if (this.d == null) {
/* 235 */       this.d = (aqs)☃.a((Class)aqs.class, a());
/*     */       
/* 237 */       if (this.d == null) {
/* 238 */         this.d = new aqs(a());
/* 239 */         ☃.a(a(), this.d);
/*     */       } else {
/* 241 */         dn dn = this.d.a();
/*     */         
/* 243 */         for (Iterator<String> iterator = dn.c().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 244 */           eb eb = dn.a(str);
/* 245 */           if (eb.a() == 10) {
/* 246 */             dn dn1 = (dn)eb;
/*     */             
/* 248 */             if (dn1.c("ChunkX") && dn1.c("ChunkZ")) {
/* 249 */               int i = dn1.f("ChunkX");
/* 250 */               int j = dn1.f("ChunkZ");
/*     */               
/* 252 */               aqu aqu = aqr.a(dn1, ☃);
/* 253 */               if (aqu != null) {
/* 254 */                 this.e.put(Long.valueOf(adg.a(i, j)), aqu);
/*     */               }
/*     */             } 
/*     */           }  }
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, aqu aqu1) {
/* 264 */     this.d.a(aqu1.a(☃, i), ☃, i);
/* 265 */     this.d.c();
/*     */   }
/*     */   
/*     */   protected abstract boolean a(int paramInt1, int paramInt2);
/*     */   
/*     */   protected abstract aqu b(int paramInt1, int paramInt2);
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */