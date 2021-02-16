/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class atn
/*     */   implements atr
/*     */ {
/*  16 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   protected final File a;
/*     */   
/*     */   public atn(File ☃) {
/*  21 */     if (!☃.exists()) {
/*  22 */       ☃.mkdirs();
/*     */     }
/*  24 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  29 */     return "Old Format";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ats> b() throws atq {
/*  34 */     List<ats> ☃ = Lists.newArrayList();
/*     */     
/*  36 */     for (int i = 0; i < 5; i++) {
/*  37 */       String str = "World" + (i + 1);
/*     */       
/*  39 */       ato ato = c(str);
/*  40 */       if (ato != null) {
/*  41 */         ☃.add(new ats(str, "", ato.m(), ato.h(), ato.r(), false, ato.t(), ato.v()));
/*     */       }
/*     */     } 
/*     */     
/*  45 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */ 
/*     */   
/*     */   public ato c(String ☃) {
/*  54 */     File file1 = new File(this.a, ☃);
/*  55 */     if (!file1.exists()) {
/*  56 */       return null;
/*     */     }
/*     */     
/*  59 */     File file2 = new File(file1, "level.dat");
/*  60 */     if (file2.exists()) {
/*     */       try {
/*  62 */         dn dn1 = dx.a(new FileInputStream(file2));
/*  63 */         dn dn2 = dn1.m("Data");
/*  64 */         return new ato(dn2);
/*  65 */       } catch (Exception exception) {
/*  66 */         b.error("Exception reading " + file2, exception);
/*     */       } 
/*     */     }
/*     */     
/*  70 */     file2 = new File(file1, "level.dat_old");
/*  71 */     if (file2.exists()) {
/*     */       try {
/*  73 */         dn dn1 = dx.a(new FileInputStream(file2));
/*  74 */         dn dn2 = dn1.m("Data");
/*  75 */         return new ato(dn2);
/*  76 */       } catch (Exception exception) {
/*  77 */         b.error("Exception reading " + file2, exception);
/*     */       } 
/*     */     }
/*  80 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, String str1) {
/*  85 */     File file1 = new File(this.a, ☃);
/*  86 */     if (!file1.exists()) {
/*     */       return;
/*     */     }
/*     */     
/*  90 */     File file2 = new File(file1, "level.dat");
/*  91 */     if (file2.exists()) {
/*     */       try {
/*  93 */         dn dn1 = dx.a(new FileInputStream(file2));
/*  94 */         dn dn2 = dn1.m("Data");
/*  95 */         dn2.a("LevelName", str1);
/*     */         
/*  97 */         dx.a(dn1, new FileOutputStream(file2));
/*  98 */       } catch (Exception exception) {
/*  99 */         exception.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(String ☃) {
/* 106 */     File file = new File(this.a, ☃);
/* 107 */     if (file.exists()) {
/* 108 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 112 */       file.mkdir();
/* 113 */       file.delete();
/* 114 */     } catch (Throwable throwable) {
/* 115 */       b.warn("Couldn't make new level", throwable);
/* 116 */       return false;
/*     */     } 
/*     */     
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(String ☃) {
/* 124 */     File file = new File(this.a, ☃);
/* 125 */     if (!file.exists()) {
/* 126 */       return true;
/*     */     }
/*     */     
/* 129 */     b.info("Deleting level " + ☃);
/*     */     
/* 131 */     for (int i = 1; i <= 5; i++) {
/* 132 */       b.info("Attempt " + i + "...");
/*     */       
/* 134 */       if (a(file.listFiles())) {
/*     */         break;
/*     */       }
/* 137 */       b.warn("Unsuccessful in deleting contents.");
/*     */ 
/*     */       
/* 140 */       if (i < 5) {
/*     */         try {
/* 142 */           Thread.sleep(500L);
/* 143 */         } catch (InterruptedException interruptedException) {}
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 148 */     return file.delete();
/*     */   }
/*     */   
/*     */   protected static boolean a(File[] ☃) {
/* 152 */     for (int i = 0; i < ☃.length; i++) {
/* 153 */       File file = ☃[i];
/* 154 */       b.debug("Deleting " + file);
/*     */       
/* 156 */       if (file.isDirectory() && 
/* 157 */         !a(file.listFiles())) {
/* 158 */         b.warn("Couldn't delete directory " + file);
/* 159 */         return false;
/*     */       } 
/*     */ 
/*     */       
/* 163 */       if (!file.delete()) {
/* 164 */         b.warn("Couldn't delete file " + file);
/* 165 */         return false;
/*     */       } 
/*     */     } 
/*     */     
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public atp a(String ☃, boolean bool) {
/* 174 */     return new atm(this.a, ☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String ☃) {
/* 179 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String ☃) {
/* 184 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String ☃, nu nu1) {
/* 189 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(String ☃) {
/* 194 */     File file = new File(this.a, ☃);
/* 195 */     return file.isDirectory();
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/atn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */