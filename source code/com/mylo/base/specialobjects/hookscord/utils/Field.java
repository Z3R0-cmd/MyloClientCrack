/*    */ package com.mylo.base.specialobjects.hookscord.utils;
/*    */ 
/*    */ import com.google.gson.JsonObject;
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
/*    */ public class Field
/*    */ {
/*    */   private String _title;
/*    */   private String _value;
/*    */   
/*    */   public Field() {
/* 24 */     this(null, null);
/*    */   }
/*    */   
/*    */   public Field(String title) {
/* 28 */     this(title, null);
/*    */   }
/*    */   
/*    */   public Field(String title, String value) {
/* 32 */     this._title = title;
/* 33 */     this._value = value;
/*    */   }
/*    */   
/*    */   public void setTitle(String title) {
/* 37 */     this._title = title;
/*    */   }
/*    */   
/*    */   public void setValue(String value) {
/* 41 */     this._value = value;
/*    */   }
/*    */   
/*    */   public JsonObject toJson() {
/* 45 */     JsonObject result = new JsonObject();
/* 46 */     result.addProperty("title", this._title);
/* 47 */     result.addProperty("value", this._value);
/* 48 */     return result;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/hookscord/utils/Field.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */