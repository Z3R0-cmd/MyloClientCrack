/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.ByteOrder;
/*    */ import java.nio.FloatBuffer;
/*    */ import java.nio.IntBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.lwjgl.util.glu.GLU;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avd
/*    */ {
/*    */   public static synchronized int a(int ☃) {
/* 16 */     int i = GL11.glGenLists(☃);
/* 17 */     if (i == 0) {
/* 18 */       int j = GL11.glGetError();
/* 19 */       String str = "No error code reported";
/* 20 */       if (j != 0) {
/* 21 */         str = GLU.gluErrorString(j);
/*    */       }
/* 23 */       throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + ☃ + ", GL error (" + j + "): " + str);
/*    */     } 
/* 25 */     return i;
/*    */   }
/*    */   
/*    */   public static synchronized void a(int ☃, int i) {
/* 29 */     GL11.glDeleteLists(☃, i);
/*    */   }
/*    */   
/*    */   public static synchronized void b(int ☃) {
/* 33 */     GL11.glDeleteLists(☃, 1);
/*    */   }
/*    */   
/*    */   public static synchronized ByteBuffer c(int ☃) {
/* 37 */     return ByteBuffer.allocateDirect(☃).order(ByteOrder.nativeOrder());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static IntBuffer f(int ☃) {
/* 49 */     return c(☃ << 2).asIntBuffer();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static FloatBuffer h(int ☃) {
/* 57 */     return c(☃ << 2).asFloatBuffer();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */