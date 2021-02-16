/*     */ package com.mylo.base.ui.components;
/*     */ 
/*     */ import com.google.common.base.Predicate;
/*     */ import com.google.common.base.Predicates;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.gui.Gui;
/*     */ import net.minecraft.client.gui.GuiPageButtonList;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.client.renderer.WorldRenderer;
/*     */ import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
/*     */ import net.minecraft.util.ChatAllowedCharacters;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GuiPasswordField
/*     */   extends Gui
/*     */ {
/*     */   private final int id;
/*     */   private final FontRenderer fontRendererInstance;
/*     */   public int xPosition;
/*     */   public int yPosition;
/*     */   private final int width;
/*     */   private final int height;
/*  29 */   private String text = "";
/*  30 */   private int maxStringLength = 32;
/*     */ 
/*     */   
/*     */   private int cursorCounter;
/*     */ 
/*     */   
/*     */   private boolean enableBackgroundDrawing = true;
/*     */ 
/*     */   
/*     */   private boolean canLoseFocus = true;
/*     */ 
/*     */   
/*     */   private boolean isFocused;
/*     */ 
/*     */   
/*     */   private boolean isEnabled = true;
/*     */ 
/*     */   
/*     */   private int lineScrollOffset;
/*     */ 
/*     */   
/*     */   private int cursorPosition;
/*     */ 
/*     */   
/*     */   private int selectionEnd;
/*     */ 
/*     */   
/*  57 */   private int enabledColor = 14737632;
/*  58 */   private int disabledColor = 7368816;
/*     */   
/*     */   private boolean visible = true;
/*     */   
/*     */   private GuiPageButtonList.GuiResponder field_175210_x;
/*  63 */   private Predicate<String> field_175209_y = Predicates.alwaysTrue();
/*     */ 
/*     */   
/*     */   public GuiPasswordField(int componentId, FontRenderer fontrendererObj, int x, int y, int par5Width, int par6Height) {
/*  67 */     this.id = componentId;
/*  68 */     this.fontRendererInstance = fontrendererObj;
/*  69 */     this.xPosition = x;
/*  70 */     this.yPosition = y;
/*  71 */     this.width = par5Width;
/*  72 */     this.height = par6Height;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_175207_a(GuiPageButtonList.GuiResponder p_175207_1_) {
/*  77 */     this.field_175210_x = p_175207_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateCursorCounter() {
/*  85 */     this.cursorCounter++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setText(String p_146180_1_) {
/*  93 */     if (this.field_175209_y.apply(p_146180_1_)) {
/*     */       
/*  95 */       if (p_146180_1_.length() > this.maxStringLength) {
/*     */         
/*  97 */         this.text = p_146180_1_.substring(0, this.maxStringLength);
/*     */       }
/*     */       else {
/*     */         
/* 101 */         this.text = p_146180_1_;
/*     */       } 
/*     */       
/* 104 */       setCursorPositionEnd();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getText() {
/* 113 */     return this.text;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSelectedText() {
/* 121 */     int i = (this.cursorPosition < this.selectionEnd) ? this.cursorPosition : this.selectionEnd;
/* 122 */     int j = (this.cursorPosition < this.selectionEnd) ? this.selectionEnd : this.cursorPosition;
/* 123 */     return this.text.substring(i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_175205_a(Predicate<String> p_175205_1_) {
/* 128 */     this.field_175209_y = p_175205_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeText(String p_146191_1_) {
/* 136 */     String s = "";
/* 137 */     String s1 = ChatAllowedCharacters.filterAllowedCharacters(p_146191_1_);
/* 138 */     int i = (this.cursorPosition < this.selectionEnd) ? this.cursorPosition : this.selectionEnd;
/* 139 */     int j = (this.cursorPosition < this.selectionEnd) ? this.selectionEnd : this.cursorPosition;
/* 140 */     int k = this.maxStringLength - this.text.length() - i - j;
/* 141 */     int l = 0;
/*     */     
/* 143 */     if (this.text.length() > 0)
/*     */     {
/* 145 */       s = String.valueOf(s) + this.text.substring(0, i);
/*     */     }
/*     */     
/* 148 */     if (k < s1.length()) {
/*     */       
/* 150 */       s = String.valueOf(s) + s1.substring(0, k);
/* 151 */       l = k;
/*     */     }
/*     */     else {
/*     */       
/* 155 */       s = String.valueOf(s) + s1;
/* 156 */       l = s1.length();
/*     */     } 
/*     */     
/* 159 */     if (this.text.length() > 0 && j < this.text.length())
/*     */     {
/* 161 */       s = String.valueOf(s) + this.text.substring(j);
/*     */     }
/*     */     
/* 164 */     if (this.field_175209_y.apply(s)) {
/*     */       
/* 166 */       this.text = s;
/* 167 */       moveCursorBy(i - this.selectionEnd + l);
/*     */       
/* 169 */       if (this.field_175210_x != null)
/*     */       {
/* 171 */         this.field_175210_x.func_175319_a(this.id, this.text);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteWords(int p_146177_1_) {
/* 182 */     if (this.text.length() != 0)
/*     */     {
/* 184 */       if (this.selectionEnd != this.cursorPosition) {
/*     */         
/* 186 */         writeText("");
/*     */       }
/*     */       else {
/*     */         
/* 190 */         deleteFromCursor(getNthWordFromCursor(p_146177_1_) - this.cursorPosition);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteFromCursor(int p_146175_1_) {
/* 200 */     if (this.text.length() != 0)
/*     */     {
/* 202 */       if (this.selectionEnd != this.cursorPosition) {
/*     */         
/* 204 */         writeText("");
/*     */       }
/*     */       else {
/*     */         
/* 208 */         boolean flag = (p_146175_1_ < 0);
/* 209 */         int i = flag ? (this.cursorPosition + p_146175_1_) : this.cursorPosition;
/* 210 */         int j = flag ? this.cursorPosition : (this.cursorPosition + p_146175_1_);
/* 211 */         String s = "";
/*     */         
/* 213 */         if (i >= 0)
/*     */         {
/* 215 */           s = this.text.substring(0, i);
/*     */         }
/*     */         
/* 218 */         if (j < this.text.length())
/*     */         {
/* 220 */           s = String.valueOf(s) + this.text.substring(j);
/*     */         }
/*     */         
/* 223 */         if (this.field_175209_y.apply(s)) {
/*     */           
/* 225 */           this.text = s;
/*     */           
/* 227 */           if (flag)
/*     */           {
/* 229 */             moveCursorBy(p_146175_1_);
/*     */           }
/*     */           
/* 232 */           if (this.field_175210_x != null)
/*     */           {
/* 234 */             this.field_175210_x.func_175319_a(this.id, this.text);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int getId() {
/* 243 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNthWordFromCursor(int p_146187_1_) {
/* 251 */     return getNthWordFromPos(p_146187_1_, getCursorPosition());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getNthWordFromPos(int p_146183_1_, int p_146183_2_) {
/* 259 */     return func_146197_a(p_146183_1_, p_146183_2_, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_146197_a(int p_146197_1_, int p_146197_2_, boolean p_146197_3_) {
/* 264 */     int i = p_146197_2_;
/* 265 */     boolean flag = (p_146197_1_ < 0);
/* 266 */     int j = Math.abs(p_146197_1_);
/*     */     
/* 268 */     for (int k = 0; k < j; k++) {
/*     */       
/* 270 */       if (!flag) {
/*     */         
/* 272 */         int l = this.text.length();
/* 273 */         i = this.text.indexOf(' ', i);
/*     */         
/* 275 */         if (i == -1)
/*     */         {
/* 277 */           i = l;
/*     */         }
/*     */         else
/*     */         {
/* 281 */           while (p_146197_3_ && i < l && this.text.charAt(i) == ' ')
/*     */           {
/* 283 */             i++;
/*     */           }
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 289 */         while (p_146197_3_ && i > 0 && this.text.charAt(i - 1) == ' ')
/*     */         {
/* 291 */           i--;
/*     */         }
/*     */         
/* 294 */         while (i > 0 && this.text.charAt(i - 1) != ' ')
/*     */         {
/* 296 */           i--;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void moveCursorBy(int p_146182_1_) {
/* 309 */     setCursorPosition(this.selectionEnd + p_146182_1_);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCursorPosition(int p_146190_1_) {
/* 317 */     this.cursorPosition = p_146190_1_;
/* 318 */     int i = this.text.length();
/* 319 */     this.cursorPosition = MathHelper.clamp_int(this.cursorPosition, 0, i);
/* 320 */     setSelectionPos(this.cursorPosition);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCursorPositionZero() {
/* 328 */     setCursorPosition(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCursorPositionEnd() {
/* 336 */     setCursorPosition(this.text.length());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean textboxKeyTyped(char p_146201_1_, int p_146201_2_) {
/* 344 */     if (!this.isFocused)
/*     */     {
/* 346 */       return false;
/*     */     }
/* 348 */     if (GuiScreen.isKeyComboCtrlA(p_146201_2_)) {
/*     */       
/* 350 */       setCursorPositionEnd();
/* 351 */       setSelectionPos(0);
/* 352 */       return true;
/*     */     } 
/* 354 */     if (GuiScreen.isKeyComboCtrlC(p_146201_2_)) {
/*     */       
/* 356 */       GuiScreen.setClipboardString(getSelectedText());
/* 357 */       return true;
/*     */     } 
/* 359 */     if (GuiScreen.isKeyComboCtrlV(p_146201_2_)) {
/*     */       
/* 361 */       if (this.isEnabled)
/*     */       {
/* 363 */         writeText(GuiScreen.getClipboardString());
/*     */       }
/*     */       
/* 366 */       return true;
/*     */     } 
/* 368 */     if (GuiScreen.isKeyComboCtrlX(p_146201_2_)) {
/*     */       
/* 370 */       GuiScreen.setClipboardString(getSelectedText());
/*     */       
/* 372 */       if (this.isEnabled)
/*     */       {
/* 374 */         writeText("");
/*     */       }
/*     */       
/* 377 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 381 */     switch (p_146201_2_) {
/*     */       
/*     */       case 14:
/* 384 */         if (GuiScreen.isCtrlKeyDown()) {
/*     */           
/* 386 */           if (this.isEnabled)
/*     */           {
/* 388 */             deleteWords(-1);
/*     */           }
/*     */         }
/* 391 */         else if (this.isEnabled) {
/*     */           
/* 393 */           deleteFromCursor(-1);
/*     */         } 
/*     */         
/* 396 */         return true;
/*     */       
/*     */       case 199:
/* 399 */         if (GuiScreen.isShiftKeyDown()) {
/*     */           
/* 401 */           setSelectionPos(0);
/*     */         }
/*     */         else {
/*     */           
/* 405 */           setCursorPositionZero();
/*     */         } 
/*     */         
/* 408 */         return true;
/*     */       
/*     */       case 203:
/* 411 */         if (GuiScreen.isShiftKeyDown()) {
/*     */           
/* 413 */           if (GuiScreen.isCtrlKeyDown())
/*     */           {
/* 415 */             setSelectionPos(getNthWordFromPos(-1, getSelectionEnd()));
/*     */           }
/*     */           else
/*     */           {
/* 419 */             setSelectionPos(getSelectionEnd() - 1);
/*     */           }
/*     */         
/* 422 */         } else if (GuiScreen.isCtrlKeyDown()) {
/*     */           
/* 424 */           setCursorPosition(getNthWordFromCursor(-1));
/*     */         }
/*     */         else {
/*     */           
/* 428 */           moveCursorBy(-1);
/*     */         } 
/*     */         
/* 431 */         return true;
/*     */       
/*     */       case 205:
/* 434 */         if (GuiScreen.isShiftKeyDown()) {
/*     */           
/* 436 */           if (GuiScreen.isCtrlKeyDown())
/*     */           {
/* 438 */             setSelectionPos(getNthWordFromPos(1, getSelectionEnd()));
/*     */           }
/*     */           else
/*     */           {
/* 442 */             setSelectionPos(getSelectionEnd() + 1);
/*     */           }
/*     */         
/* 445 */         } else if (GuiScreen.isCtrlKeyDown()) {
/*     */           
/* 447 */           setCursorPosition(getNthWordFromCursor(1));
/*     */         }
/*     */         else {
/*     */           
/* 451 */           moveCursorBy(1);
/*     */         } 
/*     */         
/* 454 */         return true;
/*     */       
/*     */       case 207:
/* 457 */         if (GuiScreen.isShiftKeyDown()) {
/*     */           
/* 459 */           setSelectionPos(this.text.length());
/*     */         }
/*     */         else {
/*     */           
/* 463 */           setCursorPositionEnd();
/*     */         } 
/*     */         
/* 466 */         return true;
/*     */       
/*     */       case 211:
/* 469 */         if (GuiScreen.isCtrlKeyDown()) {
/*     */           
/* 471 */           if (this.isEnabled)
/*     */           {
/* 473 */             deleteWords(1);
/*     */           }
/*     */         }
/* 476 */         else if (this.isEnabled) {
/*     */           
/* 478 */           deleteFromCursor(1);
/*     */         } 
/*     */         
/* 481 */         return true;
/*     */     } 
/*     */     
/* 484 */     if (ChatAllowedCharacters.isAllowedCharacter(p_146201_1_)) {
/*     */       
/* 486 */       if (this.isEnabled)
/*     */       {
/* 488 */         writeText(Character.toString(p_146201_1_));
/*     */       }
/*     */       
/* 491 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 495 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void mouseClicked(int p_146192_1_, int p_146192_2_, int p_146192_3_) {
/* 506 */     boolean flag = (p_146192_1_ >= this.xPosition && p_146192_1_ < this.xPosition + this.width && p_146192_2_ >= this.yPosition && p_146192_2_ < this.yPosition + this.height);
/*     */     
/* 508 */     if (this.canLoseFocus)
/*     */     {
/* 510 */       setFocused(flag);
/*     */     }
/*     */     
/* 513 */     if (this.isFocused && flag && p_146192_3_ == 0) {
/*     */       
/* 515 */       int i = p_146192_1_ - this.xPosition;
/*     */       
/* 517 */       if (this.enableBackgroundDrawing)
/*     */       {
/* 519 */         i -= 4;
/*     */       }
/*     */       
/* 522 */       String s = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), getWidth());
/* 523 */       setCursorPosition(this.fontRendererInstance.trimStringToWidth(s, i).length() + this.lineScrollOffset);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawTextBox() {
/* 532 */     if (getVisible()) {
/*     */       
/* 534 */       if (getEnableBackgroundDrawing()) {
/*     */         
/* 536 */         drawRect(this.xPosition - 1, this.yPosition - 1, this.xPosition + this.width + 1, this.yPosition + this.height + 1, -6250336);
/* 537 */         drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, -16777216);
/*     */       } 
/*     */       
/* 540 */       int i = this.isEnabled ? this.enabledColor : this.disabledColor;
/* 541 */       int j = this.cursorPosition - this.lineScrollOffset;
/* 542 */       int k = this.selectionEnd - this.lineScrollOffset;
/* 543 */       String s = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), getWidth());
/* 544 */       int sl = s.length();
/* 545 */       s = "";
/* 546 */       for (int i2 = 0; i2 < sl; i2++) {
/* 547 */         s = String.valueOf(s) + "*";
/*     */       }
/* 549 */       boolean flag = (j >= 0 && j <= s.length());
/* 550 */       boolean flag1 = (this.isFocused && this.cursorCounter / 6 % 2 == 0 && flag);
/* 551 */       int l = this.enableBackgroundDrawing ? (this.xPosition + 4) : this.xPosition;
/* 552 */       int i1 = this.enableBackgroundDrawing ? (this.yPosition + (this.height - 8) / 2) : this.yPosition;
/* 553 */       int j1 = l;
/*     */       
/* 555 */       if (k > s.length())
/*     */       {
/* 557 */         k = s.length();
/*     */       }
/*     */       
/* 560 */       if (s.length() > 0) {
/*     */         
/* 562 */         String s1 = flag ? s.substring(0, j) : s;
/* 563 */         j1 = this.fontRendererInstance.drawStringWithShadow(s1, l, i1, i);
/*     */       } 
/*     */       
/* 566 */       boolean flag2 = !(this.cursorPosition >= this.text.length() && this.text.length() < getMaxStringLength());
/* 567 */       int k1 = j1;
/*     */       
/* 569 */       if (!flag) {
/*     */         
/* 571 */         k1 = (j > 0) ? (l + this.width) : l;
/*     */       }
/* 573 */       else if (flag2) {
/*     */         
/* 575 */         k1 = j1 - 1;
/* 576 */         j1--;
/*     */       } 
/*     */       
/* 579 */       if (s.length() > 0 && flag && j < s.length())
/*     */       {
/* 581 */         j1 = this.fontRendererInstance.drawStringWithShadow(s.substring(j), j1, i1, i);
/*     */       }
/*     */       
/* 584 */       if (flag1)
/*     */       {
/* 586 */         if (flag2) {
/*     */           
/* 588 */           Gui.drawRect(k1, i1 - 1, k1 + 1, i1 + 1 + this.fontRendererInstance.FONT_HEIGHT, -3092272);
/*     */         }
/*     */         else {
/*     */           
/* 592 */           this.fontRendererInstance.drawStringWithShadow("_", k1, i1, i);
/*     */         } 
/*     */       }
/*     */       
/* 596 */       if (k != j) {
/*     */         
/* 598 */         int l1 = l + this.fontRendererInstance.getStringWidth(s.substring(0, k));
/* 599 */         drawCursorVertical(k1, i1 - 1, l1 - 1, i1 + 1 + this.fontRendererInstance.FONT_HEIGHT);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void drawCursorVertical(int p_146188_1_, int p_146188_2_, int p_146188_3_, int p_146188_4_) {
/* 609 */     if (p_146188_1_ < p_146188_3_) {
/*     */       
/* 611 */       int i = p_146188_1_;
/* 612 */       p_146188_1_ = p_146188_3_;
/* 613 */       p_146188_3_ = i;
/*     */     } 
/*     */     
/* 616 */     if (p_146188_2_ < p_146188_4_) {
/*     */       
/* 618 */       int j = p_146188_2_;
/* 619 */       p_146188_2_ = p_146188_4_;
/* 620 */       p_146188_4_ = j;
/*     */     } 
/*     */     
/* 623 */     if (p_146188_3_ > this.xPosition + this.width)
/*     */     {
/* 625 */       p_146188_3_ = this.xPosition + this.width;
/*     */     }
/*     */     
/* 628 */     if (p_146188_1_ > this.xPosition + this.width)
/*     */     {
/* 630 */       p_146188_1_ = this.xPosition + this.width;
/*     */     }
/*     */     
/* 633 */     Tessellator tessellator = Tessellator.getInstance();
/* 634 */     WorldRenderer worldrenderer = tessellator.getWorldRenderer();
/* 635 */     GlStateManager.color(0.0F, 0.0F, 255.0F, 255.0F);
/* 636 */     GlStateManager.disableTexture2D();
/* 637 */     GlStateManager.enableColorLogic();
/* 638 */     GlStateManager.colorLogicOp(5387);
/* 639 */     worldrenderer.begin(7, DefaultVertexFormats.POSITION);
/* 640 */     worldrenderer.pos(p_146188_1_, p_146188_4_, 0.0D).endVertex();
/* 641 */     worldrenderer.pos(p_146188_3_, p_146188_4_, 0.0D).endVertex();
/* 642 */     worldrenderer.pos(p_146188_3_, p_146188_2_, 0.0D).endVertex();
/* 643 */     worldrenderer.pos(p_146188_1_, p_146188_2_, 0.0D).endVertex();
/* 644 */     tessellator.draw();
/* 645 */     GlStateManager.disableColorLogic();
/* 646 */     GlStateManager.enableTexture2D();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMaxStringLength(int p_146203_1_) {
/* 651 */     this.maxStringLength = p_146203_1_;
/*     */     
/* 653 */     if (this.text.length() > p_146203_1_)
/*     */     {
/* 655 */       this.text = this.text.substring(0, p_146203_1_);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxStringLength() {
/* 664 */     return this.maxStringLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCursorPosition() {
/* 672 */     return this.cursorPosition;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getEnableBackgroundDrawing() {
/* 680 */     return this.enableBackgroundDrawing;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnableBackgroundDrawing(boolean p_146185_1_) {
/* 688 */     this.enableBackgroundDrawing = p_146185_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTextColor(int p_146193_1_) {
/* 696 */     this.enabledColor = p_146193_1_;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDisabledTextColour(int p_146204_1_) {
/* 701 */     this.disabledColor = p_146204_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFocused(boolean p_146195_1_) {
/* 709 */     if (p_146195_1_ && !this.isFocused)
/*     */     {
/* 711 */       this.cursorCounter = 0;
/*     */     }
/*     */     
/* 714 */     this.isFocused = p_146195_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFocused() {
/* 722 */     return this.isFocused;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean p_146184_1_) {
/* 727 */     this.isEnabled = p_146184_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSelectionEnd() {
/* 735 */     return this.selectionEnd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWidth() {
/* 743 */     return getEnableBackgroundDrawing() ? (this.width - 8) : this.width;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelectionPos(int p_146199_1_) {
/* 751 */     int i = this.text.length();
/*     */     
/* 753 */     if (p_146199_1_ > i)
/*     */     {
/* 755 */       p_146199_1_ = i;
/*     */     }
/*     */     
/* 758 */     if (p_146199_1_ < 0)
/*     */     {
/* 760 */       p_146199_1_ = 0;
/*     */     }
/*     */     
/* 763 */     this.selectionEnd = p_146199_1_;
/*     */     
/* 765 */     if (this.fontRendererInstance != null) {
/*     */       
/* 767 */       if (this.lineScrollOffset > i)
/*     */       {
/* 769 */         this.lineScrollOffset = i;
/*     */       }
/*     */       
/* 772 */       int j = getWidth();
/* 773 */       String s = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), j);
/* 774 */       int k = s.length() + this.lineScrollOffset;
/*     */       
/* 776 */       if (p_146199_1_ == this.lineScrollOffset)
/*     */       {
/* 778 */         this.lineScrollOffset -= this.fontRendererInstance.trimStringToWidth(this.text, j, true).length();
/*     */       }
/*     */       
/* 781 */       if (p_146199_1_ > k) {
/*     */         
/* 783 */         this.lineScrollOffset += p_146199_1_ - k;
/*     */       }
/* 785 */       else if (p_146199_1_ <= this.lineScrollOffset) {
/*     */         
/* 787 */         this.lineScrollOffset -= this.lineScrollOffset - p_146199_1_;
/*     */       } 
/*     */       
/* 790 */       this.lineScrollOffset = MathHelper.clamp_int(this.lineScrollOffset, 0, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCanLoseFocus(boolean p_146205_1_) {
/* 799 */     this.canLoseFocus = p_146205_1_;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getVisible() {
/* 807 */     return this.visible;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVisible(boolean p_146189_1_) {
/* 815 */     this.visible = p_146189_1_;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/com/mylo/base/ui/components/GuiPasswordField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */