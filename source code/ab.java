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
/*     */ public class ab
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  22 */     return "enchant";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  27 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  32 */     return "commands.enchant.usage";
/*     */   }
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*     */     int j;
/*  37 */     if (arrayOfString.length < 2) {
/*  38 */       throw new cf("commands.enchant.usage", new Object[0]);
/*     */     }
/*     */     
/*  41 */     wn wn = a(☃, arrayOfString[0]);
/*  42 */     ☃.a(n.a.d, 0);
/*     */ 
/*     */     
/*     */     try {
/*  46 */       j = a(arrayOfString[1], 0);
/*  47 */     } catch (cb cb) {
/*  48 */       aci aci1 = aci.b(arrayOfString[1]);
/*  49 */       if (aci1 == null) {
/*  50 */         throw cb;
/*     */       }
/*  52 */       j = aci1.B;
/*     */     } 
/*  54 */     int k = 1;
/*     */     
/*  56 */     zx zx = wn.bZ();
/*  57 */     if (zx == null) {
/*  58 */       throw new bz("commands.enchant.noItem", new Object[0]);
/*     */     }
/*     */     
/*  61 */     aci aci = aci.c(j);
/*  62 */     if (aci == null) {
/*  63 */       throw new cb("commands.enchant.notFound", new Object[] { Integer.valueOf(j) });
/*     */     }
/*     */     
/*  66 */     if (!aci.a(zx)) {
/*  67 */       throw new bz("commands.enchant.cantEnchant", new Object[0]);
/*     */     }
/*     */     
/*  70 */     if (arrayOfString.length >= 3) {
/*  71 */       k = a(arrayOfString[2], aci.e(), aci.b());
/*     */     }
/*     */     
/*  74 */     if (zx.n()) {
/*  75 */       du du = zx.p();
/*  76 */       if (du != null) {
/*  77 */         for (int n = 0; n < du.c(); n++) {
/*  78 */           int i1 = du.b(n).e("id");
/*     */           
/*  80 */           if (aci.c(i1) != null) {
/*  81 */             aci aci1 = aci.c(i1);
/*  82 */             if (!aci1.a(aci)) {
/*  83 */               throw new bz("commands.enchant.cantCombine", new Object[] { aci.d(k), aci1.d(du.b(n).e("lvl")) });
/*     */             }
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/*  90 */     zx.a(aci, k);
/*  91 */     a(☃, this, "commands.enchant.success", new Object[0]);
/*  92 */     ☃.a(n.a.d, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/*  98 */     if (arrayOfString.length == 1) {
/*  99 */       return a(arrayOfString, d());
/*     */     }
/* 101 */     if (arrayOfString.length == 2) {
/* 102 */       return a(arrayOfString, aci.c());
/*     */     }
/*     */     
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   protected String[] d() {
/* 109 */     return MinecraftServer.N().K();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(String[] ☃, int j) {
/* 114 */     return (j == 0);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */