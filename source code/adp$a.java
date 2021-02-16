/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/*  8 */   a(-1, ""),
/*  9 */   b(0, "survival"),
/* 10 */   c(1, "creative"),
/* 11 */   d(2, "adventure"),
/* 12 */   e(3, "spectator");
/*    */   
/*    */   int f;
/*    */   
/*    */   String g;
/*    */   
/*    */   a(int ☃, String str1) {
/* 19 */     this.f = ☃;
/* 20 */     this.g = str1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 24 */     return this.f;
/*    */   }
/*    */   
/*    */   public String b() {
/* 28 */     return this.g;
/*    */   }
/*    */   
/*    */   public void a(wl ☃) {
/* 32 */     if (this == c) {
/* 33 */       ☃.c = true;
/* 34 */       ☃.d = true;
/* 35 */       ☃.a = true;
/* 36 */     } else if (this == e) {
/* 37 */       ☃.c = true;
/* 38 */       ☃.d = false;
/* 39 */       ☃.a = true;
/* 40 */       ☃.b = true;
/*    */     } else {
/* 42 */       ☃.c = false;
/* 43 */       ☃.d = false;
/* 44 */       ☃.a = false;
/* 45 */       ☃.b = false;
/*    */     } 
/* 47 */     ☃.e = !c();
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 51 */     return (this == d || this == e);
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 55 */     return (this == c);
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 59 */     return (this == b || this == d);
/*    */   } public static a a(int ☃) { a[] arrayOfA;
/*    */     int i;
/*    */     int j;
/* 63 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 64 */       if (a1.f == ☃)
/* 65 */         return a1; 
/*    */       j++; }
/*    */     
/* 68 */     return b; } public static a a(String ☃) {
/*    */     a[] arrayOfA;
/*    */     int i;
/*    */     int j;
/* 72 */     for (arrayOfA = values(), i = arrayOfA.length, j = 0; j < i; ) { a a1 = arrayOfA[j];
/* 73 */       if (a1.g.equals(☃))
/* 74 */         return a1; 
/*    */       j++; }
/*    */     
/* 77 */     return b;
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/adp$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */