/*    */ import com.google.common.collect.Lists;
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
/*    */ public class ar
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 18 */     return "op";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 23 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 28 */     return "commands.op.usage";
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/* 33 */     if (arrayOfString.length != 1 || arrayOfString[0].length() <= 0) {
/* 34 */       throw new cf("commands.op.usage", new Object[0]);
/*    */     }
/*    */     
/* 37 */     MinecraftServer minecraftServer = MinecraftServer.N();
/* 38 */     GameProfile gameProfile = minecraftServer.aF().a(arrayOfString[0]);
/* 39 */     if (gameProfile == null) {
/* 40 */       throw new bz("commands.op.failed", new Object[] { arrayOfString[0] });
/*    */     }
/*    */     
/* 43 */     minecraftServer.ap().a(gameProfile);
/* 44 */     a(☃, this, "commands.op.success", new Object[] { arrayOfString[0] });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 50 */     if (arrayOfString.length == 1) {
/* 51 */       String str = arrayOfString[arrayOfString.length - 1];
/* 52 */       List<String> list = Lists.newArrayList(); GameProfile[] arrayOfGameProfile;
/*    */       int j, k;
/* 54 */       for (arrayOfGameProfile = MinecraftServer.N().L(), j = arrayOfGameProfile.length, k = 0; k < j; ) { GameProfile gameProfile = arrayOfGameProfile[k];
/* 55 */         if (!MinecraftServer.N().ap().h(gameProfile) && a(str, gameProfile.getName())) {
/* 56 */           list.add(gameProfile.getName());
/*    */         }
/*    */         k++; }
/*    */       
/* 60 */       return list;
/*    */     } 
/*    */     
/* 63 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */