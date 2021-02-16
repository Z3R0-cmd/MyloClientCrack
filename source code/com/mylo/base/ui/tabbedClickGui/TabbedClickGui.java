/*    */ package com.mylo.base.ui.tabbedClickGui;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ public class TabbedClickGui
/*    */   extends GuiScreen
/*    */ {
/* 10 */   BigPanel clickGui = new BigPanel();
/*    */ 
/*    */   
/*    */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/* 14 */     super.drawScreen(mouseX, mouseY, partialTicks);
/* 15 */     this.clickGui.Draw(mouseX, mouseY);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void keyTyped(char typedChar, int keyCode) throws IOException {
/* 20 */     super.keyTyped(typedChar, keyCode);
/*    */   }
/*    */ 
/*    */   
/*    */   public void handleKeyboardInput() throws IOException {
/* 25 */     super.handleKeyboardInput();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean doesGuiPauseGame() {
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void handleMouseInput() throws IOException {
/* 35 */     super.handleMouseInput();
/* 36 */     int scroll = Mouse.getEventDWheel();
/* 37 */     if (scroll != 0) {
/* 38 */       this.clickGui.scroll(scroll, Mouse.getX(), Mouse.getY());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
/* 44 */     super.mouseClicked(mouseX, mouseY, mouseButton);
/* 45 */     this.clickGui.mouseClick(mouseX, mouseY, mouseButton);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void mouseReleased(int mouseX, int mouseY, int mouseButton) {
/* 50 */     super.mouseReleased(mouseX, mouseY, mouseButton);
/* 51 */     this.clickGui.mouseRelease(mouseX, mouseY, mouseButton);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/TabbedClickGui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */