/*     */ import com.google.common.base.Predicate;
/*     */ import java.util.List;
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
/*     */ public class ahn
/*     */   extends afc
/*     */ {
/*  30 */   public static final aml a = aml.a("facing", new Predicate<cq>()
/*     */       {
/*     */         public boolean a(cq ☃) {
/*  33 */           return (☃ != cq.b);
/*     */         }
/*     */       });
/*  36 */   public static final amk b = amk.a("enabled");
/*     */   
/*     */   public ahn() {
/*  39 */     super(arm.f, arn.m);
/*  40 */     j(this.M.b().<Comparable, cq>a(a, cq.a).a(b, Boolean.valueOf(true)));
/*  41 */     a(yz.d);
/*  42 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  47 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  52 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*  53 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  54 */     float f = 0.125F;
/*  55 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  56 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  57 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  58 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  59 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  60 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*  61 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  62 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/*  64 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  69 */     cq cq2 = cq1.d();
/*  70 */     if (cq2 == cq.b) {
/*  71 */       cq2 = cq.a;
/*     */     }
/*  73 */     return Q().<Comparable, cq>a(a, cq2).a(b, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/*  78 */     return new alj();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, pr pr1, zx zx1) {
/*  83 */     super.a(☃, cj1, alz1, pr1, zx1);
/*     */     
/*  85 */     if (zx1.s()) {
/*  86 */       akw akw = ☃.s(cj1);
/*  87 */       if (akw instanceof alj) {
/*  88 */         ((alj)akw).a(zx1.q());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(adm ☃, cj cj1, alz alz1) {
/*  95 */     e(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 100 */     if (☃.D) {
/* 101 */       return true;
/*     */     }
/*     */     
/* 104 */     akw akw = ☃.s(cj1);
/* 105 */     if (akw instanceof alj) {
/* 106 */       wn1.a((alj)akw);
/* 107 */       wn1.b(na.P);
/*     */     } 
/* 109 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 114 */     e(☃, cj1, alz1);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1, alz alz1) {
/* 118 */     boolean bool = !☃.z(cj1);
/* 119 */     if (bool != ((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 120 */       ☃.a(cj1, alz1.a(b, Boolean.valueOf(bool)), 4);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 126 */     akw akw = ☃.s(cj1);
/* 127 */     if (akw instanceof alj) {
/* 128 */       oi.a(☃, cj1, (alj)akw);
/*     */       
/* 130 */       ☃.e(cj1, this);
/*     */     } 
/*     */     
/* 133 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 138 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 143 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 148 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 153 */     return true;
/*     */   }
/*     */   
/*     */   public static cq b(int ☃) {
/* 157 */     return cq.a(☃ & 0x7);
/*     */   }
/*     */   
/*     */   public static boolean f(int ☃) {
/* 161 */     return ((☃ & 0x8) != 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 166 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 171 */     return xi.a(☃.s(cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public adf m() {
/* 176 */     return adf.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 181 */     return Q().<Comparable, cq>a(a, b(☃)).a(b, Boolean.valueOf(f(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 188 */     int i = 0;
/*     */     
/* 190 */     i |= ((cq)☃.<cq>b(a)).a();
/*     */     
/* 192 */     if (!((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 193 */       i |= 0x8;
/*     */     }
/*     */     
/* 196 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 201 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */