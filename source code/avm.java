/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.util.UUIDTypeAdapter;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avm
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   private final a d;
/*    */   
/*    */   public avm(String ☃, String str1, String str2, String str3) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = str1;
/* 20 */     this.c = str2;
/* 21 */     this.d = a.a(str3);
/*    */   }
/*    */   
/*    */   public String a() {
/* 25 */     return "token:" + this.c + ":" + this.b;
/*    */   }
/*    */   
/*    */   public String b() {
/* 29 */     return this.b;
/*    */   }
/*    */   
/*    */   public String c() {
/* 33 */     return this.a;
/*    */   }
/*    */   
/*    */   public String d() {
/* 37 */     return this.c;
/*    */   }
/*    */   
/*    */   public GameProfile e() {
/*    */     try {
/* 42 */       UUID ☃ = UUIDTypeAdapter.fromString(b());
/* 43 */       return new GameProfile(☃, c());
/* 44 */     } catch (IllegalArgumentException ☃) {
/* 45 */       return new GameProfile(null, c());
/*    */     } 
/*    */   }
/*    */   
/*    */   public a f() {
/* 50 */     return this.d;
/*    */   }
/*    */   
/*    */   public enum a {
/* 54 */     a("legacy"),
/* 55 */     b("mojang");
/*    */     
/* 57 */     private static final Map<String, a> c = Maps.newHashMap();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     private final String d;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     static {
/*    */       a[] ☃;
/*    */       int i, j;
/* 70 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 71 */         c.put(a1.d, a1);
/*    */         j++; }
/*    */     
/*    */     }
/*    */     
/*    */     a(String ☃) {
/*    */       this.d = ☃;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/*    */       return c.get(☃.toLowerCase());
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */