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
/*     */ public class afw
/*     */   extends afc
/*     */ {
/*  23 */   public static final amk a = amk.a("triggered");
/*     */   
/*     */   public afw() {
/*  26 */     super(arm.f, arn.q);
/*  27 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/*  32 */     return new akz();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  37 */     if (!☃.D) {
/*  38 */       boolean bool1 = ☃.z(cj1);
/*  39 */       boolean bool2 = ((Boolean)alz1.<Boolean>b(a)).booleanValue();
/*     */       
/*  41 */       if (bool1 && !bool2) {
/*  42 */         ☃.a(cj1, alz1.a(a, Boolean.valueOf(true)), 4);
/*  43 */         ☃.a(cj1, this, a(☃));
/*  44 */       } else if (!bool1 && bool2) {
/*  45 */         ☃.a(cj1, alz1.a(a, Boolean.valueOf(false)), 4);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1, Random random) {
/*  52 */     akw akw = ☃.s(cj1);
/*  53 */     if (akw instanceof akz) {
/*  54 */       ((akz)akw).b().a(☃);
/*     */       
/*  56 */       ☃.e(cj1, this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(adm ☃) {
/*  62 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  67 */     akw akw = ☃.s(cj1);
/*  68 */     if (akw instanceof akz) {
/*  69 */       return ((akz)akw).b().a(wn1);
/*     */     }
/*     */     
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/*  77 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/*  82 */     akw akw = ☃.s(cj1);
/*  83 */     if (akw instanceof akz) {
/*  84 */       return ((akz)akw).b().j();
/*     */     }
/*     */     
/*  87 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  92 */     akw akw = ☃.s(cj1);
/*  93 */     if (!(akw instanceof akz)) {
/*     */       return;
/*     */     }
/*     */     
/*  97 */     adc adc = ((akz)akw).b();
/*     */     
/*  99 */     if (zx1.s()) {
/* 100 */       adc.b(zx1.q());
/*     */     }
/*     */     
/* 103 */     if (!☃.D) {
/* 104 */       adc.a(☃.Q().b("sendCommandFeedback"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/* 110 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 115 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 120 */     return Q().a(a, Boolean.valueOf(((☃ & 0x1) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 126 */     int i = 0;
/*     */     
/* 128 */     if (((Boolean)☃.<Boolean>b(a)).booleanValue()) {
/* 129 */       i |= 0x1;
/*     */     }
/*     */     
/* 132 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 137 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 142 */     return Q().a(a, Boolean.valueOf(false));
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */