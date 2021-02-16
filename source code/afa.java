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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afa
/*     */   extends afc
/*     */ {
/*  27 */   public static final aml a = aml.a("facing", cq.c.a);
/*  28 */   public static final amn b = amn.a("rotation", 0, 15);
/*     */   
/*     */   protected afa() {
/*  31 */     super(arm.d);
/*  32 */     float ☃ = 0.25F;
/*  33 */     float f1 = 1.0F;
/*  34 */     a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, f1, 0.5F + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  39 */     return di.a("item.banner.white.name");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  45 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public aug b(adm ☃, cj cj1) {
/*  50 */     a(☃, cj1);
/*  51 */     return super.b(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adq ☃, cj cj1) {
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  71 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/*  76 */     return new aku();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/*  82 */     return zy.cE;
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/*  87 */     return zy.cE;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {
/*  92 */     akw akw = ☃.s(cj1);
/*  93 */     if (akw instanceof aku) {
/*  94 */       zx zx = new zx(zy.cE, 1, ((aku)akw).b());
/*     */       
/*  96 */       dn dn = new dn();
/*  97 */       akw.b(dn);
/*  98 */       dn.o("x");
/*  99 */       dn.o("y");
/* 100 */       dn.o("z");
/* 101 */       dn.o("id");
/* 102 */       zx.a("BlockEntityTag", dn);
/*     */       
/* 104 */       a(☃, cj1, zx);
/*     */     } else {
/* 106 */       super.a(☃, cj1, alz1, f, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/* 112 */     return (!e(☃, cj1) && super.d(☃, cj1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, wn wn1, cj cj1, alz alz1, akw akw1) {
/* 117 */     if (akw1 instanceof aku) {
/* 118 */       aku aku = (aku)akw1;
/* 119 */       zx zx = new zx(zy.cE, 1, ((aku)akw1).b());
/*     */       
/* 121 */       dn dn = new dn();
/* 122 */       aku.a(dn, aku.b(), aku.d());
/* 123 */       zx.a("BlockEntityTag", dn);
/*     */       
/* 125 */       a(☃, cj1, zx);
/*     */     } else {
/* 127 */       super.a(☃, wn1, cj1, alz1, (akw)null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class b extends afa {
/*     */     public b() {
/* 133 */       j(this.M.b().a(a, cq.c));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(adq ☃, cj cj1) {
/* 138 */       cq cq = ☃.p(cj1).<cq>b(a);
/*     */       
/* 140 */       float f1 = 0.0F;
/* 141 */       float f2 = 0.78125F;
/* 142 */       float f3 = 0.0F;
/* 143 */       float f4 = 1.0F;
/*     */       
/* 145 */       float f5 = 0.125F;
/*     */       
/* 147 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/* 149 */       switch (afa.null.a[cq.ordinal()]) {
/*     */         
/*     */         default:
/* 152 */           a(f3, f1, 1.0F - f5, f4, f2, 1.0F);
/*     */           return;
/*     */         case 2:
/* 155 */           a(f3, f1, 0.0F, f4, f2, f5);
/*     */           return;
/*     */         case 3:
/* 158 */           a(1.0F - f5, f1, f3, 1.0F, f2, f4); return;
/*     */         case 4:
/*     */           break;
/* 161 */       }  a(0.0F, f1, f3, f5, f2, f4);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 168 */       cq cq = alz1.<cq>b(a);
/*     */       
/* 170 */       if (!☃.p(cj1.a(cq.d())).c().t().a()) {
/* 171 */         b(☃, cj1, alz1, 0);
/* 172 */         ☃.g(cj1);
/*     */       } 
/*     */       
/* 175 */       super.a(☃, cj1, alz1, afh1);
/*     */     }
/*     */ 
/*     */     
/*     */     public alz a(int ☃) {
/* 180 */       cq cq = cq.a(☃);
/* 181 */       if (cq.k() == cq.a.b) {
/* 182 */         cq = cq.c;
/*     */       }
/* 184 */       return Q().a(a, cq);
/*     */     }
/*     */ 
/*     */     
/*     */     public int c(alz ☃) {
/* 189 */       return ((cq)☃.<cq>b(a)).a();
/*     */     }
/*     */ 
/*     */     
/*     */     protected ama e() {
/* 194 */       return new ama(this, new amo[] { a });
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a extends afa {
/*     */     public a() {
/* 200 */       j(this.M.b().a(b, Integer.valueOf(0)));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 205 */       if (!☃.p(cj1.b()).c().t().a()) {
/* 206 */         b(☃, cj1, alz1, 0);
/* 207 */         ☃.g(cj1);
/*     */       } 
/*     */       
/* 210 */       super.a(☃, cj1, alz1, afh1);
/*     */     }
/*     */ 
/*     */     
/*     */     public alz a(int ☃) {
/* 215 */       return Q().a(b, Integer.valueOf(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public int c(alz ☃) {
/* 220 */       return ((Integer)☃.<Integer>b(b)).intValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected ama e() {
/* 225 */       return new ama(this, new amo[] { b });
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */