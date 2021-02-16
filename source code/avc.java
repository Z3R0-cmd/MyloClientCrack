/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avc
/*    */ {
/* 11 */   private static FloatBuffer a = avd.h(16);
/* 12 */   private static final aui b = (new aui(0.20000000298023224D, 1.0D, -0.699999988079071D)).a();
/* 13 */   private static final aui c = (new aui(-0.20000000298023224D, 1.0D, 0.699999988079071D)).a();
/*    */   
/*    */   public static void a() {
/* 16 */     bfl.f();
/* 17 */     bfl.b(0);
/* 18 */     bfl.b(1);
/* 19 */     bfl.h();
/*    */   }
/*    */   
/*    */   public static void b() {
/* 23 */     bfl.e();
/* 24 */     bfl.a(0);
/* 25 */     bfl.a(1);
/* 26 */     bfl.g();
/* 27 */     bfl.a(1032, 5634);
/* 28 */     float ☃ = 0.4F;
/* 29 */     float f1 = 0.6F;
/* 30 */     float f2 = 0.0F;
/*    */     
/* 32 */     GL11.glLight(16384, 4611, a(b.a, b.b, b.c, 0.0D));
/* 33 */     GL11.glLight(16384, 4609, a(f1, f1, f1, 1.0F));
/* 34 */     GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 35 */     GL11.glLight(16384, 4610, a(f2, f2, f2, 1.0F));
/*    */     
/* 37 */     GL11.glLight(16385, 4611, a(c.a, c.b, c.c, 0.0D));
/* 38 */     GL11.glLight(16385, 4609, a(f1, f1, f1, 1.0F));
/* 39 */     GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 40 */     GL11.glLight(16385, 4610, a(f2, f2, f2, 1.0F));
/*    */     
/* 42 */     bfl.j(7424);
/* 43 */     GL11.glLightModel(2899, a(☃, ☃, ☃, 1.0F));
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(double ☃, double d1, double d2, double d3) {
/* 47 */     return a((float)☃, (float)d1, (float)d2, (float)d3);
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(float ☃, float f1, float f2, float f3) {
/* 51 */     a.clear();
/* 52 */     a.put(☃).put(f1).put(f2).put(f3);
/* 53 */     a.flip();
/* 54 */     return a;
/*    */   }
/*    */   
/*    */   public static void c() {
/* 58 */     bfl.E();
/* 59 */     bfl.b(-30.0F, 0.0F, 1.0F, 0.0F);
/* 60 */     bfl.b(165.0F, 1.0F, 0.0F, 0.0F);
/* 61 */     b();
/* 62 */     bfl.F();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */