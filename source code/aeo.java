/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aeo
/*    */   extends ady
/*    */ {
/*    */   protected boolean aD;
/*    */   
/*    */   protected aeo(int ☃) {
/* 15 */     super(☃);
/*    */     
/* 17 */     a(0.8F, 0.4F);
/* 18 */     a(e);
/*    */     
/* 20 */     this.au.add(new ady.c((Class)tp.class, 5, 2, 6));
/*    */     
/* 22 */     this.as.A = -999;
/* 23 */     this.as.B = 4;
/* 24 */     this.as.C = 10;
/*    */   }
/*    */ 
/*    */   
/*    */   public agw.a a(Random ☃, cj cj1) {
/* 29 */     double d = af.a(cj1.n() / 200.0D, cj1.p() / 200.0D);
/* 30 */     if (d < -0.8D) {
/* 31 */       int i = ☃.nextInt(4);
/* 32 */       switch (i) {
/*    */         case 0:
/* 34 */           return agw.a.g;
/*    */         case 1:
/* 36 */           return agw.a.f;
/*    */         case 2:
/* 38 */           return agw.a.i;
/*    */       } 
/*    */       
/* 41 */       return agw.a.h;
/*    */     } 
/*    */     
/* 44 */     if (☃.nextInt(3) > 0) {
/* 45 */       int i = ☃.nextInt(3);
/* 46 */       if (i == 0)
/* 47 */         return agw.a.b; 
/* 48 */       if (i == 1) {
/* 49 */         return agw.a.e;
/*    */       }
/* 51 */       return agw.a.j;
/*    */     } 
/*    */     
/* 54 */     return agw.a.a;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(adm ☃, Random random, cj cj1) {
/* 60 */     double d = af.a((cj1.n() + 8) / 200.0D, (cj1.p() + 8) / 200.0D);
/* 61 */     if (d < -0.8D) {
/* 62 */       this.as.B = 15;
/* 63 */       this.as.C = 5;
/*    */     } else {
/* 65 */       this.as.B = 4;
/* 66 */       this.as.C = 10;
/*    */       
/* 68 */       ag.a(agi.b.c);
/* 69 */       for (int i = 0; i < 7; i++) {
/* 70 */         int j = random.nextInt(16) + 8;
/* 71 */         int k = random.nextInt(16) + 8;
/* 72 */         int m = random.nextInt(☃.m(cj1.a(j, 0, k)).o() + 32);
/* 73 */         ag.b(☃, random, cj1.a(j, m, k));
/*    */       } 
/*    */     } 
/* 76 */     if (this.aD) {
/* 77 */       ag.a(agi.b.a);
/* 78 */       for (int i = 0; i < 10; i++) {
/* 79 */         int j = random.nextInt(16) + 8;
/* 80 */         int k = random.nextInt(16) + 8;
/* 81 */         int m = random.nextInt(☃.m(cj1.a(j, 0, k)).o() + 32);
/* 82 */         ag.b(☃, random, cj1.a(j, m, k));
/*    */       } 
/*    */     } 
/* 85 */     super.a(☃, random, cj1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ady d(int ☃) {
/* 90 */     aeo aeo1 = new aeo(☃);
/* 91 */     aeo1.a("Sunflower Plains");
/* 92 */     aeo1.aD = true;
/* 93 */     aeo1.b(9286496);
/* 94 */     aeo1.aj = 14273354;
/* 95 */     return aeo1;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */