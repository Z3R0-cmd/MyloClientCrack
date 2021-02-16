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
/*     */ class a
/*     */ {
/*     */   private String a;
/*     */   private boolean b;
/*     */   private int c;
/*     */   private double d;
/*     */   private final adk.b e;
/*     */   
/*     */   public a(String ☃, adk.b b1) {
/* 137 */     this.e = b1;
/* 138 */     a(☃);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 142 */     this.a = ☃;
/* 143 */     this.b = Boolean.parseBoolean(☃);
/* 144 */     this.c = this.b ? 1 : 0;
/*     */     try {
/* 146 */       this.c = Integer.parseInt(☃);
/* 147 */     } catch (NumberFormatException numberFormatException) {}
/*     */     
/*     */     try {
/* 150 */       this.d = Double.parseDouble(☃);
/* 151 */     } catch (NumberFormatException numberFormatException) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 156 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 160 */     return this.b;
/*     */   }
/*     */   
/*     */   public int c() {
/* 164 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public adk.b e() {
/* 172 */     return this.e;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adk$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */