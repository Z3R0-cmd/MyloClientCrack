/*    */ import com.google.common.base.Predicate;
/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.Collections2;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class amm<T extends Enum<T> & nw>
/*    */   extends amj<T>
/*    */ {
/*    */   private final ImmutableSet<T> a;
/* 16 */   private final Map<String, T> b = Maps.newHashMap();
/*    */   
/*    */   protected amm(String ☃, Class<T> clazz, Collection<T> collection) {
/* 19 */     super(☃, clazz);
/* 20 */     this.a = ImmutableSet.copyOf(collection);
/*    */     
/* 22 */     for (Iterator<T> iterator = collection.iterator(); iterator.hasNext(); ) { Enum enum_ = (Enum)iterator.next();
/* 23 */       String str = ((nw)enum_).l();
/* 24 */       if (this.b.containsKey(str)) {
/* 25 */         throw new IllegalArgumentException("Multiple values have the same name '" + str + "'");
/*    */       }
/* 27 */       this.b.put(str, (T)enum_); }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<T> c() {
/* 33 */     return (Collection<T>)this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String a(T ☃) {
/* 43 */     return ((nw)☃).l();
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & nw> amm<T> a(String ☃, Class<T> clazz) {
/* 47 */     return a(☃, clazz, Predicates.alwaysTrue());
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & nw> amm<T> a(String ☃, Class<T> clazz, Predicate<T> predicate) {
/* 51 */     return a(☃, clazz, Collections2.filter(Lists.newArrayList((Object[])clazz.getEnumConstants()), predicate));
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & nw> amm<T> a(String ☃, Class<T> clazz, T... arrayOfT) {
/* 55 */     return a(☃, clazz, Lists.newArrayList((Object[])arrayOfT));
/*    */   }
/*    */   
/*    */   public static <T extends Enum<T> & nw> amm<T> a(String ☃, Class<T> clazz, Collection<T> collection) {
/* 59 */     return new amm<T>(☃, clazz, collection);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */