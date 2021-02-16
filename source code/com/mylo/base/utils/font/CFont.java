/*     */ package com.mylo.base.utils.font;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import net.minecraft.client.renderer.texture.DynamicTexture;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CFont
/*     */ {
/*  17 */   private float imgSize = 512.0F;
/*  18 */   protected CharData[] charData = new CharData[256];
/*     */   protected Font font;
/*     */   protected boolean antiAlias;
/*     */   protected boolean fractionalMetrics;
/*  22 */   protected int fontHeight = -1;
/*  23 */   protected int charOffset = 0;
/*     */   
/*     */   protected DynamicTexture tex;
/*     */   
/*     */   public CFont(Font font, boolean antiAlias, boolean fractionalMetrics) {
/*  28 */     this.font = font;
/*  29 */     this.antiAlias = antiAlias;
/*  30 */     this.fractionalMetrics = fractionalMetrics;
/*  31 */     this.tex = setupTexture(font, antiAlias, fractionalMetrics, this.charData);
/*     */   }
/*     */ 
/*     */   
/*     */   protected DynamicTexture setupTexture(Font font, boolean antiAlias, boolean fractionalMetrics, CharData[] chars) {
/*  36 */     BufferedImage img = generateFontImage(font, antiAlias, fractionalMetrics, chars);
/*     */ 
/*     */     
/*     */     try {
/*  40 */       return new DynamicTexture(img);
/*     */     }
/*  42 */     catch (Exception e) {
/*     */       
/*  44 */       e.printStackTrace();
/*     */ 
/*     */       
/*  47 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected BufferedImage generateFontImage(Font font, boolean antiAlias, boolean fractionalMetrics, CharData[] chars) {
/*  52 */     int imgSize = (int)this.imgSize;
/*  53 */     BufferedImage bufferedImage = new BufferedImage(imgSize, imgSize, 2);
/*  54 */     Graphics2D g = (Graphics2D)bufferedImage.getGraphics();
/*  55 */     g.setFont(font);
/*  56 */     g.setColor(new Color(255, 255, 255, 0));
/*  57 */     g.fillRect(0, 0, imgSize, imgSize);
/*  58 */     g.setColor(Color.WHITE);
/*  59 */     g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, fractionalMetrics ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
/*  60 */     g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, antiAlias ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
/*  61 */     g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, antiAlias ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
/*  62 */     FontMetrics fontMetrics = g.getFontMetrics();
/*  63 */     int charHeight = 0;
/*  64 */     int positionX = 0;
/*  65 */     int positionY = 1;
/*     */     
/*  67 */     for (int i = 0; i < chars.length; i++) {
/*     */       
/*  69 */       char ch = (char)i;
/*  70 */       CharData charData = new CharData();
/*  71 */       Rectangle2D dimensions = fontMetrics.getStringBounds(String.valueOf(ch), g);
/*  72 */       charData.width = (dimensions.getBounds()).width + 8;
/*  73 */       charData.height = (dimensions.getBounds()).height;
/*     */       
/*  75 */       if (positionX + charData.width >= imgSize) {
/*     */         
/*  77 */         positionX = 0;
/*  78 */         positionY += charHeight;
/*  79 */         charHeight = 0;
/*     */       } 
/*     */       
/*  82 */       if (charData.height > charHeight)
/*     */       {
/*  84 */         charHeight = charData.height;
/*     */       }
/*     */       
/*  87 */       charData.storedX = positionX;
/*  88 */       charData.storedY = positionY;
/*     */       
/*  90 */       if (charData.height > this.fontHeight)
/*     */       {
/*  92 */         this.fontHeight = charData.height;
/*     */       }
/*     */       
/*  95 */       chars[i] = charData;
/*  96 */       g.drawString(String.valueOf(ch), positionX + 2, positionY + fontMetrics.getAscent());
/*  97 */       positionX += charData.width;
/*     */     } 
/*     */     
/* 100 */     return bufferedImage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawChar(CharData[] chars, char c, float x, float y) throws ArrayIndexOutOfBoundsException {
/*     */     try {
/* 107 */       drawQuad(x, y, (chars[c]).width, (chars[c]).height, (chars[c]).storedX, (chars[c]).storedY, (chars[c]).width, (chars[c]).height);
/*     */     }
/* 109 */     catch (Exception e) {
/*     */       
/* 111 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void drawQuad(float x, float y, float width, float height, float srcX, float srcY, float srcWidth, float srcHeight) {
/* 117 */     float renderSRCX = srcX / this.imgSize;
/* 118 */     float renderSRCY = srcY / this.imgSize;
/* 119 */     float renderSRCWidth = srcWidth / this.imgSize;
/* 120 */     float renderSRCHeight = srcHeight / this.imgSize;
/* 121 */     GL11.glTexCoord2f(renderSRCX + renderSRCWidth, renderSRCY);
/* 122 */     GL11.glVertex2d((x + width), y);
/* 123 */     GL11.glTexCoord2f(renderSRCX, renderSRCY);
/* 124 */     GL11.glVertex2d(x, y);
/* 125 */     GL11.glTexCoord2f(renderSRCX, renderSRCY + renderSRCHeight);
/* 126 */     GL11.glVertex2d(x, (y + height));
/* 127 */     GL11.glTexCoord2f(renderSRCX, renderSRCY + renderSRCHeight);
/* 128 */     GL11.glVertex2d(x, (y + height));
/* 129 */     GL11.glTexCoord2f(renderSRCX + renderSRCWidth, renderSRCY + renderSRCHeight);
/* 130 */     GL11.glVertex2d((x + width), (y + height));
/* 131 */     GL11.glTexCoord2f(renderSRCX + renderSRCWidth, renderSRCY);
/* 132 */     GL11.glVertex2d((x + width), y);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getStringHeight(String text) {
/* 137 */     return getHeight();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getHeight() {
/* 142 */     return (this.fontHeight - 8) / 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getStringWidth(String text) {
/* 147 */     int width = 0; byte b; int i;
/*     */     char[] arrayOfChar;
/* 149 */     for (i = (arrayOfChar = text.toCharArray()).length, b = 0; b < i; ) { char c = arrayOfChar[b];
/*     */       
/* 151 */       if (c < this.charData.length && c >= '\000')
/*     */       {
/* 153 */         width += (this.charData[c]).width - 8 + this.charOffset;
/*     */       }
/*     */       b++; }
/*     */     
/* 157 */     return width / 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isAntiAlias() {
/* 162 */     return this.antiAlias;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAntiAlias(boolean antiAlias) {
/* 167 */     if (this.antiAlias != antiAlias) {
/*     */       
/* 169 */       this.antiAlias = antiAlias;
/* 170 */       this.tex = setupTexture(this.font, antiAlias, this.fractionalMetrics, this.charData);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFractionalMetrics() {
/* 176 */     return this.fractionalMetrics;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFractionalMetrics(boolean fractionalMetrics) {
/* 181 */     if (this.fractionalMetrics != fractionalMetrics) {
/*     */       
/* 183 */       this.fractionalMetrics = fractionalMetrics;
/* 184 */       this.tex = setupTexture(this.font, this.antiAlias, fractionalMetrics, this.charData);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Font getFont() {
/* 190 */     return this.font;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFont(Font font) {
/* 195 */     this.font = font;
/* 196 */     this.tex = setupTexture(font, this.antiAlias, this.fractionalMetrics, this.charData);
/*     */   }
/*     */   
/*     */   protected class CharData {
/*     */     public int width;
/*     */     public int height;
/*     */     public int storedX;
/*     */     public int storedY;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/font/CFont.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */