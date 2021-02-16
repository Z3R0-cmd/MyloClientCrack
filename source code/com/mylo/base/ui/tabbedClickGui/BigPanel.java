/*     */ package com.mylo.base.ui.tabbedClickGui;
/*     */ 
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.module.Module;
/*     */ import com.mylo.base.utils.Fonts;
/*     */ import com.mylo.base.utils.MathUtil;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import com.mylo.base.utils.font.FontRenderer;
/*     */ import de.Hero.settings.Setting;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ 
/*     */ public class BigPanel
/*     */ {
/*  19 */   public int x = 10; public int y = 10; public int height = 250; public int width = 400; public int topHeight = 10; public int categoryWidth = 100; public int categoryHeight = 40; public int dragXOffset;
/*     */   public int dragYOffset;
/*  21 */   double scroll = 0.0D; int lastMouseX; int lastMouseY; double targetScroll = 0.0D; double modScroll = 0.0D; double modTargetScroll = 0.0D; double setScroll = 0.0D; double setTargetScroll = 0.0D;
/*     */   boolean dragging = false;
/*  23 */   int colorMain = -12434878; int colorTopBar = -14869219; int colorText = -1; int colorCategorySplitter = -1; int colorCategorySplitterEdge = 1442840575; int colorItem = -14606047;
/*  24 */   Category selectedCat = Category.values()[0];
/*  25 */   public Module selectedMod = null;
/*  26 */   ArrayList<ModuleComponent> modules = new ArrayList<>();
/*  27 */   ArrayList<SettingItem> settings = new ArrayList<>();
/*     */   
/*     */   public BigPanel() {
/*  30 */     updateModulesList();
/*     */   }
/*     */   
/*     */   public void updateModulesList() {
/*  34 */     this.modules = new ArrayList<>();
/*  35 */     int i = 0;
/*  36 */     for (Module m : Main.modmgr.getModulesInCategory(this.selectedCat)) {
/*  37 */       this.modules.add(new ModuleComponent(this.categoryWidth + 3, this.topHeight + i++ * this.categoryHeight, (int)(this.categoryWidth * 1.5D) - 3, this.categoryHeight, m, this));
/*     */     }
/*     */   }
/*     */   
/*     */   public void updateSettingsList() {
/*  42 */     if (this.selectedMod != null) {
/*  43 */       this.settings = new ArrayList<>();
/*  44 */       if (Main.setmgr.getSettingsByMod(this.selectedMod) != null) {
/*  45 */         int i = 0;
/*  46 */         for (Setting s : Main.setmgr.getSettingsByMod(this.selectedMod)) {
/*  47 */           SettingItem item = SettingItem.Create(s, (int)((this.categoryWidth + 3) + this.categoryWidth * 1.5D), this.topHeight + i, (int)(this.categoryWidth * 1.5D - 3.0D), this);
/*  48 */           i += item.height + 2;
/*  49 */           this.settings.add(item);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseClick(int mouseX, int mouseY, int button) {
/*  57 */     if (mouseX > this.x && mouseY > this.y && mouseX < this.x + this.width && mouseY < this.y + this.topHeight && button == 0) {
/*  58 */       this.dragging = true;
/*  59 */       this.dragXOffset = mouseX - this.x;
/*  60 */       this.dragYOffset = mouseY - this.y;
/*     */     } 
/*  62 */     if (mouseX > this.x && mouseY > this.y + this.topHeight && mouseX < this.x + this.categoryWidth && mouseY < this.y + this.height && button == 0) {
/*     */       
/*  64 */       int i = 0;
/*  65 */       for (Category c : Category.values()) {
/*  66 */         clickCategory(c, i++, mouseX, mouseY);
/*     */       }
/*  68 */       clickCategory(null, i, mouseX, mouseY);
/*     */     } 
/*  70 */     if (mouseX > this.x + this.categoryWidth && mouseY > this.y + this.topHeight && mouseX < this.x + this.width && mouseY < this.y + this.height) {
/*  71 */       for (ModuleComponent m : this.modules) {
/*  72 */         if (m.isHovered(this.modScroll, 0, mouseX, mouseY)) {
/*  73 */           switch (button) {
/*     */             case 0:
/*  75 */               m.m.toggle();
/*     */             
/*     */             case 1:
/*  78 */               this.selectedMod = m.m;
/*  79 */               updateSettingsList();
/*     */           } 
/*     */         
/*     */         }
/*     */       } 
/*  84 */       for (SettingItem s : this.settings) {
/*  85 */         s.MouseClicked(mouseX, mouseY, this.setScroll);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void drag(int mouseX, int mouseY) {
/*  91 */     this.x = mouseX - this.dragXOffset;
/*  92 */     this.y = mouseY - this.dragYOffset;
/*     */   }
/*     */   
/*     */   public void mouseRelease(int mouseX, int mouseY, int button) {
/*  96 */     if (button == 0) {
/*  97 */       this.dragging = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public void clickCategory(Category c, int number, int mouseX, int mouseY) {
/* 102 */     Minecraft mc = Minecraft.getMinecraft();
/* 103 */     ScaledResolution sr = new ScaledResolution(mc);
/* 104 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 105 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*     */     
/* 107 */     int offset = (int)((number * this.categoryHeight) + this.scroll);
/* 108 */     int catY = this.y + this.topHeight + offset;
/* 109 */     boolean hovered = (this.lastMouseX > this.x && this.lastMouseY > catY && this.lastMouseX < this.x + this.categoryWidth && this.lastMouseY < catY + this.categoryHeight);
/* 110 */     boolean selected = (c == this.selectedCat);
/*     */     
/* 112 */     if (hovered) {
/* 113 */       this.selectedCat = c;
/* 114 */       updateModulesList();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawCategory(Category c, int number) {
/* 120 */     Minecraft mc = Minecraft.getMinecraft();
/* 121 */     ScaledResolution sr = new ScaledResolution(mc);
/* 122 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 123 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*     */     
/* 125 */     int offset = (int)((number * this.categoryHeight) + this.scroll);
/* 126 */     int catY = this.y + this.topHeight + offset;
/* 127 */     boolean hovered = (this.lastMouseX > this.x && this.lastMouseY > catY && this.lastMouseX < this.x + this.categoryWidth && this.lastMouseY < catY + this.categoryHeight);
/* 128 */     boolean selected = (c == this.selectedCat);
/* 129 */     String text = "";
/* 130 */     if (c != null) {
/* 131 */       text = c.name();
/*     */     } else {
/*     */       
/* 134 */       text = "Client settings";
/*     */     } 
/* 136 */     Gui.drawRect(this.x, catY, this.x + this.categoryWidth, catY + this.categoryHeight, this.colorItem);
/* 137 */     fr2.drawStringWithShadow(text, (this.x + 5), (catY + this.categoryHeight / 2 - fr2.getHeight() / 2), this.colorText);
/* 138 */     if (selected) {
/* 139 */       Renderutils.drawOutlinedBox(this.x + 1, catY + 1, this.x + this.categoryWidth - 1, catY + this.categoryHeight - 1, 1, 0, this.colorText);
/*     */     }
/* 141 */     if (hovered) {
/* 142 */       Renderutils.drawOutlinedBox(this.x + 1, catY + 1, this.x + this.categoryWidth - 1, catY + this.categoryHeight - 1, 1, 0, -1140850689);
/*     */     }
/*     */     
/* 145 */     double max = (((Category.values()).length + 1) * this.categoryHeight - this.height - this.topHeight);
/* 146 */     double percentage = Math.abs(this.scroll) / max;
/* 147 */     int size = this.height * 4 / ((Category.values()).length + 1);
/* 148 */     Gui.drawRect(this.x + this.categoryWidth, (int)((this.y + this.topHeight) + (this.height - this.topHeight - size) * percentage), this.x + this.categoryWidth + 3, (int)((this.y + this.topHeight) + (this.height - this.topHeight - size) * percentage) + size, -1);
/*     */     
/* 150 */     drawModules();
/*     */   }
/*     */   
/*     */   public void drawModules() {
/* 154 */     int i = 0;
/* 155 */     for (ModuleComponent m : this.modules) {
/* 156 */       m.Draw(this.modScroll, 0, this.lastMouseX, this.lastMouseY);
/*     */     }
/* 158 */     int amount = Math.max(this.modules.size(), 1);
/* 159 */     double max = (amount * this.categoryHeight - this.height - this.topHeight);
/* 160 */     double percentage = Math.abs(this.modScroll) / max;
/* 161 */     int size = this.height * 4 / amount;
/* 162 */     Gui.drawRect((int)((this.x + this.categoryWidth) + this.categoryWidth * 1.5D), (int)((this.y + this.topHeight) + (this.height - this.topHeight - size) * percentage), (int)((this.x + this.categoryWidth) + this.categoryWidth * 1.5D + 3.0D), (int)((this.y + this.topHeight) + (this.height - this.topHeight - size) * percentage) + size, -1);
/* 163 */     drawSettings();
/*     */   }
/*     */   
/*     */   public void drawSettings() {
/* 167 */     double height = 0.0D;
/* 168 */     for (SettingItem item : this.settings) {
/* 169 */       height += item.height;
/*     */     }
/* 171 */     height += 30.0D;
/* 172 */     double amount = Math.max(height, 1.0D);
/* 173 */     double max = amount - (this.height - this.topHeight);
/* 174 */     double percentage = Math.abs(this.setScroll) / max;
/* 175 */     double size = this.height / amount / 100.0D;
/* 176 */     Gui.drawRect(this.x + this.categoryWidth + this.categoryWidth * 3 - 3, (int)((this.y + this.topHeight) + ((this.height - this.topHeight) - size) * percentage), this.x + this.categoryWidth + this.categoryWidth * 3, (int)((this.y + this.topHeight) + ((this.height - this.topHeight) - size) * percentage + size), -1);
/* 177 */     for (SettingItem item : this.settings) {
/* 178 */       item.draw(this.setScroll, this.lastMouseX, this.lastMouseY);
/*     */     }
/*     */   }
/*     */   
/*     */   public void scroll(int scroll, int mouseX, int mouseY) {
/* 183 */     int scrollAmount = 80;
/* 184 */     if (this.lastMouseX > this.x && this.lastMouseX < this.x + this.categoryWidth && this.lastMouseY > this.y + this.topHeight && this.lastMouseY < this.y + this.height) {
/* 185 */       if (scroll > 0) {
/* 186 */         this.targetScroll += scrollAmount;
/*     */       } else {
/*     */         
/* 189 */         this.targetScroll -= scrollAmount;
/*     */       } 
/* 191 */       double min = (-((Category.values()).length + 1) * this.categoryHeight + this.height - this.topHeight);
/* 192 */       if (this.targetScroll < min) {
/* 193 */         this.targetScroll = min;
/*     */       }
/* 195 */       if (this.targetScroll > 0.0D) {
/* 196 */         this.targetScroll = 0.0D;
/*     */       }
/*     */     } 
/* 199 */     if (this.lastMouseX > this.x + this.categoryWidth && this.lastMouseY > this.y + this.topHeight && this.lastMouseX < (this.x + this.categoryWidth) + this.categoryWidth * 1.5D && this.lastMouseY < this.y + this.height) {
/* 200 */       if (scroll > 0) {
/* 201 */         this.modTargetScroll += scrollAmount;
/*     */       } else {
/*     */         
/* 204 */         this.modTargetScroll -= scrollAmount;
/*     */       } 
/* 206 */       double min = (-this.modules.size() * this.categoryHeight + this.height - this.topHeight);
/* 207 */       if (this.modTargetScroll < min) {
/* 208 */         this.modTargetScroll = min;
/*     */       }
/*     */       
/* 211 */       if (this.modTargetScroll > 0.0D) {
/* 212 */         this.modTargetScroll = 0.0D;
/*     */       }
/*     */     } 
/* 215 */     if (this.lastMouseX > (this.x + this.categoryWidth) + this.categoryWidth * 1.5D && this.lastMouseY > this.y + this.topHeight && this.lastMouseX < this.x + this.width && this.lastMouseY < this.y + this.height) {
/* 216 */       if (scroll > 0) {
/* 217 */         this.setTargetScroll += scrollAmount;
/*     */       } else {
/*     */         
/* 220 */         this.setTargetScroll -= scrollAmount;
/*     */       } 
/* 222 */       int setSize = 0;
/* 223 */       for (SettingItem s : this.settings) {
/* 224 */         setSize += s.height;
/*     */       }
/* 226 */       setSize += 30;
/* 227 */       double min = (-setSize + this.height - this.topHeight);
/* 228 */       if (this.setTargetScroll < min) {
/* 229 */         this.setTargetScroll = min;
/*     */       }
/*     */       
/* 232 */       if (this.setTargetScroll > 0.0D) {
/* 233 */         this.setTargetScroll = 0.0D;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void handleMechanics(int mouseX, int mouseY) {
/* 239 */     this.lastMouseX = mouseX;
/* 240 */     this.lastMouseY = mouseY;
/* 241 */     if (this.dragging) {
/* 242 */       drag(mouseX, mouseY);
/*     */     }
/* 244 */     this.scroll = MathUtil.interPolate(this.scroll, this.targetScroll, 0.08D);
/* 245 */     double min = (-((Category.values()).length + 1) * this.categoryHeight + this.height - this.topHeight);
/* 246 */     if (this.targetScroll < min) {
/* 247 */       this.targetScroll = min;
/*     */     }
/* 249 */     if (this.targetScroll > 0.0D) {
/* 250 */       this.targetScroll = 0.0D;
/*     */     }
/*     */     
/* 253 */     this.modScroll = MathUtil.interPolate(this.modScroll, this.modTargetScroll, 0.08D);
/* 254 */     double min2 = (-this.modules.size() * this.categoryHeight + this.height - this.topHeight);
/* 255 */     if (this.modTargetScroll < min2) {
/* 256 */       this.modTargetScroll = min2;
/*     */     }
/*     */     
/* 259 */     if (this.modTargetScroll > 0.0D) {
/* 260 */       this.modTargetScroll = 0.0D;
/*     */     }
/*     */     
/* 263 */     int setSize = 0;
/* 264 */     for (SettingItem s : this.settings) {
/* 265 */       setSize += s.height;
/*     */     }
/* 267 */     setSize += 30;
/* 268 */     double min3 = (-setSize + this.height - this.topHeight);
/* 269 */     this.setScroll = MathUtil.interPolate(this.setScroll, this.setTargetScroll, 0.08D);
/* 270 */     if (this.setTargetScroll < min3) {
/* 271 */       this.setTargetScroll = min3;
/*     */     }
/*     */     
/* 274 */     if (this.setTargetScroll > 0.0D) {
/* 275 */       this.setTargetScroll = 0.0D;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void Draw(int mouseX, int mouseY) {
/* 281 */     handleMechanics(mouseX, mouseY);
/*     */     
/* 283 */     Minecraft mc = Minecraft.getMinecraft();
/* 284 */     ScaledResolution sr = new ScaledResolution(mc);
/* 285 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 286 */     FontRenderer fr2 = Fonts.MainFontRendererBig;
/*     */     
/* 288 */     GlStateManager.prepareScissorBoxPos(sr, this.x, this.y, (this.x + this.width), (this.y + this.height));
/* 289 */     GlStateManager.enableScissorBox(true);
/* 290 */     GlStateManager.pushMatrix();
/* 291 */     GlStateManager.pushAttrib();
/*     */ 
/*     */     
/* 294 */     Gui.drawRect(this.x, this.y, this.x + this.width, this.y + this.height, this.colorMain);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 301 */     int i = 0;
/* 302 */     for (Category c : Category.values()) {
/* 303 */       drawCategory(c, i++);
/*     */     }
/* 305 */     drawCategory(null, i);
/*     */ 
/*     */     
/* 308 */     Gui.drawRect(this.x, this.y - 1, this.x + this.width, this.y + this.topHeight, this.colorTopBar);
/* 309 */     String text = "Client settings";
/* 310 */     if (this.selectedMod != null) {
/* 311 */       text = this.selectedMod.getCategory() + "/" + this.selectedMod.name;
/*     */     }
/* 313 */     else if (this.selectedCat != null) {
/* 314 */       text = this.selectedCat.name();
/*     */     } 
/* 316 */     fr.drawStringWithShadow(text, (this.x + 2), (this.y + 2), this.colorText);
/*     */     
/* 318 */     GlStateManager.popMatrix();
/* 319 */     GlStateManager.popAttrib();
/* 320 */     GlStateManager.enableScissorBox(false);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/tabbedClickGui/BigPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */