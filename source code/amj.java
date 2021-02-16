/*    */ import com.google.common.base.Objects;
/*    */ 
/*    */ public abstract class amj<T extends Comparable<T>>
/*    */   implements amo<T>
/*    */ {
/*    */   private final Class<T> a;
/*    */   private final String b;
/*    */   
/*    */   protected amj(String ☃, Class<T> clazz) {
/* 10 */     this.a = clazz;
/* 11 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 16 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<T> b() {
/* 21 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 26 */     return Objects.toStringHelper(this).add("name", this.b).add("clazz", this.a).add("values", c()).toString();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 35 */     if (this == ☃) {
/* 36 */       return true;
/*    */     }
/* 38 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     amj amj1 = (amj)☃;
/* 43 */     return (this.a.equals(amj1.a) && this.b.equals(amj1.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 48 */     return 31 * this.a.hashCode() + this.b.hashCode();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */