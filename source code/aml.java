/*    */ import com.google.common.base.Predicate;
/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.Collections2;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aml
/*    */   extends amm<cq>
/*    */ {
/*    */   protected aml(String ☃, Collection<cq> collection) {
/* 13 */     super(☃, cq.class, collection);
/*    */   }
/*    */   
/*    */   public static aml a(String ☃) {
/* 17 */     return a(☃, Predicates.alwaysTrue());
/*    */   }
/*    */   
/*    */   public static aml a(String ☃, Predicate<cq> predicate) {
/* 21 */     return a(☃, Collections2.filter(Lists.newArrayList((Object[])cq.values()), predicate));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static aml a(String ☃, Collection<cq> collection) {
/* 29 */     return new aml(☃, collection);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */