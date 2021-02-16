/*     */ import com.google.common.base.Predicate;
/*     */ import java.util.Iterator;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajm
/*     */   extends afc
/*     */ {
/*  37 */   public static final aml a = aml.a("facing");
/*  38 */   public static final amk b = amk.a("nodrop");
/*     */   
/*  40 */   private static final Predicate<amc> N = new Predicate<amc>()
/*     */     {
/*     */       public boolean a(amc ☃) {
/*  43 */         return (☃.a() != null && ☃.a().c() == afi.ce && ☃.b() instanceof alo && ((alo)☃.b()).c() == 1);
/*     */       }
/*     */     };
/*     */   
/*     */   private amd O;
/*     */   private amd P;
/*     */   
/*     */   protected ajm() {
/*  51 */     super(arm.q);
/*  52 */     j(this.M.b().<Comparable, cq>a(a, cq.c).a(b, Boolean.valueOf(false)));
/*  53 */     a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/*  58 */     return di.a("tile.skull.skeleton.name");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/*  73 */     switch (null.a[((cq)☃.p(cj1).b(a)).ordinal()]) {
/*     */       
/*     */       default:
/*  76 */         a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*     */         return;
/*     */       case 2:
/*  79 */         a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
/*     */         return;
/*     */       case 3:
/*  82 */         a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
/*     */         return;
/*     */       case 4:
/*  85 */         a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F); return;
/*     */       case 5:
/*     */         break;
/*  88 */     }  a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aug a(adm ☃, cj cj1, alz alz1) {
/*  96 */     a(☃, cj1);
/*  97 */     return super.a(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 102 */     return Q().<Comparable, cq>a(a, pr1.aP()).a(b, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public akw a(adm ☃, int i) {
/* 107 */     return new alo();
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 112 */     return zy.bX;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j(adm ☃, cj cj1) {
/* 117 */     akw akw = ☃.s(cj1);
/* 118 */     if (akw instanceof alo) {
/* 119 */       return ((alo)akw).c();
/*     */     }
/* 121 */     return super.j(☃, cj1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, float f, int i) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/* 132 */     if (wn1.bA.d) {
/*     */       
/* 134 */       alz1 = alz1.a(b, Boolean.valueOf(true));
/* 135 */       ☃.a(cj1, alz1, 4);
/*     */     } 
/* 137 */     super.a(☃, cj1, alz1, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/* 142 */     if (☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 146 */     if (!((Boolean)alz1.<Boolean>b(b)).booleanValue()) {
/* 147 */       akw akw = ☃.s(cj1);
/* 148 */       if (akw instanceof alo) {
/* 149 */         alo alo = (alo)akw;
/* 150 */         zx zx = new zx(zy.bX, 1, j(☃, cj1));
/*     */         
/* 152 */         if (alo.c() == 3 && alo.b() != null) {
/* 153 */           zx.d(new dn());
/*     */           
/* 155 */           dn dn = new dn();
/*     */           
/* 157 */           dy.a(dn, alo.b());
/* 158 */           zx.o().a("SkullOwner", dn);
/*     */         } 
/*     */         
/* 161 */         a(☃, cj1, zx);
/*     */       } 
/*     */     } 
/* 164 */     super.b(☃, cj1, alz1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zw a(alz ☃, Random random, int i) {
/* 170 */     return zy.bX;
/*     */   }
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, zx zx1) {
/* 174 */     if (zx1.i() == 1 && cj1.o() >= 2 && ☃.aa() != oj.a && !☃.D) {
/* 175 */       return (l().a(☃, cj1) != null);
/*     */     }
/*     */     
/* 178 */     return false;
/*     */   }
/*     */   
/*     */   public void a(adm ☃, cj cj1, alo alo1) {
/* 182 */     if (alo1.c() != 1 || cj1.o() < 2 || ☃.aa() == oj.a || ☃.D) {
/*     */       return;
/*     */     }
/*     */     
/* 186 */     amd amd1 = n();
/* 187 */     amd.b b = amd1.a(☃, cj1);
/* 188 */     if (b == null) {
/*     */       return;
/*     */     }
/*     */     int i;
/* 192 */     for (i = 0; i < 3; i++) {
/* 193 */       amc amc = b.a(i, 0, 0);
/* 194 */       ☃.a(amc.d(), amc.a().a(b, Boolean.valueOf(true)), 2);
/*     */     } 
/* 196 */     for (i = 0; i < amd1.c(); i++) {
/* 197 */       for (int k = 0; k < amd1.b(); k++) {
/* 198 */         amc amc = b.a(i, k, 0);
/* 199 */         ☃.a(amc.d(), afi.a.Q(), 2);
/*     */       } 
/*     */     } 
/*     */     
/* 203 */     cj cj2 = b.a(1, 0, 0).d();
/*     */     
/* 205 */     uk uk = new uk(☃);
/* 206 */     cj cj3 = b.a(1, 2, 0).d();
/* 207 */     uk.b(cj3.n() + 0.5D, cj3.o() + 0.55D, cj3.p() + 0.5D, (b.b().k() == cq.a.a) ? 0.0F : 90.0F, 0.0F);
/* 208 */     uk.aI = (b.b().k() == cq.a.a) ? 0.0F : 90.0F;
/* 209 */     uk.n();
/*     */     
/* 211 */     for (Iterator<wn> iterator = ☃.<wn>a(wn.class, uk.aR().b(50.0D, 50.0D, 50.0D)).iterator(); iterator.hasNext(); ) { wn wn = iterator.next();
/* 212 */       wn.b(mr.I); }
/*     */ 
/*     */     
/* 215 */     ☃.d(uk);
/*     */     int j;
/* 217 */     for (j = 0; j < 120; j++) {
/* 218 */       ☃.a(cy.F, cj2.n() + ☃.s.nextDouble(), (cj2.o() - 2) + ☃.s.nextDouble() * 3.9D, cj2.p() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*     */     }
/*     */     
/* 221 */     for (j = 0; j < amd1.c(); j++) {
/* 222 */       for (int k = 0; k < amd1.b(); k++) {
/* 223 */         amc amc = b.a(j, k, 0);
/* 224 */         ☃.b(amc.d(), afi.a);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 231 */     return Q().<Comparable, cq>a(a, cq.a(☃ & 0x7)).a(b, Boolean.valueOf(((☃ & 0x8) > 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 238 */     int i = 0;
/*     */     
/* 240 */     i |= ((cq)☃.<cq>b(a)).a();
/*     */     
/* 242 */     if (((Boolean)☃.<Boolean>b(b)).booleanValue()) {
/* 243 */       i |= 0x8;
/*     */     }
/*     */     
/* 246 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 251 */     return new ama(this, new amo[] { a, b });
/*     */   }
/*     */   
/*     */   protected amd l() {
/* 255 */     if (this.O == null) {
/* 256 */       this.O = ame.a().a(new String[] { "   ", "###", "~#~" }).a('#', amc.a(amh.a(afi.aW))).a('~', amc.a(amh.a(afi.a))).b();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     return this.O;
/*     */   }
/*     */   
/*     */   protected amd n() {
/* 271 */     if (this.P == null) {
/* 272 */       this.P = ame.a().a(new String[] { "^^^", "###", "~#~" }).a('#', amc.a(amh.a(afi.aW))).a('^', N).a('~', amc.a(amh.a(afi.a))).b();
/*     */     }
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
/* 284 */     return this.P;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ajm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */