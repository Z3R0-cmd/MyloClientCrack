/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.utils.Stringutils;
/*    */ 
/*    */ public class Clientname
/*    */   extends Command {
/*    */   public Clientname() {
/* 10 */     super("name", "generate a different random client name", ".name");
/*    */   }
/*    */ 
/*    */   
/*    */   public void Execute(String[] args) {
/* 15 */     super.Execute(args);
/* 16 */     if (args.length < 2) {
/* 17 */       Main.randomClientName();
/*    */     } else {
/*    */       
/* 20 */       Main.ClientName = Stringutils.getString(args, 1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Clientname.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */