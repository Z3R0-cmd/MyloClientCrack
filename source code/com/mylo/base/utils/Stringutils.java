/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class Stringutils {
/*    */   public static String getString(String[] array, int offset) {
/*  7 */     array = Arrays.<String>copyOfRange(array, offset, array.length);
/*  8 */     String text = ""; byte b; int i; String[] arrayOfString;
/*  9 */     for (i = (arrayOfString = array).length, b = 0; b < i; ) { String line = arrayOfString[b];
/* 10 */       text = String.valueOf(text) + line + " "; b++; }
/*    */     
/* 12 */     return text.substring(0, text.length() - 1);
/*    */   }
/*    */   
/*    */   public static String getRandomString(String characters, int lenght) {
/* 16 */     char[] chars = characters.toCharArray();
/* 17 */     String output = "";
/*    */     
/* 19 */     for (int i = 0; i < lenght; i++) {
/* 20 */       output = String.valueOf(output) + chars[(int)(Math.random() * (chars.length - 1))];
/*    */     }
/*    */     
/* 23 */     return output;
/*    */   }
/*    */   
/*    */   public static String getStringScroll(String text, int speed) {
/* 27 */     text = String.valueOf(text) + " ";
/* 28 */     long scrollAmount = System.currentTimeMillis() / speed % text.length();
/* 29 */     String output = text;
/* 30 */     for (int i = 0; i < scrollAmount; i++) {
/* 31 */       char firstChar = output.charAt(0);
/* 32 */       String textEdit = output.substring(1);
/* 33 */       output = String.valueOf(textEdit) + firstChar;
/*    */     } 
/* 35 */     return output;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Stringutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */