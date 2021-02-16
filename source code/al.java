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
/*    */ public class al
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 18 */     return "kick";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 23 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 28 */     return "commands.kick.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 33 */     if (arrayOfString.length <= 0 || arrayOfString[0].length() <= 1) {
/* 34 */       throw new cf("commands.kick.usage", new Object[0]);
/*    */     }
/*    */     
/* 37 */     lf lf = MinecraftServer.N().ap().a(arrayOfString[0]);
/* 38 */     String str = "Kicked by an operator.";
/* 39 */     boolean bool = false;
/*    */     
/* 41 */     if (lf == null) {
/* 42 */       throw new cd();
/*    */     }
/*    */     
/* 45 */     if (arrayOfString.length >= 2) {
/* 46 */       str = a(☃, arrayOfString, 1).c();
/* 47 */       bool = true;
/*    */     } 
/*    */     
/* 50 */     lf.a.c(str);
/* 51 */     if (bool) {
/* 52 */       a(☃, this, "commands.kick.success.reason", new Object[] { lf.e_(), str });
/*    */     } else {
/* 54 */       a(☃, this, "commands.kick.success", new Object[] { lf.e_() });
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 61 */     if (arrayOfString.length >= 1) {
/* 62 */       return a(arrayOfString, MinecraftServer.N().K());
/*    */     }
/*    */     
/* 65 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */