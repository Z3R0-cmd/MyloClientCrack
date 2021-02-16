/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class ak
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  24 */     return "help";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  29 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  34 */     return "commands.help.usage";
/*     */   }
/*     */ 
/*     */   
/*     */   public List<String> b() {
/*  39 */     return Arrays.asList(new String[] { "?" });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*  44 */     List<k> list = d(☃);
/*  45 */     int j = 7;
/*  46 */     int k = (list.size() - 1) / 7;
/*  47 */     int n = 0;
/*     */     
/*     */     try {
/*  50 */       n = (arrayOfString.length == 0) ? 0 : (a(arrayOfString[0], 1, k + 1) - 1);
/*  51 */     } catch (cb cb) {
/*     */       
/*  53 */       Map<String, k> map = d();
/*  54 */       k k1 = map.get(arrayOfString[0]);
/*     */       
/*  56 */       if (k1 != null)
/*     */       {
/*  58 */         throw new cf(k1.c(☃), new Object[0]); } 
/*  59 */       if (ns.a(arrayOfString[0], -1) != -1) {
/*  60 */         throw cb;
/*     */       }
/*  62 */       throw new ce();
/*     */     } 
/*     */ 
/*     */     
/*  66 */     int i1 = Math.min((n + 1) * 7, list.size());
/*     */     
/*  68 */     fb fb = new fb("commands.help.header", new Object[] { Integer.valueOf(n + 1), Integer.valueOf(k + 1) });
/*  69 */     fb.b().a(a.c);
/*  70 */     ☃.a(fb);
/*     */     
/*  72 */     for (int i2 = n * 7; i2 < i1; i2++) {
/*  73 */       k k1 = list.get(i2);
/*     */       
/*  75 */       fb fb1 = new fb(k1.c(☃), new Object[0]);
/*  76 */       fb1.b().a(new et(et.a.e, "/" + k1.c() + " "));
/*  77 */       ☃.a(fb1);
/*     */     } 
/*     */     
/*  80 */     if (n == 0 && ☃ instanceof wn) {
/*  81 */       fb fb1 = new fb("commands.help.footer", new Object[0]);
/*  82 */       fb1.b().a(a.k);
/*  83 */       ☃.a(fb1);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected List<k> d(m ☃) {
/*  88 */     List<k> list = MinecraftServer.N().P().a(☃);
/*  89 */     Collections.sort(list);
/*  90 */     return list;
/*     */   }
/*     */   
/*     */   protected Map<String, k> d() {
/*  94 */     return MinecraftServer.N().P().a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 100 */     if (arrayOfString.length == 1) {
/* 101 */       Set<String> set = d().keySet();
/* 102 */       return a(arrayOfString, set.<String>toArray(new String[set.size()]));
/*     */     } 
/*     */     
/* 105 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */