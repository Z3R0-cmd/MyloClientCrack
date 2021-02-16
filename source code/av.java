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
/*     */ public class av
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  19 */     return "playsound";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  24 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  29 */     return "commands.playsound.usage";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*  34 */     if (arrayOfString.length < 2) {
/*  35 */       throw new cf(c(☃), new Object[0]);
/*     */     }
/*     */     
/*  38 */     int j = 0;
/*  39 */     String str = arrayOfString[j++];
/*  40 */     lf lf = a(☃, arrayOfString[j++]);
/*     */     
/*  42 */     aui aui = ☃.d();
/*     */     
/*  44 */     double d1 = aui.a;
/*  45 */     if (arrayOfString.length > j) {
/*  46 */       d1 = b(d1, arrayOfString[j++], true);
/*     */     }
/*     */     
/*  49 */     double d2 = aui.b;
/*  50 */     if (arrayOfString.length > j) {
/*  51 */       d2 = b(d2, arrayOfString[j++], 0, 0, false);
/*     */     }
/*     */     
/*  54 */     double d3 = aui.c;
/*  55 */     if (arrayOfString.length > j) {
/*  56 */       d3 = b(d3, arrayOfString[j++], true);
/*     */     }
/*     */     
/*  59 */     double d4 = 1.0D;
/*  60 */     if (arrayOfString.length > j) {
/*  61 */       d4 = a(arrayOfString[j++], 0.0D, 3.4028234663852886E38D);
/*     */     }
/*     */     
/*  64 */     double d5 = 1.0D;
/*  65 */     if (arrayOfString.length > j) {
/*  66 */       d5 = a(arrayOfString[j++], 0.0D, 2.0D);
/*     */     }
/*     */     
/*  69 */     double d6 = 0.0D;
/*  70 */     if (arrayOfString.length > j) {
/*  71 */       d6 = a(arrayOfString[j], 0.0D, 1.0D);
/*     */     }
/*     */     
/*  74 */     double d7 = (d4 > 1.0D) ? (d4 * 16.0D) : 16.0D;
/*  75 */     double d8 = lf.f(d1, d2, d3);
/*     */     
/*  77 */     if (d8 > d7) {
/*  78 */       if (d6 <= 0.0D) {
/*  79 */         throw new bz("commands.playsound.playerTooFar", new Object[] { lf.e_() });
/*     */       }
/*     */       
/*  82 */       double d9 = d1 - lf.s;
/*  83 */       double d10 = d2 - lf.t;
/*  84 */       double d11 = d3 - lf.u;
/*  85 */       double d12 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
/*     */       
/*  87 */       if (d12 > 0.0D) {
/*  88 */         d1 = lf.s + d9 / d12 * 2.0D;
/*  89 */         d2 = lf.t + d10 / d12 * 2.0D;
/*  90 */         d3 = lf.u + d11 / d12 * 2.0D;
/*     */       } 
/*     */       
/*  93 */       d4 = d6;
/*     */     } 
/*     */     
/*  96 */     lf.a.a(new gs(str, d1, d2, d3, (float)d4, (float)d5));
/*  97 */     a(☃, this, "commands.playsound.success", new Object[] { str, lf.e_() });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 103 */     if (arrayOfString.length == 2)
/* 104 */       return a(arrayOfString, MinecraftServer.N().K()); 
/* 105 */     if (arrayOfString.length > 2 && arrayOfString.length <= 5) {
/* 106 */       return a(arrayOfString, 2, cj1);
/*     */     }
/*     */     
/* 109 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String[] ☃, int j) {
/* 114 */     return (j == 1);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */