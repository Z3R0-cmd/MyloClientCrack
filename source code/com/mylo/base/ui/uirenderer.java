/*     */ package com.mylo.base.ui;
/*     */ 
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Colorutil;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.Stringutils;
/*     */ import com.mylo.base.utils.font.FontRenderer;
/*     */ import java.awt.Color;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.GuiIngame;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.resources.I18n;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class uirenderer
/*     */ {
/*     */   public static void render() {
/*  41 */     FontRenderer fr = Fonts.MainFontRenderer;
/*  42 */     FontRenderer frBig = Fonts.MainFontRendererBig;
/*     */     
/*  44 */     final Minecraft mc = Minecraft.getMinecraft();
/*  45 */     ScaledResolution sr = new ScaledResolution(mc);
/*     */     
/*  47 */     int offset = 0;
/*     */     
/*  49 */     if (Main.ClientName.startsWith("image")) {
/*  50 */       ResourceLocation rl = new ResourceLocation("nigger/images/" + Main.ClientName.substring("image".length()) + ".png");
/*  51 */       if (rl != null) {
/*  52 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  53 */         mc.getTextureManager().bindTexture(rl);
/*  54 */         GlStateManager.enableBlend();
/*  55 */         GuiIngame.drawScaledCustomSizeModalRect(0, 2, 0.0F, 0.0F, 100, 100, 100, 100, 100.0F, 100.0F);
/*  56 */         GlStateManager.disableBlend();
/*  57 */         offset = 105;
/*     */       } 
/*     */     } else {
/*     */       
/*  61 */       int color = Colorutil.getChosenColor(0);
/*  62 */       String clientname = Stringutils.getStringScroll(Main.ClientName, 500);
/*  63 */       frBig.drawStringWithShadow(String.valueOf(clientname.charAt(0)), 1.0D, 2.0D, color);
/*  64 */       frBig.drawStringWithShadow(clientname.substring(1), (1 + frBig.getStringWidth(String.valueOf(clientname.charAt(0)))), 2.0D, 16777215);
/*  65 */       offset = frBig.getHeight() + 5;
/*     */     } 
/*     */     
/*  68 */     GlStateManager.pushMatrix();
/*  69 */     GL11.glTranslatef(2.0F, (offset - 3), 0.0F);
/*  70 */     GL11.glScalef(0.8F, 0.8F, 1.0F);
/*  71 */     Fonts.MainFontRenderer.drawStringWithShadow(Stringutils.getStringScroll("Mylo client V2.5", 100), 0.0D, 0.0D, 16777215);
/*  72 */     GlStateManager.popMatrix();
/*     */     
/*  74 */     offset += 5;
/*  75 */     boolean upsidedown = Main.setmgr.getSettingByName("start arraylist from bottom").getValBoolean();
/*     */     
/*  77 */     int i2 = 0;
/*     */     
/*  79 */     ArrayList<PotionEffect> effects = new ArrayList<>();
/*  80 */     mc.thePlayer.getActivePotionEffects().forEach(potion -> effects.add(potion));
/*  81 */     Comparator<PotionEffect> comp = new Comparator<PotionEffect>()
/*     */       {
/*     */         public int compare(PotionEffect o1, PotionEffect o2) {
/*  84 */           Potion potion1 = Potion.potionTypes[o1.getPotionID()];
/*  85 */           String text1 = I18n.format(potion1.getName(), new Object[0]) + " " + (o1.getAmplifier() + 1) + " - " + Potion.getDurationString(o1);
/*  86 */           Potion potion2 = Potion.potionTypes[o2.getPotionID()];
/*  87 */           String text2 = I18n.format(potion2.getName(), new Object[0]) + " " + (o2.getAmplifier() + 1) + " - " + Potion.getDurationString(o2);
/*  88 */           return (mc.fontRendererObj.getStringWidth(text1) > mc.fontRendererObj.getStringWidth(text2)) ? -1 : 1;
/*     */         }
/*     */       };
/*     */     
/*  92 */     Collections.sort(effects, comp);
/*     */     
/*  94 */     for (PotionEffect effect : effects) {
/*  95 */       if (upsidedown) {
/*  96 */         Potion potion = Potion.potionTypes[effect.getPotionID()];
/*  97 */         String text = I18n.format(potion.getName(), new Object[0]) + " " + (effect.getAmplifier() + 1) + " - " + Potion.getDurationString(effect);
/*  98 */         double width = mc.fontRendererObj.getStringWidth(text);
/*  99 */         mc.fontRendererObj.drawStringWithShadow(text, (float)(sr.getScaledWidth() - width - 2.0D), (i2 * 10 + 2), Colorutil.getChosenColor(i2 * 2));
/*     */       } else {
/*     */         
/* 102 */         Potion potion = Potion.potionTypes[effect.getPotionID()];
/* 103 */         String text = I18n.format(potion.getName(), new Object[0]) + " " + (effect.getAmplifier() + 1) + " - " + Potion.getDurationString(effect);
/* 104 */         double width = mc.fontRendererObj.getStringWidth(text);
/* 105 */         mc.fontRendererObj.drawStringWithShadow(text, (float)(sr.getScaledWidth() - width - 2.0D), (sr.getScaledHeight() - 10 - i2 * 10), Colorutil.getChosenColor(i2 * 2));
/*     */       } 
/* 107 */       i2++;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     switch (Main.setmgr.getSettingByName("special component").getValString()) {
/*     */       case "tabgui":
/* 116 */         Main.tabgui.render(offset);
/*     */         break;
/*     */       case "info":
/*     */         try {
/* 120 */           int j = 0;
/* 121 */           ArrayList<String> infotexts = new ArrayList<>();
/* 122 */           infotexts.add("Fps: " + Minecraft.getDebugFPS());
/* 123 */           if (!mc.isSingleplayer()) {
/* 124 */             infotexts.add("Ping: " + mc.getNetHandler().getPlayerInfo(mc.thePlayer.getUniqueID()).getResponseTime());
/*     */           }
/* 126 */           infotexts.add("X: " + ((int)(mc.thePlayer.posX * 10.0D) / 10.0D));
/* 127 */           infotexts.add("Y: " + ((int)(mc.thePlayer.posY * 10.0D) / 10.0D));
/* 128 */           infotexts.add("Z: " + ((int)(mc.thePlayer.posZ * 10.0D) / 10.0D));
/* 129 */           infotexts.add((Math.round(Renderutils.getDistance2d(mc.thePlayer.posX, mc.thePlayer.posZ, mc.thePlayer.lastTickPosX, mc.thePlayer.lastTickPosZ) * mc.timer.timerSpeed * 200.0D) / 10.0D) + " m/s");
/* 130 */           infotexts.add("Name: " + mc.thePlayer.getName());
/* 131 */           infotexts.add("Health: " + (int)mc.thePlayer.getHealth() + "/" + (int)mc.thePlayer.getMaxHealth());
/* 132 */           infotexts.add("Direction: " + mc.thePlayer.getHorizontalFacing());
/* 133 */           if (!mc.isSingleplayer()) {
/* 134 */             infotexts.add("Server: " + (mc.getCurrentServerData()).serverIP);
/*     */           }
/*     */           
/* 137 */           int longestStringLenght = 0;
/*     */           
/* 139 */           for (String s : infotexts) {
/* 140 */             int lenght = fr.getStringWidth(s);
/* 141 */             if (lenght > longestStringLenght) {
/* 142 */               longestStringLenght = lenght;
/*     */             }
/*     */           } 
/*     */           
/* 146 */           int width = longestStringLenght + 5;
/* 147 */           int height = 4 + (fr.getHeight() + 2) * infotexts.size();
/* 148 */           int xoffset = 2;
/* 149 */           int linewidth = 1;
/* 150 */           int insidecolor = 1996488704;
/* 151 */           int outsidecolor = 0;
/* 152 */           int textcolor = 15528177;
/*     */           
/* 154 */           Renderutils.drawOutlinedBox(xoffset, offset, xoffset + width, offset + height, linewidth, insidecolor, outsidecolor);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 164 */           for (String info : infotexts) {
/* 165 */             fr.drawString(info, (xoffset + linewidth + 2), (offset + linewidth + 2 + j * (fr.getHeight() + 2)), textcolor);
/* 166 */             j++;
/*     */           }
/*     */         
/* 169 */         } catch (Exception exception) {}
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     int i = 0;
/* 178 */     if (upsidedown) {
/* 179 */       for (String s : Main.modmgr.getSortedModules()) {
/*     */         
/* 181 */         String name = s;
/* 182 */         if (s.contains(" - ")) {
/* 183 */           name = s.split(" - ")[0];
/*     */         }
/* 185 */         Module m = Main.modmgr.getModuleByName(name);
/*     */         
/* 187 */         m.targetY = (sr.getScaledHeight() - i * 12);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 202 */         i++;
/*     */       } 
/*     */     } else {
/*     */       
/* 206 */       for (String s : Main.modmgr.getSortedModules()) {
/*     */         
/* 208 */         String name = s;
/* 209 */         if (s.contains(" - ")) {
/* 210 */           name = s.split(" - ")[0];
/*     */         }
/* 212 */         Module m = Main.modmgr.getModuleByName(name);
/*     */         
/* 214 */         m.targetY = (i * 12);
/* 215 */         i++;
/*     */       } 
/*     */     } 
/* 218 */     for (Module m : Main.modmgr.getModules()) {
/* 219 */       if (!m.getState()) {
/* 220 */         m.targetY = Main.setmgr.getSettingByName("start arraylist from bottom").getValBoolean() ? ((new ScaledResolution(mc)).getScaledHeight() + 15) : -15.0D;
/*     */       }
/* 222 */       m.updatePos();
/* 223 */       if (upsidedown) {
/*     */         
/* 225 */         String str = m.getRenderName();
/* 226 */         Color color1 = new Color(0.0F, 0.0F, 0.0F, (float)Main.setmgr.getSettingByName("Background transparency").getValDouble());
/* 227 */         GuiIngame.drawRect(sr.getScaledWidth() - fr.getStringWidth(str) - 8, (int)m.y, sr.getScaledWidth(), (int)m.y - 12, color1.getRGB());
/* 228 */         int j = Colorutil.getChosenColor((int)m.y / 10);
/* 229 */         GuiIngame.drawRect((int)((sr.getScaledWidth() - fr.getStringWidth(str) - 8) - Main.setmgr.getSettingByName("blocks").getValDouble()), (int)m.y, sr.getScaledWidth() - fr.getStringWidth(str) - 8, (int)m.y - 12, j);
/* 230 */         if (str.contains(" - ")) {
/*     */           
/* 232 */           String[] split = str.split(" - ");
/* 233 */           fr.drawStringWithShadow(split[0], (sr.getScaledWidth() - fr.getStringWidth(split[0]) - 5 - fr.getStringWidth(" - " + split[1])), ((int)m.y - 3 - fr.getHeight()), j);
/* 234 */           fr.drawStringWithShadow(" - " + split[1], (sr.getScaledWidth() - fr.getStringWidth(" - " + split[1]) - 5), ((int)m.y - 3 - fr.getHeight()), 12369083);
/*     */           continue;
/*     */         } 
/* 237 */         fr.drawStringWithShadow(str, (sr.getScaledWidth() - fr.getStringWidth(str) - 5), ((int)m.y - 3 - fr.getHeight()), j);
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/* 242 */       String s = m.getRenderName();
/* 243 */       Color backColor = new Color(0.0F, 0.0F, 0.0F, (float)Main.setmgr.getSettingByName("Background transparency").getValDouble());
/* 244 */       GuiIngame.drawRect(sr.getScaledWidth() - fr.getStringWidth(s) - 8, (int)m.y, sr.getScaledWidth(), (int)m.y + 12, backColor.getRGB());
/* 245 */       int color = Colorutil.getChosenColor((int)m.y / 10);
/* 246 */       GuiIngame.drawRect((int)((sr.getScaledWidth() - fr.getStringWidth(s) - 8) - Main.setmgr.getSettingByName("blocks").getValDouble()), (int)m.y, sr.getScaledWidth() - fr.getStringWidth(s) - 8, (int)m.y + 12, color);
/* 247 */       if (s.contains(" - ")) {
/*     */         
/* 249 */         String[] split = s.split(" - ");
/* 250 */         fr.drawStringWithShadow(split[0], (sr.getScaledWidth() - fr.getStringWidth(split[0]) - 5 - fr.getStringWidth(" - " + split[1])), ((int)m.y + 3), color);
/* 251 */         fr.drawStringWithShadow(" - " + split[1], (sr.getScaledWidth() - fr.getStringWidth(" - " + split[1]) - 5), ((int)m.y + 3), 12369083);
/*     */         continue;
/*     */       } 
/* 254 */       fr.drawStringWithShadow(s, (sr.getScaledWidth() - fr.getStringWidth(s) - 5), ((int)m.y + 3), color);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/uirenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */