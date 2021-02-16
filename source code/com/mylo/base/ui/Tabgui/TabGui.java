/*    */ package com.mylo.base.ui.Tabgui;
/*    */ 
/*    */ import com.mylo.base.module.Category;
/*    */ import com.mylo.base.ui.Tabgui.Items.CategoryItem;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TabGui
/*    */ {
/* 17 */   int selectedindex = 0;
/* 18 */   ArrayList<CategoryItem> items = new ArrayList<>(); public TabGui() { byte b; int i; Category[] arrayOfCategory;
/* 19 */     for (i = (arrayOfCategory = Category.values()).length, b = 0; b < i; ) { Category c = arrayOfCategory[b];
/* 20 */       this.items.add(new CategoryItem(2, 10, 60, c)); b++; }
/*    */     
/* 22 */     ((CategoryItem)this.items.get(this.selectedindex)).selected = true; }
/*    */ 
/*    */   
/*    */   public void render(int offset) {
/* 26 */     int i = 0;
/* 27 */     for (CategoryItem item : this.items) {
/* 28 */       item.draw(offset + i * item.height);
/* 29 */       i++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void onKey(int keyCode) {
/* 34 */     boolean flag = false;
/* 35 */     if (!((CategoryItem)this.items.get(this.selectedindex)).opened) {
/* 36 */       switch (keyCode) {
/*    */         case 208:
/* 38 */           if (++this.selectedindex > this.items.size() - 1) {
/* 39 */             this.selectedindex = 0;
/*    */           }
/*    */           break;
/*    */         case 200:
/* 43 */           if (--this.selectedindex < 0) {
/* 44 */             this.selectedindex = this.items.size() - 1;
/*    */           }
/*    */           break;
/*    */         case 205:
/* 48 */           ((CategoryItem)this.items.get(this.selectedindex)).opened = true;
/*    */           break;
/*    */       } 
/*    */ 
/*    */       
/* 53 */       for (CategoryItem item : this.items) {
/* 54 */         item.selected = false;
/*    */       }
/* 56 */       ((CategoryItem)this.items.get(this.selectedindex)).selected = true;
/*    */     } else {
/*    */       
/* 59 */       ((CategoryItem)this.items.get(this.selectedindex)).onKeyPress(keyCode);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void onUpdate() {
/* 64 */     for (Item i : this.items)
/* 65 */       i.onUpdate(); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/Tabgui/TabGui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */