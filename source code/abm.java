/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class abm
/*     */   implements abs
/*     */ {
/*     */   private zx a;
/*     */   
/*     */   public boolean a(xp ☃, adm adm1) {
/*  22 */     this.a = null;
/*     */     
/*  24 */     int i = 0;
/*  25 */     int j = 0;
/*  26 */     int k = 0;
/*  27 */     int m = 0;
/*  28 */     int n = 0;
/*  29 */     int i1 = 0;
/*     */     
/*  31 */     for (int i2 = 0; i2 < ☃.o_(); i2++) {
/*  32 */       zx zx1 = ☃.a(i2);
/*  33 */       if (zx1 != null)
/*     */       {
/*     */ 
/*     */         
/*  37 */         if (zx1.b() == zy.H) {
/*  38 */           j++;
/*  39 */         } else if (zx1.b() == zy.cc) {
/*  40 */           m++;
/*  41 */         } else if (zx1.b() == zy.aW) {
/*  42 */           k++;
/*  43 */         } else if (zx1.b() == zy.aK) {
/*  44 */           i++;
/*  45 */         } else if (zx1.b() == zy.aT) {
/*     */           
/*  47 */           n++;
/*  48 */         } else if (zx1.b() == zy.i) {
/*     */           
/*  50 */           n++;
/*  51 */         } else if (zx1.b() == zy.bL) {
/*     */           
/*  53 */           i1++;
/*  54 */         } else if (zx1.b() == zy.G) {
/*     */           
/*  56 */           i1++;
/*  57 */         } else if (zx1.b() == zy.bx) {
/*     */           
/*  59 */           i1++;
/*  60 */         } else if (zx1.b() == zy.bX) {
/*     */           
/*  62 */           i1++;
/*     */         } else {
/*  64 */           return false;
/*     */         }  } 
/*     */     } 
/*  67 */     n += k + i1;
/*     */     
/*  69 */     if (j > 3 || i > 1) {
/*  70 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  74 */     if (j >= 1 && i == 1 && n == 0) {
/*  75 */       this.a = new zx(zy.cb);
/*  76 */       if (m > 0) {
/*  77 */         dn dn1 = new dn();
/*  78 */         dn dn2 = new dn();
/*  79 */         du du = new du();
/*     */         
/*  81 */         for (int i3 = 0; i3 < ☃.o_(); i3++) {
/*  82 */           zx zx1 = ☃.a(i3);
/*  83 */           if (zx1 != null && zx1.b() == zy.cc)
/*     */           {
/*     */ 
/*     */             
/*  87 */             if (zx1.n() && zx1.o().b("Explosion", 10)) {
/*  88 */               du.a(zx1.o().m("Explosion"));
/*     */             }
/*     */           }
/*     */         } 
/*  92 */         dn2.a("Explosions", du);
/*  93 */         dn2.a("Flight", (byte)j);
/*  94 */         dn1.a("Fireworks", dn2);
/*  95 */         this.a.d(dn1);
/*     */       } 
/*  97 */       return true;
/*     */     } 
/*     */     
/* 100 */     if (j == 1 && i == 0 && m == 0 && k > 0 && i1 <= 1) {
/* 101 */       this.a = new zx(zy.cc);
/* 102 */       dn dn1 = new dn();
/* 103 */       dn dn2 = new dn();
/*     */       
/* 105 */       byte b = 0;
/*     */       
/* 107 */       List<Integer> list = Lists.newArrayList();
/* 108 */       for (int i3 = 0; i3 < ☃.o_(); i3++) {
/* 109 */         zx zx1 = ☃.a(i3);
/* 110 */         if (zx1 != null)
/*     */         {
/*     */ 
/*     */           
/* 114 */           if (zx1.b() == zy.aW) {
/* 115 */             list.add(Integer.valueOf(ze.a[zx1.i() & 0xF]));
/* 116 */           } else if (zx1.b() == zy.aT) {
/*     */             
/* 118 */             dn2.a("Flicker", true);
/* 119 */           } else if (zx1.b() == zy.i) {
/*     */             
/* 121 */             dn2.a("Trail", true);
/* 122 */           } else if (zx1.b() == zy.bL) {
/* 123 */             b = 1;
/* 124 */           } else if (zx1.b() == zy.G) {
/* 125 */             b = 4;
/* 126 */           } else if (zx1.b() == zy.bx) {
/* 127 */             b = 2;
/* 128 */           } else if (zx1.b() == zy.bX) {
/* 129 */             b = 3;
/*     */           }  } 
/*     */       } 
/* 132 */       int[] arrayOfInt = new int[list.size()];
/* 133 */       for (int i4 = 0; i4 < arrayOfInt.length; i4++) {
/* 134 */         arrayOfInt[i4] = ((Integer)list.get(i4)).intValue();
/*     */       }
/* 136 */       dn2.a("Colors", arrayOfInt);
/* 137 */       dn2.a("Type", b);
/* 138 */       dn1.a("Explosion", dn2);
/* 139 */       this.a.d(dn1);
/* 140 */       return true;
/*     */     } 
/*     */     
/* 143 */     if (j == 0 && i == 0 && m == 1 && k > 0 && k == n) {
/* 144 */       List<Integer> list = Lists.newArrayList();
/* 145 */       for (int i3 = 0; i3 < ☃.o_(); i3++) {
/* 146 */         zx zx1 = ☃.a(i3);
/* 147 */         if (zx1 != null)
/*     */         {
/*     */ 
/*     */           
/* 151 */           if (zx1.b() == zy.aW) {
/* 152 */             list.add(Integer.valueOf(ze.a[zx1.i() & 0xF]));
/* 153 */           } else if (zx1.b() == zy.cc) {
/* 154 */             this.a = zx1.k();
/* 155 */             this.a.b = 1;
/*     */           }  } 
/*     */       } 
/* 158 */       int[] arrayOfInt = new int[list.size()];
/* 159 */       for (int i4 = 0; i4 < arrayOfInt.length; i4++) {
/* 160 */         arrayOfInt[i4] = ((Integer)list.get(i4)).intValue();
/*     */       }
/* 162 */       if (this.a != null && this.a.n()) {
/* 163 */         dn dn = this.a.o().m("Explosion");
/* 164 */         if (dn == null) {
/* 165 */           return false;
/*     */         }
/* 167 */         dn.a("FadeColors", arrayOfInt);
/*     */       } else {
/* 169 */         return false;
/*     */       } 
/* 171 */       return true;
/*     */     } 
/*     */     
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx a(xp ☃) {
/* 180 */     return this.a.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/* 185 */     return 10;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public zx b() {
/* 191 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public zx[] b(xp ☃) {
/* 196 */     zx[] arrayOfZx = new zx[☃.o_()];
/*     */     
/* 198 */     for (int i = 0; i < arrayOfZx.length; i++) {
/* 199 */       zx zx1 = ☃.a(i);
/* 200 */       if (zx1 != null && zx1.b().r()) {
/* 201 */         arrayOfZx[i] = new zx(zx1.b().q());
/*     */       }
/*     */     } 
/*     */     
/* 205 */     return arrayOfZx;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */