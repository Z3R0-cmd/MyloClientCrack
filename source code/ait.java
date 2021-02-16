/*    */ import java.util.Iterator;
/*    */ import java.util.List;
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
/*    */ public class ait
/*    */   extends afd
/*    */ {
/*    */   private final a b;
/* 17 */   public static final amk a = amk.a("powered");
/*    */   
/*    */   public enum a {
/* 20 */     a, b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ait(arm ☃, a a1) {
/* 26 */     super(☃);
/* 27 */     j(this.M.b().a(a, Boolean.valueOf(false)));
/* 28 */     this.b = a1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int e(alz ☃) {
/* 38 */     return ((Boolean)☃.<Boolean>b(a)).booleanValue() ? 15 : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected alz a(alz ☃, int i) {
/* 43 */     return ☃.a(a, Boolean.valueOf((i > 0)));
/*    */   }
/*    */   
/*    */   protected int f(adm ☃, cj cj1) {
/*    */     List<? extends pk> list;
/* 48 */     aug aug = a(cj1);
/*    */ 
/*    */     
/* 51 */     switch (null.a[this.b.ordinal()]) {
/*    */       case 1:
/* 53 */         list = ☃.b((pk)null, aug);
/*    */         break;
/*    */       case 2:
/* 56 */         list = ☃.a((Class)pr.class, aug);
/*    */         break;
/*    */       default:
/* 59 */         return 0;
/*    */     } 
/*    */     
/* 62 */     if (!list.isEmpty()) {
/* 63 */       for (Iterator<? extends pk> iterator = list.iterator(); iterator.hasNext(); ) { pk pk = iterator.next();
/* 64 */         if (!pk.aI()) {
/* 65 */           return 15;
/*    */         } }
/*    */     
/*    */     }
/*    */     
/* 70 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public alz a(int ☃) {
/* 75 */     return Q().a(a, Boolean.valueOf((☃ == 1)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int c(alz ☃) {
/* 81 */     return ((Boolean)☃.<Boolean>b(a)).booleanValue() ? 1 : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ama e() {
/* 86 */     return new ama(this, new amo[] { a });
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ait.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */