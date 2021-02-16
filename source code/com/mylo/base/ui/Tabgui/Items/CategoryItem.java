/*    */ package com.mylo.base.ui.Tabgui.Items;
/*    */ 
/*    */ import com.mylo.base.Main;
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.module.Module;
/*    */ import com.mylo.base.ui.Tabgui.Item;
/*    */ import com.mylo.base.utils.Fonts;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CategoryItem
/*    */   extends Item
/*    */ {
/*    */   ArrayList<ModuleItem> items;
/*    */   public Category c;
/*    */   
/*    */   public CategoryItem(int x, int height, int width, Category c) {
/* 21 */     super(x, height, width, c.name());
/* 22 */     this.c = c;
/* 23 */     this.items = new ArrayList<>();
/* 24 */     int longest = 0;
/* 25 */     for (Module m : Main.modmgr.getModulesInCategory(c)) {
/* 26 */       int lenght = Fonts.MainFontRenderer.getStringWidth(m.name);
/* 27 */       if (lenght > longest) {
/* 28 */         longest = lenght;
/*    */       }
/*    */     } 
/* 31 */     for (Module m : Main.modmgr.getModulesInCategory(c)) {
/* 32 */       this.items.add(new ModuleItem(x + width + 2, height, longest + 10, m));
/*    */     }
/* 34 */     ((ModuleItem)this.items.get(this.selectedindex)).selected = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void draw(int offset) {
/* 39 */     super.draw(offset);
/* 40 */     if (this.opened) {
/* 41 */       int i = 0;
/* 42 */       for (ModuleItem item : this.items) {
/* 43 */         item.draw(offset + i * this.height);
/* 44 */         i++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUpdate() {
/* 51 */     super.onUpdate();
/* 52 */     if (this.opened) {
/* 53 */       for (ModuleItem item : this.items) {
/* 54 */         item.onUpdate();
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void onKeyPress(int keyCode) {
/* 61 */     super.onKeyPress(keyCode);
/* 62 */     if (this.opened && !((ModuleItem)this.items.get(this.selectedindex)).opened) {
/* 63 */       switch (keyCode) {
/*    */         case 203:
/* 65 */           this.opened = false;
/*    */           break;
/*    */         case 208:
/* 68 */           if (++this.selectedindex > this.items.size() - 1) {
/* 69 */             this.selectedindex = 0;
/*    */           }
/*    */           break;
/*    */         case 200:
/* 73 */           if (--this.selectedindex < 0) {
/* 74 */             this.selectedindex = this.items.size() - 1;
/*    */           }
/*    */           break;
/*    */         case 205:
/* 78 */           if (((ModuleItem)this.items.get(this.selectedindex)).items != null) {
/* 79 */             ((ModuleItem)this.items.get(this.selectedindex)).opened = true;
/*    */           }
/*    */           break;
/*    */         case 28:
/* 83 */           ((ModuleItem)this.items.get(this.selectedindex)).m.toggle();
/*    */           break;
/*    */       } 
/*    */ 
/*    */       
/* 88 */       for (ModuleItem item : this.items) {
/* 89 */         item.selected = false;
/*    */       }
/* 91 */       ((ModuleItem)this.items.get(this.selectedindex)).selected = true;
/* 92 */       for (ModuleItem item : this.items) {
/* 93 */         item.onKeyPress(keyCode);
/*    */       }
/*    */     }
/* 96 */     else if (this.opened) {
/* 97 */       ((ModuleItem)this.items.get(this.selectedindex)).onKeyPress(keyCode);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/Items/CategoryItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */