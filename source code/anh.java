/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.util.List;
/*     */ import java.util.zip.DeflaterOutputStream;
/*     */ import java.util.zip.GZIPInputStream;
/*     */ import java.util.zip.InflaterInputStream;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class anh
/*     */ {
/*  78 */   private static final byte[] a = new byte[4096];
/*     */   
/*     */   private final File b;
/*     */   private RandomAccessFile c;
/*     */   private final int[] d;
/*     */   private final int[] e;
/*     */   private List<Boolean> f;
/*     */   private int g;
/*     */   private long h;
/*     */   
/*     */   public anh(File ☃) {
/*  89 */     this.d = new int[1024];
/*  90 */     this.e = new int[1024];
/*     */     
/*  92 */     this.b = ☃;
/*     */     
/*  94 */     this.g = 0;
/*     */     
/*     */     try {
/*  97 */       if (☃.exists()) {
/*  98 */         this.h = ☃.lastModified();
/*     */       }
/*     */       
/* 101 */       this.c = new RandomAccessFile(☃, "rw");
/*     */       
/* 103 */       if (this.c.length() < 4096L) {
/*     */         int k;
/* 105 */         for (k = 0; k < 1024; k++) {
/* 106 */           this.c.writeInt(0);
/*     */         }
/*     */         
/* 109 */         for (k = 0; k < 1024; k++) {
/* 110 */           this.c.writeInt(0);
/*     */         }
/*     */         
/* 113 */         this.g += 8192;
/*     */       } 
/*     */       
/* 116 */       if ((this.c.length() & 0xFFFL) != 0L)
/*     */       {
/* 118 */         for (int k = 0; k < (this.c.length() & 0xFFFL); k++) {
/* 119 */           this.c.write(0);
/*     */         }
/*     */       }
/*     */ 
/*     */       
/* 124 */       int i = (int)this.c.length() / 4096;
/* 125 */       this.f = Lists.newArrayListWithCapacity(i);
/*     */       int j;
/* 127 */       for (j = 0; j < i; j++) {
/* 128 */         this.f.add(Boolean.valueOf(true));
/*     */       }
/*     */       
/* 131 */       this.f.set(0, Boolean.valueOf(false));
/* 132 */       this.f.set(1, Boolean.valueOf(false));
/*     */       
/* 134 */       this.c.seek(0L);
/* 135 */       for (j = 0; j < 1024; j++) {
/* 136 */         int k = this.c.readInt();
/* 137 */         this.d[j] = k;
/* 138 */         if (k != 0 && (k >> 8) + (k & 0xFF) <= this.f.size()) {
/* 139 */           for (int m = 0; m < (k & 0xFF); m++) {
/* 140 */             this.f.set((k >> 8) + m, Boolean.valueOf(false));
/*     */           }
/*     */         }
/*     */       } 
/* 144 */       for (j = 0; j < 1024; j++) {
/* 145 */         int k = this.c.readInt();
/* 146 */         this.e[j] = k;
/*     */       } 
/* 148 */     } catch (IOException iOException) {
/* 149 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
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
/*     */   public synchronized DataInputStream a(int ☃, int i) {
/* 170 */     if (d(☃, i)) {
/* 171 */       return null;
/*     */     }
/*     */     
/*     */     try {
/* 175 */       int j = e(☃, i);
/* 176 */       if (j == 0) {
/* 177 */         return null;
/*     */       }
/*     */       
/* 180 */       int k = j >> 8;
/* 181 */       int m = j & 0xFF;
/*     */       
/* 183 */       if (k + m > this.f.size()) {
/* 184 */         return null;
/*     */       }
/*     */       
/* 187 */       this.c.seek((k * 4096));
/* 188 */       int n = this.c.readInt();
/*     */       
/* 190 */       if (n > 4096 * m)
/* 191 */         return null; 
/* 192 */       if (n <= 0) {
/* 193 */         return null;
/*     */       }
/*     */       
/* 196 */       byte b = this.c.readByte();
/* 197 */       if (b == 1) {
/* 198 */         byte[] arrayOfByte = new byte[n - 1];
/* 199 */         this.c.read(arrayOfByte);
/* 200 */         return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrayOfByte))));
/* 201 */       }  if (b == 2) {
/* 202 */         byte[] arrayOfByte = new byte[n - 1];
/* 203 */         this.c.read(arrayOfByte);
/* 204 */         return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrayOfByte))));
/*     */       } 
/*     */       
/* 207 */       return null;
/* 208 */     } catch (IOException iOException) {
/* 209 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public DataOutputStream b(int ☃, int i) {
/* 214 */     if (d(☃, i)) {
/* 215 */       return null;
/*     */     }
/*     */     
/* 218 */     return new DataOutputStream(new DeflaterOutputStream(new a(this, ☃, i)));
/*     */   }
/*     */ 
/*     */   
/*     */   class a
/*     */     extends ByteArrayOutputStream
/*     */   {
/*     */     private int b;
/*     */     private int c;
/*     */     
/*     */     public a(anh this$0, int ☃, int i) {
/* 229 */       super(8096);
/* 230 */       this.b = ☃;
/* 231 */       this.c = i;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/* 236 */       this.a.a(this.b, this.c, this.buf, this.count);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected synchronized void a(int ☃, int i, byte[] arrayOfByte, int j) {
/*     */     try {
/* 243 */       int k = e(☃, i);
/* 244 */       int m = k >> 8;
/* 245 */       int n = k & 0xFF;
/* 246 */       int i1 = (j + 5) / 4096 + 1;
/*     */ 
/*     */       
/* 249 */       if (i1 >= 256) {
/*     */         return;
/*     */       }
/*     */       
/* 253 */       if (m != 0 && n == i1) {
/*     */         
/* 255 */         a(m, arrayOfByte, j);
/*     */       } else {
/*     */         int i2;
/*     */ 
/*     */         
/* 260 */         for (i2 = 0; i2 < n; i2++) {
/* 261 */           this.f.set(m + i2, Boolean.valueOf(true));
/*     */         }
/*     */ 
/*     */         
/* 265 */         i2 = this.f.indexOf(Boolean.valueOf(true));
/* 266 */         int i3 = 0;
/* 267 */         if (i2 != -1) {
/* 268 */           for (int i4 = i2; i4 < this.f.size(); i4++) {
/* 269 */             if (i3 != 0) {
/* 270 */               if (((Boolean)this.f.get(i4)).booleanValue()) {
/* 271 */                 i3++;
/*     */               } else {
/* 273 */                 i3 = 0;
/*     */               } 
/* 275 */             } else if (((Boolean)this.f.get(i4)).booleanValue()) {
/* 276 */               i2 = i4;
/* 277 */               i3 = 1;
/*     */             } 
/* 279 */             if (i3 >= i1) {
/*     */               break;
/*     */             }
/*     */           } 
/*     */         }
/*     */         
/* 285 */         if (i3 >= i1) {
/*     */           
/* 287 */           m = i2;
/* 288 */           a(☃, i, m << 8 | i1);
/* 289 */           for (int i4 = 0; i4 < i1; i4++) {
/* 290 */             this.f.set(m + i4, Boolean.valueOf(false));
/*     */           }
/* 292 */           a(m, arrayOfByte, j);
/*     */         } else {
/*     */           
/* 295 */           this.c.seek(this.c.length());
/* 296 */           m = this.f.size();
/* 297 */           for (int i4 = 0; i4 < i1; i4++) {
/* 298 */             this.c.write(a);
/* 299 */             this.f.add(Boolean.valueOf(false));
/*     */           } 
/* 301 */           this.g += 4096 * i1;
/*     */           
/* 303 */           a(m, arrayOfByte, j);
/* 304 */           a(☃, i, m << 8 | i1);
/*     */         } 
/*     */       } 
/* 307 */       b(☃, i, (int)(MinecraftServer.az() / 1000L));
/* 308 */     } catch (IOException iOException) {
/* 309 */       iOException.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(int ☃, byte[] arrayOfByte, int i) throws IOException {
/* 315 */     this.c.seek((☃ * 4096));
/* 316 */     this.c.writeInt(i + 1);
/* 317 */     this.c.writeByte(2);
/* 318 */     this.c.write(arrayOfByte, 0, i);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean d(int ☃, int i) {
/* 323 */     return (☃ < 0 || ☃ >= 32 || i < 0 || i >= 32);
/*     */   }
/*     */   
/*     */   private int e(int ☃, int i) {
/* 327 */     return this.d[☃ + i * 32];
/*     */   }
/*     */   
/*     */   public boolean c(int ☃, int i) {
/* 331 */     return (e(☃, i) != 0);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) throws IOException {
/* 335 */     this.d[☃ + i * 32] = j;
/* 336 */     this.c.seek(((☃ + i * 32) * 4));
/* 337 */     this.c.writeInt(j);
/*     */   }
/*     */   
/*     */   private void b(int ☃, int i, int j) throws IOException {
/* 341 */     this.e[☃ + i * 32] = j;
/* 342 */     this.c.seek((4096 + (☃ + i * 32) * 4));
/* 343 */     this.c.writeInt(j);
/*     */   }
/*     */   
/*     */   public void c() throws IOException {
/* 347 */     if (this.c != null)
/* 348 */       this.c.close(); 
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/anh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */