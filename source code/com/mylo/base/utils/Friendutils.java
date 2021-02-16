/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Friendutils
/*    */ {
/*    */   public static boolean isFriend(String uuid) {
/* 10 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void addFriend(String uuid) {
/* 15 */     if (!isFriend(uuid)) {
/* 16 */       List<String> Friends = saveutil.getFriends();
/* 17 */       Friends.add(uuid);
/* 18 */       saveutil.saveFriends(Friends);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void removeFriend(String uuid) {
/* 23 */     if (isFriend(uuid)) {
/* 24 */       List<String> Friends = saveutil.getFriends();
/* 25 */       Friends.remove(uuid);
/* 26 */       saveutil.saveFriends(Friends);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Friendutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */