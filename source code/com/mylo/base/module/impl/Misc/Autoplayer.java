/*     */ package com.mylo.base.module.impl.Misc;
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventRenderGui;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.AStarCustomPathFinder;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Lookutil;
/*     */ import com.mylo.base.utils.PathFind;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.entityutils;
/*     */ import com.mylo.base.utils.font.FontRenderer;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.settings.KeyBinding;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.util.Vec3i;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class Autoplayer extends Module {
/*     */   ArrayList<Vec3> path;
/*     */   String currentTask;
/*     */   Entity target;
/*     */   int currentPathPoint;
/*     */   
/*     */   public Autoplayer() {
/*  36 */     super("Autoplayer", "plays for you", 0, Category.Misc);
/*     */ 
/*     */     
/*  39 */     this.path = null;
/*  40 */     this.currentTask = "getting task";
/*  41 */     this.target = null;
/*  42 */     this.currentPathPoint = 0;
/*     */   }
/*     */   
/*     */   public void setup() {
/*  46 */     super.setup();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  52 */     super.onEnable();
/*  53 */     this.path = null;
/*  54 */     this.currentTask = "getting task";
/*  55 */     this.currentPathPoint = 0;
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  60 */     if (e.isPre()) {
/*  61 */       String str; switch ((str = this.currentTask).hashCode()) { case -1090336543: if (!str.equals("getting task"))
/*     */             break; 
/*  63 */           getTask();
/*     */           break;
/*     */         case -565928383:
/*     */           if (!str.equals("found entity")) {
/*     */             break;
/*     */           }
/*  69 */           this.currentTask = "getting task"; break;
/*     */         case 851509890:
/*     */           if (!str.equals("going to entity"))
/*     */             break; 
/*     */           goToEntity(this.target);
/*     */           break; }
/*     */     
/*  76 */     }  } public void goToEntity(Entity e) { nextPath(e.getPosition()); }
/*     */ 
/*     */   
/*     */   public void getTask() {
/*  80 */     Entity e = entityutils.GetClosestEntity(true, true, true, false, false);
/*  81 */     if (e != null && e.getDistanceToEntity((Entity)this.mc.thePlayer) < 50.0F) {
/*  82 */       if (e.getDistanceToEntity((Entity)this.mc.thePlayer) < 5.0F) {
/*  83 */         this.currentTask = "found entity";
/*  84 */         this.target = null;
/*     */       } else {
/*     */         
/*  87 */         this.currentTask = "going to entity";
/*  88 */         this.target = e;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onRenderGui(EventRenderGui e) {
/*  96 */     GlStateManager.pushMatrix();
/*  97 */     GlStateManager.pushAttrib();
/*  98 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*  99 */     FontRenderer fr = Fonts.MainFontRendererBig;
/* 100 */     Renderutils.enableGL2D();
/* 101 */     int left = sr.getScaledWidth() / 2 - fr.getStringWidth(this.currentTask) / 2 - 2;
/* 102 */     int right = sr.getScaledWidth() / 2 + fr.getStringWidth(this.currentTask) / 2 + 2;
/* 103 */     int top = 8;
/* 104 */     int bottom = top + fr.getHeight() + 4;
/* 105 */     Gui.drawRect(left, top, right, bottom, -2013265920);
/* 106 */     fr.drawStringWithShadow(this.currentTask, (left + 2), (top + 2), 16777215);
/* 107 */     Renderutils.disableGL2D();
/* 108 */     GlStateManager.popAttrib();
/* 109 */     GlStateManager.popMatrix();
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender3d(EventRender3d e) {
/* 114 */     GlStateManager.disableDepth();
/* 115 */     if (this.path != null) {
/* 116 */       for (int i = 0; i < this.path.size() - 1; i++) {
/* 117 */         GlStateManager.pushMatrix();
/* 118 */         Vec3 startPos = this.path.get(i);
/* 119 */         Vec3 endPos = this.path.get(i + 1);
/* 120 */         Renderutils.enableGL2D();
/* 121 */         GL11.glLineWidth(3.0F);
/* 122 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 123 */         GL11.glTranslated(-(this.mc.getRenderManager()).renderPosX, -(this.mc.getRenderManager()).renderPosY, -(this.mc.getRenderManager()).renderPosZ);
/* 124 */         GL11.glBegin(1);
/* 125 */         GL11.glVertex3d(startPos.xCoord, startPos.yCoord, startPos.zCoord);
/* 126 */         GL11.glVertex3d(endPos.xCoord, endPos.yCoord, endPos.zCoord);
/* 127 */         GL11.glEnd();
/* 128 */         Renderutils.disableGL2D();
/* 129 */         GlStateManager.popMatrix();
/* 130 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       } 
/*     */     }
/* 133 */     GlStateManager.enableDepth();
/*     */   }
/*     */   
/*     */   public void nextPath(BlockPos bpos) {
/* 137 */     if (this.mc.thePlayer.isInWater() || this.mc.thePlayer.isInLava()) {
/* 138 */       this.path = PathFind.computePath(this.mc.thePlayer.getPositionVector(), new Vec3((Vec3i)bpos), 2.0D, false);
/*     */     } else {
/*     */       
/* 141 */       this.path = PathFind.computePath(this.mc.thePlayer.getPositionVector(), new Vec3((Vec3i)bpos), 2.0D, true);
/*     */     } 
/* 143 */     if (this.path.size() >= 4) {
/* 144 */       Vec3 next = this.path.get(2);
/* 145 */       Vec3 nextSameY = new Vec3(next.xCoord, this.mc.thePlayer.posY, next.zCoord);
/* 146 */       double distanceSameY = this.mc.thePlayer.getDistance(nextSameY.xCoord, nextSameY.yCoord, nextSameY.zCoord);
/* 147 */       float yaw = Lookutil.getLookAngles(next)[0].floatValue();
/* 148 */       if (distanceSameY > 0.5D) {
/* 149 */         float change = Math.abs(MathHelper.wrapAngleTo180_float(yaw - Main.getFakeYaw())) / 2.0F;
/* 150 */         this.mc.thePlayer.rotationYaw = Lookutil.clampF(yaw, this.mc.thePlayer.rotationYaw, 50.0F);
/* 151 */         KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindForward.getKeyCode(), true);
/*     */       } 
/*     */       
/* 154 */       boolean hasToJump = (this.mc.thePlayer.onGround && this.mc.thePlayer.motionY == 0.0D && AStarCustomPathFinder.checkPositionValidity(this.mc.thePlayer.getPositionVector(), true) && AStarCustomPathFinder.checkPositionValidity(next, true) && AStarCustomPathFinder.checkPositionValidity(next.add(next.subtract(this.mc.thePlayer.getPositionVector())), false));
/* 155 */       if (((next.yCoord > this.mc.thePlayer.posY || this.mc.thePlayer.isCollidedHorizontally || hasToJump) && this.mc.thePlayer.onGround) || this.mc.thePlayer.isInWater() || this.mc.thePlayer.isInLava()) {
/* 156 */         KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindJump.getKeyCode(), true);
/*     */       } else {
/*     */         
/* 159 */         KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindJump.getKeyCode(), false);
/*     */       } 
/*     */     } else {
/*     */       
/* 163 */       KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindForward.getKeyCode(), Keyboard.isKeyDown(this.mc.gameSettings.keyBindForward.getKeyCode()));
/* 164 */       KeyBinding.setKeyBindState(this.mc.gameSettings.keyBindJump.getKeyCode(), Keyboard.isKeyDown(this.mc.gameSettings.keyBindJump.getKeyCode()));
/* 165 */       this.currentTask = "getting task";
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/Autoplayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */