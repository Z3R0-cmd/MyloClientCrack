/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aul
/*     */   extends auq
/*     */ {
/*     */   private final auo a;
/*     */   private final String b;
/*  21 */   private final Set<String> c = Sets.newHashSet();
/*     */   private String d;
/*  23 */   private String e = "";
/*  24 */   private String f = "";
/*     */   private boolean g = true;
/*     */   private boolean h = true;
/*  27 */   private auq.a i = auq.a.a;
/*  28 */   private auq.a j = auq.a.a;
/*  29 */   private a k = a.v;
/*     */   
/*     */   public aul(auo ☃, String str) {
/*  32 */     this.a = ☃;
/*  33 */     this.b = str;
/*  34 */     this.d = str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/*  43 */     return this.b;
/*     */   }
/*     */   
/*     */   public String c() {
/*  47 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  51 */     if (☃ == null) {
/*  52 */       throw new IllegalArgumentException("Name cannot be null");
/*     */     }
/*  54 */     this.d = ☃;
/*  55 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> d() {
/*  60 */     return this.c;
/*     */   }
/*     */   
/*     */   public String e() {
/*  64 */     return this.e;
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/*  68 */     if (☃ == null) {
/*  69 */       throw new IllegalArgumentException("Prefix cannot be null");
/*     */     }
/*  71 */     this.e = ☃;
/*  72 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public String f() {
/*  76 */     return this.f;
/*     */   }
/*     */   
/*     */   public void c(String ☃) {
/*  80 */     this.f = ☃;
/*  81 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public String d(String ☃) {
/*  86 */     return e() + ☃ + f();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String a(auq ☃, String str) {
/*  94 */     if (☃ == null) {
/*  95 */       return str;
/*     */     }
/*  97 */     return ☃.d(str);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 102 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 106 */     this.g = ☃;
/* 107 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 112 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 116 */     this.h = ☃;
/* 117 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public auq.a i() {
/* 122 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public auq.a j() {
/* 127 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(auq.a ☃) {
/* 131 */     this.i = ☃;
/* 132 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public void b(auq.a ☃) {
/* 136 */     this.j = ☃;
/* 137 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public int k() {
/* 141 */     int ☃ = 0;
/*     */     
/* 143 */     if (g()) {
/* 144 */       ☃ |= 0x1;
/*     */     }
/* 146 */     if (h()) {
/* 147 */       ☃ |= 0x2;
/*     */     }
/*     */     
/* 150 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 154 */     a(((☃ & 0x1) > 0));
/* 155 */     b(((☃ & 0x2) > 0));
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/* 159 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public a l() {
/* 163 */     return this.k;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */