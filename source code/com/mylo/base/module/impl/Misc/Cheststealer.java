/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.TimeHelper;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.client.gui.inventory.GuiChest;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Cheststealer
/*    */   extends Module
/*    */ {
/*    */   TimeHelper timer;
/*    */   
/*    */   public Cheststealer() {
/* 27 */     super("Cheststealer", "automatically take items out of chests gg", 25, Category.Misc);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     this.timer = new TimeHelper();
/*    */   }
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 40 */     int delay = (int)Main.setmgr.getSettingByName("ChestStealer delay").getValDouble();
/* 41 */     String name = ((GuiChest)this.mc.currentScreen).lowerChestInventory.getDisplayName().getUnformattedText();
/* 42 */     boolean go = true;
/* 43 */     String[] blacklistednames = { "buy", "weapon", "sword", "tool", "quick", "mod", "jog", "cli", "tele", "para", "vo", "teleport", "wars", "lobby", "lobbies", "lucky", "solo", "team", "duo", "reward", "gift", "shop", "cosmetic", "mode", "pick", "menu", "hub", "compass", "choose", "select", "game", "click", "captcha", "play", "skywars", "bedwars", "kit", "pvp", "pot", "survival", "murder", "server", "list", "uhc", "factions", "survival", "prison", "skyblock", "creative", "clans" };
/* 44 */     if (e.isPre()) {
/* 45 */       byte b; int i; String[] arrayOfString; for (i = (arrayOfString = blacklistednames).length, b = 0; b < i; ) { String s = arrayOfString[b];
/* 46 */         if (name.toLowerCase().contains(s.toLowerCase()))
/* 47 */           go = false; 
/*    */         b++; }
/*    */     
/*    */     } 
/* 51 */     if (e.isPre() && this.mc.currentScreen instanceof GuiChest && go) {
/* 52 */       GuiChest screen = (GuiChest)this.mc.currentScreen;
/* 53 */       int slotid = -1;
/* 54 */       for (int i = 0; i < 53; i++) {
/* 55 */         ItemStack stack = screen.lowerChestInventory.getStackInSlot(i);
/* 56 */         if (stack != null)
/*    */         {
/*    */           
/* 59 */           if (stack.getItem() != null) {
/* 60 */             Item item = stack.getItem();
/* 61 */             if (item instanceof net.minecraft.item.ItemArmor || item instanceof net.minecraft.item.ItemBlock || item instanceof net.minecraft.item.ItemSword || item instanceof net.minecraft.item.ItemFood || item instanceof net.minecraft.item.ItemPotion)
/* 62 */               slotid = i; 
/*    */           } 
/*    */         }
/*    */       } 
/* 66 */       if (slotid != -1 && this.timer.hasReached(delay)) {
/* 67 */         this.mc.playerController.windowClick(screen.inventorySlots.windowId, slotid, 0, 1, (EntityPlayer)this.mc.thePlayer);
/* 68 */         this.timer.reset();
/*    */       } 
/* 70 */       if (slotid == -1) {
/* 71 */         this.mc.thePlayer.closeScreen();
/*    */       }
/*    */     }
/* 74 */     else if (e.isPre()) {
/* 75 */       this.timer.reset();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void setup() {
/*    */     super.setup();
/*    */     Main.setmgr.rSetting(new Setting("ChestStealer delay", this, 150.0D, 0.0D, 500.0D, true));
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/Cheststealer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */