/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
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
/*     */ public class ada
/*     */   extends ArrayList<acz>
/*     */ {
/*     */   public ada() {}
/*     */   
/*     */   public ada(dn ☃) {
/*  23 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public acz a(zx ☃, zx zx1, int i) {
/*  28 */     if (i > 0 && i < size()) {
/*     */       
/*  30 */       acz acz = get(i);
/*  31 */       if (a(☃, acz.a()) && ((zx1 == null && !acz.c()) || (acz.c() && a(zx1, acz.b()))) && 
/*  32 */         ☃.b >= (acz.a()).b && (!acz.c() || zx1.b >= (acz.b()).b)) {
/*  33 */         return acz;
/*     */       }
/*     */       
/*  36 */       return null;
/*     */     } 
/*  38 */     for (int j = 0; j < size(); j++) {
/*  39 */       acz acz = get(j);
/*  40 */       if (a(☃, acz.a()) && ☃.b >= (acz.a()).b && ((!acz.c() && zx1 == null) || (acz.c() && a(zx1, acz.b()) && zx1.b >= (acz.b()).b))) {
/*  41 */         return acz;
/*     */       }
/*     */     } 
/*  44 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(zx ☃, zx zx1) {
/*  48 */     return (zx.c(☃, zx1) && (!zx1.n() || (☃.n() && dy.a(zx1.o(), ☃.o(), false))));
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(em ☃) {
/*  77 */     ☃.writeByte((byte)(size() & 0xFF));
/*  78 */     for (int i = 0; i < size(); i++) {
/*  79 */       acz acz = get(i);
/*  80 */       ☃.a(acz.a());
/*  81 */       ☃.a(acz.d());
/*     */       
/*  83 */       zx zx = acz.b();
/*  84 */       ☃.writeBoolean((zx != null));
/*  85 */       if (zx != null) {
/*  86 */         ☃.a(zx);
/*     */       }
/*  88 */       ☃.writeBoolean(acz.h());
/*  89 */       ☃.writeInt(acz.e());
/*  90 */       ☃.writeInt(acz.f());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static ada b(em ☃) throws IOException {
/*  95 */     ada ada1 = new ada();
/*     */     
/*  97 */     int i = ☃.readByte() & 0xFF;
/*  98 */     for (int j = 0; j < i; j++) {
/*  99 */       zx zx1 = ☃.i();
/* 100 */       zx zx2 = ☃.i();
/*     */       
/* 102 */       zx zx3 = null;
/* 103 */       if (☃.readBoolean()) {
/* 104 */         zx3 = ☃.i();
/*     */       }
/* 106 */       boolean bool = ☃.readBoolean();
/* 107 */       int k = ☃.readInt();
/* 108 */       int m = ☃.readInt();
/*     */       
/* 110 */       acz acz = new acz(zx1, zx3, zx2, k, m);
/* 111 */       if (bool) {
/* 112 */         acz.i();
/*     */       }
/* 114 */       ada1.add(acz);
/*     */     } 
/* 116 */     return ada1;
/*     */   }
/*     */   
/*     */   public void a(dn ☃) {
/* 120 */     du du = ☃.c("Recipes", 10);
/*     */     
/* 122 */     for (int i = 0; i < du.c(); i++) {
/* 123 */       dn dn1 = du.b(i);
/* 124 */       add(new acz(dn1));
/*     */     } 
/*     */   }
/*     */   
/*     */   public dn a() {
/* 129 */     dn ☃ = new dn();
/*     */     
/* 131 */     du du = new du();
/* 132 */     for (int i = 0; i < size(); i++) {
/* 133 */       acz acz = get(i);
/* 134 */       du.a(acz.k());
/*     */     } 
/* 136 */     ☃.a("Recipes", du);
/* 137 */     return ☃;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */