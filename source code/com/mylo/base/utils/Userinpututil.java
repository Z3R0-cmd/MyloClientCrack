/*   */ package com.mylo.base.utils;
/*   */ 
/*   */ import net.minecraft.client.Minecraft;
/*   */ import net.minecraft.util.MovingObjectPosition;
/*   */ 
/*   */ public class Userinpututil {
/*   */   public static MovingObjectPosition getMouseOverExtended(float reach) {
/* 8 */     Minecraft mc = Minecraft.getMinecraft();
/* 9 */     return mc.thePlayer.rayTrace(reach, mc.timer.renderPartialTicks);
/*   */   }
/*   */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Userinpututil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */