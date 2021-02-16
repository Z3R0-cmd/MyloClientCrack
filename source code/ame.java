/*    */ import com.google.common.base.Joiner;
/*    */ import com.google.common.base.Predicate;
/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.lang.reflect.Array;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ public class ame
/*    */ {
/* 16 */   private static final Joiner a = Joiner.on(",");
/*    */   
/* 18 */   private final List<String[]> b = Lists.newArrayList();
/* 19 */   private final Map<Character, Predicate<amc>> c = Maps.newHashMap();
/*    */   private int d;
/*    */   private int e;
/*    */   
/*    */   private ame() {
/* 24 */     this.c.put(Character.valueOf(' '), Predicates.alwaysTrue());
/*    */   }
/*    */   
/*    */   public ame a(String... ☃) {
/* 28 */     if (ArrayUtils.isEmpty((Object[])☃) || StringUtils.isEmpty(☃[0])) {
/* 29 */       throw new IllegalArgumentException("Empty pattern for aisle");
/*    */     }
/*    */     
/* 32 */     if (this.b.isEmpty()) {
/* 33 */       this.d = ☃.length;
/* 34 */       this.e = ☃[0].length();
/*    */     } 
/*    */     
/* 37 */     if (☃.length != this.d)
/* 38 */       throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + ☃.length + ")");  String[] arrayOfString;
/*    */     int i;
/*    */     int j;
/* 41 */     for (arrayOfString = ☃, i = arrayOfString.length, j = 0; j < i; ) { String str = arrayOfString[j];
/* 42 */       if (str.length() != this.e)
/* 43 */         throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + str.length() + ")");  char[] arrayOfChar;
/*    */       int k, m;
/* 45 */       for (arrayOfChar = str.toCharArray(), k = arrayOfChar.length, m = 0; m < k; ) { char c = arrayOfChar[m];
/* 46 */         if (!this.c.containsKey(Character.valueOf(c)))
/* 47 */           this.c.put(Character.valueOf(c), null); 
/*    */         m++; }
/*    */       
/*    */       j++; }
/*    */     
/* 52 */     this.b.add(☃);
/*    */     
/* 54 */     return this;
/*    */   }
/*    */   
/*    */   public static ame a() {
/* 58 */     return new ame();
/*    */   }
/*    */   
/*    */   public ame a(char ☃, Predicate<amc> predicate) {
/* 62 */     this.c.put(Character.valueOf(☃), predicate);
/*    */     
/* 64 */     return this;
/*    */   }
/*    */   
/*    */   public amd b() {
/* 68 */     return new amd(c());
/*    */   }
/*    */ 
/*    */   
/*    */   private Predicate<amc>[][][] c() {
/* 73 */     d();
/*    */     
/* 75 */     Predicate[][][] arrayOfPredicate = (Predicate[][][])Array.newInstance(Predicate.class, new int[] { this.b.size(), this.d, this.e });
/*    */     
/* 77 */     for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
/* 78 */       for (int i = 0; i < this.d; i++) {
/* 79 */         for (int j = 0; j < this.e; j++) {
/* 80 */           arrayOfPredicate[☃][i][j] = this.c.get(Character.valueOf(((String[])this.b.get(☃))[i].charAt(j)));
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 85 */     return (Predicate<amc>[][][])arrayOfPredicate;
/*    */   }
/*    */   
/*    */   private void d() {
/* 89 */     List<Character> ☃ = Lists.newArrayList();
/*    */     
/* 91 */     for (Iterator<Map.Entry<Character, Predicate<amc>>> iterator = this.c.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<Character, Predicate<amc>> entry = iterator.next();
/* 92 */       if (entry.getValue() == null) {
/* 93 */         ☃.add(entry.getKey());
/*    */       } }
/*    */ 
/*    */     
/* 97 */     if (!☃.isEmpty())
/* 98 */       throw new IllegalStateException("Predicates for character(s) " + a.join(☃) + " are missing"); 
/*    */   }
/*    */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */