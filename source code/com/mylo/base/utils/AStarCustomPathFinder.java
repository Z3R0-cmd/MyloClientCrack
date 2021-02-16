/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.Vec3;
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
/*     */ public class AStarCustomPathFinder
/*     */ {
/*     */   private Vec3 startVec3;
/*     */   private Vec3 endVec3;
/*  36 */   private ArrayList<Vec3> path = new ArrayList<>();
/*  37 */   private ArrayList<Hub> hubs = new ArrayList<>();
/*  38 */   private ArrayList<Hub> hubsToWork = new ArrayList<>();
/*  39 */   private double minDistanceSquared = 9.0D;
/*     */   
/*     */   private boolean nearest = true;
/*  42 */   private static Vec3[] flatCardinalDirections = new Vec3[] {
/*  43 */       new Vec3(1.0D, 0.0D, 0.0D), 
/*  44 */       new Vec3(-1.0D, 0.0D, 0.0D), 
/*  45 */       new Vec3(0.0D, 0.0D, 1.0D), 
/*  46 */       new Vec3(0.0D, 0.0D, -1.0D)
/*     */     };
/*     */   
/*     */   private static List<Vec3> flatCardinalDirectionsPlus() {
/*  50 */     List<Vec3> dirs = new ArrayList<>(); byte b; int i; Vec3[] arrayOfVec3;
/*  51 */     for (i = (arrayOfVec3 = flatCardinalDirectionsPlus).length, b = 0; b < i; ) { Vec3 vec = arrayOfVec3[b];
/*  52 */       dirs.add(vec); b++; }
/*     */     
/*  54 */     Minecraft mc = Minecraft.getMinecraft();
/*  55 */     if (mc.thePlayer.onGround) {
/*  56 */       dirs.add(new Vec3(1.0D, 1.0D, 0.0D));
/*  57 */       dirs.add(new Vec3(-1.0D, 1.0D, 0.0D));
/*  58 */       dirs.add(new Vec3(0.0D, 1.0D, 1.0D));
/*  59 */       dirs.add(new Vec3(0.0D, 1.0D, -1.0D));
/*  60 */       dirs.add(new Vec3(0.0D, 1.0D, 0.0D));
/*  61 */       dirs.add(new Vec3(1.0D, -1.0D, 0.0D));
/*  62 */       dirs.add(new Vec3(-1.0D, -1.0D, 0.0D));
/*  63 */       dirs.add(new Vec3(0.0D, -1.0D, 1.0D));
/*  64 */       dirs.add(new Vec3(0.0D, -1.0D, -1.0D));
/*     */     } 
/*  66 */     return dirs;
/*     */   }
/*     */   
/*  69 */   private static Vec3[] flatCardinalDirectionsPlus = new Vec3[] {
/*  70 */       new Vec3(1.0D, 0.0D, 0.0D), 
/*  71 */       new Vec3(-1.0D, 0.0D, 0.0D), 
/*  72 */       new Vec3(0.0D, 0.0D, 1.0D), 
/*  73 */       new Vec3(0.0D, 0.0D, -1.0D)
/*     */     };
/*     */   
/*     */   public AStarCustomPathFinder(Vec3 startVec3, Vec3 endVec3) {
/*  77 */     this.startVec3 = startVec3.addVector(0.0D, 0.0D, 0.0D).floor();
/*  78 */     this.endVec3 = endVec3.addVector(0.0D, 0.0D, 0.0D).floor();
/*     */   }
/*     */   
/*     */   public ArrayList<Vec3> getPath() {
/*  82 */     return this.path;
/*     */   }
/*     */   
/*     */   public void compute(boolean needsToWalk) {
/*  86 */     compute(1000, 4, needsToWalk);
/*     */   }
/*     */   
/*     */   public void compute(int loops, int depth, boolean needsToWalk) {
/*  90 */     this.path.clear();
/*  91 */     this.hubsToWork.clear();
/*  92 */     ArrayList<Vec3> initPath = new ArrayList<>();
/*  93 */     initPath.add(this.startVec3);
/*  94 */     this.hubsToWork.add(new Hub(this.startVec3, null, initPath, this.startVec3.squareDistanceTo(this.endVec3), 0.0D, 0.0D));
/*     */     int i;
/*  96 */     label50: for (i = 0; i < loops; i++) {
/*  97 */       Collections.sort(this.hubsToWork, new CompareHub());
/*  98 */       int j = 0;
/*  99 */       if (this.hubsToWork.size() == 0) {
/*     */         break;
/*     */       }
/* 102 */       for (Hub hub : new ArrayList(this.hubsToWork)) {
/* 103 */         j++;
/* 104 */         if (j > depth) {
/*     */           break;
/*     */         }
/* 107 */         this.hubsToWork.remove(hub);
/* 108 */         this.hubs.add(hub);
/*     */         
/* 110 */         if (needsToWalk) {
/* 111 */           for (Vec3 direction : flatCardinalDirectionsPlus()) {
/* 112 */             Vec3 loc = hub.getLoc().add(direction).floor();
/* 113 */             if (checkPositionValidity(loc, needsToWalk) && 
/* 114 */               addHub(hub, loc, 0.0D))
/*     */               break label50; 
/*     */           } 
/*     */         } else {
/*     */           byte b;
/*     */           int k;
/*     */           Vec3[] arrayOfVec3;
/* 121 */           for (k = (arrayOfVec3 = flatCardinalDirections).length, b = 0; b < k; ) { Vec3 direction = arrayOfVec3[b];
/* 122 */             Vec3 loc = hub.getLoc().add(direction).floor();
/* 123 */             if (checkPositionValidity(loc, needsToWalk) && 
/* 124 */               addHub(hub, loc, 0.0D)) {
/*     */               break label50;
/*     */             }
/*     */             
/*     */             b++; }
/*     */         
/*     */         } 
/* 131 */         Vec3 loc1 = hub.getLoc().addVector(0.0D, 1.0D, 0.0D).floor();
/* 132 */         if (checkPositionValidity(loc1, needsToWalk) && 
/* 133 */           addHub(hub, loc1, 0.0D)) {
/*     */           break label50;
/*     */         }
/*     */ 
/*     */         
/* 138 */         Vec3 loc2 = hub.getLoc().addVector(0.0D, -1.0D, 0.0D).floor();
/* 139 */         if (checkPositionValidity(loc2, false) && 
/* 140 */           addHub(hub, loc2, 0.0D)) {
/*     */           break label50;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 147 */     if (this.nearest) {
/* 148 */       Collections.sort(this.hubs, new CompareHub());
/* 149 */       this.path = ((Hub)this.hubs.get(0)).getPath();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean checkPositionValidity(Vec3 loc, boolean checkGround) {
/* 154 */     return checkPositionValidity((int)loc.xCoord, (int)loc.yCoord, (int)loc.zCoord, checkGround);
/*     */   }
/*     */   
/*     */   public static boolean checkPositionValidity(int x, int y, int z, boolean checkGround) {
/* 158 */     BlockPos block1 = new BlockPos(x, y, z);
/* 159 */     BlockPos block2 = new BlockPos(x, y + 1, z);
/* 160 */     BlockPos block3 = new BlockPos(x, y - 1, z);
/* 161 */     return (!isBlockSolid(block1) && !isBlockSolid(block2) && (isBlockSolid(block3) || !checkGround) && isSafeToWalkOn(block3));
/*     */   }
/*     */   
/*     */   private static boolean isBlockSolid(BlockPos block) {
/* 165 */     return !((Minecraft.getMinecraft()).theWorld.getBlockState(block).getBlock() instanceof net.minecraft.block.BlockAir);
/*     */   }
/*     */   
/*     */   private static boolean isSafeToWalkOn(BlockPos block) {
/* 169 */     return (!((Minecraft.getMinecraft()).theWorld.getBlockState(new BlockPos(block.getX(), block.getY(), block.getZ())) instanceof net.minecraft.block.BlockFence) && 
/* 170 */       !((Minecraft.getMinecraft()).theWorld.getBlockState(new BlockPos(block.getX(), block.getY(), block.getZ())) instanceof net.minecraft.block.BlockWall));
/*     */   }
/*     */   
/*     */   public Hub isHubExisting(Vec3 loc) {
/* 174 */     for (Hub hub : this.hubs) {
/* 175 */       if ((hub.getLoc()).xCoord == loc.xCoord && (hub.getLoc()).yCoord == loc.yCoord && (hub.getLoc()).zCoord == loc.zCoord) {
/* 176 */         return hub;
/*     */       }
/*     */     } 
/* 179 */     for (Hub hub : this.hubsToWork) {
/* 180 */       if ((hub.getLoc()).xCoord == loc.xCoord && (hub.getLoc()).yCoord == loc.yCoord && (hub.getLoc()).zCoord == loc.zCoord) {
/* 181 */         return hub;
/*     */       }
/*     */     } 
/* 184 */     return null;
/*     */   }
/*     */   
/*     */   public boolean addHub(Hub parent, Vec3 loc, double cost) {
/* 188 */     Hub existingHub = isHubExisting(loc);
/* 189 */     double totalCost = cost;
/* 190 */     if (parent != null) {
/* 191 */       totalCost += parent.getTotalCost();
/*     */     }
/* 193 */     if (existingHub == null) {
/* 194 */       if ((loc.xCoord == this.endVec3.xCoord && loc.yCoord == this.endVec3.yCoord && loc.zCoord == this.endVec3.zCoord) || (this.minDistanceSquared != 0.0D && loc.squareDistanceTo(this.endVec3) <= this.minDistanceSquared)) {
/* 195 */         this.path.clear();
/* 196 */         this.path = parent.getPath();
/* 197 */         this.path.add(loc);
/* 198 */         return true;
/*     */       } 
/* 200 */       ArrayList<Vec3> path = new ArrayList<>(parent.getPath());
/* 201 */       path.add(loc);
/* 202 */       this.hubsToWork.add(new Hub(loc, parent, path, loc.squareDistanceTo(this.endVec3), cost, totalCost));
/*     */     }
/* 204 */     else if (existingHub.getCost() > cost) {
/* 205 */       ArrayList<Vec3> path = new ArrayList<>(parent.getPath());
/* 206 */       path.add(loc);
/* 207 */       existingHub.setLoc(loc);
/* 208 */       existingHub.setParent(parent);
/* 209 */       existingHub.setPath(path);
/* 210 */       existingHub.setSquareDistanceToFromTarget(loc.squareDistanceTo(this.endVec3));
/* 211 */       existingHub.setCost(cost);
/* 212 */       existingHub.setTotalCost(totalCost);
/*     */     } 
/* 214 */     return false;
/*     */   }
/*     */   
/*     */   private class Hub {
/* 218 */     private Vec3 loc = null;
/* 219 */     private Hub parent = null;
/*     */     private ArrayList<Vec3> path;
/*     */     private double squareDistanceToFromTarget;
/*     */     private double cost;
/*     */     private double totalCost;
/*     */     
/*     */     public Hub(Vec3 loc, Hub parent, ArrayList<Vec3> path, double squareDistanceToFromTarget, double cost, double totalCost) {
/* 226 */       this.loc = loc;
/* 227 */       this.parent = parent;
/* 228 */       this.path = path;
/* 229 */       this.squareDistanceToFromTarget = squareDistanceToFromTarget;
/* 230 */       this.cost = cost;
/* 231 */       this.totalCost = totalCost;
/*     */     }
/*     */     
/*     */     public Vec3 getLoc() {
/* 235 */       return this.loc;
/*     */     }
/*     */     
/*     */     public Hub getParent() {
/* 239 */       return this.parent;
/*     */     }
/*     */     
/*     */     public ArrayList<Vec3> getPath() {
/* 243 */       return this.path;
/*     */     }
/*     */     
/*     */     public double getSquareDistanceToFromTarget() {
/* 247 */       return this.squareDistanceToFromTarget;
/*     */     }
/*     */     
/*     */     public double getCost() {
/* 251 */       return this.cost;
/*     */     }
/*     */     
/*     */     public void setLoc(Vec3 loc) {
/* 255 */       this.loc = loc;
/*     */     }
/*     */     
/*     */     public void setParent(Hub parent) {
/* 259 */       this.parent = parent;
/*     */     }
/*     */     
/*     */     public void setPath(ArrayList<Vec3> path) {
/* 263 */       this.path = path;
/*     */     }
/*     */     
/*     */     public void setSquareDistanceToFromTarget(double squareDistanceToFromTarget) {
/* 267 */       this.squareDistanceToFromTarget = squareDistanceToFromTarget;
/*     */     }
/*     */     
/*     */     public void setCost(double cost) {
/* 271 */       this.cost = cost;
/*     */     }
/*     */     
/*     */     public double getTotalCost() {
/* 275 */       return this.totalCost;
/*     */     }
/*     */     
/*     */     public void setTotalCost(double totalCost) {
/* 279 */       this.totalCost = totalCost;
/*     */     }
/*     */   }
/*     */   
/*     */   public class CompareHub
/*     */     implements Comparator<Hub> {
/*     */     public int compare(AStarCustomPathFinder.Hub o1, AStarCustomPathFinder.Hub o2) {
/* 286 */       return (int)(
/* 287 */         o1.getSquareDistanceToFromTarget() + o1.getTotalCost() - o2.getSquareDistanceToFromTarget() + o2.getTotalCost());
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/AStarCustomPathFinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */