/*     */ import com.google.gson.JsonParseException;
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
/*     */ public class aln
/*     */   extends akw
/*     */ {
/*  20 */   public final eu[] a = new eu[] { new fa(""), new fa(""), new fa(""), new fa("") };
/*     */ 
/*     */   
/*  23 */   public int f = -1;
/*     */   private boolean g = true;
/*     */   private wn h;
/*  26 */   private final n i = new n();
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/*  30 */     super.b(☃);
/*  31 */     for (int i = 0; i < 4; i++) {
/*  32 */       String str = eu.a.a(this.a[i]);
/*  33 */       ☃.a("Text" + (i + 1), str);
/*     */     } 
/*  35 */     this.i.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/*  40 */     this.g = false;
/*  41 */     super.a(☃);
/*     */     
/*  43 */     m m = new m(this)
/*     */       {
/*     */         public String e_() {
/*  46 */           return "Sign";
/*     */         }
/*     */ 
/*     */         
/*     */         public eu f_() {
/*  51 */           return new fa(e_());
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         public void a(eu ☃) {}
/*     */ 
/*     */         
/*     */         public boolean a(int ☃, String str) {
/*  60 */           return true;
/*     */         }
/*     */ 
/*     */         
/*     */         public cj c() {
/*  65 */           return this.a.c;
/*     */         }
/*     */ 
/*     */         
/*     */         public aui d() {
/*  70 */           return new aui(this.a.c.n() + 0.5D, this.a.c.o() + 0.5D, this.a.c.p() + 0.5D);
/*     */         }
/*     */ 
/*     */         
/*     */         public adm e() {
/*  75 */           return this.a.b;
/*     */         }
/*     */ 
/*     */         
/*     */         public pk f() {
/*  80 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public boolean u_() {
/*  85 */           return false;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public void a(n.a ☃, int i) {}
/*     */       };
/*  93 */     for (int i = 0; i < 4; i++) {
/*  94 */       String str = ☃.j("Text" + (i + 1));
/*     */       try {
/*  96 */         eu eu1 = eu.a.a(str);
/*     */         try {
/*  98 */           this.a[i] = ev.a(m, eu1, null);
/*  99 */         } catch (bz bz) {
/* 100 */           this.a[i] = eu1;
/*     */         } 
/* 102 */       } catch (JsonParseException jsonParseException) {
/* 103 */         this.a[i] = new fa(str);
/*     */       } 
/*     */     } 
/* 106 */     this.i.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ff y_() {
/* 111 */     eu[] ☃ = new eu[4];
/* 112 */     System.arraycopy(this.a, 0, ☃, 0, 4);
/* 113 */     return new hw(this.b, this.c, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean F() {
/* 118 */     return true;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 122 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 126 */     this.g = ☃;
/* 127 */     if (!☃) {
/* 128 */       this.h = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(wn ☃) {
/* 133 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public wn c() {
/* 137 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean b(wn ☃) {
/* 141 */     m m = new m(this, ☃)
/*     */       {
/*     */         public String e_() {
/* 144 */           return this.a.e_();
/*     */         }
/*     */ 
/*     */         
/*     */         public eu f_() {
/* 149 */           return this.a.f_();
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         public void a(eu ☃) {}
/*     */ 
/*     */         
/*     */         public boolean a(int ☃, String str) {
/* 158 */           return (☃ <= 2);
/*     */         }
/*     */ 
/*     */         
/*     */         public cj c() {
/* 163 */           return this.b.c;
/*     */         }
/*     */ 
/*     */         
/*     */         public aui d() {
/* 168 */           return new aui(this.b.c.n() + 0.5D, this.b.c.o() + 0.5D, this.b.c.p() + 0.5D);
/*     */         }
/*     */ 
/*     */         
/*     */         public adm e() {
/* 173 */           return this.a.e();
/*     */         }
/*     */ 
/*     */         
/*     */         public pk f() {
/* 178 */           return this.a;
/*     */         }
/*     */ 
/*     */         
/*     */         public boolean u_() {
/* 183 */           return false;
/*     */         }
/*     */ 
/*     */         
/*     */         public void a(n.a ☃, int i) {
/* 188 */           aln.a(this.b).a(this, ☃, i);
/*     */         }
/*     */       };
/*     */     
/* 192 */     for (int i = 0; i < this.a.length; i++) {
/* 193 */       ez ez = (this.a[i] == null) ? null : this.a[i].b();
/* 194 */       if (ez != null && ez.h() != null) {
/*     */ 
/*     */ 
/*     */         
/* 198 */         et et = ez.h();
/* 199 */         if (et.a() == et.a.c)
/* 200 */           MinecraftServer.N().P().a(m, et.b()); 
/*     */       } 
/*     */     } 
/* 203 */     return true;
/*     */   }
/*     */   
/*     */   public n d() {
/* 207 */     return this.i;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */