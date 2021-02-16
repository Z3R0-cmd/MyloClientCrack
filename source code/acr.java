/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acr
/*     */   extends aci
/*     */ {
/*  15 */   private static final String[] E = new String[] { "all", "fire", "fall", "explosion", "projectile" };
/*     */ 
/*     */ 
/*     */   
/*  19 */   private static final int[] F = new int[] { 1, 10, 5, 5, 3 };
/*     */ 
/*     */ 
/*     */   
/*  23 */   private static final int[] G = new int[] { 11, 8, 6, 8, 6 };
/*     */ 
/*     */ 
/*     */   
/*  27 */   private static final int[] H = new int[] { 20, 12, 10, 12, 15 };
/*     */ 
/*     */   
/*     */   public final int a;
/*     */ 
/*     */   
/*     */   public acr(int ☃, jy jy1, int i, int j) {
/*  34 */     super(☃, jy1, i, acj.b);
/*  35 */     this.a = j;
/*     */     
/*  37 */     if (j == 2) {
/*  38 */       this.C = acj.c;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃) {
/*  44 */     return F[this.a] + (☃ - 1) * G[this.a];
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int ☃) {
/*  49 */     return a(☃) + H[this.a];
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  54 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, ow ow1) {
/*  59 */     if (ow1.g()) {
/*  60 */       return 0;
/*     */     }
/*     */     
/*  63 */     float f = (6 + ☃ * ☃) / 3.0F;
/*     */     
/*  65 */     if (this.a == 0) {
/*  66 */       return ns.d(f * 0.75F);
/*     */     }
/*  68 */     if (this.a == 1 && ow1.o()) {
/*  69 */       return ns.d(f * 1.25F);
/*     */     }
/*  71 */     if (this.a == 2 && ow1 == ow.i) {
/*  72 */       return ns.d(f * 2.5F);
/*     */     }
/*  74 */     if (this.a == 3 && ow1.c()) {
/*  75 */       return ns.d(f * 1.5F);
/*     */     }
/*  77 */     if (this.a == 4 && ow1.a()) {
/*  78 */       return ns.d(f * 1.5F);
/*     */     }
/*  80 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  85 */     return "enchantment.protect." + E[this.a];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aci ☃) {
/*  90 */     if (☃ instanceof acr) {
/*  91 */       acr acr1 = (acr)☃;
/*     */       
/*  93 */       if (acr1.a == this.a) {
/*  94 */         return false;
/*     */       }
/*  96 */       if (this.a == 2 || acr1.a == 2) {
/*  97 */         return true;
/*     */       }
/*  99 */       return false;
/*     */     } 
/* 101 */     return super.a(☃);
/*     */   }
/*     */   
/*     */   public static int a(pk ☃, int i) {
/* 105 */     int j = ack.a(aci.d.B, ☃.as());
/*     */     
/* 107 */     if (j > 0) {
/* 108 */       i -= ns.d(i * j * 0.15F);
/*     */     }
/*     */     
/* 111 */     return i;
/*     */   }
/*     */   
/*     */   public static double a(pk ☃, double d) {
/* 115 */     int i = ack.a(aci.f.B, ☃.as());
/*     */     
/* 117 */     if (i > 0) {
/* 118 */       d -= ns.c(d * (i * 0.15F));
/*     */     }
/*     */     
/* 121 */     return d;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/acr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */