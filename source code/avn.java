/*     */ import com.ibm.icu.text.ArabicShaping;
/*     */ import com.ibm.icu.text.ArabicShapingException;
/*     */ import com.ibm.icu.text.Bidi;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avn
/*     */   implements bnj
/*     */ {
/*  30 */   private static final jy[] c = new jy[256];
/*     */ 
/*     */ 
/*     */   
/*  34 */   private int[] d = new int[256];
/*  35 */   public int a = 9;
/*  36 */   public Random b = new Random();
/*     */   
/*  38 */   private byte[] e = new byte[65536];
/*     */   
/*  40 */   private int[] f = new int[32];
/*     */   
/*     */   private final jy g;
/*     */   
/*     */   private final bmj h;
/*     */   
/*     */   private float i;
/*     */   
/*     */   private float j;
/*     */   
/*     */   private boolean k;
/*     */   
/*     */   private boolean l;
/*     */   private float m;
/*     */   private float n;
/*     */   
/*     */   public avn(avh ☃, jy jy1, bmj bmj1, boolean bool) {
/*  57 */     this.g = jy1;
/*  58 */     this.h = bmj1;
/*  59 */     this.k = bool;
/*     */     
/*  61 */     bmj1.a(this.g);
/*     */ 
/*     */     
/*  64 */     for (int i = 0; i < 32; i++) {
/*  65 */       int j = (i >> 3 & 0x1) * 85;
/*  66 */       int k = (i >> 2 & 0x1) * 170 + j;
/*  67 */       int m = (i >> 1 & 0x1) * 170 + j;
/*  68 */       int n = (i >> 0 & 0x1) * 170 + j;
/*     */       
/*  70 */       if (i == 6) {
/*  71 */         k += 85;
/*     */       }
/*     */       
/*  74 */       if (☃.e) {
/*  75 */         int i1 = (k * 30 + m * 59 + n * 11) / 100;
/*  76 */         int i2 = (k * 30 + m * 70) / 100;
/*  77 */         int i3 = (k * 30 + n * 70) / 100;
/*  78 */         k = i1;
/*  79 */         m = i2;
/*  80 */         n = i3;
/*     */       } 
/*     */       
/*  83 */       if (i >= 16) {
/*  84 */         k /= 4;
/*  85 */         m /= 4;
/*  86 */         n /= 4;
/*     */       } 
/*     */       
/*  89 */       this.f[i] = (k & 0xFF) << 16 | (m & 0xFF) << 8 | n & 0xFF;
/*     */     } 
/*     */     
/*  92 */     d();
/*     */   }
/*     */   private float o; private float p; private int q; private boolean r; private boolean s; private boolean t; private boolean u; private boolean v;
/*     */   
/*     */   public void a(bni ☃) {
/*  97 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   private void c() {
/*     */     BufferedImage ☃;
/*     */     try {
/* 104 */       ☃ = bml.a(ave.A().Q().a(this.g).b());
/* 105 */     } catch (IOException iOException) {
/* 106 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 109 */     int i = ☃.getWidth();
/* 110 */     int j = ☃.getHeight();
/* 111 */     int[] arrayOfInt = new int[i * j];
/* 112 */     ☃.getRGB(0, 0, i, j, arrayOfInt, 0, i);
/*     */     
/* 114 */     int k = j / 16;
/* 115 */     int m = i / 16;
/*     */     
/* 117 */     int n = 1;
/*     */     
/* 119 */     float f = 8.0F / m;
/*     */     
/* 121 */     for (int i1 = 0; i1 < 256; i1++) {
/* 122 */       int i2 = i1 % 16;
/* 123 */       int i3 = i1 / 16;
/*     */       
/* 125 */       if (i1 == 32) {
/* 126 */         this.d[i1] = 3 + n;
/*     */       }
/*     */       
/* 129 */       int i4 = m - 1;
/* 130 */       for (; i4 >= 0; i4--) {
/* 131 */         int i5 = i2 * m + i4;
/* 132 */         boolean bool = true;
/* 133 */         for (int i6 = 0; i6 < k && bool; i6++) {
/* 134 */           int i7 = (i3 * m + i6) * i;
/*     */           
/* 136 */           if ((arrayOfInt[i5 + i7] >> 24 & 0xFF) != 0) {
/* 137 */             bool = false;
/*     */           }
/*     */         } 
/* 140 */         if (!bool) {
/*     */           break;
/*     */         }
/*     */       } 
/* 144 */       i4++;
/*     */ 
/*     */       
/* 147 */       this.d[i1] = (int)(0.5D + (i4 * f)) + n;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d() {
/* 152 */     InputStream ☃ = null;
/*     */     try {
/* 154 */       ☃ = ave.A().Q().a(new jy("font/glyph_sizes.bin")).b();
/* 155 */       ☃.read(this.e);
/* 156 */     } catch (IOException iOException) {
/* 157 */       throw new RuntimeException(iOException);
/*     */     } finally {
/* 159 */       IOUtils.closeQuietly(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a(char ☃, boolean bool) {
/* 164 */     if (☃ == ' ') {
/* 165 */       return 4.0F;
/*     */     }
/*     */     
/* 168 */     int i = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(☃);
/* 169 */     if (i != -1 && !this.k) {
/* 170 */       return a(i, bool);
/*     */     }
/* 172 */     return b(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   private float a(int ☃, boolean bool) {
/* 177 */     int i = ☃ % 16 * 8;
/* 178 */     int j = ☃ / 16 * 8;
/* 179 */     int k = bool ? 1 : 0;
/*     */     
/* 181 */     this.h.a(this.g);
/*     */     
/* 183 */     int m = this.d[☃];
/* 184 */     float f = m - 0.01F;
/*     */     
/* 186 */     GL11.glBegin(5);
/* 187 */     GL11.glTexCoord2f(i / 128.0F, j / 128.0F);
/* 188 */     GL11.glVertex3f(this.i + k, this.j, 0.0F);
/* 189 */     GL11.glTexCoord2f(i / 128.0F, (j + 7.99F) / 128.0F);
/* 190 */     GL11.glVertex3f(this.i - k, this.j + 7.99F, 0.0F);
/* 191 */     GL11.glTexCoord2f((i + f - 1.0F) / 128.0F, j / 128.0F);
/* 192 */     GL11.glVertex3f(this.i + f - 1.0F + k, this.j, 0.0F);
/* 193 */     GL11.glTexCoord2f((i + f - 1.0F) / 128.0F, (j + 7.99F) / 128.0F);
/* 194 */     GL11.glVertex3f(this.i + f - 1.0F - k, this.j + 7.99F, 0.0F);
/* 195 */     GL11.glEnd();
/*     */     
/* 197 */     return m;
/*     */   }
/*     */   
/*     */   private jy a(int ☃) {
/* 201 */     if (c[☃] == null) {
/* 202 */       c[☃] = new jy(String.format("textures/font/unicode_page_%02x.png", new Object[] { Integer.valueOf(☃) }));
/*     */     }
/*     */     
/* 205 */     return c[☃];
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/* 209 */     this.h.a(a(☃));
/*     */   }
/*     */   
/*     */   private float b(char ☃, boolean bool) {
/* 213 */     if (this.e[☃] == 0) {
/* 214 */       return 0.0F;
/*     */     }
/*     */     
/* 217 */     int i = ☃ / 256;
/*     */     
/* 219 */     b(i);
/*     */ 
/*     */     
/* 222 */     int j = this.e[☃] >>> 4;
/*     */     
/* 224 */     int k = this.e[☃] & 0xF;
/*     */     
/* 226 */     float f1 = j;
/* 227 */     float f2 = (k + 1);
/*     */     
/* 229 */     float f3 = (☃ % 16 * 16) + f1;
/* 230 */     float f4 = ((☃ & 0xFF) / 16 * 16);
/* 231 */     float f5 = f2 - f1 - 0.02F;
/* 232 */     float f6 = bool ? 1.0F : 0.0F;
/*     */     
/* 234 */     GL11.glBegin(5);
/* 235 */     GL11.glTexCoord2f(f3 / 256.0F, f4 / 256.0F);
/* 236 */     GL11.glVertex3f(this.i + f6, this.j, 0.0F);
/* 237 */     GL11.glTexCoord2f(f3 / 256.0F, (f4 + 15.98F) / 256.0F);
/* 238 */     GL11.glVertex3f(this.i - f6, this.j + 7.99F, 0.0F);
/* 239 */     GL11.glTexCoord2f((f3 + f5) / 256.0F, f4 / 256.0F);
/* 240 */     GL11.glVertex3f(this.i + f5 / 2.0F + f6, this.j, 0.0F);
/* 241 */     GL11.glTexCoord2f((f3 + f5) / 256.0F, (f4 + 15.98F) / 256.0F);
/* 242 */     GL11.glVertex3f(this.i + f5 / 2.0F - f6, this.j + 7.99F, 0.0F);
/* 243 */     GL11.glEnd();
/*     */     
/* 245 */     return (f2 - f1) / 2.0F + 1.0F;
/*     */   }
/*     */   
/*     */   public int a(String ☃, float f1, float f2, int i) {
/* 249 */     return a(☃, f1, f2, i, true);
/*     */   }
/*     */   
/*     */   public int a(String ☃, int i, int j, int k) {
/* 253 */     return a(☃, i, j, k, false);
/*     */   }
/*     */   public int a(String ☃, float f1, float f2, int i, boolean bool) {
/*     */     int j;
/* 257 */     bfl.d();
/* 258 */     e();
/*     */ 
/*     */ 
/*     */     
/* 262 */     if (bool) {
/* 263 */       j = b(☃, f1 + 1.0F, f2 + 1.0F, i, true);
/* 264 */       j = Math.max(j, b(☃, f1, f2, i, false));
/*     */     } else {
/* 266 */       j = b(☃, f1, f2, i, false);
/*     */     } 
/*     */     
/* 269 */     return j;
/*     */   }
/*     */   
/*     */   private String c(String ☃) {
/*     */     try {
/* 274 */       Bidi bidi = new Bidi((new ArabicShaping(8)).shape(☃), 127);
/* 275 */       bidi.setReorderingMode(0);
/* 276 */       return bidi.writeReordered(2);
/* 277 */     } catch (ArabicShapingException arabicShapingException) {
/*     */ 
/*     */       
/* 280 */       return ☃;
/*     */     } 
/*     */   }
/*     */   private void e() {
/* 284 */     this.r = false;
/* 285 */     this.s = false;
/* 286 */     this.t = false;
/* 287 */     this.u = false;
/* 288 */     this.v = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(String ☃, boolean bool) {
/* 299 */     for (int i = 0; i < ☃.length(); i++) {
/* 300 */       char c = ☃.charAt(i);
/*     */       
/* 302 */       if (c == '§' && i + 1 < ☃.length()) {
/* 303 */         int j = "0123456789abcdefklmnor".indexOf(☃.toLowerCase(Locale.ENGLISH).charAt(i + 1));
/*     */         
/* 305 */         if (j < 16) {
/* 306 */           this.r = false;
/* 307 */           this.s = false;
/* 308 */           this.v = false;
/* 309 */           this.u = false;
/* 310 */           this.t = false;
/* 311 */           if (j < 0 || j > 15) {
/* 312 */             j = 15;
/*     */           }
/*     */           
/* 315 */           if (bool) {
/* 316 */             j += 16;
/*     */           }
/*     */           
/* 319 */           int k = this.f[j];
/* 320 */           this.q = k;
/* 321 */           bfl.c((k >> 16) / 255.0F, (k >> 8 & 0xFF) / 255.0F, (k & 0xFF) / 255.0F, this.p);
/* 322 */         } else if (j == 16) {
/* 323 */           this.r = true;
/* 324 */         } else if (j == 17) {
/* 325 */           this.s = true;
/* 326 */         } else if (j == 18) {
/* 327 */           this.v = true;
/* 328 */         } else if (j == 19) {
/* 329 */           this.u = true;
/* 330 */         } else if (j == 20) {
/* 331 */           this.t = true;
/* 332 */         } else if (j == 21) {
/* 333 */           this.r = false;
/* 334 */           this.s = false;
/* 335 */           this.v = false;
/* 336 */           this.u = false;
/* 337 */           this.t = false;
/*     */           
/* 339 */           bfl.c(this.m, this.n, this.o, this.p);
/*     */         } 
/*     */         
/* 342 */         i++;
/*     */       }
/*     */       else {
/*     */         
/* 346 */         int j = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(c);
/*     */         
/* 348 */         if (this.r && j != -1) {
/* 349 */           int k = a(c);
/*     */           
/*     */           while (true) {
/* 352 */             j = this.b.nextInt("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".length());
/* 353 */             char c1 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".charAt(j);
/* 354 */             if (k == a(c1)) {
/* 355 */               c = c1;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/* 361 */         float f1 = this.k ? 0.5F : 1.0F;
/* 362 */         boolean bool1 = ((c == '\000' || j == -1 || this.k) && bool);
/*     */         
/* 364 */         if (bool1) {
/* 365 */           this.i -= f1;
/* 366 */           this.j -= f1;
/*     */         } 
/* 368 */         float f2 = a(c, this.t);
/* 369 */         if (bool1) {
/* 370 */           this.i += f1;
/* 371 */           this.j += f1;
/*     */         } 
/*     */         
/* 374 */         if (this.s) {
/* 375 */           this.i += f1;
/* 376 */           if (bool1) {
/* 377 */             this.i -= f1;
/* 378 */             this.j -= f1;
/*     */           } 
/* 380 */           a(c, this.t);
/* 381 */           this.i -= f1;
/* 382 */           if (bool1) {
/* 383 */             this.i += f1;
/* 384 */             this.j += f1;
/*     */           } 
/* 386 */           f2++;
/*     */         } 
/*     */         
/* 389 */         if (this.v) {
/* 390 */           bfx bfx = bfx.a();
/* 391 */           bfd bfd = bfx.c();
/* 392 */           bfl.x();
/* 393 */           bfd.a(7, bms.e);
/* 394 */           bfd.b(this.i, (this.j + (this.a / 2)), 0.0D).d();
/* 395 */           bfd.b((this.i + f2), (this.j + (this.a / 2)), 0.0D).d();
/* 396 */           bfd.b((this.i + f2), (this.j + (this.a / 2) - 1.0F), 0.0D).d();
/* 397 */           bfd.b(this.i, (this.j + (this.a / 2) - 1.0F), 0.0D).d();
/* 398 */           bfx.b();
/* 399 */           bfl.w();
/*     */         } 
/*     */         
/* 402 */         if (this.u) {
/* 403 */           bfx bfx = bfx.a();
/* 404 */           bfd bfd = bfx.c();
/* 405 */           bfl.x();
/* 406 */           bfd.a(7, bms.e);
/* 407 */           int k = this.u ? -1 : 0;
/* 408 */           bfd.b((this.i + k), (this.j + this.a), 0.0D).d();
/* 409 */           bfd.b((this.i + f2), (this.j + this.a), 0.0D).d();
/* 410 */           bfd.b((this.i + f2), (this.j + this.a - 1.0F), 0.0D).d();
/* 411 */           bfd.b((this.i + k), (this.j + this.a - 1.0F), 0.0D).d();
/* 412 */           bfx.b();
/* 413 */           bfl.w();
/*     */         } 
/*     */         
/* 416 */         this.i += (int)f2;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private int a(String ☃, int i, int j, int k, int m, boolean bool) {
/* 421 */     if (this.l) {
/* 422 */       int n = a(c(☃));
/* 423 */       i = i + k - n;
/*     */     } 
/* 425 */     return b(☃, i, j, m, bool);
/*     */   }
/*     */   
/*     */   private int b(String ☃, float f1, float f2, int i, boolean bool) {
/* 429 */     if (☃ == null) {
/* 430 */       return 0;
/*     */     }
/* 432 */     if (this.l) {
/* 433 */       ☃ = c(☃);
/*     */     }
/*     */     
/* 436 */     if ((i & 0xFC000000) == 0) {
/* 437 */       i |= 0xFF000000;
/*     */     }
/*     */     
/* 440 */     if (bool) {
/* 441 */       i = (i & 0xFCFCFC) >> 2 | i & 0xFF000000;
/*     */     }
/*     */     
/* 444 */     this.m = (i >> 16 & 0xFF) / 255.0F;
/* 445 */     this.n = (i >> 8 & 0xFF) / 255.0F;
/* 446 */     this.o = (i & 0xFF) / 255.0F;
/* 447 */     this.p = (i >> 24 & 0xFF) / 255.0F;
/*     */     
/* 449 */     bfl.c(this.m, this.n, this.o, this.p);
/*     */     
/* 451 */     this.i = f1;
/* 452 */     this.j = f2;
/* 453 */     a(☃, bool);
/*     */     
/* 455 */     return (int)this.i;
/*     */   }
/*     */   
/*     */   public int a(String ☃) {
/* 459 */     if (☃ == null) {
/* 460 */       return 0;
/*     */     }
/* 462 */     int i = 0;
/* 463 */     boolean bool = false;
/*     */     
/* 465 */     for (int j = 0; j < ☃.length(); j++) {
/* 466 */       char c = ☃.charAt(j);
/*     */       
/* 468 */       int k = a(c);
/* 469 */       if (k < 0 && j < ☃.length() - 1) {
/* 470 */         c = ☃.charAt(++j);
/*     */         
/* 472 */         if (c == 'l' || c == 'L') {
/* 473 */           bool = true;
/* 474 */         } else if (c == 'r' || c == 'R') {
/* 475 */           bool = false;
/*     */         } 
/* 477 */         k = 0;
/*     */       } 
/* 479 */       i += k;
/* 480 */       if (bool && k > 0) {
/* 481 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 485 */     return i;
/*     */   }
/*     */   
/*     */   public int a(char ☃) {
/* 489 */     if (☃ == '§') {
/* 490 */       return -1;
/*     */     }
/*     */     
/* 493 */     if (☃ == ' ') {
/* 494 */       return 4;
/*     */     }
/*     */     
/* 497 */     int i = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(☃);
/* 498 */     if (☃ > '\000' && i != -1 && !this.k) {
/* 499 */       return this.d[i];
/*     */     }
/*     */ 
/*     */     
/* 503 */     if (this.e[☃] != 0) {
/* 504 */       int j = this.e[☃] >>> 4;
/* 505 */       int k = this.e[☃] & 0xF;
/*     */       
/* 507 */       if (k > 7) {
/* 508 */         k = 15;
/* 509 */         j = 0;
/*     */       } 
/* 511 */       k++;
/*     */       
/* 513 */       return (k - j) / 2 + 1;
/*     */     } 
/*     */     
/* 516 */     return 0;
/*     */   }
/*     */   
/*     */   public String a(String ☃, int i) {
/* 520 */     return a(☃, i, false);
/*     */   }
/*     */   
/*     */   public String a(String ☃, int i, boolean bool) {
/* 524 */     StringBuilder stringBuilder = new StringBuilder();
/* 525 */     int j = 0;
/* 526 */     int k = bool ? (☃.length() - 1) : 0;
/* 527 */     int m = bool ? -1 : 1;
/* 528 */     boolean bool1 = false;
/* 529 */     boolean bool2 = false;
/*     */     int n;
/* 531 */     for (n = k; n >= 0 && n < ☃.length() && j < i; n += m) {
/* 532 */       char c = ☃.charAt(n);
/* 533 */       int i1 = a(c);
/*     */       
/* 535 */       if (bool1) {
/* 536 */         bool1 = false;
/*     */         
/* 538 */         if (c == 'l' || c == 'L') {
/* 539 */           bool2 = true;
/* 540 */         } else if (c == 'r' || c == 'R') {
/* 541 */           bool2 = false;
/*     */         } 
/* 543 */       } else if (i1 < 0) {
/* 544 */         bool1 = true;
/*     */       } else {
/* 546 */         j += i1;
/* 547 */         if (bool2) {
/* 548 */           j++;
/*     */         }
/*     */       } 
/*     */       
/* 552 */       if (j > i) {
/*     */         break;
/*     */       }
/*     */       
/* 556 */       if (bool) {
/* 557 */         stringBuilder.insert(0, c);
/*     */       } else {
/* 559 */         stringBuilder.append(c);
/*     */       } 
/*     */     } 
/*     */     
/* 563 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String d(String ☃) {
/* 574 */     while (☃ != null && ☃.endsWith("\n")) {
/* 575 */       ☃ = ☃.substring(0, ☃.length() - 1);
/*     */     }
/* 577 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(String ☃, int i, int j, int k, int m) {
/* 581 */     e();
/* 582 */     this.q = m;
/* 583 */     ☃ = d(☃);
/*     */     
/* 585 */     a(☃, i, j, k, false);
/*     */   }
/*     */   
/*     */   private void a(String ☃, int i, int j, int k, boolean bool) {
/* 589 */     List<String> list = c(☃, k);
/* 590 */     for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) { String str = iterator.next();
/* 591 */       a(str, i, j, k, this.q, bool);
/* 592 */       j += this.a; }
/*     */   
/*     */   }
/*     */   
/*     */   public int b(String ☃, int i) {
/* 597 */     return this.a * c(☃, i).size();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 601 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 605 */     return this.k;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 609 */     this.l = ☃;
/*     */   }
/*     */   
/*     */   public List<String> c(String ☃, int i) {
/* 613 */     return Arrays.asList(d(☃, i).split("\n"));
/*     */   }
/*     */   
/*     */   String d(String ☃, int i) {
/* 617 */     int j = e(☃, i);
/* 618 */     if (☃.length() <= j) {
/* 619 */       return ☃;
/*     */     }
/*     */     
/* 622 */     String str1 = ☃.substring(0, j);
/*     */     
/* 624 */     char c = ☃.charAt(j);
/* 625 */     boolean bool = (c == ' ' || c == '\n');
/* 626 */     String str2 = b(str1) + ☃.substring(j + (bool ? 1 : 0));
/*     */     
/* 628 */     return str1 + "\n" + d(str2, i);
/*     */   }
/*     */   
/*     */   private int e(String ☃, int i) {
/* 632 */     int j = ☃.length();
/* 633 */     int k = 0;
/* 634 */     int m = 0;
/* 635 */     int n = -1;
/* 636 */     boolean bool = false;
/*     */ 
/*     */     
/* 639 */     for (; m < j; m++) {
/* 640 */       char c = ☃.charAt(m);
/*     */       
/* 642 */       switch (c) {
/*     */         case '§':
/* 644 */           if (m < j - 1) {
/* 645 */             char c1 = ☃.charAt(++m);
/* 646 */             if (c1 == 'l' || c1 == 'L') {
/* 647 */               bool = true; break;
/* 648 */             }  if (c1 == 'r' || c1 == 'R' || c(c1)) {
/* 649 */               bool = false;
/*     */             }
/*     */           } 
/*     */           break;
/*     */         case '\n':
/* 654 */           m--;
/*     */           break;
/*     */         case ' ':
/* 657 */           n = m;
/*     */         default:
/* 659 */           k += a(c);
/* 660 */           if (bool) {
/* 661 */             k++;
/*     */           }
/*     */           break;
/*     */       } 
/* 665 */       if (c == '\n') {
/* 666 */         n = ++m;
/*     */         
/*     */         break;
/*     */       } 
/* 670 */       if (k > i) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/* 675 */     if (m != j && n != -1 && n < m) {
/* 676 */       return n;
/*     */     }
/* 678 */     return m;
/*     */   }
/*     */   
/*     */   private static boolean c(char ☃) {
/* 682 */     return ((☃ >= '0' && ☃ <= '9') || (☃ >= 'a' && ☃ <= 'f') || (☃ >= 'A' && ☃ <= 'F'));
/*     */   }
/*     */   
/*     */   private static boolean d(char ☃) {
/* 686 */     return ((☃ >= 'k' && ☃ <= 'o') || (☃ >= 'K' && ☃ <= 'O') || ☃ == 'r' || ☃ == 'R');
/*     */   }
/*     */   
/*     */   public static String b(String ☃) {
/* 690 */     String str = "";
/* 691 */     int i = -1;
/* 692 */     int j = ☃.length();
/*     */     
/* 694 */     while ((i = ☃.indexOf('§', i + 1)) != -1) {
/* 695 */       if (i < j - 1) {
/* 696 */         char c = ☃.charAt(i + 1);
/*     */         
/* 698 */         if (c(c)) {
/* 699 */           str = "§" + c; continue;
/* 700 */         }  if (d(c)) {
/* 701 */           str = str + "§" + c;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 706 */     return str;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 710 */     return this.l;
/*     */   }
/*     */   
/*     */   public int b(char ☃) {
/* 714 */     return this.f["0123456789abcdef".indexOf(☃)];
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */