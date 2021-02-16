/*    */ import java.util.Iterator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ahw
/*    */   extends ajg
/*    */ {
/* 18 */   public static final amm<a> a = amm.a("axis", a.class);
/*    */   
/*    */   public ahw() {
/* 21 */     super(arm.d);
/* 22 */     a(yz.b);
/* 23 */     c(2.0F);
/* 24 */     a(f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(adm ☃, cj cj1, alz alz1) {
/* 29 */     int i = 4;
/* 30 */     int j = i + 1;
/*    */     
/* 32 */     if (!☃.a(cj1.a(-j, -j, -j), cj1.a(j, j, j))) {
/*    */       return;
/*    */     }
/*    */     
/* 36 */     for (Iterator<cj> iterator = cj.a(cj1.a(-i, -i, -i), cj1.a(i, i, i)).iterator(); iterator.hasNext(); ) { cj cj2 = iterator.next();
/* 37 */       alz alz2 = ☃.p(cj2);
/* 38 */       if (alz2.c().t() == arm.j && 
/* 39 */         !((Boolean)alz2.<Boolean>b(ahs.b)).booleanValue()) {
/* 40 */         ☃.a(cj2, alz2.a(ahs.b, Boolean.valueOf(true)), 4);
/*    */       } }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public alz a(adm ☃, cj cj1, cq cq1, float f1, float f2, float f3, int i, pr pr1) {
/* 51 */     return super.a(☃, cj1, cq1, f1, f2, f3, i, pr1).a(a, a.a(cq1.k()));
/*    */   }
/*    */   
/*    */   public enum a implements nw {
/* 55 */     a("x"),
/* 56 */     b("y"),
/* 57 */     c("z"),
/* 58 */     d("none");
/*    */     
/*    */     private final String e;
/*    */ 
/*    */     
/*    */     a(String ☃) {
/* 64 */       this.e = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 69 */       return this.e;
/*    */     }
/*    */     
/*    */     public static a a(cq.a ☃) {
/* 73 */       switch (ahw.null.a[☃.ordinal()]) {
/*    */         case 1:
/* 75 */           return a;
/*    */         case 2:
/* 77 */           return b;
/*    */         case 3:
/* 79 */           return c;
/*    */       } 
/*    */       
/* 82 */       return d;
/*    */     }
/*    */ 
/*    */     
/*    */     public String l() {
/* 87 */       return this.e;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ahw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */