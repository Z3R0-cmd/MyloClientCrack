/*     */ package com.mylo.base.lmaogui;
/*     */ 
/*     */ import com.mylo.base.Main;
/*     */ import com.mylo.base.clickgui.Clickgui;
/*     */ import com.mylo.base.lmaogui.Component.Component;
/*     */ import com.mylo.base.module.Category;
/*     */ import com.mylo.base.utils.Renderutils;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.client.gui.GuiButton;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.gui.ScaledResolution;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Lmaogui
/*     */   extends GuiScreen
/*     */ {
/*     */   ArrayList<Panel> panels;
/*     */   
/*     */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/*  29 */     ScaledResolution sr = new ScaledResolution(this.mc);
/*  30 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  31 */     for (int i = 0; i < 10; i++) {
/*  32 */       Renderutils.drawSineWave(0.0D, (sr.getScaledHeight() / 2), (sr.getScaledHeight() / 2), sr.getScaledWidth(), 0.01D, 8.0D, 4.0F, this.mc.thePlayer.ticksExisted + i);
/*     */     }
/*     */     
/*  35 */     super.drawScreen(mouseX, mouseY, partialTicks);
/*     */     
/*  37 */     for (Panel p : this.panels) {
/*  38 */       p.draw();
/*  39 */       if (p.dragging) {
/*  40 */         p.drag(mouseX, mouseY);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void actionPerformed(GuiButton button) throws IOException {
/*  47 */     super.actionPerformed(button);
/*  48 */     Main.setmgr.getSettingByName("ClickGUI").setValString("discord");
/*  49 */     this.mc.displayGuiScreen((GuiScreen)new Clickgui());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void keyTyped(char typedChar, int keyCode) throws IOException {
/*  54 */     super.keyTyped(typedChar, keyCode);
/*     */   }
/*     */ 
/*     */   
/*     */   public void handleMouseInput() throws IOException {
/*  59 */     super.handleMouseInput();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
/*  64 */     super.mouseClicked(mouseX, mouseY, mouseButton);
/*  65 */     if (mouseButton == 0) {
/*  66 */       for (Panel p : this.panels) {
/*  67 */         if (mouseX > p.x && mouseX < p.x + p.width && mouseY > p.y && mouseY < p.y + p.height) {
/*  68 */           p.dragStart(mouseX, mouseY);
/*     */         }
/*     */       } 
/*     */     }
/*  72 */     if (mouseButton == 1) {
/*  73 */       for (Panel p : this.panels) {
/*  74 */         if (mouseX > p.x && mouseX < p.x + p.width && mouseY > p.y && mouseY < p.y + p.height) {
/*  75 */           p.opened = !p.opened;
/*  76 */           for (Component comp : p.components) {
/*  77 */             if (comp instanceof com.mylo.base.lmaogui.Component.Components.ModuleButton) {
/*  78 */               comp.visible = p.opened;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*  84 */     for (Panel p : this.panels) {
/*  85 */       for (Component comp : p.components) {
/*  86 */         if (mouseX > p.x && mouseX < p.x + p.width && mouseY > p.y + p.height + comp.height * comp.index + 1 && mouseY < p.y + p.height + comp.height + comp.height * comp.index + 1) {
/*  87 */           comp.click(mouseX - p.x, mouseY - p.y + p.height + comp.height * comp.index + 1, mouseButton);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void mouseReleased(int mouseX, int mouseY, int state) {
/*  95 */     super.mouseReleased(mouseX, mouseY, state);
/*  96 */     if (state == 0) {
/*  97 */       for (Panel p : this.panels) {
/*  98 */         p.dragStop();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean doesGuiPauseGame() {
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initGui() {
/* 110 */     super.initGui();
/* 111 */     this.panels = new ArrayList<>();
/* 112 */     int i = 0; byte b; int j; Category[] arrayOfCategory;
/* 113 */     for (j = (arrayOfCategory = Category.values()).length, b = 0; b < j; ) { Category c = arrayOfCategory[b];
/* 114 */       this.panels.add(new Panel(i * 110 + 10, 10, c));
/* 115 */       i++; b++; }
/*     */     
/* 117 */     ScaledResolution sr = new ScaledResolution(this.mc);
/* 118 */     this.buttonList.add(new GuiButton(0, sr.getScaledWidth() - 130, sr.getScaledHeight() - 20, 130, 20, "Switch to discord gui"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onGuiClosed() {
/* 123 */     super.onGuiClosed();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/lmaogui/Lmaogui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */