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
/*     */ public enum a
/*     */ {
/*  29 */   a("base", "b"),
/*  30 */   b("square_bottom_left", "bl", "   ", "   ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  35 */   c("square_bottom_right", "br", "   ", "   ", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   d("square_top_left", "tl", "#  ", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  45 */   e("square_top_right", "tr", "  #", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  50 */   f("stripe_bottom", "bs", "   ", "   ", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  55 */   g("stripe_top", "ts", "###", "   ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   h("stripe_left", "ls", "#  ", "#  ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   i("stripe_right", "rs", "  #", "  #", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  70 */   j("stripe_center", "cs", " # ", " # ", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  75 */   k("stripe_middle", "ms", "   ", "###", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  80 */   l("stripe_downright", "drs", "#  ", " # ", "  #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   m("stripe_downleft", "dls", "  #", " # ", "#  "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  90 */   n("small_stripes", "ss", "# #", "# #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   o("cross", "cr", "# #", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 100 */   p("straight_cross", "sc", " # ", "###", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 105 */   q("triangle_bottom", "bt", "   ", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 110 */   r("triangle_top", "tt", "# #", " # ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 115 */   s("triangles_bottom", "bts", "   ", "# #", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 120 */   t("triangles_top", "tts", " # ", "# #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 125 */   u("diagonal_left", "ld", "## ", "#  ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 130 */   v("diagonal_up_right", "rd", "   ", "  #", " ##"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 135 */   w("diagonal_up_left", "lud", "   ", "#  ", "## "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 140 */   x("diagonal_right", "rud", " ##", "  #", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 145 */   y("circle", "mc", "   ", " # ", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 150 */   z("rhombus", "mr", " # ", "# #", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 155 */   A("half_vertical", "vh", "## ", "## ", "## "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 160 */   B("half_horizontal", "hh", "###", "###", "   "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 165 */   C("half_vertical_right", "vhr", " ##", " ##", " ##"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 170 */   D("half_horizontal_bottom", "hhb", "   ", "###", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 175 */   E("border", "bo", "###", "# #", "###"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 180 */   F("curly_border", "cbo", new zx(afi.bn)),
/* 181 */   G("creeper", "cre", new zx(zy.bX, 1, 4)),
/* 182 */   H("gradient", "gra", "# #", " # ", " # "),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 187 */   I("gradient_up", "gru", " # ", " # ", "# #"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 192 */   J("bricks", "bri", new zx(afi.V)),
/* 193 */   K("skull", "sku", new zx(zy.bX, 1, 1)),
/* 194 */   L("flower", "flo", new zx(afi.O, 1, agw.a.j.b())),
/* 195 */   M("mojang", "moj", new zx(zy.ao, 1, 1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 201 */   private String[] P = new String[3];
/*     */   private String N;
/*     */   
/*     */   a(String ☃, String str1) {
/* 205 */     this.N = ☃;
/* 206 */     this.O = str1;
/*     */   }
/*     */   private String O; private zx Q;
/*     */   
/*     */   a(String ☃, String str1, zx zx1) {
/* 211 */     this.Q = zx1;
/*     */   }
/*     */ 
/*     */   
/*     */   a(String ☃, String str1, String str2, String str3, String str4) {
/* 216 */     this.P[0] = str2;
/* 217 */     this.P[1] = str3;
/* 218 */     this.P[2] = str4;
/*     */   }
/*     */   
/*     */   public String a() {
/* 222 */     return this.N;
/*     */   }
/*     */   
/*     */   public String b() {
/* 226 */     return this.O;
/*     */   }
/*     */   
/*     */   public String[] c() {
/* 230 */     return this.P;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 234 */     return (this.Q != null || this.P[0] != null);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 238 */     return (this.Q != null);
/*     */   }
/*     */   
/*     */   public zx f() {
/* 242 */     return this.Q;
/*     */   } public static a a(String ☃) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/* 247 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 248 */       if (a1.O.equals(☃))
/* 249 */         return a1; 
/*     */       j++; }
/*     */     
/* 252 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aku$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */