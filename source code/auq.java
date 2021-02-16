/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class auq
/*    */ {
/*    */   public boolean a(auq ☃) {
/* 12 */     if (☃ == null) {
/* 13 */       return false;
/*    */     }
/* 15 */     if (this == ☃) {
/* 16 */       return true;
/*    */     }
/* 18 */     return false;
/*    */   }
/*    */   
/*    */   public abstract String b();
/*    */   
/*    */   public abstract String d(String paramString);
/*    */   
/*    */   public abstract boolean h();
/*    */   
/*    */   public abstract boolean g();
/*    */   
/*    */   public abstract a i();
/*    */   
/*    */   public abstract Collection<String> d();
/*    */   
/*    */   public abstract a j();
/*    */   
/*    */   public enum a {
/* 36 */     a("always", 0),
/* 37 */     b("never", 1),
/* 38 */     c("hideForOtherTeams", 2),
/* 39 */     d("hideForOwnTeam", 3); public final String e;
/*    */     public final int f;
/* 41 */     private static Map<String, a> g = Maps.newHashMap(); static {
/*    */       a[] ☃;
/*    */       int i, j;
/* 44 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 45 */         g.put(a1.e, a1);
/*    */         j++; }
/*    */     
/*    */     }
/*    */     public static String[] a() {
/* 50 */       return (String[])g.keySet().toArray((Object[])new String[g.size()]);
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 54 */       return g.get(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     a(String ☃, int i) {
/* 61 */       this.e = ☃;
/* 62 */       this.f = i;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/auq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */