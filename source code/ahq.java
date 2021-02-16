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
/*     */ public class ahq
/*     */   extends afc
/*     */ {
/*     */   public static class a
/*     */     extends akw
/*     */   {
/*     */     private zx a;
/*     */     
/*     */     public void a(dn ☃) {
/*  31 */       super.a(☃);
/*     */       
/*  33 */       if (☃.b("RecordItem", 10)) {
/*  34 */         a(zx.a(☃.m("RecordItem")));
/*  35 */       } else if (☃.f("Record") > 0) {
/*  36 */         a(new zx(zw.b(☃.f("Record")), 1, 0));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dn ☃) {
/*  42 */       super.b(☃);
/*     */       
/*  44 */       if (a() != null) {
/*  45 */         ☃.a("RecordItem", a().b(new dn()));
/*     */       }
/*     */     }
/*     */     
/*     */     public zx a() {
/*  50 */       return this.a;
/*     */     }
/*     */     
/*     */     public void a(zx ☃) {
/*  54 */       this.a = ☃;
/*  55 */       p_();
/*     */     }
/*     */   }
/*     */   
/*  59 */   public static final amk a = amk.a("has_record");
/*     */   
/*     */   protected ahq() {
/*  62 */     super(arm.d, arn.l);
/*  63 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/*  64 */     a(yz.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/*  69 */     if (((Boolean)alz1.<Boolean>b(a)).booleanValue()) {
/*  70 */       e(☃, cj1, alz1);
/*     */       
/*  72 */       alz1 = alz1.a(a, Boolean.valueOf(false));
/*  73 */       ☃.a(cj1, alz1, 2);
/*  74 */       return true;
/*     */     } 
/*     */     
/*  77 */     return false;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, zx zx1) {
/*  81 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  85 */     akw akw = ☃.s(cj1);
/*  86 */     if (!(akw instanceof a)) {
/*     */       return;
/*     */     }
/*     */     
/*  90 */     ((a)akw).a(new zx(zx1.b(), 1, zx1.i()));
/*  91 */     ☃.a(cj1, alz1.a(a, Boolean.valueOf(true)), 2);
/*     */   }
/*     */   
/*     */   private void e(adm ☃, cj cj1, alz alz1) {
/*  95 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/*  99 */     akw akw = ☃.s(cj1);
/* 100 */     if (!(akw instanceof a)) {
/*     */       return;
/*     */     }
/*     */     
/* 104 */     a a = (a)akw;
/* 105 */     zx zx1 = a.a();
/* 106 */     if (zx1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 110 */     ☃.b(1005, cj1, 0);
/* 111 */     ☃.a(cj1, (String)null);
/* 112 */     a.a((zx)null);
/*     */     
/* 114 */     float f = 0.7F;
/* 115 */     double d1 = (☃.s.nextFloat() * f) + (1.0F - f) * 0.5D;
/* 116 */     double d2 = (☃.s.nextFloat() * f) + (1.0F - f) * 0.2D + 0.6D;
/* 117 */     double d3 = (☃.s.nextFloat() * f) + (1.0F - f) * 0.5D;
/*     */     
/* 119 */     zx zx2 = zx1.k();
/*     */     
/* 121 */     uz uz = new uz(☃, cj1.n() + d1, cj1.o() + d2, cj1.p() + d3, zx2);
/* 122 */     uz.p();
/* 123 */     ☃.d(uz);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 130 */     e(☃, cj1, alz1);
/* 131 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/* 136 */     if (☃.D) {
/*     */       return;
/*     */     }
/* 139 */     super.a(☃, cj1, alz1, f, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 144 */     return new a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O() {
/* 149 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l(adm ☃, cj cj1) {
/* 154 */     akw akw = ☃.s(cj1);
/* 155 */     if (akw instanceof a) {
/* 156 */       zx zx = ((a)akw).a();
/*     */       
/* 158 */       if (zx != null)
/*     */       {
/* 160 */         return zw.b(zx.b()) + 1 - zw.b(zy.cq);
/*     */       }
/*     */     } 
/*     */     
/* 164 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 169 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 174 */     return Q().a(a, Boolean.valueOf((☃ > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 180 */     return ((Boolean)☃.<Boolean>b(a)).booleanValue() ? 1 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 185 */     return new ama(this, new amo[] { a });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */