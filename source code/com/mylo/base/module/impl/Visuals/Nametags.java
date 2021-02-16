/*     */ package com.mylo.base.module.impl.Visuals;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventRenderNameTag;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemArmor;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Nametags
/*     */   extends Module
/*     */ {
/*     */   public Nametags() {
/*  26 */     super("Nametags", "show nametags with info", 0, Category.Visuals);
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onNameTagRender(EventRenderNameTag e) {
/*  31 */     e.setCancelled(true);
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender(EventRender3d e) {
/*  36 */     GlStateManager.pushMatrix();
/*  37 */     GlStateManager.pushAttrib();
/*  38 */     GlStateManager.disableDepth();
/*  39 */     for (Entity ent : this.mc.theWorld.loadedEntityList) {
/*  40 */       if (!(ent instanceof EntityPlayer) || ent instanceof net.minecraft.client.entity.EntityPlayerSP) {
/*     */         continue;
/*     */       }
/*  43 */       if (ent instanceof EntityPlayer) {
/*  44 */         EntityPlayer player = (EntityPlayer)ent;
/*  45 */         GlStateManager.pushMatrix();
/*  46 */         GlStateManager.pushAttrib();
/*     */         
/*  48 */         double x = ent.lastTickPosX + (ent.posX - ent.lastTickPosX) * this.mc.timer.renderPartialTicks;
/*  49 */         x -= (this.mc.getRenderManager()).renderPosX;
/*  50 */         double y = ent.lastTickPosY + (ent.posY - ent.lastTickPosY) * this.mc.timer.renderPartialTicks;
/*  51 */         y -= (this.mc.getRenderManager()).renderPosY;
/*  52 */         y += ent.height + 0.4D;
/*  53 */         double z = ent.lastTickPosZ + (ent.posZ - ent.lastTickPosZ) * this.mc.timer.renderPartialTicks;
/*  54 */         z -= (this.mc.getRenderManager()).renderPosZ;
/*     */         
/*  56 */         GlStateManager.translate(x, y, z);
/*  57 */         GlStateManager.rotate(this.mc.thePlayer.rotationYaw, 0.0F, -1.0F, 0.0F);
/*  58 */         GlStateManager.rotate(this.mc.thePlayer.rotationPitch, 1.0F, 0.0F, 0.0F);
/*  59 */         GlStateManager.scale(-0.03D, -0.03D, 0.0D);
/*     */         
/*  61 */         double distance = this.mc.thePlayer.getDistanceToEntity(ent);
/*  62 */         double distanceSQRT = this.mc.thePlayer.getDistanceSqToEntity(ent);
/*  63 */         double scale = distanceSQRT / distance;
/*  64 */         scale *= 0.1D;
/*  65 */         GlStateManager.scale(scale, scale, scale);
/*  66 */         int yoffset = -((int)scale);
/*     */ 
/*     */ 
/*     */         
/*  70 */         FontRenderer fr = this.mc.fontRendererObj;
/*  71 */         String paragraph = "§";
/*  72 */         String RED = String.valueOf(paragraph) + "4";
/*  73 */         String RESET = String.valueOf(paragraph) + "r";
/*  74 */         String GRAY = String.valueOf(paragraph) + "7";
/*     */         
/*  76 */         String text = String.valueOf(GRAY) + "[" + RESET + (int)distance + GRAY + "] " + RESET + player.getDisplayName().getFormattedText() + RED + " (" + RESET + (int)player.getHealth() + RED + ")";
/*  77 */         int width = fr.getStringWidth(text);
/*  78 */         int height = fr.FONT_HEIGHT;
/*     */         
/*  80 */         boolean armor = false;
/*  81 */         for (int i = 0; i < 4; i++) {
/*  82 */           if (player.inventory.armorInventory[i] != null) {
/*  83 */             armor = true;
/*     */           }
/*     */         } 
/*  86 */         if (player.getHeldItem() != null) {
/*  87 */           armor = true;
/*     */         }
/*     */         
/*  90 */         int boxWidth = Math.max(width + 5, 150) / 2;
/*  91 */         int boxHeight = height + 5 + 20;
/*     */         
/*  93 */         Gui.drawRect(-boxWidth, armor ? -boxHeight : (-height - 5 + yoffset), boxWidth, 5 + yoffset, 1426063360);
/*  94 */         fr.drawStringWithShadow(text, (-width / 2), (-height + yoffset), 16777215);
/*  95 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */         
/*  97 */         for (int j = 0; j < 4; j++) {
/*  98 */           ItemStack armorPiece = player.inventory.armorInventory[j];
/*  99 */           if (armorPiece != null && armorPiece.getItem() instanceof ItemArmor) {
/* 100 */             ItemArmor item = (ItemArmor)armorPiece.getItem();
/* 101 */             this.mc.getRenderItem().renderItemIntoGUI(armorPiece, j * 20 - boxWidth + 15, -boxHeight + 5 + yoffset);
/* 102 */             this.mc.getRenderItem().renderItemOverlayIntoGUI(this.mc.fontRendererObj, armorPiece, j * 20 - boxWidth + 15, -boxHeight + 5 + yoffset, (new StringBuilder(String.valueOf(armorPiece.getMaxDamage() - armorPiece.getItemDamage()))).toString());
/* 103 */             GlStateManager.disableBlend();
/*     */           } 
/*     */         } 
/* 106 */         ItemStack heldItem = player.getHeldItem();
/* 107 */         if (heldItem != null) {
/* 108 */           this.mc.getRenderItem().renderItemIntoGUI(heldItem, boxWidth - 20, -boxHeight + 5 + yoffset);
/* 109 */           this.mc.getRenderItem().renderItemOverlayIntoGUI(this.mc.fontRendererObj, heldItem, boxWidth - 20, -boxHeight + 5 + yoffset, heldItem.stackSize);
/* 110 */           GlStateManager.disableBlend();
/*     */         } 
/*     */ 
/*     */         
/* 114 */         GlStateManager.popAttrib();
/* 115 */         GlStateManager.popMatrix();
/* 116 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       } 
/*     */     } 
/* 119 */     GlStateManager.popAttrib();
/* 120 */     GlStateManager.popMatrix();
/* 121 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/Nametags.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */