/*    */ import com.google.gson.JsonParseException;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.apache.commons.lang3.exception.ExceptionUtils;
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
/*    */ public class aq
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 22 */     return "tellraw";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 27 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 32 */     return "commands.tellraw.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 37 */     if (arrayOfString.length < 2) {
/* 38 */       throw new cf("commands.tellraw.usage", new Object[0]);
/*    */     }
/*    */     
/* 41 */     wn wn = a(☃, arrayOfString[0]);
/* 42 */     String str = a(arrayOfString, 1);
/*    */     
/*    */     try {
/* 45 */       eu eu = eu.a.a(str);
/* 46 */       wn.a(ev.a(☃, eu, wn));
/* 47 */     } catch (JsonParseException jsonParseException) {
/* 48 */       Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
/* 49 */       throw new cc("commands.tellraw.jsonException", new Object[] { (throwable == null) ? "" : throwable.getMessage() });
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 56 */     if (arrayOfString.length == 1) {
/* 57 */       return a(arrayOfString, MinecraftServer.N().K());
/*    */     }
/*    */     
/* 60 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String[] ☃, int j) {
/* 65 */     return (j == 0);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */