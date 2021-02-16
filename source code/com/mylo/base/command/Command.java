/*    */ package com.mylo.base.command;
/*    */ 
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Command
/*    */ {
/*    */   String Trigger;
/*    */   String Description;
/*    */   String Usage;
/*    */   boolean running;
/*    */   public Minecraft mc;
/*    */   
/*    */   public Command(String Trigger, String Description, String Usage) {
/* 20 */     this.mc = Minecraft.getMinecraft(); this.Trigger = Trigger;
/*    */     this.Description = Description;
/* 22 */     this.Usage = Usage; } public void setRunning(boolean running) { this.running = running; } public boolean isRunning() {
/* 23 */     return this.running;
/*    */   }
/*    */   
/*    */   public void Run(EventUpdate e) {}
/*    */   public void Execute(String[] args) {}
/* 28 */   public String getTrigger() { return this.Trigger; }
/* 29 */   public String getDescription() { return this.Description; } public String getUsage() {
/* 30 */     return this.Usage;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/command/Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */