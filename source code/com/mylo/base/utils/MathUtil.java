/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ public class MathUtil
/*    */ {
/*    */   public static double interPolate(double start, double end, double percentage) {
/*  8 */     percentage = MathHelper.clamp_double(percentage, -1.0D, 1.0D);
/*  9 */     double diff = end - start;
/* 10 */     diff *= percentage;
/* 11 */     return start + diff;
/*    */   }
/*    */   
/*    */   public static double interPolate(double start, double end, double percentage, double snap) {
/* 15 */     percentage = MathHelper.clamp_double(percentage, -1.0D, 1.0D);
/* 16 */     double diff = end - start;
/* 17 */     diff *= percentage;
/* 18 */     double output = start + diff;
/* 19 */     if (output > end - snap || output < end + snap) {
/* 20 */       output = end;
/*    */     }
/* 22 */     return output;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/MathUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */