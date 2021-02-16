/*    */ package com.mylo.base.utils;
/*    */ 
/*    */ import com.mylo.base.specialobjects.Point3d;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import net.minecraft.util.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pathing
/*    */ {
/*    */   public static ArrayList<Vec3> getPathToPos(Vec3 start, Vec3 end, float jumpsize) {
/* 16 */     Minecraft mc = Minecraft.getMinecraft();
/* 17 */     double startX = start.xCoord;
/* 18 */     double startY = start.yCoord;
/* 19 */     double startZ = start.zCoord;
/* 20 */     ArrayList<Vec3> output = new ArrayList<>();
/* 21 */     double currentX = startX;
/* 22 */     double currentY = startY;
/* 23 */     double currentZ = startZ;
/* 24 */     double targetx = end.xCoord;
/* 25 */     double targety = end.yCoord;
/* 26 */     double targetz = end.zCoord;
/*    */     
/* 28 */     double distance = mc.thePlayer.getDistance(targetx, targety, targetz) / jumpsize;
/*    */     
/* 30 */     for (int i = 0; i < 100; i++) {
/* 31 */       if (getDistance3d(new Point3d(currentX, currentY, currentZ), new Point3d(targetx, targety, targetz)) < jumpsize + 0.5D) {
/* 32 */         output.add(new Vec3(targetx, targety, targetz));
/*    */         
/*    */         break;
/*    */       } 
/* 36 */       if ((int)currentY != (int)targety) {
/* 37 */         currentY += (targety - startY) / distance;
/*    */       }
/* 39 */       if ((int)currentX != (int)targetx) {
/* 40 */         currentX += (targetx - startX) / distance;
/*    */       }
/* 42 */       if ((int)currentZ != (int)targetz) {
/* 43 */         currentZ += (targetz - startZ) / distance;
/*    */       }
/* 45 */       AxisAlignedBB bb = new AxisAlignedBB(currentX - (mc.thePlayer.width / 2.0F), currentY, currentZ - (mc.thePlayer.width / 2.0F), currentX + (mc.thePlayer.width / 2.0F), currentY + mc.thePlayer.height, currentZ + (mc.thePlayer.width / 2.0F));
/*    */       
/* 47 */       output.add(new Vec3(currentX, currentY, currentZ));
/*    */     } 
/* 49 */     return output;
/*    */   }
/*    */ 
/*    */   
/*    */   public static float getDistance3d(Point3d point1, Point3d point2) {
/* 54 */     float f = (float)(point1.x - point2.x);
/* 55 */     float f1 = (float)(point1.y - point2.y);
/* 56 */     float f2 = (float)(point1.z - point2.z);
/* 57 */     return MathHelper.sqrt_float(f * f + f1 * f1 + f2 * f2);
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/utils/Pathing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */