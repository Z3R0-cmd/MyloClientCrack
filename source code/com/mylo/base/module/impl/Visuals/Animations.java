/*    */ package com.mylo.base.module.impl.Visuals;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ public class Animations
/*    */   extends Module
/*    */ {
/*    */   public Animations() {
/* 14 */     super("Animations", "items go wee", 0, Category.Visuals);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setup() {
/* 19 */     super.setup();
/* 20 */     ArrayList<String> options = new ArrayList<>();
/* 21 */     options.add("vanilla");
/* 22 */     options.add("1.7");
/* 23 */     options.add("smallsword");
/* 24 */     options.add("slide");
/* 25 */     options.add("slide2");
/* 26 */     options.add("slide3");
/* 27 */     options.add("tap");
/* 28 */     options.add("tap2");
/* 29 */     options.add("tap3");
/* 30 */     options.add("spin");
/* 31 */     options.add("spin2");
/* 32 */     options.add("inverse");
/* 33 */     options.add("smallchop");
/* 34 */     options.add("push");
/* 35 */     options.add("fullswordrot");
/* 36 */     options.add("decaptiate");
/* 37 */     options.add("smooth");
/* 38 */     options.add("differenthit");
/* 39 */     options.add("bigswing");
/* 40 */     options.add("swingo");
/* 41 */     options.add("wtf");
/* 42 */     options.add("ninja");
/* 43 */     options.add("ninja2");
/* 44 */     options.add("gun");
/* 45 */     Main.setmgr.rSetting(new Setting(this.name, this, "vanilla", options));
/* 46 */     options = new ArrayList<>();
/* 47 */     options.add("vanilla");
/* 48 */     options.add("onlyrotate");
/* 49 */     options.add("stab");
/* 50 */     options.add("smallmove");
/* 51 */     Main.setmgr.rSetting(new Setting("hit animation", this, "vanilla", options));
/* 52 */     Main.setmgr.rSetting(new Setting("animation speed", this, 1.0D, 0.05D, 3.0D, false));
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/impl/Visuals/Animations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */