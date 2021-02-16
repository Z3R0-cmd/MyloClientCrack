/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ao
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 14 */     return "list";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 19 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 24 */     return "commands.players.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 29 */     int j = MinecraftServer.N().I();
/* 30 */     ☃.a(new fb("commands.players.list", new Object[] { Integer.valueOf(j), Integer.valueOf(MinecraftServer.N().J()) }));
/* 31 */     ☃.a(new fa(MinecraftServer.N().ap().b((arrayOfString.length > 0 && "uuids".equalsIgnoreCase(arrayOfString[0])))));
/* 32 */     ☃.a(n.a.e, j);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */