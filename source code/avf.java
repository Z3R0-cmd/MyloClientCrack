/*    */ import org.lwjgl.input.Mouse;
/*    */ import org.lwjgl.opengl.Display;
/*    */ 
/*    */ public class avf
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public void a() {
/* 10 */     Mouse.setGrabbed(true);
/* 11 */     this.a = 0;
/* 12 */     this.b = 0;
/*    */   }
/*    */   
/*    */   public void b() {
/* 16 */     Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
/* 17 */     Mouse.setGrabbed(false);
/*    */   }
/*    */   
/*    */   public void c() {
/* 21 */     this.a = Mouse.getDX();
/* 22 */     this.b = Mouse.getDY();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */