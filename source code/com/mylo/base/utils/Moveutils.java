/*     */ package com.mylo.base.utils;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.entity.EntityPlayerSP;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.network.play.client.C09PacketHeldItemChange;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.util.MovementInput;
/*     */ import net.minecraft.util.Vec3;
/*     */ 
/*     */ public class Moveutils {
/*  19 */   private static final List<Double> CHECKS = new ArrayList<>();
/*     */   
/*     */   public static final double AIR_FRICTION = 0.02D;
/*     */   public static final double BUNNY_HOP_FRICTION = 160.0D;
/*     */   
/*     */   public static double calculateFriction(double moveSpeed, double lastDist, boolean damaged) {
/*  25 */     CHECKS.clear();
/*     */     
/*  27 */     CHECKS.add(Double.valueOf(lastDist - lastDist / 160.0D));
/*  28 */     CHECKS.add(Double.valueOf(lastDist - (moveSpeed - lastDist) / 33.3D));
/*  29 */     CHECKS.add(Double.valueOf(lastDist - getBaseMoveSpeed() * 0.02D));
/*     */     
/*  31 */     Collections.sort(CHECKS);
/*     */     
/*  33 */     return ((Double)CHECKS.get(damaged ? 1 : 0)).doubleValue() - 1.0E-5D;
/*     */   }
/*     */   
/*     */   public static double getXDir() {
/*  37 */     Minecraft mc = Minecraft.getMinecraft();
/*  38 */     double rot = Math.atan2(mc.thePlayer.moveForward, mc.thePlayer.moveStrafing) / Math.PI * 180.0D;
/*  39 */     if (rot == 0.0D && mc.thePlayer.moveStrafing == 0.0F)
/*  40 */       rot = 90.0D; 
/*  41 */     rot += mc.thePlayer.rotationYaw;
/*  42 */     if (!moveKeysDown())
/*  43 */       return 0.0D; 
/*  44 */     return Math.cos(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static double getZDir() {
/*  48 */     Minecraft mc = Minecraft.getMinecraft();
/*  49 */     double rot = Math.atan2(mc.thePlayer.moveForward, mc.thePlayer.moveStrafing) / Math.PI * 180.0D;
/*  50 */     if (rot == 0.0D && mc.thePlayer.moveStrafing == 0.0F)
/*  51 */       rot = 90.0D; 
/*  52 */     rot += mc.thePlayer.rotationYaw;
/*  53 */     if (!moveKeysDown())
/*  54 */       return 0.0D; 
/*  55 */     return Math.sin(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static double getXDirForward() {
/*  59 */     Minecraft mc = Minecraft.getMinecraft();
/*  60 */     double rot = 90.0D;
/*  61 */     rot += mc.thePlayer.rotationYaw;
/*  62 */     return Math.cos(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static double getZDirForward() {
/*  66 */     Minecraft mc = Minecraft.getMinecraft();
/*  67 */     double rot = 90.0D;
/*  68 */     rot += mc.thePlayer.rotationYaw;
/*  69 */     return Math.sin(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static double getXDirRight() {
/*  73 */     Minecraft mc = Minecraft.getMinecraft();
/*  74 */     double rot = 180.0D;
/*  75 */     rot += mc.thePlayer.rotationYaw;
/*  76 */     return Math.cos(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static double getZDirRight() {
/*  80 */     Minecraft mc = Minecraft.getMinecraft();
/*  81 */     double rot = 180.0D;
/*  82 */     rot += mc.thePlayer.rotationYaw;
/*  83 */     return Math.sin(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static void setSpeed(double speed) {
/*  87 */     Minecraft mc = Minecraft.getMinecraft();
/*  88 */     if (mc.thePlayer.moveForward != 0.0F || mc.thePlayer.moveStrafing != 0.0F) {
/*  89 */       mc.thePlayer.motionX = speed * getXDir();
/*  90 */       mc.thePlayer.motionZ = speed * getZDir();
/*     */     } else {
/*     */       
/*  93 */       mc.thePlayer.motionX = 0.0D;
/*  94 */       mc.thePlayer.motionZ = 0.0D;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void addSpeed(double speed) {
/*  99 */     Minecraft mc = Minecraft.getMinecraft();
/* 100 */     if (mc.thePlayer.moveForward != 0.0F || mc.thePlayer.moveStrafing != 0.0F) {
/* 101 */       mc.thePlayer.motionX += speed * getXDir();
/* 102 */       mc.thePlayer.motionZ += speed * getZDir();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void setMoveSpeed(EventMove e, double moveSpeed) {
/* 107 */     Minecraft mc = Minecraft.getMinecraft();
/* 108 */     if (mc.thePlayer.moveForward != 0.0F || mc.thePlayer.moveStrafing != 0.0F) {
/* 109 */       e.setX(getXDir() * moveSpeed);
/* 110 */       e.setZ(getZDir() * moveSpeed);
/*     */     } else {
/*     */       
/* 113 */       e.setX(0.0D);
/* 114 */       e.setZ(0.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static double getMoveSpeed(EventMove e) {
/* 119 */     Minecraft mc = Minecraft.getMinecraft();
/* 120 */     double xspeed = e.x;
/* 121 */     double zspeed = e.z;
/* 122 */     return Math.sqrt(xspeed * xspeed + zspeed * zspeed);
/*     */   }
/*     */   
/*     */   public static boolean moveKeysDown() {
/* 126 */     Minecraft mc = Minecraft.getMinecraft();
/* 127 */     return !(mc.thePlayer.movementInput.moveForward == 0.0F && mc.thePlayer.movementInput.moveStrafe == 0.0F);
/*     */   }
/*     */   
/*     */   public static boolean canStep(double stepHeight) {
/* 131 */     Minecraft mc = Minecraft.getMinecraft();
/* 132 */     boolean canstep = false;
/* 133 */     AxisAlignedBB bbX = mc.thePlayer.getEntityBoundingBox().offset(0.0D, 0.05D, 0.0D).expand(0.05D, 0.05D, 0.0D);
/* 134 */     AxisAlignedBB bbZ = mc.thePlayer.getEntityBoundingBox().offset(0.0D, 0.05D, 0.0D).expand(0.0D, 0.05D, 0.05D);
/* 135 */     AxisAlignedBB bbXsmol = mc.thePlayer.getEntityBoundingBox().offset(0.0D, 0.1D, 0.0D).expand(0.05D, 0.05D, -0.05D);
/* 136 */     AxisAlignedBB bbZsmol = mc.thePlayer.getEntityBoundingBox().offset(0.0D, 0.1D, 0.0D).expand(-0.05D, 0.05D, 0.05D);
/* 137 */     List<AxisAlignedBB> bbsX = mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, bbX.offset(0.0D, stepHeight, 0.0D));
/* 138 */     List<AxisAlignedBB> bbsZ = mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, bbZ.offset(0.0D, stepHeight, 0.0D));
/* 139 */     List<AxisAlignedBB> bbsXlow = mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, bbX);
/* 140 */     List<AxisAlignedBB> bbsZlow = mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, bbZ);
/*     */     
/* 142 */     AxisAlignedBB mcbb = mc.thePlayer.getEntityBoundingBox().contract(0.05D, 0.0D, 0.05D);
/* 143 */     List<AxisAlignedBB> blacklistbbs = mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, mcbb.addCoord(0.0D, stepHeight, 0.0D));
/* 144 */     if ((blacklistbbs.isEmpty() && bbsX.isEmpty() && !bbsXlow.isEmpty()) || (bbsZ.isEmpty() && !bbsZlow.isEmpty())) {
/* 145 */       canstep = true;
/*     */     }
/* 147 */     return canstep;
/*     */   }
/*     */   
/*     */   public static double getXDirAt(float angle) {
/* 151 */     Minecraft mc = Minecraft.getMinecraft();
/* 152 */     double rot = 90.0D;
/* 153 */     rot += angle;
/* 154 */     return Math.cos(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static double getZDirAt(float angle) {
/* 158 */     Minecraft mc = Minecraft.getMinecraft();
/* 159 */     double rot = 90.0D;
/* 160 */     rot += angle;
/* 161 */     return Math.sin(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static void setSpeedAt(float angle, double speed) {
/* 165 */     Minecraft mc = Minecraft.getMinecraft();
/* 166 */     mc.thePlayer.motionX = getXDirAt(angle) * speed;
/* 167 */     mc.thePlayer.motionZ = getZDirAt(angle) * speed;
/*     */   }
/*     */   
/*     */   public static void setSpeedAt(EventMove e, float angle, double speed) {
/* 171 */     Minecraft mc = Minecraft.getMinecraft();
/* 172 */     e.setX(getXDirAt(angle) * speed);
/* 173 */     e.setZ(getZDirAt(angle) * speed);
/*     */   }
/*     */   
/*     */   public static void setMoveSpeed2(EventMove event, double moveSpeed) {
/* 177 */     Minecraft mc = Minecraft.getMinecraft();
/* 178 */     MovementInput movementInput = mc.thePlayer.movementInput;
/* 179 */     double moveForward = movementInput.moveForward;
/* 180 */     double moveStrafe = movementInput.moveStrafe;
/* 181 */     double yaw = mc.thePlayer.rotationYaw;
/* 182 */     if (moveForward == 0.0D && moveStrafe == 0.0D) {
/* 183 */       event.setX(0.0D);
/* 184 */       event.setZ(0.0D);
/*     */     } else {
/* 186 */       if (moveStrafe > 0.0D) {
/* 187 */         moveStrafe = 1.0D;
/* 188 */       } else if (moveStrafe < 0.0D) {
/* 189 */         moveStrafe = -1.0D;
/*     */       } 
/* 191 */       if (moveForward != 0.0D) {
/* 192 */         if (moveStrafe > 0.0D) {
/* 193 */           yaw += ((moveForward > 0.0D) ? -45 : 45);
/* 194 */         } else if (moveStrafe < 0.0D) {
/* 195 */           yaw += ((moveForward > 0.0D) ? 45 : -45);
/*     */         } 
/* 197 */         moveStrafe = 0.0D;
/* 198 */         if (moveForward > 0.0D) {
/* 199 */           moveForward = 1.0D;
/* 200 */         } else if (moveForward < 0.0D) {
/* 201 */           moveForward = -1.0D;
/*     */         } 
/*     */       } 
/* 204 */       double cos = Math.cos(Math.toRadians(yaw + 90.0D));
/* 205 */       double sin = Math.sin(Math.toRadians(yaw + 90.0D));
/* 206 */       event.setX(moveForward * moveSpeed * cos + 
/* 207 */           moveStrafe * moveSpeed * sin);
/* 208 */       event.setZ(moveForward * moveSpeed * sin - 
/* 209 */           moveStrafe * moveSpeed * cos);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static double getPlayerMoveDir() {
/* 214 */     Minecraft mc = Minecraft.getMinecraft();
/* 215 */     double xspeed = mc.thePlayer.motionX;
/* 216 */     double zspeed = mc.thePlayer.motionZ;
/* 217 */     double direction = Math.atan2(xspeed, zspeed) / Math.PI * 180.0D;
/* 218 */     return -direction;
/*     */   }
/*     */   
/*     */   public static double getPressedMoveDir() {
/* 222 */     Minecraft mc = Minecraft.getMinecraft();
/* 223 */     double rot = Math.atan2(mc.thePlayer.moveForward, mc.thePlayer.moveStrafing) / Math.PI * 180.0D;
/* 224 */     if (rot == 0.0D && mc.thePlayer.moveStrafing == 0.0F)
/* 225 */       rot = 90.0D; 
/* 226 */     rot += mc.thePlayer.rotationYaw;
/* 227 */     return rot - 90.0D;
/*     */   }
/*     */   
/*     */   public static double getJumpMotion() {
/* 231 */     Minecraft mc = Minecraft.getMinecraft();
/* 232 */     double oldMotion = mc.thePlayer.motionY;
/* 233 */     double oldX = mc.thePlayer.motionX;
/* 234 */     double oldZ = mc.thePlayer.motionZ;
/* 235 */     mc.thePlayer.jump();
/* 236 */     double jumpMotion = mc.thePlayer.motionY;
/* 237 */     mc.thePlayer.motionY = oldMotion;
/* 238 */     mc.thePlayer.motionX = oldX;
/* 239 */     mc.thePlayer.motionZ = oldZ;
/* 240 */     return jumpMotion;
/*     */   }
/*     */   
/*     */   public static boolean clickGround() {
/* 244 */     if (airSlot() != -10) {
/* 245 */       Minecraft mc = Minecraft.getMinecraft();
/* 246 */       int oldSlot = mc.thePlayer.inventory.currentItem;
/* 247 */       mc.thePlayer.inventory.currentItem = airSlot();
/* 248 */       BlockPos blockPos = new BlockPos(mc.thePlayer.posX, (mc.thePlayer.getEntityBoundingBox()).minY - 1.0D, mc.thePlayer.posZ);
/* 249 */       Vec3 vec = (new Vec3((Vec3i)blockPos)).addVector(0.4000000059604645D, 0.4000000059604645D, 0.4000000059604645D).add(new Vec3(EnumFacing.UP.getDirectionVec()));
/* 250 */       mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, null, blockPos, EnumFacing.UP, new Vec3(vec.xCoord * 0.4000000059604645D, vec.yCoord * 0.4000000059604645D, vec.zCoord * 0.4000000059604645D));
/*     */       
/* 252 */       mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C09PacketHeldItemChange(airSlot()));
/* 253 */       mc.thePlayer.inventory.currentItem = oldSlot;
/* 254 */       return true;
/*     */     } 
/* 256 */     return false;
/*     */   }
/*     */   
/*     */   public static float getMinFallDamageDist() {
/* 260 */     Minecraft mc = Minecraft.getMinecraft();
/* 261 */     int f = 0;
/* 262 */     if (mc.thePlayer.isPotionActive(Potion.jump)) {
/* 263 */       f += mc.thePlayer.getActivePotionEffect(Potion.jump).getAmplifier() + 1;
/*     */     }
/*     */     
/* 266 */     return 3.0F + f;
/*     */   }
/*     */   
/*     */   public static void damage() {
/* 270 */     Minecraft mc = Minecraft.getMinecraft();
/*     */     
/* 272 */     double offset = 0.05999999865889549D;
/*     */     
/* 274 */     EntityPlayerSP player = mc.thePlayer;
/*     */     
/* 276 */     for (int i = 0; i < Math.ceil(getMinFallDamageDist() / 0.05999999865889549D); i++) {
/* 277 */       mc.getNetHandler().addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(player.posX, 
/* 278 */             player.posY + 0.05999999865889549D + 7.999999797903001E-4D, player.posZ, false));
/*     */       
/* 280 */       mc.getNetHandler().addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(player.posX, 
/* 281 */             player.posY, player.posZ, false));
/*     */     } 
/*     */     
/* 284 */     mc.getNetHandler().addToSendQueueSilent((Packet)new C03PacketPlayer(true));
/*     */   }
/*     */   
/*     */   public static double getPressedMoveDirSemi() {
/* 288 */     Minecraft mc = Minecraft.getMinecraft();
/*     */     
/* 290 */     float moveForward = mc.thePlayer.moveForward;
/* 291 */     float moveStrafing = mc.thePlayer.moveStrafing;
/* 292 */     if (moveForward != 0.0F) {
/* 293 */       moveStrafing = 0.0F;
/*     */     }
/* 295 */     double rot = Math.atan2(moveForward, moveStrafing) / Math.PI * 180.0D;
/*     */     
/* 297 */     if (rot == 0.0D && mc.thePlayer.moveStrafing == 0.0F)
/* 298 */       rot = 90.0D; 
/* 299 */     rot += mc.thePlayer.rotationYaw;
/* 300 */     return rot - 90.0D;
/*     */   }
/*     */   
/*     */   public static double getPlayerSpeed() {
/* 304 */     Minecraft mc = Minecraft.getMinecraft();
/* 305 */     double xspeed = mc.thePlayer.motionX;
/* 306 */     double zspeed = mc.thePlayer.motionZ;
/* 307 */     return Math.sqrt(xspeed * xspeed + zspeed * zspeed);
/*     */   }
/*     */   
/*     */   public static double getPlayerAbsoluteSpeed() {
/* 311 */     Minecraft mc = Minecraft.getMinecraft();
/* 312 */     double xDist = mc.thePlayer.posX - mc.thePlayer.lastTickPosX;
/* 313 */     double zDist = mc.thePlayer.posZ - mc.thePlayer.lastTickPosZ;
/* 314 */     return Math.sqrt(xDist * xDist + zDist * zDist);
/*     */   }
/*     */   
/*     */   public static boolean isInBlock() {
/* 318 */     Minecraft mc = Minecraft.getMinecraft();
/* 319 */     List<AxisAlignedBB> bbs = mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, mc.thePlayer.getEntityBoundingBox().contract(0.05D, 0.05D, 0.05D));
/* 320 */     return !bbs.isEmpty();
/*     */   }
/*     */   
/*     */   public static double getBaseMoveSpeed() {
/* 324 */     double baseSpeed = 0.2873D;
/* 325 */     Minecraft mc = Minecraft.getMinecraft();
/* 326 */     if (mc.thePlayer != null && mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
/* 327 */       int amplifier = mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
/* 328 */       baseSpeed *= 1.0D + 0.2D * (amplifier + 1);
/*     */     } 
/* 330 */     return baseSpeed;
/*     */   }
/*     */   
/*     */   public static int airSlot() {
/* 334 */     Minecraft mc = Minecraft.getMinecraft();
/* 335 */     for (int j = 0; j < 9; j++) {
/* 336 */       if (mc.thePlayer.inventory.mainInventory[j] == null) {
/* 337 */         return j;
/*     */       }
/*     */     } 
/* 340 */     return -10;
/*     */   }
/*     */   
/*     */   public static double getYDirForward() {
/* 344 */     Minecraft mc = Minecraft.getMinecraft();
/* 345 */     double rot = 90.0D;
/* 346 */     rot += mc.thePlayer.rotationPitch;
/* 347 */     return Math.cos(rot * Math.PI / 180.0D);
/*     */   }
/*     */   
/*     */   public static void packetJump(Boolean onGround) {
/* 351 */     Minecraft mc = Minecraft.getMinecraft();
/* 352 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + getJumpMotion(), mc.thePlayer.posZ, false));
/* 353 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 0.75320000648499D, mc.thePlayer.posZ, false));
/* 354 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 1.00133601766969D, mc.thePlayer.posZ, false));
/* 355 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 1.16610931183763D, mc.thePlayer.posZ, false));
/* 356 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 1.24918714173913D, mc.thePlayer.posZ, false));
/* 357 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 1.17078714021325D, mc.thePlayer.posZ, false));
/* 358 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 1.01555513569664D, mc.thePlayer.posZ, false));
/* 359 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 0.78502776678368D, mc.thePlayer.posZ, false));
/* 360 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 0.48071093932614D, mc.thePlayer.posZ, false));
/* 361 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY + 0.10408044108749D, mc.thePlayer.posZ, false));
/* 362 */     mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ, onGround.booleanValue()));
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Moveutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */