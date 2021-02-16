/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.module.Module;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ public class Bind
/*    */   extends Command
/*    */ {
/*    */   public Bind() {
/* 12 */     super("bind", "bind a module", ".bind module key");
/*    */   }
/*    */ 
/*    */   
/*    */   public void Execute(String[] args) {
/* 17 */     super.Execute(args);
/* 18 */     if (args.length != 3) {
/* 19 */       Main.NotMan.sendNotification("Bind", getUsage(), 2000);
/*    */     } else {
/*    */       
/* 22 */       String key = args[2];
/* 23 */       String module = args[1];
/* 24 */       int keyCode = Keyboard.getKeyIndex(key.toUpperCase());
/* 25 */       String keyOfficialName = Keyboard.getKeyName(keyCode);
/* 26 */       Module m = Main.modmgr.getModuleByName(module);
/* 27 */       if (m == null) {
/* 28 */         Main.NotMan.sendNotification("Bind", "Could not find module by name " + module, 2000);
/*    */       } else {
/*    */         
/* 31 */         m.keybind = keyCode;
/* 32 */         Main.NotMan.sendNotification("Bind", "Bound " + module + " to " + keyOfficialName, 2000);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Bind.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */