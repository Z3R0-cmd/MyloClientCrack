/*     */ import com.google.common.collect.HashBasedTable;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableTable;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Table;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */   extends aly
/*     */ {
/*     */   private final afh a;
/*     */   private final ImmutableMap<amo, Comparable> b;
/*     */   private ImmutableTable<amo, Comparable, alz> c;
/*     */   
/*     */   private a(afh ☃, ImmutableMap<amo, Comparable> immutableMap) {
/* 100 */     this.a = ☃;
/* 101 */     this.b = immutableMap;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<amo> a() {
/* 106 */     return Collections.unmodifiableCollection((Collection<? extends amo>)this.b.keySet());
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>> T b(amo<T> ☃) {
/* 111 */     if (!this.b.containsKey(☃)) {
/* 112 */       throw new IllegalArgumentException("Cannot get property " + ☃ + " as it does not exist in " + this.a.P());
/*     */     }
/*     */     
/* 115 */     return (T)☃.b().cast(this.b.get(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>, V extends T> alz a(amo<T> ☃, V v) {
/* 120 */     if (!this.b.containsKey(☃)) {
/* 121 */       throw new IllegalArgumentException("Cannot set property " + ☃ + " as it does not exist in " + this.a.P());
/*     */     }
/* 123 */     if (!☃.c().contains(v)) {
/* 124 */       throw new IllegalArgumentException("Cannot set property " + ☃ + " to " + v + " on block " + afh.c.c(this.a) + ", it is not an allowed value");
/*     */     }
/* 126 */     if (this.b.get(☃) == v) {
/* 127 */       return this;
/*     */     }
/*     */     
/* 130 */     return (alz)this.c.get(☃, v);
/*     */   }
/*     */ 
/*     */   
/*     */   public ImmutableMap<amo, Comparable> b() {
/* 135 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public afh c() {
/* 140 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 146 */     return (this == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 151 */     return this.b.hashCode();
/*     */   }
/*     */   
/*     */   public void a(Map<Map<amo, Comparable>, a> ☃) {
/* 155 */     if (this.c != null) {
/* 156 */       throw new IllegalStateException();
/*     */     }
/*     */     
/* 159 */     HashBasedTable hashBasedTable = HashBasedTable.create();
/* 160 */     for (Iterator<amo<? extends Comparable>> iterator = this.b.keySet().iterator(); iterator.hasNext(); ) { amo<? extends Comparable> amo = iterator.next();
/* 161 */       for (Iterator<Comparable> iterator1 = amo.c().iterator(); iterator1.hasNext(); ) { Comparable comparable = iterator1.next();
/* 162 */         if (comparable != this.b.get(amo)) {
/* 163 */           hashBasedTable.put(amo, comparable, ☃.get(b(amo, comparable)));
/*     */         } }
/*     */        }
/*     */ 
/*     */     
/* 168 */     this.c = ImmutableTable.copyOf((Table)hashBasedTable);
/*     */   }
/*     */   
/*     */   private Map<amo, Comparable> b(amo ☃, Comparable comparable) {
/* 172 */     Map<amo, Comparable> map = Maps.newHashMap((Map)this.b);
/* 173 */     map.put(☃, comparable);
/* 174 */     return map;
/*     */   }
/*     */ }


/* Location:              /Users/michaelmc/Downloads/MyloClientCrack-main/MyloClient/MyloClient.jar!/ama$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */