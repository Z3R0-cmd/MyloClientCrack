/*     */ package com.mylo.base.module.impl.Misc;
/*     */ 
/*     */ import com.darkmagician6.eventapi.EventTarget;
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.events.EventPacket;
/*     */ import com.mylo.base.events.EventUpdate;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.TimeHelper;
/*     */ import de.Hero.settings.Setting;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.ItemSword;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.client.C0DPacketCloseWindow;
/*     */ import net.minecraft.network.play.client.C16PacketClientStatus;
/*     */ import net.minecraft.network.play.server.S02PacketChat;
/*     */ import net.minecraft.network.play.server.S39PacketPlayerAbilities;
/*     */ import net.minecraft.network.play.server.S45PacketTitle;
/*     */ 
/*     */ public class InvCleaner
/*     */   extends Module {
/*     */   boolean fakeopen;
/*     */   TimeHelper timer;
/*     */   boolean flag;
/*     */   boolean ready;
/*     */   
/*     */   public InvCleaner() {
/*  32 */     super("Invcleaner", "automatically throw away items gg", 44, Category.Combat);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.fakeopen = false;
/*  43 */     this.timer = new TimeHelper();
/*  44 */     this.flag = false;
/*  45 */     this.ready = false;
/*     */   }
/*     */   
/*     */   public void onEnable() {
/*  49 */     super.onEnable();
/*     */   } public void setup() { super.setup();
/*     */     Main.setmgr.rSetting(new Setting("invcleaner delay", this, 100.0D, 0.0D, 500.0D, true));
/*     */     Main.setmgr.rSetting(new Setting("fake inv", this, false)); } @EventTarget
/*     */   public void onUpdate(EventUpdate e) {
/*  54 */     int delay = (int)Main.setmgr.getSettingByName("invcleaner delay").getValDouble();
/*  55 */     boolean fake = Main.setmgr.getSettingByName("fake inv").getValBoolean();
/*  56 */     if (this.flag && this.mc.thePlayer.ticksExisted < 15) {
/*  57 */       setState(false);
/*     */     }
/*  59 */     else if (this.flag) {
/*  60 */       this.flag = false;
/*     */     } 
/*  62 */     boolean flag2 = false;
/*  63 */     if (e.isPre() && (!(this.mc.currentScreen instanceof net.minecraft.client.gui.inventory.GuiContainer) || this.mc.currentScreen instanceof net.minecraft.client.gui.inventory.GuiInventory) && Main.doneautoarmor && !this.mc.thePlayer.isUsingItem()) {
/*  64 */       ItemStack equipitem = null;
/*  65 */       int slotid = -1;
/*  66 */       int bestswordslot = -1;
/*  67 */       ItemStack bestsword = null; int i;
/*  68 */       for (i = 9; i < 45; i++) {
/*  69 */         if (this.mc.thePlayer.inventoryContainer.getSlot(i).getHasStack()) {
/*     */ 
/*     */           
/*  72 */           ItemStack stack = this.mc.thePlayer.inventoryContainer.getSlot(i).getStack();
/*  73 */           if (stack != null && stack.getItem() != null) {
/*  74 */             Item item = stack.getItem();
/*  75 */             if ((item instanceof ItemSword && bestsword == null) || (bestsword != null && item instanceof ItemSword && getDamage(stack) > getDamage(bestsword))) {
/*  76 */               bestsword = stack;
/*  77 */               bestswordslot = i;
/*     */             } 
/*     */           } 
/*     */         } 
/*  81 */       }  for (i = 9; i < 45; i++) {
/*  82 */         if (this.mc.thePlayer.inventoryContainer.getSlot(i).getHasStack()) {
/*     */ 
/*     */           
/*  85 */           ItemStack stack = this.mc.thePlayer.inventoryContainer.getSlot(i).getStack();
/*  86 */           if (stack != null && stack.getItem() != null) {
/*  87 */             Item item = stack.getItem();
/*  88 */             if (!(item instanceof net.minecraft.item.ItemFood) && !(item instanceof net.minecraft.item.ItemBlock) && !(item instanceof net.minecraft.item.ItemBed) && !(item instanceof net.minecraft.item.ItemPotion) && !(item instanceof net.minecraft.item.ItemTool) && !item.getUnlocalizedName().contains("compass") && (
/*  89 */               !(item instanceof ItemSword) || bestsword == null || stack != bestsword)) {
/*  90 */               slotid = i;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*  95 */       if (slotid != -1 && this.timer.hasReached(delay)) {
/*  96 */         if (fake) {
/*  97 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
/*     */         }
/*  99 */         this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, slotid, 1, 4, (EntityPlayer)this.mc.thePlayer);
/* 100 */         if (fake) {
/* 101 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0DPacketCloseWindow(this.mc.thePlayer.inventoryContainer.windowId));
/*     */         }
/* 103 */         this.timer.reset();
/*     */       }
/* 105 */       else if (bestsword != null && bestswordslot != -1 && this.timer.hasReached(delay) && 
/* 106 */         this.mc.thePlayer.inventoryContainer.getSlot(bestswordslot).getHasStack() && !(this.mc.currentScreen instanceof net.minecraft.client.gui.inventory.GuiContainer) && this.mc.thePlayer.ticksExisted % 20 == 0) {
/*     */         
/* 108 */         if (fake) {
/* 109 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
/*     */         }
/* 111 */         this.mc.playerController.windowClick(this.mc.thePlayer.inventoryContainer.windowId, bestswordslot, 0, 2, (EntityPlayer)this.mc.thePlayer);
/* 112 */         if (fake) {
/* 113 */           this.mc.thePlayer.sendQueue.addToSendQueue((Packet)new C0DPacketCloseWindow(this.mc.thePlayer.inventoryContainer.windowId));
/*     */         }
/*     */         
/* 116 */         this.timer.reset();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static double getDamage(ItemStack s) {
/* 123 */     ItemSword sword = (ItemSword)s.getItem();
/* 124 */     double damage = (sword.getDamageVsEntity() + 4.0F);
/* 125 */     if (s.hasEffect() && s.hasTagCompound()) {
/* 126 */       NBTTagList nbttaglist = s.getEnchantmentTagList();
/*     */       
/* 128 */       if (nbttaglist != null)
/*     */       {
/* 130 */         for (int k = 0; k < nbttaglist.tagCount(); k++) {
/*     */           
/* 132 */           int l = nbttaglist.getCompoundTagAt(k).getShort("id");
/*     */           
/* 134 */           if (Enchantment.getEnchantmentById(l) != null) {
/*     */             
/* 136 */             Enchantment enchantment2 = Enchantment.getEnchantmentById(l);
/*     */             
/* 138 */             if (enchantment2.effectId == Enchantment.sharpness.effectId) {
/* 139 */               short strenght = nbttaglist.getCompoundTagAt(k).getShort("lvl");
/* 140 */               damage += strenght * 1.25D;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/* 146 */     return damage;
/*     */   }
/*     */   
/*     */   @EventTarget
/*     */   public void onPacket(EventPacket e) {
/* 151 */     if (e.getPacket() instanceof S45PacketTitle) {
/* 152 */       S45PacketTitle p = (S45PacketTitle)e.getPacket();
/* 153 */       String str = p.getMessage().getUnformattedText().toLowerCase();
/*     */     } 
/* 155 */     if (e.getPacket() instanceof net.minecraft.network.play.server.S08PacketPlayerPosLook) {
/* 156 */       this.flag = true;
/*     */     }
/* 158 */     if (e.getPacket() instanceof S39PacketPlayerAbilities) {
/* 159 */       S39PacketPlayerAbilities packet = (S39PacketPlayerAbilities)e.getPacket();
/* 160 */       if (packet.isAllowFlying() != this.mc.thePlayer.capabilities.allowFlying) {
/* 161 */         setState(false);
/*     */       }
/*     */     } 
/* 164 */     if (e.getPacket() instanceof S02PacketChat) {
/* 165 */       S02PacketChat p = (S02PacketChat)e.getPacket();
/* 166 */       if (p.getChatComponent().getUnformattedText().toLowerCase().contains("fight"))
/* 167 */         this.ready = true; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/InvCleaner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */