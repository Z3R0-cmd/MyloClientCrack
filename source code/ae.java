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
/*    */ public class ae
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 18 */     return "xp";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 23 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 28 */     return "commands.xp.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 33 */     if (arrayOfString.length <= 0) {
/* 34 */       throw new cf("commands.xp.usage", new Object[0]);
/*    */     }
/*    */     
/* 37 */     String str = arrayOfString[0];
/* 38 */     boolean bool1 = (str.endsWith("l") || str.endsWith("L"));
/* 39 */     if (bool1 && str.length() > 1) {
/* 40 */       str = str.substring(0, str.length() - 1);
/*    */     }
/* 42 */     int j = a(str);
/*    */     
/* 44 */     boolean bool2 = (j < 0);
/* 45 */     if (bool2) {
/* 46 */       j *= -1;
/*    */     }
/*    */     
/* 49 */     wn wn = (arrayOfString.length > 1) ? a(☃, arrayOfString[1]) : b(☃);
/* 50 */     if (bool1) {
/* 51 */       ☃.a(n.a.e, wn.bB);
/* 52 */       if (bool2) {
/* 53 */         wn.a(-j);
/* 54 */         a(☃, this, "commands.xp.success.negative.levels", new Object[] { Integer.valueOf(j), wn.e_() });
/*    */       } else {
/* 56 */         wn.a(j);
/* 57 */         a(☃, this, "commands.xp.success.levels", new Object[] { Integer.valueOf(j), wn.e_() });
/*    */       } 
/*    */     } else {
/* 60 */       ☃.a(n.a.e, wn.bC);
/* 61 */       if (bool2) {
/* 62 */         throw new bz("commands.xp.failure.widthdrawXp", new Object[0]);
/*    */       }
/* 64 */       wn.u(j);
/* 65 */       a(☃, this, "commands.xp.success", new Object[] { Integer.valueOf(j), wn.e_() });
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 73 */     if (arrayOfString.length == 2) {
/* 74 */       return a(arrayOfString, d());
/*    */     }
/*    */     
/* 77 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 81 */     return MinecraftServer.N().K();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String[] ☃, int j) {
/* 86 */     return (j == 1);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */