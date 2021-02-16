/*    */ package com.mylo.base.ui;
/*    */ 
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ 
/*    */ public class Message
/*    */   extends GuiScreen {
/*    */   GuiScreen Parent;
/*    */   
/*    */   public Message(GuiScreen Parent) {
/* 14 */     this.Parent = Parent;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/* 20 */     super.drawScreen(mouseX, mouseY, partialTicks);
/* 21 */     GlStateManager.pushAttrib();
/* 22 */     GlStateManager.pushMatrix();
/* 23 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 24 */     drawRect(0, 0, sr.getScaledWidth(), sr.getScaledHeight(), -14935012);
/* 25 */     FontRenderer fr = Fonts.MainFontRendererBig;
/* 26 */     String text = "This has been something i wanted to get off of my chest for a while now, and i just want to make it clear. I am a furry, if this is an issue to you, feel free to block me/ban me from your discord server, but i am hoping to be accepted for who i am. I'm sorry.  -- btw sorry for shitty button placement i just wanted to get this out there, a few people at a time";
/* 27 */     int line = 0;
/* 28 */     for (String lineText : fr.wrapWords(text, (sr.getScaledWidth() - 100))) {
/* 29 */       fr.drawStringWithShadow(lineText, 50.0D, (20 + line * (fr.getHeight() + 2)), 16777215);
/* 30 */       line++;
/*    */     } 
/* 32 */     GlStateManager.popAttrib();
/* 33 */     GlStateManager.popMatrix();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Message.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */