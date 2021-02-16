/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.util.Vec3i;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Lookutil
/*     */ {
/*     */   public static Float[] getLookAngles(Vec3 vec) {
/*  27 */     Float[] angles = new Float[2];
/*  28 */     Minecraft mc = Minecraft.getMinecraft();
/*  29 */     angles[0] = Float.valueOf((float)(Math.atan2(mc.thePlayer.posZ - vec.zCoord, mc.thePlayer.posX - vec.xCoord) / Math.PI * 180.0D) + 90.0F);
/*  30 */     float heightdiff = (float)(mc.thePlayer.posY + mc.thePlayer.getEyeHeight() - vec.yCoord);
/*  31 */     float distance = (float)Math.sqrt((mc.thePlayer.posZ - vec.zCoord) * (mc.thePlayer.posZ - vec.zCoord) + (mc.thePlayer.posX - vec.xCoord) * (mc.thePlayer.posX - vec.xCoord));
/*  32 */     angles[1] = Float.valueOf((float)(Math.atan2(heightdiff, distance) / Math.PI * 180.0D));
/*  33 */     return angles;
/*     */   }
/*     */   
/*     */   public static void lookAtPosPacket(Vec3 vec) {
/*  37 */     Float[] angles = getLookAngles(vec);
/*  38 */     Main.setFakeYaw(angles[0].floatValue());
/*  39 */     Main.setFakePitch(angles[1].floatValue());
/*     */   }
/*     */   
/*     */   public static boolean lookAtPacketSmooth(Vec3 vec, float maxyawchange, float maxpitchchange, boolean smartsmooth) {
/*  43 */     if (smartsmooth) {
/*  44 */       Float[] arrayOfFloat = getLookAngles(vec);
/*  45 */       float f = Math.abs(MathHelper.wrapAngleTo180_float(arrayOfFloat[0].floatValue() - Main.getFakeYaw())) / 6.0F;
/*  46 */       Main.setFakeYaw(clampF(arrayOfFloat[0].floatValue(), Main.getFakeYaw(), f * maxyawchange / 15.0F));
/*  47 */       Main.setFakePitch(clampF(arrayOfFloat[1].floatValue(), Main.getFakePitch(), maxpitchchange));
/*  48 */       arrayOfFloat = getLookAngles(vec);
/*  49 */       f = Math.abs(MathHelper.wrapAngleTo180_float(arrayOfFloat[0].floatValue() - Main.getFakeYaw())) / 2.0F;
/*  50 */       return (f < 20.0F);
/*     */     } 
/*     */     
/*  53 */     Float[] targetangles = getLookAngles(vec);
/*  54 */     Main.setFakeYaw(clampF(targetangles[0].floatValue(), Main.getFakeYaw(), maxyawchange));
/*  55 */     Main.setFakePitch(clampF(targetangles[1].floatValue(), Main.getFakePitch(), maxpitchchange));
/*  56 */     targetangles = getLookAngles(vec);
/*  57 */     float change = Math.abs(MathHelper.wrapAngleTo180_float(targetangles[0].floatValue() - Main.getFakeYaw())) / 2.0F;
/*  58 */     return (change < 20.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isLookingAt(Vec3 vec) {
/*  63 */     Float[] targetangles = getLookAngles(vec);
/*  64 */     targetangles = getLookAngles(vec);
/*  65 */     float change = Math.abs(MathHelper.wrapAngleTo180_float(targetangles[0].floatValue() - Main.getFakeYaw())) / 2.0F;
/*  66 */     return (change < 20.0F);
/*     */   }
/*     */   
/*     */   public static void lookAtPosSmooth(Vec3 vec, float maxyawchange, float maxpitchchange) {
/*  70 */     Minecraft mc = Minecraft.getMinecraft();
/*  71 */     Float[] targetangles = getLookAngles(vec);
/*  72 */     mc.thePlayer.rotationYaw = clampF(targetangles[0].floatValue(), mc.thePlayer.rotationYaw, maxyawchange);
/*  73 */     mc.thePlayer.rotationPitch = clampF(targetangles[1].floatValue(), mc.thePlayer.rotationPitch, maxpitchchange);
/*     */   }
/*     */   
/*     */   public static void lookAtPos(Vec3 vec) {
/*  77 */     Minecraft mc = Minecraft.getMinecraft();
/*  78 */     Float[] targetangles = getLookAngles(vec);
/*  79 */     mc.thePlayer.rotationYaw = targetangles[0].floatValue();
/*  80 */     mc.thePlayer.rotationPitch = targetangles[1].floatValue();
/*     */   }
/*     */   
/*     */   public static double getLookDiff(Vec3 vec) {
/*  84 */     Minecraft mc = Minecraft.getMinecraft();
/*  85 */     Float[] targetangles = getLookAngles(vec);
/*  86 */     return Math.sqrt(((mc.thePlayer.rotationYaw - targetangles[0].floatValue()) * (mc.thePlayer.rotationYaw - targetangles[0].floatValue()) + (mc.thePlayer.rotationPitch - targetangles[1].floatValue()) * (mc.thePlayer.rotationPitch - targetangles[1].floatValue())));
/*     */   }
/*     */   
/*     */   public static float clampF(float intended, float current, float maxchange) {
/*  90 */     float change = MathHelper.wrapAngleTo180_float(intended - current);
/*  91 */     if (change > maxchange) {
/*  92 */       change = maxchange;
/*     */     }
/*  94 */     else if (change < -maxchange) {
/*  95 */       change = -maxchange;
/*     */     } 
/*  97 */     return MathHelper.wrapAngleTo180_float(current + change);
/*     */   }
/*     */   
/*     */   public static float clampFPercentage(float intended, float current, float percentage) {
/* 101 */     float change = MathHelper.wrapAngleTo180_float(intended - current);
/* 102 */     return MathHelper.wrapAngleTo180_float(current + change * percentage);
/*     */   }
/*     */   
/*     */   public static void lookAtBlockPacket(BlockPos bpos, EnumFacing face) {
/* 106 */     Float[] angles = getLookAngles((new Vec3((Vec3i)bpos)).addVector(0.5D, 0.5D, 0.5D).addVector(face.getFrontOffsetX() * 0.5D, face.getFrontOffsetY() * 0.5D, face.getFrontOffsetZ() * 0.5D));
/* 107 */     Main.setFakeYaw(angles[0].floatValue());
/* 108 */     Main.setFakePitch(angles[1].floatValue());
/*     */   }
/*     */   
/*     */   public static void lookAtBlockPacketSmooth(BlockPos bpos, EnumFacing face, float maxyaw, float maxpitch) {
/* 112 */     Float[] targetangles = getLookAngles((new Vec3((Vec3i)bpos)).addVector(0.5D, 0.5D, 0.5D).addVector(face.getFrontOffsetX() * 0.5D, face.getFrontOffsetY() * 0.5D, face.getFrontOffsetZ() * 0.5D));
/* 113 */     Main.setFakeYaw(clampF(targetangles[0].floatValue(), Main.getFakeYaw(), maxyaw));
/* 114 */     Main.setFakePitch(clampF(targetangles[1].floatValue(), Main.getFakePitch(), maxpitch));
/*     */   }
/*     */   
/*     */   public static void lookAtBlockPacketSmooth(BlockPos bpos, EnumFacing face, float percentage) {
/* 118 */     Float[] targetangles = getLookAngles((new Vec3((Vec3i)bpos)).addVector(0.5D, 0.5D, 0.5D).addVector(face.getFrontOffsetX() * 0.5D, face.getFrontOffsetY() * 0.5D, face.getFrontOffsetZ() * 0.5D));
/* 119 */     Main.setFakeYaw(clampFPercentage(targetangles[0].floatValue(), Main.getFakeYaw(), percentage));
/* 120 */     Main.setFakePitch(targetangles[1].floatValue());
/*     */   }
/*     */   
/*     */   public static void lookAtAngleSmooth(float pitch, float yaw, float maxyaw, float maxpitch) {
/* 124 */     Main.setFakeYaw(clampF(yaw, Main.getFakeYaw(), maxyaw));
/* 125 */     Main.setFakePitch(clampF(pitch, Main.getFakePitch(), maxpitch));
/*     */   }
/*     */   
/*     */   public static void sendLookAtBlockPacket(BlockPos bpos, EnumFacing face) {
/* 129 */     Minecraft mc = Minecraft.getMinecraft();
/* 130 */     Float[] angles = getLookAngles((new Vec3((Vec3i)bpos)).addVector(0.5D, 0.5D, 0.5D).addVector(face.getFrontOffsetX() / 2.0D, face.getFrontOffsetY() / 2.0D, face.getFrontOffsetZ() / 2.0D));
/* 131 */     mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C05PacketPlayerLook(angles[0].floatValue(), angles[1].floatValue(), mc.thePlayer.onGround));
/*     */   }
/*     */   
/*     */   public static BlockPos getBlockNextToPos(BlockPos bpos) {
/* 135 */     Minecraft mc = Minecraft.getMinecraft();
/* 136 */     BlockPos output = null;
/* 137 */     if (mc.theWorld.getBlockState(bpos).getBlock() instanceof net.minecraft.block.BlockAir) {
/* 138 */       byte b; int i; EnumFacing[] arrayOfEnumFacing; for (i = (arrayOfEnumFacing = EnumFacing.values()).length, b = 0; b < i; ) { EnumFacing face = arrayOfEnumFacing[b];
/* 139 */         BlockPos neighbor = bpos.add(face.getFrontOffsetX(), face.getFrontOffsetY(), face.getFrontOffsetZ());
/* 140 */         if (!mc.theWorld.getBlockState(neighbor).getBlock().canPlaceBlockOnSide((World)mc.theWorld, neighbor, face.getOpposite()))
/* 141 */           output = neighbor; 
/*     */         b++; }
/*     */     
/*     */     } 
/* 145 */     return output;
/*     */   }
/*     */   
/*     */   public static EnumFacing getFacingNextToPos(BlockPos bpos) {
/* 149 */     Minecraft mc = Minecraft.getMinecraft();
/* 150 */     EnumFacing output = null;
/* 151 */     if (mc.theWorld.getBlockState(bpos).getBlock() instanceof net.minecraft.block.BlockAir) {
/* 152 */       byte b; int i; EnumFacing[] arrayOfEnumFacing; for (i = (arrayOfEnumFacing = EnumFacing.values()).length, b = 0; b < i; ) { EnumFacing face = arrayOfEnumFacing[b];
/* 153 */         BlockPos neighbor = bpos.add(face.getFrontOffsetX(), face.getFrontOffsetY(), face.getFrontOffsetZ());
/* 154 */         if (!mc.theWorld.getBlockState(neighbor).getBlock().canPlaceBlockOnSide((World)mc.theWorld, neighbor, face.getOpposite()))
/* 155 */           output = face.getOpposite(); 
/*     */         b++; }
/*     */     
/*     */     } 
/* 159 */     return output;
/*     */   }
/*     */   
/*     */   public static ArrayList<BlockPos> getAdjacent(BlockPos bpos) {
/* 163 */     return Lists.newArrayList((Object[])new BlockPos[] { 
/* 164 */           bpos.add(0, 0, 1), 
/* 165 */           bpos.add(0, 0, -1), 
/* 166 */           bpos.add(-1, 0, 0), 
/* 167 */           bpos.add(-1, 0, 0), 
/*     */           
/* 169 */           bpos.add(1, 0, 1), 
/* 170 */           bpos.add(1, 0, -1), 
/* 171 */           bpos.add(-1, 0, 1), 
/* 172 */           bpos.add(-1, 0, -1), 
/*     */           
/* 174 */           bpos.add(0, -1, 0), 
/*     */           
/* 176 */           bpos.add(0, -1, 1), 
/* 177 */           bpos.add(0, -1, -1), 
/* 178 */           bpos.add(-1, -1, 0), 
/* 179 */           bpos.add(-1, -1, 0), 
/*     */           
/* 181 */           bpos.add(1, -1, 1), 
/* 182 */           bpos.add(1, -1, -1), 
/* 183 */           bpos.add(-1, -1, 1), 
/* 184 */           bpos.add(-1, -1, -1) });
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Lookutil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */