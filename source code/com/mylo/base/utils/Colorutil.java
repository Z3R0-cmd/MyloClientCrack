/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import java.awt.Color;
/*    */ 
/*    */ public class Colorutil
/*    */ {
/*    */   public static int getRainbow(long offset, float speed, float brightness, float saturation) {
/*  9 */     float hue = ((float)System.nanoTime() * speed + (float)(offset * 100000000L)) / 1.0E10F % 1.0F;
/* 10 */     long color = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(hue, saturation, brightness)).intValue()), 16);
/* 11 */     Color c = new Color((int)color);
/* 12 */     return (new Color(c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, c.getAlpha() / 255.0F)).getRGB();
/*    */   }
/*    */   
/*    */   public static int getPulse(long offset, float speed, float colour) {
/* 16 */     float saturation = ((float)System.nanoTime() * speed + (float)(offset * 100000000L)) / 1.0E10F % 1.0F;
/* 17 */     saturation += 0.5F;
/* 18 */     if (saturation > 1.0F)
/* 19 */       saturation = 1.0F - saturation - 1.0F; 
/* 20 */     long color = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(colour, saturation, 1.0F)).intValue()), 16);
/* 21 */     Color c = new Color((int)color);
/* 22 */     return (new Color(c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, c.getAlpha() / 255.0F)).getRGB();
/*    */   }
/*    */   
/*    */   public static int getRainbowPulse(long offset, float speed) {
/* 26 */     float saturation = ((float)System.nanoTime() * speed + (float)(offset * 100000000L)) / 1.0E10F % 1.0F;
/* 27 */     float hue = ((float)System.nanoTime() * speed + (float)(offset * 100000000L)) / 1.0E10F % 1.0F;
/* 28 */     saturation += 0.5F;
/* 29 */     if (saturation > 1.0F)
/* 30 */       saturation = 1.0F - saturation - 1.0F; 
/* 31 */     long color = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(hue, saturation, 1.0F)).intValue()), 16);
/* 32 */     Color c = new Color((int)color);
/* 33 */     return (new Color(c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, c.getAlpha() / 255.0F)).getRGB();
/*    */   }
/*    */   
/*    */   public static int getAstolfoColor(long offset, float speed) {
/* 37 */     float hue = ((float)System.nanoTime() * speed / 2.0F + (float)(offset * 100000000L)) / 1.0E10F % 2.0F;
/* 38 */     hue = (float)Math.sin(hue);
/* 39 */     hue = (float)(hue * 0.3D);
/* 40 */     long color = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(hue, 1.0F, 1.0F)).intValue()), 16);
/* 41 */     Color c = new Color((int)color);
/* 42 */     return (new Color(c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, c.getAlpha() / 255.0F)).getRGB();
/*    */   }
/*    */   
/*    */   public static int getChosenColor(int offset) {
/* 46 */     int color = getRainbow((offset * -3), 2.0F, 1.0F, 1.0F); String str;
/* 47 */     switch ((str = Main.setmgr.getSettingByName("hud color").getValString()).hashCode()) { case -2117327732: if (!str.equals("Light rainbow"))
/*    */           break; 
/* 49 */         color = getRainbow((offset * -3), 2.0F, 1.0F, 0.6F);
/*    */         break;
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
/*    */       case -941160918:
/*    */         if (!str.equals("Custom Pulse")) {
/*    */           break;
/*    */         }
/* 67 */         color = getPulse((offset * -3), 5.0F, (float)Main.setmgr.getSettingByName("Custom color").getValDouble()); break;case 2073722: if (!str.equals("Blue")) break;  color = -16711681; break;case 2487702: if (!str.equals("Pink")) break;  color = -16181; break;case 69066467: if (!str.equals("Green"))
/*    */           break;  color = -16711936; break;case 83549193: if (!str.equals("White"))
/*    */           break;  color = -1; break;case 961091784: if (!str.equals("Astolfo"))
/* 70 */           break;  color = getAstolfoColor((offset * 3), 5.0F); break;
/*    */       case 2029746065:
/*    */         if (!str.equals("Custom"))
/* 73 */           break;  color = Color.HSBtoRGB((float)Main.setmgr.getSettingByName("Custom color").getValDouble(), 1.0F, 1.0F); break; }  return color;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Colorutil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */