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
/*  88 */   a("options.invertMouse", false, true),
/*  89 */   b("options.sensitivity", true, false),
/*  90 */   c("options.fov", true, false, 30.0F, 110.0F, 1.0F),
/*  91 */   d("options.gamma", true, false),
/*  92 */   e("options.saturation", true, false),
/*  93 */   f("options.renderDistance", true, false, 2.0F, 16.0F, 1.0F),
/*  94 */   g("options.viewBobbing", false, true),
/*  95 */   h("options.anaglyph", false, true),
/*  96 */   i("options.framerateLimit", true, false, 10.0F, 260.0F, 10.0F),
/*  97 */   j("options.fboEnable", false, true),
/*  98 */   k("options.renderClouds", false, false),
/*  99 */   l("options.graphics", false, false),
/* 100 */   m("options.ao", false, false),
/* 101 */   n("options.guiScale", false, false),
/* 102 */   o("options.particles", false, false),
/* 103 */   p("options.chat.visibility", false, false),
/* 104 */   q("options.chat.color", false, true),
/* 105 */   r("options.chat.links", false, true),
/* 106 */   s("options.chat.opacity", true, false),
/* 107 */   t("options.chat.links.prompt", false, true),
/* 108 */   u("options.snooper", false, true),
/* 109 */   v("options.fullscreen", false, true),
/* 110 */   w("options.vsync", false, true),
/* 111 */   x("options.vbo", false, true),
/* 112 */   y("options.touchscreen", false, true),
/* 113 */   z("options.chat.scale", true, false),
/* 114 */   A("options.chat.width", true, false),
/* 115 */   B("options.chat.height.focused", true, false),
/* 116 */   C("options.chat.height.unfocused", true, false),
/* 117 */   D("options.mipmapLevels", true, false, 0.0F, 4.0F, 1.0F),
/* 118 */   E("options.forceUnicodeFont", false, true),
/* 119 */   F("options.stream.bytesPerPixel", true, false),
/* 120 */   G("options.stream.micVolumne", true, false),
/* 121 */   H("options.stream.systemVolume", true, false),
/* 122 */   I("options.stream.kbps", true, false),
/* 123 */   J("options.stream.fps", true, false),
/* 124 */   K("options.stream.compression", false, false),
/* 125 */   L("options.stream.sendMetadata", false, true),
/* 126 */   M("options.stream.chat.enabled", false, false),
/* 127 */   N("options.stream.chat.userFilter", false, false),
/* 128 */   O("options.stream.micToggleBehavior", false, false),
/* 129 */   P("options.blockAlternatives", false, true),
/* 130 */   Q("options.reducedDebugInfo", false, true),
/* 131 */   R("options.entityShadows", false, true);
/*     */   private final boolean S;
/*     */   private final boolean T;
/*     */   private final String U;
/*     */   private final float V;
/*     */   private float W;
/*     */   private float X;
/*     */   
/*     */   public static a a(int ☃) {
/*     */     a[] arrayOfA;
/*     */     int i;
/*     */     int j;
/* 143 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 144 */       if (a1.c() == ☃)
/* 145 */         return a1; 
/*     */       j++; }
/*     */     
/* 148 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(String ☃, boolean bool1, boolean bool2, float f1, float f2, float f3) {
/* 156 */     this.U = ☃;
/* 157 */     this.S = bool1;
/* 158 */     this.T = bool2;
/* 159 */     this.W = f1;
/* 160 */     this.X = f2;
/* 161 */     this.V = f3;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 165 */     return this.S;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 169 */     return this.T;
/*     */   }
/*     */   
/*     */   public int c() {
/* 173 */     return ordinal();
/*     */   }
/*     */   
/*     */   public String d() {
/* 177 */     return this.U;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float f() {
/* 185 */     return this.X;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 193 */     this.X = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float c(float ☃) {
/* 201 */     return ns.a((e(☃) - this.W) / (this.X - this.W), 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public float d(float ☃) {
/* 205 */     return e(this.W + (this.X - this.W) * ns.a(☃, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public float e(float ☃) {
/* 209 */     ☃ = f(☃);
/* 210 */     return ns.a(☃, this.W, this.X);
/*     */   }
/*     */   
/*     */   protected float f(float ☃) {
/* 214 */     if (this.V > 0.0F) {
/* 215 */       ☃ = this.V * Math.round(☃ / this.V);
/*     */     }
/* 217 */     return ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avh$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */