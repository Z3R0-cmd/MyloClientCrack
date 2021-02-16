/*    */ package com.mylo.base.utils.notifications;
/*    */ 
/*    */ import com.mylo.base.utils.Colorutil;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NotificationManager
/*    */ {
/* 19 */   ArrayList<Notification> Notifications = new ArrayList<>();
/*    */   
/*    */   public void sendNotification(String title, String message, int duration) {
/* 22 */     Notification n = new Notification(title, message, duration);
/* 23 */     this.Notifications.add(n);
/*    */     
/* 25 */     Minecraft mc = Minecraft.getMinecraft();
/* 26 */     ScaledResolution sr = new ScaledResolution(mc);
/* 27 */     int i = this.Notifications.indexOf(n);
/* 28 */     n.setPosition(sr.getScaledWidth(), (sr.getScaledHeight() - i * 60 + 60));
/*    */   }
/*    */   
/*    */   public void updateNotifications() {
/* 32 */     Minecraft mc = Minecraft.getMinecraft();
/* 33 */     ScaledResolution sr = new ScaledResolution(mc);
/* 34 */     int i = 0;
/* 35 */     for (Notification n : this.Notifications) {
/* 36 */       i = this.Notifications.indexOf(n);
/* 37 */       if (n.timer.hasReached(n.duration) && n.didTick) {
/* 38 */         n.setTargetPosition(sr.getScaledWidth(), (int)n.y);
/* 39 */         if (n.x >= n.targetx) {
/* 40 */           this.Notifications.remove(n);
/*    */         }
/*    */       } else {
/*    */         
/* 44 */         n.setTargetPosition(sr.getScaledWidth() - 180, sr.getScaledHeight() - i * 60 + 60);
/*    */       } 
/* 46 */       n.updatePosition();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void drawNotifications() {
/* 51 */     Minecraft mc = Minecraft.getMinecraft();
/* 52 */     ScaledResolution sr = new ScaledResolution(mc);
/* 53 */     for (Notification n : this.Notifications) {
/* 54 */       float partialTicks = mc.timer.renderPartialTicks;
/* 55 */       double differenceX = (n.lastX + (n.x - n.lastX) * partialTicks);
/* 56 */       double differenceY = (n.lastY + (n.y - n.lastY) * partialTicks);
/* 57 */       double xDiff = 0.0D;
/* 58 */       double yDiff = 0.0D;
/*    */       
/* 60 */       xDiff = differenceX;
/* 61 */       yDiff = differenceY;
/*    */       
/* 63 */       int color = Colorutil.getChosenColor(0);
/* 64 */       Gui.drawRect((int)xDiff, (int)yDiff, 165 + (int)xDiff, 50 + (int)yDiff, 1996488704);
/* 65 */       Gui.drawRect(4 + (int)xDiff, (int)yDiff, (int)xDiff, 50 + (int)yDiff, color);
/* 66 */       double timerAmount = (n.didTick ? Math.min((float)n.timer.getTime() / n.duration, 1.0F) : 0.0F);
/* 67 */       Gui.drawRect((int)xDiff, (int)yDiff + 47, (int)(165.0D * timerAmount) + (int)xDiff, 50 + (int)yDiff, color);
/* 68 */       Fonts.MainFontRendererBig.drawStringWithShadow(n.title, (4 + (int)xDiff), (2 + (int)yDiff), 16777215);
/* 69 */       int i = 0;
/* 70 */       for (String s : Fonts.MainFontRenderer.wrapWords(n.message, 160.0D)) {
/* 71 */         Fonts.MainFontRenderer.drawStringWithShadow(s, (5 + (int)xDiff), (5 + Fonts.MainFontRendererBig.getHeight() + i * 10 + (int)yDiff), 16777215);
/* 72 */         i++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/notifications/NotificationManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */