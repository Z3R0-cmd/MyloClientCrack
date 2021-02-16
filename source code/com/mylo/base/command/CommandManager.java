/*    */ package com.mylo.base.command;
/*    */ import com.mylo.base.command.impl.Bind;
/*    */ import com.mylo.base.command.impl.Clientname;
/*    */ import com.mylo.base.command.impl.Config;
/*    */ import com.mylo.base.command.impl.Discordtarget;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class CommandManager {
/*    */   public CommandManager() {
/* 10 */     commandlist = new ArrayList<>();
/* 11 */     add((Command)new Help());
/* 12 */     add((Command)new Config());
/* 13 */     add((Command)new Clientname());
/* 14 */     add((Command)new Reload());
/* 15 */     add((Command)new Vclip());
/* 16 */     add((Command)new Discordtarget());
/* 17 */     add((Command)new Hclip());
/* 18 */     add((Command)new Bind());
/*    */   }
/*    */   static ArrayList<Command> commandlist;
/*    */   
/*    */   public void add(Command c) {
/* 23 */     commandlist.add(c);
/*    */   }
/*    */   
/*    */   public static ArrayList<Command> getCommands() {
/* 27 */     return commandlist;
/*    */   }
/*    */   
/*    */   public static Command getcommand(String name) {
/* 31 */     for (Command c : commandlist) {
/* 32 */       if (c.getTrigger().equalsIgnoreCase(name)) {
/* 33 */         return c;
/*    */       }
/*    */     } 
/* 36 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/CommandManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */