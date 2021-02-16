/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
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
/*    */ public class ap
/*    */   extends i
/*    */ {
/*    */   public List<String> b() {
/* 22 */     return Arrays.asList(new String[] { "w", "msg" });
/*    */   }
/*    */ 
/*    */   
/*    */   public String c() {
/* 27 */     return "tell";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 32 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 37 */     return "commands.message.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 42 */     if (arrayOfString.length < 2) {
/* 43 */       throw new cf("commands.message.usage", new Object[0]);
/*    */     }
/*    */     
/* 46 */     wn wn = a(☃, arrayOfString[0]);
/* 47 */     if (wn == ☃) {
/* 48 */       throw new cd("commands.message.sameTarget", new Object[0]);
/*    */     }
/*    */     
/* 51 */     eu eu = b(☃, arrayOfString, 1, !(☃ instanceof wn));
/* 52 */     fb fb1 = new fb("commands.message.display.incoming", new Object[] { ☃.f_(), eu.f() });
/* 53 */     fb fb2 = new fb("commands.message.display.outgoing", new Object[] { wn.f_(), eu.f() });
/* 54 */     fb1.b().a(a.h).b(Boolean.valueOf(true));
/* 55 */     fb2.b().a(a.h).b(Boolean.valueOf(true));
/* 56 */     wn.a(fb1);
/* 57 */     ☃.a(fb2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 63 */     return a(arrayOfString, MinecraftServer.N().K());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String[] ☃, int j) {
/* 68 */     return (j == 0);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */