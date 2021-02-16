/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.command.Command;
/*    */ 
/*    */ public class Vclip
/*    */   extends Command {
/*    */   public Vclip() {
/*  8 */     super("vclip", "teleport up or down", ".vclip amount");
/*    */   }
/*    */ 
/*    */   
/*    */   public void Execute(String[] args) {
/* 13 */     super.Execute(args);
/*    */     try {
/* 15 */       this.mc.thePlayer.setPositionAndUpdate(this.mc.thePlayer.posX, this.mc.thePlayer.posY + Double.parseDouble(args[1]), this.mc.thePlayer.posZ);
/*    */     }
/* 17 */     catch (Exception e) {
/* 18 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Vclip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */