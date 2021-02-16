/*    */ import com.google.common.base.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amc
/*    */ {
/*    */   private final adm a;
/*    */   private final cj b;
/*    */   private final boolean c;
/*    */   private alz d;
/*    */   private akw e;
/*    */   private boolean f;
/*    */   
/*    */   public amc(adm ☃, cj cj1, boolean bool) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = cj1;
/* 22 */     this.c = bool;
/*    */   }
/*    */   
/*    */   public alz a() {
/* 26 */     if (this.d == null && (this.c || this.a.e(this.b))) {
/* 27 */       this.d = this.a.p(this.b);
/*    */     }
/*    */     
/* 30 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public akw b() {
/* 35 */     if (this.e == null && !this.f) {
/* 36 */       this.e = this.a.s(this.b);
/* 37 */       this.f = true;
/*    */     } 
/*    */     
/* 40 */     return this.e;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cj d() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public static Predicate<amc> a(Predicate<alz> ☃) {
/* 52 */     return new Predicate<amc>(☃)
/*    */       {
/*    */         public boolean a(amc ☃) {
/* 55 */           return (☃ != null && this.a.apply(☃.a()));
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/amc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */