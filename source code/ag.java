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
/*    */ public class ag
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 19 */     return "difficulty";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 24 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 29 */     return "commands.difficulty.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 34 */     if (arrayOfString.length <= 0) {
/* 35 */       throw new cf("commands.difficulty.usage", new Object[0]);
/*    */     }
/*    */     
/* 38 */     oj oj = e(arrayOfString[0]);
/* 39 */     MinecraftServer.N().a(oj);
/*    */     
/* 41 */     a(☃, this, "commands.difficulty.success", new Object[] { new fb(oj.b(), new Object[0]) });
/*    */   }
/*    */   
/*    */   protected oj e(String ☃) throws cb {
/* 45 */     if (☃.equalsIgnoreCase("peaceful") || ☃.equalsIgnoreCase("p"))
/* 46 */       return oj.a; 
/* 47 */     if (☃.equalsIgnoreCase("easy") || ☃.equalsIgnoreCase("e"))
/* 48 */       return oj.b; 
/* 49 */     if (☃.equalsIgnoreCase("normal") || ☃.equalsIgnoreCase("n"))
/* 50 */       return oj.c; 
/* 51 */     if (☃.equalsIgnoreCase("hard") || ☃.equalsIgnoreCase("h")) {
/* 52 */       return oj.d;
/*    */     }
/* 54 */     return oj.a(a(☃, 0, 3));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 61 */     if (arrayOfString.length == 1) {
/* 62 */       return a(arrayOfString, new String[] { "peaceful", "easy", "normal", "hard" });
/*    */     }
/*    */     
/* 65 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */