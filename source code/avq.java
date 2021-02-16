/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Iterator;
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
/*     */ public class avq
/*     */ {
/*  21 */   private static final jy a = new jy("textures/map/map_icons.png");
/*     */   
/*     */   private final bmj b;
/*     */   
/*  25 */   private final Map<String, a> c = Maps.newHashMap();
/*     */   
/*     */   public avq(bmj ☃) {
/*  28 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(atg ☃) {
/*  32 */     a.a(b(☃));
/*     */   }
/*     */   
/*     */   public void a(atg ☃, boolean bool) {
/*  36 */     a.a(b(☃), bool);
/*     */   }
/*     */   
/*     */   private a b(atg ☃) {
/*  40 */     a a = this.c.get(☃.a);
/*     */     
/*  42 */     if (a == null) {
/*  43 */       a = new a(☃);
/*  44 */       this.c.put(☃.a, a);
/*     */     } 
/*  46 */     return a;
/*     */   }
/*     */   
/*     */   public void a() {
/*  50 */     for (Iterator<a> ☃ = this.c.values().iterator(); ☃.hasNext(); ) { a a = ☃.next();
/*  51 */       this.b.c(a.b(a)); }
/*     */ 
/*     */     
/*  54 */     this.c.clear();
/*     */   }
/*     */   
/*     */   class a {
/*     */     private final atg b;
/*     */     private final blz c;
/*     */     private final jy d;
/*     */     private final int[] e;
/*     */     
/*     */     private a(avq this$0, atg ☃) {
/*  64 */       this.b = ☃;
/*  65 */       this.c = new blz(128, 128);
/*  66 */       this.e = this.c.e();
/*  67 */       this.d = avq.a(avq.this).a("map/" + ☃.a, this.c);
/*     */ 
/*     */       
/*  70 */       for (int i = 0; i < this.e.length; i++) {
/*  71 */         this.e[i] = 0;
/*     */       }
/*     */     }
/*     */     
/*     */     private void a() {
/*  76 */       for (int ☃ = 0; ☃ < 16384; ☃++) {
/*  77 */         int i = this.b.f[☃] & 0xFF;
/*  78 */         if (i / 4 == 0) {
/*  79 */           this.e[☃] = (☃ + ☃ / 128 & 0x1) * 8 + 16 << 24;
/*     */         } else {
/*  81 */           this.e[☃] = arn.a[i / 4].a(i & 0x3);
/*     */         } 
/*     */       } 
/*     */       
/*  85 */       this.c.d();
/*     */     }
/*     */     
/*     */     private void a(boolean ☃) {
/*  89 */       int i = 0;
/*  90 */       int j = 0;
/*  91 */       bfx bfx = bfx.a();
/*  92 */       bfd bfd = bfx.c();
/*     */       
/*  94 */       float f = 0.0F;
/*     */       
/*  96 */       avq.a(this.a).a(this.d);
/*  97 */       bfl.l();
/*  98 */       bfl.a(1, 771, 0, 1);
/*  99 */       bfl.c();
/* 100 */       bfd.a(7, bms.g);
/* 101 */       bfd.b(((i + 0) + f), ((j + 128) - f), -0.009999999776482582D).a(0.0D, 1.0D).d();
/* 102 */       bfd.b(((i + 128) - f), ((j + 128) - f), -0.009999999776482582D).a(1.0D, 1.0D).d();
/* 103 */       bfd.b(((i + 128) - f), ((j + 0) + f), -0.009999999776482582D).a(1.0D, 0.0D).d();
/* 104 */       bfd.b(((i + 0) + f), ((j + 0) + f), -0.009999999776482582D).a(0.0D, 0.0D).d();
/* 105 */       bfx.b();
/* 106 */       bfl.d();
/* 107 */       bfl.k();
/*     */       
/* 109 */       avq.a(this.a).a(avq.b());
/* 110 */       int k = 0;
/* 111 */       for (Iterator<atf> iterator = this.b.h.values().iterator(); iterator.hasNext(); ) { atf atf = iterator.next();
/* 112 */         if (☃ && atf.a() != 1) {
/*     */           continue;
/*     */         }
/* 115 */         bfl.E();
/* 116 */         bfl.b(i + atf.b() / 2.0F + 64.0F, j + atf.c() / 2.0F + 64.0F, -0.02F);
/* 117 */         bfl.b((atf.d() * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
/* 118 */         bfl.a(4.0F, 4.0F, 3.0F);
/* 119 */         bfl.b(-0.125F, 0.125F, 0.0F);
/*     */         
/* 121 */         byte b = atf.a();
/* 122 */         float f1 = (b % 4 + 0) / 4.0F;
/* 123 */         float f2 = (b / 4 + 0) / 4.0F;
/* 124 */         float f3 = (b % 4 + 1) / 4.0F;
/* 125 */         float f4 = (b / 4 + 1) / 4.0F;
/*     */         
/* 127 */         bfd.a(7, bms.g);
/* 128 */         float f5 = -0.001F;
/* 129 */         bfd.b(-1.0D, 1.0D, (k * -0.001F)).a(f1, f2).d();
/* 130 */         bfd.b(1.0D, 1.0D, (k * -0.001F)).a(f3, f2).d();
/* 131 */         bfd.b(1.0D, -1.0D, (k * -0.001F)).a(f3, f4).d();
/* 132 */         bfd.b(-1.0D, -1.0D, (k * -0.001F)).a(f1, f4).d();
/* 133 */         bfx.b();
/* 134 */         bfl.F();
/* 135 */         k++; }
/*     */ 
/*     */       
/* 138 */       bfl.E();
/* 139 */       bfl.b(0.0F, 0.0F, -0.04F);
/* 140 */       bfl.a(1.0F, 1.0F, 1.0F);
/* 141 */       bfl.F();
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/avq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */