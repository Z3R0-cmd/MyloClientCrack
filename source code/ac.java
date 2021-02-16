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
/*    */ public class ac
/*    */   extends i
/*    */ {
/*    */   public String c() {
/* 21 */     return "entitydata";
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 26 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String c(m ☃) {
/* 31 */     return "commands.entitydata.usage";
/*    */   }
/*    */   
/*    */   public void a(m ☃, String[] arrayOfString) throws bz {
/*    */     dn dn3;
/* 36 */     if (arrayOfString.length < 2) {
/* 37 */       throw new cf("commands.entitydata.usage", new Object[0]);
/*    */     }
/*    */     
/* 40 */     pk pk = b(☃, arrayOfString[0]);
/* 41 */     if (pk instanceof wn) {
/* 42 */       throw new bz("commands.entitydata.noPlayers", new Object[] { pk.f_() });
/*    */     }
/*    */     
/* 45 */     dn dn1 = new dn();
/* 46 */     pk.e(dn1);
/* 47 */     dn dn2 = (dn)dn1.b();
/*    */ 
/*    */     
/*    */     try {
/* 51 */       dn3 = ed.a(a(☃, arrayOfString, 1).c());
/* 52 */     } catch (ec ec) {
/* 53 */       throw new bz("commands.entitydata.tagError", new Object[] { ec.getMessage() });
/*    */     } 
/*    */     
/* 56 */     dn3.o("UUIDMost");
/* 57 */     dn3.o("UUIDLeast");
/*    */     
/* 59 */     dn1.a(dn3);
/*    */     
/* 61 */     if (dn1.equals(dn2)) {
/* 62 */       throw new bz("commands.entitydata.failed", new Object[] { dn1.toString() });
/*    */     }
/*    */     
/* 65 */     pk.f(dn1);
/*    */     
/* 67 */     a(☃, this, "commands.entitydata.success", new Object[] { dn1.toString() });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String[] ☃, int j) {
/* 72 */     return (j == 0);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */