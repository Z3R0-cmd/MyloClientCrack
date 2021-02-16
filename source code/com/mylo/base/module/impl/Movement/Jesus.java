/*     */ package com.mylo.base.module.impl.Movement;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventBoundingBox;
/*     */ import com.mylo.base.events.EventMove;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import de.Hero.settings.Setting;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
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
/*     */ public class Jesus
/*     */   extends Module
/*     */ {
/*     */   int ticker;
/*     */   double speed;
/*     */   
/*     */   public Jesus() {
/*  36 */     super("Jesus", "Walk on da water", 0, Category.Movement);
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.speed = 0.0D;
/*     */   }
/*     */   
/*     */   public void onEnable() {
/*  44 */     super.onEnable(); String str;
/*  45 */     switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case 3202466: if (!str.equals("high")) {
/*     */           break;
/*     */         }
/*     */ 
/*     */         
/*  50 */         this.speed = 0.0D;
/*  51 */         this.ticker = 500;
/*     */         break;
/*     */       case 1837070814:
/*     */         if (!str.equals("dolphin"))
/*     */           break; 
/*     */         this.ticker = 0;
/*     */         break; }
/*  58 */      } public void onDisable() { super.onDisable(); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setup() {
/*  63 */     super.setup();
/*  64 */     Main.setmgr.rSetting(new Setting(this.name, this, "vanilla", Lists.newArrayList((Object[])new String[] { "vanilla", "ncp", "dolphin", "high" })));
/*     */   }
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
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual isPre : ()Z
/*     */     //   4: ifeq -> 377
/*     */     //   7: getstatic com/mylo/base/Main.setmgr : Lde/Hero/settings/SettingsManager;
/*     */     //   10: aload_0
/*     */     //   11: getfield name : Ljava/lang/String;
/*     */     //   14: invokevirtual getSettingByName : (Ljava/lang/String;)Lde/Hero/settings/Setting;
/*     */     //   17: invokevirtual getValString : ()Ljava/lang/String;
/*     */     //   20: dup
/*     */     //   21: astore_2
/*     */     //   22: invokevirtual hashCode : ()I
/*     */     //   25: lookupswitch default -> 377, 108891 -> 60, 233102203 -> 72, 1837070814 -> 84
/*     */     //   60: aload_2
/*     */     //   61: ldc 'ncp'
/*     */     //   63: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   66: ifne -> 96
/*     */     //   69: goto -> 377
/*     */     //   72: aload_2
/*     */     //   73: ldc 'vanilla'
/*     */     //   75: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   78: ifne -> 96
/*     */     //   81: goto -> 377
/*     */     //   84: aload_2
/*     */     //   85: ldc 'dolphin'
/*     */     //   87: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   90: ifne -> 303
/*     */     //   93: goto -> 377
/*     */     //   96: aload_0
/*     */     //   97: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   100: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   103: invokevirtual getEntityBoundingBox : ()Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   106: astore_3
/*     */     //   107: aload_3
/*     */     //   108: ldc2_w -0.5
/*     */     //   111: dconst_0
/*     */     //   112: ldc2_w -0.5
/*     */     //   115: invokevirtual expand : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   118: dconst_0
/*     */     //   119: ldc2_w -0.5
/*     */     //   122: dconst_0
/*     */     //   123: invokevirtual offset : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   126: astore_3
/*     */     //   127: aload_0
/*     */     //   128: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   131: getfield theWorld : Lnet/minecraft/client/multiplayer/WorldClient;
/*     */     //   134: aload_0
/*     */     //   135: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   138: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   141: invokevirtual getEntityBoundingBox : ()Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   144: dconst_0
/*     */     //   145: dconst_0
/*     */     //   146: dconst_0
/*     */     //   147: invokevirtual expand : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   150: ldc2_w 0.001
/*     */     //   153: ldc2_w 0.001
/*     */     //   156: ldc2_w 0.001
/*     */     //   159: invokevirtual contract : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   162: getstatic net/minecraft/block/material/Material.water : Lnet/minecraft/block/material/Material;
/*     */     //   165: aload_0
/*     */     //   166: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   169: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   172: invokevirtual handleMaterialAcceleration : (Lnet/minecraft/util/AxisAlignedBB;Lnet/minecraft/block/material/Material;Lnet/minecraft/entity/Entity;)Z
/*     */     //   175: istore #4
/*     */     //   177: aload_0
/*     */     //   178: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   181: getfield theWorld : Lnet/minecraft/client/multiplayer/WorldClient;
/*     */     //   184: aload_0
/*     */     //   185: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   188: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   191: invokevirtual getEntityBoundingBox : ()Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   194: dconst_0
/*     */     //   195: dconst_0
/*     */     //   196: dconst_0
/*     */     //   197: invokevirtual expand : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   200: ldc2_w 0.001
/*     */     //   203: ldc2_w 0.001
/*     */     //   206: ldc2_w 0.001
/*     */     //   209: invokevirtual contract : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   212: dconst_0
/*     */     //   213: ldc2_w 0.05
/*     */     //   216: dconst_0
/*     */     //   217: invokevirtual offset : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   220: getstatic net/minecraft/block/material/Material.water : Lnet/minecraft/block/material/Material;
/*     */     //   223: aload_0
/*     */     //   224: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   227: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   230: invokevirtual handleMaterialAcceleration : (Lnet/minecraft/util/AxisAlignedBB;Lnet/minecraft/block/material/Material;Lnet/minecraft/entity/Entity;)Z
/*     */     //   233: istore #5
/*     */     //   235: iload #4
/*     */     //   237: ifeq -> 377
/*     */     //   240: aload_0
/*     */     //   241: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   244: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   247: getfield movementInput : Lnet/minecraft/util/MovementInput;
/*     */     //   250: getfield sneak : Z
/*     */     //   253: ifne -> 377
/*     */     //   256: iload #5
/*     */     //   258: ifeq -> 274
/*     */     //   261: aload_0
/*     */     //   262: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   265: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   268: ldc2_w 0.1
/*     */     //   271: putfield motionY : D
/*     */     //   274: aload_0
/*     */     //   275: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   278: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   281: invokevirtual isInWater : ()Z
/*     */     //   284: ifeq -> 377
/*     */     //   287: aload_0
/*     */     //   288: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   291: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   294: ldc2_w 0.1
/*     */     //   297: putfield motionY : D
/*     */     //   300: goto -> 377
/*     */     //   303: aload_0
/*     */     //   304: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   307: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   310: invokevirtual isInWater : ()Z
/*     */     //   313: ifeq -> 337
/*     */     //   316: aload_0
/*     */     //   317: iconst_2
/*     */     //   318: putfield ticker : I
/*     */     //   321: aload_0
/*     */     //   322: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   325: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   328: ldc2_w 0.1
/*     */     //   331: putfield motionY : D
/*     */     //   334: goto -> 357
/*     */     //   337: aload_0
/*     */     //   338: getfield ticker : I
/*     */     //   341: ifle -> 357
/*     */     //   344: aload_0
/*     */     //   345: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   348: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   351: ldc2_w 0.42
/*     */     //   354: putfield motionY : D
/*     */     //   357: aload_0
/*     */     //   358: getfield ticker : I
/*     */     //   361: iflt -> 377
/*     */     //   364: aload_0
/*     */     //   365: dup
/*     */     //   366: getfield ticker : I
/*     */     //   369: iconst_1
/*     */     //   370: isub
/*     */     //   371: putfield ticker : I
/*     */     //   374: goto -> 377
/*     */     //   377: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 0
/*     */     //   #70	-> 7
/*     */     //   #73	-> 96
/*     */     //   #74	-> 107
/*     */     //   #75	-> 127
/*     */     //   #76	-> 177
/*     */     //   #77	-> 235
/*     */     //   #78	-> 240
/*     */     //   #81	-> 256
/*     */     //   #82	-> 261
/*     */     //   #84	-> 274
/*     */     //   #85	-> 287
/*     */     //   #89	-> 300
/*     */     //   #91	-> 303
/*     */     //   #92	-> 316
/*     */     //   #93	-> 321
/*     */     //   #94	-> 334
/*     */     //   #95	-> 337
/*     */     //   #96	-> 344
/*     */     //   #98	-> 357
/*     */     //   #99	-> 364
/*     */     //   #101	-> 374
/*     */     //   #107	-> 377
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	378	0	this	Lcom/mylo/base/module/impl/Movement/Jesus;
/*     */     //   0	378	1	e	Lcom/mylo/base/events/EventUpdate;
/*     */     //   107	196	3	boundingbox	Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   177	126	4	onwater	Z
/*     */     //   235	68	5	barelyonwater	Z
/*     */   }
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
/*     */   @EventTarget
/*     */   public void onMove(EventMove e) {
/* 111 */     if (e.isPre()) {
/* 112 */       boolean onwater; boolean hurt; String str; switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case 3202466: if (!str.equals("high"))
/*     */             break; 
/* 114 */           if (this.mc.thePlayer.isInWater()) {
/* 115 */             e.y = this.mc.thePlayer.motionY = 0.1D;
/*     */           }
/*     */           
/* 118 */           onwater = this.mc.theWorld.handleMaterialAcceleration(this.mc.thePlayer.getEntityBoundingBox().expand(0.0D, 0.0D, 0.0D).contract(0.001D, 0.001D, 0.001D), Material.water, (Entity)this.mc.thePlayer);
/* 119 */           hurt = (this.mc.thePlayer.hurtResistantTime > 5);
/* 120 */           if (onwater) {
/*     */ 
/*     */             
/* 123 */             e.y = this.mc.thePlayer.motionY = 0.5D;
/* 124 */             this.ticker = 0;
/*     */           } 
/*     */           
/* 127 */           if (this.ticker <= 100) {
/* 128 */             switch (this.ticker) {
/*     */               case 0:
/* 130 */                 this.speed = Moveutils.getBaseMoveSpeed() * 1.05D;
/* 131 */                 e.y = this.mc.thePlayer.motionY += 7.9E-4D;
/*     */               case 1:
/* 133 */                 e.y = this.mc.thePlayer.motionY += 0.072D;
/*     */               
/*     */               case 2:
/* 136 */                 e.y = this.mc.thePlayer.motionY += 0.001D;
/*     */               case 3:
/* 138 */                 e.y = this.mc.thePlayer.motionY += 5.0E-4D;
/*     */               case 4:
/* 140 */                 e.y = this.mc.thePlayer.motionY += 5.0E-4D;
/*     */               case 5:
/* 142 */                 e.y = this.mc.thePlayer.motionY += 0.0545D;
/*     */               
/*     */               case 6:
/* 145 */                 e.y = this.mc.thePlayer.motionY += 0.004D;
/*     */               case 7:
/*     */               case 8:
/*     */               case 9:
/*     */               case 10:
/*     */               case 11:
/*     */               case 12:
/*     */               case 13:
/*     */               case 14:
/*     */               case 15:
/*     */               case 16:
/* 156 */                 e.y = this.mc.thePlayer.motionY += 0.01D;
/*     */               case 17:
/*     */               case 18:
/*     */               case 19:
/*     */               case 20:
/* 161 */                 e.y = this.mc.thePlayer.motionY += 0.04D;
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 169 */             if (this.mc.thePlayer.isCollidedVertically) {
/* 170 */               this.ticker = 101;
/*     */             }
/*     */             
/* 173 */             this.speed *= 0.989D;
/* 174 */             this.ticker++;
/* 175 */             Moveutils.setMoveSpeed(e, Math.max(Moveutils.getBaseMoveSpeed(), this.speed));
/*     */           } 
/*     */           break; }
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onBb(EventBoundingBox e) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/mylo/base/Main.setmgr : Lde/Hero/settings/SettingsManager;
/*     */     //   3: aload_0
/*     */     //   4: getfield name : Ljava/lang/String;
/*     */     //   7: invokevirtual getSettingByName : (Ljava/lang/String;)Lde/Hero/settings/Setting;
/*     */     //   10: invokevirtual getValString : ()Ljava/lang/String;
/*     */     //   13: dup
/*     */     //   14: astore_2
/*     */     //   15: invokevirtual hashCode : ()I
/*     */     //   18: lookupswitch default -> 247, 108891 -> 52, 3202466 -> 64, 233102203 -> 76
/*     */     //   52: aload_2
/*     */     //   53: ldc 'ncp'
/*     */     //   55: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   58: ifne -> 88
/*     */     //   61: goto -> 247
/*     */     //   64: aload_2
/*     */     //   65: ldc 'high'
/*     */     //   67: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   70: ifne -> 88
/*     */     //   73: goto -> 247
/*     */     //   76: aload_2
/*     */     //   77: ldc 'vanilla'
/*     */     //   79: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   82: ifne -> 88
/*     */     //   85: goto -> 247
/*     */     //   88: aload_0
/*     */     //   89: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   92: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   95: invokevirtual isSneaking : ()Z
/*     */     //   98: ifne -> 247
/*     */     //   101: aload_0
/*     */     //   102: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   105: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   108: invokevirtual isInLava : ()Z
/*     */     //   111: ifne -> 247
/*     */     //   114: aload_0
/*     */     //   115: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   118: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   121: invokevirtual isInWater : ()Z
/*     */     //   124: ifne -> 247
/*     */     //   127: aload_1
/*     */     //   128: invokevirtual getBlock : ()Lnet/minecraft/block/Block;
/*     */     //   131: astore_3
/*     */     //   132: aload_1
/*     */     //   133: invokevirtual getBpos : ()Lnet/minecraft/util/BlockPos;
/*     */     //   136: astore #4
/*     */     //   138: aload_3
/*     */     //   139: instanceof net/minecraft/block/BlockLiquid
/*     */     //   142: ifeq -> 247
/*     */     //   145: aload_3
/*     */     //   146: checkcast net/minecraft/block/BlockLiquid
/*     */     //   149: aload_0
/*     */     //   150: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   153: getfield theWorld : Lnet/minecraft/client/multiplayer/WorldClient;
/*     */     //   156: aload #4
/*     */     //   158: invokevirtual getBlockState : (Lnet/minecraft/util/BlockPos;)Lnet/minecraft/block/state/IBlockState;
/*     */     //   161: invokevirtual getMetaFromState : (Lnet/minecraft/block/state/IBlockState;)I
/*     */     //   164: istore #5
/*     */     //   166: aload_1
/*     */     //   167: new net/minecraft/util/AxisAlignedBB
/*     */     //   170: dup
/*     */     //   171: aload #4
/*     */     //   173: invokevirtual getX : ()I
/*     */     //   176: i2d
/*     */     //   177: aload_3
/*     */     //   178: invokevirtual getBlockBoundsMinX : ()D
/*     */     //   181: dadd
/*     */     //   182: aload #4
/*     */     //   184: invokevirtual getY : ()I
/*     */     //   187: i2d
/*     */     //   188: aload_3
/*     */     //   189: invokevirtual getBlockBoundsMinY : ()D
/*     */     //   192: dadd
/*     */     //   193: aload #4
/*     */     //   195: invokevirtual getZ : ()I
/*     */     //   198: i2d
/*     */     //   199: aload_3
/*     */     //   200: invokevirtual getBlockBoundsMinZ : ()D
/*     */     //   203: dadd
/*     */     //   204: aload #4
/*     */     //   206: invokevirtual getX : ()I
/*     */     //   209: i2d
/*     */     //   210: aload_3
/*     */     //   211: invokevirtual getBlockBoundsMaxX : ()D
/*     */     //   214: dadd
/*     */     //   215: aload #4
/*     */     //   217: invokevirtual getY : ()I
/*     */     //   220: i2d
/*     */     //   221: aload_3
/*     */     //   222: invokevirtual getBlockBoundsMaxY : ()D
/*     */     //   225: dadd
/*     */     //   226: ldc2_w 0.05
/*     */     //   229: dsub
/*     */     //   230: aload #4
/*     */     //   232: invokevirtual getZ : ()I
/*     */     //   235: i2d
/*     */     //   236: aload_3
/*     */     //   237: invokevirtual getBlockBoundsMaxZ : ()D
/*     */     //   240: dadd
/*     */     //   241: invokespecial <init> : (DDDDDD)V
/*     */     //   244: invokevirtual setBb : (Lnet/minecraft/util/AxisAlignedBB;)V
/*     */     //   247: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #186	-> 0
/*     */     //   #190	-> 88
/*     */     //   #191	-> 127
/*     */     //   #192	-> 132
/*     */     //   #193	-> 138
/*     */     //   #194	-> 145
/*     */     //   #195	-> 166
/*     */     //   #200	-> 247
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	248	0	this	Lcom/mylo/base/module/impl/Movement/Jesus;
/*     */     //   0	248	1	e	Lcom/mylo/base/events/EventBoundingBox;
/*     */     //   132	115	3	b	Lnet/minecraft/block/Block;
/*     */     //   138	109	4	pos	Lnet/minecraft/util/BlockPos;
/*     */     //   166	81	5	level	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/*     */     String str;
/* 204 */     switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case 108891: if (!str.equals("ncp")) {
/*     */           break;
/*     */         }
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
/* 223 */         if (e.getPacket() instanceof C03PacketPlayer) {
/* 224 */           boolean onwater = this.mc.theWorld.handleMaterialAcceleration(this.mc.thePlayer.getEntityBoundingBox().expand(0.0D, 0.0D, 0.0D).contract(0.001D, 0.001D, 0.001D), Material.water, (Entity)this.mc.thePlayer);
/* 225 */           boolean barelyonwater = this.mc.theWorld.handleMaterialAcceleration(this.mc.thePlayer.getEntityBoundingBox().expand(0.0D, 0.0D, 0.0D).contract(0.001D, 0.001D, 0.001D).offset(0.0D, 0.01D, 0.0D), Material.water, (Entity)this.mc.thePlayer);
/* 226 */           if (onwater && Moveutils.moveKeysDown() && !this.mc.thePlayer.movementInput.jump) {
/* 227 */             Packet p = e.getPacket();
/* 228 */             if (p instanceof C03PacketPlayer.C04PacketPlayerPosition) {
/* 229 */               C03PacketPlayer.C04PacketPlayerPosition packet = (C03PacketPlayer.C04PacketPlayerPosition)p;
/* 230 */               e.setPacket((Packet)new C03PacketPlayer.C04PacketPlayerPosition(packet.getPositionX(), packet.getPositionY() + (this.mc.thePlayer.ticksExisted % 2) * 0.1D - 0.01D, packet.getPositionZ(), false));
/*     */             } 
/* 232 */             if (p instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
/* 233 */               C03PacketPlayer.C06PacketPlayerPosLook packet = (C03PacketPlayer.C06PacketPlayerPosLook)p;
/* 234 */               e.setPacket((Packet)new C03PacketPlayer.C06PacketPlayerPosLook(packet.getPositionX(), packet.getPositionY() + (this.mc.thePlayer.ticksExisted % 2) * 0.1D - 0.01D, packet.getPositionZ(), packet.getYaw(), packet.getPitch(), false));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         break;
/*     */       case 3202466:
/*     */         if (!str.equals("high"))
/*     */           break; 
/*     */         if (e.getPacket() instanceof C03PacketPlayer) {
/*     */           boolean onwater = this.mc.theWorld.handleMaterialAcceleration(this.mc.thePlayer.getEntityBoundingBox().expand(0.0D, 0.0D, 0.0D).contract(0.001D, 0.001D, 0.001D), Material.water, (Entity)this.mc.thePlayer);
/*     */           boolean barelyonwater = this.mc.theWorld.handleMaterialAcceleration(this.mc.thePlayer.getEntityBoundingBox().expand(0.0D, 0.0D, 0.0D).contract(0.001D, 0.001D, 0.001D).offset(0.0D, 0.01D, 0.0D), Material.water, (Entity)this.mc.thePlayer);
/*     */           if (onwater) {
/*     */             Packet p = e.getPacket();
/*     */             if (p instanceof C03PacketPlayer.C04PacketPlayerPosition) {
/*     */               C03PacketPlayer.C04PacketPlayerPosition packet = (C03PacketPlayer.C04PacketPlayerPosition)p;
/*     */               e.setPacket((Packet)new C03PacketPlayer.C04PacketPlayerPosition(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ(), false));
/*     */             } 
/*     */             if (p instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
/*     */               C03PacketPlayer.C06PacketPlayerPosLook packet = (C03PacketPlayer.C06PacketPlayerPosLook)p;
/*     */               e.setPacket((Packet)new C03PacketPlayer.C06PacketPlayerPosLook(packet.getPositionX(), packet.getPositionY(), packet.getPositionZ(), packet.getYaw(), packet.getPitch(), false));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         break; }
/*     */   
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Jesus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */