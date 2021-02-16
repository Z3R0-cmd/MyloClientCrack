/*    */ package com.mylo.base.module;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventManager;
/*    */ import com.darkmagician6.eventapi.events.Event;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventToggle;
/*    */ import com.mylo.base.utils.MathUtil;
/*    */ import de.Hero.settings.Setting;
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ 
/*    */ public class Module
/*    */ {
/*    */   public String name;
/*    */   public String description;
/*    */   public int keybind;
/*    */   boolean enabled;
/*    */   Category c;
/* 19 */   public double y = 0.0D; public double targetY = 0.0D;
/*    */   
/*    */   public void updatePos() {
/* 22 */     this.y = MathUtil.interPolate(this.y, this.targetY, 0.2D);
/* 23 */     if (this.y + 1.0D > this.targetY && this.y - 1.0D < this.targetY) {
/* 24 */       this.y = this.targetY;
/*    */     }
/*    */   }
/*    */   
/* 28 */   public Minecraft mc = Minecraft.getMinecraft();
/*    */   
/*    */   public Module(String name, String desc, int keybind, Category category) {
/* 31 */     this.name = name;
/* 32 */     this.description = desc;
/* 33 */     this.keybind = keybind;
/* 34 */     this.c = category;
/*    */   }
/*    */   public void toggle() {
/* 37 */     setState(!getState());
/*    */   }
/* 39 */   public void setState(boolean enable) { EventToggle event = new EventToggle(this, Boolean.valueOf(enable));
/* 40 */     EventManager.call((Event)event);
/* 41 */     if (!event.isCancelled()) {
/* 42 */       this.enabled = enable;
/* 43 */       if (getState()) { onEnable(); }
/* 44 */       else { onDisable(); }
/*    */     
/*    */     }  } public boolean getState() {
/* 47 */     return this.enabled;
/*    */   } public void onDisable() {
/* 49 */     EventManager.unregister(this);
/* 50 */     if (this.mc.thePlayer != null && Main.setmgr.getSettingByName("module toggle sounds").getValBoolean())
/* 51 */       this.mc.thePlayer.playSound("random.click", 1000.0F, 0.5F); 
/*    */   }
/*    */   
/*    */   public void onEnable() {
/* 55 */     EventManager.unregister(this);
/* 56 */     EventManager.register(this);
/* 57 */     if (this.mc.thePlayer != null && Main.setmgr.getSettingByName("module toggle sounds").getValBoolean())
/* 58 */       this.mc.thePlayer.playSound("random.click", 1000.0F, 0.6F); 
/*    */   }
/*    */   public void setup() {}
/*    */   
/*    */   public String getRenderName() {
/* 63 */     Setting mode = Main.setmgr.getSettingByName(this.name);
/* 64 */     if (mode != null) {
/* 65 */       return String.valueOf(this.name) + " - " + mode.getValString();
/*    */     }
/*    */     
/* 68 */     return this.name;
/*    */   }
/*    */ 
/*    */   
/*    */   public Category getCategory() {
/* 73 */     return this.c;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/Module.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */