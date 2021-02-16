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
/*    */ public class Attachment
/*    */ {
/*    */   private String _authorName;
/*    */   private String _authorIcon;
/*    */   private String _color;
/*    */   private ArrayList<Field> _fields;
/*    */   
/*    */   public Attachment() {
/* 29 */     this(null, null, null);
/*    */   }
/*    */   
/*    */   public Attachment(String authorName) {
/* 33 */     this(authorName, null, null);
/*    */   }
/*    */   
/*    */   public Attachment(String authorName, String authorIcon) {
/* 37 */     this(authorName, authorIcon, null);
/*    */   }
/*    */   
/*    */   public Attachment(String authorName, String authorIcon, String color) {
/* 41 */     this._authorName = authorName;
/* 42 */     this._authorIcon = authorIcon;
/* 43 */     this._color = color;
/* 44 */     this._fields = new ArrayList<>();
/*    */   }
/*    */   
/*    */   public void setAuthorName(String authorName) {
/* 48 */     this._authorName = authorName;
/*    */   }
/*    */   
/*    */   public void setAuthorIcon(String authorIcon) {
/* 52 */     this._authorIcon = authorIcon;
/*    */   }
/*    */   
/*    */   public void setColor(String color) {
/* 56 */     this._color = color;
/*    */   }
/*    */   
/*    */   public void pushField(Field field) {
/* 60 */     this._fields.add(field);
/*    */   }
/*    */   
/*    */   public JsonObject toJson() {
/* 64 */     JsonObject result = new JsonObject();
/* 65 */     result.addProperty("author_icon", this._authorIcon);
/* 66 */     result.addProperty("author_name", this._authorName);
/* 67 */     result.addProperty("color", this._color);
/* 68 */     if (!this._fields.isEmpty()) {
/* 69 */       JsonArray array = new JsonArray();
/* 70 */       for (Field field : this._fields) {
/* 71 */         array.add((JsonElement)field.toJson());
/*    */       }
/* 73 */       result.add("fields", (JsonElement)array);
/*    */     } 
/* 75 */     return result;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/hookscord/utils/Attachment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */