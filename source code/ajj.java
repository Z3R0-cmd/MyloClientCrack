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
/*     */ public class ajj
/*     */   extends afm
/*     */   implements afj
/*     */ {
/*  19 */   public static final amm<aio.a> a = amm.a("type", aio.a.class);
/*  20 */   public static final amn b = amn.a("stage", 0, 1);
/*     */ 
/*     */ 
/*     */   
/*     */   protected ajj() {
/*  25 */     j(this.M.b().<aio.a, aio.a>a(a, aio.a.a).a(b, Integer.valueOf(0)));
/*  26 */     float ☃ = 0.4F;
/*  27 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃ * 2.0F, 0.5F + ☃);
/*  28 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  33 */     return di.a(a() + "." + aio.a.a.d() + ".name");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  38 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  42 */     super.b(☃, cj1, alz1, random);
/*     */     
/*  44 */     if (☃.l(cj1.a()) >= 9 && 
/*  45 */       random.nextInt(7) == 0) {
/*  46 */       d(☃, cj1, alz1, random);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(adm ☃, cj cj1, alz alz1, Random random) {
/*  52 */     if (((Integer)alz1.<Integer>b(b)).intValue() == 0) {
/*  53 */       ☃.a(cj1, alz1.a(b), 4);
/*     */     } else {
/*  55 */       e(☃, cj1, alz1, random);
/*     */     } 
/*     */   }
/*     */   public void e(adm ☃, cj cj1, alz alz1, Random random) {
/*     */     alz alz3;
/*  60 */     aot aot = (random.nextInt(10) == 0) ? new aoi(true) : new apv(true);
/*     */     
/*  62 */     int i = 0;
/*  63 */     int j = 0;
/*  64 */     boolean bool = false;
/*     */     
/*  66 */     switch (null.a[((aio.a)alz1.b((amo)a)).ordinal()]) {
/*     */       
/*     */       case 1:
/*  69 */         label68: for (i = 0; i >= -1; i--) {
/*  70 */           for (j = 0; j >= -1; j--) {
/*  71 */             if (a(☃, cj1, i, j, aio.a.b)) {
/*  72 */               aot = new apf(false, random.nextBoolean());
/*  73 */               bool = true;
/*     */               
/*     */               break label68;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/*  80 */         if (!bool) {
/*  81 */           i = j = 0;
/*  82 */           aot = new aps(true);
/*     */         } 
/*     */         break;
/*     */       
/*     */       case 2:
/*  87 */         aot = new aoj(true, false);
/*     */         break;
/*     */       
/*     */       case 3:
/*  91 */         alz2 = afi.r.Q().a(ail.b, aio.a.d);
/*  92 */         alz3 = afi.t.Q().<aio.a, aio.a>a(aik.Q, aio.a.d).a(ahs.b, Boolean.valueOf(false));
/*  93 */         label69: for (i = 0; i >= -1; i--) {
/*  94 */           for (j = 0; j >= -1; j--) {
/*  95 */             if (a(☃, cj1, i, j, aio.a.d)) {
/*  96 */               aot = new ape(true, 10, 20, alz2, alz3);
/*  97 */               bool = true;
/*     */               
/*     */               break label69;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 104 */         if (!bool) {
/* 105 */           i = j = 0;
/* 106 */           aot = new apv(true, 4 + random.nextInt(7), alz2, alz3, false);
/*     */         } 
/*     */         break;
/*     */       
/*     */       case 4:
/* 111 */         aot = new app(true);
/*     */         break;
/*     */ 
/*     */       
/*     */       case 5:
/* 116 */         label70: for (i = 0; i >= -1; i--) {
/* 117 */           for (j = 0; j >= -1; j--) {
/* 118 */             if (a(☃, cj1, i, j, aio.a.f)) {
/* 119 */               aot = new apn(true);
/* 120 */               bool = true;
/*     */               
/*     */               break label70;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 127 */         if (!bool) {
/*     */           return;
/*     */         }
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     alz alz2 = afi.a.Q();
/* 138 */     if (bool) {
/* 139 */       ☃.a(cj1.a(i, 0, j), alz2, 4);
/* 140 */       ☃.a(cj1.a(i + 1, 0, j), alz2, 4);
/* 141 */       ☃.a(cj1.a(i, 0, j + 1), alz2, 4);
/* 142 */       ☃.a(cj1.a(i + 1, 0, j + 1), alz2, 4);
/*     */     } else {
/* 144 */       ☃.a(cj1, alz2, 4);
/*     */     } 
/*     */     
/* 147 */     if (!aot.b(☃, random, cj1.a(i, 0, j))) {
/* 148 */       if (bool) {
/* 149 */         ☃.a(cj1.a(i, 0, j), alz1, 4);
/* 150 */         ☃.a(cj1.a(i + 1, 0, j), alz1, 4);
/* 151 */         ☃.a(cj1.a(i, 0, j + 1), alz1, 4);
/* 152 */         ☃.a(cj1.a(i + 1, 0, j + 1), alz1, 4);
/*     */       } else {
/* 154 */         ☃.a(cj1, alz1, 4);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(adm ☃, cj cj1, int i, int j, aio.a a1) {
/* 160 */     return (a(☃, cj1.a(i, 0, j), a1) && a(☃, cj1.a(i + 1, 0, j), a1) && a(☃, cj1.a(i, 0, j + 1), a1) && a(☃, cj1.a(i + 1, 0, j + 1), a1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, aio.a a1) {
/* 167 */     alz alz = ☃.p(cj1);
/* 168 */     return (alz.c() == this && alz.b(a) == a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/* 173 */     return ((aio.a)☃.<aio.a>b(a)).a();
/*     */   } public void a(zw ☃, yz yz1, List<zx> list) {
/*     */     aio.a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/* 178 */     for (arrayOfA = aio.a.values(), i = arrayOfA.length, j = 0; j < i; ) { aio.a a = arrayOfA[j];
/* 179 */       list.add(new zx(☃, 1, a.a()));
/*     */       j++; }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, boolean bool) {
/* 185 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, Random random, cj cj1, alz alz1) {
/* 190 */     return (☃.s.nextFloat() < 0.45D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, Random random, cj cj1, alz alz1) {
/* 195 */     d(☃, cj1, alz1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 200 */     return Q().<aio.a, aio.a>a(a, aio.a.a(☃ & 0x7)).a(b, Integer.valueOf((☃ & 0x8) >> 3));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 207 */     int i = 0;
/*     */     
/* 209 */     i |= ((aio.a)☃.<aio.a>b(a)).a();
/* 210 */     i |= ((Integer)☃.<Integer>b(b)).intValue() << 3;
/*     */     
/* 212 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 217 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */