/*     */ import java.util.List;
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
/*     */ public class au
/*     */   extends i
/*     */ {
/*     */   public String c() {
/*  19 */     return "particle";
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  24 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c(m ☃) {
/*  29 */     return "commands.particle.usage";
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃, String[] arrayOfString) throws bz {
/*  34 */     if (arrayOfString.length < 8) {
/*  35 */       throw new cf("commands.particle.usage", new Object[0]);
/*     */     }
/*     */     
/*  38 */     boolean bool1 = false;
/*  39 */     cy cy = null; cy[] arrayOfCy; int j, k;
/*  40 */     for (arrayOfCy = cy.values(), j = arrayOfCy.length, k = 0; k < j; ) { cy cy1 = arrayOfCy[k];
/*  41 */       if (cy1.f()) {
/*  42 */         if (arrayOfString[0].startsWith(cy1.b())) {
/*  43 */           bool1 = true;
/*  44 */           cy = cy1;
/*     */           break;
/*     */         } 
/*  47 */       } else if (arrayOfString[0].equals(cy1.b())) {
/*  48 */         bool1 = true;
/*  49 */         cy = cy1;
/*     */         break;
/*     */       } 
/*     */       k++; }
/*     */     
/*  54 */     if (!bool1) {
/*  55 */       throw new bz("commands.particle.notFound", new Object[] { arrayOfString[0] });
/*     */     }
/*     */     
/*  58 */     String str = arrayOfString[0];
/*  59 */     aui aui = ☃.d();
/*  60 */     double d1 = (float)b(aui.a, arrayOfString[1], true);
/*  61 */     double d2 = (float)b(aui.b, arrayOfString[2], true);
/*  62 */     double d3 = (float)b(aui.c, arrayOfString[3], true);
/*  63 */     double d4 = (float)c(arrayOfString[4]);
/*  64 */     double d5 = (float)c(arrayOfString[5]);
/*  65 */     double d6 = (float)c(arrayOfString[6]);
/*  66 */     double d7 = (float)c(arrayOfString[7]);
/*     */     
/*  68 */     int n = 0;
/*  69 */     if (arrayOfString.length > 8) {
/*  70 */       n = a(arrayOfString[8], 0);
/*     */     }
/*     */     
/*  73 */     boolean bool2 = false;
/*  74 */     if (arrayOfString.length > 9 && "force".equals(arrayOfString[9])) {
/*  75 */       bool2 = true;
/*     */     }
/*     */     
/*  78 */     adm adm = ☃.e();
/*  79 */     if (adm instanceof le) {
/*  80 */       le le = (le)adm;
/*  81 */       int[] arrayOfInt = new int[cy.d()];
/*  82 */       if (cy.f()) {
/*  83 */         String[] arrayOfString1 = arrayOfString[0].split("_", 3);
/*  84 */         for (int i1 = 1; i1 < arrayOfString1.length; i1++) {
/*     */           try {
/*  86 */             arrayOfInt[i1 - 1] = Integer.parseInt(arrayOfString1[i1]);
/*  87 */           } catch (NumberFormatException numberFormatException) {
/*  88 */             throw new bz("commands.particle.notFound", new Object[] { arrayOfString[0] });
/*     */           } 
/*     */         } 
/*     */       } 
/*  92 */       le.a(cy, bool2, d1, d2, d3, n, d4, d5, d6, d7, arrayOfInt);
/*  93 */       a(☃, this, "commands.particle.success", new Object[] { str, Integer.valueOf(Math.max(n, 1)) });
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> a(m ☃, String[] arrayOfString, cj cj1) {
/* 100 */     if (arrayOfString.length == 1)
/* 101 */       return a(arrayOfString, cy.a()); 
/* 102 */     if (arrayOfString.length > 1 && arrayOfString.length <= 4)
/* 103 */       return a(arrayOfString, 1, cj1); 
/* 104 */     if (arrayOfString.length == 10) {
/* 105 */       return a(arrayOfString, new String[] { "normal", "force" });
/*     */     }
/* 107 */     return null;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */