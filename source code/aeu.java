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
/*     */ public class aeu
/*     */   extends ady
/*     */ {
/*  16 */   private static final apk aD = new apk();
/*  17 */   private static final aps aE = new aps(false);
/*  18 */   private static final apf aF = new apf(false, false);
/*  19 */   private static final apf aG = new apf(false, true);
/*  20 */   private static final aok aH = new aok(afi.Y, 0);
/*     */ 
/*     */ 
/*     */   
/*     */   private int aI;
/*     */ 
/*     */ 
/*     */   
/*     */   public aeu(int ☃, int i) {
/*  29 */     super(☃);
/*  30 */     this.aI = i;
/*     */     
/*  32 */     this.au.add(new ady.c((Class)ua.class, 8, 4, 4));
/*     */     
/*  34 */     this.as.A = 10;
/*  35 */     if (i == 1 || i == 2) {
/*  36 */       this.as.C = 7;
/*  37 */       this.as.D = 1;
/*  38 */       this.as.E = 3;
/*     */     } else {
/*  40 */       this.as.C = 1;
/*  41 */       this.as.E = 1;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aoh a(Random ☃) {
/*  47 */     if ((this.aI == 1 || this.aI == 2) && ☃.nextInt(3) == 0) {
/*  48 */       if (this.aI == 2 || ☃.nextInt(13) == 0) {
/*  49 */         return aG;
/*     */       }
/*  51 */       return aF;
/*     */     } 
/*  53 */     if (☃.nextInt(3) == 0) {
/*  54 */       return aD;
/*     */     }
/*  56 */     return aE;
/*     */   }
/*     */ 
/*     */   
/*     */   public aot b(Random ☃) {
/*  61 */     if (☃.nextInt(5) > 0) {
/*  62 */       return new apu(akc.a.c);
/*     */     }
/*  64 */     return new apu(akc.a.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, cj cj1) {
/*  69 */     if (this.aI == 1 || this.aI == 2) {
/*  70 */       int j = random.nextInt(3);
/*  71 */       for (int k = 0; k < j; k++) {
/*  72 */         int m = random.nextInt(16) + 8;
/*  73 */         int n = random.nextInt(16) + 8;
/*  74 */         cj cj2 = ☃.m(cj1.a(m, 0, n));
/*  75 */         aH.b(☃, random, cj2);
/*     */       } 
/*     */     } 
/*     */     
/*  79 */     ag.a(agi.b.d);
/*  80 */     for (int i = 0; i < 7; i++) {
/*  81 */       int j = random.nextInt(16) + 8;
/*  82 */       int k = random.nextInt(16) + 8;
/*  83 */       int m = random.nextInt(☃.m(cj1.a(j, 0, k)).o() + 32);
/*  84 */       ag.b(☃, random, cj1.a(j, m, k));
/*     */     } 
/*  86 */     super.a(☃, random, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, ans ans1, int i, int j, double d) {
/*  91 */     if (this.aI == 1 || this.aI == 2) {
/*  92 */       this.ak = afi.c.Q();
/*  93 */       this.al = afi.d.Q();
/*  94 */       if (d > 1.75D) {
/*  95 */         this.ak = afi.d.Q().a(agf.a, agf.a.b);
/*  96 */       } else if (d > -0.95D) {
/*  97 */         this.ak = afi.d.Q().a(agf.a, agf.a.c);
/*     */       } 
/*     */     } 
/* 100 */     b(☃, random, ans1, i, j, d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ady d(int ☃) {
/* 105 */     if (this.az == ady.V.az) {
/* 106 */       return (new aeu(☃, 2)).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25F, 0.8F).a(new ady.a(this.an, this.ao));
/*     */     }
/* 108 */     return super.d(☃);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */