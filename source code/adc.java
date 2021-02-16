/*     */ import io.netty.buffer.ByteBuf;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.concurrent.Callable;
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
/*     */ public abstract class adc
/*     */   implements m
/*     */ {
/*  23 */   private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
/*     */ 
/*     */   
/*     */   private int b;
/*     */   
/*     */   private boolean c = true;
/*     */   
/*  30 */   private eu d = null;
/*  31 */   private String e = "";
/*  32 */   private String f = "@";
/*  33 */   private final n g = new n();
/*     */   
/*     */   public int j() {
/*  36 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public eu k() {
/*  44 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(dn ☃) {
/*  48 */     ☃.a("Command", this.e);
/*  49 */     ☃.a("SuccessCount", this.b);
/*  50 */     ☃.a("CustomName", this.f);
/*  51 */     ☃.a("TrackOutput", this.c);
/*  52 */     if (this.d != null && this.c) {
/*  53 */       ☃.a("LastOutput", eu.a.a(this.d));
/*     */     }
/*  55 */     this.g.b(☃);
/*     */   }
/*     */   
/*     */   public void b(dn ☃) {
/*  59 */     this.e = ☃.j("Command");
/*  60 */     this.b = ☃.f("SuccessCount");
/*  61 */     if (☃.b("CustomName", 8)) {
/*  62 */       this.f = ☃.j("CustomName");
/*     */     }
/*  64 */     if (☃.b("TrackOutput", 1)) {
/*  65 */       this.c = ☃.n("TrackOutput");
/*     */     }
/*  67 */     if (☃.b("LastOutput", 8) && this.c) {
/*  68 */       this.d = eu.a.a(☃.j("LastOutput"));
/*     */     }
/*  70 */     this.g.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, String str) {
/*  75 */     return (☃ <= 2);
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  79 */     this.e = ☃;
/*  80 */     this.b = 0;
/*     */   }
/*     */   
/*     */   public String l() {
/*  84 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(adm ☃) {
/*  88 */     if (☃.D) {
/*  89 */       this.b = 0;
/*     */     }
/*     */     
/*  92 */     MinecraftServer minecraftServer = MinecraftServer.N();
/*  93 */     if (minecraftServer != null && minecraftServer.O() && minecraftServer.al()) {
/*  94 */       l l = minecraftServer.P();
/*     */       try {
/*  96 */         this.d = null;
/*  97 */         this.b = l.a(this, this.e);
/*  98 */       } catch (Throwable throwable) {
/*  99 */         b b = b.a(throwable, "Executing command block");
/* 100 */         c c = b.a("Command to be executed");
/*     */         
/* 102 */         c.a("Command", new Callable<String>(this)
/*     */             {
/*     */               public String a() throws Exception {
/* 105 */                 return this.a.l();
/*     */               }
/*     */             });
/*     */         
/* 109 */         c.a("Name", new Callable<String>(this)
/*     */             {
/*     */               public String a() throws Exception {
/* 112 */                 return this.a.e_();
/*     */               }
/*     */             });
/*     */         
/* 116 */         throw new e(b);
/*     */       } 
/*     */     } else {
/* 119 */       this.b = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String e_() {
/* 125 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public eu f_() {
/* 130 */     return new fa(e_());
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/* 134 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(eu ☃) {
/* 139 */     if (this.c && e() != null && !(e()).D) {
/* 140 */       this.d = (new fa("[" + a.format(new Date()) + "] ")).a(☃);
/* 141 */       h();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean u_() {
/* 147 */     MinecraftServer ☃ = MinecraftServer.N();
/* 148 */     return (☃ == null || !☃.O() || ☃.d[0].Q().b("commandBlockOutput"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(n.a ☃, int i) {
/* 153 */     this.g.a(this, ☃, i);
/*     */   }
/*     */   
/*     */   public abstract void h();
/*     */   
/*     */   public abstract int i();
/*     */   
/*     */   public abstract void a(ByteBuf paramByteBuf);
/*     */   
/*     */   public void b(eu ☃) {
/* 163 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 167 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 171 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean a(wn ☃) {
/* 175 */     if (!☃.bA.d) {
/* 176 */       return false;
/*     */     }
/* 178 */     if ((☃.e()).D) {
/* 179 */       ☃.a(this);
/*     */     }
/* 181 */     return true;
/*     */   }
/*     */   
/*     */   public n n() {
/* 185 */     return this.g;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */