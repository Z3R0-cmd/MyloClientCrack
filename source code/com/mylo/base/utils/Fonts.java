/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import java.awt.Font;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Fonts
/*    */ {
/*    */   public static FontRenderer MainFontRenderer;
/*    */   public static FontRenderer MainFontRendererBig;
/*    */   public static FontRenderer DiscordFontRenderer;
/*    */   public static FontRenderer DiscordTextRenderer;
/* 15 */   public static String MainFont = "Verdana";
/*    */   
/* 17 */   private static Minecraft mc = Minecraft.getMinecraft();
/*    */   public static void setup() {
/* 19 */     MainFontRenderer = new FontRenderer(new Font(MainFont, 0, 15), true, true);
/* 20 */     MainFontRendererBig = new FontRenderer(new Font(MainFont, 0, 25), true, true);
/* 21 */     DiscordFontRenderer = new FontRenderer(new Font("uni sans heavy", 1, 13), true, true);
/* 22 */     DiscordTextRenderer = new FontRenderer(new Font("whitney", 0, 15), true, true);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Fonts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */