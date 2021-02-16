/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class atm
/*     */   implements atp, aty
/*     */ {
/*  16 */   private static final Logger a = LogManager.getLogger();
/*     */   private final File b;
/*     */   private final File c;
/*     */   private final File d;
/*  20 */   private final long e = MinecraftServer.az();
/*     */   private final String f;
/*     */   
/*     */   public atm(File ☃, String str, boolean bool) {
/*  24 */     this.b = new File(☃, str);
/*  25 */     this.b.mkdirs();
/*  26 */     this.c = new File(this.b, "playerdata");
/*  27 */     this.d = new File(this.b, "data");
/*  28 */     this.d.mkdirs();
/*  29 */     this.f = str;
/*     */     
/*  31 */     if (bool) {
/*  32 */       this.c.mkdirs();
/*     */     }
/*     */     
/*  35 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*     */     try {
/*  40 */       File ☃ = new File(this.b, "session.lock");
/*  41 */       DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(☃));
/*     */       try {
/*  43 */         dataOutputStream.writeLong(this.e);
/*     */       } finally {
/*  45 */         dataOutputStream.close();
/*     */       } 
/*  47 */     } catch (IOException ☃) {
/*  48 */       ☃.printStackTrace();
/*  49 */       throw new RuntimeException("Failed to check session lock, aborting");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public File b() {
/*  55 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() throws adn {
/*     */     try {
/*  61 */       File ☃ = new File(this.b, "session.lock");
/*  62 */       DataInputStream dataInputStream = new DataInputStream(new FileInputStream(☃));
/*     */       try {
/*  64 */         if (dataInputStream.readLong() != this.e) {
/*  65 */           throw new adn("The save is being accessed from another location, aborting");
/*     */         }
/*     */       } finally {
/*  68 */         dataInputStream.close();
/*     */       } 
/*  70 */     } catch (IOException ☃) {
/*  71 */       throw new adn("Failed to check session lock, aborting");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public and a(anm ☃) {
/*  77 */     throw new RuntimeException("Old Chunk Storage is no longer supported.");
/*     */   }
/*     */ 
/*     */   
/*     */   public ato d() {
/*  82 */     File ☃ = new File(this.b, "level.dat");
/*  83 */     if (☃.exists()) {
/*     */       try {
/*  85 */         dn dn1 = dx.a(new FileInputStream(☃));
/*  86 */         dn dn2 = dn1.m("Data");
/*     */         
/*  88 */         return new ato(dn2);
/*     */       }
/*  90 */       catch (Exception exception) {
/*  91 */         exception.printStackTrace();
/*     */       } 
/*     */     }
/*  94 */     ☃ = new File(this.b, "level.dat_old");
/*  95 */     if (☃.exists()) {
/*     */       try {
/*  97 */         dn dn1 = dx.a(new FileInputStream(☃));
/*  98 */         dn dn2 = dn1.m("Data");
/*     */         
/* 100 */         return new ato(dn2);
/*     */       }
/* 102 */       catch (Exception exception) {
/* 103 */         exception.printStackTrace();
/*     */       } 
/*     */     }
/* 106 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ato ☃, dn dn1) {
/* 111 */     dn dn2 = ☃.a(dn1);
/*     */     
/* 113 */     dn dn3 = new dn();
/* 114 */     dn3.a("Data", dn2);
/*     */     
/*     */     try {
/* 117 */       File file1 = new File(this.b, "level.dat_new");
/* 118 */       File file2 = new File(this.b, "level.dat_old");
/* 119 */       File file3 = new File(this.b, "level.dat");
/*     */       
/* 121 */       dx.a(dn3, new FileOutputStream(file1));
/*     */       
/* 123 */       if (file2.exists()) {
/* 124 */         file2.delete();
/*     */       }
/* 126 */       file3.renameTo(file2);
/* 127 */       if (file3.exists()) {
/* 128 */         file3.delete();
/*     */       }
/* 130 */       file1.renameTo(file3);
/* 131 */       if (file1.exists()) {
/* 132 */         file1.delete();
/*     */       }
/* 134 */     } catch (Exception exception) {
/* 135 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ato ☃) {
/* 141 */     dn dn1 = ☃.a();
/*     */     
/* 143 */     dn dn2 = new dn();
/* 144 */     dn2.a("Data", dn1);
/*     */     
/*     */     try {
/* 147 */       File file1 = new File(this.b, "level.dat_new");
/* 148 */       File file2 = new File(this.b, "level.dat_old");
/* 149 */       File file3 = new File(this.b, "level.dat");
/*     */       
/* 151 */       dx.a(dn2, new FileOutputStream(file1));
/*     */       
/* 153 */       if (file2.exists()) {
/* 154 */         file2.delete();
/*     */       }
/* 156 */       file3.renameTo(file2);
/* 157 */       if (file3.exists()) {
/* 158 */         file3.delete();
/*     */       }
/* 160 */       file1.renameTo(file3);
/* 161 */       if (file1.exists()) {
/* 162 */         file1.delete();
/*     */       }
/* 164 */     } catch (Exception exception) {
/* 165 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(wn ☃) {
/*     */     try {
/* 172 */       dn dn = new dn();
/* 173 */       ☃.e(dn);
/* 174 */       File file1 = new File(this.c, ☃.aK().toString() + ".dat.tmp");
/* 175 */       File file2 = new File(this.c, ☃.aK().toString() + ".dat");
/* 176 */       dx.a(dn, new FileOutputStream(file1));
/* 177 */       if (file2.exists()) {
/* 178 */         file2.delete();
/*     */       }
/* 180 */       file1.renameTo(file2);
/* 181 */     } catch (Exception exception) {
/* 182 */       a.warn("Failed to save player data for " + ☃.e_());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public dn b(wn ☃) {
/* 188 */     dn dn = null;
/*     */     try {
/* 190 */       File file = new File(this.c, ☃.aK().toString() + ".dat");
/* 191 */       if (file.exists() && file.isFile()) {
/* 192 */         dn = dx.a(new FileInputStream(file));
/*     */       }
/* 194 */     } catch (Exception exception) {
/* 195 */       a.warn("Failed to load player data for " + ☃.e_());
/*     */     } 
/* 197 */     if (dn != null) {
/* 198 */       ☃.f(dn);
/*     */     }
/* 200 */     return dn;
/*     */   }
/*     */ 
/*     */   
/*     */   public aty e() {
/* 205 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public String[] f() {
/* 210 */     String[] ☃ = this.c.list();
/* 211 */     if (☃ == null) {
/* 212 */       ☃ = new String[0];
/*     */     }
/*     */     
/* 215 */     for (int i = 0; i < ☃.length; i++) {
/* 216 */       if (☃[i].endsWith(".dat")) {
/* 217 */         ☃[i] = ☃[i].substring(0, ☃[i].length() - 4);
/*     */       }
/*     */     } 
/*     */     
/* 221 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */   
/*     */   public File a(String ☃) {
/* 230 */     return new File(this.d, ☃ + ".dat");
/*     */   }
/*     */ 
/*     */   
/*     */   public String g() {
/* 235 */     return this.f;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/atm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */