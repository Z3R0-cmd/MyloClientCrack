/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class auc
/*    */   implements Runnable
/*    */ {
/*  9 */   private static final auc a = new auc();
/*    */   
/* 11 */   private List<aud> b = Collections.synchronizedList(Lists.newArrayList());
/*    */   
/*    */   private volatile long c;
/*    */   private volatile long d;
/*    */   private volatile boolean e;
/*    */   
/*    */   private auc() {
/* 18 */     Thread ☃ = new Thread(this, "File IO Thread");
/* 19 */     ☃.setPriority(1);
/* 20 */     ☃.start();
/*    */   }
/*    */   
/*    */   public static auc a() {
/* 24 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/*    */     while (true) {
/* 30 */       c();
/*    */     }
/*    */   }
/*    */   
/*    */   private void c() {
/* 35 */     for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
/* 36 */       aud aud = this.b.get(☃);
/* 37 */       boolean bool = aud.c();
/* 38 */       if (!bool) {
/* 39 */         this.b.remove(☃--);
/* 40 */         this.d++;
/*    */       } 
/*    */       
/*    */       try {
/* 44 */         Thread.sleep(this.e ? 0L : 10L);
/* 45 */       } catch (InterruptedException interruptedException) {
/* 46 */         interruptedException.printStackTrace();
/*    */       } 
/*    */     } 
/* 49 */     if (this.b.isEmpty()) {
/*    */       try {
/* 51 */         Thread.sleep(25L);
/* 52 */       } catch (InterruptedException interruptedException) {
/* 53 */         interruptedException.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(aud ☃) {
/* 59 */     if (this.b.contains(☃)) {
/*    */       return;
/*    */     }
/* 62 */     this.c++;
/* 63 */     this.b.add(☃);
/*    */   }
/*    */   
/*    */   public void b() throws InterruptedException {
/* 67 */     this.e = true;
/* 68 */     while (this.c != this.d) {
/* 69 */       Thread.sleep(10L);
/*    */     }
/* 71 */     this.e = false;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/auc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */