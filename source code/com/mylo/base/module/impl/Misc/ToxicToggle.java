/*    */ package com.mylo.base.module.impl.Misc;
/*    */ 
/*    */ import com.darkmagician6.eventapi.EventTarget;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.events.EventToggle;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class ToxicToggle
/*    */   extends Module {
/*    */   public ToxicToggle() {
/* 15 */     super("ToxicToggle", "send a toxic message in chat when you toggle a module", 0, Category.Misc);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 20 */     Main.setmgr.rSetting(new Setting(this.name, this, "normal", Lists.newArrayList((Object[])new String[] { "normal", "cubecraft" })));
/* 21 */     Main.setmgr.rSetting(new Setting("send on disable", this, false));
/*    */   }
/*    */   
/*    */   @EventTarget
/*    */   public void onToggle(EventToggle e) {
/* 26 */     if (e.mod.getCategory() != Category.Visuals && e.mod.getCategory() != Category.Misc && e.mod.getCategory() != Category.Gui) {
/* 27 */       String state = e.state.booleanValue() ? "enabled" : "disabled";
/* 28 */       ArrayList<String> quotes = new ArrayList<>();
/* 29 */       if (e.state.booleanValue() || Main.setmgr.getSettingByName("send on disable").getValBoolean()) {
/* 30 */         String str; switch ((str = Main.setmgr.getSettingByName(this.name).getValString()).hashCode()) { case -1039745817: if (!str.equals("normal")) {
/*    */               break;
/*    */             }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 41 */             quotes.add("OMG REPORT I " + state + " " + e.mod.name);
/* 42 */             quotes.add("I have just " + state + " " + e.mod.name + " and you can't do anything about it");
/* 43 */             quotes.add("I have just " + state + " " + e.mod.name + " but i'm not getting banned?");
/* 44 */             quotes.add("I start thinking cheating is actually allowed here"); break;
/*    */           case -1031473397:
/*    */             if (!str.equals("cubecraft"))
/* 47 */               break;  quotes.add("I just " + state + " " + e.mod.name + " and there's nothing funkemunkey can do about it"); quotes.add(String.valueOf(e.mod.name) + " is now " + state + " and funkemunkey is having a hard time patching it"); quotes.add("Cubecraft is the best server, they still have not patched " + e.mod.name + ", which i just " + state); quotes.add("I have just " + state + " " + e.mod.name + " but cubecraft is not banning me"); quotes.add("OMG REPORT I " + state + " " + e.mod.name); quotes.add("Funkemunkey best anticheat dev bro... doing good patching " + e.mod.name + " which i just " + state + " btw."); quotes.add("I start thinking cheating is actually allowed here"); break; }  this.mc.thePlayer.sendChatMessage(quotes.get((int)(Math.random() * (quotes.size() - 1))));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Misc/ToxicToggle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */