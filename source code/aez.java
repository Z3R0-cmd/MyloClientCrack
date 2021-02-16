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
/*     */ public class aez
/*     */   extends agr
/*     */ {
/*  28 */   public static final aml a = aml.a("facing", cq.c.a);
/*  29 */   public static final amn b = amn.a("damage", 0, 2);
/*     */ 
/*     */   
/*     */   protected aez() {
/*  33 */     super(arm.g);
/*  34 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, Integer.valueOf(0)));
/*  35 */     e(0);
/*  36 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  41 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  46 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/*  51 */     cq cq2 = pr1.aP().e();
/*  52 */     return super.a(☃, cj1, cq1, f1, f2, f3, i, pr1).<Comparable, cq>a(a, cq2).a(b, Integer.valueOf(i >> 2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  57 */     if (!☃.D) {
/*  58 */       wn1.a(new a(☃, cj1));
/*     */     }
/*     */     
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(alz ☃) {
/*  66 */     return ((Integer)☃.<Integer>b(b)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  71 */     cq cq = ☃.p(cj1).<cq>b(a);
/*  72 */     if (cq.k() == cq.a.a) {
/*  73 */       a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
/*     */     } else {
/*  75 */       a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  81 */     list.add(new zx(☃, 1, 0));
/*  82 */     list.add(new zx(☃, 1, 1));
/*  83 */     list.add(new zx(☃, 1, 2));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(uy ☃) {
/*  88 */     ☃.a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(adm ☃, cj cj1) {
/*  93 */     ☃.b(1022, cj1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/*  98 */     return true;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements ol
/*     */   {
/*     */     private final adm a;
/*     */     private final cj b;
/*     */     
/*     */     public a(adm ☃, cj cj1) {
/* 108 */       this.a = ☃;
/* 109 */       this.b = cj1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String e_() {
/* 114 */       return "anvil";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean l_() {
/* 119 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public eu f_() {
/* 124 */       return new fb(afi.cf.a() + ".name", new Object[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public xi a(wm ☃, wn wn1) {
/* 129 */       return new xk(☃, this.a, this.b, wn1);
/*     */     }
/*     */ 
/*     */     
/*     */     public String k() {
/* 134 */       return "minecraft:anvil";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public alz b(alz ☃) {
/* 140 */     return Q().a(a, cq.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 145 */     return Q().<Comparable, cq>a(a, cq.b(☃ & 0x3)).a(b, Integer.valueOf((☃ & 0xF) >> 2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 152 */     int i = 0;
/*     */     
/* 154 */     i |= ((cq)☃.<cq>b(a)).b();
/* 155 */     i |= ((Integer)☃.<Integer>b(b)).intValue() << 2;
/*     */     
/* 157 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 162 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */