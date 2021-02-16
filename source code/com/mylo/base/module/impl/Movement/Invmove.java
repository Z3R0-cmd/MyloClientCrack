/*    */ package com.mylo.base.module.impl.Movement;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.mylo.base.events.EventUpdate;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.TimeHelper;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.settings.GameSettings;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Invmove
/*    */   extends Module
/*    */ {
/*    */   TimeHelper timer;
/*    */   
/*    */   public Invmove() {
/* 32 */     super("Invmove", "move with inventory open gg", 0, Category.Movement);
/*    */ 
/*    */     
/* 35 */     this.timer = new TimeHelper();
/*    */   }
/*    */   @EventTarget
/*    */   public void onUpdate(EventUpdate e) {
/* 39 */     if (this.mc.currentScreen != null && !(this.mc.currentScreen instanceof net.minecraft.client.gui.GuiChat)) {
/* 40 */       GameSettings set = this.mc.gameSettings;
/* 41 */       ArrayList<KeyBinding> allowedbinds = new ArrayList<>();
/* 42 */       allowedbinds.add(set.keyBindLeft);
/* 43 */       allowedbinds.add(set.keyBindRight);
/* 44 */       allowedbinds.add(set.keyBindForward);
/* 45 */       allowedbinds.add(set.keyBindBack);
/* 46 */       allowedbinds.add(set.keyBindJump);
/* 47 */       allowedbinds.add(set.keyBindSneak);
/* 48 */       allowedbinds.add(set.keyBindSprint);
/* 49 */       for (KeyBinding bind : allowedbinds) {
/* 50 */         KeyBinding.setKeyBindState(bind.getKeyCode(), Keyboard.isKeyDown(bind.getKeyCode()));
/*    */       }
/* 52 */       double hor = 0.0D;
/* 53 */       double ver = 0.0D;
/* 54 */       if (Keyboard.isKeyDown(205)) hor++; 
/* 55 */       if (Keyboard.isKeyDown(203)) hor--; 
/* 56 */       if (Keyboard.isKeyDown(200)) ver++; 
/* 57 */       if (Keyboard.isKeyDown(208)) ver--; 
/* 58 */       this.mc.thePlayer.rotationPitch = (float)(this.mc.thePlayer.rotationPitch - ver * 2.0D);
/* 59 */       this.mc.thePlayer.rotationYaw = (float)(this.mc.thePlayer.rotationYaw + hor * 2.0D);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Movement/Invmove.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */