/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aqu
/*     */ {
/*  14 */   protected LinkedList<aqt> a = new LinkedList<aqt>();
/*     */   
/*     */   protected aqe b;
/*     */   
/*     */   private int c;
/*     */   private int d;
/*     */   
/*     */   public aqu() {}
/*     */   
/*     */   public aqu(int ☃, int i) {
/*  24 */     this.c = ☃;
/*  25 */     this.d = i;
/*     */   }
/*     */   
/*     */   public aqe a() {
/*  29 */     return this.b;
/*     */   }
/*     */   
/*     */   public LinkedList<aqt> b() {
/*  33 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, Random random, aqe aqe1) {
/*  37 */     Iterator<aqt> iterator = this.a.iterator();
/*  38 */     while (iterator.hasNext()) {
/*  39 */       aqt aqt = iterator.next();
/*  40 */       if (aqt.c().a(aqe1) && 
/*  41 */         !aqt.a(☃, random, aqe1)) {
/*  42 */         iterator.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c() {
/*  49 */     this.b = aqe.a();
/*     */     
/*  51 */     for (Iterator<aqt> ☃ = this.a.iterator(); ☃.hasNext(); ) { aqt aqt = ☃.next();
/*  52 */       this.b.b(aqt.c()); }
/*     */   
/*     */   }
/*     */   
/*     */   public dn a(int ☃, int i) {
/*  57 */     dn dn = new dn();
/*     */     
/*  59 */     dn.a("id", aqr.a(this));
/*  60 */     dn.a("ChunkX", ☃);
/*  61 */     dn.a("ChunkZ", i);
/*  62 */     dn.a("BB", this.b.g());
/*     */     
/*  64 */     du du = new du();
/*  65 */     for (Iterator<aqt> iterator = this.a.iterator(); iterator.hasNext(); ) { aqt aqt = iterator.next();
/*  66 */       du.a(aqt.b()); }
/*     */     
/*  68 */     dn.a("Children", du);
/*     */     
/*  70 */     a(dn);
/*     */     
/*  72 */     return dn;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {}
/*     */   
/*     */   public void a(adm ☃, dn dn1) {
/*  79 */     this.c = dn1.f("ChunkX");
/*  80 */     this.d = dn1.f("ChunkZ");
/*  81 */     if (dn1.c("BB")) {
/*  82 */       this.b = new aqe(dn1.l("BB"));
/*     */     }
/*     */     
/*  85 */     du du = dn1.c("Children", 10);
/*  86 */     for (int i = 0; i < du.c(); i++) {
/*  87 */       this.a.add(aqr.b(du.b(i), ☃));
/*     */     }
/*     */     
/*  90 */     b(dn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {}
/*     */   
/*     */   protected void a(adm ☃, Random random, int i) {
/*  97 */     int j = ☃.F() - i;
/*     */ 
/*     */     
/* 100 */     int k = this.b.d() + 1;
/*     */     
/* 102 */     if (k < j) {
/* 103 */       k += random.nextInt(j - k);
/*     */     }
/*     */ 
/*     */     
/* 107 */     int m = k - this.b.e;
/* 108 */     this.b.a(0, m, 0);
/* 109 */     for (Iterator<aqt> iterator = this.a.iterator(); iterator.hasNext(); ) { aqt aqt = iterator.next();
/* 110 */       aqt.a(0, m, 0); }
/*     */   
/*     */   }
/*     */   
/*     */   protected void a(adm ☃, Random random, int i, int j) {
/* 115 */     int k = j - i + 1 - this.b.d();
/* 116 */     int m = 1;
/*     */     
/* 118 */     if (k > 1) {
/* 119 */       m = i + random.nextInt(k);
/*     */     } else {
/* 121 */       m = i;
/*     */     } 
/*     */ 
/*     */     
/* 125 */     int n = m - this.b.b;
/* 126 */     this.b.a(0, n, 0);
/* 127 */     for (Iterator<aqt> iterator = this.a.iterator(); iterator.hasNext(); ) { aqt aqt = iterator.next();
/* 128 */       aqt.a(0, n, 0); }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 133 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(adg ☃) {
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adg ☃) {}
/*     */   
/*     */   public int e() {
/* 144 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/* 148 */     return this.d;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */