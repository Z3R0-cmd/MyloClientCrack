/*     */ package com.mylo.base.module.impl.Movement;
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventRender3d;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Colorutil;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.Lookutil;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.awt.Color;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedList;
/*     */ import net.minecraft.client.gui.GuiIngame;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.item.ItemBlock;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
/*     */ import net.minecraft.network.play.client.C09PacketHeldItemChange;
/*     */ import net.minecraft.network.play.client.C0APacketAnimation;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class Scaffold extends Module {
/*     */   BlockPos lastpos;
/*     */   EnumFacing lastface;
/*     */   int ticksToKeepRotation;
/*     */   LinkedList<Packet> queue;
/*     */   TimeHelper timer;
/*     */   TimeHelper timerHypixel;
/*     */   
/*     */   public Scaffold() {
/*  44 */     super("Scaffold", "Place blocks under you as you walk", 34, Category.Movement);
/*     */ 
/*     */     
/*  47 */     this.lastpos = null;
/*  48 */     this.lastface = null;
/*     */     
/*  50 */     this.ticksToKeepRotation = 0;
/*     */     
/*  52 */     this.queue = new LinkedList<>();
/*  53 */     this.timer = new TimeHelper(); this.timerHypixel = new TimeHelper();
/*     */   }
/*     */   
/*     */   public void onDisable() {
/*  57 */     super.onDisable();
/*  58 */     this.lastpos = null;
/*  59 */     this.mc.timer.timerSpeed = 1.0F;
/*  60 */     Main.enableFakeaim(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onEnable() {
/*  65 */     super.onEnable();
/*  66 */     this.ticksToKeepRotation = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setup() {
/*  71 */     super.setup();
/*  72 */     ArrayList<String> options = new ArrayList<>();
/*  73 */     options.add("fast");
/*  74 */     options.add("ncp");
/*  75 */     options.add("hyper");
/*  76 */     options.add("tpfast");
/*  77 */     options.add("tpcubecraft");
/*  78 */     options.add("off");
/*  79 */     Main.setmgr.rSetting(new Setting("tower", this, "fast", options));
/*  80 */     options = new ArrayList<>();
/*  81 */     options.add("normal");
/*  82 */     options.add("cubecraft");
/*  83 */     options.add("aac");
/*  84 */     options.add("aac2");
/*  85 */     options.add("hypixel");
/*  86 */     Main.setmgr.rSetting(new Setting(this.name, this, "normal", options));
/*  87 */     options = new ArrayList<>();
/*  88 */     options.add("normal");
/*  89 */     options.add("packet");
/*  90 */     options.add("switch");
/*  91 */     options.add("off");
/*  92 */     Main.setmgr.rSetting(new Setting("itemspoof", this, "normal", options));
/*  93 */     Main.setmgr.rSetting(new Setting("extrapacket", this, false));
/*  94 */     Main.setmgr.rSetting(new Setting("disable scaffold rotations", this, false));
/*  95 */     Main.setmgr.rSetting(new Setting("use largest stack", this, false));
/*  96 */     Main.setmgr.rSetting(new Setting("eagle", this, false));
/*  97 */     Main.setmgr.rSetting(new Setting("stopsprint", this, false));
/*  98 */     Main.setmgr.rSetting(new Setting("extend", this, 0.0D, 0.0D, 5.0D, true));
/*  99 */     Main.setmgr.rSetting(new Setting("requiredistance", this, false));
/* 100 */     Main.setmgr.rSetting(new Setting("downscaffold", this, false));
/* 101 */     Main.setmgr.rSetting(new Setting("scaffold swing", this, false));
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/* 106 */     boolean cubecraftmode = Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("cubecraft");
/* 107 */     boolean aacmode = Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("aac");
/* 108 */     boolean aac2mode = Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("aac2");
/* 109 */     boolean hypixelmode = Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel");
/* 110 */     boolean rotate = !Main.setmgr.getSettingByName("disable scaffold rotations").getValBoolean();
/* 111 */     boolean itemspoof = !Main.setmgr.getSettingByName("itemspoof").getValString().equalsIgnoreCase("off");
/* 112 */     boolean largeststack = Main.setmgr.getSettingByName("use largest stack").getValBoolean();
/* 113 */     boolean eagle = Main.setmgr.getSettingByName("eagle").getValBoolean();
/* 114 */     boolean stopsprint = Main.setmgr.getSettingByName("stopsprint").getValBoolean();
/* 115 */     int extend = (int)Main.setmgr.getSettingByName("extend").getValDouble();
/* 116 */     boolean requiredistance = Main.setmgr.getSettingByName("requiredistance").getValBoolean();
/* 117 */     boolean down = Main.setmgr.getSettingByName("downscaffold").getValBoolean();
/* 118 */     boolean swing = Main.setmgr.getSettingByName("scaffold swing").getValBoolean();
/*     */     
/* 120 */     if (hypixelmode && this.mc.thePlayer.motionY < -0.7D) {
/* 121 */       Main.NotMan.sendNotification("Scaffold", "Scaffold was disabled to avoid getting banned", 3000);
/* 122 */       setState(false);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     if (stopsprint && 
/* 131 */       Moveutils.moveKeysDown()) {
/* 132 */       this.mc.thePlayer.setSprinting(false);
/*     */     }
/*     */     
/* 135 */     if (e.isPre()) {
/* 136 */       float divider = 90.0F;
/* 137 */       float divider2 = 45.0F;
/* 138 */       if (rotate || cubecraftmode || aacmode) {
/* 139 */         if (cubecraftmode) {
/* 140 */           rotate = false;
/*     */         }
/* 142 */         Main.enableFakeaim(true);
/* 143 */         if (cubecraftmode) {
/* 144 */           Main.setFakeaim(Main.getFakePitch(), this.mc.thePlayer.rotationYaw);
/* 145 */           Lookutil.lookAtAngleSmooth(45.0F, Main.getFakeYaw(), 10.0F, 10.0F);
/*     */         }
/* 147 */         else if (aacmode && Moveutils.moveKeysDown()) {
/*     */ 
/*     */ 
/*     */           
/* 151 */           if (this.ticksToKeepRotation-- > 0) {
/* 152 */             Main.setFakeaim(Main.fakePitch, this.mc.thePlayer.rotationYaw % divider2 + (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/* 153 */             this.mc.thePlayer.motionX *= 0.7D;
/* 154 */             this.mc.thePlayer.motionZ *= 0.7D;
/*     */           } else {
/*     */             
/* 157 */             Main.setFakeaim(Main.fakePitch, this.mc.thePlayer.rotationYaw % divider2 + (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/*     */           } 
/*     */         } 
/*     */         
/* 161 */         if (!cubecraftmode && !aacmode && !aac2mode) {
/* 162 */           if (this.lastpos != null)
/*     */           {
/* 164 */             Lookutil.lookAtBlockPacket(this.lastpos, this.lastface);
/*     */           }
/* 166 */           if (hypixelmode) {
/* 167 */             Main.fakePitch = (float)(Main.fakePitch + Math.random() * 10.0D - 5.0D);
/* 168 */             Main.fakePitch = MathHelper.clamp_float(Main.fakePitch, -90.0F, 90.0F);
/* 169 */             Main.setFakeaim(Main.fakePitch, (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/*     */           } 
/*     */         } 
/*     */       } 
/* 173 */       BlockPos targetpos = new BlockPos(this.mc.thePlayer.posX, this.mc.thePlayer.posY - ((this.mc.thePlayer.motionY > 0.0D) ? ((this.mc.thePlayer.isSneaking() && down) ? 2.0D : 1.005D) : ((this.mc.thePlayer.isSneaking() && down) ? 2 : true)), this.mc.thePlayer.posZ);
/*     */ 
/*     */       
/* 176 */       boolean tower = (Keyboard.isKeyDown(this.mc.gameSettings.keyBindJump.getKeyCode()) && !Moveutils.moveKeysDown());
/* 177 */       boolean found = this.mc.theWorld.getBlockState(targetpos).getBlock() instanceof net.minecraft.block.BlockAir;
/*     */       
/* 179 */       for (int i = 0; i < extend + 1 && 
/* 180 */         !found; i++) {
/*     */ 
/*     */         
/* 183 */         targetpos = new BlockPos(this.mc.thePlayer.posX + Moveutils.getXDir() * i, this.mc.thePlayer.posY - ((this.mc.thePlayer.motionY > 0.0D) ? ((this.mc.thePlayer.isSneaking() && down) ? 2.0D : 1.005D) : ((this.mc.thePlayer.isSneaking() && down) ? 2 : true)), this.mc.thePlayer.posZ + Moveutils.getZDir() * i);
/* 184 */         found = this.mc.theWorld.getBlockState(targetpos).getBlock() instanceof net.minecraft.block.BlockAir;
/*     */       } 
/*     */       
/* 187 */       if (aacmode) {
/* 188 */         targetpos = new BlockPos(this.mc.thePlayer.posX - Moveutils.getXDir() / 4.0D, this.mc.thePlayer.posY - (this.mc.thePlayer.movementInput.jump ? ((this.mc.thePlayer.isSneaking() && down) ? 2.0D : 1.01D) : ((this.mc.thePlayer.isSneaking() && down) ? 2 : true)), this.mc.thePlayer.posZ - Moveutils.getZDir() / 4.0D);
/*     */       }
/* 190 */       down = (this.mc.thePlayer.isSneaking() && down);
/* 191 */       boolean canplacecubecraft = false;
/* 192 */       if (found) {
/* 193 */         boolean haveitem = false;
/* 194 */         int heldslot = this.mc.thePlayer.inventory.currentItem;
/* 195 */         int biggeststack = -1;
/* 196 */         if (itemspoof) {
/* 197 */           for (int j = 0; j < 9; j++) {
/* 198 */             ItemStack item = this.mc.thePlayer.inventory.getStackInSlot(j);
/* 199 */             if (item != null && item.getItem() != null && item.getItem() instanceof ItemBlock && !(((ItemBlock)item.getItem()).getBlock() instanceof net.minecraft.block.BlockIce)) {
/* 200 */               boolean moreitems = (item.stackSize > biggeststack);
/* 201 */               if (((ItemBlock)item.getItem()).getBlock().isFullCube() && (!haveitem || (moreitems && largeststack))) {
/* 202 */                 biggeststack = item.stackSize;
/* 203 */                 haveitem = true;
/* 204 */                 this.mc.thePlayer.inventory.currentItem = j;
/* 205 */                 if (Main.setmgr.getSettingByName("itemspoof").getValString() == "packet") {
/* 206 */                   this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C09PacketHeldItemChange(j));
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }
/* 212 */         if (this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof ItemBlock) {
/* 213 */           if (tower) {
/* 214 */             this.mc.thePlayer.motionX = 0.0D;
/* 215 */             this.mc.thePlayer.motionZ = 0.0D; String str;
/* 216 */             switch ((str = Main.setmgr.getSettingByName("tower").getValString()).hashCode()) { case -867415848: if (!str.equals("tpfast")) {
/*     */                   break;
/*     */                 }
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
/* 234 */                 this.mc.thePlayer.motionY = 0.1D;
/* 235 */                 this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, ((int)this.mc.thePlayer.posY + 1), this.mc.thePlayer.posZ); break;case 108891: if (!str.equals("ncp")) break;  this.mc.thePlayer.motionY = 0.0D; this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, (int)this.mc.thePlayer.posY, this.mc.thePlayer.posZ); break;case 3135580: if (!str.equals("fast"))
/*     */                   break;  this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, (int)this.mc.thePlayer.posY, this.mc.thePlayer.posZ); if (this.mc.thePlayer.ticksExisted % 2 != 0)
/*     */                   this.mc.thePlayer.motionY = Moveutils.getJumpMotion();  break;case 99761772: if (!str.equals("hyper"))
/*     */                   break;  this.mc.thePlayer.motionY = Moveutils.getJumpMotion(); break;case 440890383: if (!str.equals("tpcubecraft"))
/* 239 */                   break;  this.mc.thePlayer.motionY = Moveutils.getJumpMotion();
/* 240 */                 this.mc.thePlayer.setPosition(this.mc.thePlayer.posX, this.mc.thePlayer.posY + 1.111111D, this.mc.thePlayer.posZ);
/*     */                 break; }
/*     */           
/*     */           } 
/* 244 */           BlockPos bpos = Lookutil.getBlockNextToPos(targetpos);
/* 245 */           EnumFacing face = Lookutil.getFacingNextToPos(targetpos);
/* 246 */           if (bpos != null && this.timer.hasReached(15.0F)) {
/* 247 */             this.lastface = face;
/* 248 */             this.lastpos = bpos;
/* 249 */             if (!requiredistance || face.equals(EnumFacing.UP) || face.equals(EnumFacing.DOWN) || bpos.getY() < this.mc.thePlayer.posY - 1.0D || Math.max(Math.abs(this.mc.thePlayer.posX - bpos.getX() + 0.5D), Math.abs(this.mc.thePlayer.posZ - bpos.getZ() + 0.5D)) > 0.7D) {
/* 250 */               this.timer.reset();
/* 251 */               if (rotate) {
/* 252 */                 Lookutil.lookAtBlockPacket(this.lastpos, this.lastface);
/* 253 */                 if (hypixelmode) {
/* 254 */                   Main.fakePitch = (float)(Main.fakePitch + Math.random() * 10.0D - 5.0D);
/* 255 */                   Main.fakePitch = MathHelper.clamp_float(Main.fakePitch, -90.0F, 90.0F);
/* 256 */                   Main.setFakeaim(Main.fakePitch, (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/*     */                 } 
/* 258 */                 if (aacmode && Moveutils.moveKeysDown()) {
/*     */ 
/*     */ 
/*     */                   
/* 262 */                   Main.setFakeaim(Main.fakePitch, this.mc.thePlayer.rotationYaw % divider2 + (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/* 263 */                   this.ticksToKeepRotation = 3;
/*     */                 } 
/*     */               } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 271 */               if (Main.setmgr.getSettingByName("extrapacket").getValBoolean()) {
/* 272 */                 Lookutil.sendLookAtBlockPacket(bpos, face);
/*     */               }
/*     */               
/* 275 */               Vec3 vec3 = this.mc.thePlayer.getPositionEyes(this.mc.timer.renderPartialTicks);
/* 276 */               Vec3 vec31 = this.mc.thePlayer.getLookFakeaim(this.mc.timer.renderPartialTicks);
/* 277 */               Vec3 vec32 = vec3.addVector(vec31.xCoord * 4.0D, vec31.yCoord * 4.0D, vec31.zCoord * 4.0D);
/* 278 */               MovingObjectPosition mop = this.mc.theWorld.rayTraceBlocks(vec3, vec32);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 286 */               if (eagle) {
/* 287 */                 this.mc.thePlayer.movementInput.sneak = true;
/* 288 */                 Moveutils.setSpeed(0.0D);
/*     */               } 
/*     */ 
/*     */               
/* 292 */               if (this.mc.playerController.onPlayerRightClick(this.mc.thePlayer, this.mc.theWorld, this.mc.thePlayer.getHeldItem(), bpos, face, (mop != null) ? mop.hitVec : new Vec3(Math.random(), Math.random(), Math.random())) && 
/* 293 */                 !hypixelmode) {
/* 294 */                 if (swing) {
/* 295 */                   this.mc.thePlayer.swingItem();
/*     */                 } else {
/*     */                   
/* 298 */                   this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0APacketAnimation());
/*     */                 
/*     */                 }
/*     */               
/*     */               }
/*     */             }
/*     */           
/*     */           }
/* 306 */           else if (bpos == null) {
/* 307 */             boolean placed = false;
/* 308 */             for (BlockPos bpos2 : Lookutil.getAdjacent(targetpos)) {
/* 309 */               bpos = Lookutil.getBlockNextToPos(bpos2);
/* 310 */               face = Lookutil.getFacingNextToPos(bpos2);
/* 311 */               if (bpos != null) {
/* 312 */                 if (!this.timer.hasReached(15.0F)) {
/* 313 */                   placed = true;
/*     */                 }
/* 315 */                 if (!placed) {
/* 316 */                   this.timer.reset();
/* 317 */                   this.lastface = face;
/* 318 */                   this.lastpos = bpos;
/* 319 */                   if (rotate) {
/* 320 */                     Lookutil.lookAtBlockPacket(targetpos, face);
/* 321 */                     if (hypixelmode) {
/* 322 */                       Main.fakePitch = (float)(Main.fakePitch + Math.random() * 10.0D - 5.0D);
/* 323 */                       Main.fakePitch = MathHelper.clamp_float(Main.fakePitch, -90.0F, 90.0F);
/* 324 */                       Main.setFakeaim(Main.fakePitch, (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/*     */                     } 
/* 326 */                     if (aacmode && Moveutils.moveKeysDown())
/*     */                     {
/*     */ 
/*     */                       
/* 330 */                       Main.setFakeaim(Main.fakePitch, this.mc.thePlayer.rotationYaw % divider2 + (int)(Main.fakeYaw % 360.0F / divider2) * divider2);
/*     */                     }
/*     */                   } 
/*     */ 
/*     */ 
/*     */                   
/* 336 */                   Vec3 vec = this.mc.thePlayer.getPositionEyes(this.mc.timer.renderPartialTicks);
/* 337 */                   Vec3 vec1 = this.mc.thePlayer.getLookFakeaim(this.mc.timer.renderPartialTicks);
/* 338 */                   Vec3 vec2 = vec.addVector(vec1.xCoord * 4.0D, vec1.yCoord * 4.0D, vec1.zCoord * 4.0D);
/* 339 */                   MovingObjectPosition mop1 = this.mc.theWorld.rayTraceBlocks(vec, vec2);
/*     */                   
/* 341 */                   if (this.mc.playerController.onPlayerRightClick(this.mc.thePlayer, this.mc.theWorld, this.mc.thePlayer.getHeldItem(), bpos, face, (mop1 != null) ? mop1.hitVec : new Vec3(Math.random(), Math.random(), Math.random())) && 
/* 342 */                     !hypixelmode) {
/* 343 */                     if (swing) {
/* 344 */                       this.mc.thePlayer.swingItem();
/*     */                     } else {
/*     */                       
/* 347 */                       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0APacketAnimation());
/*     */                     } 
/*     */                   }
/*     */                   
/* 351 */                   placed = true;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/* 356 */           if (!Main.setmgr.getSettingByName("itemspoof").getValString().equalsIgnoreCase("switch"))
/* 357 */             this.mc.thePlayer.inventory.currentItem = heldslot; 
/* 358 */           if (Main.setmgr.getSettingByName("itemspoof").getValString() == "packet") {
/* 359 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C09PacketHeldItemChange(heldslot));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender(EventRenderGui e) {
/* 368 */     int blocks = 0;
/* 369 */     for (int i = 0; i < 9; i++) {
/* 370 */       ItemStack item = this.mc.thePlayer.inventory.getStackInSlot(i);
/* 371 */       if (item != null && item.getItem() != null && item.getItem() instanceof ItemBlock && ((ItemBlock)item.getItem()).getBlock().isFullCube()) {
/* 372 */         blocks += item.stackSize;
/*     */       }
/*     */     } 
/* 375 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 376 */     GuiIngame.drawRect(sr.getScaledWidth() / 2 - Fonts.MainFontRenderer.getStringWidth(String.valueOf(blocks) + " Block(s)") / 2 - 2, sr.getScaledHeight() / 2 + sr.getScaledHeight() / 50 - 2, sr.getScaledWidth() / 2 + Fonts.MainFontRenderer.getStringWidth(String.valueOf(blocks) + " Block(s)") / 2 + 2, sr.getScaledHeight() / 2 + sr.getScaledHeight() / 50 + Fonts.MainFontRenderer.getHeight() + 2, 1140850688);
/* 377 */     Fonts.MainFontRenderer.drawStringWithShadow(String.valueOf(blocks) + " Block(s)", (sr.getScaledWidth() / 2 - Fonts.MainFontRenderer.getStringWidth(String.valueOf(blocks) + " Block(s)") / 2), (sr.getScaledHeight() / 2 + sr.getScaledHeight() / 50), 16777215);
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onRender3d(EventRender3d e) {
/* 382 */     if (this.lastpos != null) {
/* 383 */       AxisAlignedBB bb = this.mc.theWorld.getBlockState(this.lastpos).getBlock().getCollisionBoundingBox((World)this.mc.theWorld, this.lastpos, this.mc.theWorld.getBlockState(this.lastpos));
/* 384 */       GL11.glLineWidth(1.0F);
/* 385 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
/* 386 */       Renderutils.drawOutlinedBox3d(bb);
/* 387 */       Color c = new Color(Colorutil.getChosenColor(0));
/* 388 */       GL11.glColor4f(c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, 0.4F);
/* 389 */       Renderutils.drawSolidBox3d(bb);
/*     */     } 
/* 391 */     boolean requiredistance = Main.setmgr.getSettingByName("requiredistance").getValBoolean();
/* 392 */     if (requiredistance) {
/* 393 */       GL11.glLineWidth(1.0F);
/* 394 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
/* 395 */       Renderutils.drawOutlinedBox3d(new AxisAlignedBB((this.mc.getRenderManager()).renderPosX - 0.4D, (this.mc.getRenderManager()).renderPosY, (this.mc.getRenderManager()).renderPosZ - 0.4D, (this.mc.getRenderManager()).renderPosX + 0.4D, (this.mc.getRenderManager()).renderPosY, (this.mc.getRenderManager()).renderPosZ + 0.4D));
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 401 */     boolean swing = Main.setmgr.getSettingByName("scaffold swing").getValBoolean();
/* 402 */     boolean hypixelmode = Main.setmgr.getSettingByName(this.name).getValString().equalsIgnoreCase("hypixel");
/* 403 */     boolean delayComplete = this.timerHypixel.isDelayComplete(Long.valueOf(30L));
/* 404 */     if (hypixelmode) {
/* 405 */       if (e.getPacket() instanceof net.minecraft.network.play.client.C02PacketUseEntity) {
/* 406 */         e.setCancelled(true);
/*     */       }
/* 408 */       if (e.getPacket() instanceof C08PacketPlayerBlockPlacement) {
/* 409 */         C08PacketPlayerBlockPlacement p = (C08PacketPlayerBlockPlacement)e.getPacket();
/* 410 */         if (p.getPlacedBlockDirection() != 255) {
/* 411 */           if (delayComplete) {
/* 412 */             this.timerHypixel.reset();
/* 413 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)p);
/* 414 */             if (swing) {
/* 415 */               this.mc.thePlayer.swingItem();
/*     */             } else {
/*     */               
/* 418 */               this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0APacketAnimation());
/*     */             } 
/* 420 */             e.setCancelled(true);
/*     */           } else {
/*     */             
/* 423 */             this.queue.add(p);
/* 424 */             e.setCancelled(true);
/*     */           } 
/*     */         }
/*     */       } 
/* 428 */       if (this.queue.size() > 0) {
/* 429 */         Packet p = this.queue.poll();
/* 430 */         if (p != null) {
/* 431 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent(p);
/* 432 */           if (swing) {
/* 433 */             this.mc.thePlayer.swingItem();
/*     */           } else {
/*     */             
/* 436 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0APacketAnimation());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Scaffold.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */