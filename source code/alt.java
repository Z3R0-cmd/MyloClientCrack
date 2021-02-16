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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alt
/*     */   extends afh
/*     */ {
/*  26 */   public static final aml a = aml.a("facing");
/*  27 */   public static final amm<a> b = amm.a("type", a.class);
/*  28 */   public static final amk N = amk.a("short");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public alt() {
/*  34 */     super(arm.H);
/*  35 */     j(this.M.b().<Comparable, cq>a(a, cq.c).<a, a>a(b, a.a).a(N, Boolean.valueOf(false)));
/*  36 */     a(i);
/*  37 */     c(0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, wn wn1) {
/*  42 */     if (wn1.bA.d) {
/*  43 */       cq cq = alz1.<cq>b(a);
/*  44 */       if (cq != null) {
/*  45 */         cj cj2 = cj1.a(cq.d());
/*  46 */         afh afh1 = ☃.p(cj2).c();
/*  47 */         if (afh1 == afi.J || afh1 == afi.F) {
/*  48 */           ☃.g(cj2);
/*     */         }
/*     */       } 
/*     */     } 
/*  52 */     super.a(☃, cj1, alz1, wn1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(adm ☃, cj cj1, alz alz1) {
/*  57 */     super.b(☃, cj1, alz1);
/*  58 */     cq cq = ((cq)alz1.<cq>b(a)).d();
/*  59 */     cj1 = cj1.a(cq);
/*     */     
/*  61 */     alz alz2 = ☃.p(cj1);
/*  62 */     if ((alz2.c() == afi.J || alz2.c() == afi.F) && (
/*  63 */       (Boolean)alz2.<Boolean>b(als.b)).booleanValue()) {
/*  64 */       alz2.c().b(☃, cj1, alz2, 0);
/*  65 */       ☃.g(cj1);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  72 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(adm ☃, cj cj1) {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(adm ☃, cj cj1, cq cq1) {
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃) {
/*  92 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, aug aug1, List<aug> list, pk pk1) {
/*  97 */     d(alz1);
/*  98 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/* 100 */     e(alz1);
/* 101 */     super.a(☃, cj1, alz1, aug1, list, pk1);
/*     */     
/* 103 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void e(alz ☃) {
/* 107 */     float f1 = 0.25F;
/* 108 */     float f2 = 0.375F;
/* 109 */     float f3 = 0.625F;
/* 110 */     float f4 = 0.25F;
/* 111 */     float f5 = 0.75F;
/*     */     
/* 113 */     switch (null.a[((cq)☃.b(a)).ordinal()]) {
/*     */       case 1:
/* 115 */         a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
/*     */         break;
/*     */       case 2:
/* 118 */         a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
/*     */         break;
/*     */       case 3:
/* 121 */         a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
/*     */         break;
/*     */       case 4:
/* 124 */         a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
/*     */         break;
/*     */       case 5:
/* 127 */         a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
/*     */         break;
/*     */       case 6:
/* 130 */         a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adq ☃, cj cj1) {
/* 137 */     d(☃.p(cj1));
/*     */   }
/*     */   
/*     */   public void d(alz ☃) {
/* 141 */     float f = 0.25F;
/* 142 */     cq cq = ☃.<cq>b(a);
/* 143 */     if (cq == null) {
/*     */       return;
/*     */     }
/*     */     
/* 147 */     switch (null.a[cq.ordinal()]) {
/*     */       case 1:
/* 149 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
/*     */         break;
/*     */       case 2:
/* 152 */         a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         break;
/*     */       case 3:
/* 155 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
/*     */         break;
/*     */       case 4:
/* 158 */         a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
/*     */         break;
/*     */       case 5:
/* 161 */         a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
/*     */         break;
/*     */       case 6:
/* 164 */         a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 171 */     cq cq = alz1.<cq>b(a);
/* 172 */     cj cj2 = cj1.a(cq.d());
/* 173 */     alz alz2 = ☃.p(cj2);
/* 174 */     if (alz2.c() != afi.J && alz2.c() != afi.F) {
/* 175 */       ☃.g(cj1);
/*     */     } else {
/* 177 */       alz2.c().a(☃, cj2, alz2, afh1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(adq ☃, cj cj1, cq cq1) {
/* 183 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static cq b(int ☃) {
/* 188 */     int i = ☃ & 0x7;
/* 189 */     if (i > 5) {
/* 190 */       return null;
/*     */     }
/* 192 */     return cq.a(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public zw c(adm ☃, cj cj1) {
/* 197 */     if (☃.p(cj1).b(b) == a.b) {
/* 198 */       return zw.a(afi.F);
/*     */     }
/* 200 */     return zw.a(afi.J);
/*     */   }
/*     */ 
/*     */   
/*     */   public alz a(int ☃) {
/* 205 */     return Q().<Comparable, cq>a(a, b(☃)).a(b, ((☃ & 0x8) > 0) ? a.b : a.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c(alz ☃) {
/* 212 */     int i = 0;
/*     */     
/* 214 */     i |= ((cq)☃.<cq>b(a)).a();
/*     */     
/* 216 */     if (☃.b(b) == a.b) {
/* 217 */       i |= 0x8;
/*     */     }
/*     */     
/* 220 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ama e() {
/* 225 */     return new ama(this, new amo[] { a, b, N });
/*     */   }
/*     */   
/*     */   public enum a implements nw {
/* 229 */     a("normal"),
/* 230 */     b("sticky");
/*     */     private final String c;
/*     */     
/*     */     a(String ☃) {
/* 234 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 239 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public String l() {
/* 244 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */