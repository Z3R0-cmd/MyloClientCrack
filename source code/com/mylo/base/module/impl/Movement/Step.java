/*     */ package com.mylo.base.module.impl.Movement;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Moveutils;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ 
/*     */ public class Step
/*     */   extends Module
/*     */ {
/*     */   TimeHelper timer;
/*     */   boolean isstepping;
/*     */   ArrayList<Double> stepOffsets;
/*     */   double startX;
/*     */   double startZ;
/*     */   double ticker;
/*     */   
/*     */   public Step() {
/*  29 */     super("Step", "makes step up blocks lmao", 0, Category.Movement);
/*     */ 
/*     */     
/*  32 */     this.timer = new TimeHelper();
/*     */ 
/*     */     
/*  35 */     this.stepOffsets = new ArrayList<>();
/*  36 */     this.startX = 0.0D; this.startZ = 0.0D; this.ticker = 0.0D;
/*     */   }
/*     */   
/*     */   public void setup() {
/*  40 */     super.setup();
/*  41 */     ArrayList<String> options = new ArrayList<>();
/*  42 */     options.add("stepheight");
/*  43 */     options.add("smoothmotion");
/*  44 */     options.add("instamotion");
/*  45 */     options.add("jumpmotion");
/*  46 */     options.add("tpup");
/*  47 */     options.add("mineplex");
/*  48 */     options.add("ncp");
/*  49 */     Main.setmgr.rSetting(new Setting(this.name, this, "stepheight", options));
/*  50 */     Main.setmgr.rSetting(new Setting("height", this, 1.0D, 1.0D, 10.0D, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRenderName() {
/*  55 */     return String.valueOf(this.name) + " - " + Main.setmgr.getSettingByName(this.name).getValString() + " " + Main.setmgr.getSettingByName("height").getValDouble();
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
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual isPre : ()Z
/*     */     //   4: ifeq -> 1092
/*     */     //   7: fconst_0
/*     */     //   8: fstore_2
/*     */     //   9: ldc 0.4
/*     */     //   11: fstore_3
/*     */     //   12: getstatic com/mylo/base/Main.setmgr : Lde/Hero/settings/SettingsManager;
/*     */     //   15: ldc 'height'
/*     */     //   17: invokevirtual getSettingByName : (Ljava/lang/String;)Lde/Hero/settings/Setting;
/*     */     //   20: invokevirtual getValDouble : ()D
/*     */     //   23: d2f
/*     */     //   24: fstore #4
/*     */     //   26: aload_0
/*     */     //   27: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   30: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   33: ldc 0.5
/*     */     //   35: putfield stepHeight : F
/*     */     //   38: getstatic com/mylo/base/Main.setmgr : Lde/Hero/settings/SettingsManager;
/*     */     //   41: aload_0
/*     */     //   42: getfield name : Ljava/lang/String;
/*     */     //   45: invokevirtual getSettingByName : (Ljava/lang/String;)Lde/Hero/settings/Setting;
/*     */     //   48: invokevirtual getValString : ()Ljava/lang/String;
/*     */     //   51: ldc 'stepheight'
/*     */     //   53: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*     */     //   56: ifeq -> 74
/*     */     //   59: aload_0
/*     */     //   60: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   63: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   66: fload #4
/*     */     //   68: putfield stepHeight : F
/*     */     //   71: goto -> 969
/*     */     //   74: iconst_0
/*     */     //   75: istore #5
/*     */     //   77: dconst_0
/*     */     //   78: dstore #6
/*     */     //   80: dconst_1
/*     */     //   81: dstore #8
/*     */     //   83: goto -> 195
/*     */     //   86: dload #8
/*     */     //   88: invokestatic canStep : (D)Z
/*     */     //   91: ifeq -> 124
/*     */     //   94: iload #5
/*     */     //   96: ifne -> 124
/*     */     //   99: aload_0
/*     */     //   100: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   103: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   106: getfield motionY : D
/*     */     //   109: dconst_0
/*     */     //   110: dcmpg
/*     */     //   111: ifgt -> 124
/*     */     //   114: dload #8
/*     */     //   116: dstore #6
/*     */     //   118: iconst_1
/*     */     //   119: istore #5
/*     */     //   121: goto -> 206
/*     */     //   124: aload_0
/*     */     //   125: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   128: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   131: invokevirtual getEntityBoundingBox : ()Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   134: ldc2_w 0.05
/*     */     //   137: dconst_0
/*     */     //   138: ldc2_w 0.05
/*     */     //   141: invokevirtual contract : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   144: astore #10
/*     */     //   146: aload_0
/*     */     //   147: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   150: getfield theWorld : Lnet/minecraft/client/multiplayer/WorldClient;
/*     */     //   153: aload_0
/*     */     //   154: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   157: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   160: aload #10
/*     */     //   162: dconst_0
/*     */     //   163: dload #8
/*     */     //   165: dconst_0
/*     */     //   166: invokevirtual addCoord : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   169: invokevirtual getCollidingBoundingBoxes : (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/AxisAlignedBB;)Ljava/util/List;
/*     */     //   172: astore #11
/*     */     //   174: aload #11
/*     */     //   176: invokeinterface isEmpty : ()Z
/*     */     //   181: ifne -> 187
/*     */     //   184: goto -> 206
/*     */     //   187: dload #8
/*     */     //   189: ldc2_w 0.1
/*     */     //   192: dadd
/*     */     //   193: dstore #8
/*     */     //   195: dload #8
/*     */     //   197: fload #4
/*     */     //   199: fconst_1
/*     */     //   200: fadd
/*     */     //   201: f2d
/*     */     //   202: dcmpg
/*     */     //   203: iflt -> 86
/*     */     //   206: aload_0
/*     */     //   207: getfield isstepping : Z
/*     */     //   210: ifeq -> 802
/*     */     //   213: iload #5
/*     */     //   215: ifeq -> 802
/*     */     //   218: getstatic com/mylo/base/Main.setmgr : Lde/Hero/settings/SettingsManager;
/*     */     //   221: aload_0
/*     */     //   222: getfield name : Ljava/lang/String;
/*     */     //   225: invokevirtual getSettingByName : (Ljava/lang/String;)Lde/Hero/settings/Setting;
/*     */     //   228: invokevirtual getValString : ()Ljava/lang/String;
/*     */     //   231: dup
/*     */     //   232: astore #8
/*     */     //   234: invokevirtual hashCode : ()I
/*     */     //   237: lookupswitch default -> 799, -2119085487 -> 296, -1362669950 -> 309, 108891 -> 322, 3567127 -> 335, 161241444 -> 348, 1603582692 -> 361
/*     */     //   296: aload #8
/*     */     //   298: ldc 'instamotion'
/*     */     //   300: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   303: ifne -> 390
/*     */     //   306: goto -> 868
/*     */     //   309: aload #8
/*     */     //   311: ldc 'mineplex'
/*     */     //   313: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   316: ifne -> 492
/*     */     //   319: goto -> 868
/*     */     //   322: aload #8
/*     */     //   324: ldc 'ncp'
/*     */     //   326: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   329: ifne -> 699
/*     */     //   332: goto -> 868
/*     */     //   335: aload #8
/*     */     //   337: ldc 'tpup'
/*     */     //   339: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   342: ifne -> 446
/*     */     //   345: goto -> 868
/*     */     //   348: aload #8
/*     */     //   350: ldc 'jumpmotion'
/*     */     //   352: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   355: ifne -> 402
/*     */     //   358: goto -> 868
/*     */     //   361: aload #8
/*     */     //   363: ldc 'smoothmotion'
/*     */     //   365: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   368: ifne -> 374
/*     */     //   371: goto -> 868
/*     */     //   374: aload_0
/*     */     //   375: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   378: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   381: ldc2_w 0.42
/*     */     //   384: putfield motionY : D
/*     */     //   387: goto -> 868
/*     */     //   390: aload_0
/*     */     //   391: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   394: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   397: dload #6
/*     */     //   399: putfield motionY : D
/*     */     //   402: aload_0
/*     */     //   403: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   406: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   409: getfield onGround : Z
/*     */     //   412: ifne -> 430
/*     */     //   415: aload_0
/*     */     //   416: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   419: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   422: getfield motionY : D
/*     */     //   425: dconst_0
/*     */     //   426: dcmpg
/*     */     //   427: ifge -> 868
/*     */     //   430: aload_0
/*     */     //   431: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   434: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   437: ldc2_w 0.42
/*     */     //   440: putfield motionY : D
/*     */     //   443: goto -> 868
/*     */     //   446: aload_0
/*     */     //   447: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   450: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   453: aload_0
/*     */     //   454: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   457: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   460: getfield posX : D
/*     */     //   463: aload_0
/*     */     //   464: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   467: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   470: getfield posY : D
/*     */     //   473: dload #6
/*     */     //   475: dadd
/*     */     //   476: aload_0
/*     */     //   477: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   480: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   483: getfield posZ : D
/*     */     //   486: invokevirtual setPosition : (DDD)V
/*     */     //   489: goto -> 868
/*     */     //   492: aload_0
/*     */     //   493: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   496: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   499: getfield onGround : Z
/*     */     //   502: ifeq -> 868
/*     */     //   505: aload_0
/*     */     //   506: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   509: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   512: getfield sendQueue : Lnet/minecraft/client/network/NetHandlerPlayClient;
/*     */     //   515: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
/*     */     //   518: dup
/*     */     //   519: aload_0
/*     */     //   520: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   523: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   526: getfield posX : D
/*     */     //   529: aload_0
/*     */     //   530: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   533: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   536: getfield posY : D
/*     */     //   539: ldc2_w 0.42
/*     */     //   542: dadd
/*     */     //   543: aload_0
/*     */     //   544: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   547: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   550: getfield posZ : D
/*     */     //   553: iconst_0
/*     */     //   554: invokespecial <init> : (DDDZ)V
/*     */     //   557: invokevirtual addToSendQueue : (Lnet/minecraft/network/Packet;)V
/*     */     //   560: aload_0
/*     */     //   561: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   564: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   567: aload_0
/*     */     //   568: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   571: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   574: getfield posX : D
/*     */     //   577: aload_0
/*     */     //   578: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   581: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   584: getfield posY : D
/*     */     //   587: dload #6
/*     */     //   589: dadd
/*     */     //   590: aload_0
/*     */     //   591: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   594: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   597: getfield posZ : D
/*     */     //   600: invokevirtual setPosition : (DDD)V
/*     */     //   603: aload_0
/*     */     //   604: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   607: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   610: getfield posX : D
/*     */     //   613: aload_0
/*     */     //   614: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   617: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   620: getfield lastTickPosX : D
/*     */     //   623: dsub
/*     */     //   624: aload_0
/*     */     //   625: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   628: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   631: getfield posX : D
/*     */     //   634: aload_0
/*     */     //   635: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   638: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   641: getfield lastTickPosX : D
/*     */     //   644: dsub
/*     */     //   645: dmul
/*     */     //   646: aload_0
/*     */     //   647: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   650: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   653: getfield posZ : D
/*     */     //   656: aload_0
/*     */     //   657: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   660: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   663: getfield lastTickPosZ : D
/*     */     //   666: dsub
/*     */     //   667: aload_0
/*     */     //   668: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   671: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   674: getfield posZ : D
/*     */     //   677: aload_0
/*     */     //   678: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   681: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   684: getfield lastTickPosZ : D
/*     */     //   687: dsub
/*     */     //   688: dmul
/*     */     //   689: dadd
/*     */     //   690: invokestatic sqrt : (D)D
/*     */     //   693: invokestatic setSpeed : (D)V
/*     */     //   696: goto -> 868
/*     */     //   699: dload #6
/*     */     //   701: ldc2_w 2.6
/*     */     //   704: dcmpg
/*     */     //   705: ifgt -> 868
/*     */     //   708: aload_0
/*     */     //   709: getfield startX : D
/*     */     //   712: d2f
/*     */     //   713: invokestatic getBaseMoveSpeed : ()D
/*     */     //   716: ldc2_w 0.4
/*     */     //   719: dmul
/*     */     //   720: invokestatic setSpeedAt : (FD)V
/*     */     //   723: aload_0
/*     */     //   724: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   727: getfield timer : Lnet/minecraft/util/Timer;
/*     */     //   730: fload_3
/*     */     //   731: f2d
/*     */     //   732: dload #6
/*     */     //   734: ddiv
/*     */     //   735: d2f
/*     */     //   736: putfield timerSpeed : F
/*     */     //   739: aload_0
/*     */     //   740: dload #6
/*     */     //   742: invokevirtual ncpStep : (D)V
/*     */     //   745: aload_0
/*     */     //   746: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   749: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   752: aload_0
/*     */     //   753: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   756: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   759: getfield posX : D
/*     */     //   762: aload_0
/*     */     //   763: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   766: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   769: getfield posY : D
/*     */     //   772: dload #6
/*     */     //   774: dadd
/*     */     //   775: aload_0
/*     */     //   776: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   779: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   782: getfield posZ : D
/*     */     //   785: invokevirtual setPosition : (DDD)V
/*     */     //   788: aload_0
/*     */     //   789: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   792: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   795: dconst_0
/*     */     //   796: putfield motionY : D
/*     */     //   799: goto -> 868
/*     */     //   802: aload_0
/*     */     //   803: getfield isstepping : Z
/*     */     //   806: ifeq -> 868
/*     */     //   809: dconst_0
/*     */     //   810: invokestatic canStep : (D)Z
/*     */     //   813: ifeq -> 868
/*     */     //   816: aload_0
/*     */     //   817: iconst_0
/*     */     //   818: putfield isstepping : Z
/*     */     //   821: aload_0
/*     */     //   822: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   825: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   828: dconst_0
/*     */     //   829: putfield motionY : D
/*     */     //   832: aload_0
/*     */     //   833: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   836: getfield timer : Lnet/minecraft/util/Timer;
/*     */     //   839: fconst_1
/*     */     //   840: putfield timerSpeed : F
/*     */     //   843: aload_0
/*     */     //   844: getfield startX : D
/*     */     //   847: d2f
/*     */     //   848: invokestatic getBaseMoveSpeed : ()D
/*     */     //   851: ldc2_w 0.4
/*     */     //   854: dmul
/*     */     //   855: invokestatic setSpeedAt : (FD)V
/*     */     //   858: aload_0
/*     */     //   859: aload_0
/*     */     //   860: dconst_0
/*     */     //   861: dup2_x1
/*     */     //   862: putfield startZ : D
/*     */     //   865: putfield startX : D
/*     */     //   868: getstatic com/mylo/base/Main.setmgr : Lde/Hero/settings/SettingsManager;
/*     */     //   871: aload_0
/*     */     //   872: getfield name : Ljava/lang/String;
/*     */     //   875: invokevirtual getSettingByName : (Ljava/lang/String;)Lde/Hero/settings/Setting;
/*     */     //   878: invokevirtual getValString : ()Ljava/lang/String;
/*     */     //   881: dup
/*     */     //   882: astore #9
/*     */     //   884: invokevirtual hashCode : ()I
/*     */     //   887: lookupswitch default -> 928, -1362669950 -> 904
/*     */     //   904: aload #9
/*     */     //   906: ldc 'mineplex'
/*     */     //   908: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   911: ifne -> 917
/*     */     //   914: goto -> 928
/*     */     //   917: aload_0
/*     */     //   918: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   921: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   924: getfield isCollidedHorizontally : Z
/*     */     //   927: pop
/*     */     //   928: aload_0
/*     */     //   929: getfield isstepping : Z
/*     */     //   932: ifeq -> 969
/*     */     //   935: aload_0
/*     */     //   936: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   939: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   942: getfield isCollidedHorizontally : Z
/*     */     //   945: ifne -> 969
/*     */     //   948: aload_0
/*     */     //   949: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   952: getfield timer : Lnet/minecraft/util/Timer;
/*     */     //   955: fconst_1
/*     */     //   956: putfield timerSpeed : F
/*     */     //   959: aload_0
/*     */     //   960: aload_0
/*     */     //   961: dconst_0
/*     */     //   962: dup2_x1
/*     */     //   963: putfield startZ : D
/*     */     //   966: putfield startX : D
/*     */     //   969: aload_0
/*     */     //   970: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   973: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   976: getfield onGround : Z
/*     */     //   979: ifeq -> 1059
/*     */     //   982: aload_0
/*     */     //   983: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   986: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   989: getfield isCollidedHorizontally : Z
/*     */     //   992: ifeq -> 1059
/*     */     //   995: aload_0
/*     */     //   996: getfield startX : D
/*     */     //   999: dconst_0
/*     */     //   1000: dcmpl
/*     */     //   1001: ifne -> 1011
/*     */     //   1004: aload_0
/*     */     //   1005: invokestatic getPressedMoveDir : ()D
/*     */     //   1008: putfield startX : D
/*     */     //   1011: iconst_0
/*     */     //   1012: istore #5
/*     */     //   1014: iconst_1
/*     */     //   1015: istore #6
/*     */     //   1017: goto -> 1035
/*     */     //   1020: iload #6
/*     */     //   1022: i2d
/*     */     //   1023: invokestatic canStep : (D)Z
/*     */     //   1026: ifeq -> 1032
/*     */     //   1029: iconst_1
/*     */     //   1030: istore #5
/*     */     //   1032: iinc #6, 1
/*     */     //   1035: iload #6
/*     */     //   1037: i2f
/*     */     //   1038: fload #4
/*     */     //   1040: fconst_1
/*     */     //   1041: fadd
/*     */     //   1042: fcmpg
/*     */     //   1043: iflt -> 1020
/*     */     //   1046: iload #5
/*     */     //   1048: ifeq -> 1077
/*     */     //   1051: aload_0
/*     */     //   1052: iconst_1
/*     */     //   1053: putfield isstepping : Z
/*     */     //   1056: goto -> 1077
/*     */     //   1059: aload_0
/*     */     //   1060: getfield mc : Lnet/minecraft/client/Minecraft;
/*     */     //   1063: getfield thePlayer : Lnet/minecraft/client/entity/EntityPlayerSP;
/*     */     //   1066: getfield onGround : Z
/*     */     //   1069: ifeq -> 1077
/*     */     //   1072: aload_0
/*     */     //   1073: iconst_0
/*     */     //   1074: putfield isstepping : Z
/*     */     //   1077: aload_0
/*     */     //   1078: aload_0
/*     */     //   1079: getfield startZ : D
/*     */     //   1082: putfield ticker : D
/*     */     //   1085: aload_0
/*     */     //   1086: invokestatic getPressedMoveDir : ()D
/*     */     //   1089: putfield startZ : D
/*     */     //   1092: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 0
/*     */     //   #61	-> 7
/*     */     //   #62	-> 9
/*     */     //   #63	-> 12
/*     */     //   #65	-> 26
/*     */     //   #66	-> 38
/*     */     //   #67	-> 59
/*     */     //   #68	-> 71
/*     */     //   #70	-> 74
/*     */     //   #71	-> 77
/*     */     //   #72	-> 80
/*     */     //   #73	-> 86
/*     */     //   #74	-> 114
/*     */     //   #75	-> 118
/*     */     //   #76	-> 121
/*     */     //   #79	-> 124
/*     */     //   #80	-> 146
/*     */     //   #81	-> 174
/*     */     //   #82	-> 184
/*     */     //   #72	-> 187
/*     */     //   #86	-> 206
/*     */     //   #88	-> 218
/*     */     //   #90	-> 374
/*     */     //   #91	-> 387
/*     */     //   #93	-> 390
/*     */     //   #95	-> 402
/*     */     //   #96	-> 430
/*     */     //   #98	-> 443
/*     */     //   #100	-> 446
/*     */     //   #101	-> 489
/*     */     //   #103	-> 492
/*     */     //   #104	-> 505
/*     */     //   #105	-> 560
/*     */     //   #108	-> 603
/*     */     //   #110	-> 696
/*     */     //   #112	-> 699
/*     */     //   #113	-> 708
/*     */     //   #114	-> 723
/*     */     //   #115	-> 739
/*     */     //   #116	-> 745
/*     */     //   #117	-> 788
/*     */     //   #121	-> 799
/*     */     //   #122	-> 802
/*     */     //   #123	-> 816
/*     */     //   #124	-> 821
/*     */     //   #125	-> 832
/*     */     //   #126	-> 843
/*     */     //   #127	-> 858
/*     */     //   #142	-> 868
/*     */     //   #144	-> 917
/*     */     //   #149	-> 928
/*     */     //   #151	-> 948
/*     */     //   #152	-> 959
/*     */     //   #156	-> 969
/*     */     //   #157	-> 995
/*     */     //   #158	-> 1004
/*     */     //   #160	-> 1011
/*     */     //   #161	-> 1014
/*     */     //   #162	-> 1020
/*     */     //   #163	-> 1029
/*     */     //   #161	-> 1032
/*     */     //   #166	-> 1046
/*     */     //   #167	-> 1051
/*     */     //   #169	-> 1056
/*     */     //   #170	-> 1059
/*     */     //   #171	-> 1072
/*     */     //   #173	-> 1077
/*     */     //   #174	-> 1085
/*     */     //   #176	-> 1092
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1093	0	this	Lcom/mylo/base/module/impl/Movement/Step;
/*     */     //   0	1093	1	e	Lcom/mylo/base/events/EventUpdate;
/*     */     //   9	1083	2	ncpOffset	F
/*     */     //   12	1080	3	ncptimer	F
/*     */     //   26	1066	4	height	F
/*     */     //   77	892	5	flag	Z
/*     */     //   80	889	6	stepheight	D
/*     */     //   83	123	8	i	D
/*     */     //   146	41	10	mcbb	Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   174	13	11	blacklistbbs	Ljava/util/List;
/*     */     //   1014	42	5	flag	Z
/*     */     //   1017	29	6	i	I
/*     */     // Local variable type table:
/*     */     //   start	length	slot	name	signature
/*     */     //   174	13	11	blacklistbbs	Ljava/util/List<Lnet/minecraft/util/AxisAlignedBB;>;
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
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 180 */     if (e.getPacket() instanceof net.minecraft.network.play.server.S08PacketPlayerPosLook && this.isstepping) {
/* 181 */       this.isstepping = false;
/* 182 */       this.mc.timer.timerSpeed = 1.0F;
/*     */     } 
/*     */   }
/*     */   
/*     */   void ncpStep(double height) {
/* 187 */     List<Double> offset = Arrays.asList(new Double[] { Double.valueOf(Moveutils.getJumpMotion()), Double.valueOf(0.3330013461346D), Double.valueOf(0.2480006020456283D), Double.valueOf(0.08300001346871035D), Double.valueOf(-0.078000013461346D) });
/* 188 */     double posX = this.mc.thePlayer.posX;
/* 189 */     double posZ = this.mc.thePlayer.posZ;
/* 190 */     double y = this.mc.thePlayer.posY;
/* 191 */     if (height < 1.1D) {
/* 192 */       double first = 0.42D;
/* 193 */       double second = 0.74969128346918D;
/* 194 */       if (height != 1.0D) {
/* 195 */         first *= height;
/* 196 */         second *= height;
/* 197 */         if (first > 0.425D) {
/* 198 */           first = 0.425D;
/*     */         }
/* 200 */         if (second > 0.78D) {
/* 201 */           second = 0.78D;
/*     */         }
/* 203 */         if (second < 0.49D) {
/* 204 */           second = 0.49D;
/*     */         }
/*     */       } 
/* 207 */       if (first == 0.42D)
/* 208 */         first = 0.41999998688698D; 
/* 209 */       this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(posX, y + first, posZ, false));
/* 210 */       if (y + second < y + height)
/* 211 */         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(posX, y + second, posZ, false));  return;
/*     */     } 
/* 213 */     if (height < 1.6D) {
/* 214 */       for (int i = 0; i < offset.size(); i++) {
/* 215 */         double off = ((Double)offset.get(i)).doubleValue();
/* 216 */         y += off;
/* 217 */         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(posX, y, posZ, false));
/*     */       } 
/* 219 */     } else if (height < 2.1D) {
/* 220 */       double[] heights = { 0.42499999865D, 0.8209999961347D, 0.698999951236D, 0.59899991631346D, 1.021999991346D, 1.37199949613D, 1.65199993416D, 1.86899996134D }; byte b; int i; double[] arrayOfDouble1;
/* 221 */       for (i = (arrayOfDouble1 = heights).length, b = 0; b < i; ) { double off = arrayOfDouble1[b];
/* 222 */         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(posX, y + off, posZ, false)); b++; }
/*     */     
/*     */     } else {
/* 225 */       double[] heights = { 0.42499999865D, 0.8209999961347D, 0.698999951236D, 0.59899991631346D, 1.021999991346D, 1.37199949613D, 1.65199993416D, 1.86899996134D, 2.01899916346D, 1.9069994136134D }; byte b; int i; double[] arrayOfDouble1;
/* 226 */       for (i = (arrayOfDouble1 = heights).length, b = 0; b < i; ) { double off = arrayOfDouble1[b];
/* 227 */         this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C03PacketPlayer.C04PacketPlayerPosition(posX, y + off, posZ, false));
/*     */         b++; }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onDisable() {
/* 234 */     super.onDisable();
/* 235 */     if (this.mc.thePlayer != null) {
/* 236 */       this.mc.thePlayer.stepHeight = 0.5F;
/*     */     }
/* 238 */     this.mc.timer.timerSpeed = 1.0F;
/* 239 */     this.isstepping = false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Step.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */