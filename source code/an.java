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
/*    */ public class an
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 17 */     return "banlist";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 22 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(m ☃) {
/* 27 */     return ((MinecraftServer.N().ap().i().b() || MinecraftServer.N().ap().h().b()) && super.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 32 */     return "commands.banlist.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 37 */     if (arrayOfString.length >= 1 && arrayOfString[0].equalsIgnoreCase("ips")) {
/* 38 */       ☃.a(new fb("commands.banlist.ips", new Object[] { Integer.valueOf((MinecraftServer.N().ap().i().a()).length) }));
/* 39 */       ☃.a(new fa(a((Object[])MinecraftServer.N().ap().i().a())));
/*    */     } else {
/* 41 */       ☃.a(new fb("commands.banlist.players", new Object[] { Integer.valueOf((MinecraftServer.N().ap().h().a()).length) }));
/* 42 */       ☃.a(new fa(a((Object[])MinecraftServer.N().ap().h().a())));
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 49 */     if (arrayOfString.length == 1) {
/* 50 */       return a(arrayOfString, new String[] { "players", "ips" });
/*    */     }
/*    */     
/* 53 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */