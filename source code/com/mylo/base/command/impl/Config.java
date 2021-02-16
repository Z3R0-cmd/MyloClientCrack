/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.utils.saveutil;
/*    */ 
/*    */ public class Config
/*    */   extends Command {
/*    */   public Config() {
/* 10 */     super("config", "save/load a config", ".config load/save <name>");
/*    */   }
/*    */ 
/*    */   
/*    */   public void Execute(String[] args) {
/* 15 */     super.Execute(args); String str;
/* 16 */     switch ((str = args[1]).hashCode()) { case 3327206: if (!str.equals("load")) {
/*    */           break;
/*    */         }
/*    */ 
/*    */ 
/*    */         
/* 22 */         saveutil.load(args[2]);
/* 23 */         Main.NotMan.sendNotification("Config", "Loaded config " + args[2], 2000); return;
/*    */       case 3522941:
/*    */         if (!str.equals("save"))
/* 26 */           break;  saveutil.save(args[2]); Main.NotMan.sendNotification("Config", "Saved config " + args[2], 2000); return; }  Main.sendChatMessage("use save or load");
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Config.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */