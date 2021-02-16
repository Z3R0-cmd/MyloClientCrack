/*    */ import com.google.common.base.Predicate;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amh
/*    */   implements Predicate<alz>
/*    */ {
/*    */   private final ama a;
/* 15 */   private final Map<amo, Predicate> b = Maps.newHashMap();
/*    */   
/*    */   private amh(ama ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public static amh a(afh ☃) {
/* 22 */     return new amh(☃.P());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(alz ☃) {
/* 32 */     if (☃ == null || !☃.c().equals(this.a.c())) {
/* 33 */       return false;
/*    */     }
/*    */     
/* 36 */     for (Iterator<Map.Entry<amo, Predicate>> iterator = this.b.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<amo, Predicate> entry = iterator.next();
/* 37 */       Object object = ☃.b(entry.getKey());
/* 38 */       if (!((Predicate)entry.getValue()).apply(object)) {
/* 39 */         return false;
/*    */       } }
/*    */ 
/*    */     
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   public <V extends Comparable<V>> amh a(amo<V> ☃, Predicate<? extends V> predicate) {
/* 47 */     if (!this.a.d().contains(☃)) {
/* 48 */       throw new IllegalArgumentException(this.a + " cannot support property " + ☃);
/*    */     }
/* 50 */     this.b.put(☃, predicate);
/* 51 */     return this;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */