/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abo
/*    */ {
/* 13 */   private static final abo a = new abo();
/*    */   
/* 15 */   private Map<zx, zx> b = Maps.newHashMap();
/* 16 */   private Map<zx, Float> c = Maps.newHashMap();
/*    */   
/*    */   public static abo a() {
/* 19 */     return a;
/*    */   }
/*    */   
/*    */   private abo() {
/* 23 */     a(afi.p, new zx(zy.j), 0.7F);
/* 24 */     a(afi.o, new zx(zy.k), 1.0F);
/* 25 */     a(afi.ag, new zx(zy.i), 1.0F);
/* 26 */     a(afi.m, new zx(afi.w), 0.1F);
/*    */ 
/*    */     
/* 29 */     a(zy.al, new zx(zy.am), 0.35F);
/* 30 */     a(zy.bi, new zx(zy.bj), 0.35F);
/* 31 */     a(zy.bk, new zx(zy.bl), 0.35F);
/* 32 */     a(zy.bo, new zx(zy.bp), 0.35F);
/* 33 */     a(zy.bm, new zx(zy.bn), 0.35F);
/* 34 */     a(afi.e, new zx(afi.b), 0.1F);
/* 35 */     a(new zx(afi.bf, 1, ajz.b), new zx(afi.bf, 1, ajz.O), 0.1F);
/* 36 */     a(zy.aI, new zx(zy.aH), 0.3F);
/* 37 */     a(afi.aL, new zx(afi.cz), 0.35F);
/* 38 */     a(afi.aK, new zx(zy.aW, 1, zd.n.b()), 0.2F);
/* 39 */     a(afi.r, new zx(zy.h, 1, 1), 0.15F);
/* 40 */     a(afi.s, new zx(zy.h, 1, 1), 0.15F);
/* 41 */     a(afi.bP, new zx(zy.bO), 1.0F);
/* 42 */     a(zy.bS, new zx(zy.bT), 0.35F);
/* 43 */     a(afi.aV, new zx(zy.cf), 0.1F);
/* 44 */     a(new zx(afi.v, 1, 1), new zx(afi.v, 1, 0), 0.15F); zp.a[] ☃;
/*    */     int i, j;
/* 46 */     for (☃ = zp.a.values(), i = ☃.length, j = 0; j < i; ) { zp.a a = ☃[j];
/* 47 */       if (a.g()) {
/* 48 */         a(new zx(zy.aU, 1, a.a()), new zx(zy.aV, 1, a.a()), 0.35F);
/*    */       }
/*    */       
/*    */       j++; }
/*    */ 
/*    */     
/* 54 */     a(afi.q, new zx(zy.h), 0.1F);
/* 55 */     a(afi.aC, new zx(zy.aC), 0.7F);
/*    */     
/* 57 */     a(afi.x, new zx(zy.aW, 1, zd.l.b()), 0.2F);
/* 58 */     a(afi.co, new zx(zy.cg), 0.2F);
/*    */   }
/*    */   
/*    */   public void a(afh ☃, zx zx1, float f) {
/* 62 */     a(zw.a(☃), zx1, f);
/*    */   }
/*    */   
/*    */   public void a(zw ☃, zx zx1, float f) {
/* 66 */     a(new zx(☃, 1, 32767), zx1, f);
/*    */   }
/*    */   
/*    */   public void a(zx ☃, zx zx1, float f) {
/* 70 */     this.b.put(☃, zx1);
/* 71 */     this.c.put(zx1, Float.valueOf(f));
/*    */   }
/*    */   
/*    */   public zx a(zx ☃) {
/* 75 */     for (Iterator<Map.Entry<zx, zx>> iterator = this.b.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<zx, zx> entry = iterator.next();
/* 76 */       if (a(☃, entry.getKey())) {
/* 77 */         return entry.getValue();
/*    */       } }
/*    */ 
/*    */     
/* 81 */     return null;
/*    */   }
/*    */   
/*    */   private boolean a(zx ☃, zx zx1) {
/* 85 */     return (zx1.b() == ☃.b() && (zx1.i() == 32767 || zx1.i() == ☃.i()));
/*    */   }
/*    */   
/*    */   public Map<zx, zx> b() {
/* 89 */     return this.b;
/*    */   }
/*    */   
/*    */   public float b(zx ☃) {
/* 93 */     for (Iterator<Map.Entry<zx, Float>> iterator = this.c.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<zx, Float> entry = iterator.next();
/* 94 */       if (a(☃, entry.getKey())) {
/* 95 */         return ((Float)entry.getValue()).floatValue();
/*    */       } }
/*    */     
/* 98 */     return 0.0F;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/abo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */