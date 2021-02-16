/*     */ package com.mylo.base.utils.font;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventManager;
/*     */ import com.darkmagician6.eventapi.events.Event;
/*     */ import com.mylo.base.events.EventRenderText;
/*     */ import java.awt.Font;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.renderer.texture.DynamicTexture;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ public class FontRenderer
/*     */   extends CFont
/*     */ {
/*  17 */   protected CFont.CharData[] boldChars = new CFont.CharData[256];
/*  18 */   protected CFont.CharData[] italicChars = new CFont.CharData[256];
/*  19 */   protected CFont.CharData[] boldItalicChars = new CFont.CharData[256];
/*     */   
/*  21 */   private final int[] colorCode = new int[32];
/*  22 */   private final String colorcodeIdentifiers = "0123456789abcdefklmnor";
/*     */   protected DynamicTexture texBold;
/*     */   
/*     */   public FontRenderer(Font font, boolean antiAlias, boolean fractionalMetrics) {
/*  26 */     super(font, antiAlias, fractionalMetrics);
/*  27 */     setFont(font);
/*  28 */     setupMinecraftColorcodes();
/*  29 */     setupBoldItalicIDs();
/*     */   }
/*     */   protected DynamicTexture texItalic; protected DynamicTexture texItalicBold;
/*     */   
/*     */   public float drawStringWithShadow(String text, double x, double y, int color) {
/*  34 */     float shadowWidth = drawString(text, x + 1.0D, y + 1.0D, color, true);
/*  35 */     return Math.max(shadowWidth, drawString(text, x, y, color, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public float drawString(String text, float x, float y, int color) {
/*  40 */     return drawString(text, x, y, color, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public float drawCenteredString(String text, float x, float y, int color) {
/*  45 */     return drawString(text, x - (getStringWidth(text) / 2), y, color);
/*     */   }
/*     */ 
/*     */   
/*     */   public float drawCenteredStringWithShadow(String text, float x, float y, int color) {
/*  50 */     float shadowWidth = drawString(text, (x - (getStringWidth(text) / 2)) + 1.0D, y + 1.0D, color, true);
/*  51 */     return drawString(text, x - (getStringWidth(text) / 2), y, color);
/*     */   }
/*     */ 
/*     */   
/*     */   public float drawString(String text, double x, double y, int color, boolean shadow) {
/*  56 */     EventRenderText ev = new EventRenderText(text);
/*  57 */     EventManager.call((Event)ev);
/*  58 */     text = ev.getText();
/*     */     
/*  60 */     x--;
/*     */     
/*  62 */     if (text == null)
/*     */     {
/*  64 */       return 0.0F;
/*     */     }
/*     */     
/*  67 */     if (color == 553648127)
/*     */     {
/*  69 */       color = 16777215;
/*     */     }
/*     */     
/*  72 */     if ((color & 0xFC000000) == 0)
/*     */     {
/*  74 */       color |= 0xFF000000;
/*     */     }
/*     */     
/*  77 */     if (shadow)
/*     */     {
/*  79 */       color = (color & 0xFCFCFC) >> 2 | color & 0xFF000000;
/*     */     }
/*     */     
/*  82 */     CFont.CharData[] currentData = this.charData;
/*  83 */     float alpha = (color >> 24 & 0xFF) / 255.0F;
/*  84 */     boolean randomCase = false;
/*  85 */     boolean bold = false;
/*  86 */     boolean italic = false;
/*  87 */     boolean strikethrough = false;
/*  88 */     boolean underline = false;
/*  89 */     boolean render = true;
/*  90 */     x *= 2.0D;
/*  91 */     y = (y - 3.0D) * 2.0D;
/*     */     
/*  93 */     if (render) {
/*     */       
/*  95 */       GL11.glPushMatrix();
/*  96 */       GlStateManager.scale(0.5D, 0.5D, 0.5D);
/*  97 */       GlStateManager.enableBlend();
/*  98 */       GlStateManager.blendFunc(770, 771);
/*  99 */       GlStateManager.color((color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F, alpha);
/* 100 */       int size = text.length();
/* 101 */       GlStateManager.enableTexture2D();
/* 102 */       GlStateManager.bindTexture(this.tex.getGlTextureId());
/*     */       
/* 104 */       GL11.glBindTexture(3553, this.tex.getGlTextureId());
/*     */       
/* 106 */       for (int i = 0; i < size; i++) {
/*     */         
/* 108 */         char character = text.charAt(i);
/*     */ 
/*     */         
/* 111 */         if (character == '§' && i < size) {
/*     */           
/* 113 */           int colorIndex = 21;
/*     */ 
/*     */           
/*     */           try {
/* 117 */             colorIndex = "0123456789abcdefklmnor".indexOf(text.charAt(i + 1));
/*     */           }
/* 119 */           catch (Exception e) {
/*     */             
/* 121 */             e.printStackTrace();
/*     */           } 
/*     */           
/* 124 */           if (colorIndex < 16) {
/*     */             
/* 126 */             bold = false;
/* 127 */             italic = false;
/* 128 */             randomCase = false;
/* 129 */             underline = false;
/* 130 */             strikethrough = false;
/* 131 */             GlStateManager.bindTexture(this.tex.getGlTextureId());
/*     */ 
/*     */             
/* 134 */             currentData = this.charData;
/*     */             
/* 136 */             if (colorIndex < 0 || colorIndex > 15)
/*     */             {
/* 138 */               colorIndex = 15;
/*     */             }
/*     */             
/* 141 */             if (shadow)
/*     */             {
/* 143 */               colorIndex += 16;
/*     */             }
/*     */             
/* 146 */             int colorcode = this.colorCode[colorIndex];
/* 147 */             GlStateManager.color((colorcode >> 16 & 0xFF) / 255.0F, (colorcode >> 8 & 0xFF) / 255.0F, (colorcode & 0xFF) / 255.0F, alpha);
/*     */           }
/* 149 */           else if (colorIndex == 16) {
/*     */             
/* 151 */             randomCase = true;
/*     */           }
/* 153 */           else if (colorIndex == 17) {
/*     */             
/* 155 */             bold = true;
/*     */             
/* 157 */             if (italic)
/*     */             {
/* 159 */               GlStateManager.bindTexture(this.texItalicBold.getGlTextureId());
/*     */ 
/*     */               
/* 162 */               currentData = this.boldItalicChars;
/*     */             }
/*     */             else
/*     */             {
/* 166 */               GlStateManager.bindTexture(this.texBold.getGlTextureId());
/*     */ 
/*     */               
/* 169 */               currentData = this.boldChars;
/*     */             }
/*     */           
/* 172 */           } else if (colorIndex == 18) {
/*     */             
/* 174 */             strikethrough = true;
/*     */           }
/* 176 */           else if (colorIndex == 19) {
/*     */             
/* 178 */             underline = true;
/*     */           }
/* 180 */           else if (colorIndex == 20) {
/*     */             
/* 182 */             italic = true;
/*     */             
/* 184 */             if (bold)
/*     */             {
/* 186 */               GlStateManager.bindTexture(this.texItalicBold.getGlTextureId());
/*     */ 
/*     */               
/* 189 */               currentData = this.boldItalicChars;
/*     */             }
/*     */             else
/*     */             {
/* 193 */               GlStateManager.bindTexture(this.texItalic.getGlTextureId());
/*     */ 
/*     */               
/* 196 */               currentData = this.italicChars;
/*     */             }
/*     */           
/* 199 */           } else if (colorIndex == 21) {
/*     */             
/* 201 */             bold = false;
/* 202 */             italic = false;
/* 203 */             randomCase = false;
/* 204 */             underline = false;
/* 205 */             strikethrough = false;
/* 206 */             GlStateManager.color((color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F, alpha);
/* 207 */             GlStateManager.bindTexture(this.tex.getGlTextureId());
/*     */ 
/*     */             
/* 210 */             currentData = this.charData;
/*     */           } 
/*     */           
/* 213 */           i++;
/*     */         }
/* 215 */         else if (character < currentData.length && character >= '\000') {
/*     */           
/* 217 */           GL11.glBegin(4);
/* 218 */           drawChar(currentData, character, (float)x, (float)y);
/* 219 */           GL11.glEnd();
/*     */           
/* 221 */           if (strikethrough)
/*     */           {
/* 223 */             drawLine(x, y + ((currentData[character]).height / 2), x + (currentData[character]).width - 8.0D, y + ((currentData[character]).height / 2), 1.0F);
/*     */           }
/*     */           
/* 226 */           if (underline)
/*     */           {
/* 228 */             drawLine(x, y + (currentData[character]).height - 2.0D, x + (currentData[character]).width - 8.0D, y + (currentData[character]).height - 2.0D, 1.0F);
/*     */           }
/*     */           
/* 231 */           x += ((currentData[character]).width - 8 + this.charOffset);
/*     */         } 
/*     */       } 
/*     */       
/* 235 */       GL11.glHint(3155, 4352);
/* 236 */       GL11.glPopMatrix();
/*     */     } 
/*     */     
/* 239 */     return (float)x / 2.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStringWidth(String text) {
/* 245 */     EventRenderText ev = new EventRenderText(text);
/* 246 */     EventManager.call((Event)ev);
/* 247 */     text = ev.getText();
/*     */     
/* 249 */     if (text == null)
/*     */     {
/* 251 */       return 0;
/*     */     }
/*     */     
/* 254 */     int width = 0;
/* 255 */     CFont.CharData[] currentData = this.charData;
/* 256 */     boolean bold = false;
/* 257 */     boolean italic = false;
/* 258 */     int size = text.length();
/*     */     
/* 260 */     for (int i = 0; i < size; i++) {
/*     */       
/* 262 */       char character = text.charAt(i);
/*     */       
/* 264 */       if (character == '§' && i < size) {
/*     */         
/* 266 */         int colorIndex = "0123456789abcdefklmnor".indexOf(character);
/*     */         
/* 268 */         if (colorIndex < 16) {
/*     */           
/* 270 */           bold = false;
/* 271 */           italic = false;
/*     */         }
/* 273 */         else if (colorIndex == 17) {
/*     */           
/* 275 */           bold = true;
/*     */           
/* 277 */           if (italic)
/*     */           {
/* 279 */             currentData = this.boldItalicChars;
/*     */           }
/*     */           else
/*     */           {
/* 283 */             currentData = this.boldChars;
/*     */           }
/*     */         
/* 286 */         } else if (colorIndex == 20) {
/*     */           
/* 288 */           italic = true;
/*     */           
/* 290 */           if (bold)
/*     */           {
/* 292 */             currentData = this.boldItalicChars;
/*     */           }
/*     */           else
/*     */           {
/* 296 */             currentData = this.italicChars;
/*     */           }
/*     */         
/* 299 */         } else if (colorIndex == 21) {
/*     */           
/* 301 */           bold = false;
/* 302 */           italic = false;
/* 303 */           currentData = this.charData;
/*     */         } 
/*     */         
/* 306 */         i++;
/*     */       }
/* 308 */       else if (character < currentData.length && character >= '\000') {
/*     */         
/* 310 */         width += (currentData[character]).width - 8 + this.charOffset;
/*     */       } 
/*     */     } 
/*     */     
/* 314 */     return width / 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFont(Font font) {
/* 319 */     super.setFont(font);
/* 320 */     setupBoldItalicIDs();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAntiAlias(boolean antiAlias) {
/* 325 */     super.setAntiAlias(antiAlias);
/* 326 */     setupBoldItalicIDs();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFractionalMetrics(boolean fractionalMetrics) {
/* 331 */     super.setFractionalMetrics(fractionalMetrics);
/* 332 */     setupBoldItalicIDs();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setupBoldItalicIDs() {
/* 341 */     this.texBold = setupTexture(this.font.deriveFont(1), this.antiAlias, this.fractionalMetrics, this.boldChars);
/* 342 */     this.texItalic = setupTexture(this.font.deriveFont(2), this.antiAlias, this.fractionalMetrics, this.italicChars);
/* 343 */     this.texItalicBold = setupTexture(this.font.deriveFont(3), this.antiAlias, this.fractionalMetrics, this.boldItalicChars);
/*     */   }
/*     */ 
/*     */   
/*     */   private void drawLine(double x, double y, double x1, double y1, float width) {
/* 348 */     GL11.glDisable(3553);
/* 349 */     GL11.glLineWidth(width);
/* 350 */     GL11.glBegin(1);
/* 351 */     GL11.glVertex2d(x, y);
/* 352 */     GL11.glVertex2d(x1, y1);
/* 353 */     GL11.glEnd();
/* 354 */     GL11.glEnable(3553);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<String> wrapWords(String text, double width) {
/* 359 */     EventRenderText ev = new EventRenderText(text);
/* 360 */     EventManager.call((Event)ev);
/* 361 */     text = ev.getText();
/*     */     
/* 363 */     List<String> finalWords = new ArrayList();
/*     */     
/* 365 */     if (getStringWidth(text) > width) {
/*     */       
/* 367 */       String[] words = text.split(" ");
/* 368 */       String currentWord = "";
/* 369 */       char lastColorCode = Character.MAX_VALUE; byte b; int i;
/*     */       String[] arrayOfString1;
/* 371 */       for (i = (arrayOfString1 = words).length, b = 0; b < i; ) { String word = arrayOfString1[b];
/*     */         
/* 373 */         for (int j = 0; j < (word.toCharArray()).length; j++) {
/*     */           
/* 375 */           char c = word.toCharArray()[j];
/*     */           
/* 377 */           if (c == '§' && j < (word.toCharArray()).length - 1)
/*     */           {
/* 379 */             lastColorCode = word.toCharArray()[j + 1];
/*     */           }
/*     */         } 
/*     */         
/* 383 */         if (getStringWidth(String.valueOf(currentWord) + word + " ") < width) {
/*     */           
/* 385 */           currentWord = String.valueOf(currentWord) + word + " ";
/*     */         }
/*     */         else {
/*     */           
/* 389 */           finalWords.add(currentWord);
/* 390 */           currentWord = "§" + lastColorCode + word + " ";
/*     */         } 
/*     */         b++; }
/*     */       
/* 394 */       if (currentWord.length() > 0) if (getStringWidth(currentWord) < width) {
/*     */           
/* 396 */           finalWords.add("§" + lastColorCode + currentWord + " ");
/* 397 */           currentWord = "";
/*     */         }
/*     */         else {
/*     */           
/* 401 */           for (String s : formatString(currentWord, width))
/*     */           {
/* 403 */             finalWords.add(s);
/*     */           }
/*     */         } 
/*     */     
/*     */     } else {
/*     */       
/* 409 */       finalWords.add(text);
/*     */     } 
/*     */     
/* 412 */     return finalWords;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<String> formatString(String string, double width) {
/* 417 */     EventRenderText ev = new EventRenderText(string);
/* 418 */     EventManager.call((Event)ev);
/* 419 */     string = ev.getText();
/*     */     
/* 421 */     List<String> finalWords = new ArrayList();
/* 422 */     String currentWord = "";
/* 423 */     char lastColorCode = Character.MAX_VALUE;
/* 424 */     char[] chars = string.toCharArray();
/*     */     
/* 426 */     for (int i = 0; i < chars.length; i++) {
/*     */       
/* 428 */       char c = chars[i];
/*     */       
/* 430 */       if (c == '§' && i < chars.length - 1)
/*     */       {
/* 432 */         lastColorCode = chars[i + 1];
/*     */       }
/*     */       
/* 435 */       if (getStringWidth(String.valueOf(currentWord) + c) < width) {
/*     */         
/* 437 */         currentWord = String.valueOf(currentWord) + c;
/*     */       }
/*     */       else {
/*     */         
/* 441 */         finalWords.add(currentWord);
/* 442 */         currentWord = "§" + lastColorCode + String.valueOf(c);
/*     */       } 
/*     */     } 
/*     */     
/* 446 */     if (currentWord.length() > 0)
/*     */     {
/* 448 */       finalWords.add(currentWord);
/*     */     }
/*     */     
/* 451 */     return finalWords;
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupMinecraftColorcodes() {
/* 456 */     for (int index = 0; index < 32; index++) {
/*     */       
/* 458 */       int noClue = (index >> 3 & 0x1) * 85;
/* 459 */       int red = (index >> 2 & 0x1) * 170 + noClue;
/* 460 */       int green = (index >> 1 & 0x1) * 170 + noClue;
/* 461 */       int blue = (index >> 0 & 0x1) * 170 + noClue;
/*     */       
/* 463 */       if (index == 6)
/*     */       {
/* 465 */         red += 85;
/*     */       }
/*     */       
/* 468 */       if (index >= 16) {
/*     */         
/* 470 */         red /= 4;
/* 471 */         green /= 4;
/* 472 */         blue /= 4;
/*     */       } 
/*     */       
/* 475 */       this.colorCode[index] = (red & 0xFF) << 16 | (green & 0xFF) << 8 | blue & 0xFF;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/font/FontRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */