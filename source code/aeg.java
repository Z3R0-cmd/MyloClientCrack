/*     */ import java.util.Random;
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
/*     */ public class aeg
/*     */   extends ady
/*     */ {
/*     */   private int aG;
/*  24 */   protected static final aoj aD = new aoj(false, true);
/*  25 */   protected static final aoj aE = new aoj(false, false);
/*  26 */   protected static final apn aF = new apn(false);
/*     */   
/*     */   public aeg(int ☃, int i) {
/*  29 */     super(☃);
/*  30 */     this.aG = i;
/*  31 */     this.as.A = 10;
/*  32 */     this.as.C = 2;
/*     */     
/*  34 */     if (this.aG == 1) {
/*  35 */       this.as.A = 6;
/*  36 */       this.as.B = 100;
/*  37 */       this.as.C = 1;
/*     */     } 
/*  39 */     a(5159473);
/*  40 */     a(0.7F, 0.8F);
/*     */     
/*  42 */     if (this.aG == 2) {
/*  43 */       this.aj = 353825;
/*  44 */       this.ai = 3175492;
/*  45 */       a(0.6F, 0.6F);
/*     */     } 
/*     */     
/*  48 */     if (this.aG == 0) {
/*  49 */       this.au.add(new ady.c((Class)ua.class, 5, 4, 4));
/*     */     }
/*     */     
/*  52 */     if (this.aG == 3) {
/*  53 */       this.as.A = -999;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected ady a(int ☃, boolean bool) {
/*  59 */     if (this.aG == 2) {
/*  60 */       this.aj = 353825;
/*  61 */       this.ai = ☃;
/*     */       
/*  63 */       if (bool) {
/*  64 */         this.aj = (this.aj & 0xFEFEFE) >> 1;
/*     */       }
/*  66 */       return this;
/*     */     } 
/*  68 */     return super.a(☃, bool);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aoh a(Random ☃) {
/*  74 */     if (this.aG == 3 && ☃.nextInt(3) > 0) {
/*  75 */       return aF;
/*     */     }
/*  77 */     if (this.aG == 2 || ☃.nextInt(5) == 0) {
/*  78 */       return aE;
/*     */     }
/*  80 */     return this.aA;
/*     */   }
/*     */ 
/*     */   
/*     */   public agw.a a(Random ☃, cj cj1) {
/*  85 */     if (this.aG == 1) {
/*  86 */       double d = ns.a((1.0D + af.a(cj1.n() / 48.0D, cj1.p() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
/*  87 */       agw.a a = agw.a.values()[(int)(d * (agw.a.values()).length)];
/*  88 */       if (a == agw.a.c) {
/*  89 */         return agw.a.b;
/*     */       }
/*  91 */       return a;
/*     */     } 
/*     */     
/*  94 */     return super.a(☃, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adm ☃, Random random, cj cj1) {
/*  99 */     if (this.aG == 3) {
/* 100 */       for (int k = 0; k < 4; k++) {
/* 101 */         for (int m = 0; m < 4; m++) {
/* 102 */           int n = k * 4 + 1 + 8 + random.nextInt(3);
/* 103 */           int i1 = m * 4 + 1 + 8 + random.nextInt(3);
/*     */           
/* 105 */           cj cj2 = ☃.m(cj1.a(n, 0, i1));
/* 106 */           if (random.nextInt(20) == 0) {
/* 107 */             aoz aoz = new aoz();
/* 108 */             aoz.b(☃, random, cj2);
/*     */           } else {
/* 110 */             aoh aoh = a(random);
/* 111 */             aoh.e();
/* 112 */             if (aoh.b(☃, random, cj2)) {
/* 113 */               aoh.a(☃, random, cj2);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/* 119 */     int i = random.nextInt(5) - 3;
/* 120 */     if (this.aG == 1) {
/* 121 */       i += 2;
/*     */     }
/* 123 */     for (int j = 0; j < i; j++) {
/* 124 */       int k = random.nextInt(3);
/* 125 */       if (k == 0) {
/* 126 */         ag.a(agi.b.b);
/* 127 */       } else if (k == 1) {
/* 128 */         ag.a(agi.b.e);
/* 129 */       } else if (k == 2) {
/* 130 */         ag.a(agi.b.f);
/*     */       } 
/*     */       
/* 133 */       int m = 0;
/* 134 */       int n = random.nextInt(16) + 8;
/* 135 */       int i1 = random.nextInt(16) + 8;
/* 136 */       int i2 = random.nextInt(☃.m(cj1.a(n, 0, i1)).o() + 32);
/*     */       
/* 138 */       for (; m < 5 && !ag.b(☃, random, new cj(cj1.n() + n, i2, cj1.p() + i1)); m++);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 143 */     super.a(☃, random, cj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(cj ☃) {
/* 148 */     int i = super.b(☃);
/*     */     
/* 150 */     if (this.aG == 3) {
/* 151 */       return (i & 0xFEFEFE) + 2634762 >> 1;
/*     */     }
/*     */     
/* 154 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ady d(int ☃) {
/* 159 */     if (this.az == ady.t.az) {
/* 160 */       aeg aeg1 = new aeg(☃, 1);
/* 161 */       aeg1.a(new ady.a(this.an, this.ao + 0.2F));
/* 162 */       aeg1.a("Flower Forest");
/* 163 */       aeg1.a(6976549, true);
/* 164 */       aeg1.a(8233509);
/* 165 */       return aeg1;
/*     */     } 
/* 167 */     if (this.az == ady.Q.az || this.az == ady.R.az) {
/* 168 */       return new aem(this, ☃, this)
/*     */         {
/*     */           public aoh a(Random ☃) {
/* 171 */             if (☃.nextBoolean()) {
/* 172 */               return aeg.aD;
/*     */             }
/* 174 */             return aeg.aE;
/*     */           }
/*     */         };
/*     */     }
/* 178 */     return new aem(this, ☃, this)
/*     */       {
/*     */         public void a(adm ☃, Random random, cj cj1) {
/* 181 */           this.aE.a(☃, random, cj1);
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/aeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */