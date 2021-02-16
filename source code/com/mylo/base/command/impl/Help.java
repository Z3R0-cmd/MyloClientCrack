/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.command.CommandManager;
/*    */ 
/*    */ 
/*    */ public class Help
/*    */   extends Command
/*    */ {
/*    */   public Help() {
/* 12 */     super("help", "shows help", ".help");
/*    */   }
/*    */   
/*    */   public void Execute(String[] args) {
/* 16 */     super.Execute(args);
/* 17 */     String commands = "";
/* 18 */     for (Command c : CommandManager.getCommands()) {
/* 19 */       commands = String.valueOf(commands) + " " + c.getUsage() + " : " + c.getDescription() + "\n";
/*    */     }
/* 21 */     Main.sendChatMessage(commands);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Help.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */