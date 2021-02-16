/*     */ import java.util.List;
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
/*     */ public class ad
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  25 */     return "execute";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  30 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  35 */     return "commands.execute.usage";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*  40 */     if (arrayOfString.length < 5) {
/*  41 */       throw new cf("commands.execute.usage", new Object[0]);
/*     */     }
/*     */     
/*  44 */     pk pk = a(☃, arrayOfString[0], pk.class);
/*  45 */     double d1 = b(pk.s, arrayOfString[1], false);
/*  46 */     double d2 = b(pk.t, arrayOfString[2], false);
/*  47 */     double d3 = b(pk.u, arrayOfString[3], false);
/*  48 */     cj cj = new cj(d1, d2, d3);
/*     */     
/*  50 */     int j = 4;
/*  51 */     if ("detect".equals(arrayOfString[4]) && arrayOfString.length > 10) {
/*  52 */       adm adm = pk.e();
/*  53 */       double d4 = b(d1, arrayOfString[5], false);
/*  54 */       double d5 = b(d2, arrayOfString[6], false);
/*  55 */       double d6 = b(d3, arrayOfString[7], false);
/*  56 */       afh afh = g(☃, arrayOfString[8]);
/*  57 */       int k = a(arrayOfString[9], -1, 15);
/*  58 */       cj cj1 = new cj(d4, d5, d6);
/*  59 */       alz alz = adm.p(cj1);
/*  60 */       if (alz.c() != afh || (k >= 0 && alz.c().c(alz) != k)) {
/*  61 */         throw new bz("commands.execute.failed", new Object[] { "detect", pk.e_() });
/*     */       }
/*  63 */       j = 10;
/*     */     } 
/*     */     
/*  66 */     String str = a(arrayOfString, j);
/*  67 */     m m1 = ☃;
/*  68 */     m m2 = new m(this, pk, m1, cj, d1, d2, d3)
/*     */       {
/*     */         public String e_() {
/*  71 */           return this.a.e_();
/*     */         }
/*     */ 
/*     */         
/*     */         public eu f_() {
/*  76 */           return this.a.f_();
/*     */         }
/*     */ 
/*     */         
/*     */         public void a(eu ☃) {
/*  81 */           this.b.a(☃);
/*     */         }
/*     */ 
/*     */         
/*     */         public boolean a(int ☃, String str) {
/*  86 */           return this.b.a(☃, str);
/*     */         }
/*     */ 
/*     */         
/*     */         public cj c() {
/*  91 */           return this.c;
/*     */         }
/*     */ 
/*     */         
/*     */         public aui d() {
/*  96 */           return new aui(this.d, this.e, this.f);
/*     */         }
/*     */ 
/*     */         
/*     */         public adm e() {
/* 101 */           return this.a.o;
/*     */         }
/*     */ 
/*     */         
/*     */         public pk f() {
/* 106 */           return this.a;
/*     */         }
/*     */ 
/*     */         
/*     */         public boolean u_() {
/* 111 */           MinecraftServer ☃ = MinecraftServer.N();
/* 112 */           return (☃ == null || ☃.d[0].Q().b("commandBlockOutput"));
/*     */         }
/*     */ 
/*     */         
/*     */         public void a(n.a ☃, int i) {
/* 117 */           this.a.a(☃, i);
/*     */         }
/*     */       };
/*     */     
/* 121 */     l l = MinecraftServer.N().P();
/*     */     try {
/* 123 */       int k = l.a(m2, str);
/* 124 */       if (k < 1) {
/* 125 */         throw new bz("commands.execute.allInvocationsFailed", new Object[] { str });
/*     */       }
/* 127 */     } catch (Throwable throwable) {
/* 128 */       throw new bz("commands.execute.failed", new Object[] { str, pk.e_() });
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 135 */     if (arrayOfString.length == 1)
/* 136 */       return a(arrayOfString, MinecraftServer.N().K()); 
/* 137 */     if (arrayOfString.length > 1 && arrayOfString.length <= 4)
/* 138 */       return a(arrayOfString, 1, cj1); 
/* 139 */     if (arrayOfString.length > 5 && arrayOfString.length <= 8 && "detect".equals(arrayOfString[4]))
/* 140 */       return a(arrayOfString, 5, cj1); 
/* 141 */     if (arrayOfString.length == 9 && "detect".equals(arrayOfString[4])) {
/* 142 */       return a(arrayOfString, afh.c.c());
/*     */     }
/*     */     
/* 145 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String[] ☃, int j) {
/* 150 */     return (j == 0);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */