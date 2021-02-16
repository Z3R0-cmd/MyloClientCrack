/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TimeHelper
/*    */ {
/*  8 */   public long lastMS = 0L;
/*    */ 
/*    */   
/*    */   public boolean isDelayComplete(Long f) {
/* 12 */     return (System.currentTimeMillis() - this.lastMS >= f.longValue());
/*    */   }
/*    */   
/*    */   public long getTime() {
/* 16 */     return System.currentTimeMillis() - this.lastMS;
/*    */   }
/*    */   
/*    */   public void setLastMS(long lastMS) {
/* 20 */     this.lastMS = System.currentTimeMillis();
/*    */   }
/*    */   
/*    */   public int convertToMS(int perSecond) {
/* 24 */     return 1000 / perSecond;
/*    */   }
/*    */   
/*    */   public boolean hasReached(float milliseconds) {
/* 28 */     return ((float)(System.currentTimeMillis() - this.lastMS) >= milliseconds);
/*    */   }
/*    */   
/*    */   public void reset() {
/* 32 */     this.lastMS = System.currentTimeMillis();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/TimeHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */