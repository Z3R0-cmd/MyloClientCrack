/*     */ package com.mylo.base.ui.Tabgui.Items;
/*     */ 
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.ui.Tabgui.Item;
/*     */ import com.mylo.base.ui.Tabgui.Items.Settings.BooleanSettingItem;
/*     */ import com.mylo.base.ui.Tabgui.Items.Settings.ComboSettingItem;
/*     */ import com.mylo.base.ui.Tabgui.Items.Settings.SliderSettingItem;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModuleItem
/*     */   extends Item
/*     */ {
/*     */   ArrayList<SettingItem> items;
/*     */   public Module m;
/*     */   
/*     */   public ModuleItem(int x, int height, int width, Module m) {
/*  25 */     super(x, height, width, m.name);
/*  26 */     this.m = m;
/*  27 */     int longest = 0;
/*  28 */     ArrayList<Setting> settings = Main.setmgr.getSettingsByMod(m);
/*  29 */     if (settings != null) {
/*  30 */       for (Setting s : settings) {
/*  31 */         int lenght = 0;
/*  32 */         if (s.isCheck()) { lenght = Fonts.MainFontRenderer.getStringWidth(s.getName()); }
/*  33 */         else if (s.isSlider()) { lenght = Fonts.MainFontRenderer.getStringWidth(s.getName()) + 30; }
/*  34 */         else { lenght = Fonts.MainFontRenderer.getStringWidth(s.getName()) + 10; }
/*  35 */          if (lenght > longest) {
/*  36 */           longest = lenght;
/*     */         }
/*     */       } 
/*  39 */       this.items = new ArrayList<>();
/*  40 */       for (Setting s : settings) {
/*  41 */         if (s.isCheck()) {
/*  42 */           this.items.add(new BooleanSettingItem(x + width + 2, height, longest + 10, s)); continue;
/*  43 */         }  if (s.isCombo()) {
/*  44 */           this.items.add(new ComboSettingItem(x + width + 2, height, longest + 10, s)); continue;
/*  45 */         }  if (s.isSlider())
/*  46 */           this.items.add(new SliderSettingItem(x + width + 2, height, longest + 10, s)); 
/*     */       } 
/*  48 */       ((SettingItem)this.items.get(this.selectedindex)).selected = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void draw(int offset) {
/*  54 */     super.draw(offset);
/*  55 */     this.textcolor = this.m.getState() ? 16777215 : 12303291;
/*  56 */     if (this.opened) {
/*  57 */       int i = 0;
/*  58 */       for (SettingItem item : this.items) {
/*  59 */         item.draw(offset + i * this.height);
/*  60 */         i++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onUpdate() {
/*  67 */     super.onUpdate();
/*  68 */     if (this.opened) {
/*  69 */       for (SettingItem item : this.items) {
/*  70 */         item.onUpdate();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void onKeyPress(int keyCode) {
/*  77 */     super.onKeyPress(keyCode);
/*  78 */     if (this.opened && !((SettingItem)this.items.get(this.selectedindex)).opened) {
/*  79 */       switch (keyCode) {
/*     */         case 203:
/*  81 */           this.opened = false;
/*     */           break;
/*     */ 
/*     */         
/*     */         case 200:
/*  86 */           if (--this.selectedindex < 0) {
/*  87 */             this.selectedindex = this.items.size() - 1;
/*     */           }
/*     */           break;
/*     */         case 208:
/*  91 */           if (++this.selectedindex > this.items.size() - 1) {
/*  92 */             this.selectedindex = 0;
/*     */           }
/*     */           break;
/*     */         case 28:
/*  96 */           ((SettingItem)this.items.get(this.selectedindex)).opened = true;
/*  97 */           if (this.items.get(this.selectedindex) instanceof BooleanSettingItem) {
/*  98 */             ((SettingItem)this.items.get(this.selectedindex)).onKeyPress(keyCode);
/*     */           }
/*     */           break;
/*     */       } 
/*     */       
/* 103 */       for (SettingItem item : this.items) {
/* 104 */         item.selected = false;
/*     */       }
/* 106 */       ((SettingItem)this.items.get(this.selectedindex)).selected = true;
/*     */     }
/* 108 */     else if (this.opened) {
/* 109 */       ((SettingItem)this.items.get(this.selectedindex)).onKeyPress(keyCode);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Items/ModuleItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */