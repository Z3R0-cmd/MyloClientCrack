/*    */ package com.mylo.base.utils.notifications;
/*    */ 
/*    */ import com.mylo.base.utils.TimeHelper;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Notification
/*    */ {
/*    */   String title;
/*    */   String message;
/*    */   int duration;
/*    */   int targetx;
/*    */   int targety;
/* 15 */   TimeHelper timer = new TimeHelper(); float x; float y; float lastX; float lastY; long lastMilis; boolean didTick = false;
/*    */   public Notification(String title, String message, int duration) {
/* 17 */     this.title = title;
/* 18 */     this.message = message;
/* 19 */     this.duration = duration;
/* 20 */     this.timer.reset();
/*    */   }
/*    */   
/*    */   public void setPosition(float posx, float posy) {
/* 24 */     this.targetx = (int)posx;
/* 25 */     this.targety = (int)posy;
/* 26 */     this.x = posx;
/* 27 */     this.y = posy;
/*    */   }
/*    */   
/*    */   public void setTargetPosition(int posx, int posy) {
/* 31 */     this.targetx = posx;
/* 32 */     this.targety = posy;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void updatePosition() {
/* 38 */     float difference = 8.0F;
/* 39 */     this.lastX = this.x;
/* 40 */     this.lastY = this.y;
/* 41 */     if (this.x < this.targetx) {
/* 42 */       this.x += difference;
/*    */     }
/* 44 */     if (this.x > this.targetx) {
/* 45 */       this.x -= difference;
/*    */     }
/* 47 */     if (this.y < this.targety) {
/* 48 */       this.y += difference;
/*    */     }
/* 50 */     if (this.y > this.targety) {
/* 51 */       this.y -= difference;
/*    */     }
/*    */     
/* 54 */     if (this.x + difference > this.targetx && this.x - difference < this.targetx && !this.didTick) {
/* 55 */       this.didTick = true;
/* 56 */       this.timer.reset();
/*    */     } 
/* 58 */     this.lastMilis = System.currentTimeMillis();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/notifications/Notification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */