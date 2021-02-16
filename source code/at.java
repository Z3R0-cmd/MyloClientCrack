/*    */ import com.mojang.authlib.GameProfile;
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
/*    */ public class at
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 17 */     return "pardon";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 22 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 27 */     return "commands.unban.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(m ☃) {
/* 32 */     return (MinecraftServer.N().ap().h().b() && super.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 37 */     if (arrayOfString.length != 1 || arrayOfString[0].length() <= 0) {
/* 38 */       throw new cf("commands.unban.usage", new Object[0]);
/*    */     }
/*    */     
/* 41 */     MinecraftServer minecraftServer = MinecraftServer.N();
/* 42 */     GameProfile gameProfile = minecraftServer.ap().h().a(arrayOfString[0]);
/* 43 */     if (gameProfile == null) {
/* 44 */       throw new bz("commands.unban.failed", new Object[] { arrayOfString[0] });
/*    */     }
/*    */     
/* 47 */     minecraftServer.ap().h().c(gameProfile);
/* 48 */     a(☃, this, "commands.unban.success", new Object[] { arrayOfString[0] });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 54 */     if (arrayOfString.length == 1) {
/* 55 */       return a(arrayOfString, MinecraftServer.N().ap().h().a());
/*    */     }
/*    */     
/* 58 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */