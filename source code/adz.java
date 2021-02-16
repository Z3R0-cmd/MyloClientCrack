/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adz
/*    */ {
/*    */   private final aec a;
/*    */   private long b;
/*    */   
/*    */   public class a
/*    */   {
/* 19 */     public float[] a = new float[256];
/* 20 */     public ady[] b = new ady[256];
/*    */     
/*    */     public int c;
/*    */     
/*    */     public a(adz this$0, int ☃, int i) {
/* 25 */       this.c = ☃;
/* 26 */       this.d = i;
/* 27 */       adz.a(this$0).a(this.a, ☃ << 4, i << 4, 16, 16);
/* 28 */       adz.a(this$0).a(this.b, ☃ << 4, i << 4, 16, 16, false);
/*    */     }
/*    */     public int d; public long e;
/*    */     public ady a(int ☃, int i) {
/* 32 */       return this.b[☃ & 0xF | (i & 0xF) << 4];
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 40 */   private nq<a> c = new nq<a>();
/* 41 */   private List<a> d = Lists.newArrayList();
/*    */   
/*    */   public adz(aec ☃) {
/* 44 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public a a(int ☃, int i) {
/* 48 */     ☃ >>= 4;
/* 49 */     i >>= 4;
/* 50 */     long l = ☃ & 0xFFFFFFFFL | (i & 0xFFFFFFFFL) << 32L;
/* 51 */     a a = this.c.a(l);
/* 52 */     if (a == null) {
/* 53 */       a = new a(this, ☃, i);
/* 54 */       this.c.a(l, a);
/* 55 */       this.d.add(a);
/*    */     } 
/* 57 */     a.e = MinecraftServer.az();
/* 58 */     return a;
/*    */   }
/*    */   
/*    */   public ady a(int ☃, int i, ady ady1) {
/* 62 */     ady ady2 = a(☃, i).a(☃, i);
/* 63 */     if (ady2 == null) {
/* 64 */       return ady1;
/*    */     }
/* 66 */     return ady2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 74 */     long ☃ = MinecraftServer.az();
/* 75 */     long l1 = ☃ - this.b;
/* 76 */     if (l1 > 7500L || l1 < 0L) {
/* 77 */       this.b = ☃;
/*    */       
/* 79 */       for (int i = 0; i < this.d.size(); i++) {
/* 80 */         a a = this.d.get(i);
/* 81 */         long l = ☃ - a.e;
/* 82 */         if (l > 30000L || l < 0L) {
/* 83 */           this.d.remove(i--);
/* 84 */           long l2 = a.c & 0xFFFFFFFFL | (a.d & 0xFFFFFFFFL) << 32L;
/* 85 */           this.c.d(l2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public ady[] c(int ☃, int i) {
/* 92 */     return (a(☃, i)).b;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */