/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.saveutil;
/*    */ import javax.sound.sampled.AudioInputStream;
/*    */ import javax.sound.sampled.Clip;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Reload
/*    */   extends Command
/*    */ {
/*    */   public AudioInputStream stream;
/*    */   Clip clip;
/*    */   
/*    */   public Reload() {
/* 25 */     super("reload", "reloads the client", ".reload");
/*    */ 
/*    */     
/* 28 */     this.clip = null;
/*    */   }
/*    */   
/*    */   public void Execute(String[] args) {
/* 32 */     super.Execute(args);
/* 33 */     saveutil.save("config");
/* 34 */     for (Module m : Main.modmgr.getModules()) {
/* 35 */       if (m.getState()) {
/* 36 */         m.toggle();
/*    */       }
/*    */     } 
/* 39 */     Main.refresh();
/* 40 */     Main.sendChatMessage("Reloaded");
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Reload.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */