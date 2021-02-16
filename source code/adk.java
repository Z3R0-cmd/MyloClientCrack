/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import java.util.TreeMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adk
/*     */ {
/*  26 */   private TreeMap<String, a> a = new TreeMap<String, a>();
/*     */   
/*     */   public adk() {
/*  29 */     a("doFireTick", "true", b.b);
/*  30 */     a("mobGriefing", "true", b.b);
/*  31 */     a("keepInventory", "false", b.b);
/*  32 */     a("doMobSpawning", "true", b.b);
/*  33 */     a("doMobLoot", "true", b.b);
/*  34 */     a("doTileDrops", "true", b.b);
/*  35 */     a("doEntityDrops", "true", b.b);
/*  36 */     a("commandBlockOutput", "true", b.b);
/*  37 */     a("naturalRegeneration", "true", b.b);
/*  38 */     a("doDaylightCycle", "true", b.b);
/*  39 */     a("logAdminCommands", "true", b.b);
/*  40 */     a("showDeathMessages", "true", b.b);
/*  41 */     a("randomTickSpeed", "3", b.c);
/*  42 */     a("sendCommandFeedback", "true", b.b);
/*  43 */     a("reducedDebugInfo", "false", b.b);
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1, b b1) {
/*  47 */     this.a.put(☃, new a(str1, b1));
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1) {
/*  51 */     a a = this.a.get(☃);
/*  52 */     if (a != null) {
/*  53 */       a.a(str1);
/*     */     } else {
/*  55 */       a(☃, str1, b.a);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String a(String ☃) {
/*  60 */     a a = this.a.get(☃);
/*  61 */     if (a != null) {
/*  62 */       return a.a();
/*     */     }
/*  64 */     return "";
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/*  68 */     a a = this.a.get(☃);
/*  69 */     if (a != null) {
/*  70 */       return a.b();
/*     */     }
/*  72 */     return false;
/*     */   }
/*     */   
/*     */   public int c(String ☃) {
/*  76 */     a a = this.a.get(☃);
/*  77 */     if (a != null) {
/*  78 */       return a.c();
/*     */     }
/*  80 */     return 0;
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
/*     */   public dn a() {
/*  92 */     dn ☃ = new dn();
/*     */     
/*  94 */     for (Iterator<String> iterator = this.a.keySet().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/*  95 */       a a = this.a.get(str);
/*  96 */       ☃.a(str, a.a()); }
/*     */ 
/*     */     
/*  99 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(dn ☃) {
/* 103 */     Set<String> set = ☃.c();
/* 104 */     for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) { String str1 = iterator.next();
/* 105 */       String str2 = str1;
/* 106 */       String str3 = ☃.j(str1);
/*     */       
/* 108 */       a(str2, str3); }
/*     */   
/*     */   }
/*     */   
/*     */   public String[] b() {
/* 113 */     Set<String> ☃ = this.a.keySet();
/* 114 */     return ☃.<String>toArray(new String[☃.size()]);
/*     */   }
/*     */   
/*     */   public boolean e(String ☃) {
/* 118 */     return this.a.containsKey(☃);
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, b b1) {
/* 122 */     a a = this.a.get(☃);
/* 123 */     if (a != null && (a.e() == b1 || b1 == b.a)) {
/* 124 */       return true;
/*     */     }
/* 126 */     return false;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private String a;
/*     */     private boolean b;
/*     */     private int c;
/*     */     private double d;
/*     */     private final adk.b e;
/*     */     
/*     */     public a(String ☃, adk.b b1) {
/* 137 */       this.e = b1;
/* 138 */       a(☃);
/*     */     }
/*     */     
/*     */     public void a(String ☃) {
/* 142 */       this.a = ☃;
/* 143 */       this.b = Boolean.parseBoolean(☃);
/* 144 */       this.c = this.b ? 1 : 0;
/*     */       try {
/* 146 */         this.c = Integer.parseInt(☃);
/* 147 */       } catch (NumberFormatException numberFormatException) {}
/*     */       
/*     */       try {
/* 150 */         this.d = Double.parseDouble(☃);
/* 151 */       } catch (NumberFormatException numberFormatException) {}
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 156 */       return this.a;
/*     */     }
/*     */     
/*     */     public boolean b() {
/* 160 */       return this.b;
/*     */     }
/*     */     
/*     */     public int c() {
/* 164 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public adk.b e() {
/* 172 */       return this.e;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum b {
/* 177 */     a,
/* 178 */     b,
/* 179 */     c;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */