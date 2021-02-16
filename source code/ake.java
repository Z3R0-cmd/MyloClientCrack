/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ake
/*     */   extends afh
/*     */ {
/*  21 */   public static final amk a = amk.a("explode");
/*     */   
/*     */   public ake() {
/*  24 */     super(arm.u);
/*  25 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/*  26 */     a(yz.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  31 */     super.c(☃, cj1, alz1);
/*     */     
/*  33 */     if (☃.z(cj1)) {
/*  34 */       d(☃, cj1, alz1.a(a, Boolean.valueOf(true)));
/*  35 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/*  41 */     if (☃.z(cj1)) {
/*  42 */       d(☃, cj1, alz1.a(a, Boolean.valueOf(true)));
/*  43 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, adi adi1) {
/*  49 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  53 */     vj vj = new vj(☃, (cj1.n() + 0.5F), cj1.o(), (cj1.p() + 0.5F), adi1.c());
/*  54 */     vj.a = ☃.s.nextInt(vj.a / 4) + vj.a / 8;
/*  55 */     ☃.d(vj);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(adm ☃, cj cj1, alz alz1) {
/*  60 */     a(☃, cj1, alz1, (pr)null);
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1) {
/*  64 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     if (((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/*  69 */       vj vj = new vj(☃, (cj1.n() + 0.5F), cj1.o(), (cj1.p() + 0.5F), pr1);
/*  70 */       ☃.d(vj);
/*  71 */       ☃.a(vj, "game.tnt.primed", 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  77 */     if (wn1.bZ() != null) {
/*  78 */       zw zw = wn1.bZ().b();
/*  79 */       if (zw == zy.d || zw == zy.bL) {
/*  80 */         a(☃, cj1, alz1.a(a, Boolean.valueOf(true)), wn1);
/*  81 */         ☃.g(cj1);
/*     */         
/*  83 */         if (zw == zy.d) {
/*  84 */           wn1.bZ().a(1, wn1);
/*  85 */         } else if (!wn1.bA.d) {
/*  86 */           (wn1.bZ()).b--;
/*     */         } 
/*  88 */         return true;
/*     */       } 
/*     */     } 
/*  91 */     return super.a(☃, cj1, alz1, wn1, cq1, f1, f2, f3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pk pk1) {
/*  96 */     if (!☃.D && pk1 instanceof wq) {
/*  97 */       wq wq = (wq)pk1;
/*  98 */       if (wq.at()) {
/*  99 */         a(☃, cj1, ☃.p(cj1).a(a, Boolean.valueOf(true)), (wq.c instanceof pr) ? (pr)wq.c : null);
/* 100 */         ☃.g(cj1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adi ☃) {
/* 107 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 112 */     return Q().a(a, Boolean.valueOf(((☃ & 0x1) > 0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 117 */     return ((Boolean)☃.<Boolean>b(a)).booleanValue() ? 1 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 122 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */