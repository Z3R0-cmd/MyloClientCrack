/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ 
/*    */ public class DistanceSort
/*    */   implements Comparator<Entity>
/*    */ {
/*    */   public int compare(Entity e1, Entity e2) {
/* 14 */     Minecraft mc = Minecraft.getMinecraft();
/* 15 */     return (int)((mc.thePlayer.getDistanceToEntity(e1) - mc.thePlayer.getDistanceToEntity(e2)) * 100.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ArrayList<Entity> main(ArrayList<Entity> moduleNameList) {
/* 22 */     ArrayList<Entity> list = new ArrayList<>();
/* 23 */     DistanceSort ds = new DistanceSort();
/* 24 */     for (Entity m : moduleNameList) {
/* 25 */       list.add(m);
/*    */     }
/* 27 */     Collections.sort(list, ds);
/* 28 */     return list;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/DistanceSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */