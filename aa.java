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
/*    */ public class aa
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 19 */     return "me";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 24 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 29 */     return "commands.me.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 34 */     if (arrayOfString.length <= 0) {
/* 35 */       throw new cf("commands.me.usage", new Object[0]);
/*    */     }
/*    */     
/* 38 */     eu eu = b(☃, arrayOfString, 0, !(☃ instanceof wn));
/* 39 */     MinecraftServer.N().ap().a(new fb("chat.type.emote", new Object[] { ☃.f_(), eu }));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 45 */     return a(arrayOfString, MinecraftServer.N().K());
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */