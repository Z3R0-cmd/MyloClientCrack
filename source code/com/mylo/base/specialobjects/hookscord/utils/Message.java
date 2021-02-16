/*    */ package com.mylo.base.specialobjects.hookscord.utils;
/*    */ 
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Message
/*    */ {
/*    */   private String _username;
/*    */   private String _iconUrl;
/*    */   private String _text;
/*    */   private ArrayList<Attachment> _attachments;
/*    */   
/*    */   public Message() {
/* 30 */     this(null, null, null);
/*    */   }
/*    */   
/*    */   public Message(String username) {
/* 34 */     this(username, null, null);
/*    */   }
/*    */   
/*    */   public Message(String username, String iconUrl) {
/* 38 */     this(username, iconUrl, null);
/*    */   }
/*    */   
/*    */   public Message(String username, String iconUrl, String text) {
/* 42 */     this._username = username;
/* 43 */     this._iconUrl = iconUrl;
/* 44 */     this._text = text;
/* 45 */     this._attachments = new ArrayList<>();
/*    */   }
/*    */   
/*    */   public void setText(String text) {
/* 49 */     this._text = text;
/*    */   }
/*    */   
/*    */   public void setUsername(String username) {
/* 53 */     this._username = username;
/*    */   }
/*    */   
/*    */   public void setIconUrl(String iconUrl) {
/* 57 */     this._iconUrl = iconUrl;
/*    */   }
/*    */   
/*    */   public void pushAttachment(Attachment attachment) {
/* 61 */     this._attachments.add(attachment);
/*    */   }
/*    */   
/*    */   public JsonObject toJson() {
/* 65 */     JsonObject result = new JsonObject();
/* 66 */     result.addProperty("username", this._username);
/* 67 */     result.addProperty("icon_url", this._iconUrl);
/* 68 */     result.addProperty("text", this._text);
/* 69 */     if (!this._attachments.isEmpty()) {
/* 70 */       JsonArray array = new JsonArray();
/* 71 */       for (Attachment attachment : this._attachments) {
/* 72 */         array.add((JsonElement)attachment.toJson());
/*    */       }
/* 74 */       result.add("attachments", (JsonElement)array);
/*    */     } 
/* 76 */     return result;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/hookscord/utils/Message.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */