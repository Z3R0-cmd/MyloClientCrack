/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class amn
/*    */   extends amj<Integer>
/*    */ {
/*    */   private final ImmutableSet<Integer> a;
/*    */   
/*    */   protected amn(String ☃, int i, int j) {
/* 13 */     super(☃, Integer.class);
/* 14 */     if (i < 0) {
/* 15 */       throw new IllegalArgumentException("Min value of " + ☃ + " must be 0 or greater");
/*    */     }
/* 17 */     if (j <= i) {
/* 18 */       throw new IllegalArgumentException("Max value of " + ☃ + " must be greater than min (" + i + ")");
/*    */     }
/*    */     
/* 21 */     Set<Integer> set = Sets.newHashSet();
/* 22 */     for (int k = i; k <= j; k++) {
/* 23 */       set.add(Integer.valueOf(k));
/*    */     }
/*    */     
/* 26 */     this.a = ImmutableSet.copyOf(set);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<Integer> c() {
/* 31 */     return (Collection<Integer>)this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 36 */     if (this == ☃) {
/* 37 */       return true;
/*    */     }
/* 39 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 40 */       return false;
/*    */     }
/* 42 */     if (!super.equals(☃)) {
/* 43 */       return false;
/*    */     }
/*    */     
/* 46 */     amn amn1 = (amn)☃;
/* 47 */     return this.a.equals(amn1.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 52 */     int ☃ = super.hashCode();
/* 53 */     ☃ = 31 * ☃ + this.a.hashCode();
/* 54 */     return ☃;
/*    */   }
/*    */   
/*    */   public static amn a(String ☃, int i, int j) {
/* 58 */     return new amn(☃, i, j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String a(Integer ☃) {
/* 68 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */