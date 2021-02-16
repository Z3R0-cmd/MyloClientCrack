/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface auu
/*    */ {
/* 11 */   public static final Map<String, auu> a = Maps.newHashMap();
/*    */   
/* 13 */   public static final auu b = new aus("dummy");
/* 14 */   public static final auu c = new aus("trigger");
/* 15 */   public static final auu d = new aus("deathCount");
/* 16 */   public static final auu e = new aus("playerKillCount");
/* 17 */   public static final auu f = new aus("totalKillCount");
/* 18 */   public static final auu g = new aut("health");
/* 19 */   public static final auu[] h = new auu[] { new aur("teamkill.", a.a), new aur("teamkill.", a.b), new aur("teamkill.", a.c), new aur("teamkill.", a.d), new aur("teamkill.", a.e), new aur("teamkill.", a.f), new aur("teamkill.", a.g), new aur("teamkill.", a.h), new aur("teamkill.", a.i), new aur("teamkill.", a.j), new aur("teamkill.", a.k), new aur("teamkill.", a.l), new aur("teamkill.", a.m), new aur("teamkill.", a.n), new aur("teamkill.", a.o), new aur("teamkill.", a.p) };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 29 */   public static final auu[] i = new auu[] { new aur("killedByTeam.", a.a), new aur("killedByTeam.", a.b), new aur("killedByTeam.", a.c), new aur("killedByTeam.", a.d), new aur("killedByTeam.", a.e), new aur("killedByTeam.", a.f), new aur("killedByTeam.", a.g), new aur("killedByTeam.", a.h), new aur("killedByTeam.", a.i), new aur("killedByTeam.", a.j), new aur("killedByTeam.", a.k), new aur("killedByTeam.", a.l), new aur("killedByTeam.", a.m), new aur("killedByTeam.", a.n), new aur("killedByTeam.", a.o), new aur("killedByTeam.", a.p) };
/*    */ 
/*    */   
/*    */   String a();
/*    */ 
/*    */   
/*    */   int a(List<wn> paramList);
/*    */ 
/*    */   
/*    */   boolean b();
/*    */ 
/*    */   
/*    */   a c();
/*    */ 
/*    */   
/*    */   public enum a
/*    */   {
/* 46 */     a("integer"),
/* 47 */     b("hearts");
/*    */     
/*    */     private final String d;
/* 50 */     private static final Map<String, a> c = Maps.newHashMap();
/*    */     static {
/*    */       a[] ☃;
/*    */       int i, j;
/* 54 */       for (☃ = values(), i = ☃.length, j = 0; j < i; ) { a a1 = ☃[j];
/* 55 */         c.put(a1.a(), a1);
/*    */         j++; }
/*    */     
/*    */     }
/*    */     a(String ☃) {
/* 60 */       this.d = ☃;
/*    */     }
/*    */     
/*    */     public String a() {
/* 64 */       return this.d;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 68 */       a a1 = c.get(☃);
/* 69 */       return (a1 == null) ? a : a1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/auu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */