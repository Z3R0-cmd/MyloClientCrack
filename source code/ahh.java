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
/*     */ public abstract class ahh
/*     */   extends afh
/*     */ {
/*  21 */   public static final amm<a> a = amm.a("half", a.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ahh(arm ☃) {
/*  27 */     super(☃);
/*     */     
/*  29 */     if (l()) {
/*  30 */       this.r = true;
/*     */     } else {
/*  32 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     } 
/*  34 */     e(255);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean I() {
/*  39 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  44 */     if (l()) {
/*  45 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/*     */       return;
/*     */     } 
/*  49 */     alz alz = ☃.p(cj1);
/*  50 */     if (alz.c() == this) {
/*  51 */       if (alz.b(a) == a.a) {
/*  52 */         a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */       } else {
/*  54 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  61 */     if (l()) {
/*  62 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  64 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  70 */     a(☃, cj1);
/*  71 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  76 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  81 */     alz alz = super.a(☃, cj1, cq1, f1, f2, f3, i, pr1).a(a, a.b);
/*     */     
/*  83 */     if (l()) {
/*  84 */       return alz;
/*     */     }
/*     */     
/*  87 */     if (cq1 == cq.a || (cq1 != cq.b && f2 > 0.5D)) {
/*  88 */       return alz.a(a, a.a);
/*     */     }
/*  90 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  95 */     if (l()) {
/*  96 */       return 2;
/*     */     }
/*  98 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 103 */     return l();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 108 */     if (l()) {
/* 109 */       return super.a(☃, cj1, cq1);
/*     */     }
/*     */     
/* 112 */     if (cq1 != cq.b && cq1 != cq.a && !super.a(☃, cj1, cq1)) {
/* 113 */       return false;
/*     */     }
/*     */     
/* 116 */     cj cj2 = cj1.a(cq1.d());
/*     */     
/* 118 */     alz alz1 = ☃.p(cj1);
/* 119 */     alz alz2 = ☃.p(cj2);
/*     */     
/* 121 */     boolean bool1 = (c(alz1.c()) && alz1.b(a) == a.a);
/* 122 */     boolean bool2 = (c(alz2.c()) && alz2.b(a) == a.a);
/* 123 */     if (bool2) {
/* 124 */       if (cq1 == cq.a) {
/* 125 */         return true;
/*     */       }
/* 127 */       if (cq1 == cq.b && super.a(☃, cj1, cq1)) {
/* 128 */         return true;
/*     */       }
/* 130 */       return (!c(alz1.c()) || !bool1);
/*     */     } 
/* 132 */     if (cq1 == cq.b) {
/* 133 */       return true;
/*     */     }
/* 135 */     if (cq1 == cq.a && super.a(☃, cj1, cq1)) {
/* 136 */       return true;
/*     */     }
/* 138 */     return (!c(alz1.c()) || bool1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected static boolean c(afh ☃) {
/* 143 */     return (☃ == afi.U || ☃ == afi.bM || ☃ == afi.cP);
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract String b(int paramInt);
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/* 150 */     return super.j(☃, cj1) & 0x7;
/*     */   }
/*     */   
/*     */   public abstract boolean l();
/*     */   
/*     */   public abstract amo<?> n();
/*     */   
/*     */   public abstract Object a(zx paramzx);
/*     */   
/*     */   public enum a implements nw {
/* 160 */     a("top"),
/* 161 */     b("bottom");
/*     */     
/*     */     private final String c;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 167 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 172 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 177 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */