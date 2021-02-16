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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abd
/*     */   extends zw
/*     */ {
/*     */   public abd() {
/*  36 */     c(1);
/*     */   }
/*     */   
/*     */   public static boolean b(dn ☃) {
/*  40 */     if (!abc.b(☃)) {
/*  41 */       return false;
/*     */     }
/*     */     
/*  44 */     if (!☃.b("title", 8)) {
/*  45 */       return false;
/*     */     }
/*  47 */     String str = ☃.j("title");
/*  48 */     if (str == null || str.length() > 32) {
/*  49 */       return false;
/*     */     }
/*     */     
/*  52 */     if (!☃.b("author", 8)) {
/*  53 */       return false;
/*     */     }
/*     */     
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public static int h(zx ☃) {
/*  60 */     return ☃.o().f("generation");
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(zx ☃) {
/*  65 */     if (☃.n()) {
/*  66 */       dn dn = ☃.o();
/*     */       
/*  68 */       String str = dn.j("title");
/*  69 */       if (!nx.b(str)) {
/*  70 */         return str;
/*     */       }
/*     */     } 
/*  73 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(zx ☃, wn wn1, List<String> list, boolean bool) {
/*  78 */     if (☃.n()) {
/*  79 */       dn dn = ☃.o();
/*     */       
/*  81 */       String str = dn.j("author");
/*  82 */       if (!nx.b(str)) {
/*  83 */         list.add(a.h + di.a("book.byAuthor", new Object[] { str }));
/*     */       }
/*     */       
/*  86 */       list.add(a.h + di.a("book.generation." + dn.f("generation")));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public zx a(zx ☃, adm adm1, wn wn1) {
/*  92 */     if (!adm1.D) {
/*  93 */       a(☃, wn1);
/*     */     }
/*  95 */     wn1.a(☃);
/*  96 */     wn1.b(na.ad[zw.b(this)]);
/*  97 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(zx ☃, wn wn1) {
/* 101 */     if (☃ == null || ☃.o() == null) {
/*     */       return;
/*     */     }
/* 104 */     dn dn = ☃.o();
/* 105 */     if (dn.n("resolved")) {
/*     */       return;
/*     */     }
/* 108 */     dn.a("resolved", true);
/* 109 */     if (!b(dn)) {
/*     */       return;
/*     */     }
/* 112 */     du du = dn.c("pages", 8);
/* 113 */     for (int i = 0; i < du.c(); i++) {
/* 114 */       eu eu; String str = du.f(i);
/*     */       
/*     */       try {
/* 117 */         eu = eu.a.a(str);
/* 118 */         eu = ev.a(wn1, eu, wn1);
/* 119 */       } catch (Exception exception) {
/* 120 */         eu = new fa(str);
/*     */       } 
/* 122 */       du.a(i, new ea(eu.a.a(eu)));
/*     */     } 
/* 124 */     dn.a("pages", du);
/* 125 */     if (wn1 instanceof lf && wn1.bZ() == ☃) {
/* 126 */       yg yg = wn1.bk.a(wn1.bi, wn1.bi.c);
/* 127 */       ((lf)wn1).a.a(new gf(0, yg.e, ☃));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(zx ☃) {
/* 133 */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */