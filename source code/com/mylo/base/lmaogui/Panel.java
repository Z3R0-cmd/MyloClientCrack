/*    */ package com.mylo.base.lmaogui;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.lmaogui.Component.Component;
/*    */ import com.mylo.base.lmaogui.Component.Components.ModuleButton;
/*    */ import com.mylo.base.lmaogui.Component.Components.SettingBoolean;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.utils.Colorutil;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import com.mylo.base.utils.font.FontRenderer;
/*    */ import de.Hero.settings.Setting;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ import net.minecraft.client.renderer.GlStateManager;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Panel
/*    */ {
/*    */   public int x;
/*    */   public int y;
/*    */   public int height;
/*    */   public int width;
/*    */   public int lastx;
/* 28 */   public ArrayList<Component> components = new ArrayList<>(); public int dragx; public int dragy; public int smoothx; public boolean dragging; public boolean opened; public Category c; public Panel(int x, int y, Category c) {
/* 29 */     for (Module m : Main.modmgr.getModulesInCategory(c)) {
/* 30 */       this.components.add(new ModuleButton(this, m));
/* 31 */       if (Main.setmgr.getSettingsByMod(m) != null) {
/* 32 */         for (Setting s : Main.setmgr.getSettingsByMod(m)) {
/* 33 */           if (s.isCheck()) {
/* 34 */             this.components.add(new SettingBoolean(this, s));
/*    */           }
/*    */         } 
/*    */       }
/*    */     } 
/* 39 */     this.height = 20;
/* 40 */     this.width = 100;
/* 41 */     this.x = x;
/* 42 */     this.y = y;
/* 43 */     this.c = c;
/* 44 */     this.opened = false;
/*    */   }
/*    */   
/*    */   public void drag(int mouseX, int mouseY) {
/* 48 */     this.lastx = this.x;
/*    */     
/* 50 */     this.x = mouseX - this.dragx;
/* 51 */     this.y = mouseY - this.dragy;
/*    */     
/* 53 */     int diff = this.lastx - this.x;
/* 54 */     if (diff > this.smoothx) {
/* 55 */       this.smoothx += 2;
/*    */     }
/* 57 */     else if (diff < this.smoothx) {
/* 58 */       this.smoothx -= 2;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void dragStart(int mouseX, int mouseY) {
/* 63 */     this.dragx = mouseX - this.x;
/* 64 */     this.dragy = mouseY - this.y;
/* 65 */     this.dragging = true;
/*    */   }
/*    */   
/*    */   public void dragStop() {
/* 69 */     this.dragging = false;
/*    */   }
/*    */   
/*    */   public void draw() {
/* 73 */     GlStateManager.pushMatrix();
/* 74 */     GlStateManager.translate(this.x, this.y, 0.0F);
/* 75 */     if (this.dragging) {
/* 76 */       GL11.glRotatef(this.smoothx, 0.0F, 0.0F, -1.0F);
/*    */     }
/* 78 */     Gui.drawRect(0, 0, this.width, this.height, Colorutil.getRainbow(0L, 1.0F, 1.0F, 1.0F));
/* 79 */     FontRenderer fr = Fonts.MainFontRenderer;
/* 80 */     fr.drawCenteredStringWithShadow(this.c.name(), (this.width / 2), 6.0F, 16777215);
/* 81 */     String s = this.opened ? "-" : "+";
/* 82 */     fr.drawStringWithShadow(s, (this.width - fr.getStringWidth(s) - 4), 6.0D, 16777215);
/* 83 */     for (Component comp : this.components) {
/* 84 */       if (comp.visible) {
/* 85 */         comp.draw();
/*    */       }
/*    */     } 
/* 88 */     GlStateManager.popMatrix();
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/lmaogui/Panel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */