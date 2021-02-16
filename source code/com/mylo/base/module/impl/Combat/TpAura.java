/*     */ package com.mylo.base.module.impl.Combat;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventClick;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.PathFind;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import com.mylo.base.utils.entityutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C02PacketUseEntity;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.util.Vec3;
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
/*     */ public class TpAura
/*     */   extends Module
/*     */ {
/*  43 */   TimeHelper timer = new TimeHelper();
/*  44 */   ArrayList<ArrayList<Vec3>> posLists = null;
/*     */   
/*     */   public TpAura() {
/*  47 */     super("Tpaura", "you stand and they go zoom", 0, Category.Combat);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setup() {
/*  52 */     super.setup();
/*  53 */     Main.setmgr.rSetting(new Setting("aps", this, 1.0D, 1.0D, 20.0D, true));
/*  54 */     Main.setmgr.rSetting(new Setting("tpreach", this, 20.0D, 20.0D, 200.0D, true));
/*  55 */     Main.setmgr.rSetting(new Setting("pertpdistance", this, 1.0D, 1.0D, 10.0D, true));
/*  56 */     Main.setmgr.rSetting(new Setting("max tp targets", this, 1.0D, 1.0D, 20.0D, true));
/*  57 */     Main.setmgr.rSetting(new Setting("teamcheck tpaura", this, true));
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  62 */     if (this.mc.thePlayer.isDead) {
/*  63 */       setState(false);
/*     */     }
/*  65 */     if (this.timer.isDelayComplete(Long.valueOf((long)(1000.0D / Main.setmgr.getSettingByName("aps").getValDouble())))) {
/*     */       
/*  67 */       boolean teams = Main.setmgr.getSettingByName("teamcheck tpaura").getValBoolean();
/*  68 */       int reach = (int)Main.setmgr.getSettingByName("tpreach").getValDouble();
/*  69 */       int maxtargets = (int)Main.setmgr.getSettingByName("max tp targets").getValDouble();
/*  70 */       float jumpsize = (float)Main.setmgr.getSettingByName("pertpdistance").getValDouble();
/*  71 */       ArrayList<Entity> found = entityutils.getEntitiesInRangeSorted(reach, true, false, false, teams, true);
/*  72 */       ArrayList<EntityPlayer> targets = new ArrayList<>();
/*  73 */       for (Entity entity : found) {
/*  74 */         if (entity instanceof EntityPlayer && targets.size() < maxtargets) {
/*  75 */           targets.add((EntityPlayer)entity);
/*     */         }
/*     */       } 
/*  78 */       boolean gotone = false;
/*  79 */       this.posLists = new ArrayList<>();
/*  80 */       for (EntityPlayer ent : targets) {
/*  81 */         if (ent != null && ent.getDistanceToEntity((Entity)this.mc.thePlayer) < reach) {
/*  82 */           gotone = true;
/*  83 */           ArrayList<Vec3> posList = new ArrayList<>();
/*  84 */           posList = PathFind.computePath(this.mc.thePlayer.getPositionVector(), ent.getPositionVector(), jumpsize, false);
/*  85 */           this.posLists.add(posList);
/*  86 */           double startx = this.mc.thePlayer.posX;
/*  87 */           double starty = this.mc.thePlayer.posY;
/*  88 */           double startz = this.mc.thePlayer.posZ;
/*  89 */           for (Vec3 p : posList) {
/*  90 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(p.xCoord, p.yCoord + 0.1D, p.zCoord, true));
/*     */           }
/*  92 */           this.mc.thePlayer.setPosition(ent.posX, ent.posY, ent.posZ);
/*  93 */           this.mc.thePlayer.swingItem();
/*  94 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C02PacketUseEntity((Entity)ent, C02PacketUseEntity.Action.ATTACK));
/*  95 */           Collections.reverse(posList);
/*  96 */           for (Vec3 p : posList) {
/*  97 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(p.xCoord, p.yCoord + 0.1D, p.zCoord, true));
/*     */           }
/*  99 */           this.mc.thePlayer.setPosition(startx, starty, startz);
/*     */         } 
/*     */       } 
/* 102 */       this.timer.reset();
/* 103 */       if (!gotone) {
/* 104 */         this.posLists = new ArrayList<>();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender3d(EventRender3d e) {
/* 111 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 112 */     GlStateManager.disableDepth();
/* 113 */     for (ArrayList<Vec3> posList : this.posLists) {
/* 114 */       if (posList != null)
/*     */       {
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
/* 133 */         for (int i = 0; i < posList.size() - 1; i++) {
/* 134 */           GlStateManager.pushMatrix();
/* 135 */           Vec3 startPos = posList.get(i);
/* 136 */           Vec3 endPos = posList.get(i + 1);
/*     */ 
/*     */ 
/*     */           
/* 140 */           Renderutils.enableGL2D();
/* 141 */           GL11.glLineWidth(3.0F);
/* 142 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 143 */           GL11.glTranslated(-(this.mc.getRenderManager()).renderPosX, -(this.mc.getRenderManager()).renderPosY, -(this.mc.getRenderManager()).renderPosZ);
/* 144 */           GL11.glBegin(1);
/* 145 */           GL11.glVertex3d(startPos.xCoord, startPos.yCoord, startPos.zCoord);
/* 146 */           GL11.glVertex3d(endPos.xCoord, endPos.yCoord, endPos.zCoord);
/* 147 */           GL11.glEnd();
/* 148 */           Renderutils.disableGL2D();
/*     */           
/* 150 */           GlStateManager.popMatrix();
/* 151 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */         } 
/*     */       }
/*     */     } 
/* 155 */     GlStateManager.enableDepth();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onClick(EventClick e) {}
/*     */ 
/*     */   
/*     */   public void onEnable() {
/* 165 */     super.onEnable();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisable() {
/* 170 */     super.onDisable();
/* 171 */     this.posLists = null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/TpAura.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */