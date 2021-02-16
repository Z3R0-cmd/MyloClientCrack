/*     */ import com.mojang.authlib.GameProfile;
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
/*     */ public class aat
/*     */   extends zw
/*     */ {
/*  23 */   private static final String[] a = new String[] { "skeleton", "wither", "zombie", "char", "creeper" };
/*     */ 
/*     */ 
/*     */   
/*     */   public aat() {
/*  28 */     a(yz.c);
/*  29 */     d(0);
/*  30 */     a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/*  35 */     if (cq1 == cq.a) {
/*  36 */       return false;
/*     */     }
/*     */     
/*  39 */     alz alz = adm1.p(cj1);
/*  40 */     afh afh = alz.c();
/*  41 */     boolean bool = afh.a(adm1, cj1);
/*     */     
/*  43 */     if (!bool) {
/*  44 */       if (!adm1.p(cj1).c().t().a()) {
/*  45 */         return false;
/*     */       }
/*  47 */       cj1 = cj1.a(cq1);
/*     */     } 
/*     */     
/*  50 */     if (!wn1.a(cj1, cq1, ☃)) {
/*  51 */       return false;
/*     */     }
/*  53 */     if (!afi.ce.d(adm1, cj1)) {
/*  54 */       return false;
/*     */     }
/*     */     
/*  57 */     if (!adm1.D) {
/*  58 */       adm1.a(cj1, afi.ce.Q().a(ajm.a, cq1), 3);
/*     */       
/*  60 */       int i = 0;
/*  61 */       if (cq1 == cq.b) {
/*  62 */         i = ns.c((wn1.y * 16.0F / 360.0F) + 0.5D) & 0xF;
/*     */       }
/*     */       
/*  65 */       akw akw = adm1.s(cj1);
/*  66 */       if (akw instanceof alo) {
/*  67 */         alo alo = (alo)akw;
/*  68 */         if (☃.i() == 3) {
/*  69 */           GameProfile gameProfile = null;
/*  70 */           if (☃.n()) {
/*  71 */             dn dn = ☃.o();
/*     */             
/*  73 */             if (dn.b("SkullOwner", 10)) {
/*  74 */               gameProfile = dy.a(dn.m("SkullOwner"));
/*  75 */             } else if (dn.b("SkullOwner", 8) && dn.j("SkullOwner").length() > 0) {
/*  76 */               gameProfile = new GameProfile(null, dn.j("SkullOwner"));
/*     */             } 
/*     */           } 
/*     */           
/*  80 */           alo.a(gameProfile);
/*     */         } else {
/*  82 */           alo.a(☃.i());
/*     */         } 
/*  84 */         alo.b(i);
/*  85 */         afi.ce.a(adm1, cj1, alo);
/*     */       } 
/*     */       
/*  88 */       ☃.b--;
/*     */     } 
/*     */     
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zw ☃, yz yz1, List<zx> list) {
/*  96 */     for (int i = 0; i < a.length; i++) {
/*  97 */       list.add(new zx(☃, 1, i));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃) {
/* 103 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_(zx ☃) {
/* 108 */     int i = ☃.i();
/* 109 */     if (i < 0 || i >= a.length) {
/* 110 */       i = 0;
/*     */     }
/* 112 */     return a() + "." + a[i];
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(zx ☃) {
/* 117 */     if (☃.i() == 3 && ☃.n()) {
/* 118 */       if (☃.o().b("SkullOwner", 8))
/* 119 */         return di.a("item.skull.player.name", new Object[] { ☃.o().j("SkullOwner") }); 
/* 120 */       if (☃.o().b("SkullOwner", 10)) {
/* 121 */         dn dn = ☃.o().m("SkullOwner");
/* 122 */         if (dn.b("Name", 8)) {
/* 123 */           return di.a("item.skull.player.name", new Object[] { dn.j("Name") });
/*     */         }
/*     */       } 
/*     */     } 
/* 127 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(dn ☃) {
/* 132 */     super.a(☃);
/* 133 */     if (☃.b("SkullOwner", 8) && ☃.j("SkullOwner").length() > 0) {
/* 134 */       GameProfile gameProfile = new GameProfile(null, ☃.j("SkullOwner"));
/* 135 */       gameProfile = alo.b(gameProfile);
/* 136 */       ☃.a("SkullOwner", dy.a(new dn(), gameProfile));
/* 137 */       return true;
/*     */     } 
/* 139 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */