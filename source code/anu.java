/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
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
/*     */ public class anu
/*     */   implements amv
/*     */ {
/*  23 */   private static final List<alz> a = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  30 */     for (Iterator<afh> ☃ = afh.c.iterator(); ☃.hasNext(); ) { afh afh = ☃.next();
/*  31 */       a.addAll((Collection<? extends alz>)afh.P().a()); }
/*     */   
/*     */   }
/*  34 */   private static final int b = ns.f(ns.c(a.size()));
/*  35 */   private static final int c = ns.f(a.size() / b);
/*     */   private final adm d;
/*     */   
/*     */   public anu(adm ☃) {
/*  39 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public amy d(int ☃, int i) {
/*  49 */     ans ans = new ans();
/*     */     
/*  51 */     for (int j = 0; j < 16; j++) {
/*  52 */       for (int m = 0; m < 16; m++) {
/*  53 */         int n = ☃ * 16 + j;
/*  54 */         int i1 = i * 16 + m;
/*     */         
/*  56 */         ans.a(j, 60, m, afi.cv.Q());
/*     */         
/*  58 */         alz alz = b(n, i1);
/*  59 */         if (alz != null) {
/*  60 */           ans.a(j, 70, m, alz);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  65 */     amy amy = new amy(this.d, ans, ☃, i);
/*  66 */     amy.b();
/*     */     
/*  68 */     ady[] arrayOfAdy = this.d.v().b(null, ☃ * 16, i * 16, 16, 16);
/*  69 */     byte[] arrayOfByte = amy.k();
/*     */     
/*  71 */     for (int k = 0; k < arrayOfByte.length; k++) {
/*  72 */       arrayOfByte[k] = (byte)(arrayOfAdy[k]).az;
/*     */     }
/*     */     
/*  75 */     amy.b();
/*     */     
/*  77 */     return amy;
/*     */   }
/*     */ 
/*     */   
/*     */   public static alz b(int ☃, int i) {
/*  82 */     alz alz = null;
/*     */     
/*  84 */     if (☃ > 0 && i > 0 && ☃ % 2 != 0 && i % 2 != 0) {
/*  85 */       ☃ /= 2;
/*  86 */       i /= 2;
/*     */       
/*  88 */       if (☃ <= b && i <= c) {
/*  89 */         int j = ns.a(☃ * b + i);
/*  90 */         if (j < a.size()) {
/*  91 */           alz = a.get(j);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  96 */     return alz;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(amv ☃, int i, int j) {}
/*     */ 
/*     */   
/*     */   public boolean a(amv ☃, amy amy1, int i, int j) {
/* 110 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boolean ☃, nu nu1) {
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 124 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e() {
/* 129 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 134 */     return "DebugLevelSource";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ady.c> a(pt ☃, cj cj1) {
/* 139 */     ady ady = this.d.b(cj1);
/* 140 */     return ady.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public cj a(adm ☃, String str, cj cj1) {
/* 145 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 150 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(amy ☃, int i, int j) {}
/*     */ 
/*     */   
/*     */   public amy a(cj ☃) {
/* 159 */     return d(☃.n() >> 4, ☃.p() >> 4);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */