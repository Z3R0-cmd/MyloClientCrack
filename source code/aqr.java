/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqr
/*    */ {
/* 18 */   private static final Logger a = LogManager.getLogger();
/* 19 */   private static Map<String, Class<? extends aqu>> b = Maps.newHashMap();
/* 20 */   private static Map<Class<? extends aqu>, String> c = Maps.newHashMap();
/*    */   
/* 22 */   private static Map<String, Class<? extends aqt>> d = Maps.newHashMap();
/* 23 */   private static Map<Class<? extends aqt>, String> e = Maps.newHashMap();
/*    */   
/*    */   private static void b(Class<? extends aqu> ☃, String str) {
/* 26 */     b.put(str, ☃);
/* 27 */     c.put(☃, str);
/*    */   }
/*    */   
/*    */   static void a(Class<? extends aqt> ☃, String str) {
/* 31 */     d.put(str, ☃);
/* 32 */     e.put(☃, str);
/*    */   }
/*    */   
/*    */   static {
/* 36 */     b((Class)aqh.class, "Mineshaft");
/* 37 */     b((Class)aqv.a.class, "Village");
/* 38 */     b((Class)aqi.a.class, "Fortress");
/* 39 */     b((Class)aqo.a.class, "Stronghold");
/* 40 */     b((Class)aqm.a.class, "Temple");
/* 41 */     b((Class)aqk.a.class, "Monument");
/*    */     
/* 43 */     aqg.a();
/* 44 */     aqw.a();
/* 45 */     aqj.a();
/* 46 */     aqp.a();
/* 47 */     aqn.a();
/* 48 */     aql.a();
/*    */   }
/*    */   
/*    */   public static String a(aqu ☃) {
/* 52 */     return c.get(☃.getClass());
/*    */   }
/*    */   
/*    */   public static String a(aqt ☃) {
/* 56 */     return e.get(☃.getClass());
/*    */   }
/*    */ 
/*    */   
/*    */   public static aqu a(dn ☃, adm adm1) {
/* 61 */     aqu aqu = null;
/*    */     
/*    */     try {
/* 64 */       Class<? extends aqu> clazz = b.get(☃.j("id"));
/* 65 */       if (clazz != null) {
/* 66 */         aqu = clazz.newInstance();
/*    */       }
/* 68 */     } catch (Exception exception) {
/* 69 */       a.warn("Failed Start with id " + ☃.j("id"));
/* 70 */       exception.printStackTrace();
/*    */     } 
/* 72 */     if (aqu != null) {
/* 73 */       aqu.a(adm1, ☃);
/*    */     } else {
/* 75 */       a.warn("Skipping Structure with id " + ☃.j("id"));
/*    */     } 
/* 77 */     return aqu;
/*    */   }
/*    */   
/*    */   public static aqt b(dn ☃, adm adm1) {
/* 81 */     aqt aqt = null;
/*    */     
/*    */     try {
/* 84 */       Class<? extends aqt> clazz = d.get(☃.j("id"));
/* 85 */       if (clazz != null) {
/* 86 */         aqt = clazz.newInstance();
/*    */       }
/* 88 */     } catch (Exception exception) {
/* 89 */       a.warn("Failed Piece with id " + ☃.j("id"));
/* 90 */       exception.printStackTrace();
/*    */     } 
/* 92 */     if (aqt != null) {
/* 93 */       aqt.a(adm1, ☃);
/*    */     } else {
/* 95 */       a.warn("Skipping Piece with id " + ☃.j("id"));
/*    */     } 
/* 97 */     return aqt;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */