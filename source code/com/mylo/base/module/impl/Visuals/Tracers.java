/*    */ package com.mylo.base.module.impl.Visuals;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventRender3d;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Colorutil;
/*    */ import com.mylo.base.utils.Renderutils;
/*    */ import java.awt.Color;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import net.minecraft.entity.Entity;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ public class Tracers
/*    */   extends Module
/*    */ {
/*    */   public Tracers() {
/* 19 */     super("Tracers", "draw a line to other players", 0, Category.Visuals);
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onRender(EventRender3d e) {
/* 24 */     GlStateManager.pushMatrix();
/* 25 */     GlStateManager.pushAttrib();
/* 26 */     for (Entity ent : this.mc.theWorld.loadedEntityList) {
/* 27 */       if (ent instanceof net.minecraft.entity.player.EntityPlayer && ent != this.mc.getRenderViewEntity()) {
/*    */         
/* 29 */         double x = ent.lastTickPosX + (ent.posX - ent.lastTickPosX) * this.mc.timer.renderPartialTicks;
/* 30 */         x -= (this.mc.getRenderManager()).renderPosX;
/* 31 */         double y = ent.lastTickPosY + (ent.posY - ent.lastTickPosY) * this.mc.timer.renderPartialTicks;
/* 32 */         y -= (this.mc.getRenderManager()).renderPosY;
/* 33 */         double z = ent.lastTickPosZ + (ent.posZ - ent.lastTickPosZ) * this.mc.timer.renderPartialTicks;
/* 34 */         z -= (this.mc.getRenderManager()).renderPosZ;
/*    */         
/* 36 */         Renderutils.enableGL2D();
/* 37 */         GL11.glLineWidth(1.0F);
/* 38 */         Color c = new Color(Colorutil.getChosenColor(0));
/* 39 */         GL11.glColor3f(c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F);
/* 40 */         GL11.glBegin(1);
/* 41 */         GL11.glVertex3d(0.0D, 0.0D, 0.0D);
/* 42 */         GL11.glVertex3d(x, y, z);
/* 43 */         GL11.glEnd();
/* 44 */         Renderutils.disableGL2D();
/*    */       } 
/*    */     } 
/* 47 */     GlStateManager.popAttrib();
/* 48 */     GlStateManager.popMatrix();
/* 49 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/Tracers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */