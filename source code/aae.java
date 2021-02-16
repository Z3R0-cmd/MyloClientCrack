/*    */ import com.google.common.base.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aae
/*    */   extends yo
/*    */ {
/*    */   protected final afh b;
/*    */   protected final Function<zx, String> c;
/*    */   
/*    */   public aae(afh ☃, afh afh1, Function<zx, String> function) {
/* 13 */     super(☃);
/*    */     
/* 15 */     this.b = afh1;
/* 16 */     this.c = function;
/*    */     
/* 18 */     d(0);
/* 19 */     a(true);
/*    */   }
/*    */   
/*    */   public aae(afh ☃, afh afh1, String[] arrayOfString) {
/* 23 */     this(☃, afh1, new Function<zx, String>(arrayOfString)
/*    */         {
/*    */           public String a(zx ☃)
/*    */           {
/* 27 */             int i = ☃.i();
/* 28 */             if (i < 0 || i >= this.a.length) {
/* 29 */               i = 0;
/*    */             }
/* 31 */             return this.a[i];
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 38 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String e_(zx ☃) {
/* 43 */     return a() + "." + (String)this.c.apply(☃);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */