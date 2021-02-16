/*    */ import com.google.common.base.Function;
/*    */ import com.google.common.base.Joiner;
/*    */ import com.google.common.collect.Iterables;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class aly
/*    */   implements alz
/*    */ {
/* 15 */   private static final Joiner a = Joiner.on(',');
/* 16 */   private static final Function<Map.Entry<amo, Comparable>, String> b = new Function<Map.Entry<amo, Comparable>, String>()
/*    */     {
/*    */       public String a(Map.Entry<amo, Comparable> ☃)
/*    */       {
/* 20 */         if (☃ == null) {
/* 21 */           return "<NULL>";
/*    */         }
/*    */         
/* 24 */         amo<Comparable> amo = ☃.getKey();
/* 25 */         return amo.a() + "=" + amo.a(☃.getValue());
/*    */       }
/*    */     };
/*    */ 
/*    */   
/*    */   public <T extends Comparable<T>> alz a(amo<T> ☃) {
/* 31 */     return a(☃, a(☃.c(), b(☃)));
/*    */   }
/*    */   
/*    */   protected static <T> T a(Collection<T> ☃, T t) {
/* 35 */     Iterator<T> iterator = ☃.iterator();
/*    */     
/* 37 */     while (iterator.hasNext()) {
/* 38 */       if (iterator.next().equals(t)) {
/* 39 */         if (iterator.hasNext()) {
/* 40 */           return iterator.next();
/*    */         }
/* 42 */         return ☃.iterator().next();
/*    */       } 
/*    */     } 
/*    */     
/* 46 */     return iterator.next();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 51 */     StringBuilder ☃ = new StringBuilder();
/* 52 */     ☃.append(afh.c.c(c()));
/*    */     
/* 54 */     if (!b().isEmpty()) {
/* 55 */       ☃.append("[");
/* 56 */       a.appendTo(☃, Iterables.transform((Iterable)b().entrySet(), b));
/* 57 */       ☃.append("]");
/*    */     } 
/*    */     
/* 60 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */