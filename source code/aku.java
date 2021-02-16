/*     */ import com.google.common.collect.Lists;
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
/*     */ public class aku
/*     */   extends akw
/*     */ {
/*     */   private int a;
/*     */   private du f;
/*     */   private boolean g;
/*     */   private List<a> h;
/*     */   private List<zd> i;
/*     */   private String j;
/*     */   
/*     */   public enum a
/*     */   {
/*  29 */     a("base", "b"),
/*  30 */     b("square_bottom_left", "bl", "   ", "   ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     c("square_bottom_right", "br", "   ", "   ", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     d("square_top_left", "tl", "#  ", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     e("square_top_right", "tr", "  #", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     f("stripe_bottom", "bs", "   ", "   ", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     g("stripe_top", "ts", "###", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     h("stripe_left", "ls", "#  ", "#  ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     i("stripe_right", "rs", "  #", "  #", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     j("stripe_center", "cs", " # ", " # ", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     k("stripe_middle", "ms", "   ", "###", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     l("stripe_downright", "drs", "#  ", " # ", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     m("stripe_downleft", "dls", "  #", " # ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     n("small_stripes", "ss", "# #", "# #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     o("cross", "cr", "# #", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     p("straight_cross", "sc", " # ", "###", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     q("triangle_bottom", "bt", "   ", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     r("triangle_top", "tt", "# #", " # ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     s("triangles_bottom", "bts", "   ", "# #", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     t("triangles_top", "tts", " # ", "# #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     u("diagonal_left", "ld", "## ", "#  ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     v("diagonal_up_right", "rd", "   ", "  #", " ##"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     w("diagonal_up_left", "lud", "   ", "#  ", "## "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     x("diagonal_right", "rud", " ##", "  #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     y("circle", "mc", "   ", " # ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     z("rhombus", "mr", " # ", "# #", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     A("half_vertical", "vh", "## ", "## ", "## "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     B("half_horizontal", "hh", "###", "###", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     C("half_vertical_right", "vhr", " ##", " ##", " ##"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     D("half_horizontal_bottom", "hhb", "   ", "###", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     E("border", "bo", "###", "# #", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     F("curly_border", "cbo", (String)new zx(afi.bn)),
/* 181 */     G("creeper", "cre", (String)new zx(zy.bX, 1, 4)),
/* 182 */     H("gradient", "gra", "# #", " # ", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     I("gradient_up", "gru", " # ", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     J("bricks", "bri", (String)new zx(afi.V)),
/* 193 */     K("skull", "sku", (String)new zx(zy.bX, 1, 1)),
/* 194 */     L("flower", "flo", (String)new zx(afi.O, 1, agw.a.j.b())),
/* 195 */     M("mojang", "moj", (String)new zx(zy.ao, 1, 1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     private String[] P = new String[3];
/*     */     private String N;
/*     */     
/*     */     a(String ☃, String str1) {
/* 205 */       this.N = ☃;
/* 206 */       this.O = str1;
/*     */     }
/*     */     private String O; private zx Q;
/*     */     
/*     */     a(String ☃, String str1, zx zx1) {
/* 211 */       this.Q = zx1;
/*     */     }
/*     */ 
/*     */     
/*     */     a(String ☃, String str1, String str2, String str3, String str4) {
/* 216 */       this.P[0] = str2;
/* 217 */       this.P[1] = str3;
/* 218 */       this.P[2] = str4;
/*     */     }
/*     */     
/*     */     public String a() {
/* 222 */       return this.N;
/*     */     }
/*     */     
/*     */     public String b() {
/* 226 */       return this.O;
/*     */     }
/*     */     
/*     */     public String[] c() {
/* 230 */       return this.P;
/*     */     }
/*     */     
/*     */     public boolean d() {
/* 234 */       return (this.Q != null || this.P[0] != null);
/*     */     }
/*     */     
/*     */     public boolean e() {
/* 238 */       return (this.Q != null);
/*     */     }
/*     */     
/*     */     public zx f() {
/* 242 */       return this.Q;
/*     */     } public static a a(String ☃) {
/*     */       a[] arrayOfA;
/*     */       int i;
/*     */       int j;
/* 247 */       for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 248 */         if (a1.O.equals(☃))
/* 249 */           return a1; 
/*     */         j++; }
/*     */       
/* 252 */       return null;
/*     */     }
/*     */   }
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
/*     */   public void a(zx ☃) {
/* 266 */     this.f = null;
/* 267 */     if (☃.n() && ☃.o().b("BlockEntityTag", 10)) {
/* 268 */       dn dn = ☃.o().m("BlockEntityTag");
/* 269 */       if (dn.c("Patterns")) {
/* 270 */         this.f = (du)dn.c("Patterns", 10).b();
/*     */       }
/* 272 */       if (dn.b("Base", 99)) {
/* 273 */         this.a = dn.f("Base");
/*     */       } else {
/* 275 */         this.a = ☃.i() & 0xF;
/*     */       } 
/*     */     } else {
/* 278 */       this.a = ☃.i() & 0xF;
/*     */     } 
/* 280 */     this.h = null;
/* 281 */     this.i = null;
/* 282 */     this.j = "";
/* 283 */     this.g = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/* 288 */     super.b(☃);
/*     */     
/* 290 */     a(☃, this.a, this.f);
/*     */   }
/*     */   
/*     */   public static void a(dn ☃, int i, du du1) {
/* 294 */     ☃.a("Base", i);
/* 295 */     if (du1 != null) {
/* 296 */       ☃.a("Patterns", du1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/* 302 */     super.a(☃);
/*     */     
/* 304 */     this.a = ☃.f("Base");
/* 305 */     this.f = ☃.c("Patterns", 10);
/*     */     
/* 307 */     this.h = null;
/* 308 */     this.i = null;
/* 309 */     this.j = null;
/* 310 */     this.g = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ff y_() {
/* 315 */     dn ☃ = new dn();
/* 316 */     b(☃);
/* 317 */     return new ft(this.c, 6, ☃);
/*     */   }
/*     */   
/*     */   public int b() {
/* 321 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int b(zx ☃) {
/* 326 */     dn dn = ☃.a("BlockEntityTag", false);
/* 327 */     if (dn != null && dn.c("Base")) {
/* 328 */       return dn.f("Base");
/*     */     }
/* 330 */     return ☃.i();
/*     */   }
/*     */   
/*     */   public static int c(zx ☃) {
/* 334 */     dn dn = ☃.a("BlockEntityTag", false);
/* 335 */     if (dn != null && dn.c("Patterns")) {
/* 336 */       return dn.c("Patterns", 10).c();
/*     */     }
/* 338 */     return 0;
/*     */   }
/*     */   
/*     */   public List<a> c() {
/* 342 */     h();
/* 343 */     return this.h;
/*     */   }
/*     */   
/*     */   public du d() {
/* 347 */     return this.f;
/*     */   }
/*     */   
/*     */   public List<zd> e() {
/* 351 */     h();
/* 352 */     return this.i;
/*     */   }
/*     */   
/*     */   public String g() {
/* 356 */     h();
/* 357 */     return this.j;
/*     */   }
/*     */   
/*     */   private void h() {
/* 361 */     if (this.h != null && this.i != null && this.j != null) {
/*     */       return;
/*     */     }
/* 364 */     if (!this.g) {
/* 365 */       this.j = "";
/*     */       
/*     */       return;
/*     */     } 
/* 369 */     this.h = Lists.newArrayList();
/* 370 */     this.i = Lists.newArrayList();
/*     */ 
/*     */     
/* 373 */     this.h.add(a.a);
/* 374 */     this.i.add(zd.a(this.a));
/* 375 */     this.j = "b" + this.a;
/*     */     
/* 377 */     if (this.f != null) {
/* 378 */       for (int ☃ = 0; ☃ < this.f.c(); ☃++) {
/* 379 */         dn dn = this.f.b(☃);
/* 380 */         a a = a.a(dn.j("Pattern"));
/* 381 */         if (a != null) {
/* 382 */           this.h.add(a);
/* 383 */           int i = dn.f("Color");
/* 384 */           this.i.add(zd.a(i));
/*     */           
/* 386 */           this.j += a.b() + i;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
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
/*     */   
/*     */   public static void e(zx ☃) {
/* 423 */     dn dn = ☃.a("BlockEntityTag", false);
/* 424 */     if (dn == null || !dn.b("Patterns", 9)) {
/*     */       return;
/*     */     }
/*     */     
/* 428 */     du du1 = dn.c("Patterns", 10);
/* 429 */     if (du1.c() <= 0) {
/*     */       return;
/*     */     }
/* 432 */     du1.a(du1.c() - 1);
/*     */     
/* 434 */     if (du1.c_()) {
/* 435 */       ☃.o().o("BlockEntityTag");
/* 436 */       if (☃.o().c_())
/* 437 */         ☃.d((dn)null); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */