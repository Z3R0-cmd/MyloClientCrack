/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ public enum a {
/*     */   private static final Map<String, a> w;
/*     */   private static final Pattern x;
/*     */   private final String y;
/*     */   private final char z;
/*     */   private final boolean A;
/*     */   private final String B;
/*  13 */   a("BLACK", '0', 0),
/*  14 */   b("DARK_BLUE", '1', 1),
/*  15 */   c("DARK_GREEN", '2', 2),
/*  16 */   d("DARK_AQUA", '3', 3),
/*  17 */   e("DARK_RED", '4', 4),
/*  18 */   f("DARK_PURPLE", '5', 5),
/*  19 */   g("GOLD", '6', 6),
/*  20 */   h("GRAY", '7', 7),
/*  21 */   i("DARK_GRAY", '8', 8),
/*  22 */   j("BLUE", '9', 9),
/*  23 */   k("GREEN", 'a', 10),
/*  24 */   l("AQUA", 'b', 11),
/*  25 */   m("RED", 'c', 12),
/*  26 */   n("LIGHT_PURPLE", 'd', 13),
/*  27 */   o("YELLOW", 'e', 14),
/*  28 */   p("WHITE", 'f', 15),
/*  29 */   q("OBFUSCATED", 'k', true),
/*  30 */   r("BOLD", 'l', true),
/*  31 */   s("STRIKETHROUGH", 'm', true),
/*  32 */   t("UNDERLINE", 'n', true),
/*  33 */   u("ITALIC", 'o', true),
/*  34 */   v("RESET", 'r', -1); private final int C;
/*     */   
/*     */   static {
/*  37 */     w = Maps.newHashMap();
/*  38 */     x = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
/*     */     a[] ☃;
/*     */     int i, j;
/*  41 */     for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/*  42 */       w.put(c(a1.y), a1);
/*     */       j++; }
/*     */   
/*     */   }
/*     */   private static String c(String ☃) {
/*  47 */     return ☃.toLowerCase().replaceAll("[^a-z]", "");
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
/*     */   a(String ☃, char c, boolean bool, int i) {
/*  65 */     this.y = ☃;
/*  66 */     this.z = c;
/*  67 */     this.A = bool;
/*  68 */     this.C = i;
/*     */     
/*  70 */     this.B = "§" + c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/*  78 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  82 */     return this.A;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  86 */     return (!this.A && this != v);
/*     */   }
/*     */   
/*     */   public String e() {
/*  90 */     return name().toLowerCase();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  95 */     return this.B;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String a(String ☃) {
/* 100 */     return (☃ == null) ? null : x.matcher(☃).replaceAll("");
/*     */   }
/*     */ 
/*     */   
/*     */   public static a b(String ☃) {
/* 105 */     if (☃ == null) {
/* 106 */       return null;
/*     */     }
/* 108 */     return w.get(c(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static a a(int ☃) {
/* 113 */     if (☃ < 0)
/* 114 */       return v;  a[] arrayOfA; int i;
/*     */     int j;
/* 116 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 117 */       if (a1.b() == ☃)
/* 118 */         return a1; 
/*     */       j++; }
/*     */     
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   public static Collection<String> a(boolean ☃, boolean bool1) {
/* 125 */     List<String> list = Lists.newArrayList(); a[] arrayOfA;
/*     */     int i, j;
/* 127 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 128 */       if (!a1.d() || ☃)
/*     */       {
/*     */         
/* 131 */         if (!a1.c() || bool1)
/*     */         {
/*     */           
/* 134 */           list.add(a1.e()); }  } 
/*     */       j++; }
/*     */     
/* 137 */     return list;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */