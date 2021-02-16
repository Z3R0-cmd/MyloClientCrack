/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.nio.IntBuffer;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.BufferUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avj
/*     */ {
/*  31 */   private static final Logger a = LogManager.getLogger();
/*  32 */   private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
/*     */   private static IntBuffer c;
/*     */   private static int[] d;
/*     */   
/*     */   public static eu a(File ☃, int i, int j, bfw bfw1) {
/*  37 */     return a(☃, null, i, j, bfw1);
/*     */   }
/*     */   
/*     */   public static eu a(File ☃, String str, int i, int j, bfw bfw1) {
/*     */     try {
/*  42 */       File file2, file1 = new File(☃, "screenshots");
/*  43 */       file1.mkdir();
/*     */       
/*  45 */       if (bqs.i()) {
/*  46 */         i = bfw1.a;
/*  47 */         j = bfw1.b;
/*     */       } 
/*  49 */       int k = i * j;
/*  50 */       if (c == null || c.capacity() < k) {
/*  51 */         c = BufferUtils.createIntBuffer(k);
/*  52 */         d = new int[k];
/*     */       } 
/*     */       
/*  55 */       GL11.glPixelStorei(3333, 1);
/*  56 */       GL11.glPixelStorei(3317, 1);
/*     */       
/*  58 */       c.clear();
/*  59 */       if (bqs.i()) {
/*  60 */         bfl.i(bfw1.g);
/*  61 */         GL11.glGetTexImage(3553, 0, 32993, 33639, c);
/*     */       } else {
/*  63 */         GL11.glReadPixels(0, 0, i, j, 32993, 33639, c);
/*     */       } 
/*     */       
/*  66 */       c.get(d);
/*     */       
/*  68 */       bml.a(d, i, j);
/*     */ 
/*     */       
/*  71 */       BufferedImage bufferedImage = null;
/*  72 */       if (bqs.i()) {
/*  73 */         bufferedImage = new BufferedImage(bfw1.c, bfw1.d, 1);
/*  74 */         int m = bfw1.b - bfw1.d;
/*  75 */         for (int n = m; n < bfw1.b; n++) {
/*  76 */           for (int i1 = 0; i1 < bfw1.c; i1++) {
/*  77 */             bufferedImage.setRGB(i1, n - m, d[n * bfw1.a + i1]);
/*     */           }
/*     */         } 
/*     */       } else {
/*  81 */         bufferedImage = new BufferedImage(i, j, 1);
/*  82 */         bufferedImage.setRGB(0, 0, i, j, d, 0, i);
/*     */       } 
/*     */ 
/*     */       
/*  86 */       if (str == null) {
/*  87 */         file2 = a(file1);
/*     */       } else {
/*  89 */         file2 = new File(file1, str);
/*     */       } 
/*     */       
/*  92 */       ImageIO.write(bufferedImage, "png", file2);
/*     */       
/*  94 */       eu eu = new fa(file2.getName());
/*  95 */       eu.b().a(new et(et.a.b, file2.getAbsolutePath()));
/*  96 */       eu.b().d(Boolean.valueOf(true));
/*  97 */       return new fb("screenshot.success", new Object[] { eu });
/*  98 */     } catch (Exception exception) {
/*  99 */       a.warn("Couldn't save screenshot", exception);
/* 100 */       return new fb("screenshot.failure", new Object[] { exception.getMessage() });
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static File a(File ☃) {
/* 106 */     String str = b.format(new Date()).toString();
/*     */     
/* 108 */     for (int i = 1;; i++) {
/* 109 */       File file = new File(☃, str + ((i == 1) ? "" : ("_" + i)) + ".png");
/* 110 */       if (!file.exists())
/* 111 */         return file; 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */