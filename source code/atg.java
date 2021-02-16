/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class atg
/*     */   extends ate
/*     */ {
/*     */   public int b;
/*     */   public int c;
/*     */   public byte d;
/*     */   public byte e;
/*     */   
/*     */   public class a
/*     */   {
/*     */     public final wn a;
/*     */     private boolean d = true;
/*  33 */     private int e = 0;
/*  34 */     private int f = 0;
/*  35 */     private int g = 127;
/*  36 */     private int h = 127;
/*     */     private int i;
/*     */     public int b;
/*     */     
/*     */     public a(atg this$0, wn ☃) {
/*  41 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public ff a(zx ☃) {
/*  45 */       if (this.d) {
/*  46 */         this.d = false;
/*  47 */         return new gu(☃.i(), this.c.e, this.c.h.values(), this.c.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/*  48 */       }  if (this.i++ % 5 == 0) {
/*  49 */         return new gu(☃.i(), this.c.e, this.c.h.values(), this.c.f, 0, 0, 0, 0);
/*     */       }
/*     */       
/*  52 */       return null;
/*     */     }
/*     */     
/*     */     public void a(int ☃, int i) {
/*  56 */       if (this.d) {
/*  57 */         this.e = Math.min(this.e, ☃);
/*  58 */         this.f = Math.min(this.f, i);
/*  59 */         this.g = Math.max(this.g, ☃);
/*  60 */         this.h = Math.max(this.h, i);
/*     */       } else {
/*  62 */         this.d = true;
/*  63 */         this.e = ☃;
/*  64 */         this.f = i;
/*  65 */         this.g = ☃;
/*  66 */         this.h = i;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   public byte[] f = new byte[16384];
/*  75 */   public List<a> g = Lists.newArrayList();
/*  76 */   private Map<wn, a> i = Maps.newHashMap();
/*  77 */   public Map<String, atf> h = Maps.newLinkedHashMap();
/*     */   
/*     */   public atg(String ☃) {
/*  80 */     super(☃);
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, int i) {
/*  84 */     int j = 128 * (1 << i);
/*     */     
/*  86 */     int k = ns.c((☃ + 64.0D) / j);
/*  87 */     int m = ns.c((d1 + 64.0D) / j);
/*     */     
/*  89 */     this.b = k * j + j / 2 - 64;
/*  90 */     this.c = m * j + j / 2 - 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/*  95 */     this.d = ☃.d("dimension");
/*  96 */     this.b = ☃.f("xCenter");
/*  97 */     this.c = ☃.f("zCenter");
/*  98 */     this.e = ☃.d("scale");
/*  99 */     this.e = (byte)ns.a(this.e, 0, 4);
/*     */     
/* 101 */     int i = ☃.e("width");
/* 102 */     int j = ☃.e("height");
/* 103 */     if (i == 128 && j == 128) {
/* 104 */       this.f = ☃.k("colors");
/*     */     } else {
/* 106 */       byte[] arrayOfByte = ☃.k("colors");
/* 107 */       this.f = new byte[16384];
/* 108 */       int k = (128 - i) / 2;
/* 109 */       int m = (128 - j) / 2;
/* 110 */       for (int n = 0; n < j; n++) {
/* 111 */         int i1 = n + m;
/* 112 */         if (i1 >= 0 || i1 < 128)
/*     */         {
/*     */           
/* 115 */           for (int i2 = 0; i2 < i; i2++) {
/* 116 */             int i3 = i2 + k;
/* 117 */             if (i3 >= 0 || i3 < 128)
/*     */             {
/*     */               
/* 120 */               this.f[i3 + i1 * 128] = arrayOfByte[i2 + n * i]; } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(dn ☃) {
/* 128 */     ☃.a("dimension", this.d);
/* 129 */     ☃.a("xCenter", this.b);
/* 130 */     ☃.a("zCenter", this.c);
/* 131 */     ☃.a("scale", this.e);
/* 132 */     ☃.a("width", (short)128);
/* 133 */     ☃.a("height", (short)128);
/* 134 */     ☃.a("colors", this.f);
/*     */   }
/*     */   
/*     */   public void a(wn ☃, zx zx1) {
/* 138 */     if (!this.i.containsKey(☃)) {
/* 139 */       a a = new a(this, ☃);
/* 140 */       this.i.put(☃, a);
/* 141 */       this.g.add(a);
/*     */     } 
/*     */     
/* 144 */     if (!☃.bi.c(zx1)) {
/* 145 */       this.h.remove(☃.e_());
/*     */     }
/*     */     
/* 148 */     for (int i = 0; i < this.g.size(); i++) {
/* 149 */       a a = this.g.get(i);
/*     */       
/* 151 */       if (a.a.I || (!a.a.bi.c(zx1) && !zx1.y())) {
/* 152 */         this.i.remove(a.a);
/* 153 */         this.g.remove(a);
/* 154 */       } else if (!zx1.y() && a.a.am == this.d) {
/* 155 */         a(0, a.a.o, a.a.e_(), a.a.s, a.a.u, a.a.y);
/*     */       } 
/*     */     } 
/*     */     
/* 159 */     if (zx1.y()) {
/* 160 */       uo uo = zx1.z();
/* 161 */       cj cj = uo.n();
/* 162 */       a(1, ☃.o, "frame-" + uo.F(), cj.n(), cj.p(), (uo.b.b() * 90));
/*     */     } 
/*     */     
/* 165 */     if (zx1.n() && zx1.o().b("Decorations", 9)) {
/* 166 */       du du = zx1.o().c("Decorations", 10);
/* 167 */       for (int j = 0; j < du.c(); j++) {
/* 168 */         dn dn = du.b(j);
/* 169 */         if (!this.h.containsKey(dn.j("id")))
/* 170 */           a(dn.d("type"), ☃.o, dn.j("id"), dn.i("x"), dn.i("z"), dn.i("rot")); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, adm adm1, String str, double d1, double d2, double d3) {
/*     */     byte b3;
/* 177 */     int i = 1 << this.e;
/* 178 */     float f1 = (float)(d1 - this.b) / i;
/* 179 */     float f2 = (float)(d2 - this.c) / i;
/* 180 */     byte b1 = (byte)(int)((f1 * 2.0F) + 0.5D);
/* 181 */     byte b2 = (byte)(int)((f2 * 2.0F) + 0.5D);
/*     */     
/* 183 */     int j = 63;
/*     */     
/* 185 */     if (f1 >= -j && f2 >= -j && f1 <= j && f2 <= j) {
/* 186 */       d3 += (d3 < 0.0D) ? -8.0D : 8.0D;
/* 187 */       b3 = (byte)(int)(d3 * 16.0D / 360.0D);
/*     */       
/* 189 */       if (this.d < 0) {
/* 190 */         int k = (int)(adm1.P().g() / 10L);
/* 191 */         b3 = (byte)(k * k * 34187121 + k * 121 >> 15 & 0xF);
/*     */       } 
/* 193 */     } else if (Math.abs(f1) < 320.0F && Math.abs(f2) < 320.0F) {
/* 194 */       ☃ = 6;
/* 195 */       b3 = 0;
/* 196 */       if (f1 <= -j) {
/* 197 */         b1 = (byte)(int)((j * 2) + 2.5D);
/*     */       }
/* 199 */       if (f2 <= -j) {
/* 200 */         b2 = (byte)(int)((j * 2) + 2.5D);
/*     */       }
/* 202 */       if (f1 >= j) {
/* 203 */         b1 = (byte)(j * 2 + 1);
/*     */       }
/* 205 */       if (f2 >= j) {
/* 206 */         b2 = (byte)(j * 2 + 1);
/*     */       }
/*     */     } else {
/* 209 */       this.h.remove(str);
/*     */       
/*     */       return;
/*     */     } 
/* 213 */     this.h.put(str, new atf((byte)☃, b1, b2, b3));
/*     */   }
/*     */ 
/*     */   
/*     */   public ff a(zx ☃, adm adm1, wn wn1) {
/* 218 */     a a = this.i.get(wn1);
/*     */     
/* 220 */     if (a == null) {
/* 221 */       return null;
/*     */     }
/*     */     
/* 224 */     return a.a(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 228 */     c();
/* 229 */     for (Iterator<a> iterator = this.g.iterator(); iterator.hasNext(); ) { a a = iterator.next();
/* 230 */       a.a(☃, i); }
/*     */   
/*     */   }
/*     */   
/*     */   public a a(wn ☃) {
/* 235 */     a a = this.i.get(☃);
/*     */     
/* 237 */     if (a == null) {
/* 238 */       a = new a(this, ☃);
/* 239 */       this.i.put(☃, a);
/* 240 */       this.g.add(a);
/*     */     } 
/*     */     
/* 243 */     return a;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/atg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */