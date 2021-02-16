/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ public class amk
/*    */   extends amj<Boolean>
/*    */ {
/*    */   private final ImmutableSet<Boolean> a;
/*    */   
/*    */   protected amk(String ☃) {
/* 11 */     super(☃, Boolean.class);
/* 12 */     this.a = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<Boolean> c() {
/* 17 */     return (Collection<Boolean>)this.a;
/*    */   }
/*    */   
/*    */   public static amk a(String ☃) {
/* 21 */     return new amk(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String a(Boolean ☃) {
/* 31 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */