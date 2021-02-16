/*    */ import java.util.List;
/*    */ import java.util.regex.Matcher;
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
/*    */ public class as
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 18 */     return "pardon-ip";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 23 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(m ☃) {
/* 28 */     return (MinecraftServer.N().ap().i().b() && super.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 33 */     return "commands.unbanip.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 38 */     if (arrayOfString.length != 1 || arrayOfString[0].length() <= 1) {
/* 39 */       throw new cf("commands.unbanip.usage", new Object[0]);
/*    */     }
/*    */     
/* 42 */     Matcher matcher = q.a.matcher(arrayOfString[0]);
/* 43 */     if (matcher.matches()) {
/* 44 */       MinecraftServer.N().ap().i().c(arrayOfString[0]);
/* 45 */       a(☃, this, "commands.unbanip.success", new Object[] { arrayOfString[0] });
/*    */     } else {
/* 47 */       throw new cc("commands.unbanip.invalid", new Object[0]);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 54 */     if (arrayOfString.length == 1) {
/* 55 */       return a(arrayOfString, MinecraftServer.N().ap().i().a());
/*    */     }
/*    */     
/* 58 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */