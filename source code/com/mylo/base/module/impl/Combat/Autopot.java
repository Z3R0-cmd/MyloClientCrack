/*     */ package com.mylo.base.module.impl.Combat;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Lookutil;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemPotion;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C03PacketPlayer;
/*     */ import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
/*     */ import net.minecraft.network.play.client.C09PacketHeldItemChange;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Autopot
/*     */   extends Module
/*     */ {
/*     */   TimeHelper timer;
/*     */   boolean readyforPot;
/*     */   boolean readyforSpeed;
/*     */   int waitTicks;
/*     */   
/*     */   public Autopot() {
/*  32 */     super("Autopot", "Automatically use healing potions", 0, Category.Combat);
/*     */ 
/*     */     
/*  35 */     this.timer = new TimeHelper();
/*  36 */     this.readyforPot = false; this.readyforSpeed = false;
/*  37 */     this.waitTicks = 0;
/*     */   }
/*     */   
/*     */   public void onEnable() {
/*  41 */     super.onEnable();
/*  42 */     this.readyforPot = false;
/*  43 */     this.waitTicks = 0;
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  48 */     if (e.isPost() && (
/*  49 */       this.readyforPot || this.readyforSpeed)) {
/*  50 */       Lookutil.lookAtPosPacket(this.mc.thePlayer.getPositionVector().addVector(this.mc.thePlayer.motionX * 10.0D, -0.1D, this.mc.thePlayer.motionZ * 10.0D));
/*  51 */       Main.enableFakeaim(true);
/*     */     } 
/*     */     
/*  54 */     if (e.isPre() && 
/*  55 */       this.timer.hasReached(1000.0F)) {
/*  56 */       this.waitTicks--;
/*  57 */       if (this.waitTicks < 0) {
/*  58 */         this.waitTicks = 0;
/*     */       }
/*  60 */       if (this.mc.thePlayer.getHealth() < this.mc.thePlayer.getMaxHealth() - 4.0F && !this.mc.playerController.isInCreativeMode()) {
/*  61 */         if (this.waitTicks <= 0) {
/*  62 */           int potslot = -1;
/*  63 */           for (int i = 0; i < 45; i++) {
/*  64 */             if (this.mc.thePlayer.inventoryContainer.getSlot(i).getHasStack()) {
/*     */ 
/*     */               
/*  67 */               ItemStack stack = this.mc.thePlayer.inventoryContainer.getSlot(i).getStack();
/*  68 */               if (stack != null && stack.getItem() != null) {
/*  69 */                 Item item = stack.getItem();
/*  70 */                 if (item instanceof ItemPotion && isValidPotion((ItemPotion)item, stack) && potslot == -1)
/*  71 */                   potslot = i; 
/*     */               } 
/*     */             } 
/*     */           } 
/*  75 */           if (potslot != -1 && 
/*  76 */             this.mc.thePlayer.onGround) {
/*     */             
/*  78 */             this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C05PacketPlayerLook(0.0F, 90.0F, true));
/*  79 */             this.waitTicks = 10;
/*  80 */             this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, potslot, 6, 2, (EntityPlayer)this.mc.thePlayer);
/*  81 */             int oldslot = this.mc.thePlayer.inventory.currentItem;
/*  82 */             boolean change = (this.mc.thePlayer.inventory.currentItem != 6);
/*  83 */             if (change) {
/*  84 */               this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C09PacketHeldItemChange(6));
/*  85 */               this.mc.thePlayer.inventory.currentItem = 6;
/*     */             } 
/*     */             
/*  88 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C08PacketPlayerBlockPlacement(this.mc.thePlayer.getHeldItem()));
/*  89 */             Main.enableFakeaim(false);
/*  90 */             this.readyforPot = false;
/*     */             
/*  92 */             if (change) {
/*  93 */               this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C09PacketHeldItemChange(oldslot));
/*  94 */               this.mc.thePlayer.inventory.currentItem = oldslot;
/*     */             }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } else {
/*     */         
/* 101 */         this.readyforPot = false;
/* 102 */         if (!Main.modmgr.getModuleByName("Killaura").getState()) {
/* 103 */           Main.enableFakeaim(false);
/*     */         }
/*     */       } 
/* 106 */       if (!this.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
/* 107 */         int potslot = -1;
/* 108 */         for (int i = 0; i < 45; i++) {
/* 109 */           if (this.mc.thePlayer.inventoryContainer.getSlot(i).getHasStack()) {
/*     */ 
/*     */             
/* 112 */             ItemStack stack = this.mc.thePlayer.inventoryContainer.getSlot(i).getStack();
/* 113 */             if (stack != null && stack.getItem() != null) {
/* 114 */               Item item = stack.getItem();
/* 115 */               if (item instanceof ItemPotion && isSpeedPotion((ItemPotion)item, stack) && potslot == -1)
/* 116 */                 potslot = i; 
/*     */             } 
/*     */           } 
/*     */         } 
/* 120 */         if (potslot != -1 && 
/* 121 */           this.mc.thePlayer.onGround) {
/* 122 */           this.mc.thePlayer.sendQueue.addToSendQueueSilent((Packet)new C03PacketPlayer.C05PacketPlayerLook(0.0F, 90.0F, true));
/* 123 */           this.waitTicks = 10;
/* 124 */           this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, potslot, 6, 2, (EntityPlayer)this.mc.thePlayer);
/* 125 */           int oldslot = this.mc.thePlayer.inventory.currentItem;
/* 126 */           boolean change = (this.mc.thePlayer.inventory.currentItem != 6);
/* 127 */           if (change) {
/* 128 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C09PacketHeldItemChange(6));
/* 129 */             this.mc.thePlayer.inventory.currentItem = 6;
/*     */           } 
/*     */           
/* 132 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C08PacketPlayerBlockPlacement(this.mc.thePlayer.getHeldItem()));
/* 133 */           Main.enableFakeaim(false);
/* 134 */           this.readyforSpeed = false;
/*     */           
/* 136 */           this.timer.reset();
/*     */           
/* 138 */           if (change) {
/* 139 */             this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C09PacketHeldItemChange(oldslot));
/* 140 */             this.mc.thePlayer.inventory.currentItem = oldslot;
/*     */           }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 146 */         this.readyforSpeed = false;
/* 147 */         if (!Main.modmgr.getModuleByName("Killaura").getState()) {
/* 148 */           Main.enableFakeaim(false);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isValidPotion(ItemPotion potion, ItemStack stack) {
/* 156 */     if (ItemPotion.isSplash(stack.getItemDamage())) {
/* 157 */       for (Object o : potion.getEffects(stack)) {
/* 158 */         if (o instanceof PotionEffect) {
/* 159 */           PotionEffect effect = (PotionEffect)o;
/* 160 */           if (effect.getPotionID() == Potion.heal.id || effect.getPotionID() == Potion.regeneration.id) {
/* 161 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 167 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isSpeedPotion(ItemPotion potion, ItemStack stack) {
/* 171 */     if (ItemPotion.isSplash(stack.getItemDamage())) {
/* 172 */       for (Object o : potion.getEffects(stack)) {
/* 173 */         if (o instanceof PotionEffect) {
/* 174 */           PotionEffect effect = (PotionEffect)o;
/* 175 */           if (effect.getPotionID() == Potion.moveSpeed.id) {
/* 176 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 182 */     return false;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Combat/Autopot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */