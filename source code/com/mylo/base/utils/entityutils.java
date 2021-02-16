/*     */ package com.mylo.base.utils;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.entity.EntityPlayerSP;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.BlockPos;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import optfine.Reflector;
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
/*     */ public class entityutils
/*     */ {
/*     */   public static Entity GetClosestEntity(boolean players, boolean hostile, boolean passive, boolean teams, boolean hurttime) {
/*  38 */     Minecraft mc = Minecraft.getMinecraft();
/*  39 */     Entity closest = null;
/*     */     
/*  41 */     for (Entity e : mc.theWorld.loadedEntityList) {
/*  42 */       if (e.canAttackWithItem() && e != mc.thePlayer && e instanceof EntityLivingBase) {
/*  43 */         boolean isonMineplex = (!mc.isSingleplayer() && mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("mineplex"));
/*  44 */         if (e instanceof EntityPlayer && !players)
/*     */           continue; 
/*  46 */         if (e instanceof EntityPlayer && teams && ((EntityPlayer)e).isOnSameTeam((EntityLivingBase)mc.thePlayer))
/*     */           continue; 
/*  48 */         if ((e instanceof net.minecraft.entity.passive.EntityAnimal || e instanceof net.minecraft.entity.passive.EntityVillager || e instanceof net.minecraft.entity.monster.EntityGolem || e instanceof net.minecraft.entity.passive.EntityBat || e instanceof net.minecraft.entity.passive.EntitySquid) && !passive)
/*     */           continue; 
/*  50 */         if ((e instanceof net.minecraft.entity.monster.EntityMob || e instanceof net.minecraft.entity.monster.EntitySlime) && !hostile)
/*     */           continue; 
/*  52 */         if (e instanceof net.minecraft.entity.passive.EntityVillager)
/*     */           continue; 
/*  54 */         if (e instanceof net.minecraft.entity.item.EntityArmorStand)
/*     */           continue; 
/*  56 */         if ((isonMineplex || !e.isEntityAlive()) && (!isonMineplex || e.isEntityAlive()))
/*     */           continue; 
/*  58 */         if (mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("mineplex") && !e.touchedGround)
/*     */           continue; 
/*  60 */         if (mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("hypixel")) {
/*  61 */           String formated = e.getDisplayName().getFormattedText();
/*  62 */           String custom = e.getCustomNameTag();
/*  63 */           String name = e.getName();
/*  64 */           boolean flagGround = !e.touchedGround;
/*  65 */           boolean flagbw = (!formated.startsWith("§") && formated.endsWith("§r"));
/*  66 */           boolean flaginvis = (!custom.equalsIgnoreCase("") && custom.toLowerCase().contains("§c§c") && name.contains("§c"));
/*  67 */           boolean flagwd = (!custom.equalsIgnoreCase("") && custom.toLowerCase().contains("§c") && custom.toLowerCase().contains("§r"));
/*  68 */           boolean flagbot1 = formated.contains("§8[NPC]");
/*  69 */           boolean flagbot2 = (!formated.contains("§c") && !custom.equalsIgnoreCase(""));
/*  70 */           boolean flagping = (e instanceof EntityPlayer && mc.getNetHandler().getPlayerInfo(e.getUniqueID()) != null && mc.getNetHandler().getPlayerInfo(e.getUniqueID()).getResponseTime() != 1);
/*  71 */           boolean flagVisible = (e instanceof EntityPlayer && e.isInvisible() && !((EntityPlayer)e).isPotionActive(Potion.invisibility));
/*     */           
/*  73 */           if (flagVisible);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  78 */           if (flagping);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  83 */           if (flagbw || flaginvis || flagwd || flagbot1 || flagbot2 || flagGround || flagping || flagVisible) {
/*     */             continue;
/*     */           }
/*     */         } 
/*  87 */         if (e.hurtResistantTime > ((EntityLivingBase)e).maxHurtResistantTime / 2 && hurttime)
/*     */           continue; 
/*  89 */         if (e.ticksExisted < 10)
/*     */           continue; 
/*  91 */         if (e instanceof EntityPlayer && Friendutils.isFriend(e.getUniqueID().toString()))
/*     */           continue; 
/*  93 */         if (closest == null) {
/*  94 */           closest = e; continue;
/*     */         } 
/*  96 */         if (mc.thePlayer.getDistanceToEntity(e) < mc.thePlayer.getDistanceToEntity(closest)) {
/*  97 */           closest = e;
/*     */         }
/*     */       } 
/*     */     } 
/* 101 */     return closest;
/*     */   }
/*     */   
/*     */   public static ArrayList<Entity> getEntitiesInRangeSorted(double range, boolean players, boolean hostile, boolean passive, boolean teams, boolean hurttime) {
/* 105 */     Minecraft mc = Minecraft.getMinecraft();
/* 106 */     ArrayList<Entity> output = new ArrayList<>();
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
/* 150 */     output = getEntitiesInRange(range, players, hostile, passive, teams, hurttime);
/* 151 */     output = DistanceSort.main(output);
/* 152 */     return output;
/*     */   }
/*     */   
/*     */   public static boolean isEntityValid(Entity e) {
/* 156 */     if (e instanceof EntityLivingBase && !(e instanceof net.minecraft.entity.item.EntityItem)) {
/* 157 */       if (e instanceof EntityPlayer && Friendutils.isFriend(e.getUniqueID().toString()))
/* 158 */         return false; 
/* 159 */       if (!(e instanceof net.minecraft.entity.passive.EntityAnimal) && !(e instanceof net.minecraft.entity.passive.EntityVillager) && !(e instanceof net.minecraft.entity.monster.EntityGolem) && !(e instanceof net.minecraft.entity.passive.EntityBat) && !(e instanceof net.minecraft.entity.passive.EntitySquid) && !(e instanceof EntityPlayer) && !(e instanceof net.minecraft.entity.monster.EntityMob) && !(e instanceof net.minecraft.entity.monster.EntitySlime))
/* 160 */         return false; 
/* 161 */       return true;
/*     */     } 
/* 163 */     return false;
/*     */   }
/*     */   
/*     */   public static ArrayList<Entity> getEntitiesInRange(double range, boolean players, boolean hostile, boolean passive, boolean teams, boolean hurttime) {
/* 167 */     Minecraft mc = Minecraft.getMinecraft();
/* 168 */     ArrayList<Entity> output = new ArrayList<>();
/*     */     
/* 170 */     for (Entity e : mc.theWorld.loadedEntityList) {
/* 171 */       if (e.canAttackWithItem() && e != mc.thePlayer && e instanceof EntityLivingBase) {
/* 172 */         boolean isonMineplex = (!mc.isSingleplayer() && mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("mineplex"));
/* 173 */         if (e instanceof EntityPlayer && !players)
/*     */           continue; 
/* 175 */         if (e instanceof EntityPlayer && teams && ((EntityPlayer)e).isOnSameTeam((EntityLivingBase)mc.thePlayer))
/*     */           continue; 
/* 177 */         if ((e instanceof net.minecraft.entity.passive.EntityAnimal || e instanceof net.minecraft.entity.passive.EntityVillager || e instanceof net.minecraft.entity.monster.EntityGolem || e instanceof net.minecraft.entity.passive.EntityBat || e instanceof net.minecraft.entity.passive.EntitySquid) && !passive)
/*     */           continue; 
/* 179 */         if ((e instanceof net.minecraft.entity.monster.EntityMob || e instanceof net.minecraft.entity.monster.EntitySlime) && !hostile)
/*     */           continue; 
/* 181 */         if (e instanceof net.minecraft.entity.passive.EntityVillager)
/*     */           continue; 
/* 183 */         if (e instanceof net.minecraft.entity.item.EntityArmorStand)
/*     */           continue; 
/* 185 */         if ((isonMineplex || !e.isEntityAlive()) && (!isonMineplex || e.isEntityAlive()))
/*     */           continue; 
/* 187 */         if (mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("hypixel")) {
/* 188 */           String formated = e.getDisplayName().getFormattedText();
/* 189 */           String custom = e.getCustomNameTag();
/* 190 */           String name = e.getName();
/* 191 */           boolean flagGround = !e.touchedGround;
/* 192 */           boolean flagbw = (!formated.startsWith("§") && formated.endsWith("§r"));
/* 193 */           boolean flaginvis = (!custom.equalsIgnoreCase("") && custom.toLowerCase().contains("§c§c") && name.contains("§c"));
/* 194 */           boolean flagwd = (!custom.equalsIgnoreCase("") && custom.toLowerCase().contains("§c") && custom.toLowerCase().contains("§r"));
/* 195 */           boolean flagbot1 = formated.contains("§8[NPC]");
/* 196 */           boolean flagbot2 = (!formated.contains("§c") && !custom.equalsIgnoreCase(""));
/* 197 */           boolean flagping = (e instanceof EntityPlayer && mc.getNetHandler().getPlayerInfo(e.getUniqueID()) != null && mc.getNetHandler().getPlayerInfo(e.getUniqueID()).getResponseTime() != 1);
/* 198 */           boolean flagVisible = (e instanceof EntityPlayer && e.isInvisible() && !((EntityPlayer)e).isPotionActive(Potion.invisibility));
/*     */           
/* 200 */           if (flagVisible);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 205 */           if (flagping);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 210 */           if (flagbw || flaginvis || flagwd || flagbot1 || flagbot2 || flagGround || flagping || flagVisible) {
/*     */             continue;
/*     */           }
/*     */         } 
/* 214 */         if (e.hurtResistantTime > ((EntityLivingBase)e).maxHurtResistantTime / 2 && hurttime)
/*     */           continue; 
/* 216 */         if (e.ticksExisted < 10)
/*     */           continue; 
/* 218 */         if (e instanceof EntityPlayer && Friendutils.isFriend(e.getUniqueID().toString()))
/*     */           continue; 
/* 220 */         if (mc.thePlayer.getDistanceToEntity(e) < range) {
/* 221 */           output.add(e);
/*     */         }
/*     */       } 
/*     */     } 
/* 225 */     return output;
/*     */   }
/*     */   
/*     */   public static Entity getGwenBot() {
/* 229 */     Minecraft mc = Minecraft.getMinecraft();
/* 230 */     boolean isonMineplex = (!mc.isSingleplayer() && mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("mineplex"));
/* 231 */     if (isonMineplex) {
/* 232 */       for (Entity e : mc.theWorld.getLoadedEntityList()) {
/* 233 */         if (e instanceof EntityPlayer && e != mc.getRenderViewEntity() && 
/* 234 */           e.isEntityAlive()) {
/* 235 */           return e;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 240 */     return null;
/*     */   }
/*     */   
/*     */   public static Entity GetClosestEntitycrosshair() {
/* 244 */     Minecraft mc = Minecraft.getMinecraft();
/* 245 */     Entity closest = null;
/* 246 */     for (Entity e : mc.theWorld.loadedEntityList) {
/* 247 */       if (e.canAttackWithItem() && e != mc.thePlayer && e instanceof EntityLivingBase) {
/* 248 */         boolean isonMineplex = (!mc.isSingleplayer() && mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("mineplex"));
/* 249 */         if (e instanceof net.minecraft.entity.passive.EntityAnimal || e instanceof net.minecraft.entity.passive.EntityVillager || e instanceof net.minecraft.entity.monster.EntityGuardian || e instanceof net.minecraft.entity.monster.EntityGolem || e instanceof net.minecraft.entity.passive.EntityBat || e instanceof net.minecraft.entity.passive.EntitySquid)
/*     */           continue; 
/* 251 */         if (e instanceof net.minecraft.entity.monster.EntityMob || e instanceof net.minecraft.entity.monster.EntitySlime)
/*     */           continue; 
/* 253 */         if (e instanceof net.minecraft.entity.item.EntityArmorStand)
/*     */           continue; 
/* 255 */         if ((isonMineplex || !e.isEntityAlive()) && (!isonMineplex || e.isEntityAlive()))
/*     */           continue; 
/* 257 */         if (mc.getNetHandler().getNetworkManager().getRemoteAddress().toString().contains("hypixel")) {
/* 258 */           String formated = e.getDisplayName().getFormattedText();
/* 259 */           String custom = e.getCustomNameTag();
/* 260 */           String name = e.getName();
/* 261 */           boolean flagGround = !e.touchedGround;
/* 262 */           boolean flagbw = (!formated.startsWith("§") && formated.endsWith("§r"));
/* 263 */           boolean flaginvis = (!custom.equalsIgnoreCase("") && custom.toLowerCase().contains("§c§c") && name.contains("§c"));
/* 264 */           boolean flagwd = (!custom.equalsIgnoreCase("") && custom.toLowerCase().contains("§c") && custom.toLowerCase().contains("§r"));
/* 265 */           boolean flagbot1 = formated.contains("§8[NPC]");
/* 266 */           boolean flagbot2 = (!formated.contains("§c") && !custom.equalsIgnoreCase(""));
/* 267 */           boolean flagping = (e instanceof EntityPlayer && mc.getNetHandler().getPlayerInfo(e.getUniqueID()) != null && mc.getNetHandler().getPlayerInfo(e.getUniqueID()).getResponseTime() != 1);
/* 268 */           boolean flagVisible = (e instanceof EntityPlayer && e.isInvisible() && !((EntityPlayer)e).isPotionActive(Potion.invisibility));
/*     */           
/* 270 */           if (flagVisible);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 275 */           if (flagping);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 280 */           if (flagbw || flaginvis || flagwd || flagbot1 || flagbot2 || flagGround || flagping || flagVisible) {
/*     */             continue;
/*     */           }
/*     */         } 
/* 284 */         if (e.ticksExisted < 10)
/*     */           continue; 
/* 286 */         if (e instanceof EntityPlayer && Friendutils.isFriend(e.getUniqueID().toString())) {
/*     */           continue;
/*     */         }
/* 289 */         if (closest == null) {
/* 290 */           closest = e;
/*     */           continue;
/*     */         } 
/* 293 */         if (Math.abs(MathHelper.wrapAngleTo180_double(Lookutil.getLookDiff(e.getPositionVector()))) < Math.abs(MathHelper.wrapAngleTo180_double(Lookutil.getLookDiff(closest.getPositionVector())))) {
/* 294 */           closest = e;
/*     */         }
/*     */       } 
/*     */     } 
/* 298 */     return closest;
/*     */   }
/*     */   
/*     */   public static boolean lookAtEntityPacketSmooth(Entity e, float horspeed, float verspeed, boolean smartSmooth) {
/* 302 */     return Lookutil.lookAtPacketSmooth(e.getPositionEyes((Minecraft.getMinecraft()).timer.renderPartialTicks), horspeed, verspeed, smartSmooth);
/*     */   }
/*     */   
/*     */   public static boolean isLookingAtEntity(Entity e) {
/* 306 */     return Lookutil.isLookingAt(e.getPositionEyes((Minecraft.getMinecraft()).timer.renderPartialTicks));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void lookAtEntityPacketinstant(Entity e) {
/* 311 */     Lookutil.lookAtPosPacket(e.getPositionEyes((Minecraft.getMinecraft()).timer.renderPartialTicks));
/*     */   }
/*     */   
/*     */   public static void lookAtEntitySmooth(Entity e, float horspeed, float verspeed) {
/* 315 */     Lookutil.lookAtPosSmooth(e.getPositionEyes((Minecraft.getMinecraft()).timer.renderPartialTicks), horspeed, verspeed);
/*     */   }
/*     */ 
/*     */   
/*     */   public static MovingObjectPosition getMouseOverFakeAim(boolean ignoreblocks, double range) {
/* 320 */     MovingObjectPosition output = null;
/* 321 */     Minecraft mc = Minecraft.getMinecraft();
/* 322 */     float partialTicks = mc.timer.renderPartialTicks;
/* 323 */     EntityPlayerSP entityPlayerSP = mc.thePlayer;
/* 324 */     Entity pointedEntity = null;
/*     */     
/* 326 */     if (entityPlayerSP != null && mc.theWorld != null) {
/*     */       
/* 328 */       mc.mcProfiler.startSection("pick");
/* 329 */       mc.pointedEntity = null;
/* 330 */       double d0 = range;
/* 331 */       if (!ignoreblocks) {
/* 332 */         output = entityPlayerSP.rayTraceFakeAim(d0, partialTicks);
/*     */       }
/* 334 */       double d1 = d0;
/* 335 */       Vec3 vec3 = entityPlayerSP.getPositionEyes(partialTicks);
/* 336 */       boolean flag = false;
/* 337 */       boolean flag1 = true;
/*     */       
/* 339 */       if (output != null)
/*     */       {
/* 341 */         d1 = output.hitVec.distanceTo(vec3);
/*     */       }
/*     */       
/* 344 */       Vec3 vec31 = entityPlayerSP.getLookFakeaim(partialTicks);
/* 345 */       Vec3 vec32 = vec3.addVector(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0);
/* 346 */       pointedEntity = null;
/* 347 */       Vec3 vec33 = null;
/* 348 */       float f = 1.0F;
/* 349 */       List<Entity> list = new ArrayList();
/* 350 */       list.addAll(mc.theWorld.loadedEntityList);
/* 351 */       if (list.contains(entityPlayerSP)) {
/* 352 */         list.remove(entityPlayerSP);
/*     */       }
/* 354 */       double d2 = d1;
/*     */       
/* 356 */       for (int i = 0; i < list.size(); i++) {
/*     */         
/* 358 */         Entity entity1 = list.get(i);
/* 359 */         float f1 = entity1.getCollisionBorderSize();
/* 360 */         AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand(f1, f1, f1);
/* 361 */         MovingObjectPosition movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);
/*     */         
/* 363 */         if (axisalignedbb.isVecInside(vec3)) {
/*     */           
/* 365 */           if (d2 >= 0.0D)
/*     */           {
/* 367 */             pointedEntity = entity1;
/* 368 */             vec33 = (movingobjectposition == null) ? vec3 : movingobjectposition.hitVec;
/* 369 */             d2 = 0.0D;
/*     */           }
/*     */         
/* 372 */         } else if (movingobjectposition != null) {
/*     */           
/* 374 */           double d3 = vec3.distanceTo(movingobjectposition.hitVec);
/*     */           
/* 376 */           if (d3 < d2 || d2 == 0.0D) {
/*     */             
/* 378 */             boolean flag2 = false;
/*     */             
/* 380 */             if (Reflector.ForgeEntity_canRiderInteract.exists())
/*     */             {
/* 382 */               flag2 = Reflector.callBoolean(entity1, Reflector.ForgeEntity_canRiderInteract, new Object[0]);
/*     */             }
/*     */             
/* 385 */             if (entity1 == ((Entity)entityPlayerSP).ridingEntity && !flag2) {
/*     */               
/* 387 */               if (d2 == 0.0D)
/*     */               {
/* 389 */                 pointedEntity = entity1;
/* 390 */                 vec33 = movingobjectposition.hitVec;
/*     */               }
/*     */             
/*     */             } else {
/*     */               
/* 395 */               pointedEntity = entity1;
/* 396 */               vec33 = movingobjectposition.hitVec;
/* 397 */               d2 = d3;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 403 */       if (pointedEntity != null && flag && vec3.distanceTo(vec33) > 3.0D) {
/*     */         
/* 405 */         pointedEntity = null;
/* 406 */         output = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, vec33, null, new BlockPos(vec33));
/*     */       } 
/*     */       
/* 409 */       if (pointedEntity != null && (d2 < d1 || output == null)) {
/*     */         
/* 411 */         output = new MovingObjectPosition(pointedEntity, vec33);
/*     */         
/* 413 */         if (!(pointedEntity instanceof EntityLivingBase)) pointedEntity instanceof net.minecraft.entity.item.EntityItemFrame;
/*     */       
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 419 */       mc.mcProfiler.endSection();
/*     */       
/* 421 */       return output;
/*     */     } 
/* 423 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/entityutils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */