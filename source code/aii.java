/*    */ import com.google.common.collect.Lists;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aii
/*    */   extends afc
/*    */ {
/* 19 */   private static final List<String> a = Lists.newArrayList((Object[])new String[] { "harp", "bd", "snare", "hat", "bassattack" });
/*    */   
/*    */   public aii() {
/* 22 */     super(arm.d);
/* 23 */     a(yz.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, alz alz1, afh afh1) {
/* 28 */     boolean bool = ☃.z(cj1);
/*    */     
/* 30 */     akw akw = ☃.s(cj1);
/* 31 */     if (akw instanceof alm) {
/* 32 */       alm alm = (alm)akw;
/* 33 */       if (alm.f != bool) {
/* 34 */         if (bool) {
/* 35 */           alm.a(☃, cj1);
/*    */         }
/* 37 */         alm.f = bool;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(adm ☃, cj cj1, alz alz1, wn wn1, cq cq1, float f1, float f2, float f3) {
/* 44 */     if (☃.D) {
/* 45 */       return true;
/*    */     }
/*    */     
/* 48 */     akw akw = ☃.s(cj1);
/* 49 */     if (akw instanceof alm) {
/* 50 */       alm alm = (alm)akw;
/*    */       
/* 52 */       alm.b();
/* 53 */       alm.a(☃, cj1);
/* 54 */       wn1.b(na.S);
/*    */     } 
/*    */     
/* 57 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(adm ☃, cj cj1, wn wn1) {
/* 62 */     if (☃.D) {
/*    */       return;
/*    */     }
/*    */     
/* 66 */     akw akw = ☃.s(cj1);
/* 67 */     if (akw instanceof alm) {
/* 68 */       ((alm)akw).a(☃, cj1);
/* 69 */       wn1.b(na.R);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public akw a(adm ☃, int i) {
/* 75 */     return new alm();
/*    */   }
/*    */   
/*    */   private String b(int ☃) {
/* 79 */     if (☃ < 0 || ☃ >= a.size()) {
/* 80 */       ☃ = 0;
/*    */     }
/*    */     
/* 83 */     return a.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(adm ☃, cj cj1, alz alz1, int i, int j) {
/* 88 */     float f = (float)Math.pow(2.0D, (j - 12) / 12.0D);
/*    */     
/* 90 */     ☃.a(cj1.n() + 0.5D, cj1.o() + 0.5D, cj1.p() + 0.5D, "note." + b(i), 3.0F, f);
/* 91 */     ☃.a(cy.x, cj1.n() + 0.5D, cj1.o() + 1.2D, cj1.p() + 0.5D, j / 24.0D, 0.0D, 0.0D, new int[0]);
/* 92 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b() {
/* 97 */     return 3;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */