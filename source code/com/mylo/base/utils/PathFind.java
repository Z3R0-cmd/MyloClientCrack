/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.entity.EntityPlayerSP;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.pathfinding.PathEntity;
/*     */ import net.minecraft.pathfinding.PathFinder;
/*     */ import net.minecraft.pathfinding.PathPoint;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.pathfinder.NodeProcessor;
/*     */ import net.minecraft.world.pathfinder.WalkNodeProcessor;
/*     */ 
/*     */ public class PathFind {
/*     */   public EntityPlayer pos;
/*     */   public PathFinder pathFinder;
/*     */   private float yaw;
/*     */   public static float fakeYaw;
/*     */   public static float fakePitch;
/*  26 */   private double dashDistance = 5.0D;
/*     */   
/*     */   public PathFind(EntityPlayer ent) {
/*  29 */     this.pathFinder = new PathFinder((NodeProcessor)new WalkNodeProcessor());
/*  30 */     this.pos = ent;
/*  31 */     if (this.pos != null) {
/*  32 */       move();
/*  33 */       float[] rot = getRotationTo(this.pos.getPositionVector());
/*  34 */       fakeYaw = rot[0];
/*  35 */       fakePitch = rot[1];
/*     */     } 
/*     */   }
/*     */   
/*     */   public void move() {
/*  40 */     if ((Minecraft.getMinecraft()).thePlayer.getDistance(this.pos.posX + 0.5D, this.pos.posY + 0.5D, this.pos.posZ + 0.5D) > 0.3D) {
/*  41 */       PathEntity pe = this.pathFinder.createEntityPathTo((IBlockAccess)(Minecraft.getMinecraft()).theWorld, (Entity)(Minecraft.getMinecraft()).thePlayer, (Entity)this.pos, 40.0F);
/*  42 */       if (pe != null && pe.getCurrentPathLength() > 1) {
/*  43 */         PathPoint point = pe.getPathPointFromIndex(1);
/*  44 */         float[] rot = getRotationTo(new Vec3(point.xCoord + 0.5D, point.yCoord + 0.5D, point.zCoord + 0.5D));
/*  45 */         this.yaw = rot[0];
/*  46 */         EntityPlayerSP player = (Minecraft.getMinecraft()).thePlayer;
/*  47 */         EntityPlayerSP player2 = (Minecraft.getMinecraft()).thePlayer;
/*  48 */         double n = 0.0D;
/*  49 */         player2.motionZ = 0.0D;
/*  50 */         player.motionX = 0.0D;
/*  51 */         double offset = 0.26D;
/*  52 */         double newx = Math.sin((this.yaw * 3.1415927F / 180.0F)) * 0.26D;
/*  53 */         double newz = Math.cos((this.yaw * 3.1415927F / 180.0F)) * 0.26D;
/*  54 */         EntityPlayerSP player3 = (Minecraft.getMinecraft()).thePlayer;
/*  55 */         player3.motionX -= newx;
/*  56 */         EntityPlayerSP player4 = (Minecraft.getMinecraft()).thePlayer;
/*  57 */         player4.motionZ += newz;
/*  58 */         if ((Minecraft.getMinecraft()).thePlayer.onGround && (Minecraft.getMinecraft()).thePlayer.isCollidedHorizontally) {
/*  59 */           (Minecraft.getMinecraft()).thePlayer.jump();
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static float angleDifference(float to, float from) {
/*  66 */     return ((to - from) % 360.0F + 540.0F) % 360.0F - 180.0F;
/*     */   }
/*     */   
/*     */   public float[] getRotationTo(Vec3 pos) {
/*  70 */     double xD = (Minecraft.getMinecraft()).thePlayer.posX - pos.xCoord;
/*  71 */     double yD = (Minecraft.getMinecraft()).thePlayer.posY + (Minecraft.getMinecraft()).thePlayer.getEyeHeight() - pos.yCoord;
/*  72 */     double zD = (Minecraft.getMinecraft()).thePlayer.posZ - pos.zCoord;
/*  73 */     double yaw = Math.atan2(zD, xD);
/*  74 */     double pitch = Math.atan2(yD, Math.sqrt(Math.pow(xD, 2.0D) + Math.pow(zD, 2.0D)));
/*  75 */     return new float[] { (float)Math.toDegrees(yaw) + 90.0F, (float)Math.toDegrees(pitch) };
/*     */   }
/*     */   
/*     */   public static ArrayList<Vec3> computePath(Vec3 topFrom, Vec3 to, double dashDistance, boolean needsToWalk) {
/*  79 */     if (!canPassThrow(new BlockPos(topFrom))) {
/*  80 */       topFrom = topFrom.addVector(0.0D, 1.0D, 0.0D);
/*     */     }
/*  82 */     AStarCustomPathFinder pathfinder = new AStarCustomPathFinder(topFrom, to);
/*     */     
/*  84 */     pathfinder.compute(200, 4, needsToWalk);
/*     */     
/*  86 */     int i = 0;
/*  87 */     Vec3 lastLoc = null;
/*  88 */     Vec3 lastDashLoc = null;
/*  89 */     ArrayList<Vec3> path = new ArrayList<>();
/*  90 */     ArrayList<Vec3> pathFinderPath = pathfinder.getPath();
/*  91 */     for (Vec3 pathElm : pathFinderPath) {
/*  92 */       if (i == 0 || i == pathFinderPath.size() - 1) {
/*  93 */         if (lastLoc != null) {
/*  94 */           path.add(lastLoc.addVector(0.5D, 0.0D, 0.5D));
/*     */         }
/*  96 */         path.add(pathElm.addVector(0.5D, 0.0D, 0.5D));
/*  97 */         lastDashLoc = pathElm;
/*     */       } else {
/*  99 */         boolean canContinue = true;
/* 100 */         if (pathElm.squareDistanceTo(lastDashLoc) > dashDistance * dashDistance) {
/* 101 */           canContinue = false;
/*     */         } else {
/* 103 */           double smallX = Math.min(lastDashLoc.xCoord, pathElm.xCoord);
/* 104 */           double smallY = Math.min(lastDashLoc.yCoord, pathElm.yCoord);
/* 105 */           double smallZ = Math.min(lastDashLoc.zCoord, pathElm.zCoord);
/* 106 */           double bigX = Math.max(lastDashLoc.xCoord, pathElm.xCoord);
/* 107 */           double bigY = Math.max(lastDashLoc.yCoord, pathElm.yCoord);
/* 108 */           double bigZ = Math.max(lastDashLoc.zCoord, pathElm.zCoord);
/*     */           int x;
/* 110 */           label40: for (x = (int)smallX; x <= bigX; x++) {
/* 111 */             for (int y = (int)smallY; y <= bigY; y++) {
/* 112 */               for (int z = (int)smallZ; z <= bigZ; z++) {
/* 113 */                 if (!AStarCustomPathFinder.checkPositionValidity(x, y, z, needsToWalk)) {
/* 114 */                   canContinue = false;
/*     */                   break label40;
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/* 121 */         if (!canContinue) {
/* 122 */           path.add(lastLoc.addVector(0.5D, 0.0D, 0.5D));
/* 123 */           lastDashLoc = lastLoc;
/*     */         } 
/*     */       } 
/* 126 */       lastLoc = pathElm;
/* 127 */       i++;
/*     */     } 
/* 129 */     return path;
/*     */   }
/*     */   
/*     */   private static boolean canPassThrow(BlockPos pos) {
/* 133 */     Block block = (Minecraft.getMinecraft()).theWorld.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ())).getBlock();
/* 134 */     return !(block.getMaterial() != Material.air && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine && block != Blocks.ladder && block != Blocks.water && block != Blocks.flowing_water && block != Blocks.wall_sign && block != Blocks.standing_sign);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/PathFind.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */