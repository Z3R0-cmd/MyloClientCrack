/*     */ package com.mylo.base.module.impl.Visuals;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventRenderGui;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Lookutil;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.awt.Color;
/*     */ import net.minecraft.client.gui.GuiIngame;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.MathHelper;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ESP
/*     */   extends Module
/*     */ {
/*     */   public ESP() {
/*  51 */     super("ESP", "see niggers through walls", 0, Category.Visuals);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setup() {
/*  56 */     super.setup();
/*  57 */     Main.setmgr.rSetting(new Setting("players ", this, true));
/*  58 */     Main.setmgr.rSetting(new Setting("monsters ", this, false));
/*  59 */     Main.setmgr.rSetting(new Setting("animals ", this, false));
/*  60 */     Main.setmgr.rSetting(new Setting("chests", this, true));
/*  61 */     Main.setmgr.rSetting(new Setting(this.name, this, "box", Lists.newArrayList((Object[])new String[] { "box", "chams" })));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {
/*  66 */     super.onDisable();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  72 */     super.onEnable();
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onRender(EventRender3d e) {
/*  78 */     GlStateManager.pushMatrix();
/*  79 */     GlStateManager.pushAttrib();
/*  80 */     for (Entity ent : this.mc.theWorld.loadedEntityList) {
/*  81 */       int x; int y; int x2; int y2; double dif; int r; int g; Color c; if (!(ent instanceof EntityLivingBase) || ent.getEntityId() == this.mc.getRenderViewEntity().getEntityId() || ((
/*  82 */         ent instanceof net.minecraft.entity.monster.EntityMob || ent instanceof net.minecraft.entity.monster.EntitySlime) && !Main.setmgr.getSettingByName("monsters ").getValBoolean()))
/*     */         continue; 
/*  84 */       if ((ent instanceof net.minecraft.entity.passive.EntityAnimal || ent instanceof net.minecraft.entity.monster.EntityGolem || ent instanceof net.minecraft.entity.monster.EntityGuardian || ent instanceof net.minecraft.entity.passive.EntityVillager || ent instanceof net.minecraft.entity.passive.EntityBat || ent instanceof net.minecraft.entity.passive.EntitySquid) && !Main.setmgr.getSettingByName("animals ").getValBoolean())
/*     */         continue; 
/*  86 */       if (ent instanceof net.minecraft.entity.player.EntityPlayer && !Main.setmgr.getSettingByName("players ").getValBoolean())
/*     */         continue; 
/*  88 */       if (ent instanceof net.minecraft.client.entity.EntityPlayerSP)
/*     */         continue; 
/*  90 */       if (ent.isInvisible())
/*     */         continue; 
/*  92 */       if (ent instanceof net.minecraft.entity.item.EntityArmorStand)
/*     */         continue; 
/*  94 */       if (ent.ticksExisted < 10)
/*     */         continue; 
/*  96 */       if (!ent.isEntityAlive() && (this.mc.isSingleplayer() || !this.mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("mineplex")))
/*     */         continue; 
/*     */       String str;
/*  99 */       switch ((str = Main.setmgr.getSettingByName("ESP").getValString()).hashCode()) { case 97739: if (!str.equals("box"))
/*     */             continue; 
/* 101 */           GlStateManager.pushMatrix();
/* 102 */           GlStateManager.disableDepth();
/* 103 */           GlStateManager.translate(ent.lastTickPosX + (ent.posX - ent.lastTickPosX) * this.mc.timer.renderPartialTicks - (this.mc.getRenderManager()).renderPosX, ent.lastTickPosY + (ent.posY - ent.lastTickPosY) * this.mc.timer.renderPartialTicks - (this.mc.getRenderManager()).renderPosY + ent.height + 0.4D, ent.lastTickPosZ + (ent.posZ - ent.lastTickPosZ) * this.mc.timer.renderPartialTicks - (this.mc.getRenderManager()).renderPosZ);
/* 104 */           GlStateManager.scale(-0.1D, -0.1D, -0.1D);
/* 105 */           GlStateManager.rotate(-Lookutil.getLookAngles(ent.getPositionVector())[0].floatValue(), 0.0F, 1.0F, 0.0F);
/* 106 */           GlStateManager.enableDepth();
/* 107 */           GuiIngame.drawRect(-((int)(ent.width * 5.0F)) - 2, 3, (int)(ent.width * 5.0F) + 5, (int)(ent.height * 10.0F) + 5, 1426063360);
/* 108 */           GlStateManager.disableDepth();
/* 109 */           x = -((int)(ent.width * 5.0F)) - 2;
/* 110 */           y = 3;
/* 111 */           x2 = (int)(ent.width * 5.0F) + 2;
/* 112 */           y2 = (int)(ent.height * 10.0F) + 5;
/* 113 */           dif = 0.0D;
/* 114 */           if (ent instanceof EntityLivingBase) {
/* 115 */             dif = (((EntityLivingBase)ent).getSmoothHealth() / ((EntityLivingBase)ent).getMaxHealth());
/*     */           }
/* 117 */           dif = MathHelper.clamp_double(dif, 0.0D, 1.0D);
/* 118 */           dif--;
/* 119 */           dif *= -1.0D;
/* 120 */           r = 0;
/* 121 */           g = 255;
/* 122 */           r = (int)(255.0D * dif);
/* 123 */           g = (int)(-255.0D * dif) + 255;
/* 124 */           c = new Color(r, g, 0);
/* 125 */           GuiIngame.drawRect(x2 + 1, y - (int)(dif * (y - y2)), x2 + 3, y2, c.getRGB());
/* 126 */           GuiIngame.drawRect(x, y, x2 + 3, y + 1, -16777216);
/* 127 */           GuiIngame.drawRect(x, y, 1 + x, y2, -16777216);
/* 128 */           GuiIngame.drawRect(x, y2, x2 + 3, y2 + 1, -16777216);
/* 129 */           GuiIngame.drawRect(x2, y, x2 + 1, y2 + 1, -16777216);
/* 130 */           GuiIngame.drawRect(x2 + 3, y, x2 + 4, y2 + 1, -16777216);
/* 131 */           GlStateManager.popMatrix(); }
/*     */ 
/*     */ 
/*     */     
/*     */     } 
/* 136 */     GlStateManager.enableDepth();
/* 137 */     double renderPosX = (this.mc.getRenderManager()).viewerPosX;
/* 138 */     double renderPosY = (this.mc.getRenderManager()).viewerPosY;
/* 139 */     double renderPosZ = (this.mc.getRenderManager()).viewerPosZ;
/* 140 */     GL11.glPushMatrix();
/* 141 */     GL11.glEnable(3042);
/* 142 */     GL11.glBlendFunc(770, 771);
/* 143 */     GL11.glEnable(2848);
/* 144 */     GL11.glLineWidth(2.0F);
/* 145 */     GL11.glDisable(3553);
/* 146 */     GL11.glEnable(2884);
/* 147 */     GL11.glDisable(2929);
/* 148 */     if (Main.setmgr.getSettingByName("chests").getValBoolean() && Main.setmgr.getSettingByName("ESP").getValString().equalsIgnoreCase("box")) {
/* 149 */       for (TileEntity tileent : this.mc.theWorld.loadedTileEntityList) {
/* 150 */         if (tileent instanceof net.minecraft.tileentity.TileEntityChest) {
/* 151 */           BlockPos pos = tileent.getPos();
/* 152 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
/* 153 */           Renderutils.drawSolidBox3d(new AxisAlignedBB(pos.getX() + 0.05D, pos.getY(), pos.getZ() + 0.05D, (pos.getX() + 1) - 0.05D, (pos.getY() + 1) - 0.1D, (pos.getZ() + 1) - 0.05D));
/* 154 */           GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0F);
/* 155 */           Renderutils.drawOutlinedBox3d(new AxisAlignedBB(pos.getX() + 0.05D, pos.getY(), pos.getZ() + 0.05D, (pos.getX() + 1) - 0.05D, (pos.getY() + 1) - 0.1D, (pos.getZ() + 1) - 0.05D));
/*     */         } 
/*     */       } 
/*     */     }
/* 159 */     GL11.glEnable(2929);
/* 160 */     GL11.glEnable(3553);
/* 161 */     GL11.glDisable(3042);
/* 162 */     GL11.glDisable(2848);
/* 163 */     GlStateManager.popMatrix();
/*     */     
/* 165 */     GlStateManager.popAttrib();
/* 166 */     GlStateManager.popMatrix();
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender2d(EventRenderGui e) {}
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/ESP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */