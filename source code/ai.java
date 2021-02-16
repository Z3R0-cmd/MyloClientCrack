/*    */ import java.util.Iterator;
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
/*    */ public class ai
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 21 */     return "gamerule";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 26 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 31 */     return "commands.gamerule.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 36 */     adk adk = d();
/* 37 */     String str1 = (arrayOfString.length > 0) ? arrayOfString[0] : "";
/* 38 */     String str2 = (arrayOfString.length > 1) ? a(arrayOfString, 1) : "";
/* 39 */     switch (arrayOfString.length) {
/*    */       case 1:
/* 41 */         if (adk.e(str1)) {
/* 42 */           String str = adk.a(str1);
/* 43 */           ☃.a((new fa(str1)).a(" = ").a(str));
/* 44 */           ☃.a(n.a.e, adk.c(str1));
/*    */         } else {
/* 46 */           throw new bz("commands.gamerule.norule", new Object[] { str1 });
/*    */         } 
/*    */         return;
/*    */       
/*    */       case 0:
/* 51 */         ☃.a(new fa(a((Object[])adk.b())));
/*    */         return;
/*    */     } 
/*    */     
/* 55 */     if (adk.a(str1, adk.b.b) && !"true".equals(str2) && !"false".equals(str2)) {
/* 56 */       throw new bz("commands.generic.boolean.invalid", new Object[] { str2 });
/*    */     }
/* 58 */     adk.a(str1, str2);
/* 59 */     a(adk, str1);
/* 60 */     a(☃, this, "commands.gamerule.success", new Object[0]);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void a(adk ☃, String str) {
/* 66 */     if ("reducedDebugInfo".equals(str)) {
/* 67 */       byte b = ☃.b(str) ? 22 : 23;
/* 68 */       for (Iterator<lf> iterator = MinecraftServer.N().ap().v().iterator(); iterator.hasNext(); ) { lf lf = iterator.next();
/* 69 */         lf.a.a(new gi(lf, b)); }
/*    */     
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 77 */     if (arrayOfString.length == 1) {
/* 78 */       return a(arrayOfString, d().b());
/*    */     }
/* 80 */     if (arrayOfString.length == 2) {
/* 81 */       adk adk = d();
/* 82 */       if (adk.a(arrayOfString[0], adk.b.b)) {
/* 83 */         return a(arrayOfString, new String[] { "true", "false" });
/*    */       }
/*    */     } 
/*    */     
/* 87 */     return null;
/*    */   }
/*    */   
/*    */   private adk d() {
/* 91 */     return MinecraftServer.N().a(0).Q();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */