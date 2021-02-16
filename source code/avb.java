/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avb
/*     */   implements Comparable<avb>
/*     */ {
/*  13 */   private static final List<avb> a = Lists.newArrayList();
/*  14 */   private static final nm<avb> b = new nm<avb>();
/*  15 */   private static final Set<String> c = Sets.newHashSet();
/*     */   
/*     */   private final String d;
/*     */   
/*     */   private final int e;
/*     */   private final String f;
/*     */   private int g;
/*     */   private boolean h;
/*     */   private int i;
/*     */   
/*     */   public static void a(int ☃) {
/*  26 */     if (☃ == 0) {
/*     */       return;
/*     */     }
/*  29 */     avb avb1 = b.a(☃);
/*  30 */     if (avb1 != null) {
/*  31 */       avb1.i++;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(int ☃, boolean bool) {
/*  36 */     if (☃ == 0) {
/*     */       return;
/*     */     }
/*  39 */     avb avb1 = b.a(☃);
/*  40 */     if (avb1 != null) {
/*  41 */       avb1.h = bool;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a() {
/*  46 */     for (Iterator<avb> ☃ = a.iterator(); ☃.hasNext(); ) { avb avb1 = ☃.next();
/*  47 */       avb1.j(); }
/*     */   
/*     */   }
/*     */   
/*     */   public static void b() {
/*  52 */     b.c();
/*  53 */     for (Iterator<avb> ☃ = a.iterator(); ☃.hasNext(); ) { avb avb1 = ☃.next();
/*  54 */       b.a(avb1.g, avb1); }
/*     */   
/*     */   }
/*     */   
/*     */   public static Set<String> c() {
/*  59 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public avb(String ☃, int i, String str1) {
/*  70 */     this.d = ☃;
/*  71 */     this.g = i;
/*  72 */     this.e = i;
/*  73 */     this.f = str1;
/*     */     
/*  75 */     a.add(this);
/*  76 */     b.a(i, this);
/*  77 */     c.add(str1);
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  81 */     return this.h;
/*     */   }
/*     */   
/*     */   public String e() {
/*  85 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  89 */     if (this.i == 0) {
/*  90 */       return false;
/*     */     }
/*  92 */     this.i--;
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   private void j() {
/*  97 */     this.i = 0;
/*  98 */     this.h = false;
/*     */   }
/*     */   
/*     */   public String g() {
/* 102 */     return this.d;
/*     */   }
/*     */   
/*     */   public int h() {
/* 106 */     return this.e;
/*     */   }
/*     */   
/*     */   public int i() {
/* 110 */     return this.g;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 114 */     this.g = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(avb ☃) {
/* 119 */     int i = bnq.a(this.f, new Object[0]).compareTo(bnq.a(☃.f, new Object[0]));
/*     */     
/* 121 */     if (i == 0) {
/* 122 */       i = bnq.a(this.d, new Object[0]).compareTo(bnq.a(☃.d, new Object[0]));
/*     */     }
/*     */     
/* 125 */     return i;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */