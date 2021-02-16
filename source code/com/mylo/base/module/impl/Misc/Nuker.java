/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.block.state.IBlockState;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.BlockPos;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Nuker
/*    */   extends Module
/*    */ {
/*    */   public Nuker() {
/* 26 */     super("Nuker", "break blocks around you", 49, Category.Misc);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 31 */     Main.setmgr.rSetting(new Setting("nuker range", this, 1.0D, 1.0D, 6.0D, false));
/* 32 */     Main.setmgr.rSetting(new Setting("nuker amount", this, 1.0D, 1.0D, 20.0D, true));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 37 */     Main.enableFakeaim(false);
/* 38 */     double range = Main.setmgr.getSettingByName("nuker range").getValDouble();
/* 39 */     int amount = (int)Main.setmgr.getSettingByName("nuker amount").getValDouble();
/* 40 */     Iterable<BlockPos> posses = BlockPos.getAllInBox(this.mc.thePlayer.getPosition().add(-range / 2.0D, -range / 2.0D, -range / 2.0D), this.mc.thePlayer.getPosition().add(range / 2.0D, range / 2.0D, range / 2.0D));
/* 41 */     ArrayList<BlockPos> posList = new ArrayList<>();
/* 42 */     posses.forEach(pos -> { 
/* 43 */         }); Collections.sort(posList, new Comparator<BlockPos>()
/*    */         {
/*    */           public int compare(BlockPos bpos1, BlockPos bpos2) {
/* 46 */             double px = Nuker.this.mc.thePlayer.posX;
/* 47 */             double py = Nuker.this.mc.thePlayer.posY;
/* 48 */             double pz = Nuker.this.mc.thePlayer.posZ;
/* 49 */             double x1 = bpos1.getX();
/* 50 */             double x2 = bpos2.getX();
/* 51 */             double y1 = bpos1.getY();
/* 52 */             double y2 = bpos2.getY();
/* 53 */             double z1 = bpos1.getZ();
/* 54 */             double z2 = bpos2.getZ();
/* 55 */             double bpos1diff = Math.sqrt((x1 - px) * (x1 - px) + (y1 - py) * (y1 - py) + (z1 - pz) * (z1 - pz));
/* 56 */             double bpos2diff = Math.sqrt((x2 - px) * (x2 - px) + (y2 - py) * (y2 - py) + (z2 - pz) * (z2 - pz));
/* 57 */             return (bpos1diff > bpos2diff) ? 1 : -1;
/*    */           }
/*    */         });
/* 60 */     for (int i = 0; i < amount; i++) {
/* 61 */       for (BlockPos pos : posList) {
/* 62 */         double px = this.mc.thePlayer.posX;
/* 63 */         double py = this.mc.thePlayer.posY;
/* 64 */         double pz = this.mc.thePlayer.posZ;
/* 65 */         double x1 = pos.getX();
/* 66 */         double y1 = pos.getY();
/* 67 */         double z1 = pos.getZ();
/* 68 */         double bpos1diff = Math.sqrt((x1 - px) * (x1 - px) + (y1 - py) * (y1 - py) + (z1 - pz) * (z1 - pz));
/* 69 */         if (bpos1diff <= range) {
/* 70 */           IBlockState state = this.mc.theWorld.getBlockState(pos);
/* 71 */           Block block = state.getBlock();
/* 72 */           boolean flag = (block.getMaterial() != Material.air);
/* 73 */           float hardness = block.getPlayerRelativeBlockHardness((EntityPlayer)this.mc.thePlayer, (World)this.mc.theWorld, pos);
/* 74 */           if (flag && ((!Float.isInfinite(hardness) && hardness != 0.0F) || this.mc.playerController.isInCreativeMode())) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 81 */             this.mc.playerController.clickBlock(pos, EnumFacing.UP);
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/Nuker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */