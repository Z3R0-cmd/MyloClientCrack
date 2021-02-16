/*    */ package com.mylo.base.specialobjects;
/*    */ 
/*    */ 
/*    */ public class AnimatedRect
/*    */ {
/*    */   public int x;
/*    */   public int y;
/*    */   public int x2;
/*    */   public int y2;
/*    */   public int targetx;
/*    */   public int targety;
/*    */   public int targetx2;
/*    */   public int targety2;
/*    */   
/*    */   public AnimatedRect(int x, int y, int x2, int y2) {
/* 16 */     this.x = x;
/* 17 */     this.y = y;
/* 18 */     this.x2 = x2;
/* 19 */     this.y2 = y2;
/*    */   }
/*    */   public void setTargetSize(int x, int y, int x2, int y2) {
/* 22 */     this.targetx = x;
/* 23 */     this.targety = y;
/* 24 */     this.targetx2 = x2;
/* 25 */     this.targety2 = y2;
/*    */   }
/*    */   public void animate() {
/* 28 */     if (this.x > this.targetx) {
/* 29 */       this.x--;
/*    */     }
/* 31 */     if (this.x < this.targetx) {
/* 32 */       this.x++;
/*    */     }
/*    */     
/* 35 */     if (this.y > this.targety) {
/* 36 */       this.y--;
/*    */     }
/* 38 */     if (this.y < this.targety) {
/* 39 */       this.y++;
/*    */     }
/*    */     
/* 42 */     if (this.y2 > this.targety2) {
/* 43 */       this.y2--;
/*    */     }
/* 45 */     if (this.y2 < this.targety2) {
/* 46 */       this.y2++;
/*    */     }
/*    */     
/* 49 */     if (this.x2 > this.targetx2) {
/* 50 */       this.x2--;
/*    */     }
/* 52 */     if (this.x2 < this.targetx2)
/* 53 */       this.x2++; 
/*    */   }
/*    */   
/*    */   public boolean hasTargetSize() {
/* 57 */     return (this.x == this.targetx && this.y == this.targety && this.x2 == this.targetx2 && this.y2 == this.targety2);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/AnimatedRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */