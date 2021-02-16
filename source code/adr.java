/*    */ 
/*    */ public class adr
/*    */ {
/*  4 */   public static final adr[] a = new adr[16];
/*    */   
/*  6 */   public static final adr b = (new adr(0, "default", 1)).i();
/*  7 */   public static final adr c = new adr(1, "flat");
/*  8 */   public static final adr d = new adr(2, "largeBiomes");
/*  9 */   public static final adr e = (new adr(3, "amplified")).j();
/* 10 */   public static final adr f = new adr(4, "customized");
/* 11 */   public static final adr g = new adr(5, "debug_all_block_states");
/*    */   
/* 13 */   public static final adr h = (new adr(8, "default_1_1", 0)).a(false);
/*    */   
/*    */   private final int i;
/*    */   private final String j;
/*    */   private final int k;
/*    */   private boolean l;
/*    */   private boolean m;
/*    */   private boolean n;
/*    */   
/*    */   private adr(int ☃, String str) {
/* 23 */     this(☃, str, 0);
/*    */   }
/*    */   
/*    */   private adr(int ☃, String str, int i) {
/* 27 */     this.j = str;
/* 28 */     this.k = i;
/* 29 */     this.l = true;
/* 30 */     this.i = ☃;
/* 31 */     a[☃] = this;
/*    */   }
/*    */   
/*    */   public String a() {
/* 35 */     return this.j;
/*    */   }
/*    */   
/*    */   public String b() {
/* 39 */     return "generator." + this.j;
/*    */   }
/*    */   
/*    */   public String c() {
/* 43 */     return b() + ".info";
/*    */   }
/*    */   
/*    */   public int d() {
/* 47 */     return this.k;
/*    */   }
/*    */   
/*    */   public adr a(int ☃) {
/* 51 */     if (this == b && ☃ == 0) {
/* 52 */       return h;
/*    */     }
/* 54 */     return this;
/*    */   }
/*    */   
/*    */   private adr a(boolean ☃) {
/* 58 */     this.l = ☃;
/* 59 */     return this;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 63 */     return this.l;
/*    */   }
/*    */   
/*    */   private adr i() {
/* 67 */     this.m = true;
/* 68 */     return this;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 72 */     return this.m;
/*    */   }
/*    */   
/*    */   public static adr a(String ☃) {
/* 76 */     for (int i = 0; i < a.length; i++) {
/* 77 */       if (a[i] != null && (a[i]).j.equalsIgnoreCase(☃)) {
/* 78 */         return a[i];
/*    */       }
/*    */     } 
/* 81 */     return null;
/*    */   }
/*    */   
/*    */   public int g() {
/* 85 */     return this.i;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 89 */     return this.n;
/*    */   }
/*    */   
/*    */   private adr j() {
/* 93 */     this.n = true;
/* 94 */     return this;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */