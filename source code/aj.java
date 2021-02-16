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
/*     */ public class aj
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  23 */     return "give";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  28 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  33 */     return "commands.give.usage";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*  38 */     if (arrayOfString.length < 2) {
/*  39 */       throw new cf("commands.give.usage", new Object[0]);
/*     */     }
/*     */     
/*  42 */     wn wn = a(☃, arrayOfString[0]);
/*  43 */     zw zw = f(☃, arrayOfString[1]);
/*  44 */     int j = (arrayOfString.length >= 3) ? a(arrayOfString[2], 1, 64) : 1;
/*  45 */     int k = (arrayOfString.length >= 4) ? a(arrayOfString[3]) : 0;
/*  46 */     zx zx = new zx(zw, j, k);
/*     */     
/*  48 */     if (arrayOfString.length >= 5) {
/*  49 */       String str = a(☃, arrayOfString, 4).c();
/*     */       try {
/*  51 */         zx.d(ed.a(str));
/*  52 */       } catch (ec ec) {
/*  53 */         throw new bz("commands.give.tagError", new Object[] { ec.getMessage() });
/*     */       } 
/*     */     } 
/*     */     
/*  57 */     boolean bool = wn.bi.a(zx);
/*  58 */     if (bool) {
/*  59 */       wn.o.a(wn, "random.pop", 0.2F, ((wn.bc().nextFloat() - wn.bc().nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*  60 */       wn.bj.b();
/*     */     } 
/*  62 */     if (!bool || zx.b > 0) {
/*  63 */       ☃.a(n.a.d, j - zx.b);
/*  64 */       uz uz = wn.a(zx, false);
/*  65 */       if (uz != null) {
/*  66 */         uz.q();
/*  67 */         uz.b(wn.e_());
/*     */       } 
/*     */     } else {
/*  70 */       zx.b = 1;
/*  71 */       ☃.a(n.a.d, j);
/*  72 */       uz uz = wn.a(zx, false);
/*  73 */       if (uz != null) {
/*  74 */         uz.v();
/*     */       }
/*     */     } 
/*     */     
/*  78 */     a(☃, this, "commands.give.success", new Object[] { zx.C(), Integer.valueOf(j), wn.e_() });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/*  84 */     if (arrayOfString.length == 1) {
/*  85 */       return a(arrayOfString, d());
/*     */     }
/*  87 */     if (arrayOfString.length == 2) {
/*  88 */       return a(arrayOfString, zw.e.c());
/*     */     }
/*     */     
/*  91 */     return null;
/*     */   }
/*     */   
/*     */   protected String[] d() {
/*  95 */     return MinecraftServer.N().K();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String[] ☃, int j) {
/* 100 */     return (j == 0);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */