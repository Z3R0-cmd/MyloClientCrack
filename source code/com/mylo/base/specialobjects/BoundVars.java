/*    */ package com.mylo.base.specialobjects;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BoundVars
/*    */ {
/* 11 */   Map<String, Object> dict = new HashMap<>();
/*    */ 
/*    */   
/*    */   public void addInfo(String key, Object value) {
/* 15 */     this.dict.put(key, value);
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/* 19 */     return this.dict.isEmpty();
/*    */   }
/*    */   
/*    */   public Object getValue(String key) {
/* 23 */     return this.dict.get(key);
/*    */   }
/*    */   
/*    */   public Boolean hasValue(String key) {
/* 27 */     return Boolean.valueOf(this.dict.containsKey(key));
/*    */   }
/*    */   
/*    */   public Boolean contains(Object value) {
/* 31 */     return Boolean.valueOf(this.dict.containsValue(value));
/*    */   }
/*    */   
/*    */   public void delete(String key) {
/* 35 */     this.dict.remove(key);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/specialobjects/BoundVars.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */