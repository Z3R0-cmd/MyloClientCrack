/*    */ import com.google.common.base.Predicate;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apj
/*    */   extends aot
/*    */ {
/*    */   private final alz a;
/*    */   private final int b;
/*    */   private final Predicate<alz> c;
/*    */   
/*    */   public apj(alz ☃, int i) {
/* 20 */     this(☃, i, amg.a(afi.b));
/*    */   }
/*    */   
/*    */   public apj(alz ☃, int i, Predicate<alz> predicate) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = i;
/* 26 */     this.c = predicate;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(adm ☃, Random random, cj cj1) {
/* 31 */     float f = random.nextFloat() * 3.1415927F;
/*    */     
/* 33 */     double d1 = ((cj1.n() + 8) + ns.a(f) * this.b / 8.0F);
/* 34 */     double d2 = ((cj1.n() + 8) - ns.a(f) * this.b / 8.0F);
/* 35 */     double d3 = ((cj1.p() + 8) + ns.b(f) * this.b / 8.0F);
/* 36 */     double d4 = ((cj1.p() + 8) - ns.b(f) * this.b / 8.0F);
/*    */     
/* 38 */     double d5 = (cj1.o() + random.nextInt(3) - 2);
/* 39 */     double d6 = (cj1.o() + random.nextInt(3) - 2);
/*    */     
/* 41 */     for (int i = 0; i < this.b; i++) {
/* 42 */       float f1 = i / this.b;
/* 43 */       double d7 = d1 + (d2 - d1) * f1;
/* 44 */       double d8 = d5 + (d6 - d5) * f1;
/* 45 */       double d9 = d3 + (d4 - d3) * f1;
/*    */       
/* 47 */       double d10 = random.nextDouble() * this.b / 16.0D;
/* 48 */       double d11 = (ns.a(3.1415927F * f1) + 1.0F) * d10 + 1.0D;
/* 49 */       double d12 = (ns.a(3.1415927F * f1) + 1.0F) * d10 + 1.0D;
/*    */       
/* 51 */       int j = ns.c(d7 - d11 / 2.0D);
/* 52 */       int k = ns.c(d8 - d12 / 2.0D);
/* 53 */       int m = ns.c(d9 - d11 / 2.0D);
/*    */       
/* 55 */       int n = ns.c(d7 + d11 / 2.0D);
/* 56 */       int i1 = ns.c(d8 + d12 / 2.0D);
/* 57 */       int i2 = ns.c(d9 + d11 / 2.0D);
/*    */       
/* 59 */       for (int i3 = j; i3 <= n; i3++) {
/* 60 */         double d = (i3 + 0.5D - d7) / d11 / 2.0D;
/* 61 */         if (d * d < 1.0D) {
/* 62 */           for (int i4 = k; i4 <= i1; i4++) {
/* 63 */             double d13 = (i4 + 0.5D - d8) / d12 / 2.0D;
/* 64 */             if (d * d + d13 * d13 < 1.0D) {
/* 65 */               for (int i5 = m; i5 <= i2; i5++) {
/* 66 */                 double d14 = (i5 + 0.5D - d9) / d11 / 2.0D;
/* 67 */                 if (d * d + d13 * d13 + d14 * d14 < 1.0D) {
/* 68 */                   cj cj2 = new cj(i3, i4, i5);
/* 69 */                   if (this.c.apply(☃.p(cj2))) {
/* 70 */                     ☃.a(cj2, this.a, 2);
/*    */                   }
/*    */                 } 
/*    */               } 
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 80 */     return true;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/apj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */