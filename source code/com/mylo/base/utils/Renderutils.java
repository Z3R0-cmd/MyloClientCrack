/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.renderer.OpenGlHelper;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Renderutils
/*     */ {
/*     */   public static void blurStart() {
/*  18 */     Minecraft mc = Minecraft.getMinecraft();
/*  19 */     if (OpenGlHelper.shadersSupported && !mc.gameSettings.ofFastRender) {
/*  20 */       if (mc.entityRenderer.theShaderGroup != null) {
/*  21 */         mc.entityRenderer.theShaderGroup.deleteShaderGroup();
/*     */       }
/*  23 */       mc.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
/*     */     } 
/*     */   }
/*     */   public static void blurStop() {
/*  27 */     Minecraft mc = Minecraft.getMinecraft();
/*  28 */     if (mc.entityRenderer.theShaderGroup != null) {
/*  29 */       mc.entityRenderer.theShaderGroup.deleteShaderGroup();
/*  30 */       mc.entityRenderer.theShaderGroup = null;
/*     */     } 
/*     */   }
/*     */   public static void drawOutlinedBox3d(AxisAlignedBB bb) {
/*  34 */     Minecraft mc = Minecraft.getMinecraft();
/*  35 */     bb = bb.offset(-(mc.getRenderManager()).renderPosX, -(mc.getRenderManager()).renderPosY, -(mc.getRenderManager()).renderPosZ);
/*  36 */     GL11.glPushMatrix();
/*  37 */     GL11.glEnable(3042);
/*  38 */     GL11.glBlendFunc(770, 771);
/*  39 */     GL11.glEnable(2848);
/*  40 */     GL11.glLineWidth(2.0F);
/*  41 */     GL11.glDisable(3553);
/*  42 */     GL11.glEnable(2884);
/*  43 */     GL11.glDisable(2929);
/*  44 */     GL11.glBegin(1);
/*  45 */     GL11.glVertex3d(bb.minX, bb.minY, bb.minZ);
/*  46 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.minZ);
/*  47 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.minZ);
/*  48 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.maxZ);
/*  49 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.maxZ);
/*  50 */     GL11.glVertex3d(bb.minX, bb.minY, bb.maxZ);
/*  51 */     GL11.glVertex3d(bb.minX, bb.minY, bb.maxZ);
/*  52 */     GL11.glVertex3d(bb.minX, bb.minY, bb.minZ);
/*  53 */     GL11.glVertex3d(bb.minX, bb.minY, bb.minZ);
/*  54 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.minZ);
/*  55 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.minZ);
/*  56 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.minZ);
/*  57 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.maxZ);
/*  58 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.maxZ);
/*  59 */     GL11.glVertex3d(bb.minX, bb.minY, bb.maxZ);
/*  60 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.maxZ);
/*  61 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.minZ);
/*  62 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.minZ);
/*  63 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.minZ);
/*  64 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.maxZ);
/*  65 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.maxZ);
/*  66 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.maxZ);
/*  67 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.maxZ);
/*  68 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.minZ);
/*  69 */     GL11.glEnd();
/*  70 */     GL11.glEnable(2929);
/*  71 */     GL11.glEnable(3553);
/*  72 */     GL11.glDisable(3042);
/*  73 */     GL11.glDisable(2848);
/*  74 */     GlStateManager.popMatrix();
/*     */   }
/*     */   public static void drawSolidBox3d(AxisAlignedBB bb) {
/*  77 */     Minecraft mc = Minecraft.getMinecraft();
/*  78 */     bb = bb.offset(-(mc.getRenderManager()).renderPosX, -(mc.getRenderManager()).renderPosY, -(mc.getRenderManager()).renderPosZ);
/*  79 */     GL11.glPushMatrix();
/*  80 */     GL11.glEnable(3042);
/*  81 */     GL11.glBlendFunc(770, 771);
/*  82 */     GL11.glEnable(2848);
/*  83 */     GL11.glLineWidth(2.0F);
/*  84 */     GL11.glDisable(3553);
/*  85 */     GL11.glEnable(2884);
/*  86 */     GL11.glDisable(2929);
/*  87 */     GL11.glBegin(7);
/*  88 */     GL11.glVertex3d(bb.minX, bb.minY, bb.minZ);
/*  89 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.minZ);
/*  90 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.maxZ);
/*  91 */     GL11.glVertex3d(bb.minX, bb.minY, bb.maxZ);
/*  92 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.minZ);
/*  93 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.maxZ);
/*  94 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.maxZ);
/*  95 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.minZ);
/*  96 */     GL11.glVertex3d(bb.minX, bb.minY, bb.minZ);
/*  97 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.minZ);
/*  98 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.minZ);
/*  99 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.minZ);
/* 100 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.minZ);
/* 101 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.minZ);
/* 102 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.maxZ);
/* 103 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.maxZ);
/* 104 */     GL11.glVertex3d(bb.minX, bb.minY, bb.maxZ);
/* 105 */     GL11.glVertex3d(bb.maxX, bb.minY, bb.maxZ);
/* 106 */     GL11.glVertex3d(bb.maxX, bb.maxY, bb.maxZ);
/* 107 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.maxZ);
/* 108 */     GL11.glVertex3d(bb.minX, bb.minY, bb.minZ);
/* 109 */     GL11.glVertex3d(bb.minX, bb.minY, bb.maxZ);
/* 110 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.maxZ);
/* 111 */     GL11.glVertex3d(bb.minX, bb.maxY, bb.minZ);
/* 112 */     GL11.glEnd();
/* 113 */     GL11.glEnable(2929);
/* 114 */     GL11.glEnable(3553);
/* 115 */     GL11.glDisable(3042);
/* 116 */     GL11.glDisable(2848);
/* 117 */     GlStateManager.popMatrix();
/*     */   }
/*     */   public static void drawOutlinedBox(int x1, int y1, int x2, int y2, int linewidth, int color, int outlinecolor) {
/* 120 */     Gui.drawRect(x1 + linewidth, y1 + linewidth, x2 - linewidth, y2 - linewidth, color);
/*     */     
/* 122 */     Gui.drawRect(x1, y1, x1 + linewidth, y2, outlinecolor);
/* 123 */     Gui.drawRect(x2 - linewidth, y1, x2, y2, outlinecolor);
/* 124 */     Gui.drawRect(x1, y1, x2, y1 + linewidth, outlinecolor);
/* 125 */     Gui.drawRect(x1, y2 - linewidth, x2, y2, outlinecolor);
/*     */   }
/*     */   public static void enableGL2D() {
/* 128 */     GL11.glDisable(2929);
/* 129 */     GL11.glEnable(3042);
/* 130 */     GL11.glDisable(3553);
/* 131 */     GL11.glBlendFunc(770, 771);
/* 132 */     GL11.glDepthMask(true);
/* 133 */     GL11.glEnable(2848);
/* 134 */     GL11.glHint(3154, 4354);
/* 135 */     GL11.glHint(3155, 4354);
/*     */   }
/*     */   public static void disableGL2D() {
/* 138 */     GL11.glEnable(3553);
/* 139 */     GL11.glDisable(3042);
/* 140 */     GL11.glEnable(2929);
/* 141 */     GL11.glDisable(2848);
/* 142 */     GL11.glHint(3154, 4352);
/* 143 */     GL11.glHint(3155, 4352);
/*     */   }
/*     */   public static void drawCircle(float cx, float cy, float r, int num_segments, int c) {
/* 146 */     r *= 2.0F;
/* 147 */     cx *= 2.0F;
/* 148 */     cy *= 2.0F;
/* 149 */     float f = (c >> 24 & 0xFF) / 255.0F;
/* 150 */     float f2 = (c >> 16 & 0xFF) / 255.0F;
/* 151 */     float f3 = (c >> 8 & 0xFF) / 255.0F;
/* 152 */     float f4 = (c & 0xFF) / 255.0F;
/* 153 */     float theta = (float)(6.2831852D / num_segments);
/* 154 */     float p = (float)Math.cos(theta);
/* 155 */     float s = (float)Math.sin(theta);
/* 156 */     float x = r;
/* 157 */     float y = 0.0F;
/* 158 */     enableGL2D();
/* 159 */     GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 160 */     GL11.glColor4f(f2, f3, f4, f);
/* 161 */     GL11.glBegin(2);
/* 162 */     for (int ii = 0; ii < num_segments; ii++) {
/* 163 */       GL11.glVertex2f(x + cx, y + cy);
/* 164 */       float t = x;
/* 165 */       x = p * x - s * y;
/* 166 */       y = s * t + p * y;
/*     */     } 
/* 168 */     GL11.glEnd();
/* 169 */     GL11.glScalef(2.0F, 2.0F, 2.0F);
/* 170 */     disableGL2D();
/*     */   }
/*     */   public static void drawFullCircle(int cx, int cy, double r, int c) {
/* 173 */     r *= 2.0D;
/* 174 */     cx *= 2;
/* 175 */     cy *= 2;
/* 176 */     float f = (c >> 24 & 0xFF) / 255.0F;
/* 177 */     float f2 = (c >> 16 & 0xFF) / 255.0F;
/* 178 */     float f3 = (c >> 8 & 0xFF) / 255.0F;
/* 179 */     float f4 = (c & 0xFF) / 255.0F;
/* 180 */     enableGL2D();
/* 181 */     GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 182 */     GL11.glColor4f(f2, f3, f4, f);
/* 183 */     GL11.glBegin(6);
/* 184 */     for (int i = 0; i <= 360; i++) {
/* 185 */       double x = Math.sin(i * Math.PI / 180.0D) * r;
/* 186 */       double y = Math.cos(i * Math.PI / 180.0D) * r;
/* 187 */       GL11.glVertex2d(cx + x, cy + y);
/*     */     } 
/* 189 */     GL11.glEnd();
/* 190 */     GL11.glScalef(2.0F, 2.0F, 2.0F);
/* 191 */     disableGL2D();
/*     */   }
/*     */   public static void drawSineWave(double x, double y, double height, double lenght, double frequency, double speed, float linewidth, int ticker) {
/* 194 */     GlStateManager.pushMatrix();
/* 195 */     Minecraft mc = Minecraft.getMinecraft();
/* 196 */     ScaledResolution sr = new ScaledResolution(mc);
/* 197 */     enableGL2D();
/* 198 */     GL11.glLineWidth(linewidth);
/* 199 */     GL11.glTranslated(x, y, 0.0D);
/* 200 */     GL11.glBegin(1);
/* 201 */     for (int h = 0; h < lenght; h++) {
/* 202 */       GL11.glVertex2d(h, Math.sin((h - (ticker + mc.timer.renderPartialTicks) * speed) * frequency) * height);
/* 203 */       GL11.glVertex2d((h + 1), Math.sin((h - (ticker + mc.timer.renderPartialTicks) * speed + 1.0D) * frequency) * height);
/*     */     } 
/* 205 */     GL11.glEnd();
/* 206 */     disableGL2D();
/* 207 */     GlStateManager.popMatrix();
/*     */   }
/*     */   
/*     */   public static double getDistance2d(double x1, double y1, double x2, double y2) {
/* 211 */     return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Renderutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */