/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aef
/*     */   extends aec
/*     */ {
/*     */   private ady b;
/*     */   private float c;
/*     */   
/*     */   public aef(ady ☃, float f) {
/*  14 */     this.b = ☃;
/*  15 */     this.c = f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ady a(cj ☃) {
/*  20 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ady[] a(ady[] ☃, int i, int j, int k, int m) {
/*  31 */     if (☃ == null || ☃.length < k * m) {
/*  32 */       ☃ = new ady[k * m];
/*     */     }
/*     */     
/*  35 */     Arrays.fill((Object[])☃, 0, k * m, this.b);
/*     */     
/*  37 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] a(float[] ☃, int i, int j, int k, int m) {
/*  42 */     if (☃ == null || ☃.length < k * m) {
/*  43 */       ☃ = new float[k * m];
/*     */     }
/*  45 */     Arrays.fill(☃, 0, k * m, this.c);
/*     */     
/*  47 */     return ☃;
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
/*     */   public ady[] b(ady[] ☃, int i, int j, int k, int m) {
/*  61 */     if (☃ == null || ☃.length < k * m) {
/*  62 */       ☃ = new ady[k * m];
/*     */     }
/*     */     
/*  65 */     Arrays.fill((Object[])☃, 0, k * m, this.b);
/*     */     
/*  67 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ady[] a(ady[] ☃, int i, int j, int k, int m, boolean bool) {
/*  72 */     return b(☃, i, j, k, m);
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
/*     */   public cj a(int ☃, int i, int j, List<ady> list, Random random) {
/*  86 */     if (list.contains(this.b)) {
/*  87 */       return new cj(☃ - j + random.nextInt(j * 2 + 1), 0, i - j + random.nextInt(j * 2 + 1));
/*     */     }
/*     */     
/*  90 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j, List<ady> list) {
/* 100 */     return list.contains(this.b);
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */