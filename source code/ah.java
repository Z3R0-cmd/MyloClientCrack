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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ah
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 24 */     return "gamemode";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 29 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 34 */     return "commands.gamemode.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 39 */     if (arrayOfString.length <= 0) {
/* 40 */       throw new cf("commands.gamemode.usage", new Object[0]);
/*    */     }
/*    */     
/* 43 */     adp.a a = h(☃, arrayOfString[0]);
/* 44 */     wn wn = (arrayOfString.length >= 2) ? a(☃, arrayOfString[1]) : b(☃);
/*    */     
/* 46 */     wn.a(a);
/* 47 */     wn.O = 0.0F;
/* 48 */     if (☃.e().Q().b("sendCommandFeedback")) {
/* 49 */       wn.a(new fb("gameMode.changed", new Object[0]));
/*    */     }
/*    */     
/* 52 */     eu eu = new fb("gameMode." + a.b(), new Object[0]);
/* 53 */     if (wn != ☃) {
/* 54 */       a(☃, this, 1, "commands.gamemode.success.other", new Object[] { wn.e_(), eu });
/*    */     } else {
/* 56 */       a(☃, this, 1, "commands.gamemode.success.self", new Object[] { eu });
/*    */     } 
/*    */   }
/*    */   
/*    */   protected adp.a h(m ☃, String str) throws cb {
/* 61 */     if (str.equalsIgnoreCase(adp.a.b.b()) || str.equalsIgnoreCase("s"))
/* 62 */       return adp.a.b; 
/* 63 */     if (str.equalsIgnoreCase(adp.a.c.b()) || str.equalsIgnoreCase("c"))
/* 64 */       return adp.a.c; 
/* 65 */     if (str.equalsIgnoreCase(adp.a.d.b()) || str.equalsIgnoreCase("a"))
/* 66 */       return adp.a.d; 
/* 67 */     if (str.equalsIgnoreCase(adp.a.e.b()) || str.equalsIgnoreCase("sp")) {
/* 68 */       return adp.a.e;
/*    */     }
/* 70 */     return adp.a(a(str, 0, (adp.a.values()).length - 2));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 77 */     if (arrayOfString.length == 1)
/* 78 */       return a(arrayOfString, new String[] { "survival", "creative", "adventure", "spectator" }); 
/* 79 */     if (arrayOfString.length == 2) {
/* 80 */       return a(arrayOfString, d());
/*    */     }
/*    */     
/* 83 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 87 */     return MinecraftServer.N().K();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String[] ☃, int j) {
/* 92 */     return (j == 1);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */