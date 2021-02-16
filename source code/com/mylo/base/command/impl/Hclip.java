/*    */ package com.mylo.base.command.impl;
/*    */ 
/*    */ import com.mylo.base.command.Command;
/*    */ import com.mylo.base.utils.Moveutils;
/*    */ 
/*    */ public class Hclip
/*    */   extends Command {
/*    */   public Hclip() {
/*  9 */     super("hclip", "teleport back- or forwards", ".hclip amount");
/*    */   }
/*    */ 
/*    */   
/*    */   public void Execute(String[] args) {
/* 14 */     super.Execute(args);
/*    */     try {
/* 16 */       this.mc.thePlayer.setPositionAndUpdate(this.mc.thePlayer.posX + Double.parseDouble(args[1]) * Moveutils.getXDirForward(), this.mc.thePlayer.posY, this.mc.thePlayer.posZ + Double.parseDouble(args[1]) * Moveutils.getZDirForward());
/*    */     }
/* 18 */     catch (Exception e) {
/* 19 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/impl/Hclip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */