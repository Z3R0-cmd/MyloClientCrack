/*     */ import com.google.common.collect.Iterables;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.properties.Property;
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
/*     */ public class alo
/*     */   extends akw
/*     */ {
/*     */   private int a;
/*     */   private int f;
/*  26 */   private GameProfile g = null;
/*     */ 
/*     */   
/*     */   public void b(dn ☃) {
/*  30 */     super.b(☃);
/*  31 */     ☃.a("SkullType", (byte)(this.a & 0xFF));
/*  32 */     ☃.a("Rot", (byte)(this.f & 0xFF));
/*     */     
/*  34 */     if (this.g != null) {
/*  35 */       dn dn1 = new dn();
/*  36 */       dy.a(dn1, this.g);
/*  37 */       ☃.a("Owner", dn1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dn ☃) {
/*  43 */     super.a(☃);
/*  44 */     this.a = ☃.d("SkullType");
/*  45 */     this.f = ☃.d("Rot");
/*     */     
/*  47 */     if (this.a == 3) {
/*  48 */       if (☃.b("Owner", 10)) {
/*  49 */         this.g = dy.a(☃.m("Owner"));
/*  50 */       } else if (☃.b("ExtraType", 8)) {
/*  51 */         String str = ☃.j("ExtraType");
/*  52 */         if (!nx.b(str)) {
/*  53 */           this.g = new GameProfile(null, str);
/*  54 */           e();
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public GameProfile b() {
/*  62 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public ff y_() {
/*  67 */     dn ☃ = new dn();
/*  68 */     b(☃);
/*  69 */     return new ft(this.c, 4, ☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  73 */     this.a = ☃;
/*  74 */     this.g = null;
/*     */   }
/*     */   
/*     */   public void a(GameProfile ☃) {
/*  78 */     this.a = 3;
/*  79 */     this.g = ☃;
/*  80 */     e();
/*     */   }
/*     */   
/*     */   private void e() {
/*  84 */     this.g = b(this.g);
/*  85 */     p_();
/*     */   }
/*     */   
/*     */   public static GameProfile b(GameProfile ☃) {
/*  89 */     if (☃ == null || nx.b(☃.getName()))
/*  90 */       return ☃; 
/*  91 */     if (☃.isComplete() && ☃.getProperties().containsKey("textures")) {
/*  92 */       return ☃;
/*     */     }
/*     */     
/*  95 */     if (MinecraftServer.N() == null) {
/*  96 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 100 */     GameProfile gameProfile = MinecraftServer.N().aF().a(☃.getName());
/* 101 */     if (gameProfile == null) {
/* 102 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 106 */     Property property = (Property)Iterables.getFirst(gameProfile.getProperties().get("textures"), null);
/* 107 */     if (property == null) {
/* 108 */       gameProfile = MinecraftServer.N().aD().fillProfileProperties(gameProfile, true);
/*     */     }
/* 110 */     return gameProfile;
/*     */   }
/*     */   
/*     */   public int c() {
/* 114 */     return this.a;
/*     */   }
/*     */   
/*     */   public int d() {
/* 118 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 122 */     this.f = ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/alo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */