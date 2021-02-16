/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.utils.Stringutils;
/*    */ 
/*    */ public class Discordtarget
/*    */   extends Command {
/*    */   public Discordtarget() {
/* 10 */     super("Disabler", "set target for mineplex disabler", ".disabler target");
/*    */   }
/*    */ 
/*    */   
/*    */   public void Execute(String[] args) {
/* 15 */     super.Execute(args);
/* 16 */     String s = Stringutils.getString(args, 1);
/* 17 */     Main.discordtarget = s;
/* 18 */     Main.NotMan.sendNotification("set disabler target", s, 5000);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Discordtarget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */