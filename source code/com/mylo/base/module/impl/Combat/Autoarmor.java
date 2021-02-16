/*    */ package com.mylo.base.module.impl.Combat;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.TimeHelper;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemArmor;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.network.Packet;
/*    */ import net.minecraft.network.play.client.C0DPacketCloseWindow;
/*    */ import net.minecraft.network.play.client.C16PacketClientStatus;
/*    */ 
/*    */ public class Autoarmor extends Module {
/*    */   TimeHelper timer;
/*    */   
/*    */   public Autoarmor() {
/* 23 */     super("Autoarmor", "automatically put on armor gg", 0, Category.Combat);
/*    */ 
/*    */     
/* 26 */     this.timer = new TimeHelper();
/* 27 */     this.fakeopen = false;
/*    */   }
/*    */   
/*    */   boolean fakeopen;
/*    */   
/*    */   public void setup() {
/* 33 */     super.setup();
/* 34 */     Main.setmgr.rSetting(new Setting("fake inv ", this, false));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 39 */     boolean fake = Main.setmgr.getSettingByName("fake inv ").getValBoolean();
/* 40 */     Main.doneautoarmor = false;
/* 41 */     if (e.isPre() && (!(this.mc.currentScreen instanceof net.minecraft.client.gui.inventory.GuiContainer) || this.mc.currentScreen instanceof net.minecraft.client.gui.inventory.GuiInventory)) {
/* 42 */       ItemStack equipitem = null;
/* 43 */       int slotid = -1;
/* 44 */       for (int i = 9; i < 45; i++) {
/* 45 */         if (this.mc.thePlayer.inventoryContainer.getSlot(i).getHasStack()) {
/*    */ 
/*    */           
/* 48 */           ItemStack stack = this.mc.thePlayer.inventoryContainer.getSlot(i).getStack();
/* 49 */           if (stack != null && stack.getItem() != null) {
/* 50 */             Item item = stack.getItem();
/* 51 */             if (item instanceof ItemArmor) {
/* 52 */               ItemArmor itemarmor = (ItemArmor)item;
/* 53 */               Slot inventoryarmor = this.mc.thePlayer.inventoryContainer.getSlot(5 + itemarmor.armorType);
/* 54 */               if (equipitem == null || ((ItemArmor)equipitem.getItem()).damageReduceAmount <= itemarmor.damageReduceAmount)
/*    */               {
/*    */                 
/* 57 */                 if (inventoryarmor.getHasStack() && inventoryarmor.getStack().getItem() != null && ((ItemArmor)inventoryarmor.getStack().getItem()).damageReduceAmount < itemarmor.damageReduceAmount) {
/* 58 */                   if (fake) {
/* 59 */                     this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
/*    */                   }
/*    */                   
/* 62 */                   this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, inventoryarmor.slotNumber, 1, 4, (EntityPlayer)this.mc.thePlayer);
/*    */                   
/* 64 */                   if (fake) {
/* 65 */                     this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0DPacketCloseWindow(this.mc.thePlayer.inventoryContainer.windowId));
/*    */                   }
/*    */                 }
/* 68 */                 else if (!inventoryarmor.getHasStack()) {
/* 69 */                   equipitem = stack;
/* 70 */                   slotid = i;
/*    */                 }  } 
/*    */             } 
/*    */           } 
/*    */         } 
/* 75 */       }  if (equipitem != null && slotid != -1 && this.timer.hasReached(175.0F)) {
/* 76 */         if (fake) {
/* 77 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
/*    */         }
/* 79 */         this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, slotid, 0, 1, (EntityPlayer)this.mc.thePlayer);
/* 80 */         this.timer.reset();
/* 81 */         if (fake) {
/* 82 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0DPacketCloseWindow(this.mc.thePlayer.inventoryContainer.windowId));
/*    */         }
/*    */       }
/* 85 */       else if (slotid == -1) {
/* 86 */         Main.doneautoarmor = true;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/Autoarmor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */