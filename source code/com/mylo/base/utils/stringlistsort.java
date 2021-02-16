/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class stringlistsort
/*    */   implements Comparator<String>
/*    */ {
/*    */   public int compare(String s1, String s2) {
/* 13 */     return Fonts.MainFontRenderer.getStringWidth(s1) - Fonts.MainFontRenderer.getStringWidth(s2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ArrayList<String> main(ArrayList<String> moduleNameList) {
/* 20 */     ArrayList<String> list = new ArrayList<>();
/* 21 */     stringlistsort ss = new stringlistsort();
/* 22 */     for (String m : moduleNameList) {
/* 23 */       list.add(m);
/*    */     }
/* 25 */     Collections.sort(list, ss);
/* 26 */     Collections.reverse(list);
/* 27 */     return list;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/stringlistsort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */