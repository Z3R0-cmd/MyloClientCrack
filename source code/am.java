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
/*    */ public class am
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 17 */     return "kill";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 22 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 27 */     return "commands.kill.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 32 */     if (arrayOfString.length == 0) {
/* 33 */       wn wn = b(☃);
/* 34 */       wn.G();
/* 35 */       a(☃, this, "commands.kill.successful", new Object[] { wn.f_() });
/*    */       
/*    */       return;
/*    */     } 
/* 39 */     pk pk = b(☃, arrayOfString[0]);
/* 40 */     pk.G();
/* 41 */     a(☃, this, "commands.kill.successful", new Object[] { pk.f_() });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String[] ☃, int j) {
/* 46 */     return (j == 0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 52 */     if (arrayOfString.length == 1) {
/* 53 */       return a(arrayOfString, MinecraftServer.N().K());
/*    */     }
/*    */     
/* 56 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */