/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aag
/*    */   extends za
/*    */ {
/* 11 */   private static final Set<afh> c = Sets.newHashSet((Object[])new afh[] { afi.cs, afi.q, afi.e, afi.E, afi.ah, afi.ag, afi.T, afi.D, afi.R, afi.o, afi.aI, afi.S, afi.p, afi.y, afi.x, afi.aD, afi.Y, afi.aV, afi.cB, afi.av, afi.aC, afi.A, afi.cM, afi.b, afi.U });
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
/*    */   
/*    */   protected aag(zw.a ☃) {
/* 40 */     super(2.0F, ☃, c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(afh ☃) {
/* 45 */     if (☃ == afi.Z) {
/* 46 */       return (this.b.d() == 3);
/*    */     }
/* 48 */     if (☃ == afi.ah || ☃ == afi.ag) {
/* 49 */       return (this.b.d() >= 2);
/*    */     }
/* 51 */     if (☃ == afi.bP || ☃ == afi.bT) {
/* 52 */       return (this.b.d() >= 2);
/*    */     }
/* 54 */     if (☃ == afi.R || ☃ == afi.o) {
/* 55 */       return (this.b.d() >= 2);
/*    */     }
/* 57 */     if (☃ == afi.S || ☃ == afi.p) {
/* 58 */       return (this.b.d() >= 1);
/*    */     }
/* 60 */     if (☃ == afi.y || ☃ == afi.x) {
/* 61 */       return (this.b.d() >= 1);
/*    */     }
/* 63 */     if (☃ == afi.aC || ☃ == afi.aD) {
/* 64 */       return (this.b.d() >= 2);
/*    */     }
/* 66 */     if (☃.t() == arm.e) {
/* 67 */       return true;
/*    */     }
/* 69 */     if (☃.t() == arm.f) {
/* 70 */       return true;
/*    */     }
/* 72 */     if (☃.t() == arm.g) {
/* 73 */       return true;
/*    */     }
/* 75 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(zx ☃, afh afh1) {
/* 80 */     if (afh1.t() == arm.f || afh1.t() == arm.g || afh1.t() == arm.e) {
/* 81 */       return this.a;
/*    */     }
/* 83 */     return super.a(☃, afh1);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */