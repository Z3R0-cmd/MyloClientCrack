/*     */ package com.mylo.base.module;
/*     */ import com.mylo.base.module.impl.Combat.Criticals;
/*     */ import com.mylo.base.module.impl.Combat.SuperKnockback;
/*     */ import com.mylo.base.module.impl.Combat.fastuse;
/*     */ import com.mylo.base.module.impl.Exploit.Regen;
/*     */ import com.mylo.base.module.impl.Misc.Cakeeater;
/*     */ import com.mylo.base.module.impl.Misc.CheaterDetector;
/*     */ import com.mylo.base.module.impl.Movement.Antivoid;
/*     */ import com.mylo.base.module.impl.Movement.ClickTp;
/*     */ import com.mylo.base.module.impl.Movement.NoSlow;
/*     */ import com.mylo.base.module.impl.Movement.Phase;
/*     */ import com.mylo.base.module.impl.Movement.TpExploit;
/*     */ import com.mylo.base.module.impl.Visuals.Animations;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class Modulemanager {
/*     */   public Modulemanager() {
/*  18 */     this.modlist = new ArrayList<>();
/*     */     
/*  20 */     add((Module)new Sprint());
/*  21 */     add((Module)new GUI());
/*  22 */     add((Module)new Killaura());
/*  23 */     add((Module)new NoSlow());
/*  24 */     add((Module)new Flight());
/*  25 */     add((Module)new AntiKnockback());
/*  26 */     add((Module)new Nofall());
/*  27 */     add((Module)new Speed());
/*  28 */     add((Module)new Longjump());
/*  29 */     add((Module)new Scaffold());
/*  30 */     add((Module)new Step());
/*  31 */     add((Module)new Autoarmor());
/*  32 */     add((Module)new Phase());
/*  33 */     add((Module)new Disabler());
/*  34 */     add((Module)new ESP());
/*  35 */     add((Module)new Antivoid());
/*  36 */     add((Module)new Cheststealer());
/*  37 */     add((Module)new InvCleaner());
/*  38 */     add((Module)new Invmove());
/*  39 */     add((Module)new Fullbright());
/*  40 */     add((Module)new AntiAim());
/*  41 */     add((Module)new Animations());
/*  42 */     add((Module)new Bowaimbot());
/*  43 */     add((Module)new fastuse());
/*  44 */     add((Module)new Criticals());
/*  45 */     add((Module)new Jesus());
/*  46 */     add((Module)new Regen());
/*  47 */     add((Module)new Autopot());
/*  48 */     add((Module)new SuperKnockback());
/*  49 */     add((Module)new TpAura());
/*  50 */     add((Module)new DelayPackets());
/*  51 */     add((Module)new PingSpoof());
/*  52 */     add((Module)new Discordfrspammer());
/*  53 */     add((Module)new Hud());
/*  54 */     add((Module)new TargetStrafe());
/*  55 */     add((Module)new NameProtect());
/*  56 */     add((Module)new Cakeeater());
/*  57 */     add((Module)new DamageDisplay());
/*  58 */     add((Module)new ClickTp());
/*  59 */     add((Module)new TpExploit());
/*  60 */     add((Module)new ServerCrasher());
/*  61 */     add((Module)new Autoplayer());
/*  62 */     add((Module)new CheaterDetector());
/*  63 */     add((Module)new NoHurtCam());
/*  64 */     add((Module)new liquidinteract());
/*  65 */     add((Module)new GodMode());
/*  66 */     add((Module)new Crack());
/*  67 */     add((Module)new Youtube());
/*  68 */     add((Module)new ToxicToggle());
/*  69 */     add((Module)new SpinItem());
/*  70 */     add((Module)new Nuker());
/*  71 */     add((Module)new Tracers());
/*  72 */     add((Module)new Nametags());
/*  73 */     add((Module)new Freecam());
/*  74 */     add((Module)new NoViewReset());
/*     */   }
/*     */   ArrayList<Module> modlist;
/*     */   private void add(Module m) {
/*  78 */     this.modlist.add(m);
/*     */   }
/*     */   
/*     */   public ArrayList<Module> getModules() {
/*  82 */     return this.modlist;
/*     */   }
/*     */   
/*     */   public ArrayList<Module> getEnabledModules() {
/*  86 */     ArrayList<Module> returnlist = new ArrayList<>();
/*  87 */     for (Module m : this.modlist) {
/*  88 */       if (m.getState()) {
/*  89 */         returnlist.add(m);
/*     */       }
/*     */     } 
/*  92 */     return returnlist;
/*     */   }
/*     */   
/*     */   public Module getModuleByName(String name) {
/*  96 */     for (Module m : this.modlist) {
/*  97 */       if (m.name.equalsIgnoreCase(name)) {
/*  98 */         return m;
/*     */       }
/*     */     } 
/* 101 */     return null;
/*     */   }
/*     */   
/*     */   public ArrayList<Module> getModulesInCategory(Category c) {
/* 105 */     ArrayList<Module> returnlist = new ArrayList<>();
/* 106 */     for (Module m : this.modlist) {
/* 107 */       if (m.getCategory() == c) {
/* 108 */         returnlist.add(m);
/*     */       }
/*     */     } 
/* 111 */     return returnlist;
/*     */   }
/*     */   
/*     */   public ArrayList<String> getSortedModules() {
/* 115 */     ArrayList<String> modules = new ArrayList<>();
/* 116 */     for (Module m : getEnabledModules()) {
/* 117 */       modules.add(m.getRenderName());
/*     */     }
/* 119 */     return stringlistsort.main(modules);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/module/Modulemanager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */