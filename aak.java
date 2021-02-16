/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ public class aak
/*    */   extends zw
/*    */ {
/* 19 */   private static final Map<String, aak> b = Maps.newHashMap();
/*    */   
/*    */   public final String a;
/*    */   
/*    */   protected aak(String ☃) {
/* 24 */     this.a = ☃;
/* 25 */     this.h = 1;
/* 26 */     a(yz.f);
/*    */     
/* 28 */     b.put("records." + ☃, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(zx ☃, wn wn1, adm adm1, cj cj1, cq cq1, float f1, float f2, float f3) {
/* 33 */     alz alz = adm1.p(cj1);
/* 34 */     if (alz.c() == afi.aN && !((Boolean)alz.<Boolean>b(ahq.a)).booleanValue()) {
/* 35 */       if (adm1.D) {
/* 36 */         return true;
/*    */       }
/*    */       
/* 39 */       ((ahq)afi.aN).a(adm1, cj1, alz, ☃);
/* 40 */       adm1.a((wn)null, 1005, cj1, zw.b(this));
/* 41 */       ☃.b--;
/* 42 */       wn1.b(na.X);
/* 43 */       return true;
/*    */     } 
/* 45 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(zx ☃, wn wn1, List<String> list, boolean bool) {
/* 50 */     list.add(g());
/*    */   }
/*    */   
/*    */   public String g() {
/* 54 */     return di.a("item.record." + this.a + ".desc");
/*    */   }
/*    */ 
/*    */   
/*    */   public aaj g(zx ☃) {
/* 59 */     return aaj.c;
/*    */   }
/*    */   
/*    */   public static aak b(String ☃) {
/* 63 */     return b.get(☃);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */