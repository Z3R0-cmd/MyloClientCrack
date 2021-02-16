/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FilenameFilter;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class atk
/*     */   extends atn
/*     */ {
/*  25 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   public atk(File ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  33 */     return "Anvil";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ats> b() throws atq {
/*  38 */     if (this.a == null || !this.a.exists() || !this.a.isDirectory()) {
/*  39 */       throw new atq("Unable to read or access folder where game worlds are saved!");
/*     */     }
/*     */     
/*  42 */     List<ats> ☃ = Lists.newArrayList();
/*     */     
/*  44 */     File[] arrayOfFile1 = this.a.listFiles(); File[] arrayOfFile2; int i, j;
/*  45 */     for (arrayOfFile2 = arrayOfFile1, i = arrayOfFile2.length, j = 0; j < i; ) { File file = arrayOfFile2[j];
/*  46 */       if (file.isDirectory()) {
/*     */ 
/*     */ 
/*     */         
/*  50 */         String str = file.getName();
/*     */         
/*  52 */         ato ato = c(str);
/*  53 */         if (ato != null && (ato.l() == 19132 || ato.l() == 19133)) {
/*  54 */           boolean bool = (ato.l() != c());
/*  55 */           String str1 = ato.k();
/*  56 */           if (StringUtils.isEmpty(str1)) {
/*  57 */             str1 = str;
/*     */           }
/*  59 */           long l = 0L;
/*  60 */           ☃.add(new ats(str, str1, ato.m(), l, ato.r(), bool, ato.t(), ato.v()));
/*     */         } 
/*     */       }  j++; }
/*     */     
/*  64 */     return ☃;
/*     */   }
/*     */   
/*     */   protected int c() {
/*  68 */     return 19133;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  73 */     ani.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public atp a(String ☃, boolean bool) {
/*  78 */     return new atj(this.a, ☃, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(String ☃) {
/*  84 */     ato ato = c(☃);
/*  85 */     if (ato == null || ato.l() != 19132) {
/*  86 */       return false;
/*     */     }
/*     */     
/*  89 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String ☃) {
/*  94 */     ato ato = c(☃);
/*  95 */     if (ato == null || ato.l() == c()) {
/*  96 */       return false;
/*     */     }
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(String ☃, nu nu1) {
/* 103 */     nu1.a(0);
/*     */     
/* 105 */     List<File> list1 = Lists.newArrayList();
/* 106 */     List<File> list2 = Lists.newArrayList();
/* 107 */     List<File> list3 = Lists.newArrayList();
/* 108 */     File file1 = new File(this.a, ☃);
/* 109 */     File file2 = new File(file1, "DIM-1");
/* 110 */     File file3 = new File(file1, "DIM1");
/*     */     
/* 112 */     b.info("Scanning folders...");
/*     */ 
/*     */     
/* 115 */     a(file1, list1);
/*     */ 
/*     */     
/* 118 */     if (file2.exists()) {
/* 119 */       a(file2, list2);
/*     */     }
/* 121 */     if (file3.exists()) {
/* 122 */       a(file3, list3);
/*     */     }
/*     */     
/* 125 */     int i = list1.size() + list2.size() + list3.size();
/* 126 */     b.info("Total conversion count is " + i);
/*     */     
/* 128 */     ato ato = c(☃);
/*     */     
/* 130 */     aec aec = null;
/* 131 */     if (ato.u() == adr.c) {
/* 132 */       aec = new aef(ady.q, 0.5F);
/*     */     } else {
/* 134 */       aec = new aec(ato.b(), ato.u(), ato.B());
/*     */     } 
/*     */ 
/*     */     
/* 138 */     a(new File(file1, "region"), list1, aec, 0, i, nu1);
/*     */     
/* 140 */     a(new File(file2, "region"), list2, new aef(ady.x, 0.0F), list1.size(), i, nu1);
/*     */     
/* 142 */     a(new File(file3, "region"), list3, new aef(ady.y, 0.0F), list1.size() + list2.size(), i, nu1);
/*     */     
/* 144 */     ato.e(19133);
/* 145 */     if (ato.u() == adr.h) {
/* 146 */       ato.a(adr.b);
/*     */     }
/*     */     
/* 149 */     g(☃);
/*     */     
/* 151 */     atp atp = a(☃, false);
/* 152 */     atp.a(ato);
/*     */     
/* 154 */     return true;
/*     */   }
/*     */   
/*     */   private void g(String ☃) {
/* 158 */     File file1 = new File(this.a, ☃);
/* 159 */     if (!file1.exists()) {
/* 160 */       b.warn("Unable to create level.dat_mcr backup");
/*     */       
/*     */       return;
/*     */     } 
/* 164 */     File file2 = new File(file1, "level.dat");
/* 165 */     if (!file2.exists()) {
/* 166 */       b.warn("Unable to create level.dat_mcr backup");
/*     */       
/*     */       return;
/*     */     } 
/* 170 */     File file3 = new File(file1, "level.dat_mcr");
/* 171 */     if (!file2.renameTo(file3)) {
/* 172 */       b.warn("Unable to create level.dat_mcr backup");
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(File ☃, Iterable<File> iterable, aec aec1, int i, int j, nu nu1) {
/* 177 */     for (Iterator<File> iterator = iterable.iterator(); iterator.hasNext(); ) { File file = iterator.next();
/* 178 */       a(☃, file, aec1, i, j, nu1);
/*     */       
/* 180 */       i++;
/* 181 */       int k = (int)Math.round(100.0D * i / j);
/* 182 */       nu1.a(k); }
/*     */   
/*     */   }
/*     */   
/*     */   private void a(File ☃, File file1, aec aec1, int i, int j, nu nu1) {
/*     */     try {
/* 188 */       String str = file1.getName();
/*     */       
/* 190 */       anh anh1 = new anh(file1);
/* 191 */       anh anh2 = new anh(new File(☃, str.substring(0, str.length() - ".mcr".length()) + ".mca"));
/*     */       
/* 193 */       for (int k = 0; k < 32; k++) {
/* 194 */         int m; for (m = 0; m < 32; m++) {
/* 195 */           if (anh1.c(k, m) && !anh2.c(k, m)) {
/* 196 */             DataInputStream dataInputStream = anh1.a(k, m);
/* 197 */             if (dataInputStream == null) {
/* 198 */               b.warn("Failed to fetch input stream");
/*     */             } else {
/*     */               
/* 201 */               dn dn1 = dx.a(dataInputStream);
/* 202 */               dataInputStream.close();
/*     */               
/* 204 */               dn dn2 = dn1.m("Level");
/* 205 */               ang.a a = ang.a(dn2);
/*     */               
/* 207 */               dn dn3 = new dn();
/* 208 */               dn dn4 = new dn();
/* 209 */               dn3.a("Level", dn4);
/* 210 */               ang.a(a, dn4, aec1);
/*     */               
/* 212 */               DataOutputStream dataOutputStream = anh2.b(k, m);
/* 213 */               dx.a(dn3, dataOutputStream);
/* 214 */               dataOutputStream.close();
/*     */             } 
/*     */           } 
/* 217 */         }  m = (int)Math.round(100.0D * (i * 1024) / (j * 1024));
/* 218 */         int n = (int)Math.round(100.0D * ((k + 1) * 32 + i * 1024) / (j * 1024));
/* 219 */         if (n > m) {
/* 220 */           nu1.a(n);
/*     */         }
/*     */       } 
/*     */       
/* 224 */       anh1.c();
/* 225 */       anh2.c();
/* 226 */     } catch (IOException iOException) {
/* 227 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(File ☃, Collection<File> collection) {
/* 232 */     File file = new File(☃, "region");
/* 233 */     File[] arrayOfFile = file.listFiles(new FilenameFilter(this)
/*     */         {
/*     */           public boolean accept(File ☃, String str) {
/* 236 */             return str.endsWith(".mcr");
/*     */           }
/*     */         });
/*     */     
/* 240 */     if (arrayOfFile != null)
/* 241 */       Collections.addAll(collection, arrayOfFile); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/atk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */